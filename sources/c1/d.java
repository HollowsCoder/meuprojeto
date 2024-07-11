package c1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;

public final class d extends a0 {

    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f2086a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2087b = false;

        public a(View view) {
            this.f2086a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            x xVar = t.f2131a;
            View view = this.f2086a;
            xVar.U(view, 1.0f);
            if (this.f2087b) {
                view.setLayerType(0, (Paint) null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            View view = this.f2086a;
            if (w.d.h(view) && view.getLayerType() == 0) {
                this.f2087b = true;
                view.setLayerType(2, (Paint) null);
            }
        }
    }

    public d(int i10) {
        if ((i10 & -4) == 0) {
            this.L = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public final ObjectAnimator O(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        t.f2131a.U(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, t.f2132b, new float[]{f11});
        ofFloat.addListener(new a(view));
        c(new c(view));
        return ofFloat;
    }

    public final void k(q qVar) {
        M(qVar);
        qVar.f2126a.put("android:fade:transitionAlpha", Float.valueOf(t.f2131a.T(qVar.f2127b)));
    }
}
