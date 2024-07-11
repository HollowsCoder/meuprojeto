package i9;

import j9.c;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import n8.f;
import o8.e;
import o8.k;
import z8.g;
import z8.h;

public final class p {

    /* renamed from: e  reason: collision with root package name */
    public static final a f6292e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final f f6293a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f6294b;

    /* renamed from: c  reason: collision with root package name */
    public final h f6295c;
    public final List<Certificate> d;

    public static final class a {

        /* renamed from: i9.p$a$a  reason: collision with other inner class name */
        public static final class C0083a extends h implements y8.a<List<? extends Certificate>> {

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ List f6296p;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0083a(List list) {
                super(0);
                this.f6296p = list;
            }

            public final Object n() {
                return this.f6296p;
            }
        }

        public static final class b extends h implements y8.a<List<? extends Certificate>> {

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ List f6297p;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.f6297p = list;
            }

            public final Object n() {
                return this.f6297p;
            }
        }

        public static p a(g0 g0Var, h hVar, List list, List list2) {
            g.f(g0Var, "tlsVersion");
            return new p(g0Var, hVar, c.v(list2), new C0083a(c.v(list)));
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static i9.p b(javax.net.ssl.SSLSession r5) {
            /*
                o8.k r0 = o8.k.f7764o
                java.lang.String r1 = r5.getCipherSuite()
                if (r1 == 0) goto L_0x0094
                int r2 = r1.hashCode()
                r3 = 1019404634(0x3cc2e15a, float:0.023789097)
                if (r2 == r3) goto L_0x0020
                r3 = 1208658923(0x480aabeb, float:141999.67)
                if (r2 == r3) goto L_0x0017
                goto L_0x0028
            L_0x0017:
                java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0088
                goto L_0x0028
            L_0x0020:
                java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0088
            L_0x0028:
                i9.h$b r2 = i9.h.f6259t
                i9.h r1 = r2.b(r1)
                java.lang.String r2 = r5.getProtocol()
                if (r2 == 0) goto L_0x007c
                java.lang.String r3 = "NONE"
                boolean r3 = z8.g.a(r3, r2)
                if (r3 != 0) goto L_0x0074
                i9.g0$a r3 = i9.g0.Companion
                r3.getClass()
                i9.g0 r2 = i9.g0.a.a(r2)
                java.security.cert.Certificate[] r3 = r5.getPeerCertificates()     // Catch:{ SSLPeerUnverifiedException -> 0x0057 }
                if (r3 == 0) goto L_0x0057
                int r4 = r3.length     // Catch:{ SSLPeerUnverifiedException -> 0x0057 }
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch:{ SSLPeerUnverifiedException -> 0x0057 }
                java.security.cert.Certificate[] r3 = (java.security.cert.Certificate[]) r3     // Catch:{ SSLPeerUnverifiedException -> 0x0057 }
                java.util.List r3 = j9.c.k(r3)     // Catch:{ SSLPeerUnverifiedException -> 0x0057 }
                goto L_0x0058
            L_0x0057:
                r3 = r0
            L_0x0058:
                i9.p r4 = new i9.p
                java.security.cert.Certificate[] r5 = r5.getLocalCertificates()
                if (r5 == 0) goto L_0x006b
                int r0 = r5.length
                java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
                java.security.cert.Certificate[] r5 = (java.security.cert.Certificate[]) r5
                java.util.List r0 = j9.c.k(r5)
            L_0x006b:
                i9.p$a$b r5 = new i9.p$a$b
                r5.<init>(r3)
                r4.<init>(r2, r1, r0, r5)
                return r4
            L_0x0074:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r0 = "tlsVersion == NONE"
                r5.<init>(r0)
                throw r5
            L_0x007c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "tlsVersion == null"
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            L_0x0088:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r0 = "cipherSuite == "
                java.lang.String r0 = r0.concat(r1)
                r5.<init>(r0)
                throw r5
            L_0x0094:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "cipherSuite == null"
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: i9.p.a.b(javax.net.ssl.SSLSession):i9.p");
        }
    }

    public static final class b extends h implements y8.a<List<? extends Certificate>> {

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ y8.a f6298p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(y8.a aVar) {
            super(0);
            this.f6298p = aVar;
        }

        public final Object n() {
            try {
                return (List) this.f6298p.n();
            } catch (SSLPeerUnverifiedException unused) {
                return k.f7764o;
            }
        }
    }

    public p(g0 g0Var, h hVar, List<? extends Certificate> list, y8.a<? extends List<? extends Certificate>> aVar) {
        g.f(g0Var, "tlsVersion");
        g.f(hVar, "cipherSuite");
        g.f(list, "localCertificates");
        this.f6294b = g0Var;
        this.f6295c = hVar;
        this.d = list;
        this.f6293a = new f(new b(aVar));
    }

    public final List<Certificate> a() {
        return (List) this.f6293a.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            return pVar.f6294b == this.f6294b && g.a(pVar.f6295c, this.f6295c) && g.a(pVar.a(), a()) && g.a(pVar.d, this.d);
        }
    }

    public final int hashCode() {
        int hashCode = this.f6295c.hashCode();
        int hashCode2 = a().hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + ((this.f6294b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        Iterable<Certificate> a10 = a();
        ArrayList arrayList = new ArrayList(e.u(a10));
        for (Certificate certificate : a10) {
            if (certificate instanceof X509Certificate) {
                str2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                str2 = certificate.getType();
                g.e(str2, "type");
            }
            arrayList.add(str2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f6294b);
        sb.append(" cipherSuite=");
        sb.append(this.f6295c);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        Iterable<Certificate> iterable = this.d;
        ArrayList arrayList2 = new ArrayList(e.u(iterable));
        for (Certificate certificate2 : iterable) {
            if (certificate2 instanceof X509Certificate) {
                str = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                str = certificate2.getType();
                g.e(str, "type");
            }
            arrayList2.add(str);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
