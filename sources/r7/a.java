package r7;

import java.lang.annotation.Annotation;
import r7.d;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f8441a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f8442b;

    public a(int i10, d.a aVar) {
        this.f8441a = i10;
        this.f8442b = aVar;
    }

    public final Class<? extends Annotation> annotationType() {
        return d.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f8441a != ((a) dVar).f8441a || !this.f8442b.equals(((a) dVar).f8442b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (14552422 ^ this.f8441a) + (this.f8442b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f8441a + "intEncoding=" + this.f8442b + ')';
    }
}
