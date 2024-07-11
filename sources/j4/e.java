package j4;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.fragment.app.z;
import com.karumi.dexter.R;
import n4.m;
import n4.q;
import n4.r;
import x.g;
import x.i;
import x.j;
import z4.c;

public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f6543c = new Object();
    public static final e d = new e();

    @SuppressLint({"HandlerLeak"})
    public class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Context f6544a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f6544a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            PendingIntent pendingIntent;
            int i10 = message.what;
            boolean z = true;
            if (i10 != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i10);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            e eVar = e.this;
            Context context = this.f6544a;
            int c10 = eVar.c(context);
            boolean z10 = h.f6549a;
            if (!(c10 == 1 || c10 == 2 || c10 == 3 || c10 == 9)) {
                z = false;
            }
            if (z) {
                Intent a10 = eVar.a(c10, context, "n");
                if (a10 == null) {
                    pendingIntent = null;
                } else {
                    pendingIntent = PendingIntent.getActivity(context, 0, a10, 134217728);
                }
                eVar.e(context, c10, pendingIntent);
            }
        }
    }

    @RecentlyNullable
    public final Intent a(@RecentlyNonNull int i10, Context context, String str) {
        return super.a(i10, context, str);
    }

    @RecentlyNonNull
    public final int b(@RecentlyNonNull Context context, @RecentlyNonNull int i10) {
        return super.b(context, i10);
    }

    @RecentlyNonNull
    public final int c(@RecentlyNonNull Context context) {
        return super.b(context, f.f6546a);
    }

    @RecentlyNonNull
    public final void d(@RecentlyNonNull Activity activity, @RecentlyNonNull int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialog;
        AlertDialog.Builder builder;
        int i11;
        r rVar = new r(activity, super.a(i10, activity, "d"));
        if (i10 == 0) {
            alertDialog = null;
        } else {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(16843529, typedValue, true);
            if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
                builder = new AlertDialog.Builder(activity, 5);
            } else {
                builder = null;
            }
            if (builder == null) {
                builder = new AlertDialog.Builder(activity);
            }
            builder.setMessage(q.e(activity, i10));
            if (onCancelListener != null) {
                builder.setOnCancelListener(onCancelListener);
            }
            Resources resources = activity.getResources();
            if (i10 == 1) {
                i11 = R.string.common_google_play_services_install_button;
            } else if (i10 == 2) {
                i11 = R.string.common_google_play_services_update_button;
            } else if (i10 != 3) {
                i11 = 17039370;
            } else {
                i11 = R.string.common_google_play_services_enable_button;
            }
            String string = resources.getString(i11);
            if (string != null) {
                builder.setPositiveButton(string, rVar);
            }
            String a10 = q.a(activity, i10);
            if (a10 != null) {
                builder.setTitle(a10);
            }
            Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i10)}), new IllegalArgumentException());
            alertDialog = builder.create();
        }
        if (alertDialog != null) {
            if (activity instanceof androidx.fragment.app.q) {
                z w = ((androidx.fragment.app.q) activity).w();
                j jVar = new j();
                alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                jVar.x0 = alertDialog;
                if (onCancelListener != null) {
                    jVar.y0 = onCancelListener;
                }
                jVar.a0(w, "GooglePlayServicesErrorDialog");
                return;
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            c cVar = new c();
            alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
            alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            cVar.f6538o = alertDialog;
            if (onCancelListener != null) {
                cVar.f6539p = onCancelListener;
            }
            cVar.show(fragmentManager, "GooglePlayServicesErrorDialog");
        }
    }

    @TargetApi(20)
    public final void e(Context context, int i10, PendingIntent pendingIntent) {
        String str;
        String str2;
        int i11;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i10), null}), new IllegalArgumentException());
        if (i10 == 18) {
            new a(context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            if (i10 == 6) {
                str = q.b(context, "common_google_play_services_resolution_required_title");
            } else {
                str = q.a(context, i10);
            }
            if (str == null) {
                str = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            if (i10 == 6 || i10 == 19) {
                str2 = q.c(context, "common_google_play_services_resolution_required_text", q.d(context));
            } else {
                str2 = q.e(context, i10);
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            m.h(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            j jVar = new j(context, (String) null);
            jVar.f9418m = true;
            jVar.f9424s.flags |= 16;
            jVar.f9411e = j.b(str);
            i iVar = new i();
            iVar.f9407b = j.b(str2);
            jVar.d(iVar);
            PackageManager packageManager = context.getPackageManager();
            if (r4.e.f8429a == null) {
                r4.e.f8429a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (r4.e.f8429a.booleanValue()) {
                jVar.f9424s.icon = context.getApplicationInfo().icon;
                jVar.f9416j = 2;
                if (r4.e.a(context)) {
                    jVar.f9409b.add(new g(resources.getString(R.string.common_open_on_phone), pendingIntent));
                } else {
                    jVar.f9413g = pendingIntent;
                }
            } else {
                jVar.f9424s.icon = 17301642;
                jVar.f9424s.tickerText = j.b(resources.getString(R.string.common_google_play_services_notification_ticker));
                jVar.f9424s.when = System.currentTimeMillis();
                jVar.f9413g = pendingIntent;
                jVar.f9412f = j.b(str2);
            }
            if (r4.g.a()) {
                if (r4.g.a()) {
                    synchronized (f6543c) {
                    }
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
                    } else {
                        if (!string.contentEquals(notificationChannel.getName())) {
                            notificationChannel.setName(string);
                        }
                        jVar.f9422q = "com.google.android.gms.availability";
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                    jVar.f9422q = "com.google.android.gms.availability";
                } else {
                    throw new IllegalStateException();
                }
            }
            Notification a10 = jVar.a();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                h.f6551c.set(false);
                i11 = 10436;
            } else {
                i11 = 39789;
            }
            notificationManager.notify(i11, a10);
        } else if (i10 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }
}
