package w9;

import java.io.IOException;
import n8.i;
import p9.u;
import z8.g;

public final class c implements z {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b f9317o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ z f9318p;

    public c(a0 a0Var, s sVar) {
        this.f9317o = a0Var;
        this.f9318p = sVar;
    }

    public final void H(f fVar, long j8) {
        g.f(fVar, "source");
        u.d(fVar.f9325p, 0, j8);
        while (true) {
            long j10 = 0;
            if (j8 > 0) {
                w wVar = fVar.f9324o;
                while (true) {
                    g.c(wVar);
                    if (j10 >= ((long) 65536)) {
                        break;
                    }
                    j10 += (long) (wVar.f9367c - wVar.f9366b);
                    if (j10 >= j8) {
                        j10 = j8;
                        break;
                    }
                    wVar = wVar.f9369f;
                }
                b bVar = this.f9317o;
                bVar.h();
                try {
                    this.f9318p.H(fVar, j10);
                    i iVar = i.f7501a;
                    if (!bVar.i()) {
                        j8 -= j10;
                    } else {
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
            } else {
                return;
            }
        }
    }

    public final void close() {
        b bVar = this.f9317o;
        bVar.h();
        try {
            this.f9318p.close();
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

    public final void flush() {
        b bVar = this.f9317o;
        bVar.h();
        try {
            this.f9318p.flush();
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
        return this.f9317o;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f9318p + ')';
    }
}
