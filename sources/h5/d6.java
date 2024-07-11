package h5;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.q0;
import java.util.ArrayList;
import n4.m;

public final class d6 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ String f5338o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ String f5339p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ i7 f5340q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ q0 f5341r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ f6 f5342s;

    public d6(f6 f6Var, String str, String str2, i7 i7Var, q0 q0Var) {
        this.f5342s = f6Var;
        this.f5338o = str;
        this.f5339p = str2;
        this.f5340q = i7Var;
        this.f5341r = q0Var;
    }

    public final void run() {
        g7 g7Var;
        i7 i7Var = this.f5340q;
        String str = this.f5339p;
        String str2 = this.f5338o;
        q0 q0Var = this.f5341r;
        f6 f6Var = this.f5342s;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            x2 x2Var = f6Var.f5383r;
            i4 i4Var = f6Var.f5649o;
            if (x2Var == null) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.f5397t.c(str2, str, "Failed to get conditional properties; not connected to service");
            } else {
                m.h(i7Var);
                arrayList = g7.P(x2Var.p(str2, str, i7Var));
                f6Var.p();
            }
            g7Var = i4Var.z;
        } catch (RemoteException e10) {
            g3 g3Var2 = f6Var.f5649o.w;
            i4.n(g3Var2);
            g3Var2.f5397t.d("Failed to get conditional properties; remote exception", str2, str, e10);
            g7Var = f6Var.f5649o.z;
        } catch (Throwable th) {
            g7 g7Var2 = f6Var.f5649o.z;
            i4.l(g7Var2);
            g7Var2.O(q0Var, arrayList);
            throw th;
        }
        i4.l(g7Var);
        g7Var.O(q0Var, arrayList);
    }
}
