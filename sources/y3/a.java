package y3;

import java.util.logging.Logger;
import q3.h;
import t3.j;
import t3.n;
import t3.s;
import u3.m;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ c f9535o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ s f9536p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ h f9537q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ n f9538r;

    public /* synthetic */ a(c cVar, j jVar, h hVar, t3.h hVar2) {
        this.f9535o = cVar;
        this.f9536p = jVar;
        this.f9537q = hVar;
        this.f9538r = hVar2;
    }

    public final void run() {
        s sVar = this.f9536p;
        h hVar = this.f9537q;
        n nVar = this.f9538r;
        c cVar = this.f9535o;
        cVar.getClass();
        Logger logger = c.f9542f;
        try {
            m a10 = cVar.f9545c.a(sVar.b());
            if (a10 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{sVar.b()});
                logger.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            cVar.f9546e.c(new b(cVar, sVar, (n) a10.a(nVar)));
            hVar.a((Exception) null);
        } catch (Exception e10) {
            logger.warning("Error scheduling event " + e10.getMessage());
            hVar.a(e10);
        }
    }
}
