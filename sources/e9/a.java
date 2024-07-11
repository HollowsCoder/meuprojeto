package e9;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<d<T>> f4541a;

    public a(f fVar) {
        this.f4541a = new AtomicReference<>(fVar);
    }

    public final Iterator<T> iterator() {
        d andSet = this.f4541a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
