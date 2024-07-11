package u3;

import java.util.Arrays;
import t3.n;

public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Iterable<n> f9086a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f9087b;

    public a() {
        throw null;
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f9086a = iterable;
        this.f9087b = bArr;
    }

    public final Iterable<n> a() {
        return this.f9086a;
    }

    public final byte[] b() {
        return this.f9087b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f9086a.equals(fVar.a())) {
            if (Arrays.equals(this.f9087b, fVar instanceof a ? ((a) fVar).f9087b : fVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9086a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9087b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f9086a + ", extras=" + Arrays.toString(this.f9087b) + "}";
    }
}
