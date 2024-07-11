package s2;

import q2.f;

public final class q<Z> implements w<Z> {

    /* renamed from: o  reason: collision with root package name */
    public final boolean f8671o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f8672p;

    /* renamed from: q  reason: collision with root package name */
    public final w<Z> f8673q;

    /* renamed from: r  reason: collision with root package name */
    public final a f8674r;

    /* renamed from: s  reason: collision with root package name */
    public final f f8675s;

    /* renamed from: t  reason: collision with root package name */
    public int f8676t;
    public boolean u;

    public interface a {
        void a(f fVar, q<?> qVar);
    }

    public q(w<Z> wVar, boolean z, boolean z10, f fVar, a aVar) {
        s6.a.n(wVar);
        this.f8673q = wVar;
        this.f8671o = z;
        this.f8672p = z10;
        this.f8675s = fVar;
        s6.a.n(aVar);
        this.f8674r = aVar;
    }

    public final synchronized void a() {
        if (!this.u) {
            this.f8676t++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public final int b() {
        return this.f8673q.b();
    }

    public final Class<Z> c() {
        return this.f8673q.c();
    }

    public final synchronized void d() {
        if (this.f8676t > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.u) {
            this.u = true;
            if (this.f8672p) {
                this.f8673q.d();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public final void e() {
        boolean z;
        synchronized (this) {
            int i10 = this.f8676t;
            if (i10 > 0) {
                z = true;
                int i11 = i10 - 1;
                this.f8676t = i11;
                if (i11 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f8674r.a(this.f8675s, this);
        }
    }

    public final Z get() {
        return this.f8673q.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f8671o + ", listener=" + this.f8674r + ", key=" + this.f8675s + ", acquired=" + this.f8676t + ", isRecycled=" + this.u + ", resource=" + this.f8673q + '}';
    }
}
