package h5;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import b8.e;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.b3;
import com.google.android.gms.internal.measurement.w2;
import com.google.android.gms.internal.measurement.x2;
import com.karumi.dexter.BuildConfig;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import m5.j;
import n4.m;

public final /* synthetic */ class j4 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5489o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f5490p;

    /* renamed from: q  reason: collision with root package name */
    public final Object f5491q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f5492r;

    public j4(p4 p4Var, p pVar, String str) {
        this.f5489o = 1;
        this.f5491q = p4Var;
        this.f5492r = pVar;
        this.f5490p = str;
    }

    public final void run() {
        n nVar;
        AtomicReference atomicReference;
        switch (this.f5489o) {
            case 0:
                String str = (String) this.f5490p;
                Bundle bundle = (Bundle) this.f5492r;
                i iVar = ((p4) this.f5491q).f5631a.f5850q;
                z6.E(iVar);
                iVar.g();
                iVar.h();
                m.e(str);
                m.e("dep");
                TextUtils.isEmpty(BuildConfig.FLAVOR);
                i4 i4Var = iVar.f5649o;
                if (bundle == null || bundle.isEmpty()) {
                    nVar = new n(new Bundle());
                } else {
                    Bundle bundle2 = new Bundle(bundle);
                    Iterator<String> it = bundle2.keySet().iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (next == null) {
                            g3 g3Var = i4Var.w;
                            i4.n(g3Var);
                            g3Var.f5397t.a("Param name can't be null");
                        } else {
                            g7 g7Var = i4Var.z;
                            i4.l(g7Var);
                            Object o10 = g7Var.o(bundle2.get(next), next);
                            if (o10 == null) {
                                g3 g3Var2 = i4Var.w;
                                i4.n(g3Var2);
                                b3 b3Var = i4Var.A;
                                i4.l(b3Var);
                                g3Var2.w.b(b3Var.m(next), "Param value can't be null");
                            } else {
                                g7 g7Var2 = i4Var.z;
                                i4.l(g7Var2);
                                g7Var2.v(bundle2, next, o10);
                            }
                        }
                        it.remove();
                    }
                    nVar = new n(bundle2);
                }
                b7 b7Var = iVar.f5701p.u;
                z6.E(b7Var);
                w2 B = x2.B();
                if (B.f2636q) {
                    B.m();
                    B.f2636q = false;
                }
                x2.K(0, (x2) B.f2635p);
                for (String next2 : nVar.f5587o.keySet()) {
                    a3 D = b3.D();
                    D.q(next2);
                    Object obj = nVar.f5587o.get(next2);
                    m.h(obj);
                    b7Var.t(D, obj);
                    B.t(D);
                }
                byte[] a10 = ((x2) B.j()).a();
                g3 g3Var3 = i4Var.w;
                i4.n(g3Var3);
                b3 b3Var2 = i4Var.A;
                i4.l(b3Var2);
                g3Var3.B.c(b3Var2.l(str), Integer.valueOf(a10.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("parameters", a10);
                try {
                    if (iVar.y().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                        i4.n(g3Var3);
                        g3Var3.f5397t.b(g3.p(str), "Failed to insert default event parameters (got -1). appId");
                        return;
                    }
                    return;
                } catch (SQLiteException e10) {
                    i4.n(g3Var3);
                    g3Var3.f5397t.c(g3.p(str), e10, "Error storing default event parameters. appId");
                    return;
                }
            case 1:
                p4 p4Var = (p4) this.f5491q;
                p4Var.f5631a.j();
                p4Var.f5631a.O((p) this.f5492r, (String) this.f5490p);
                return;
            case 2:
                synchronized (((AtomicReference) this.f5491q)) {
                    try {
                        u3 u3Var = ((f6) this.f5492r).f5649o.f5458v;
                        i4.l(u3Var);
                        if (!u3Var.p().e()) {
                            g3 g3Var4 = ((f6) this.f5492r).f5649o.w;
                            i4.n(g3Var4);
                            g3Var4.f5400y.a("Analytics storage consent denied; will not get app instance id");
                            i5 i5Var = ((f6) this.f5492r).f5649o.D;
                            i4.m(i5Var);
                            i5Var.u.set((Object) null);
                            u3 u3Var2 = ((f6) this.f5492r).f5649o.f5458v;
                            i4.l(u3Var2);
                            u3Var2.u.b((String) null);
                            ((AtomicReference) this.f5491q).set((Object) null);
                            atomicReference = (AtomicReference) this.f5491q;
                            atomicReference.notify();
                        } else {
                            Object obj2 = this.f5492r;
                            x2 x2Var = ((f6) obj2).f5383r;
                            if (x2Var == null) {
                                g3 g3Var5 = ((f6) obj2).f5649o.w;
                                i4.n(g3Var5);
                                g3Var5.f5397t.a("Failed to get app instance id");
                                atomicReference = (AtomicReference) this.f5491q;
                                atomicReference.notify();
                            } else {
                                m.h((i7) this.f5490p);
                                ((AtomicReference) this.f5491q).set(x2Var.q((i7) this.f5490p));
                                String str2 = (String) ((AtomicReference) this.f5491q).get();
                                if (str2 != null) {
                                    i5 i5Var2 = ((f6) this.f5492r).f5649o.D;
                                    i4.m(i5Var2);
                                    i5Var2.u.set(str2);
                                    u3 u3Var3 = ((f6) this.f5492r).f5649o.f5458v;
                                    i4.l(u3Var3);
                                    u3Var3.u.b(str2);
                                }
                                ((f6) this.f5492r).p();
                                atomicReference = (AtomicReference) this.f5491q;
                                atomicReference.notify();
                            }
                        }
                    } catch (RemoteException e11) {
                        try {
                            g3 g3Var6 = ((f6) this.f5492r).f5649o.w;
                            i4.n(g3Var6);
                            g3Var6.f5397t.b(e11, "Failed to get app instance id");
                        } catch (Throwable th) {
                            ((AtomicReference) this.f5491q).notify();
                            throw th;
                        }
                    }
                }
                return;
            default:
                e eVar = (e) this.f5491q;
                Intent intent = (Intent) this.f5490p;
                j jVar = (j) this.f5492r;
                eVar.getClass();
                try {
                    eVar.c(intent);
                    return;
                } finally {
                    jVar.a(null);
                }
        }
    }

    public j4(f6 f6Var, AtomicReference atomicReference, i7 i7Var) {
        this.f5489o = 2;
        this.f5492r = f6Var;
        this.f5491q = atomicReference;
        this.f5490p = i7Var;
    }

    public /* synthetic */ j4(Object obj, Object obj2, Object obj3, int i10) {
        this.f5489o = i10;
        this.f5491q = obj;
        this.f5490p = obj2;
        this.f5492r = obj3;
    }
}
