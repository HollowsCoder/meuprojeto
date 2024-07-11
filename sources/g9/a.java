package g9;

import g9.l0;
import n.e;
import n8.h;
import q8.d;
import q8.f;
import z8.g;

public abstract class a<T> extends q0 implements d<T>, u {

    /* renamed from: p  reason: collision with root package name */
    public final f f4995p;

    public a(f fVar, boolean z) {
        super(z);
        F((l0) fVar.get(l0.b.f5025o));
        this.f4995p = fVar.plus(this);
    }

    public final void E(h hVar) {
        e.z(this.f4995p, hVar);
    }

    public final String I() {
        boolean z = r.f5045a;
        return super.I();
    }

    public final void L(Object obj) {
        if (obj instanceof o) {
            Throwable th = ((o) obj).f5034a;
        }
    }

    public void R(Object obj) {
        k(obj);
    }

    public final boolean a() {
        return super.a();
    }

    public final f b() {
        return this.f4995p;
    }

    public final f g() {
        return this.f4995p;
    }

    public final void h(Object obj) {
        Throwable a10 = n8.e.a(obj);
        if (a10 != null) {
            obj = new o(a10, false);
        }
        Object H = H(obj);
        if (H != androidx.databinding.a.f1002e0) {
            R(H);
        }
    }

    public final String q() {
        return g.k(" was cancelled", getClass().getSimpleName());
    }
}
