package q7;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import o7.b;
import o7.c;
import o7.d;
import o7.e;
import o7.g;

public final class f implements e, g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8262a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f8263b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f8264c;
    public final Map<Class<?>, o7.f<?>> d;

    /* renamed from: e  reason: collision with root package name */
    public final d<Object> f8265e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8266f;

    public f(Writer writer, HashMap hashMap, HashMap hashMap2, a aVar, boolean z) {
        this.f8263b = new JsonWriter(writer);
        this.f8264c = hashMap;
        this.d = hashMap2;
        this.f8265e = aVar;
        this.f8266f = z;
    }

    public final e a(c cVar, long j8) {
        String str = cVar.f7748a;
        i();
        JsonWriter jsonWriter = this.f8263b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(j8);
        return this;
    }

    public final e b(c cVar, int i10) {
        String str = cVar.f7748a;
        i();
        JsonWriter jsonWriter = this.f8263b;
        jsonWriter.name(str);
        i();
        jsonWriter.value((long) i10);
        return this;
    }

    public final g c(String str) {
        i();
        this.f8263b.value(str);
        return this;
    }

    public final g d(boolean z) {
        i();
        this.f8263b.value(z);
        return this;
    }

    public final e e(c cVar, Object obj) {
        return h(obj, cVar.f7748a);
    }

    public final e f(c cVar, boolean z) {
        String str = cVar.f7748a;
        i();
        JsonWriter jsonWriter = this.f8263b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(z);
        return this;
    }

    public final f g(Object obj) {
        JsonWriter jsonWriter = this.f8263b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else {
            int i10 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    i();
                    jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                    return this;
                }
                jsonWriter.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i10 < length) {
                        jsonWriter.value((long) iArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i10 < length2) {
                        long j8 = jArr[i10];
                        i();
                        jsonWriter.value(j8);
                        i10++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i10 < length3) {
                        jsonWriter.value(dArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i10 < length4) {
                        jsonWriter.value(zArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i10 < length5) {
                        g(numberArr[i10]);
                        i10++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i10 < length6) {
                        g(objArr[i10]);
                        i10++;
                    }
                }
                jsonWriter.endArray();
                return this;
            } else if (obj instanceof Collection) {
                jsonWriter.beginArray();
                for (Object g10 : (Collection) obj) {
                    g(g10);
                }
                jsonWriter.endArray();
                return this;
            } else if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        h(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            } else {
                d dVar = this.f8264c.get(obj.getClass());
                if (dVar != null) {
                    jsonWriter.beginObject();
                    dVar.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
                o7.f fVar = this.d.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    String name = ((Enum) obj).name();
                    i();
                    jsonWriter.value(name);
                    return this;
                } else {
                    jsonWriter.beginObject();
                    this.f8265e.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
            }
        }
    }

    public final f h(Object obj, String str) {
        boolean z = this.f8266f;
        JsonWriter jsonWriter = this.f8263b;
        if (!z) {
            i();
            jsonWriter.name(str);
            if (obj != null) {
                return g(obj);
            }
            jsonWriter.nullValue();
            return this;
        } else if (obj == null) {
            return this;
        } else {
            i();
            jsonWriter.name(str);
            return g(obj);
        }
    }

    public final void i() {
        if (!this.f8262a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
