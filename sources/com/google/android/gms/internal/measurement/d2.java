package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import r2.a;

public enum d2 implements h6 {
    UNKNOWN_COMPARISON_TYPE(0),
    LESS_THAN(1),
    GREATER_THAN(2),
    EQUAL(3),
    BETWEEN(4);
    
    private static final i6<d2> zzf = null;
    private final int zzg;

    /* access modifiers changed from: public */
    static {
        zzf = new a((x0) null);
    }

    private d2(int i10) {
        this.zzg = i10;
    }

    public static d2 zza(int i10) {
        if (i10 == 0) {
            return UNKNOWN_COMPARISON_TYPE;
        }
        if (i10 == 1) {
            return LESS_THAN;
        }
        if (i10 == 2) {
            return GREATER_THAN;
        }
        if (i10 == 3) {
            return EQUAL;
        }
        if (i10 != 4) {
            return null;
        }
        return BETWEEN;
    }

    public static j6 zzb() {
        return c2.f2653a;
    }

    public final String toString() {
        return "<" + d2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }
}
