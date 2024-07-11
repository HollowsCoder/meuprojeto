package s2;

import s2.c;

public final class b implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ c f8556o;

    public b(c cVar) {
        this.f8556o = cVar;
    }

    public final void run() {
        c cVar = this.f8556o;
        cVar.getClass();
        while (true) {
            try {
                cVar.b((c.a) cVar.f8565c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
