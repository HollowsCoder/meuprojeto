package r6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExpandableTransformationBehavior f8440a;

    public a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f8440a = expandableTransformationBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f8440a.f3682b = null;
    }
}
