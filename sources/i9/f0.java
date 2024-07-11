package i9;

import java.net.InetSocketAddress;
import java.net.Proxy;
import z8.g;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f6237a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f6238b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f6239c;

    public f0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        g.f(aVar, "address");
        g.f(inetSocketAddress, "socketAddress");
        this.f6237a = aVar;
        this.f6238b = proxy;
        this.f6239c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return g.a(f0Var.f6237a, this.f6237a) && g.a(f0Var.f6238b, this.f6238b) && g.a(f0Var.f6239c, this.f6239c);
        }
    }

    public final int hashCode() {
        int hashCode = this.f6238b.hashCode();
        return this.f6239c.hashCode() + ((hashCode + ((this.f6237a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f6239c + '}';
    }
}
