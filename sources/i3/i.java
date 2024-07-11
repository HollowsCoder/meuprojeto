package i3;

import i3.d;

public final class i implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final d f6059a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6060b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f6061c;
    public volatile c d;

    /* renamed from: e  reason: collision with root package name */
    public d.a f6062e;

    /* renamed from: f  reason: collision with root package name */
    public d.a f6063f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6064g;

    public i(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f6062e = aVar;
        this.f6063f = aVar;
        this.f6060b = obj;
        this.f6059a = dVar;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f6060b) {
            if (!this.d.a()) {
                if (!this.f6061c.a()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(i3.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f6060b
            monitor-enter(r0)
            i3.c r1 = r2.f6061c     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            i3.d$a r3 = i3.d.a.FAILED     // Catch:{ all -> 0x001e }
            r2.f6063f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            i3.d$a r3 = i3.d.a.FAILED     // Catch:{ all -> 0x001e }
            r2.f6062e = r3     // Catch:{ all -> 0x001e }
            i3.d r3 = r2.f6059a     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.b(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.i.b(i3.c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(i3.c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof i3.i
            r1 = 0
            if (r0 == 0) goto L_0x002e
            i3.i r4 = (i3.i) r4
            i3.c r0 = r3.f6061c
            if (r0 != 0) goto L_0x0010
            i3.c r0 = r4.f6061c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            i3.c r0 = r3.f6061c
            i3.c r2 = r4.f6061c
            boolean r0 = r0.c(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            i3.c r0 = r3.d
            if (r0 != 0) goto L_0x0023
            i3.c r4 = r4.d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            i3.c r0 = r3.d
            i3.c r4 = r4.d
            boolean r4 = r0.c(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.i.c(i3.c):boolean");
    }

    public final void clear() {
        synchronized (this.f6060b) {
            this.f6064g = false;
            d.a aVar = d.a.CLEARED;
            this.f6062e = aVar;
            this.f6063f = aVar;
            this.d.clear();
            this.f6061c.clear();
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this.f6060b) {
            z = this.f6062e == d.a.CLEARED;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(i3.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f6060b
            monitor-enter(r0)
            i3.c r1 = r2.d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0011
            i3.d$a r3 = i3.d.a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f6063f = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            i3.d$a r3 = i3.d.a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f6062e = r3     // Catch:{ all -> 0x002b }
            i3.d r3 = r2.f6059a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x001c
            r3.e(r2)     // Catch:{ all -> 0x002b }
        L_0x001c:
            i3.d$a r3 = r2.f6063f     // Catch:{ all -> 0x002b }
            boolean r3 = r3.isComplete()     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0029
            i3.c r3 = r2.d     // Catch:{ all -> 0x002b }
            r3.clear()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.i.e(i3.c):void");
    }

    public final void f() {
        synchronized (this.f6060b) {
            if (!this.f6063f.isComplete()) {
                this.f6063f = d.a.PAUSED;
                this.d.f();
            }
            if (!this.f6062e.isComplete()) {
                this.f6062e = d.a.PAUSED;
                this.f6061c.f();
            }
        }
    }

    public final void g() {
        d.a aVar;
        d.a aVar2;
        synchronized (this.f6060b) {
            this.f6064g = true;
            try {
                if (!(this.f6062e == d.a.SUCCESS || this.f6063f == (aVar2 = d.a.RUNNING))) {
                    this.f6063f = aVar2;
                    this.d.g();
                }
                if (this.f6064g && this.f6062e != (aVar = d.a.RUNNING)) {
                    this.f6062e = aVar;
                    this.f6061c.g();
                }
            } finally {
                this.f6064g = false;
            }
        }
    }

    public final d getRoot() {
        d root;
        synchronized (this.f6060b) {
            d dVar = this.f6059a;
            root = dVar != null ? dVar.getRoot() : this;
        }
        return root;
    }

    public final boolean h(c cVar) {
        boolean z;
        boolean z10;
        synchronized (this.f6060b) {
            d dVar = this.f6059a;
            z = false;
            if (dVar != null) {
                if (!dVar.h(this)) {
                    z10 = false;
                    if (z10 && cVar.equals(this.f6061c) && !a()) {
                        z = true;
                    }
                }
            }
            z10 = true;
            z = true;
        }
        return z;
    }

    public final boolean i(c cVar) {
        boolean z;
        boolean z10;
        synchronized (this.f6060b) {
            d dVar = this.f6059a;
            z = false;
            if (dVar != null) {
                if (!dVar.i(this)) {
                    z10 = false;
                    if (z10 && (cVar.equals(this.f6061c) || this.f6062e != d.a.SUCCESS)) {
                        z = true;
                    }
                }
            }
            z10 = true;
            z = true;
        }
        return z;
    }

    public final boolean isRunning() {
        boolean z;
        synchronized (this.f6060b) {
            z = this.f6062e == d.a.RUNNING;
        }
        return z;
    }

    public final boolean j(c cVar) {
        boolean z;
        boolean z10;
        synchronized (this.f6060b) {
            d dVar = this.f6059a;
            z = false;
            if (dVar != null) {
                if (!dVar.j(this)) {
                    z10 = false;
                    if (z10 && cVar.equals(this.f6061c) && this.f6062e != d.a.PAUSED) {
                        z = true;
                    }
                }
            }
            z10 = true;
            z = true;
        }
        return z;
    }

    public final boolean k() {
        boolean z;
        synchronized (this.f6060b) {
            z = this.f6062e == d.a.SUCCESS;
        }
        return z;
    }
}
