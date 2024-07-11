package r9;

import com.karumi.dexter.BuildConfig;
import i9.w;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import r9.h;
import z8.g;

public final class f extends h {
    public static final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f8489e = new a();

    public static final class a {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0.intValue() >= 9) goto L_0x002d;
     */
    static {
        /*
            r9.f$a r0 = new r9.f$a
            r0.<init>()
            f8489e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r0 = f9.g.T(r0)
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0024
            int r0 = r0.intValue()
            r3 = 9
            if (r0 < r3) goto L_0x0022
            goto L_0x002d
        L_0x0022:
            r1 = r2
            goto L_0x002d
        L_0x0024:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0022 }
            r0.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0022 }
        L_0x002d:
            d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.f.<clinit>():void");
    }

    public final void d(SSLSocket sSLSocket, String str, List<w> list) {
        g.f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        h.f8494c.getClass();
        ArrayList a10 = h.a.a(list);
        g.e(sSLParameters, "sslParameters");
        Object[] array = a10.toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final String f(SSLSocket sSLSocket) {
        try {
            String h10 = sSLSocket.getApplicationProtocol();
            if (h10 != null) {
                if (h10.hashCode() != 0) {
                    return h10;
                }
                if (h10.equals(BuildConfig.FLAVOR)) {
                    return null;
                }
                return h10;
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }
}
