package c1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import n.b;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2114a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<WeakReference<b<ViewGroup, ArrayList<j>>>> f2115b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList<ViewGroup> f2116c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: o  reason: collision with root package name */
        public final j f2117o;

        /* renamed from: p  reason: collision with root package name */
        public final ViewGroup f2118p;

        /* renamed from: c1.n$a$a  reason: collision with other inner class name */
        public class C0027a extends m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f2119a;

            public C0027a(b bVar) {
                this.f2119a = bVar;
            }

            public final void b(j jVar) {
                ((ArrayList) this.f2119a.getOrDefault(a.this.f2118p, null)).remove(jVar);
                jVar.A(this);
            }
        }

        public a(ViewGroup viewGroup, j jVar) {
            this.f2117o = jVar;
            this.f2118p = viewGroup;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: c1.q} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x0210  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x023c  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x01e9 A[EDGE_INSN: B:142:0x01e9->B:90:0x01e9 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x01ef  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPreDraw() {
            /*
                r18 = this;
                r0 = r18
                android.view.ViewGroup r2 = r0.f2118p
                android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                r2.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = c1.n.f2116c
                boolean r1 = r1.remove(r2)
                r7 = 1
                if (r1 != 0) goto L_0x0018
                return r7
            L_0x0018:
                n.b r1 = c1.n.a()
                r3 = 0
                java.lang.Object r4 = r1.getOrDefault(r2, r3)
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                if (r4 != 0) goto L_0x002e
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r1.put(r2, r4)
                goto L_0x003a
            L_0x002e:
                int r5 = r4.size()
                if (r5 <= 0) goto L_0x003a
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r4)
                goto L_0x003b
            L_0x003a:
                r5 = r3
            L_0x003b:
                c1.j r8 = r0.f2117o
                r4.add(r8)
                c1.n$a$a r4 = new c1.n$a$a
                r4.<init>(r1)
                r8.c(r4)
                r1 = 0
                r8.l(r2, r1)
                if (r5 == 0) goto L_0x0062
                java.util.Iterator r4 = r5.iterator()
            L_0x0052:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0062
                java.lang.Object r5 = r4.next()
                c1.j r5 = (c1.j) r5
                r5.C(r2)
                goto L_0x0052
            L_0x0062:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r8.f2106y = r4
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r8.z = r4
                o.c r4 = r8.u
                o.c r5 = r8.f2104v
                n.b r6 = new n.b
                java.lang.Object r9 = r4.f7535a
                n.b r9 = (n.b) r9
                r6.<init>((n.b) r9)
                n.b r9 = new n.b
                java.lang.Object r10 = r5.f7535a
                n.b r10 = (n.b) r10
                r9.<init>((n.b) r10)
                r10 = r1
            L_0x0087:
                int[] r11 = r8.f2105x
                int r12 = r11.length
                if (r10 >= r12) goto L_0x01e9
                r11 = r11[r10]
                if (r11 == r7) goto L_0x01a9
                r12 = 2
                if (r11 == r12) goto L_0x0157
                r12 = 3
                if (r11 == r12) goto L_0x0103
                r12 = 4
                if (r11 == r12) goto L_0x009c
            L_0x0099:
                r7 = r8
                goto L_0x01df
            L_0x009c:
                java.lang.Object r11 = r4.f7537c
                n.f r11 = (n.f) r11
                java.lang.Object r12 = r5.f7537c
                n.f r12 = (n.f) r12
                int r13 = r11.j()
                r14 = r1
            L_0x00a9:
                if (r14 >= r13) goto L_0x0099
                java.lang.Object r15 = r11.k(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x00f9
                boolean r16 = r8.x(r15)
                if (r16 == 0) goto L_0x00f9
                boolean r1 = r11.f7305o
                if (r1 == 0) goto L_0x00c0
                r11.e()
            L_0x00c0:
                long[] r1 = r11.f7306p
                r17 = r8
                r7 = r1[r14]
                java.lang.Object r1 = r12.h(r7, r3)
                android.view.View r1 = (android.view.View) r1
                r7 = r17
                if (r1 == 0) goto L_0x00fa
                boolean r8 = r7.x(r1)
                if (r8 == 0) goto L_0x00fa
                java.lang.Object r8 = r6.getOrDefault(r15, r3)
                c1.q r8 = (c1.q) r8
                java.lang.Object r17 = r9.getOrDefault(r1, r3)
                r3 = r17
                c1.q r3 = (c1.q) r3
                if (r8 == 0) goto L_0x00fa
                if (r3 == 0) goto L_0x00fa
                java.util.ArrayList<c1.q> r0 = r7.f2106y
                r0.add(r8)
                java.util.ArrayList<c1.q> r0 = r7.z
                r0.add(r3)
                r6.remove(r15)
                r9.remove(r1)
                goto L_0x00fa
            L_0x00f9:
                r7 = r8
            L_0x00fa:
                int r14 = r14 + 1
                r0 = r18
                r8 = r7
                r1 = 0
                r3 = 0
                r7 = 1
                goto L_0x00a9
            L_0x0103:
                r7 = r8
                java.lang.Object r0 = r4.f7536b
                android.util.SparseArray r0 = (android.util.SparseArray) r0
                java.lang.Object r1 = r5.f7536b
                android.util.SparseArray r1 = (android.util.SparseArray) r1
                int r3 = r0.size()
                r8 = 0
            L_0x0111:
                if (r8 >= r3) goto L_0x01df
                java.lang.Object r11 = r0.valueAt(r8)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x0154
                boolean r12 = r7.x(r11)
                if (r12 == 0) goto L_0x0154
                int r12 = r0.keyAt(r8)
                java.lang.Object r12 = r1.get(r12)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x0154
                boolean r13 = r7.x(r12)
                if (r13 == 0) goto L_0x0154
                r13 = 0
                java.lang.Object r14 = r6.getOrDefault(r11, r13)
                c1.q r14 = (c1.q) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                c1.q r15 = (c1.q) r15
                if (r14 == 0) goto L_0x0154
                if (r15 == 0) goto L_0x0154
                java.util.ArrayList<c1.q> r13 = r7.f2106y
                r13.add(r14)
                java.util.ArrayList<c1.q> r13 = r7.z
                r13.add(r15)
                r6.remove(r11)
                r9.remove(r12)
            L_0x0154:
                int r8 = r8 + 1
                goto L_0x0111
            L_0x0157:
                r7 = r8
                java.lang.Object r0 = r4.d
                n.b r0 = (n.b) r0
                java.lang.Object r1 = r5.d
                n.b r1 = (n.b) r1
                int r3 = r0.f7333q
                r8 = 0
            L_0x0163:
                if (r8 >= r3) goto L_0x01df
                java.lang.Object r11 = r0.l(r8)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01a6
                boolean r12 = r7.x(r11)
                if (r12 == 0) goto L_0x01a6
                java.lang.Object r12 = r0.h(r8)
                r13 = 0
                java.lang.Object r12 = r1.getOrDefault(r12, r13)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01a6
                boolean r14 = r7.x(r12)
                if (r14 == 0) goto L_0x01a6
                java.lang.Object r14 = r6.getOrDefault(r11, r13)
                c1.q r14 = (c1.q) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                c1.q r15 = (c1.q) r15
                if (r14 == 0) goto L_0x01a6
                if (r15 == 0) goto L_0x01a6
                java.util.ArrayList<c1.q> r13 = r7.f2106y
                r13.add(r14)
                java.util.ArrayList<c1.q> r13 = r7.z
                r13.add(r15)
                r6.remove(r11)
                r9.remove(r12)
            L_0x01a6:
                int r8 = r8 + 1
                goto L_0x0163
            L_0x01a9:
                r7 = r8
                int r0 = r6.f7333q
            L_0x01ac:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01df
                java.lang.Object r1 = r6.h(r0)
                android.view.View r1 = (android.view.View) r1
                if (r1 == 0) goto L_0x01ac
                boolean r3 = r7.x(r1)
                if (r3 == 0) goto L_0x01ac
                java.lang.Object r1 = r9.remove(r1)
                c1.q r1 = (c1.q) r1
                if (r1 == 0) goto L_0x01ac
                android.view.View r3 = r1.f2127b
                boolean r3 = r7.x(r3)
                if (r3 == 0) goto L_0x01ac
                java.lang.Object r3 = r6.j(r0)
                c1.q r3 = (c1.q) r3
                java.util.ArrayList<c1.q> r8 = r7.f2106y
                r8.add(r3)
                java.util.ArrayList<c1.q> r3 = r7.z
                r3.add(r1)
                goto L_0x01ac
            L_0x01df:
                int r10 = r10 + 1
                r0 = r18
                r8 = r7
                r1 = 0
                r3 = 0
                r7 = 1
                goto L_0x0087
            L_0x01e9:
                r7 = r8
                r0 = 0
            L_0x01eb:
                int r1 = r6.f7333q
                if (r0 >= r1) goto L_0x020b
                java.lang.Object r1 = r6.l(r0)
                c1.q r1 = (c1.q) r1
                android.view.View r3 = r1.f2127b
                boolean r3 = r7.x(r3)
                if (r3 == 0) goto L_0x0208
                java.util.ArrayList<c1.q> r3 = r7.f2106y
                r3.add(r1)
                java.util.ArrayList<c1.q> r1 = r7.z
                r3 = 0
                r1.add(r3)
            L_0x0208:
                int r0 = r0 + 1
                goto L_0x01eb
            L_0x020b:
                r0 = 0
            L_0x020c:
                int r1 = r9.f7333q
                if (r0 >= r1) goto L_0x022c
                java.lang.Object r1 = r9.l(r0)
                c1.q r1 = (c1.q) r1
                android.view.View r3 = r1.f2127b
                boolean r3 = r7.x(r3)
                if (r3 == 0) goto L_0x0229
                java.util.ArrayList<c1.q> r3 = r7.z
                r3.add(r1)
                java.util.ArrayList<c1.q> r1 = r7.f2106y
                r3 = 0
                r1.add(r3)
            L_0x0229:
                int r0 = r0 + 1
                goto L_0x020c
            L_0x022c:
                n.b r0 = c1.j.t()
                int r1 = r0.f7333q
                c1.x r3 = c1.t.f2131a
                android.view.WindowId r3 = r2.getWindowId()
                r4 = 1
                int r1 = r1 - r4
            L_0x023a:
                if (r1 < 0) goto L_0x02af
                java.lang.Object r4 = r0.h(r1)
                android.animation.Animator r4 = (android.animation.Animator) r4
                if (r4 == 0) goto L_0x02ab
                r5 = 0
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                c1.j$b r6 = (c1.j.b) r6
                if (r6 == 0) goto L_0x02ab
                android.view.View r5 = r6.f2107a
                if (r5 == 0) goto L_0x02ab
                c1.c0 r8 = r6.d
                boolean r9 = r8 instanceof c1.b0
                if (r9 == 0) goto L_0x0263
                c1.b0 r8 = (c1.b0) r8
                android.view.WindowId r8 = r8.f2084a
                boolean r8 = r8.equals(r3)
                if (r8 == 0) goto L_0x0263
                r8 = 1
                goto L_0x0264
            L_0x0263:
                r8 = 0
            L_0x0264:
                if (r8 == 0) goto L_0x02ab
                r8 = 1
                c1.q r9 = r7.v(r5, r8)
                c1.q r10 = r7.s(r5, r8)
                if (r9 != 0) goto L_0x0282
                if (r10 != 0) goto L_0x0282
                o.c r8 = r7.f2104v
                java.lang.Object r8 = r8.f7535a
                n.b r8 = (n.b) r8
                r11 = 0
                java.lang.Object r5 = r8.getOrDefault(r5, r11)
                r10 = r5
                c1.q r10 = (c1.q) r10
                goto L_0x0283
            L_0x0282:
                r11 = 0
            L_0x0283:
                if (r9 != 0) goto L_0x0287
                if (r10 == 0) goto L_0x0293
            L_0x0287:
                c1.j r5 = r6.f2110e
                c1.q r6 = r6.f2109c
                boolean r5 = r5.w(r6, r10)
                if (r5 == 0) goto L_0x0293
                r5 = 1
                goto L_0x0294
            L_0x0293:
                r5 = 0
            L_0x0294:
                if (r5 == 0) goto L_0x02ac
                boolean r5 = r4.isRunning()
                if (r5 != 0) goto L_0x02a7
                boolean r5 = r4.isStarted()
                if (r5 == 0) goto L_0x02a3
                goto L_0x02a7
            L_0x02a3:
                r0.remove(r4)
                goto L_0x02ac
            L_0x02a7:
                r4.cancel()
                goto L_0x02ac
            L_0x02ab:
                r11 = 0
            L_0x02ac:
                int r1 = r1 + -1
                goto L_0x023a
            L_0x02af:
                o.c r3 = r7.u
                o.c r4 = r7.f2104v
                java.util.ArrayList<c1.q> r5 = r7.f2106y
                java.util.ArrayList<c1.q> r6 = r7.z
                r1 = r7
                r1.q(r2, r3, r4, r5, r6)
                r7.D()
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: c1.n.a.onPreDraw():boolean");
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f2118p;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            n.f2116c.remove(viewGroup);
            ArrayList orDefault = n.a().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator it = orDefault.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).C(viewGroup);
                }
            }
            this.f2117o.m(true);
        }
    }

    public static b<ViewGroup, ArrayList<j>> a() {
        b<ViewGroup, ArrayList<j>> bVar;
        ThreadLocal<WeakReference<b<ViewGroup, ArrayList<j>>>> threadLocal = f2115b;
        WeakReference weakReference = threadLocal.get();
        if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
            return bVar;
        }
        b<ViewGroup, ArrayList<j>> bVar2 = new b<>();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
