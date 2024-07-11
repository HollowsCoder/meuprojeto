package t1;

import android.util.Log;
import java.util.HashSet;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f8876a = new b();

    public static void a() {
        f8876a.getClass();
    }

    public static void b(String str) {
        f8876a.getClass();
        HashSet hashSet = b.f8875a;
        if (!hashSet.contains(str)) {
            Log.w("LOTTIE", str, (Throwable) null);
            hashSet.add(str);
        }
    }

    public static void c(String str, Throwable th) {
        f8876a.getClass();
        HashSet hashSet = b.f8875a;
        if (!hashSet.contains(str)) {
            Log.w("LOTTIE", str, th);
            hashSet.add(str);
        }
    }
}
