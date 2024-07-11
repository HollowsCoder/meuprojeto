package com.google.android.gms.internal.clearcut;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f2524a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f2525b;

    static {
        Class<?> cls;
        boolean z;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f2524a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z = true;
        } else {
            z = false;
        }
        f2525b = z;
    }

    public static boolean a() {
        return f2524a != null && !f2525b;
    }
}
