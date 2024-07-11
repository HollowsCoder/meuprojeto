package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import r2.a;

public enum v3 implements h6 {
    UNKNOWN(0),
    STRING(1),
    NUMBER(2),
    BOOLEAN(3),
    STATEMENT(4);
    
    private static final i6<v3> zzf = null;
    private final int zzg;

    /* access modifiers changed from: public */
    static {
        zzf = new a((x0) null);
    }

    private v3(int i10) {
        this.zzg = i10;
    }

    public static v3 zza(int i10) {
        if (i10 == 0) {
            return UNKNOWN;
        }
        if (i10 == 1) {
            return STRING;
        }
        if (i10 == 2) {
            return NUMBER;
        }
        if (i10 == 3) {
            return BOOLEAN;
        }
        if (i10 != 4) {
            return null;
        }
        return STATEMENT;
    }

    public static j6 zzb() {
        return u3.f2950a;
    }

    public final String toString() {
        return "<" + v3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
    }
}
