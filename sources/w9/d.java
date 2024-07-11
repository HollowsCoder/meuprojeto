package w9;

import java.io.IOException;
import n8.i;
import z8.g;

public final class d implements b0 {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b f9322o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ b0 f9323p;

    public d(a0 a0Var, p pVar) {
        this.f9322o = a0Var;
        this.f9323p = pVar;
    }

    public final void close() {
        b bVar = this.f9322o;
        bVar.h();
        try {
            this.f9323p.close();
            i iVar = i.f7501a;
            if (bVar.i()) {
                throw bVar.j((IOException) null);
            }
        } catch (IOException e10) {
            e = e10;
            if (bVar.i()) {
                e = bVar.j(e);
            }
            throw e;
        } finally {
            boolean i10 = bVar.i();
        }
    }

    public final c0 h() {
        return this.f9322o;
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.f9323p + ')';
    }

    public final long w(f fVar, long j8) {
        g.f(fVar, "sink");
        b bVar = this.f9322o;
        bVar.h();
        try {
            long w = this.f9323p.w(fVar, j8);
            if (!bVar.i()) {
                return w;
            }
            throw bVar.j((IOException) null);
        } catch (IOException e10) {
            e = e10;
            if (bVar.i()) {
                e = bVar.j(e);
            }
            throw e;
        } finally {
            boolean i10 = bVar.i();
        }
    }
}
