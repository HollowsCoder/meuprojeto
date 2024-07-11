package h5;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import n4.m;

public final class c6 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5312o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ String f5313p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ String f5314q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ i7 f5315r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ f6 f5316s;

    public c6(f6 f6Var, AtomicReference atomicReference, String str, String str2, i7 i7Var) {
        this.f5316s = f6Var;
        this.f5312o = atomicReference;
        this.f5313p = str;
        this.f5314q = str2;
        this.f5315r = i7Var;
    }

    public final void run() {
        List<b> list;
        AtomicReference atomicReference;
        synchronized (this.f5312o) {
            try {
                f6 f6Var = this.f5316s;
                x2 x2Var = f6Var.f5383r;
                if (x2Var == null) {
                    g3 g3Var = f6Var.f5649o.w;
                    i4.n(g3Var);
                    g3Var.f5397t.d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f5313p, this.f5314q);
                    this.f5312o.set(Collections.emptyList());
                    this.f5312o.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    m.h(this.f5315r);
                    atomicReference = this.f5312o;
                    list = x2Var.p(this.f5313p, this.f5314q, this.f5315r);
                } else {
                    atomicReference = this.f5312o;
                    list = x2Var.B((String) null, this.f5313p, this.f5314q);
                }
                atomicReference.set(list);
                this.f5316s.p();
                this.f5312o.notify();
            } catch (RemoteException e10) {
                try {
                    g3 g3Var2 = this.f5316s.f5649o.w;
                    i4.n(g3Var2);
                    g3Var2.f5397t.d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f5313p, e10);
                    this.f5312o.set(Collections.emptyList());
                } catch (Throwable th) {
                    this.f5312o.notify();
                    throw th;
                }
            }
        }
    }
}
