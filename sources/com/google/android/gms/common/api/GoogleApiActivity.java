package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import j4.b;
import j4.e;
import l4.d;
import n4.m;
import z4.c;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f2316p = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f2317o = 0;

    public final void onActivityResult(@RecentlyNonNull int i10, @RecentlyNonNull int i11, @RecentlyNonNull Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2317o = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                d a10 = d.a(this);
                if (i11 == -1) {
                    c cVar = a10.f6891i;
                    cVar.sendMessage(cVar.obtainMessage(3));
                } else if (i11 == 0) {
                    b bVar = new b(13, (PendingIntent) null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!a10.b(bVar, intExtra)) {
                        c cVar2 = a10.f6891i;
                        cVar2.sendMessage(cVar2.obtainMessage(5, intExtra, 0, bVar));
                    }
                }
            }
        } else if (i10 == 2) {
            this.f2317o = 0;
            setResult(i11, intent);
        }
        finish();
    }

    public final void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        this.f2317o = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2317o = bundle.getInt("resolution");
        }
        if (this.f2317o != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                        this.f2317o = 1;
                        return;
                    } catch (ActivityNotFoundException e10) {
                        if (extras.getBoolean("notify_manager", true)) {
                            d a10 = d.a(this);
                            b bVar = new b(22, (PendingIntent) null);
                            int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                            if (!a10.b(bVar, intExtra)) {
                                c cVar = a10.f6891i;
                                cVar.sendMessage(cVar.obtainMessage(5, intExtra, 0, bVar));
                            }
                        } else {
                            String valueOf = String.valueOf(pendingIntent);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 36);
                            sb.append("Activity not found while launching ");
                            sb.append(valueOf);
                            sb.append(".");
                            String sb2 = sb.toString();
                            if (Build.FINGERPRINT.contains("generic")) {
                                sb2 = String.valueOf(sb2).concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", sb2, e10);
                        }
                        this.f2317o = 1;
                    } catch (IntentSender.SendIntentException e11) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e11);
                    }
                } else {
                    m.h(num);
                    e.d.d(this, num.intValue(), this);
                    this.f2317o = 1;
                    return;
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        bundle.putInt("resolution", this.f2317o);
        super.onSaveInstanceState(bundle);
    }
}
