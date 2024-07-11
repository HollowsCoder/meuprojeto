package p9;

import java.io.IOException;
import l9.a;
import n8.i;
import p9.f;
import z8.g;
import z8.m;

public final class j extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f.d f8032e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f8033f = false;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w f8034g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(String str, f.d dVar, w wVar) {
        super(str, true);
        this.f8032e = dVar;
        this.f8034g = wVar;
    }

    public final long a() {
        int i10;
        long a10;
        r[] rVarArr;
        boolean z;
        f.d dVar = this.f8032e;
        boolean z10 = this.f8033f;
        T t10 = this.f8034g;
        dVar.getClass();
        g.f(t10, "settings");
        m mVar = new m();
        synchronized (f.this.M) {
            synchronized (f.this) {
                try {
                    w wVar = f.this.G;
                    if (!z10) {
                        T wVar2 = new w();
                        g.f(wVar, "other");
                        int i11 = 0;
                        while (true) {
                            boolean z11 = true;
                            if (i11 >= 10) {
                                break;
                            }
                            if (((1 << i11) & wVar.f8121a) == 0) {
                                z11 = false;
                            }
                            if (z11) {
                                wVar2.b(i11, wVar.f8122b[i11]);
                            }
                            i11++;
                        }
                        for (int i12 = 0; i12 < 10; i12++) {
                            if (((1 << i12) & t10.f8121a) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                wVar2.b(i12, t10.f8122b[i12]);
                            }
                        }
                        i iVar = i.f7501a;
                        t10 = wVar2;
                    }
                    mVar.f9971o = t10;
                    a10 = ((long) t10.a()) - ((long) wVar.a());
                    if (a10 != 0) {
                        if (!f.this.f7998q.isEmpty()) {
                            Object[] array = f.this.f7998q.values().toArray(new r[0]);
                            if (array != null) {
                                rVarArr = (r[]) array;
                                f fVar = f.this;
                                w wVar3 = (w) mVar.f9971o;
                                fVar.getClass();
                                g.f(wVar3, "<set-?>");
                                fVar.G = wVar3;
                                f.this.f8004y.c(new g(f.this.f7999r + " onSettings", dVar, mVar), 0);
                                i iVar2 = i.f7501a;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                        }
                    }
                    rVarArr = null;
                    f fVar2 = f.this;
                    w wVar32 = (w) mVar.f9971o;
                    fVar2.getClass();
                    g.f(wVar32, "<set-?>");
                    fVar2.G = wVar32;
                    f.this.f8004y.c(new g(f.this.f7999r + " onSettings", dVar, mVar), 0);
                    i iVar22 = i.f7501a;
                } finally {
                }
            }
            try {
                f.this.M.a((w) mVar.f9971o);
            } catch (IOException e10) {
                f.this.b(e10);
            }
            i iVar3 = i.f7501a;
        }
        if (rVarArr == null) {
            return -1;
        }
        for (r rVar : rVarArr) {
            synchronized (rVar) {
                rVar.d += a10;
                if (a10 > 0) {
                    rVar.notifyAll();
                }
                i iVar4 = i.f7501a;
            }
        }
        return -1;
    }
}
