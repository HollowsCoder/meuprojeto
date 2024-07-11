package kotlinx.coroutines.internal;

import d7.j0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class g<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6785e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f6786f;

    /* renamed from: g  reason: collision with root package name */
    public static final j0 f6787g = new j0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f6788a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6789b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6790c;
    public final /* synthetic */ AtomicReferenceArray d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f6791a;

        public a(int i10) {
            this.f6791a = i10;
        }
    }

    static {
        Class<g> cls = g.class;
        f6785e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f6786f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public g(int i10, boolean z) {
        this.f6788a = i10;
        this.f6789b = z;
        int i11 = i10 - 1;
        this.f6790c = i11;
        this.d = new AtomicReferenceArray(i10);
        boolean z10 = false;
        if (i11 <= 1073741823) {
            if (!((i10 & i11) == 0 ? true : z10)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a(E e10) {
        while (true) {
            long j8 = this._state;
            if ((3458764513820540928L & j8) == 0) {
                int i10 = (int) ((1073741823 & j8) >> 0);
                int i11 = (int) ((1152921503533105152L & j8) >> 30);
                int i12 = this.f6790c;
                if (((i11 + 2) & i12) == (i10 & i12)) {
                    return 1;
                }
                if (this.f6789b || this.d.get(i11 & i12) == null) {
                    if (f6786f.compareAndSet(this, j8, (-1152921503533105153L & j8) | (((long) ((i11 + 1) & 1073741823)) << 30))) {
                        this.d.set(i11 & i12, e10);
                        g gVar = this;
                        while ((gVar._state & 1152921504606846976L) != 0) {
                            gVar = gVar.e();
                            AtomicReferenceArray atomicReferenceArray = gVar.d;
                            int i13 = gVar.f6790c & i11;
                            Object obj = atomicReferenceArray.get(i13);
                            if (!(obj instanceof a) || ((a) obj).f6791a != i11) {
                                gVar = null;
                                continue;
                            } else {
                                atomicReferenceArray.set(i13, e10);
                                continue;
                            }
                            if (gVar == null) {
                                break;
                            }
                        }
                        return 0;
                    }
                } else {
                    int i14 = this.f6788a;
                    if (i14 < 1024 || ((i11 - i10) & 1073741823) > (i14 >> 1)) {
                        return 1;
                    }
                }
            } else if ((j8 & 2305843009213693952L) != 0) {
                return 2;
            } else {
                return 1;
            }
        }
        return 1;
    }

    public final boolean b() {
        long j8;
        do {
            j8 = this._state;
            if ((j8 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j8) != 0) {
                return false;
            }
        } while (!f6786f.compareAndSet(this, j8, j8 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j8 = this._state;
        return (((int) ((j8 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j8) >> 0))) & 1073741823;
    }

    public final boolean d() {
        long j8 = this._state;
        return ((int) ((1073741823 & j8) >> 0)) == ((int) ((j8 & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066 A[LOOP:3: B:16:0x0066->B:19:0x0072, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.g<E> e() {
        /*
            r9 = this;
        L_0x0000:
            long r2 = r9._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f6786f
            r1 = r9
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r9._next
            kotlinx.coroutines.internal.g r0 = (kotlinx.coroutines.internal.g) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f6785e
            kotlinx.coroutines.internal.g r1 = new kotlinx.coroutines.internal.g
            int r4 = r9.f6788a
            int r4 = r4 * 2
            boolean r5 = r9.f6789b
            r1.<init>(r4, r5)
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r6 = 0
            long r4 = r4 >> r6
            int r4 = (int) r4
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r2
            r7 = 30
            long r5 = r5 >> r7
            int r5 = (int) r5
        L_0x003f:
            int r6 = r9.f6790c
            r7 = r4 & r6
            r6 = r6 & r5
            if (r7 == r6) goto L_0x005e
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r9.d
            java.lang.Object r6 = r6.get(r7)
            if (r6 != 0) goto L_0x0053
            kotlinx.coroutines.internal.g$a r6 = new kotlinx.coroutines.internal.g$a
            r6.<init>(r4)
        L_0x0053:
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r1.d
            int r8 = r1.f6790c
            r8 = r8 & r4
            r7.set(r8, r6)
            int r4 = r4 + 1
            goto L_0x003f
        L_0x005e:
            r4 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r4 = r4 & r2
            r1._state = r4
        L_0x0066:
            r4 = 0
            boolean r4 = r0.compareAndSet(r9, r4, r1)
            if (r4 == 0) goto L_0x006e
            goto L_0x001a
        L_0x006e:
            java.lang.Object r4 = r0.get(r9)
            if (r4 == 0) goto L_0x0066
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.g.e():kotlinx.coroutines.internal.g");
    }

    public final Object f() {
        while (true) {
            long j8 = this._state;
            if ((j8 & 1152921504606846976L) != 0) {
                return f6787g;
            }
            int i10 = (int) ((j8 & 1073741823) >> 0);
            int i11 = this.f6790c;
            int i12 = ((int) ((1152921503533105152L & j8) >> 30)) & i11;
            int i13 = i11 & i10;
            if (i12 == i13) {
                return null;
            }
            Object obj = this.d.get(i13);
            if (obj == null) {
                if (this.f6789b) {
                    return null;
                }
            } else if (obj instanceof a) {
                return null;
            } else {
                long j10 = ((long) ((i10 + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f6786f.compareAndSet(this, j8, (j8 & -1073741824) | j10)) {
                    this.d.set(this.f6790c & i10, (Object) null);
                    return obj2;
                } else if (this.f6789b) {
                    g gVar = this;
                    while (true) {
                        long j11 = gVar._state;
                        int i14 = (int) ((j11 & 1073741823) >> 0);
                        if ((j11 & 1152921504606846976L) != 0) {
                            gVar = gVar.e();
                        } else {
                            if (f6786f.compareAndSet(gVar, j11, (j11 & -1073741824) | j10)) {
                                gVar.d.set(gVar.f6790c & i14, (Object) null);
                                gVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (gVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
