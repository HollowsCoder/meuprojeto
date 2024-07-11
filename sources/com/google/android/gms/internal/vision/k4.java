package com.google.android.gms.internal.vision;

public enum k4 {
    DOUBLE(n4.DOUBLE, 1),
    FLOAT(n4.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(n4.BOOLEAN, 0),
    STRING(n4.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(n4.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(n4.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final n4 zzs;
    private final int zzt;

    private k4(n4 n4Var, int i10) {
        this.zzs = n4Var;
        this.zzt = i10;
    }

    public final n4 zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
