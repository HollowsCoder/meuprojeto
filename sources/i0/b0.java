package i0;

import android.animation.Animator;
import android.view.View;
import java.lang.ref.WeakReference;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<View> f5956a;

    public b0(View view) {
        this.f5956a = new WeakReference<>(view);
    }

    public final void a(float f10) {
        View view = this.f5956a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = this.f5956a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j8) {
        View view = this.f5956a.get();
        if (view != null) {
            view.animate().setDuration(j8);
        }
    }

    public final void d(c0 c0Var) {
        View view = this.f5956a.get();
        if (view == null) {
            return;
        }
        if (c0Var != null) {
            view.animate().setListener(new z(c0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public final void e(float f10) {
        View view = this.f5956a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
