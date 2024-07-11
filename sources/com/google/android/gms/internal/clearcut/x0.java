package com.google.android.gms.internal.clearcut;

import com.karumi.dexter.BuildConfig;

public enum x0 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r13, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, BuildConfig.FLAVOR),
    BYTE_STRING(u.class, u.class, u.f2544p),
    ENUM(r13, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zzlh;
    private final Class<?> zzli;
    private final Object zzlj;

    private x0(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzlh = cls;
        this.zzli = cls2;
        this.zzlj = obj;
    }

    public final Class<?> zzbq() {
        return this.zzli;
    }
}
