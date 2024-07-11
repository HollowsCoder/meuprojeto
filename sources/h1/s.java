package h1;

import java.util.ArrayList;
import java.util.Iterator;
import t1.c;

public final class s implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ t f5208o;

    public s(t tVar) {
        this.f5208o = tVar;
    }

    public final void run() {
        if (this.f5208o.d != null) {
            r<T> rVar = this.f5208o.d;
            V v10 = rVar.f5206a;
            if (v10 != null) {
                t tVar = this.f5208o;
                synchronized (tVar) {
                    Iterator it = new ArrayList(tVar.f5210a).iterator();
                    while (it.hasNext()) {
                        ((o) it.next()).onResult(v10);
                    }
                }
                return;
            }
            t tVar2 = this.f5208o;
            Throwable th = rVar.f5207b;
            synchronized (tVar2) {
                ArrayList arrayList = new ArrayList(tVar2.f5211b);
                if (arrayList.isEmpty()) {
                    c.c("Lottie encountered an error but no failure listener was added:", th);
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((o) it2.next()).onResult(th);
                    }
                }
            }
        }
    }
}
