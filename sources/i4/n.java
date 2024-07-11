package i4;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import h5.c4;
import h5.e;
import h5.e6;
import h5.f6;
import h5.g3;
import h5.g6;
import h5.i4;
import h5.n3;
import h5.o5;
import h5.q3;
import h5.q7;
import h5.s6;
import h5.x2;
import h5.z6;
import java.util.concurrent.CancellationException;
import l4.g0;
import m1.i;
import m5.a;
import m5.g;
import m5.h;
import m5.k;
import m5.q;
import m5.r;
import n4.m;
import r4.d;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f6091o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f6092p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f6093q;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.f6091o = i10;
        this.f6093q = obj;
        this.f6092p = obj2;
    }

    public final void run() {
        m5.n nVar;
        String message;
        r rVar;
        m5.n nVar2;
        switch (this.f6091o) {
            case 0:
                p pVar = (p) this.f6092p;
                IBinder iBinder = (IBinder) this.f6093q;
                synchronized (pVar) {
                    if (iBinder == null) {
                        message = "Null service connection";
                    } else {
                        try {
                            pVar.f6099c = new i(iBinder);
                            pVar.f6097a = 2;
                            pVar.f6101f.f6107b.execute(new l(0, pVar));
                        } catch (RemoteException e10) {
                            message = e10.getMessage();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    pVar.a(message, 0);
                }
                return;
            case 1:
                f6 r5 = ((AppMeasurementDynamiteService) this.f6093q).f3203a.r();
                r5.g();
                r5.h();
                r5.q(new g0(r5, r5.s(false), (q0) this.f6092p, 3));
                return;
            case 2:
                synchronized (((e6) this.f6093q)) {
                    ((e6) this.f6093q).f5359a = false;
                    if (!((e6) this.f6093q).f5361c.t()) {
                        g3 g3Var = ((e6) this.f6093q).f5361c.f5649o.w;
                        i4.n(g3Var);
                        g3Var.B.a("Connected to service");
                        f6 f6Var = ((e6) this.f6093q).f5361c;
                        x2 x2Var = (x2) this.f6092p;
                        f6Var.g();
                        m.h(x2Var);
                        f6Var.f5383r = x2Var;
                        f6Var.p();
                        f6Var.r();
                    }
                }
                return;
            case 3:
                z6 z6Var = (z6) this.f6093q;
                z6Var.f().g();
                h5.i iVar = new h5.i(z6Var);
                iVar.j();
                z6Var.f5850q = iVar;
                e F = z6Var.F();
                c4 c4Var = z6Var.f5848o;
                m.h(c4Var);
                F.f5344q = c4Var;
                g6 g6Var = new g6(z6Var);
                g6Var.j();
                z6Var.w = g6Var;
                q7 q7Var = new q7(z6Var);
                q7Var.j();
                z6Var.f5853t = q7Var;
                o5 o5Var = new o5(z6Var);
                o5Var.j();
                z6Var.f5854v = o5Var;
                s6 s6Var = new s6(z6Var);
                s6Var.j();
                z6Var.f5852s = s6Var;
                z6Var.f5851r = new n3(z6Var);
                if (z6Var.D != z6Var.E) {
                    g3 e11 = z6Var.e();
                    e11.f5397t.c(Integer.valueOf(z6Var.D), Integer.valueOf(z6Var.E), "Not all upload components initialized");
                }
                z6Var.z = true;
                z6Var.f().g();
                h5.i iVar2 = z6Var.f5850q;
                z6.E(iVar2);
                iVar2.k();
                if (z6Var.w.w.a() == 0) {
                    q3 q3Var = z6Var.w.w;
                    ((d) z6Var.c()).getClass();
                    q3Var.b(System.currentTimeMillis());
                }
                z6Var.z();
                return;
            case 4:
                Object obj = this.f6093q;
                try {
                    m5.i iVar3 = (m5.i) ((a) ((m5.n) obj).f7107q).c((m5.i) this.f6092p);
                    if (iVar3 == null) {
                        ((m5.n) obj).e(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    q qVar = k.f7091b;
                    m5.n nVar3 = (m5.n) obj;
                    iVar3.d(qVar, nVar3);
                    iVar3.c(qVar, nVar3);
                    iVar3.a(qVar, nVar3);
                    return;
                } catch (g e12) {
                    e = e12;
                    nVar2 = (m5.n) obj;
                    if (e.getCause() instanceof Exception) {
                        rVar = (r) nVar2.f7108r;
                        e = (Exception) e.getCause();
                        rVar.r(e);
                        return;
                    }
                    rVar = (r) nVar2.f7108r;
                    rVar.r(e);
                    return;
                } catch (Exception e13) {
                    e = e13;
                    nVar2 = (m5.n) obj;
                    rVar = (r) nVar2.f7108r;
                    rVar.r(e);
                    return;
                }
            default:
                Object obj2 = this.f6093q;
                try {
                    m5.i i10 = ((h) ((m5.n) obj2).f7107q).i(((m5.i) this.f6092p).i());
                    if (i10 == null) {
                        nVar = (m5.n) obj2;
                        e = new NullPointerException("Continuation returned null");
                        nVar.e(e);
                        return;
                    }
                    q qVar2 = k.f7091b;
                    m5.n nVar4 = (m5.n) obj2;
                    i10.d(qVar2, nVar4);
                    i10.c(qVar2, nVar4);
                    i10.a(qVar2, nVar4);
                    return;
                } catch (g e14) {
                    e = e14;
                    nVar = (m5.n) obj2;
                    if (e.getCause() instanceof Exception) {
                        e = (Exception) e.getCause();
                    }
                } catch (CancellationException unused) {
                    ((m5.n) obj2).b();
                    return;
                } catch (Exception e15) {
                    e = e15;
                    nVar = (m5.n) obj2;
                }
        }
    }

    public /* synthetic */ n(p pVar, IBinder iBinder) {
        this.f6091o = 0;
        this.f6092p = pVar;
        this.f6093q = iBinder;
    }
}
