package l9;

import java.util.logging.Level;
import n8.i;
import s6.a;
import z8.g;

public final class e implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ d f7004o;

    public e(d dVar) {
        this.f7004o = dVar;
    }

    public final void run() {
        a c10;
        long j8;
        while (true) {
            synchronized (this.f7004o) {
                c10 = this.f7004o.c();
            }
            if (c10 != null) {
                c cVar = c10.f6986a;
                g.c(cVar);
                d dVar = d.f6995h;
                boolean isLoggable = d.f6996i.isLoggable(Level.FINE);
                if (isLoggable) {
                    j8 = cVar.f6993e.f7002g.a();
                    a.h(c10, cVar, "starting");
                } else {
                    j8 = -1;
                }
                try {
                    d.a(this.f7004o, c10);
                    i iVar = i.f7501a;
                    if (isLoggable) {
                        a.h(c10, cVar, "finished run in ".concat(a.w(cVar.f6993e.f7002g.a() - j8)));
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        a.h(c10, cVar, "failed a run in ".concat(a.w(cVar.f6993e.f7002g.a() - j8)));
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
