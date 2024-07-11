package l9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import n8.i;
import s6.a;
import z8.g;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6990a;

    /* renamed from: b  reason: collision with root package name */
    public a f6991b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f6992c = new ArrayList();
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final d f6993e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6994f;

    public c(d dVar, String str) {
        g.f(dVar, "taskRunner");
        g.f(str, "name");
        this.f6993e = dVar;
        this.f6994f = str;
    }

    public final void a() {
        byte[] bArr = j9.c.f6602a;
        synchronized (this.f6993e) {
            if (b()) {
                this.f6993e.e(this);
            }
            i iVar = i.f7501a;
        }
    }

    public final boolean b() {
        a aVar = this.f6991b;
        if (aVar != null && aVar.d) {
            this.d = true;
        }
        ArrayList arrayList = this.f6992c;
        boolean z = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((a) arrayList.get(size)).d) {
                a aVar2 = (a) arrayList.get(size);
                if (d.f6996i.isLoggable(Level.FINE)) {
                    a.h(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(l9.a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            z8.g.f(r3, r0)
            l9.d r0 = r2.f6993e
            monitor-enter(r0)
            boolean r1 = r2.f6990a     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x003a
            boolean r4 = r3.d     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0023
            l9.d r4 = l9.d.f6995h     // Catch:{ all -> 0x004a }
            java.util.logging.Logger r4 = l9.d.f6996i     // Catch:{ all -> 0x004a }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x004a }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            s6.a.h(r3, r2, r4)     // Catch:{ all -> 0x004a }
        L_0x0021:
            monitor-exit(r0)
            return
        L_0x0023:
            l9.d r4 = l9.d.f6995h     // Catch:{ all -> 0x004a }
            java.util.logging.Logger r4 = l9.d.f6996i     // Catch:{ all -> 0x004a }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x004a }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0034
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            s6.a.h(r3, r2, r4)     // Catch:{ all -> 0x004a }
        L_0x0034:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x004a }
            r3.<init>()     // Catch:{ all -> 0x004a }
            throw r3     // Catch:{ all -> 0x004a }
        L_0x003a:
            r1 = 0
            boolean r3 = r2.e(r3, r4, r1)     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0046
            l9.d r3 = r2.f6993e     // Catch:{ all -> 0x004a }
            r3.e(r2)     // Catch:{ all -> 0x004a }
        L_0x0046:
            n8.i r3 = n8.i.f7501a     // Catch:{ all -> 0x004a }
            monitor-exit(r0)
            return
        L_0x004a:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.c.c(l9.a, long):void");
    }

    public final boolean e(a aVar, long j8, boolean z) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        g.f(aVar, "task");
        c cVar = aVar.f6986a;
        if (cVar != this) {
            if (cVar == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                aVar.f6986a = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        long a10 = this.f6993e.f7002g.a();
        long j10 = a10 + j8;
        ArrayList arrayList = this.f6992c;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f6987b <= j10) {
                if (d.f6996i.isLoggable(Level.FINE)) {
                    a.h(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.f6987b = j10;
        if (d.f6996i.isLoggable(Level.FINE)) {
            long j11 = j10 - a10;
            if (z) {
                str = a.w(j11);
                str2 = "run again after ";
            } else {
                str = a.w(j11);
                str2 = "scheduled after ";
            }
            a.h(aVar, this, str2.concat(str));
        }
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((a) it.next()).f6987b - a10 > j8) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            i10 = arrayList.size();
        }
        arrayList.add(i10, aVar);
        if (i10 == 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        byte[] bArr = j9.c.f6602a;
        synchronized (this.f6993e) {
            this.f6990a = true;
            if (b()) {
                this.f6993e.e(this);
            }
            i iVar = i.f7501a;
        }
    }

    public final String toString() {
        return this.f6994f;
    }
}
