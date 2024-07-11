package n8;

import java.io.Serializable;
import z8.g;

public final class d<A, B> implements Serializable {

    /* renamed from: o  reason: collision with root package name */
    public final A f7495o;

    /* renamed from: p  reason: collision with root package name */
    public final B f7496p;

    public d(A a10, B b10) {
        this.f7495o = a10;
        this.f7496p = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return g.a(this.f7495o, dVar.f7495o) && g.a(this.f7496p, dVar.f7496p);
    }

    public final int hashCode() {
        int i10 = 0;
        A a10 = this.f7495o;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f7496p;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "(" + this.f7495o + ", " + this.f7496p + ')';
    }
}
