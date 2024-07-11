package t3;

import java.util.HashMap;
import q3.a;
import q3.b;
import q3.c;
import q3.d;
import q3.e;
import q3.f;
import q3.h;
import t3.h;
import t3.j;

public final class v<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final s f8979a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8980b;

    /* renamed from: c  reason: collision with root package name */
    public final b f8981c;
    public final e<T, byte[]> d;

    /* renamed from: e  reason: collision with root package name */
    public final w f8982e;

    public v(s sVar, String str, b bVar, e<T, byte[]> eVar, w wVar) {
        this.f8979a = sVar;
        this.f8980b = str;
        this.f8981c = bVar;
        this.d = eVar;
        this.f8982e = wVar;
    }

    public final void a(a aVar, h hVar) {
        s sVar = this.f8979a;
        if (sVar != null) {
            String str = this.f8980b;
            if (str != null) {
                e<T, byte[]> eVar = this.d;
                if (eVar != null) {
                    b bVar = this.f8981c;
                    if (bVar != null) {
                        i iVar = new i(sVar, str, aVar, eVar, bVar);
                        x xVar = (x) this.f8982e;
                        xVar.getClass();
                        c<?> cVar = iVar.f8956c;
                        d c10 = cVar.c();
                        s sVar2 = iVar.f8954a;
                        sVar2.getClass();
                        j.a a10 = s.a();
                        a10.b(sVar2.b());
                        a10.c(c10);
                        a10.f8962b = sVar2.c();
                        j a11 = a10.a();
                        h.a aVar2 = new h.a();
                        aVar2.f8953f = new HashMap();
                        aVar2.d = Long.valueOf(xVar.f8984a.a());
                        aVar2.f8952e = Long.valueOf(xVar.f8985b.a());
                        aVar2.d(iVar.f8955b);
                        Object b10 = cVar.b();
                        aVar2.c(new m(iVar.f8957e, iVar.d.apply(b10)));
                        aVar2.f8950b = cVar.a();
                        xVar.f8986c.a(hVar, aVar2.b(), a11);
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }
}
