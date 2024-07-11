package r9;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import androidx.activity.result.c;
import i9.w;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import r9.h;
import s9.e;
import s9.f;
import s9.g;
import s9.i;
import s9.j;
import s9.k;
import u9.d;

public final class b extends h {

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f8472f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f8473g = new a();
    public final ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public final g f8474e;

    public static final class a {
    }

    /* renamed from: r9.b$b  reason: collision with other inner class name */
    public static final class C0122b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f8475a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f8476b;

        public C0122b(X509TrustManager x509TrustManager, Method method) {
            this.f8475a = x509TrustManager;
            this.f8476b = method;
        }

        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                Object invoke = this.f8476b.invoke(this.f8475a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0122b)) {
                return false;
            }
            C0122b bVar = (C0122b) obj;
            return z8.g.a(this.f8475a, bVar.f8475a) && z8.g.a(this.f8476b, bVar.f8476b);
        }

        public final int hashCode() {
            int i10 = 0;
            X509TrustManager x509TrustManager = this.f8475a;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f8476b;
            if (method != null) {
                i10 = method.hashCode();
            }
            return hashCode + i10;
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f8475a + ", findByIssuerAndSignatureMethod=" + this.f8476b + ")";
        }
    }

    static {
        boolean z;
        h.f8494c.getClass();
        if (h.a.c() && Build.VERSION.SDK_INT < 30) {
            z = true;
        } else {
            z = false;
        }
        f8472f = z;
    }

    public b() {
        k kVar;
        Method method;
        Method method2;
        j[] jVarArr = new j[4];
        Method method3 = null;
        try {
            kVar = new k(Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl")), Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl")), Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl")));
        } catch (Exception e10) {
            h.f8494c.getClass();
            h.f8492a.getClass();
            h.i(5, "unable to load android socket classes", e10);
            kVar = null;
        }
        jVarArr[0] = kVar;
        jVarArr[1] = new i(e.f8848f);
        jVarArr[2] = new i(s9.h.f8857a);
        jVarArr[3] = new i(f.f8853a);
        ArrayList Q = f9.d.Q(jVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = Q.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((j) next).c()) {
                arrayList.add(next);
            }
        }
        this.d = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method = cls.getMethod("open", new Class[]{String.class});
            method2 = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f8474e = new g(method3, method, method2);
    }

    public final c b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        s9.b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new s9.b(x509TrustManager, x509TrustManagerExtensions);
        }
        if (bVar != null) {
            return bVar;
        }
        return new u9.a(c(x509TrustManager));
    }

    public final d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            z8.g.e(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0122b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List<w> list) {
        Object obj;
        z8.g.f(list, "protocols");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((j) obj).a(sSLSocket)) {
                break;
            }
        }
        j jVar = (j) obj;
        if (jVar != null) {
            jVar.d(sSLSocket, str, list);
        }
    }

    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        z8.g.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e10);
            }
            throw e10;
        }
    }

    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((j) obj).a(sSLSocket)) {
                break;
            }
        }
        j jVar = (j) obj;
        if (jVar != null) {
            return jVar.b(sSLSocket);
        }
        return null;
    }

    public final Object g() {
        g gVar = this.f8474e;
        gVar.getClass();
        Method method = gVar.f8854a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            Method method2 = gVar.f8855b;
            z8.g.c(method2);
            method2.invoke(invoke, new Object[]{"response.body().close()"});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean h(String str) {
        z8.g.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public final void k(Object obj, String str) {
        z8.g.f(str, "message");
        g gVar = this.f8474e;
        gVar.getClass();
        boolean z = false;
        if (obj != null) {
            try {
                Method method = gVar.f8856c;
                z8.g.c(method);
                method.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            h.j(this, str, 5, 4);
        }
    }
}
