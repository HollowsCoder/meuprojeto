package o3;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

public final class k implements View.OnTouchListener, View.OnLayoutChangeListener {
    public final Matrix A = new Matrix();
    public final RectF B = new RectF();
    public final float[] C = new float[9];
    public d D;
    public f E;
    public View.OnClickListener F;
    public View.OnLongClickListener G;
    public f H;
    public int I = 2;
    public int J = 2;
    public boolean K = true;
    public ImageView.ScaleType L = ImageView.ScaleType.FIT_CENTER;
    public final a M;

    /* renamed from: o  reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f7717o = new AccelerateDecelerateInterpolator();

    /* renamed from: p  reason: collision with root package name */
    public int f7718p = 200;

    /* renamed from: q  reason: collision with root package name */
    public float f7719q = 1.0f;

    /* renamed from: r  reason: collision with root package name */
    public float f7720r = 1.75f;

    /* renamed from: s  reason: collision with root package name */
    public float f7721s = 3.0f;

    /* renamed from: t  reason: collision with root package name */
    public boolean f7722t = true;
    public boolean u = false;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f7723v;
    public final GestureDetector w;

    /* renamed from: x  reason: collision with root package name */
    public final b f7724x;

    /* renamed from: y  reason: collision with root package name */
    public final Matrix f7725y = new Matrix();
    public final Matrix z = new Matrix();

    public class a implements c {
        public a() {
        }

        public final void a(float f10, float f11, float f12) {
            k kVar = k.this;
            if (kVar.f() < kVar.f7721s || f10 < 1.0f) {
                kVar.getClass();
                kVar.A.postScale(f10, f10, f11, f12);
                kVar.a();
            }
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            k.this.getClass();
            return false;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            k kVar = k.this;
            View.OnLongClickListener onLongClickListener = kVar.G;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(kVar.f7723v);
            }
        }
    }

    public class c implements GestureDetector.OnDoubleTapListener {
        public c() {
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            k kVar = k.this;
            try {
                float f10 = kVar.f();
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float f11 = kVar.f7720r;
                if (f10 >= f11) {
                    if (f10 >= f11) {
                        f11 = kVar.f7721s;
                        if (f10 < f11) {
                        }
                    }
                    kVar.g(kVar.f7719q, x10, y10, true);
                    return true;
                }
                kVar.g(f11, x10, y10, true);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            k kVar = k.this;
            View.OnClickListener onClickListener = kVar.F;
            if (onClickListener != null) {
                onClickListener.onClick(kVar.f7723v);
            }
            RectF c10 = kVar.c();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            kVar.getClass();
            if (c10 == null) {
                return false;
            }
            if (c10.contains(x10, y10)) {
                c10.width();
                c10.height();
                f fVar = kVar.E;
                if (fVar == null) {
                    return true;
                }
                ImageView imageView = kVar.f7723v;
                fVar.getClass();
                return true;
            }
            kVar.getClass();
            return false;
        }
    }

    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7729a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7729a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7729a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7729a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7729a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o3.k.d.<clinit>():void");
        }
    }

    public class e implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final float f7730o;

        /* renamed from: p  reason: collision with root package name */
        public final float f7731p;

        /* renamed from: q  reason: collision with root package name */
        public final long f7732q = System.currentTimeMillis();

        /* renamed from: r  reason: collision with root package name */
        public final float f7733r;

        /* renamed from: s  reason: collision with root package name */
        public final float f7734s;

        public e(float f10, float f11, float f12, float f13) {
            this.f7730o = f12;
            this.f7731p = f13;
            this.f7733r = f10;
            this.f7734s = f11;
        }

        public final void run() {
            k kVar = k.this;
            float interpolation = kVar.f7717o.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f7732q)) * 1.0f) / ((float) kVar.f7718p)));
            float f10 = this.f7734s;
            float f11 = this.f7733r;
            float a10 = b0.d.a(f10, f11, interpolation, f11) / kVar.f();
            float f12 = this.f7731p;
            kVar.M.a(a10, this.f7730o, f12);
            if (interpolation < 1.0f) {
                kVar.f7723v.postOnAnimation(this);
            }
        }
    }

    public class f implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final OverScroller f7736o;

        /* renamed from: p  reason: collision with root package name */
        public int f7737p;

        /* renamed from: q  reason: collision with root package name */
        public int f7738q;

        public f(Context context) {
            this.f7736o = new OverScroller(context);
        }

        public final void run() {
            OverScroller overScroller = this.f7736o;
            if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                k kVar = k.this;
                kVar.A.postTranslate((float) (this.f7737p - currX), (float) (this.f7738q - currY));
                kVar.a();
                this.f7737p = currX;
                this.f7738q = currY;
                kVar.f7723v.postOnAnimation(this);
            }
        }
    }

    public k(ImageView imageView) {
        a aVar = new a();
        this.M = aVar;
        this.f7723v = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (!imageView.isInEditMode()) {
            this.f7724x = new b(imageView.getContext(), aVar);
            GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
            this.w = gestureDetector;
            gestureDetector.setOnDoubleTapListener(new c());
        }
    }

    public final void a() {
        if (b()) {
            Matrix e10 = e();
            this.f7723v.setImageMatrix(e10);
            if (this.D != null && d(e10) != null) {
                this.D.getClass();
            }
        }
    }

    public final boolean b() {
        float f10;
        RectF d10 = d(e());
        if (d10 == null) {
            return false;
        }
        float height = d10.height();
        float width = d10.width();
        ImageView imageView = this.f7723v;
        float height2 = (float) ((imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
        float f11 = 0.0f;
        if (height <= height2) {
            int i10 = d.f7729a[this.L.ordinal()];
            if (i10 != 2) {
                float f12 = height2 - height;
                if (i10 != 3) {
                    f12 /= 2.0f;
                }
                f10 = f12 - d10.top;
            } else {
                f10 = -d10.top;
            }
            this.J = 2;
        } else {
            float f13 = d10.top;
            if (f13 > 0.0f) {
                this.J = 0;
                f10 = -f13;
            } else {
                float f14 = d10.bottom;
                if (f14 < height2) {
                    this.J = 1;
                    f10 = height2 - f14;
                } else {
                    this.J = -1;
                    f10 = 0.0f;
                }
            }
        }
        float width2 = (float) ((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight());
        if (width <= width2) {
            int i11 = d.f7729a[this.L.ordinal()];
            if (i11 != 2) {
                float f15 = width2 - width;
                if (i11 != 3) {
                    f15 /= 2.0f;
                }
                f11 = f15 - d10.left;
            } else {
                f11 = -d10.left;
            }
            this.I = 2;
        } else {
            float f16 = d10.left;
            if (f16 > 0.0f) {
                this.I = 0;
                f11 = -f16;
            } else {
                float f17 = d10.right;
                if (f17 < width2) {
                    f11 = width2 - f17;
                    this.I = 1;
                } else {
                    this.I = -1;
                }
            }
        }
        this.A.postTranslate(f11, f10);
        return true;
    }

    public final RectF c() {
        b();
        return d(e());
    }

    public final RectF d(Matrix matrix) {
        Drawable drawable = this.f7723v.getDrawable();
        if (drawable == null) {
            return null;
        }
        RectF rectF = this.B;
        rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        matrix.mapRect(rectF);
        return rectF;
    }

    public final Matrix e() {
        Matrix matrix = this.z;
        matrix.set(this.f7725y);
        matrix.postConcat(this.A);
        return matrix;
    }

    public final float f() {
        Matrix matrix = this.A;
        float[] fArr = this.C;
        matrix.getValues(fArr);
        matrix.getValues(fArr);
        return (float) Math.sqrt((double) (((float) Math.pow((double) fArr[0], 2.0d)) + ((float) Math.pow((double) fArr[3], 2.0d))));
    }

    public final void g(float f10, float f11, float f12, boolean z10) {
        if (f10 < this.f7719q || f10 > this.f7721s) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        } else if (z10) {
            this.f7723v.post(new e(f(), f10, f11, f12));
        } else {
            this.A.setScale(f10, f10, f11, f12);
            a();
        }
    }

    public final void h() {
        boolean z10 = this.K;
        ImageView imageView = this.f7723v;
        if (z10) {
            i(imageView.getDrawable());
            return;
        }
        Matrix matrix = this.A;
        matrix.reset();
        matrix.postRotate(0.0f);
        a();
        Matrix e10 = e();
        imageView.setImageMatrix(e10);
        if (!(this.D == null || d(e10) == null)) {
            this.D.getClass();
        }
        b();
    }

    public final void i(Drawable drawable) {
        float f10;
        float f11;
        Matrix.ScaleToFit scaleToFit;
        if (drawable != null) {
            ImageView imageView = this.f7723v;
            float width = (float) ((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight());
            float height = (float) ((imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Matrix matrix = this.f7725y;
            matrix.reset();
            float f12 = (float) intrinsicWidth;
            float f13 = width / f12;
            float f14 = (float) intrinsicHeight;
            float f15 = height / f14;
            ImageView.ScaleType scaleType = this.L;
            if (scaleType == ImageView.ScaleType.CENTER) {
                f10 = (width - f12) / 2.0f;
            } else {
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    f11 = Math.max(f13, f15);
                } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                    f11 = Math.min(1.0f, Math.min(f13, f15));
                } else {
                    RectF rectF = new RectF(0.0f, 0.0f, f12, f14);
                    RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
                    if (((int) 0.0f) % 180 != 0) {
                        rectF = new RectF(0.0f, 0.0f, f14, f12);
                    }
                    int i10 = d.f7729a[this.L.ordinal()];
                    if (i10 == 1) {
                        scaleToFit = Matrix.ScaleToFit.CENTER;
                    } else if (i10 == 2) {
                        scaleToFit = Matrix.ScaleToFit.START;
                    } else if (i10 != 3) {
                        if (i10 == 4) {
                            scaleToFit = Matrix.ScaleToFit.FILL;
                        }
                        Matrix matrix2 = this.A;
                        matrix2.reset();
                        matrix2.postRotate(0.0f);
                        a();
                        Matrix e10 = e();
                        imageView.setImageMatrix(e10);
                        if (!(this.D == null || d(e10) == null)) {
                            this.D.getClass();
                        }
                        b();
                    } else {
                        scaleToFit = Matrix.ScaleToFit.END;
                    }
                    matrix.setRectToRect(rectF, rectF2, scaleToFit);
                    Matrix matrix22 = this.A;
                    matrix22.reset();
                    matrix22.postRotate(0.0f);
                    a();
                    Matrix e102 = e();
                    imageView.setImageMatrix(e102);
                    this.D.getClass();
                    b();
                }
                matrix.postScale(f11, f11);
                f10 = (width - (f12 * f11)) / 2.0f;
                f14 *= f11;
            }
            matrix.postTranslate(f10, (height - f14) / 2.0f);
            Matrix matrix222 = this.A;
            matrix222.reset();
            matrix222.postRotate(0.0f);
            a();
            Matrix e1022 = e();
            imageView.setImageMatrix(e1022);
            this.D.getClass();
            b();
        }
    }

    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 != i14 || i11 != i15 || i12 != i16 || i13 != i17) {
            i(this.f7723v.getDrawable());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.K
            r1 = 0
            if (r0 == 0) goto L_0x00c1
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r2 = 1
            if (r0 == 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x00c1
            int r0 = r12.getAction()
            if (r0 == 0) goto L_0x0070
            if (r0 == r2) goto L_0x0020
            r3 = 3
            if (r0 == r3) goto L_0x0020
            goto L_0x0085
        L_0x0020:
            float r0 = r10.f()
            float r3 = r10.f7719q
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            android.graphics.RectF r0 = r10.c()
            if (r0 == 0) goto L_0x0085
            o3.k$e r9 = new o3.k$e
            float r5 = r10.f()
            float r6 = r10.f7719q
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            goto L_0x006b
        L_0x0046:
            float r0 = r10.f()
            float r3 = r10.f7721s
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0085
            android.graphics.RectF r0 = r10.c()
            if (r0 == 0) goto L_0x0085
            o3.k$e r9 = new o3.k$e
            float r5 = r10.f()
            float r6 = r10.f7721s
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
        L_0x006b:
            r11.post(r9)
            r11 = r2
            goto L_0x0086
        L_0x0070:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L_0x0079
            r11.requestDisallowInterceptTouchEvent(r2)
        L_0x0079:
            o3.k$f r11 = r10.H
            if (r11 == 0) goto L_0x0085
            android.widget.OverScroller r11 = r11.f7736o
            r11.forceFinished(r2)
            r11 = 0
            r10.H = r11
        L_0x0085:
            r11 = r1
        L_0x0086:
            o3.b r0 = r10.f7724x
            if (r0 == 0) goto L_0x00b5
            android.view.ScaleGestureDetector r11 = r0.f7710c
            boolean r3 = r11.isInProgress()
            boolean r4 = r0.f7711e
            r11.onTouchEvent(r12)     // Catch:{ IllegalArgumentException -> 0x0098 }
            r0.a(r12)     // Catch:{ IllegalArgumentException -> 0x0098 }
        L_0x0098:
            if (r3 != 0) goto L_0x00a2
            boolean r11 = r11.isInProgress()
            if (r11 != 0) goto L_0x00a2
            r11 = r2
            goto L_0x00a3
        L_0x00a2:
            r11 = r1
        L_0x00a3:
            if (r4 != 0) goto L_0x00ab
            boolean r0 = r0.f7711e
            if (r0 != 0) goto L_0x00ab
            r0 = r2
            goto L_0x00ac
        L_0x00ab:
            r0 = r1
        L_0x00ac:
            if (r11 == 0) goto L_0x00b1
            if (r0 == 0) goto L_0x00b1
            r1 = r2
        L_0x00b1:
            r10.u = r1
            r1 = r2
            goto L_0x00b6
        L_0x00b5:
            r1 = r11
        L_0x00b6:
            android.view.GestureDetector r11 = r10.w
            if (r11 == 0) goto L_0x00c1
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto L_0x00c1
            r1 = r2
        L_0x00c1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.k.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
