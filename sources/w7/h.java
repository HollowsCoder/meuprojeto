package w7;

import m5.j;
import y7.a;
import y7.c;

public final class h implements k {

    /* renamed from: a  reason: collision with root package name */
    public final j<String> f9288a;

    public h(j<String> jVar) {
        this.f9288a = jVar;
    }

    public final boolean a(a aVar) {
        boolean z;
        boolean z10;
        boolean z11;
        if (aVar.f() == c.a.UNREGISTERED) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (aVar.f() == c.a.REGISTERED) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (aVar.f() == c.a.REGISTER_ERROR) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    return false;
                }
            }
        }
        this.f9288a.c(aVar.f9604b);
        return true;
    }

    public final boolean b(Exception exc) {
        return false;
    }
}
