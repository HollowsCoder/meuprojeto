package com.google.gson.internal.reflect;

import com.google.gson.internal.JavaVersion;
import h8.a;
import h8.b;
import java.lang.reflect.AccessibleObject;

public abstract class ReflectionAccessor {
    private static final ReflectionAccessor instance = (JavaVersion.getMajorJavaVersion() < 9 ? new a() : new b());

    public static ReflectionAccessor getInstance() {
        return instance;
    }

    public abstract void makeAccessible(AccessibleObject accessibleObject);
}
