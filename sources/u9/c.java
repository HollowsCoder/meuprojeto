package u9;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import o8.g;
import o8.k;

public final class c implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final c f9113a = new c();

    public static ArrayList a(X509Certificate x509Certificate) {
        Collection b10 = b(x509Certificate, 7);
        Iterable b11 = b(x509Certificate, 2);
        if (b11 instanceof Collection) {
            Collection collection = (Collection) b11;
            ArrayList arrayList = new ArrayList(collection.size() + b10.size());
            arrayList.addAll(b10);
            arrayList.addAll(collection);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(b10);
        g.v(b11, arrayList2);
        return arrayList2;
    }

    public static List b(X509Certificate x509Certificate, int i10) {
        k kVar = k.f7764o;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List next : subjectAlternativeNames) {
                    if (next != null) {
                        if (next.size() >= 2) {
                            if (!(!z8.g.a(next.get(0), Integer.valueOf(i10)))) {
                                Object obj = next.get(1);
                                if (obj != null) {
                                    arrayList.add((String) obj);
                                }
                            }
                        }
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0148 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            java.lang.String r0 = "host"
            z8.g.f(r11, r0)
            byte[] r0 = j9.c.f6602a
            f9.c r0 = j9.c.f6606f
            r0.getClass()
            java.util.regex.Pattern r0 = r0.f4938o
            java.util.regex.Matcher r0 = r0.matcher(r11)
            boolean r0 = r0.matches()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0050
            java.lang.String r11 = s6.a.J(r11)
            r0 = 7
            java.util.List r12 = b(r12, r0)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0034
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0034
            goto L_0x0149
        L_0x0034:
            java.util.Iterator r12 = r12.iterator()
        L_0x0038:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0149
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = s6.a.J(r0)
            boolean r0 = z8.g.a(r11, r0)
            if (r0 == 0) goto L_0x0038
            goto L_0x0148
        L_0x0050:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = "Locale.US"
            z8.g.e(r0, r3)
            java.lang.String r11 = r11.toLowerCase(r0)
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            z8.g.e(r11, r0)
            r4 = 2
            java.util.List r12 = b(r12, r4)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r4 = r12 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0076
            r4 = r12
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0076
            goto L_0x0149
        L_0x0076:
            java.util.Iterator r12 = r12.iterator()
        L_0x007a:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0149
            java.lang.Object r4 = r12.next()
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r11.length()
            if (r5 != 0) goto L_0x008e
            r5 = r2
            goto L_0x008f
        L_0x008e:
            r5 = r1
        L_0x008f:
            if (r5 != 0) goto L_0x0145
            java.lang.String r5 = "."
            boolean r6 = f9.h.a0(r11, r5, r1)
            if (r6 != 0) goto L_0x0145
            java.lang.String r6 = ".."
            boolean r7 = r11.endsWith(r6)
            if (r7 == 0) goto L_0x00a3
            goto L_0x0145
        L_0x00a3:
            if (r4 == 0) goto L_0x00ae
            int r7 = r4.length()
            if (r7 != 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r7 = r1
            goto L_0x00af
        L_0x00ae:
            r7 = r2
        L_0x00af:
            if (r7 != 0) goto L_0x0145
            boolean r7 = f9.h.a0(r4, r5, r1)
            if (r7 != 0) goto L_0x0145
            boolean r6 = r4.endsWith(r6)
            if (r6 == 0) goto L_0x00bf
            goto L_0x0145
        L_0x00bf:
            boolean r6 = r11.endsWith(r5)
            if (r6 != 0) goto L_0x00ca
            java.lang.String r6 = r11.concat(r5)
            goto L_0x00cb
        L_0x00ca:
            r6 = r11
        L_0x00cb:
            boolean r7 = r4.endsWith(r5)
            if (r7 != 0) goto L_0x00d5
            java.lang.String r4 = r4.concat(r5)
        L_0x00d5:
            java.util.Locale r5 = java.util.Locale.US
            z8.g.e(r5, r3)
            if (r4 == 0) goto L_0x013d
            java.lang.String r4 = r4.toLowerCase(r5)
            z8.g.e(r4, r0)
            java.lang.String r5 = "*"
            boolean r5 = f9.l.c0(r4, r5)
            if (r5 != 0) goto L_0x00f0
            boolean r4 = z8.g.a(r6, r4)
            goto L_0x0146
        L_0x00f0:
            java.lang.String r5 = "*."
            boolean r7 = f9.h.a0(r4, r5, r1)
            if (r7 == 0) goto L_0x0145
            r7 = 42
            r8 = 4
            int r7 = f9.l.g0(r4, r7, r2, r1, r8)
            r9 = -1
            if (r7 == r9) goto L_0x0103
            goto L_0x0145
        L_0x0103:
            int r7 = r6.length()
            int r10 = r4.length()
            if (r7 >= r10) goto L_0x010e
            goto L_0x0145
        L_0x010e:
            boolean r5 = z8.g.a(r5, r4)
            if (r5 == 0) goto L_0x0115
            goto L_0x0145
        L_0x0115:
            java.lang.String r4 = r4.substring(r2)
            java.lang.String r5 = "(this as java.lang.String).substring(startIndex)"
            z8.g.e(r4, r5)
            boolean r5 = r6.endsWith(r4)
            if (r5 != 0) goto L_0x0125
            goto L_0x0145
        L_0x0125:
            int r5 = r6.length()
            int r4 = r4.length()
            int r5 = r5 - r4
            if (r5 <= 0) goto L_0x013b
            int r5 = r5 + -1
            r4 = 46
            int r4 = f9.l.j0(r6, r4, r5, r8)
            if (r4 == r9) goto L_0x013b
            goto L_0x0145
        L_0x013b:
            r4 = r2
            goto L_0x0146
        L_0x013d:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "null cannot be cast to non-null type java.lang.String"
            r11.<init>(r12)
            throw r11
        L_0x0145:
            r4 = r1
        L_0x0146:
            if (r4 == 0) goto L_0x007a
        L_0x0148:
            r1 = r2
        L_0x0149:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.c.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        z8.g.f(str, "host");
        z8.g.f(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return c(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
