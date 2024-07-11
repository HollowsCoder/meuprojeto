package h5;

import android.os.Bundle;
import s2.t;

public final /* synthetic */ class l6 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final m6 f5533o;

    public l6(m6 m6Var) {
        this.f5533o = m6Var;
    }

    public final void run() {
        m6 m6Var = this.f5533o;
        t tVar = m6Var.f5583q;
        long j8 = m6Var.f5581o;
        ((q6) tVar.f8686p).g();
        q6 q6Var = (q6) tVar.f8686p;
        g3 g3Var = q6Var.f5649o.w;
        i4.n(g3Var);
        g3Var.A.a("Application going to the background");
        boolean z = true;
        if (q6Var.f5649o.u.m((String) null, u2.f5738q0)) {
            u3 u3Var = q6Var.f5649o.f5458v;
            i4.l(u3Var);
            u3Var.E.b(true);
        }
        Bundle bundle = new Bundle();
        if (!q6Var.f5649o.u.q()) {
            q6Var.f5657s.f5615c.c();
            boolean m10 = q6Var.f5649o.u.m((String) null, u2.f5723i0);
            long j10 = m6Var.f5582p;
            if (m10) {
                o6 o6Var = q6Var.f5657s;
                long j11 = o6Var.f5614b;
                o6Var.f5614b = j10;
                bundle.putLong("_et", j10 - j11);
                u5 u5Var = q6Var.f5649o.C;
                i4.m(u5Var);
                u5.q(u5Var.o(true), bundle, true);
            } else {
                z = false;
            }
            q6Var.f5657s.a(false, z, j10);
        }
        i5 i5Var = q6Var.f5649o.D;
        i4.m(i5Var);
        i5Var.y(j8, bundle, "auto", "_ab");
    }
}
