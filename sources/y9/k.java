package y9;

import g9.f;
import i9.d0;
import i9.e;
import q8.d;

public abstract class k<ResponseT, ReturnT> extends e0<ReturnT> {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f9699a;

    /* renamed from: b  reason: collision with root package name */
    public final e.a f9700b;

    /* renamed from: c  reason: collision with root package name */
    public final f<d0, ResponseT> f9701c;

    public static final class a<ResponseT, ReturnT> extends k<ResponseT, ReturnT> {
        public final c<ResponseT, ReturnT> d;

        public a(a0 a0Var, e.a aVar, f<d0, ResponseT> fVar, c<ResponseT, ReturnT> cVar) {
            super(a0Var, aVar, fVar);
            this.d = cVar;
        }

        public final Object c(t tVar, Object[] objArr) {
            return this.d.a(tVar);
        }
    }

    public static final class b<ResponseT> extends k<ResponseT, Object> {
        public final c<ResponseT, b<ResponseT>> d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f9702e = false;

        public b(a0 a0Var, e.a aVar, f fVar, c cVar) {
            super(a0Var, aVar, fVar);
            this.d = cVar;
        }

        public final Object c(t tVar, Object[] objArr) {
            b bVar = (b) this.d.a(tVar);
            d dVar = objArr[objArr.length - 1];
            try {
                if (this.f9702e) {
                    f fVar = new f(n.e.A(dVar));
                    fVar.n(new n(bVar));
                    bVar.o(new p(fVar));
                    Object m10 = fVar.m();
                    r8.a aVar = r8.a.COROUTINE_SUSPENDED;
                    return m10;
                }
                f fVar2 = new f(n.e.A(dVar));
                fVar2.n(new m(bVar));
                bVar.o(new o(fVar2));
                Object m11 = fVar2.m();
                r8.a aVar2 = r8.a.COROUTINE_SUSPENDED;
                return m11;
            } catch (Exception e10) {
                return s.a(e10, dVar);
            }
        }
    }

    public static final class c<ResponseT> extends k<ResponseT, Object> {
        public final c<ResponseT, b<ResponseT>> d;

        public c(a0 a0Var, e.a aVar, f<d0, ResponseT> fVar, c<ResponseT, b<ResponseT>> cVar) {
            super(a0Var, aVar, fVar);
            this.d = cVar;
        }

        public final Object c(t tVar, Object[] objArr) {
            b bVar = (b) this.d.a(tVar);
            d dVar = objArr[objArr.length - 1];
            try {
                f fVar = new f(n.e.A(dVar));
                fVar.n(new q(bVar));
                bVar.o(new r(fVar));
                Object m10 = fVar.m();
                r8.a aVar = r8.a.COROUTINE_SUSPENDED;
                return m10;
            } catch (Exception e10) {
                return s.a(e10, dVar);
            }
        }
    }

    public k(a0 a0Var, e.a aVar, f<d0, ResponseT> fVar) {
        this.f9699a = a0Var;
        this.f9700b = aVar;
        this.f9701c = fVar;
    }

    public final ReturnT a(Object[] objArr) {
        return c(new t(this.f9699a, objArr, this.f9700b, this.f9701c), objArr);
    }

    public abstract Object c(t tVar, Object[] objArr);
}
