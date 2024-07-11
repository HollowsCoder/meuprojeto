package k9;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import l9.d;
import n8.i;
import w9.b0;
import w9.h;
import w9.u;
import y8.l;
import z8.g;

public final class e implements Closeable, Flushable {
    public static final f9.c J = new f9.c("[a-z0-9_-]{1,120}");
    public static final String K = "CLEAN";
    public static final String L = "DIRTY";
    public static final String M = "REMOVE";
    public static final String N = "READ";
    public boolean A;
    public boolean B;
    public long C;
    public final l9.c D;
    public final g E;
    public final q9.b F;
    public final File G;
    public final int H = 201105;
    public final int I = 2;

    /* renamed from: o  reason: collision with root package name */
    public final long f6737o;

    /* renamed from: p  reason: collision with root package name */
    public final File f6738p;

    /* renamed from: q  reason: collision with root package name */
    public final File f6739q;

    /* renamed from: r  reason: collision with root package name */
    public final File f6740r;

    /* renamed from: s  reason: collision with root package name */
    public long f6741s;

    /* renamed from: t  reason: collision with root package name */
    public h f6742t;
    public final LinkedHashMap<String, b> u;

    /* renamed from: v  reason: collision with root package name */
    public int f6743v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f6744x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f6745y;
    public boolean z;

    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean[] f6746a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6747b;

        /* renamed from: c  reason: collision with root package name */
        public final b f6748c;

        /* renamed from: k9.e$a$a  reason: collision with other inner class name */
        public static final class C0096a extends z8.h implements l<IOException, i> {

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ a f6749p;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0096a(a aVar) {
                super(1);
                this.f6749p = aVar;
            }

            public final Object k(Object obj) {
                g.f((IOException) obj, "it");
                synchronized (e.this) {
                    this.f6749p.c();
                }
                return i.f7501a;
            }
        }

        public a(b bVar) {
            boolean[] zArr;
            this.f6748c = bVar;
            if (bVar.d) {
                zArr = null;
            } else {
                zArr = new boolean[e.this.I];
            }
            this.f6746a = zArr;
        }

        public final void a() {
            synchronized (e.this) {
                if (!this.f6747b) {
                    if (g.a(this.f6748c.f6754f, this)) {
                        e.this.b(this, false);
                    }
                    this.f6747b = true;
                    i iVar = i.f7501a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void b() {
            synchronized (e.this) {
                if (!this.f6747b) {
                    if (g.a(this.f6748c.f6754f, this)) {
                        e.this.b(this, true);
                    }
                    this.f6747b = true;
                    i iVar = i.f7501a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void c() {
            b bVar = this.f6748c;
            if (g.a(bVar.f6754f, this)) {
                e eVar = e.this;
                if (eVar.f6744x) {
                    eVar.b(this, false);
                } else {
                    bVar.f6753e = true;
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|23|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r4 = new w9.e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
            return r4;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0046 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final w9.z d(int r4) {
            /*
                r3 = this;
                k9.e r0 = k9.e.this
                monitor-enter(r0)
                boolean r1 = r3.f6747b     // Catch:{ all -> 0x0059 }
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x004d
                k9.e$b r1 = r3.f6748c     // Catch:{ all -> 0x0059 }
                k9.e$a r1 = r1.f6754f     // Catch:{ all -> 0x0059 }
                boolean r1 = z8.g.a(r1, r3)     // Catch:{ all -> 0x0059 }
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x001b
                w9.e r4 = new w9.e     // Catch:{ all -> 0x0059 }
                r4.<init>()     // Catch:{ all -> 0x0059 }
                monitor-exit(r0)
                return r4
            L_0x001b:
                k9.e$b r1 = r3.f6748c     // Catch:{ all -> 0x0059 }
                boolean r1 = r1.d     // Catch:{ all -> 0x0059 }
                if (r1 != 0) goto L_0x0028
                boolean[] r1 = r3.f6746a     // Catch:{ all -> 0x0059 }
                z8.g.c(r1)     // Catch:{ all -> 0x0059 }
                r1[r4] = r2     // Catch:{ all -> 0x0059 }
            L_0x0028:
                k9.e$b r1 = r3.f6748c     // Catch:{ all -> 0x0059 }
                java.util.ArrayList r1 = r1.f6752c     // Catch:{ all -> 0x0059 }
                java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0059 }
                java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x0059 }
                k9.e r1 = k9.e.this     // Catch:{ FileNotFoundException -> 0x0046 }
                q9.b r1 = r1.F     // Catch:{ FileNotFoundException -> 0x0046 }
                w9.s r4 = r1.c(r4)     // Catch:{ FileNotFoundException -> 0x0046 }
                k9.i r1 = new k9.i     // Catch:{ all -> 0x0059 }
                k9.e$a$a r2 = new k9.e$a$a     // Catch:{ all -> 0x0059 }
                r2.<init>(r3)     // Catch:{ all -> 0x0059 }
                r1.<init>(r4, r2)     // Catch:{ all -> 0x0059 }
                monitor-exit(r0)
                return r1
            L_0x0046:
                w9.e r4 = new w9.e     // Catch:{ all -> 0x0059 }
                r4.<init>()     // Catch:{ all -> 0x0059 }
                monitor-exit(r0)
                return r4
            L_0x004d:
                java.lang.String r4 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0059 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0059 }
                r1.<init>(r4)     // Catch:{ all -> 0x0059 }
                throw r1     // Catch:{ all -> 0x0059 }
            L_0x0059:
                r4 = move-exception
                monitor-exit(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: k9.e.a.d(int):w9.z");
        }
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f6750a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f6751b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f6752c = new ArrayList();
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6753e;

        /* renamed from: f  reason: collision with root package name */
        public a f6754f;

        /* renamed from: g  reason: collision with root package name */
        public int f6755g;

        /* renamed from: h  reason: collision with root package name */
        public long f6756h;

        /* renamed from: i  reason: collision with root package name */
        public final String f6757i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ e f6758j;

        public b(e eVar, String str) {
            g.f(str, "key");
            this.f6758j = eVar;
            this.f6757i = str;
            this.f6750a = new long[eVar.I];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i10 = 0; i10 < eVar.I; i10++) {
                sb.append(i10);
                ArrayList arrayList = this.f6751b;
                String sb2 = sb.toString();
                File file = eVar.G;
                arrayList.add(new File(file, sb2));
                sb.append(".tmp");
                this.f6752c.add(new File(file, sb.toString()));
                sb.setLength(length);
            }
        }

        public final c a() {
            byte[] bArr = j9.c.f6602a;
            if (!this.d) {
                return null;
            }
            e eVar = this.f6758j;
            if (!eVar.f6744x && (this.f6754f != null || this.f6753e)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f6750a.clone();
            try {
                int i10 = eVar.I;
                for (int i11 = 0; i11 < i10; i11++) {
                    b0 b10 = eVar.F.b((File) this.f6751b.get(i11));
                    if (!eVar.f6744x) {
                        this.f6755g++;
                        b10 = new f(this, b10, b10);
                    }
                    arrayList.add(b10);
                }
                return new c(this.f6758j, this.f6757i, this.f6756h, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j9.c.c((b0) it.next());
                }
                try {
                    eVar.r(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }
    }

    public final class c implements Closeable {

        /* renamed from: o  reason: collision with root package name */
        public final String f6759o;

        /* renamed from: p  reason: collision with root package name */
        public final long f6760p;

        /* renamed from: q  reason: collision with root package name */
        public final List<b0> f6761q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ e f6762r;

        public c(e eVar, String str, long j8, ArrayList arrayList, long[] jArr) {
            g.f(str, "key");
            g.f(jArr, "lengths");
            this.f6762r = eVar;
            this.f6759o = str;
            this.f6760p = j8;
            this.f6761q = arrayList;
        }

        public final void close() {
            for (b0 c10 : this.f6761q) {
                j9.c.c(c10);
            }
        }
    }

    public e(File file, long j8, d dVar) {
        q9.a aVar = q9.b.f8276a;
        g.f(dVar, "taskRunner");
        this.F = aVar;
        this.G = file;
        this.f6737o = j8;
        boolean z10 = false;
        this.u = new LinkedHashMap<>(0, 0.75f, true);
        this.D = dVar.f();
        this.E = new g(this, b0.d.g(new StringBuilder(), j9.c.f6607g, " Cache"));
        if (j8 > 0 ? true : z10) {
            this.f6738p = new File(file, "journal");
            this.f6739q = new File(file, "journal.tmp");
            this.f6740r = new File(file, "journal.bkp");
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public static void t(String str) {
        f9.c cVar = J;
        cVar.getClass();
        g.f(str, "input");
        if (!cVar.f4938o.matcher(str).matches()) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    public final synchronized void a() {
        if (!(!this.z)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(k9.e.a r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "editor"
            z8.g.f(r10, r0)     // Catch:{ all -> 0x012c }
            k9.e$b r0 = r10.f6748c     // Catch:{ all -> 0x012c }
            k9.e$a r1 = r0.f6754f     // Catch:{ all -> 0x012c }
            boolean r1 = z8.g.a(r1, r10)     // Catch:{ all -> 0x012c }
            if (r1 == 0) goto L_0x0120
            r1 = 0
            if (r11 == 0) goto L_0x0057
            boolean r2 = r0.d     // Catch:{ all -> 0x012c }
            if (r2 != 0) goto L_0x0057
            int r2 = r9.I     // Catch:{ all -> 0x012c }
            r3 = r1
        L_0x001a:
            if (r3 >= r2) goto L_0x0057
            boolean[] r4 = r10.f6746a     // Catch:{ all -> 0x012c }
            z8.g.c(r4)     // Catch:{ all -> 0x012c }
            boolean r4 = r4[r3]     // Catch:{ all -> 0x012c }
            if (r4 == 0) goto L_0x003d
            q9.b r4 = r9.F     // Catch:{ all -> 0x012c }
            java.util.ArrayList r5 = r0.f6752c     // Catch:{ all -> 0x012c }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x012c }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x012c }
            boolean r4 = r4.f(r5)     // Catch:{ all -> 0x012c }
            if (r4 != 0) goto L_0x003a
            r10.a()     // Catch:{ all -> 0x012c }
            monitor-exit(r9)
            return
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x001a
        L_0x003d:
            r10.a()     // Catch:{ all -> 0x012c }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r11.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x012c }
            r11.append(r3)     // Catch:{ all -> 0x012c }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x012c }
            r10.<init>(r11)     // Catch:{ all -> 0x012c }
            throw r10     // Catch:{ all -> 0x012c }
        L_0x0057:
            int r10 = r9.I     // Catch:{ all -> 0x012c }
            r2 = r1
        L_0x005a:
            if (r2 >= r10) goto L_0x009c
            java.util.ArrayList r3 = r0.f6752c     // Catch:{ all -> 0x012c }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x012c }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x012c }
            if (r11 == 0) goto L_0x0094
            boolean r4 = r0.f6753e     // Catch:{ all -> 0x012c }
            if (r4 != 0) goto L_0x0094
            q9.b r4 = r9.F     // Catch:{ all -> 0x012c }
            boolean r4 = r4.f(r3)     // Catch:{ all -> 0x012c }
            if (r4 == 0) goto L_0x0099
            java.util.ArrayList r4 = r0.f6751b     // Catch:{ all -> 0x012c }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x012c }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x012c }
            q9.b r5 = r9.F     // Catch:{ all -> 0x012c }
            r5.g(r3, r4)     // Catch:{ all -> 0x012c }
            long[] r3 = r0.f6750a     // Catch:{ all -> 0x012c }
            r5 = r3[r2]     // Catch:{ all -> 0x012c }
            q9.b r3 = r9.F     // Catch:{ all -> 0x012c }
            long r3 = r3.h(r4)     // Catch:{ all -> 0x012c }
            long[] r7 = r0.f6750a     // Catch:{ all -> 0x012c }
            r7[r2] = r3     // Catch:{ all -> 0x012c }
            long r7 = r9.f6741s     // Catch:{ all -> 0x012c }
            long r7 = r7 - r5
            long r7 = r7 + r3
            r9.f6741s = r7     // Catch:{ all -> 0x012c }
            goto L_0x0099
        L_0x0094:
            q9.b r4 = r9.F     // Catch:{ all -> 0x012c }
            r4.a(r3)     // Catch:{ all -> 0x012c }
        L_0x0099:
            int r2 = r2 + 1
            goto L_0x005a
        L_0x009c:
            r10 = 0
            r0.f6754f = r10     // Catch:{ all -> 0x012c }
            boolean r10 = r0.f6753e     // Catch:{ all -> 0x012c }
            if (r10 == 0) goto L_0x00a8
            r9.r(r0)     // Catch:{ all -> 0x012c }
            monitor-exit(r9)
            return
        L_0x00a8:
            int r10 = r9.f6743v     // Catch:{ all -> 0x012c }
            r2 = 1
            int r10 = r10 + r2
            r9.f6743v = r10     // Catch:{ all -> 0x012c }
            w9.h r10 = r9.f6742t     // Catch:{ all -> 0x012c }
            z8.g.c(r10)     // Catch:{ all -> 0x012c }
            boolean r3 = r0.d     // Catch:{ all -> 0x012c }
            r4 = 32
            r5 = 10
            if (r3 != 0) goto L_0x00d7
            if (r11 == 0) goto L_0x00be
            goto L_0x00d7
        L_0x00be:
            java.util.LinkedHashMap<java.lang.String, k9.e$b> r11 = r9.u     // Catch:{ all -> 0x012c }
            java.lang.String r1 = r0.f6757i     // Catch:{ all -> 0x012c }
            r11.remove(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r11 = M     // Catch:{ all -> 0x012c }
            w9.h r11 = r10.Y(r11)     // Catch:{ all -> 0x012c }
            r11.writeByte(r4)     // Catch:{ all -> 0x012c }
            java.lang.String r11 = r0.f6757i     // Catch:{ all -> 0x012c }
            r10.Y(r11)     // Catch:{ all -> 0x012c }
            r10.writeByte(r5)     // Catch:{ all -> 0x012c }
            goto L_0x0106
        L_0x00d7:
            r0.d = r2     // Catch:{ all -> 0x012c }
            java.lang.String r2 = K     // Catch:{ all -> 0x012c }
            w9.h r2 = r10.Y(r2)     // Catch:{ all -> 0x012c }
            r2.writeByte(r4)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = r0.f6757i     // Catch:{ all -> 0x012c }
            r10.Y(r2)     // Catch:{ all -> 0x012c }
            long[] r2 = r0.f6750a     // Catch:{ all -> 0x012c }
            int r3 = r2.length     // Catch:{ all -> 0x012c }
        L_0x00ea:
            if (r1 >= r3) goto L_0x00f8
            r6 = r2[r1]     // Catch:{ all -> 0x012c }
            w9.h r8 = r10.writeByte(r4)     // Catch:{ all -> 0x012c }
            r8.Z(r6)     // Catch:{ all -> 0x012c }
            int r1 = r1 + 1
            goto L_0x00ea
        L_0x00f8:
            r10.writeByte(r5)     // Catch:{ all -> 0x012c }
            if (r11 == 0) goto L_0x0106
            long r1 = r9.C     // Catch:{ all -> 0x012c }
            r3 = 1
            long r3 = r3 + r1
            r9.C = r3     // Catch:{ all -> 0x012c }
            r0.f6756h = r1     // Catch:{ all -> 0x012c }
        L_0x0106:
            r10.flush()     // Catch:{ all -> 0x012c }
            long r10 = r9.f6741s     // Catch:{ all -> 0x012c }
            long r0 = r9.f6737o     // Catch:{ all -> 0x012c }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x0117
            boolean r10 = r9.g()     // Catch:{ all -> 0x012c }
            if (r10 == 0) goto L_0x011e
        L_0x0117:
            l9.c r10 = r9.D     // Catch:{ all -> 0x012c }
            k9.g r11 = r9.E     // Catch:{ all -> 0x012c }
            r10.c(r11, 0)     // Catch:{ all -> 0x012c }
        L_0x011e:
            monitor-exit(r9)
            return
        L_0x0120:
            java.lang.String r10 = "Check failed."
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x012c }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x012c }
            r11.<init>(r10)     // Catch:{ all -> 0x012c }
            throw r11     // Catch:{ all -> 0x012c }
        L_0x012c:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.e.b(k9.e$a, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized k9.e.a c(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "key"
            z8.g.f(r6, r0)     // Catch:{ all -> 0x0084 }
            r5.f()     // Catch:{ all -> 0x0084 }
            r5.a()     // Catch:{ all -> 0x0084 }
            t(r6)     // Catch:{ all -> 0x0084 }
            java.util.LinkedHashMap<java.lang.String, k9.e$b> r0 = r5.u     // Catch:{ all -> 0x0084 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0084 }
            k9.e$b r0 = (k9.e.b) r0     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x0028
            if (r0 == 0) goto L_0x0026
            long r3 = r0.f6756h     // Catch:{ all -> 0x0084 }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0028
        L_0x0026:
            monitor-exit(r5)
            return r2
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            k9.e$a r7 = r0.f6754f     // Catch:{ all -> 0x0084 }
            goto L_0x002e
        L_0x002d:
            r7 = r2
        L_0x002e:
            if (r7 == 0) goto L_0x0032
            monitor-exit(r5)
            return r2
        L_0x0032:
            if (r0 == 0) goto L_0x003a
            int r7 = r0.f6755g     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x003a
            monitor-exit(r5)
            return r2
        L_0x003a:
            boolean r7 = r5.A     // Catch:{ all -> 0x0084 }
            if (r7 != 0) goto L_0x007b
            boolean r7 = r5.B     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x0043
            goto L_0x007b
        L_0x0043:
            w9.h r7 = r5.f6742t     // Catch:{ all -> 0x0084 }
            z8.g.c(r7)     // Catch:{ all -> 0x0084 }
            java.lang.String r8 = L     // Catch:{ all -> 0x0084 }
            w9.h r8 = r7.Y(r8)     // Catch:{ all -> 0x0084 }
            r1 = 32
            w9.h r8 = r8.writeByte(r1)     // Catch:{ all -> 0x0084 }
            w9.h r8 = r8.Y(r6)     // Catch:{ all -> 0x0084 }
            r1 = 10
            r8.writeByte(r1)     // Catch:{ all -> 0x0084 }
            r7.flush()     // Catch:{ all -> 0x0084 }
            boolean r7 = r5.w     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x0066
            monitor-exit(r5)
            return r2
        L_0x0066:
            if (r0 != 0) goto L_0x0072
            k9.e$b r0 = new k9.e$b     // Catch:{ all -> 0x0084 }
            r0.<init>(r5, r6)     // Catch:{ all -> 0x0084 }
            java.util.LinkedHashMap<java.lang.String, k9.e$b> r7 = r5.u     // Catch:{ all -> 0x0084 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0084 }
        L_0x0072:
            k9.e$a r6 = new k9.e$a     // Catch:{ all -> 0x0084 }
            r6.<init>(r0)     // Catch:{ all -> 0x0084 }
            r0.f6754f = r6     // Catch:{ all -> 0x0084 }
            monitor-exit(r5)
            return r6
        L_0x007b:
            l9.c r6 = r5.D     // Catch:{ all -> 0x0084 }
            k9.g r7 = r5.E     // Catch:{ all -> 0x0084 }
            r6.c(r7, 0)     // Catch:{ all -> 0x0084 }
            monitor-exit(r5)
            return r2
        L_0x0084:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.e.c(java.lang.String, long):k9.e$a");
    }

    public final synchronized void close() {
        if (this.f6745y) {
            if (!this.z) {
                Collection<b> values = this.u.values();
                g.e(values, "lruEntries.values");
                Object[] array = values.toArray(new b[0]);
                if (array != null) {
                    for (b bVar : (b[]) array) {
                        a aVar = bVar.f6754f;
                        if (!(aVar == null || aVar == null)) {
                            aVar.c();
                        }
                    }
                    s();
                    h hVar = this.f6742t;
                    g.c(hVar);
                    hVar.close();
                    this.f6742t = null;
                    this.z = true;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        this.z = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized k9.e.c d(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "key"
            z8.g.f(r4, r0)     // Catch:{ all -> 0x0053 }
            r3.f()     // Catch:{ all -> 0x0053 }
            r3.a()     // Catch:{ all -> 0x0053 }
            t(r4)     // Catch:{ all -> 0x0053 }
            java.util.LinkedHashMap<java.lang.String, k9.e$b> r0 = r3.u     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0053 }
            k9.e$b r0 = (k9.e.b) r0     // Catch:{ all -> 0x0053 }
            r1 = 0
            if (r0 == 0) goto L_0x0051
            k9.e$c r0 = r0.a()     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x004f
            int r1 = r3.f6743v     // Catch:{ all -> 0x0053 }
            int r1 = r1 + 1
            r3.f6743v = r1     // Catch:{ all -> 0x0053 }
            w9.h r1 = r3.f6742t     // Catch:{ all -> 0x0053 }
            z8.g.c(r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = N     // Catch:{ all -> 0x0053 }
            w9.h r1 = r1.Y(r2)     // Catch:{ all -> 0x0053 }
            r2 = 32
            w9.h r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0053 }
            w9.h r4 = r1.Y(r4)     // Catch:{ all -> 0x0053 }
            r1 = 10
            r4.writeByte(r1)     // Catch:{ all -> 0x0053 }
            boolean r4 = r3.g()     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x004d
            l9.c r4 = r3.D     // Catch:{ all -> 0x0053 }
            k9.g r1 = r3.E     // Catch:{ all -> 0x0053 }
            r4.c(r1, 0)     // Catch:{ all -> 0x0053 }
        L_0x004d:
            monitor-exit(r3)
            return r0
        L_0x004f:
            monitor-exit(r3)
            return r1
        L_0x0051:
            monitor-exit(r3)
            return r1
        L_0x0053:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.e.d(java.lang.String):k9.e$c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7 = n8.i.f7501a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        s6.a.r(r3, (java.lang.Throwable) null);
        r1.a(r2);
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        s6.a.r(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b9, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f() {
        /*
            r8 = this;
            java.lang.String r0 = "DiskLruCache "
            monitor-enter(r8)
            byte[] r1 = j9.c.f6602a     // Catch:{ all -> 0x00ba }
            boolean r1 = r8.f6745y     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r8)
            return
        L_0x000b:
            q9.b r1 = r8.F     // Catch:{ all -> 0x00ba }
            java.io.File r2 = r8.f6740r     // Catch:{ all -> 0x00ba }
            boolean r1 = r1.f(r2)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0030
            q9.b r1 = r8.F     // Catch:{ all -> 0x00ba }
            java.io.File r2 = r8.f6738p     // Catch:{ all -> 0x00ba }
            boolean r1 = r1.f(r2)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0027
            q9.b r1 = r8.F     // Catch:{ all -> 0x00ba }
            java.io.File r2 = r8.f6740r     // Catch:{ all -> 0x00ba }
            r1.a(r2)     // Catch:{ all -> 0x00ba }
            goto L_0x0030
        L_0x0027:
            q9.b r1 = r8.F     // Catch:{ all -> 0x00ba }
            java.io.File r2 = r8.f6740r     // Catch:{ all -> 0x00ba }
            java.io.File r3 = r8.f6738p     // Catch:{ all -> 0x00ba }
            r1.g(r2, r3)     // Catch:{ all -> 0x00ba }
        L_0x0030:
            q9.b r1 = r8.F     // Catch:{ all -> 0x00ba }
            java.io.File r2 = r8.f6740r     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "$this$isCivilized"
            z8.g.f(r1, r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "file"
            z8.g.f(r2, r3)     // Catch:{ all -> 0x00ba }
            w9.s r3 = r1.c(r2)     // Catch:{ all -> 0x00ba }
            r4 = 0
            r5 = 1
            r6 = 0
            r1.a(r2)     // Catch:{ IOException -> 0x004f }
            s6.a.r(r3, r6)     // Catch:{ all -> 0x00ba }
            r1 = r5
            goto L_0x0058
        L_0x004d:
            r0 = move-exception
            goto L_0x00b4
        L_0x004f:
            n8.i r7 = n8.i.f7501a     // Catch:{ all -> 0x004d }
            s6.a.r(r3, r6)     // Catch:{ all -> 0x00ba }
            r1.a(r2)     // Catch:{ all -> 0x00ba }
            r1 = r4
        L_0x0058:
            r8.f6744x = r1     // Catch:{ all -> 0x00ba }
            q9.b r1 = r8.F     // Catch:{ all -> 0x00ba }
            java.io.File r2 = r8.f6738p     // Catch:{ all -> 0x00ba }
            boolean r1 = r1.f(r2)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x00ad
            r8.l()     // Catch:{ IOException -> 0x006e }
            r8.j()     // Catch:{ IOException -> 0x006e }
            r8.f6745y = r5     // Catch:{ IOException -> 0x006e }
            monitor-exit(r8)
            return
        L_0x006e:
            r1 = move-exception
            r9.h$a r2 = r9.h.f8494c     // Catch:{ all -> 0x00ba }
            r2.getClass()     // Catch:{ all -> 0x00ba }
            r9.h r2 = r9.h.f8492a     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r3.<init>(r0)     // Catch:{ all -> 0x00ba }
            java.io.File r0 = r8.G     // Catch:{ all -> 0x00ba }
            r3.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = " is corrupt: "
            r3.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x00ba }
            r3.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = ", removing"
            r3.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00ba }
            r2.getClass()     // Catch:{ all -> 0x00ba }
            r2 = 5
            r9.h.i(r2, r0, r1)     // Catch:{ all -> 0x00ba }
            r8.close()     // Catch:{ all -> 0x00a9 }
            q9.b r0 = r8.F     // Catch:{ all -> 0x00a9 }
            java.io.File r1 = r8.G     // Catch:{ all -> 0x00a9 }
            r0.d(r1)     // Catch:{ all -> 0x00a9 }
            r8.z = r4     // Catch:{ all -> 0x00ba }
            goto L_0x00ad
        L_0x00a9:
            r0 = move-exception
            r8.z = r4     // Catch:{ all -> 0x00ba }
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x00ad:
            r8.o()     // Catch:{ all -> 0x00ba }
            r8.f6745y = r5     // Catch:{ all -> 0x00ba }
            monitor-exit(r8)
            return
        L_0x00b4:
            throw r0     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            s6.a.r(r3, r0)     // Catch:{ all -> 0x00ba }
            throw r1     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.e.f():void");
    }

    public final synchronized void flush() {
        if (this.f6745y) {
            a();
            s();
            h hVar = this.f6742t;
            g.c(hVar);
            hVar.flush();
        }
    }

    public final boolean g() {
        int i10 = this.f6743v;
        return i10 >= 2000 && i10 >= this.u.size();
    }

    public final void j() {
        File file = this.f6739q;
        q9.b bVar = this.F;
        bVar.a(file);
        Iterator<b> it = this.u.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            g.e(next, "i.next()");
            b bVar2 = next;
            a aVar = bVar2.f6754f;
            int i10 = this.I;
            int i11 = 0;
            if (aVar == null) {
                while (i11 < i10) {
                    this.f6741s += bVar2.f6750a[i11];
                    i11++;
                }
            } else {
                bVar2.f6754f = null;
                while (i11 < i10) {
                    bVar.a((File) bVar2.f6751b.get(i11));
                    bVar.a((File) bVar2.f6752c.get(i11));
                    i11++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|(1:21)(1:22)|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r12.f6743v = r10 - r12.u.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        if (r4.F() == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        r12.f6742t = n.e.n(new k9.i(r3.e(r2), new k9.h(r12)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        r0 = n8.i.f7501a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        s6.a.r(r4, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        s6.a.r(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c4, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0066 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0066=Splitter:B:18:0x0066, B:27:0x0096=Splitter:B:27:0x0096} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
            r12 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            java.io.File r2 = r12.f6738p
            q9.b r3 = r12.F
            w9.p r4 = r3.b(r2)
            w9.v r4 = n.e.o(r4)
            java.lang.String r5 = r4.D()     // Catch:{ all -> 0x0094 }
            java.lang.String r6 = r4.D()     // Catch:{ all -> 0x0094 }
            java.lang.String r7 = r4.D()     // Catch:{ all -> 0x0094 }
            java.lang.String r8 = r4.D()     // Catch:{ all -> 0x0094 }
            java.lang.String r9 = r4.D()     // Catch:{ all -> 0x0094 }
            java.lang.String r10 = "libcore.io.DiskLruCache"
            boolean r10 = z8.g.a(r10, r5)     // Catch:{ all -> 0x0094 }
            r11 = 1
            r10 = r10 ^ r11
            if (r10 != 0) goto L_0x0096
            java.lang.String r10 = "1"
            boolean r10 = z8.g.a(r10, r6)     // Catch:{ all -> 0x0094 }
            r10 = r10 ^ r11
            if (r10 != 0) goto L_0x0096
            int r10 = r12.H     // Catch:{ all -> 0x0094 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0094 }
            boolean r7 = z8.g.a(r10, r7)     // Catch:{ all -> 0x0094 }
            r7 = r7 ^ r11
            if (r7 != 0) goto L_0x0096
            int r7 = r12.I     // Catch:{ all -> 0x0094 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0094 }
            boolean r7 = z8.g.a(r7, r8)     // Catch:{ all -> 0x0094 }
            r7 = r7 ^ r11
            if (r7 != 0) goto L_0x0096
            int r7 = r9.length()     // Catch:{ all -> 0x0094 }
            r10 = 0
            if (r7 <= 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r11 = r10
        L_0x005a:
            if (r11 != 0) goto L_0x0096
        L_0x005c:
            java.lang.String r0 = r4.D()     // Catch:{ EOFException -> 0x0066 }
            r12.n(r0)     // Catch:{ EOFException -> 0x0066 }
            int r10 = r10 + 1
            goto L_0x005c
        L_0x0066:
            java.util.LinkedHashMap<java.lang.String, k9.e$b> r0 = r12.u     // Catch:{ all -> 0x0094 }
            int r0 = r0.size()     // Catch:{ all -> 0x0094 }
            int r10 = r10 - r0
            r12.f6743v = r10     // Catch:{ all -> 0x0094 }
            boolean r0 = r4.F()     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x0079
            r12.o()     // Catch:{ all -> 0x0094 }
            goto L_0x008d
        L_0x0079:
            w9.s r0 = r3.e(r2)     // Catch:{ all -> 0x0094 }
            k9.i r1 = new k9.i     // Catch:{ all -> 0x0094 }
            k9.h r2 = new k9.h     // Catch:{ all -> 0x0094 }
            r2.<init>(r12)     // Catch:{ all -> 0x0094 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0094 }
            w9.u r0 = n.e.n(r1)     // Catch:{ all -> 0x0094 }
            r12.f6742t = r0     // Catch:{ all -> 0x0094 }
        L_0x008d:
            n8.i r0 = n8.i.f7501a     // Catch:{ all -> 0x0094 }
            r0 = 0
            s6.a.r(r4, r0)
            return
        L_0x0094:
            r0 = move-exception
            goto L_0x00bf
        L_0x0096:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r3.<init>(r1)     // Catch:{ all -> 0x0094 }
            r3.append(r5)     // Catch:{ all -> 0x0094 }
            r3.append(r0)     // Catch:{ all -> 0x0094 }
            r3.append(r6)     // Catch:{ all -> 0x0094 }
            r3.append(r0)     // Catch:{ all -> 0x0094 }
            r3.append(r8)     // Catch:{ all -> 0x0094 }
            r3.append(r0)     // Catch:{ all -> 0x0094 }
            r3.append(r9)     // Catch:{ all -> 0x0094 }
            r0 = 93
            r3.append(r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0094 }
            r2.<init>(r0)     // Catch:{ all -> 0x0094 }
            throw r2     // Catch:{ all -> 0x0094 }
        L_0x00bf:
            throw r0     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r1 = move-exception
            s6.a.r(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.e.l():void");
    }

    public final void n(String str) {
        String str2;
        int g02 = f9.l.g0(str, ' ', 0, false, 6);
        if (g02 != -1) {
            int i10 = g02 + 1;
            int g03 = f9.l.g0(str, ' ', i10, false, 4);
            LinkedHashMap<String, b> linkedHashMap = this.u;
            if (g03 == -1) {
                str2 = str.substring(i10);
                g.e(str2, "(this as java.lang.String).substring(startIndex)");
                String str3 = M;
                if (g02 == str3.length() && f9.h.a0(str, str3, false)) {
                    linkedHashMap.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i10, g03);
                g.e(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            b bVar = linkedHashMap.get(str2);
            if (bVar == null) {
                bVar = new b(this, str2);
                linkedHashMap.put(str2, bVar);
            }
            if (g03 != -1) {
                String str4 = K;
                if (g02 == str4.length() && f9.h.a0(str, str4, false)) {
                    String substring = str.substring(g03 + 1);
                    g.e(substring, "(this as java.lang.String).substring(startIndex)");
                    List n02 = f9.l.n0(substring, new char[]{' '});
                    bVar.d = true;
                    bVar.f6754f = null;
                    if (n02.size() == bVar.f6758j.I) {
                        try {
                            int size = n02.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                bVar.f6750a[i11] = Long.parseLong((String) n02.get(i11));
                            }
                            return;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + n02);
                        }
                    } else {
                        throw new IOException("unexpected journal line: " + n02);
                    }
                }
            }
            if (g03 == -1) {
                String str5 = L;
                if (g02 == str5.length() && f9.h.a0(str, str5, false)) {
                    bVar.f6754f = new a(bVar);
                    return;
                }
            }
            if (g03 == -1) {
                String str6 = N;
                if (g02 == str6.length() && f9.h.a0(str, str6, false)) {
                    return;
                }
            }
            throw new IOException("unexpected journal line: ".concat(str));
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void o() {
        h hVar = this.f6742t;
        if (hVar != null) {
            hVar.close();
        }
        u n10 = n.e.n(this.F.c(this.f6739q));
        try {
            n10.Y("libcore.io.DiskLruCache");
            n10.writeByte(10);
            n10.Y("1");
            n10.writeByte(10);
            n10.Z((long) this.H);
            n10.writeByte(10);
            n10.Z((long) this.I);
            n10.writeByte(10);
            n10.writeByte(10);
            Iterator<b> it = this.u.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b next = it.next();
                if (next.f6754f != null) {
                    n10.Y(L);
                    n10.writeByte(32);
                    n10.Y(next.f6757i);
                } else {
                    n10.Y(K);
                    n10.writeByte(32);
                    n10.Y(next.f6757i);
                    for (long Z : next.f6750a) {
                        n10.writeByte(32);
                        n10.Z(Z);
                    }
                }
                n10.writeByte(10);
            }
            i iVar = i.f7501a;
            s6.a.r(n10, (Throwable) null);
            if (this.F.f(this.f6738p)) {
                this.F.g(this.f6738p, this.f6740r);
            }
            this.F.g(this.f6739q, this.f6738p);
            this.F.a(this.f6740r);
            this.f6742t = n.e.n(new i(this.F.e(this.f6738p), new h(this)));
            this.w = false;
            this.B = false;
        } catch (Throwable th) {
            s6.a.r(n10, th);
            throw th;
        }
    }

    public final void r(b bVar) {
        h hVar;
        g.f(bVar, "entry");
        boolean z10 = this.f6744x;
        String str = bVar.f6757i;
        if (!z10) {
            if (bVar.f6755g > 0 && (hVar = this.f6742t) != null) {
                hVar.Y(L);
                hVar.writeByte(32);
                hVar.Y(str);
                hVar.writeByte(10);
                hVar.flush();
            }
            if (bVar.f6755g > 0 || bVar.f6754f != null) {
                bVar.f6753e = true;
                return;
            }
        }
        a aVar = bVar.f6754f;
        if (aVar != null) {
            aVar.c();
        }
        for (int i10 = 0; i10 < this.I; i10++) {
            this.F.a((File) bVar.f6751b.get(i10));
            long j8 = this.f6741s;
            long[] jArr = bVar.f6750a;
            this.f6741s = j8 - jArr[i10];
            jArr[i10] = 0;
        }
        this.f6743v++;
        h hVar2 = this.f6742t;
        if (hVar2 != null) {
            hVar2.Y(M);
            hVar2.writeByte(32);
            hVar2.Y(str);
            hVar2.writeByte(10);
        }
        this.u.remove(str);
        if (g()) {
            this.D.c(this.E, 0);
        }
    }

    public final void s() {
        boolean z10;
        do {
            z10 = false;
            if (this.f6741s > this.f6737o) {
                Iterator<b> it = this.u.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    b next = it.next();
                    if (!next.f6753e) {
                        r(next);
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else {
                this.A = false;
                return;
            }
        } while (z10);
    }
}
