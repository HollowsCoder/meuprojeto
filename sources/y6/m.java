package y6;

import b8.k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import s6.a;
import s7.b;
import s7.c;
import s7.d;

public final class m implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f9586a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public ArrayDeque f9587b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final Executor f9588c;

    public m(Executor executor) {
        this.f9588c = executor;
    }

    public final synchronized void a(Executor executor, b bVar) {
        Class<a> cls = a.class;
        synchronized (this) {
            executor.getClass();
            if (!this.f9586a.containsKey(cls)) {
                this.f9586a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f9586a.get(cls)).put(bVar, executor);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(s7.b r3) {
        /*
            r2 = this;
            java.lang.Class<s6.a> r0 = s6.a.class
            monitor-enter(r2)
            java.util.HashMap r1 = r2.f9586a     // Catch:{ all -> 0x0025 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r2)
            return
        L_0x000d:
            java.util.HashMap r1 = r2.f9586a     // Catch:{ all -> 0x0025 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0025 }
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch:{ all -> 0x0025 }
            r1.remove(r3)     // Catch:{ all -> 0x0025 }
            boolean r3 = r1.isEmpty()     // Catch:{ all -> 0x0025 }
            if (r3 == 0) goto L_0x0023
            java.util.HashMap r3 = r2.f9586a     // Catch:{ all -> 0x0025 }
            r3.remove(r0)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r2)
            return
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.m.b(s7.b):void");
    }

    public final void c(k kVar) {
        a(this.f9588c, kVar);
    }
}
