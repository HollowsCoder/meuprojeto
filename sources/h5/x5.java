package h5;

import android.os.RemoteException;
import n4.m;
import o4.a;

public final class x5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5805o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ i7 f5806p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ f6 f5807q;

    public /* synthetic */ x5(f6 f6Var, i7 i7Var, int i10) {
        this.f5805o = i10;
        this.f5807q = f6Var;
        this.f5806p = i7Var;
    }

    public final void run() {
        int i10 = this.f5805o;
        f6 f6Var = this.f5807q;
        i7 i7Var = this.f5806p;
        switch (i10) {
            case 0:
                x2 x2Var = f6Var.f5383r;
                i4 i4Var = f6Var.f5649o;
                if (x2Var == null) {
                    g3 g3Var = i4Var.w;
                    i4.n(g3Var);
                    g3Var.f5397t.a("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    m.h(i7Var);
                    x2Var.E(i7Var);
                } catch (RemoteException e10) {
                    g3 g3Var2 = i4Var.w;
                    i4.n(g3Var2);
                    g3Var2.f5397t.b(e10, "Failed to reset data on the service: remote exception");
                }
                f6Var.p();
                return;
            case 1:
                x2 x2Var2 = f6Var.f5383r;
                i4 i4Var2 = f6Var.f5649o;
                if (x2Var2 == null) {
                    g3 g3Var3 = i4Var2.w;
                    i4.n(g3Var3);
                    g3Var3.f5397t.a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    m.h(i7Var);
                    x2Var2.F(i7Var);
                    i4Var2.q().l();
                    f6Var.u(x2Var2, (a) null, i7Var);
                    f6Var.p();
                    return;
                } catch (RemoteException e11) {
                    g3 g3Var4 = i4Var2.w;
                    i4.n(g3Var4);
                    g3Var4.f5397t.b(e11, "Failed to send app launch to the service");
                    return;
                }
            default:
                x2 x2Var3 = f6Var.f5383r;
                i4 i4Var3 = f6Var.f5649o;
                if (x2Var3 == null) {
                    g3 g3Var5 = i4Var3.w;
                    i4.n(g3Var5);
                    g3Var5.f5397t.a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    m.h(i7Var);
                    x2Var3.o(i7Var);
                    f6Var.p();
                    return;
                } catch (RemoteException e12) {
                    g3 g3Var6 = i4Var3.w;
                    i4.n(g3Var6);
                    g3Var6.f5397t.b(e12, "Failed to send measurementEnabled to the service");
                    return;
                }
        }
    }
}
