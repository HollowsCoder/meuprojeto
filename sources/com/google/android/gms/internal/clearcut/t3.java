package com.google.android.gms.internal.clearcut;

public enum t3 implements s0 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);
    
    private static final t0<t3> zzbq = null;
    private final int value;

    /* access modifiers changed from: public */
    static {
        zzbq = new u3();
    }

    private t3(int i10) {
        this.value = i10;
    }

    public static t3 zzbc(int i10) {
        if (i10 == 0) {
            return DEFAULT;
        }
        if (i10 == 1) {
            return UNMETERED_ONLY;
        }
        if (i10 == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i10 == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i10 != 4) {
            return null;
        }
        return NEVER;
    }

    public static t0<t3> zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}
