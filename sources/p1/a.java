package p1;

import k1.a;

public final class a implements a.C0091a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f7802a;

    public a(b bVar) {
        this.f7802a = bVar;
    }

    public final void b() {
        boolean z;
        b bVar = this.f7802a;
        if (bVar.f7816p.l() == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z != bVar.f7821v) {
            bVar.f7821v = z;
            bVar.f7813m.invalidateSelf();
        }
    }
}
