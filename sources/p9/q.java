package p9;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p9.d;
import w9.b0;
import w9.c0;
import w9.f;
import w9.i;
import w9.j;
import z8.g;

public final class q implements Closeable {

    /* renamed from: s  reason: collision with root package name */
    public static final Logger f8056s;

    /* renamed from: o  reason: collision with root package name */
    public final b f8057o;

    /* renamed from: p  reason: collision with root package name */
    public final d.a f8058p;

    /* renamed from: q  reason: collision with root package name */
    public final i f8059q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f8060r;

    public static final class a {
        public static int a(int i10, int i11, int i12) {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }
    }

    public static final class b implements b0 {

        /* renamed from: o  reason: collision with root package name */
        public int f8061o;

        /* renamed from: p  reason: collision with root package name */
        public int f8062p;

        /* renamed from: q  reason: collision with root package name */
        public int f8063q;

        /* renamed from: r  reason: collision with root package name */
        public int f8064r;

        /* renamed from: s  reason: collision with root package name */
        public int f8065s;

        /* renamed from: t  reason: collision with root package name */
        public final i f8066t;

        public b(i iVar) {
            this.f8066t = iVar;
        }

        public final void close() {
        }

        public final c0 h() {
            return this.f8066t.h();
        }

        public final long w(f fVar, long j8) {
            int i10;
            int readInt;
            g.f(fVar, "sink");
            do {
                int i11 = this.f8064r;
                i iVar = this.f8066t;
                if (i11 == 0) {
                    iVar.skip((long) this.f8065s);
                    this.f8065s = 0;
                    if ((this.f8062p & 4) != 0) {
                        return -1;
                    }
                    i10 = this.f8063q;
                    int r5 = j9.c.r(iVar);
                    this.f8064r = r5;
                    this.f8061o = r5;
                    byte readByte = iVar.readByte() & 255;
                    this.f8062p = iVar.readByte() & 255;
                    Logger logger = q.f8056s;
                    if (logger.isLoggable(Level.FINE)) {
                        e eVar = e.f7995e;
                        int i12 = this.f8063q;
                        int i13 = this.f8061o;
                        int i14 = this.f8062p;
                        eVar.getClass();
                        logger.fine(e.a(true, i12, i13, readByte, i14));
                    }
                    readInt = iVar.readInt() & Integer.MAX_VALUE;
                    this.f8063q = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                } else {
                    long w = iVar.w(fVar, Math.min(j8, (long) i11));
                    if (w == -1) {
                        return -1;
                    }
                    this.f8064r -= (int) w;
                    return w;
                }
            } while (readInt == i10);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }
    }

    public interface c {
        void a(int i10, List list);

        void b();

        void d(boolean z, int i10, List list);

        void e();

        void f(w wVar);

        void g(int i10, b bVar, j jVar);

        void h(int i10, b bVar);

        void l(int i10, long j8);

        void m(int i10, int i11, boolean z);

        void o(int i10, int i11, i iVar, boolean z);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        g.e(logger, "Logger.getLogger(Http2::class.java.name)");
        f8056s = logger;
    }

    public q(i iVar, boolean z) {
        this.f8059q = iVar;
        this.f8060r = z;
        b bVar = new b(iVar);
        this.f8057o = bVar;
        this.f8058p = new d.a(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ba, code lost:
        throw new java.io.IOException(b0.d.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r6));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r13, p9.q.c r14) {
        /*
            r12 = this;
            w9.i r0 = r12.f8059q
            java.lang.String r1 = "handler"
            z8.g.f(r14, r1)
            r1 = 0
            r2 = 9
            r0.X(r2)     // Catch:{ EOFException -> 0x02f0 }
            int r2 = j9.c.r(r0)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r2 > r3) goto L_0x02e4
            byte r4 = r0.readByte()
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r5 = r0.readByte()
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r0.readInt()
            r7 = 2147483647(0x7fffffff, float:NaN)
            r6 = r6 & r7
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            java.util.logging.Logger r9 = f8056s
            boolean r8 = r9.isLoggable(r8)
            r10 = 1
            if (r8 == 0) goto L_0x0040
            p9.e r8 = p9.e.f7995e
            r8.getClass()
            java.lang.String r8 = p9.e.a(r10, r6, r2, r4, r5)
            r9.fine(r8)
        L_0x0040:
            r8 = 4
            if (r13 == 0) goto L_0x0075
            if (r4 != r8) goto L_0x0046
            goto L_0x0075
        L_0x0046:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected a SETTINGS frame but was "
            r14.<init>(r0)
            p9.e r0 = p9.e.f7995e
            r0.getClass()
            java.lang.String[] r0 = p9.e.f7993b
            int r2 = r0.length
            if (r4 >= r2) goto L_0x005c
            r0 = r0[r4]
            goto L_0x006a
        L_0x005c:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0[r1] = r2
            java.lang.String r1 = "0x%02x"
            java.lang.String r0 = j9.c.h(r1, r0)
        L_0x006a:
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x0075:
            r13 = 0
            r9 = 8
            r11 = 5
            switch(r4) {
                case 0: goto L_0x02ab;
                case 1: goto L_0x027b;
                case 2: goto L_0x0251;
                case 3: goto L_0x01f6;
                case 4: goto L_0x015a;
                case 5: goto L_0x0132;
                case 6: goto L_0x0108;
                case 7: goto L_0x00ac;
                case 8: goto L_0x0082;
                default: goto L_0x007c;
            }
        L_0x007c:
            long r13 = (long) r2
            r0.skip(r13)
            goto L_0x02e3
        L_0x0082:
            if (r2 != r8) goto L_0x00a0
            int r13 = r0.readInt()
            long r0 = (long) r13
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 & r2
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0098
            r14.l(r6, r0)
            goto L_0x02e3
        L_0x0098:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "windowSizeIncrement was 0"
            r13.<init>(r14)
            throw r13
        L_0x00a0:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "TYPE_WINDOW_UPDATE length !=4: "
            java.lang.String r14 = b0.d.c(r14, r2)
            r13.<init>(r14)
            throw r13
        L_0x00ac:
            if (r2 < r9) goto L_0x00fc
            if (r6 != 0) goto L_0x00f4
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            int r2 = r2 - r9
            p9.b$a r5 = p9.b.Companion
            r5.getClass()
            p9.b[] r5 = p9.b.values()
            int r6 = r5.length
            r7 = r1
        L_0x00c4:
            if (r7 >= r6) goto L_0x00d8
            r8 = r5[r7]
            int r9 = r8.getHttpCode()
            if (r9 != r4) goto L_0x00d0
            r9 = r10
            goto L_0x00d1
        L_0x00d0:
            r9 = r1
        L_0x00d1:
            if (r9 == 0) goto L_0x00d5
            r13 = r8
            goto L_0x00d8
        L_0x00d5:
            int r7 = r7 + 1
            goto L_0x00c4
        L_0x00d8:
            if (r13 == 0) goto L_0x00e8
            w9.j r1 = w9.j.f9328r
            if (r2 <= 0) goto L_0x00e3
            long r1 = (long) r2
            w9.j r1 = r0.q(r1)
        L_0x00e3:
            r14.g(r3, r13, r1)
            goto L_0x02e3
        L_0x00e8:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r14 = b0.d.c(r14, r4)
            r13.<init>(r14)
            throw r13
        L_0x00f4:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "TYPE_GOAWAY streamId != 0"
            r13.<init>(r14)
            throw r13
        L_0x00fc:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "TYPE_GOAWAY length < 8: "
            java.lang.String r14 = b0.d.c(r14, r2)
            r13.<init>(r14)
            throw r13
        L_0x0108:
            if (r2 != r9) goto L_0x0126
            if (r6 != 0) goto L_0x011e
            int r13 = r0.readInt()
            int r0 = r0.readInt()
            r2 = r5 & 1
            if (r2 == 0) goto L_0x0119
            r1 = r10
        L_0x0119:
            r14.m(r13, r0, r1)
            goto L_0x02e3
        L_0x011e:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "TYPE_PING streamId != 0"
            r13.<init>(r14)
            throw r13
        L_0x0126:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "TYPE_PING length != 8: "
            java.lang.String r14 = b0.d.c(r14, r2)
            r13.<init>(r14)
            throw r13
        L_0x0132:
            if (r6 == 0) goto L_0x0152
            r13 = r5 & 8
            if (r13 == 0) goto L_0x013e
            byte r13 = r0.readByte()
            r1 = r13 & 255(0xff, float:3.57E-43)
        L_0x013e:
            int r13 = r0.readInt()
            r13 = r13 & r7
            int r2 = r2 + -4
            int r0 = p9.q.a.a(r2, r5, r1)
            java.util.List r0 = r12.c(r0, r1, r5, r6)
            r14.a(r13, r0)
            goto L_0x02e3
        L_0x0152:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r13.<init>(r14)
            throw r13
        L_0x015a:
            if (r6 != 0) goto L_0x01ee
            r13 = r5 & 1
            if (r13 == 0) goto L_0x016f
            if (r2 != 0) goto L_0x0167
            r14.b()
            goto L_0x02e3
        L_0x0167:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r13.<init>(r14)
            throw r13
        L_0x016f:
            int r13 = r2 % 6
            if (r13 != 0) goto L_0x01e2
            p9.w r13 = new p9.w
            r13.<init>()
            c9.c r1 = s6.a.K(r1, r2)
            r2 = 6
            c9.a r1 = s6.a.I(r1, r2)
            int r2 = r1.f2194o
            int r4 = r1.f2195p
            int r1 = r1.f2196q
            if (r1 < 0) goto L_0x018c
            if (r2 > r4) goto L_0x01dd
            goto L_0x018e
        L_0x018c:
            if (r2 < r4) goto L_0x01dd
        L_0x018e:
            short r5 = r0.readShort()
            byte[] r6 = j9.c.f6602a
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            int r6 = r0.readInt()
            r7 = 2
            if (r5 == r7) goto L_0x01c9
            r7 = 3
            if (r5 == r7) goto L_0x01c7
            if (r5 == r8) goto L_0x01bb
            if (r5 == r11) goto L_0x01a7
            goto L_0x01d6
        L_0x01a7:
            if (r6 < r3) goto L_0x01af
            r7 = 16777215(0xffffff, float:2.3509886E-38)
            if (r6 > r7) goto L_0x01af
            goto L_0x01d6
        L_0x01af:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r14 = b0.d.c(r14, r6)
            r13.<init>(r14)
            throw r13
        L_0x01bb:
            if (r6 < 0) goto L_0x01bf
            r5 = 7
            goto L_0x01d6
        L_0x01bf:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r13.<init>(r14)
            throw r13
        L_0x01c7:
            r5 = r8
            goto L_0x01d6
        L_0x01c9:
            if (r6 == 0) goto L_0x01d6
            if (r6 != r10) goto L_0x01ce
            goto L_0x01d6
        L_0x01ce:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r13.<init>(r14)
            throw r13
        L_0x01d6:
            r13.b(r5, r6)
            if (r2 == r4) goto L_0x01dd
            int r2 = r2 + r1
            goto L_0x018e
        L_0x01dd:
            r14.f(r13)
            goto L_0x02e3
        L_0x01e2:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r14 = b0.d.c(r14, r2)
            r13.<init>(r14)
            throw r13
        L_0x01ee:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "TYPE_SETTINGS streamId != 0"
            r13.<init>(r14)
            throw r13
        L_0x01f6:
            if (r2 != r8) goto L_0x0238
            if (r6 == 0) goto L_0x0230
            int r0 = r0.readInt()
            p9.b$a r2 = p9.b.Companion
            r2.getClass()
            p9.b[] r2 = p9.b.values()
            int r3 = r2.length
            r4 = r1
        L_0x0209:
            if (r4 >= r3) goto L_0x021d
            r5 = r2[r4]
            int r7 = r5.getHttpCode()
            if (r7 != r0) goto L_0x0215
            r7 = r10
            goto L_0x0216
        L_0x0215:
            r7 = r1
        L_0x0216:
            if (r7 == 0) goto L_0x021a
            r13 = r5
            goto L_0x021d
        L_0x021a:
            int r4 = r4 + 1
            goto L_0x0209
        L_0x021d:
            if (r13 == 0) goto L_0x0224
            r14.h(r6, r13)
            goto L_0x02e3
        L_0x0224:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r14 = b0.d.c(r14, r0)
            r13.<init>(r14)
            throw r13
        L_0x0230:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "TYPE_RST_STREAM streamId == 0"
            r13.<init>(r14)
            throw r13
        L_0x0238:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "TYPE_RST_STREAM length: "
            r14.<init>(r0)
            r14.append(r2)
            java.lang.String r0 = " != 4"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x0251:
            if (r2 != r11) goto L_0x0262
            if (r6 == 0) goto L_0x025a
            r12.d(r14, r6)
            goto L_0x02e3
        L_0x025a:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "TYPE_PRIORITY streamId == 0"
            r13.<init>(r14)
            throw r13
        L_0x0262:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "TYPE_PRIORITY length: "
            r14.<init>(r0)
            r14.append(r2)
            java.lang.String r0 = " != 5"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x027b:
            if (r6 == 0) goto L_0x02a3
            r13 = r5 & 1
            if (r13 == 0) goto L_0x0283
            r13 = r10
            goto L_0x0284
        L_0x0283:
            r13 = r1
        L_0x0284:
            r3 = r5 & 8
            if (r3 == 0) goto L_0x028e
            byte r0 = r0.readByte()
            r1 = r0 & 255(0xff, float:3.57E-43)
        L_0x028e:
            r0 = r5 & 32
            if (r0 == 0) goto L_0x0297
            r12.d(r14, r6)
            int r2 = r2 + -5
        L_0x0297:
            int r0 = p9.q.a.a(r2, r5, r1)
            java.util.List r0 = r12.c(r0, r1, r5, r6)
            r14.d(r13, r6, r0)
            goto L_0x02e3
        L_0x02a3:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r13.<init>(r14)
            throw r13
        L_0x02ab:
            if (r6 == 0) goto L_0x02db
            r13 = r5 & 1
            if (r13 == 0) goto L_0x02b3
            r13 = r10
            goto L_0x02b4
        L_0x02b3:
            r13 = r1
        L_0x02b4:
            r3 = r5 & 32
            if (r3 == 0) goto L_0x02ba
            r3 = r10
            goto L_0x02bb
        L_0x02ba:
            r3 = r1
        L_0x02bb:
            if (r3 != 0) goto L_0x02d3
            r3 = r5 & 8
            if (r3 == 0) goto L_0x02c7
            byte r1 = r0.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
        L_0x02c7:
            int r2 = p9.q.a.a(r2, r5, r1)
            r14.o(r6, r2, r0, r13)
            long r13 = (long) r1
            r0.skip(r13)
            goto L_0x02e3
        L_0x02d3:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r13.<init>(r14)
            throw r13
        L_0x02db:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r13.<init>(r14)
            throw r13
        L_0x02e3:
            return r10
        L_0x02e4:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "FRAME_SIZE_ERROR: "
            java.lang.String r14 = b0.d.c(r14, r2)
            r13.<init>(r14)
            throw r13
        L_0x02f0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.q.a(boolean, p9.q$c):boolean");
    }

    public final void b(c cVar) {
        g.f(cVar, "handler");
        if (!this.f8060r) {
            j jVar = e.f7992a;
            j q10 = this.f8059q.q((long) jVar.f9331q.length);
            Level level = Level.FINE;
            Logger logger = f8056s;
            if (logger.isLoggable(level)) {
                logger.fine(j9.c.h("<< CONNECTION " + q10.l(), new Object[0]));
            }
            if (!g.a(jVar, q10)) {
                throw new IOException("Expected a connection header but was ".concat(q10.s()));
            }
        } else if (!a(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f1, code lost:
        throw new java.io.IOException("Invalid dynamic table size update " + r3.f7983h);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p9.c> c(int r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            p9.q$b r0 = r2.f8057o
            r0.f8064r = r3
            r0.f8061o = r3
            r0.f8065s = r4
            r0.f8062p = r5
            r0.f8063q = r6
        L_0x000c:
            p9.d$a r3 = r2.f8058p
            w9.v r4 = r3.f7978b
            boolean r5 = r4.F()
            java.util.ArrayList r6 = r3.f7977a
            if (r5 != 0) goto L_0x0132
            byte r4 = r4.readByte()
            byte[] r5 = j9.c.f6602a
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x012a
            r0 = r4 & 128(0x80, float:1.794E-43)
            r1 = 0
            if (r0 != r5) goto L_0x0070
            r5 = 127(0x7f, float:1.78E-43)
            int r4 = r3.e(r4, r5)
            int r4 = r4 + -1
            r5 = 1
            if (r4 < 0) goto L_0x003b
            p9.c[] r0 = p9.d.f7975a
            int r0 = r0.length
            int r0 = r0 - r5
            if (r4 > r0) goto L_0x003b
            r1 = r5
        L_0x003b:
            if (r1 == 0) goto L_0x0042
            p9.c[] r3 = p9.d.f7975a
            r3 = r3[r4]
            goto L_0x0057
        L_0x0042:
            p9.c[] r0 = p9.d.f7975a
            int r0 = r0.length
            int r0 = r4 - r0
            int r1 = r3.d
            int r1 = r1 + r5
            int r1 = r1 + r0
            if (r1 < 0) goto L_0x005b
            p9.c[] r3 = r3.f7979c
            int r0 = r3.length
            if (r1 >= r0) goto L_0x005b
            r3 = r3[r1]
            z8.g.c(r3)
        L_0x0057:
            r6.add(r3)
            goto L_0x000c
        L_0x005b:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Header index too large "
            r6.<init>(r0)
            int r4 = r4 + r5
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.<init>(r4)
            throw r3
        L_0x0070:
            r5 = 64
            if (r4 != r5) goto L_0x008a
            p9.c[] r4 = p9.d.f7975a
            w9.j r4 = r3.d()
            p9.d.a(r4)
            w9.j r5 = r3.d()
            p9.c r6 = new p9.c
            r6.<init>((w9.j) r4, (w9.j) r5)
            r3.c(r6)
            goto L_0x000c
        L_0x008a:
            r0 = r4 & 64
            if (r0 != r5) goto L_0x00a8
            r5 = 63
            int r4 = r3.e(r4, r5)
            int r4 = r4 + -1
            w9.j r4 = r3.b(r4)
            w9.j r5 = r3.d()
            p9.c r6 = new p9.c
            r6.<init>((w9.j) r4, (w9.j) r5)
            r3.c(r6)
            goto L_0x000c
        L_0x00a8:
            r5 = r4 & 32
            r0 = 32
            if (r5 != r0) goto L_0x00f2
            r5 = 31
            int r4 = r3.e(r4, r5)
            r3.f7983h = r4
            if (r4 < 0) goto L_0x00dc
            int r5 = r3.f7982g
            if (r4 > r5) goto L_0x00dc
            int r5 = r3.f7981f
            if (r4 >= r5) goto L_0x000c
            if (r4 != 0) goto L_0x00d6
            p9.c[] r4 = r3.f7979c
            int r5 = r4.length
            r6 = 0
            java.util.Arrays.fill(r4, r1, r5, r6)
            p9.c[] r4 = r3.f7979c
            int r4 = r4.length
            int r4 = r4 + -1
            r3.d = r4
            r3.f7980e = r1
            r3.f7981f = r1
            goto L_0x000c
        L_0x00d6:
            int r5 = r5 - r4
            r3.a(r5)
            goto L_0x000c
        L_0x00dc:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid dynamic table size update "
            r5.<init>(r6)
            int r3 = r3.f7983h
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x00f2:
            r5 = 16
            if (r4 == r5) goto L_0x0113
            if (r4 != 0) goto L_0x00f9
            goto L_0x0113
        L_0x00f9:
            r5 = 15
            int r4 = r3.e(r4, r5)
            int r4 = r4 + -1
            w9.j r4 = r3.b(r4)
            w9.j r3 = r3.d()
            p9.c r5 = new p9.c
            r5.<init>((w9.j) r4, (w9.j) r3)
            r6.add(r5)
            goto L_0x000c
        L_0x0113:
            p9.c[] r4 = p9.d.f7975a
            w9.j r4 = r3.d()
            p9.d.a(r4)
            w9.j r3 = r3.d()
            p9.c r5 = new p9.c
            r5.<init>((w9.j) r4, (w9.j) r3)
            r6.add(r5)
            goto L_0x000c
        L_0x012a:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "index == 0"
            r3.<init>(r4)
            throw r3
        L_0x0132:
            java.util.List r3 = o8.i.y(r6)
            r6.clear()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.q.c(int, int, int, int):java.util.List");
    }

    public final void close() {
        this.f8059q.close();
    }

    public final void d(c cVar, int i10) {
        i iVar = this.f8059q;
        iVar.readInt();
        iVar.readByte();
        byte[] bArr = j9.c.f6602a;
        cVar.e();
    }
}
