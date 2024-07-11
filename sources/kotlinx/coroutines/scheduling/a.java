package kotlinx.coroutines.scheduling;

import d7.j0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import n.e;
import n8.i;
import z8.g;

public final class a implements Executor, Closeable {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f6803v;
    public static final /* synthetic */ AtomicLongFieldUpdater w;

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6804x;

    /* renamed from: y  reason: collision with root package name */
    public static final j0 f6805y = new j0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: o  reason: collision with root package name */
    public final int f6806o;

    /* renamed from: p  reason: collision with root package name */
    public final int f6807p;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: q  reason: collision with root package name */
    public final long f6808q;

    /* renamed from: r  reason: collision with root package name */
    public final String f6809r;

    /* renamed from: s  reason: collision with root package name */
    public final d f6810s;

    /* renamed from: t  reason: collision with root package name */
    public final d f6811t;
    public final AtomicReferenceArray<b> u;

    /* renamed from: kotlinx.coroutines.scheduling.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0097a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6812a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.PARKING.ordinal()] = 1;
            iArr[c.BLOCKING.ordinal()] = 2;
            iArr[c.CPU_ACQUIRED.ordinal()] = 3;
            iArr[c.DORMANT.ordinal()] = 4;
            iArr[c.TERMINATED.ordinal()] = 5;
            f6812a = iArr;
        }
    }

    public final class b extends Thread {

        /* renamed from: v  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f6813v = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: o  reason: collision with root package name */
        public final k f6814o;

        /* renamed from: p  reason: collision with root package name */
        public c f6815p;

        /* renamed from: q  reason: collision with root package name */
        public long f6816q;

        /* renamed from: r  reason: collision with root package name */
        public long f6817r;

        /* renamed from: s  reason: collision with root package name */
        public int f6818s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f6819t;
        volatile /* synthetic */ int workerCtl;

        public b() {
            throw null;
        }

        public b(int i10) {
            a.this = a.this;
            setDaemon(true);
            this.f6814o = new k();
            this.f6815p = c.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f6805y;
            this.f6818s = a9.c.f118o.a();
            f(i10);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlinx.coroutines.scheduling.g} */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
            if (r0 == null) goto L_0x0092;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlinx.coroutines.scheduling.g a(boolean r11) {
            /*
                r10 = this;
                kotlinx.coroutines.scheduling.a$c r0 = r10.f6815p
                kotlinx.coroutines.scheduling.a$c r1 = kotlinx.coroutines.scheduling.a.c.CPU_ACQUIRED
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L_0x0009
                goto L_0x0032
            L_0x0009:
                kotlinx.coroutines.scheduling.a r0 = kotlinx.coroutines.scheduling.a.this
            L_0x000b:
                long r6 = r0.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r1 = 42
                long r4 = r4 >> r1
                int r1 = (int) r4
                if (r1 != 0) goto L_0x001b
                r0 = r2
                goto L_0x002c
            L_0x001b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.a.w
                r5 = r0
                boolean r1 = r4.compareAndSet(r5, r6, r8)
                if (r1 == 0) goto L_0x000b
                r0 = r3
            L_0x002c:
                if (r0 == 0) goto L_0x0034
                kotlinx.coroutines.scheduling.a$c r0 = kotlinx.coroutines.scheduling.a.c.CPU_ACQUIRED
                r10.f6815p = r0
            L_0x0032:
                r0 = r3
                goto L_0x0035
            L_0x0034:
                r0 = r2
            L_0x0035:
                r1 = 0
                if (r0 == 0) goto L_0x007b
                if (r11 == 0) goto L_0x0070
                kotlinx.coroutines.scheduling.a r11 = kotlinx.coroutines.scheduling.a.this
                int r11 = r11.f6806o
                int r11 = r11 * 2
                int r11 = r10.d(r11)
                if (r11 != 0) goto L_0x0047
                goto L_0x0048
            L_0x0047:
                r3 = r2
            L_0x0048:
                if (r3 == 0) goto L_0x0050
                kotlinx.coroutines.scheduling.g r11 = r10.e()
                if (r11 != 0) goto L_0x007a
            L_0x0050:
                kotlinx.coroutines.scheduling.k r11 = r10.f6814o
                r11.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.k.f6836b
                java.lang.Object r0 = r0.getAndSet(r11, r1)
                kotlinx.coroutines.scheduling.g r0 = (kotlinx.coroutines.scheduling.g) r0
                if (r0 != 0) goto L_0x0064
                kotlinx.coroutines.scheduling.g r11 = r11.d()
                goto L_0x0065
            L_0x0064:
                r11 = r0
            L_0x0065:
                if (r11 != 0) goto L_0x007a
                if (r3 != 0) goto L_0x0076
                kotlinx.coroutines.scheduling.g r11 = r10.e()
                if (r11 != 0) goto L_0x007a
                goto L_0x0076
            L_0x0070:
                kotlinx.coroutines.scheduling.g r11 = r10.e()
                if (r11 != 0) goto L_0x007a
            L_0x0076:
                kotlinx.coroutines.scheduling.g r11 = r10.i(r2)
            L_0x007a:
                return r11
            L_0x007b:
                if (r11 == 0) goto L_0x0092
                kotlinx.coroutines.scheduling.k r11 = r10.f6814o
                r11.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.k.f6836b
                java.lang.Object r0 = r0.getAndSet(r11, r1)
                kotlinx.coroutines.scheduling.g r0 = (kotlinx.coroutines.scheduling.g) r0
                if (r0 != 0) goto L_0x0090
                kotlinx.coroutines.scheduling.g r0 = r11.d()
            L_0x0090:
                if (r0 != 0) goto L_0x009d
            L_0x0092:
                kotlinx.coroutines.scheduling.a r11 = kotlinx.coroutines.scheduling.a.this
                kotlinx.coroutines.scheduling.d r11 = r11.f6811t
                java.lang.Object r11 = r11.d()
                r0 = r11
                kotlinx.coroutines.scheduling.g r0 = (kotlinx.coroutines.scheduling.g) r0
            L_0x009d:
                if (r0 != 0) goto L_0x00a3
                kotlinx.coroutines.scheduling.g r0 = r10.i(r3)
            L_0x00a3:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.b.a(boolean):kotlinx.coroutines.scheduling.g");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i10) {
            int i11 = this.f6818s;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f6818s = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final g e() {
            d dVar;
            int d = d(2);
            a aVar = a.this;
            if (d == 0) {
                g gVar = (g) aVar.f6810s.d();
                if (gVar != null) {
                    return gVar;
                }
                dVar = aVar.f6811t;
            } else {
                g gVar2 = (g) aVar.f6811t.d();
                if (gVar2 != null) {
                    return gVar2;
                }
                dVar = aVar.f6810s;
            }
            return (g) dVar.d();
        }

        public final void f(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f6809r);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(c cVar) {
            c cVar2 = this.f6815p;
            boolean z = cVar2 == c.CPU_ACQUIRED;
            if (z) {
                a.w.addAndGet(a.this, 4398046511104L);
            }
            if (cVar2 != cVar) {
                this.f6815p = cVar;
            }
            return z;
        }

        public final g i(boolean z) {
            long j8;
            int i10 = (int) (a.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int d = d(i10);
            a aVar = a.this;
            long j10 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                d++;
                if (d > i10) {
                    d = 1;
                }
                b bVar = aVar.u.get(d);
                if (!(bVar == null || bVar == this)) {
                    k kVar = this.f6814o;
                    k kVar2 = bVar.f6814o;
                    if (z) {
                        j8 = kVar.e(kVar2);
                    } else {
                        kVar.getClass();
                        g d10 = kVar2.d();
                        if (d10 != null) {
                            kVar.a(d10, false);
                            j8 = -1;
                        } else {
                            j8 = kVar.f(kVar2, false);
                        }
                    }
                    if (j8 == -1) {
                        k kVar3 = this.f6814o;
                        kVar3.getClass();
                        g gVar = (g) k.f6836b.getAndSet(kVar3, (Object) null);
                        if (gVar == null) {
                            return kVar3.d();
                        }
                        return gVar;
                    } else if (j8 > 0) {
                        j10 = Math.min(j10, j8);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f6817r = j10;
            return null;
        }

        public final void run() {
            c cVar;
            boolean z;
            boolean z10;
            c cVar2;
            loop0:
            while (true) {
                boolean z11 = false;
                while (!a.this.isTerminated() && this.f6815p != (cVar = c.TERMINATED)) {
                    g a10 = a(this.f6819t);
                    if (a10 == null) {
                        this.f6819t = false;
                        if (this.f6817r == 0) {
                            if (this.nextParkedWorker != a.f6805y) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (this.nextParkedWorker != a.f6805y) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10 || this.workerCtl != -1 || a.this.isTerminated() || this.f6815p == (cVar2 = c.TERMINATED)) {
                                        break;
                                    }
                                    h(c.PARKING);
                                    Thread.interrupted();
                                    if (this.f6816q == 0) {
                                        this.f6816q = System.nanoTime() + a.this.f6808q;
                                    }
                                    LockSupport.parkNanos(a.this.f6808q);
                                    if (System.nanoTime() - this.f6816q >= 0) {
                                        this.f6816q = 0;
                                        a aVar = a.this;
                                        synchronized (aVar.u) {
                                            if (!aVar.isTerminated()) {
                                                if (((int) (aVar.controlState & 2097151)) > aVar.f6806o) {
                                                    if (f6813v.compareAndSet(this, -1, 1)) {
                                                        int i10 = this.indexInArray;
                                                        f(0);
                                                        aVar.d(this, i10, 0);
                                                        int andDecrement = (int) (a.w.getAndDecrement(aVar) & 2097151);
                                                        if (andDecrement != i10) {
                                                            b bVar = aVar.u.get(andDecrement);
                                                            g.c(bVar);
                                                            b bVar2 = bVar;
                                                            aVar.u.set(i10, bVar2);
                                                            bVar2.f(i10);
                                                            aVar.d(bVar2, andDecrement, i10);
                                                        }
                                                        aVar.u.set(andDecrement, (Object) null);
                                                        i iVar = i.f7501a;
                                                        this.f6815p = cVar2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                a.this.c(this);
                            }
                        } else if (!z11) {
                            z11 = true;
                        } else {
                            h(c.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f6817r);
                            this.f6817r = 0;
                        }
                    } else {
                        this.f6817r = 0;
                        int u10 = a10.f6830p.u();
                        this.f6816q = 0;
                        if (this.f6815p == c.PARKING) {
                            this.f6815p = c.BLOCKING;
                        }
                        a aVar2 = a.this;
                        if (u10 != 0 && h(c.BLOCKING) && !aVar2.g() && !aVar2.f(aVar2.controlState)) {
                            aVar2.g();
                        }
                        aVar2.getClass();
                        try {
                            a10.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (u10 != 0) {
                            a.w.addAndGet(aVar2, -2097152);
                            if (this.f6815p != cVar) {
                                this.f6815p = c.DORMANT;
                            }
                        }
                    }
                }
            }
            h(c.TERMINATED);
            return;
        }
    }

    public enum c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    static {
        Class<a> cls = a.class;
        f6803v = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        w = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        f6804x = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    public a(int i10, int i11, long j8, String str) {
        this.f6806o = i10;
        this.f6807p = i11;
        this.f6808q = j8;
        this.f6809r = str;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j8 > 0) {
                        this.f6810s = new d();
                        this.f6811t = new d();
                        this.parkedWorkersStack = 0;
                        this.u = new AtomicReferenceArray<>(i11 + 1);
                        this.controlState = ((long) i10) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j8 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
    }

    public final int a() {
        boolean z;
        synchronized (this.u) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j8 = this.controlState;
            int i10 = (int) (j8 & 2097151);
            int i11 = i10 - ((int) ((j8 & 4398044413952L) >> 21));
            boolean z10 = false;
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 >= this.f6806o) {
                return 0;
            }
            if (i10 >= this.f6807p) {
                return 0;
            }
            int i12 = ((int) (this.controlState & 2097151)) + 1;
            if (i12 <= 0 || this.u.get(i12) != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                b bVar = new b(i12);
                this.u.set(i12, bVar);
                if (i12 == ((int) (2097151 & w.incrementAndGet(this)))) {
                    z10 = true;
                }
                if (z10) {
                    bVar.start();
                    int i13 = i11 + 1;
                    return i13;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void b(Runnable runnable, h hVar, boolean z) {
        g gVar;
        b bVar;
        g gVar2;
        boolean z10;
        d dVar;
        j.f6835e.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            gVar = (g) runnable;
            gVar.f6829o = nanoTime;
            gVar.f6830p = hVar;
        } else {
            gVar = new i(runnable, nanoTime, hVar);
        }
        Thread currentThread = Thread.currentThread();
        b bVar2 = null;
        if (currentThread instanceof b) {
            bVar = (b) currentThread;
        } else {
            bVar = null;
        }
        if (bVar != null && g.a(a.this, this)) {
            bVar2 = bVar;
        }
        boolean z11 = true;
        if (bVar2 == null || bVar2.f6815p == c.TERMINATED || (gVar.f6830p.u() == 0 && bVar2.f6815p == c.BLOCKING)) {
            gVar2 = gVar;
        } else {
            bVar2.f6819t = true;
            gVar2 = bVar2.f6814o.a(gVar, z);
        }
        if (gVar2 != null) {
            if (gVar2.f6830p.u() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                dVar = this.f6811t;
            } else {
                dVar = this.f6810s;
            }
            if (!dVar.a(gVar2)) {
                throw new RejectedExecutionException(g.k(" was terminated", this.f6809r));
            }
        }
        if (!z || bVar2 == null) {
            z11 = false;
        }
        if (gVar.f6830p.u() != 0) {
            long addAndGet = w.addAndGet(this, 2097152);
            if (!z11 && !g() && !f(addAndGet)) {
                g();
            }
        } else if (!z11 && !g() && !f(this.controlState)) {
            g();
        }
    }

    public final void c(b bVar) {
        long j8;
        long j10;
        if (bVar.c() == f6805y) {
            do {
                j8 = this.parkedWorkersStack;
                int b10 = bVar.b();
                bVar.g(this.u.get((int) (2097151 & j8)));
                j10 = (long) b10;
            } while (!f6803v.compareAndSet(this, j8, j10 | ((2097152 + j8) & -2097152)));
        }
    }

    public final void close() {
        b bVar;
        int i10;
        g gVar;
        boolean z;
        if (f6804x.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            if (currentThread instanceof b) {
                bVar = (b) currentThread;
            } else {
                bVar = null;
            }
            if (bVar == null || !g.a(a.this, this)) {
                bVar = null;
            }
            synchronized (this.u) {
                i10 = (int) (this.controlState & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    int i12 = i11 + 1;
                    b bVar2 = this.u.get(i11);
                    g.c(bVar2);
                    b bVar3 = bVar2;
                    if (bVar3 != bVar) {
                        while (bVar3.isAlive()) {
                            LockSupport.unpark(bVar3);
                            bVar3.join(10000);
                        }
                        k kVar = bVar3.f6814o;
                        d dVar = this.f6811t;
                        kVar.getClass();
                        g gVar2 = (g) k.f6836b.getAndSet(kVar, (Object) null);
                        if (gVar2 != null) {
                            dVar.a(gVar2);
                        }
                        do {
                            g d = kVar.d();
                            if (d == null) {
                                z = false;
                                continue;
                            } else {
                                dVar.a(d);
                                z = true;
                                continue;
                            }
                        } while (z);
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11 = i12;
                }
            }
            this.f6811t.b();
            this.f6810s.b();
            while (true) {
                if (bVar == null) {
                    gVar = null;
                } else {
                    gVar = bVar.a(true);
                }
                if (gVar == null && (gVar = (g) this.f6810s.d()) == null && (gVar = (g) this.f6811t.d()) == null) {
                    if (bVar != null) {
                        bVar.h(c.TERMINATED);
                    }
                    this.parkedWorkersStack = 0;
                    this.controlState = 0;
                    return;
                }
                try {
                    gVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
        }
    }

    public final void d(b bVar, int i10, int i11) {
        while (true) {
            long j8 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j8);
            long j10 = (2097152 + j8) & -2097152;
            if (i12 == i10) {
                if (i11 == 0) {
                    b bVar2 = bVar;
                    while (true) {
                        Object c10 = bVar2.c();
                        if (c10 != f6805y) {
                            if (c10 != null) {
                                bVar2 = (b) c10;
                                int b10 = bVar2.b();
                                if (b10 != 0) {
                                    i12 = b10;
                                    break;
                                }
                            } else {
                                i12 = 0;
                                break;
                            }
                        } else {
                            i12 = -1;
                            break;
                        }
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f6803v.compareAndSet(this, j8, j10 | ((long) i12))) {
                    return;
                }
            }
        }
    }

    public final void execute(Runnable runnable) {
        b(runnable, androidx.databinding.a.x0, false);
    }

    public final boolean f(long j8) {
        int i10 = ((int) (2097151 & j8)) - ((int) ((j8 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f6806o;
        if (i10 < i11) {
            int a10 = a();
            if (a10 == 1 && i11 > 1) {
                a();
            }
            if (a10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        j0 j0Var;
        int i10;
        while (true) {
            long j8 = this.parkedWorkersStack;
            b bVar = this.u.get((int) (2097151 & j8));
            if (bVar == null) {
                bVar = null;
            } else {
                long j10 = (2097152 + j8) & -2097152;
                b bVar2 = bVar;
                while (true) {
                    Object c10 = bVar2.c();
                    j0Var = f6805y;
                    if (c10 != j0Var) {
                        if (c10 != null) {
                            bVar2 = (b) c10;
                            i10 = bVar2.b();
                            if (i10 != 0) {
                                break;
                            }
                        } else {
                            i10 = 0;
                            break;
                        }
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 < 0) {
                    continue;
                } else {
                    if (f6803v.compareAndSet(this, j8, ((long) i10) | j10)) {
                        bVar.g(j0Var);
                    } else {
                        continue;
                    }
                }
            }
            if (bVar == null) {
                return false;
            }
            if (b.f6813v.compareAndSet(bVar, -1, 0)) {
                LockSupport.unpark(bVar);
                return true;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final String toString() {
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        int length = this.u.length();
        int i14 = 0;
        if (1 < length) {
            i12 = 0;
            int i15 = 0;
            i11 = 0;
            i10 = 0;
            int i16 = 1;
            while (true) {
                int i17 = i16 + 1;
                b bVar = this.u.get(i16);
                if (bVar != null) {
                    int c10 = bVar.f6814o.c();
                    int i18 = C0097a.f6812a[bVar.f6815p.ordinal()];
                    if (i18 == 1) {
                        i14++;
                    } else if (i18 == 2) {
                        i12++;
                        StringBuilder sb = new StringBuilder();
                        sb.append(c10);
                        sb.append('b');
                        arrayList.add(sb.toString());
                    } else if (i18 == 3) {
                        i15++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c10);
                        sb2.append('c');
                        arrayList.add(sb2.toString());
                    } else if (i18 == 4) {
                        i11++;
                        if (c10 > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(c10);
                            sb3.append('d');
                            arrayList.add(sb3.toString());
                        }
                    } else if (i18 == 5) {
                        i10++;
                    }
                }
                if (i17 >= length) {
                    break;
                }
                i16 = i17;
            }
            i13 = i14;
            i14 = i15;
        } else {
            i13 = 0;
            i12 = 0;
            i11 = 0;
            i10 = 0;
        }
        long j8 = this.controlState;
        return this.f6809r + '@' + e.x(this) + "[Pool Size {core = " + this.f6806o + ", max = " + this.f6807p + "}, Worker States {CPU = " + i14 + ", blocking = " + i12 + ", parked = " + i13 + ", dormant = " + i11 + ", terminated = " + i10 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f6810s.c() + ", global blocking queue size = " + this.f6811t.c() + ", Control State {created workers= " + ((int) (2097151 & j8)) + ", blocking tasks = " + ((int) ((4398044413952L & j8) >> 21)) + ", CPUs acquired = " + (this.f6806o - ((int) ((9223367638808264704L & j8) >> 42))) + "}]";
    }
}
