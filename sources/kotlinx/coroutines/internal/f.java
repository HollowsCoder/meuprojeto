package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class f<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6784a = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new g(8, false);

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019 A[LOOP:1: B:7:0x0019->B:10:0x0024, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(kotlinx.coroutines.scheduling.g r5) {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4._cur
            kotlinx.coroutines.internal.g r0 = (kotlinx.coroutines.internal.g) r0
            int r1 = r0.a(r5)
            r2 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 == r2) goto L_0x0013
            r0 = 2
            if (r1 == r0) goto L_0x0011
            goto L_0x0000
        L_0x0011:
            r5 = 0
            return r5
        L_0x0013:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f6784a
            kotlinx.coroutines.internal.g r3 = r0.e()
        L_0x0019:
            boolean r2 = r1.compareAndSet(r4, r0, r3)
            if (r2 == 0) goto L_0x0020
            goto L_0x0000
        L_0x0020:
            java.lang.Object r2 = r1.get(r4)
            if (r2 == r0) goto L_0x0019
            goto L_0x0000
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.f.a(kotlinx.coroutines.scheduling.g):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0011 A[LOOP:1: B:4:0x0011->B:7:0x001c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4._cur
            kotlinx.coroutines.internal.g r0 = (kotlinx.coroutines.internal.g) r0
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f6784a
            kotlinx.coroutines.internal.g r2 = r0.e()
        L_0x0011:
            boolean r3 = r1.compareAndSet(r4, r0, r2)
            if (r3 == 0) goto L_0x0018
            goto L_0x0000
        L_0x0018:
            java.lang.Object r3 = r1.get(r4)
            if (r3 == r0) goto L_0x0011
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.f.b():void");
    }

    public final int c() {
        return ((g) this._cur).c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0013 A[LOOP:1: B:4:0x0013->B:7:0x001e, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final E d() {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4._cur
            kotlinx.coroutines.internal.g r0 = (kotlinx.coroutines.internal.g) r0
            java.lang.Object r1 = r0.f()
            d7.j0 r2 = kotlinx.coroutines.internal.g.f6787g
            if (r1 == r2) goto L_0x000d
            return r1
        L_0x000d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f6784a
            kotlinx.coroutines.internal.g r2 = r0.e()
        L_0x0013:
            boolean r3 = r1.compareAndSet(r4, r0, r2)
            if (r3 == 0) goto L_0x001a
            goto L_0x0000
        L_0x001a:
            java.lang.Object r3 = r1.get(r4)
            if (r3 == r0) goto L_0x0013
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.f.d():java.lang.Object");
    }
}
