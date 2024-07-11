package f8;

import m5.h;
import m5.i;
import m5.l;

public final /* synthetic */ class c implements h {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ d f4899o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f4900p = true;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ e f4901q;

    public /* synthetic */ c(d dVar, e eVar) {
        this.f4899o = dVar;
        this.f4901q = eVar;
    }

    public final i i(Object obj) {
        d dVar = this.f4899o;
        boolean z = this.f4900p;
        e eVar = this.f4901q;
        Void voidR = (Void) obj;
        if (z) {
            synchronized (dVar) {
                dVar.f4905c = l.e(eVar);
            }
        } else {
            dVar.getClass();
        }
        return l.e(eVar);
    }
}
