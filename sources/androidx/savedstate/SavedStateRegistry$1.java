package androidx.savedstate;

import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;

class SavedStateRegistry$1 implements l {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ a f1878o;

    public SavedStateRegistry$1(a aVar) {
        this.f1878o = aVar;
    }

    public final void f(n nVar, h.b bVar) {
        boolean z;
        if (bVar == h.b.ON_START) {
            z = true;
        } else if (bVar == h.b.ON_STOP) {
            z = false;
        } else {
            return;
        }
        this.f1878o.f1882e = z;
    }
}
