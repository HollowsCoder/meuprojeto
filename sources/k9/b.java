package k9;

import i9.c;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import w9.b0;
import w9.c0;
import w9.f;
import w9.h;
import w9.i;
import w9.u;
import z8.g;

public final class b implements b0 {

    /* renamed from: o  reason: collision with root package name */
    public boolean f6731o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ i f6732p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ c f6733q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ h f6734r;

    public b(i iVar, c.d dVar, u uVar) {
        this.f6732p = iVar;
        this.f6733q = dVar;
        this.f6734r = uVar;
    }

    public final void close() {
        if (!this.f6731o && !j9.c.g(this, TimeUnit.MILLISECONDS)) {
            this.f6731o = true;
            this.f6733q.a();
        }
        this.f6732p.close();
    }

    public final c0 h() {
        return this.f6732p.h();
    }

    public final long w(f fVar, long j8) {
        g.f(fVar, "sink");
        try {
            long w = this.f6732p.w(fVar, j8);
            int i10 = (w > -1 ? 1 : (w == -1 ? 0 : -1));
            h hVar = this.f6734r;
            if (i10 == 0) {
                if (!this.f6731o) {
                    this.f6731o = true;
                    hVar.close();
                }
                return -1;
            }
            fVar.l(hVar.e(), fVar.f9325p - w, w);
            hVar.P();
            return w;
        } catch (IOException e10) {
            if (!this.f6731o) {
                this.f6731o = true;
                this.f6733q.a();
            }
            throw e10;
        }
    }
}
