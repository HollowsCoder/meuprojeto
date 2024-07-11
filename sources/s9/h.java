package s9;

import i9.w;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import r9.d;
import r9.h;
import s9.i;
import z8.g;

public final class h implements j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8857a = new a();

    public static final class a implements i.a {
        public final boolean a(SSLSocket sSLSocket) {
            d.f8480f.getClass();
            return d.a.b() && Conscrypt.isConscrypt(sSLSocket);
        }

        public final j b(SSLSocket sSLSocket) {
            return new h();
        }
    }

    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final boolean c() {
        d.f8480f.getClass();
        return d.f8479e;
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        g.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            r9.h.f8494c.getClass();
            Object[] array = h.a.a(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
