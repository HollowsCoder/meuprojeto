package z3;

import b4.b;
import e8.f;
import java.util.Date;
import t3.s;
import v7.a;

public final /* synthetic */ class i implements b.a, a.C0141a, m5.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f9895o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f9896p;

    public /* synthetic */ i(Object obj, Object obj2) {
        this.f9895o = obj;
        this.f9896p = obj2;
    }

    public final Object b() {
        return ((m) this.f9895o).f9908c.L((s) this.f9896p);
    }

    public final Object c(m5.i iVar) {
        com.google.firebase.remoteconfig.internal.a aVar = (com.google.firebase.remoteconfig.internal.a) this.f9895o;
        Date date = (Date) this.f9896p;
        int[] iArr = com.google.firebase.remoteconfig.internal.a.f3731j;
        aVar.getClass();
        if (iVar.m()) {
            com.google.firebase.remoteconfig.internal.b bVar = aVar.f3737g;
            synchronized (bVar.f3744b) {
                bVar.f3743a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception h10 = iVar.h();
            if (h10 != null) {
                boolean z = h10 instanceof f;
                com.google.firebase.remoteconfig.internal.b bVar2 = aVar.f3737g;
                if (z) {
                    synchronized (bVar2.f3744b) {
                        bVar2.f3743a.edit().putInt("last_fetch_status", 2).apply();
                    }
                } else {
                    synchronized (bVar2.f3744b) {
                        bVar2.f3743a.edit().putInt("last_fetch_status", 1).apply();
                    }
                }
            }
        }
        return iVar;
    }

    public final void d(v7.b bVar) {
        ((a.C0141a) this.f9895o).d(bVar);
        ((a.C0141a) this.f9896p).d(bVar);
    }
}
