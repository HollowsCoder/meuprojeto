package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final x f2594a;

    public y(x xVar) {
        Charset charset = r0.f2537a;
        if (xVar != null) {
            this.f2594a = xVar;
            xVar.f2578o = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void a(double d, int i10) {
        x xVar = this.f2594a;
        xVar.getClass();
        xVar.b0(i10, Double.doubleToRawLongBits(d));
    }

    public final void b(int i10, float f10) {
        x xVar = this.f2594a;
        xVar.getClass();
        xVar.i0(i10, Float.floatToRawIntBits(f10));
    }

    public final void c(int i10, long j8) {
        this.f2594a.I(i10, j8);
    }

    public final void d(int i10, u uVar) {
        this.f2594a.J(i10, uVar);
    }

    public final void e(int i10, i2 i2Var, Object obj) {
        this.f2594a.L(i10, (r1) obj, i2Var);
    }

    public final void f(int i10, Object obj) {
        boolean z = obj instanceof u;
        x xVar = this.f2594a;
        if (z) {
            xVar.S(i10, (u) obj);
        } else {
            xVar.T(i10, (r1) obj);
        }
    }

    public final void g(int i10, long j8) {
        this.f2594a.I(i10, (j8 >> 63) ^ (j8 << 1));
    }

    public final void h(int i10, i2 i2Var, Object obj) {
        x xVar = this.f2594a;
        xVar.R(i10, 3);
        i2Var.e((r1) obj, xVar.f2578o);
        xVar.R(i10, 4);
    }

    public final void i(int i10, boolean z) {
        this.f2594a.U(i10, z);
    }

    public final void j(int i10, int i11) {
        this.f2594a.a0(i10, i11);
    }

    public final void k(int i10, long j8) {
        this.f2594a.b0(i10, j8);
    }

    public final void l(int i10, int i11) {
        this.f2594a.d0(i10, i11);
    }

    public final void m(int i10, int i11) {
        this.f2594a.d0(i10, (i11 >> 31) ^ (i11 << 1));
    }

    public final void n(int i10, int i11) {
        this.f2594a.i0(i10, i11);
    }

    public final void o(int i10, long j8) {
        this.f2594a.I(i10, j8);
    }

    public final void p(int i10, long j8) {
        this.f2594a.b0(i10, j8);
    }

    public final void q(int i10, int i11) {
        this.f2594a.i0(i10, i11);
    }

    public final void r(int i10, int i11) {
        this.f2594a.a0(i10, i11);
    }
}
