package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class w2 extends b6<x2, w2> {
    public w2() {
        super(x2.zzj);
    }

    public /* synthetic */ w2(int i10) {
        super(x2.zzj);
    }

    public final List<b3> q() {
        return Collections.unmodifiableList(((x2) this.f2635p).r());
    }

    public final b3 r(int i10) {
        return ((x2) this.f2635p).t(i10);
    }

    public final void s(int i10, b3 b3Var) {
        if (this.f2636q) {
            m();
            this.f2636q = false;
        }
        x2.D((x2) this.f2635p, i10, b3Var);
    }

    public final void t(a3 a3Var) {
        if (this.f2636q) {
            m();
            this.f2636q = false;
        }
        x2.E((x2) this.f2635p, (b3) a3Var.j());
    }

    public final void u(int i10) {
        if (this.f2636q) {
            m();
            this.f2636q = false;
        }
        x2.H((x2) this.f2635p, i10);
    }

    public final String v() {
        return ((x2) this.f2635p).u();
    }

    public final void w(String str) {
        if (this.f2636q) {
            m();
            this.f2636q = false;
        }
        x2.I((x2) this.f2635p, str);
    }

    public final long x() {
        return ((x2) this.f2635p).w();
    }

    public final long y() {
        return ((x2) this.f2635p).y();
    }
}
