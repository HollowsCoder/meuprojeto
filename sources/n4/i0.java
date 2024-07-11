package n4;

import f9.h;
import javax.net.ssl.SSLSocket;
import s9.e;
import s9.i;
import s9.j;
import z8.g;

public final class i0 implements i.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f7445a;

    public /* synthetic */ i0() {
        this.f7445a = "com.google.android.gms.org.conscrypt";
    }

    public /* synthetic */ i0(String str) {
        this.f7445a = str;
    }

    public boolean a(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        return h.a0(name, this.f7445a + '.', false);
    }

    public j b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!g.a(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new e(cls2);
    }
}
