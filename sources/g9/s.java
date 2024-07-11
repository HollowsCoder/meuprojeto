package g9;

import kotlinx.coroutines.internal.c;
import q8.b;
import q8.d;
import q8.e;
import q8.f;
import y8.l;
import z8.g;
import z8.h;

public abstract class s extends q8.a implements e {

    /* renamed from: o  reason: collision with root package name */
    public static final a f5047o = new a();

    public static final class a extends b<e, s> {

        /* renamed from: g9.s$a$a  reason: collision with other inner class name */
        public static final class C0072a extends h implements l<f.b, s> {

            /* renamed from: p  reason: collision with root package name */
            public static final C0072a f5048p = new C0072a();

            public C0072a() {
                super(1);
            }

            public final Object k(Object obj) {
                f.b bVar = (f.b) obj;
                if (bVar instanceof s) {
                    return (s) bVar;
                }
                return null;
            }
        }

        public a() {
            super(e.a.f8273o, C0072a.f5048p);
        }
    }

    public s() {
        super(e.a.f8273o);
    }

    public abstract void b(f fVar, Runnable runnable);

    public final c c(s8.c cVar) {
        return new c(this, cVar);
    }

    public final void d(d<?> dVar) {
        ((c) dVar).l();
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        boolean z;
        g.f(cVar, "key");
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            f.c<?> key = getKey();
            g.f(key, "key");
            if (key == bVar || bVar.f8268p == key) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                E a10 = bVar.a(this);
                if (a10 instanceof f.b) {
                    return a10;
                }
            }
        } else if (e.a.f8273o == cVar) {
            return this;
        }
        return null;
    }

    public final f minusKey(f.c<?> cVar) {
        boolean z;
        g.f(cVar, "key");
        boolean z10 = cVar instanceof b;
        q8.g gVar = q8.g.f8275o;
        if (z10) {
            b bVar = (b) cVar;
            f.c<?> key = getKey();
            g.f(key, "key");
            if (key == bVar || bVar.f8268p == key) {
                z = true;
            } else {
                z = false;
            }
            if (z && bVar.a(this) != null) {
                return gVar;
            }
        } else if (e.a.f8273o == cVar) {
            return gVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + n.e.x(this);
    }

    public boolean x() {
        return !(this instanceof b1);
    }
}
