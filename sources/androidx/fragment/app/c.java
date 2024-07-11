package androidx.fragment.app;

import android.content.Context;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p0;
import androidx.fragment.app.r;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import n.h;

public final class c extends p0 {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1120a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.p0$e$c[] r0 = androidx.fragment.app.p0.e.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1120a = r0
                androidx.fragment.app.p0$e$c r1 = androidx.fragment.app.p0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1120a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.p0$e$c r1 = androidx.fragment.app.p0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1120a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.p0$e$c r1 = androidx.fragment.app.p0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1120a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.p0$e$c r1 = androidx.fragment.app.p0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.a.<clinit>():void");
        }
    }

    public static class b extends C0014c {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f1121c;
        public boolean d = false;

        /* renamed from: e  reason: collision with root package name */
        public r.a f1122e;

        public b(p0.e eVar, e0.b bVar, boolean z) {
            super(eVar, bVar);
            this.f1121c = z;
        }

        public final r.a c(Context context) {
            boolean z;
            if (this.d) {
                return this.f1122e;
            }
            p0.e eVar = this.f1123a;
            n nVar = eVar.f1279c;
            if (eVar.f1277a == p0.e.c.VISIBLE) {
                z = true;
            } else {
                z = false;
            }
            r.a a10 = r.a(context, nVar, z, this.f1121c);
            this.f1122e = a10;
            this.d = true;
            return a10;
        }
    }

    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    public static class C0014c {

        /* renamed from: a  reason: collision with root package name */
        public final p0.e f1123a;

        /* renamed from: b  reason: collision with root package name */
        public final e0.b f1124b;

        public C0014c(p0.e eVar, e0.b bVar) {
            this.f1123a = eVar;
            this.f1124b = bVar;
        }

        public final void a() {
            p0.e eVar = this.f1123a;
            HashSet<e0.b> hashSet = eVar.f1280e;
            if (hashSet.remove(this.f1124b) && hashSet.isEmpty()) {
                eVar.b();
            }
        }

        public final boolean b() {
            p0.e.c cVar;
            p0.e eVar = this.f1123a;
            p0.e.c from = p0.e.c.from(eVar.f1279c.S);
            p0.e.c cVar2 = eVar.f1277a;
            if (from == cVar2 || (from != (cVar = p0.e.c.VISIBLE) && cVar2 != cVar)) {
                return true;
            }
            return false;
        }
    }

    public static class d extends C0014c {

        /* renamed from: c  reason: collision with root package name */
        public final Object f1125c;
        public final boolean d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f1126e;

        public d(p0.e eVar, e0.b bVar, boolean z, boolean z10) {
            super(eVar, bVar);
            Object obj;
            Object obj2;
            p0.e.c cVar = eVar.f1277a;
            p0.e.c cVar2 = p0.e.c.VISIBLE;
            n nVar = eVar.f1279c;
            if (cVar == cVar2) {
                if (z) {
                    obj2 = nVar.o();
                } else {
                    nVar.getClass();
                    obj2 = null;
                }
                this.f1125c = obj2;
                nVar.getClass();
            } else {
                if (z) {
                    obj = nVar.p();
                } else {
                    nVar.getClass();
                    obj = null;
                }
                this.f1125c = obj;
            }
            this.d = true;
            if (z10) {
                if (z) {
                    this.f1126e = nVar.q();
                    return;
                }
                nVar.getClass();
            }
            this.f1126e = null;
        }

        public final m0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            j0 j0Var = h0.f1182a;
            if (j0Var != null && (obj instanceof Transition)) {
                return j0Var;
            }
            m0 m0Var = h0.f1183b;
            if (m0Var != null && m0Var.e(obj)) {
                return m0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1123a.f1279c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public static void i(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!viewGroup.isTransitionGroup()) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        i(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void j(n.b bVar, View view) {
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        String k10 = w.i.k(view);
        if (k10 != null) {
            bVar.put(k10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    j(bVar, childAt);
                }
            }
        }
    }

    public static void k(n.b bVar, Collection collection) {
        Iterator it = ((h.b) bVar.entrySet()).iterator();
        while (true) {
            h.d dVar = (h.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                if (!collection.contains(w.i.k((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:188:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x062a A[LOOP:12: B:230:0x0624->B:232:0x062a, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.ArrayList r35, boolean r36) {
        /*
            r34 = this;
            r0 = r34
            r1 = r36
            java.util.Iterator r2 = r35.iterator()
            r4 = 0
            r5 = 0
        L_0x000a:
            boolean r6 = r2.hasNext()
            r7 = 4
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x0043
            java.lang.Object r6 = r2.next()
            androidx.fragment.app.p0$e r6 = (androidx.fragment.app.p0.e) r6
            androidx.fragment.app.n r10 = r6.f1279c
            android.view.View r10 = r10.S
            androidx.fragment.app.p0$e$c r10 = androidx.fragment.app.p0.e.c.from((android.view.View) r10)
            int[] r11 = androidx.fragment.app.c.a.f1120a
            androidx.fragment.app.p0$e$c r12 = r6.f1277a
            int r12 = r12.ordinal()
            r11 = r11[r12]
            if (r11 == r9) goto L_0x003b
            if (r11 == r8) goto L_0x003b
            r8 = 3
            if (r11 == r8) goto L_0x003b
            if (r11 == r7) goto L_0x0035
            goto L_0x000a
        L_0x0035:
            androidx.fragment.app.p0$e$c r7 = androidx.fragment.app.p0.e.c.VISIBLE
            if (r10 == r7) goto L_0x000a
            r5 = r6
            goto L_0x000a
        L_0x003b:
            androidx.fragment.app.p0$e$c r7 = androidx.fragment.app.p0.e.c.VISIBLE
            if (r10 != r7) goto L_0x000a
            if (r4 != 0) goto L_0x000a
            r4 = r6
            goto L_0x000a
        L_0x0043:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = r35
            r10.<init>(r11)
            java.util.Iterator r11 = r35.iterator()
        L_0x0058:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00a3
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.p0$e r12 = (androidx.fragment.app.p0.e) r12
            e0.b r14 = new e0.b
            r14.<init>()
            r12.d()
            java.util.HashSet<e0.b> r15 = r12.f1280e
            r15.add(r14)
            androidx.fragment.app.c$b r15 = new androidx.fragment.app.c$b
            r15.<init>(r12, r14, r1)
            r2.add(r15)
            e0.b r14 = new e0.b
            r14.<init>()
            r12.d()
            java.util.HashSet<e0.b> r15 = r12.f1280e
            r15.add(r14)
            androidx.fragment.app.c$d r15 = new androidx.fragment.app.c$d
            if (r1 == 0) goto L_0x008d
            if (r12 != r4) goto L_0x0091
            goto L_0x008f
        L_0x008d:
            if (r12 != r5) goto L_0x0091
        L_0x008f:
            r13 = r9
            goto L_0x0092
        L_0x0091:
            r13 = 0
        L_0x0092:
            r15.<init>(r12, r14, r1, r13)
            r6.add(r15)
            androidx.fragment.app.d r13 = new androidx.fragment.app.d
            r13.<init>(r0, r10, r12)
            java.util.ArrayList r12 = r12.d
            r12.add(r13)
            goto L_0x0058
        L_0x00a3:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.Iterator r12 = r6.iterator()
            r15 = 0
        L_0x00ad:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0133
            java.lang.Object r14 = r12.next()
            androidx.fragment.app.c$d r14 = (androidx.fragment.app.c.d) r14
            boolean r16 = r14.b()
            if (r16 == 0) goto L_0x00c3
            r16 = r12
            goto L_0x012c
        L_0x00c3:
            java.lang.Object r9 = r14.f1125c
            androidx.fragment.app.m0 r7 = r14.c(r9)
            java.lang.Object r8 = r14.f1126e
            androidx.fragment.app.m0 r3 = r14.c(r8)
            java.lang.String r13 = " returned Transition "
            r16 = r12
            java.lang.String r12 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            androidx.fragment.app.p0$e r14 = r14.f1123a
            if (r7 == 0) goto L_0x0100
            if (r3 == 0) goto L_0x0100
            if (r7 != r3) goto L_0x00de
            goto L_0x0100
        L_0x00de:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            androidx.fragment.app.n r3 = r14.f1279c
            r2.append(r3)
            r2.append(r13)
            r2.append(r9)
            java.lang.String r3 = " which uses a different Transition  type than its shared element transition "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0100:
            if (r7 == 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r7 = r3
        L_0x0104:
            if (r15 != 0) goto L_0x0108
            r15 = r7
            goto L_0x012c
        L_0x0108:
            if (r7 == 0) goto L_0x012c
            if (r15 != r7) goto L_0x010d
            goto L_0x012c
        L_0x010d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            androidx.fragment.app.n r3 = r14.f1279c
            r2.append(r3)
            r2.append(r13)
            r2.append(r9)
            java.lang.String r3 = " which uses a different Transition  type than other Fragments."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x012c:
            r12 = r16
            r7 = 4
            r8 = 2
            r9 = 1
            goto L_0x00ad
        L_0x0133:
            java.lang.String r3 = "FragmentManager"
            android.view.ViewGroup r7 = r0.f1266a
            if (r15 != 0) goto L_0x015b
            java.util.Iterator r1 = r6.iterator()
        L_0x013d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0154
            java.lang.Object r4 = r1.next()
            androidx.fragment.app.c$d r4 = (androidx.fragment.app.c.d) r4
            androidx.fragment.app.p0$e r5 = r4.f1123a
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r11.put(r5, r6)
            r4.a()
            goto L_0x013d
        L_0x0154:
            r23 = r2
            r9 = r3
            r28 = r10
            goto L_0x04d6
        L_0x015b:
            android.view.View r8 = new android.view.View
            android.content.Context r9 = r7.getContext()
            r8.<init>(r9)
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            n.b r14 = new n.b
            r14.<init>()
            java.util.Iterator r22 = r6.iterator()
            r26 = r0
            r23 = r2
            r24 = r3
            r3 = r4
            r2 = r5
            r0 = 0
            r25 = 0
            r27 = 0
        L_0x0189:
            boolean r16 = r22.hasNext()
            if (r16 == 0) goto L_0x032d
            java.lang.Object r16 = r22.next()
            r28 = r10
            r10 = r16
            androidx.fragment.app.c$d r10 = (androidx.fragment.app.c.d) r10
            java.lang.Object r10 = r10.f1126e
            if (r10 == 0) goto L_0x01a0
            r16 = 1
            goto L_0x01a2
        L_0x01a0:
            r16 = 0
        L_0x01a2:
            if (r16 == 0) goto L_0x031d
            if (r3 == 0) goto L_0x031d
            if (r2 == 0) goto L_0x031d
            java.lang.Object r0 = r15.f(r10)
            java.lang.Object r0 = r15.t(r0)
            androidx.fragment.app.n r2 = r2.f1279c
            androidx.fragment.app.n$b r10 = r2.V
            if (r10 == 0) goto L_0x01ba
            java.util.ArrayList<java.lang.String> r10 = r10.f1251g
            if (r10 != 0) goto L_0x01bf
        L_0x01ba:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x01bf:
            androidx.fragment.app.n r3 = r3.f1279c
            r29 = r6
            androidx.fragment.app.n$b r6 = r3.V
            if (r6 == 0) goto L_0x01cb
            java.util.ArrayList<java.lang.String> r6 = r6.f1251g
            if (r6 != 0) goto L_0x01d0
        L_0x01cb:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x01d0:
            r30 = r11
            androidx.fragment.app.n$b r11 = r3.V
            if (r11 == 0) goto L_0x01da
            java.util.ArrayList<java.lang.String> r11 = r11.f1252h
            if (r11 != 0) goto L_0x01df
        L_0x01da:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x01df:
            r31 = r8
            r32 = r9
            r8 = 0
        L_0x01e4:
            int r9 = r11.size()
            r33 = r0
            r0 = -1
            if (r8 >= r9) goto L_0x0203
            java.lang.Object r9 = r11.get(r8)
            int r9 = r10.indexOf(r9)
            if (r9 == r0) goto L_0x01fe
            java.lang.Object r0 = r6.get(r8)
            r10.set(r9, r0)
        L_0x01fe:
            int r8 = r8 + 1
            r0 = r33
            goto L_0x01e4
        L_0x0203:
            androidx.fragment.app.n$b r6 = r2.V
            if (r6 == 0) goto L_0x020b
            java.util.ArrayList<java.lang.String> r6 = r6.f1252h
            if (r6 != 0) goto L_0x0210
        L_0x020b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0210:
            int r8 = r10.size()
            r9 = 0
        L_0x0215:
            if (r9 >= r8) goto L_0x022c
            java.lang.Object r11 = r10.get(r9)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r16 = r6.get(r9)
            r0 = r16
            java.lang.String r0 = (java.lang.String) r0
            r14.put(r11, r0)
            int r9 = r9 + 1
            r0 = -1
            goto L_0x0215
        L_0x022c:
            n.b r0 = new n.b
            r0.<init>()
            android.view.View r8 = r3.S
            j(r0, r8)
            n.h.k(r10, r0)
            java.util.Set r8 = r0.keySet()
            n.h.k(r8, r14)
            n.b r8 = new n.b
            r8.<init>()
            android.view.View r9 = r2.S
            j(r8, r9)
            n.h.k(r6, r8)
            java.util.Collection r9 = r14.values()
            n.h.k(r9, r8)
            androidx.fragment.app.j0 r9 = androidx.fragment.app.h0.f1182a
            int r9 = r14.f7333q
        L_0x0258:
            r11 = -1
            int r9 = r9 + r11
            if (r9 < 0) goto L_0x026e
            java.lang.Object r16 = r14.l(r9)
            r11 = r16
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = r8.containsKey(r11)
            if (r11 != 0) goto L_0x0258
            r14.j(r9)
            goto L_0x0258
        L_0x026e:
            java.util.Set r9 = r14.keySet()
            k(r0, r9)
            java.util.Collection r9 = r14.values()
            k(r8, r9)
            boolean r9 = r14.isEmpty()
            if (r9 == 0) goto L_0x0295
            r12.clear()
            r13.clear()
            r3 = r4
            r2 = r5
            r9 = r14
            r10 = r15
            r11 = r30
            r6 = r31
            r8 = r32
            r0 = 0
            goto L_0x0323
        L_0x0295:
            androidx.fragment.app.h0.a(r2, r3, r1)
            androidx.fragment.app.i r2 = new androidx.fragment.app.i
            r2.<init>(r5, r4, r1, r8)
            i0.r.a(r7, r2)
            java.util.Collection r2 = r0.values()
            r12.addAll(r2)
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L_0x02c1
            r2 = 0
            java.lang.Object r3 = r10.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r9 = 0
            java.lang.Object r0 = r0.getOrDefault(r3, r9)
            android.view.View r0 = (android.view.View) r0
            r3 = r33
            r15.n(r0, r3)
            goto L_0x02c7
        L_0x02c1:
            r3 = r33
            r2 = 0
            r9 = 0
            r0 = r25
        L_0x02c7:
            java.util.Collection r10 = r8.values()
            r13.addAll(r10)
            boolean r10 = r6.isEmpty()
            if (r10 != 0) goto L_0x02f1
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r8.getOrDefault(r6, r9)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x02f1
            androidx.fragment.app.j r6 = new androidx.fragment.app.j
            r8 = r32
            r6.<init>(r15, r2, r8)
            i0.r.a(r7, r6)
            r6 = r31
            r27 = 1
            goto L_0x02f5
        L_0x02f1:
            r8 = r32
            r6 = r31
        L_0x02f5:
            r15.r(r3, r6, r12)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r9 = r14
            r14 = r15
            r10 = r15
            r15 = r3
            r20 = r3
            r21 = r13
            r14.m(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r11 = r30
            r11.put(r4, r2)
            r11.put(r5, r2)
            r26 = r34
            r25 = r0
            r0 = r3
            r3 = r4
            r2 = r5
            goto L_0x0323
        L_0x031d:
            r29 = r6
            r6 = r8
            r8 = r9
            r9 = r14
            r10 = r15
        L_0x0323:
            r14 = r9
            r15 = r10
            r10 = r28
            r9 = r8
            r8 = r6
            r6 = r29
            goto L_0x0189
        L_0x032d:
            r29 = r6
            r6 = r8
            r8 = r9
            r28 = r10
            r9 = r14
            r10 = r15
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r29.iterator()
            r14 = 0
            r15 = 0
        L_0x0340:
            boolean r16 = r4.hasNext()
            if (r16 == 0) goto L_0x044e
            java.lang.Object r16 = r4.next()
            r36 = r4
            r4 = r16
            androidx.fragment.app.c$d r4 = (androidx.fragment.app.c.d) r4
            boolean r16 = r4.b()
            r22 = r9
            androidx.fragment.app.p0$e r9 = r4.f1123a
            if (r16 == 0) goto L_0x0371
            r16 = r14
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r11.put(r9, r14)
            r4.a()
            r30 = r5
            r32 = r6
            r14 = r16
            r5 = r25
            r4 = 0
            r16 = r12
            goto L_0x0440
        L_0x0371:
            r16 = r14
            java.lang.Object r14 = r4.f1125c
            java.lang.Object r14 = r10.f(r14)
            if (r0 == 0) goto L_0x0381
            if (r9 == r3) goto L_0x037f
            if (r9 != r2) goto L_0x0381
        L_0x037f:
            r2 = 1
            goto L_0x0382
        L_0x0381:
            r2 = 0
        L_0x0382:
            if (r14 != 0) goto L_0x039b
            if (r2 != 0) goto L_0x038e
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r11.put(r9, r2)
            r4.a()
        L_0x038e:
            r30 = r5
            r32 = r6
            r14 = r16
            r5 = r25
            r4 = 0
            r16 = r12
            goto L_0x043e
        L_0x039b:
            r30 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r17 = r15
            androidx.fragment.app.n r15 = r9.f1279c
            android.view.View r15 = r15.S
            i(r5, r15)
            if (r2 == 0) goto L_0x03b6
            if (r9 != r3) goto L_0x03b3
            r5.removeAll(r12)
            goto L_0x03b6
        L_0x03b3:
            r5.removeAll(r13)
        L_0x03b6:
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x03c8
            r10.a(r6, r14)
            r32 = r6
            r2 = r16
            r6 = r17
            r16 = r12
            goto L_0x0412
        L_0x03c8:
            r10.b(r14, r5)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r31 = r14
            r2 = r16
            r14 = r10
            r32 = r6
            r6 = r17
            r15 = r31
            r16 = r31
            r17 = r5
            r14.m(r15, r16, r17, r18, r19, r20, r21)
            androidx.fragment.app.p0$e$c r14 = r9.f1277a
            androidx.fragment.app.p0$e$c r15 = androidx.fragment.app.p0.e.c.GONE
            if (r14 != r15) goto L_0x040e
            r14 = r28
            r14.remove(r9)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r5)
            androidx.fragment.app.n r14 = r9.f1279c
            r16 = r12
            android.view.View r12 = r14.S
            r15.remove(r12)
            android.view.View r12 = r14.S
            r14 = r31
            r10.l(r14, r12, r15)
            androidx.fragment.app.k r12 = new androidx.fragment.app.k
            r12.<init>(r5)
            i0.r.a(r7, r12)
            goto L_0x0412
        L_0x040e:
            r16 = r12
            r14 = r31
        L_0x0412:
            androidx.fragment.app.p0$e$c r12 = r9.f1277a
            androidx.fragment.app.p0$e$c r15 = androidx.fragment.app.p0.e.c.VISIBLE
            if (r12 != r15) goto L_0x0423
            r1.addAll(r5)
            if (r27 == 0) goto L_0x0420
            r10.o(r14, r8)
        L_0x0420:
            r5 = r25
            goto L_0x0428
        L_0x0423:
            r5 = r25
            r10.n(r5, r14)
        L_0x0428:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r11.put(r9, r12)
            boolean r4 = r4.d
            if (r4 == 0) goto L_0x0438
            r4 = 0
            java.lang.Object r15 = r10.j(r6, r14, r4)
            r14 = r2
            goto L_0x043e
        L_0x0438:
            r4 = 0
            java.lang.Object r14 = r10.j(r2, r14, r4)
            r15 = r6
        L_0x043e:
            r2 = r30
        L_0x0440:
            r4 = r36
            r25 = r5
            r12 = r16
            r9 = r22
            r5 = r30
            r6 = r32
            goto L_0x0340
        L_0x044e:
            r30 = r5
            r22 = r9
            r16 = r12
            r2 = r14
            r6 = r15
            java.lang.Object r2 = r10.i(r6, r2, r0)
            java.util.Iterator r4 = r29.iterator()
        L_0x045e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x04cc
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.c$d r5 = (androidx.fragment.app.c.d) r5
            boolean r6 = r5.b()
            if (r6 == 0) goto L_0x0471
            goto L_0x045e
        L_0x0471:
            androidx.fragment.app.p0$e r6 = r5.f1123a
            r8 = r30
            if (r0 == 0) goto L_0x047d
            if (r6 == r3) goto L_0x047b
            if (r6 != r8) goto L_0x047d
        L_0x047b:
            r9 = 1
            goto L_0x047e
        L_0x047d:
            r9 = 0
        L_0x047e:
            java.lang.Object r12 = r5.f1125c
            if (r12 != 0) goto L_0x0488
            if (r9 == 0) goto L_0x0485
            goto L_0x0488
        L_0x0485:
            r9 = r24
            goto L_0x04c7
        L_0x0488:
            java.util.WeakHashMap<android.view.View, i0.b0> r9 = i0.w.f6004a
            boolean r9 = i0.w.g.c(r7)
            if (r9 != 0) goto L_0x04b9
            r9 = 2
            boolean r12 = androidx.fragment.app.y.I(r9)
            if (r12 == 0) goto L_0x04b3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r12 = "SpecialEffectsController: Container "
            r9.<init>(r12)
            r9.append(r7)
            java.lang.String r12 = " has not been laid out. Completing operation "
            r9.append(r12)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r9 = r24
            android.util.Log.v(r9, r6)
            goto L_0x04b5
        L_0x04b3:
            r9 = r24
        L_0x04b5:
            r5.a()
            goto L_0x04c7
        L_0x04b9:
            r9 = r24
            androidx.fragment.app.n r6 = r6.f1279c
            androidx.fragment.app.l r6 = new androidx.fragment.app.l
            r6.<init>(r5)
            e0.b r5 = r5.f1124b
            r10.p(r2, r5, r6)
        L_0x04c7:
            r30 = r8
            r24 = r9
            goto L_0x045e
        L_0x04cc:
            r9 = r24
            java.util.WeakHashMap<android.view.View, i0.b0> r3 = i0.w.f6004a
            boolean r3 = i0.w.g.c(r7)
            if (r3 != 0) goto L_0x04d8
        L_0x04d6:
            r2 = 0
            goto L_0x04f5
        L_0x04d8:
            r3 = 4
            androidx.fragment.app.h0.b(r1, r3)
            java.util.ArrayList r3 = androidx.fragment.app.m0.k(r13)
            r10.c(r7, r2)
            r2 = r26
            android.view.ViewGroup r2 = r2.f1266a
            r4 = r16
            r5 = r22
            androidx.fragment.app.m0.q(r2, r4, r13, r3, r5)
            r2 = 0
            androidx.fragment.app.h0.b(r1, r2)
            r10.s(r0, r4, r13)
        L_0x04f5:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r11.containsValue(r0)
            android.content.Context r1 = r7.getContext()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r23.iterator()
            r5 = r2
        L_0x0509:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x059a
            java.lang.Object r6 = r4.next()
            androidx.fragment.app.c$b r6 = (androidx.fragment.app.c.b) r6
            boolean r8 = r6.b()
            if (r8 == 0) goto L_0x051c
            goto L_0x0558
        L_0x051c:
            androidx.fragment.app.r$a r8 = r6.c(r1)
            if (r8 != 0) goto L_0x0523
            goto L_0x0558
        L_0x0523:
            android.animation.Animator r8 = r8.f1287b
            if (r8 != 0) goto L_0x052b
            r3.add(r6)
            goto L_0x0509
        L_0x052b:
            androidx.fragment.app.p0$e r10 = r6.f1123a
            androidx.fragment.app.n r12 = r10.f1279c
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Object r14 = r11.get(r10)
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x055c
            r13 = 2
            boolean r8 = androidx.fragment.app.y.I(r13)
            if (r8 == 0) goto L_0x0558
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Ignoring Animator set on "
            r8.<init>(r10)
            r8.append(r12)
            java.lang.String r10 = " as this Fragment was involved in a Transition."
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r9, r8)
        L_0x0558:
            r6.a()
            goto L_0x0509
        L_0x055c:
            androidx.fragment.app.p0$e$c r5 = r10.f1277a
            androidx.fragment.app.p0$e$c r13 = androidx.fragment.app.p0.e.c.GONE
            if (r5 != r13) goto L_0x0565
            r19 = 1
            goto L_0x0567
        L_0x0565:
            r19 = r2
        L_0x0567:
            r13 = r28
            if (r19 == 0) goto L_0x056e
            r13.remove(r10)
        L_0x056e:
            android.view.View r5 = r12.S
            r7.startViewTransition(r5)
            androidx.fragment.app.e r12 = new androidx.fragment.app.e
            r16 = r12
            r17 = r7
            r18 = r5
            r20 = r10
            r21 = r6
            r16.<init>(r17, r18, r19, r20, r21)
            r8.addListener(r12)
            r8.setTarget(r5)
            r8.start()
            androidx.fragment.app.f r5 = new androidx.fragment.app.f
            r5.<init>(r8)
            e0.b r6 = r6.f1124b
            r6.b(r5)
            r28 = r13
            r5 = 1
            goto L_0x0509
        L_0x059a:
            r13 = r28
            java.util.Iterator r2 = r3.iterator()
        L_0x05a0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0620
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.c$b r3 = (androidx.fragment.app.c.b) r3
            androidx.fragment.app.p0$e r4 = r3.f1123a
            androidx.fragment.app.n r6 = r4.f1279c
            java.lang.String r8 = "Ignoring Animation set on "
            if (r0 == 0) goto L_0x05c6
            r10 = 2
            boolean r4 = androidx.fragment.app.y.I(r10)
            if (r4 == 0) goto L_0x05e3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r8)
            r4.append(r6)
            java.lang.String r6 = " as Animations cannot run alongside Transitions."
            goto L_0x05d9
        L_0x05c6:
            r10 = 2
            if (r5 == 0) goto L_0x05e7
            boolean r4 = androidx.fragment.app.y.I(r10)
            if (r4 == 0) goto L_0x05e3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r8)
            r4.append(r6)
            java.lang.String r6 = " as Animations cannot run alongside Animators."
        L_0x05d9:
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r9, r4)
        L_0x05e3:
            r3.a()
            goto L_0x05a0
        L_0x05e7:
            android.view.View r6 = r6.S
            androidx.fragment.app.r$a r8 = r3.c(r1)
            r8.getClass()
            android.view.animation.Animation r8 = r8.f1286a
            r8.getClass()
            androidx.fragment.app.p0$e$c r4 = r4.f1277a
            androidx.fragment.app.p0$e$c r11 = androidx.fragment.app.p0.e.c.REMOVED
            if (r4 == r11) goto L_0x0602
            r6.startAnimation(r8)
            r3.a()
            goto L_0x0615
        L_0x0602:
            r7.startViewTransition(r6)
            androidx.fragment.app.r$b r4 = new androidx.fragment.app.r$b
            r4.<init>(r8, r7, r6)
            androidx.fragment.app.g r8 = new androidx.fragment.app.g
            r8.<init>(r6, r7, r3)
            r4.setAnimationListener(r8)
            r6.startAnimation(r4)
        L_0x0615:
            androidx.fragment.app.h r4 = new androidx.fragment.app.h
            r4.<init>(r6, r7, r3)
            e0.b r3 = r3.f1124b
            r3.b(r4)
            goto L_0x05a0
        L_0x0620:
            java.util.Iterator r0 = r13.iterator()
        L_0x0624:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x063a
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.p0$e r1 = (androidx.fragment.app.p0.e) r1
            androidx.fragment.app.n r2 = r1.f1279c
            android.view.View r2 = r2.S
            androidx.fragment.app.p0$e$c r1 = r1.f1277a
            r1.applyState(r2)
            goto L_0x0624
        L_0x063a:
            r13.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.b(java.util.ArrayList, boolean):void");
    }
}
