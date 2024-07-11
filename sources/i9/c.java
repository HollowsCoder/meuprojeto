package i9;

import f9.h;
import i9.g0;
import i9.p;
import i9.q;
import i9.t;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import k9.e;
import n9.i;
import o8.m;
import r9.h;
import w9.b0;
import w9.f;
import w9.i;
import w9.j;
import w9.k;
import w9.l;
import w9.u;
import w9.v;
import w9.z;
import z8.g;

public final class c implements Closeable, Flushable {

    /* renamed from: p  reason: collision with root package name */
    public static final b f6167p = new b();

    /* renamed from: o  reason: collision with root package name */
    public final e f6168o;

    public static final class a extends d0 {

        /* renamed from: q  reason: collision with root package name */
        public final v f6169q;

        /* renamed from: r  reason: collision with root package name */
        public final e.c f6170r;

        /* renamed from: s  reason: collision with root package name */
        public final String f6171s;

        /* renamed from: t  reason: collision with root package name */
        public final String f6172t;

        /* renamed from: i9.c$a$a  reason: collision with other inner class name */
        public static final class C0081a extends l {

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ a f6173p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ b0 f6174q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0081a(a aVar, b0 b0Var, b0 b0Var2) {
                super(b0Var2);
                this.f6173p = aVar;
                this.f6174q = b0Var;
            }

            public final void close() {
                this.f6173p.f6170r.close();
                super.close();
            }
        }

        public a(e.c cVar, String str, String str2) {
            this.f6170r = cVar;
            this.f6171s = str;
            this.f6172t = str2;
            b0 b0Var = cVar.f6761q.get(1);
            this.f6169q = n.e.o(new C0081a(this, b0Var, b0Var));
        }

        public final long a() {
            String str = this.f6172t;
            if (str == null) {
                return -1;
            }
            byte[] bArr = j9.c.f6602a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public final t b() {
            String str = this.f6171s;
            if (str == null) {
                return null;
            }
            t.f6320f.getClass();
            try {
                return t.a.a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final i c() {
            return this.f6169q;
        }
    }

    public static final class b {
        public static String a(r rVar) {
            g.f(rVar, "url");
            j jVar = j.f9328r;
            return j.a.c(rVar.f6311j).i("MD5").l();
        }

        public static int b(v vVar) {
            try {
                long d = vVar.d();
                String D = vVar.D();
                if (d >= 0 && d <= ((long) Integer.MAX_VALUE)) {
                    if (!(D.length() > 0)) {
                        return (int) d;
                    }
                }
                throw new IOException("expected an int but was \"" + d + D + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public static Set c(q qVar) {
            int length = qVar.f6300o.length / 2;
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (h.V("Vary", qVar.h(i10))) {
                    String k10 = qVar.k(i10);
                    if (treeSet == null) {
                        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                        g.e(comparator, "CASE_INSENSITIVE_ORDER");
                        treeSet = new TreeSet(comparator);
                    }
                    for (String str : f9.l.n0(k10, new char[]{','})) {
                        if (str != null) {
                            treeSet.add(f9.l.q0(str).toString());
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    continue;
                }
            }
            if (treeSet != null) {
                return treeSet;
            }
            return m.f7766o;
        }
    }

    public final class d implements k9.c {

        /* renamed from: a  reason: collision with root package name */
        public final z f6185a;

        /* renamed from: b  reason: collision with root package name */
        public final a f6186b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6187c;
        public final e.a d;

        public static final class a extends k {

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ d f6189p;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(d dVar, z zVar) {
                super(zVar);
                this.f6189p = dVar;
            }

            public final void close() {
                synchronized (c.this) {
                    d dVar = this.f6189p;
                    if (!dVar.f6187c) {
                        dVar.f6187c = true;
                        c.this.getClass();
                        super.close();
                        this.f6189p.d.b();
                    }
                }
            }
        }

        public d(e.a aVar) {
            this.d = aVar;
            z d10 = aVar.d(1);
            this.f6185a = d10;
            this.f6186b = new a(this, d10);
        }

        public final void a() {
            synchronized (c.this) {
                if (!this.f6187c) {
                    this.f6187c = true;
                    c.this.getClass();
                    j9.c.c(this.f6185a);
                    try {
                        this.d.a();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    public c(File file, long j8) {
        this.f6168o = new e(file, j8, l9.d.f6995h);
    }

    public final void a(x xVar) {
        g.f(xVar, "request");
        e eVar = this.f6168o;
        b bVar = f6167p;
        r rVar = xVar.f6366b;
        bVar.getClass();
        String a10 = b.a(rVar);
        synchronized (eVar) {
            g.f(a10, "key");
            eVar.f();
            eVar.a();
            e.t(a10);
            e.b bVar2 = eVar.u.get(a10);
            if (bVar2 != null) {
                eVar.r(bVar2);
                if (eVar.f6741s <= eVar.f6737o) {
                    eVar.A = false;
                }
            }
        }
    }

    public final void close() {
        this.f6168o.close();
    }

    public final void flush() {
        this.f6168o.flush();
    }

    /* renamed from: i9.c$c  reason: collision with other inner class name */
    public static final class C0082c {

        /* renamed from: k  reason: collision with root package name */
        public static final String f6175k = "OkHttp-Sent-Millis";
        public static final String l = "OkHttp-Received-Millis";

        /* renamed from: a  reason: collision with root package name */
        public final String f6176a;

        /* renamed from: b  reason: collision with root package name */
        public final q f6177b;

        /* renamed from: c  reason: collision with root package name */
        public final String f6178c;
        public final w d;

        /* renamed from: e  reason: collision with root package name */
        public final int f6179e;

        /* renamed from: f  reason: collision with root package name */
        public final String f6180f;

        /* renamed from: g  reason: collision with root package name */
        public final q f6181g;

        /* renamed from: h  reason: collision with root package name */
        public final p f6182h;

        /* renamed from: i  reason: collision with root package name */
        public final long f6183i;

        /* renamed from: j  reason: collision with root package name */
        public final long f6184j;

        static {
            h.a aVar = r9.h.f8494c;
            aVar.getClass();
            r9.h.f8492a.getClass();
            aVar.getClass();
            r9.h.f8492a.getClass();
        }

        public C0082c(c0 c0Var) {
            q qVar;
            x xVar = c0Var.f6191p;
            this.f6176a = xVar.f6366b.f6311j;
            c.f6167p.getClass();
            c0 c0Var2 = c0Var.w;
            g.c(c0Var2);
            q qVar2 = c0Var2.f6191p.d;
            q qVar3 = c0Var.u;
            Set c10 = b.c(qVar3);
            if (c10.isEmpty()) {
                qVar = j9.c.f6603b;
            } else {
                q.a aVar = new q.a();
                int length = qVar2.f6300o.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    String h10 = qVar2.h(i10);
                    if (c10.contains(h10)) {
                        aVar.a(h10, qVar2.k(i10));
                    }
                }
                qVar = aVar.d();
            }
            this.f6177b = qVar;
            this.f6178c = xVar.f6367c;
            this.d = c0Var.f6192q;
            this.f6179e = c0Var.f6194s;
            this.f6180f = c0Var.f6193r;
            this.f6181g = qVar3;
            this.f6182h = c0Var.f6195t;
            this.f6183i = c0Var.z;
            this.f6184j = c0Var.A;
        }

        public static List a(v vVar) {
            c.f6167p.getClass();
            int b10 = b.b(vVar);
            if (b10 == -1) {
                return o8.k.f7764o;
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(b10);
                for (int i10 = 0; i10 < b10; i10++) {
                    String D = vVar.D();
                    f fVar = new f();
                    j jVar = j.f9328r;
                    j a10 = j.a.a(D);
                    g.c(a10);
                    fVar.J(a10);
                    arrayList.add(instance.generateCertificate(new f.a(fVar)));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public static void b(u uVar, List list) {
            try {
                uVar.Z((long) list.size());
                uVar.writeByte(10);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    byte[] encoded = ((Certificate) list.get(i10)).getEncoded();
                    j jVar = j.f9328r;
                    g.e(encoded, "bytes");
                    uVar.Y(j.a.d(encoded).g());
                    uVar.writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final void c(e.a aVar) {
            String str;
            String str2 = this.f6176a;
            p pVar = this.f6182h;
            q qVar = this.f6181g;
            q qVar2 = this.f6177b;
            u n10 = n.e.n(aVar.d(0));
            try {
                n10.Y(str2);
                n10.writeByte(10);
                n10.Y(this.f6178c);
                n10.writeByte(10);
                n10.Z((long) (qVar2.f6300o.length / 2));
                n10.writeByte(10);
                int length = qVar2.f6300o.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    n10.Y(qVar2.h(i10));
                    n10.Y(": ");
                    n10.Y(qVar2.k(i10));
                    n10.writeByte(10);
                }
                w wVar = this.d;
                int i11 = this.f6179e;
                String str3 = this.f6180f;
                g.f(wVar, "protocol");
                g.f(str3, "message");
                StringBuilder sb = new StringBuilder();
                if (wVar == w.HTTP_1_0) {
                    str = "HTTP/1.0";
                } else {
                    str = "HTTP/1.1";
                }
                sb.append(str);
                sb.append(' ');
                sb.append(i11);
                sb.append(' ');
                sb.append(str3);
                String sb2 = sb.toString();
                g.e(sb2, "StringBuilder().apply(builderAction).toString()");
                n10.Y(sb2);
                n10.writeByte(10);
                n10.Z((long) ((qVar.f6300o.length / 2) + 2));
                n10.writeByte(10);
                int length2 = qVar.f6300o.length / 2;
                for (int i12 = 0; i12 < length2; i12++) {
                    n10.Y(qVar.h(i12));
                    n10.Y(": ");
                    n10.Y(qVar.k(i12));
                    n10.writeByte(10);
                }
                n10.Y(f6175k);
                n10.Y(": ");
                n10.Z(this.f6183i);
                n10.writeByte(10);
                n10.Y(l);
                n10.Y(": ");
                n10.Z(this.f6184j);
                n10.writeByte(10);
                if (f9.h.a0(str2, "https://", false)) {
                    n10.writeByte(10);
                    g.c(pVar);
                    n10.Y(pVar.f6295c.f6260a);
                    n10.writeByte(10);
                    b(n10, pVar.a());
                    b(n10, pVar.d);
                    n10.Y(pVar.f6294b.javaName());
                    n10.writeByte(10);
                }
                n8.i iVar = n8.i.f7501a;
                s6.a.r(n10, (Throwable) null);
            } catch (Throwable th) {
                s6.a.r(n10, th);
                throw th;
            }
        }

        public C0082c(b0 b0Var) {
            g0 g0Var;
            g.f(b0Var, "rawSource");
            try {
                v o10 = n.e.o(b0Var);
                this.f6176a = o10.D();
                this.f6178c = o10.D();
                q.a aVar = new q.a();
                c.f6167p.getClass();
                int b10 = b.b(o10);
                boolean z = false;
                for (int i10 = 0; i10 < b10; i10++) {
                    aVar.b(o10.D());
                }
                this.f6177b = aVar.d();
                n9.i a10 = i.a.a(o10.D());
                this.d = a10.f7519a;
                this.f6179e = a10.f7520b;
                this.f6180f = a10.f7521c;
                q.a aVar2 = new q.a();
                c.f6167p.getClass();
                int b11 = b.b(o10);
                for (int i11 = 0; i11 < b11; i11++) {
                    aVar2.b(o10.D());
                }
                String str = f6175k;
                String e10 = aVar2.e(str);
                String str2 = l;
                String e11 = aVar2.e(str2);
                aVar2.f(str);
                aVar2.f(str2);
                long j8 = 0;
                this.f6183i = e10 != null ? Long.parseLong(e10) : 0;
                this.f6184j = e11 != null ? Long.parseLong(e11) : j8;
                this.f6181g = aVar2.d();
                if (f9.h.a0(this.f6176a, "https://", false)) {
                    String D = o10.D();
                    if (!(D.length() > 0 ? true : z)) {
                        h b12 = h.f6259t.b(o10.D());
                        List a11 = a(o10);
                        List a12 = a(o10);
                        if (!o10.F()) {
                            g0.a aVar3 = g0.Companion;
                            String D2 = o10.D();
                            aVar3.getClass();
                            g0Var = g0.a.a(D2);
                        } else {
                            g0Var = g0.SSL_3_0;
                        }
                        p.f6292e.getClass();
                        this.f6182h = p.a.a(g0Var, b12, a11, a12);
                    } else {
                        throw new IOException("expected \"\" but was \"" + D + '\"');
                    }
                } else {
                    this.f6182h = null;
                }
            } finally {
                b0Var.close();
            }
        }
    }
}
