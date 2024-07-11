package de.hdodenhof.circleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;

public class CircleImageView extends ImageView {
    public static final ImageView.ScaleType I = ImageView.ScaleType.CENTER_CROP;
    public static final Bitmap.Config J = Bitmap.Config.ARGB_8888;
    public int A;
    public float B;
    public float C;
    public ColorFilter D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;

    /* renamed from: o  reason: collision with root package name */
    public final RectF f4316o = new RectF();

    /* renamed from: p  reason: collision with root package name */
    public final RectF f4317p = new RectF();

    /* renamed from: q  reason: collision with root package name */
    public final Matrix f4318q = new Matrix();

    /* renamed from: r  reason: collision with root package name */
    public final Paint f4319r = new Paint();

    /* renamed from: s  reason: collision with root package name */
    public final Paint f4320s = new Paint();

    /* renamed from: t  reason: collision with root package name */
    public final Paint f4321t = new Paint();
    public int u = -16777216;

    /* renamed from: v  reason: collision with root package name */
    public int f4322v = 0;
    public int w = 0;

    /* renamed from: x  reason: collision with root package name */
    public Bitmap f4323x;

    /* renamed from: y  reason: collision with root package name */
    public BitmapShader f4324y;
    public int z;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        public final void getOutline(View view, Outline outline) {
            CircleImageView circleImageView = CircleImageView.this;
            if (circleImageView.H) {
                ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                return;
            }
            Rect rect = new Rect();
            circleImageView.f4317p.roundOut(rect);
            outline.setRoundRect(rect, ((float) rect.width()) / 2.0f);
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s6.a.R, 0, 0);
        this.f4322v = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.u = obtainStyledAttributes.getColor(0, -16777216);
        this.G = obtainStyledAttributes.getBoolean(1, false);
        this.w = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        super.setScaleType(I);
        this.E = true;
        setOutlineProvider(new a());
        if (this.F) {
            b();
            this.F = false;
        }
    }

    public final void a() {
        Drawable drawable;
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        if (!this.H && (drawable = getDrawable()) != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmap2 = ((BitmapDrawable) drawable).getBitmap();
            } else {
                try {
                    boolean z10 = drawable instanceof ColorDrawable;
                    Bitmap.Config config = J;
                    if (z10) {
                        bitmap = Bitmap.createBitmap(2, 2, config);
                    } else {
                        bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), config);
                    }
                    Canvas canvas = new Canvas(bitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmap2 = bitmap;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        this.f4323x = bitmap2;
        b();
    }

    public final void b() {
        float f10;
        float f11;
        int i10;
        if (!this.E) {
            this.F = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            if (this.f4323x == null) {
                invalidate();
                return;
            }
            Bitmap bitmap = this.f4323x;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f4324y = new BitmapShader(bitmap, tileMode, tileMode);
            Paint paint = this.f4319r;
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setFilterBitmap(true);
            paint.setShader(this.f4324y);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = this.f4320s;
            paint2.setStyle(style);
            paint2.setAntiAlias(true);
            paint2.setColor(this.u);
            paint2.setStrokeWidth((float) this.f4322v);
            Paint.Style style2 = Paint.Style.FILL;
            Paint paint3 = this.f4321t;
            paint3.setStyle(style2);
            paint3.setAntiAlias(true);
            paint3.setColor(this.w);
            this.A = this.f4323x.getHeight();
            this.z = this.f4323x.getWidth();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int min = Math.min(width, height);
            float paddingLeft = (((float) (width - min)) / 2.0f) + ((float) getPaddingLeft());
            float paddingTop = (((float) (height - min)) / 2.0f) + ((float) getPaddingTop());
            float f12 = (float) min;
            RectF rectF = new RectF(paddingLeft, paddingTop, paddingLeft + f12, f12 + paddingTop);
            RectF rectF2 = this.f4317p;
            rectF2.set(rectF);
            this.C = Math.min((rectF2.height() - ((float) this.f4322v)) / 2.0f, (rectF2.width() - ((float) this.f4322v)) / 2.0f);
            RectF rectF3 = this.f4316o;
            rectF3.set(rectF2);
            if (!this.G && (i10 = this.f4322v) > 0) {
                float f13 = ((float) i10) - 1.0f;
                rectF3.inset(f13, f13);
            }
            this.B = Math.min(rectF3.height() / 2.0f, rectF3.width() / 2.0f);
            if (paint != null) {
                paint.setColorFilter(this.D);
            }
            Matrix matrix = this.f4318q;
            matrix.set((Matrix) null);
            float f14 = 0.0f;
            if (rectF3.height() * ((float) this.z) > rectF3.width() * ((float) this.A)) {
                f11 = rectF3.height() / ((float) this.A);
                f10 = 0.0f;
                f14 = (rectF3.width() - (((float) this.z) * f11)) * 0.5f;
            } else {
                f11 = rectF3.width() / ((float) this.z);
                f10 = (rectF3.height() - (((float) this.A) * f11)) * 0.5f;
            }
            matrix.setScale(f11, f11);
            matrix.postTranslate(((float) ((int) (f14 + 0.5f))) + rectF3.left, ((float) ((int) (f10 + 0.5f))) + rectF3.top);
            this.f4324y.setLocalMatrix(matrix);
            invalidate();
        }
    }

    public int getBorderColor() {
        return this.u;
    }

    public int getBorderWidth() {
        return this.f4322v;
    }

    public int getCircleBackgroundColor() {
        return this.w;
    }

    public ColorFilter getColorFilter() {
        return this.D;
    }

    public ImageView.ScaleType getScaleType() {
        return I;
    }

    public final void onDraw(Canvas canvas) {
        if (this.H) {
            super.onDraw(canvas);
        } else if (this.f4323x != null) {
            int i10 = this.w;
            RectF rectF = this.f4316o;
            if (i10 != 0) {
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.B, this.f4321t);
            }
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.B, this.f4319r);
            if (this.f4322v > 0) {
                RectF rectF2 = this.f4317p;
                canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), this.C, this.f4320s);
            }
        }
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.H
            if (r0 == 0) goto L_0x0009
            boolean r11 = super.onTouchEvent(r11)
            return r11
        L_0x0009:
            float r0 = r11.getX()
            float r1 = r11.getY()
            android.graphics.RectF r2 = r10.f4317p
            boolean r3 = r2.isEmpty()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x001c
            goto L_0x003e
        L_0x001c:
            float r3 = r2.centerX()
            float r0 = r0 - r3
            double r6 = (double) r0
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = java.lang.Math.pow(r6, r8)
            float r0 = r2.centerY()
            float r1 = r1 - r0
            double r0 = (double) r1
            double r0 = java.lang.Math.pow(r0, r8)
            double r0 = r0 + r6
            float r2 = r10.C
            double r2 = (double) r2
            double r2 = java.lang.Math.pow(r2, r8)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0040
        L_0x003e:
            r0 = r5
            goto L_0x0041
        L_0x0040:
            r0 = r4
        L_0x0041:
            if (r0 == 0) goto L_0x004a
            boolean r11 = super.onTouchEvent(r11)
            if (r11 == 0) goto L_0x004a
            r4 = r5
        L_0x004a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: de.hdodenhof.circleimageview.CircleImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAdjustViewBounds(boolean z10) {
        if (z10) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i10) {
        if (i10 != this.u) {
            this.u = i10;
            this.f4320s.setColor(i10);
            invalidate();
        }
    }

    public void setBorderOverlay(boolean z10) {
        if (z10 != this.G) {
            this.G = z10;
            b();
        }
    }

    public void setBorderWidth(int i10) {
        if (i10 != this.f4322v) {
            this.f4322v = i10;
            b();
        }
    }

    public void setCircleBackgroundColor(int i10) {
        if (i10 != this.w) {
            this.w = i10;
            this.f4321t.setColor(i10);
            invalidate();
        }
    }

    public void setCircleBackgroundColorResource(int i10) {
        setCircleBackgroundColor(getContext().getResources().getColor(i10));
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.D) {
            this.D = colorFilter;
            Paint paint = this.f4319r;
            if (paint != null) {
                paint.setColorFilter(colorFilter);
            }
            invalidate();
        }
    }

    public void setDisableCircularTransformation(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            a();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a();
    }

    public void setImageResource(int i10) {
        super.setImageResource(i10);
        a();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        a();
    }

    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        b();
    }

    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        b();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != I) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[]{scaleType}));
        }
    }
}
