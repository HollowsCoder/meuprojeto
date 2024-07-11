package com.theartofdev.edmodo.cropper;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.util.Arrays;

public class CropOverlayView extends View {
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public g H;
    public boolean I;
    public int J;
    public int K;
    public float L = (((float) this.J) / ((float) this.K));
    public CropImageView.d M;
    public CropImageView.c N;
    public final Rect O = new Rect();
    public boolean P;

    /* renamed from: o  reason: collision with root package name */
    public ScaleGestureDetector f4041o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4042p;

    /* renamed from: q  reason: collision with root package name */
    public final f f4043q = new f();

    /* renamed from: r  reason: collision with root package name */
    public a f4044r;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f4045s = new RectF();

    /* renamed from: t  reason: collision with root package name */
    public Paint f4046t;
    public Paint u;

    /* renamed from: v  reason: collision with root package name */
    public Paint f4047v;
    public Paint w;

    /* renamed from: x  reason: collision with root package name */
    public final Path f4048x = new Path();

    /* renamed from: y  reason: collision with root package name */
    public final float[] f4049y = new float[8];
    public final RectF z = new RectF();

    public interface a {
    }

    public class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public b() {
        }

        @TargetApi(11)
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            CropOverlayView cropOverlayView = CropOverlayView.this;
            RectF a10 = cropOverlayView.f4043q.a();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f10 = focusY - currentSpanY;
            float f11 = focusX - currentSpanX;
            float f12 = focusX + currentSpanX;
            float f13 = focusY + currentSpanY;
            if (f11 >= f12 || f10 > f13 || f11 < 0.0f) {
                return true;
            }
            f fVar = cropOverlayView.f4043q;
            if (f12 > Math.min(fVar.f4111e, fVar.f4115i / fVar.f4117k) || f10 < 0.0f || f13 > Math.min(fVar.f4112f, fVar.f4116j / fVar.l)) {
                return true;
            }
            a10.set(f11, f10, f12, f13);
            fVar.f4108a.set(a10);
            cropOverlayView.invalidate();
            return true;
        }
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static Paint e(int i10, float f10) {
        if (f10 <= 0.0f) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i10);
        paint.setStrokeWidth(f10);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    public final boolean a(RectF rectF) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        RectF rectF2 = rectF;
        float[] fArr = this.f4049y;
        float o10 = c.o(fArr);
        float q10 = c.q(fArr);
        float p10 = c.p(fArr);
        float m10 = c.m(fArr);
        if (fArr[0] == fArr[6] || fArr[1] == fArr[7]) {
            z10 = false;
        } else {
            z10 = true;
        }
        RectF rectF3 = this.z;
        if (!z10) {
            rectF3.set(o10, q10, p10, m10);
            return false;
        }
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float f17 = fArr[6];
        float f18 = fArr[7];
        if (f18 < f14) {
            f10 = fArr[3];
            if (f14 < f10) {
                float f19 = fArr[2];
                f11 = f17;
                f14 = f16;
                f17 = f19;
                f16 = f18;
                f13 = f15;
            } else {
                f17 = f13;
                f13 = fArr[2];
                f11 = f15;
                float f20 = f10;
                f10 = f14;
                f14 = f20;
            }
        } else {
            float f21 = fArr[3];
            if (f14 > f21) {
                f11 = fArr[2];
                f16 = f21;
                f10 = f18;
            } else {
                f11 = f13;
                f13 = f17;
                f17 = f15;
                f10 = f16;
                f16 = f14;
                f14 = f18;
            }
        }
        float f22 = (f14 - f16) / (f13 - f11);
        float f23 = -1.0f / f22;
        float f24 = f16 - (f22 * f11);
        float f25 = f16 - (f11 * f23);
        float f26 = f10 - (f22 * f17);
        float f27 = f10 - (f17 * f23);
        float centerY = rectF.centerY() - rectF2.top;
        float centerX = rectF.centerX();
        float f28 = rectF2.left;
        float f29 = centerY / (centerX - f28);
        float f30 = -f29;
        float f31 = rectF2.top;
        float f32 = f31 - (f28 * f29);
        RectF rectF4 = rectF3;
        float f33 = rectF2.right;
        float f34 = f31 - (f30 * f33);
        float f35 = f22 - f29;
        float f36 = (f32 - f24) / f35;
        if (f36 < f33) {
            f12 = f36;
        } else {
            f12 = o10;
        }
        float max = Math.max(o10, f12);
        float f37 = (f32 - f25) / (f23 - f29);
        if (f37 >= rectF2.right) {
            f37 = max;
        }
        float max2 = Math.max(max, f37);
        float f38 = f23 - f30;
        float f39 = (f34 - f27) / f38;
        float f40 = m10;
        if (f39 >= rectF2.right) {
            f39 = max2;
        }
        float max3 = Math.max(max2, f39);
        float f41 = (f34 - f25) / f38;
        if (f41 <= rectF2.left) {
            f41 = p10;
        }
        float min = Math.min(p10, f41);
        float f42 = (f34 - f26) / (f22 - f30);
        if (f42 <= rectF2.left) {
            f42 = min;
        }
        float min2 = Math.min(min, f42);
        float f43 = (f32 - f26) / f35;
        if (f43 <= rectF2.left) {
            f43 = min2;
        }
        float min3 = Math.min(min2, f43);
        float max4 = Math.max(q10, Math.max((f22 * max3) + f24, (f23 * min3) + f25));
        float min4 = Math.min(f40, Math.min((f23 * max3) + f27, (f22 * min3) + f26));
        RectF rectF5 = rectF4;
        rectF5.left = max3;
        rectF5.top = max4;
        rectF5.right = min3;
        rectF5.bottom = min4;
        return true;
    }

    public final void b(boolean z10) {
        try {
            a aVar = this.f4044r;
            if (aVar != null) {
                CropImageView.a aVar2 = (CropImageView.a) aVar;
                aVar2.getClass();
                int i10 = CropImageView.f4023a0;
                CropImageView.this.c(z10, true);
            }
        } catch (Exception e10) {
            Log.e("AIC", "Exception in crop window changed", e10);
        }
    }

    public final void c(Canvas canvas) {
        if (this.f4047v != null) {
            Paint paint = this.f4046t;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            RectF a10 = this.f4043q.a();
            a10.inset(strokeWidth, strokeWidth);
            float width = a10.width() / 3.0f;
            float height = a10.height() / 3.0f;
            if (this.N == CropImageView.c.OVAL) {
                float width2 = (a10.width() / 2.0f) - strokeWidth;
                float height2 = (a10.height() / 2.0f) - strokeWidth;
                float f10 = a10.left + width;
                float f11 = a10.right - width;
                float sin = (float) (Math.sin(Math.acos((double) ((width2 - width) / width2))) * ((double) height2));
                canvas.drawLine(f10, (a10.top + height2) - sin, f10, (a10.bottom - height2) + sin, this.f4047v);
                canvas.drawLine(f11, (a10.top + height2) - sin, f11, (a10.bottom - height2) + sin, this.f4047v);
                float f12 = a10.top + height;
                float f13 = a10.bottom - height;
                float cos = (float) (Math.cos(Math.asin((double) ((height2 - height) / height2))) * ((double) width2));
                canvas.drawLine((a10.left + width2) - cos, f12, (a10.right - width2) + cos, f12, this.f4047v);
                canvas.drawLine((a10.left + width2) - cos, f13, (a10.right - width2) + cos, f13, this.f4047v);
                return;
            }
            float f14 = a10.left + width;
            float f15 = a10.right - width;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f14, a10.top, f14, a10.bottom, this.f4047v);
            canvas.drawLine(f15, a10.top, f15, a10.bottom, this.f4047v);
            float f16 = a10.top + height;
            float f17 = a10.bottom - height;
            canvas2.drawLine(a10.left, f16, a10.right, f16, this.f4047v);
            canvas.drawLine(a10.left, f17, a10.right, f17, this.f4047v);
        }
    }

    public final void d(RectF rectF) {
        float width = rectF.width();
        f fVar = this.f4043q;
        if (width < Math.max(fVar.f4110c, fVar.f4113g / fVar.f4117k)) {
            float max = (Math.max(fVar.f4110c, fVar.f4113g / fVar.f4117k) - rectF.width()) / 2.0f;
            rectF.left -= max;
            rectF.right += max;
        }
        if (rectF.height() < Math.max(fVar.d, fVar.f4114h / fVar.l)) {
            float max2 = (Math.max(fVar.d, fVar.f4114h / fVar.l) - rectF.height()) / 2.0f;
            rectF.top -= max2;
            rectF.bottom += max2;
        }
        if (rectF.width() > Math.min(fVar.f4111e, fVar.f4115i / fVar.f4117k)) {
            float width2 = (rectF.width() - Math.min(fVar.f4111e, fVar.f4115i / fVar.f4117k)) / 2.0f;
            rectF.left += width2;
            rectF.right -= width2;
        }
        if (rectF.height() > Math.min(fVar.f4112f, fVar.f4116j / fVar.l)) {
            float height = (rectF.height() - Math.min(fVar.f4112f, fVar.f4116j / fVar.l)) / 2.0f;
            rectF.top += height;
            rectF.bottom -= height;
        }
        a(rectF);
        RectF rectF2 = this.z;
        if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
            float max3 = Math.max(rectF2.left, 0.0f);
            float max4 = Math.max(rectF2.top, 0.0f);
            float min = Math.min(rectF2.right, (float) getWidth());
            float min2 = Math.min(rectF2.bottom, (float) getHeight());
            if (rectF.left < max3) {
                rectF.left = max3;
            }
            if (rectF.top < max4) {
                rectF.top = max4;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (this.I && ((double) Math.abs(rectF.width() - (rectF.height() * this.L))) > 0.1d) {
            if (rectF.width() > rectF.height() * this.L) {
                float abs = Math.abs((rectF.height() * this.L) - rectF.width()) / 2.0f;
                rectF.left += abs;
                rectF.right -= abs;
                return;
            }
            float abs2 = Math.abs((rectF.width() / this.L) - rectF.height()) / 2.0f;
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    public final void f() {
        float f10;
        float[] fArr = this.f4049y;
        float max = Math.max(c.o(fArr), 0.0f);
        float max2 = Math.max(c.q(fArr), 0.0f);
        float min = Math.min(c.p(fArr), (float) getWidth());
        float min2 = Math.min(c.m(fArr), (float) getHeight());
        if (min > max && min2 > max2) {
            RectF rectF = new RectF();
            this.P = true;
            float f11 = this.E;
            float f12 = min - max;
            float f13 = f11 * f12;
            float f14 = min2 - max2;
            float f15 = f11 * f14;
            Rect rect = this.O;
            int width = rect.width();
            f fVar = this.f4043q;
            if (width > 0 && rect.height() > 0) {
                float f16 = (((float) rect.left) / fVar.f4117k) + max;
                rectF.left = f16;
                rectF.top = (((float) rect.top) / fVar.l) + max2;
                rectF.right = (((float) rect.width()) / fVar.f4117k) + f16;
                rectF.bottom = (((float) rect.height()) / fVar.l) + rectF.top;
                rectF.left = Math.max(max, rectF.left);
                rectF.top = Math.max(max2, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                f10 = Math.min(min2, rectF.bottom);
            } else if (!this.I || min <= max || min2 <= max2) {
                rectF.left = max + f13;
                rectF.top = max2 + f15;
                rectF.right = min - f13;
                f10 = min2 - f15;
            } else if (f12 / f14 > this.L) {
                rectF.top = max2 + f15;
                rectF.bottom = min2 - f15;
                float width2 = ((float) getWidth()) / 2.0f;
                this.L = ((float) this.J) / ((float) this.K);
                float max3 = Math.max(Math.max(fVar.f4110c, fVar.f4113g / fVar.f4117k), rectF.height() * this.L) / 2.0f;
                rectF.left = width2 - max3;
                rectF.right = width2 + max3;
                d(rectF);
                fVar.f4108a.set(rectF);
            } else {
                rectF.left = max + f13;
                rectF.right = min - f13;
                float height = ((float) getHeight()) / 2.0f;
                float max4 = Math.max(Math.max(fVar.d, fVar.f4114h / fVar.l), rectF.width() / this.L) / 2.0f;
                rectF.top = height - max4;
                f10 = height + max4;
            }
            rectF.bottom = f10;
            d(rectF);
            fVar.f4108a.set(rectF);
        }
    }

    public final void g(float[] fArr, int i10, int i11) {
        float[] fArr2 = this.f4049y;
        if (fArr == null || !Arrays.equals(fArr2, fArr)) {
            if (fArr == null) {
                Arrays.fill(fArr2, 0.0f);
            } else {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            }
            this.A = i10;
            this.B = i11;
            RectF a10 = this.f4043q.a();
            if (a10.width() == 0.0f || a10.height() == 0.0f) {
                f();
            }
        }
    }

    public int getAspectRatioX() {
        return this.J;
    }

    public int getAspectRatioY() {
        return this.K;
    }

    public CropImageView.c getCropShape() {
        return this.N;
    }

    public RectF getCropWindowRect() {
        return this.f4043q.a();
    }

    public CropImageView.d getGuidelines() {
        return this.M;
    }

    public Rect getInitialCropWindowRect() {
        return this.O;
    }

    public final boolean h(boolean z10) {
        if (this.f4042p == z10) {
            return false;
        }
        this.f4042p = z10;
        if (!z10 || this.f4041o != null) {
            return true;
        }
        this.f4041o = new ScaleGestureDetector(getContext(), new b());
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            r7 = r20
            super.onDraw(r20)
            com.theartofdev.edmodo.cropper.f r8 = r0.f4043q
            android.graphics.RectF r9 = r8.a()
            float[] r1 = r0.f4049y
            float r2 = com.theartofdev.edmodo.cropper.c.o(r1)
            r10 = 0
            float r11 = java.lang.Math.max(r2, r10)
            float r2 = com.theartofdev.edmodo.cropper.c.q(r1)
            float r3 = java.lang.Math.max(r2, r10)
            float r2 = com.theartofdev.edmodo.cropper.c.p(r1)
            int r4 = r19.getWidth()
            float r4 = (float) r4
            float r12 = java.lang.Math.min(r2, r4)
            float r2 = com.theartofdev.edmodo.cropper.c.m(r1)
            int r4 = r19.getHeight()
            float r4 = (float) r4
            float r13 = java.lang.Math.min(r2, r4)
            com.theartofdev.edmodo.cropper.CropImageView$c r2 = r0.N
            com.theartofdev.edmodo.cropper.CropImageView$c r14 = com.theartofdev.edmodo.cropper.CropImageView.c.RECTANGLE
            android.graphics.Path r4 = r0.f4048x
            r15 = 1
            r16 = 0
            if (r2 != r14) goto L_0x00c7
            r2 = r1[r16]
            r6 = 6
            r17 = r1[r6]
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            r17 = 7
            if (r2 == 0) goto L_0x005a
            r2 = r1[r15]
            r18 = r1[r17]
            int r2 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r2 == 0) goto L_0x005a
            r2 = r15
            goto L_0x005c
        L_0x005a:
            r2 = r16
        L_0x005c:
            if (r2 == 0) goto L_0x009c
            int r2 = android.os.Build.VERSION.SDK_INT
            r4.reset()
            r10 = r1[r16]
            r5 = r1[r15]
            r4.moveTo(r10, r5)
            r5 = 2
            r5 = r1[r5]
            r10 = 3
            r10 = r1[r10]
            r4.lineTo(r5, r10)
            r5 = 4
            r5 = r1[r5]
            r10 = 5
            r10 = r1[r10]
            r4.lineTo(r5, r10)
            r5 = r1[r6]
            r1 = r1[r17]
            r4.lineTo(r5, r1)
            r4.close()
            r20.save()
            r1 = 26
            if (r2 < r1) goto L_0x0091
            r7.clipOutPath(r4)
            goto L_0x0096
        L_0x0091:
            android.graphics.Region$Op r1 = android.graphics.Region.Op.INTERSECT
            r7.clipPath(r4, r1)
        L_0x0096:
            android.graphics.Region$Op r1 = android.graphics.Region.Op.XOR
            r7.clipRect(r9, r1)
            goto L_0x00ee
        L_0x009c:
            float r5 = r9.top
            android.graphics.Paint r6 = r0.w
            r1 = r20
            r2 = r11
            r4 = r12
            r1.drawRect(r2, r3, r4, r5, r6)
            float r3 = r9.bottom
            android.graphics.Paint r6 = r0.w
            r5 = r13
            r1.drawRect(r2, r3, r4, r5, r6)
            float r3 = r9.top
            float r4 = r9.left
            float r5 = r9.bottom
            android.graphics.Paint r6 = r0.w
            r1.drawRect(r2, r3, r4, r5, r6)
            float r2 = r9.right
            float r3 = r9.top
            float r5 = r9.bottom
            android.graphics.Paint r6 = r0.w
            r4 = r12
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L_0x00fb
        L_0x00c7:
            r4.reset()
            int r1 = android.os.Build.VERSION.SDK_INT
            android.graphics.RectF r2 = r0.f4045s
            float r5 = r9.left
            float r6 = r9.top
            float r10 = r9.right
            float r9 = r9.bottom
            r2.set(r5, r6, r10, r9)
            android.graphics.Path$Direction r5 = android.graphics.Path.Direction.CW
            r4.addOval(r2, r5)
            r20.save()
            r2 = 26
            if (r1 < r2) goto L_0x00e9
            r7.clipOutPath(r4)
            goto L_0x00ee
        L_0x00e9:
            android.graphics.Region$Op r1 = android.graphics.Region.Op.XOR
            r7.clipPath(r4, r1)
        L_0x00ee:
            android.graphics.Paint r6 = r0.w
            r1 = r20
            r2 = r11
            r4 = r12
            r5 = r13
            r1.drawRect(r2, r3, r4, r5, r6)
            r20.restore()
        L_0x00fb:
            android.graphics.RectF r1 = r8.f4108a
            float r2 = r1.width()
            r3 = 1120403456(0x42c80000, float:100.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0110
            float r1 = r1.height()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r15 = r16
        L_0x0112:
            if (r15 == 0) goto L_0x0126
            com.theartofdev.edmodo.cropper.CropImageView$d r1 = r0.M
            com.theartofdev.edmodo.cropper.CropImageView$d r2 = com.theartofdev.edmodo.cropper.CropImageView.d.ON
            if (r1 != r2) goto L_0x011b
            goto L_0x0123
        L_0x011b:
            com.theartofdev.edmodo.cropper.CropImageView$d r2 = com.theartofdev.edmodo.cropper.CropImageView.d.ON_TOUCH
            if (r1 != r2) goto L_0x0126
            com.theartofdev.edmodo.cropper.g r1 = r0.H
            if (r1 == 0) goto L_0x0126
        L_0x0123:
            r19.c(r20)
        L_0x0126:
            android.graphics.Paint r1 = r0.f4046t
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0147
            float r1 = r1.getStrokeWidth()
            android.graphics.RectF r3 = r8.a()
            float r1 = r1 / r2
            r3.inset(r1, r1)
            com.theartofdev.edmodo.cropper.CropImageView$c r1 = r0.N
            if (r1 != r14) goto L_0x0142
            android.graphics.Paint r1 = r0.f4046t
            r7.drawRect(r3, r1)
            goto L_0x0147
        L_0x0142:
            android.graphics.Paint r1 = r0.f4046t
            r7.drawOval(r3, r1)
        L_0x0147:
            android.graphics.Paint r1 = r0.u
            if (r1 == 0) goto L_0x0212
            android.graphics.Paint r1 = r0.f4046t
            if (r1 == 0) goto L_0x0154
            float r1 = r1.getStrokeWidth()
            goto L_0x0155
        L_0x0154:
            r1 = 0
        L_0x0155:
            android.graphics.Paint r3 = r0.u
            float r3 = r3.getStrokeWidth()
            float r4 = r3 / r2
            com.theartofdev.edmodo.cropper.CropImageView$c r5 = r0.N
            if (r5 != r14) goto L_0x0164
            float r10 = r0.C
            goto L_0x0165
        L_0x0164:
            r10 = 0
        L_0x0165:
            float r10 = r10 + r4
            android.graphics.RectF r8 = r8.a()
            r8.inset(r10, r10)
            float r3 = r3 - r1
            float r9 = r3 / r2
            float r10 = r4 + r9
            float r1 = r8.left
            float r4 = r1 - r9
            float r1 = r8.top
            float r3 = r1 - r10
            float r2 = r0.D
            float r5 = r1 + r2
            android.graphics.Paint r6 = r0.u
            r1 = r20
            r2 = r4
            r1.drawLine(r2, r3, r4, r5, r6)
            float r1 = r8.left
            float r2 = r1 - r10
            float r3 = r8.top
            float r5 = r3 - r9
            float r3 = r0.D
            float r4 = r1 + r3
            android.graphics.Paint r6 = r0.u
            r1 = r20
            r3 = r5
            r1.drawLine(r2, r3, r4, r5, r6)
            float r1 = r8.right
            float r4 = r1 + r9
            float r1 = r8.top
            float r3 = r1 - r10
            float r2 = r0.D
            float r5 = r1 + r2
            android.graphics.Paint r6 = r0.u
            r1 = r20
            r2 = r4
            r1.drawLine(r2, r3, r4, r5, r6)
            float r1 = r8.right
            float r2 = r1 + r10
            float r3 = r8.top
            float r5 = r3 - r9
            float r3 = r0.D
            float r4 = r1 - r3
            android.graphics.Paint r6 = r0.u
            r1 = r20
            r3 = r5
            r1.drawLine(r2, r3, r4, r5, r6)
            float r1 = r8.left
            float r4 = r1 - r9
            float r1 = r8.bottom
            float r3 = r1 + r10
            float r2 = r0.D
            float r5 = r1 - r2
            android.graphics.Paint r6 = r0.u
            r1 = r20
            r2 = r4
            r1.drawLine(r2, r3, r4, r5, r6)
            float r1 = r8.left
            float r2 = r1 - r10
            float r3 = r8.bottom
            float r5 = r3 + r9
            float r3 = r0.D
            float r4 = r1 + r3
            android.graphics.Paint r6 = r0.u
            r1 = r20
            r3 = r5
            r1.drawLine(r2, r3, r4, r5, r6)
            float r1 = r8.right
            float r4 = r1 + r9
            float r1 = r8.bottom
            float r3 = r1 + r10
            float r2 = r0.D
            float r5 = r1 - r2
            android.graphics.Paint r6 = r0.u
            r1 = r20
            r2 = r4
            r1.drawLine(r2, r3, r4, r5, r6)
            float r1 = r8.right
            float r2 = r1 + r10
            float r3 = r8.bottom
            float r5 = r3 + r9
            float r3 = r0.D
            float r4 = r1 - r3
            android.graphics.Paint r6 = r0.u
            r1 = r20
            r3 = r5
            r1.drawLine(r2, r3, r4, r5, r6)
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropOverlayView.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03c5, code lost:
        if ((!r16) != false) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x047b, code lost:
        if ((!r2) == false) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x047d, code lost:
        r2 = com.theartofdev.edmodo.cropper.g.b.CENTER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r7 <= r14.right) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (r7 <= r14.bottom) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
        com.theartofdev.edmodo.cropper.g.f(r5, r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0164, code lost:
        r5.right = (r5.height() * r17) + r5.left;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017e, code lost:
        r5.bottom = (r5.width() / r17) + r5.top;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a7, code lost:
        r5.left = r5.right - (r5.height() * r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01eb, code lost:
        r5.top = r5.bottom - (r5.width() / r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x028b, code lost:
        r11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02a2, code lost:
        r7.d(r8, r9, r10, r11, r12, r13, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02b4, code lost:
        r7.b(r8, r9, r10, r11, r12, r13, r14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            r20 = this;
            r0 = r20
            boolean r1 = r20.isEnabled()
            r2 = 0
            if (r1 == 0) goto L_0x0491
            boolean r1 = r0.f4042p
            if (r1 == 0) goto L_0x0015
            android.view.ScaleGestureDetector r1 = r0.f4041o
            r3 = r21
            r1.onTouchEvent(r3)
            goto L_0x0017
        L_0x0015:
            r3 = r21
        L_0x0017:
            int r1 = r21.getAction()
            r4 = 1
            r5 = 0
            com.theartofdev.edmodo.cropper.f r6 = r0.f4043q
            if (r1 == 0) goto L_0x02e2
            if (r1 == r4) goto L_0x02cd
            r7 = 2
            if (r1 == r7) goto L_0x002a
            r3 = 3
            if (r1 == r3) goto L_0x02cd
            return r2
        L_0x002a:
            float r1 = r21.getX()
            float r2 = r21.getY()
            com.theartofdev.edmodo.cropper.g r3 = r0.H
            if (r3 == 0) goto L_0x02c4
            float r3 = r0.G
            android.graphics.RectF r5 = r6.a()
            boolean r7 = r0.a(r5)
            r8 = 0
            if (r7 == 0) goto L_0x0044
            r3 = r8
        L_0x0044:
            com.theartofdev.edmodo.cropper.g r15 = r0.H
            android.graphics.RectF r14 = r0.z
            int r13 = r0.A
            int r11 = r0.B
            boolean r7 = r0.I
            float r12 = r0.L
            android.graphics.PointF r9 = r15.f4122f
            float r10 = r9.x
            float r1 = r1 + r10
            float r10 = r9.y
            float r2 = r2 + r10
            com.theartofdev.edmodo.cropper.g$b r10 = com.theartofdev.edmodo.cropper.g.b.CENTER
            com.theartofdev.edmodo.cropper.g$b r4 = r15.f4121e
            if (r4 != r10) goto L_0x00f0
            float r4 = r5.centerX()
            float r1 = r1 - r4
            float r4 = r5.centerY()
            float r2 = r2 - r4
            float r4 = r5.left
            float r4 = r4 + r1
            int r7 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            r10 = 1073741824(0x40000000, float:2.0)
            r12 = 1065772646(0x3f866666, float:1.05)
            if (r7 < 0) goto L_0x0088
            float r7 = r5.right
            float r7 = r7 + r1
            float r13 = (float) r13
            int r13 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x0088
            float r13 = r14.left
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 < 0) goto L_0x0088
            float r4 = r14.right
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0090
        L_0x0088:
            float r1 = r1 / r12
            float r4 = r9.x
            float r7 = r1 / r10
            float r4 = r4 - r7
            r9.x = r4
        L_0x0090:
            float r4 = r5.top
            float r4 = r4 + r2
            int r7 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x00ab
            float r7 = r5.bottom
            float r7 = r7 + r2
            float r11 = (float) r11
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x00ab
            float r11 = r14.top
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x00ab
            float r4 = r14.bottom
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b3
        L_0x00ab:
            float r2 = r2 / r12
            float r4 = r9.y
            float r7 = r2 / r10
            float r4 = r4 - r7
            r9.y = r4
        L_0x00b3:
            r5.offset(r1, r2)
            float r1 = r5.left
            float r2 = r14.left
            float r4 = r2 + r3
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c4
            float r2 = r2 - r1
            r5.offset(r2, r8)
        L_0x00c4:
            float r1 = r5.top
            float r2 = r14.top
            float r4 = r2 + r3
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d2
            float r2 = r2 - r1
            r5.offset(r8, r2)
        L_0x00d2:
            float r1 = r5.right
            float r2 = r14.right
            float r4 = r2 - r3
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00e0
            float r2 = r2 - r1
            r5.offset(r2, r8)
        L_0x00e0:
            float r1 = r5.bottom
            float r2 = r14.bottom
            float r3 = r2 - r3
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x02b7
            float r2 = r2 - r1
            r5.offset(r8, r2)
            goto L_0x02b7
        L_0x00f0:
            if (r7 == 0) goto L_0x021e
            int[] r7 = com.theartofdev.edmodo.cropper.g.a.f4123a
            int r4 = r4.ordinal()
            r4 = r7[r4]
            switch(r4) {
                case 1: goto L_0x01f8;
                case 2: goto L_0x01c1;
                case 3: goto L_0x018b;
                case 4: goto L_0x0147;
                case 5: goto L_0x0136;
                case 6: goto L_0x0125;
                case 7: goto L_0x0113;
                case 8: goto L_0x00ff;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            goto L_0x02b7
        L_0x00ff:
            r1 = 1
            r4 = 1
            r7 = r15
            r8 = r5
            r9 = r2
            r10 = r14
            r2 = r12
            r12 = r3
            r13 = r2
            r3 = r14
            r14 = r1
            r15 = r4
            r7.a(r8, r9, r10, r11, r12, r13, r14, r15)
            com.theartofdev.edmodo.cropper.g.c(r5, r3, r2)
            goto L_0x02b7
        L_0x0113:
            r2 = r12
            r4 = r14
            r14 = 1
            r17 = 1
            r7 = r15
            r8 = r5
            r9 = r1
            r10 = r4
            r11 = r13
            r12 = r3
            r13 = r2
            r15 = r17
            r7.d(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0142
        L_0x0125:
            r1 = r12
            r4 = r14
            r13 = 1
            r14 = 1
            r7 = r15
            r8 = r5
            r9 = r2
            r10 = r4
            r11 = r3
            r7.e(r8, r9, r10, r11, r12, r13, r14)
            com.theartofdev.edmodo.cropper.g.c(r5, r4, r1)
            goto L_0x02b7
        L_0x0136:
            r2 = r12
            r4 = r14
            r13 = 1
            r14 = 1
            r7 = r15
            r8 = r5
            r9 = r1
            r10 = r4
            r11 = r3
            r7.b(r8, r9, r10, r11, r12, r13, r14)
        L_0x0142:
            com.theartofdev.edmodo.cropper.g.f(r5, r4, r2)
            goto L_0x02b7
        L_0x0147:
            r17 = r12
            r4 = r14
            float r7 = r5.left
            float r8 = r5.top
            float r7 = r1 - r7
            float r8 = r2 - r8
            float r7 = r7 / r8
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            r14 = 0
            if (r7 >= 0) goto L_0x0171
            r1 = 1
            r7 = r15
            r8 = r5
            r9 = r2
            r10 = r4
            r12 = r3
            r13 = r17
            r15 = r1
            r7.a(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0164:
            float r1 = r5.left
            float r2 = r5.height()
            float r2 = r2 * r17
            float r2 = r2 + r1
            r5.right = r2
            goto L_0x02b7
        L_0x0171:
            r2 = 1
            r7 = r15
            r8 = r5
            r9 = r1
            r10 = r4
            r11 = r13
            r12 = r3
            r13 = r17
            r15 = r2
            r7.d(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x017e:
            float r1 = r5.top
            float r2 = r5.width()
            float r2 = r2 / r17
            float r2 = r2 + r1
            r5.bottom = r2
            goto L_0x02b7
        L_0x018b:
            r17 = r12
            r4 = r14
            float r7 = r5.top
            float r8 = r5.right
            float r8 = r8 - r1
            float r7 = r2 - r7
            float r8 = r8 / r7
            int r7 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r7 >= 0) goto L_0x01b4
            r14 = 1
            r1 = 0
            r7 = r15
            r8 = r5
            r9 = r2
            r10 = r4
            r12 = r3
            r13 = r17
            r15 = r1
            r7.a(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x01a7:
            float r1 = r5.right
            float r2 = r5.height()
            float r2 = r2 * r17
            float r1 = r1 - r2
            r5.left = r1
            goto L_0x02b7
        L_0x01b4:
            r13 = 0
            r14 = 1
            r7 = r15
            r8 = r5
            r9 = r1
            r10 = r4
            r11 = r3
            r12 = r17
            r7.b(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x017e
        L_0x01c1:
            r17 = r12
            r4 = r14
            float r7 = r5.left
            float r8 = r5.bottom
            float r7 = r1 - r7
            float r8 = r8 - r2
            float r7 = r7 / r8
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r7 >= 0) goto L_0x01dd
            r13 = 0
            r14 = 1
            r7 = r15
            r8 = r5
            r9 = r2
            r10 = r4
            r11 = r3
            r12 = r17
            r7.e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0164
        L_0x01dd:
            r14 = 1
            r2 = 0
            r7 = r15
            r8 = r5
            r9 = r1
            r10 = r4
            r11 = r13
            r12 = r3
            r13 = r17
            r15 = r2
            r7.d(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x01eb:
            float r1 = r5.bottom
            float r2 = r5.width()
            float r2 = r2 / r17
            float r1 = r1 - r2
            r5.top = r1
            goto L_0x02b7
        L_0x01f8:
            r17 = r12
            r4 = r14
            float r7 = r5.right
            float r8 = r5.bottom
            float r7 = r7 - r1
            float r8 = r8 - r2
            float r7 = r7 / r8
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            r13 = 1
            r14 = 0
            if (r7 >= 0) goto L_0x0213
            r7 = r15
            r8 = r5
            r9 = r2
            r10 = r4
            r11 = r3
            r12 = r17
            r7.e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x01a7
        L_0x0213:
            r7 = r15
            r8 = r5
            r9 = r1
            r10 = r4
            r11 = r3
            r12 = r17
            r7.b(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x01eb
        L_0x021e:
            r17 = r14
            int[] r7 = com.theartofdev.edmodo.cropper.g.a.f4123a
            int r4 = r4.ordinal()
            r4 = r7[r4]
            switch(r4) {
                case 1: goto L_0x02a6;
                case 2: goto L_0x028d;
                case 3: goto L_0x027b;
                case 4: goto L_0x0261;
                case 5: goto L_0x0258;
                case 6: goto L_0x024a;
                case 7: goto L_0x023c;
                case 8: goto L_0x022d;
                default: goto L_0x022b;
            }
        L_0x022b:
            goto L_0x02b7
        L_0x022d:
            r13 = 0
            r14 = 0
            r1 = 0
            r7 = r15
            r8 = r5
            r9 = r2
            r10 = r17
            r12 = r3
            r15 = r1
            r7.a(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x02b7
        L_0x023c:
            r2 = 0
            r14 = 0
            r4 = 0
            r7 = r15
            r8 = r5
            r9 = r1
            r10 = r17
            r11 = r13
            r12 = r3
            r13 = r2
            r15 = r4
            goto L_0x02a2
        L_0x024a:
            r12 = 0
            r13 = 0
            r14 = 0
            r7 = r15
            r8 = r5
            r9 = r2
            r10 = r17
            r11 = r3
            r7.e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x02b7
        L_0x0258:
            r12 = 0
            r13 = 0
            r14 = 0
            r7 = r15
            r8 = r5
            r9 = r1
            r10 = r17
            goto L_0x028b
        L_0x0261:
            r4 = 0
            r14 = 0
            r18 = 0
            r7 = r15
            r8 = r5
            r9 = r2
            r10 = r17
            r12 = r3
            r19 = r13
            r13 = r4
            r4 = r15
            r15 = r18
            r7.a(r8, r9, r10, r11, r12, r13, r14, r15)
            r13 = 0
            r15 = 0
            r7 = r4
            r9 = r1
            r11 = r19
            goto L_0x02a2
        L_0x027b:
            r4 = r15
            r13 = 0
            r14 = 0
            r15 = 0
            r7 = r4
            r8 = r5
            r9 = r2
            r10 = r17
            r12 = r3
            r7.a(r8, r9, r10, r11, r12, r13, r14, r15)
            r12 = 0
            r13 = 0
            r9 = r1
        L_0x028b:
            r11 = r3
            goto L_0x02b4
        L_0x028d:
            r19 = r13
            r4 = r15
            r12 = 0
            r13 = 0
            r14 = 0
            r7 = r4
            r8 = r5
            r9 = r2
            r10 = r17
            r11 = r3
            r7.e(r8, r9, r10, r11, r12, r13, r14)
            r13 = 0
            r15 = 0
            r9 = r1
            r11 = r19
            r12 = r3
        L_0x02a2:
            r7.d(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x02b7
        L_0x02a6:
            r4 = r15
            r12 = 0
            r13 = 0
            r14 = 0
            r7 = r4
            r8 = r5
            r9 = r2
            r10 = r17
            r11 = r3
            r7.e(r8, r9, r10, r11, r12, r13, r14)
            r9 = r1
        L_0x02b4:
            r7.b(r8, r9, r10, r11, r12, r13, r14)
        L_0x02b7:
            android.graphics.RectF r1 = r6.f4108a
            r1.set(r5)
            r1 = 1
            r0.b(r1)
            r20.invalidate()
            goto L_0x02c5
        L_0x02c4:
            r1 = r4
        L_0x02c5:
            android.view.ViewParent r2 = r20.getParent()
            r2.requestDisallowInterceptTouchEvent(r1)
            return r1
        L_0x02cd:
            r1 = r4
            android.view.ViewParent r3 = r20.getParent()
            r3.requestDisallowInterceptTouchEvent(r2)
            com.theartofdev.edmodo.cropper.g r3 = r0.H
            if (r3 == 0) goto L_0x02e1
            r0.H = r5
            r0.b(r2)
            r20.invalidate()
        L_0x02e1:
            return r1
        L_0x02e2:
            float r1 = r21.getX()
            float r3 = r21.getY()
            float r4 = r0.F
            com.theartofdev.edmodo.cropper.CropImageView$c r7 = r0.N
            r6.getClass()
            com.theartofdev.edmodo.cropper.CropImageView$c r8 = com.theartofdev.edmodo.cropper.CropImageView.c.OVAL
            android.graphics.RectF r9 = r6.f4108a
            if (r7 != r8) goto L_0x0355
            float r2 = r9.width()
            r4 = 1086324736(0x40c00000, float:6.0)
            float r2 = r2 / r4
            float r7 = r9.left
            float r8 = r7 + r2
            r10 = 1084227584(0x40a00000, float:5.0)
            float r2 = r2 * r10
            float r2 = r2 + r7
            float r7 = r9.height()
            float r7 = r7 / r4
            float r4 = r9.top
            float r9 = r4 + r7
            float r7 = r7 * r10
            float r7 = r7 + r4
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0329
            int r2 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x031d
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.TOP_LEFT
            goto L_0x0481
        L_0x031d:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0325
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.LEFT
            goto L_0x0481
        L_0x0325:
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.BOTTOM_LEFT
            goto L_0x0481
        L_0x0329:
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0341
            int r2 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0335
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.TOP
            goto L_0x0481
        L_0x0335:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x033d
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.CENTER
            goto L_0x0481
        L_0x033d:
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.BOTTOM
            goto L_0x0481
        L_0x0341:
            int r2 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0349
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.TOP_RIGHT
            goto L_0x0481
        L_0x0349:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0351
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.RIGHT
            goto L_0x0481
        L_0x0351:
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.BOTTOM_RIGHT
            goto L_0x0481
        L_0x0355:
            float r7 = r9.left
            float r8 = r9.top
            boolean r7 = com.theartofdev.edmodo.cropper.f.b(r1, r3, r7, r8, r4)
            if (r7 == 0) goto L_0x0363
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.TOP_LEFT
            goto L_0x0481
        L_0x0363:
            float r7 = r9.right
            float r8 = r9.top
            boolean r7 = com.theartofdev.edmodo.cropper.f.b(r1, r3, r7, r8, r4)
            if (r7 == 0) goto L_0x0371
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.TOP_RIGHT
            goto L_0x0481
        L_0x0371:
            float r7 = r9.left
            float r8 = r9.bottom
            boolean r7 = com.theartofdev.edmodo.cropper.f.b(r1, r3, r7, r8, r4)
            if (r7 == 0) goto L_0x037f
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.BOTTOM_LEFT
            goto L_0x0481
        L_0x037f:
            float r7 = r9.right
            float r8 = r9.bottom
            boolean r7 = com.theartofdev.edmodo.cropper.f.b(r1, r3, r7, r8, r4)
            if (r7 == 0) goto L_0x038d
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.BOTTOM_RIGHT
            goto L_0x0481
        L_0x038d:
            float r7 = r9.left
            float r8 = r9.top
            float r10 = r9.right
            float r11 = r9.bottom
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x03a7
            int r7 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x03a7
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x03a7
            int r7 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x03a7
            r7 = 1
            goto L_0x03a8
        L_0x03a7:
            r7 = r2
        L_0x03a8:
            r8 = 1120403456(0x42c80000, float:100.0)
            if (r7 == 0) goto L_0x03c9
            float r7 = r9.width()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x03c0
            float r7 = r9.height()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x03c0
            r7 = 1
            r16 = 1
            goto L_0x03c3
        L_0x03c0:
            r16 = r2
            r7 = 1
        L_0x03c3:
            r10 = r16 ^ 1
            if (r10 == 0) goto L_0x03c9
            goto L_0x047d
        L_0x03c9:
            float r7 = r9.left
            float r10 = r9.right
            float r11 = r9.top
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x03e3
            int r7 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x03e3
            float r7 = r3 - r11
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x03e3
            r7 = 1
            goto L_0x03e4
        L_0x03e3:
            r7 = r2
        L_0x03e4:
            if (r7 == 0) goto L_0x03ea
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.TOP
            goto L_0x0481
        L_0x03ea:
            float r7 = r9.left
            float r10 = r9.right
            float r11 = r9.bottom
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0404
            int r7 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0404
            float r7 = r3 - r11
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x0404
            r7 = 1
            goto L_0x0405
        L_0x0404:
            r7 = r2
        L_0x0405:
            if (r7 == 0) goto L_0x040b
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.BOTTOM
            goto L_0x0481
        L_0x040b:
            float r7 = r9.left
            float r10 = r9.top
            float r11 = r9.bottom
            float r7 = r1 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x0425
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0425
            int r7 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x0425
            r7 = 1
            goto L_0x0426
        L_0x0425:
            r7 = r2
        L_0x0426:
            if (r7 == 0) goto L_0x042b
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.LEFT
            goto L_0x0481
        L_0x042b:
            float r7 = r9.right
            float r10 = r9.top
            float r11 = r9.bottom
            float r7 = r1 - r7
            float r7 = java.lang.Math.abs(r7)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0445
            int r4 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x0445
            int r4 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0445
            r4 = 1
            goto L_0x0446
        L_0x0445:
            r4 = r2
        L_0x0446:
            if (r4 == 0) goto L_0x044b
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.RIGHT
            goto L_0x0481
        L_0x044b:
            float r4 = r9.left
            float r7 = r9.top
            float r10 = r9.right
            float r11 = r9.bottom
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0465
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x0465
            int r4 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0465
            int r4 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0465
            r4 = 1
            goto L_0x0466
        L_0x0465:
            r4 = r2
        L_0x0466:
            if (r4 == 0) goto L_0x0480
            float r4 = r9.width()
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0479
            float r4 = r9.height()
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0479
            r2 = 1
        L_0x0479:
            r4 = 1
            r2 = r2 ^ r4
            if (r2 != 0) goto L_0x0480
        L_0x047d:
            com.theartofdev.edmodo.cropper.g$b r2 = com.theartofdev.edmodo.cropper.g.b.CENTER
            goto L_0x0481
        L_0x0480:
            r2 = r5
        L_0x0481:
            if (r2 == 0) goto L_0x0488
            com.theartofdev.edmodo.cropper.g r5 = new com.theartofdev.edmodo.cropper.g
            r5.<init>(r2, r6, r1, r3)
        L_0x0488:
            r0.H = r5
            if (r5 == 0) goto L_0x048f
            r20.invalidate()
        L_0x048f:
            r1 = 1
            return r1
        L_0x0491:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropOverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAspectRatioX(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.J != i10) {
            this.J = i10;
            this.L = ((float) i10) / ((float) this.K);
            if (this.P) {
                f();
                invalidate();
            }
        }
    }

    public void setAspectRatioY(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.K != i10) {
            this.K = i10;
            this.L = ((float) this.J) / ((float) i10);
            if (this.P) {
                f();
                invalidate();
            }
        }
    }

    public void setCropShape(CropImageView.c cVar) {
        if (this.N != cVar) {
            this.N = cVar;
            invalidate();
        }
    }

    public void setCropWindowChangeListener(a aVar) {
        this.f4044r = aVar;
    }

    public void setCropWindowRect(RectF rectF) {
        this.f4043q.f4108a.set(rectF);
    }

    public void setFixedAspectRatio(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            if (this.P) {
                f();
                invalidate();
            }
        }
    }

    public void setGuidelines(CropImageView.d dVar) {
        if (this.M != dVar) {
            this.M = dVar;
            if (this.P) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(e eVar) {
        f fVar = this.f4043q;
        fVar.getClass();
        fVar.f4110c = (float) eVar.L;
        fVar.d = (float) eVar.M;
        fVar.f4113g = (float) eVar.N;
        fVar.f4114h = (float) eVar.O;
        fVar.f4115i = (float) eVar.P;
        fVar.f4116j = (float) eVar.Q;
        setCropShape(eVar.f4099o);
        setSnapRadius(eVar.f4100p);
        setGuidelines(eVar.f4102r);
        setFixedAspectRatio(eVar.z);
        setAspectRatioX(eVar.A);
        setAspectRatioY(eVar.B);
        h(eVar.w);
        this.F = eVar.f4101q;
        this.E = eVar.f4107y;
        this.f4046t = e(eVar.D, eVar.C);
        this.C = eVar.F;
        this.D = eVar.G;
        this.u = e(eVar.H, eVar.E);
        this.f4047v = e(eVar.J, eVar.I);
        int i10 = eVar.K;
        Paint paint = new Paint();
        paint.setColor(i10);
        this.w = paint;
    }

    public void setInitialCropWindowRect(Rect rect) {
        if (rect == null) {
            rect = c.f4079a;
        }
        this.O.set(rect);
        if (this.P) {
            f();
            invalidate();
            b(false);
        }
    }

    public void setSnapRadius(float f10) {
        this.G = f10;
    }
}
