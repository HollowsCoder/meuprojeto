package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

public final class m8 extends n8 {
    public m8(Unsafe unsafe) {
        super(unsafe);
    }

    public final void a(Object obj, long j8, byte b10) {
        if (o8.f2866g) {
            o8.c(obj, j8, b10);
        } else {
            o8.d(obj, j8, b10);
        }
    }

    public final boolean b(long j8, Object obj) {
        if (o8.f2866g) {
            if (((byte) ((o8.f2863c.k(-4 & j8, obj) >>> ((int) (((~j8) & 3) << 3))) & 255)) != 0) {
                return true;
            }
            return false;
        }
        if (((byte) ((o8.f2863c.k(-4 & j8, obj) >>> ((int) ((j8 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public final void c(Object obj, long j8, boolean z) {
        if (o8.f2866g) {
            o8.c(obj, j8, z);
        } else {
            o8.d(obj, j8, z ? (byte) 1 : 0);
        }
    }

    public final float d(long j8, Object obj) {
        return Float.intBitsToFloat(k(j8, obj));
    }

    public final void e(Object obj, long j8, float f10) {
        l(Float.floatToIntBits(f10), j8, obj);
    }

    public final double f(long j8, Object obj) {
        return Double.longBitsToDouble(m(j8, obj));
    }

    public final void g(Object obj, long j8, double d) {
        n(obj, j8, Double.doubleToLongBits(d));
    }
}
