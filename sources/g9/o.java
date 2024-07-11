package g9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class o {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5033b = AtomicIntegerFieldUpdater.newUpdater(o.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f5034a;

    public o(Throwable th, boolean z) {
        this.f5034a = th;
        this._handled = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f5034a + ']';
    }
}
