package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p9.u;
import s5.h;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final h f3693c = new h(75);
    public final h d = new h(0);

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3694a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f3695b;

        public a(boolean z, View view) {
            this.f3694a = z;
            this.f3695b = view;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f3694a) {
                this.f3695b.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f3694a) {
                this.f3695b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean b(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public final AnimatorSet t(View view, View view2, boolean z, boolean z10) {
        h hVar;
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        if (z) {
            hVar = this.f3693c;
        } else {
            hVar = this.d;
        }
        if (z) {
            if (!z10) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        hVar.a(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        u.o(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2));
        return animatorSet;
    }
}
