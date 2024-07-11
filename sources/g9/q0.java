package g9;

import d7.j0;
import g9.l0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.e;
import n8.h;
import n8.i;
import p9.u;
import q8.f;
import y8.p;
import z8.g;

public class q0 implements l0, k, w0 {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5039o = AtomicReferenceFieldUpdater.newUpdater(q0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    public static final class a extends p0 {

        /* renamed from: s  reason: collision with root package name */
        public final q0 f5040s;

        /* renamed from: t  reason: collision with root package name */
        public final b f5041t;
        public final j u;

        /* renamed from: v  reason: collision with root package name */
        public final Object f5042v;

        public a(q0 q0Var, b bVar, j jVar, Object obj) {
            this.f5040s = q0Var;
            this.f5041t = bVar;
            this.u = jVar;
            this.f5042v = obj;
        }

        public final /* bridge */ /* synthetic */ Object k(Object obj) {
            q((Throwable) obj);
            return i.f7501a;
        }

        public final void q(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q0.f5039o;
            q0 q0Var = this.f5040s;
            q0Var.getClass();
            j J = q0.J(this.u);
            b bVar = this.f5041t;
            Object obj = this.f5042v;
            if (J == null || !q0Var.Q(bVar, J, obj)) {
                q0Var.k(q0Var.x(bVar, obj));
            }
        }
    }

    public static final class b implements h0 {
        private volatile /* synthetic */ Object _exceptionsHolder;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: o  reason: collision with root package name */
        public final t0 f5043o;

        public b(t0 t0Var, Throwable th) {
            this.f5043o = t0Var;
            this._rootCause = th;
            this._exceptionsHolder = null;
        }

        public final boolean a() {
            return ((Throwable) this._rootCause) == null;
        }

        public final t0 b() {
            return this.f5043o;
        }

        public final void c(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList arrayList = new ArrayList(4);
                        arrayList.add(obj);
                        arrayList.add(th);
                        i iVar = i.f7501a;
                        this._exceptionsHolder = arrayList;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(g.k(obj, "State is ").toString());
                }
            }
        }

        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        public final boolean e() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        public final boolean f() {
            return this._isCompleting;
        }

        public final boolean g() {
            if (this._exceptionsHolder == androidx.databinding.a.f1005h0) {
                return true;
            }
            return false;
        }

        public final ArrayList h(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(g.k(obj, "State is ").toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !g.a(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = androidx.databinding.a.f1005h0;
            return arrayList;
        }

        public final void i() {
            this._isCompleting = 1;
        }

        /* JADX WARNING: type inference failed for: r1v3, types: [int, boolean] */
        public final String toString() {
            return "Finishing[cancelling=" + e() + ", completing=" + this._isCompleting + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.f5043o + ']';
        }
    }

    public static final class c extends e.a {
        public final /* synthetic */ q0 d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f5044e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(e eVar, q0 q0Var, Object obj) {
            super(eVar);
            this.d = q0Var;
            this.f5044e = obj;
        }

        public final j0 c(Object obj) {
            boolean z;
            e eVar = (e) obj;
            if (this.d.C() == this.f5044e) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            return androidx.databinding.a.f1026w0;
        }
    }

    public q0(boolean z) {
        this._state = z ? androidx.databinding.a.f1007j0 : androidx.databinding.a.f1006i0;
        this._parentHandle = null;
    }

    public static j J(e eVar) {
        while (eVar.o()) {
            eVar = eVar.m();
        }
        while (true) {
            eVar = eVar.h();
            if (!eVar.o()) {
                if (eVar instanceof j) {
                    return (j) eVar;
                }
                if (eVar instanceof t0) {
                    return null;
                }
            }
        }
    }

    public static String O(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof h0 ? ((h0) obj).a() ? "Active" : "New" : obj instanceof o ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        if (bVar.e()) {
            return "Cancelling";
        }
        if (bVar.f()) {
            return "Completing";
        }
    }

    public final t0 A(h0 h0Var) {
        t0 b10 = h0Var.b();
        if (b10 != null) {
            return b10;
        }
        if (h0Var instanceof b0) {
            return new t0();
        }
        if (h0Var instanceof p0) {
            N((p0) h0Var);
            return null;
        }
        throw new IllegalStateException(g.k(h0Var, "State should have list: ").toString());
    }

    public final i B() {
        return (i) this._parentHandle;
    }

    public final Object C() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.i)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.i) obj).a(this);
        }
    }

    public boolean D(Throwable th) {
        return false;
    }

    public void E(h hVar) {
        throw hVar;
    }

    public final void F(l0 l0Var) {
        u0 u0Var = u0.f5050o;
        if (l0Var == null) {
            this._parentHandle = u0Var;
            return;
        }
        l0Var.start();
        i j8 = l0Var.j(this);
        this._parentHandle = j8;
        if (!(C() instanceof h0)) {
            j8.g();
            this._parentHandle = u0Var;
        }
    }

    public boolean G() {
        return false;
    }

    public final Object H(Object obj) {
        Object P;
        o oVar;
        do {
            P = P(C(), obj);
            if (P == androidx.databinding.a.f1001d0) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof o) {
                    oVar = (o) obj;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    th = oVar.f5034a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (P == androidx.databinding.a.f1003f0);
        return P;
    }

    public String I() {
        return getClass().getSimpleName();
    }

    public final void K(t0 t0Var, Throwable th) {
        h hVar;
        h hVar2 = null;
        for (e eVar = (e) t0Var.f(); !g.a(eVar, t0Var); eVar = eVar.h()) {
            if (eVar instanceof n0) {
                p0 p0Var = (p0) eVar;
                try {
                    p0Var.q(th);
                } catch (Throwable th2) {
                    if (hVar2 == null) {
                        hVar = null;
                    } else {
                        u.b(hVar2, th2);
                        hVar = hVar2;
                    }
                    if (hVar == null) {
                        hVar2 = new h("Exception in completion handler " + p0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (hVar2 != null) {
            E(hVar2);
        }
        p(th);
    }

    public void L(Object obj) {
    }

    public void M() {
    }

    public final void N(p0 p0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z;
        t0 t0Var = new t0();
        p0Var.getClass();
        e.f6780p.lazySet(t0Var, p0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e.f6779o;
        atomicReferenceFieldUpdater2.lazySet(t0Var, p0Var);
        while (true) {
            if (p0Var.f() == p0Var) {
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(p0Var, p0Var, t0Var)) {
                        if (atomicReferenceFieldUpdater2.get(p0Var) != p0Var) {
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
                if (z) {
                    t0Var.e(p0Var);
                    break;
                }
            } else {
                break;
            }
        }
        e h10 = p0Var.h();
        do {
            atomicReferenceFieldUpdater = f5039o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, p0Var, h10) || atomicReferenceFieldUpdater.get(this) != p0Var) {
            }
            atomicReferenceFieldUpdater = f5039o;
            return;
        } while (atomicReferenceFieldUpdater.get(this) != p0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00af, code lost:
        if (r5 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b2, code lost:
        K(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00b7, code lost:
        if ((r8 instanceof g9.j) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00b9, code lost:
        r0 = (g9.j) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00bd, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00be, code lost:
        if (r0 != null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00c0, code lost:
        r8 = r8.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00c4, code lost:
        if (r8 != null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00c7, code lost:
        r4 = J(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00cc, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00cd, code lost:
        if (r4 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00d3, code lost:
        if (Q(r3, r4, r9) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return x(r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return androidx.databinding.a.f1002e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object P(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof g9.h0
            if (r0 != 0) goto L_0x0007
            d7.j0 r8 = androidx.databinding.a.f1001d0
            return r8
        L_0x0007:
            boolean r0 = r8 instanceof g9.b0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r8 instanceof g9.p0
            if (r0 == 0) goto L_0x004c
        L_0x0011:
            boolean r0 = r8 instanceof g9.j
            if (r0 != 0) goto L_0x004c
            boolean r0 = r9 instanceof g9.o
            if (r0 != 0) goto L_0x004c
            r0 = r8
            g9.h0 r0 = (g9.h0) r0
            boolean r8 = r9 instanceof g9.h0
            if (r8 == 0) goto L_0x002a
            g9.i0 r8 = new g9.i0
            r3 = r9
            g9.h0 r3 = (g9.h0) r3
            r8.<init>(r3)
            r3 = r8
            goto L_0x002b
        L_0x002a:
            r3 = r9
        L_0x002b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f5039o
            boolean r4 = r8.compareAndSet(r7, r0, r3)
            if (r4 == 0) goto L_0x0035
            r8 = r1
            goto L_0x003c
        L_0x0035:
            java.lang.Object r8 = r8.get(r7)
            if (r8 == r0) goto L_0x002b
            r8 = r2
        L_0x003c:
            if (r8 != 0) goto L_0x0040
            r1 = r2
            goto L_0x0046
        L_0x0040:
            r7.L(r9)
            r7.v(r0, r9)
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return r9
        L_0x0049:
            d7.j0 r8 = androidx.databinding.a.f1003f0
            return r8
        L_0x004c:
            g9.h0 r8 = (g9.h0) r8
            g9.t0 r0 = r7.A(r8)
            if (r0 != 0) goto L_0x0058
            d7.j0 r8 = androidx.databinding.a.f1003f0
            goto L_0x00dc
        L_0x0058:
            boolean r3 = r8 instanceof g9.q0.b
            r4 = 0
            if (r3 == 0) goto L_0x0061
            r3 = r8
            g9.q0$b r3 = (g9.q0.b) r3
            goto L_0x0062
        L_0x0061:
            r3 = r4
        L_0x0062:
            if (r3 != 0) goto L_0x0069
            g9.q0$b r3 = new g9.q0$b
            r3.<init>(r0, r4)
        L_0x0069:
            monitor-enter(r3)
            boolean r5 = r3.f()     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x0073
            d7.j0 r8 = androidx.databinding.a.f1001d0     // Catch:{ all -> 0x00dd }
            goto L_0x008c
        L_0x0073:
            r3.i()     // Catch:{ all -> 0x00dd }
            if (r3 == r8) goto L_0x008e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f5039o     // Catch:{ all -> 0x00dd }
        L_0x007a:
            boolean r6 = r5.compareAndSet(r7, r8, r3)     // Catch:{ all -> 0x00dd }
            if (r6 == 0) goto L_0x0082
            r2 = r1
            goto L_0x0088
        L_0x0082:
            java.lang.Object r6 = r5.get(r7)     // Catch:{ all -> 0x00dd }
            if (r6 == r8) goto L_0x007a
        L_0x0088:
            if (r2 != 0) goto L_0x008e
            d7.j0 r8 = androidx.databinding.a.f1003f0     // Catch:{ all -> 0x00dd }
        L_0x008c:
            monitor-exit(r3)
            goto L_0x00dc
        L_0x008e:
            boolean r2 = r3.e()     // Catch:{ all -> 0x00dd }
            boolean r5 = r9 instanceof g9.o     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x009a
            r5 = r9
            g9.o r5 = (g9.o) r5     // Catch:{ all -> 0x00dd }
            goto L_0x009b
        L_0x009a:
            r5 = r4
        L_0x009b:
            if (r5 != 0) goto L_0x009e
            goto L_0x00a3
        L_0x009e:
            java.lang.Throwable r5 = r5.f5034a     // Catch:{ all -> 0x00dd }
            r3.c(r5)     // Catch:{ all -> 0x00dd }
        L_0x00a3:
            java.lang.Throwable r5 = r3.d()     // Catch:{ all -> 0x00dd }
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r5 = r4
        L_0x00ac:
            n8.i r1 = n8.i.f7501a     // Catch:{ all -> 0x00dd }
            monitor-exit(r3)
            if (r5 != 0) goto L_0x00b2
            goto L_0x00b5
        L_0x00b2:
            r7.K(r0, r5)
        L_0x00b5:
            boolean r0 = r8 instanceof g9.j
            if (r0 == 0) goto L_0x00bd
            r0 = r8
            g9.j r0 = (g9.j) r0
            goto L_0x00be
        L_0x00bd:
            r0 = r4
        L_0x00be:
            if (r0 != 0) goto L_0x00cc
            g9.t0 r8 = r8.b()
            if (r8 != 0) goto L_0x00c7
            goto L_0x00cd
        L_0x00c7:
            g9.j r4 = J(r8)
            goto L_0x00cd
        L_0x00cc:
            r4 = r0
        L_0x00cd:
            if (r4 == 0) goto L_0x00d8
            boolean r8 = r7.Q(r3, r4, r9)
            if (r8 == 0) goto L_0x00d8
            d7.j0 r8 = androidx.databinding.a.f1002e0
            goto L_0x00dc
        L_0x00d8:
            java.lang.Object r8 = r7.x(r3, r9)
        L_0x00dc:
            return r8
        L_0x00dd:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.q0.P(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final boolean Q(b bVar, j jVar, Object obj) {
        do {
            if (l0.a.a(jVar.f5021s, false, new a(this, bVar, jVar, obj), 1) != u0.f5050o) {
                return true;
            }
            jVar = J(jVar);
        } while (jVar != null);
        return false;
    }

    public boolean a() {
        Object C = C();
        return (C instanceof h0) && ((h0) C).a();
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [g9.g0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g9.a0 f(boolean r8, boolean r9, g9.p0 r10) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0014
            boolean r1 = r10 instanceof g9.n0
            if (r1 == 0) goto L_0x000b
            r1 = r10
            g9.n0 r1 = (g9.n0) r1
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            if (r1 != 0) goto L_0x0015
            g9.k0 r1 = new g9.k0
            r1.<init>(r10)
            goto L_0x0015
        L_0x0014:
            r1 = r10
        L_0x0015:
            r1.f5038r = r7
        L_0x0017:
            java.lang.Object r2 = r7.C()
            boolean r3 = r2 instanceof g9.b0
            if (r3 == 0) goto L_0x005a
            r3 = r2
            g9.b0 r3 = (g9.b0) r3
            boolean r4 = r3.f4998o
            if (r4 == 0) goto L_0x003a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f5039o
        L_0x0028:
            boolean r3 = r4.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L_0x0030
            r2 = 1
            goto L_0x0037
        L_0x0030:
            java.lang.Object r3 = r4.get(r7)
            if (r3 == r2) goto L_0x0028
            r2 = 0
        L_0x0037:
            if (r2 == 0) goto L_0x0017
            return r1
        L_0x003a:
            g9.t0 r2 = new g9.t0
            r2.<init>()
            boolean r4 = r3.f4998o
            if (r4 == 0) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            g9.g0 r4 = new g9.g0
            r4.<init>(r2)
            r2 = r4
        L_0x004a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f5039o
            boolean r5 = r4.compareAndSet(r7, r3, r2)
            if (r5 == 0) goto L_0x0053
            goto L_0x0017
        L_0x0053:
            java.lang.Object r4 = r4.get(r7)
            if (r4 == r3) goto L_0x004a
            goto L_0x0017
        L_0x005a:
            boolean r3 = r2 instanceof g9.h0
            if (r3 == 0) goto L_0x00bb
            r3 = r2
            g9.h0 r3 = (g9.h0) r3
            g9.t0 r3 = r3.b()
            if (r3 != 0) goto L_0x0077
            if (r2 == 0) goto L_0x006f
            g9.p0 r2 = (g9.p0) r2
            r7.N(r2)
            goto L_0x0017
        L_0x006f:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            r8.<init>(r9)
            throw r8
        L_0x0077:
            g9.u0 r4 = g9.u0.f5050o
            if (r8 == 0) goto L_0x00ab
            boolean r5 = r2 instanceof g9.q0.b
            if (r5 == 0) goto L_0x00ab
            monitor-enter(r2)
            r5 = r2
            g9.q0$b r5 = (g9.q0.b) r5     // Catch:{ all -> 0x00a8 }
            java.lang.Throwable r5 = r5.d()     // Catch:{ all -> 0x00a8 }
            if (r5 == 0) goto L_0x0096
            boolean r6 = r10 instanceof g9.j     // Catch:{ all -> 0x00a8 }
            if (r6 == 0) goto L_0x00a4
            r6 = r2
            g9.q0$b r6 = (g9.q0.b) r6     // Catch:{ all -> 0x00a8 }
            boolean r6 = r6.f()     // Catch:{ all -> 0x00a8 }
            if (r6 != 0) goto L_0x00a4
        L_0x0096:
            boolean r4 = r7.i(r2, r3, r1)     // Catch:{ all -> 0x00a8 }
            if (r4 != 0) goto L_0x009f
            monitor-exit(r2)
            goto L_0x0017
        L_0x009f:
            if (r5 != 0) goto L_0x00a3
            monitor-exit(r2)
            return r1
        L_0x00a3:
            r4 = r1
        L_0x00a4:
            n8.i r6 = n8.i.f7501a     // Catch:{ all -> 0x00a8 }
            monitor-exit(r2)
            goto L_0x00ac
        L_0x00a8:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x00ab:
            r5 = r0
        L_0x00ac:
            if (r5 == 0) goto L_0x00b4
            if (r9 == 0) goto L_0x00b3
            r10.k(r5)
        L_0x00b3:
            return r4
        L_0x00b4:
            boolean r2 = r7.i(r2, r3, r1)
            if (r2 == 0) goto L_0x0017
            return r1
        L_0x00bb:
            if (r9 == 0) goto L_0x00cd
            boolean r8 = r2 instanceof g9.o
            if (r8 == 0) goto L_0x00c4
            g9.o r2 = (g9.o) r2
            goto L_0x00c5
        L_0x00c4:
            r2 = r0
        L_0x00c5:
            if (r2 != 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            java.lang.Throwable r0 = r2.f5034a
        L_0x00ca:
            r10.k(r0)
        L_0x00cd:
            g9.u0 r8 = g9.u0.f5050o
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.q0.f(boolean, boolean, g9.p0):g9.a0");
    }

    public final <R> R fold(R r5, p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.i(r5, this);
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        return f.b.a.a(this, cVar);
    }

    public final f.c<?> getKey() {
        return l0.b.f5025o;
    }

    public final boolean i(Object obj, t0 t0Var, p0 p0Var) {
        boolean z;
        boolean z10;
        c cVar = new c(p0Var, this, obj);
        do {
            e m10 = t0Var.m();
            e.f6780p.lazySet(p0Var, m10);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f6779o;
            atomicReferenceFieldUpdater.lazySet(p0Var, t0Var);
            cVar.f6783c = t0Var;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(m10, t0Var, cVar)) {
                    if (atomicReferenceFieldUpdater.get(m10) != t0Var) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                z10 = false;
            } else if (cVar.a(m10) == null) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        } while (!z10);
        return false;
    }

    public final i j(q0 q0Var) {
        return (i) l0.a.a(this, true, new j(q0Var), 2);
    }

    public void k(Object obj) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c2, code lost:
        r10 = androidx.databinding.a.f1001d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ec, code lost:
        r0 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00c2 A[EDGE_INSN: B:85:0x00c2->B:63:0x00c2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(java.lang.Object r10) {
        /*
            r9 = this;
            d7.j0 r0 = androidx.databinding.a.f1001d0
            boolean r1 = r9.z()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0039
        L_0x000a:
            java.lang.Object r0 = r9.C()
            boolean r1 = r0 instanceof g9.h0
            if (r1 == 0) goto L_0x0032
            boolean r1 = r0 instanceof g9.q0.b
            if (r1 == 0) goto L_0x0020
            r1 = r0
            g9.q0$b r1 = (g9.q0.b) r1
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x0020
            goto L_0x0032
        L_0x0020:
            g9.o r1 = new g9.o
            java.lang.Throwable r4 = r9.w(r10)
            r1.<init>(r4, r2)
            java.lang.Object r0 = r9.P(r0, r1)
            d7.j0 r1 = androidx.databinding.a.f1003f0
            if (r0 == r1) goto L_0x000a
            goto L_0x0034
        L_0x0032:
            d7.j0 r0 = androidx.databinding.a.f1001d0
        L_0x0034:
            d7.j0 r1 = androidx.databinding.a.f1002e0
            if (r0 != r1) goto L_0x0039
            return r3
        L_0x0039:
            d7.j0 r1 = androidx.databinding.a.f1001d0
            if (r0 != r1) goto L_0x00ed
            r0 = 0
            r1 = r0
        L_0x003f:
            java.lang.Object r4 = r9.C()
            boolean r5 = r4 instanceof g9.q0.b
            if (r5 == 0) goto L_0x0088
            monitor-enter(r4)
            r5 = r4
            g9.q0$b r5 = (g9.q0.b) r5     // Catch:{ all -> 0x0085 }
            boolean r5 = r5.g()     // Catch:{ all -> 0x0085 }
            if (r5 == 0) goto L_0x0056
            d7.j0 r10 = androidx.databinding.a.f1004g0     // Catch:{ all -> 0x0085 }
            monitor-exit(r4)
            goto L_0x00ec
        L_0x0056:
            r5 = r4
            g9.q0$b r5 = (g9.q0.b) r5     // Catch:{ all -> 0x0085 }
            boolean r5 = r5.e()     // Catch:{ all -> 0x0085 }
            if (r10 != 0) goto L_0x0061
            if (r5 != 0) goto L_0x006d
        L_0x0061:
            if (r1 != 0) goto L_0x0067
            java.lang.Throwable r1 = r9.w(r10)     // Catch:{ all -> 0x0085 }
        L_0x0067:
            r10 = r4
            g9.q0$b r10 = (g9.q0.b) r10     // Catch:{ all -> 0x0085 }
            r10.c(r1)     // Catch:{ all -> 0x0085 }
        L_0x006d:
            r10 = r4
            g9.q0$b r10 = (g9.q0.b) r10     // Catch:{ all -> 0x0085 }
            java.lang.Throwable r10 = r10.d()     // Catch:{ all -> 0x0085 }
            r1 = r5 ^ 1
            if (r1 == 0) goto L_0x0079
            r0 = r10
        L_0x0079:
            monitor-exit(r4)
            if (r0 != 0) goto L_0x007d
            goto L_0x00c2
        L_0x007d:
            g9.q0$b r4 = (g9.q0.b) r4
            g9.t0 r10 = r4.f5043o
            r9.K(r10, r0)
            goto L_0x00c2
        L_0x0085:
            r10 = move-exception
            monitor-exit(r4)
            throw r10
        L_0x0088:
            boolean r5 = r4 instanceof g9.h0
            if (r5 == 0) goto L_0x00ea
            if (r1 != 0) goto L_0x0092
            java.lang.Throwable r1 = r9.w(r10)
        L_0x0092:
            r5 = r4
            g9.h0 r5 = (g9.h0) r5
            boolean r6 = r5.a()
            if (r6 == 0) goto L_0x00c5
            g9.t0 r6 = r9.A(r5)
            if (r6 != 0) goto L_0x00a2
            goto L_0x00ba
        L_0x00a2:
            g9.q0$b r7 = new g9.q0$b
            r7.<init>(r6, r1)
        L_0x00a7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f5039o
            boolean r8 = r4.compareAndSet(r9, r5, r7)
            if (r8 == 0) goto L_0x00b1
            r4 = r3
            goto L_0x00b8
        L_0x00b1:
            java.lang.Object r4 = r4.get(r9)
            if (r4 == r5) goto L_0x00a7
            r4 = r2
        L_0x00b8:
            if (r4 != 0) goto L_0x00bc
        L_0x00ba:
            r4 = r2
            goto L_0x00c0
        L_0x00bc:
            r9.K(r6, r1)
            r4 = r3
        L_0x00c0:
            if (r4 == 0) goto L_0x003f
        L_0x00c2:
            d7.j0 r10 = androidx.databinding.a.f1001d0
            goto L_0x00ec
        L_0x00c5:
            g9.o r5 = new g9.o
            r5.<init>(r1, r2)
            java.lang.Object r5 = r9.P(r4, r5)
            d7.j0 r6 = androidx.databinding.a.f1001d0
            if (r5 == r6) goto L_0x00da
            d7.j0 r4 = androidx.databinding.a.f1003f0
            if (r5 != r4) goto L_0x00d8
            goto L_0x003f
        L_0x00d8:
            r0 = r5
            goto L_0x00ed
        L_0x00da:
            java.lang.String r10 = "Cannot happen in "
            java.lang.String r10 = z8.g.k(r4, r10)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        L_0x00ea:
            d7.j0 r10 = androidx.databinding.a.f1004g0
        L_0x00ec:
            r0 = r10
        L_0x00ed:
            d7.j0 r10 = androidx.databinding.a.f1001d0
            if (r0 != r10) goto L_0x00f2
            goto L_0x00ff
        L_0x00f2:
            d7.j0 r10 = androidx.databinding.a.f1002e0
            if (r0 != r10) goto L_0x00f7
            goto L_0x00ff
        L_0x00f7:
            d7.j0 r10 = androidx.databinding.a.f1004g0
            if (r0 != r10) goto L_0x00fc
            goto L_0x0100
        L_0x00fc:
            r9.k(r0)
        L_0x00ff:
            r2 = r3
        L_0x0100:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.q0.m(java.lang.Object):boolean");
    }

    public final f minusKey(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    public final CancellationException n() {
        Throwable th;
        Object C = C();
        CancellationException cancellationException = null;
        if (C instanceof b) {
            th = ((b) C).d();
        } else if (C instanceof o) {
            th = ((o) C).f5034a;
        } else if (!(C instanceof h0)) {
            th = null;
        } else {
            throw new IllegalStateException(g.k(C, "Cannot be cancelling child in this state: ").toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new m0(g.k(O(C), "Parent job is "), th, this) : cancellationException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.concurrent.CancellationException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.CancellationException o() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.C()
            boolean r1 = r0 instanceof g9.q0.b
            r2 = 0
            java.lang.String r3 = "Job is still new or active: "
            if (r1 == 0) goto L_0x0044
            g9.q0$b r0 = (g9.q0.b) r0
            java.lang.Throwable r0 = r0.d()
            if (r0 == 0) goto L_0x0036
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " is cancelling"
            java.lang.String r1 = z8.g.k(r3, r1)
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L_0x0028
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x0028:
            if (r2 != 0) goto L_0x0078
            g9.m0 r2 = new g9.m0
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = r4.q()
        L_0x0032:
            r2.<init>(r1, r0, r4)
            goto L_0x0078
        L_0x0036:
            java.lang.String r0 = z8.g.k(r4, r3)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0044:
            boolean r1 = r0 instanceof g9.h0
            if (r1 != 0) goto L_0x0079
            boolean r1 = r0 instanceof g9.o
            if (r1 == 0) goto L_0x0064
            g9.o r0 = (g9.o) r0
            java.lang.Throwable r0 = r0.f5034a
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L_0x0057
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x0057:
            if (r2 != 0) goto L_0x0078
            g9.m0 r1 = new g9.m0
            java.lang.String r2 = r4.q()
            r1.<init>(r2, r0, r4)
            r2 = r1
            goto L_0x0078
        L_0x0064:
            g9.m0 r0 = new g9.m0
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " has completed normally"
            java.lang.String r1 = z8.g.k(r3, r1)
            r0.<init>(r1, r2, r4)
            r2 = r0
        L_0x0078:
            return r2
        L_0x0079:
            java.lang.String r0 = z8.g.k(r4, r3)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.q0.o():java.util.concurrent.CancellationException");
    }

    public final boolean p(Throwable th) {
        if (G()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        i iVar = (i) this._parentHandle;
        if (iVar == null || iVar == u0.f5050o) {
            return z;
        }
        if (iVar.l(th) || z) {
            return true;
        }
        return false;
    }

    public final f plus(f fVar) {
        g.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    public String q() {
        return "Job was cancelled";
    }

    public final void r(q0 q0Var) {
        m(q0Var);
    }

    public final void s(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new m0(q(), (Throwable) null, this);
        }
        m(cancellationException);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r0 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r0 == false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c A[ADDED_TO_REGION, LOOP:0: B:0:0x0000->B:25:0x004c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0050 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean start() {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7.C()
            boolean r1 = r0 instanceof g9.b0
            r2 = 0
            r3 = 1
            r4 = -1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f5039o
            if (r1 == 0) goto L_0x0029
            r1 = r0
            g9.b0 r1 = (g9.b0) r1
            boolean r1 = r1.f4998o
            if (r1 == 0) goto L_0x0015
            goto L_0x0049
        L_0x0015:
            g9.b0 r1 = androidx.databinding.a.f1007j0
        L_0x0017:
            boolean r6 = r5.compareAndSet(r7, r0, r1)
            if (r6 == 0) goto L_0x001f
            r0 = r3
            goto L_0x0026
        L_0x001f:
            java.lang.Object r6 = r5.get(r7)
            if (r6 == r0) goto L_0x0017
            r0 = r2
        L_0x0026:
            if (r0 != 0) goto L_0x0044
            goto L_0x004a
        L_0x0029:
            boolean r1 = r0 instanceof g9.g0
            if (r1 == 0) goto L_0x0049
            r1 = r0
            g9.g0 r1 = (g9.g0) r1
            g9.t0 r1 = r1.f5018o
        L_0x0032:
            boolean r6 = r5.compareAndSet(r7, r0, r1)
            if (r6 == 0) goto L_0x003a
            r0 = r3
            goto L_0x0041
        L_0x003a:
            java.lang.Object r6 = r5.get(r7)
            if (r6 == r0) goto L_0x0032
            r0 = r2
        L_0x0041:
            if (r0 != 0) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            r7.M()
            r4 = r3
            goto L_0x004a
        L_0x0049:
            r4 = r2
        L_0x004a:
            if (r4 == 0) goto L_0x0050
            if (r4 == r3) goto L_0x004f
            goto L_0x0000
        L_0x004f:
            return r3
        L_0x0050:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.q0.start():boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(I() + '{' + O(C()) + '}');
        sb.append('@');
        sb.append(n.e.x(this));
        return sb.toString();
    }

    public boolean u(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m(th) && y();
    }

    public final void v(h0 h0Var, Object obj) {
        o oVar;
        Throwable th;
        h hVar;
        i iVar = (i) this._parentHandle;
        if (iVar != null) {
            iVar.g();
            this._parentHandle = u0.f5050o;
        }
        if (obj instanceof o) {
            oVar = (o) obj;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            th = null;
        } else {
            th = oVar.f5034a;
        }
        if (h0Var instanceof p0) {
            try {
                ((p0) h0Var).q(th);
            } catch (Throwable th2) {
                E(new h("Exception in completion handler " + h0Var + " for " + this, th2));
            }
        } else {
            t0 b10 = h0Var.b();
            if (b10 != null) {
                h hVar2 = null;
                for (e eVar = (e) b10.f(); !g.a(eVar, b10); eVar = eVar.h()) {
                    if (eVar instanceof p0) {
                        p0 p0Var = (p0) eVar;
                        try {
                            p0Var.q(th);
                        } catch (Throwable th3) {
                            if (hVar2 == null) {
                                hVar = null;
                            } else {
                                u.b(hVar2, th3);
                                hVar = hVar2;
                            }
                            if (hVar == null) {
                                hVar2 = new h("Exception in completion handler " + p0Var + " for " + this, th3);
                            }
                        }
                    }
                }
                if (hVar2 != null) {
                    E(hVar2);
                }
            }
        }
    }

    public final Throwable w(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        if (z) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new m0(q(), (Throwable) null, this);
            }
            return th;
        } else if (obj != null) {
            return ((w0) obj).n();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d1 A[LOOP:2: B:59:0x00d1->B:62:0x00dc, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(g9.q0.b r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof g9.o
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r10
            g9.o r0 = (g9.o) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 != 0) goto L_0x000e
            r0 = r1
            goto L_0x0010
        L_0x000e:
            java.lang.Throwable r0 = r0.f5034a
        L_0x0010:
            monitor-enter(r9)
            r9.e()     // Catch:{ all -> 0x00e2 }
            java.util.ArrayList r2 = r9.h(r0)     // Catch:{ all -> 0x00e2 }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x00e2 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0031
            boolean r3 = r9.e()     // Catch:{ all -> 0x00e2 }
            if (r3 == 0) goto L_0x0053
            g9.m0 r3 = new g9.m0     // Catch:{ all -> 0x00e2 }
            java.lang.String r6 = r8.q()     // Catch:{ all -> 0x00e2 }
            r3.<init>(r6, r1, r8)     // Catch:{ all -> 0x00e2 }
            r1 = r3
            goto L_0x0053
        L_0x0031:
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x00e2 }
        L_0x0035:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x00e2 }
            if (r6 == 0) goto L_0x0048
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x00e2 }
            r7 = r6
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ all -> 0x00e2 }
            boolean r7 = r7 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00e2 }
            r7 = r7 ^ r4
            if (r7 == 0) goto L_0x0035
            r1 = r6
        L_0x0048:
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x004d
            goto L_0x0053
        L_0x004d:
            java.lang.Object r1 = r2.get(r5)     // Catch:{ all -> 0x00e2 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x00e2 }
        L_0x0053:
            if (r1 == 0) goto L_0x008b
            int r3 = r2.size()     // Catch:{ all -> 0x00e2 }
            if (r3 > r4) goto L_0x005c
            goto L_0x008b
        L_0x005c:
            int r3 = r2.size()     // Catch:{ all -> 0x00e2 }
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap     // Catch:{ all -> 0x00e2 }
            r6.<init>(r3)     // Catch:{ all -> 0x00e2 }
            java.util.Set r3 = java.util.Collections.newSetFromMap(r6)     // Catch:{ all -> 0x00e2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00e2 }
        L_0x006d:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x00e2 }
            if (r6 == 0) goto L_0x008b
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x00e2 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x00e2 }
            if (r6 == r1) goto L_0x006d
            if (r6 == r1) goto L_0x006d
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00e2 }
            if (r7 != 0) goto L_0x006d
            boolean r7 = r3.add(r6)     // Catch:{ all -> 0x00e2 }
            if (r7 == 0) goto L_0x006d
            p9.u.b(r1, r6)     // Catch:{ all -> 0x00e2 }
            goto L_0x006d
        L_0x008b:
            monitor-exit(r9)
            if (r1 != 0) goto L_0x008f
            goto L_0x0097
        L_0x008f:
            if (r1 != r0) goto L_0x0092
            goto L_0x0097
        L_0x0092:
            g9.o r10 = new g9.o
            r10.<init>(r1, r5)
        L_0x0097:
            if (r1 == 0) goto L_0x00be
            boolean r0 = r8.p(r1)
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r8.D(r1)
            if (r0 == 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r0 = r5
            goto L_0x00a9
        L_0x00a8:
            r0 = r4
        L_0x00a9:
            if (r0 == 0) goto L_0x00be
            if (r10 == 0) goto L_0x00b6
            r0 = r10
            g9.o r0 = (g9.o) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = g9.o.f5033b
            r1.compareAndSet(r0, r5, r4)
            goto L_0x00be
        L_0x00b6:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            r9.<init>(r10)
            throw r9
        L_0x00be:
            r8.L(r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f5039o
            boolean r1 = r10 instanceof g9.h0
            if (r1 == 0) goto L_0x00d0
            g9.i0 r1 = new g9.i0
            r2 = r10
            g9.h0 r2 = (g9.h0) r2
            r1.<init>(r2)
            goto L_0x00d1
        L_0x00d0:
            r1 = r10
        L_0x00d1:
            boolean r2 = r0.compareAndSet(r8, r9, r1)
            if (r2 == 0) goto L_0x00d8
            goto L_0x00de
        L_0x00d8:
            java.lang.Object r2 = r0.get(r8)
            if (r2 == r9) goto L_0x00d1
        L_0x00de:
            r8.v(r9, r10)
            return r10
        L_0x00e2:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.q0.x(g9.q0$b, java.lang.Object):java.lang.Object");
    }

    public boolean y() {
        return true;
    }

    public boolean z() {
        return false;
    }
}
