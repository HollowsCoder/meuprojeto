package s2;

import n3.a;
import n3.d;

public final class v<Z> implements w<Z>, a.d {

    /* renamed from: s  reason: collision with root package name */
    public static final a.c f8690s = n3.a.a(20, new a());

    /* renamed from: o  reason: collision with root package name */
    public final d.a f8691o = new d.a();

    /* renamed from: p  reason: collision with root package name */
    public w<Z> f8692p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8693q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f8694r;

    public class a implements a.b<v<?>> {
        public final Object a() {
            return new v();
        }
    }

    public final synchronized void a() {
        this.f8691o.a();
        if (this.f8693q) {
            this.f8693q = false;
            if (this.f8694r) {
                d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public final int b() {
        return this.f8692p.b();
    }

    public final Class<Z> c() {
        return this.f8692p.c();
    }

    public final synchronized void d() {
        this.f8691o.a();
        this.f8694r = true;
        if (!this.f8693q) {
            this.f8692p.d();
            this.f8692p = null;
            f8690s.a(this);
        }
    }

    public final Z get() {
        return this.f8692p.get();
    }

    public final d.a k() {
        return this.f8691o;
    }
}
