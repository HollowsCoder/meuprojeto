package androidx.fragment.app;

import android.animation.Animator;
import e0.b;

public final class f implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Animator f1149a;

    public f(Animator animator) {
        this.f1149a = animator;
    }

    public final void onCancel() {
        this.f1149a.end();
    }
}
