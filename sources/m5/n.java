package m5;

import java.util.concurrent.Executor;
import l4.w;

public final class n implements c, e, f, p {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f7105o;

    /* renamed from: p  reason: collision with root package name */
    public final Executor f7106p;

    /* renamed from: q  reason: collision with root package name */
    public final Object f7107q;

    /* renamed from: r  reason: collision with root package name */
    public Object f7108r;

    public /* synthetic */ n(Executor executor, Object obj, r rVar, int i10) {
        this.f7105o = i10;
        this.f7106p = executor;
        this.f7107q = obj;
        this.f7108r = rVar;
    }

    public final void a(i iVar) {
        switch (this.f7105o) {
            case 0:
                this.f7106p.execute(new i4.n(4, this, iVar));
                return;
            case 1:
                if (iVar.m()) {
                    synchronized (this.f7107q) {
                        if (((f) this.f7108r) != null) {
                            this.f7106p.execute(new w(8, this, iVar));
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                this.f7106p.execute(new i4.n(5, this, iVar));
                return;
        }
    }

    public final void b() {
        switch (this.f7105o) {
            case 0:
                ((r) this.f7108r).q();
                return;
            default:
                ((r) this.f7108r).q();
                return;
        }
    }

    public final void c(Object obj) {
        switch (this.f7105o) {
            case 0:
                ((r) this.f7108r).s(obj);
                return;
            default:
                ((r) this.f7108r).s(obj);
                return;
        }
    }

    public final void d() {
        switch (this.f7105o) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                synchronized (this.f7107q) {
                    this.f7108r = null;
                }
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void e(Exception exc) {
        switch (this.f7105o) {
            case 0:
                ((r) this.f7108r).r(exc);
                return;
            default:
                ((r) this.f7108r).r(exc);
                return;
        }
    }

    public n(Executor executor, f fVar) {
        this.f7105o = 1;
        this.f7107q = new Object();
        this.f7106p = executor;
        this.f7108r = fVar;
    }
}
