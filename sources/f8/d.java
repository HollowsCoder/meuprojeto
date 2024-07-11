package f8;

import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m5.c;
import m5.e;
import m5.f;
import m5.i;
import m5.l;
import m5.r;

public final class d {
    public static final HashMap d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final a f4902e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f4903a;

    /* renamed from: b  reason: collision with root package name */
    public final i f4904b;

    /* renamed from: c  reason: collision with root package name */
    public r f4905c = null;

    public static class a<TResult> implements f<TResult>, e, c {

        /* renamed from: o  reason: collision with root package name */
        public final CountDownLatch f4906o = new CountDownLatch(1);

        public final void b() {
            this.f4906o.countDown();
        }

        public final void c(TResult tresult) {
            this.f4906o.countDown();
        }

        public final void e(Exception exc) {
            this.f4906o.countDown();
        }
    }

    public d(ExecutorService executorService, i iVar) {
        this.f4903a = executorService;
        this.f4904b = iVar;
    }

    public static Object a(i iVar, TimeUnit timeUnit) {
        a aVar = new a();
        a aVar2 = f4902e;
        iVar.d(aVar2, aVar);
        iVar.c(aVar2, aVar);
        iVar.a(aVar2, aVar);
        if (!aVar.f4906o.await(5, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (iVar.m()) {
            return iVar.i();
        } else {
            throw new ExecutionException(iVar.h());
        }
    }

    public final synchronized i<e> b() {
        r rVar = this.f4905c;
        if (rVar == null || (rVar.l() && !this.f4905c.m())) {
            ExecutorService executorService = this.f4903a;
            i iVar = this.f4904b;
            Objects.requireNonNull(iVar);
            this.f4905c = l.c(executorService, new e8.i(1, iVar));
        }
        return this.f4905c;
    }

    public final i<e> c(e eVar) {
        b bVar = new b(this, eVar);
        ExecutorService executorService = this.f4903a;
        return l.c(executorService, bVar).n(executorService, new c(this, eVar));
    }
}
