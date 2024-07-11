package m9;

import c1.r;
import i9.e;
import i9.f0;
import i9.n;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import o8.k;
import z8.g;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Proxy> f7274a;

    /* renamed from: b  reason: collision with root package name */
    public int f7275b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends InetSocketAddress> f7276c;
    public final ArrayList d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final i9.a f7277e;

    /* renamed from: f  reason: collision with root package name */
    public final r f7278f;

    /* renamed from: g  reason: collision with root package name */
    public final e f7279g;

    /* renamed from: h  reason: collision with root package name */
    public final n f7280h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f7281a;

        /* renamed from: b  reason: collision with root package name */
        public final List<f0> f7282b;

        public a(ArrayList arrayList) {
            this.f7282b = arrayList;
        }

        public final boolean a() {
            return this.f7281a < this.f7282b.size();
        }
    }

    public l(i9.a aVar, r rVar, e eVar, n nVar) {
        g.f(aVar, "address");
        g.f(rVar, "routeDatabase");
        g.f(eVar, "call");
        g.f(nVar, "eventListener");
        this.f7277e = aVar;
        this.f7278f = rVar;
        this.f7279g = eVar;
        this.f7280h = nVar;
        k kVar = k.f7764o;
        this.f7274a = kVar;
        this.f7276c = kVar;
        Proxy proxy = aVar.f6160j;
        i9.r rVar2 = aVar.f6152a;
        m mVar = new m(this, proxy, rVar2);
        g.f(rVar2, "url");
        this.f7274a = mVar.n();
        this.f7275b = 0;
    }

    public final boolean a() {
        boolean z;
        if (this.f7275b < this.f7274a.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z || (!this.d.isEmpty())) {
            return true;
        }
        return false;
    }
}
