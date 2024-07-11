package h5;

import java.util.concurrent.atomic.AtomicReference;

public final class a5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5270o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5271p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ i5 f5272q;

    public /* synthetic */ a5(i5 i5Var, AtomicReference atomicReference, int i10) {
        this.f5270o = i10;
        this.f5272q = i5Var;
        this.f5271p = atomicReference;
    }

    public final void run() {
        switch (this.f5270o) {
            case 0:
                synchronized (this.f5271p) {
                    try {
                        AtomicReference atomicReference = this.f5271p;
                        i4 i4Var = this.f5272q.f5649o;
                        atomicReference.set(Boolean.valueOf(i4Var.u.m(i4Var.b().l(), u2.J)));
                        this.f5271p.notify();
                    } catch (Throwable th) {
                        this.f5271p.notify();
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.f5271p) {
                    try {
                        AtomicReference atomicReference2 = this.f5271p;
                        i4 i4Var2 = this.f5272q.f5649o;
                        atomicReference2.set(Integer.valueOf(i4Var2.u.l(i4Var2.b().l(), u2.M)));
                        this.f5271p.notify();
                    } catch (Throwable th2) {
                        this.f5271p.notify();
                        throw th2;
                    }
                }
                return;
        }
    }
}
