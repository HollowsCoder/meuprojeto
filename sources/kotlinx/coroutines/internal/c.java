package kotlinx.coroutines.internal;

import androidx.databinding.a;
import d7.j0;
import g9.a0;
import g9.a1;
import g9.c0;
import g9.o;
import g9.p;
import g9.s;
import g9.u0;
import g9.y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n8.e;
import n8.i;
import q8.f;
import s8.d;
import z8.g;

public final class c<T> extends y<T> implements d, q8.d<T> {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6775v = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: r  reason: collision with root package name */
    public final s f6776r;

    /* renamed from: s  reason: collision with root package name */
    public final q8.d<T> f6777s;

    /* renamed from: t  reason: collision with root package name */
    public Object f6778t = a.f1023u0;
    public final Object u = m.b(b());

    public c(s sVar, s8.c cVar) {
        super(-1);
        this.f6776r = sVar;
        this.f6777s = cVar;
    }

    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof p) {
            ((p) obj).f5037b.k(cancellationException);
        }
    }

    public final f b() {
        return this.f6777s.b();
    }

    public final q8.d<T> c() {
        return this;
    }

    public final d e() {
        q8.d<T> dVar = this.f6777s;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final void h(Object obj) {
        Object obj2;
        boolean z;
        f b10;
        Object c10;
        q8.d<T> dVar = this.f6777s;
        f b11 = dVar.b();
        Throwable a10 = e.a(obj);
        if (a10 == null) {
            obj2 = obj;
        } else {
            obj2 = new o(a10, false);
        }
        s sVar = this.f6776r;
        if (sVar.x()) {
            this.f6778t = obj2;
            this.f5054q = 0;
            sVar.b(b11, this);
            return;
        }
        c0 a11 = a1.a();
        if (a11.f5000p >= 4294967296L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f6778t = obj2;
            this.f5054q = 0;
            a11.z(this);
            return;
        }
        a11.C(true);
        try {
            b10 = b();
            c10 = m.c(b10, this.u);
            dVar.h(obj);
            i iVar = i.f7501a;
            m.a(b10, c10);
            do {
            } while (a11.E());
        } catch (Throwable th) {
            try {
                g(th, (Throwable) null);
            } catch (Throwable th2) {
                a11.y();
                throw th2;
            }
        }
        a11.y();
    }

    public final Object i() {
        Object obj = this.f6778t;
        this.f6778t = a.f1023u0;
        return obj;
    }

    public final boolean j() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean k(CancellationException cancellationException) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            j0 j0Var = a.f1025v0;
            boolean z = false;
            boolean z10 = true;
            if (g.a(obj, j0Var)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6775v;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, j0Var, cancellationException)) {
                        if (atomicReferenceFieldUpdater.get(this) != j0Var) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6775v;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    return false;
                }
            }
        }
    }

    public final void l() {
        g9.f fVar;
        a0 a0Var;
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof g9.f) {
            fVar = (g9.f) obj;
        } else {
            fVar = null;
        }
        if (fVar != null && (a0Var = fVar.f5016t) != null) {
            a0Var.g();
            fVar.f5016t = u0.f5050o;
        }
    }

    public final Throwable m(g9.e<?> eVar) {
        boolean z;
        do {
            Object obj = this._reusableCancellableContinuation;
            j0 j0Var = a.f1025v0;
            z = false;
            if (obj == j0Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6775v;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, j0Var, eVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != j0Var) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else if (obj instanceof Throwable) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6775v;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else {
                throw new IllegalStateException(g.k(obj, "Inconsistent state ").toString());
            }
        } while (!z);
        return null;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f6776r + ", " + n.e.L(this.f6777s) + ']';
    }
}
