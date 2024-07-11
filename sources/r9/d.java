package r9;

import i9.w;
import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import r9.h;
import z8.g;

public final class d extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f8479e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f8480f = new a(0);
    public final Provider d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public static boolean a() {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
        }

        public static boolean b() {
            return d.f8479e;
        }
    }

    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8481a = new b();
    }

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, a.class.getClassLoader());
            if (Conscrypt.isAvailable() && a.a()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f8479e = z;
    }

    public d() {
        Provider newProvider = Conscrypt.newProvider();
        g.e(newProvider, "Conscrypt.newProvider()");
        this.d = newProvider;
    }

    public final void d(SSLSocket sSLSocket, String str, List<w> list) {
        g.f(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            h.f8494c.getClass();
            Object[] array = h.a.a(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.d(sSLSocket, str, list);
    }

    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.d);
        g.e(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    public final SSLSocketFactory m(X509TrustManager x509TrustManager) {
        SSLContext l = l();
        l.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = l.getSocketFactory();
        g.e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    public final X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f8481a);
                return x509TrustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        g.e(arrays, "java.util.Arrays.toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
