package c1;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import i0.b0;
import i0.w;
import java.util.HashMap;
import java.util.WeakHashMap;

public final class b extends j {
    public static final String[] L = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final C0026b M = new C0026b();
    public static final c N = new c();
    public static final d O = new d();
    public static final e P = new e();
    public static final f Q = new f();

    public static class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f2075a = new Rect();

        public a() {
            super(PointF.class, "boundsOrigin");
        }

        public final Object get(Object obj) {
            Rect rect = this.f2075a;
            ((Drawable) obj).copyBounds(rect);
            return new PointF((float) rect.left, (float) rect.top);
        }

        public final void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            Rect rect = this.f2075a;
            drawable.copyBounds(rect);
            rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(rect);
        }
    }

    /* renamed from: c1.b$b  reason: collision with other inner class name */
    public static class C0026b extends Property<i, PointF> {
        public C0026b() {
            super(PointF.class, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            iVar.getClass();
            iVar.f2078a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f2079b = round;
            int i10 = iVar.f2082f + 1;
            iVar.f2082f = i10;
            if (i10 == iVar.f2083g) {
                t.a(iVar.f2081e, iVar.f2078a, round, iVar.f2080c, iVar.d);
                iVar.f2082f = 0;
                iVar.f2083g = 0;
            }
        }
    }

    public static class c extends Property<i, PointF> {
        public c() {
            super(PointF.class, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            iVar.getClass();
            iVar.f2080c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.d = round;
            int i10 = iVar.f2083g + 1;
            iVar.f2083g = i10;
            if (iVar.f2082f == i10) {
                t.a(iVar.f2081e, iVar.f2078a, iVar.f2079b, iVar.f2080c, round);
                iVar.f2082f = 0;
                iVar.f2083g = 0;
            }
        }
    }

    public static class d extends Property<View, PointF> {
        public d() {
            super(PointF.class, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            t.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public static class e extends Property<View, PointF> {
        public e() {
            super(PointF.class, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            t.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    public static class f extends Property<View, PointF> {
        public f() {
            super(PointF.class, "position");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            t.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    public class h extends m {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2076a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2077b;

        public h(ViewGroup viewGroup) {
            this.f2077b = viewGroup;
        }

        public final void a() {
            s.a(this.f2077b, false);
        }

        public final void b(j jVar) {
            if (!this.f2076a) {
                s.a(this.f2077b, false);
            }
            jVar.A(this);
        }

        public final void c() {
            s.a(this.f2077b, true);
        }

        public final void d() {
            s.a(this.f2077b, false);
            this.f2076a = true;
        }
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f2078a;

        /* renamed from: b  reason: collision with root package name */
        public int f2079b;

        /* renamed from: c  reason: collision with root package name */
        public int f2080c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public final View f2081e;

        /* renamed from: f  reason: collision with root package name */
        public int f2082f;

        /* renamed from: g  reason: collision with root package name */
        public int f2083g;

        public i(View view) {
            this.f2081e = view;
        }
    }

    static {
        new a();
    }

    public final void M(q qVar) {
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        View view = qVar.f2127b;
        if (w.g.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = qVar.f2126a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }

    public final void h(q qVar) {
        M(qVar);
    }

    public final void k(q qVar) {
        M(qVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator p(android.view.ViewGroup r19, c1.q r20, c1.q r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L_0x0126
            if (r2 != 0) goto L_0x000c
            goto L_0x0126
        L_0x000c:
            java.util.HashMap r1 = r1.f2126a
            java.util.HashMap r4 = r2.f2126a
            java.lang.String r5 = "android:changeBounds:parent"
            java.lang.Object r6 = r1.get(r5)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.Object r5 = r4.get(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r6 == 0) goto L_0x0124
            if (r5 != 0) goto L_0x0024
            goto L_0x0124
        L_0x0024:
            java.lang.String r5 = "android:changeBounds:bounds"
            java.lang.Object r6 = r1.get(r5)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            java.lang.Object r5 = r4.get(r5)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            int r7 = r6.left
            int r8 = r5.left
            int r9 = r6.top
            int r10 = r5.top
            int r11 = r6.right
            int r12 = r5.right
            int r6 = r6.bottom
            int r5 = r5.bottom
            int r13 = r11 - r7
            int r14 = r6 - r9
            int r15 = r12 - r8
            int r3 = r5 - r10
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.lang.Object r0 = r4.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r4 = 1
            if (r13 == 0) goto L_0x005d
            if (r14 != 0) goto L_0x0061
        L_0x005d:
            if (r15 == 0) goto L_0x0072
            if (r3 == 0) goto L_0x0072
        L_0x0061:
            if (r7 != r8) goto L_0x0069
            if (r9 == r10) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            r16 = 0
            goto L_0x006b
        L_0x0069:
            r16 = r4
        L_0x006b:
            if (r11 != r12) goto L_0x006f
            if (r6 == r5) goto L_0x0074
        L_0x006f:
            int r16 = r16 + 1
            goto L_0x0074
        L_0x0072:
            r16 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x007c
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L_0x0080
        L_0x007c:
            if (r1 != 0) goto L_0x0082
            if (r0 == 0) goto L_0x0082
        L_0x0080:
            int r16 = r16 + 1
        L_0x0082:
            r0 = r16
            if (r0 <= 0) goto L_0x0120
            android.view.View r1 = r2.f2127b
            c1.t.a(r1, r7, r9, r11, r6)
            r2 = 2
            if (r0 != r2) goto L_0x00e1
            if (r13 != r15) goto L_0x00a1
            if (r14 != r3) goto L_0x00a1
            r0 = r18
            androidx.activity.result.c r2 = r0.H
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r2 = r2.m(r3, r5, r6, r7)
            c1.b$f r3 = Q
            goto L_0x0101
        L_0x00a1:
            r0 = r18
            c1.b$i r3 = new c1.b$i
            r3.<init>(r1)
            androidx.activity.result.c r13 = r0.H
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            android.graphics.Path r7 = r13.m(r7, r9, r8, r10)
            c1.b$b r8 = M
            r9 = 0
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofObject(r3, r8, r9, r7)
            androidx.activity.result.c r8 = r0.H
            float r10 = (float) r11
            float r6 = (float) r6
            float r11 = (float) r12
            float r5 = (float) r5
            android.graphics.Path r5 = r8.m(r10, r6, r11, r5)
            c1.b$c r6 = N
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofObject(r3, r6, r9, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r2 = new android.animation.Animator[r2]
            r8 = 0
            r2[r8] = r7
            r2[r4] = r5
            r6.playTogether(r2)
            c1.b$g r2 = new c1.b$g
            r2.<init>(r3)
            r6.addListener(r2)
            goto L_0x0106
        L_0x00e1:
            r0 = r18
            if (r7 != r8) goto L_0x00f5
            if (r9 == r10) goto L_0x00e8
            goto L_0x00f5
        L_0x00e8:
            androidx.activity.result.c r2 = r0.H
            float r3 = (float) r11
            float r6 = (float) r6
            float r7 = (float) r12
            float r5 = (float) r5
            android.graphics.Path r2 = r2.m(r3, r6, r7, r5)
            c1.b$d r3 = O
            goto L_0x0101
        L_0x00f5:
            androidx.activity.result.c r2 = r0.H
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r2 = r2.m(r3, r5, r6, r7)
            c1.b$e r3 = P
        L_0x0101:
            r5 = 0
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofObject(r1, r3, r5, r2)
        L_0x0106:
            android.view.ViewParent r2 = r1.getParent()
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x011f
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            c1.s.a(r1, r4)
            c1.b$h r2 = new c1.b$h
            r2.<init>(r1)
            r0.c(r2)
        L_0x011f:
            return r6
        L_0x0120:
            r0 = r18
            r1 = 0
            return r1
        L_0x0124:
            r1 = 0
            return r1
        L_0x0126:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.b.p(android.view.ViewGroup, c1.q, c1.q):android.animation.Animator");
    }

    public final String[] u() {
        return L;
    }
}
