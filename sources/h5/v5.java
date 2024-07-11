package h5;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.q0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import n4.m;

public final class v5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5783o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ String f5784p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ String f5785q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ i7 f5786r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ boolean f5787s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ f6 f5788t;
    public final /* synthetic */ Object u;

    public v5(f6 f6Var, String str, String str2, i7 i7Var, boolean z, q0 q0Var) {
        this.f5788t = f6Var;
        this.f5784p = str;
        this.f5785q = str2;
        this.f5786r = i7Var;
        this.f5787s = z;
        this.u = q0Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        List<c7> list;
        AtomicReference atomicReference2;
        switch (this.f5783o) {
            case 0:
                i7 i7Var = this.f5786r;
                String str = this.f5784p;
                Object obj = this.u;
                f6 f6Var = this.f5788t;
                Bundle bundle = new Bundle();
                try {
                    x2 x2Var = f6Var.f5383r;
                    String str2 = this.f5785q;
                    if (x2Var == null) {
                        g3 g3Var = f6Var.f5649o.w;
                        i4.n(g3Var);
                        g3Var.f5397t.c(str, str2, "Failed to get user properties; not connected to service");
                        g7 g7Var = f6Var.f5649o.z;
                        i4.l(g7Var);
                        g7Var.N((q0) obj, bundle);
                        return;
                    }
                    m.h(i7Var);
                    List<c7> g10 = x2Var.g(str, str2, this.f5787s, i7Var);
                    Bundle bundle2 = new Bundle();
                    if (g10 != null) {
                        for (c7 next : g10) {
                            String str3 = next.f5321s;
                            String str4 = next.f5318p;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l = next.f5320r;
                                if (l != null) {
                                    bundle2.putLong(str4, l.longValue());
                                } else {
                                    Double d = next.u;
                                    if (d != null) {
                                        bundle2.putDouble(str4, d.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        f6Var.p();
                        g7 g7Var2 = f6Var.f5649o.z;
                        i4.l(g7Var2);
                        g7Var2.N((q0) obj, bundle2);
                        return;
                    } catch (RemoteException e10) {
                        e = e10;
                        bundle = bundle2;
                        try {
                            g3 g3Var2 = f6Var.f5649o.w;
                            i4.n(g3Var2);
                            g3Var2.f5397t.c(str, e, "Failed to get user properties; remote exception");
                            g7 g7Var3 = f6Var.f5649o.z;
                            i4.l(g7Var3);
                            g7Var3.N((q0) obj, bundle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bundle2 = bundle;
                            g7 g7Var4 = f6Var.f5649o.z;
                            i4.l(g7Var4);
                            g7Var4.N((q0) obj, bundle2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        g7 g7Var42 = f6Var.f5649o.z;
                        i4.l(g7Var42);
                        g7Var42.N((q0) obj, bundle2);
                        throw th;
                    }
                } catch (RemoteException e11) {
                    e = e11;
                    g3 g3Var22 = f6Var.f5649o.w;
                    i4.n(g3Var22);
                    g3Var22.f5397t.c(str, e, "Failed to get user properties; remote exception");
                    g7 g7Var32 = f6Var.f5649o.z;
                    i4.l(g7Var32);
                    g7Var32.N((q0) obj, bundle);
                    return;
                }
            default:
                synchronized (((AtomicReference) this.u)) {
                    try {
                        f6 f6Var2 = this.f5788t;
                        x2 x2Var2 = f6Var2.f5383r;
                        if (x2Var2 == null) {
                            g3 g3Var3 = f6Var2.f5649o.w;
                            i4.n(g3Var3);
                            g3Var3.f5397t.d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f5784p, this.f5785q);
                            ((AtomicReference) this.u).set(Collections.emptyList());
                            atomicReference = (AtomicReference) this.u;
                            atomicReference.notify();
                        } else {
                            if (TextUtils.isEmpty((CharSequence) null)) {
                                m.h(this.f5786r);
                                atomicReference2 = (AtomicReference) this.u;
                                list = x2Var2.g(this.f5784p, this.f5785q, this.f5787s, this.f5786r);
                            } else {
                                atomicReference2 = (AtomicReference) this.u;
                                list = x2Var2.G((String) null, this.f5784p, this.f5785q, this.f5787s);
                            }
                            atomicReference2.set(list);
                            this.f5788t.p();
                            atomicReference = (AtomicReference) this.u;
                            atomicReference.notify();
                        }
                    } catch (RemoteException e12) {
                        try {
                            g3 g3Var4 = this.f5788t.f5649o.w;
                            i4.n(g3Var4);
                            g3Var4.f5397t.d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f5784p, e12);
                            ((AtomicReference) this.u).set(Collections.emptyList());
                        } catch (Throwable th3) {
                            ((AtomicReference) this.u).notify();
                            throw th3;
                        }
                    }
                }
                return;
        }
    }

    public v5(f6 f6Var, AtomicReference atomicReference, String str, String str2, i7 i7Var, boolean z) {
        this.f5788t = f6Var;
        this.u = atomicReference;
        this.f5784p = str;
        this.f5785q = str2;
        this.f5786r = i7Var;
        this.f5787s = z;
    }
}
