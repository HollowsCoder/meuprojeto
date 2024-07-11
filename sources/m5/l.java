package m5;

import androidx.lifecycle.r;
import i4.o;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n4.m;

public final class l {

    public static final class a implements c, e, f {

        /* renamed from: o  reason: collision with root package name */
        public final CountDownLatch f7093o = new CountDownLatch(1);

        public final void b() {
            this.f7093o.countDown();
        }

        public final void c(Object obj) {
            this.f7093o.countDown();
        }

        public final void e(Exception exc) {
            this.f7093o.countDown();
        }
    }

    public static final class b implements c, e, f {

        /* renamed from: o  reason: collision with root package name */
        public final Object f7094o = new Object();

        /* renamed from: p  reason: collision with root package name */
        public final int f7095p;

        /* renamed from: q  reason: collision with root package name */
        public final r<Void> f7096q;

        /* renamed from: r  reason: collision with root package name */
        public int f7097r;

        /* renamed from: s  reason: collision with root package name */
        public int f7098s;

        /* renamed from: t  reason: collision with root package name */
        public int f7099t;
        public Exception u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f7100v;

        public b(int i10, r<Void> rVar) {
            this.f7095p = i10;
            this.f7096q = rVar;
        }

        public final void a() {
            int i10 = this.f7097r + this.f7098s + this.f7099t;
            int i11 = this.f7095p;
            if (i10 == i11) {
                Exception exc = this.u;
                r<Void> rVar = this.f7096q;
                if (exc != null) {
                    int i12 = this.f7098s;
                    StringBuilder sb = new StringBuilder(54);
                    sb.append(i12);
                    sb.append(" out of ");
                    sb.append(i11);
                    sb.append(" underlying tasks failed");
                    rVar.r(new ExecutionException(sb.toString(), this.u));
                } else if (this.f7100v) {
                    rVar.q();
                } else {
                    rVar.s(null);
                }
            }
        }

        public final void b() {
            synchronized (this.f7094o) {
                this.f7099t++;
                this.f7100v = true;
                a();
            }
        }

        public final void c(Object obj) {
            synchronized (this.f7094o) {
                this.f7097r++;
                a();
            }
        }

        public final void e(Exception exc) {
            synchronized (this.f7094o) {
                this.f7098s++;
                this.u = exc;
                a();
            }
        }
    }

    public static <TResult> TResult a(i<TResult> iVar) {
        m.g("Must not be called on the main application thread");
        if (iVar == null) {
            throw new NullPointerException("Task must not be null");
        } else if (iVar.l()) {
            return h(iVar);
        } else {
            a aVar = new a();
            q qVar = k.f7091b;
            iVar.d(qVar, aVar);
            iVar.c(qVar, aVar);
            iVar.a(qVar, aVar);
            aVar.f7093o.await();
            return h(iVar);
        }
    }

    public static <TResult> TResult b(i<TResult> iVar, long j8, TimeUnit timeUnit) {
        m.g("Must not be called on the main application thread");
        if (iVar == null) {
            throw new NullPointerException("Task must not be null");
        } else if (timeUnit == null) {
            throw new NullPointerException("TimeUnit must not be null");
        } else if (iVar.l()) {
            return h(iVar);
        } else {
            a aVar = new a();
            q qVar = k.f7091b;
            iVar.d(qVar, aVar);
            iVar.c(qVar, aVar);
            iVar.a(qVar, aVar);
            if (aVar.f7093o.await(j8, timeUnit)) {
                return h(iVar);
            }
            throw new TimeoutException("Timed out waiting for Task");
        }
    }

    @Deprecated
    public static r c(Executor executor, Callable callable) {
        if (executor != null) {
            r rVar = new r();
            executor.execute(new o(12, (Object) rVar, (Object) callable));
            return rVar;
        }
        throw new NullPointerException("Executor must not be null");
    }

    public static r d(Exception exc) {
        r rVar = new r();
        rVar.r(exc);
        return rVar;
    }

    public static r e(Object obj) {
        r rVar = new r();
        rVar.s(obj);
        return rVar;
    }

    public static r f(List list) {
        if (list == null || list.isEmpty()) {
            return e((Object) null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((i) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        r rVar = new r();
        b bVar = new b(list.size(), rVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i iVar = (i) it2.next();
            q qVar = k.f7091b;
            iVar.d(qVar, bVar);
            iVar.c(qVar, bVar);
            iVar.a(qVar, bVar);
        }
        return rVar;
    }

    public static r g(i... iVarArr) {
        Object obj;
        if (iVarArr.length == 0) {
            return e(Collections.emptyList());
        }
        List asList = Arrays.asList(iVarArr);
        if (asList == null || asList.isEmpty()) {
            obj = e(Collections.emptyList());
        } else {
            obj = f(asList).g(k.f7090a, new r((Object) asList));
        }
        return (r) obj;
    }

    public static <TResult> TResult h(i<TResult> iVar) {
        if (iVar.m()) {
            return iVar.i();
        }
        if (iVar.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.h());
    }
}
