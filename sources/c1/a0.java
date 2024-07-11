package c1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import c1.j;
import java.util.HashMap;

public abstract class a0 extends j {
    public static final String[] M = {"android:visibility:visibility", "android:visibility:parent"};
    public int L = 3;

    public static class a extends AnimatorListenerAdapter implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f2065a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2066b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f2067c;
        public final boolean d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2068e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2069f = false;

        public a(View view, int i10) {
            this.f2065a = view;
            this.f2066b = i10;
            this.f2067c = (ViewGroup) view.getParent();
            this.d = true;
            f(true);
        }

        public final void a() {
            f(false);
        }

        public final void b(j jVar) {
            if (!this.f2069f) {
                t.f2131a.r(this.f2065a, this.f2066b);
                ViewGroup viewGroup = this.f2067c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
            jVar.A(this);
        }

        public final void c() {
            f(true);
        }

        public final void d() {
        }

        public final void e(j jVar) {
        }

        public final void f(boolean z) {
            ViewGroup viewGroup;
            if (this.d && this.f2068e != z && (viewGroup = this.f2067c) != null) {
                this.f2068e = z;
                s.a(viewGroup, z);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            this.f2069f = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f2069f) {
                t.f2131a.r(this.f2065a, this.f2066b);
                ViewGroup viewGroup = this.f2067c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.f2069f) {
                t.f2131a.r(this.f2065a, this.f2066b);
            }
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.f2069f) {
                t.f2131a.r(this.f2065a, 0);
            }
        }

        public final void onAnimationStart(Animator animator) {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2070a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2071b;

        /* renamed from: c  reason: collision with root package name */
        public int f2072c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f2073e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f2074f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (r9 == 0) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r0.f2073e == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r0.f2072c == 0) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static c1.a0.b N(c1.q r8, c1.q r9) {
        /*
            c1.a0$b r0 = new c1.a0$b
            r0.<init>()
            r1 = 0
            r0.f2070a = r1
            r0.f2071b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x002f
            java.util.HashMap r6 = r8.f2126a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x002f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f2072c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2073e = r6
            goto L_0x0033
        L_0x002f:
            r0.f2072c = r4
            r0.f2073e = r3
        L_0x0033:
            if (r9 == 0) goto L_0x0052
            java.util.HashMap r6 = r9.f2126a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x0052
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f2074f = r2
            goto L_0x0056
        L_0x0052:
            r0.d = r4
            r0.f2074f = r3
        L_0x0056:
            r2 = 1
            if (r8 == 0) goto L_0x007a
            if (r9 == 0) goto L_0x007a
            int r8 = r0.f2072c
            int r9 = r0.d
            if (r8 != r9) goto L_0x0068
            android.view.ViewGroup r3 = r0.f2073e
            android.view.ViewGroup r4 = r0.f2074f
            if (r3 != r4) goto L_0x0068
            return r0
        L_0x0068:
            if (r8 == r9) goto L_0x0070
            if (r8 != 0) goto L_0x006d
            goto L_0x0089
        L_0x006d:
            if (r9 != 0) goto L_0x008d
            goto L_0x0080
        L_0x0070:
            android.view.ViewGroup r8 = r0.f2074f
            if (r8 != 0) goto L_0x0075
            goto L_0x0089
        L_0x0075:
            android.view.ViewGroup r8 = r0.f2073e
            if (r8 != 0) goto L_0x008d
            goto L_0x0080
        L_0x007a:
            if (r8 != 0) goto L_0x0083
            int r8 = r0.d
            if (r8 != 0) goto L_0x0083
        L_0x0080:
            r0.f2071b = r2
            goto L_0x008b
        L_0x0083:
            if (r9 != 0) goto L_0x008d
            int r8 = r0.f2072c
            if (r8 != 0) goto L_0x008d
        L_0x0089:
            r0.f2071b = r1
        L_0x008b:
            r0.f2070a = r2
        L_0x008d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.a0.N(c1.q, c1.q):c1.a0$b");
    }

    public final void M(q qVar) {
        View view = qVar.f2127b;
        int visibility = view.getVisibility();
        HashMap hashMap = qVar.f2126a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public final void h(q qVar) {
        M(qVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: c1.a0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: c1.z} */
    /* JADX WARNING: type inference failed for: r16v4, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (N(s(r3, false), v(r3, false)).f2070a != false) goto L_0x0066;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator p(android.view.ViewGroup r22, c1.q r23, c1.q r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            c1.a0$b r4 = N(r23, r24)
            boolean r5 = r4.f2070a
            if (r5 == 0) goto L_0x02e2
            android.view.ViewGroup r5 = r4.f2073e
            if (r5 != 0) goto L_0x0018
            android.view.ViewGroup r5 = r4.f2074f
            if (r5 == 0) goto L_0x02e2
        L_0x0018:
            boolean r5 = r4.f2071b
            r7 = 1
            java.lang.String r8 = "android:fade:transitionAlpha"
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            if (r5 == 0) goto L_0x0068
            int r1 = r0.L
            r1 = r1 & r7
            if (r1 != r7) goto L_0x0066
            if (r3 != 0) goto L_0x002b
            goto L_0x0066
        L_0x002b:
            android.view.View r1 = r3.f2127b
            if (r2 != 0) goto L_0x0046
            android.view.ViewParent r3 = r1.getParent()
            android.view.View r3 = (android.view.View) r3
            c1.q r4 = r0.s(r3, r11)
            c1.q r3 = r0.v(r3, r11)
            c1.a0$b r3 = N(r4, r3)
            boolean r3 = r3.f2070a
            if (r3 == 0) goto L_0x0046
            goto L_0x0066
        L_0x0046:
            r3 = r0
            c1.d r3 = (c1.d) r3
            if (r2 == 0) goto L_0x005a
            java.util.HashMap r2 = r2.f2126a
            java.lang.Object r2 = r2.get(r8)
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 == 0) goto L_0x005a
            float r2 = r2.floatValue()
            goto L_0x005b
        L_0x005a:
            r2 = r9
        L_0x005b:
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r9 = r2
        L_0x0061:
            android.animation.ObjectAnimator r6 = r3.O(r1, r9, r10)
            goto L_0x0067
        L_0x0066:
            r6 = 0
        L_0x0067:
            return r6
        L_0x0068:
            int r4 = r4.d
            int r5 = r0.L
            r12 = 2
            r5 = r5 & r12
            if (r5 == r12) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            if (r2 != 0) goto L_0x0076
        L_0x0073:
            r4 = r0
            goto L_0x02e0
        L_0x0076:
            if (r3 == 0) goto L_0x007b
            android.view.View r3 = r3.f2127b
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            android.view.View r5 = r2.f2127b
            r13 = 2131362223(0x7f0a01af, float:1.834422E38)
            java.lang.Object r14 = r5.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x0092
            r0 = r2
            r19 = r4
            r20 = r8
            r2 = r10
            r3 = 0
            goto L_0x0228
        L_0x0092:
            if (r3 == 0) goto L_0x00a3
            android.view.ViewParent r14 = r3.getParent()
            if (r14 != 0) goto L_0x009b
            goto L_0x00a3
        L_0x009b:
            r14 = 4
            if (r4 != r14) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            if (r5 != r3) goto L_0x00a9
        L_0x00a1:
            r14 = 0
            goto L_0x00a7
        L_0x00a3:
            if (r3 == 0) goto L_0x00a9
            r14 = r3
            r3 = 0
        L_0x00a7:
            r15 = r11
            goto L_0x00ac
        L_0x00a9:
            r15 = r7
            r3 = 0
            r14 = 0
        L_0x00ac:
            if (r15 == 0) goto L_0x021b
            android.view.ViewParent r15 = r5.getParent()
            if (r15 != 0) goto L_0x00be
            r0 = r2
            r19 = r4
            r14 = r5
            r20 = r8
            r2 = r10
            r7 = r11
            goto L_0x0228
        L_0x00be:
            android.view.ViewParent r15 = r5.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L_0x021b
            android.view.ViewParent r15 = r5.getParent()
            android.view.View r15 = (android.view.View) r15
            c1.q r6 = r0.v(r15, r7)
            c1.q r13 = r0.s(r15, r7)
            c1.a0$b r6 = N(r6, r13)
            boolean r6 = r6.f2070a
            if (r6 != 0) goto L_0x0204
            boolean r6 = c1.p.f2123a
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r13 = r15.getScrollX()
            int r13 = -r13
            float r13 = (float) r13
            int r14 = r15.getScrollY()
            int r14 = -r14
            float r14 = (float) r14
            r6.setTranslate(r13, r14)
            c1.x r13 = c1.t.f2131a
            r13.V(r5, r6)
            r13.W(r1, r6)
            android.graphics.RectF r13 = new android.graphics.RectF
            int r14 = r5.getWidth()
            float r14 = (float) r14
            int r15 = r5.getHeight()
            float r15 = (float) r15
            r13.<init>(r9, r9, r14, r15)
            r6.mapRect(r13)
            float r14 = r13.left
            int r14 = java.lang.Math.round(r14)
            float r15 = r13.top
            int r15 = java.lang.Math.round(r15)
            float r9 = r13.right
            int r9 = java.lang.Math.round(r9)
            float r12 = r13.bottom
            int r12 = java.lang.Math.round(r12)
            android.widget.ImageView r11 = new android.widget.ImageView
            android.content.Context r10 = r5.getContext()
            r11.<init>(r10)
            android.widget.ImageView$ScaleType r10 = android.widget.ImageView.ScaleType.CENTER_CROP
            r11.setScaleType(r10)
            boolean r10 = c1.p.f2123a
            if (r10 == 0) goto L_0x0140
            boolean r10 = r5.isAttachedToWindow()
            r10 = r10 ^ r7
            boolean r16 = r22.isAttachedToWindow()
            goto L_0x0143
        L_0x0140:
            r10 = 0
            r16 = 0
        L_0x0143:
            boolean r17 = c1.p.f2124b
            if (r17 == 0) goto L_0x016c
            if (r10 == 0) goto L_0x016c
            if (r16 != 0) goto L_0x0154
            r18 = r3
            r19 = r4
            r20 = r8
            r0 = 0
            goto L_0x01e9
        L_0x0154:
            android.view.ViewParent r16 = r5.getParent()
            r7 = r16
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r16 = r7.indexOfChild(r5)
            r18 = r3
            android.view.ViewGroupOverlay r3 = r22.getOverlay()
            r3.add(r5)
            r3 = r16
            goto L_0x0170
        L_0x016c:
            r18 = r3
            r3 = 0
            r7 = 0
        L_0x0170:
            float r16 = r13.width()
            r19 = r4
            int r4 = java.lang.Math.round(r16)
            float r16 = r13.height()
            r20 = r8
            int r8 = java.lang.Math.round(r16)
            if (r4 <= 0) goto L_0x01da
            if (r8 <= 0) goto L_0x01da
            int r0 = r4 * r8
            float r0 = (float) r0
            r16 = 1233125376(0x49800000, float:1048576.0)
            float r0 = r16 / r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r2, r0)
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            float r8 = (float) r8
            float r8 = r8 * r0
            int r8 = java.lang.Math.round(r8)
            float r2 = r13.left
            float r2 = -r2
            float r13 = r13.top
            float r13 = -r13
            r6.postTranslate(r2, r13)
            r6.postScale(r0, r0)
            boolean r0 = c1.p.f2125c
            if (r0 == 0) goto L_0x01c8
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r2 = r0.beginRecording(r4, r8)
            r2.concat(r6)
            r5.draw(r2)
            r0.endRecording()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)
            goto L_0x01db
        L_0x01c8:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r8, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.concat(r6)
            r5.draw(r2)
            goto L_0x01db
        L_0x01da:
            r0 = 0
        L_0x01db:
            if (r17 == 0) goto L_0x01e9
            if (r10 == 0) goto L_0x01e9
            android.view.ViewGroupOverlay r2 = r22.getOverlay()
            r2.remove(r5)
            r7.addView(r5, r3)
        L_0x01e9:
            if (r0 == 0) goto L_0x01ee
            r11.setImageBitmap(r0)
        L_0x01ee:
            int r0 = r9 - r14
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r12 - r15
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r11.measure(r0, r2)
            r11.layout(r14, r15, r9, r12)
            r14 = r11
            goto L_0x0221
        L_0x0204:
            r18 = r3
            r19 = r4
            r20 = r8
            int r0 = r15.getId()
            android.view.ViewParent r2 = r15.getParent()
            if (r2 != 0) goto L_0x0221
            r2 = -1
            if (r0 == r2) goto L_0x0221
            r1.findViewById(r0)
            goto L_0x0221
        L_0x021b:
            r18 = r3
            r19 = r4
            r20 = r8
        L_0x0221:
            r0 = r23
            r3 = r18
            r2 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
        L_0x0228:
            java.util.HashMap r0 = r0.f2126a
            if (r14 == 0) goto L_0x02a0
            if (r7 != 0) goto L_0x0264
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r3 = r0.get(r3)
            int[] r3 = (int[]) r3
            r4 = 0
            r6 = r3[r4]
            r8 = 1
            r3 = r3[r8]
            r9 = 2
            int[] r9 = new int[r9]
            r1.getLocationOnScreen(r9)
            r4 = r9[r4]
            int r6 = r6 - r4
            int r4 = r14.getLeft()
            int r6 = r6 - r4
            r14.offsetLeftAndRight(r6)
            r4 = r9[r8]
            int r3 = r3 - r4
            int r4 = r14.getTop()
            int r3 = r3 - r4
            r14.offsetTopAndBottom(r3)
            c1.r r3 = new c1.r
            r3.<init>((android.view.ViewGroup) r1)
            java.lang.Object r3 = r3.f2129o
            android.view.ViewGroupOverlay r3 = (android.view.ViewGroupOverlay) r3
            r3.add(r14)
        L_0x0264:
            r4 = r21
            r3 = r4
            c1.d r3 = (c1.d) r3
            c1.x r6 = c1.t.f2131a
            r6.getClass()
            r6 = r20
            java.lang.Object r0 = r0.get(r6)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L_0x027d
            float r10 = r0.floatValue()
            goto L_0x027e
        L_0x027d:
            r10 = r2
        L_0x027e:
            r0 = 0
            android.animation.ObjectAnimator r6 = r3.O(r14, r10, r0)
            if (r7 != 0) goto L_0x02e1
            if (r6 != 0) goto L_0x0294
            c1.r r0 = new c1.r
            r0.<init>((android.view.ViewGroup) r1)
            java.lang.Object r0 = r0.f2129o
            android.view.ViewGroupOverlay r0 = (android.view.ViewGroupOverlay) r0
            r0.remove(r14)
            goto L_0x02e1
        L_0x0294:
            r0 = 2131362223(0x7f0a01af, float:1.834422E38)
            r5.setTag(r0, r14)
            c1.z r0 = new c1.z
            r0.<init>(r4, r1, r14, r5)
            goto L_0x02d8
        L_0x02a0:
            r4 = r21
            r6 = r20
            if (r3 == 0) goto L_0x02e0
            int r1 = r3.getVisibility()
            c1.x r5 = c1.t.f2131a
            r7 = 0
            r5.r(r3, r7)
            r7 = r4
            c1.d r7 = (c1.d) r7
            r5.getClass()
            java.lang.Object r0 = r0.get(r6)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L_0x02c3
            float r10 = r0.floatValue()
            goto L_0x02c4
        L_0x02c3:
            r10 = r2
        L_0x02c4:
            r0 = 0
            android.animation.ObjectAnimator r6 = r7.O(r3, r10, r0)
            if (r6 == 0) goto L_0x02dc
            c1.a0$a r0 = new c1.a0$a
            r1 = r19
            r0.<init>(r3, r1)
            r6.addListener(r0)
            r6.addPauseListener(r0)
        L_0x02d8:
            r4.c(r0)
            goto L_0x02e1
        L_0x02dc:
            r5.r(r3, r1)
            goto L_0x02e1
        L_0x02e0:
            r6 = 0
        L_0x02e1:
            return r6
        L_0x02e2:
            r4 = r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.a0.p(android.view.ViewGroup, c1.q, c1.q):android.animation.Animator");
    }

    public final String[] u() {
        return M;
    }

    public final boolean w(q qVar, q qVar2) {
        if (qVar == null && qVar2 == null) {
            return false;
        }
        if (qVar != null && qVar2 != null && qVar2.f2126a.containsKey("android:visibility:visibility") != qVar.f2126a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b N = N(qVar, qVar2);
        if (N.f2070a) {
            return N.f2072c == 0 || N.d == 0;
        }
        return false;
    }
}
