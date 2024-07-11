package s9;

import i9.w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import n4.i0;
import r9.b;
import r9.h;
import z8.g;

public class e implements j {

    /* renamed from: f  reason: collision with root package name */
    public static final i0 f8848f = new i0();

    /* renamed from: a  reason: collision with root package name */
    public final Method f8849a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f8850b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f8851c;
    public final Method d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<? super SSLSocket> f8852e;

    public e(Class<? super SSLSocket> cls) {
        this.f8852e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        g.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f8849a = declaredMethod;
        this.f8850b = cls.getMethod("setHostname", new Class[]{String.class});
        this.f8851c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.d = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.f8852e.isInstance(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        if (!this.f8852e.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f8851c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            g.e(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e10) {
            if (g.a(e10.getMessage(), "ssl == null")) {
                return null;
            }
            throw e10;
        } catch (IllegalAccessException e11) {
            throw new AssertionError(e11);
        } catch (InvocationTargetException e12) {
            throw new AssertionError(e12);
        }
    }

    public final boolean c() {
        b.f8473g.getClass();
        return b.f8472f;
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        g.f(list, "protocols");
        if (this.f8852e.isInstance(sSLSocket)) {
            try {
                this.f8849a.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f8850b.invoke(sSLSocket, new Object[]{str});
                }
                Method method = this.d;
                h.f8494c.getClass();
                method.invoke(sSLSocket, new Object[]{h.a.b(list)});
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
