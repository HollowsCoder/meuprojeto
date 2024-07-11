package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

public final class o5 {

    /* renamed from: a  reason: collision with root package name */
    public final n5 f2859a;

    public o5(l5 l5Var) {
        Charset charset = n6.f2844a;
        this.f2859a = l5Var;
        l5Var.S = this;
    }

    public final void a(int i10, int i11) {
        this.f2859a.L0(i10, i11);
    }

    public final void b(int i10, long j8) {
        this.f2859a.M0(i10, j8);
    }

    public final void c(int i10, long j8) {
        this.f2859a.N0(i10, j8);
    }

    public final void d(int i10, float f10) {
        this.f2859a.L0(i10, Float.floatToRawIntBits(f10));
    }

    public final void e(double d, int i10) {
        this.f2859a.N0(i10, Double.doubleToRawLongBits(d));
    }

    public final void f(int i10, int i11) {
        this.f2859a.J0(i10, i11);
    }

    public final void g(int i10, long j8) {
        this.f2859a.M0(i10, j8);
    }

    public final void h(int i10, int i11) {
        this.f2859a.J0(i10, i11);
    }

    public final void i(int i10, long j8) {
        this.f2859a.N0(i10, j8);
    }

    public final void j(int i10, int i11) {
        this.f2859a.L0(i10, i11);
    }

    public final void k(int i10, boolean z) {
        this.f2859a.O0(i10, z);
    }

    public final void l(int i10, k5 k5Var) {
        this.f2859a.Q0(i10, k5Var);
    }

    public final void m(int i10, int i11) {
        this.f2859a.K0(i10, i11);
    }

    public final void n(int i10, int i11) {
        this.f2859a.K0(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void o(int i10, long j8) {
        this.f2859a.M0(i10, (j8 >> 63) ^ (j8 + j8));
    }

    public final void p(int i10, t7 t7Var, Object obj) {
        i7 i7Var = (i7) obj;
        l5 l5Var = (l5) this.f2859a;
        l5Var.T0((i10 << 3) | 2);
        b5 b5Var = (b5) i7Var;
        int b10 = b5Var.b();
        if (b10 == -1) {
            b10 = t7Var.g(b5Var);
            b5Var.f(b10);
        }
        l5Var.T0(b10);
        t7Var.h(i7Var, l5Var.S);
    }

    public final void q(int i10, t7 t7Var, Object obj) {
        n5 n5Var = this.f2859a;
        n5Var.I0(i10, 3);
        t7Var.h((i7) obj, n5Var.S);
        n5Var.I0(i10, 4);
    }
}
