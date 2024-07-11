package s9;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import com.karumi.dexter.BuildConfig;
import i9.w;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import r9.h;
import z8.g;

@SuppressLint({"NewApi"})
public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public static final C0131a f8842a = new C0131a();

    /* renamed from: s9.a$a  reason: collision with other inner class name */
    public static final class C0131a {
    }

    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @SuppressLint({"NewApi"})
    public final String b(SSLSocket sSLSocket) {
        String h10 = sSLSocket.getApplicationProtocol();
        if (h10 != null && (h10.hashCode() != 0 || !h10.equals(BuildConfig.FLAVOR))) {
            return h10;
        }
        return null;
    }

    public final boolean c() {
        f8842a.getClass();
        h.f8494c.getClass();
        if (!h.a.c() || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    @SuppressLint({"NewApi"})
    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        g.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            g.e(sSLParameters, "sslParameters");
            h.f8494c.getClass();
            Object[] array = h.a.a(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
