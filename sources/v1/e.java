package v1;

import androidx.lifecycle.a0;
import java.lang.ref.WeakReference;
import z8.g;

public abstract class e<N> extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<N> f9121c;

    public final N c() {
        WeakReference<N> weakReference = this.f9121c;
        if (weakReference == null) {
            return null;
        }
        g.c(weakReference);
        return weakReference.get();
    }
}
