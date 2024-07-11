package g6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.karumi.dexter.R;
import java.util.ArrayList;
import m6.f;
import m6.i;
import y.a;

public final class d extends com.google.android.material.floatingactionbutton.d {

    public static class a extends f {
        public a(i iVar) {
            super(iVar);
        }

        public final boolean isStateful() {
            return true;
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        super(floatingActionButton, bVar);
    }

    public final float d() {
        return this.f3513x.getElevation();
    }

    public final void e(Rect rect) {
        boolean z;
        if (FloatingActionButton.this.f3482y) {
            super.e(rect);
            return;
        }
        boolean z10 = this.f3498f;
        int i10 = 0;
        FloatingActionButton floatingActionButton = this.f3513x;
        if (!z10 || floatingActionButton.getSizeDimension() >= this.f3503k) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i10 = (this.f3503k - floatingActionButton.getSizeDimension()) / 2;
        }
        rect.set(i10, i10, i10, i10);
    }

    public final void f(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        f r5 = r();
        this.f3495b = r5;
        r5.setTintList(colorStateList);
        if (mode != null) {
            this.f3495b.setTintMode(mode);
        }
        f fVar = this.f3495b;
        FloatingActionButton floatingActionButton = this.f3513x;
        fVar.h(floatingActionButton.getContext());
        if (i10 > 0) {
            Context context = floatingActionButton.getContext();
            i iVar = this.f3494a;
            iVar.getClass();
            a aVar = new a(iVar);
            Object obj = y.a.f9523a;
            int a10 = a.d.a(context, R.color.design_fab_stroke_top_outer_color);
            int a11 = a.d.a(context, R.color.design_fab_stroke_top_inner_color);
            int a12 = a.d.a(context, R.color.design_fab_stroke_end_inner_color);
            int a13 = a.d.a(context, R.color.design_fab_stroke_end_outer_color);
            aVar.f4982i = a10;
            aVar.f4983j = a11;
            aVar.f4984k = a12;
            aVar.l = a13;
            float f10 = (float) i10;
            if (aVar.f4981h != f10) {
                aVar.f4981h = f10;
                aVar.f4976b.setStrokeWidth(f10 * 1.3333f);
                aVar.f4986n = true;
                aVar.invalidateSelf();
            }
            if (colorStateList != null) {
                aVar.f4985m = colorStateList.getColorForState(aVar.getState(), aVar.f4985m);
            }
            aVar.f4988p = colorStateList;
            aVar.f4986n = true;
            aVar.invalidateSelf();
            this.d = aVar;
            a aVar2 = this.d;
            aVar2.getClass();
            f fVar2 = this.f3495b;
            fVar2.getClass();
            drawable = new LayerDrawable(new Drawable[]{aVar2, fVar2});
        } else {
            this.d = null;
            drawable = this.f3495b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(k6.a.a(colorStateList2), drawable, (Drawable) null);
        this.f3496c = rippleDrawable;
        this.f3497e = rippleDrawable;
    }

    public final void g() {
    }

    public final void h() {
        p();
    }

    public final void i(int[] iArr) {
    }

    public final void j(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.F, q(f10, f12));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.G, q(f10, f11));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.H, q(f10, f11));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.I, q(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        FloatingActionButton floatingActionButton = this.f3513x;
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", new float[]{f10}).setDuration(0));
        if (i10 <= 24) {
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
        }
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.d.E);
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.J, animatorSet);
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.K, q(0.0f, 0.0f));
        floatingActionButton.setStateListAnimator(stateListAnimator);
        if (n()) {
            p();
        }
    }

    public final void l(ColorStateList colorStateList) {
        Drawable drawable = this.f3496c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(k6.a.a(colorStateList));
        } else {
            super.l(colorStateList);
        }
    }

    public final boolean n() {
        boolean z;
        if (FloatingActionButton.this.f3482y) {
            return true;
        }
        if (!this.f3498f || this.f3513x.getSizeDimension() >= this.f3503k) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public final void o() {
    }

    public final AnimatorSet q(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.f3513x;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", new float[]{f10}).setDuration(0)).with(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{f11}).setDuration(100));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.d.E);
        return animatorSet;
    }

    public final f r() {
        i iVar = this.f3494a;
        iVar.getClass();
        return new a(iVar);
    }
}
