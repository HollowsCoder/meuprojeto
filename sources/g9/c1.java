package g9;

import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.m;
import q8.f;
import s6.a;

public final class c1<T> extends k<T> {

    /* renamed from: q  reason: collision with root package name */
    public f f5003q;

    /* renamed from: r  reason: collision with root package name */
    public Object f5004r;

    public final void R(Object obj) {
        f fVar = this.f5003q;
        if (fVar != null) {
            m.a(fVar, this.f5004r);
            this.f5003q = null;
            this.f5004r = null;
        }
        a.G(obj);
        throw null;
    }

    public final boolean S() {
        if (this.f5003q == null) {
            return false;
        }
        this.f5003q = null;
        this.f5004r = null;
        return true;
    }
}
