package l9;

import j9.c;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import n8.i;
import z8.g;

public final class d {

    /* renamed from: h  reason: collision with root package name */
    public static final d f6995h;

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f6996i;

    /* renamed from: a  reason: collision with root package name */
    public int f6997a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6998b;

    /* renamed from: c  reason: collision with root package name */
    public long f6999c;
    public final ArrayList d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f7000e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final e f7001f = new e(this);

    /* renamed from: g  reason: collision with root package name */
    public final a f7002g;

    public interface a {
        long a();

        void b(d dVar, long j8);

        void c(d dVar);

        void execute(Runnable runnable);
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadPoolExecutor f7003a;

        public b(j9.b bVar) {
            this.f7003a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), bVar);
        }

        public final long a() {
            return System.nanoTime();
        }

        public final void b(d dVar, long j8) {
            g.f(dVar, "taskRunner");
            long j10 = j8 / 1000000;
            long j11 = j8 - (1000000 * j10);
            if (j10 > 0 || j8 > 0) {
                dVar.wait(j10, (int) j11);
            }
        }

        public final void c(d dVar) {
            g.f(dVar, "taskRunner");
            dVar.notify();
        }

        public final void execute(Runnable runnable) {
            g.f(runnable, "runnable");
            this.f7003a.execute(runnable);
        }
    }

    static {
        String str = c.f6607g + " TaskRunner";
        g.f(str, "name");
        f6995h = new d(new b(new j9.b(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        g.e(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f6996i = logger;
    }

    public d(b bVar) {
        this.f7002g = bVar;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = c.f6602a;
        Thread currentThread = Thread.currentThread();
        g.e(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(aVar.f6988c);
        try {
            long a10 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a10);
                i iVar = i.f7501a;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1);
                i iVar2 = i.f7501a;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j8) {
        boolean z;
        byte[] bArr = c.f6602a;
        c cVar = aVar.f6986a;
        g.c(cVar);
        if (cVar.f6991b == aVar) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            boolean z10 = cVar.d;
            cVar.d = false;
            cVar.f6991b = null;
            this.d.remove(cVar);
            if (j8 != -1 && !z10 && !cVar.f6990a) {
                cVar.e(aVar, j8, true);
            }
            if (!cVar.f6992c.isEmpty()) {
                this.f7000e.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final l9.a c() {
        /*
            r17 = this;
            r1 = r17
            byte[] r0 = j9.c.f6602a
        L_0x0004:
            java.util.ArrayList r0 = r1.f7000e
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x000e
            return r3
        L_0x000e:
            l9.d$a r2 = r1.f7002g
            long r4 = r2.a()
            java.util.Iterator r6 = r0.iterator()
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r3
        L_0x001e:
            boolean r10 = r6.hasNext()
            r11 = 1
            r12 = 0
            if (r10 == 0) goto L_0x0050
            java.lang.Object r10 = r6.next()
            l9.c r10 = (l9.c) r10
            java.util.ArrayList r10 = r10.f6992c
            java.lang.Object r10 = r10.get(r12)
            l9.a r10 = (l9.a) r10
            long r13 = r10.f6987b
            long r13 = r13 - r4
            r15 = r4
            r3 = 0
            long r13 = java.lang.Math.max(r3, r13)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0048
            long r3 = java.lang.Math.min(r13, r7)
            r7 = r3
            goto L_0x004d
        L_0x0048:
            if (r9 == 0) goto L_0x004c
            r3 = r11
            goto L_0x0052
        L_0x004c:
            r9 = r10
        L_0x004d:
            r4 = r15
            r3 = 0
            goto L_0x001e
        L_0x0050:
            r15 = r4
            r3 = r12
        L_0x0052:
            if (r9 == 0) goto L_0x0081
            byte[] r4 = j9.c.f6602a
            r4 = -1
            r9.f6987b = r4
            l9.c r4 = r9.f6986a
            z8.g.c(r4)
            java.util.ArrayList r5 = r4.f6992c
            r5.remove(r9)
            r0.remove(r4)
            r4.f6991b = r9
            java.util.ArrayList r5 = r1.d
            r5.add(r4)
            if (r3 != 0) goto L_0x007b
            boolean r3 = r1.f6998b
            if (r3 != 0) goto L_0x0080
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r11
            if (r0 == 0) goto L_0x0080
        L_0x007b:
            l9.e r0 = r1.f7001f
            r2.execute(r0)
        L_0x0080:
            return r9
        L_0x0081:
            boolean r0 = r1.f6998b
            if (r0 == 0) goto L_0x0091
            long r3 = r1.f6999c
            long r3 = r3 - r15
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x008f
            r2.c(r1)
        L_0x008f:
            r0 = 0
            return r0
        L_0x0091:
            r1.f6998b = r11
            long r4 = r15 + r7
            r1.f6999c = r4
            r2.b(r1, r7)     // Catch:{ InterruptedException -> 0x009d }
            goto L_0x00a0
        L_0x009b:
            r0 = move-exception
            goto L_0x00a4
        L_0x009d:
            r17.d()     // Catch:{ all -> 0x009b }
        L_0x00a0:
            r1.f6998b = r12
            goto L_0x0004
        L_0x00a4:
            r1.f6998b = r12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.d.c():l9.a");
    }

    public final void d() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((c) arrayList.get(size)).b();
        }
        ArrayList arrayList2 = this.f7000e;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                c cVar = (c) arrayList2.get(size2);
                cVar.b();
                if (cVar.f6992c.isEmpty()) {
                    arrayList2.remove(size2);
                }
            } else {
                return;
            }
        }
    }

    public final void e(c cVar) {
        g.f(cVar, "taskQueue");
        byte[] bArr = c.f6602a;
        if (cVar.f6991b == null) {
            boolean z = !cVar.f6992c.isEmpty();
            ArrayList arrayList = this.f7000e;
            if (z) {
                g.f(arrayList, "$this$addIfAbsent");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            } else {
                arrayList.remove(cVar);
            }
        }
        boolean z10 = this.f6998b;
        a aVar = this.f7002g;
        if (z10) {
            aVar.c(this);
        } else {
            aVar.execute(this.f7001f);
        }
    }

    public final c f() {
        int i10;
        synchronized (this) {
            i10 = this.f6997a;
            this.f6997a = i10 + 1;
        }
        return new c(this, b0.d.c("Q", i10));
    }
}
