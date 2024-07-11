package l4;

import android.util.Log;
import j4.b;
import k4.a;
import l4.d;
import n4.h;

public final class q implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b f6934o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ d.c f6935p;

    public q(d.c cVar, b bVar) {
        this.f6935p = cVar;
        this.f6934o = bVar;
    }

    public final void run() {
        boolean z;
        d.c cVar = this.f6935p;
        d.a aVar = (d.a) d.this.f6889g.get(cVar.f6904b);
        if (aVar != null) {
            b bVar = this.f6934o;
            if (bVar.f6535p == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                cVar.f6906e = true;
                a.e eVar = cVar.f6903a;
                if (eVar.l()) {
                    cVar.c();
                    return;
                }
                try {
                    eVar.d((h) null, eVar.b());
                } catch (SecurityException e10) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                    eVar.c("Failed to get service from broker.");
                    aVar.d(new b(10), (RuntimeException) null);
                }
            } else {
                aVar.d(bVar, (RuntimeException) null);
            }
        }
    }
}
