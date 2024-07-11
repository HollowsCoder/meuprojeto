package com.google.android.gms.internal.vision;

import com.karumi.dexter.BuildConfig;

public enum n4 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(w0.f3182p),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzj;

    private n4(Object obj) {
        this.zzj = obj;
    }
}
