package kotlinx.coroutines.scheduling;

import n.e;

public final class i extends g {

    /* renamed from: q  reason: collision with root package name */
    public final Runnable f6831q;

    public i(Runnable runnable, long j8, h hVar) {
        super(j8, hVar);
        this.f6831q = runnable;
    }

    public final void run() {
        try {
            this.f6831q.run();
        } finally {
            this.f6830p.g();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f6831q;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(e.x(runnable));
        sb.append(", ");
        sb.append(this.f6829o);
        sb.append(", ");
        sb.append(this.f6830p);
        sb.append(']');
        return sb.toString();
    }
}
