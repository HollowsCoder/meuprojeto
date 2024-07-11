package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;

public enum s8 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(k5.f2770p),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzj;

    private s8(Object obj) {
        this.zzj = obj;
    }
}
