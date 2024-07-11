package kotlinx.coroutines.scheduling;

import androidx.databinding.a;
import g9.f0;
import g9.w;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import q8.f;

public class c extends f0 {

    /* renamed from: p  reason: collision with root package name */
    public final a f6822p = new a(j.f6833b, j.f6834c, j.d, "DefaultDispatcher");

    public final void b(f fVar, Runnable runnable) {
        try {
            a aVar = this.f6822p;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f6803v;
            aVar.b(runnable, a.x0, false);
        } catch (RejectedExecutionException unused) {
            w.u.J(runnable);
        }
    }
}
