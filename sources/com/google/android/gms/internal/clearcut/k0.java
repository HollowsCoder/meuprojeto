package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Type;

public enum k0 {
    DOUBLE(0, r13, r14),
    FLOAT(1, r11, r1),
    INT64(2, r11, r12),
    UINT64(3, r11, r12),
    INT32(4, r11, r21),
    FIXED64(5, r11, r3),
    FIXED32(6, r11, r21),
    BOOL(7, r11, r25),
    STRING(8, r11, r27),
    MESSAGE(9, r11, r29),
    BYTES(10, r11, r31),
    UINT32(11, r11, r21),
    ENUM(12, r11, r34),
    SFIXED32(13, r11, r21),
    SFIXED64(14, r11, r3),
    SINT32(15, r11, r21),
    SINT64(16, r11, r3),
    GROUP(17, r11, r29),
    DOUBLE_LIST(18, r40, r12),
    FLOAT_LIST(19, r19, r1),
    INT64_LIST(20, r19, r20),
    UINT64_LIST(21, r19, r20),
    INT32_LIST(22, r19, r21),
    FIXED64_LIST(23, r19, r3),
    FIXED32_LIST(24, r19, r21),
    BOOL_LIST(25, r19, r25),
    STRING_LIST(26, r19, r27),
    MESSAGE_LIST(27, r19, r29),
    BYTES_LIST(28, r19, r31),
    UINT32_LIST(29, r19, r21),
    ENUM_LIST(30, r19, r34),
    SFIXED32_LIST(31, r19, r21),
    SFIXED64_LIST(32, r19, r3),
    SINT32_LIST(33, r19, r21),
    SINT64_LIST(34, r19, r3),
    DOUBLE_LIST_PACKED(35, r56, r12),
    FLOAT_LIST_PACKED(36, r19, r1),
    INT64_LIST_PACKED(37, r19, r20),
    UINT64_LIST_PACKED(38, r19, r20),
    INT32_LIST_PACKED(39, r19, r21),
    FIXED64_LIST_PACKED(40, r19, r3),
    FIXED32_LIST_PACKED(41, r19, r21),
    BOOL_LIST_PACKED(42, r19, r25),
    UINT32_LIST_PACKED(43, r19, r21),
    ENUM_LIST_PACKED(44, r19, r34),
    SFIXED32_LIST_PACKED(45, r19, r21),
    SFIXED64_LIST_PACKED(46, r19, r3),
    SINT32_LIST_PACKED(47, r19, r21),
    SINT64_LIST_PACKED(48, r19, r3),
    GROUP_LIST(49, r40, r29),
    MAP(50, m0.MAP, x0.VOID);
    
    private static final k0[] zzjb = null;
    private static final Type[] zzjc = null;
    private final int id;
    private final x0 zzix;
    private final m0 zziy;
    private final Class<?> zziz;
    private final boolean zzja;

    /* access modifiers changed from: public */
    static {
        int i10;
        zzjc = new Type[0];
        k0[] values = values();
        zzjb = new k0[values.length];
        for (k0 k0Var : values) {
            zzjb[k0Var.id] = k0Var;
        }
    }

    private k0(int i10, m0 m0Var, x0 x0Var) {
        int i11;
        this.id = i10;
        this.zziy = m0Var;
        this.zzix = x0Var;
        int i12 = l0.f2493a[m0Var.ordinal()];
        boolean z = true;
        this.zziz = (i12 == 1 || i12 == 2) ? x0Var.zzbq() : null;
        this.zzja = (m0Var != m0.SCALAR || (i11 = l0.f2494b[x0Var.ordinal()]) == 1 || i11 == 2 || i11 == 3) ? false : z;
    }

    public final int id() {
        return this.id;
    }
}
