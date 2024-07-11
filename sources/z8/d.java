package z8;

import d9.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import n8.a;
import y8.c;
import y8.e;
import y8.f;
import y8.g;
import y8.h;
import y8.i;
import y8.j;
import y8.k;
import y8.l;
import y8.m;
import y8.n;
import y8.o;
import y8.p;
import y8.q;
import y8.r;
import y8.s;
import y8.t;
import y8.u;
import y8.v;
import y8.w;

public final class d implements b<Object>, c {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Class<? extends a<?>>, Integer> f9967b;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f9968a;

    static {
        int i10 = 0;
        Iterable M = f9.d.M(new Class[]{y8.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, y8.b.class, c.class, y8.d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class});
        ArrayList arrayList = new ArrayList(o8.e.u(M));
        for (Object next : M) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList.add(new n8.d((Class) next, Integer.valueOf(i10)));
                i10 = i11;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        f9967b = e9.g.u(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        g.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            g.e(str, "kotlinName");
            sb.append(f9.l.p0(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry next2 : f9967b.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(p9.u.m(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), f9.l.p0((String) entry.getValue()));
        }
    }

    public d(Class<?> cls) {
        g.f(cls, "jClass");
        this.f9968a = cls;
    }

    public final Class<?> a() {
        return this.f9968a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && g.a(p9.u.h(this), p9.u.h((b) obj));
    }

    public final int hashCode() {
        return p9.u.h(this).hashCode();
    }

    public final String toString() {
        return this.f9968a.toString() + " (Kotlin reflection is not available)";
    }
}
