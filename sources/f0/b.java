package f0;

import a0.d;
import b0.e;
import s6.a;

public final class b implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ a f4554o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f4555p;

    public b(a aVar, int i10) {
        this.f4554o = aVar;
        this.f4555p = i10;
    }

    public final void run() {
        d.c cVar = ((e.a) this.f4554o).S;
        if (cVar != null) {
            cVar.c(this.f4555p);
        }
    }
}
