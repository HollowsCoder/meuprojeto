package t3;

import android.content.Context;
import c4.a;
import java.util.Collections;
import java.util.Set;
import q3.b;
import t3.j;
import y3.d;
import z3.m;
import z3.o;

public final class x implements w {

    /* renamed from: e  reason: collision with root package name */
    public static volatile k f8983e;

    /* renamed from: a  reason: collision with root package name */
    public final a f8984a;

    /* renamed from: b  reason: collision with root package name */
    public final a f8985b;

    /* renamed from: c  reason: collision with root package name */
    public final d f8986c;
    public final m d;

    public x(a aVar, a aVar2, d dVar, m mVar, o oVar) {
        this.f8984a = aVar;
        this.f8985b = aVar2;
        this.f8986c = dVar;
        this.d = mVar;
        oVar.getClass();
        oVar.f9922a.execute(new a2.d(2, oVar));
    }

    public static x a() {
        k kVar = f8983e;
        if (kVar != null) {
            return kVar.f8968s.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f8983e == null) {
            synchronized (x.class) {
                if (f8983e == null) {
                    context.getClass();
                    f8983e = new k(context);
                }
            }
        }
    }

    public final t c(r3.a aVar) {
        Set<T> set;
        if (aVar instanceof l) {
            aVar.getClass();
            set = Collections.unmodifiableSet(r3.a.d);
        } else {
            set = Collections.singleton(new b("proto"));
        }
        j.a a10 = s.a();
        aVar.getClass();
        a10.b("cct");
        a10.f8962b = aVar.b();
        return new t(set, a10.a(), this);
    }
}
