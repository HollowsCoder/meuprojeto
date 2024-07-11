package i0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: o  reason: collision with root package name */
    public final View f6001o;

    /* renamed from: p  reason: collision with root package name */
    public ViewTreeObserver f6002p;

    /* renamed from: q  reason: collision with root package name */
    public final Runnable f6003q;

    public r(ViewGroup viewGroup, Runnable runnable) {
        this.f6001o = viewGroup;
        this.f6002p = viewGroup.getViewTreeObserver();
        this.f6003q = runnable;
    }

    public static void a(ViewGroup viewGroup, Runnable runnable) {
        if (viewGroup == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            r rVar = new r(viewGroup, runnable);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(rVar);
            viewGroup.addOnAttachStateChangeListener(rVar);
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive = this.f6002p.isAlive();
        View view = this.f6001o;
        if (isAlive) {
            viewTreeObserver = this.f6002p;
        } else {
            viewTreeObserver = view.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
        this.f6003q.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f6002p = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f6002p.isAlive();
        View view2 = this.f6001o;
        (isAlive ? this.f6002p : view2.getViewTreeObserver()).removeOnPreDrawListener(this);
        view2.removeOnAttachStateChangeListener(this);
    }
}
