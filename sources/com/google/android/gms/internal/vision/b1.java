package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;

public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final a1 f3058a;

    public b1(a1 a1Var) {
        Charset charset = u1.f3170a;
        if (a1Var != null) {
            this.f3058a = a1Var;
            a1Var.f3036o = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void a(double d, int i10) {
        a1 a1Var = this.f3058a;
        a1Var.getClass();
        a1Var.a0(i10, Double.doubleToRawLongBits(d));
    }

    public final void b(int i10, float f10) {
        a1 a1Var = this.f3058a;
        a1Var.getClass();
        a1Var.h0(i10, Float.floatToRawIntBits(f10));
    }

    public final void c(int i10, int i11) {
        this.f3058a.h0(i10, i11);
    }

    public final void d(int i10, long j8) {
        this.f3058a.I(i10, j8);
    }

    public final void e(int i10, w0 w0Var) {
        this.f3058a.J(i10, w0Var);
    }

    public final void f(int i10, m3 m3Var, Object obj) {
        this.f3058a.L(i10, (w2) obj, m3Var);
    }

    public final void g(int i10, Object obj) {
        boolean z = obj instanceof w0;
        a1 a1Var = this.f3058a;
        if (z) {
            a1Var.U(i10, (w0) obj);
        } else {
            a1Var.K(i10, (w2) obj);
        }
    }

    public final void h(int i10, boolean z) {
        this.f3058a.M(i10, z);
    }

    public final void i(int i10, int i11) {
        this.f3058a.T(i10, i11);
    }

    public final void j(int i10, long j8) {
        this.f3058a.a0(i10, j8);
    }

    public final void k(int i10, m3 m3Var, Object obj) {
        a1 a1Var = this.f3058a;
        a1Var.H(i10, 3);
        m3Var.i((w2) obj, a1Var.f3036o);
        a1Var.H(i10, 4);
    }

    public final void l(int i10, int i11) {
        this.f3058a.T(i10, i11);
    }

    public final void m(int i10, long j8) {
        this.f3058a.I(i10, j8);
    }

    public final void n(int i10, int i11) {
        this.f3058a.h0(i10, i11);
    }

    public final void o(int i10, long j8) {
        this.f3058a.a0(i10, j8);
    }

    public final void p(int i10, int i11) {
        this.f3058a.Z(i10, i11);
    }

    public final void q(int i10, long j8) {
        this.f3058a.I(i10, (j8 >> 63) ^ (j8 << 1));
    }

    public final void r(int i10, int i11) {
        this.f3058a.Z(i10, (i11 >> 31) ^ (i11 << 1));
    }
}
