package j4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.atomic.AtomicBoolean;
import t4.c;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f6549a = false;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f6550b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicBoolean f6551c = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    @RecentlyNonNull
    public static boolean a(@RecentlyNonNull Context context) {
        if (!f6550b) {
            try {
                PackageInfo b10 = c.a(context).b("com.google.android.gms", 64);
                i.a(context);
                if (b10 == null || i.d(b10, false) || !i.d(b10, true)) {
                    f6549a = false;
                } else {
                    f6549a = true;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
            } catch (Throwable th) {
                f6550b = true;
                throw th;
            }
            f6550b = true;
        }
        if (f6549a || !"user".equals(Build.TYPE)) {
            return true;
        }
        return false;
    }
}
