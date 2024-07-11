package s9;

import android.net.http.X509TrustManagerExtensions;
import androidx.activity.result.c;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import z8.g;

public final class b extends c {

    /* renamed from: o  reason: collision with root package name */
    public final X509TrustManager f8843o;

    /* renamed from: p  reason: collision with root package name */
    public final X509TrustManagerExtensions f8844p;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f8843o = x509TrustManager;
        this.f8844p = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f8843o == this.f8843o;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8843o);
    }

    public final List k(String str, List list) {
        g.f(list, "chain");
        g.f(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f8844p.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                g.e(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e10) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
                sSLPeerUnverifiedException.initCause(e10);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
