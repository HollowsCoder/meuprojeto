package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.activity.result.c;
import androidx.appcompat.widget.g;
import com.google.android.material.chip.a;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import j0.b;
import j6.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import m6.i;
import m6.m;
import n.e;

public class Chip extends g implements a.C0033a, m {
    public static final Rect I = new Rect();
    public static final int[] J = {16842913};
    public static final int[] K = {16842911};
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public final b E;
    public final Rect F = new Rect();
    public final RectF G = new RectF();
    public final a H = new a();

    /* renamed from: s  reason: collision with root package name */
    public a f3344s;

    /* renamed from: t  reason: collision with root package name */
    public InsetDrawable f3345t;
    public RippleDrawable u;

    /* renamed from: v  reason: collision with root package name */
    public View.OnClickListener f3346v;
    public CompoundButton.OnCheckedChangeListener w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3347x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3348y;
    public boolean z;

    public class a extends c {
        public a() {
        }

        public final void p(int i10) {
        }

        public final void q(Typeface typeface, boolean z) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            a aVar = chip.f3344s;
            if (aVar.R0) {
                charSequence = aVar.S;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            chip.requestLayout();
            chip.invalidate();
        }
    }

    public class b extends o0.a {
        public b(Chip chip) {
            super(chip);
        }

        public final void l(ArrayList arrayList) {
            boolean z = false;
            arrayList.add(0);
            Rect rect = Chip.I;
            Chip chip = Chip.this;
            if (chip.e()) {
                a aVar = chip.f3344s;
                if (aVar != null && aVar.Y) {
                    z = true;
                }
                if (z && chip.f3346v != null) {
                    arrayList.add(1);
                }
            }
        }

        public final boolean o(int i10, int i11) {
            boolean z = false;
            if (i11 == 16) {
                Chip chip = Chip.this;
                if (i10 == 0) {
                    return chip.performClick();
                }
                if (i10 == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f3346v;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    chip.E.t(1, 1);
                }
            }
            return z;
        }

        public final void p(j0.b bVar) {
            String str;
            Chip chip = Chip.this;
            boolean f10 = chip.f();
            AccessibilityNodeInfo accessibilityNodeInfo = bVar.f6386a;
            accessibilityNodeInfo.setCheckable(f10);
            accessibilityNodeInfo.setClickable(chip.isClickable());
            if (!chip.f() && !chip.isClickable()) {
                str = "android.view.View";
            } else if (chip.f()) {
                str = "android.widget.CompoundButton";
            } else {
                str = "android.widget.Button";
            }
            bVar.g(str);
            bVar.k(chip.getText());
        }

        public final void q(int i10, j0.b bVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = bVar.f6386a;
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (i10 == 1) {
                Chip chip = Chip.this;
                CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
                } else {
                    CharSequence text = chip.getText();
                    Context context = chip.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
                }
                accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
                bVar.b(b.a.f6389e);
                accessibilityNodeInfo.setEnabled(chip.isEnabled());
                return;
            }
            accessibilityNodeInfo.setContentDescription(charSequence);
            accessibilityNodeInfo.setBoundsInParent(Chip.I);
        }

        public final void r(int i10, boolean z) {
            if (i10 == 1) {
                Chip chip = Chip.this;
                chip.A = z;
                chip.refreshDrawableState();
            }
        }

        public final int v(float f10, float f11) {
            Rect rect = Chip.I;
            Chip chip = Chip.this;
            if (!chip.e() || !chip.getCloseIconTouchBounds().contains(f10, f11)) {
                return 0;
            }
            return 1;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x033b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r1 = 2131952271(0x7f13028f, float:1.954098E38)
            r2 = 2130968761(0x7f0400b9, float:1.7546185E38)
            r3 = r18
            android.content.Context r1 = q6.a.a(r3, r7, r2, r1)
            r0.<init>(r1, r7, r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.F = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.G = r1
            com.google.android.material.chip.Chip$a r1 = new com.google.android.material.chip.Chip$a
            r1.<init>()
            r0.H = r1
            android.content.Context r8 = r17.getContext()
            r9 = 8388627(0x800013, float:1.175497E-38)
            r10 = 1
            if (r7 != 0) goto L_0x0033
            goto L_0x0093
        L_0x0033:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Chip"
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r2)
        L_0x0044:
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x0393
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x038b
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x0385
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x037f
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r10)
            if (r2 == 0) goto L_0x0377
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x0377
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x0377
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x0377
            java.lang.String r2 = "gravity"
            int r1 = r7.getAttributeIntValue(r1, r2, r9)
            if (r1 == r9) goto L_0x0093
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L_0x0093:
            com.google.android.material.chip.a r11 = new com.google.android.material.chip.a
            r11.<init>(r8, r7)
            android.content.Context r1 = r11.f3377s0
            int[] r12 = p9.u.f8115s
            r13 = 0
            int[] r6 = new int[r13]
            r5 = 2131952271(0x7f13028f, float:1.954098E38)
            r4 = 2130968761(0x7f0400b9, float:1.7546185E38)
            r2 = r19
            r3 = r12
            android.content.res.TypedArray r1 = h6.k.d(r1, r2, r3, r4, r5, r6)
            r14 = 37
            boolean r2 = r1.hasValue(r14)
            r11.T0 = r2
            r2 = 24
            android.content.Context r3 = r11.f3377s0
            android.content.res.ColorStateList r2 = j6.c.a(r3, r1, r2)
            android.content.res.ColorStateList r4 = r11.L
            if (r4 == r2) goto L_0x00c9
            r11.L = r2
            int[] r2 = r11.getState()
            r11.onStateChange(r2)
        L_0x00c9:
            r2 = 11
            android.content.res.ColorStateList r2 = j6.c.a(r3, r1, r2)
            android.content.res.ColorStateList r4 = r11.M
            if (r4 == r2) goto L_0x00dc
            r11.M = r2
            int[] r2 = r11.getState()
            r11.onStateChange(r2)
        L_0x00dc:
            r2 = 19
            r4 = 0
            float r2 = r1.getDimension(r2, r4)
            float r5 = r11.N
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00f1
            r11.N = r2
            r11.invalidateSelf()
            r11.u()
        L_0x00f1:
            r2 = 12
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x0100
            float r2 = r1.getDimension(r2, r4)
            r11.A(r2)
        L_0x0100:
            r2 = 22
            android.content.res.ColorStateList r2 = j6.c.a(r3, r1, r2)
            r11.F(r2)
            r2 = 23
            float r2 = r1.getDimension(r2, r4)
            r11.G(r2)
            r2 = 36
            android.content.res.ColorStateList r2 = j6.c.a(r3, r1, r2)
            r11.P(r2)
            r2 = 5
            java.lang.CharSequence r2 = r1.getText(r2)
            if (r2 != 0) goto L_0x0124
            java.lang.String r2 = ""
        L_0x0124:
            java.lang.CharSequence r5 = r11.S
            boolean r5 = android.text.TextUtils.equals(r5, r2)
            if (r5 != 0) goto L_0x0138
            r11.S = r2
            h6.i r2 = r11.y0
            r2.d = r10
            r11.invalidateSelf()
            r11.u()
        L_0x0138:
            boolean r2 = r1.hasValue(r13)
            if (r2 == 0) goto L_0x014a
            int r2 = r1.getResourceId(r13, r13)
            if (r2 == 0) goto L_0x014a
            j6.d r5 = new j6.d
            r5.<init>(r3, r2)
            goto L_0x014b
        L_0x014a:
            r5 = 0
        L_0x014b:
            float r2 = r5.f6587k
            float r2 = r1.getDimension(r10, r2)
            r5.f6587k = r2
            r11.Q(r5)
            r2 = 3
            int r5 = r1.getInt(r2, r13)
            if (r5 == r10) goto L_0x0169
            r6 = 2
            if (r5 == r6) goto L_0x0166
            if (r5 == r2) goto L_0x0163
            goto L_0x016d
        L_0x0163:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            goto L_0x016b
        L_0x0166:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x016b
        L_0x0169:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
        L_0x016b:
            r11.Q0 = r2
        L_0x016d:
            r2 = 18
            boolean r2 = r1.getBoolean(r2, r13)
            r11.E(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x0193
            java.lang.String r5 = "chipIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x0193
            java.lang.String r5 = "chipIconVisible"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 != 0) goto L_0x0193
            r5 = 15
            boolean r5 = r1.getBoolean(r5, r13)
            r11.E(r5)
        L_0x0193:
            r5 = 14
            android.graphics.drawable.Drawable r5 = j6.c.c(r3, r1, r5)
            r11.B(r5)
            r5 = 17
            boolean r6 = r1.hasValue(r5)
            if (r6 == 0) goto L_0x01ab
            android.content.res.ColorStateList r5 = j6.c.a(r3, r1, r5)
            r11.D(r5)
        L_0x01ab:
            r5 = 16
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r1.getDimension(r5, r6)
            r11.C(r5)
            r5 = 31
            boolean r5 = r1.getBoolean(r5, r13)
            r11.M(r5)
            if (r7 == 0) goto L_0x01da
            java.lang.String r5 = "closeIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x01da
            java.lang.String r5 = "closeIconVisible"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 != 0) goto L_0x01da
            r5 = 26
            boolean r5 = r1.getBoolean(r5, r13)
            r11.M(r5)
        L_0x01da:
            r5 = 25
            android.graphics.drawable.Drawable r5 = j6.c.c(r3, r1, r5)
            r11.H(r5)
            r5 = 30
            android.content.res.ColorStateList r5 = j6.c.a(r3, r1, r5)
            r11.L(r5)
            r5 = 28
            float r5 = r1.getDimension(r5, r4)
            r11.J(r5)
            r5 = 6
            boolean r5 = r1.getBoolean(r5, r13)
            r11.w(r5)
            r5 = 10
            boolean r5 = r1.getBoolean(r5, r13)
            r11.z(r5)
            if (r7 == 0) goto L_0x0221
            java.lang.String r5 = "checkedIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x0221
            java.lang.String r5 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r5)
            if (r2 != 0) goto L_0x0221
            r2 = 8
            boolean r2 = r1.getBoolean(r2, r13)
            r11.z(r2)
        L_0x0221:
            r2 = 7
            android.graphics.drawable.Drawable r2 = j6.c.c(r3, r1, r2)
            r11.x(r2)
            r2 = 9
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x0238
            android.content.res.ColorStateList r2 = j6.c.a(r3, r1, r2)
            r11.y(r2)
        L_0x0238:
            r2 = 39
            s5.g r2 = s5.g.a(r3, r1, r2)
            r11.f3367i0 = r2
            r2 = 33
            s5.g r2 = s5.g.a(r3, r1, r2)
            r11.f3368j0 = r2
            r2 = 21
            float r2 = r1.getDimension(r2, r4)
            float r3 = r11.f3369k0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x025c
            r11.f3369k0 = r2
            r11.invalidateSelf()
            r11.u()
        L_0x025c:
            r2 = 35
            float r2 = r1.getDimension(r2, r4)
            r11.O(r2)
            r2 = 34
            float r2 = r1.getDimension(r2, r4)
            r11.N(r2)
            r2 = 41
            float r2 = r1.getDimension(r2, r4)
            float r3 = r11.f3372n0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0282
            r11.f3372n0 = r2
            r11.invalidateSelf()
            r11.u()
        L_0x0282:
            r2 = 40
            float r2 = r1.getDimension(r2, r4)
            float r3 = r11.f3373o0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0296
            r11.f3373o0 = r2
            r11.invalidateSelf()
            r11.u()
        L_0x0296:
            r2 = 29
            float r2 = r1.getDimension(r2, r4)
            r11.K(r2)
            r2 = 27
            float r2 = r1.getDimension(r2, r4)
            r11.I(r2)
            r2 = 13
            float r2 = r1.getDimension(r2, r4)
            float r3 = r11.f3376r0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02bc
            r11.f3376r0 = r2
            r11.invalidateSelf()
            r11.u()
        L_0x02bc:
            r2 = 4
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r11.S0 = r2
            r1.recycle()
            r15 = 2131952271(0x7f13028f, float:1.954098E38)
            int[] r6 = new int[r13]
            r16 = 2130968761(0x7f0400b9, float:1.7546185E38)
            r4 = 2130968761(0x7f0400b9, float:1.7546185E38)
            r5 = 2131952271(0x7f13028f, float:1.954098E38)
            r1 = r8
            r2 = r19
            r3 = r12
            android.content.res.TypedArray r1 = h6.k.d(r1, r2, r3, r4, r5, r6)
            r2 = 32
            boolean r2 = r1.getBoolean(r2, r13)
            r0.B = r2
            android.content.Context r2 = r17.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 48
            float r3 = (float) r3
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r10, r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 20
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.D = r2
            r1.recycle()
            r0.setChipDrawable(r11)
            float r1 = i0.w.i.i(r17)
            r11.i(r1)
            int[] r6 = new int[r13]
            r1 = r8
            r2 = r19
            r3 = r12
            r4 = r16
            r5 = r15
            android.content.res.TypedArray r1 = h6.k.d(r1, r2, r3, r4, r5, r6)
            boolean r2 = r1.hasValue(r14)
            r1.recycle()
            com.google.android.material.chip.Chip$b r1 = new com.google.android.material.chip.Chip$b
            r1.<init>(r0)
            r0.E = r1
            r17.g()
            if (r2 != 0) goto L_0x0343
            a6.a r1 = new a6.a
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x0343:
            boolean r1 = r0.f3347x
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r11.S
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r11.Q0
            r0.setEllipsize(r1)
            r17.j()
            com.google.android.material.chip.a r1 = r0.f3344s
            boolean r1 = r1.R0
            if (r1 != 0) goto L_0x0361
            r0.setLines(r10)
            r0.setHorizontallyScrolling(r10)
        L_0x0361:
            r0.setGravity(r9)
            r17.i()
            boolean r1 = r0.B
            if (r1 == 0) goto L_0x0370
            int r1 = r0.D
            r0.setMinHeight(r1)
        L_0x0370:
            int r1 = i0.w.e.d(r17)
            r0.C = r1
            return
        L_0x0377:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x037f:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x0385:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x038b:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x0393:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.G;
        rectF.setEmpty();
        if (e() && this.f3346v != null) {
            a aVar = this.f3344s;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.T()) {
                float f10 = aVar.f3376r0 + aVar.f3375q0 + aVar.f3361c0 + aVar.f3374p0 + aVar.f3373o0;
                if (aVar.getLayoutDirection() == 0) {
                    float f11 = (float) bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = (float) bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.F;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private d getTextAppearance() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.y0.f5903f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.z != z10) {
            this.z = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f3348y != z10) {
            this.f3348y = z10;
            refreshDrawableState();
        }
    }

    public final void a() {
        d(this.D);
        requestLayout();
        invalidateOutline();
    }

    public final void d(int i10) {
        int i11;
        this.D = i10;
        int i12 = 0;
        if (!this.B) {
            InsetDrawable insetDrawable = this.f3345t;
            if (insetDrawable == null) {
                int[] iArr = k6.a.f6709a;
                h();
            } else if (insetDrawable != null) {
                this.f3345t = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr2 = k6.a.f6709a;
                h();
            }
        } else {
            int max = Math.max(0, i10 - ((int) this.f3344s.N));
            int max2 = Math.max(0, i10 - this.f3344s.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                if (max2 > 0) {
                    i11 = max2 / 2;
                } else {
                    i11 = 0;
                }
                if (max > 0) {
                    i12 = max / 2;
                }
                int i13 = i12;
                if (this.f3345t != null) {
                    Rect rect = new Rect();
                    this.f3345t.getPadding(rect);
                    if (rect.top == i13 && rect.bottom == i13 && rect.left == i11 && rect.right == i11) {
                        int[] iArr3 = k6.a.f6709a;
                        h();
                        return;
                    }
                }
                if (getMinHeight() != i10) {
                    setMinHeight(i10);
                }
                if (getMinWidth() != i10) {
                    setMinWidth(i10);
                }
                this.f3345t = new InsetDrawable(this.f3344s, i11, i13, i11, i13);
                int[] iArr4 = k6.a.f6709a;
                h();
                return;
            }
            InsetDrawable insetDrawable2 = this.f3345t;
            if (insetDrawable2 == null) {
                int[] iArr5 = k6.a.f6709a;
                h();
            } else if (insetDrawable2 != null) {
                this.f3345t = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr6 = k6.a.f6709a;
                h();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r0 != Integer.MIN_VALUE) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            java.lang.Class<o0.a> r0 = o0.a.class
            int r1 = r10.getAction()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 10
            com.google.android.material.chip.Chip$b r4 = r9.E
            r5 = 1
            r6 = 0
            if (r1 != r3) goto L_0x004f
            java.lang.String r1 = "m"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch:{ NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043, NoSuchFieldException -> 0x0041 }
            r1.setAccessible(r5)     // Catch:{ NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043, NoSuchFieldException -> 0x0041 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043, NoSuchFieldException -> 0x0041 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043, NoSuchFieldException -> 0x0041 }
            int r1 = r1.intValue()     // Catch:{ NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043, NoSuchFieldException -> 0x0041 }
            if (r1 == r2) goto L_0x004f
            java.lang.String r1 = "u"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043, NoSuchFieldException -> 0x0041 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043, NoSuchFieldException -> 0x0041 }
            r7[r6] = r8     // Catch:{ NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043, NoSuchFieldException -> 0x0041 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r7)     // Catch:{ NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043, NoSuchFieldException -> 0x0041 }
            r0.setAccessible(r5)     // Catch:{ NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043, NoSuchFieldException -> 0x0041 }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043, NoSuchFieldException -> 0x0041 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch:{ NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043, NoSuchFieldException -> 0x0041 }
            r1[r6] = r7     // Catch:{ NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043, NoSuchFieldException -> 0x0041 }
            r0.invoke(r4, r1)     // Catch:{ NoSuchMethodException -> 0x0047, IllegalAccessException -> 0x0045, InvocationTargetException -> 0x0043, NoSuchFieldException -> 0x0041 }
            r0 = r5
            goto L_0x0050
        L_0x0041:
            r0 = move-exception
            goto L_0x0048
        L_0x0043:
            r0 = move-exception
            goto L_0x0048
        L_0x0045:
            r0 = move-exception
            goto L_0x0048
        L_0x0047:
            r0 = move-exception
        L_0x0048:
            java.lang.String r1 = "Chip"
            java.lang.String r7 = "Unable to send Accessibility Exit event"
            android.util.Log.e(r1, r7, r0)
        L_0x004f:
            r0 = r6
        L_0x0050:
            if (r0 != 0) goto L_0x0095
            android.view.accessibility.AccessibilityManager r0 = r4.f7576h
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L_0x008a
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 != 0) goto L_0x0061
            goto L_0x008a
        L_0x0061:
            int r0 = r10.getAction()
            r1 = 7
            if (r0 == r1) goto L_0x0077
            r1 = 9
            if (r0 == r1) goto L_0x0077
            if (r0 == r3) goto L_0x006f
            goto L_0x008a
        L_0x006f:
            int r0 = r4.f7580m
            if (r0 == r2) goto L_0x008a
            r4.u(r2)
            goto L_0x0088
        L_0x0077:
            float r0 = r10.getX()
            float r1 = r10.getY()
            int r0 = r4.v(r0, r1)
            r4.u(r0)
            if (r0 == r2) goto L_0x008a
        L_0x0088:
            r0 = r5
            goto L_0x008b
        L_0x008a:
            r0 = r6
        L_0x008b:
            if (r0 != 0) goto L_0x0095
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r5 = r6
        L_0x0095:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        b bVar = this.E;
        bVar.getClass();
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i11 = 33;
                                } else if (keyCode == 21) {
                                    i11 = 17;
                                } else if (keyCode != 22) {
                                    i11 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i12 = 0;
                                while (i10 < repeatCount && bVar.m(i11, (Rect) null)) {
                                    i10++;
                                    i12 = 1;
                                }
                                i10 = i12;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i13 = bVar.l;
                    if (i13 != Integer.MIN_VALUE) {
                        bVar.o(i13, 16);
                    }
                    i10 = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i10 = bVar.m(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i10 = bVar.m(1, (Rect) null);
            }
        }
        if (i10 == 0 || bVar.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        int i10;
        super.drawableStateChanged();
        a aVar = this.f3344s;
        boolean z10 = false;
        if (aVar != null && a.t(aVar.Z)) {
            a aVar2 = this.f3344s;
            int isEnabled = isEnabled();
            if (this.A) {
                isEnabled++;
            }
            if (this.z) {
                isEnabled++;
            }
            if (this.f3348y) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.A) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.z) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.f3348y) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            if (!Arrays.equals(aVar2.M0, iArr)) {
                aVar2.M0 = iArr;
                if (aVar2.T()) {
                    z10 = aVar2.v(aVar2.getState(), iArr);
                }
            }
        }
        if (z10) {
            invalidate();
        }
    }

    public final boolean e() {
        a aVar = this.f3344s;
        if (aVar != null) {
            Drawable drawable = aVar.Z;
            if (drawable == null) {
                drawable = null;
            } else if (drawable instanceof c0.c) {
                drawable = ((c0.c) drawable).b();
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        a aVar = this.f3344s;
        if (aVar == null || !aVar.f3363e0) {
            return false;
        }
        return true;
    }

    public final void g() {
        b bVar;
        boolean z10;
        if (e()) {
            a aVar = this.f3344s;
            if (aVar == null || !aVar.Y) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && this.f3346v != null) {
                bVar = this.E;
                w.k(this, bVar);
            }
        }
        bVar = null;
        w.k(this, bVar);
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3345t;
        return insetDrawable == null ? this.f3344s : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3365g0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3366h0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.M;
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return Math.max(0.0f, aVar.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f3344s;
    }

    public float getChipEndPadding() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3376r0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        a aVar = this.f3344s;
        if (aVar == null || (drawable = aVar.U) == null) {
            return null;
        }
        if (drawable instanceof c0.c) {
            drawable = ((c0.c) drawable).b();
        }
        return drawable;
    }

    public float getChipIconSize() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.W;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.V;
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.N;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3369k0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.P;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.Q;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        a aVar = this.f3344s;
        if (aVar == null || (drawable = aVar.Z) == null) {
            return null;
        }
        if (drawable instanceof c0.c) {
            drawable = ((c0.c) drawable).b();
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3362d0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3375q0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3361c0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3374p0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3360b0;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.Q0;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        b bVar = this.E;
        if (bVar.l == 1 || bVar.f7579k == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public s5.g getHideMotionSpec() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3368j0;
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3371m0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3370l0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.R;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        return this.f3344s.f7121o.f7131a;
    }

    public s5.g getShowMotionSpec() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3367i0;
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3373o0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f3344s;
        if (aVar != null) {
            return aVar.f3372n0;
        }
        return 0.0f;
    }

    public final void h() {
        this.u = new RippleDrawable(k6.a.a(this.f3344s.R), getBackgroundDrawable(), (Drawable) null);
        a aVar = this.f3344s;
        if (aVar.N0) {
            aVar.N0 = false;
            aVar.O0 = null;
            aVar.onStateChange(aVar.getState());
        }
        RippleDrawable rippleDrawable = this.u;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.d.q(this, rippleDrawable);
        i();
    }

    public final void i() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f3344s) != null) {
            int q10 = (int) (aVar.q() + aVar.f3376r0 + aVar.f3373o0);
            a aVar2 = this.f3344s;
            int p10 = (int) (aVar2.p() + aVar2.f3369k0 + aVar2.f3372n0);
            if (this.f3345t != null) {
                Rect rect = new Rect();
                this.f3345t.getPadding(rect);
                p10 += rect.left;
                q10 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.e.k(this, p10, paddingTop, q10, paddingBottom);
        }
    }

    public final void j() {
        TextPaint paint = getPaint();
        a aVar = this.f3344s;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.H);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e.E(this, this.f3344s);
    }

    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, J);
        }
        if (f()) {
            View.mergeDrawableStates(onCreateDrawableState, K);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        b bVar = this.E;
        int i11 = bVar.l;
        if (i11 != Integer.MIN_VALUE) {
            bVar.j(i11);
        }
        if (z10) {
            bVar.m(i10, rect);
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z10 = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z10 = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z10);
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!f() && !isClickable()) {
            str = "android.view.View";
        } else if (f()) {
            str = "android.widget.CompoundButton";
        } else {
            str = "android.widget.Button";
        }
        accessibilityNodeInfo.setClassName(str);
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i11 = -1;
            if (chipGroup.f5883q) {
                int i12 = 0;
                i10 = 0;
                while (true) {
                    if (i12 >= chipGroup.getChildCount()) {
                        break;
                    }
                    if (chipGroup.getChildAt(i12) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i12)) == this) {
                            break;
                        }
                        i10++;
                    }
                    i12++;
                }
            }
            i10 = -1;
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i11 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b.C0084b.a(i11, 1, i10, 1, isChecked()).f6399a);
        }
    }

    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.C != i10) {
            this.C = i10;
            i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0045
            if (r0 == r2) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0040
            goto L_0x004c
        L_0x0021:
            boolean r0 = r5.f3348y
            if (r0 == 0) goto L_0x004c
            if (r1 != 0) goto L_0x004a
            r5.setCloseIconPressed(r3)
            goto L_0x004a
        L_0x002b:
            boolean r0 = r5.f3348y
            if (r0 == 0) goto L_0x0040
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f3346v
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            com.google.android.material.chip.Chip$b r0 = r5.E
            r0.t(r2, r2)
            r0 = r2
            goto L_0x0041
        L_0x0040:
            r0 = r3
        L_0x0041:
            r5.setCloseIconPressed(r3)
            goto L_0x004d
        L_0x0045:
            if (r1 == 0) goto L_0x004c
            r5.setCloseIconPressed(r2)
        L_0x004a:
            r0 = r2
            goto L_0x004d
        L_0x004c:
            r0 = r3
        L_0x004d:
            if (r0 != 0) goto L_0x0057
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r2 = r3
        L_0x0057:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.u) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.u) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.w(z10);
        }
    }

    public void setCheckableResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.w(aVar.f3377s0.getResources().getBoolean(i10));
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        a aVar = this.f3344s;
        if (aVar == null) {
            this.f3347x = z10;
        } else if (aVar.f3363e0) {
            boolean isChecked = isChecked();
            super.setChecked(z10);
            if (isChecked != z10 && (onCheckedChangeListener = this.w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z10);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.x(f.a.b(aVar.f3377s0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.y(f.a.a(aVar.f3377s0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.z(aVar.f3377s0.getResources().getBoolean(i10));
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.z(z10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f3344s;
        if (aVar != null && aVar.M != colorStateList) {
            aVar.M = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList a10;
        a aVar = this.f3344s;
        if (aVar != null && aVar.M != (a10 = f.a.a(aVar.f3377s0, i10))) {
            aVar.M = a10;
            aVar.onStateChange(aVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.A(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.A(aVar.f3377s0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f3344s;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.P0 = new WeakReference<>((Object) null);
            }
            this.f3344s = aVar;
            aVar.R0 = false;
            aVar.P0 = new WeakReference<>(this);
            d(this.D);
        }
    }

    public void setChipEndPadding(float f10) {
        a aVar = this.f3344s;
        if (aVar != null && aVar.f3376r0 != f10) {
            aVar.f3376r0 = f10;
            aVar.invalidateSelf();
            aVar.u();
        }
    }

    public void setChipEndPaddingResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            float dimension = aVar.f3377s0.getResources().getDimension(i10);
            if (aVar.f3376r0 != dimension) {
                aVar.f3376r0 = dimension;
                aVar.invalidateSelf();
                aVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.B(f.a.b(aVar.f3377s0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.C(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.C(aVar.f3377s0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.D(f.a.a(aVar.f3377s0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.E(aVar.f3377s0.getResources().getBoolean(i10));
        }
    }

    public void setChipIconVisible(boolean z10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.E(z10);
        }
    }

    public void setChipMinHeight(float f10) {
        a aVar = this.f3344s;
        if (aVar != null && aVar.N != f10) {
            aVar.N = f10;
            aVar.invalidateSelf();
            aVar.u();
        }
    }

    public void setChipMinHeightResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            float dimension = aVar.f3377s0.getResources().getDimension(i10);
            if (aVar.N != dimension) {
                aVar.N = dimension;
                aVar.invalidateSelf();
                aVar.u();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        a aVar = this.f3344s;
        if (aVar != null && aVar.f3369k0 != f10) {
            aVar.f3369k0 = f10;
            aVar.invalidateSelf();
            aVar.u();
        }
    }

    public void setChipStartPaddingResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            float dimension = aVar.f3377s0.getResources().getDimension(i10);
            if (aVar.f3369k0 != dimension) {
                aVar.f3369k0 = dimension;
                aVar.invalidateSelf();
                aVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.F(f.a.a(aVar.f3377s0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.G(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.G(aVar.f3377s0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.H(drawable);
        }
        g();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        g0.a aVar;
        a aVar2 = this.f3344s;
        if (aVar2 != null && aVar2.f3362d0 != charSequence) {
            String str = g0.a.d;
            Locale locale = Locale.getDefault();
            int i10 = g0.e.f4964a;
            boolean z10 = true;
            if (TextUtils.getLayoutDirectionFromLocale(locale) != 1) {
                z10 = false;
            }
            if (z10) {
                aVar = g0.a.f4947g;
            } else {
                aVar = g0.a.f4946f;
            }
            aVar2.f3362d0 = aVar.c(charSequence, aVar.f4950c);
            aVar2.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.I(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.I(aVar.f3377s0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.H(f.a.b(aVar.f3377s0, i10));
        }
        g();
    }

    public void setCloseIconSize(float f10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.J(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.J(aVar.f3377s0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.K(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.K(aVar.f3377s0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.L(f.a.a(aVar.f3377s0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCloseIconVisible(boolean z10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.M(z10);
        }
        g();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.i(f10);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3344s != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f3344s;
                if (aVar != null) {
                    aVar.Q0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.B = z10;
        d(this.D);
    }

    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(s5.g gVar) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.f3368j0 = gVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.f3368j0 = s5.g.b(aVar.f3377s0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.N(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.N(aVar.f3377s0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.O(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.O(aVar.f3377s0.getResources().getDimension(i10));
        }
    }

    public void setLayoutDirection(int i10) {
        if (this.f3344s != null) {
            super.setLayoutDirection(i10);
        }
    }

    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.S0 = i10;
        }
    }

    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3346v = onClickListener;
        g();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.P(colorStateList);
        }
        if (!this.f3344s.N0) {
            h();
        }
    }

    public void setRippleColorResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.P(f.a.a(aVar.f3377s0, i10));
            if (!this.f3344s.N0) {
                h();
            }
        }
    }

    public void setShapeAppearanceModel(i iVar) {
        this.f3344s.setShapeAppearanceModel(iVar);
    }

    public void setShowMotionSpec(s5.g gVar) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.f3367i0 = gVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.f3367i0 = s5.g.b(aVar.f3377s0, i10);
        }
    }

    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        a aVar = this.f3344s;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            if (aVar.R0) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            a aVar2 = this.f3344s;
            if (aVar2 != null && !TextUtils.equals(aVar2.S, charSequence)) {
                aVar2.S = charSequence;
                aVar2.y0.d = true;
                aVar2.invalidateSelf();
                aVar2.u();
            }
        }
    }

    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.Q(new d(aVar.f3377s0, i10));
        }
        j();
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.Q(dVar);
        }
        j();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        a aVar = this.f3344s;
        if (aVar != null && aVar.f3373o0 != f10) {
            aVar.f3373o0 = f10;
            aVar.invalidateSelf();
            aVar.u();
        }
    }

    public void setTextEndPaddingResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            float dimension = aVar.f3377s0.getResources().getDimension(i10);
            if (aVar.f3373o0 != dimension) {
                aVar.f3373o0 = dimension;
                aVar.invalidateSelf();
                aVar.u();
            }
        }
    }

    public void setTextStartPadding(float f10) {
        a aVar = this.f3344s;
        if (aVar != null && aVar.f3372n0 != f10) {
            aVar.f3372n0 = f10;
            aVar.invalidateSelf();
            aVar.u();
        }
    }

    public void setTextStartPaddingResource(int i10) {
        a aVar = this.f3344s;
        if (aVar != null) {
            float dimension = aVar.f3377s0.getResources().getDimension(i10);
            if (aVar.f3372n0 != dimension) {
                aVar.f3372n0 = dimension;
                aVar.invalidateSelf();
                aVar.u();
            }
        }
    }

    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        a aVar = this.f3344s;
        if (aVar != null) {
            aVar.Q(new d(aVar.f3377s0, i10));
        }
        j();
    }
}
