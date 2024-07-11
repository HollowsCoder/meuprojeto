package h5;

import java.util.concurrent.BlockingQueue;
import n4.m;

public final class g4 extends Thread {

    /* renamed from: o  reason: collision with root package name */
    public final Object f5401o;

    /* renamed from: p  reason: collision with root package name */
    public final BlockingQueue<f4<?>> f5402p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5403q = false;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ h4 f5404r;

    public g4(h4 h4Var, String str, BlockingQueue<f4<?>> blockingQueue) {
        this.f5404r = h4Var;
        m.h(blockingQueue);
        this.f5401o = new Object();
        this.f5402p = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f5404r.w) {
            try {
                if (!this.f5403q) {
                    this.f5404r.f5435x.release();
                    this.f5404r.w.notifyAll();
                    h4 h4Var = this.f5404r;
                    if (this == h4Var.f5430q) {
                        h4Var.f5430q = null;
                    } else if (this == h4Var.f5431r) {
                        h4Var.f5431r = null;
                    } else {
                        g3 g3Var = h4Var.f5649o.w;
                        i4.n(g3Var);
                        g3Var.f5397t.a("Current scheduler thread is neither worker nor network");
                    }
                    this.f5403q = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterruptedException interruptedException) {
        g3 g3Var = this.f5404r.f5649o.w;
        i4.n(g3Var);
        g3Var.w.b(interruptedException, String.valueOf(getName()).concat(" was interrupted"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0073, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0076, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = 1
            if (r0 != 0) goto L_0x0012
            h5.h4 r2 = r6.f5404r     // Catch:{ InterruptedException -> 0x000d }
            java.util.concurrent.Semaphore r2 = r2.f5435x     // Catch:{ InterruptedException -> 0x000d }
            r2.acquire()     // Catch:{ InterruptedException -> 0x000d }
            r0 = r1
            goto L_0x0001
        L_0x000d:
            r1 = move-exception
            r6.b(r1)
            goto L_0x0001
        L_0x0012:
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x007f }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x007f }
        L_0x001a:
            java.util.concurrent.BlockingQueue<h5.f4<?>> r2 = r6.f5402p     // Catch:{ all -> 0x007f }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x007f }
            h5.f4 r2 = (h5.f4) r2     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x0033
            boolean r3 = r2.f5374p     // Catch:{ all -> 0x007f }
            if (r1 == r3) goto L_0x002b
            r3 = 10
            goto L_0x002c
        L_0x002b:
            r3 = r0
        L_0x002c:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x007f }
            r2.run()     // Catch:{ all -> 0x007f }
            goto L_0x001a
        L_0x0033:
            java.lang.Object r2 = r6.f5401o     // Catch:{ all -> 0x007f }
            monitor-enter(r2)     // Catch:{ all -> 0x007f }
            java.util.concurrent.BlockingQueue<h5.f4<?>> r3 = r6.f5402p     // Catch:{ all -> 0x0050 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x0050 }
            if (r3 != 0) goto L_0x0052
            h5.h4 r3 = r6.f5404r     // Catch:{ all -> 0x0050 }
            r3.getClass()     // Catch:{ all -> 0x0050 }
            java.lang.Object r3 = r6.f5401o     // Catch:{ InterruptedException -> 0x004b }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x004b }
            goto L_0x0052
        L_0x004b:
            r3 = move-exception
            r6.b(r3)     // Catch:{ all -> 0x0050 }
            goto L_0x0052
        L_0x0050:
            r0 = move-exception
            goto L_0x007d
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            h5.h4 r2 = r6.f5404r     // Catch:{ all -> 0x007f }
            java.lang.Object r2 = r2.w     // Catch:{ all -> 0x007f }
            monitor-enter(r2)     // Catch:{ all -> 0x007f }
            java.util.concurrent.BlockingQueue<h5.f4<?>> r3 = r6.f5402p     // Catch:{ all -> 0x0077 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x0077 }
            if (r3 != 0) goto L_0x0079
            h5.h4 r0 = r6.f5404r     // Catch:{ all -> 0x0077 }
            h5.i4 r0 = r0.f5649o     // Catch:{ all -> 0x0077 }
            h5.e r0 = r0.u     // Catch:{ all -> 0x0077 }
            h5.s2<java.lang.Boolean> r1 = h5.u2.f5732n0     // Catch:{ all -> 0x0077 }
            r3 = 0
            boolean r0 = r0.m(r3, r1)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0072
            r6.a()     // Catch:{ all -> 0x0077 }
        L_0x0072:
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            r6.a()
            return
        L_0x0077:
            r0 = move-exception
            goto L_0x007b
        L_0x0079:
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            goto L_0x001a
        L_0x007b:
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            throw r0     // Catch:{ all -> 0x007f }
        L_0x007d:
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            r6.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.g4.run():void");
    }
}
