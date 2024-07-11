package r4;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import j4.h;
import j4.i;
import t4.b;
import t4.c;

public final class j {
    @RecentlyNonNull
    public static boolean a(@RecentlyNonNull Context context, @RecentlyNonNull int i10) {
        if (!b(i10, context, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            i a10 = i.a(context);
            a10.getClass();
            if (packageInfo == null) {
                return false;
            }
            if (!i.d(packageInfo, false)) {
                if (!i.d(packageInfo, true)) {
                    return false;
                }
                if (!h.a(a10.f6553a)) {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @RecentlyNonNull
    @TargetApi(19)
    public static boolean b(@RecentlyNonNull int i10, @RecentlyNonNull Context context, @RecentlyNonNull String str) {
        b a10 = c.a(context);
        a10.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a10.f8994a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i10, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
