package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.n;
import androidx.fragment.app.p0;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final x f1143a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f1144b;

    /* renamed from: c  reason: collision with root package name */
    public final n f1145c;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f1146e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ View f1147o;

        public a(View view) {
            this.f1147o = view;
        }

        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f1147o;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.h.c(view2);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1148a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.h$c[] r0 = androidx.lifecycle.h.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1148a = r0
                androidx.lifecycle.h$c r1 = androidx.lifecycle.h.c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1148a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.h$c r1 = androidx.lifecycle.h.c.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1148a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.h$c r1 = androidx.lifecycle.h.c.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1148a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.h$c r1 = androidx.lifecycle.h.c.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e0.b.<clinit>():void");
        }
    }

    public e0(x xVar, f0 f0Var, n nVar) {
        this.f1143a = xVar;
        this.f1144b = f0Var;
        this.f1145c = nVar;
    }

    public e0(x xVar, f0 f0Var, n nVar, d0 d0Var) {
        this.f1143a = xVar;
        this.f1144b = f0Var;
        this.f1145c = nVar;
        nVar.f1238q = null;
        nVar.f1239r = null;
        nVar.E = 0;
        nVar.B = false;
        nVar.f1244y = false;
        n nVar2 = nVar.u;
        nVar.f1242v = nVar2 != null ? nVar2.f1240s : null;
        nVar.u = null;
        Bundle bundle = d0Var.A;
        nVar.f1237p = bundle == null ? new Bundle() : bundle;
    }

    public e0(x xVar, f0 f0Var, ClassLoader classLoader, u uVar, d0 d0Var) {
        this.f1143a = xVar;
        this.f1144b = f0Var;
        n a10 = uVar.a(d0Var.f1130o);
        this.f1145c = a10;
        Bundle bundle = d0Var.f1137x;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.U(bundle);
        a10.f1240s = d0Var.f1131p;
        a10.A = d0Var.f1132q;
        a10.C = true;
        a10.J = d0Var.f1133r;
        a10.K = d0Var.f1134s;
        a10.L = d0Var.f1135t;
        a10.O = d0Var.u;
        a10.z = d0Var.f1136v;
        a10.N = d0Var.w;
        a10.M = d0Var.f1138y;
        a10.Z = h.c.values()[d0Var.z];
        Bundle bundle2 = d0Var.A;
        a10.f1237p = bundle2 == null ? new Bundle() : bundle2;
        if (y.I(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public final void a() {
        boolean I = y.I(3);
        n nVar = this.f1145c;
        if (I) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + nVar);
        }
        Bundle bundle = nVar.f1237p;
        nVar.H.O();
        nVar.f1236o = 3;
        nVar.Q = true;
        if (y.I(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + nVar);
        }
        View view = nVar.S;
        if (view != null) {
            Bundle bundle2 = nVar.f1237p;
            SparseArray<Parcelable> sparseArray = nVar.f1238q;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                nVar.f1238q = null;
            }
            if (nVar.S != null) {
                n0 n0Var = nVar.f1231b0;
                n0Var.f1261s.a(nVar.f1239r);
                nVar.f1239r = null;
            }
            nVar.Q = false;
            nVar.J(bundle2);
            if (!nVar.Q) {
                throw new r0("Fragment " + nVar + " did not call through to super.onViewStateRestored()");
            } else if (nVar.S != null) {
                nVar.f1231b0.a(h.b.ON_CREATE);
            }
        }
        nVar.f1237p = null;
        z zVar = nVar.H;
        zVar.f1328y = false;
        zVar.z = false;
        zVar.F.f1119h = false;
        zVar.t(4);
        this.f1143a.a(false);
    }

    public final void b() {
        View view;
        View view2;
        f0 f0Var = this.f1144b;
        f0Var.getClass();
        n nVar = this.f1145c;
        ViewGroup viewGroup = nVar.R;
        int i10 = -1;
        if (viewGroup != null) {
            int indexOf = ((ArrayList) f0Var.f1151p).indexOf(nVar);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= ((ArrayList) f0Var.f1151p).size()) {
                            break;
                        }
                        n nVar2 = (n) ((ArrayList) f0Var.f1151p).get(indexOf);
                        if (nVar2.R == viewGroup && (view = nVar2.S) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    n nVar3 = (n) ((ArrayList) f0Var.f1151p).get(i11);
                    if (nVar3.R == viewGroup && (view2 = nVar3.S) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        nVar.R.addView(nVar.S, i10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.e0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.y.I(r0)
            androidx.fragment.app.n r1 = r7.f1145c
            if (r0 == 0) goto L_0x001c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto ATTACHED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L_0x001c:
            androidx.fragment.app.n r0 = r1.u
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            java.lang.String r3 = " declared target fragment "
            r4 = 0
            androidx.fragment.app.f0 r5 = r7.f1144b
            java.lang.String r6 = "Fragment "
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = r0.f1240s
            java.lang.Object r5 = r5.f1152q
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r0 = r5.get(r0)
            androidx.fragment.app.e0 r0 = (androidx.fragment.app.e0) r0
            if (r0 == 0) goto L_0x0041
            androidx.fragment.app.n r2 = r1.u
            java.lang.String r2 = r2.f1240s
            r1.f1242v = r2
            r1.u = r4
            r4 = r0
            goto L_0x0087
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r4.append(r1)
            r4.append(r3)
            androidx.fragment.app.n r1 = r1.u
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x005e:
            java.lang.String r0 = r1.f1242v
            if (r0 == 0) goto L_0x0087
            java.lang.Object r4 = r5.f1152q
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r0 = r4.get(r0)
            r4 = r0
            androidx.fragment.app.e0 r4 = (androidx.fragment.app.e0) r4
            if (r4 == 0) goto L_0x0070
            goto L_0x0087
        L_0x0070:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r1.f1242v
            java.lang.String r1 = b0.d.g(r4, r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x0087:
            if (r4 == 0) goto L_0x008c
            r4.k()
        L_0x008c:
            androidx.fragment.app.y r0 = r1.F
            androidx.fragment.app.v<?> r2 = r0.f1319n
            r1.G = r2
            androidx.fragment.app.n r0 = r0.f1321p
            r1.I = r0
            androidx.fragment.app.x r0 = r7.f1143a
            r2 = 0
            r0.g(r2)
            java.util.ArrayList<androidx.fragment.app.n$d> r3 = r1.f1235f0
            java.util.Iterator r4 = r3.iterator()
        L_0x00a2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b2
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.n$d r5 = (androidx.fragment.app.n.d) r5
            r5.a()
            goto L_0x00a2
        L_0x00b2:
            r3.clear()
            androidx.fragment.app.z r3 = r1.H
            androidx.fragment.app.v<?> r4 = r1.G
            androidx.activity.result.c r5 = r1.f()
            r3.c(r4, r5, r1)
            r1.f1236o = r2
            r1.Q = r2
            androidx.fragment.app.v<?> r3 = r1.G
            android.content.Context r3 = r3.f1300p
            r1.u(r3)
            boolean r3 = r1.Q
            if (r3 == 0) goto L_0x00f8
            androidx.fragment.app.y r3 = r1.F
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.c0> r3 = r3.l
            java.util.Iterator r3 = r3.iterator()
        L_0x00d7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00e7
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.c0 r4 = (androidx.fragment.app.c0) r4
            r4.g(r1)
            goto L_0x00d7
        L_0x00e7:
            androidx.fragment.app.z r1 = r1.H
            r1.f1328y = r2
            r1.z = r2
            androidx.fragment.app.b0 r3 = r1.F
            r3.f1119h = r2
            r1.t(r2)
            r0.b(r2)
            return
        L_0x00f8:
            androidx.fragment.app.r0 r0 = new androidx.fragment.app.r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r2.append(r1)
            java.lang.String r1 = " did not call through to super.onAttach()"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e0.c():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: androidx.fragment.app.p0$e$b} */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r10v4, types: [androidx.fragment.app.p0$e$b] */
    /* JADX WARNING: type inference failed for: r11v5, types: [androidx.fragment.app.p0$e$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d() {
        /*
            r14 = this;
            androidx.fragment.app.n r0 = r14.f1145c
            androidx.fragment.app.y r1 = r0.F
            if (r1 != 0) goto L_0x0009
            int r0 = r0.f1236o
            return r0
        L_0x0009:
            int r1 = r14.f1146e
            int[] r2 = androidx.fragment.app.e0.b.f1148a
            androidx.lifecycle.h$c r3 = r0.Z
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 0
            r4 = 1
            r5 = -1
            r6 = 5
            r7 = 3
            r8 = 4
            r9 = 2
            if (r2 == r4) goto L_0x0037
            if (r2 == r9) goto L_0x0033
            if (r2 == r7) goto L_0x002e
            if (r2 == r8) goto L_0x0029
            int r1 = java.lang.Math.min(r1, r5)
            goto L_0x0037
        L_0x0029:
            int r1 = java.lang.Math.min(r1, r3)
            goto L_0x0037
        L_0x002e:
            int r1 = java.lang.Math.min(r1, r4)
            goto L_0x0037
        L_0x0033:
            int r1 = java.lang.Math.min(r1, r6)
        L_0x0037:
            boolean r2 = r0.A
            if (r2 == 0) goto L_0x0063
            boolean r2 = r0.B
            if (r2 == 0) goto L_0x0054
            int r1 = r14.f1146e
            int r1 = java.lang.Math.max(r1, r9)
            android.view.View r2 = r0.S
            if (r2 == 0) goto L_0x0063
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != 0) goto L_0x0063
            int r1 = java.lang.Math.min(r1, r9)
            goto L_0x0063
        L_0x0054:
            int r2 = r14.f1146e
            if (r2 >= r8) goto L_0x005f
            int r2 = r0.f1236o
            int r1 = java.lang.Math.min(r1, r2)
            goto L_0x0063
        L_0x005f:
            int r1 = java.lang.Math.min(r1, r4)
        L_0x0063:
            boolean r2 = r0.f1244y
            if (r2 != 0) goto L_0x006b
            int r1 = java.lang.Math.min(r1, r4)
        L_0x006b:
            android.view.ViewGroup r2 = r0.R
            r10 = 0
            if (r2 == 0) goto L_0x00b4
            androidx.fragment.app.y r11 = r0.m()
            androidx.fragment.app.q0 r11 = r11.G()
            androidx.fragment.app.p0 r2 = androidx.fragment.app.p0.f(r2, r11)
            r2.getClass()
            androidx.fragment.app.p0$e r11 = r2.d(r0)
            if (r11 == 0) goto L_0x0088
            androidx.fragment.app.p0$e$b r11 = r11.f1278b
            goto L_0x0089
        L_0x0088:
            r11 = r10
        L_0x0089:
            java.util.ArrayList<androidx.fragment.app.p0$e> r2 = r2.f1268c
            java.util.Iterator r2 = r2.iterator()
        L_0x008f:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x00a8
            java.lang.Object r12 = r2.next()
            androidx.fragment.app.p0$e r12 = (androidx.fragment.app.p0.e) r12
            androidx.fragment.app.n r13 = r12.f1279c
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r12.f1281f
            if (r13 != 0) goto L_0x008f
            r10 = r12
        L_0x00a8:
            if (r10 == 0) goto L_0x00b3
            if (r11 == 0) goto L_0x00b0
            androidx.fragment.app.p0$e$b r2 = androidx.fragment.app.p0.e.b.NONE
            if (r11 != r2) goto L_0x00b3
        L_0x00b0:
            androidx.fragment.app.p0$e$b r10 = r10.f1278b
            goto L_0x00b4
        L_0x00b3:
            r10 = r11
        L_0x00b4:
            androidx.fragment.app.p0$e$b r2 = androidx.fragment.app.p0.e.b.ADDING
            if (r10 != r2) goto L_0x00be
            r2 = 6
            int r1 = java.lang.Math.min(r1, r2)
            goto L_0x00db
        L_0x00be:
            androidx.fragment.app.p0$e$b r2 = androidx.fragment.app.p0.e.b.REMOVING
            if (r10 != r2) goto L_0x00c7
            int r1 = java.lang.Math.max(r1, r7)
            goto L_0x00db
        L_0x00c7:
            boolean r2 = r0.z
            if (r2 == 0) goto L_0x00db
            int r2 = r0.E
            if (r2 <= 0) goto L_0x00d0
            r3 = r4
        L_0x00d0:
            if (r3 == 0) goto L_0x00d7
            int r1 = java.lang.Math.min(r1, r4)
            goto L_0x00db
        L_0x00d7:
            int r1 = java.lang.Math.min(r1, r5)
        L_0x00db:
            boolean r2 = r0.T
            if (r2 == 0) goto L_0x00e7
            int r2 = r0.f1236o
            if (r2 >= r6) goto L_0x00e7
            int r1 = java.lang.Math.min(r1, r8)
        L_0x00e7:
            boolean r2 = androidx.fragment.app.y.I(r9)
            if (r2 == 0) goto L_0x0108
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "computeExpectedState() of "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r3 = " for "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
        L_0x0108:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e0.d():int");
    }

    public final void e() {
        Parcelable parcelable;
        boolean I = y.I(3);
        n nVar = this.f1145c;
        if (I) {
            Log.d("FragmentManager", "moveto CREATED: " + nVar);
        }
        if (!nVar.Y) {
            x xVar = this.f1143a;
            xVar.h(false);
            Bundle bundle = nVar.f1237p;
            nVar.H.O();
            nVar.f1236o = 1;
            nVar.Q = false;
            nVar.f1230a0.a(new Fragment$5(nVar));
            nVar.f1234e0.a(bundle);
            nVar.w(bundle);
            nVar.Y = true;
            if (nVar.Q) {
                nVar.f1230a0.e(h.b.ON_CREATE);
                xVar.c(false);
                return;
            }
            throw new r0("Fragment " + nVar + " did not call through to super.onCreate()");
        }
        Bundle bundle2 = nVar.f1237p;
        if (!(bundle2 == null || (parcelable = bundle2.getParcelable("android:support:fragments")) == null)) {
            nVar.H.T(parcelable);
            z zVar = nVar.H;
            zVar.f1328y = false;
            zVar.z = false;
            zVar.F.f1119h = false;
            zVar.t(1);
        }
        nVar.f1236o = 1;
    }

    public final void f() {
        String str;
        n nVar = this.f1145c;
        if (!nVar.A) {
            if (y.I(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + nVar);
            }
            LayoutInflater B = nVar.B(nVar.f1237p);
            nVar.X = B;
            ViewGroup viewGroup = nVar.R;
            if (viewGroup == null) {
                int i10 = nVar.K;
                if (i10 == 0) {
                    viewGroup = null;
                } else if (i10 != -1) {
                    viewGroup = (ViewGroup) nVar.F.f1320o.o(i10);
                    if (viewGroup == null && !nVar.C) {
                        try {
                            str = nVar.R().getResources().getResourceName(nVar.K);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(nVar.K) + " (" + str + ") for fragment " + nVar);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + nVar + " for a container view with no id");
                }
            }
            nVar.R = viewGroup;
            nVar.K(B, viewGroup, nVar.f1237p);
            View view = nVar.S;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                nVar.S.setTag(R.id.fragment_container_view_tag, nVar);
                if (viewGroup != null) {
                    b();
                }
                if (nVar.M) {
                    nVar.S.setVisibility(8);
                }
                View view2 = nVar.S;
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                if (w.g.b(view2)) {
                    w.h.c(nVar.S);
                } else {
                    View view3 = nVar.S;
                    view3.addOnAttachStateChangeListener(new a(view3));
                }
                nVar.I(nVar.S);
                nVar.H.t(2);
                this.f1143a.m(false);
                int visibility = nVar.S.getVisibility();
                nVar.h().l = nVar.S.getAlpha();
                if (nVar.R != null && visibility == 0) {
                    View findFocus = nVar.S.findFocus();
                    if (findFocus != null) {
                        nVar.h().f1256m = findFocus;
                        if (y.I(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + nVar);
                        }
                    }
                    nVar.S.setAlpha(0.0f);
                }
            }
            nVar.f1236o = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r10 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.y.I(r0)
            java.lang.String r2 = "FragmentManager"
            androidx.fragment.app.n r3 = r10.f1145c
            if (r1 == 0) goto L_0x001c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "movefrom CREATED: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L_0x001c:
            boolean r1 = r3.z
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x002d
            int r1 = r3.E
            if (r1 <= 0) goto L_0x0028
            r1 = r5
            goto L_0x0029
        L_0x0028:
            r1 = r4
        L_0x0029:
            if (r1 != 0) goto L_0x002d
            r1 = r5
            goto L_0x002e
        L_0x002d:
            r1 = r4
        L_0x002e:
            androidx.fragment.app.f0 r6 = r10.f1144b
            if (r1 != 0) goto L_0x004d
            java.lang.Object r7 = r6.f1153r
            androidx.fragment.app.b0 r7 = (androidx.fragment.app.b0) r7
            java.util.HashMap<java.lang.String, androidx.fragment.app.n> r8 = r7.f1115c
            java.lang.String r9 = r3.f1240s
            boolean r8 = r8.containsKey(r9)
            if (r8 != 0) goto L_0x0042
        L_0x0040:
            r7 = r5
            goto L_0x0048
        L_0x0042:
            boolean r8 = r7.f1117f
            if (r8 == 0) goto L_0x0040
            boolean r7 = r7.f1118g
        L_0x0048:
            if (r7 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r7 = r4
            goto L_0x004e
        L_0x004d:
            r7 = r5
        L_0x004e:
            if (r7 == 0) goto L_0x0121
            androidx.fragment.app.v<?> r7 = r3.G
            boolean r8 = r7 instanceof androidx.lifecycle.d0
            if (r8 == 0) goto L_0x005d
            java.lang.Object r5 = r6.f1153r
            androidx.fragment.app.b0 r5 = (androidx.fragment.app.b0) r5
            boolean r5 = r5.f1118g
            goto L_0x006a
        L_0x005d:
            android.content.Context r7 = r7.f1300p
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L_0x006a
            android.app.Activity r7 = (android.app.Activity) r7
            boolean r7 = r7.isChangingConfigurations()
            r5 = r5 ^ r7
        L_0x006a:
            if (r1 != 0) goto L_0x006e
            if (r5 == 0) goto L_0x00b4
        L_0x006e:
            java.lang.Object r1 = r6.f1153r
            androidx.fragment.app.b0 r1 = (androidx.fragment.app.b0) r1
            r1.getClass()
            boolean r0 = androidx.fragment.app.y.I(r0)
            if (r0 == 0) goto L_0x008c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "Clearing non-config state for "
            r0.<init>(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L_0x008c:
            java.util.HashMap<java.lang.String, androidx.fragment.app.b0> r0 = r1.d
            java.lang.String r2 = r3.f1240s
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.b0 r2 = (androidx.fragment.app.b0) r2
            if (r2 == 0) goto L_0x00a0
            r2.a()
            java.lang.String r2 = r3.f1240s
            r0.remove(r2)
        L_0x00a0:
            java.util.HashMap<java.lang.String, androidx.lifecycle.c0> r0 = r1.f1116e
            java.lang.String r1 = r3.f1240s
            java.lang.Object r1 = r0.get(r1)
            androidx.lifecycle.c0 r1 = (androidx.lifecycle.c0) r1
            if (r1 == 0) goto L_0x00b4
            r1.a()
            java.lang.String r1 = r3.f1240s
            r0.remove(r1)
        L_0x00b4:
            androidx.fragment.app.z r0 = r3.H
            r0.l()
            androidx.lifecycle.o r0 = r3.f1230a0
            androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.ON_DESTROY
            r0.e(r1)
            r3.f1236o = r4
            r3.Q = r4
            r3.Y = r4
            r3.y()
            boolean r0 = r3.Q
            if (r0 == 0) goto L_0x0108
            androidx.fragment.app.x r0 = r10.f1143a
            r0.d(r4)
            java.util.ArrayList r0 = r6.h()
            java.util.Iterator r0 = r0.iterator()
        L_0x00da:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fa
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.e0 r1 = (androidx.fragment.app.e0) r1
            if (r1 == 0) goto L_0x00da
            java.lang.String r2 = r3.f1240s
            androidx.fragment.app.n r1 = r1.f1145c
            java.lang.String r4 = r1.f1242v
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00da
            r1.u = r3
            r2 = 0
            r1.f1242v = r2
            goto L_0x00da
        L_0x00fa:
            java.lang.String r0 = r3.f1242v
            if (r0 == 0) goto L_0x0104
            androidx.fragment.app.n r0 = r6.f(r0)
            r3.u = r0
        L_0x0104:
            r6.o(r10)
            goto L_0x0133
        L_0x0108:
            androidx.fragment.app.r0 r0 = new androidx.fragment.app.r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onDestroy()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0121:
            java.lang.String r0 = r3.f1242v
            if (r0 == 0) goto L_0x0131
            androidx.fragment.app.n r0 = r6.f(r0)
            if (r0 == 0) goto L_0x0131
            boolean r1 = r0.O
            if (r1 == 0) goto L_0x0131
            r3.u = r0
        L_0x0131:
            r3.f1236o = r4
        L_0x0133:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e0.g():void");
    }

    public final void h() {
        View view;
        boolean I = y.I(3);
        n nVar = this.f1145c;
        if (I) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + nVar);
        }
        ViewGroup viewGroup = nVar.R;
        if (!(viewGroup == null || (view = nVar.S) == null)) {
            viewGroup.removeView(view);
        }
        nVar.L();
        this.f1143a.n(false);
        nVar.R = null;
        nVar.S = null;
        nVar.f1231b0 = null;
        nVar.f1232c0.i(null);
        nVar.B = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r9 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.y.I(r0)
            java.lang.String r2 = "FragmentManager"
            androidx.fragment.app.n r3 = r9.f1145c
            if (r1 == 0) goto L_0x001c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "movefrom ATTACHED: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L_0x001c:
            r1 = -1
            r3.f1236o = r1
            r4 = 0
            r3.Q = r4
            r3.A()
            r5 = 0
            r3.X = r5
            boolean r6 = r3.Q
            if (r6 == 0) goto L_0x00c8
            androidx.fragment.app.z r6 = r3.H
            boolean r7 = r6.A
            if (r7 != 0) goto L_0x003c
            r6.l()
            androidx.fragment.app.z r6 = new androidx.fragment.app.z
            r6.<init>()
            r3.H = r6
        L_0x003c:
            androidx.fragment.app.x r6 = r9.f1143a
            r6.e(r4)
            r3.f1236o = r1
            r3.G = r5
            r3.I = r5
            r3.F = r5
            boolean r1 = r3.z
            r6 = 1
            if (r1 == 0) goto L_0x0059
            int r1 = r3.E
            if (r1 <= 0) goto L_0x0054
            r1 = r6
            goto L_0x0055
        L_0x0054:
            r1 = r4
        L_0x0055:
            if (r1 != 0) goto L_0x0059
            r1 = r6
            goto L_0x005a
        L_0x0059:
            r1 = r4
        L_0x005a:
            if (r1 != 0) goto L_0x0075
            androidx.fragment.app.f0 r1 = r9.f1144b
            java.lang.Object r1 = r1.f1153r
            androidx.fragment.app.b0 r1 = (androidx.fragment.app.b0) r1
            java.util.HashMap<java.lang.String, androidx.fragment.app.n> r7 = r1.f1115c
            java.lang.String r8 = r3.f1240s
            boolean r7 = r7.containsKey(r8)
            if (r7 != 0) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            boolean r7 = r1.f1117f
            if (r7 == 0) goto L_0x0073
            boolean r6 = r1.f1118g
        L_0x0073:
            if (r6 == 0) goto L_0x00c7
        L_0x0075:
            boolean r0 = androidx.fragment.app.y.I(r0)
            if (r0 == 0) goto L_0x008c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "initState called for fragment: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L_0x008c:
            androidx.lifecycle.o r0 = new androidx.lifecycle.o
            r0.<init>(r3)
            r3.f1230a0 = r0
            androidx.savedstate.b r0 = new androidx.savedstate.b
            r0.<init>(r3)
            r3.f1234e0 = r0
            r3.f1233d0 = r5
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.f1240s = r0
            r3.f1244y = r4
            r3.z = r4
            r3.A = r4
            r3.B = r4
            r3.C = r4
            r3.E = r4
            r3.F = r5
            androidx.fragment.app.z r0 = new androidx.fragment.app.z
            r0.<init>()
            r3.H = r0
            r3.G = r5
            r3.J = r4
            r3.K = r4
            r3.L = r5
            r3.M = r4
            r3.N = r4
        L_0x00c7:
            return
        L_0x00c8:
            androidx.fragment.app.r0 r0 = new androidx.fragment.app.r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onDetach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e0.i():void");
    }

    public final void j() {
        n nVar = this.f1145c;
        if (nVar.A && nVar.B && !nVar.D) {
            if (y.I(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + nVar);
            }
            LayoutInflater B = nVar.B(nVar.f1237p);
            nVar.X = B;
            nVar.K(B, (ViewGroup) null, nVar.f1237p);
            View view = nVar.S;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                nVar.S.setTag(R.id.fragment_container_view_tag, nVar);
                if (nVar.M) {
                    nVar.S.setVisibility(8);
                }
                nVar.I(nVar.S);
                nVar.H.t(2);
                this.f1143a.m(false);
                nVar.f1236o = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        n nVar = this.f1145c;
        if (!z) {
            boolean z10 = true;
            z10 = false;
            try {
                while (true) {
                    int d10 = d();
                    int i10 = nVar.f1236o;
                    if (d10 != i10) {
                        if (d10 <= i10) {
                            switch (i10 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    nVar.f1236o = z10 ? 1 : 0;
                                    break;
                                case 2:
                                    nVar.B = z10;
                                    nVar.f1236o = 2;
                                    break;
                                case 3:
                                    if (y.I(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + nVar);
                                    }
                                    if (nVar.S != null && nVar.f1238q == null) {
                                        o();
                                    }
                                    if (!(nVar.S == null || (viewGroup2 = nVar.R) == null)) {
                                        p0 f10 = p0.f(viewGroup2, nVar.m().G());
                                        f10.getClass();
                                        if (y.I(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + nVar);
                                        }
                                        f10.a(p0.e.c.REMOVED, p0.e.b.REMOVING, this);
                                    }
                                    nVar.f1236o = 3;
                                    break;
                                case 4:
                                    q();
                                    break;
                                case 5:
                                    nVar.f1236o = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i10 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(nVar.S == null || (viewGroup3 = nVar.R) == null)) {
                                        p0 f11 = p0.f(viewGroup3, nVar.m().G());
                                        p0.e.c from = p0.e.c.from(nVar.S.getVisibility());
                                        f11.getClass();
                                        if (y.I(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + nVar);
                                        }
                                        f11.a(from, p0.e.b.ADDING, this);
                                    }
                                    nVar.f1236o = 4;
                                    break;
                                case 5:
                                    p();
                                    break;
                                case 6:
                                    nVar.f1236o = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                    } else {
                        if (nVar.W) {
                            if (!(nVar.S == null || (viewGroup = nVar.R) == null)) {
                                p0 f12 = p0.f(viewGroup, nVar.m().G());
                                if (nVar.M) {
                                    f12.getClass();
                                    if (y.I(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + nVar);
                                    }
                                    f12.a(p0.e.c.GONE, p0.e.b.NONE, this);
                                } else {
                                    f12.getClass();
                                    if (y.I(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + nVar);
                                    }
                                    f12.a(p0.e.c.VISIBLE, p0.e.b.NONE, this);
                                }
                            }
                            y yVar = nVar.F;
                            if (yVar != null && nVar.f1244y && y.J(nVar)) {
                                yVar.f1327x = z10;
                            }
                            nVar.W = z10;
                        }
                        this.d = z10;
                        return;
                    }
                }
            } finally {
                this.d = z10;
            }
        } else if (y.I(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + nVar);
        }
    }

    public final void l() {
        boolean I = y.I(3);
        n nVar = this.f1145c;
        if (I) {
            Log.d("FragmentManager", "movefrom RESUMED: " + nVar);
        }
        nVar.H.t(5);
        if (nVar.S != null) {
            nVar.f1231b0.a(h.b.ON_PAUSE);
        }
        nVar.f1230a0.e(h.b.ON_PAUSE);
        nVar.f1236o = 6;
        nVar.Q = true;
        this.f1143a.f(false);
    }

    public final void m(ClassLoader classLoader) {
        n nVar = this.f1145c;
        Bundle bundle = nVar.f1237p;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            nVar.f1238q = nVar.f1237p.getSparseParcelableArray("android:view_state");
            nVar.f1239r = nVar.f1237p.getBundle("android:view_registry_state");
            String string = nVar.f1237p.getString("android:target_state");
            nVar.f1242v = string;
            if (string != null) {
                nVar.w = nVar.f1237p.getInt("android:target_req_state", 0);
            }
            boolean z = nVar.f1237p.getBoolean("android:user_visible_hint", true);
            nVar.U = z;
            if (!z) {
                nVar.T = true;
            }
        }
    }

    public final void n() {
        View view;
        boolean z;
        String str;
        boolean I = y.I(3);
        n nVar = this.f1145c;
        if (I) {
            Log.d("FragmentManager", "moveto RESUMED: " + nVar);
        }
        n.b bVar = nVar.V;
        if (bVar == null) {
            view = null;
        } else {
            view = bVar.f1256m;
        }
        if (view != null) {
            if (view != nVar.S) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent == nVar.S) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            z = true;
            if (z) {
                boolean requestFocus = view.requestFocus();
                if (y.I(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    if (requestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(nVar);
                    sb.append(" resulting in focused view ");
                    sb.append(nVar.S.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        nVar.h().f1256m = null;
        nVar.H.O();
        nVar.H.x(true);
        nVar.f1236o = 7;
        nVar.Q = false;
        nVar.E();
        if (nVar.Q) {
            o oVar = nVar.f1230a0;
            h.b bVar2 = h.b.ON_RESUME;
            oVar.e(bVar2);
            if (nVar.S != null) {
                nVar.f1231b0.a(bVar2);
            }
            z zVar = nVar.H;
            zVar.f1328y = false;
            zVar.z = false;
            zVar.F.f1119h = false;
            zVar.t(7);
            this.f1143a.i(false);
            nVar.f1237p = null;
            nVar.f1238q = null;
            nVar.f1239r = null;
            return;
        }
        throw new r0("Fragment " + nVar + " did not call through to super.onResume()");
    }

    public final void o() {
        n nVar = this.f1145c;
        if (nVar.S != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            nVar.S.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                nVar.f1238q = sparseArray;
            }
            Bundle bundle = new Bundle();
            nVar.f1231b0.f1261s.b(bundle);
            if (!bundle.isEmpty()) {
                nVar.f1239r = bundle;
            }
        }
    }

    public final void p() {
        boolean I = y.I(3);
        n nVar = this.f1145c;
        if (I) {
            Log.d("FragmentManager", "moveto STARTED: " + nVar);
        }
        nVar.H.O();
        nVar.H.x(true);
        nVar.f1236o = 5;
        nVar.Q = false;
        nVar.G();
        if (nVar.Q) {
            o oVar = nVar.f1230a0;
            h.b bVar = h.b.ON_START;
            oVar.e(bVar);
            if (nVar.S != null) {
                nVar.f1231b0.a(bVar);
            }
            z zVar = nVar.H;
            zVar.f1328y = false;
            zVar.z = false;
            zVar.F.f1119h = false;
            zVar.t(5);
            this.f1143a.k(false);
            return;
        }
        throw new r0("Fragment " + nVar + " did not call through to super.onStart()");
    }

    public final void q() {
        boolean I = y.I(3);
        n nVar = this.f1145c;
        if (I) {
            Log.d("FragmentManager", "movefrom STARTED: " + nVar);
        }
        z zVar = nVar.H;
        zVar.z = true;
        zVar.F.f1119h = true;
        zVar.t(4);
        if (nVar.S != null) {
            nVar.f1231b0.a(h.b.ON_STOP);
        }
        nVar.f1230a0.e(h.b.ON_STOP);
        nVar.f1236o = 4;
        nVar.Q = false;
        nVar.H();
        if (nVar.Q) {
            this.f1143a.l(false);
            return;
        }
        throw new r0("Fragment " + nVar + " did not call through to super.onStop()");
    }
}
