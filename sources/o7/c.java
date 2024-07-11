package o7;

import java.util.Collections;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f7748a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Object> f7749b;

    public c(String str, Map<Class<?>, Object> map) {
        this.f7748a = str;
        this.f7749b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7748a.equals(cVar.f7748a) && this.f7749b.equals(cVar.f7749b);
    }

    public final int hashCode() {
        return this.f7749b.hashCode() + (this.f7748a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f7748a + ", properties=" + this.f7749b.values() + "}";
    }
}
