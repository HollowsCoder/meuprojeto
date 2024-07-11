package s2;

import i3.g;
import i3.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import n3.a;
import n3.d;
import q2.f;
import s2.j;
import s2.q;

public final class n<R> implements j.b<R>, a.d {
    public static final c N = new c();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public w<?> E;
    public q2.a F;
    public boolean G;
    public r H;
    public boolean I;
    public q<?> J;
    public j<R> K;
    public volatile boolean L;
    public boolean M;

    /* renamed from: o  reason: collision with root package name */
    public final e f8647o;

    /* renamed from: p  reason: collision with root package name */
    public final d.a f8648p;

    /* renamed from: q  reason: collision with root package name */
    public final q.a f8649q;

    /* renamed from: r  reason: collision with root package name */
    public final h0.c<n<?>> f8650r;

    /* renamed from: s  reason: collision with root package name */
    public final c f8651s;

    /* renamed from: t  reason: collision with root package name */
    public final o f8652t;
    public final v2.a u;

    /* renamed from: v  reason: collision with root package name */
    public final v2.a f8653v;
    public final v2.a w;

    /* renamed from: x  reason: collision with root package name */
    public final v2.a f8654x;

    /* renamed from: y  reason: collision with root package name */
    public final AtomicInteger f8655y;
    public f z;

    public class a implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final g f8656o;

        public a(g gVar) {
            this.f8656o = gVar;
        }

        public final void run() {
            h hVar = (h) this.f8656o;
            hVar.f6039b.a();
            synchronized (hVar.f6040c) {
                synchronized (n.this) {
                    e eVar = n.this.f8647o;
                    g gVar = this.f8656o;
                    eVar.getClass();
                    if (eVar.f8662o.contains(new d(gVar, m3.e.f7072b))) {
                        n nVar = n.this;
                        g gVar2 = this.f8656o;
                        nVar.getClass();
                        try {
                            ((h) gVar2).m(nVar.H, 5);
                        } catch (Throwable th) {
                            throw new d(th);
                        }
                    }
                    n.this.c();
                }
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final g f8658o;

        public b(g gVar) {
            this.f8658o = gVar;
        }

        public final void run() {
            h hVar = (h) this.f8658o;
            hVar.f6039b.a();
            synchronized (hVar.f6040c) {
                synchronized (n.this) {
                    e eVar = n.this.f8647o;
                    g gVar = this.f8658o;
                    eVar.getClass();
                    if (eVar.f8662o.contains(new d(gVar, m3.e.f7072b))) {
                        n.this.J.a();
                        n nVar = n.this;
                        g gVar2 = this.f8658o;
                        nVar.getClass();
                        try {
                            ((h) gVar2).o(nVar.J, nVar.F, nVar.M);
                            n.this.g(this.f8658o);
                        } catch (Throwable th) {
                            throw new d(th);
                        }
                    }
                    n.this.c();
                }
            }
        }
    }

    public static class c {
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final g f8660a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f8661b;

        public d(g gVar, Executor executor) {
            this.f8660a = gVar;
            this.f8661b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f8660a.equals(((d) obj).f8660a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f8660a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {

        /* renamed from: o  reason: collision with root package name */
        public final List<d> f8662o;

        public e(ArrayList arrayList) {
            this.f8662o = arrayList;
        }

        public final Iterator<d> iterator() {
            return this.f8662o.iterator();
        }
    }

    public n() {
        throw null;
    }

    public n(v2.a aVar, v2.a aVar2, v2.a aVar3, v2.a aVar4, o oVar, q.a aVar5, a.c cVar) {
        c cVar2 = N;
        this.f8647o = new e(new ArrayList(2));
        this.f8648p = new d.a();
        this.f8655y = new AtomicInteger();
        this.u = aVar;
        this.f8653v = aVar2;
        this.w = aVar3;
        this.f8654x = aVar4;
        this.f8652t = oVar;
        this.f8649q = aVar5;
        this.f8650r = cVar;
        this.f8651s = cVar2;
    }

    public final synchronized void a(g gVar, Executor executor) {
        Runnable runnable;
        this.f8648p.a();
        e eVar = this.f8647o;
        eVar.getClass();
        eVar.f8662o.add(new d(gVar, executor));
        boolean z10 = true;
        if (this.G) {
            d(1);
            runnable = new b(gVar);
        } else if (this.I) {
            d(1);
            runnable = new a(gVar);
        } else {
            if (this.L) {
                z10 = false;
            }
            s6.a.l("Cannot add callbacks to a cancelled EngineJob", z10);
        }
        executor.execute(runnable);
    }

    public final void b() {
        Object obj;
        if (!e()) {
            this.L = true;
            j<R> jVar = this.K;
            jVar.S = true;
            h hVar = jVar.Q;
            if (hVar != null) {
                hVar.cancel();
            }
            o oVar = this.f8652t;
            f fVar = this.z;
            m mVar = (m) oVar;
            synchronized (mVar) {
                t tVar = mVar.f8625a;
                tVar.getClass();
                if (this.D) {
                    obj = tVar.f8686p;
                } else {
                    obj = tVar.f8685o;
                }
                Map map = (Map) obj;
                if (equals(map.get(fVar))) {
                    map.remove(fVar);
                }
            }
        }
    }

    public final void c() {
        q<?> qVar;
        synchronized (this) {
            this.f8648p.a();
            s6.a.l("Not yet complete!", e());
            int decrementAndGet = this.f8655y.decrementAndGet();
            s6.a.l("Can't decrement below 0", decrementAndGet >= 0);
            if (decrementAndGet == 0) {
                qVar = this.J;
                f();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.e();
        }
    }

    public final synchronized void d(int i10) {
        q<?> qVar;
        s6.a.l("Not yet complete!", e());
        if (this.f8655y.getAndAdd(i10) == 0 && (qVar = this.J) != null) {
            qVar.a();
        }
    }

    public final boolean e() {
        return this.I || this.G || this.L;
    }

    public final synchronized void f() {
        boolean a10;
        if (this.z != null) {
            this.f8647o.f8662o.clear();
            this.z = null;
            this.J = null;
            this.E = null;
            this.I = false;
            this.L = false;
            this.G = false;
            this.M = false;
            j<R> jVar = this.K;
            j.f fVar = jVar.u;
            synchronized (fVar) {
                fVar.f8614a = true;
                a10 = fVar.a();
            }
            if (a10) {
                jVar.u();
            }
            this.K = null;
            this.H = null;
            this.F = null;
            this.f8650r.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void g(g gVar) {
        boolean z10;
        this.f8648p.a();
        e eVar = this.f8647o;
        eVar.f8662o.remove(new d(gVar, m3.e.f7072b));
        if (this.f8647o.f8662o.isEmpty()) {
            b();
            if (!this.G) {
                if (!this.I) {
                    z10 = false;
                    if (z10 && this.f8655y.get() == 0) {
                        f();
                    }
                }
            }
            z10 = true;
            f();
        }
    }

    public final d.a k() {
        return this.f8648p;
    }
}
