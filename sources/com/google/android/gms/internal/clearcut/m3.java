package com.google.android.gms.internal.clearcut;

import com.karumi.dexter.BuildConfig;

public enum m3 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(u.f2544p),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzlj;

    private m3(Object obj) {
        this.zzlj = obj;
    }
}
