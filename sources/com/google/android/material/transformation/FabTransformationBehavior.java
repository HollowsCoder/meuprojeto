package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.d;
import n.e;
import s5.g;
import s5.h;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3683c = new Rect();
    public final RectF d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f3684e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f3685f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public float f3686g;

    /* renamed from: h  reason: collision with root package name */
    public float f3687h;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3688a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f3689b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f3690c;

        public a(boolean z, View view, View view2) {
            this.f3688a = z;
            this.f3689b = view;
            this.f3690c = view2;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f3688a) {
                this.f3689b.setVisibility(4);
                View view = this.f3690c;
                view.setAlpha(1.0f);
                view.setVisibility(0);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f3688a) {
                this.f3689b.setVisibility(0);
                View view = this.f3690c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f3691a;

        /* renamed from: b  reason: collision with root package name */
        public e f3692b;
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static Pair u(float f10, float f11, boolean z, b bVar) {
        String str;
        g gVar;
        h hVar;
        int i10;
        if (f10 == 0.0f || f11 == 0.0f) {
            hVar = bVar.f3691a.d("translationXLinear");
            gVar = bVar.f3691a;
            str = "translationYLinear";
        } else if ((!z || f11 >= 0.0f) && (z || i10 <= 0)) {
            hVar = bVar.f3691a.d("translationXCurveDownwards");
            gVar = bVar.f3691a;
            str = "translationYCurveDownwards";
        } else {
            hVar = bVar.f3691a.d("translationXCurveUpwards");
            gVar = bVar.f3691a;
            str = "translationYCurveUpwards";
        }
        return new Pair(hVar, gVar.d(str));
    }

    public static float x(b bVar, h hVar, float f10) {
        long j8 = hVar.f8797a;
        h d10 = bVar.f3691a.d("expansion");
        float interpolation = hVar.b().getInterpolation(((float) (((d10.f8797a + d10.f8798b) + 17) - j8)) / ((float) hVar.f8798b));
        LinearInterpolator linearInterpolator = s5.a.f8784a;
        return d.a(0.0f, f10, interpolation, f10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r4 = ((com.google.android.material.floatingactionbutton.FloatingActionButton) r4).getExpandedComponentIdHint();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.view.View r3, android.view.View r4) {
        /*
            r2 = this;
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x001e
            boolean r0 = r4 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r0 == 0) goto L_0x001c
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            int r4 = r4.getExpandedComponentIdHint()
            if (r4 == 0) goto L_0x001a
            int r3 = r3.getId()
            if (r4 != r3) goto L_0x001c
        L_0x001a:
            r3 = 1
            goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            return r3
        L_0x001e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.b(android.view.View, android.view.View):boolean");
    }

    public final void c(CoordinatorLayout.f fVar) {
        if (fVar.f948h == 0) {
            fVar.f948h = 80;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03fc A[LOOP:1: B:114:0x03fa->B:115:0x03fc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x037c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet t(android.view.View r25, android.view.View r26, boolean r27, boolean r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            android.content.Context r4 = r26.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$b r4 = r0.z(r4, r3)
            if (r3 == 0) goto L_0x001e
            float r5 = r25.getTranslationX()
            r0.f3686g = r5
            float r5 = r25.getTranslationY()
            r0.f3687h = r5
        L_0x001e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.WeakHashMap<android.view.View, i0.b0> r7 = i0.w.f6004a
            float r7 = i0.w.i.i(r26)
            float r8 = i0.w.i.i(r25)
            float r7 = r7 - r8
            r8 = 0
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L_0x0049
            if (r28 != 0) goto L_0x003e
            float r7 = -r7
            r2.setTranslationZ(r7)
        L_0x003e:
            android.util.Property r7 = android.view.View.TRANSLATION_Z
            float[] r11 = new float[r9]
            r11[r10] = r8
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r7, r11)
            goto L_0x0054
        L_0x0049:
            android.util.Property r11 = android.view.View.TRANSLATION_Z
            float[] r12 = new float[r9]
            float r7 = -r7
            r12[r10] = r7
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r11, r12)
        L_0x0054:
            s5.g r11 = r4.f3691a
            java.lang.String r12 = "elevation"
            s5.h r11 = r11.d(r12)
            r11.a(r7)
            r5.add(r7)
            android.graphics.RectF r7 = r0.d
            n.e r11 = r4.f3692b
            float r11 = r0.v(r1, r2, r11)
            n.e r12 = r4.f3692b
            float r12 = r0.w(r1, r2, r12)
            android.util.Pair r13 = u(r11, r12, r3, r4)
            java.lang.Object r14 = r13.first
            s5.h r14 = (s5.h) r14
            java.lang.Object r13 = r13.second
            s5.h r13 = (s5.h) r13
            android.graphics.RectF r15 = r0.f3684e
            android.graphics.Rect r8 = r0.f3683c
            if (r3 == 0) goto L_0x00c8
            if (r28 != 0) goto L_0x008c
            float r10 = -r11
            r2.setTranslationX(r10)
            float r10 = -r12
            r2.setTranslationY(r10)
        L_0x008c:
            android.util.Property r10 = android.view.View.TRANSLATION_X
            r18 = r6
            float[] r6 = new float[r9]
            r16 = 0
            r17 = 0
            r6[r17] = r16
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r10, r6)
            android.util.Property r10 = android.view.View.TRANSLATION_Y
            r19 = r6
            float[] r6 = new float[r9]
            r6[r17] = r16
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r10, r6)
            float r10 = -r11
            float r11 = -r12
            float r10 = x(r4, r14, r10)
            float r11 = x(r4, r13, r11)
            r2.getWindowVisibleDisplayFrame(r8)
            r7.set(r8)
            r0.y(r2, r15)
            r15.offset(r10, r11)
            r15.intersect(r7)
            r7.set(r15)
            r10 = r6
            r6 = r19
            goto L_0x00e2
        L_0x00c8:
            r18 = r6
            android.util.Property r6 = android.view.View.TRANSLATION_X
            float[] r10 = new float[r9]
            float r11 = -r11
            r17 = 0
            r10[r17] = r11
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r6, r10)
            android.util.Property r10 = android.view.View.TRANSLATION_Y
            float[] r11 = new float[r9]
            float r12 = -r12
            r11[r17] = r12
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r2, r10, r11)
        L_0x00e2:
            r14.a(r6)
            r13.a(r10)
            r5.add(r6)
            r5.add(r10)
            float r6 = r7.width()
            float r10 = r7.height()
            n.e r11 = r4.f3692b
            float r11 = r0.v(r1, r2, r11)
            n.e r12 = r4.f3692b
            float r12 = r0.w(r1, r2, r12)
            android.util.Pair r13 = u(r11, r12, r3, r4)
            java.lang.Object r14 = r13.first
            s5.h r14 = (s5.h) r14
            java.lang.Object r13 = r13.second
            s5.h r13 = (s5.h) r13
            r19 = r11
            android.util.Property r11 = android.view.View.TRANSLATION_X
            r20 = r12
            float[] r12 = new float[r9]
            if (r3 == 0) goto L_0x011b
            r9 = r19
            goto L_0x011d
        L_0x011b:
            float r9 = r0.f3686g
        L_0x011d:
            r17 = 0
            r12[r17] = r9
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r1, r11, r12)
            android.util.Property r11 = android.view.View.TRANSLATION_Y
            r21 = r10
            r12 = 1
            float[] r10 = new float[r12]
            if (r3 == 0) goto L_0x0131
            r12 = r20
            goto L_0x0133
        L_0x0131:
            float r12 = r0.f3687h
        L_0x0133:
            r10[r17] = r12
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r1, r11, r10)
            r14.a(r9)
            r13.a(r10)
            r5.add(r9)
            r5.add(r10)
            boolean r9 = r2 instanceof b6.d
            if (r9 == 0) goto L_0x01a7
            boolean r10 = r1 instanceof android.widget.ImageView
            if (r10 != 0) goto L_0x014e
            goto L_0x01a7
        L_0x014e:
            r10 = r2
            b6.d r10 = (b6.d) r10
            r11 = r1
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            android.graphics.drawable.Drawable r11 = r11.getDrawable()
            if (r11 != 0) goto L_0x015b
            goto L_0x01a7
        L_0x015b:
            r11.mutate()
            r12 = 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x0177
            if (r28 != 0) goto L_0x0167
            r11.setAlpha(r12)
        L_0x0167:
            s5.d r12 = s5.d.f8790a
            r13 = 1
            int[] r14 = new int[r13]
            r17 = 0
            r14[r17] = r17
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofInt(r11, r12, r14)
            r20 = r6
            goto L_0x0186
        L_0x0177:
            r13 = 1
            r17 = 0
            s5.d r14 = s5.d.f8790a
            r20 = r6
            int[] r6 = new int[r13]
            r6[r17] = r12
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofInt(r11, r14, r6)
        L_0x0186:
            com.google.android.material.transformation.a r6 = new com.google.android.material.transformation.a
            r6.<init>(r2)
            r12.addUpdateListener(r6)
            s5.g r6 = r4.f3691a
            java.lang.String r13 = "iconFade"
            s5.h r6 = r6.d(r13)
            r6.a(r12)
            r5.add(r12)
            com.google.android.material.transformation.b r6 = new com.google.android.material.transformation.b
            r6.<init>(r10, r11)
            r10 = r18
            r10.add(r6)
            goto L_0x01ab
        L_0x01a7:
            r20 = r6
            r10 = r18
        L_0x01ab:
            if (r9 != 0) goto L_0x01b3
            r23 = r4
            r15 = r9
            r1 = r10
            goto L_0x031c
        L_0x01b3:
            r6 = r2
            b6.d r6 = (b6.d) r6
            n.e r11 = r4.f3692b
            r0.y(r1, r7)
            float r12 = r0.f3686g
            float r13 = r0.f3687h
            r7.offset(r12, r13)
            r0.y(r2, r15)
            float r11 = r0.v(r1, r2, r11)
            float r11 = -r11
            r12 = 0
            r15.offset(r11, r12)
            float r11 = r7.centerX()
            float r12 = r15.left
            float r11 = r11 - r12
            n.e r12 = r4.f3692b
            r0.y(r1, r7)
            float r13 = r0.f3686g
            float r14 = r0.f3687h
            r7.offset(r13, r14)
            r0.y(r2, r15)
            float r12 = r0.w(r1, r2, r12)
            float r12 = -r12
            r13 = 0
            r15.offset(r13, r12)
            float r7 = r7.centerY()
            float r12 = r15.top
            float r7 = r7 - r12
            r12 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r12 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r12
            boolean r13 = i0.w.g.c(r12)
            if (r13 == 0) goto L_0x020c
            int r13 = r12.getWidth()
            int r14 = r12.getHeight()
            r15 = 0
            r8.set(r15, r15, r13, r14)
            r12.k(r8)
        L_0x020c:
            int r8 = r8.width()
            float r8 = (float) r8
            r12 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r12
            s5.g r12 = r4.f3691a
            java.lang.String r13 = "expansion"
            s5.h r12 = r12.d(r13)
            if (r3 == 0) goto L_0x029b
            if (r28 != 0) goto L_0x0228
            b6.d$d r15 = new b6.d$d
            r15.<init>(r11, r7, r8)
            r6.setRevealInfo(r15)
        L_0x0228:
            if (r28 == 0) goto L_0x0230
            b6.d$d r8 = r6.getRevealInfo()
            float r8 = r8.f1965c
        L_0x0230:
            r15 = 0
            float r13 = r15 - r11
            float r14 = r15 - r7
            double r0 = (double) r13
            double r13 = (double) r14
            r15 = r9
            r18 = r10
            double r9 = java.lang.Math.hypot(r0, r13)
            float r9 = (float) r9
            float r10 = r20 - r11
            r20 = r4
            double r3 = (double) r10
            double r13 = java.lang.Math.hypot(r3, r13)
            float r10 = (float) r13
            float r13 = r21 - r7
            double r13 = (double) r13
            double r3 = java.lang.Math.hypot(r3, r13)
            float r3 = (float) r3
            double r0 = java.lang.Math.hypot(r0, r13)
            float r0 = (float) r0
            int r1 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0263
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0263
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0263
            goto L_0x0274
        L_0x0263:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x026d
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x026d
            r9 = r10
            goto L_0x0274
        L_0x026d:
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0273
            r9 = r3
            goto L_0x0274
        L_0x0273:
            r9 = r0
        L_0x0274:
            android.animation.AnimatorSet r0 = b6.b.a(r6, r11, r7, r9)
            com.google.android.material.transformation.c r1 = new com.google.android.material.transformation.c
            r1.<init>(r6)
            r0.addListener(r1)
            long r3 = r12.f8797a
            int r1 = (int) r11
            int r7 = (int) r7
            r9 = 0
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0297
            android.animation.Animator r1 = android.view.ViewAnimationUtils.createCircularReveal(r2, r1, r7, r8, r8)
            r1.setStartDelay(r9)
            r1.setDuration(r3)
            r5.add(r1)
        L_0x0297:
            r23 = r20
            goto L_0x030c
        L_0x029b:
            r20 = r4
            r15 = r9
            r18 = r10
            b6.d$d r0 = r6.getRevealInfo()
            float r0 = r0.f1965c
            android.animation.AnimatorSet r1 = b6.b.a(r6, r11, r7, r8)
            long r3 = r12.f8797a
            int r9 = (int) r11
            int r7 = (int) r7
            r10 = 0
            int r13 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r13 <= 0) goto L_0x02c1
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r9, r7, r0, r0)
            r0.setStartDelay(r10)
            r0.setDuration(r3)
            r5.add(r0)
        L_0x02c1:
            r0 = r20
            s5.g r3 = r0.f3691a
            n.i<java.lang.String, s5.h> r3 = r3.f8795a
            int r4 = r3.f7333q
            r13 = r10
            r10 = 0
        L_0x02cb:
            if (r10 >= r4) goto L_0x02ef
            java.lang.Object r11 = r3.l(r10)
            s5.h r11 = (s5.h) r11
            r20 = r3
            r21 = r4
            long r3 = r11.f8797a
            r23 = r0
            r22 = r1
            long r0 = r11.f8798b
            long r3 = r3 + r0
            long r13 = java.lang.Math.max(r13, r3)
            int r10 = r10 + 1
            r3 = r20
            r4 = r21
            r1 = r22
            r0 = r23
            goto L_0x02cb
        L_0x02ef:
            r23 = r0
            r22 = r1
            long r0 = r12.f8797a
            long r3 = r12.f8798b
            long r0 = r0 + r3
            int r3 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x030a
            android.animation.Animator r3 = android.view.ViewAnimationUtils.createCircularReveal(r2, r9, r7, r8, r8)
            r3.setStartDelay(r0)
            long r13 = r13 - r0
            r3.setDuration(r13)
            r5.add(r3)
        L_0x030a:
            r0 = r22
        L_0x030c:
            r12.a(r0)
            r5.add(r0)
            b6.a r0 = new b6.a
            r0.<init>(r6)
            r1 = r18
            r1.add(r0)
        L_0x031c:
            if (r15 != 0) goto L_0x0323
            r6 = r27
            r3 = r23
            goto L_0x0377
        L_0x0323:
            r0 = r2
            b6.d r0 = (b6.d) r0
            java.util.WeakHashMap<android.view.View, i0.b0> r3 = i0.w.f6004a
            android.content.res.ColorStateList r3 = i0.w.i.g(r25)
            if (r3 == 0) goto L_0x033b
            int[] r4 = r25.getDrawableState()
            int r6 = r3.getDefaultColor()
            int r3 = r3.getColorForState(r4, r6)
            goto L_0x033c
        L_0x033b:
            r3 = 0
        L_0x033c:
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            r6 = r27
            if (r6 == 0) goto L_0x0356
            if (r28 != 0) goto L_0x0349
            r0.setCircularRevealScrimColor(r3)
        L_0x0349:
            b6.d$c r3 = b6.d.c.f1962a
            r7 = 1
            int[] r8 = new int[r7]
            r9 = 0
            r8[r9] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r3, r8)
            goto L_0x0362
        L_0x0356:
            r7 = 1
            r9 = 0
            b6.d$c r4 = b6.d.c.f1962a
            int[] r8 = new int[r7]
            r8[r9] = r3
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r4, r8)
        L_0x0362:
            s5.b r3 = s5.b.f8788a
            r0.setEvaluator(r3)
            r3 = r23
            s5.g r4 = r3.f3691a
            java.lang.String r7 = "color"
            s5.h r4 = r4.d(r7)
            r4.a(r0)
            r5.add(r0)
        L_0x0377:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x037c
            goto L_0x03a9
        L_0x037c:
            r4 = 2131362148(0x7f0a0164, float:1.8344068E38)
            android.view.View r4 = r2.findViewById(r4)
            r7 = 0
            if (r4 == 0) goto L_0x0387
            goto L_0x039f
        L_0x0387:
            boolean r4 = r2 instanceof r6.c
            if (r4 != 0) goto L_0x0396
            boolean r4 = r2 instanceof r6.b
            if (r4 == 0) goto L_0x0390
            goto L_0x0396
        L_0x0390:
            if (r0 == 0) goto L_0x03a7
            r7 = r2
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x03a7
        L_0x0396:
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4 = 0
            android.view.View r0 = r0.getChildAt(r4)
            r4 = r0
        L_0x039f:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x03a7
            r7 = r4
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
        L_0x03a7:
            if (r7 != 0) goto L_0x03ab
        L_0x03a9:
            r9 = 0
            goto L_0x03e3
        L_0x03ab:
            if (r6 == 0) goto L_0x03c8
            if (r28 != 0) goto L_0x03b9
            s5.c r0 = s5.c.f8789a
            r4 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r0.set(r7, r4)
        L_0x03b9:
            s5.c r0 = s5.c.f8789a
            r4 = 1
            float[] r4 = new float[r4]
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r4[r9] = r8
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r4)
            goto L_0x03d5
        L_0x03c8:
            r4 = 1
            r9 = 0
            s5.c r0 = s5.c.f8789a
            float[] r4 = new float[r4]
            r8 = 0
            r4[r9] = r8
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r4)
        L_0x03d5:
            s5.g r3 = r3.f3691a
            java.lang.String r4 = "contentFade"
            s5.h r3 = r3.d(r4)
            r3.a(r0)
            r5.add(r0)
        L_0x03e3:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            p9.u.o(r0, r5)
            com.google.android.material.transformation.FabTransformationBehavior$a r3 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r4 = r25
            r3.<init>(r6, r2, r4)
            r0.addListener(r3)
            int r2 = r1.size()
            r10 = r9
        L_0x03fa:
            if (r10 >= r2) goto L_0x0408
            java.lang.Object r3 = r1.get(r10)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            r0.addListener(r3)
            int r10 = r10 + 1
            goto L_0x03fa
        L_0x0408:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.t(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float v(View view, View view2, e eVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.f3684e;
        y(view, rectF);
        rectF.offset(this.f3686g, this.f3687h);
        y(view2, rectF2);
        eVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float w(View view, View view2, e eVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.f3684e;
        y(view, rectF);
        rectF.offset(this.f3686g, this.f3687h);
        y(view2, rectF2);
        eVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f3685f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public abstract b z(Context context, boolean z);
}
