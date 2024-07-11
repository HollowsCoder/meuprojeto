package z3;

import c4.a;
import java.util.Map;
import q3.d;
import z3.e;

public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public final a f9874a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<d, e.a> f9875b;

    public b(a aVar, Map<d, e.a> map) {
        if (aVar != null) {
            this.f9874a = aVar;
            if (map != null) {
                this.f9875b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public final a a() {
        return this.f9874a;
    }

    public final Map<d, e.a> c() {
        return this.f9875b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f9874a.equals(eVar.a()) && this.f9875b.equals(eVar.c());
    }

    public final int hashCode() {
        return ((this.f9874a.hashCode() ^ 1000003) * 1000003) ^ this.f9875b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f9874a + ", values=" + this.f9875b + "}";
    }
}
