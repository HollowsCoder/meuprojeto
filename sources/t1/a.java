package t1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class a extends ValueAnimator {

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArraySet f8873o = new CopyOnWriteArraySet();

    /* renamed from: p  reason: collision with root package name */
    public final CopyOnWriteArraySet f8874p = new CopyOnWriteArraySet();

    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f8874p.add(animatorListener);
    }

    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f8873o.add(animatorUpdateListener);
    }

    public final void c(boolean z) {
        Iterator it = this.f8874p.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final void d() {
        Iterator it = this.f8873o.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void removeAllListeners() {
        this.f8874p.clear();
    }

    public final void removeAllUpdateListeners() {
        this.f8873o.clear();
    }

    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f8874p.remove(animatorListener);
    }

    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f8873o.remove(animatorUpdateListener);
    }

    public final ValueAnimator setDuration(long j8) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public final void setStartDelay(long j8) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
