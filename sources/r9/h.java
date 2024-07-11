package r9;

import androidx.activity.result.c;
import i9.v;
import i9.w;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import o8.e;
import u9.b;
import u9.d;
import w9.f;
import z8.g;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static volatile h f8492a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f8493b = Logger.getLogger(v.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final a f8494c = new a();

    public static final class a {
        public static ArrayList a(List list) {
            g.f(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((w) next) != w.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(e.u(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((w) it.next()).toString());
            }
            return arrayList2;
        }

        public static byte[] b(List list) {
            g.f(list, "protocols");
            f fVar = new f();
            Iterator it = a(list).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                fVar.M(str.length());
                fVar.g0(str);
            }
            return fVar.t(fVar.f9325p);
        }

        public static boolean c() {
            return g.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: r9.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: r9.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: r9.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: r9.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: r9.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: r9.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b3, code lost:
        if (r0 != null) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dc, code lost:
        if (r0 != null) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0105, code lost:
        if (r0 != null) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0132, code lost:
        if (java.lang.Integer.parseInt(r3) >= 9) goto L_0x018f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0193  */
    static {
        /*
            r9.h$a r0 = new r9.h$a
            r0.<init>()
            f8494c = r0
            boolean r0 = r9.h.a.c()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x008c
            java.util.Map<java.lang.String, java.lang.String> r0 = s9.c.f8846b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r5 = s9.c.f8845a
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L_0x0019
            java.lang.String r5 = "logger"
            z8.g.e(r4, r5)
            r4.setUseParentHandlers(r2)
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r5)
            if (r5 == 0) goto L_0x004f
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L_0x005b
        L_0x004f:
            r5 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x0059
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L_0x005b
        L_0x0059:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L_0x005b:
            r4.setLevel(r3)
            s9.d r3 = s9.d.f8847a
            r4.addHandler(r3)
            goto L_0x0019
        L_0x0064:
            r9.a$a r0 = r9.a.f8471f
            r0.getClass()
            boolean r0 = r9.a.f8470e
            if (r0 == 0) goto L_0x0073
            r9.a r0 = new r9.a
            r0.<init>()
            goto L_0x0074
        L_0x0073:
            r0 = r1
        L_0x0074:
            if (r0 == 0) goto L_0x0078
            goto L_0x0198
        L_0x0078:
            r9.b$a r0 = r9.b.f8473g
            r0.getClass()
            boolean r0 = r9.b.f8472f
            if (r0 == 0) goto L_0x0086
            r9.b r1 = new r9.b
            r1.<init>()
        L_0x0086:
            z8.g.c(r1)
        L_0x0089:
            r0 = r1
            goto L_0x0198
        L_0x008c:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r3 = "Security.getProviders()[0]"
            z8.g.e(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "Conscrypt"
            boolean r0 = z8.g.a(r4, r0)
            if (r0 == 0) goto L_0x00b7
            r9.d$a r0 = r9.d.f8480f
            r0.getClass()
            boolean r0 = r9.d.f8479e
            if (r0 == 0) goto L_0x00b2
            r9.d r0 = new r9.d
            r0.<init>()
            goto L_0x00b3
        L_0x00b2:
            r0 = r1
        L_0x00b3:
            if (r0 == 0) goto L_0x00b7
            goto L_0x0198
        L_0x00b7:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            z8.g.e(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "BC"
            boolean r0 = z8.g.a(r4, r0)
            if (r0 == 0) goto L_0x00e0
            r9.c$a r0 = r9.c.f8478f
            r0.getClass()
            boolean r0 = r9.c.f8477e
            if (r0 == 0) goto L_0x00db
            r9.c r0 = new r9.c
            r0.<init>()
            goto L_0x00dc
        L_0x00db:
            r0 = r1
        L_0x00dc:
            if (r0 == 0) goto L_0x00e0
            goto L_0x0198
        L_0x00e0:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            z8.g.e(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "OpenJSSE"
            boolean r0 = z8.g.a(r3, r0)
            if (r0 == 0) goto L_0x0109
            r9.g$a r0 = r9.g.f8491f
            r0.getClass()
            boolean r0 = r9.g.f8490e
            if (r0 == 0) goto L_0x0104
            r9.g r0 = new r9.g
            r0.<init>()
            goto L_0x0105
        L_0x0104:
            r0 = r1
        L_0x0105:
            if (r0 == 0) goto L_0x0109
            goto L_0x0198
        L_0x0109:
            r9.f$a r0 = r9.f.f8489e
            r0.getClass()
            boolean r0 = r9.f.d
            if (r0 == 0) goto L_0x0118
            r9.f r0 = new r9.f
            r0.<init>()
            goto L_0x0119
        L_0x0118:
            r0 = r1
        L_0x0119:
            if (r0 == 0) goto L_0x011d
            goto L_0x0198
        L_0x011d:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "java.specification.version"
            java.lang.String r4 = "unknown"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            java.lang.String r4 = "jvmVersion"
            z8.g.e(r3, r4)     // Catch:{ NumberFormatException -> 0x0135 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0135 }
            r4 = 9
            if (r3 < r4) goto L_0x0135
            goto L_0x018f
        L_0x0135:
            java.lang.String r3 = "org.eclipse.jetty.alpn.ALPN"
            r4 = 1
            java.lang.Class r3 = java.lang.Class.forName(r3, r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r5 = java.lang.Class.forName(r5, r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            java.lang.String r6 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r11 = java.lang.Class.forName(r6, r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            java.lang.String r6 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r12 = java.lang.Class.forName(r6, r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            java.lang.String r6 = "put"
            r7 = 2
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            r7[r2] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            r7[r4] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            java.lang.reflect.Method r8 = r3.getMethod(r6, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            java.lang.String r5 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            r6[r2] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            java.lang.reflect.Method r9 = r3.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            java.lang.String r5 = "remove"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            r4[r2] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            java.lang.reflect.Method r10 = r3.getMethod(r5, r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            r9.e r0 = new r9.e     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            java.lang.String r2 = "putMethod"
            z8.g.e(r8, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            java.lang.String r2 = "getMethod"
            z8.g.e(r9, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            java.lang.String r2 = "removeMethod"
            z8.g.e(r10, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            java.lang.String r2 = "clientProviderClass"
            z8.g.e(r11, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            java.lang.String r2 = "serverProviderClass"
            z8.g.e(r12, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018f }
            r1 = r0
        L_0x018f:
            if (r1 == 0) goto L_0x0193
            goto L_0x0089
        L_0x0193:
            r9.h r0 = new r9.h
            r0.<init>()
        L_0x0198:
            f8492a = r0
            java.lang.Class<i9.v> r0 = i9.v.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f8493b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.h.<clinit>():void");
    }

    public static void i(int i10, String str, Throwable th) {
        g.f(str, "message");
        f8493b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public static /* synthetic */ void j(h hVar, String str, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        hVar.getClass();
        i(i10, str, (Throwable) null);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public c b(X509TrustManager x509TrustManager) {
        return new u9.a(c(x509TrustManager));
    }

    public d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        g.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List<w> list) {
        g.f(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        g.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f8493b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        g.f(str, "hostname");
        return true;
    }

    public void k(Object obj, String str) {
        g.f(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS");
        g.e(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext l = l();
            l.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = l.getSocketFactory();
            g.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        g.c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        g.e(arrays, "java.util.Arrays.toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
