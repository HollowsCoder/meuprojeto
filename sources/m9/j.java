package m9;

import i9.a;
import i9.f0;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import l9.c;
import l9.d;
import m9.e;
import n8.i;
import r9.h;
import z8.g;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final long f7268a;

    /* renamed from: b  reason: collision with root package name */
    public final c f7269b;

    /* renamed from: c  reason: collision with root package name */
    public final i f7270c;
    public final ConcurrentLinkedQueue<h> d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7271e = 5;

    public j(d dVar, TimeUnit timeUnit) {
        g.f(dVar, "taskRunner");
        g.f(timeUnit, "timeUnit");
        this.f7268a = timeUnit.toNanos(5);
        this.f7269b = dVar.f();
        this.f7270c = new i(this, b0.d.g(new StringBuilder(), j9.c.f6607g, " ConnectionPool"));
        this.d = new ConcurrentLinkedQueue<>();
    }

    public final boolean a(a aVar, e eVar, List<f0> list, boolean z) {
        g.f(aVar, "address");
        g.f(eVar, "call");
        Iterator<h> it = this.d.iterator();
        while (true) {
            boolean z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            h next = it.next();
            g.e(next, "connection");
            synchronized (next) {
                if (z) {
                    if (next.f7256f != null) {
                        z10 = true;
                    }
                    if (!z10) {
                        i iVar = i.f7501a;
                    }
                }
                if (next.h(aVar, list)) {
                    eVar.d(next);
                    return true;
                }
                i iVar2 = i.f7501a;
            }
        }
    }

    public final int b(h hVar, long j8) {
        byte[] bArr = j9.c.f6602a;
        ArrayList arrayList = hVar.f7264o;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                h.f8494c.getClass();
                h.f8492a.k(((e.b) reference).f7247a, "A connection to " + hVar.f7266q.f6237a.f6152a + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i10);
                hVar.f7259i = true;
                if (arrayList.isEmpty()) {
                    hVar.f7265p = j8 - this.f7268a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
