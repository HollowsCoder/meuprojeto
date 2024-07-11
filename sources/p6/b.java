package p6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.a;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f7929a;

    public b(a aVar) {
        this.f7929a = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7929a.f7937a.setEndIconVisible(false);
    }
}
