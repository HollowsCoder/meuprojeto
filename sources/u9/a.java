package u9;

import androidx.activity.result.c;
import z8.g;

public final class a extends c {

    /* renamed from: o  reason: collision with root package name */
    public final d f9111o;

    public a(d dVar) {
        g.f(dVar, "trustRootIndex");
        this.f9111o = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && g.a(((a) obj).f9111o, this.f9111o);
    }

    public final int hashCode() {
        return this.f9111o.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x006d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List k(java.lang.String r11, java.util.List r12) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            z8.g.f(r12, r0)
            java.lang.String r0 = "hostname"
            z8.g.f(r11, r0)
            java.util.ArrayDeque r11 = new java.util.ArrayDeque
            java.util.Collection r12 = (java.util.Collection) r12
            r11.<init>(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.Object r0 = r11.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            z8.g.e(r0, r1)
            r12.add(r0)
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x0025:
            r3 = 9
            if (r1 >= r3) goto L_0x00d0
            int r3 = r12.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r12.get(r3)
            java.lang.String r5 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            if (r3 == 0) goto L_0x00ca
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            u9.d r6 = r10.f9111o
            java.security.cert.X509Certificate r6 = r6.a(r3)
            if (r6 == 0) goto L_0x0070
            int r2 = r12.size()
            if (r2 > r4) goto L_0x004e
            boolean r2 = z8.g.a(r3, r6)
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0051
        L_0x004e:
            r12.add(r6)
        L_0x0051:
            java.security.Principal r2 = r6.getIssuerDN()
            java.security.Principal r3 = r6.getSubjectDN()
            boolean r2 = z8.g.a(r2, r3)
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0061
            goto L_0x006a
        L_0x0061:
            java.security.PublicKey r2 = r6.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x006a }
            r6.verify(r2)     // Catch:{ GeneralSecurityException -> 0x006a }
            r2 = r4
            goto L_0x006b
        L_0x006a:
            r2 = r0
        L_0x006b:
            if (r2 == 0) goto L_0x006e
            return r12
        L_0x006e:
            r2 = r4
            goto L_0x00a9
        L_0x0070:
            java.util.Iterator r6 = r11.iterator()
            java.lang.String r7 = "queue.iterator()"
            z8.g.e(r6, r7)
        L_0x0079:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r6.next()
            if (r7 == 0) goto L_0x00ad
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            java.security.Principal r8 = r3.getIssuerDN()
            java.security.Principal r9 = r7.getSubjectDN()
            boolean r8 = z8.g.a(r8, r9)
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x0097
            goto L_0x00a0
        L_0x0097:
            java.security.PublicKey r8 = r7.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x00a0 }
            r3.verify(r8)     // Catch:{ GeneralSecurityException -> 0x00a0 }
            r8 = r4
            goto L_0x00a1
        L_0x00a0:
            r8 = r0
        L_0x00a1:
            if (r8 == 0) goto L_0x0079
            r6.remove()
            r12.add(r7)
        L_0x00a9:
            int r1 = r1 + 1
            goto L_0x0025
        L_0x00ad:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r11.<init>(r5)
            throw r11
        L_0x00b3:
            if (r2 == 0) goto L_0x00b6
            return r12
        L_0x00b6:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r12.<init>(r0)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00ca:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r11.<init>(r5)
            throw r11
        L_0x00d0:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Certificate chain too long: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.a.k(java.lang.String, java.util.List):java.util.List");
    }
}
