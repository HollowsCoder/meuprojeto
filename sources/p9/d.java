package p9;

import com.karumi.dexter.BuildConfig;
import j9.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import n.e;
import p9.q;
import p9.t;
import w9.f;
import w9.j;
import w9.v;
import z8.g;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c[] f7975a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<j, Integer> f7976b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f7977a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final v f7978b;

        /* renamed from: c  reason: collision with root package name */
        public c[] f7979c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f7980e;

        /* renamed from: f  reason: collision with root package name */
        public int f7981f;

        /* renamed from: g  reason: collision with root package name */
        public final int f7982g = 4096;

        /* renamed from: h  reason: collision with root package name */
        public int f7983h = 4096;

        public a(q.b bVar) {
            this.f7978b = e.o(bVar);
            this.f7979c = new c[8];
            this.d = 7;
        }

        public final int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f7979c.length;
                while (true) {
                    length--;
                    i11 = this.d;
                    if (length < i11 || i10 <= 0) {
                        c[] cVarArr = this.f7979c;
                        System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f7980e);
                        this.d += i12;
                    } else {
                        c cVar = this.f7979c[length];
                        g.c(cVar);
                        int i13 = cVar.f7972a;
                        i10 -= i13;
                        this.f7981f -= i13;
                        this.f7980e--;
                        i12++;
                    }
                }
                c[] cVarArr2 = this.f7979c;
                System.arraycopy(cVarArr2, i11 + 1, cVarArr2, i11 + 1 + i12, this.f7980e);
                this.d += i12;
            }
            return i12;
        }

        public final j b(int i10) {
            boolean z;
            c cVar;
            if (i10 < 0 || i10 > d.f7975a.length - 1) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                cVar = d.f7975a[i10];
            } else {
                int length = this.d + 1 + (i10 - d.f7975a.length);
                if (length >= 0) {
                    c[] cVarArr = this.f7979c;
                    if (length < cVarArr.length) {
                        cVar = cVarArr[length];
                        g.c(cVar);
                    }
                }
                throw new IOException("Header index too large " + (i10 + 1));
            }
            return cVar.f7973b;
        }

        public final void c(c cVar) {
            this.f7977a.add(cVar);
            int i10 = this.f7983h;
            int i11 = cVar.f7972a;
            if (i11 > i10) {
                c[] cVarArr = this.f7979c;
                Arrays.fill(cVarArr, 0, cVarArr.length, (Object) null);
                this.d = this.f7979c.length - 1;
                this.f7980e = 0;
                this.f7981f = 0;
                return;
            }
            a((this.f7981f + i11) - i10);
            int i12 = this.f7980e + 1;
            c[] cVarArr2 = this.f7979c;
            if (i12 > cVarArr2.length) {
                c[] cVarArr3 = new c[(cVarArr2.length * 2)];
                System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
                this.d = this.f7979c.length - 1;
                this.f7979c = cVarArr3;
            }
            int i13 = this.d;
            this.d = i13 - 1;
            this.f7979c[i13] = cVar;
            this.f7980e++;
            this.f7981f += i11;
        }

        public final j d() {
            boolean z;
            int i10;
            v vVar = this.f7978b;
            byte readByte = vVar.readByte();
            byte[] bArr = c.f6602a;
            byte b10 = readByte & 255;
            byte b11 = 0;
            if ((b10 & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            long e10 = (long) e(b10, 127);
            if (!z) {
                return vVar.q(e10);
            }
            f fVar = new f();
            int[] iArr = t.f8096a;
            g.f(vVar, "source");
            t.a aVar = t.f8098c;
            t.a aVar2 = aVar;
            int i11 = 0;
            for (long j8 = 0; j8 < e10; j8++) {
                byte readByte2 = vVar.readByte();
                byte[] bArr2 = c.f6602a;
                b11 = (b11 << 8) | (readByte2 & 255);
                i11 += 8;
                while (i11 >= 8) {
                    int i12 = i11 - 8;
                    t.a[] aVarArr = aVar2.f8099a;
                    g.c(aVarArr);
                    aVar2 = aVarArr[(b11 >>> i12) & 255];
                    g.c(aVar2);
                    if (aVar2.f8099a == null) {
                        fVar.M(aVar2.f8100b);
                        i11 -= aVar2.f8101c;
                        aVar2 = aVar;
                    } else {
                        i11 = i12;
                    }
                }
            }
            while (i11 > 0) {
                t.a[] aVarArr2 = aVar2.f8099a;
                g.c(aVarArr2);
                t.a aVar3 = aVarArr2[(b11 << (8 - i11)) & 255];
                g.c(aVar3);
                if (aVar3.f8099a != null || (i10 = aVar3.f8101c) > i11) {
                    break;
                }
                fVar.M(aVar3.f8100b);
                i11 -= i10;
                aVar2 = aVar;
            }
            return fVar.u();
        }

        public final int e(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                byte readByte = this.f7978b.readByte();
                byte[] bArr = c.f6602a;
                byte b10 = readByte & 255;
                if ((b10 & 128) == 0) {
                    return i11 + (b10 << i13);
                }
                i11 += (b10 & Byte.MAX_VALUE) << i13;
                i13 += 7;
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f7984a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7985b;

        /* renamed from: c  reason: collision with root package name */
        public int f7986c;
        public c[] d;

        /* renamed from: e  reason: collision with root package name */
        public int f7987e;

        /* renamed from: f  reason: collision with root package name */
        public int f7988f;

        /* renamed from: g  reason: collision with root package name */
        public int f7989g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f7990h = true;

        /* renamed from: i  reason: collision with root package name */
        public final f f7991i;

        public b(f fVar) {
            this.f7991i = fVar;
            this.f7984a = Integer.MAX_VALUE;
            this.f7986c = 4096;
            this.d = new c[8];
            this.f7987e = 7;
        }

        public final void a(int i10) {
            int i11;
            if (i10 > 0) {
                int length = this.d.length - 1;
                int i12 = 0;
                while (true) {
                    i11 = this.f7987e;
                    if (length < i11 || i10 <= 0) {
                        c[] cVarArr = this.d;
                        int i13 = i11 + 1;
                        System.arraycopy(cVarArr, i13, cVarArr, i13 + i12, this.f7988f);
                        c[] cVarArr2 = this.d;
                        int i14 = this.f7987e + 1;
                        Arrays.fill(cVarArr2, i14, i14 + i12, (Object) null);
                        this.f7987e += i12;
                    } else {
                        c cVar = this.d[length];
                        g.c(cVar);
                        i10 -= cVar.f7972a;
                        int i15 = this.f7989g;
                        c cVar2 = this.d[length];
                        g.c(cVar2);
                        this.f7989g = i15 - cVar2.f7972a;
                        this.f7988f--;
                        i12++;
                        length--;
                    }
                }
                c[] cVarArr3 = this.d;
                int i132 = i11 + 1;
                System.arraycopy(cVarArr3, i132, cVarArr3, i132 + i12, this.f7988f);
                c[] cVarArr22 = this.d;
                int i142 = this.f7987e + 1;
                Arrays.fill(cVarArr22, i142, i142 + i12, (Object) null);
                this.f7987e += i12;
            }
        }

        public final void b(c cVar) {
            int i10 = this.f7986c;
            int i11 = cVar.f7972a;
            if (i11 > i10) {
                c[] cVarArr = this.d;
                Arrays.fill(cVarArr, 0, cVarArr.length, (Object) null);
                this.f7987e = this.d.length - 1;
                this.f7988f = 0;
                this.f7989g = 0;
                return;
            }
            a((this.f7989g + i11) - i10);
            int i12 = this.f7988f + 1;
            c[] cVarArr2 = this.d;
            if (i12 > cVarArr2.length) {
                c[] cVarArr3 = new c[(cVarArr2.length * 2)];
                System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
                this.f7987e = this.d.length - 1;
                this.d = cVarArr3;
            }
            int i13 = this.f7987e;
            this.f7987e = i13 - 1;
            this.d[i13] = cVar;
            this.f7988f++;
            this.f7989g += i11;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(w9.j r10) {
            /*
                r9 = this;
                java.lang.String r0 = "data"
                z8.g.f(r10, r0)
                boolean r0 = r9.f7990h
                r1 = 0
                if (r0 == 0) goto L_0x0081
                int[] r0 = p9.t.f8096a
                int r0 = r10.k()
                r2 = 0
                r4 = r1
                r5 = r2
            L_0x0014:
                if (r4 >= r0) goto L_0x0027
                byte r7 = r10.o(r4)
                byte[] r8 = j9.c.f6602a
                r7 = r7 & 255(0xff, float:3.57E-43)
                byte[] r8 = p9.t.f8097b
                byte r7 = r8[r7]
                long r7 = (long) r7
                long r5 = r5 + r7
                int r4 = r4 + 1
                goto L_0x0014
            L_0x0027:
                r0 = 7
                long r7 = (long) r0
                long r5 = r5 + r7
                r0 = 3
                long r4 = r5 >> r0
                int r0 = (int) r4
                int r4 = r10.k()
                if (r0 >= r4) goto L_0x0081
                w9.f r0 = new w9.f
                r0.<init>()
                int[] r4 = p9.t.f8096a
                int r4 = r10.k()
                r5 = r2
                r2 = r1
            L_0x0041:
                if (r1 >= r4) goto L_0x0067
                byte r3 = r10.o(r1)
                byte[] r7 = j9.c.f6602a
                r3 = r3 & 255(0xff, float:3.57E-43)
                int[] r7 = p9.t.f8096a
                r7 = r7[r3]
                byte[] r8 = p9.t.f8097b
                byte r3 = r8[r3]
                long r5 = r5 << r3
                long r7 = (long) r7
                long r5 = r5 | r7
                int r2 = r2 + r3
            L_0x0057:
                r3 = 8
                if (r2 < r3) goto L_0x0064
                int r2 = r2 + -8
                long r7 = r5 >> r2
                int r3 = (int) r7
                r0.M(r3)
                goto L_0x0057
            L_0x0064:
                int r1 = r1 + 1
                goto L_0x0041
            L_0x0067:
                if (r2 <= 0) goto L_0x0076
                int r10 = 8 - r2
                long r3 = r5 << r10
                r5 = 255(0xff, double:1.26E-321)
                long r1 = r5 >>> r2
                long r1 = r1 | r3
                int r10 = (int) r1
                r0.M(r10)
            L_0x0076:
                w9.j r10 = r0.u()
                int r0 = r10.k()
                r1 = 128(0x80, float:1.794E-43)
                goto L_0x0085
            L_0x0081:
                int r0 = r10.k()
            L_0x0085:
                r2 = 127(0x7f, float:1.78E-43)
                r9.e(r0, r2, r1)
                w9.f r0 = r9.f7991i
                r0.J(r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p9.d.b.c(w9.j):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(java.util.ArrayList r13) {
            /*
                r12 = this;
                boolean r0 = r12.f7985b
                r1 = 0
                if (r0 == 0) goto L_0x001e
                int r0 = r12.f7984a
                int r2 = r12.f7986c
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0012
                r12.e(r0, r4, r3)
            L_0x0012:
                r12.f7985b = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r12.f7984a = r0
                int r0 = r12.f7986c
                r12.e(r0, r4, r3)
            L_0x001e:
                int r0 = r13.size()
                r2 = r1
            L_0x0023:
                if (r2 >= r0) goto L_0x00f6
                java.lang.Object r3 = r13.get(r2)
                p9.c r3 = (p9.c) r3
                w9.j r4 = r3.f7973b
                w9.j r4 = r4.r()
                java.util.Map<w9.j, java.lang.Integer> r5 = p9.d.f7976b
                java.lang.Object r5 = r5.get(r4)
                java.lang.Integer r5 = (java.lang.Integer) r5
                r6 = -1
                w9.j r7 = r3.f7974c
                if (r5 == 0) goto L_0x0069
                int r5 = r5.intValue()
                int r5 = r5 + 1
                r8 = 2
                if (r8 <= r5) goto L_0x0048
                goto L_0x0067
            L_0x0048:
                r8 = 7
                if (r8 < r5) goto L_0x0067
                p9.c[] r8 = p9.d.f7975a
                int r9 = r5 + -1
                r9 = r8[r9]
                w9.j r9 = r9.f7974c
                boolean r9 = z8.g.a(r9, r7)
                if (r9 == 0) goto L_0x005a
                goto L_0x006a
            L_0x005a:
                r8 = r8[r5]
                w9.j r8 = r8.f7974c
                boolean r8 = z8.g.a(r8, r7)
                if (r8 == 0) goto L_0x0067
                int r8 = r5 + 1
                goto L_0x006b
            L_0x0067:
                r8 = r6
                goto L_0x006b
            L_0x0069:
                r5 = r6
            L_0x006a:
                r8 = r5
            L_0x006b:
                if (r8 != r6) goto L_0x00a9
                int r9 = r12.f7987e
                int r9 = r9 + 1
                p9.c[] r10 = r12.d
                int r10 = r10.length
            L_0x0074:
                if (r9 >= r10) goto L_0x00a9
                p9.c[] r11 = r12.d
                r11 = r11[r9]
                z8.g.c(r11)
                w9.j r11 = r11.f7973b
                boolean r11 = z8.g.a(r11, r4)
                if (r11 == 0) goto L_0x00a6
                p9.c[] r11 = r12.d
                r11 = r11[r9]
                z8.g.c(r11)
                w9.j r11 = r11.f7974c
                boolean r11 = z8.g.a(r11, r7)
                if (r11 == 0) goto L_0x009c
                int r8 = r12.f7987e
                int r9 = r9 - r8
                p9.c[] r8 = p9.d.f7975a
                int r8 = r8.length
                int r8 = r8 + r9
                goto L_0x00a9
            L_0x009c:
                if (r5 != r6) goto L_0x00a6
                int r5 = r12.f7987e
                int r5 = r9 - r5
                p9.c[] r11 = p9.d.f7975a
                int r11 = r11.length
                int r5 = r5 + r11
            L_0x00a6:
                int r9 = r9 + 1
                goto L_0x0074
            L_0x00a9:
                if (r8 == r6) goto L_0x00b3
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r12.e(r8, r3, r4)
                goto L_0x00f2
            L_0x00b3:
                r8 = 64
                if (r5 != r6) goto L_0x00c0
                w9.f r5 = r12.f7991i
                r5.M(r8)
                r12.c(r4)
                goto L_0x00ec
            L_0x00c0:
                w9.j r6 = p9.c.d
                r4.getClass()
                java.lang.String r9 = "prefix"
                z8.g.f(r6, r9)
                int r9 = r6.k()
                boolean r6 = r4.q(r6, r9)
                if (r6 == 0) goto L_0x00e7
                w9.j r6 = p9.c.f7971i
                boolean r4 = z8.g.a(r6, r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x00e7
                r3 = 15
                r12.e(r5, r3, r1)
                r12.c(r7)
                goto L_0x00f2
            L_0x00e7:
                r4 = 63
                r12.e(r5, r4, r8)
            L_0x00ec:
                r12.c(r7)
                r12.b(r3)
            L_0x00f2:
                int r2 = r2 + 1
                goto L_0x0023
            L_0x00f6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p9.d.b.d(java.util.ArrayList):void");
        }

        public final void e(int i10, int i11, int i12) {
            f fVar = this.f7991i;
            if (i10 < i11) {
                fVar.M(i10 | i12);
                return;
            }
            fVar.M(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                fVar.M(128 | (i13 & 127));
                i13 >>>= 7;
            }
            fVar.M(i13);
        }
    }

    static {
        c cVar = new c(c.f7971i, BuildConfig.FLAVOR);
        j jVar = c.f7968f;
        j jVar2 = c.f7969g;
        j jVar3 = c.f7970h;
        j jVar4 = c.f7967e;
        c[] cVarArr = {cVar, new c(jVar, "GET"), new c(jVar, "POST"), new c(jVar2, "/"), new c(jVar2, "/index.html"), new c(jVar3, "http"), new c(jVar3, "https"), new c(jVar4, "200"), new c(jVar4, "204"), new c(jVar4, "206"), new c(jVar4, "304"), new c(jVar4, "400"), new c(jVar4, "404"), new c(jVar4, "500"), new c("accept-charset", (String) BuildConfig.FLAVOR), new c("accept-encoding", "gzip, deflate"), new c("accept-language", (String) BuildConfig.FLAVOR), new c("accept-ranges", (String) BuildConfig.FLAVOR), new c("accept", (String) BuildConfig.FLAVOR), new c("access-control-allow-origin", (String) BuildConfig.FLAVOR), new c("age", (String) BuildConfig.FLAVOR), new c("allow", (String) BuildConfig.FLAVOR), new c("authorization", (String) BuildConfig.FLAVOR), new c("cache-control", (String) BuildConfig.FLAVOR), new c("content-disposition", (String) BuildConfig.FLAVOR), new c("content-encoding", (String) BuildConfig.FLAVOR), new c("content-language", (String) BuildConfig.FLAVOR), new c("content-length", (String) BuildConfig.FLAVOR), new c("content-location", (String) BuildConfig.FLAVOR), new c("content-range", (String) BuildConfig.FLAVOR), new c("content-type", (String) BuildConfig.FLAVOR), new c("cookie", (String) BuildConfig.FLAVOR), new c("date", (String) BuildConfig.FLAVOR), new c("etag", (String) BuildConfig.FLAVOR), new c("expect", (String) BuildConfig.FLAVOR), new c("expires", (String) BuildConfig.FLAVOR), new c("from", (String) BuildConfig.FLAVOR), new c("host", (String) BuildConfig.FLAVOR), new c("if-match", (String) BuildConfig.FLAVOR), new c("if-modified-since", (String) BuildConfig.FLAVOR), new c("if-none-match", (String) BuildConfig.FLAVOR), new c("if-range", (String) BuildConfig.FLAVOR), new c("if-unmodified-since", (String) BuildConfig.FLAVOR), new c("last-modified", (String) BuildConfig.FLAVOR), new c("link", (String) BuildConfig.FLAVOR), new c("location", (String) BuildConfig.FLAVOR), new c("max-forwards", (String) BuildConfig.FLAVOR), new c("proxy-authenticate", (String) BuildConfig.FLAVOR), new c("proxy-authorization", (String) BuildConfig.FLAVOR), new c("range", (String) BuildConfig.FLAVOR), new c("referer", (String) BuildConfig.FLAVOR), new c("refresh", (String) BuildConfig.FLAVOR), new c("retry-after", (String) BuildConfig.FLAVOR), new c("server", (String) BuildConfig.FLAVOR), new c("set-cookie", (String) BuildConfig.FLAVOR), new c("strict-transport-security", (String) BuildConfig.FLAVOR), new c("transfer-encoding", (String) BuildConfig.FLAVOR), new c("user-agent", (String) BuildConfig.FLAVOR), new c("vary", (String) BuildConfig.FLAVOR), new c("via", (String) BuildConfig.FLAVOR), new c("www-authenticate", (String) BuildConfig.FLAVOR)};
        f7975a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(cVarArr[i10].f7973b)) {
                linkedHashMap.put(cVarArr[i10].f7973b, Integer.valueOf(i10));
            }
        }
        Map<j, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        g.e(unmodifiableMap, "Collections.unmodifiableMap(result)");
        f7976b = unmodifiableMap;
    }

    public static void a(j jVar) {
        g.f(jVar, "name");
        int k10 = jVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            byte b10 = (byte) 65;
            byte b11 = (byte) 90;
            byte o10 = jVar.o(i10);
            if (b10 <= o10 && b11 >= o10) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(jVar.s()));
            }
        }
    }
}
