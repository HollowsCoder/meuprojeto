package m5;

import i4.o;
import java.util.concurrent.Executor;
import l4.w;

public final class m implements p {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f7101o;

    /* renamed from: p  reason: collision with root package name */
    public final Executor f7102p;

    /* renamed from: q  reason: collision with root package name */
    public final Object f7103q;

    /* renamed from: r  reason: collision with root package name */
    public Object f7104r;

    public m(Executor executor, a aVar, r rVar) {
        this.f7101o = 0;
        this.f7102p = executor;
        this.f7103q = aVar;
        this.f7104r = rVar;
    }

    public final void a(i iVar) {
        switch (this.f7101o) {
            case 0:
                this.f7102p.execute(new w(6, this, iVar));
                return;
            case 1:
                synchronized (this.f7103q) {
                    if (((d) this.f7104r) != null) {
                        this.f7102p.execute(new o((Object) this, (Object) iVar, 11));
                        return;
                    }
                    return;
                }
            default:
                if (!iVar.m() && !iVar.k()) {
                    synchronized (this.f7103q) {
                        if (((e) this.f7104r) != null) {
                            this.f7102p.execute(new w(7, this, iVar));
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    public final void d() {
        switch (this.f7101o) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                synchronized (this.f7103q) {
                    this.f7104r = null;
                }
                return;
            default:
                synchronized (this.f7103q) {
                    this.f7104r = null;
                }
                return;
        }
    }

    public m(Executor executor, d dVar) {
        this.f7101o = 1;
        this.f7103q = new Object();
        this.f7102p = executor;
        this.f7104r = dVar;
    }

    public m(Executor executor, e eVar) {
        this.f7101o = 2;
        this.f7103q = new Object();
        this.f7102p = executor;
        this.f7104r = eVar;
    }
}
