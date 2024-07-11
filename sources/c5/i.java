package c5;

import java.lang.annotation.Annotation;

public final class i implements m {

    /* renamed from: a  reason: collision with root package name */
    public final int f2163a;

    /* renamed from: b  reason: collision with root package name */
    public final l f2164b;

    public i(int i10, l lVar) {
        this.f2163a = i10;
        this.f2164b = lVar;
    }

    public final Class<? extends Annotation> annotationType() {
        return m.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f2163a != ((i) mVar).f2163a || !this.f2164b.equals(((i) mVar).f2164b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f2163a ^ 14552422) + (this.f2164b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f2163a + "intEncoding=" + this.f2164b + ')';
    }
}
