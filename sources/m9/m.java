package m9;

import i9.r;
import j9.c;
import java.net.Proxy;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import p9.u;
import y8.a;
import z8.h;

public final class m extends h implements a<List<? extends Proxy>> {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ l f7283p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Proxy f7284q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ r f7285r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(l lVar, Proxy proxy, r rVar) {
        super(0);
        this.f7283p = lVar;
        this.f7284q = proxy;
        this.f7285r = rVar;
    }

    /* renamed from: a */
    public final List<Proxy> n() {
        boolean z;
        Proxy proxy = this.f7284q;
        if (proxy != null) {
            return u.l(proxy);
        }
        URI g10 = this.f7285r.g();
        if (g10.getHost() == null) {
            return c.k(Proxy.NO_PROXY);
        }
        List<Proxy> select = this.f7283p.f7277e.f6161k.select(g10);
        Collection collection = select;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return c.v(select);
        }
        return c.k(Proxy.NO_PROXY);
    }
}
