package com.google.android.gms.internal.vision;

import n.e;

public enum i0 implements t1 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);
    
    private static final w1<i0> zzq = null;
    private final int zzr;

    /* access modifiers changed from: public */
    static {
        zzq = new e(6);
    }

    private i0(int i10) {
        this.zzr = i10;
    }

    public static i0 zza(int i10) {
        switch (i10) {
            case 0:
                return UNRECOGNIZED;
            case 1:
                return CODE_128;
            case 2:
                return CODE_39;
            case 3:
                return CODE_93;
            case 4:
                return CODABAR;
            case 5:
                return DATA_MATRIX;
            case 6:
                return EAN_13;
            case 7:
                return EAN_8;
            case 8:
                return ITF;
            case 9:
                return QR_CODE;
            case 10:
                return UPC_A;
            case 11:
                return UPC_E;
            case 12:
                return PDF417;
            case 13:
                return AZTEC;
            case 14:
                return DATABAR;
            case 16:
                return TEZ_CODE;
            default:
                return null;
        }
    }

    public static v1 zzb() {
        return k0.f3107a;
    }

    public final String toString() {
        return "<" + i0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzr + " name=" + name() + '>';
    }

    public final int zza() {
        return this.zzr;
    }
}
