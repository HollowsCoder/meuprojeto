package u0;

import android.view.animation.Interpolator;

public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f9038a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9039b;

    public d(float[] fArr) {
        this.f9038a = fArr;
        this.f9039b = 1.0f / ((float) (fArr.length - 1));
    }

    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f9038a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f10), fArr.length - 2);
        float f11 = this.f9039b;
        float f12 = fArr[min];
        return b0.d.a(fArr[min + 1], f12, (f10 - (((float) min) * f11)) / f11, f12);
    }
}
