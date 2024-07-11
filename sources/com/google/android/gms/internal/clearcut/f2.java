package com.google.android.gms.internal.clearcut;

public final class f2 implements p1 {

    /* renamed from: a  reason: collision with root package name */
    public final r1 f2419a;

    /* renamed from: b  reason: collision with root package name */
    public final g2 f2420b;

    public f2(p0 p0Var, String str, Object[] objArr) {
        this.f2419a = p0Var;
        this.f2420b = new g2(p0Var.getClass(), str, objArr);
    }

    public final int a() {
        return (this.f2420b.d & 1) == 1 ? 1 : 2;
    }

    public final boolean b() {
        return (this.f2420b.d & 2) == 2;
    }

    public final r1 c() {
        return this.f2419a;
    }
}
