package i9;

import i9.g0;
import j9.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import z8.g;

public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final i f6261e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f6262f = new i(false, false, (String[]) null, (String[]) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6263a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6264b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f6265c;
    public final String[] d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f6266a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f6267b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f6268c;
        public boolean d;

        public a() {
            this.f6266a = true;
        }

        public a(i iVar) {
            this.f6266a = iVar.f6263a;
            this.f6267b = iVar.f6265c;
            this.f6268c = iVar.d;
            this.d = iVar.f6264b;
        }

        public final i a() {
            return new i(this.f6266a, this.d, this.f6267b, this.f6268c);
        }

        public final void b(h... hVarArr) {
            g.f(hVarArr, "cipherSuites");
            if (this.f6266a) {
                ArrayList arrayList = new ArrayList(hVarArr.length);
                for (h hVar : hVarArr) {
                    arrayList.add(hVar.f6260a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    c((String[]) Arrays.copyOf(strArr, strArr.length));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final void c(String... strArr) {
            g.f(strArr, "cipherSuites");
            if (this.f6266a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.f6267b = (String[]) clone;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final void d() {
            if (this.f6266a) {
                this.d = true;
                return;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final void e(g0... g0VarArr) {
            if (this.f6266a) {
                ArrayList arrayList = new ArrayList(g0VarArr.length);
                for (g0 javaName : g0VarArr) {
                    arrayList.add(javaName.javaName());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    f((String[]) Arrays.copyOf(strArr, strArr.length));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final void f(String... strArr) {
            g.f(strArr, "tlsVersions");
            if (this.f6266a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.f6268c = (String[]) clone;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
    }

    static {
        h hVar = h.f6256q;
        h hVar2 = h.f6257r;
        h hVar3 = h.f6258s;
        h hVar4 = h.f6251k;
        h hVar5 = h.f6252m;
        h hVar6 = h.l;
        h hVar7 = h.f6253n;
        h hVar8 = h.f6255p;
        h hVar9 = h.f6254o;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9};
        h[] hVarArr2 = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, h.f6249i, h.f6250j, h.f6247g, h.f6248h, h.f6245e, h.f6246f, h.d};
        a aVar = new a();
        aVar.b((h[]) Arrays.copyOf(hVarArr, 9));
        g0 g0Var = g0.TLS_1_3;
        g0 g0Var2 = g0.TLS_1_2;
        aVar.e(g0Var, g0Var2);
        aVar.d();
        aVar.a();
        a aVar2 = new a();
        aVar2.b((h[]) Arrays.copyOf(hVarArr2, 16));
        aVar2.e(g0Var, g0Var2);
        aVar2.d();
        f6261e = aVar2.a();
        a aVar3 = new a();
        aVar3.b((h[]) Arrays.copyOf(hVarArr2, 16));
        aVar3.e(g0Var, g0Var2, g0.TLS_1_1, g0.TLS_1_0);
        aVar3.d();
        aVar3.a();
    }

    public i(boolean z, boolean z10, String[] strArr, String[] strArr2) {
        this.f6263a = z;
        this.f6264b = z10;
        this.f6265c = strArr;
        this.d = strArr2;
    }

    public final List<h> a() {
        String[] strArr = this.f6265c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b10 : strArr) {
            arrayList.add(h.f6259t.b(b10));
        }
        return o8.i.y(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f6263a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !c.i(strArr, sSLSocket.getEnabledProtocols(), p8.a.f7965a)) {
            return false;
        }
        String[] strArr2 = this.f6265c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        h.f6259t.getClass();
        if (!c.i(strArr2, enabledCipherSuites, h.f6243b)) {
            return false;
        }
        return true;
    }

    public final List<g0> c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a10 : strArr) {
            g0.Companion.getClass();
            arrayList.add(g0.a.a(a10));
        }
        return o8.i.y(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z = iVar.f6263a;
        boolean z10 = this.f6263a;
        if (z10 != z) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f6265c, iVar.f6265c) && Arrays.equals(this.d, iVar.d) && this.f6264b == iVar.f6264b);
    }

    public final int hashCode() {
        if (!this.f6263a) {
            return 17;
        }
        int i10 = 0;
        String[] strArr = this.f6265c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            i10 = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i10) * 31) + (this.f6264b ^ true ? 1 : 0);
    }

    public final String toString() {
        if (!this.f6263a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f6264b + ')';
    }
}
