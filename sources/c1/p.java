package c1;

import android.os.Build;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f2123a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f2124b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f2125c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i10 < 28) {
            z = false;
        }
        f2125c = z;
    }
}
