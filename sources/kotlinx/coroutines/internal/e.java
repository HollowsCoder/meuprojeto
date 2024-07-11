package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z8.g;

public class e {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6779o;

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6780p;

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6781q;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public static abstract class a extends b<e> {

        /* renamed from: b  reason: collision with root package name */
        public final e f6782b;

        /* renamed from: c  reason: collision with root package name */
        public e f6783c;

        public a(e eVar) {
            this.f6782b = eVar;
        }

        public final void b(Object obj, Object obj2) {
            boolean z;
            e eVar;
            e eVar2 = (e) obj;
            boolean z10 = true;
            if (obj2 == null) {
                z = true;
            } else {
                z = false;
            }
            e eVar3 = this.f6782b;
            if (z) {
                eVar = eVar3;
            } else {
                eVar = this.f6783c;
            }
            if (eVar != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f6779o;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(eVar2, this, eVar)) {
                        if (atomicReferenceFieldUpdater.get(eVar2) != this) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10 && z) {
                    e eVar4 = this.f6783c;
                    g.c(eVar4);
                    eVar3.e(eVar4);
                }
            }
        }
    }

    static {
        Class<e> cls = e.class;
        Class<Object> cls2 = Object.class;
        f6779o = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f6780p = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
        f6781q = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r7 = f6779o;
        r4 = ((kotlinx.coroutines.internal.j) r4).f6793a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        if (r7.compareAndSet(r3, r1, r4) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r7.get(r3) == r1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r5 != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.e d() {
        /*
            r9 = this;
        L_0x0000:
            java.lang.Object r0 = r9._prev
            kotlinx.coroutines.internal.e r0 = (kotlinx.coroutines.internal.e) r0
            r1 = r0
        L_0x0005:
            r2 = 0
            r3 = r2
        L_0x0007:
            java.lang.Object r4 = r1._next
            r5 = 0
            r6 = 1
            if (r4 != r9) goto L_0x0024
            if (r0 != r1) goto L_0x0010
            return r1
        L_0x0010:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f6780p
        L_0x0012:
            boolean r2 = r7.compareAndSet(r9, r0, r1)
            if (r2 == 0) goto L_0x001a
            r5 = r6
            goto L_0x0020
        L_0x001a:
            java.lang.Object r2 = r7.get(r9)
            if (r2 == r0) goto L_0x0012
        L_0x0020:
            if (r5 != 0) goto L_0x0023
            goto L_0x0000
        L_0x0023:
            return r1
        L_0x0024:
            boolean r7 = r9.o()
            if (r7 == 0) goto L_0x002b
            return r2
        L_0x002b:
            if (r4 != 0) goto L_0x002e
            return r1
        L_0x002e:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.i
            if (r7 == 0) goto L_0x0038
            kotlinx.coroutines.internal.i r4 = (kotlinx.coroutines.internal.i) r4
            r4.a(r1)
            goto L_0x0000
        L_0x0038:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.j
            if (r7 == 0) goto L_0x005c
            if (r3 == 0) goto L_0x0057
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f6779o
            kotlinx.coroutines.internal.j r4 = (kotlinx.coroutines.internal.j) r4
            kotlinx.coroutines.internal.e r4 = r4.f6793a
        L_0x0044:
            boolean r2 = r7.compareAndSet(r3, r1, r4)
            if (r2 == 0) goto L_0x004c
            r5 = r6
            goto L_0x0052
        L_0x004c:
            java.lang.Object r2 = r7.get(r3)
            if (r2 == r1) goto L_0x0044
        L_0x0052:
            if (r5 != 0) goto L_0x0055
            goto L_0x0000
        L_0x0055:
            r1 = r3
            goto L_0x0005
        L_0x0057:
            java.lang.Object r1 = r1._prev
            kotlinx.coroutines.internal.e r1 = (kotlinx.coroutines.internal.e) r1
            goto L_0x0007
        L_0x005c:
            r3 = r4
            kotlinx.coroutines.internal.e r3 = (kotlinx.coroutines.internal.e) r3
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.e.d():kotlinx.coroutines.internal.e");
    }

    public final void e(e eVar) {
        boolean z;
        do {
            e eVar2 = (e) eVar._prev;
            if (f() == eVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6780p;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(eVar, eVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != eVar2) {
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
        } while (!z);
        if (o()) {
            eVar.d();
        }
    }

    public final Object f() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof i)) {
                return obj;
            }
            ((i) obj).a(this);
        }
    }

    public final e h() {
        j jVar;
        Object f10 = f();
        if (f10 instanceof j) {
            jVar = (j) f10;
        } else {
            jVar = null;
        }
        if (jVar == null) {
            return (e) f10;
        }
        return jVar.f6793a;
    }

    public final e m() {
        e d = d();
        if (d == null) {
            Object obj = this._prev;
            while (true) {
                d = (e) obj;
                if (!d.o()) {
                    break;
                }
                obj = d._prev;
            }
        }
        return d;
    }

    public boolean o() {
        return f() instanceof j;
    }

    public final void p() {
        e eVar;
        boolean z;
        do {
            Object f10 = f();
            if (!(f10 instanceof j)) {
                if (f10 != this) {
                    eVar = (e) f10;
                    j jVar = (j) eVar._removedRef;
                    if (jVar == null) {
                        jVar = new j(eVar);
                        f6781q.lazySet(eVar, jVar);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6779o;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, f10, jVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != f10) {
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
                    e eVar2 = (e) f10;
                    return;
                }
            } else {
                e eVar3 = ((j) f10).f6793a;
                return;
            }
        } while (!z);
        eVar.d();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
