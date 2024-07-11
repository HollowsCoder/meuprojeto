package com.google.android.gms.internal.vision;

public final class q2 implements x2 {

    /* renamed from: a  reason: collision with root package name */
    public final x2[] f3146a;

    public q2(x2... x2VarArr) {
        this.f3146a = x2VarArr;
    }

    public final u2 a(Class<?> cls) {
        for (x2 x2Var : this.f3146a) {
            if (x2Var.b(cls)) {
                return x2Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    public final boolean b(Class<?> cls) {
        for (x2 b10 : this.f3146a) {
            if (b10.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
