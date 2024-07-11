package y9;

import aa.w;
import i9.b0;
import i9.d0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import n8.i;
import y9.f;

public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9622a = true;

    /* renamed from: y9.a$a  reason: collision with other inner class name */
    public static final class C0167a implements f<d0, d0> {

        /* renamed from: o  reason: collision with root package name */
        public static final C0167a f9623o = new C0167a();

        public final Object a(Object obj) {
            d0 d0Var = (d0) obj;
            try {
                return h0.a(d0Var);
            } finally {
                d0Var.close();
            }
        }
    }

    public static final class b implements f<b0, b0> {

        /* renamed from: o  reason: collision with root package name */
        public static final b f9624o = new b();

        public final Object a(Object obj) {
            return (b0) obj;
        }
    }

    public static final class c implements f<d0, d0> {

        /* renamed from: o  reason: collision with root package name */
        public static final c f9625o = new c();

        public final Object a(Object obj) {
            return (d0) obj;
        }
    }

    public static final class d implements f<Object, String> {

        /* renamed from: o  reason: collision with root package name */
        public static final d f9626o = new d();

        public final Object a(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements f<d0, i> {

        /* renamed from: o  reason: collision with root package name */
        public static final e f9627o = new e();

        public final Object a(Object obj) {
            ((d0) obj).close();
            return i.f7501a;
        }
    }

    public static final class f implements f<d0, Void> {

        /* renamed from: o  reason: collision with root package name */
        public static final f f9628o = new f();

        public final Object a(Object obj) {
            ((d0) obj).close();
            return null;
        }
    }

    public final f a(Type type) {
        if (b0.class.isAssignableFrom(h0.f(type))) {
            return b.f9624o;
        }
        return null;
    }

    public final f<d0, ?> b(Type type, Annotation[] annotationArr, d0 d0Var) {
        if (type == d0.class) {
            return h0.i(annotationArr, w.class) ? c.f9625o : C0167a.f9623o;
        }
        if (type == Void.class) {
            return f.f9628o;
        }
        if (!this.f9622a || type != i.class) {
            return null;
        }
        try {
            return e.f9627o;
        } catch (NoClassDefFoundError unused) {
            this.f9622a = false;
            return null;
        }
    }
}
