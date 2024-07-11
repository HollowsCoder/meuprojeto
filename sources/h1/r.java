package h1;

import java.util.Arrays;

public final class r<V> {

    /* renamed from: a  reason: collision with root package name */
    public final V f5206a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f5207b;

    public r(f fVar) {
        this.f5206a = fVar;
        this.f5207b = null;
    }

    public r(Throwable th) {
        this.f5207b = th;
        this.f5206a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        V v10 = this.f5206a;
        if (v10 != null && v10.equals(rVar.f5206a)) {
            return true;
        }
        Throwable th = this.f5207b;
        if (th == null || rVar.f5207b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5206a, this.f5207b});
    }
}
