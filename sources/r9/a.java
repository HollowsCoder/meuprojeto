package r9;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import androidx.activity.result.c;
import f9.d;
import i9.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import r9.h;
import s9.b;
import s9.e;
import s9.f;
import s9.i;
import s9.j;
import z8.g;

public final class a extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f8470e;

    /* renamed from: f  reason: collision with root package name */
    public static final C0121a f8471f = new C0121a();
    public final ArrayList d;

    /* renamed from: r9.a$a  reason: collision with other inner class name */
    public static final class C0121a {
    }

    static {
        boolean z;
        h.f8494c.getClass();
        if (!h.a.c() || Build.VERSION.SDK_INT < 29) {
            z = false;
        } else {
            z = true;
        }
        f8470e = z;
    }

    public a() {
        boolean z;
        s9.a aVar;
        j[] jVarArr = new j[4];
        s9.a.f8842a.getClass();
        h.f8494c.getClass();
        if (!h.a.c() || Build.VERSION.SDK_INT < 29) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            aVar = new s9.a();
        } else {
            aVar = null;
        }
        jVarArr[0] = aVar;
        jVarArr[1] = new i(e.f8848f);
        jVarArr[2] = new i(s9.h.f8857a);
        jVarArr[3] = new i(f.f8853a);
        ArrayList Q = d.Q(jVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = Q.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((j) next).c()) {
                arrayList.add(next);
            }
        }
        this.d = arrayList;
    }

    public final c b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new b(x509TrustManager, x509TrustManagerExtensions);
        }
        if (bVar != null) {
            return bVar;
        }
        return new u9.a(c(x509TrustManager));
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        Object obj;
        g.f(list, "protocols");
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

    @SuppressLint({"NewApi"})
    public final boolean h(String str) {
        g.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
