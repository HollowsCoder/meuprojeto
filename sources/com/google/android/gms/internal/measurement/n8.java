package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class n8 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f2846a;

    public n8(Unsafe unsafe) {
        this.f2846a = unsafe;
    }

    public abstract void a(Object obj, long j8, byte b10);

    public abstract boolean b(long j8, Object obj);

    public abstract void c(Object obj, long j8, boolean z);

    public abstract float d(long j8, Object obj);

    public abstract void e(Object obj, long j8, float f10);

    public abstract double f(long j8, Object obj);

    public abstract void g(Object obj, long j8, double d);

    public final void h(Field field) {
        this.f2846a.objectFieldOffset(field);
    }

    public final int i(Class<?> cls) {
        return this.f2846a.arrayBaseOffset(cls);
    }

    public final int j(Class<?> cls) {
        return this.f2846a.arrayIndexScale(cls);
    }

    public final int k(long j8, Object obj) {
        return this.f2846a.getInt(obj, j8);
    }

    public final void l(int i10, long j8, Object obj) {
        this.f2846a.putInt(obj, j8, i10);
    }

    public final long m(long j8, Object obj) {
        return this.f2846a.getLong(obj, j8);
    }

    public final void n(Object obj, long j8, long j10) {
        this.f2846a.putLong(obj, j8, j10);
    }

    public final Object o(long j8, Object obj) {
        return this.f2846a.getObject(obj, j8);
    }

    public final void p(long j8, Object obj, Object obj2) {
        this.f2846a.putObject(obj, j8, obj2);
    }
}
