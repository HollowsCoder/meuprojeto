package i3;

import i3.d;

public final class b implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6033a;

    /* renamed from: b  reason: collision with root package name */
    public final d f6034b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f6035c;
    public volatile c d;

    /* renamed from: e  reason: collision with root package name */
    public d.a f6036e;

    /* renamed from: f  reason: collision with root package name */
    public d.a f6037f;

    public b(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f6036e = aVar;
        this.f6037f = aVar;
        this.f6033a = obj;
        this.f6034b = dVar;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f6033a) {
            if (!this.f6035c.a()) {
                if (!this.d.a()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(i3.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f6033a
            monitor-enter(r0)
            i3.c r1 = r2.d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            i3.d$a r3 = i3.d.a.FAILED     // Catch:{ all -> 0x002b }
            r2.f6036e = r3     // Catch:{ all -> 0x002b }
            i3.d$a r3 = r2.f6037f     // Catch:{ all -> 0x002b }
            i3.d$a r1 = i3.d.a.RUNNING     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f6037f = r1     // Catch:{ all -> 0x002b }
            i3.c r3 = r2.d     // Catch:{ all -> 0x002b }
            r3.g()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            i3.d$a r3 = i3.d.a.FAILED     // Catch:{ all -> 0x002b }
            r2.f6037f = r3     // Catch:{ all -> 0x002b }
            i3.d r3 = r2.f6034b     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.b(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.b.b(i3.c):void");
    }

    public final boolean c(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        return this.f6035c.c(bVar.f6035c) && this.d.c(bVar.d);
    }

    public final void clear() {
        synchronized (this.f6033a) {
            d.a aVar = d.a.CLEARED;
            this.f6036e = aVar;
            this.f6035c.clear();
            if (this.f6037f != aVar) {
                this.f6037f = aVar;
                this.d.clear();
            }
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this.f6033a) {
            d.a aVar = this.f6036e;
            d.a aVar2 = d.a.CLEARED;
            z = aVar == aVar2 && this.f6037f == aVar2;
        }
        return z;
    }

    public final void e(c cVar) {
        synchronized (this.f6033a) {
            if (cVar.equals(this.f6035c)) {
                this.f6036e = d.a.SUCCESS;
            } else if (cVar.equals(this.d)) {
                this.f6037f = d.a.SUCCESS;
            }
            d dVar = this.f6034b;
            if (dVar != null) {
                dVar.e(this);
            }
        }
    }

    public final void f() {
        synchronized (this.f6033a) {
            d.a aVar = this.f6036e;
            d.a aVar2 = d.a.RUNNING;
            if (aVar == aVar2) {
                this.f6036e = d.a.PAUSED;
                this.f6035c.f();
            }
            if (this.f6037f == aVar2) {
                this.f6037f = d.a.PAUSED;
                this.d.f();
            }
        }
    }

    public final void g() {
        synchronized (this.f6033a) {
            d.a aVar = this.f6036e;
            d.a aVar2 = d.a.RUNNING;
            if (aVar != aVar2) {
                this.f6036e = aVar2;
                this.f6035c.g();
            }
        }
    }

    public final d getRoot() {
        d root;
        synchronized (this.f6033a) {
            d dVar = this.f6034b;
            root = dVar != null ? dVar.getRoot() : this;
        }
        return root;
    }

    public final boolean h(c cVar) {
        boolean z;
        boolean z10;
        synchronized (this.f6033a) {
            d dVar = this.f6034b;
            z = false;
            if (dVar != null) {
                if (!dVar.h(this)) {
                    z10 = false;
                    if (z10 && l(cVar)) {
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
        synchronized (this.f6033a) {
            d dVar = this.f6034b;
            z = false;
            if (dVar != null) {
                if (!dVar.i(this)) {
                    z10 = false;
                    if (z10 && l(cVar)) {
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
        synchronized (this.f6033a) {
            d.a aVar = this.f6036e;
            d.a aVar2 = d.a.RUNNING;
            if (aVar != aVar2) {
                if (this.f6037f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final boolean j(c cVar) {
        boolean z;
        boolean z10;
        synchronized (this.f6033a) {
            d dVar = this.f6034b;
            z = false;
            if (dVar != null) {
                if (!dVar.j(this)) {
                    z10 = false;
                    if (z10 && l(cVar)) {
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
        synchronized (this.f6033a) {
            d.a aVar = this.f6036e;
            d.a aVar2 = d.a.SUCCESS;
            if (aVar != aVar2) {
                if (this.f6037f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final boolean l(c cVar) {
        return cVar.equals(this.f6035c) || (this.f6036e == d.a.FAILED && cVar.equals(this.d));
    }
}
