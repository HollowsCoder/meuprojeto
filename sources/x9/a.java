package x9;

import w9.f;
import w9.r;
import w9.w;
import z8.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f9522a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(f9.a.f4927b);
        g.e(bytes, "(this as java.lang.String).getBytes(charset)");
        f9522a = bytes;
    }

    public static final String a(f fVar, long j8) {
        g.f(fVar, "$this$readUtf8Line");
        if (j8 > 0) {
            long j10 = j8 - 1;
            if (fVar.n(j10) == ((byte) 13)) {
                String C = fVar.C(j10);
                fVar.skip(2);
                return C;
            }
        }
        String C2 = fVar.C(j8);
        fVar.skip(1);
        return C2;
    }

    public static final int b(f fVar, r rVar, boolean z) {
        int i10;
        int i11;
        byte[] bArr;
        w wVar;
        int i12;
        f fVar2 = fVar;
        r rVar2 = rVar;
        g.f(fVar2, "$this$selectPrefix");
        g.f(rVar2, "options");
        w wVar2 = fVar2.f9324o;
        int i13 = -2;
        if (wVar2 == null) {
            return z ? -2 : -1;
        }
        int i14 = wVar2.f9366b;
        int i15 = wVar2.f9367c;
        byte[] bArr2 = wVar2.f9365a;
        w wVar3 = wVar2;
        int i16 = -1;
        int i17 = 0;
        loop0:
        while (true) {
            int i18 = i17 + 1;
            int[] iArr = rVar2.f9349p;
            int i19 = iArr[i17];
            int i20 = i18 + 1;
            int i21 = iArr[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (wVar3 == null) {
                break;
            }
            if (i19 < 0) {
                int i22 = (i19 * -1) + i20;
                while (true) {
                    int i23 = i14 + 1;
                    int i24 = i20 + 1;
                    if ((bArr2[i14] & 255) != iArr[i20]) {
                        return i16;
                    }
                    boolean z10 = i24 == i22;
                    if (i23 == i15) {
                        g.c(wVar3);
                        w wVar4 = wVar3.f9369f;
                        g.c(wVar4);
                        i12 = wVar4.f9366b;
                        int i25 = wVar4.f9367c;
                        bArr = wVar4.f9365a;
                        if (wVar4 != wVar2) {
                            int i26 = i25;
                            wVar = wVar4;
                            i15 = i26;
                        } else if (!z10) {
                            break loop0;
                        } else {
                            i15 = i25;
                            wVar = null;
                        }
                    } else {
                        w wVar5 = wVar3;
                        bArr = bArr2;
                        i12 = i23;
                        wVar = wVar5;
                    }
                    if (z10) {
                        i10 = iArr[i24];
                        i11 = i12;
                        bArr2 = bArr;
                        wVar3 = wVar;
                        break;
                    }
                    i14 = i12;
                    bArr2 = bArr;
                    i20 = i24;
                    wVar3 = wVar;
                }
            } else {
                int i27 = i14 + 1;
                byte b10 = bArr2[i14] & 255;
                int i28 = i20 + i19;
                while (i20 != i28) {
                    if (b10 == iArr[i20]) {
                        i10 = iArr[i20 + i19];
                        if (i27 == i15) {
                            wVar3 = wVar3.f9369f;
                            g.c(wVar3);
                            i11 = wVar3.f9366b;
                            i15 = wVar3.f9367c;
                            bArr2 = wVar3.f9365a;
                            if (wVar3 == wVar2) {
                                wVar3 = null;
                            }
                        } else {
                            i11 = i27;
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            if (i10 >= 0) {
                return i10;
            }
            i17 = -i10;
            i14 = i11;
            i13 = -2;
        }
        return z ? i13 : i16;
    }
}
