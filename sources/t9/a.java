package t9;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p9.u;

public final class a extends ProxySelector {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9034a = new a();

    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public final List<Proxy> select(URI uri) {
        if (uri != null) {
            return u.l(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
