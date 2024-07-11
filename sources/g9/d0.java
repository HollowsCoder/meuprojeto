package g9;

import d7.j0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.g;
import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.internal.o;
import q8.f;

public abstract class d0 extends e0 {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5005s;

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5006t;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    public static abstract class a implements Runnable, Comparable<a>, a0, o {

        /* renamed from: o  reason: collision with root package name */
        public long f5007o;

        /* renamed from: p  reason: collision with root package name */
        public Object f5008p;

        /* renamed from: q  reason: collision with root package name */
        public int f5009q;

        public final int compareTo(Object obj) {
            int i10 = ((this.f5007o - ((a) obj).f5007o) > 0 ? 1 : ((this.f5007o - ((a) obj).f5007o) == 0 ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlinx.coroutines.internal.n} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void g() {
            /*
                r5 = this;
                monitor-enter(r5)
                java.lang.Object r0 = r5.f5008p     // Catch:{ all -> 0x0031 }
                d7.j0 r1 = androidx.databinding.a.f999b0     // Catch:{ all -> 0x0031 }
                if (r0 != r1) goto L_0x0009
                monitor-exit(r5)
                return
            L_0x0009:
                boolean r2 = r0 instanceof g9.d0.b     // Catch:{ all -> 0x0031 }
                r3 = 0
                if (r2 == 0) goto L_0x0011
                g9.d0$b r0 = (g9.d0.b) r0     // Catch:{ all -> 0x0031 }
                goto L_0x0012
            L_0x0011:
                r0 = r3
            L_0x0012:
                if (r0 != 0) goto L_0x0015
                goto L_0x002b
            L_0x0015:
                monitor-enter(r0)     // Catch:{ all -> 0x0031 }
                java.lang.Object r2 = r5.f5008p     // Catch:{ all -> 0x0020 }
                boolean r4 = r2 instanceof kotlinx.coroutines.internal.n     // Catch:{ all -> 0x0020 }
                if (r4 == 0) goto L_0x0022
                r3 = r2
                kotlinx.coroutines.internal.n r3 = (kotlinx.coroutines.internal.n) r3     // Catch:{ all -> 0x0020 }
                goto L_0x0022
            L_0x0020:
                r1 = move-exception
                goto L_0x002f
            L_0x0022:
                if (r3 != 0) goto L_0x0025
                goto L_0x002a
            L_0x0025:
                int r2 = r5.f5009q     // Catch:{ all -> 0x0020 }
                r0.c(r2)     // Catch:{ all -> 0x0020 }
            L_0x002a:
                monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            L_0x002b:
                r5.f5008p = r1     // Catch:{ all -> 0x0031 }
                monitor-exit(r5)
                return
            L_0x002f:
                monitor-exit(r0)     // Catch:{ all -> 0x0031 }
                throw r1     // Catch:{ all -> 0x0031 }
            L_0x0031:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g9.d0.a.g():void");
        }

        public final void i(b bVar) {
            if (this.f5008p != androidx.databinding.a.f999b0) {
                this.f5008p = bVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final void setIndex(int i10) {
            this.f5009q = i10;
        }

        public final String toString() {
            return "Delayed[nanos=" + this.f5007o + ']';
        }
    }

    public static final class b extends n<a> {

        /* renamed from: b  reason: collision with root package name */
        public long f5010b;

        public b(long j8) {
            this.f5010b = j8;
        }
    }

    static {
        Class<d0> cls = d0.class;
        Class<Object> cls2 = Object.class;
        f5005s = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        f5006t = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
    }

    public final void J(Runnable runnable) {
        if (M(runnable)) {
            Thread G = G();
            if (Thread.currentThread() != G) {
                LockSupport.unpark(G);
                return;
            }
            return;
        }
        w.u.J(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039 A[LOOP:2: B:22:0x0039->B:25:0x0044, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean M(java.lang.Runnable r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6._queue
            int r1 = r6._isCompleted
            r2 = 0
            if (r1 == 0) goto L_0x0008
            return r2
        L_0x0008:
            r1 = 1
            if (r0 != 0) goto L_0x001f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f5005s
        L_0x000d:
            r0 = 0
            boolean r0 = r3.compareAndSet(r6, r0, r7)
            if (r0 == 0) goto L_0x0016
            r2 = r1
            goto L_0x001c
        L_0x0016:
            java.lang.Object r0 = r3.get(r6)
            if (r0 == 0) goto L_0x000d
        L_0x001c:
            if (r2 == 0) goto L_0x0000
            return r1
        L_0x001f:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.g
            if (r3 == 0) goto L_0x0048
            r3 = r0
            kotlinx.coroutines.internal.g r3 = (kotlinx.coroutines.internal.g) r3
            int r4 = r3.a(r7)
            if (r4 == 0) goto L_0x0047
            if (r4 == r1) goto L_0x0033
            r0 = 2
            if (r4 == r0) goto L_0x0032
            goto L_0x0000
        L_0x0032:
            return r2
        L_0x0033:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f5005s
            kotlinx.coroutines.internal.g r3 = r3.e()
        L_0x0039:
            boolean r1 = r2.compareAndSet(r6, r0, r3)
            if (r1 == 0) goto L_0x0040
            goto L_0x0000
        L_0x0040:
            java.lang.Object r1 = r2.get(r6)
            if (r1 == r0) goto L_0x0039
            goto L_0x0000
        L_0x0047:
            return r1
        L_0x0048:
            d7.j0 r3 = androidx.databinding.a.f1000c0
            if (r0 != r3) goto L_0x004d
            return r2
        L_0x004d:
            kotlinx.coroutines.internal.g r3 = new kotlinx.coroutines.internal.g
            r4 = 8
            r3.<init>(r4, r1)
            r4 = r0
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f5005s
        L_0x005f:
            boolean r5 = r4.compareAndSet(r6, r0, r3)
            if (r5 == 0) goto L_0x0067
            r2 = r1
            goto L_0x006d
        L_0x0067:
            java.lang.Object r5 = r4.get(r6)
            if (r5 == r0) goto L_0x005f
        L_0x006d:
            if (r2 == 0) goto L_0x0000
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.d0.M(java.lang.Runnable):boolean");
    }

    public final boolean S() {
        boolean z;
        kotlinx.coroutines.internal.a<y<?>> aVar = this.f5002r;
        if (aVar == null || aVar.f6772b == aVar.f6773c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.b()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof g) {
                return ((g) obj).d();
            }
            if (obj != androidx.databinding.a.f1000c0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x007f A[EDGE_INSN: B:100:0x007f->B:48:0x007f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006d A[LOOP:2: B:42:0x006d->B:45:0x0078, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long T() {
        /*
            r11 = this;
            boolean r0 = r11.E()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r11._delayed
            g9.d0$b r0 = (g9.d0.b) r0
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0050
            boolean r6 = r0.b()
            if (r6 != 0) goto L_0x0050
            long r6 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            T[] r8 = r0.f6799a     // Catch:{ all -> 0x004d }
            if (r8 != 0) goto L_0x0023
            r8 = r4
            goto L_0x0025
        L_0x0023:
            r8 = r8[r5]     // Catch:{ all -> 0x004d }
        L_0x0025:
            if (r8 != 0) goto L_0x002a
            monitor-exit(r0)
            r8 = r4
            goto L_0x0048
        L_0x002a:
            g9.d0$a r8 = (g9.d0.a) r8     // Catch:{ all -> 0x004d }
            long r9 = r8.f5007o     // Catch:{ all -> 0x004d }
            long r9 = r6 - r9
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x0036
            r9 = r3
            goto L_0x0037
        L_0x0036:
            r9 = r5
        L_0x0037:
            if (r9 == 0) goto L_0x003e
            boolean r8 = r11.M(r8)     // Catch:{ all -> 0x004d }
            goto L_0x003f
        L_0x003e:
            r8 = r5
        L_0x003f:
            if (r8 == 0) goto L_0x0046
            kotlinx.coroutines.internal.o r8 = r0.c(r5)     // Catch:{ all -> 0x004d }
            goto L_0x0047
        L_0x0046:
            r8 = r4
        L_0x0047:
            monitor-exit(r0)
        L_0x0048:
            g9.d0$a r8 = (g9.d0.a) r8
            if (r8 != 0) goto L_0x001c
            goto L_0x0050
        L_0x004d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0050:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x0055
            goto L_0x007f
        L_0x0055:
            boolean r6 = r0 instanceof kotlinx.coroutines.internal.g
            if (r6 == 0) goto L_0x007b
            r6 = r0
            kotlinx.coroutines.internal.g r6 = (kotlinx.coroutines.internal.g) r6
            java.lang.Object r7 = r6.f()
            d7.j0 r8 = kotlinx.coroutines.internal.g.f6787g
            if (r7 == r8) goto L_0x0067
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L_0x0097
        L_0x0067:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f5005s
            kotlinx.coroutines.internal.g r6 = r6.e()
        L_0x006d:
            boolean r8 = r7.compareAndSet(r11, r0, r6)
            if (r8 == 0) goto L_0x0074
            goto L_0x0050
        L_0x0074:
            java.lang.Object r8 = r7.get(r11)
            if (r8 == r0) goto L_0x006d
            goto L_0x0050
        L_0x007b:
            d7.j0 r6 = androidx.databinding.a.f1000c0
            if (r0 != r6) goto L_0x0081
        L_0x007f:
            r7 = r4
            goto L_0x0097
        L_0x0081:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f5005s
        L_0x0083:
            boolean r7 = r6.compareAndSet(r11, r0, r4)
            if (r7 == 0) goto L_0x008b
            r6 = r3
            goto L_0x0092
        L_0x008b:
            java.lang.Object r7 = r6.get(r11)
            if (r7 == r0) goto L_0x0083
            r6 = r5
        L_0x0092:
            if (r6 == 0) goto L_0x0050
            r7 = r0
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L_0x0097:
            if (r7 == 0) goto L_0x009d
            r7.run()
            return r1
        L_0x009d:
            kotlinx.coroutines.internal.a<g9.y<?>> r0 = r11.f5002r
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x00a7
            goto L_0x00b1
        L_0x00a7:
            int r8 = r0.f6772b
            int r0 = r0.f6773c
            if (r8 != r0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r3 = r5
        L_0x00af:
            if (r3 == 0) goto L_0x00b3
        L_0x00b1:
            r8 = r6
            goto L_0x00b4
        L_0x00b3:
            r8 = r1
        L_0x00b4:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            goto L_0x00f6
        L_0x00b9:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x00be
            goto L_0x00cb
        L_0x00be:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.g
            if (r3 == 0) goto L_0x00f1
            kotlinx.coroutines.internal.g r0 = (kotlinx.coroutines.internal.g) r0
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x00cb
            goto L_0x00f6
        L_0x00cb:
            java.lang.Object r0 = r11._delayed
            g9.d0$b r0 = (g9.d0.b) r0
            if (r0 != 0) goto L_0x00d2
            goto L_0x00dd
        L_0x00d2:
            monitor-enter(r0)
            T[] r3 = r0.f6799a     // Catch:{ all -> 0x00ee }
            if (r3 != 0) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r4 = r3[r5]     // Catch:{ all -> 0x00ee }
        L_0x00da:
            monitor-exit(r0)
            g9.d0$a r4 = (g9.d0.a) r4
        L_0x00dd:
            if (r4 != 0) goto L_0x00e0
            goto L_0x00f5
        L_0x00e0:
            long r3 = r4.f5007o
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ec
            goto L_0x00f6
        L_0x00ec:
            r1 = r3
            goto L_0x00f6
        L_0x00ee:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00f1:
            d7.j0 r3 = androidx.databinding.a.f1000c0
            if (r0 != r3) goto L_0x00f6
        L_0x00f5:
            r1 = r6
        L_0x00f6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.d0.T():long");
    }

    public final void U() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005f, code lost:
        if ((r8 - r0.f5010b) > 0) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0016 A[LOOP:0: B:5:0x0016->B:8:0x0021, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V(long r13, g9.d0.a r15) {
        /*
            r12 = this;
            int r0 = r12._isCompleted
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0009
            goto L_0x0048
        L_0x0009:
            java.lang.Object r0 = r12._delayed
            g9.d0$b r0 = (g9.d0.b) r0
            if (r0 != 0) goto L_0x002a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f5006t
            g9.d0$b r6 = new g9.d0$b
            r6.<init>(r13)
        L_0x0016:
            boolean r0 = r5.compareAndSet(r12, r3, r6)
            if (r0 == 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            java.lang.Object r0 = r5.get(r12)
            if (r0 == 0) goto L_0x0016
        L_0x0023:
            java.lang.Object r0 = r12._delayed
            z8.g.c(r0)
            g9.d0$b r0 = (g9.d0.b) r0
        L_0x002a:
            monitor-enter(r15)
            java.lang.Object r5 = r15.f5008p     // Catch:{ all -> 0x00b6 }
            d7.j0 r6 = androidx.databinding.a.f999b0     // Catch:{ all -> 0x00b6 }
            if (r5 != r6) goto L_0x0034
            monitor-exit(r15)
            r0 = r2
            goto L_0x0074
        L_0x0034:
            monitor-enter(r0)     // Catch:{ all -> 0x00b6 }
            T[] r5 = r0.f6799a     // Catch:{ all -> 0x00b3 }
            if (r5 != 0) goto L_0x003b
            r5 = r3
            goto L_0x003d
        L_0x003b:
            r5 = r5[r1]     // Catch:{ all -> 0x00b3 }
        L_0x003d:
            g9.d0$a r5 = (g9.d0.a) r5     // Catch:{ all -> 0x00b3 }
            r6 = r12
            g9.w r6 = (g9.w) r6     // Catch:{ all -> 0x00b3 }
            int r6 = r6._isCompleted     // Catch:{ all -> 0x00b3 }
            if (r6 == 0) goto L_0x004a
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r15)
        L_0x0048:
            r0 = r4
            goto L_0x0074
        L_0x004a:
            r6 = 0
            if (r5 != 0) goto L_0x0050
            r8 = r13
            goto L_0x0061
        L_0x0050:
            long r8 = r5.f5007o     // Catch:{ all -> 0x00b3 }
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0059
            r8 = r13
        L_0x0059:
            long r10 = r0.f5010b     // Catch:{ all -> 0x00b3 }
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0063
        L_0x0061:
            r0.f5010b = r8     // Catch:{ all -> 0x00b3 }
        L_0x0063:
            long r8 = r15.f5007o     // Catch:{ all -> 0x00b3 }
            long r10 = r0.f5010b     // Catch:{ all -> 0x00b3 }
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x006e
            r15.f5007o = r10     // Catch:{ all -> 0x00b3 }
        L_0x006e:
            r0.a(r15)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r15)
            r0 = r1
        L_0x0074:
            if (r0 == 0) goto L_0x008b
            if (r0 == r4) goto L_0x0087
            if (r0 != r2) goto L_0x007b
            goto L_0x00af
        L_0x007b:
            java.lang.String r13 = "unexpected result"
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L_0x0087:
            g9.e0.I(r13, r15)
            goto L_0x00af
        L_0x008b:
            java.lang.Object r13 = r12._delayed
            g9.d0$b r13 = (g9.d0.b) r13
            if (r13 != 0) goto L_0x0092
            goto L_0x009d
        L_0x0092:
            monitor-enter(r13)
            T[] r14 = r13.f6799a     // Catch:{ all -> 0x00b0 }
            if (r14 != 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r3 = r14[r1]     // Catch:{ all -> 0x00b0 }
        L_0x009a:
            monitor-exit(r13)
            g9.d0$a r3 = (g9.d0.a) r3
        L_0x009d:
            if (r3 != r15) goto L_0x00a0
            r1 = r4
        L_0x00a0:
            if (r1 == 0) goto L_0x00af
            java.lang.Thread r13 = r12.G()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto L_0x00af
            java.util.concurrent.locks.LockSupport.unpark(r13)
        L_0x00af:
            return
        L_0x00b0:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x00b3:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            throw r13     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.d0.V(long, g9.d0$a):void");
    }

    public final void b(f fVar, Runnable runnable) {
        J(runnable);
    }

    public final void shutdown() {
        a aVar;
        a1.f4996a.set((Object) null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            j0 j0Var = androidx.databinding.a.f1000c0;
            boolean z = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5005s;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, j0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            } else if (obj instanceof g) {
                ((g) obj).b();
                break;
            } else if (obj == j0Var) {
                break;
            } else {
                g gVar = new g(8, true);
                gVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5005s;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, gVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        do {
        } while (T() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            if (bVar == null) {
                aVar = null;
            } else {
                aVar = (a) bVar.d();
            }
            if (aVar != null) {
                e0.I(nanoTime, aVar);
            } else {
                return;
            }
        }
    }
}
