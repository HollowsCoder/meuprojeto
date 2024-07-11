package com.google.android.gms.internal.clearcut;

public final class k1 implements q1 {

    /* renamed from: a  reason: collision with root package name */
    public final q1[] f2473a;

    public k1(q1... q1VarArr) {
        this.f2473a = q1VarArr;
    }

    public final p1 a(Class<?> cls) {
        for (q1 q1Var : this.f2473a) {
            if (q1Var.b(cls)) {
                return q1Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    public final boolean b(Class<?> cls) {
        for (q1 b10 : this.f2473a) {
            if (b10.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
