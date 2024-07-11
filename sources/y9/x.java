package y9;

import i9.b0;
import i9.q;
import i9.u;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import y9.a;

public abstract class x<T> {

    public static final class a<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f9734a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9735b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, b0> f9736c;

        public a(Method method, int i10, f<T, b0> fVar) {
            this.f9734a = method;
            this.f9735b = i10;
            this.f9736c = fVar;
        }

        public final void a(z zVar, T t10) {
            int i10 = this.f9735b;
            Method method = this.f9734a;
            if (t10 != null) {
                try {
                    zVar.f9784k = this.f9736c.a(t10);
                } catch (IOException e10) {
                    throw h0.l(method, e10, i10, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
                }
            } else {
                throw h0.k(method, i10, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    public static final class b<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f9737a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f9738b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9739c;

        public b(String str, boolean z) {
            a.d dVar = a.d.f9626o;
            Objects.requireNonNull(str, "name == null");
            this.f9737a = str;
            this.f9738b = dVar;
            this.f9739c = z;
        }

        public final void a(z zVar, T t10) {
            String a10;
            if (t10 != null && (a10 = this.f9738b.a(t10)) != null) {
                zVar.a(this.f9737a, a10, this.f9739c);
            }
        }
    }

    public static final class c<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f9740a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9741b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9742c;

        public c(Method method, int i10, boolean z) {
            this.f9740a = method;
            this.f9741b = i10;
            this.f9742c = z;
        }

        public final void a(z zVar, Object obj) {
            Map map = (Map) obj;
            int i10 = this.f9741b;
            Method method = this.f9740a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                zVar.a(str, obj2, this.f9742c);
                            } else {
                                throw h0.k(method, i10, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw h0.k(method, i10, b0.d.f("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.k(method, i10, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.k(method, i10, "Field map was null.", new Object[0]);
        }
    }

    public static final class d<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f9743a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f9744b;

        public d(String str) {
            a.d dVar = a.d.f9626o;
            Objects.requireNonNull(str, "name == null");
            this.f9743a = str;
            this.f9744b = dVar;
        }

        public final void a(z zVar, T t10) {
            String a10;
            if (t10 != null && (a10 = this.f9744b.a(t10)) != null) {
                zVar.b(this.f9743a, a10);
            }
        }
    }

    public static final class e<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f9745a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9746b;

        public e(Method method, int i10) {
            this.f9745a = method;
            this.f9746b = i10;
        }

        public final void a(z zVar, Object obj) {
            Map map = (Map) obj;
            int i10 = this.f9746b;
            Method method = this.f9745a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            zVar.b(str, value.toString());
                        } else {
                            throw h0.k(method, i10, b0.d.f("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.k(method, i10, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.k(method, i10, "Header map was null.", new Object[0]);
        }
    }

    public static final class f extends x<q> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f9747a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9748b;

        public f(int i10, Method method) {
            this.f9747a = method;
            this.f9748b = i10;
        }

        public final void a(z zVar, Object obj) {
            q qVar = (q) obj;
            if (qVar != null) {
                q.a aVar = zVar.f9779f;
                aVar.getClass();
                int length = qVar.f6300o.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    aVar.c(qVar.h(i10), qVar.k(i10));
                }
                return;
            }
            int i11 = this.f9748b;
            throw h0.k(this.f9747a, i11, "Headers parameter must not be null.", new Object[0]);
        }
    }

    public static final class g<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f9749a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9750b;

        /* renamed from: c  reason: collision with root package name */
        public final q f9751c;
        public final f<T, b0> d;

        public g(Method method, int i10, q qVar, f<T, b0> fVar) {
            this.f9749a = method;
            this.f9750b = i10;
            this.f9751c = qVar;
            this.d = fVar;
        }

        public final void a(z zVar, T t10) {
            if (t10 != null) {
                try {
                    b0 a10 = this.d.a(t10);
                    u.a aVar = zVar.f9782i;
                    aVar.getClass();
                    z8.g.f(a10, "body");
                    u.c.f6335c.getClass();
                    aVar.f6334c.add(u.c.a.a(this.f9751c, a10));
                } catch (IOException e10) {
                    throw h0.k(this.f9749a, this.f9750b, "Unable to convert " + t10 + " to RequestBody", e10);
                }
            }
        }
    }

    public static final class h<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f9752a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9753b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, b0> f9754c;
        public final String d;

        public h(Method method, int i10, f<T, b0> fVar, String str) {
            this.f9752a = method;
            this.f9753b = i10;
            this.f9754c = fVar;
            this.d = str;
        }

        public final void a(z zVar, Object obj) {
            Map map = (Map) obj;
            int i10 = this.f9753b;
            Method method = this.f9752a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String[] strArr = {"Content-Disposition", b0.d.f("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.d};
                            q.f6299p.getClass();
                            q c10 = q.b.c(strArr);
                            b0 a10 = this.f9754c.a(value);
                            u.a aVar = zVar.f9782i;
                            aVar.getClass();
                            z8.g.f(a10, "body");
                            u.c.f6335c.getClass();
                            aVar.f6334c.add(u.c.a.a(c10, a10));
                        } else {
                            throw h0.k(method, i10, b0.d.f("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.k(method, i10, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.k(method, i10, "Part map was null.", new Object[0]);
        }
    }

    public static final class i<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f9755a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9756b;

        /* renamed from: c  reason: collision with root package name */
        public final String f9757c;
        public final f<T, String> d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f9758e;

        public i(Method method, int i10, String str, boolean z) {
            a.d dVar = a.d.f9626o;
            this.f9755a = method;
            this.f9756b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f9757c = str;
            this.d = dVar;
            this.f9758e = z;
        }

        public final void a(z zVar, T t10) {
            String str;
            int i10;
            boolean z;
            int i11;
            z zVar2 = zVar;
            T t11 = t10;
            String str2 = this.f9757c;
            if (t11 != null) {
                String a10 = this.d.a(t11);
                if (zVar2.f9777c != null) {
                    int length = a10.length();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            str = a10;
                            break;
                        }
                        int codePointAt = a10.codePointAt(i12);
                        i10 = 47;
                        z = this.f9758e;
                        i11 = -1;
                        if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                            w9.f fVar = new w9.f();
                            fVar.h0(a10, 0, i12);
                            w9.f fVar2 = null;
                        } else {
                            i12 += Character.charCount(codePointAt);
                        }
                    }
                    w9.f fVar3 = new w9.f();
                    fVar3.h0(a10, 0, i12);
                    w9.f fVar22 = null;
                    while (i12 < length) {
                        int codePointAt2 = a10.codePointAt(i12);
                        if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i11 || (!z && (codePointAt2 == i10 || codePointAt2 == 37))) {
                                if (fVar22 == null) {
                                    fVar22 = new w9.f();
                                }
                                fVar22.i0(codePointAt2);
                                while (!fVar22.F()) {
                                    byte readByte = fVar22.readByte() & 255;
                                    fVar3.M(37);
                                    char[] cArr = z.l;
                                    fVar3.M(cArr[(readByte >> 4) & 15]);
                                    fVar3.M(cArr[readByte & 15]);
                                }
                            } else {
                                fVar3.i0(codePointAt2);
                            }
                        }
                        i12 += Character.charCount(codePointAt2);
                        i10 = 47;
                        i11 = -1;
                    }
                    str = fVar3.z();
                    String replace = zVar2.f9777c.replace("{" + str2 + "}", str);
                    if (!z.f9774m.matcher(replace).matches()) {
                        zVar2.f9777c = replace;
                        return;
                    }
                    throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(a10));
                }
                throw new AssertionError();
            }
            throw h0.k(this.f9755a, this.f9756b, b0.d.f("Path parameter \"", str2, "\" value must not be null."), new Object[0]);
        }
    }

    public static final class j<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f9759a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f9760b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9761c;

        public j(String str, boolean z) {
            a.d dVar = a.d.f9626o;
            Objects.requireNonNull(str, "name == null");
            this.f9759a = str;
            this.f9760b = dVar;
            this.f9761c = z;
        }

        public final void a(z zVar, T t10) {
            String a10;
            if (t10 != null && (a10 = this.f9760b.a(t10)) != null) {
                zVar.c(this.f9759a, a10, this.f9761c);
            }
        }
    }

    public static final class k<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f9762a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9763b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9764c;

        public k(Method method, int i10, boolean z) {
            this.f9762a = method;
            this.f9763b = i10;
            this.f9764c = z;
        }

        public final void a(z zVar, Object obj) {
            Map map = (Map) obj;
            int i10 = this.f9763b;
            Method method = this.f9762a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                zVar.c(str, obj2, this.f9764c);
                            } else {
                                throw h0.k(method, i10, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw h0.k(method, i10, b0.d.f("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.k(method, i10, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.k(method, i10, "Query map was null", new Object[0]);
        }
    }

    public static final class l<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f9765a;

        public l(boolean z) {
            this.f9765a = z;
        }

        public final void a(z zVar, T t10) {
            if (t10 != null) {
                zVar.c(t10.toString(), (String) null, this.f9765a);
            }
        }
    }

    public static final class m extends x<u.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f9766a = new m();

        public final void a(z zVar, Object obj) {
            u.c cVar = (u.c) obj;
            if (cVar != null) {
                u.a aVar = zVar.f9782i;
                aVar.getClass();
                aVar.f6334c.add(cVar);
            }
        }
    }

    public static final class n extends x<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f9767a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9768b;

        public n(int i10, Method method) {
            this.f9767a = method;
            this.f9768b = i10;
        }

        public final void a(z zVar, Object obj) {
            if (obj != null) {
                zVar.f9777c = obj.toString();
                return;
            }
            int i10 = this.f9768b;
            throw h0.k(this.f9767a, i10, "@Url parameter is null.", new Object[0]);
        }
    }

    public static final class o<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f9769a;

        public o(Class<T> cls) {
            this.f9769a = cls;
        }

        public final void a(z zVar, T t10) {
            zVar.f9778e.d(this.f9769a, t10);
        }
    }

    public abstract void a(z zVar, T t10);
}
