package com.google.android.gms.internal.measurement;

import s6.a;

public enum j3 implements h6 {
    RADS(1),
    PROVISIONING(2);
    
    private static final i6<j3> zzc = null;
    private final int zzd;

    /* access modifiers changed from: public */
    static {
        zzc = new a();
    }

    private j3(int i10) {
        this.zzd = i10;
    }

    public static j3 zza(int i10) {
        if (i10 == 1) {
            return RADS;
        }
        if (i10 != 2) {
            return null;
        }
        return PROVISIONING;
    }

    public static j6 zzb() {
        return h3.f2732a;
    }

    public final String toString() {
        return "<" + j3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
    }
}
