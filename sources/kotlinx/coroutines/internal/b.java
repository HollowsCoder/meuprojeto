package kotlinx.coroutines.internal;

import d7.j0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s6.a;

public abstract class b<T> extends i {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6774a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = a.Q;

    public final Object a(Object obj) {
        boolean z;
        Object obj2 = this._consensus;
        j0 j0Var = a.Q;
        if (obj2 == j0Var) {
            j0 c10 = c(obj);
            obj2 = this._consensus;
            if (obj2 == j0Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6774a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, j0Var, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != j0Var) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    obj2 = c10;
                } else {
                    obj2 = this._consensus;
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t10, Object obj);

    public abstract j0 c(Object obj);
}
