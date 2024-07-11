package n9;

import i9.c0;
import i9.s;
import i9.x;
import java.util.List;
import m9.c;
import m9.e;
import m9.h;
import z8.g;

public final class f implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public int f7507a;

    /* renamed from: b  reason: collision with root package name */
    public final e f7508b;

    /* renamed from: c  reason: collision with root package name */
    public final List<s> f7509c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final c f7510e;

    /* renamed from: f  reason: collision with root package name */
    public final x f7511f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7512g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7513h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7514i;

    public f(e eVar, List<? extends s> list, int i10, c cVar, x xVar, int i11, int i12, int i13) {
        g.f(eVar, "call");
        g.f(list, "interceptors");
        g.f(xVar, "request");
        this.f7508b = eVar;
        this.f7509c = list;
        this.d = i10;
        this.f7510e = cVar;
        this.f7511f = xVar;
        this.f7512g = i11;
        this.f7513h = i12;
        this.f7514i = i13;
    }

    public static f d(f fVar, int i10, c cVar, x xVar, int i11) {
        int i12;
        int i13;
        int i14;
        if ((i11 & 1) != 0) {
            i10 = fVar.d;
        }
        int i15 = i10;
        if ((i11 & 2) != 0) {
            cVar = fVar.f7510e;
        }
        c cVar2 = cVar;
        if ((i11 & 4) != 0) {
            xVar = fVar.f7511f;
        }
        x xVar2 = xVar;
        if ((i11 & 8) != 0) {
            i12 = fVar.f7512g;
        } else {
            i12 = 0;
        }
        if ((i11 & 16) != 0) {
            i13 = fVar.f7513h;
        } else {
            i13 = 0;
        }
        if ((i11 & 32) != 0) {
            i14 = fVar.f7514i;
        } else {
            i14 = 0;
        }
        fVar.getClass();
        g.f(xVar2, "request");
        return new f(fVar.f7508b, fVar.f7509c, i15, cVar2, xVar2, i12, i13, i14);
    }

    public final x a() {
        return this.f7511f;
    }

    public final c0 b(x xVar) {
        boolean z;
        boolean z10;
        boolean z11;
        g.f(xVar, "request");
        List<s> list = this.f7509c;
        int size = list.size();
        boolean z12 = false;
        int i10 = this.d;
        if (i10 < size) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f7507a++;
            c cVar = this.f7510e;
            if (cVar != null) {
                if (cVar.f7214e.b(xVar.f6366b)) {
                    if (this.f7507a == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must retain the same host and port").toString());
                }
            }
            int i11 = i10 + 1;
            f d10 = d(this, i11, (c) null, xVar, 58);
            s sVar = list.get(i10);
            c0 a10 = sVar.a(d10);
            if (a10 != null) {
                if (cVar != null) {
                    if (i11 >= list.size() || d10.f7507a == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new IllegalStateException(("network interceptor " + sVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a10.f6196v != null) {
                    z12 = true;
                }
                if (z12) {
                    return a10;
                }
                throw new IllegalStateException(("interceptor " + sVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + sVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final h c() {
        c cVar = this.f7510e;
        if (cVar != null) {
            return cVar.f7212b;
        }
        return null;
    }
}
