package r4;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.RecentlyNonNull;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f8429a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f8430b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f8431c;
    public static Boolean d;

    @RecentlyNonNull
    @TargetApi(26)
    public static boolean a(@RecentlyNonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f8429a == null) {
            f8429a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (!f8429a.booleanValue()) {
            return false;
        }
        if (f8430b == null) {
            f8430b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (!f8430b.booleanValue() || g.a()) {
            return false;
        }
        return true;
    }
}
