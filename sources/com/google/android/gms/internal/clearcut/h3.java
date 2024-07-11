package com.google.android.gms.internal.clearcut;

public enum h3 {
    DOUBLE(m3.DOUBLE, 1),
    FLOAT(m3.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(m3.BOOLEAN, 0),
    STRING(m3.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(m3.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(m3.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final m3 zzqu;
    private final int zzqv;

    private h3(m3 m3Var, int i10) {
        this.zzqu = m3Var;
        this.zzqv = i10;
    }

    public final m3 zzek() {
        return this.zzqu;
    }

    public final int zzel() {
        return this.zzqv;
    }
}
