package s1;

import com.karumi.dexter.R;
import java.io.EOFException;
import n8.h;
import q2.e;
import s1.a;
import w9.f;
import w9.i;
import w9.j;
import w9.v;

public final class b extends a {
    public static final j A = j.a.c("\"\\");
    public static final j B = j.a.c("{}[]:, \n\t\r\f/\\;#=");
    public static final j z = j.a.c("'\\");

    /* renamed from: t  reason: collision with root package name */
    public final i f8549t;
    public final f u;

    /* renamed from: v  reason: collision with root package name */
    public int f8550v = 0;
    public long w;

    /* renamed from: x  reason: collision with root package name */
    public int f8551x;

    /* renamed from: y  reason: collision with root package name */
    public String f8552y;

    static {
        j jVar = j.f9328r;
        j.a.c("\n\r");
        j.a.c("*/");
    }

    public b(v vVar) {
        this.f8549t = vVar;
        this.u = vVar.f9361o;
        s(6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0193, code lost:
        if (G(r1) != false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0195, code lost:
        if (r4 != 2) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0197, code lost:
        if (r6 == false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x019d, code lost:
        if (r10 != Long.MIN_VALUE) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x019f, code lost:
        if (r7 == false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01a5, code lost:
        if (r10 != 0) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01a7, code lost:
        if (r7 != false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01a9, code lost:
        if (r7 == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01ac, code lost:
        r10 = -r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01ad, code lost:
        r0.w = r10;
        r5.skip((long) r3);
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01b6, code lost:
        if (r4 == 2) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01b9, code lost:
        if (r4 == 4) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01bc, code lost:
        if (r4 != 7) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01be, code lost:
        r0.f8551x = r3;
        r1 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01c2, code lost:
        r8 = r1;
        r0.f8550v = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0110 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int C() {
        /*
            r17 = this;
            r0 = r17
            int[] r1 = r0.f8544p
            int r2 = r0.f8543o
            int r3 = r2 + -1
            r3 = r1[r3]
            r6 = 0
            r7 = 93
            r9 = 59
            r10 = 44
            r11 = 3
            r12 = 6
            r13 = 7
            r14 = 5
            r15 = 2
            r4 = 4
            w9.f r5 = r0.u
            r8 = 1
            if (r3 != r8) goto L_0x0021
            int r2 = r2 - r8
            r1[r2] = r15
        L_0x001f:
            r1 = 0
            goto L_0x007d
        L_0x0021:
            if (r3 != r15) goto L_0x003d
            int r1 = r0.J(r8)
            r5.readByte()
            if (r1 == r10) goto L_0x001f
            if (r1 == r9) goto L_0x0039
            if (r1 != r7) goto L_0x0033
            r0.f8550v = r4
            return r4
        L_0x0033:
            java.lang.String r1 = "Unterminated array"
            r0.y(r1)
            throw r6
        L_0x0039:
            r17.z()
            throw r6
        L_0x003d:
            if (r3 == r11) goto L_0x024f
            if (r3 != r14) goto L_0x0043
            goto L_0x024f
        L_0x0043:
            if (r3 != r4) goto L_0x0061
            int r2 = r2 - r8
            r1[r2] = r14
            int r1 = r0.J(r8)
            r5.readByte()
            r2 = 58
            if (r1 == r2) goto L_0x001f
            r2 = 61
            if (r1 == r2) goto L_0x005d
            java.lang.String r1 = "Expected ':'"
            r0.y(r1)
            throw r6
        L_0x005d:
            r17.z()
            throw r6
        L_0x0061:
            if (r3 != r12) goto L_0x0067
            int r2 = r2 - r8
            r1[r2] = r13
            goto L_0x001f
        L_0x0067:
            r1 = 0
            if (r3 != r13) goto L_0x0079
            int r1 = r0.J(r1)
            r2 = -1
            if (r1 != r2) goto L_0x0075
            r11 = 18
            goto L_0x02a3
        L_0x0075:
            r17.z()
            throw r6
        L_0x0079:
            r2 = 8
            if (r3 == r2) goto L_0x0247
        L_0x007d:
            int r2 = r0.J(r8)
            r1 = 34
            if (r2 == r1) goto L_0x0241
            r1 = 39
            if (r2 == r1) goto L_0x023c
            if (r2 == r10) goto L_0x022a
            if (r2 == r9) goto L_0x022a
            r1 = 91
            if (r2 == r1) goto L_0x0224
            if (r2 == r7) goto L_0x021b
            r1 = 123(0x7b, float:1.72E-43)
            if (r2 == r1) goto L_0x0214
            r1 = 0
            byte r3 = r5.n(r1)
            r7 = 116(0x74, float:1.63E-43)
            w9.i r9 = r0.f8549t
            if (r3 == r7) goto L_0x00c5
            r7 = 84
            if (r3 != r7) goto L_0x00a8
            goto L_0x00c5
        L_0x00a8:
            r7 = 102(0x66, float:1.43E-43)
            if (r3 == r7) goto L_0x00bf
            r7 = 70
            if (r3 != r7) goto L_0x00b1
            goto L_0x00bf
        L_0x00b1:
            r7 = 110(0x6e, float:1.54E-43)
            if (r3 == r7) goto L_0x00b9
            r7 = 78
            if (r3 != r7) goto L_0x0106
        L_0x00b9:
            java.lang.String r3 = "null"
            java.lang.String r7 = "NULL"
            r10 = r13
            goto L_0x00ca
        L_0x00bf:
            java.lang.String r3 = "false"
            java.lang.String r7 = "FALSE"
            r10 = r12
            goto L_0x00ca
        L_0x00c5:
            java.lang.String r3 = "true"
            java.lang.String r7 = "TRUE"
            r10 = r14
        L_0x00ca:
            int r6 = r3.length()
            r13 = r8
        L_0x00cf:
            if (r13 >= r6) goto L_0x00f2
            int r4 = r13 + 1
            long r11 = (long) r4
            boolean r11 = r9.v(r11)
            if (r11 != 0) goto L_0x00db
            goto L_0x0106
        L_0x00db:
            long r11 = (long) r13
            byte r11 = r5.n(r11)
            char r12 = r3.charAt(r13)
            if (r11 == r12) goto L_0x00ed
            char r12 = r7.charAt(r13)
            if (r11 == r12) goto L_0x00ed
            goto L_0x0106
        L_0x00ed:
            r13 = r4
            r4 = 4
            r11 = 3
            r12 = 6
            goto L_0x00cf
        L_0x00f2:
            int r3 = r6 + 1
            long r3 = (long) r3
            boolean r3 = r9.v(r3)
            if (r3 == 0) goto L_0x0108
            long r3 = (long) r6
            byte r3 = r5.n(r3)
            boolean r3 = r0.G(r3)
            if (r3 == 0) goto L_0x0108
        L_0x0106:
            r10 = 0
            goto L_0x010e
        L_0x0108:
            long r3 = (long) r6
            r5.skip(r3)
            r0.f8550v = r10
        L_0x010e:
            if (r10 == 0) goto L_0x0111
            return r10
        L_0x0111:
            r10 = r1
            r6 = r8
            r3 = 0
            r4 = 0
            r7 = 0
        L_0x0116:
            int r12 = r3 + 1
            long r1 = (long) r12
            boolean r1 = r9.v(r1)
            if (r1 != 0) goto L_0x0121
            goto L_0x0195
        L_0x0121:
            long r1 = (long) r3
            byte r1 = r5.n(r1)
            r2 = 43
            if (r1 == r2) goto L_0x01e8
            r2 = 69
            if (r1 == r2) goto L_0x01dc
            r2 = 101(0x65, float:1.42E-43)
            if (r1 == r2) goto L_0x01dc
            r2 = 45
            if (r1 == r2) goto L_0x01cf
            r2 = 46
            if (r1 == r2) goto L_0x01c6
            r2 = 48
            if (r1 < r2) goto L_0x018f
            r2 = 57
            if (r1 <= r2) goto L_0x0143
            goto L_0x018f
        L_0x0143:
            if (r4 == r8) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            goto L_0x0182
        L_0x0148:
            if (r4 != r15) goto L_0x0173
            r2 = 0
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0152
            goto L_0x01f8
        L_0x0152:
            r2 = 10
            long r2 = r2 * r10
            int r1 = r1 + -48
            r16 = r9
            long r8 = (long) r1
            long r2 = r2 - r8
            r8 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x016d
            if (r1 != 0) goto L_0x016b
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x016b
            goto L_0x016d
        L_0x016b:
            r1 = 0
            goto L_0x016e
        L_0x016d:
            r1 = 1
        L_0x016e:
            r1 = r1 & r6
            r6 = r1
            r10 = r2
            r2 = 3
            goto L_0x0179
        L_0x0173:
            r16 = r9
            r2 = 3
            if (r4 != r2) goto L_0x017b
            r4 = 4
        L_0x0179:
            r8 = 6
            goto L_0x018c
        L_0x017b:
            r8 = 6
            if (r4 == r14) goto L_0x0180
            if (r4 != r8) goto L_0x018c
        L_0x0180:
            r4 = 7
            goto L_0x018c
        L_0x0182:
            r16 = r9
            r2 = 3
            r8 = 6
            int r1 = r1 + -48
            int r1 = -r1
            long r3 = (long) r1
            r10 = r3
            r4 = r15
        L_0x018c:
            r1 = 7
            goto L_0x01f0
        L_0x018f:
            boolean r1 = r0.G(r1)
            if (r1 != 0) goto L_0x01f8
        L_0x0195:
            if (r4 != r15) goto L_0x01b6
            if (r6 == 0) goto L_0x01b6
            r1 = -9223372036854775808
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x01a1
            if (r7 == 0) goto L_0x01b6
        L_0x01a1:
            r1 = 0
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x01a9
            if (r7 != 0) goto L_0x01b6
        L_0x01a9:
            if (r7 == 0) goto L_0x01ac
            goto L_0x01ad
        L_0x01ac:
            long r10 = -r10
        L_0x01ad:
            r0.w = r10
            long r1 = (long) r3
            r5.skip(r1)
            r1 = 16
            goto L_0x01c2
        L_0x01b6:
            if (r4 == r15) goto L_0x01be
            r1 = 4
            if (r4 == r1) goto L_0x01be
            r1 = 7
            if (r4 != r1) goto L_0x01f8
        L_0x01be:
            r0.f8551x = r3
            r1 = 17
        L_0x01c2:
            r8 = r1
            r0.f8550v = r8
            goto L_0x01f9
        L_0x01c6:
            r16 = r9
            r1 = 7
            r2 = 3
            r8 = 6
            if (r4 != r15) goto L_0x01f8
            r4 = r2
            goto L_0x01f0
        L_0x01cf:
            r16 = r9
            r1 = 7
            r2 = 3
            r8 = 6
            if (r4 != 0) goto L_0x01d9
            r4 = 1
            r7 = 1
            goto L_0x01f0
        L_0x01d9:
            if (r4 != r14) goto L_0x01f8
            goto L_0x01ef
        L_0x01dc:
            r16 = r9
            r1 = 7
            r2 = 3
            r8 = 6
            if (r4 == r15) goto L_0x01e6
            r3 = 4
            if (r4 != r3) goto L_0x01f8
        L_0x01e6:
            r4 = r14
            goto L_0x01f0
        L_0x01e8:
            r16 = r9
            r1 = 7
            r2 = 3
            r8 = 6
            if (r4 != r14) goto L_0x01f8
        L_0x01ef:
            r4 = r8
        L_0x01f0:
            r3 = r12
            r9 = r16
            r1 = 0
            r8 = 1
            goto L_0x0116
        L_0x01f8:
            r8 = 0
        L_0x01f9:
            if (r8 == 0) goto L_0x01fc
            return r8
        L_0x01fc:
            r1 = 0
            byte r1 = r5.n(r1)
            boolean r1 = r0.G(r1)
            if (r1 != 0) goto L_0x020f
            java.lang.String r1 = "Expected value"
            r0.y(r1)
            r1 = 0
            throw r1
        L_0x020f:
            r1 = 0
            r17.z()
            throw r1
        L_0x0214:
            r5.readByte()
            r1 = 1
            r0.f8550v = r1
            return r1
        L_0x021b:
            r1 = r8
            if (r3 != r1) goto L_0x022b
            r5.readByte()
            r11 = 4
            goto L_0x02a3
        L_0x0224:
            r2 = r11
            r5.readByte()
            goto L_0x02a3
        L_0x022a:
            r1 = r8
        L_0x022b:
            if (r3 == r1) goto L_0x0237
            if (r3 != r15) goto L_0x0230
            goto L_0x0237
        L_0x0230:
            java.lang.String r1 = "Unexpected value"
            r0.y(r1)
            r1 = 0
            throw r1
        L_0x0237:
            r1 = 0
            r17.z()
            throw r1
        L_0x023c:
            r1 = r6
            r17.z()
            throw r1
        L_0x0241:
            r5.readByte()
            r11 = 9
            goto L_0x02a3
        L_0x0247:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x024f:
            r4 = r8
            int r2 = r2 - r4
            r6 = 4
            r1[r2] = r6
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r14) goto L_0x0274
            int r2 = r0.J(r4)
            r5.readByte()
            if (r2 == r10) goto L_0x0272
            if (r2 == r9) goto L_0x026d
            if (r2 != r1) goto L_0x0266
            goto L_0x0288
        L_0x0266:
            java.lang.String r1 = "Unterminated object"
            r0.y(r1)
            r1 = 0
            throw r1
        L_0x026d:
            r1 = 0
            r17.z()
            throw r1
        L_0x0272:
            r2 = 1
            goto L_0x0275
        L_0x0274:
            r2 = r4
        L_0x0275:
            int r2 = r0.J(r2)
            r4 = 34
            if (r2 == r4) goto L_0x029e
            r4 = 39
            if (r2 == r4) goto L_0x0296
            if (r2 != r1) goto L_0x0291
            if (r3 == r14) goto L_0x028a
            r5.readByte()
        L_0x0288:
            r11 = r15
            goto L_0x02a3
        L_0x028a:
            java.lang.String r1 = "Expected name"
            r0.y(r1)
            r1 = 0
            throw r1
        L_0x0291:
            r1 = 0
            r17.z()
            throw r1
        L_0x0296:
            r1 = 0
            r5.readByte()
            r17.z()
            throw r1
        L_0x029e:
            r5.readByte()
            r11 = 13
        L_0x02a3:
            r0.f8550v = r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.b.C():int");
    }

    public final int E(String str, a.C0126a aVar) {
        int length = aVar.f8547a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f8547a[i10])) {
                this.f8550v = 0;
                this.f8545q[this.f8543o - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final boolean G(int i10) {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (!(i10 == 47 || i10 == 61)) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case R.styleable.AppCompatTheme_radioButtonStyle:
                        case R.styleable.AppCompatTheme_ratingBarStyleIndicator:
                            return false;
                        case R.styleable.AppCompatTheme_ratingBarStyle:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        z();
        throw null;
    }

    public final String I() {
        String str;
        int i10 = this.f8550v;
        if (i10 == 0) {
            i10 = C();
        }
        if (i10 == 14) {
            str = S();
        } else if (i10 == 13) {
            str = M(A);
        } else if (i10 == 12) {
            str = M(z);
        } else if (i10 == 15) {
            str = this.f8552y;
        } else {
            throw new h("Expected a name but was " + r() + " at path " + f());
        }
        this.f8550v = 0;
        this.f8545q[this.f8543o - 1] = str;
        return str;
    }

    public final int J(boolean z10) {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            i iVar = this.f8549t;
            if (iVar.v((long) i11)) {
                long j8 = (long) i10;
                f fVar = this.u;
                byte n10 = fVar.n(j8);
                if (n10 == 10 || n10 == 32 || n10 == 13 || n10 == 9) {
                    i10 = i11;
                } else {
                    fVar.skip((long) (i11 - 1));
                    if (n10 == 47) {
                        if (!iVar.v(2)) {
                            return n10;
                        }
                        z();
                        throw null;
                    } else if (n10 != 35) {
                        return n10;
                    } else {
                        z();
                        throw null;
                    }
                }
            } else if (!z10) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public final String M(j jVar) {
        StringBuilder sb = null;
        while (true) {
            long O = this.f8549t.O(jVar);
            if (O != -1) {
                f fVar = this.u;
                if (fVar.n(O) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(fVar.C(O));
                    fVar.readByte();
                    sb.append(T());
                } else {
                    String C = fVar.C(O);
                    if (sb == null) {
                        fVar.readByte();
                        return C;
                    }
                    sb.append(C);
                    fVar.readByte();
                    return sb.toString();
                }
            } else {
                y("Unterminated string");
                throw null;
            }
        }
    }

    public final String S() {
        long O = this.f8549t.O(B);
        int i10 = (O > -1 ? 1 : (O == -1 ? 0 : -1));
        f fVar = this.u;
        return i10 != 0 ? fVar.C(O) : fVar.z();
    }

    public final char T() {
        int i10;
        int i11;
        i iVar = this.f8549t;
        if (iVar.v(1)) {
            f fVar = this.u;
            byte readByte = fVar.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                y("Invalid escape sequence: \\" + ((char) readByte));
                throw null;
            } else if (iVar.v(4)) {
                char c10 = 0;
                for (int i12 = 0; i12 < 4; i12++) {
                    byte n10 = fVar.n((long) i12);
                    char c11 = (char) (c10 << 4);
                    if (n10 < 48 || n10 > 57) {
                        if (n10 >= 97 && n10 <= 102) {
                            i11 = n10 - 97;
                        } else if (n10 < 65 || n10 > 70) {
                            y("\\u".concat(fVar.C(4)));
                            throw null;
                        } else {
                            i11 = n10 - 65;
                        }
                        i10 = i11 + 10;
                    } else {
                        i10 = n10 - 48;
                    }
                    c10 = (char) (i10 + c11);
                }
                fVar.skip(4);
                return c10;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + f());
            }
        } else {
            y("Unterminated escape sequence");
            throw null;
        }
    }

    public final void U(j jVar) {
        while (true) {
            long O = this.f8549t.O(jVar);
            if (O != -1) {
                f fVar = this.u;
                byte n10 = fVar.n(O);
                fVar.skip(O + 1);
                if (n10 == 92) {
                    T();
                } else {
                    return;
                }
            } else {
                y("Unterminated string");
                throw null;
            }
        }
    }

    public final void a() {
        int i10 = this.f8550v;
        if (i10 == 0) {
            i10 = C();
        }
        if (i10 == 3) {
            s(1);
            this.f8546r[this.f8543o - 1] = 0;
            this.f8550v = 0;
            return;
        }
        throw new h("Expected BEGIN_ARRAY but was " + r() + " at path " + f());
    }

    public final void b() {
        int i10 = this.f8550v;
        if (i10 == 0) {
            i10 = C();
        }
        if (i10 == 1) {
            s(3);
            this.f8550v = 0;
            return;
        }
        throw new h("Expected BEGIN_OBJECT but was " + r() + " at path " + f());
    }

    public final void c() {
        int i10 = this.f8550v;
        if (i10 == 0) {
            i10 = C();
        }
        if (i10 == 4) {
            int i11 = this.f8543o - 1;
            this.f8543o = i11;
            int[] iArr = this.f8546r;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f8550v = 0;
            return;
        }
        throw new h("Expected END_ARRAY but was " + r() + " at path " + f());
    }

    public final void close() {
        this.f8550v = 0;
        this.f8544p[0] = 8;
        this.f8543o = 1;
        this.u.c();
        this.f8549t.close();
    }

    public final void d() {
        int i10 = this.f8550v;
        if (i10 == 0) {
            i10 = C();
        }
        if (i10 == 2) {
            int i11 = this.f8543o - 1;
            this.f8543o = i11;
            this.f8545q[i11] = null;
            int[] iArr = this.f8546r;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f8550v = 0;
            return;
        }
        throw new h("Expected END_OBJECT but was " + r() + " at path " + f());
    }

    public final boolean g() {
        int i10 = this.f8550v;
        if (i10 == 0) {
            i10 = C();
        }
        return (i10 == 2 || i10 == 4 || i10 == 18) ? false : true;
    }

    public final boolean j() {
        int i10 = this.f8550v;
        if (i10 == 0) {
            i10 = C();
        }
        if (i10 == 5) {
            this.f8550v = 0;
            int[] iArr = this.f8546r;
            int i11 = this.f8543o - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f8550v = 0;
            int[] iArr2 = this.f8546r;
            int i12 = this.f8543o - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new h("Expected a boolean but was " + r() + " at path " + f());
        }
    }

    public final double l() {
        int i10 = this.f8550v;
        if (i10 == 0) {
            i10 = C();
        }
        if (i10 == 16) {
            this.f8550v = 0;
            int[] iArr = this.f8546r;
            int i11 = this.f8543o - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.w;
        }
        if (i10 == 17) {
            this.f8552y = this.u.C((long) this.f8551x);
        } else if (i10 == 9) {
            this.f8552y = M(A);
        } else if (i10 == 8) {
            this.f8552y = M(z);
        } else if (i10 == 10) {
            this.f8552y = S();
        } else if (i10 != 11) {
            throw new h("Expected a double but was " + r() + " at path " + f());
        }
        this.f8550v = 11;
        try {
            double parseDouble = Double.parseDouble(this.f8552y);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new e("JSON forbids NaN and infinities: " + parseDouble + " at path " + f());
            }
            this.f8552y = null;
            this.f8550v = 0;
            int[] iArr2 = this.f8546r;
            int i12 = this.f8543o - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new h("Expected a double but was " + this.f8552y + " at path " + f());
        }
    }

    public final int n() {
        int i10 = this.f8550v;
        if (i10 == 0) {
            i10 = C();
        }
        if (i10 == 16) {
            long j8 = this.w;
            int i11 = (int) j8;
            if (j8 == ((long) i11)) {
                this.f8550v = 0;
                int[] iArr = this.f8546r;
                int i12 = this.f8543o - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new h("Expected an int but was " + this.w + " at path " + f());
        }
        if (i10 == 17) {
            this.f8552y = this.u.C((long) this.f8551x);
        } else if (i10 == 9 || i10 == 8) {
            String M = i10 == 9 ? M(A) : M(z);
            this.f8552y = M;
            try {
                int parseInt = Integer.parseInt(M);
                this.f8550v = 0;
                int[] iArr2 = this.f8546r;
                int i13 = this.f8543o - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            throw new h("Expected an int but was " + r() + " at path " + f());
        }
        this.f8550v = 11;
        try {
            double parseDouble = Double.parseDouble(this.f8552y);
            int i14 = (int) parseDouble;
            if (((double) i14) == parseDouble) {
                this.f8552y = null;
                this.f8550v = 0;
                int[] iArr3 = this.f8546r;
                int i15 = this.f8543o - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new h("Expected an int but was " + this.f8552y + " at path " + f());
        } catch (NumberFormatException unused2) {
            throw new h("Expected an int but was " + this.f8552y + " at path " + f());
        }
    }

    public final String o() {
        String str;
        int i10 = this.f8550v;
        if (i10 == 0) {
            i10 = C();
        }
        if (i10 == 10) {
            str = S();
        } else if (i10 == 9) {
            str = M(A);
        } else if (i10 == 8) {
            str = M(z);
        } else if (i10 == 11) {
            str = this.f8552y;
            this.f8552y = null;
        } else if (i10 == 16) {
            str = Long.toString(this.w);
        } else if (i10 == 17) {
            str = this.u.C((long) this.f8551x);
        } else {
            throw new h("Expected a string but was " + r() + " at path " + f());
        }
        this.f8550v = 0;
        int[] iArr = this.f8546r;
        int i11 = this.f8543o - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public final a.b r() {
        int i10 = this.f8550v;
        if (i10 == 0) {
            i10 = C();
        }
        switch (i10) {
            case 1:
                return a.b.BEGIN_OBJECT;
            case 2:
                return a.b.END_OBJECT;
            case 3:
                return a.b.BEGIN_ARRAY;
            case 4:
                return a.b.END_ARRAY;
            case 5:
            case 6:
                return a.b.BOOLEAN;
            case 7:
                return a.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return a.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return a.b.NAME;
            case 16:
            case 17:
                return a.b.NUMBER;
            case 18:
                return a.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final int t(a.C0126a aVar) {
        int i10 = this.f8550v;
        if (i10 == 0) {
            i10 = C();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return E(this.f8552y, aVar);
        }
        int A2 = this.f8549t.A(aVar.f8548b);
        if (A2 != -1) {
            this.f8550v = 0;
            this.f8545q[this.f8543o - 1] = aVar.f8547a[A2];
            return A2;
        }
        String str = this.f8545q[this.f8543o - 1];
        String I = I();
        int E = E(I, aVar);
        if (E == -1) {
            this.f8550v = 15;
            this.f8552y = I;
            this.f8545q[this.f8543o - 1] = str;
        }
        return E;
    }

    public final String toString() {
        return "JsonReader(" + this.f8549t + ")";
    }

    public final void u() {
        j jVar;
        int i10 = this.f8550v;
        if (i10 == 0) {
            i10 = C();
        }
        if (i10 == 14) {
            long O = this.f8549t.O(B);
            int i11 = (O > -1 ? 1 : (O == -1 ? 0 : -1));
            f fVar = this.u;
            if (i11 == 0) {
                O = fVar.f9325p;
            }
            fVar.skip(O);
        } else {
            if (i10 == 13) {
                jVar = A;
            } else if (i10 == 12) {
                jVar = z;
            } else if (i10 != 15) {
                throw new h("Expected a name but was " + r() + " at path " + f());
            }
            U(jVar);
        }
        this.f8550v = 0;
        this.f8545q[this.f8543o - 1] = "null";
    }

    public final void x() {
        j jVar;
        int i10 = 0;
        do {
            int i11 = this.f8550v;
            if (i11 == 0) {
                i11 = C();
            }
            if (i11 == 3) {
                s(1);
            } else if (i11 == 1) {
                s(3);
            } else {
                if (i11 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new h("Expected a value but was " + r() + " at path " + f());
                    }
                } else if (i11 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new h("Expected a value but was " + r() + " at path " + f());
                    }
                } else {
                    f fVar = this.u;
                    if (i11 == 14 || i11 == 10) {
                        long O = this.f8549t.O(B);
                        if (O == -1) {
                            O = fVar.f9325p;
                        }
                        fVar.skip(O);
                        this.f8550v = 0;
                    } else {
                        if (i11 == 9 || i11 == 13) {
                            jVar = A;
                        } else if (i11 == 8 || i11 == 12) {
                            jVar = z;
                        } else {
                            if (i11 == 17) {
                                fVar.skip((long) this.f8551x);
                            } else if (i11 == 18) {
                                throw new h("Expected a value but was " + r() + " at path " + f());
                            }
                            this.f8550v = 0;
                        }
                        U(jVar);
                        this.f8550v = 0;
                    }
                }
                this.f8543o--;
                this.f8550v = 0;
            }
            i10++;
            this.f8550v = 0;
        } while (i10 != 0);
        int[] iArr = this.f8546r;
        int i12 = this.f8543o;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f8545q[i12 - 1] = "null";
    }

    public final void z() {
        y("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }
}
