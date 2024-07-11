package com.google.android.gms.internal.measurement;

public final class z6 implements h7 {

    /* renamed from: a  reason: collision with root package name */
    public final h7[] f3024a;

    public z6(h7... h7VarArr) {
        this.f3024a = h7VarArr;
    }

    public final boolean a(Class<?> cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f3024a[i10].a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final g7 b(Class<?> cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            h7 h7Var = this.f3024a[i10];
            if (h7Var.a(cls)) {
                return h7Var.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
