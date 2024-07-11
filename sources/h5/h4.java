package h5;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import n4.m;

public final class h4 extends r4 {

    /* renamed from: y  reason: collision with root package name */
    public static final AtomicLong f5429y = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: q  reason: collision with root package name */
    public g4 f5430q;

    /* renamed from: r  reason: collision with root package name */
    public g4 f5431r;

    /* renamed from: s  reason: collision with root package name */
    public final PriorityBlockingQueue<f4<?>> f5432s = new PriorityBlockingQueue<>();

    /* renamed from: t  reason: collision with root package name */
    public final LinkedBlockingQueue f5433t = new LinkedBlockingQueue();
    public final e4 u = new e4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: v  reason: collision with root package name */
    public final e4 f5434v = new e4(this, "Thread death: Uncaught exception on network thread");
    public final Object w = new Object();

    /* renamed from: x  reason: collision with root package name */
    public final Semaphore f5435x = new Semaphore(2);

    public h4(i4 i4Var) {
        super(i4Var);
    }

    public final void g() {
        if (Thread.currentThread() != this.f5430q) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final boolean h() {
        return false;
    }

    public final void k() {
        if (Thread.currentThread() != this.f5431r) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final boolean l() {
        return Thread.currentThread() == this.f5430q;
    }

    public final f4 m(Callable callable) {
        i();
        f4 f4Var = new f4(this, callable, false);
        if (Thread.currentThread() == this.f5430q) {
            if (!this.f5432s.isEmpty()) {
                g3 g3Var = this.f5649o.w;
                i4.n(g3Var);
                g3Var.w.a("Callable skipped the worker queue.");
            }
            f4Var.run();
        } else {
            r(f4Var);
        }
        return f4Var;
    }

    public final void n(Runnable runnable) {
        i();
        m.h(runnable);
        r(new f4(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r5.length() == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = r1.f5649o.w;
        h5.i4.n(r3);
        r3 = r3.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r5.length() != 0) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r3 = r1.f5649o.w;
        h5.i4.n(r3);
        r3 = r3.w;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T o(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            h5.i4 r0 = r1.f5649o     // Catch:{ all -> 0x0057 }
            h5.h4 r0 = r0.f5459x     // Catch:{ all -> 0x0057 }
            h5.i4.n(r0)     // Catch:{ all -> 0x0057 }
            r0.n(r6)     // Catch:{ all -> 0x0057 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x0057 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0034
            h5.i4 r3 = r1.f5649o
            h5.g3 r3 = r3.w
            h5.i4.n(r3)
            h5.e3 r3 = r3.w
            java.lang.String r4 = "Timed out waiting for "
            int r6 = r5.length()
            if (r6 == 0) goto L_0x002b
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0031
        L_0x002b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0031:
            r3.a(r4)
        L_0x0034:
            return r2
        L_0x0035:
            h5.i4 r3 = r1.f5649o     // Catch:{ all -> 0x0057 }
            h5.g3 r3 = r3.w     // Catch:{ all -> 0x0057 }
            h5.i4.n(r3)     // Catch:{ all -> 0x0057 }
            h5.e3 r3 = r3.w     // Catch:{ all -> 0x0057 }
            java.lang.String r4 = "Interrupted waiting for "
            int r6 = r5.length()     // Catch:{ all -> 0x0057 }
            if (r6 == 0) goto L_0x004b
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0057 }
            goto L_0x0051
        L_0x004b:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0057 }
            r5.<init>(r4)     // Catch:{ all -> 0x0057 }
            r4 = r5
        L_0x0051:
            r3.a(r4)     // Catch:{ all -> 0x0057 }
            monitor-exit(r2)     // Catch:{ all -> 0x0057 }
            r2 = 0
            return r2
        L_0x0057:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0057 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.h4.o(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final void p(Runnable runnable) {
        i();
        r(new f4(this, runnable, true, "Task exception on worker thread"));
    }

    public final void q(Runnable runnable) {
        i();
        f4 f4Var = new f4(this, runnable, false, "Task exception on network thread");
        synchronized (this.w) {
            this.f5433t.add(f4Var);
            g4 g4Var = this.f5431r;
            if (g4Var == null) {
                g4 g4Var2 = new g4(this, "Measurement Network", this.f5433t);
                this.f5431r = g4Var2;
                g4Var2.setUncaughtExceptionHandler(this.f5434v);
                this.f5431r.start();
            } else {
                synchronized (g4Var.f5401o) {
                    g4Var.f5401o.notifyAll();
                }
            }
        }
    }

    public final void r(f4<?> f4Var) {
        synchronized (this.w) {
            this.f5432s.add(f4Var);
            g4 g4Var = this.f5430q;
            if (g4Var == null) {
                g4 g4Var2 = new g4(this, "Measurement Worker", this.f5432s);
                this.f5430q = g4Var2;
                g4Var2.setUncaughtExceptionHandler(this.u);
                this.f5430q.start();
            } else {
                synchronized (g4Var.f5401o) {
                    g4Var.f5401o.notifyAll();
                }
            }
        }
    }
}
