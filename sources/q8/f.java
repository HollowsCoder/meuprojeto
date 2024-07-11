package q8;

import q8.e;
import y8.p;
import z8.g;
import z8.h;

public interface f {

    public static final class a {

        /* renamed from: q8.f$a$a  reason: collision with other inner class name */
        public static final class C0117a extends h implements p<f, b, f> {

            /* renamed from: p  reason: collision with root package name */
            public static final C0117a f8274p = new C0117a();

            public C0117a() {
                super(2);
            }

            public final Object i(Object obj, Object obj2) {
                c cVar;
                f fVar = (f) obj;
                b bVar = (b) obj2;
                g.f(fVar, "acc");
                g.f(bVar, "element");
                f minusKey = fVar.minusKey(bVar.getKey());
                g gVar = g.f8275o;
                if (minusKey == gVar) {
                    return bVar;
                }
                int i10 = e.f8272n;
                e.a aVar = e.a.f8273o;
                e eVar = (e) minusKey.get(aVar);
                if (eVar == null) {
                    cVar = new c(bVar, minusKey);
                } else {
                    f minusKey2 = minusKey.minusKey(aVar);
                    if (minusKey2 == gVar) {
                        return new c(eVar, bVar);
                    }
                    cVar = new c(eVar, new c(bVar, minusKey2));
                }
                return cVar;
            }
        }

        public static f a(f fVar, f fVar2) {
            g.f(fVar2, "context");
            return fVar2 == g.f8275o ? fVar : (f) fVar2.fold(fVar, C0117a.f8274p);
        }
    }

    public interface b extends f {

        public static final class a {
            public static <E extends b> E a(b bVar, c<E> cVar) {
                g.f(cVar, "key");
                if (g.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static f b(b bVar, c<?> cVar) {
                g.f(cVar, "key");
                return g.a(bVar.getKey(), cVar) ? g.f8275o : bVar;
            }
        }

        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    <R> R fold(R r5, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    f minusKey(c<?> cVar);

    f plus(f fVar);
}
