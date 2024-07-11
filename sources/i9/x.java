package i9;

import b0.d;
import f9.h;
import i9.q;
import i9.r;
import j9.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import n.e;
import o8.l;
import z8.g;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public d f6365a;

    /* renamed from: b  reason: collision with root package name */
    public final r f6366b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6367c;
    public final q d;

    /* renamed from: e  reason: collision with root package name */
    public final b0 f6368e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, Object> f6369f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public r f6370a;

        /* renamed from: b  reason: collision with root package name */
        public String f6371b;

        /* renamed from: c  reason: collision with root package name */
        public q.a f6372c;
        public b0 d;

        /* renamed from: e  reason: collision with root package name */
        public LinkedHashMap f6373e;

        public a() {
            this.f6373e = new LinkedHashMap();
            this.f6371b = "GET";
            this.f6372c = new q.a();
        }

        public a(x xVar) {
            this.f6373e = new LinkedHashMap();
            this.f6370a = xVar.f6366b;
            this.f6371b = xVar.f6367c;
            this.d = xVar.f6368e;
            Map<Class<?>, Object> map = xVar.f6369f;
            this.f6373e = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
            this.f6372c = xVar.d.i();
        }

        public final x a() {
            Map map;
            r rVar = this.f6370a;
            if (rVar != null) {
                String str = this.f6371b;
                q d10 = this.f6372c.d();
                b0 b0Var = this.d;
                LinkedHashMap linkedHashMap = this.f6373e;
                byte[] bArr = c.f6602a;
                g.f(linkedHashMap, "$this$toImmutableMap");
                if (linkedHashMap.isEmpty()) {
                    map = l.f7765o;
                } else {
                    map = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                    g.e(map, "Collections.unmodifiableMap(LinkedHashMap(this))");
                }
                return new x(rVar, str, d10, b0Var, map);
            }
            throw new IllegalStateException("url == null".toString());
        }

        public final void b(String str, String str2) {
            g.f(str2, "value");
            q.a aVar = this.f6372c;
            aVar.getClass();
            q.f6299p.getClass();
            q.b.a(str);
            q.b.b(str2, str);
            aVar.f(str);
            aVar.c(str, str2);
        }

        public final void c(String str, b0 b0Var) {
            boolean z;
            g.f(str, "method");
            boolean z10 = false;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (b0Var == null) {
                    if (g.a(str, "POST") || g.a(str, "PUT") || g.a(str, "PATCH") || g.a(str, "PROPPATCH") || g.a(str, "REPORT")) {
                        z10 = true;
                    }
                    if (!(!z10)) {
                        throw new IllegalArgumentException(d.f("method ", str, " must have a request body.").toString());
                    }
                } else if (!e.D(str)) {
                    throw new IllegalArgumentException(d.f("method ", str, " must not have a request body.").toString());
                }
                this.f6371b = str;
                this.d = b0Var;
                return;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public final void d(Class cls, Object obj) {
            g.f(cls, "type");
            if (obj == null) {
                this.f6373e.remove(cls);
                return;
            }
            if (this.f6373e.isEmpty()) {
                this.f6373e = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap = this.f6373e;
            Object cast = cls.cast(obj);
            g.c(cast);
            linkedHashMap.put(cls, cast);
        }

        public final void e(String str) {
            String str2;
            String str3;
            g.f(str, "url");
            if (h.a0(str, "ws:", true)) {
                str2 = str.substring(3);
                g.e(str2, "(this as java.lang.String).substring(startIndex)");
                str3 = "http:";
            } else {
                if (h.a0(str, "wss:", true)) {
                    str2 = str.substring(4);
                    g.e(str2, "(this as java.lang.String).substring(startIndex)");
                    str3 = "https:";
                }
                r.l.getClass();
                g.f(str, "$this$toHttpUrl");
                r.a aVar = new r.a();
                aVar.c((r) null, str);
                this.f6370a = aVar.a();
            }
            str = str3.concat(str2);
            r.l.getClass();
            g.f(str, "$this$toHttpUrl");
            r.a aVar2 = new r.a();
            aVar2.c((r) null, str);
            this.f6370a = aVar2.a();
        }
    }

    public x(r rVar, String str, q qVar, b0 b0Var, Map<Class<?>, ? extends Object> map) {
        g.f(str, "method");
        this.f6366b = rVar;
        this.f6367c = str;
        this.d = qVar;
        this.f6368e = b0Var;
        this.f6369f = map;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f6367c);
        sb.append(", url=");
        sb.append(this.f6366b);
        q qVar = this.d;
        if (qVar.f6300o.length / 2 != 0) {
            sb.append(", headers=[");
            Iterator<n8.d<String, String>> it = qVar.iterator();
            int i10 = 0;
            while (true) {
                z8.a aVar = (z8.a) it;
                if (!aVar.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = aVar.next();
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    n8.d dVar = (n8.d) next;
                    String str = (String) dVar.f7495o;
                    String str2 = (String) dVar.f7496p;
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    sb.append(':');
                    sb.append(str2);
                    i10 = i11;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
        }
        Map<Class<?>, Object> map = this.f6369f;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String sb2 = sb.toString();
        g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
