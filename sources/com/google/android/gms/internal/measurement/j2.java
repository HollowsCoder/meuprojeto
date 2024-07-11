package com.google.android.gms.internal.measurement;

import s6.a;

public enum j2 implements h6 {
    UNKNOWN_MATCH_TYPE(0),
    REGEXP(1),
    BEGINS_WITH(2),
    ENDS_WITH(3),
    PARTIAL(4),
    EXACT(5),
    IN_LIST(6);
    
    private static final i6<j2> zzh = null;
    private final int zzi;

    /* access modifiers changed from: public */
    static {
        zzh = new a();
    }

    private j2(int i10) {
        this.zzi = i10;
    }

    public static j2 zza(int i10) {
        switch (i10) {
            case 0:
                return UNKNOWN_MATCH_TYPE;
            case 1:
                return REGEXP;
            case 2:
                return BEGINS_WITH;
            case 3:
                return ENDS_WITH;
            case 4:
                return PARTIAL;
            case 5:
                return EXACT;
            case 6:
                return IN_LIST;
            default:
                return null;
        }
    }

    public static j6 zzb() {
        return i2.f2742a;
    }

    public final String toString() {
        return "<" + j2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
    }
}
