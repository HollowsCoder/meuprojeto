package com.google.android.gms.internal.measurement;

public enum r8 {
    DOUBLE(s8.DOUBLE, 1),
    FLOAT(s8.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(s8.BOOLEAN, 0),
    STRING(s8.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(s8.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(s8.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final s8 zzs;

    private r8(s8 s8Var, int i10) {
        this.zzs = s8Var;
    }

    public final s8 zza() {
        return this.zzs;
    }
}
