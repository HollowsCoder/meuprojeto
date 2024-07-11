package n4;

import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.widget.x0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import z4.c;

public final class m {
    public static void a(@RecentlyNonNull String str, @RecentlyNonNull boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(@RecentlyNonNull boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(@RecentlyNonNull c cVar) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != cVar.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = cVar.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(x0.a(str, x0.a(name, 36)));
            sb.append("Must be called on ");
            sb.append(name);
            sb.append(" thread, but got ");
            sb.append(str);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void d(@RecentlyNonNull String str) {
        boolean z;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @RecentlyNonNull
    public static void e(@RecentlyNonNull String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    @RecentlyNonNull
    public static void f(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void g(@RecentlyNonNull String str) {
        boolean z;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    public static void h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    @EnsuresNonNull({"#1"})
    public static void i(@RecentlyNonNull Object obj, @RecentlyNonNull String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j(@RecentlyNonNull String str, @RecentlyNonNull boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }
}
