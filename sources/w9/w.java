package w9;

import f9.d;
import z8.g;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f9365a;

    /* renamed from: b  reason: collision with root package name */
    public int f9366b;

    /* renamed from: c  reason: collision with root package name */
    public int f9367c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9368e;

    /* renamed from: f  reason: collision with root package name */
    public w f9369f;

    /* renamed from: g  reason: collision with root package name */
    public w f9370g;

    public w() {
        this.f9365a = new byte[8192];
        this.f9368e = true;
        this.d = false;
    }

    public w(byte[] bArr, int i10, int i11, boolean z) {
        g.f(bArr, "data");
        this.f9365a = bArr;
        this.f9366b = i10;
        this.f9367c = i11;
        this.d = z;
        this.f9368e = false;
    }

    public final w a() {
        w wVar = this.f9369f;
        if (wVar == this) {
            wVar = null;
        }
        w wVar2 = this.f9370g;
        g.c(wVar2);
        wVar2.f9369f = this.f9369f;
        w wVar3 = this.f9369f;
        g.c(wVar3);
        wVar3.f9370g = this.f9370g;
        this.f9369f = null;
        this.f9370g = null;
        return wVar;
    }

    public final void b(w wVar) {
        wVar.f9370g = this;
        wVar.f9369f = this.f9369f;
        w wVar2 = this.f9369f;
        g.c(wVar2);
        wVar2.f9370g = wVar;
        this.f9369f = wVar;
    }

    public final w c() {
        this.d = true;
        return new w(this.f9365a, this.f9366b, this.f9367c, true);
    }

    public final void d(w wVar, int i10) {
        if (wVar.f9368e) {
            int i11 = wVar.f9367c;
            int i12 = i11 + i10;
            byte[] bArr = wVar.f9365a;
            if (i12 > 8192) {
                if (!wVar.d) {
                    int i13 = wVar.f9366b;
                    if (i12 - i13 <= 8192) {
                        d.N(0, i13, i11, bArr, bArr);
                        wVar.f9367c -= wVar.f9366b;
                        wVar.f9366b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i14 = wVar.f9367c;
            int i15 = this.f9366b;
            d.N(i14, i15, i15 + i10, this.f9365a, bArr);
            wVar.f9367c += i10;
            this.f9366b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
}
