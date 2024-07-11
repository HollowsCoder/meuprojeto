package h6;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import b0.d;
import g0.d;
import h6.h;
import i0.b0;
import i0.w;
import j6.a;
import java.util.WeakHashMap;
import u0.b;

public final class c {
    public float A;
    public float B;
    public int[] C;
    public boolean D;
    public final TextPaint E;
    public final TextPaint F;
    public TimeInterpolator G;
    public TimeInterpolator H;
    public float I;
    public float J;
    public float K;
    public ColorStateList L;
    public float M;
    public StaticLayout N;
    public CharSequence O;

    /* renamed from: a  reason: collision with root package name */
    public final View f5858a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5859b;

    /* renamed from: c  reason: collision with root package name */
    public float f5860c;
    public final Rect d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f5861e;

    /* renamed from: f  reason: collision with root package name */
    public final RectF f5862f;

    /* renamed from: g  reason: collision with root package name */
    public int f5863g = 16;

    /* renamed from: h  reason: collision with root package name */
    public int f5864h = 16;

    /* renamed from: i  reason: collision with root package name */
    public float f5865i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f5866j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f5867k;
    public ColorStateList l;

    /* renamed from: m  reason: collision with root package name */
    public float f5868m;

    /* renamed from: n  reason: collision with root package name */
    public float f5869n;

    /* renamed from: o  reason: collision with root package name */
    public float f5870o;

    /* renamed from: p  reason: collision with root package name */
    public float f5871p;

    /* renamed from: q  reason: collision with root package name */
    public float f5872q;

    /* renamed from: r  reason: collision with root package name */
    public float f5873r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f5874s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f5875t;
    public Typeface u;

    /* renamed from: v  reason: collision with root package name */
    public a f5876v;
    public CharSequence w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f5877x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5878y;
    public Bitmap z;

    public c(View view) {
        this.f5858a = view;
        TextPaint textPaint = new TextPaint(129);
        this.E = textPaint;
        this.F = new TextPaint(textPaint);
        this.f5861e = new Rect();
        this.d = new Rect();
        this.f5862f = new RectF();
    }

    public static int a(float f10, int i10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((((float) Color.alpha(i11)) * f10) + (((float) Color.alpha(i10)) * f11)), (int) ((((float) Color.red(i11)) * f10) + (((float) Color.red(i10)) * f11)), (int) ((((float) Color.green(i11)) * f10) + (((float) Color.green(i10)) * f11)), (int) ((((float) Color.blue(i11)) * f10) + (((float) Color.blue(i10)) * f11)));
    }

    public static float f(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        LinearInterpolator linearInterpolator = s5.a.f8784a;
        return d.a(f11, f10, f12, f10);
    }

    public final float b() {
        if (this.w == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.F;
        textPaint.setTextSize(this.f5866j);
        textPaint.setTypeface(this.f5874s);
        textPaint.setLetterSpacing(this.M);
        CharSequence charSequence = this.w;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final boolean c(CharSequence charSequence) {
        d.C0068d dVar;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        boolean z10 = true;
        if (w.e.d(this.f5858a) != 1) {
            z10 = false;
        }
        if (z10) {
            dVar = g0.d.d;
        } else {
            dVar = g0.d.f4960c;
        }
        return dVar.b(charSequence, charSequence.length());
    }

    public final void d(float f10) {
        boolean z10;
        float f11;
        boolean z11;
        boolean z12;
        StaticLayout staticLayout;
        boolean z13;
        boolean z14;
        if (this.w != null) {
            float width = (float) this.f5861e.width();
            float width2 = (float) this.d.width();
            if (Math.abs(f10 - this.f5866j) < 0.001f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f11 = this.f5866j;
                this.A = 1.0f;
                Typeface typeface = this.u;
                Typeface typeface2 = this.f5874s;
                if (typeface != typeface2) {
                    this.u = typeface2;
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                float f12 = this.f5865i;
                Typeface typeface3 = this.u;
                Typeface typeface4 = this.f5875t;
                if (typeface3 != typeface4) {
                    this.u = typeface4;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (Math.abs(f10 - f12) < 0.001f) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    this.A = 1.0f;
                } else {
                    this.A = f10 / this.f5865i;
                }
                float f13 = this.f5866j / this.f5865i;
                if (width2 * f13 > width) {
                    width = Math.min(width / f13, width2);
                } else {
                    width = width2;
                }
                f11 = f12;
            }
            if (width > 0.0f) {
                if (this.B != f11 || this.D || z11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.B = f11;
                this.D = false;
            }
            if (this.f5877x == null || z11) {
                TextPaint textPaint = this.E;
                textPaint.setTextSize(this.B);
                textPaint.setTypeface(this.u);
                if (this.A != 1.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                textPaint.setLinearText(z12);
                boolean c10 = c(this.w);
                this.f5878y = c10;
                try {
                    h hVar = new h(this.w, textPaint, (int) width);
                    hVar.l = TextUtils.TruncateAt.END;
                    hVar.f5898k = c10;
                    hVar.f5892e = Layout.Alignment.ALIGN_NORMAL;
                    hVar.f5897j = false;
                    hVar.f5893f = 1;
                    hVar.f5894g = 0.0f;
                    hVar.f5895h = 1.0f;
                    hVar.f5896i = 1;
                    staticLayout = hVar.a();
                } catch (h.a e10) {
                    Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
                    staticLayout = null;
                }
                staticLayout.getClass();
                this.N = staticLayout;
                this.f5877x = staticLayout.getText();
            }
        }
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.C;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g() {
        boolean z10;
        Rect rect = this.f5861e;
        if (rect.width() > 0 && rect.height() > 0) {
            Rect rect2 = this.d;
            if (rect2.width() > 0 && rect2.height() > 0) {
                z10 = true;
                this.f5859b = z10;
            }
        }
        z10 = false;
        this.f5859b = z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r16 = this;
            r0 = r16
            android.view.View r1 = r0.f5858a
            int r2 = r1.getHeight()
            if (r2 <= 0) goto L_0x01c9
            int r2 = r1.getWidth()
            if (r2 > 0) goto L_0x0012
            goto L_0x01c9
        L_0x0012:
            float r2 = r0.B
            float r3 = r0.f5866j
            r0.d(r3)
            java.lang.CharSequence r3 = r0.f5877x
            android.text.TextPaint r4 = r0.E
            if (r3 == 0) goto L_0x0030
            android.text.StaticLayout r5 = r0.N
            if (r5 == 0) goto L_0x0030
            int r5 = r5.getWidth()
            float r5 = (float) r5
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r3 = android.text.TextUtils.ellipsize(r3, r4, r5, r6)
            r0.O = r3
        L_0x0030:
            java.lang.CharSequence r3 = r0.O
            r6 = 0
            if (r3 == 0) goto L_0x003e
            int r7 = r3.length()
            float r3 = r4.measureText(r3, r6, r7)
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            int r7 = r0.f5864h
            boolean r8 = r0.f5878y
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r8 = r7 & 112(0x70, float:1.57E-43)
            android.graphics.Rect r9 = r0.f5861e
            r10 = 80
            r11 = 48
            r12 = 1073741824(0x40000000, float:2.0)
            if (r8 == r11) goto L_0x0071
            if (r8 == r10) goto L_0x0066
            float r8 = r4.descent()
            float r13 = r4.ascent()
            float r8 = r8 - r13
            float r8 = r8 / r12
            int r13 = r9.centerY()
            float r13 = (float) r13
            float r13 = r13 - r8
            goto L_0x006e
        L_0x0066:
            int r8 = r9.bottom
            float r8 = (float) r8
            float r13 = r4.ascent()
            float r13 = r13 + r8
        L_0x006e:
            r0.f5869n = r13
            goto L_0x0076
        L_0x0071:
            int r8 = r9.top
            float r8 = (float) r8
            r0.f5869n = r8
        L_0x0076:
            r8 = 8388615(0x800007, float:1.1754953E-38)
            r7 = r7 & r8
            r13 = 5
            r14 = 1
            if (r7 == r14) goto L_0x008a
            if (r7 == r13) goto L_0x0086
            int r3 = r9.left
            float r3 = (float) r3
            r0.f5871p = r3
            goto L_0x0093
        L_0x0086:
            int r7 = r9.right
            float r7 = (float) r7
            goto L_0x0090
        L_0x008a:
            int r7 = r9.centerX()
            float r7 = (float) r7
            float r3 = r3 / r12
        L_0x0090:
            float r7 = r7 - r3
            r0.f5871p = r7
        L_0x0093:
            float r3 = r0.f5865i
            r0.d(r3)
            android.text.StaticLayout r3 = r0.N
            if (r3 == 0) goto L_0x00a2
            int r3 = r3.getHeight()
            float r3 = (float) r3
            goto L_0x00a3
        L_0x00a2:
            r3 = 0
        L_0x00a3:
            java.lang.CharSequence r7 = r0.f5877x
            if (r7 == 0) goto L_0x00b0
            int r15 = r7.length()
            float r7 = r4.measureText(r7, r6, r15)
            goto L_0x00b1
        L_0x00b0:
            r7 = 0
        L_0x00b1:
            android.text.StaticLayout r15 = r0.N
            if (r15 == 0) goto L_0x00b8
            r15.getLineLeft(r6)
        L_0x00b8:
            int r6 = r0.f5863g
            boolean r15 = r0.f5878y
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r15)
            r15 = r6 & 112(0x70, float:1.57E-43)
            android.graphics.Rect r5 = r0.d
            if (r15 == r11) goto L_0x00dc
            if (r15 == r10) goto L_0x00d2
            float r3 = r3 / r12
            int r10 = r5.centerY()
            float r10 = (float) r10
            float r10 = r10 - r3
            r0.f5868m = r10
            goto L_0x00e1
        L_0x00d2:
            int r10 = r5.bottom
            float r10 = (float) r10
            float r10 = r10 - r3
            float r3 = r4.descent()
            float r3 = r3 + r10
            goto L_0x00df
        L_0x00dc:
            int r3 = r5.top
            float r3 = (float) r3
        L_0x00df:
            r0.f5868m = r3
        L_0x00e1:
            r3 = r6 & r8
            if (r3 == r14) goto L_0x00ef
            if (r3 == r13) goto L_0x00eb
            int r3 = r5.left
            float r3 = (float) r3
            goto L_0x00f6
        L_0x00eb:
            int r3 = r5.right
            float r3 = (float) r3
            goto L_0x00f5
        L_0x00ef:
            int r3 = r5.centerX()
            float r3 = (float) r3
            float r7 = r7 / r12
        L_0x00f5:
            float r3 = r3 - r7
        L_0x00f6:
            r0.f5870o = r3
            android.graphics.Bitmap r3 = r0.z
            r6 = 0
            if (r3 == 0) goto L_0x0102
            r3.recycle()
            r0.z = r6
        L_0x0102:
            r0.k(r2)
            float r2 = r0.f5860c
            android.graphics.RectF r3 = r0.f5862f
            int r7 = r5.left
            float r7 = (float) r7
            int r8 = r9.left
            float r8 = (float) r8
            android.animation.TimeInterpolator r10 = r0.G
            float r7 = f(r7, r8, r2, r10)
            r3.left = r7
            float r7 = r0.f5868m
            float r8 = r0.f5869n
            android.animation.TimeInterpolator r10 = r0.G
            float r7 = f(r7, r8, r2, r10)
            r3.top = r7
            int r7 = r5.right
            float r7 = (float) r7
            int r8 = r9.right
            float r8 = (float) r8
            android.animation.TimeInterpolator r10 = r0.G
            float r7 = f(r7, r8, r2, r10)
            r3.right = r7
            int r5 = r5.bottom
            float r5 = (float) r5
            int r7 = r9.bottom
            float r7 = (float) r7
            android.animation.TimeInterpolator r8 = r0.G
            float r5 = f(r5, r7, r2, r8)
            r3.bottom = r5
            float r3 = r0.f5870o
            float r5 = r0.f5871p
            android.animation.TimeInterpolator r7 = r0.G
            float r3 = f(r3, r5, r2, r7)
            r0.f5872q = r3
            float r3 = r0.f5868m
            float r5 = r0.f5869n
            android.animation.TimeInterpolator r7 = r0.G
            float r3 = f(r3, r5, r2, r7)
            r0.f5873r = r3
            float r3 = r0.f5865i
            float r5 = r0.f5866j
            android.animation.TimeInterpolator r7 = r0.H
            float r3 = f(r3, r5, r2, r7)
            r0.k(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = r3 - r2
            u0.b r7 = s5.a.f8785b
            r8 = 0
            f(r8, r3, r5, r7)
            java.util.WeakHashMap<android.view.View, i0.b0> r5 = i0.w.f6004a
            i0.w.d.k(r1)
            f(r3, r8, r2, r7)
            i0.w.d.k(r1)
            android.content.res.ColorStateList r3 = r0.l
            android.content.res.ColorStateList r5 = r0.f5867k
            if (r3 == r5) goto L_0x018e
            int r3 = r0.e(r5)
            android.content.res.ColorStateList r5 = r0.l
            int r5 = r0.e(r5)
            int r3 = a(r2, r3, r5)
            goto L_0x0192
        L_0x018e:
            int r3 = r0.e(r3)
        L_0x0192:
            r4.setColor(r3)
            float r3 = r0.M
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x01a0
            float r3 = f(r5, r3, r2, r7)
        L_0x01a0:
            r4.setLetterSpacing(r3)
            float r3 = r0.I
            float r3 = f(r5, r3, r2, r6)
            float r7 = r0.J
            float r7 = f(r5, r7, r2, r6)
            float r8 = r0.K
            float r5 = f(r5, r8, r2, r6)
            int r6 = r0.e(r6)
            android.content.res.ColorStateList r8 = r0.L
            int r8 = r0.e(r8)
            int r2 = a(r2, r6, r8)
            r4.setShadowLayer(r3, r7, r5, r2)
            i0.w.d.k(r1)
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.c.h():void");
    }

    public final void i(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            h();
        }
    }

    public final void j(float f10) {
        int i10;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f5860c) {
            this.f5860c = f10;
            RectF rectF = this.f5862f;
            Rect rect = this.d;
            Rect rect2 = this.f5861e;
            rectF.left = f((float) rect.left, (float) rect2.left, f10, this.G);
            rectF.top = f(this.f5868m, this.f5869n, f10, this.G);
            rectF.right = f((float) rect.right, (float) rect2.right, f10, this.G);
            rectF.bottom = f((float) rect.bottom, (float) rect2.bottom, f10, this.G);
            this.f5872q = f(this.f5870o, this.f5871p, f10, this.G);
            this.f5873r = f(this.f5868m, this.f5869n, f10, this.G);
            k(f(this.f5865i, this.f5866j, f10, this.H));
            b bVar = s5.a.f8785b;
            f(0.0f, 1.0f, 1.0f - f10, bVar);
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            View view = this.f5858a;
            w.d.k(view);
            f(1.0f, 0.0f, f10, bVar);
            w.d.k(view);
            ColorStateList colorStateList = this.l;
            ColorStateList colorStateList2 = this.f5867k;
            TextPaint textPaint = this.E;
            if (colorStateList != colorStateList2) {
                i10 = a(f10, e(colorStateList2), e(this.l));
            } else {
                i10 = e(colorStateList);
            }
            textPaint.setColor(i10);
            float f11 = this.M;
            if (f11 != 0.0f) {
                f11 = f(0.0f, f11, f10, bVar);
            }
            textPaint.setLetterSpacing(f11);
            textPaint.setShadowLayer(f(0.0f, this.I, f10, (TimeInterpolator) null), f(0.0f, this.J, f10, (TimeInterpolator) null), f(0.0f, this.K, f10, (TimeInterpolator) null), a(f10, e((ColorStateList) null), e(this.L)));
            w.d.k(view);
        }
    }

    public final void k(float f10) {
        d(f10);
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.d.k(this.f5858a);
    }
}
