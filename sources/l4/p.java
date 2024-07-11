package l4;

import k4.a;

public final class p implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ o f6933o;

    public p(o oVar) {
        this.f6933o = oVar;
    }

    public final void run() {
        a.e eVar = this.f6933o.f6932a.f6894b;
        eVar.c(eVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
