package w9;

import f9.d;
import java.security.MessageDigest;
import p9.u;
import s6.a;
import z8.g;

public final class y extends j {

    /* renamed from: s  reason: collision with root package name */
    public final transient byte[][] f9374s;

    /* renamed from: t  reason: collision with root package name */
    public final transient int[] f9375t;

    public y(byte[][] bArr, int[] iArr) {
        super(j.f9328r.f9331q);
        this.f9374s = bArr;
        this.f9375t = iArr;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (jVar.k() != k() || !q(jVar, k())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String g() {
        throw null;
    }

    public final int hashCode() {
        int i10 = this.f9329o;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f9374s;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f9375t;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr2 = bArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f9329o = i12;
        return i12;
    }

    public final j i(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        byte[][] bArr = this.f9374s;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f9375t;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            instance.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = instance.digest();
        g.e(digest, "digest.digest()");
        return new j(digest);
    }

    public final int k() {
        return this.f9375t[this.f9374s.length - 1];
    }

    public final String l() {
        return new j(u()).l();
    }

    public final byte[] n() {
        return u();
    }

    public final byte o(int i10) {
        byte[][] bArr = this.f9374s;
        int[] iArr = this.f9375t;
        u.d((long) iArr[bArr.length - 1], (long) i10, 1);
        int H = a.H(this, i10);
        return bArr[H][(i10 - (H == 0 ? 0 : iArr[H - 1])) + iArr[bArr.length + H]];
    }

    public final boolean p(int i10, byte[] bArr, int i11, int i12) {
        int i13;
        g.f(bArr, "other");
        if (i10 < 0 || i10 > k() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int H = a.H(this, i10);
        while (i10 < i14) {
            int[] iArr = this.f9375t;
            if (H == 0) {
                i13 = 0;
            } else {
                i13 = iArr[H - 1];
            }
            byte[][] bArr2 = this.f9374s;
            int i15 = iArr[bArr2.length + H];
            int min = Math.min(i14, (iArr[H] - i13) + i13) - i10;
            if (!u.c((i10 - i13) + i15, i11, min, bArr2[H], bArr)) {
                return false;
            }
            i11 += min;
            i10 += min;
            H++;
        }
        return true;
    }

    public final boolean q(j jVar, int i10) {
        int i11;
        g.f(jVar, "other");
        if (k() - i10 < 0) {
            return false;
        }
        int i12 = i10 + 0;
        int H = a.H(this, 0);
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int[] iArr = this.f9375t;
            if (H == 0) {
                i11 = 0;
            } else {
                i11 = iArr[H - 1];
            }
            byte[][] bArr = this.f9374s;
            int i15 = iArr[bArr.length + H];
            int min = Math.min(i12, (iArr[H] - i11) + i11) - i13;
            if (!jVar.p(i14, bArr[H], (i13 - i11) + i15, min)) {
                return false;
            }
            i14 += min;
            i13 += min;
            H++;
        }
        return true;
    }

    public final j r() {
        return new j(u()).r();
    }

    public final void t(f fVar, int i10) {
        int i11;
        g.f(fVar, "buffer");
        int i12 = i10 + 0;
        int H = a.H(this, 0);
        int i13 = 0;
        while (i13 < i12) {
            int[] iArr = this.f9375t;
            if (H == 0) {
                i11 = 0;
            } else {
                i11 = iArr[H - 1];
            }
            byte[][] bArr = this.f9374s;
            int i14 = iArr[bArr.length + H];
            int min = Math.min(i12, (iArr[H] - i11) + i11) - i13;
            int i15 = (i13 - i11) + i14;
            w wVar = new w(bArr[H], i15, i15 + min, true);
            w wVar2 = fVar.f9324o;
            if (wVar2 == null) {
                wVar.f9370g = wVar;
                wVar.f9369f = wVar;
                fVar.f9324o = wVar;
            } else {
                w wVar3 = wVar2.f9370g;
                g.c(wVar3);
                wVar3.b(wVar);
            }
            i13 += min;
            H++;
        }
        fVar.f9325p += (long) k();
    }

    public final String toString() {
        return new j(u()).toString();
    }

    public final byte[] u() {
        byte[] bArr = new byte[k()];
        byte[][] bArr2 = this.f9374s;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f9375t;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            d.N(i12, i13, i13 + i15, bArr2[i10], bArr);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }
}
