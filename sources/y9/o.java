package y9;

import g9.e;
import g9.f;
import i9.x;
import java.lang.reflect.Method;
import n8.b;
import n8.e;
import z8.g;

public final class o implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f9707a;

    public o(f fVar) {
        this.f9707a = fVar;
    }

    public final void a(b<Object> bVar, Throwable th) {
        g.g(bVar, "call");
        g.g(th, "t");
        this.f9707a.h(n.e.s(th));
    }

    public final void b(b<Object> bVar, b0<Object> b0Var) {
        e.a aVar;
        g.g(bVar, "call");
        g.g(b0Var, "response");
        boolean c10 = b0Var.f9660a.c();
        g9.e eVar = this.f9707a;
        if (c10) {
            T t10 = b0Var.f9661b;
            if (t10 == null) {
                x a10 = bVar.a();
                a10.getClass();
                Class<l> cls = l.class;
                l cast = cls.cast(a10.f6369f.get(cls));
                if (cast != null) {
                    StringBuilder sb = new StringBuilder("Response from ");
                    Method method = cast.f9703a;
                    g.b(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    g.b(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(method.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    aVar = n.e.s(new b(sb.toString()));
                } else {
                    b bVar2 = new b();
                    g.j(g.class.getName(), bVar2);
                    throw bVar2;
                }
            } else {
                eVar.h(t10);
                return;
            }
        } else {
            aVar = n.e.s(new j(b0Var));
        }
        eVar.h(aVar);
    }
}
