package b8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import r4.g;
import s6.c;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2037a;

    /* renamed from: b  reason: collision with root package name */
    public String f2038b;

    /* renamed from: c  reason: collision with root package name */
    public String f2039c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f2040e = 0;

    public p(Context context) {
        this.f2037a = context;
    }

    public static String a(c cVar) {
        cVar.a();
        String str = cVar.f8817c.f8829e;
        if (str != null) {
            return str;
        }
        cVar.a();
        String str2 = cVar.f8817c.f8827b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final PackageInfo b(String str) {
        try {
            return this.f2037a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package ".concat(e10.toString()));
            return null;
        }
    }

    public final boolean c() {
        int i10;
        synchronized (this) {
            int i11 = this.f2040e;
            if (i11 == 0) {
                PackageManager packageManager = this.f2037a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    if (!g.a()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null) {
                            if (queryIntentServices.size() > 0) {
                                this.f2040e = 1;
                                i10 = 1;
                            }
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    i10 = 2;
                    if (queryBroadcastReceivers != null) {
                        if (queryBroadcastReceivers.size() > 0) {
                            this.f2040e = 2;
                        }
                    }
                    Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                    if (g.a()) {
                        this.f2040e = 2;
                        i11 = 2;
                    } else {
                        this.f2040e = 1;
                        i11 = 1;
                    }
                }
            }
            i10 = i11;
        }
        return i10 != 0;
    }

    public final synchronized void d() {
        PackageInfo b10 = b(this.f2037a.getPackageName());
        if (b10 != null) {
            this.f2038b = Integer.toString(b10.versionCode);
            this.f2039c = b10.versionName;
        }
    }
}
