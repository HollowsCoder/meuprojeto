package y9;

import i9.q;
import i9.r;
import i9.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Method f9629a;

    /* renamed from: b  reason: collision with root package name */
    public final r f9630b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9631c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final q f9632e;

    /* renamed from: f  reason: collision with root package name */
    public final t f9633f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9634g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9635h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f9636i;

    /* renamed from: j  reason: collision with root package name */
    public final x<?>[] f9637j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f9638k;

    public static final class a {

        /* renamed from: x  reason: collision with root package name */
        public static final Pattern f9639x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y  reason: collision with root package name */
        public static final Pattern f9640y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        public final d0 f9641a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f9642b;

        /* renamed from: c  reason: collision with root package name */
        public final Annotation[] f9643c;
        public final Annotation[][] d;

        /* renamed from: e  reason: collision with root package name */
        public final Type[] f9644e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f9645f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f9646g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f9647h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f9648i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f9649j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f9650k;
        public boolean l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f9651m;

        /* renamed from: n  reason: collision with root package name */
        public String f9652n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f9653o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f9654p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f9655q;

        /* renamed from: r  reason: collision with root package name */
        public String f9656r;

        /* renamed from: s  reason: collision with root package name */
        public q f9657s;

        /* renamed from: t  reason: collision with root package name */
        public t f9658t;
        public LinkedHashSet u;

        /* renamed from: v  reason: collision with root package name */
        public x<?>[] f9659v;
        public boolean w;

        public a(d0 d0Var, Method method) {
            this.f9641a = d0Var;
            this.f9642b = method;
            this.f9643c = method.getAnnotations();
            this.f9644e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z) {
            String str3 = this.f9652n;
            Method method = this.f9642b;
            if (str3 == null) {
                this.f9652n = str;
                this.f9653o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    Pattern pattern = f9639x;
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (pattern.matcher(substring).find()) {
                            throw h0.j(method, (Exception) null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f9656r = str2;
                    Matcher matcher = pattern.matcher(str2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (matcher.find()) {
                        linkedHashSet.add(matcher.group(1));
                    }
                    this.u = linkedHashSet;
                    return;
                }
                return;
            }
            throw h0.j(method, (Exception) null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void c(int i10, Type type) {
            if (h0.h(type)) {
                throw h0.k(this.f9642b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public a0(a aVar) {
        this.f9629a = aVar.f9642b;
        this.f9630b = aVar.f9641a.f9668c;
        this.f9631c = aVar.f9652n;
        this.d = aVar.f9656r;
        this.f9632e = aVar.f9657s;
        this.f9633f = aVar.f9658t;
        this.f9634g = aVar.f9653o;
        this.f9635h = aVar.f9654p;
        this.f9636i = aVar.f9655q;
        this.f9637j = aVar.f9659v;
        this.f9638k = aVar.w;
    }
}
