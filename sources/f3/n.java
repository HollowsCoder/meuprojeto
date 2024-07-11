package f3;

import i3.c;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import m3.j;
import m5.p;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4620a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4621b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4622c;
    public AbstractCollection d;

    public n(int i10) {
        this.f4620a = i10;
        if (i10 != 1) {
            this.f4622c = Collections.newSetFromMap(new WeakHashMap());
            this.d = new ArrayList();
            return;
        }
        this.f4622c = new Object();
    }

    public final boolean a(c cVar) {
        boolean z = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f4622c).remove(cVar);
        if (!((List) this.d).remove(cVar) && !remove) {
            z = false;
        }
        if (z) {
            cVar.clear();
        }
        return z;
    }

    public final void b() {
        Iterator it = j.d((Set) this.f4622c).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!cVar.k() && !cVar.d()) {
                cVar.clear();
                if (!this.f4621b) {
                    cVar.g();
                } else {
                    ((List) this.d).add(cVar);
                }
            }
        }
    }

    public final void c() {
        this.f4621b = false;
        Iterator it = j.d((Set) this.f4622c).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!cVar.k() && !cVar.isRunning()) {
                cVar.g();
            }
        }
        ((List) this.d).clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        r1 = r2.f4622c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (m5.p) ((java.util.Queue) r2.d).poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r0 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r2.f4621b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        r0.a(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(m5.i r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4622c
            monitor-enter(r0)
            java.util.AbstractCollection r1 = r2.d     // Catch:{ all -> 0x0030 }
            java.util.Queue r1 = (java.util.Queue) r1     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            boolean r1 = r2.f4621b     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000e
            goto L_0x002e
        L_0x000e:
            r1 = 1
            r2.f4621b = r1     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
        L_0x0012:
            java.lang.Object r1 = r2.f4622c
            monitor-enter(r1)
            java.util.AbstractCollection r0 = r2.d     // Catch:{ all -> 0x002b }
            java.util.Queue r0 = (java.util.Queue) r0     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x002b }
            m5.p r0 = (m5.p) r0     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0026
            r3 = 0
            r2.f4621b = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            return
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            r0.a(r3)
            goto L_0x0012
        L_0x002b:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r3
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.n.d(m5.i):void");
    }

    public final void e(p pVar) {
        synchronized (this.f4622c) {
            try {
                if (((Queue) this.d) == null) {
                    this.d = new ArrayDeque();
                }
                ((Queue) this.d).add(pVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        switch (this.f4620a) {
            case 0:
                return super.toString() + "{numRequests=" + ((Set) this.f4622c).size() + ", isPaused=" + this.f4621b + "}";
            default:
                return super.toString();
        }
    }
}
