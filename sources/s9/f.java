package s9;

import com.karumi.dexter.BuildConfig;
import i9.w;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import r9.c;
import r9.h;
import s9.i;
import z8.g;

public final class f implements j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8853a = new a();

    public static final class a implements i.a {
        public final boolean a(SSLSocket sSLSocket) {
            c.f8478f.getClass();
            if (!c.f8477e || !(sSLSocket instanceof BCSSLSocket)) {
                return false;
            }
            return true;
        }

        public final j b(SSLSocket sSLSocket) {
            return new f();
        }
    }

    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(BuildConfig.FLAVOR))) {
            return applicationProtocol;
        }
        return null;
    }

    public final boolean c() {
        c.f8478f.getClass();
        return c.f8477e;
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        g.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            g.e(parameters, "sslParameters");
            h.f8494c.getClass();
            Object[] array = h.a.a(list).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
