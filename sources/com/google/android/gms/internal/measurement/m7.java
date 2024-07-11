package com.google.android.gms.internal.measurement;

public final class m7<T> implements t7<T> {

    /* renamed from: a  reason: collision with root package name */
    public final i7 f2828a;

    /* renamed from: b  reason: collision with root package name */
    public final e8<?, ?> f2829b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2830c;
    public final s5<?> d;

    public m7(e8<?, ?> e8Var, s5<?> s5Var, i7 i7Var) {
        this.f2829b = e8Var;
        this.f2830c = s5Var.a(i7Var);
        this.d = s5Var;
        this.f2828a = i7Var;
    }

    public final int a(T t10) {
        int hashCode = this.f2829b.d(t10).hashCode();
        if (!this.f2830c) {
            return hashCode;
        }
        this.d.b(t10);
        throw null;
    }

    public final boolean c(T t10, T t11) {
        e8<?, ?> e8Var = this.f2829b;
        if (!e8Var.d(t10).equals(e8Var.d(t11))) {
            return false;
        }
        if (!this.f2830c) {
            return true;
        }
        s5<?> s5Var = this.d;
        s5Var.b(t10);
        s5Var.b(t11);
        throw null;
    }

    public final boolean f(T t10) {
        this.d.b(t10);
        throw null;
    }

    public final int g(T t10) {
        e8<?, ?> e8Var = this.f2829b;
        int g10 = e8Var.g(e8Var.d(t10));
        if (!this.f2830c) {
            return g10;
        }
        this.d.b(t10);
        throw null;
    }

    public final void h(T t10, o5 o5Var) {
        this.d.b(t10);
        throw null;
    }

    public final void i(T t10, T t11) {
        Class<?> cls = u7.f2955a;
        e8<?, ?> e8Var = this.f2829b;
        e8Var.c(t10, e8Var.f(e8Var.d(t10), e8Var.d(t11)));
        if (this.f2830c) {
            this.d.b(t11);
            throw null;
        }
    }

    public final void j(T t10, byte[] bArr, int i10, int i11, e5 e5Var) {
        f6 f6Var = (f6) t10;
        if (f6Var.zzc == f8.f2700f) {
            f6Var.zzc = f8.a();
        }
        d6 d6Var = (d6) t10;
        throw null;
    }

    public final void l(T t10) {
        this.f2829b.e(t10);
        this.d.c(t10);
    }

    public final T zza() {
        return this.f2828a.e().p();
    }
}
