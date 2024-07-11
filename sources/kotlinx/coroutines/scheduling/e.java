package kotlinx.coroutines.scheduling;

import g9.f0;
import g9.w;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q8.f;

public final class e extends f0 implements h, Executor {
    public static final /* synthetic */ AtomicIntegerFieldUpdater u = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks");
    private volatile /* synthetic */ int inFlightTasks = 0;

    /* renamed from: p  reason: collision with root package name */
    public final c f6823p;

    /* renamed from: q  reason: collision with root package name */
    public final int f6824q;

    /* renamed from: r  reason: collision with root package name */
    public final String f6825r = "Dispatchers.IO";

    /* renamed from: s  reason: collision with root package name */
    public final int f6826s = 1;

    /* renamed from: t  reason: collision with root package name */
    public final ConcurrentLinkedQueue<Runnable> f6827t = new ConcurrentLinkedQueue<>();

    public e(b bVar, int i10) {
        this.f6823p = bVar;
        this.f6824q = i10;
    }

    public final void b(f fVar, Runnable runnable) {
        y(runnable, false);
    }

    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public final void execute(Runnable runnable) {
        y(runnable, false);
    }

    public final void g() {
        g gVar;
        ConcurrentLinkedQueue<Runnable> concurrentLinkedQueue = this.f6827t;
        Runnable poll = concurrentLinkedQueue.poll();
        if (poll != null) {
            a aVar = this.f6823p.f6822p;
            try {
                aVar.b(poll, this, true);
            } catch (RejectedExecutionException unused) {
                w wVar = w.u;
                aVar.getClass();
                j.f6835e.getClass();
                long nanoTime = System.nanoTime();
                if (poll instanceof g) {
                    gVar = (g) poll;
                    gVar.f6829o = nanoTime;
                    gVar.f6830p = this;
                } else {
                    gVar = new i(poll, nanoTime, this);
                }
                wVar.J(gVar);
            }
        } else {
            u.decrementAndGet(this);
            Runnable poll2 = concurrentLinkedQueue.poll();
            if (poll2 != null) {
                y(poll2, true);
            }
        }
    }

    public final String toString() {
        String str = this.f6825r;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f6823p + ']';
    }

    public final int u() {
        return this.f6826s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Runnable) = (r4v0 java.lang.Runnable), (r4v7 java.lang.Runnable) binds: [B:0:0x0000, B:15:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(java.lang.Runnable r4, boolean r5) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = u
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.f6824q
            if (r1 > r2) goto L_0x0035
            kotlinx.coroutines.scheduling.c r0 = r3.f6823p
            kotlinx.coroutines.scheduling.a r0 = r0.f6822p
            r0.b(r4, r3, r5)     // Catch:{ RejectedExecutionException -> 0x0012 }
            goto L_0x0034
        L_0x0012:
            g9.w r5 = g9.w.u
            r0.getClass()
            kotlinx.coroutines.scheduling.f r0 = kotlinx.coroutines.scheduling.j.f6835e
            r0.getClass()
            long r0 = java.lang.System.nanoTime()
            boolean r2 = r4 instanceof kotlinx.coroutines.scheduling.g
            if (r2 == 0) goto L_0x002b
            kotlinx.coroutines.scheduling.g r4 = (kotlinx.coroutines.scheduling.g) r4
            r4.f6829o = r0
            r4.f6830p = r3
            goto L_0x0031
        L_0x002b:
            kotlinx.coroutines.scheduling.i r2 = new kotlinx.coroutines.scheduling.i
            r2.<init>(r4, r0, r3)
            r4 = r2
        L_0x0031:
            r5.J(r4)
        L_0x0034:
            return
        L_0x0035:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.f6827t
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            if (r4 < r2) goto L_0x0041
            return
        L_0x0041:
            java.lang.Object r4 = r1.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.e.y(java.lang.Runnable, boolean):void");
    }
}
