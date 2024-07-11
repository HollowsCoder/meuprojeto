package t1;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import androidx.databinding.a;
import h1.f;
import java.util.Iterator;

public final class d extends a implements Choreographer.FrameCallback {

    /* renamed from: q  reason: collision with root package name */
    public float f8877q = 1.0f;

    /* renamed from: r  reason: collision with root package name */
    public boolean f8878r = false;

    /* renamed from: s  reason: collision with root package name */
    public long f8879s = 0;

    /* renamed from: t  reason: collision with root package name */
    public float f8880t = 0.0f;
    public int u = 0;

    /* renamed from: v  reason: collision with root package name */
    public float f8881v = -2.14748365E9f;
    public float w = 2.14748365E9f;

    /* renamed from: x  reason: collision with root package name */
    public f f8882x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f8883y = false;

    public final void cancel() {
        Iterator it = this.f8874p.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        j(true);
    }

    public final void doFrame(long j8) {
        boolean z;
        float f10;
        float f11;
        if (this.f8883y) {
            j(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        f fVar = this.f8882x;
        if (fVar != null && this.f8883y) {
            long j10 = this.f8879s;
            long j11 = 0;
            if (j10 != 0) {
                j11 = j8 - j10;
            }
            float abs = ((float) j11) / ((1.0E9f / fVar.f5127m) / Math.abs(this.f8877q));
            float f12 = this.f8880t;
            if (i()) {
                abs = -abs;
            }
            float f13 = f12 + abs;
            this.f8880t = f13;
            float h10 = h();
            float e10 = e();
            PointF pointF = f.f8885a;
            if (f13 < h10 || f13 > e10) {
                z = false;
            } else {
                z = true;
            }
            boolean z10 = !z;
            this.f8880t = f.b(this.f8880t, h(), e());
            this.f8879s = j8;
            d();
            if (z10) {
                if (getRepeatCount() == -1 || this.u < getRepeatCount()) {
                    Iterator it = this.f8874p.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.u++;
                    if (getRepeatMode() == 2) {
                        this.f8878r = !this.f8878r;
                        this.f8877q = -this.f8877q;
                    } else {
                        if (i()) {
                            f10 = e();
                        } else {
                            f10 = h();
                        }
                        this.f8880t = f10;
                    }
                    this.f8879s = j8;
                } else {
                    if (this.f8877q < 0.0f) {
                        f11 = h();
                    } else {
                        f11 = e();
                    }
                    this.f8880t = f11;
                    j(true);
                    c(i());
                }
            }
            if (this.f8882x != null) {
                float f14 = this.f8880t;
                if (f14 < this.f8881v || f14 > this.w) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f8881v), Float.valueOf(this.w), Float.valueOf(this.f8880t)}));
                }
            }
            a.n();
        }
    }

    public final float e() {
        f fVar = this.f8882x;
        if (fVar == null) {
            return 0.0f;
        }
        float f10 = this.w;
        if (f10 == 2.14748365E9f) {
            return fVar.l;
        }
        return f10;
    }

    public final float getAnimatedFraction() {
        float f10;
        float h10;
        if (this.f8882x == null) {
            return 0.0f;
        }
        if (i()) {
            f10 = e();
            h10 = this.f8880t;
        } else {
            f10 = this.f8880t;
            h10 = h();
        }
        return (f10 - h10) / (e() - h());
    }

    public final Object getAnimatedValue() {
        float f10;
        f fVar = this.f8882x;
        if (fVar == null) {
            f10 = 0.0f;
        } else {
            float f11 = this.f8880t;
            float f12 = fVar.f5126k;
            f10 = (f11 - f12) / (fVar.l - f12);
        }
        return Float.valueOf(f10);
    }

    public final long getDuration() {
        f fVar = this.f8882x;
        if (fVar == null) {
            return 0;
        }
        return (long) fVar.b();
    }

    public final float h() {
        f fVar = this.f8882x;
        if (fVar == null) {
            return 0.0f;
        }
        float f10 = this.f8881v;
        if (f10 == -2.14748365E9f) {
            return fVar.f5126k;
        }
        return f10;
    }

    public final boolean i() {
        return this.f8877q < 0.0f;
    }

    public final boolean isRunning() {
        return this.f8883y;
    }

    public final void j(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f8883y = false;
        }
    }

    public final void k(float f10) {
        if (this.f8880t != f10) {
            this.f8880t = f.b(f10, h(), e());
            this.f8879s = 0;
            d();
        }
    }

    public final void l(float f10, float f11) {
        float f12;
        float f13;
        if (f10 <= f11) {
            f fVar = this.f8882x;
            if (fVar == null) {
                f12 = -3.4028235E38f;
            } else {
                f12 = fVar.f5126k;
            }
            if (fVar == null) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = fVar.l;
            }
            this.f8881v = f.b(f10, f12, f13);
            this.w = f.b(f11, f12, f13);
            k((float) ((int) f.b(this.f8880t, f10, f11)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f10), Float.valueOf(f11)}));
    }

    public final void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 != 2 && this.f8878r) {
            this.f8878r = false;
            this.f8877q = -this.f8877q;
        }
    }
}
