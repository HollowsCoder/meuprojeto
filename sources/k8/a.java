package k8;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import b0.d;
import com.theartofdev.edmodo.cropper.CropOverlayView;

public final class a extends Animation implements Animation.AnimationListener {

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f6720o;

    /* renamed from: p  reason: collision with root package name */
    public final CropOverlayView f6721p;

    /* renamed from: q  reason: collision with root package name */
    public final float[] f6722q = new float[8];

    /* renamed from: r  reason: collision with root package name */
    public final float[] f6723r = new float[8];

    /* renamed from: s  reason: collision with root package name */
    public final RectF f6724s = new RectF();

    /* renamed from: t  reason: collision with root package name */
    public final RectF f6725t = new RectF();
    public final float[] u = new float[9];

    /* renamed from: v  reason: collision with root package name */
    public final float[] f6726v = new float[9];
    public final RectF w = new RectF();

    /* renamed from: x  reason: collision with root package name */
    public final float[] f6727x = new float[8];

    /* renamed from: y  reason: collision with root package name */
    public final float[] f6728y = new float[9];

    public a(ImageView imageView, CropOverlayView cropOverlayView) {
        this.f6720o = imageView;
        this.f6721p = cropOverlayView;
        setDuration(300);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public final void applyTransformation(float f10, Transformation transformation) {
        float[] fArr;
        RectF rectF = this.w;
        RectF rectF2 = this.f6724s;
        float f11 = rectF2.left;
        RectF rectF3 = this.f6725t;
        rectF.left = d.a(rectF3.left, f11, f10, f11);
        float f12 = rectF2.top;
        rectF.top = d.a(rectF3.top, f12, f10, f12);
        float f13 = rectF2.right;
        rectF.right = d.a(rectF3.right, f13, f10, f13);
        float f14 = rectF2.bottom;
        rectF.bottom = d.a(rectF3.bottom, f14, f10, f14);
        CropOverlayView cropOverlayView = this.f6721p;
        cropOverlayView.setCropWindowRect(rectF);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            fArr = this.f6727x;
            if (i11 >= fArr.length) {
                break;
            }
            float f15 = this.f6722q[i11];
            fArr[i11] = d.a(this.f6723r[i11], f15, f10, f15);
            i11++;
        }
        ImageView imageView = this.f6720o;
        cropOverlayView.g(fArr, imageView.getWidth(), imageView.getHeight());
        while (true) {
            float[] fArr2 = this.f6728y;
            if (i10 < fArr2.length) {
                float f16 = this.u[i10];
                fArr2[i10] = d.a(this.f6726v[i10], f16, f10, f16);
                i10++;
            } else {
                Matrix imageMatrix = imageView.getImageMatrix();
                imageMatrix.setValues(fArr2);
                imageView.setImageMatrix(imageMatrix);
                imageView.invalidate();
                cropOverlayView.invalidate();
                return;
            }
        }
    }

    public final void onAnimationEnd(Animation animation) {
        this.f6720o.clearAnimation();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
