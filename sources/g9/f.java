package g9;

import g9.l0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.c;
import n.e;
import n8.h;
import n8.i;
import r8.a;
import s8.d;
import y8.l;
import z8.g;

public final class f<T> extends y<T> implements e<T>, d {
    public static final /* synthetic */ AtomicIntegerFieldUpdater u;

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5013v;
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = b.f4997o;

    /* renamed from: r  reason: collision with root package name */
    public final q8.d<T> f5014r;

    /* renamed from: s  reason: collision with root package name */
    public final q8.f f5015s;

    /* renamed from: t  reason: collision with root package name */
    public a0 f5016t;

    static {
        Class<f> cls = f.class;
        u = AtomicIntegerFieldUpdater.newUpdater(cls, "_decision");
        f5013v = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_state");
    }

    public f(q8.d dVar) {
        super(1);
        this.f5014r = dVar;
        this.f5015s = dVar.b();
    }

    public static void p(Object obj, l lVar) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public final void a(Object obj, CancellationException cancellationException) {
        boolean z;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof v0) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof o)) {
                boolean z10 = true;
                if (obj2 instanceof n) {
                    n nVar = (n) obj2;
                    if (nVar.f5032e != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        n a10 = n.a(nVar, (d) null, cancellationException, 15);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5013v;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    z10 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z10) {
                            d dVar = nVar.f5030b;
                            if (dVar != null) {
                                j(dVar, cancellationException);
                            }
                            l<Throwable, i> lVar = nVar.f5031c;
                            if (lVar != null) {
                                try {
                                    lVar.k(cancellationException);
                                    return;
                                } catch (Throwable th) {
                                    e.z(this.f5015s, new h(g.k(this, "Exception in resume onCancellation handler for "), th));
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5013v;
                    n nVar2 = new n(obj2, (d) null, (l) null, cancellationException, 14);
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, nVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z10) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final q8.f b() {
        return this.f5015s;
    }

    public final q8.d<T> c() {
        return this.f5014r;
    }

    public final Throwable d(Object obj) {
        Throwable d = super.d(obj);
        if (d == null) {
            return null;
        }
        return d;
    }

    public final d e() {
        q8.d<T> dVar = this.f5014r;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final <T> T f(Object obj) {
        return obj instanceof n ? ((n) obj).f5029a : obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: g9.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: g9.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0052 A[EDGE_INSN: B:44:0x0052->B:28:0x0052 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Throwable r0 = n8.e.a(r12)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x000d
        L_0x0008:
            g9.o r12 = new g9.o
            r12.<init>(r0, r1)
        L_0x000d:
            int r0 = r11.f5054q
        L_0x000f:
            r5 = 0
            java.lang.Object r8 = r11._state
            boolean r2 = r8 instanceof g9.v0
            r9 = 1
            if (r2 == 0) goto L_0x006b
            r2 = r8
            g9.v0 r2 = (g9.v0) r2
            boolean r3 = r12 instanceof g9.o
            if (r3 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            if (r0 == r9) goto L_0x0027
            r3 = 2
            if (r0 != r3) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = r1
            goto L_0x0028
        L_0x0027:
            r3 = r9
        L_0x0028:
            if (r3 != 0) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            boolean r3 = r2 instanceof g9.d
            if (r3 == 0) goto L_0x0041
            g9.n r10 = new g9.n
            if (r3 == 0) goto L_0x0036
            g9.d r2 = (g9.d) r2
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            r4 = r2
            r6 = 0
            r7 = 16
            r2 = r10
            r3 = r12
            r2.<init>((java.lang.Object) r3, (g9.d) r4, (y8.l) r5, (java.util.concurrent.CancellationException) r6, (int) r7)
            goto L_0x0042
        L_0x0041:
            r10 = r12
        L_0x0042:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f5013v
        L_0x0044:
            boolean r3 = r2.compareAndSet(r11, r8, r10)
            if (r3 == 0) goto L_0x004b
            goto L_0x0052
        L_0x004b:
            java.lang.Object r3 = r2.get(r11)
            if (r3 == r8) goto L_0x0044
            r9 = r1
        L_0x0052:
            if (r9 != 0) goto L_0x0055
            goto L_0x000f
        L_0x0055:
            boolean r12 = r11.o()
            if (r12 != 0) goto L_0x0067
            g9.a0 r12 = r11.f5016t
            if (r12 != 0) goto L_0x0060
            goto L_0x0067
        L_0x0060:
            r12.g()
            g9.u0 r12 = g9.u0.f5050o
            r11.f5016t = r12
        L_0x0067:
            r11.l(r0)
            goto L_0x007c
        L_0x006b:
            boolean r0 = r8 instanceof g9.g
            if (r0 == 0) goto L_0x007d
            g9.g r8 = (g9.g) r8
            r8.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = g9.g.f5017c
            boolean r0 = r0.compareAndSet(r8, r1, r9)
            if (r0 == 0) goto L_0x007d
        L_0x007c:
            return
        L_0x007d:
            java.lang.String r0 = "Already resumed, but proposed with update "
            java.lang.String r12 = z8.g.k(r12, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.f.h(java.lang.Object):void");
    }

    public final Object i() {
        return this._state;
    }

    public final void j(d dVar, Throwable th) {
        try {
            dVar.a(th);
        } catch (Throwable th2) {
            e.z(this.f5015s, new h(g.k(this, "Exception in invokeOnCancellation handler for "), th2));
        }
    }

    public final void k(Throwable th) {
        Object obj;
        boolean z;
        boolean z10;
        d dVar;
        a0 a0Var;
        do {
            obj = this._state;
            if (obj instanceof v0) {
                z = obj instanceof d;
                g gVar = new g(this, th, z);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5013v;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, gVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z10 = false;
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z10);
        if (z) {
            dVar = (d) obj;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            j(dVar, th);
        }
        if (!o() && (a0Var = this.f5016t) != null) {
            a0Var.g();
            this.f5016t = u0.f5050o;
        }
        l(this.f5054q);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(int r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r6._decision
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 != r3) goto L_0x000b
            r0 = r2
            goto L_0x0020
        L_0x000b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0017:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = u
            boolean r0 = r0.compareAndSet(r6, r2, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r3
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            q8.d<T> r0 = r6.f5014r
            r4 = 4
            if (r7 != r4) goto L_0x002a
            r4 = r3
            goto L_0x002b
        L_0x002a:
            r4 = r2
        L_0x002b:
            if (r4 != 0) goto L_0x008b
            boolean r5 = r0 instanceof kotlinx.coroutines.internal.c
            if (r5 == 0) goto L_0x008b
            if (r7 == r3) goto L_0x0038
            if (r7 != r1) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = r2
            goto L_0x0039
        L_0x0038:
            r7 = r3
        L_0x0039:
            int r5 = r6.f5054q
            if (r5 == r3) goto L_0x0042
            if (r5 != r1) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r1 = r2
            goto L_0x0043
        L_0x0042:
            r1 = r3
        L_0x0043:
            if (r7 != r1) goto L_0x008b
            r7 = r0
            kotlinx.coroutines.internal.c r7 = (kotlinx.coroutines.internal.c) r7
            g9.s r7 = r7.f6776r
            q8.f r0 = r0.b()
            boolean r1 = r7.x()
            if (r1 == 0) goto L_0x0058
            r7.b(r0, r6)
            goto L_0x008e
        L_0x0058:
            g9.c0 r7 = g9.a1.a()
            long r0 = r7.f5000p
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0068
            r2 = r3
        L_0x0068:
            if (r2 == 0) goto L_0x006e
            r7.z(r6)
            goto L_0x008e
        L_0x006e:
            r7.C(r3)
            q8.d<T> r0 = r6.f5014r     // Catch:{ all -> 0x007d }
            p9.u.p(r6, r0, r3)     // Catch:{ all -> 0x007d }
        L_0x0076:
            boolean r0 = r7.E()     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0076
            goto L_0x0082
        L_0x007d:
            r0 = move-exception
            r1 = 0
            r6.g(r0, r1)     // Catch:{ all -> 0x0086 }
        L_0x0082:
            r7.y()
            goto L_0x008e
        L_0x0086:
            r0 = move-exception
            r7.y()
            throw r0
        L_0x008b:
            p9.u.p(r6, r0, r4)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.f.l(int):void");
    }

    public final Object m() {
        boolean z;
        boolean z10;
        l0 l0Var;
        c cVar;
        c cVar2;
        l0 l0Var2;
        boolean o10 = o();
        while (true) {
            int i10 = this._decision;
            z = false;
            if (i10 == 0) {
                if (u.compareAndSet(this, 0, 1)) {
                    z10 = true;
                    break;
                }
            } else if (i10 == 2) {
                z10 = false;
            } else {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        l0.b bVar = l0.b.f5025o;
        u0 u0Var = u0.f5050o;
        Throwable th = null;
        if (z10) {
            if (this.f5016t == null && (l0Var2 = (l0) this.f5015s.get(bVar)) != null) {
                this.f5016t = l0.a.a(l0Var2, true, new h(this), 2);
            }
            if (o10) {
                q8.d<T> dVar = this.f5014r;
                if (dVar instanceof c) {
                    cVar2 = (c) dVar;
                } else {
                    cVar2 = null;
                }
                if (cVar2 != null) {
                    th = cVar2.m(this);
                }
                if (th != null) {
                    a0 a0Var = this.f5016t;
                    if (a0Var != null) {
                        a0Var.g();
                        this.f5016t = u0Var;
                    }
                    k(th);
                }
            }
            return a.COROUTINE_SUSPENDED;
        }
        if (o10) {
            q8.d<T> dVar2 = this.f5014r;
            if (dVar2 instanceof c) {
                cVar = (c) dVar2;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                th = cVar.m(this);
            }
            if (th != null) {
                a0 a0Var2 = this.f5016t;
                if (a0Var2 != null) {
                    a0Var2.g();
                    this.f5016t = u0Var;
                }
                k(th);
            }
        }
        Object obj = this._state;
        if (!(obj instanceof o)) {
            int i11 = this.f5054q;
            if (i11 == 1 || i11 == 2) {
                z = true;
            }
            if (!z || (l0Var = (l0) this.f5015s.get(bVar)) == null || l0Var.a()) {
                return f(obj);
            }
            CancellationException o11 = l0Var.o();
            a(obj, o11);
            throw o11;
        }
        throw ((o) obj).f5034a;
    }

    public final void n(l<? super Throwable, i> lVar) {
        d dVar;
        boolean z;
        if (lVar instanceof d) {
            dVar = (d) lVar;
        } else {
            dVar = new j0(lVar);
        }
        while (true) {
            Object obj = this._state;
            boolean z10 = true;
            if (obj instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5013v;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, dVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                Throwable th = null;
                if (!(obj instanceof d)) {
                    boolean z11 = obj instanceof o;
                    if (z11) {
                        o oVar = (o) obj;
                        oVar.getClass();
                        if (!o.f5033b.compareAndSet(oVar, 0, 1)) {
                            p(obj, lVar);
                            throw null;
                        } else if (obj instanceof g) {
                            if (!z11) {
                                oVar = null;
                            }
                            if (oVar != null) {
                                th = oVar.f5034a;
                            }
                            try {
                                lVar.k(th);
                                return;
                            } catch (Throwable th2) {
                                e.z(this.f5015s, new h(g.k(this, "Exception in invokeOnCancellation handler for "), th2));
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (obj instanceof n) {
                        n nVar = (n) obj;
                        if (nVar.f5030b == null) {
                            Throwable th3 = nVar.f5032e;
                            if (th3 != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                try {
                                    lVar.k(th3);
                                    return;
                                } catch (Throwable th4) {
                                    e.z(this.f5015s, new h(g.k(this, "Exception in invokeOnCancellation handler for "), th4));
                                    return;
                                }
                            } else {
                                n a10 = n.a(nVar, dVar, (CancellationException) null, 29);
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5013v;
                                while (true) {
                                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, a10)) {
                                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                            z10 = false;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                if (z10) {
                                    return;
                                }
                            }
                        } else {
                            p(obj, lVar);
                            throw null;
                        }
                    } else {
                        n nVar2 = new n(obj, dVar, (l) null, (CancellationException) null, 28);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f5013v;
                        while (true) {
                            if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, nVar2)) {
                                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                    z10 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z10) {
                            return;
                        }
                    }
                } else {
                    p(obj, lVar);
                    throw null;
                }
            }
        }
    }

    public final boolean o() {
        return (this.f5054q == 2) && ((c) this.f5014r).j();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(e.L(this.f5014r));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof v0) {
            str = "Active";
        } else if (obj instanceof g) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(e.x(this));
        return sb.toString();
    }
}
