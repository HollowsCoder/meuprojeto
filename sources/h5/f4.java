package h5;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public final class f4<V> extends FutureTask<V> implements Comparable<f4<V>> {

    /* renamed from: o  reason: collision with root package name */
    public final long f5373o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f5374p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5375q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ h4 f5376r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f4(h4 h4Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f5376r = h4Var;
        long andIncrement = h4.f5429y.getAndIncrement();
        this.f5373o = andIncrement;
        this.f5375q = str;
        this.f5374p = z;
        if (andIncrement == Long.MAX_VALUE) {
            g3 g3Var = h4Var.f5649o.w;
            i4.n(g3Var);
            g3Var.f5397t.a("Tasks index overflow");
        }
    }

    public final int compareTo(Object obj) {
        f4 f4Var = (f4) obj;
        boolean z = f4Var.f5374p;
        boolean z10 = this.f5374p;
        if (z10 == z) {
            long j8 = f4Var.f5373o;
            long j10 = this.f5373o;
            int i10 = (j10 > j8 ? 1 : (j10 == j8 ? 0 : -1));
            if (i10 < 0) {
                return -1;
            }
            if (i10 > 0) {
                return 1;
            }
            g3 g3Var = this.f5376r.f5649o.w;
            i4.n(g3Var);
            g3Var.u.b(Long.valueOf(j10), "Two tasks share the same index. index");
            return 0;
        } else if (!z10) {
            return 1;
        } else {
            return -1;
        }
    }

    public final void setException(Throwable th) {
        g3 g3Var = this.f5376r.f5649o.w;
        i4.n(g3Var);
        g3Var.f5397t.b(th, this.f5375q);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f4(h4 h4Var, Callable callable, boolean z) {
        super(callable);
        this.f5376r = h4Var;
        long andIncrement = h4.f5429y.getAndIncrement();
        this.f5373o = andIncrement;
        this.f5375q = "Task exception on worker thread";
        this.f5374p = z;
        if (andIncrement == Long.MAX_VALUE) {
            g3 g3Var = h4Var.f5649o.w;
            i4.n(g3Var);
            g3Var.f5397t.a("Tasks index overflow");
        }
    }
}
