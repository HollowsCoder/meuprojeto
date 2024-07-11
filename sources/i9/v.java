package i9;

import c1.r;
import i9.e;
import i9.n;
import j9.c;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import r9.h;
import z8.g;

public final class v implements Cloneable, e.a {
    public static final List<w> O = c.k(w.HTTP_2, w.HTTP_1_1);
    public static final List<i> P = c.k(i.f6261e, i.f6262f);
    public final ProxySelector A;
    public final b B;
    public final SocketFactory C;
    public final SSLSocketFactory D;
    public final X509TrustManager E;
    public final List<i> F;
    public final List<w> G;
    public final HostnameVerifier H;
    public final g I;
    public final androidx.activity.result.c J;
    public final int K;
    public final int L;
    public final int M;
    public final r N;

    /* renamed from: o  reason: collision with root package name */
    public final l f6338o;

    /* renamed from: p  reason: collision with root package name */
    public final r f6339p;

    /* renamed from: q  reason: collision with root package name */
    public final List<s> f6340q;

    /* renamed from: r  reason: collision with root package name */
    public final List<s> f6341r;

    /* renamed from: s  reason: collision with root package name */
    public final n.b f6342s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f6343t;
    public final b u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f6344v;
    public final boolean w;

    /* renamed from: x  reason: collision with root package name */
    public final k f6345x;

    /* renamed from: y  reason: collision with root package name */
    public final c f6346y;
    public final m z;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final l f6347a = new l();

        /* renamed from: b  reason: collision with root package name */
        public final r f6348b = new r(10);

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f6349c = new ArrayList();
        public final ArrayList d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final j9.a f6350e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f6351f;

        /* renamed from: g  reason: collision with root package name */
        public final androidx.databinding.a f6352g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f6353h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f6354i;

        /* renamed from: j  reason: collision with root package name */
        public final s6.a f6355j;

        /* renamed from: k  reason: collision with root package name */
        public c f6356k;
        public final s6.a l;

        /* renamed from: m  reason: collision with root package name */
        public final androidx.databinding.a f6357m;

        /* renamed from: n  reason: collision with root package name */
        public final SocketFactory f6358n;

        /* renamed from: o  reason: collision with root package name */
        public final List<i> f6359o;

        /* renamed from: p  reason: collision with root package name */
        public final List<? extends w> f6360p;

        /* renamed from: q  reason: collision with root package name */
        public final u9.c f6361q;

        /* renamed from: r  reason: collision with root package name */
        public final g f6362r;

        /* renamed from: s  reason: collision with root package name */
        public int f6363s;

        /* renamed from: t  reason: collision with root package name */
        public int f6364t;
        public final int u;

        public a() {
            n.a aVar = n.f6286a;
            byte[] bArr = c.f6602a;
            g.f(aVar, "$this$asFactory");
            this.f6350e = new j9.a(aVar);
            this.f6351f = true;
            androidx.databinding.a aVar2 = b.f6165i;
            this.f6352g = aVar2;
            this.f6353h = true;
            this.f6354i = true;
            this.f6355j = k.f6281j;
            this.l = m.f6285k;
            this.f6357m = aVar2;
            SocketFactory socketFactory = SocketFactory.getDefault();
            g.e(socketFactory, "SocketFactory.getDefault()");
            this.f6358n = socketFactory;
            this.f6359o = v.P;
            this.f6360p = v.O;
            this.f6361q = u9.c.f9113a;
            this.f6362r = g.f6240c;
            this.f6363s = 10000;
            this.f6364t = 10000;
            this.u = 10000;
        }
    }

    public v() {
        this(new a());
    }

    public v(a aVar) {
        boolean z10;
        g gVar;
        boolean z11;
        this.f6338o = aVar.f6347a;
        this.f6339p = aVar.f6348b;
        this.f6340q = c.v(aVar.f6349c);
        this.f6341r = c.v(aVar.d);
        this.f6342s = aVar.f6350e;
        this.f6343t = aVar.f6351f;
        this.u = aVar.f6352g;
        this.f6344v = aVar.f6353h;
        this.w = aVar.f6354i;
        this.f6345x = aVar.f6355j;
        this.f6346y = aVar.f6356k;
        this.z = aVar.l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.A = proxySelector == null ? t9.a.f9034a : proxySelector;
        this.B = aVar.f6357m;
        this.C = aVar.f6358n;
        List<i> list = aVar.f6359o;
        this.F = list;
        this.G = aVar.f6360p;
        this.H = aVar.f6361q;
        this.K = aVar.f6363s;
        this.L = aVar.f6364t;
        this.M = aVar.u;
        this.N = new r(11);
        Iterable iterable = list;
        boolean z12 = false;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((i) it.next()).f6263a) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            this.D = null;
            this.J = null;
            this.E = null;
            gVar = g.f6240c;
        } else {
            h.f8494c.getClass();
            X509TrustManager n10 = h.f8492a.n();
            this.E = n10;
            h hVar = h.f8492a;
            g.c(n10);
            this.D = hVar.m(n10);
            androidx.activity.result.c b10 = h.f8492a.b(n10);
            this.J = b10;
            gVar = aVar.f6362r;
            g.c(b10);
            if (!g.a(gVar.f6242b, b10)) {
                gVar = new g(gVar.f6241a, b10);
            }
        }
        this.I = gVar;
        List<s> list2 = this.f6340q;
        if (list2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        } else if (!list2.contains((Object) null)) {
            List<s> list3 = this.f6341r;
            if (list3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            } else if (!list3.contains((Object) null)) {
                Iterable iterable2 = this.F;
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    Iterator it2 = iterable2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((i) it2.next()).f6263a) {
                                z11 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z11 = true;
                X509TrustManager x509TrustManager = this.E;
                androidx.activity.result.c cVar = this.J;
                SSLSocketFactory sSLSocketFactory = this.D;
                if (z11) {
                    if (sSLSocketFactory == null) {
                        if (cVar == null) {
                            if (!(x509TrustManager == null ? true : z12)) {
                                throw new IllegalStateException("Check failed.".toString());
                            } else if (!g.a(this.I, g.f6240c)) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else if (sSLSocketFactory == null) {
                    throw new IllegalStateException("sslSocketFactory == null".toString());
                } else if (cVar == null) {
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                } else if (x509TrustManager == null) {
                    throw new IllegalStateException("x509TrustManager == null".toString());
                }
            } else {
                throw new IllegalStateException(("Null network interceptor: " + list3).toString());
            }
        } else {
            throw new IllegalStateException(("Null interceptor: " + list2).toString());
        }
    }

    public final m9.e c(x xVar) {
        return new m9.e(this, xVar, false);
    }

    public final Object clone() {
        return super.clone();
    }
}
