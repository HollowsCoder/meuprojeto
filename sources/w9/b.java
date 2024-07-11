package w9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import z8.g;

public class b extends c0 {

    /* renamed from: h  reason: collision with root package name */
    public static final long f9311h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f9312i;

    /* renamed from: j  reason: collision with root package name */
    public static b f9313j;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9314e;

    /* renamed from: f  reason: collision with root package name */
    public b f9315f;

    /* renamed from: g  reason: collision with root package name */
    public long f9316g;

    public static final class a {
        public static b a() {
            b bVar = b.f9313j;
            g.c(bVar);
            b bVar2 = bVar.f9315f;
            long nanoTime = System.nanoTime();
            Class<b> cls = b.class;
            if (bVar2 == null) {
                cls.wait(b.f9311h);
                b bVar3 = b.f9313j;
                g.c(bVar3);
                if (bVar3.f9315f != null || System.nanoTime() - nanoTime < b.f9312i) {
                    return null;
                }
                return b.f9313j;
            }
            long j8 = bVar2.f9316g - nanoTime;
            if (j8 > 0) {
                long j10 = j8 / 1000000;
                cls.wait(j10, (int) (j8 - (1000000 * j10)));
                return null;
            }
            b bVar4 = b.f9313j;
            g.c(bVar4);
            bVar4.f9315f = bVar2.f9315f;
            bVar2.f9315f = null;
            return bVar2;
        }
    }

    /* renamed from: w9.b$b  reason: collision with other inner class name */
    public static final class C0156b extends Thread {
        public C0156b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0015, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0017, code lost:
            r1.k();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<w9.b> r0 = w9.b.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                w9.b r1 = w9.b.f9313j     // Catch:{ all -> 0x001b }
                w9.b r1 = w9.b.a.a()     // Catch:{ all -> 0x001b }
                w9.b r2 = w9.b.f9313j     // Catch:{ all -> 0x001b }
                if (r1 != r2) goto L_0x0012
                r1 = 0
                w9.b.f9313j = r1     // Catch:{ all -> 0x001b }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0012:
                n8.i r2 = n8.i.f7501a     // Catch:{ all -> 0x001b }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.k()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: w9.b.C0156b.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f9311h = millis;
        f9312i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x005d A[EDGE_INSN: B:41:0x005d->B:27:0x005d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r9 = this;
            boolean r0 = r9.f9314e
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0077
            long r2 = r9.f9321c
            boolean r0 = r9.f9319a
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0013
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            r9.f9314e = r1
            java.lang.Class<w9.b> r1 = w9.b.class
            monitor-enter(r1)
            w9.b r5 = f9313j     // Catch:{ all -> 0x0074 }
            if (r5 != 0) goto L_0x002b
            w9.b r5 = new w9.b     // Catch:{ all -> 0x0074 }
            r5.<init>()     // Catch:{ all -> 0x0074 }
            f9313j = r5     // Catch:{ all -> 0x0074 }
            w9.b$b r5 = new w9.b$b     // Catch:{ all -> 0x0074 }
            r5.<init>()     // Catch:{ all -> 0x0074 }
            r5.start()     // Catch:{ all -> 0x0074 }
        L_0x002b:
            long r5 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x003d
            long r7 = r9.c()     // Catch:{ all -> 0x0074 }
            long r7 = r7 - r5
            long r2 = java.lang.Math.min(r2, r7)     // Catch:{ all -> 0x0074 }
            goto L_0x003f
        L_0x003d:
            if (r4 == 0) goto L_0x0041
        L_0x003f:
            long r2 = r2 + r5
            goto L_0x0047
        L_0x0041:
            if (r0 == 0) goto L_0x006e
            long r2 = r9.c()     // Catch:{ all -> 0x0074 }
        L_0x0047:
            r9.f9316g = r2     // Catch:{ all -> 0x0074 }
            long r2 = r2 - r5
            w9.b r0 = f9313j     // Catch:{ all -> 0x0074 }
        L_0x004c:
            z8.g.c(r0)     // Catch:{ all -> 0x0074 }
            w9.b r4 = r0.f9315f     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x005d
            long r7 = r4.f9316g     // Catch:{ all -> 0x0074 }
            long r7 = r7 - r5
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r0 = r4
            goto L_0x004c
        L_0x005d:
            r9.f9315f = r4     // Catch:{ all -> 0x0074 }
            r0.f9315f = r9     // Catch:{ all -> 0x0074 }
            w9.b r2 = f9313j     // Catch:{ all -> 0x0074 }
            if (r0 != r2) goto L_0x006a
            java.lang.Class<w9.b> r0 = w9.b.class
            r0.notify()     // Catch:{ all -> 0x0074 }
        L_0x006a:
            n8.i r0 = n8.i.f7501a     // Catch:{ all -> 0x0074 }
            monitor-exit(r1)
            return
        L_0x006e:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0074 }
            r0.<init>()     // Catch:{ all -> 0x0074 }
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0077:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.b.h():void");
    }

    public final boolean i() {
        if (!this.f9314e) {
            return false;
        }
        this.f9314e = false;
        synchronized (b.class) {
            b bVar = f9313j;
            while (bVar != null) {
                b bVar2 = bVar.f9315f;
                if (bVar2 == this) {
                    bVar.f9315f = this.f9315f;
                    this.f9315f = null;
                    return false;
                }
                bVar = bVar2;
            }
            return true;
        }
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
