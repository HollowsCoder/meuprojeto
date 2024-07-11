package i9;

import b0.d;
import f9.h;
import i9.r;
import j9.c;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import z8.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final r f6152a;

    /* renamed from: b  reason: collision with root package name */
    public final List<w> f6153b;

    /* renamed from: c  reason: collision with root package name */
    public final List<i> f6154c;
    public final m d;

    /* renamed from: e  reason: collision with root package name */
    public final SocketFactory f6155e;

    /* renamed from: f  reason: collision with root package name */
    public final SSLSocketFactory f6156f;

    /* renamed from: g  reason: collision with root package name */
    public final HostnameVerifier f6157g;

    /* renamed from: h  reason: collision with root package name */
    public final g f6158h;

    /* renamed from: i  reason: collision with root package name */
    public final b f6159i;

    /* renamed from: j  reason: collision with root package name */
    public final Proxy f6160j = null;

    /* renamed from: k  reason: collision with root package name */
    public final ProxySelector f6161k;

    public a(String str, int i10, m mVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, List list, List list2, ProxySelector proxySelector) {
        String str2 = str;
        int i11 = i10;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        b bVar2 = bVar;
        ProxySelector proxySelector2 = proxySelector;
        g.f(str, "uriHost");
        g.f(mVar, "dns");
        g.f(socketFactory, "socketFactory");
        g.f(bVar2, "proxyAuthenticator");
        g.f(list, "protocols");
        g.f(list2, "connectionSpecs");
        g.f(proxySelector2, "proxySelector");
        this.d = mVar;
        this.f6155e = socketFactory;
        this.f6156f = sSLSocketFactory2;
        this.f6157g = hostnameVerifier;
        this.f6158h = gVar;
        this.f6159i = bVar2;
        this.f6161k = proxySelector2;
        r.a aVar = new r.a();
        String str3 = "https";
        String str4 = sSLSocketFactory2 != null ? str3 : "http";
        if (h.V(str4, "http")) {
            str3 = "http";
        } else if (!h.V(str4, str3)) {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str4));
        }
        aVar.f6312a = str3;
        String J = s6.a.J(r.b.d(r.l, str, 0, 0, false, 7));
        if (J != null) {
            aVar.d = J;
            boolean z = true;
            if ((1 > i11 || 65535 < i11) ? false : z) {
                aVar.f6315e = i11;
                this.f6152a = aVar.a();
                this.f6153b = c.v(list);
                this.f6154c = c.v(list2);
                return;
            }
            throw new IllegalArgumentException(d.c("unexpected port: ", i10).toString());
        }
        throw new IllegalArgumentException("unexpected host: ".concat(str));
    }

    public final boolean a(a aVar) {
        g.f(aVar, "that");
        if (!g.a(this.d, aVar.d) || !g.a(this.f6159i, aVar.f6159i) || !g.a(this.f6153b, aVar.f6153b) || !g.a(this.f6154c, aVar.f6154c) || !g.a(this.f6161k, aVar.f6161k) || !g.a(this.f6160j, aVar.f6160j) || !g.a(this.f6156f, aVar.f6156f) || !g.a(this.f6157g, aVar.f6157g) || !g.a(this.f6158h, aVar.f6158h) || this.f6152a.f6307f != aVar.f6152a.f6307f) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return g.a(this.f6152a, aVar.f6152a) && a(aVar);
        }
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.f6159i.hashCode();
        int hashCode3 = this.f6153b.hashCode();
        int hashCode4 = this.f6154c.hashCode();
        int hashCode5 = this.f6161k.hashCode();
        int hashCode6 = Objects.hashCode(this.f6160j);
        int hashCode7 = Objects.hashCode(this.f6156f);
        int hashCode8 = Objects.hashCode(this.f6157g);
        return Objects.hashCode(this.f6158h) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f6152a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        r rVar = this.f6152a;
        sb.append(rVar.f6306e);
        sb.append(':');
        sb.append(rVar.f6307f);
        sb.append(", ");
        Proxy proxy = this.f6160j;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f6161k;
        }
        return d.g(sb, str, "}");
    }
}
