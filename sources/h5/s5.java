package h5;

import s2.t;

public final class s5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5686o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ long f5687p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ s3 f5688q;

    public /* synthetic */ s5(s3 s3Var, long j8, int i10) {
        this.f5686o = i10;
        this.f5688q = s3Var;
        this.f5687p = j8;
    }

    public final void run() {
        int i10 = this.f5686o;
        s3 s3Var = this.f5688q;
        switch (i10) {
            case 0:
                u5 u5Var = (u5) s3Var;
                u5Var.f5649o.g().j(this.f5687p);
                u5Var.f5769s = null;
                return;
            default:
                q6 q6Var = (q6) s3Var;
                long j8 = this.f5687p;
                q6Var.g();
                q6Var.k();
                i4 i4Var = q6Var.f5649o;
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.B.b(Long.valueOf(j8), "Activity paused, time");
                t tVar = q6Var.f5658t;
                q6 q6Var2 = (q6) tVar.f8686p;
                q6Var2.f5649o.B.getClass();
                m6 m6Var = new m6(tVar, System.currentTimeMillis(), j8);
                tVar.f8685o = m6Var;
                q6Var2.f5655q.postDelayed(m6Var, 2000);
                if (i4Var.u.q()) {
                    q6Var.f5657s.f5615c.c();
                }
                p6 p6Var = q6Var.f5656r;
                if (!p6Var.f5639a.f5649o.u.m((String) null, u2.f5738q0)) {
                    u3 u3Var = p6Var.f5639a.f5649o.f5458v;
                    i4.l(u3Var);
                    u3Var.E.b(true);
                    return;
                }
                return;
        }
    }
}
