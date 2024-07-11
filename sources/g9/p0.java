package g9;

import androidx.databinding.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n.e;
import z8.g;

public abstract class p0 extends q implements a0, h0 {

    /* renamed from: r  reason: collision with root package name */
    public q0 f5038r;

    public final boolean a() {
        return true;
    }

    public final t0 b() {
        return null;
    }

    public final void g() {
        boolean z;
        q0 r5 = r();
        do {
            Object C = r5.C();
            if (C instanceof p0) {
                if (C == this) {
                    b0 b0Var = a.f1007j0;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q0.f5039o;
                        if (!atomicReferenceFieldUpdater.compareAndSet(r5, C, b0Var)) {
                            if (atomicReferenceFieldUpdater.get(r5) != C) {
                                z = false;
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else if ((C instanceof h0) && ((h0) C).b() != null) {
                p();
                return;
            } else {
                return;
            }
        } while (!z);
    }

    public final q0 r() {
        q0 q0Var = this.f5038r;
        if (q0Var != null) {
            return q0Var;
        }
        g.l("job");
        throw null;
    }

    public final String toString() {
        return getClass().getSimpleName() + '@' + e.x(this) + "[job@" + e.x(r()) + ']';
    }
}
