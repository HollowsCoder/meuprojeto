package m9;

import i9.c0;
import i9.s;
import i9.v;
import i9.x;
import java.io.IOException;
import n8.i;
import n9.f;
import z8.g;

public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7207a = new a();

    public final c0 a(f fVar) {
        e eVar = fVar.f7508b;
        eVar.getClass();
        synchronized (eVar) {
            if (!eVar.z) {
                throw new IllegalStateException("released".toString());
            } else if (!(!eVar.f7243y)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!eVar.f7242x) {
                i iVar = i.f7501a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        d dVar = eVar.f7240t;
        g.c(dVar);
        v vVar = eVar.D;
        g.f(vVar, "client");
        try {
            c cVar = new c(eVar, eVar.f7236p, dVar, dVar.a(fVar.f7512g, fVar.f7513h, fVar.f7514i, vVar.f6343t, !g.a(fVar.f7511f.f6367c, "GET")).j(vVar, fVar));
            eVar.w = cVar;
            eVar.B = cVar;
            synchronized (eVar) {
                eVar.f7242x = true;
                eVar.f7243y = true;
            }
            if (!eVar.A) {
                return f.d(fVar, 0, cVar, (x) null, 61).b(fVar.f7511f);
            }
            throw new IOException("Canceled");
        } catch (k e10) {
            dVar.c(e10.f7272o);
            throw e10;
        } catch (IOException e11) {
            dVar.c(e11);
            throw new k(e11);
        }
    }
}
