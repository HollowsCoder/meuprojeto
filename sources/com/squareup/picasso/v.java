package com.squareup.picasso;

import com.squareup.picasso.e0;
import com.squareup.picasso.t;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class v extends ThreadPoolExecutor {

    public static final class a extends FutureTask<c> implements Comparable<a> {

        /* renamed from: o  reason: collision with root package name */
        public final c f3995o;

        public a(c cVar) {
            super(cVar, (Object) null);
            this.f3995o = cVar;
        }

        public final int compareTo(Object obj) {
            c cVar = this.f3995o;
            t.d dVar = cVar.G;
            c cVar2 = ((a) obj).f3995o;
            t.d dVar2 = cVar2.G;
            if (dVar == dVar2) {
                return cVar.f3923o - cVar2.f3923o;
            }
            return dVar2.ordinal() - dVar.ordinal();
        }
    }

    public v() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new e0.b());
    }

    public final void a(int i10) {
        setCorePoolSize(i10);
        setMaximumPoolSize(i10);
    }

    public final Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}
