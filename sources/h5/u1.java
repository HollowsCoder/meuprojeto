package h5;

import android.os.Bundle;
import java.util.Iterator;
import n.b;
import n.h;

public final class u1 extends t2 {

    /* renamed from: p  reason: collision with root package name */
    public final b f5704p = new b();

    /* renamed from: q  reason: collision with root package name */
    public final b f5705q = new b();

    /* renamed from: r  reason: collision with root package name */
    public long f5706r;

    public u1(i4 i4Var) {
        super(i4Var);
    }

    public final void h(String str, long j8) {
        i4 i4Var = this.f5649o;
        if (str == null || str.length() == 0) {
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.f5397t.a("Ad unit id must be a non-empty string");
            return;
        }
        h4 h4Var = i4Var.f5459x;
        i4.n(h4Var);
        h4Var.n(new a(this, str, j8, 0));
    }

    public final void i(String str, long j8) {
        i4 i4Var = this.f5649o;
        if (str == null || str.length() == 0) {
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.f5397t.a("Ad unit id must be a non-empty string");
            return;
        }
        h4 h4Var = i4Var.f5459x;
        i4.n(h4Var);
        h4Var.n(new a(this, str, j8, 1));
    }

    public final void j(long j8) {
        u5 u5Var = this.f5649o.C;
        i4.m(u5Var);
        p5 o10 = u5Var.o(false);
        b bVar = this.f5704p;
        Iterator it = ((h.c) bVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            l(str, j8 - ((Long) bVar.getOrDefault(str, null)).longValue(), o10);
        }
        if (!bVar.isEmpty()) {
            k(j8 - this.f5706r, o10);
        }
        m(j8);
    }

    public final void k(long j8, p5 p5Var) {
        i4 i4Var = this.f5649o;
        if (p5Var == null) {
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.B.a("Not logging ad exposure. No active activity");
        } else if (j8 < 1000) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.B.b(Long.valueOf(j8), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j8);
            u5.q(p5Var, bundle, true);
            i5 i5Var = i4Var.D;
            i4.m(i5Var);
            i5Var.x("am", "_xa", bundle);
        }
    }

    public final void l(String str, long j8, p5 p5Var) {
        i4 i4Var = this.f5649o;
        if (p5Var == null) {
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.B.a("Not logging ad unit exposure. No active activity");
        } else if (j8 < 1000) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.B.b(Long.valueOf(j8), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j8);
            u5.q(p5Var, bundle, true);
            i5 i5Var = i4Var.D;
            i4.m(i5Var);
            i5Var.x("am", "_xu", bundle);
        }
    }

    public final void m(long j8) {
        b bVar = this.f5704p;
        Iterator it = ((h.c) bVar.keySet()).iterator();
        while (it.hasNext()) {
            bVar.put((String) it.next(), Long.valueOf(j8));
        }
        if (!bVar.isEmpty()) {
            this.f5706r = j8;
        }
    }
}
