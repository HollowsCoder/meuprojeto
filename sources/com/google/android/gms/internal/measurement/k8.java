package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

public final class k8 implements PrivilegedExceptionAction<Unsafe> {
    public static final Unsafe a() {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object run() {
        return a();
    }
}
