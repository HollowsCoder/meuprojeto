package h5;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.q0;

public final class z5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ p f5844o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ String f5845p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ q0 f5846q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ f6 f5847r;

    public z5(f6 f6Var, p pVar, String str, q0 q0Var) {
        this.f5847r = f6Var;
        this.f5844o = pVar;
        this.f5845p = str;
        this.f5846q = q0Var;
    }

    public final void run() {
        g7 g7Var;
        q0 q0Var = this.f5846q;
        f6 f6Var = this.f5847r;
        byte[] bArr = null;
        try {
            x2 x2Var = f6Var.f5383r;
            i4 i4Var = f6Var.f5649o;
            if (x2Var == null) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.f5397t.a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = x2Var.A(this.f5844o, this.f5845p);
                f6Var.p();
            }
            g7Var = i4Var.z;
        } catch (RemoteException e10) {
            g3 g3Var2 = f6Var.f5649o.w;
            i4.n(g3Var2);
            g3Var2.f5397t.b(e10, "Failed to send event to the service to bundle");
            g7Var = f6Var.f5649o.z;
        } catch (Throwable th) {
            g7 g7Var2 = f6Var.f5649o.z;
            i4.l(g7Var2);
            g7Var2.L(q0Var, bArr);
            throw th;
        }
        i4.l(g7Var);
        g7Var.L(q0Var, bArr);
    }
}
