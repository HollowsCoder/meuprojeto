package l4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.widget.m;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import h5.e6;
import h5.f6;
import h5.g3;
import h5.i4;
import h5.i5;
import h5.i7;
import h5.p4;
import h5.p5;
import h5.x2;
import h5.z6;
import j4.b;
import java.util.Set;
import k5.n;
import l4.d;
import m5.a;
import m5.e;
import m5.f;
import m5.g;
import m5.i;
import m5.r;
import n4.h;

public final class w implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f6948o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f6949p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f6950q;

    public /* synthetic */ w(int i10, Object obj, Object obj2) {
        this.f6948o = i10;
        this.f6950q = obj;
        this.f6949p = obj2;
    }

    public final void run() {
        boolean z;
        Set<Scope> set;
        String str;
        String str2;
        String str3;
        long j8;
        m mVar;
        r rVar;
        m5.m mVar2;
        h hVar = null;
        boolean z10 = true;
        switch (this.f6948o) {
            case 0:
                v vVar = (v) this.f6950q;
                n nVar = (n) this.f6949p;
                vVar.getClass();
                b bVar = nVar.f6707p;
                if (bVar.f6535p == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    n4.w wVar = nVar.f6708q;
                    n4.m.h(wVar);
                    bVar = wVar.f7476q;
                    if (bVar.f6535p != 0) {
                        z10 = false;
                    }
                    if (!z10) {
                        String valueOf = String.valueOf(bVar);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                        sb.append("Sign-in succeeded with resolve account failure: ");
                        sb.append(valueOf);
                        Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                    } else {
                        x xVar = vVar.f6947g;
                        IBinder iBinder = wVar.f7475p;
                        if (iBinder != null) {
                            int i10 = h.a.f7444a;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof h) {
                                hVar = (h) queryLocalInterface;
                            } else {
                                hVar = new h.a.C0105a(iBinder);
                            }
                        }
                        d.c cVar = (d.c) xVar;
                        cVar.getClass();
                        if (hVar == null || (set = vVar.d) == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            cVar.b(new b(4));
                        } else {
                            cVar.f6905c = hVar;
                            cVar.d = set;
                            cVar.c();
                        }
                        vVar.f6946f.k();
                        return;
                    }
                }
                ((d.c) vVar.f6947g).b(bVar);
                vVar.f6946f.k();
                return;
            case 1:
                p4 p4Var = (p4) this.f6950q;
                p4Var.f5631a.j();
                z6 z6Var = p4Var.f5631a;
                i7 i7Var = (i7) this.f6949p;
                z6Var.f().g();
                z6Var.K();
                n4.m.e(i7Var.f5468o);
                z6Var.q(i7Var);
                return;
            case 2:
                Object obj = this.f6950q;
                f6 f6Var = (f6) obj;
                x2 x2Var = f6Var.f5383r;
                if (x2Var == null) {
                    g3 g3Var = f6Var.f5649o.w;
                    i4.n(g3Var);
                    g3Var.f5397t.a("Failed to send current screen to service");
                    return;
                }
                try {
                    p5 p5Var = (p5) this.f6949p;
                    if (p5Var == null) {
                        str2 = null;
                        str = ((f6) obj).f5649o.f5452o.getPackageName();
                        j8 = 0;
                        str3 = null;
                    } else {
                        long j10 = p5Var.f5636c;
                        String str4 = p5Var.f5634a;
                        String str5 = p5Var.f5635b;
                        str = ((f6) obj).f5649o.f5452o.getPackageName();
                        str2 = str5;
                        j8 = j10;
                        str3 = str4;
                    }
                    x2Var.u(j8, str3, str2, str);
                    ((f6) obj).p();
                    return;
                } catch (RemoteException e10) {
                    g3 g3Var2 = f6Var.f5649o.w;
                    i4.n(g3Var2);
                    g3Var2.f5397t.b(e10, "Failed to send current screen to the service");
                    return;
                }
            case 3:
                Object obj2 = this.f6949p;
                Object obj3 = this.f6950q;
                f6 f6Var2 = (f6) obj3;
                x2 x2Var2 = f6Var2.f5383r;
                if (x2Var2 == null) {
                    g3 g3Var3 = f6Var2.f5649o.w;
                    i4.n(g3Var3);
                    g3Var3.f5397t.a("Failed to send consent settings to service");
                    return;
                }
                try {
                    n4.m.h((i7) obj2);
                    x2Var2.n((i7) obj2);
                    ((f6) obj3).p();
                    return;
                } catch (RemoteException e11) {
                    g3 g3Var4 = f6Var2.f5649o.w;
                    i4.n(g3Var4);
                    g3Var4.f5397t.b(e11, "Failed to send consent settings to the service");
                    return;
                }
            case 4:
                synchronized (((e6) this.f6950q)) {
                    ((e6) this.f6950q).f5359a = false;
                    if (!((e6) this.f6950q).f5361c.t()) {
                        g3 g3Var5 = ((e6) this.f6950q).f5361c.f5649o.w;
                        i4.n(g3Var5);
                        g3Var5.A.a("Connected to remote service");
                        f6 f6Var3 = ((e6) this.f6950q).f5361c;
                        x2 x2Var3 = (x2) this.f6949p;
                        f6Var3.g();
                        n4.m.h(x2Var3);
                        f6Var3.f5383r = x2Var3;
                        f6Var3.p();
                        f6Var3.r();
                    }
                }
                return;
            case 5:
                i5 i5Var = ((AppMeasurementDynamiteService) this.f6950q).f3203a.D;
                i4.m(i5Var);
                m mVar3 = (m) this.f6949p;
                i5Var.g();
                i5Var.h();
                if (!(mVar3 == null || mVar3 == (mVar = i5Var.f5462r))) {
                    if (mVar != null) {
                        z10 = false;
                    }
                    n4.m.j("EventInterceptor already set.", z10);
                }
                i5Var.f5462r = mVar3;
                return;
            case 6:
                Object obj4 = this.f6949p;
                boolean k10 = ((i) obj4).k();
                Object obj5 = this.f6950q;
                if (k10) {
                    ((r) ((m5.m) obj5).f7104r).q();
                    return;
                }
                try {
                    ((r) ((m5.m) obj5).f7104r).s(((a) ((m5.m) obj5).f7103q).c((i) obj4));
                    return;
                } catch (g e12) {
                    e = e12;
                    mVar2 = (m5.m) obj5;
                    if (e.getCause() instanceof Exception) {
                        rVar = (r) mVar2.f7104r;
                        e = (Exception) e.getCause();
                        rVar.r(e);
                        return;
                    }
                    rVar = (r) mVar2.f7104r;
                    rVar.r(e);
                    return;
                } catch (Exception e13) {
                    e = e13;
                    mVar2 = (m5.m) obj5;
                    rVar = (r) mVar2.f7104r;
                    rVar.r(e);
                    return;
                }
            case 7:
                synchronized (((m5.m) this.f6950q).f7103q) {
                    Object obj6 = this.f6950q;
                    if (((e) ((m5.m) obj6).f7104r) != null) {
                        Exception h10 = ((i) this.f6949p).h();
                        n4.m.h(h10);
                        ((e) ((m5.m) obj6).f7104r).e(h10);
                    }
                }
                return;
            default:
                synchronized (((m5.n) this.f6950q).f7107q) {
                    Object obj7 = this.f6950q;
                    if (((f) ((m5.n) obj7).f7108r) != null) {
                        ((f) ((m5.n) obj7).f7108r).c(((i) this.f6949p).i());
                    }
                }
                return;
        }
    }
}
