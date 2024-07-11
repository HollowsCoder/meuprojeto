package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.internal.l;
import p9.u;

public final class b extends c {

    /* renamed from: q  reason: collision with root package name */
    public static final b f6820q;

    /* renamed from: r  reason: collision with root package name */
    public static final e f6821r;

    static {
        b bVar = new b();
        f6820q = bVar;
        int i10 = l.f6794a;
        if (64 >= i10) {
            i10 = 64;
        }
        f6821r = new e(bVar, u.r("kotlinx.coroutines.io.parallelism", i10, 0, 0, 12));
    }

    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final String toString() {
        return "Dispatchers.Default";
    }
}
