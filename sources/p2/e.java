package p2;

import android.graphics.Bitmap;
import d3.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import p2.a;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f7874a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f7875b = new int[256];

    /* renamed from: c  reason: collision with root package name */
    public final a.C0114a f7876c;
    public ByteBuffer d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f7877e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f7878f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f7879g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f7880h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f7881i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f7882j;

    /* renamed from: k  reason: collision with root package name */
    public int f7883k;
    public c l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f7884m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7885n;

    /* renamed from: o  reason: collision with root package name */
    public int f7886o;

    /* renamed from: p  reason: collision with root package name */
    public int f7887p;

    /* renamed from: q  reason: collision with root package name */
    public int f7888q;

    /* renamed from: r  reason: collision with root package name */
    public int f7889r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f7890s;

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f7891t = Bitmap.Config.ARGB_8888;

    public e(b bVar, c cVar, ByteBuffer byteBuffer, int i10) {
        byte[] bArr;
        int[] iArr;
        this.f7876c = bVar;
        this.l = new c();
        synchronized (this) {
            if (i10 > 0) {
                int highestOneBit = Integer.highestOneBit(i10);
                this.f7886o = 0;
                this.l = cVar;
                this.f7883k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.f7885n = false;
                Iterator it = cVar.f7864e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((b) it.next()).f7856g == 3) {
                            this.f7885n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f7887p = highestOneBit;
                int i11 = cVar.f7865f;
                this.f7889r = i11 / highestOneBit;
                int i12 = cVar.f7866g;
                this.f7888q = i12 / highestOneBit;
                int i13 = i11 * i12;
                t2.b bVar2 = ((b) this.f7876c).f4150b;
                if (bVar2 == null) {
                    bArr = new byte[i13];
                } else {
                    bArr = (byte[]) bVar2.c(i13, byte[].class);
                }
                this.f7881i = bArr;
                a.C0114a aVar = this.f7876c;
                int i14 = this.f7889r * this.f7888q;
                t2.b bVar3 = ((b) aVar).f4150b;
                if (bVar3 == null) {
                    iArr = new int[i14];
                } else {
                    iArr = (int[]) bVar3.c(i14, int[].class);
                }
                this.f7882j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
        }
    }

    public final int a() {
        return this.f7883k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ed, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap b() {
        /*
            r9 = this;
            java.lang.String r0 = "No valid color table found for frame #"
            java.lang.String r1 = "Unable to decode frame, status="
            java.lang.String r2 = "Unable to decode frame, frameCount="
            monitor-enter(r9)
            p2.c r3 = r9.l     // Catch:{ all -> 0x00ee }
            int r3 = r3.f7863c     // Catch:{ all -> 0x00ee }
            r4 = 3
            r5 = 1
            if (r3 <= 0) goto L_0x0013
            int r3 = r9.f7883k     // Catch:{ all -> 0x00ee }
            if (r3 >= 0) goto L_0x003c
        L_0x0013:
            java.lang.String r3 = "e"
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x00ee }
            if (r3 == 0) goto L_0x003a
            java.lang.String r3 = "e"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r6.<init>(r2)     // Catch:{ all -> 0x00ee }
            p2.c r2 = r9.l     // Catch:{ all -> 0x00ee }
            int r2 = r2.f7863c     // Catch:{ all -> 0x00ee }
            r6.append(r2)     // Catch:{ all -> 0x00ee }
            java.lang.String r2 = ", framePointer="
            r6.append(r2)     // Catch:{ all -> 0x00ee }
            int r2 = r9.f7883k     // Catch:{ all -> 0x00ee }
            r6.append(r2)     // Catch:{ all -> 0x00ee }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x00ee }
            android.util.Log.d(r3, r2)     // Catch:{ all -> 0x00ee }
        L_0x003a:
            r9.f7886o = r5     // Catch:{ all -> 0x00ee }
        L_0x003c:
            int r2 = r9.f7886o     // Catch:{ all -> 0x00ee }
            r3 = 0
            if (r2 == r5) goto L_0x00d1
            r6 = 2
            if (r2 != r6) goto L_0x0046
            goto L_0x00d1
        L_0x0046:
            r1 = 0
            r9.f7886o = r1     // Catch:{ all -> 0x00ee }
            byte[] r2 = r9.f7877e     // Catch:{ all -> 0x00ee }
            if (r2 != 0) goto L_0x0064
            p2.a$a r2 = r9.f7876c     // Catch:{ all -> 0x00ee }
            d3.b r2 = (d3.b) r2     // Catch:{ all -> 0x00ee }
            t2.b r2 = r2.f4150b     // Catch:{ all -> 0x00ee }
            r7 = 255(0xff, float:3.57E-43)
            if (r2 != 0) goto L_0x005a
            byte[] r2 = new byte[r7]     // Catch:{ all -> 0x00ee }
            goto L_0x0062
        L_0x005a:
            java.lang.Class<byte[]> r8 = byte[].class
            java.lang.Object r2 = r2.c(r7, r8)     // Catch:{ all -> 0x00ee }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x00ee }
        L_0x0062:
            r9.f7877e = r2     // Catch:{ all -> 0x00ee }
        L_0x0064:
            p2.c r2 = r9.l     // Catch:{ all -> 0x00ee }
            java.util.ArrayList r2 = r2.f7864e     // Catch:{ all -> 0x00ee }
            int r7 = r9.f7883k     // Catch:{ all -> 0x00ee }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x00ee }
            p2.b r2 = (p2.b) r2     // Catch:{ all -> 0x00ee }
            int r7 = r9.f7883k     // Catch:{ all -> 0x00ee }
            int r7 = r7 - r5
            if (r7 < 0) goto L_0x0080
            p2.c r8 = r9.l     // Catch:{ all -> 0x00ee }
            java.util.ArrayList r8 = r8.f7864e     // Catch:{ all -> 0x00ee }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00ee }
            p2.b r7 = (p2.b) r7     // Catch:{ all -> 0x00ee }
            goto L_0x0081
        L_0x0080:
            r7 = r3
        L_0x0081:
            int[] r8 = r2.f7860k     // Catch:{ all -> 0x00ee }
            if (r8 == 0) goto L_0x0086
            goto L_0x008a
        L_0x0086:
            p2.c r8 = r9.l     // Catch:{ all -> 0x00ee }
            int[] r8 = r8.f7861a     // Catch:{ all -> 0x00ee }
        L_0x008a:
            r9.f7874a = r8     // Catch:{ all -> 0x00ee }
            if (r8 != 0) goto L_0x00ad
            java.lang.String r1 = "e"
            boolean r1 = android.util.Log.isLoggable(r1, r4)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00a9
            java.lang.String r1 = "e"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r2.<init>(r0)     // Catch:{ all -> 0x00ee }
            int r0 = r9.f7883k     // Catch:{ all -> 0x00ee }
            r2.append(r0)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00ee }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x00ee }
        L_0x00a9:
            r9.f7886o = r5     // Catch:{ all -> 0x00ee }
            monitor-exit(r9)
            return r3
        L_0x00ad:
            boolean r0 = r2.f7855f     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00cb
            int[] r0 = r9.f7875b     // Catch:{ all -> 0x00ee }
            int r3 = r8.length     // Catch:{ all -> 0x00ee }
            java.lang.System.arraycopy(r8, r1, r0, r1, r3)     // Catch:{ all -> 0x00ee }
            int[] r0 = r9.f7875b     // Catch:{ all -> 0x00ee }
            r9.f7874a = r0     // Catch:{ all -> 0x00ee }
            int r3 = r2.f7857h     // Catch:{ all -> 0x00ee }
            r0[r3] = r1     // Catch:{ all -> 0x00ee }
            int r0 = r2.f7856g     // Catch:{ all -> 0x00ee }
            if (r0 != r6) goto L_0x00cb
            int r0 = r9.f7883k     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x00cb
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00ee }
            r9.f7890s = r0     // Catch:{ all -> 0x00ee }
        L_0x00cb:
            android.graphics.Bitmap r0 = r9.j(r2, r7)     // Catch:{ all -> 0x00ee }
            monitor-exit(r9)
            return r0
        L_0x00d1:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = "e"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r2.<init>(r1)     // Catch:{ all -> 0x00ee }
            int r1 = r9.f7886o     // Catch:{ all -> 0x00ee }
            r2.append(r1)     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00ee }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00ee }
        L_0x00ec:
            monitor-exit(r9)
            return r3
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.e.b():android.graphics.Bitmap");
    }

    public final void c() {
        this.f7883k = (this.f7883k + 1) % this.l.f7863c;
    }

    public final void clear() {
        t2.b bVar;
        t2.b bVar2;
        t2.b bVar3;
        this.l = null;
        byte[] bArr = this.f7881i;
        a.C0114a aVar = this.f7876c;
        if (!(bArr == null || (bVar3 = ((b) aVar).f4150b) == null)) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f7882j;
        if (!(iArr == null || (bVar2 = ((b) aVar).f4150b) == null)) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f7884m;
        if (bitmap != null) {
            ((b) aVar).f4149a.e(bitmap);
        }
        this.f7884m = null;
        this.d = null;
        this.f7890s = null;
        byte[] bArr2 = this.f7877e;
        if (bArr2 != null && (bVar = ((b) aVar).f4150b) != null) {
            bVar.put(bArr2);
        }
    }

    public final int d() {
        return this.l.f7863c;
    }

    public final int e() {
        int i10;
        c cVar = this.l;
        int i11 = cVar.f7863c;
        if (i11 <= 0 || (i10 = this.f7883k) < 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= i11) {
            return -1;
        }
        return ((b) cVar.f7864e.get(i10)).f7858i;
    }

    public final int f() {
        return (this.f7882j.length * 4) + this.d.limit() + this.f7881i.length;
    }

    public final ByteBuffer g() {
        return this.d;
    }

    public final Bitmap h() {
        Bitmap.Config config;
        Boolean bool = this.f7890s;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.f7891t;
        }
        Bitmap c10 = ((b) this.f7876c).f4149a.c(this.f7889r, this.f7888q, config);
        c10.setHasAlpha(true);
        return c10;
    }

    public final void i(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f7891t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (r3.f7869j == r1.f7857h) goto L_0x0048;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r5v31, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap j(p2.b r36, p2.b r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            int[] r10 = r0.f7882j
            p2.a$a r11 = r0.f7876c
            r12 = 0
            if (r2 != 0) goto L_0x001f
            android.graphics.Bitmap r3 = r0.f7884m
            if (r3 == 0) goto L_0x0019
            r4 = r11
            d3.b r4 = (d3.b) r4
            t2.c r4 = r4.f4149a
            r4.e(r3)
        L_0x0019:
            r3 = 0
            r0.f7884m = r3
            java.util.Arrays.fill(r10, r12)
        L_0x001f:
            r13 = 3
            if (r2 == 0) goto L_0x002d
            int r3 = r2.f7856g
            if (r3 != r13) goto L_0x002d
            android.graphics.Bitmap r3 = r0.f7884m
            if (r3 != 0) goto L_0x002d
            java.util.Arrays.fill(r10, r12)
        L_0x002d:
            r14 = 2
            if (r2 == 0) goto L_0x007f
            int r3 = r2.f7856g
            if (r3 <= 0) goto L_0x007f
            if (r3 != r14) goto L_0x006d
            boolean r3 = r1.f7855f
            if (r3 != 0) goto L_0x0048
            p2.c r3 = r0.l
            int r4 = r3.f7870k
            int[] r5 = r1.f7860k
            if (r5 == 0) goto L_0x0049
            int r3 = r3.f7869j
            int r5 = r1.f7857h
            if (r3 != r5) goto L_0x0049
        L_0x0048:
            r4 = r12
        L_0x0049:
            int r3 = r2.d
            int r5 = r0.f7887p
            int r3 = r3 / r5
            int r6 = r2.f7852b
            int r6 = r6 / r5
            int r7 = r2.f7853c
            int r7 = r7 / r5
            int r2 = r2.f7851a
            int r2 = r2 / r5
            int r5 = r0.f7889r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005d:
            if (r6 >= r3) goto L_0x007f
            int r2 = r6 + r7
            r5 = r6
        L_0x0062:
            if (r5 >= r2) goto L_0x0069
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0062
        L_0x0069:
            int r2 = r0.f7889r
            int r6 = r6 + r2
            goto L_0x005d
        L_0x006d:
            if (r3 != r13) goto L_0x007f
            android.graphics.Bitmap r2 = r0.f7884m
            if (r2 == 0) goto L_0x007f
            r4 = 0
            int r8 = r0.f7889r
            r6 = 0
            r7 = 0
            int r9 = r0.f7888q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x007f:
            java.nio.ByteBuffer r2 = r0.d
            int r3 = r1.f7859j
            r2.position(r3)
            int r2 = r1.f7853c
            int r3 = r1.d
            int r2 = r2 * r3
            byte[] r3 = r0.f7881i
            if (r3 == 0) goto L_0x0092
            int r3 = r3.length
            if (r3 >= r2) goto L_0x00a5
        L_0x0092:
            d3.b r11 = (d3.b) r11
            t2.b r3 = r11.f4150b
            if (r3 != 0) goto L_0x009b
            byte[] r3 = new byte[r2]
            goto L_0x00a3
        L_0x009b:
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Object r3 = r3.c(r2, r4)
            byte[] r3 = (byte[]) r3
        L_0x00a3:
            r0.f7881i = r3
        L_0x00a5:
            byte[] r3 = r0.f7881i
            short[] r4 = r0.f7878f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00b1
            short[] r4 = new short[r5]
            r0.f7878f = r4
        L_0x00b1:
            short[] r4 = r0.f7878f
            byte[] r6 = r0.f7879g
            if (r6 != 0) goto L_0x00bb
            byte[] r6 = new byte[r5]
            r0.f7879g = r6
        L_0x00bb:
            byte[] r6 = r0.f7879g
            byte[] r7 = r0.f7880h
            if (r7 != 0) goto L_0x00c7
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.f7880h = r7
        L_0x00c7:
            byte[] r7 = r0.f7880h
            java.nio.ByteBuffer r8 = r0.d
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r11 = r9 << r8
            int r15 = r11 + 1
            int r16 = r11 + 2
            int r8 = r8 + r9
            int r17 = r9 << r8
            r14 = -1
            int r17 = r17 + -1
            r5 = r12
        L_0x00df:
            if (r5 >= r11) goto L_0x00ea
            r4[r5] = r12
            byte r14 = (byte) r5
            r6[r5] = r14
            int r5 = r5 + 1
            r14 = -1
            goto L_0x00df
        L_0x00ea:
            byte[] r5 = r0.f7877e
            r13 = r0
            r26 = r8
            r9 = r12
            r20 = r9
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r27 = r24
            r29 = r27
            r25 = r16
            r28 = r17
            r14 = -1
        L_0x0103:
            r30 = 8
            if (r9 >= r2) goto L_0x01fe
            if (r21 != 0) goto L_0x0141
            java.nio.ByteBuffer r12 = r0.d
            byte r12 = r12.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            r31 = r8
            if (r12 > 0) goto L_0x011c
            r32 = r9
            r34 = r10
            r33 = r14
            goto L_0x0132
        L_0x011c:
            java.nio.ByteBuffer r8 = r13.d
            r32 = r9
            byte[] r9 = r13.f7877e
            r33 = r14
            int r14 = r8.remaining()
            int r14 = java.lang.Math.min(r12, r14)
            r34 = r10
            r10 = 0
            r8.get(r9, r10, r14)
        L_0x0132:
            if (r12 > 0) goto L_0x013c
            r8 = 3
            r13.f7886o = r8
            r12 = r20
            r10 = 0
            goto L_0x0203
        L_0x013c:
            r21 = r12
            r22 = 0
            goto L_0x0149
        L_0x0141:
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r14
        L_0x0149:
            byte r8 = r5[r22]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r23
            int r24 = r24 + r8
            int r23 = r23 + 8
            r8 = 1
            int r22 = r22 + 1
            r8 = -1
            int r21 = r21 + -1
            r10 = r23
            r12 = r25
            r8 = r26
            r9 = r32
            r14 = r33
            r23 = r5
            r5 = r27
        L_0x0167:
            if (r10 < r8) goto L_0x01ea
            r25 = r13
            r13 = r24 & r28
            int r24 = r24 >> r8
            int r10 = r10 - r8
            if (r13 != r11) goto L_0x0183
            r26 = r10
            r12 = r16
            r28 = r17
            r13 = r25
            r8 = r31
            r14 = -1
            r25 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01e4
        L_0x0183:
            if (r13 != r15) goto L_0x018d
            r27 = r5
            r13 = r25
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01ef
        L_0x018d:
            r26 = r10
            r10 = -1
            if (r14 != r10) goto L_0x01a0
            byte r5 = r6[r13]
            r3[r20] = r5
            int r20 = r20 + 1
            int r9 = r9 + 1
            r5 = r13
            r14 = r5
            r10 = r26
            r13 = r0
            goto L_0x0167
        L_0x01a0:
            if (r13 < r12) goto L_0x01a9
            byte r5 = (byte) r5
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r14
            goto L_0x01aa
        L_0x01a9:
            r5 = r13
        L_0x01aa:
            if (r5 < r11) goto L_0x01b5
            byte r10 = r6[r5]
            r7[r29] = r10
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L_0x01aa
        L_0x01b5:
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r5
            r3[r20] = r10
        L_0x01bc:
            r19 = 1
            int r20 = r20 + 1
            int r9 = r9 + 1
            if (r29 <= 0) goto L_0x01cb
            int r29 = r29 + -1
            byte r25 = r7[r29]
            r3[r20] = r25
            goto L_0x01bc
        L_0x01cb:
            r25 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            if (r12 >= r5) goto L_0x01e2
            short r14 = (short) r14
            r4[r12] = r14
            r6[r12] = r10
            int r12 = r12 + 1
            r10 = r12 & r28
            if (r10 != 0) goto L_0x01e2
            if (r12 >= r5) goto L_0x01e2
            int r8 = r8 + 1
            int r28 = r28 + r12
        L_0x01e2:
            r14 = r13
            r13 = r0
        L_0x01e4:
            r5 = r25
            r10 = r26
            goto L_0x0167
        L_0x01ea:
            r27 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r13 = r0
        L_0x01ef:
            r26 = r8
            r25 = r12
            r5 = r23
            r8 = r31
            r12 = 0
            r23 = r10
            r10 = r34
            goto L_0x0103
        L_0x01fe:
            r34 = r10
            r10 = r12
            r12 = r20
        L_0x0203:
            java.util.Arrays.fill(r3, r12, r2, r10)
            boolean r2 = r1.f7854e
            if (r2 != 0) goto L_0x027b
            int r2 = r0.f7887p
            r3 = 1
            if (r2 == r3) goto L_0x0211
            goto L_0x027b
        L_0x0211:
            int[] r2 = r0.f7882j
            int r3 = r1.d
            int r4 = r1.f7852b
            int r5 = r1.f7853c
            int r6 = r1.f7851a
            int r7 = r0.f7883k
            if (r7 != 0) goto L_0x0221
            r7 = 1
            goto L_0x0222
        L_0x0221:
            r7 = r10
        L_0x0222:
            int r8 = r0.f7889r
            byte[] r9 = r0.f7881i
            int[] r11 = r0.f7874a
            r13 = r10
            r12 = -1
        L_0x022a:
            if (r13 >= r3) goto L_0x025d
            int r14 = r13 + r4
            int r14 = r14 * r8
            int r15 = r14 + r6
            int r10 = r15 + r5
            int r14 = r14 + r8
            if (r14 >= r10) goto L_0x0237
            r10 = r14
        L_0x0237:
            int r14 = r1.f7853c
            int r14 = r14 * r13
        L_0x023a:
            r16 = r3
            if (r15 >= r10) goto L_0x0257
            byte r3 = r9[r14]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r12) goto L_0x024e
            r4 = r11[r4]
            if (r4 == 0) goto L_0x024d
            r2[r15] = r4
            goto L_0x024e
        L_0x024d:
            r12 = r3
        L_0x024e:
            int r14 = r14 + 1
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            goto L_0x023a
        L_0x0257:
            r17 = r4
            int r13 = r13 + 1
            r10 = 0
            goto L_0x022a
        L_0x025d:
            java.lang.Boolean r2 = r0.f7890s
            if (r2 == 0) goto L_0x0267
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0270
        L_0x0267:
            java.lang.Boolean r2 = r0.f7890s
            if (r2 != 0) goto L_0x0272
            if (r7 == 0) goto L_0x0272
            r2 = -1
            if (r12 == r2) goto L_0x0272
        L_0x0270:
            r12 = 1
            goto L_0x0273
        L_0x0272:
            r12 = 0
        L_0x0273:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r0.f7890s = r2
            goto L_0x0404
        L_0x027b:
            int[] r2 = r0.f7882j
            int r3 = r1.d
            int r4 = r0.f7887p
            int r3 = r3 / r4
            int r5 = r1.f7852b
            int r5 = r5 / r4
            int r6 = r1.f7853c
            int r6 = r6 / r4
            int r7 = r1.f7851a
            int r7 = r7 / r4
            int r8 = r0.f7883k
            if (r8 != 0) goto L_0x0291
            r10 = 1
            goto L_0x0292
        L_0x0291:
            r10 = 0
        L_0x0292:
            int r8 = r0.f7889r
            int r9 = r0.f7888q
            byte[] r11 = r0.f7881i
            int[] r12 = r0.f7874a
            java.lang.Boolean r13 = r0.f7890s
            r14 = r13
            r17 = r30
            r13 = 0
            r15 = 0
            r16 = 1
        L_0x02a3:
            r37 = r14
            if (r13 >= r3) goto L_0x03f2
            boolean r14 = r1.f7854e
            if (r14 == 0) goto L_0x02d2
            if (r15 < r3) goto L_0x02cd
            int r14 = r16 + 1
            r18 = r3
            r3 = 2
            if (r14 == r3) goto L_0x02c8
            r3 = 3
            if (r14 == r3) goto L_0x02c1
            r3 = 4
            r16 = r14
            if (r14 == r3) goto L_0x02bd
            goto L_0x02cf
        L_0x02bd:
            r15 = 1
            r17 = 2
            goto L_0x02cf
        L_0x02c1:
            r3 = 4
            r17 = r3
            r16 = r14
            r15 = 2
            goto L_0x02cf
        L_0x02c8:
            r3 = 4
            r15 = r3
            r16 = r14
            goto L_0x02cf
        L_0x02cd:
            r18 = r3
        L_0x02cf:
            int r3 = r15 + r17
            goto L_0x02d6
        L_0x02d2:
            r18 = r3
            r3 = r15
            r15 = r13
        L_0x02d6:
            int r15 = r15 + r5
            r14 = 1
            if (r4 != r14) goto L_0x02dc
            r14 = 1
            goto L_0x02dd
        L_0x02dc:
            r14 = 0
        L_0x02dd:
            if (r15 >= r9) goto L_0x03d2
            int r15 = r15 * r8
            int r20 = r15 + r7
            r21 = r3
            int r3 = r20 + r6
            int r15 = r15 + r8
            if (r15 >= r3) goto L_0x02ea
            r3 = r15
        L_0x02ea:
            int r15 = r13 * r4
            r22 = r5
            int r5 = r1.f7853c
            int r15 = r15 * r5
            if (r14 == 0) goto L_0x0313
            r14 = r37
            r5 = r20
        L_0x02f7:
            r23 = r6
            if (r5 >= r3) goto L_0x03cb
            byte r6 = r11[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r12[r6]
            if (r6 == 0) goto L_0x0306
            r2[r5] = r6
            goto L_0x030d
        L_0x0306:
            if (r10 == 0) goto L_0x030d
            if (r14 != 0) goto L_0x030d
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r14 = r6
        L_0x030d:
            int r15 = r15 + r4
            int r5 = r5 + 1
            r6 = r23
            goto L_0x02f7
        L_0x0313:
            r23 = r6
            int r5 = r3 - r20
            int r5 = r5 * r4
            int r5 = r5 + r15
            r14 = r37
            r6 = r20
        L_0x031d:
            if (r6 >= r3) goto L_0x03cb
            r20 = r3
            int r3 = r1.f7853c
            r29 = r7
            r31 = r8
            r7 = r15
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x0332:
            int r8 = r0.f7887p
            int r8 = r8 + r15
            if (r7 >= r8) goto L_0x0367
            byte[] r8 = r0.f7881i
            r32 = r9
            int r9 = r8.length
            if (r7 >= r9) goto L_0x0369
            if (r7 >= r5) goto L_0x0369
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f7874a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0362
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0362:
            int r7 = r7 + 1
            r9 = r32
            goto L_0x0332
        L_0x0367:
            r32 = r9
        L_0x0369:
            int r3 = r3 + r15
            r7 = r3
        L_0x036b:
            int r8 = r0.f7887p
            int r8 = r8 + r3
            if (r7 >= r8) goto L_0x039c
            byte[] r8 = r0.f7881i
            int r9 = r8.length
            if (r7 >= r9) goto L_0x039c
            if (r7 >= r5) goto L_0x039c
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f7874a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0399
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0399:
            int r7 = r7 + 1
            goto L_0x036b
        L_0x039c:
            if (r28 != 0) goto L_0x03a0
            r3 = 0
            goto L_0x03b2
        L_0x03a0:
            int r24 = r24 / r28
            int r3 = r24 << 24
            int r25 = r25 / r28
            int r7 = r25 << 16
            r3 = r3 | r7
            int r26 = r26 / r28
            int r7 = r26 << 8
            r3 = r3 | r7
            int r27 = r27 / r28
            r3 = r3 | r27
        L_0x03b2:
            if (r3 == 0) goto L_0x03b7
            r2[r6] = r3
            goto L_0x03be
        L_0x03b7:
            if (r10 == 0) goto L_0x03be
            if (r14 != 0) goto L_0x03be
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r14 = r3
        L_0x03be:
            int r15 = r15 + r4
            int r6 = r6 + 1
            r3 = r20
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x031d
        L_0x03cb:
            r29 = r7
            r31 = r8
            r32 = r9
            goto L_0x03e0
        L_0x03d2:
            r21 = r3
            r22 = r5
            r23 = r6
            r29 = r7
            r31 = r8
            r32 = r9
            r14 = r37
        L_0x03e0:
            int r13 = r13 + 1
            r3 = r18
            r15 = r21
            r5 = r22
            r6 = r23
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x02a3
        L_0x03f2:
            java.lang.Boolean r2 = r0.f7890s
            if (r2 != 0) goto L_0x0404
            if (r37 != 0) goto L_0x03fa
            r12 = 0
            goto L_0x03fe
        L_0x03fa:
            boolean r12 = r37.booleanValue()
        L_0x03fe:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r0.f7890s = r2
        L_0x0404:
            boolean r2 = r0.f7885n
            if (r2 == 0) goto L_0x0428
            int r1 = r1.f7856g
            if (r1 == 0) goto L_0x040f
            r2 = 1
            if (r1 != r2) goto L_0x0428
        L_0x040f:
            android.graphics.Bitmap r1 = r0.f7884m
            if (r1 != 0) goto L_0x0419
            android.graphics.Bitmap r1 = r35.h()
            r0.f7884m = r1
        L_0x0419:
            android.graphics.Bitmap r1 = r0.f7884m
            r3 = 0
            int r7 = r0.f7889r
            r5 = 0
            r6 = 0
            int r8 = r0.f7888q
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x0428:
            android.graphics.Bitmap r9 = r35.h()
            r3 = 0
            int r7 = r0.f7889r
            r5 = 0
            r6 = 0
            int r8 = r0.f7888q
            r1 = r9
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.e.j(p2.b, p2.b):android.graphics.Bitmap");
    }
}
