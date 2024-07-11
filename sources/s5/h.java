package s5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f8797a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final long f8798b = 300;

    /* renamed from: c  reason: collision with root package name */
    public final TimeInterpolator f8799c = null;
    public int d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f8800e = 1;

    public h(long j8) {
        this.f8797a = j8;
        this.f8798b = 150;
    }

    public h(long j8, long j10, TimeInterpolator timeInterpolator) {
        this.f8797a = j8;
        this.f8798b = j10;
        this.f8799c = timeInterpolator;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f8797a);
        animator.setDuration(this.f8798b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.d);
            valueAnimator.setRepeatMode(this.f8800e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f8799c;
        return timeInterpolator != null ? timeInterpolator : a.f8785b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f8797a == hVar.f8797a && this.f8798b == hVar.f8798b && this.d == hVar.d && this.f8800e == hVar.f8800e) {
            return b().getClass().equals(hVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f8797a;
        long j10 = this.f8798b;
        return ((((b().getClass().hashCode() + (((((int) (j8 ^ (j8 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.d) * 31) + this.f8800e;
    }

    public final String toString() {
        return "\n" + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f8797a + " duration: " + this.f8798b + " interpolator: " + b().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.f8800e + "}\n";
    }
}
