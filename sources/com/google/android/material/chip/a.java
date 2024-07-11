package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import c0.c;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import h6.i;
import j6.d;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import m6.f;
import m6.j;
import s5.g;

public final class a extends f implements Drawable.Callback, i.b {
    public static final int[] U0 = {16842910};
    public static final ShapeDrawable V0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public boolean F0;
    public int G0;
    public int H0 = 255;
    public ColorFilter I0;
    public PorterDuffColorFilter J0;
    public ColorStateList K0;
    public ColorStateList L;
    public PorterDuff.Mode L0 = PorterDuff.Mode.SRC_IN;
    public ColorStateList M;
    public int[] M0;
    public float N;
    public boolean N0;
    public float O = -1.0f;
    public ColorStateList O0;
    public ColorStateList P;
    public WeakReference<C0033a> P0 = new WeakReference<>((Object) null);
    public float Q;
    public TextUtils.TruncateAt Q0;
    public ColorStateList R;
    public boolean R0;
    public CharSequence S;
    public int S0;
    public boolean T;
    public boolean T0;
    public Drawable U;
    public ColorStateList V;
    public float W;
    public boolean X;
    public boolean Y;
    public Drawable Z;

    /* renamed from: a0  reason: collision with root package name */
    public RippleDrawable f3359a0;

    /* renamed from: b0  reason: collision with root package name */
    public ColorStateList f3360b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f3361c0;

    /* renamed from: d0  reason: collision with root package name */
    public SpannableStringBuilder f3362d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f3363e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f3364f0;

    /* renamed from: g0  reason: collision with root package name */
    public Drawable f3365g0;

    /* renamed from: h0  reason: collision with root package name */
    public ColorStateList f3366h0;

    /* renamed from: i0  reason: collision with root package name */
    public g f3367i0;

    /* renamed from: j0  reason: collision with root package name */
    public g f3368j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f3369k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f3370l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f3371m0;

    /* renamed from: n0  reason: collision with root package name */
    public float f3372n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f3373o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f3374p0;

    /* renamed from: q0  reason: collision with root package name */
    public float f3375q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f3376r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Context f3377s0;
    public final Paint t0 = new Paint(1);

    /* renamed from: u0  reason: collision with root package name */
    public final Paint.FontMetrics f3378u0 = new Paint.FontMetrics();

    /* renamed from: v0  reason: collision with root package name */
    public final RectF f3379v0 = new RectF();

    /* renamed from: w0  reason: collision with root package name */
    public final PointF f3380w0 = new PointF();
    public final Path x0 = new Path();
    public final i y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f3381z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface C0033a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, R.style.Widget_MaterialComponents_Chip_Action);
        h(context);
        this.f3377s0 = context;
        i iVar = new i(this);
        this.y0 = iVar;
        this.S = BuildConfig.FLAVOR;
        iVar.f5899a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = U0;
        setState(iArr);
        if (!Arrays.equals(this.M0, iArr)) {
            this.M0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.R0 = true;
        int[] iArr2 = k6.a.f6709a;
        V0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    @Deprecated
    public final void A(float f10) {
        if (this.O != f10) {
            this.O = f10;
            setShapeAppearanceModel(this.f7121o.f7131a.d(f10));
        }
    }

    public final void B(Drawable drawable) {
        Drawable drawable2 = this.U;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof c) {
            drawable2 = ((c) drawable2).b();
        }
        if (drawable2 != drawable) {
            float p10 = p();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.U = drawable3;
            float p11 = p();
            U(drawable2);
            if (S()) {
                n(this.U);
            }
            invalidateSelf();
            if (p10 != p11) {
                u();
            }
        }
    }

    public final void C(float f10) {
        if (this.W != f10) {
            float p10 = p();
            this.W = f10;
            float p11 = p();
            invalidateSelf();
            if (p10 != p11) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.X = true;
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (S()) {
                this.U.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z) {
        if (this.T != z) {
            boolean S2 = S();
            this.T = z;
            boolean S3 = S();
            if (S2 != S3) {
                if (S3) {
                    n(this.U);
                } else {
                    U(this.U);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (this.T0) {
                f.b bVar = this.f7121o;
                if (bVar.d != colorStateList) {
                    bVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            this.t0.setStrokeWidth(f10);
            if (this.T0) {
                this.f7121o.f7140k = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.Z;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof c) {
            drawable2 = ((c) drawable2).b();
        }
        if (drawable2 != drawable) {
            float q10 = q();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.Z = drawable3;
            int[] iArr = k6.a.f6709a;
            this.f3359a0 = new RippleDrawable(k6.a.a(this.R), this.Z, V0);
            float q11 = q();
            U(drawable2);
            if (T()) {
                n(this.Z);
            }
            invalidateSelf();
            if (q10 != q11) {
                u();
            }
        }
    }

    public final void I(float f10) {
        if (this.f3375q0 != f10) {
            this.f3375q0 = f10;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f10) {
        if (this.f3361c0 != f10) {
            this.f3361c0 = f10;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f10) {
        if (this.f3374p0 != f10) {
            this.f3374p0 = f10;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f3360b0 != colorStateList) {
            this.f3360b0 = colorStateList;
            if (T()) {
                this.Z.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z) {
        if (this.Y != z) {
            boolean T2 = T();
            this.Y = z;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    n(this.Z);
                } else {
                    U(this.Z);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f10) {
        if (this.f3371m0 != f10) {
            float p10 = p();
            this.f3371m0 = f10;
            float p11 = p();
            invalidateSelf();
            if (p10 != p11) {
                u();
            }
        }
    }

    public final void O(float f10) {
        if (this.f3370l0 != f10) {
            float p10 = p();
            this.f3370l0 = f10;
            float p11 = p();
            invalidateSelf();
            if (p10 != p11) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (this.N0) {
                colorStateList2 = k6.a.a(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.O0 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final void Q(d dVar) {
        i iVar = this.y0;
        if (iVar.f5903f != dVar) {
            iVar.f5903f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f5899a;
                Context context = this.f3377s0;
                i.a aVar = iVar.f5900b;
                dVar.f(context, textPaint, aVar);
                i.b bVar = iVar.f5902e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                dVar.e(context, textPaint, aVar);
                iVar.d = true;
            }
            i.b bVar2 = iVar.f5902e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.f3364f0 && this.f3365g0 != null && this.F0;
    }

    public final boolean S() {
        return this.T && this.U != null;
    }

    public final boolean T() {
        return this.Y && this.Z != null;
    }

    public final void a() {
        u();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        RectF rectF;
        int i12;
        int i13;
        int i14;
        RectF rectF2;
        float f10;
        boolean z;
        int i15;
        float f11;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i10 = this.H0) != 0) {
            if (i10 < 255) {
                i11 = canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i10);
            } else {
                i11 = 0;
            }
            boolean z10 = this.T0;
            Paint paint = this.t0;
            RectF rectF3 = this.f3379v0;
            if (!z10) {
                paint.setColor(this.f3381z0);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, r(), r(), paint);
            }
            if (!this.T0) {
                paint.setColor(this.A0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.I0;
                if (colorFilter == null) {
                    colorFilter = this.J0;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, r(), r(), paint);
            }
            if (this.T0) {
                super.draw(canvas);
            }
            float f12 = 0.0f;
            if (this.Q > 0.0f && !this.T0) {
                paint.setColor(this.C0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.T0) {
                    ColorFilter colorFilter2 = this.I0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.J0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f13 = this.Q / 2.0f;
                rectF3.set(((float) bounds.left) + f13, ((float) bounds.top) + f13, ((float) bounds.right) - f13, ((float) bounds.bottom) - f13);
                float f14 = this.O - (this.Q / 2.0f);
                canvas2.drawRoundRect(rectF3, f14, f14, paint);
            }
            paint.setColor(this.D0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.T0) {
                canvas2.drawRoundRect(rectF3, r(), r(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.x0;
                j jVar = this.F;
                f.b bVar = this.f7121o;
                jVar.a(bVar.f7131a, bVar.f7139j, rectF4, this.E, path);
                f(canvas, paint, path, this.f7121o.f7131a, g());
            }
            if (S()) {
                o(bounds, rectF3);
                float f15 = rectF3.left;
                float f16 = rectF3.top;
                canvas2.translate(f15, f16);
                this.U.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.U.draw(canvas2);
                canvas2.translate(-f15, -f16);
            }
            if (R()) {
                o(bounds, rectF3);
                float f17 = rectF3.left;
                float f18 = rectF3.top;
                canvas2.translate(f17, f18);
                this.f3365g0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f3365g0.draw(canvas2);
                canvas2.translate(-f17, -f18);
            }
            if (!this.R0 || this.S == null) {
                rectF = rectF3;
                i13 = i11;
                i12 = 255;
                i14 = 0;
            } else {
                PointF pointF = this.f3380w0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.S;
                i iVar = this.y0;
                if (charSequence != null) {
                    float p10 = p() + this.f3369k0 + this.f3372n0;
                    if (getLayoutDirection() == 0) {
                        pointF.x = ((float) bounds.left) + p10;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - p10;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = iVar.f5899a;
                    Paint.FontMetrics fontMetrics = this.f3378u0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.S != null) {
                    float p11 = p() + this.f3369k0 + this.f3372n0;
                    float q10 = q() + this.f3376r0 + this.f3373o0;
                    if (getLayoutDirection() == 0) {
                        rectF3.left = ((float) bounds.left) + p11;
                        f11 = ((float) bounds.right) - q10;
                    } else {
                        rectF3.left = ((float) bounds.left) + q10;
                        f11 = ((float) bounds.right) - p11;
                    }
                    rectF3.right = f11;
                    rectF3.top = (float) bounds.top;
                    rectF3.bottom = (float) bounds.bottom;
                }
                d dVar = iVar.f5903f;
                TextPaint textPaint2 = iVar.f5899a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    iVar.f5903f.e(this.f3377s0, textPaint2, iVar.f5900b);
                }
                textPaint2.setTextAlign(align);
                String charSequence2 = this.S.toString();
                if (!iVar.d) {
                    f10 = iVar.f5901c;
                } else {
                    if (charSequence2 != null) {
                        f12 = textPaint2.measureText(charSequence2, 0, charSequence2.length());
                    }
                    iVar.f5901c = f12;
                    iVar.d = false;
                    f10 = f12;
                }
                if (Math.round(f10) > Math.round(rectF3.width())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i15 = canvas.save();
                    canvas2.clipRect(rectF3);
                } else {
                    i15 = 0;
                }
                CharSequence charSequence3 = this.S;
                if (z && this.Q0 != null) {
                    charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF3.width(), this.Q0);
                }
                CharSequence charSequence4 = charSequence3;
                rectF = rectF3;
                int length = charSequence4.length();
                i13 = i11;
                float f19 = pointF.x;
                i12 = 255;
                float f20 = pointF.y;
                i14 = 0;
                canvas.drawText(charSequence4, 0, length, f19, f20, textPaint2);
                if (z) {
                    canvas2.restoreToCount(i15);
                }
            }
            if (T()) {
                rectF.setEmpty();
                if (T()) {
                    float f21 = this.f3376r0 + this.f3375q0;
                    if (getLayoutDirection() == 0) {
                        float f22 = ((float) bounds.right) - f21;
                        rectF2 = rectF;
                        rectF2.right = f22;
                        rectF2.left = f22 - this.f3361c0;
                    } else {
                        rectF2 = rectF;
                        float f23 = ((float) bounds.left) + f21;
                        rectF2.left = f23;
                        rectF2.right = f23 + this.f3361c0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f24 = this.f3361c0;
                    float f25 = exactCenterY - (f24 / 2.0f);
                    rectF2.top = f25;
                    rectF2.bottom = f25 + f24;
                } else {
                    rectF2 = rectF;
                }
                float f26 = rectF2.left;
                float f27 = rectF2.top;
                canvas2.translate(f26, f27);
                this.Z.setBounds(i14, i14, (int) rectF2.width(), (int) rectF2.height());
                int[] iArr = k6.a.f6709a;
                this.f3359a0.setBounds(this.Z.getBounds());
                this.f3359a0.jumpToCurrentState();
                this.f3359a0.draw(canvas2);
                canvas2.translate(-f26, -f27);
            }
            if (this.H0 < i12) {
                canvas2.restoreToCount(i13);
            }
        }
    }

    public final int getAlpha() {
        return this.H0;
    }

    public final ColorFilter getColorFilter() {
        return this.I0;
    }

    public final int getIntrinsicHeight() {
        return (int) this.N;
    }

    public final int getIntrinsicWidth() {
        float f10;
        float p10 = p() + this.f3369k0 + this.f3372n0;
        String charSequence = this.S.toString();
        i iVar = this.y0;
        if (!iVar.d) {
            f10 = iVar.f5901c;
        } else {
            if (charSequence == null) {
                f10 = 0.0f;
            } else {
                f10 = iVar.f5899a.measureText(charSequence, 0, charSequence.length());
            }
            iVar.f5901c = f10;
            iVar.d = false;
        }
        return Math.min(Math.round(q() + f10 + p10 + this.f3373o0 + this.f3376r0), this.S0);
    }

    public final int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.T0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.O);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.N, this.O);
        }
        outline.setAlpha(((float) this.H0) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final boolean isStateful() {
        boolean z;
        boolean z10;
        ColorStateList colorStateList;
        if (s(this.L) || s(this.M) || s(this.P)) {
            return true;
        }
        if (this.N0 && s(this.O0)) {
            return true;
        }
        d dVar = this.y0.f5903f;
        if (dVar == null || (colorStateList = dVar.f6578a) == null || !colorStateList.isStateful()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        if (!this.f3364f0 || this.f3365g0 == null || !this.f3363e0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 || t(this.U) || t(this.f3365g0) || s(this.K0)) {
            return true;
        }
        return false;
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.Z) {
                if (drawable.isStateful()) {
                    drawable.setState(this.M0);
                }
                drawable.setTintList(this.f3360b0);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.U;
            if (drawable == drawable2 && this.X) {
                drawable2.setTintList(this.V);
            }
        }
    }

    public final void o(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f10;
        rectF.setEmpty();
        if (S() || R()) {
            float f11 = this.f3369k0 + this.f3370l0;
            if (this.F0) {
                drawable = this.f3365g0;
            } else {
                drawable = this.U;
            }
            float f12 = this.W;
            if (f12 <= 0.0f && drawable != null) {
                f12 = (float) drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f13 = ((float) rect.left) + f11;
                rectF.left = f13;
                rectF.right = f13 + f12;
            } else {
                float f14 = ((float) rect.right) - f11;
                rectF.right = f14;
                rectF.left = f14 - f12;
            }
            if (this.F0) {
                drawable2 = this.f3365g0;
            } else {
                drawable2 = this.U;
            }
            float f15 = this.W;
            if (f15 <= 0.0f && drawable2 != null) {
                f15 = (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 24, this.f3377s0.getResources().getDisplayMetrics()));
                if (((float) drawable2.getIntrinsicHeight()) <= f15) {
                    f10 = (float) drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f10;
                }
            }
            f10 = f15;
            float exactCenterY2 = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f10;
        }
    }

    public final boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (S()) {
            onLayoutDirectionChanged |= this.U.setLayoutDirection(i10);
        }
        if (R()) {
            onLayoutDirectionChanged |= this.f3365g0.setLayoutDirection(i10);
        }
        if (T()) {
            onLayoutDirectionChanged |= this.Z.setLayoutDirection(i10);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (S()) {
            onLevelChange |= this.U.setLevel(i10);
        }
        if (R()) {
            onLevelChange |= this.f3365g0.setLevel(i10);
        }
        if (T()) {
            onLevelChange |= this.Z.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.T0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.M0);
    }

    public final float p() {
        Drawable drawable;
        if (!S() && !R()) {
            return 0.0f;
        }
        float f10 = this.f3370l0;
        if (this.F0) {
            drawable = this.f3365g0;
        } else {
            drawable = this.U;
        }
        float f11 = this.W;
        if (f11 <= 0.0f && drawable != null) {
            f11 = (float) drawable.getIntrinsicWidth();
        }
        return f11 + f10 + this.f3371m0;
    }

    public final float q() {
        if (T()) {
            return this.f3374p0 + this.f3361c0 + this.f3375q0;
        }
        return 0.0f;
    }

    public final float r() {
        if (this.T0) {
            return this.f7121o.f7131a.f7154e.a(g());
        }
        return this.O;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j8);
        }
    }

    public final void setAlpha(int i10) {
        if (this.H0 != i10) {
            this.H0 = i10;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.I0 != colorFilter) {
            this.I0 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.K0 != colorStateList) {
            this.K0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.L0 != mode) {
            this.L0 = mode;
            ColorStateList colorStateList = this.K0;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
            this.J0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z10) {
        boolean visible = super.setVisible(z, z10);
        if (S()) {
            visible |= this.U.setVisible(z, z10);
        }
        if (R()) {
            visible |= this.f3365g0.setVisible(z, z10);
        }
        if (T()) {
            visible |= this.Z.setVisible(z, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        C0033a aVar = this.P0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean v(int[] iArr, int[] iArr2) {
        int i10;
        int i11;
        boolean z;
        boolean z10;
        int i12;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        int i15;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.L;
        if (colorStateList2 != null) {
            i10 = colorStateList2.getColorForState(iArr, this.f3381z0);
        } else {
            i10 = 0;
        }
        int d = d(i10);
        boolean z14 = true;
        if (this.f3381z0 != d) {
            this.f3381z0 = d;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.M;
        if (colorStateList3 != null) {
            i11 = colorStateList3.getColorForState(iArr, this.A0);
        } else {
            i11 = 0;
        }
        int d10 = d(i11);
        if (this.A0 != d10) {
            this.A0 = d10;
            onStateChange = true;
        }
        int b10 = b0.a.b(d10, d);
        if (this.B0 != b10) {
            z = true;
        } else {
            z = false;
        }
        if (this.f7121o.f7133c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z || z10) {
            this.B0 = b10;
            j(ColorStateList.valueOf(b10));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.P;
        if (colorStateList4 != null) {
            i12 = colorStateList4.getColorForState(iArr, this.C0);
        } else {
            i12 = 0;
        }
        if (this.C0 != i12) {
            this.C0 = i12;
            onStateChange = true;
        }
        if (this.O0 == null || !k6.a.b(iArr)) {
            i13 = 0;
        } else {
            i13 = this.O0.getColorForState(iArr, this.D0);
        }
        if (this.D0 != i13) {
            this.D0 = i13;
            if (this.N0) {
                onStateChange = true;
            }
        }
        d dVar = this.y0.f5903f;
        if (dVar == null || (colorStateList = dVar.f6578a) == null) {
            i14 = 0;
        } else {
            i14 = colorStateList.getColorForState(iArr, this.E0);
        }
        if (this.E0 != i14) {
            this.E0 = i14;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    break;
                } else if (state[i16] == 16842912) {
                    z11 = true;
                    break;
                } else {
                    i16++;
                }
            }
        }
        z11 = false;
        if (!z11 || !this.f3363e0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (this.F0 == z12 || this.f3365g0 == null) {
            z13 = false;
        } else {
            float p10 = p();
            this.F0 = z12;
            if (p10 != p()) {
                onStateChange = true;
                z13 = true;
            } else {
                z13 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.K0;
        if (colorStateList5 != null) {
            i15 = colorStateList5.getColorForState(iArr, this.G0);
        } else {
            i15 = 0;
        }
        if (this.G0 != i15) {
            this.G0 = i15;
            ColorStateList colorStateList6 = this.K0;
            PorterDuff.Mode mode = this.L0;
            if (colorStateList6 == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            }
            this.J0 = porterDuffColorFilter;
        } else {
            z14 = onStateChange;
        }
        if (t(this.U)) {
            z14 |= this.U.setState(iArr);
        }
        if (t(this.f3365g0)) {
            z14 |= this.f3365g0.setState(iArr);
        }
        if (t(this.Z)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z14 |= this.Z.setState(iArr3);
        }
        int[] iArr4 = k6.a.f6709a;
        if (t(this.f3359a0)) {
            z14 |= this.f3359a0.setState(iArr2);
        }
        if (z14) {
            invalidateSelf();
        }
        if (z13) {
            u();
        }
        return z14;
    }

    public final void w(boolean z) {
        if (this.f3363e0 != z) {
            this.f3363e0 = z;
            float p10 = p();
            if (!z && this.F0) {
                this.F0 = false;
            }
            float p11 = p();
            invalidateSelf();
            if (p10 != p11) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f3365g0 != drawable) {
            float p10 = p();
            this.f3365g0 = drawable;
            float p11 = p();
            U(this.f3365g0);
            n(this.f3365g0);
            invalidateSelf();
            if (p10 != p11) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        boolean z;
        if (this.f3366h0 != colorStateList) {
            this.f3366h0 = colorStateList;
            if (!this.f3364f0 || this.f3365g0 == null || !this.f3363e0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f3365g0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z) {
        if (this.f3364f0 != z) {
            boolean R2 = R();
            this.f3364f0 = z;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.f3365g0);
                } else {
                    U(this.f3365g0);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
