package s9;

import i9.w;
import java.util.List;
import javax.net.ssl.SSLSocket;
import z8.g;

public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    public j f8858a;

    /* renamed from: b  reason: collision with root package name */
    public final a f8859b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        j b(SSLSocket sSLSocket);
    }

    public i(a aVar) {
        this.f8859b = aVar;
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.f8859b.a(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        j jVar;
        synchronized (this) {
            if (this.f8858a == null && this.f8859b.a(sSLSocket)) {
                this.f8858a = this.f8859b.b(sSLSocket);
            }
            jVar = this.f8858a;
        }
        if (jVar != null) {
            return jVar.b(sSLSocket);
        }
        return null;
    }

    public final boolean c() {
        return true;
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        j jVar;
        g.f(list, "protocols");
        synchronized (this) {
            if (this.f8858a == null && this.f8859b.a(sSLSocket)) {
                this.f8858a = this.f8859b.b(sSLSocket);
            }
            jVar = this.f8858a;
        }
        if (jVar != null) {
            jVar.d(sSLSocket, str, list);
        }
    }
}
