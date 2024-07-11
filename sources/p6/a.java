package p6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.a f7928a;

    public a(com.google.android.material.textfield.a aVar) {
        this.f7928a = aVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.f7928a.f7937a.setEndIconVisible(true);
    }
}
