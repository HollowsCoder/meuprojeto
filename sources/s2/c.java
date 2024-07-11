package s2;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import q2.f;
import s2.q;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8563a = false;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f8564b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ReferenceQueue<q<?>> f8565c = new ReferenceQueue<>();
    public q.a d;

    public static final class a extends WeakReference<q<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final f f8566a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8567b;

        /* renamed from: c  reason: collision with root package name */
        public w<?> f8568c;

        public a(f fVar, q<?> qVar, ReferenceQueue<? super q<?>> referenceQueue, boolean z) {
            super(qVar, referenceQueue);
            w<Z> wVar;
            s6.a.n(fVar);
            this.f8566a = fVar;
            if (!qVar.f8671o || !z) {
                wVar = null;
            } else {
                wVar = qVar.f8673q;
                s6.a.n(wVar);
            }
            this.f8568c = wVar;
            this.f8567b = qVar.f8671o;
        }
    }

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a());
        newSingleThreadExecutor.execute(new b(this));
    }

    public final synchronized void a(f fVar, q<?> qVar) {
        a aVar = (a) this.f8564b.put(fVar, new a(fVar, qVar, this.f8565c, this.f8563a));
        if (aVar != null) {
            aVar.f8568c = null;
            aVar.clear();
        }
    }

    public final void b(a aVar) {
        synchronized (this) {
            this.f8564b.remove(aVar.f8566a);
            if (aVar.f8567b) {
                w<?> wVar = aVar.f8568c;
                if (wVar != null) {
                    this.d.a(aVar.f8566a, new q(wVar, true, false, aVar.f8566a, this.d));
                }
            }
        }
    }
}
