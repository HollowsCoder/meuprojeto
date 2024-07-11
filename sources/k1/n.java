package k1;

import java.util.Collections;
import u1.a;
import u1.c;

public final class n<K, A> extends a<K, A> {

    /* renamed from: i  reason: collision with root package name */
    public final A f6670i;

    public n(c<A> cVar, A a10) {
        super(Collections.emptyList());
        k(cVar);
        this.f6670i = a10;
    }

    public final float c() {
        return 1.0f;
    }

    public final A f() {
        c<A> cVar = this.f6634e;
        A a10 = this.f6670i;
        return cVar.a(a10, a10);
    }

    public final A g(a<K> aVar, float f10) {
        return f();
    }

    public final void i() {
        if (this.f6634e != null) {
            super.i();
        }
    }

    public final void j(float f10) {
        this.d = f10;
    }
}
