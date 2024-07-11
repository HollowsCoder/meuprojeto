package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import m6.i;
import m6.m;
import p9.u;

public class d {
    public static final u0.a E = s5.a.f8786c;
    public static final int[] F = {16842919, 16842910};
    public static final int[] G = {16843623, 16842908, 16842910};
    public static final int[] H = {16842908, 16842910};
    public static final int[] I = {16843623, 16842910};
    public static final int[] J = {16842910};
    public static final int[] K = new int[0];
    public final RectF A = new RectF();
    public final RectF B = new RectF();
    public final Matrix C = new Matrix();
    public g6.c D;

    /* renamed from: a  reason: collision with root package name */
    public i f3494a;

    /* renamed from: b  reason: collision with root package name */
    public m6.f f3495b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f3496c;
    public g6.a d;

    /* renamed from: e  reason: collision with root package name */
    public LayerDrawable f3497e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3498f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3499g = true;

    /* renamed from: h  reason: collision with root package name */
    public float f3500h;

    /* renamed from: i  reason: collision with root package name */
    public float f3501i;

    /* renamed from: j  reason: collision with root package name */
    public float f3502j;

    /* renamed from: k  reason: collision with root package name */
    public int f3503k;
    public s5.g l;

    /* renamed from: m  reason: collision with root package name */
    public s5.g f3504m;

    /* renamed from: n  reason: collision with root package name */
    public Animator f3505n;

    /* renamed from: o  reason: collision with root package name */
    public s5.g f3506o;

    /* renamed from: p  reason: collision with root package name */
    public s5.g f3507p;

    /* renamed from: q  reason: collision with root package name */
    public float f3508q;

    /* renamed from: r  reason: collision with root package name */
    public float f3509r = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    public int f3510s;

    /* renamed from: t  reason: collision with root package name */
    public int f3511t = 0;
    public ArrayList<Animator.AnimatorListener> u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f3512v;
    public ArrayList<e> w;

    /* renamed from: x  reason: collision with root package name */
    public final FloatingActionButton f3513x;

    /* renamed from: y  reason: collision with root package name */
    public final l6.b f3514y;
    public final Rect z = new Rect();

    public class a extends s5.f {
        public a() {
        }

        public final Object evaluate(float f10, Object obj, Object obj2) {
            d.this.f3509r = f10;
            float[] fArr = this.f8792a;
            ((Matrix) obj).getValues(fArr);
            float[] fArr2 = this.f8793b;
            ((Matrix) obj2).getValues(fArr2);
            for (int i10 = 0; i10 < 9; i10++) {
                float f11 = fArr2[i10];
                float f12 = fArr[i10];
                fArr2[i10] = b0.d.a(f11, f12, f10, f12);
            }
            Matrix matrix = this.f8794c;
            matrix.setValues(fArr2);
            return matrix;
        }
    }

    public class b extends h {
        public b(g6.d dVar) {
            super(dVar);
        }

        public final float a() {
            return 0.0f;
        }
    }

    public class c extends h {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f3515e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(g6.d dVar) {
            super(dVar);
            this.f3515e = dVar;
        }

        public final float a() {
            d dVar = this.f3515e;
            return dVar.f3500h + dVar.f3501i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d  reason: collision with other inner class name */
    public class C0035d extends h {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f3516e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0035d(g6.d dVar) {
            super(dVar);
            this.f3516e = dVar;
        }

        public final float a() {
            d dVar = this.f3516e;
            return dVar.f3500h + dVar.f3502j;
        }
    }

    public interface e {
        void a();

        void b();
    }

    public interface f {
    }

    public class g extends h {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f3517e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(g6.d dVar) {
            super(dVar);
            this.f3517e = dVar;
        }

        public final float a() {
            return this.f3517e.f3500h;
        }
    }

    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3518a;

        /* renamed from: b  reason: collision with root package name */
        public float f3519b;

        /* renamed from: c  reason: collision with root package name */
        public float f3520c;
        public final /* synthetic */ d d;

        public h(g6.d dVar) {
            this.d = dVar;
        }

        public abstract float a();

        public final void onAnimationEnd(Animator animator) {
            float f10 = (float) ((int) this.f3520c);
            m6.f fVar = this.d.f3495b;
            if (fVar != null) {
                fVar.i(f10);
            }
            this.f3518a = false;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f10;
            boolean z = this.f3518a;
            d dVar = this.d;
            if (!z) {
                m6.f fVar = dVar.f3495b;
                if (fVar == null) {
                    f10 = 0.0f;
                } else {
                    f10 = fVar.f7121o.f7142n;
                }
                this.f3519b = f10;
                this.f3520c = a();
                this.f3518a = true;
            }
            float f11 = this.f3519b;
            float animatedFraction = (float) ((int) ((valueAnimator.getAnimatedFraction() * (this.f3520c - f11)) + f11));
            m6.f fVar2 = dVar.f3495b;
            if (fVar2 != null) {
                fVar2.i(animatedFraction);
            }
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.f3513x = floatingActionButton;
        this.f3514y = bVar;
        h6.g gVar = new h6.g();
        g6.d dVar = (g6.d) this;
        gVar.a(F, c(new C0035d(dVar)));
        gVar.a(G, c(new c(dVar)));
        gVar.a(H, c(new c(dVar)));
        gVar.a(I, c(new c(dVar)));
        gVar.a(J, c(new g(dVar)));
        gVar.a(K, c(new b(dVar)));
        this.f3508q = floatingActionButton.getRotation();
    }

    public static ValueAnimator c(h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(E);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f3513x.getDrawable();
        if (drawable != null && this.f3510s != 0) {
            RectF rectF = this.A;
            RectF rectF2 = this.B;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float f11 = (float) this.f3510s;
            rectF2.set(0.0f, 0.0f, f11, f11);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f12 = ((float) this.f3510s) / 2.0f;
            matrix.postScale(f10, f10, f12, f12);
        }
    }

    public final AnimatorSet b(s5.g gVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f3513x;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, property, fArr);
        gVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_X, new float[]{f11});
        gVar.d("scale").a(ofFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            ofFloat2.setEvaluator(new g6.b());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_Y, new float[]{f11});
        gVar.d("scale").a(ofFloat3);
        if (i10 == 26) {
            ofFloat3.setEvaluator(new g6.b());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.C;
        a(f12, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new s5.e(), new a(), new Matrix[]{new Matrix(matrix)});
        gVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        u.o(animatorSet, arrayList);
        return animatorSet;
    }

    public float d() {
        throw null;
    }

    public void e(Rect rect) {
        int sizeDimension = this.f3498f ? (this.f3503k - this.f3513x.getSizeDimension()) / 2 : 0;
        float d10 = this.f3499g ? d() + this.f3502j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) d10));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (d10 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public void f(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        throw null;
    }

    public void g() {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i(int[] iArr) {
        throw null;
    }

    public void j(float f10, float f11, float f12) {
        throw null;
    }

    public final void k() {
        ArrayList<e> arrayList = this.w;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void l(ColorStateList colorStateList) {
        Drawable drawable = this.f3496c;
        if (drawable != null) {
            drawable.setTintList(k6.a.a(colorStateList));
        }
    }

    public final void m(i iVar) {
        this.f3494a = iVar;
        m6.f fVar = this.f3495b;
        if (fVar != null) {
            fVar.setShapeAppearanceModel(iVar);
        }
        Drawable drawable = this.f3496c;
        if (drawable instanceof m) {
            ((m) drawable).setShapeAppearanceModel(iVar);
        }
        g6.a aVar = this.d;
        if (aVar != null) {
            aVar.f4987o = iVar;
            aVar.invalidateSelf();
        }
    }

    public boolean n() {
        throw null;
    }

    public void o() {
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.graphics.drawable.LayerDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r8 = this;
            android.graphics.Rect r0 = r8.z
            r8.e(r0)
            android.graphics.drawable.LayerDrawable r1 = r8.f3497e
            java.lang.String r2 = "Didn't initialize content background"
            s6.a.o(r1, r2)
            boolean r1 = r8.n()
            if (r1 == 0) goto L_0x0023
            android.graphics.drawable.InsetDrawable r1 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.LayerDrawable r3 = r8.f3497e
            int r4 = r0.left
            int r5 = r0.top
            int r6 = r0.right
            int r7 = r0.bottom
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0025
        L_0x0023:
            android.graphics.drawable.LayerDrawable r1 = r8.f3497e
        L_0x0025:
            l6.b r2 = r8.f3514y
            com.google.android.material.floatingactionbutton.FloatingActionButton$b r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton.b) r2
            r2.a(r1)
            int r1 = r0.left
            int r3 = r0.top
            int r4 = r0.right
            int r0 = r0.bottom
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = com.google.android.material.floatingactionbutton.FloatingActionButton.this
            android.graphics.Rect r5 = r2.z
            r5.set(r1, r3, r4, r0)
            int r5 = r2.w
            int r1 = r1 + r5
            int r3 = r3 + r5
            int r4 = r4 + r5
            int r0 = r0 + r5
            r2.setPadding(r1, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.d.p():void");
    }
}
