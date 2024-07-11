package r9;

import i9.w;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import r9.h;
import z8.g;

public final class e extends h {
    public final Method d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f8482e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f8483f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f8484g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f8485h;

    public static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public boolean f8486a;

        /* renamed from: b  reason: collision with root package name */
        public String f8487b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f8488c;

        public a(ArrayList arrayList) {
            this.f8488c = arrayList;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            g.f(obj, "proxy");
            g.f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (g.a(name, "supports") && g.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!g.a(name, "unsupported") || !g.a(Void.TYPE, returnType)) {
                boolean a10 = g.a(name, "protocols");
                List<String> list = this.f8488c;
                if (a10) {
                    if (objArr.length == 0) {
                        return list;
                    }
                }
                if ((g.a(name, "selectProtocol") || g.a(name, "select")) && g.a(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        if (obj2 != null) {
                            List list2 = (List) obj2;
                            int size = list2.size();
                            if (size >= 0) {
                                int i10 = 0;
                                while (true) {
                                    Object obj3 = list2.get(i10);
                                    if (obj3 != null) {
                                        String str = (String) obj3;
                                        if (!list.contains(str)) {
                                            if (i10 == size) {
                                                break;
                                            }
                                            i10++;
                                        } else {
                                            this.f8487b = str;
                                            return str;
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                }
                            }
                            String str2 = list.get(0);
                            this.f8487b = str2;
                            return str2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                }
                if ((!g.a(name, "protocolSelected") && !g.a(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj4 = objArr[0];
                if (obj4 != null) {
                    this.f8487b = (String) obj4;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f8486a = true;
            return null;
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.d = method;
        this.f8482e = method2;
        this.f8483f = method3;
        this.f8484g = cls;
        this.f8485h = cls2;
    }

    public final void a(SSLSocket sSLSocket) {
        try {
            this.f8483f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        g.f(list, "protocols");
        h.f8494c.getClass();
        ArrayList a10 = h.a.a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f8484g, this.f8485h}, new a(a10));
            this.d.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f8482e.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                boolean z = aVar.f8486a;
                if (!z && aVar.f8487b == null) {
                    h.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                    return null;
                } else if (z) {
                    return null;
                } else {
                    return aVar.f8487b;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
