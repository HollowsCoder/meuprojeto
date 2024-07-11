package k9;

import java.io.IOException;
import w9.f;
import w9.k;
import w9.z;
import y8.l;
import z8.g;

public final class i extends k {

    /* renamed from: p  reason: collision with root package name */
    public boolean f6768p;

    /* renamed from: q  reason: collision with root package name */
    public final l<IOException, n8.i> f6769q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(z zVar, l<? super IOException, n8.i> lVar) {
        super(zVar);
        g.f(zVar, "delegate");
        this.f6769q = lVar;
    }

    public final void H(f fVar, long j8) {
        g.f(fVar, "source");
        if (this.f6768p) {
            fVar.skip(j8);
            return;
        }
        try {
            super.H(fVar, j8);
        } catch (IOException e10) {
            this.f6768p = true;
            this.f6769q.k(e10);
        }
    }

    public final void close() {
        if (!this.f6768p) {
            try {
                super.close();
            } catch (IOException e10) {
                this.f6768p = true;
                this.f6769q.k(e10);
            }
        }
    }

    public final void flush() {
        if (!this.f6768p) {
            try {
                super.flush();
            } catch (IOException e10) {
                this.f6768p = true;
                this.f6769q.k(e10);
            }
        }
    }
}
