package g9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.k;

public final class x<T> extends k<T> {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5053q = AtomicIntegerFieldUpdater.newUpdater(x.class, "_decision");
    private volatile /* synthetic */ int _decision;

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f5053q
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            r0 = 0
            q8.d r0 = n.e.A(r0)
            java.lang.Object r5 = s6.a.G(r5)
            r1 = 0
            androidx.databinding.a.p(r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.x.R(java.lang.Object):void");
    }

    public final void k(Object obj) {
        R(obj);
    }
}
