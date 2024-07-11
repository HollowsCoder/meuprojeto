package r9;

import com.karumi.dexter.BuildConfig;
import i9.w;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import r9.h;

public final class g extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f8490e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f8491f;
    public final Provider d = new OpenJSSE();

    public static final class a {
    }

    static {
        a aVar = new a();
        f8491f = aVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f8490e = z;
    }

    public final void d(SSLSocket sSLSocket, String str, List<w> list) {
        z8.g.f(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                h.f8494c.getClass();
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = h.a.a(list).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket2.setSSLParameters(sSLParameters);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return;
        }
        super.d(sSLSocket, str, list);
    }

    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) || (applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol()) == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(BuildConfig.FLAVOR))) {
            return null;
        }
        return applicationProtocol;
    }

    public final SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.d);
        z8.g.e(instance, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    public final X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.d);
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        z8.g.c(trustManagers);
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
        z8.g.e(arrays, "java.util.Arrays.toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
