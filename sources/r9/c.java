package r9;

import com.karumi.dexter.BuildConfig;
import i9.w;
import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import r9.h;
import z8.g;

public final class c extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f8477e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f8478f;
    public final Provider d = new BouncyCastleJsseProvider();

    public static final class a {
    }

    static {
        a aVar = new a();
        f8478f = aVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f8477e = z;
    }

    public final void d(SSLSocket sSLSocket, String str, List<w> list) {
        g.f(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            h.f8494c.getClass();
            ArrayList a10 = h.a.a(list);
            g.e(parameters, "sslParameters");
            Object[] array = a10.toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.d(sSLSocket, str, list);
    }

    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (!(sSLSocket instanceof BCSSLSocket) || (applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol()) == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(BuildConfig.FLAVOR))) {
            return null;
        }
        return applicationProtocol;
    }

    public final SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.d);
        g.e(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    public final X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        g.c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        g.e(arrays, "java.util.Arrays.toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}