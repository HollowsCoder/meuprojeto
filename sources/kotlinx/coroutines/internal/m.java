package kotlinx.coroutines.internal;

import d7.j0;
import g9.z0;
import q8.f;
import y8.p;
import z8.g;
import z8.h;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f6795a = new j0("NO_THREAD_ELEMENTS");

    public static final class a extends h implements p<Object, f.b, Object> {

        /* renamed from: p  reason: collision with root package name */
        public static final a f6796p = new a();

        public a() {
            super(2);
        }

        public final Object i(Object obj, Object obj2) {
            Integer num;
            int i10;
            f.b bVar = (f.b) obj2;
            if (!(bVar instanceof z0)) {
                return obj;
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num == null) {
                i10 = 1;
            } else {
                i10 = num.intValue();
            }
            if (i10 == 0) {
                return bVar;
            }
            return Integer.valueOf(i10 + 1);
        }
    }

    public static final class b extends h implements p<z0<?>, f.b, z0<?>> {

        /* renamed from: p  reason: collision with root package name */
        public static final b f6797p = new b();

        public b() {
            super(2);
        }

        public final Object i(Object obj, Object obj2) {
            z0 z0Var = (z0) obj;
            f.b bVar = (f.b) obj2;
            if (z0Var != null) {
                return z0Var;
            }
            if (bVar instanceof z0) {
                return (z0) bVar;
            }
            return null;
        }
    }

    public static final class c extends h implements p<p, f.b, p> {

        /* renamed from: p  reason: collision with root package name */
        public static final c f6798p = new c();

        public c() {
            super(2);
        }

        public final Object i(Object obj, Object obj2) {
            p pVar = (p) obj;
            f.b bVar = (f.b) obj2;
            if (bVar instanceof z0) {
                z0<Object> z0Var = (z0) bVar;
                String t10 = z0Var.t(pVar.f6800a);
                int i10 = pVar.d;
                pVar.f6801b[i10] = t10;
                pVar.d = i10 + 1;
                pVar.f6802c[i10] = z0Var;
            }
            return pVar;
        }
    }

    public static final void a(f fVar, Object obj) {
        if (obj != f6795a) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                z0<Object>[] z0VarArr = pVar.f6802c;
                int length = z0VarArr.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i10 = length - 1;
                        z0<Object> z0Var = z0VarArr[length];
                        g.c(z0Var);
                        z0Var.l(pVar.f6801b[length]);
                        if (i10 >= 0) {
                            length = i10;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object fold = fVar.fold(null, b.f6797p);
                if (fold != null) {
                    ((z0) fold).l(obj);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
        }
    }

    public static final Object b(f fVar) {
        Object fold = fVar.fold(0, a.f6796p);
        g.c(fold);
        return fold;
    }

    public static final Object c(f fVar, Object obj) {
        if (obj == null) {
            obj = b(fVar);
        }
        return obj == 0 ? f6795a : obj instanceof Integer ? fVar.fold(new p(fVar, ((Number) obj).intValue()), c.f6798p) : ((z0) obj).t(fVar);
    }
}
