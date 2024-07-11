package com.google.android.gms.internal.vision;

public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f3140a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f3141b;

    static {
        Class<?> cls;
        boolean z;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f3140a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z = true;
        } else {
            z = false;
        }
        f3141b = z;
    }

    public static boolean a() {
        return f3140a != null && !f3141b;
    }

    public static Class<?> b() {
        return f3140a;
    }
}
