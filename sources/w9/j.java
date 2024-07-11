package w9;

import f9.d;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import p9.u;
import z8.g;

public class j implements Serializable, Comparable<j> {

    /* renamed from: r  reason: collision with root package name */
    public static final j f9328r = new j(new byte[0]);

    /* renamed from: o  reason: collision with root package name */
    public transient int f9329o;

    /* renamed from: p  reason: collision with root package name */
    public transient String f9330p;

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f9331q;

    public static final class a {
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
            r5 = r0 - 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static w9.j a(java.lang.String r14) {
            /*
                java.lang.String r0 = "$this$decodeBase64"
                z8.g.f(r14, r0)
                byte[] r0 = w9.a.f9309a
                int r0 = r14.length()
            L_0x000b:
                r1 = 9
                r2 = 32
                r3 = 13
                r4 = 10
                if (r0 <= 0) goto L_0x002a
                int r5 = r0 + -1
                char r6 = r14.charAt(r5)
                r7 = 61
                if (r6 == r7) goto L_0x0028
                if (r6 == r4) goto L_0x0028
                if (r6 == r3) goto L_0x0028
                if (r6 == r2) goto L_0x0028
                if (r6 == r1) goto L_0x0028
                goto L_0x002a
            L_0x0028:
                r0 = r5
                goto L_0x000b
            L_0x002a:
                long r5 = (long) r0
                r7 = 6
                long r5 = r5 * r7
                r7 = 8
                long r5 = r5 / r7
                int r5 = (int) r5
                byte[] r6 = new byte[r5]
                r7 = 0
                r8 = r7
                r9 = r8
                r10 = r9
            L_0x0038:
                r11 = 0
                if (r7 >= r0) goto L_0x00a3
                char r12 = r14.charAt(r7)
                r13 = 65
                if (r13 <= r12) goto L_0x0044
                goto L_0x004b
            L_0x0044:
                r13 = 90
                if (r13 < r12) goto L_0x004b
                int r12 = r12 + -65
                goto L_0x0083
            L_0x004b:
                r13 = 97
                if (r13 <= r12) goto L_0x0050
                goto L_0x0057
            L_0x0050:
                r13 = 122(0x7a, float:1.71E-43)
                if (r13 < r12) goto L_0x0057
                int r12 = r12 + -71
                goto L_0x0083
            L_0x0057:
                r13 = 48
                if (r13 <= r12) goto L_0x005c
                goto L_0x0063
            L_0x005c:
                r13 = 57
                if (r13 < r12) goto L_0x0063
                int r12 = r12 + 4
                goto L_0x0083
            L_0x0063:
                r13 = 43
                if (r12 == r13) goto L_0x0081
                r13 = 45
                if (r12 != r13) goto L_0x006c
                goto L_0x0081
            L_0x006c:
                r13 = 47
                if (r12 == r13) goto L_0x007e
                r13 = 95
                if (r12 != r13) goto L_0x0075
                goto L_0x007e
            L_0x0075:
                if (r12 == r4) goto L_0x00a0
                if (r12 == r3) goto L_0x00a0
                if (r12 == r2) goto L_0x00a0
                if (r12 != r1) goto L_0x00d7
                goto L_0x00a0
            L_0x007e:
                r12 = 63
                goto L_0x0083
            L_0x0081:
                r12 = 62
            L_0x0083:
                int r9 = r9 << 6
                r9 = r9 | r12
                int r8 = r8 + 1
                int r11 = r8 % 4
                if (r11 != 0) goto L_0x00a0
                int r11 = r10 + 1
                int r12 = r9 >> 16
                byte r12 = (byte) r12
                r6[r10] = r12
                int r10 = r11 + 1
                int r12 = r9 >> 8
                byte r12 = (byte) r12
                r6[r11] = r12
                int r11 = r10 + 1
                byte r12 = (byte) r9
                r6[r10] = r12
                r10 = r11
            L_0x00a0:
                int r7 = r7 + 1
                goto L_0x0038
            L_0x00a3:
                int r8 = r8 % 4
                r14 = 1
                if (r8 == r14) goto L_0x00d7
                r14 = 2
                if (r8 == r14) goto L_0x00c0
                r14 = 3
                if (r8 == r14) goto L_0x00af
                goto L_0x00ca
            L_0x00af:
                int r14 = r9 << 6
                int r0 = r10 + 1
                int r1 = r14 >> 16
                byte r1 = (byte) r1
                r6[r10] = r1
                int r10 = r0 + 1
                int r14 = r14 >> 8
                byte r14 = (byte) r14
                r6[r0] = r14
                goto L_0x00ca
            L_0x00c0:
                int r14 = r9 << 12
                int r0 = r10 + 1
                int r14 = r14 >> 16
                byte r14 = (byte) r14
                r6[r10] = r14
                r10 = r0
            L_0x00ca:
                if (r10 != r5) goto L_0x00cd
                goto L_0x00d8
            L_0x00cd:
                byte[] r6 = java.util.Arrays.copyOf(r6, r10)
                java.lang.String r14 = "java.util.Arrays.copyOf(this, newSize)"
                z8.g.e(r6, r14)
                goto L_0x00d8
            L_0x00d7:
                r6 = r11
            L_0x00d8:
                if (r6 == 0) goto L_0x00df
                w9.j r11 = new w9.j
                r11.<init>(r6)
            L_0x00df:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: w9.j.a.a(java.lang.String):w9.j");
        }

        public static j b(String str) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    bArr[i10] = (byte) (u.a(str.charAt(i11 + 1)) + (u.a(str.charAt(i11)) << 4));
                }
                return new j(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }

        public static j c(String str) {
            g.f(str, "$this$encodeUtf8");
            byte[] bytes = str.getBytes(f9.a.f4927b);
            g.e(bytes, "(this as java.lang.String).getBytes(charset)");
            j jVar = new j(bytes);
            jVar.f9330p = str;
            return jVar;
        }

        public static j d(byte[] bArr) {
            j jVar = j.f9328r;
            int length = bArr.length;
            u.d((long) bArr.length, (long) 0, (long) length);
            return new j(d.P(bArr, 0, length + 0));
        }
    }

    static {
        new a();
    }

    public j(byte[] bArr) {
        g.f(bArr, "data");
        this.f9331q = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            w9.j r8 = (w9.j) r8
            java.lang.String r0 = "other"
            z8.g.f(r8, r0)
            int r0 = r7.k()
            int r1 = r8.k()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0015:
            if (r4 >= r2) goto L_0x002b
            byte r5 = r7.o(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.o(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0028:
            if (r5 >= r6) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = -1
            goto L_0x0033
        L_0x0032:
            r3 = 1
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.j.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int k10 = jVar.k();
            byte[] bArr = this.f9331q;
            if (k10 == bArr.length && jVar.p(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        byte[] bArr = a.f9309a;
        byte[] bArr2 = this.f9331q;
        g.f(bArr2, "$this$encodeBase64");
        g.f(bArr, "map");
        byte[] bArr3 = new byte[(((bArr2.length + 2) / 3) * 4)];
        int length = bArr2.length - (bArr2.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr2[i10];
            int i13 = i12 + 1;
            byte b11 = bArr2[i12];
            int i14 = i13 + 1;
            byte b12 = bArr2[i13];
            int i15 = i11 + 1;
            bArr3[i11] = bArr[(b10 & 255) >> 2];
            int i16 = i15 + 1;
            bArr3[i15] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i17 = i16 + 1;
            bArr3[i16] = bArr[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i17 + 1;
            bArr3[i17] = bArr[b12 & 63];
            i10 = i14;
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b13 = bArr2[i10];
            int i18 = i11 + 1;
            bArr3[i11] = bArr[(b13 & 255) >> 2];
            int i19 = i18 + 1;
            bArr3[i18] = bArr[(b13 & 3) << 4];
            byte b14 = (byte) 61;
            bArr3[i19] = b14;
            bArr3[i19 + 1] = b14;
        } else if (length2 == 2) {
            int i20 = i10 + 1;
            byte b15 = bArr2[i10];
            byte b16 = bArr2[i20];
            int i21 = i11 + 1;
            bArr3[i11] = bArr[(b15 & 255) >> 2];
            int i22 = i21 + 1;
            bArr3[i21] = bArr[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr3[i22] = bArr[(b16 & 15) << 2];
            bArr3[i22 + 1] = (byte) 61;
        }
        return new String(bArr3, f9.a.f4927b);
    }

    public int hashCode() {
        int i10 = this.f9329o;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.f9331q);
        this.f9329o = hashCode;
        return hashCode;
    }

    public j i(String str) {
        byte[] digest = MessageDigest.getInstance(str).digest(this.f9331q);
        g.e(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new j(digest);
    }

    public int k() {
        return this.f9331q.length;
    }

    public String l() {
        byte[] bArr = this.f9331q;
        char[] cArr = new char[(bArr.length * 2)];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = u.f8110i0;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] n() {
        return this.f9331q;
    }

    public byte o(int i10) {
        return this.f9331q[i10];
    }

    public boolean p(int i10, byte[] bArr, int i11, int i12) {
        g.f(bArr, "other");
        if (i10 >= 0) {
            byte[] bArr2 = this.f9331q;
            return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && u.c(i10, i11, i12, bArr2, bArr);
        }
    }

    public boolean q(j jVar, int i10) {
        g.f(jVar, "other");
        return jVar.p(0, this.f9331q, 0, i10);
    }

    public j r() {
        byte b10;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f9331q;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b11 = bArr[i10];
            byte b12 = (byte) 65;
            if (b11 < b12 || b11 > (b10 = (byte) 90)) {
                i10++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                g.e(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b13 = copyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new j(copyOf);
            }
        }
    }

    public final String s() {
        String str = this.f9330p;
        if (str != null) {
            return str;
        }
        byte[] n10 = n();
        g.f(n10, "$this$toUtf8String");
        String str2 = new String(n10, f9.a.f4927b);
        this.f9330p = str2;
        return str2;
    }

    public void t(f fVar, int i10) {
        g.f(fVar, "buffer");
        fVar.write(this.f9331q, 0, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x011c, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x015b, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x016c, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x017d, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x018c, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01a2, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01aa, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01b1, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x01e8, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x01eb, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0087, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0096, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a1, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00e1, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00f2, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0101, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0113, code lost:
        if (r6 == 64) goto L_0x01ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            byte[] r1 = r0.f9331q
            int r2 = r1.length
            if (r2 != 0) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            if (r2 == 0) goto L_0x0010
            java.lang.String r1 = "[size=0]"
            goto L_0x02a9
        L_0x0010:
            int r2 = r1.length
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0014:
            r9 = 64
            if (r5 >= r2) goto L_0x01ec
            byte r10 = r1[r5]
            r11 = 13
            r12 = 159(0x9f, float:2.23E-43)
            r13 = 127(0x7f, float:1.78E-43)
            r14 = 31
            r4 = 65533(0xfffd, float:9.1831E-41)
            r15 = 65536(0x10000, float:9.18355E-41)
            r3 = 10
            if (r10 < 0) goto L_0x007c
            int r16 = r6 + 1
            if (r6 != r9) goto L_0x0031
            goto L_0x01ec
        L_0x0031:
            if (r10 == r3) goto L_0x0043
            if (r10 == r11) goto L_0x0043
            if (r10 < 0) goto L_0x0039
            if (r14 >= r10) goto L_0x003e
        L_0x0039:
            if (r13 <= r10) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            if (r12 < r10) goto L_0x0040
        L_0x003e:
            r6 = 1
            goto L_0x0041
        L_0x0040:
            r6 = 0
        L_0x0041:
            if (r6 != 0) goto L_0x01eb
        L_0x0043:
            if (r10 != r4) goto L_0x0047
            goto L_0x01eb
        L_0x0047:
            if (r10 >= r15) goto L_0x004b
            r6 = 1
            goto L_0x004c
        L_0x004b:
            r6 = 2
        L_0x004c:
            int r7 = r7 + r6
            int r5 = r5 + 1
        L_0x004f:
            r6 = r16
            if (r5 >= r2) goto L_0x0014
            byte r10 = r1[r5]
            if (r10 < 0) goto L_0x0014
            int r5 = r5 + 1
            int r16 = r6 + 1
            if (r6 != r9) goto L_0x005f
            goto L_0x01ec
        L_0x005f:
            if (r10 == r3) goto L_0x0071
            if (r10 == r11) goto L_0x0071
            if (r10 < 0) goto L_0x0067
            if (r14 >= r10) goto L_0x006c
        L_0x0067:
            if (r13 <= r10) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            if (r12 < r10) goto L_0x006e
        L_0x006c:
            r6 = 1
            goto L_0x006f
        L_0x006e:
            r6 = 0
        L_0x006f:
            if (r6 != 0) goto L_0x01eb
        L_0x0071:
            if (r10 != r4) goto L_0x0075
            goto L_0x01eb
        L_0x0075:
            if (r10 >= r15) goto L_0x0079
            r6 = 1
            goto L_0x007a
        L_0x0079:
            r6 = 2
        L_0x007a:
            int r7 = r7 + r6
            goto L_0x004f
        L_0x007c:
            int r8 = r10 >> 5
            r15 = -2
            r4 = 128(0x80, float:1.794E-43)
            if (r8 != r15) goto L_0x00d3
            int r8 = r5 + 1
            if (r2 > r8) goto L_0x008b
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x008b:
            byte r8 = r1[r8]
            r15 = r8 & 192(0xc0, float:2.69E-43)
            if (r15 != r4) goto L_0x0093
            r15 = 1
            goto L_0x0094
        L_0x0093:
            r15 = 0
        L_0x0094:
            if (r15 != 0) goto L_0x009a
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x009a:
            r8 = r8 ^ 3968(0xf80, float:5.56E-42)
            int r10 = r10 << 6
            r8 = r8 ^ r10
            if (r8 >= r4) goto L_0x00a5
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x00a5:
            int r4 = r6 + 1
            if (r6 != r9) goto L_0x00ab
            goto L_0x01ec
        L_0x00ab:
            if (r8 == r3) goto L_0x00bd
            if (r8 == r11) goto L_0x00bd
            if (r8 < 0) goto L_0x00b3
            if (r14 >= r8) goto L_0x00b8
        L_0x00b3:
            if (r13 <= r8) goto L_0x00b6
            goto L_0x00ba
        L_0x00b6:
            if (r12 < r8) goto L_0x00ba
        L_0x00b8:
            r3 = 1
            goto L_0x00bb
        L_0x00ba:
            r3 = 0
        L_0x00bb:
            if (r3 != 0) goto L_0x01eb
        L_0x00bd:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r8 != r3) goto L_0x00c4
            goto L_0x01eb
        L_0x00c4:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r8 >= r3) goto L_0x00ca
            r15 = 1
            goto L_0x00cb
        L_0x00ca:
            r15 = 2
        L_0x00cb:
            int r7 = r7 + r15
            n8.i r3 = n8.i.f7501a
            int r5 = r5 + 2
            r6 = r4
            goto L_0x0014
        L_0x00d3:
            int r8 = r10 >> 4
            r12 = 55296(0xd800, float:7.7486E-41)
            r13 = 57343(0xdfff, float:8.0355E-41)
            if (r8 != r15) goto L_0x0153
            int r8 = r5 + 2
            if (r2 > r8) goto L_0x00e5
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x00e5:
            int r15 = r5 + 1
            byte r15 = r1[r15]
            r14 = r15 & 192(0xc0, float:2.69E-43)
            if (r14 != r4) goto L_0x00ef
            r14 = 1
            goto L_0x00f0
        L_0x00ef:
            r14 = 0
        L_0x00f0:
            if (r14 != 0) goto L_0x00f6
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x00f6:
            byte r8 = r1[r8]
            r14 = r8 & 192(0xc0, float:2.69E-43)
            if (r14 != r4) goto L_0x00fe
            r4 = 1
            goto L_0x00ff
        L_0x00fe:
            r4 = 0
        L_0x00ff:
            if (r4 != 0) goto L_0x0105
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x0105:
            r4 = -123008(0xfffffffffffe1f80, float:NaN)
            r4 = r4 ^ r8
            int r8 = r15 << 6
            r4 = r4 ^ r8
            int r8 = r10 << 12
            r4 = r4 ^ r8
            r8 = 2048(0x800, float:2.87E-42)
            if (r4 >= r8) goto L_0x0117
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x0117:
            if (r12 <= r4) goto L_0x011a
            goto L_0x0120
        L_0x011a:
            if (r13 < r4) goto L_0x0120
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x0120:
            int r8 = r6 + 1
            if (r6 != r9) goto L_0x0126
            goto L_0x01ec
        L_0x0126:
            if (r4 == r3) goto L_0x013e
            if (r4 == r11) goto L_0x013e
            if (r4 < 0) goto L_0x0130
            r3 = 31
            if (r3 >= r4) goto L_0x0139
        L_0x0130:
            r3 = 127(0x7f, float:1.78E-43)
            if (r3 <= r4) goto L_0x0135
            goto L_0x013b
        L_0x0135:
            r3 = 159(0x9f, float:2.23E-43)
            if (r3 < r4) goto L_0x013b
        L_0x0139:
            r3 = 1
            goto L_0x013c
        L_0x013b:
            r3 = 0
        L_0x013c:
            if (r3 != 0) goto L_0x01eb
        L_0x013e:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r4 != r3) goto L_0x0145
            goto L_0x01eb
        L_0x0145:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r3) goto L_0x014b
            r15 = 1
            goto L_0x014c
        L_0x014b:
            r15 = 2
        L_0x014c:
            int r7 = r7 + r15
            n8.i r3 = n8.i.f7501a
            int r5 = r5 + 3
            goto L_0x01e5
        L_0x0153:
            int r8 = r10 >> 3
            if (r8 != r15) goto L_0x01e8
            int r8 = r5 + 3
            if (r2 > r8) goto L_0x015f
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x015f:
            int r14 = r5 + 1
            byte r14 = r1[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r4) goto L_0x0169
            r15 = 1
            goto L_0x016a
        L_0x0169:
            r15 = 0
        L_0x016a:
            if (r15 != 0) goto L_0x0170
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x0170:
            int r15 = r5 + 2
            byte r15 = r1[r15]
            r11 = r15 & 192(0xc0, float:2.69E-43)
            if (r11 != r4) goto L_0x017a
            r11 = 1
            goto L_0x017b
        L_0x017a:
            r11 = 0
        L_0x017b:
            if (r11 != 0) goto L_0x0181
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x0181:
            byte r8 = r1[r8]
            r11 = r8 & 192(0xc0, float:2.69E-43)
            if (r11 != r4) goto L_0x0189
            r4 = 1
            goto L_0x018a
        L_0x0189:
            r4 = 0
        L_0x018a:
            if (r4 != 0) goto L_0x0190
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x0190:
            r4 = 3678080(0x381f80, float:5.154088E-39)
            r4 = r4 ^ r8
            int r8 = r15 << 6
            r4 = r4 ^ r8
            int r8 = r14 << 12
            r4 = r4 ^ r8
            int r8 = r10 << 18
            r4 = r4 ^ r8
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 <= r8) goto L_0x01a5
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x01a5:
            if (r12 <= r4) goto L_0x01a8
            goto L_0x01ad
        L_0x01a8:
            if (r13 < r4) goto L_0x01ad
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x01ad:
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r8) goto L_0x01b4
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x01b4:
            int r8 = r6 + 1
            if (r6 != r9) goto L_0x01b9
            goto L_0x01ec
        L_0x01b9:
            if (r4 == r3) goto L_0x01d3
            r3 = 13
            if (r4 == r3) goto L_0x01d3
            if (r4 < 0) goto L_0x01c5
            r3 = 31
            if (r3 >= r4) goto L_0x01ce
        L_0x01c5:
            r3 = 127(0x7f, float:1.78E-43)
            if (r3 <= r4) goto L_0x01ca
            goto L_0x01d0
        L_0x01ca:
            r3 = 159(0x9f, float:2.23E-43)
            if (r3 < r4) goto L_0x01d0
        L_0x01ce:
            r3 = 1
            goto L_0x01d1
        L_0x01d0:
            r3 = 0
        L_0x01d1:
            if (r3 != 0) goto L_0x01eb
        L_0x01d3:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r4 != r3) goto L_0x01d9
            goto L_0x01eb
        L_0x01d9:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r3) goto L_0x01df
            r15 = 1
            goto L_0x01e0
        L_0x01df:
            r15 = 2
        L_0x01e0:
            int r7 = r7 + r15
            n8.i r3 = n8.i.f7501a
            int r5 = r5 + 4
        L_0x01e5:
            r6 = r8
            goto L_0x0014
        L_0x01e8:
            if (r6 != r9) goto L_0x01eb
            goto L_0x01ec
        L_0x01eb:
            r7 = -1
        L_0x01ec:
            java.lang.String r2 = "[size="
            r3 = -1
            if (r7 != r3) goto L_0x024f
            int r3 = r1.length
            if (r3 > r9) goto L_0x0204
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[hex="
            r1.<init>(r2)
            java.lang.String r2 = r17.l()
            r1.append(r2)
            goto L_0x02a0
        L_0x0204:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r2 = r1.length
            r3.append(r2)
            java.lang.String r2 = " hex="
            r3.append(r2)
            int r2 = r1.length
            if (r9 > r2) goto L_0x0217
            r4 = 1
            goto L_0x0218
        L_0x0217:
            r4 = 0
        L_0x0218:
            if (r4 == 0) goto L_0x0231
            int r2 = r1.length
            if (r9 != r2) goto L_0x021f
            r2 = r0
            goto L_0x0229
        L_0x021f:
            w9.j r2 = new w9.j
            r4 = 0
            byte[] r1 = f9.d.P(r1, r4, r9)
            r2.<init>(r1)
        L_0x0229:
            java.lang.String r1 = r2.l()
            r3.append(r1)
            goto L_0x028c
        L_0x0231:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "endIndex > length("
            r2.<init>(r3)
            int r1 = r1.length
            r2.append(r1)
            r1 = 41
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x024f:
            java.lang.String r3 = r17.s()
            r4 = 0
            java.lang.String r4 = r3.substring(r4, r7)
            java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            z8.g.e(r4, r5)
            java.lang.String r5 = "\\"
            java.lang.String r6 = "\\\\"
            java.lang.String r4 = f9.h.Y(r4, r5, r6)
            java.lang.String r5 = "\n"
            java.lang.String r6 = "\\n"
            java.lang.String r4 = f9.h.Y(r4, r5, r6)
            java.lang.String r5 = "\r"
            java.lang.String r6 = "\\r"
            java.lang.String r4 = f9.h.Y(r4, r5, r6)
            int r3 = r3.length()
            if (r7 >= r3) goto L_0x0296
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r1 = r1.length
            r3.append(r1)
            java.lang.String r1 = " text="
            r3.append(r1)
            r3.append(r4)
        L_0x028c:
            java.lang.String r1 = "…]"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L_0x02a9
        L_0x0296:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[text="
            r1.<init>(r2)
            r1.append(r4)
        L_0x02a0:
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x02a9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.j.toString():java.lang.String");
    }
}
