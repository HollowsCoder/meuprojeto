package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.k0;
import com.google.android.material.internal.CheckableImageButton;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m6.i;
import p6.k;
import p6.l;
import y.a;

public class TextInputLayout extends LinearLayout {
    public AppCompatTextView A;
    public boolean A0;
    public int B;
    public ColorDrawable B0;
    public int C;
    public int C0;
    public CharSequence D;
    public Drawable D0;
    public boolean E;
    public View.OnLongClickListener E0;
    public AppCompatTextView F;
    public View.OnLongClickListener F0;
    public ColorStateList G;
    public final CheckableImageButton G0;
    public int H;
    public ColorStateList H0;
    public ColorStateList I;
    public ColorStateList I0;
    public ColorStateList J;
    public ColorStateList J0;
    public CharSequence K;
    public int K0;
    public final AppCompatTextView L;
    public int L0;
    public CharSequence M;
    public int M0;
    public final AppCompatTextView N;
    public ColorStateList N0;
    public boolean O;
    public int O0;
    public CharSequence P;
    public int P0;
    public boolean Q;
    public int Q0;
    public m6.f R;
    public int R0;
    public m6.f S;
    public int S0;
    public final i T;
    public boolean T0;
    public final int U;
    public final h6.c U0;
    public int V;
    public boolean V0;
    public int W;
    public boolean W0;
    public ValueAnimator X0;
    public boolean Y0;
    public boolean Z0;

    /* renamed from: a0  reason: collision with root package name */
    public int f3579a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f3580b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f3581c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f3582d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f3583e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f3584f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Rect f3585g0 = new Rect();

    /* renamed from: h0  reason: collision with root package name */
    public final Rect f3586h0 = new Rect();

    /* renamed from: i0  reason: collision with root package name */
    public final RectF f3587i0 = new RectF();

    /* renamed from: j0  reason: collision with root package name */
    public Typeface f3588j0;

    /* renamed from: k0  reason: collision with root package name */
    public final CheckableImageButton f3589k0;

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f3590l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f3591m0;

    /* renamed from: n0  reason: collision with root package name */
    public PorterDuff.Mode f3592n0;

    /* renamed from: o  reason: collision with root package name */
    public final FrameLayout f3593o;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f3594o0;

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f3595p;

    /* renamed from: p0  reason: collision with root package name */
    public ColorDrawable f3596p0;

    /* renamed from: q  reason: collision with root package name */
    public final LinearLayout f3597q;

    /* renamed from: q0  reason: collision with root package name */
    public int f3598q0;

    /* renamed from: r  reason: collision with root package name */
    public final FrameLayout f3599r;

    /* renamed from: r0  reason: collision with root package name */
    public View.OnLongClickListener f3600r0;

    /* renamed from: s  reason: collision with root package name */
    public EditText f3601s;

    /* renamed from: s0  reason: collision with root package name */
    public final LinkedHashSet<f> f3602s0 = new LinkedHashSet<>();

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f3603t;
    public int t0 = 0;
    public int u = -1;

    /* renamed from: u0  reason: collision with root package name */
    public final SparseArray<k> f3604u0;

    /* renamed from: v  reason: collision with root package name */
    public int f3605v = -1;

    /* renamed from: v0  reason: collision with root package name */
    public final CheckableImageButton f3606v0;
    public final l w = new l(this);

    /* renamed from: w0  reason: collision with root package name */
    public final LinkedHashSet<g> f3607w0;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3608x;
    public ColorStateList x0;

    /* renamed from: y  reason: collision with root package name */
    public int f3609y;
    public boolean y0;
    public boolean z;

    /* renamed from: z0  reason: collision with root package name */
    public PorterDuff.Mode f3610z0;

    public class a implements TextWatcher {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.s(!textInputLayout.Z0, false);
            if (textInputLayout.f3608x) {
                textInputLayout.n(editable.length());
            }
            if (textInputLayout.E) {
                textInputLayout.t(editable.length());
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.f3606v0.performClick();
            textInputLayout.f3606v0.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            TextInputLayout.this.f3601s.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.U0.j(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends i0.a {
        public final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        public void d(View view, j0.b bVar) {
            Editable editable;
            boolean z;
            String str;
            j0.b bVar2 = bVar;
            View.AccessibilityDelegate accessibilityDelegate = this.f5951a;
            AccessibilityNodeInfo accessibilityNodeInfo = bVar2.f6386a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.d;
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean z10 = !TextUtils.isEmpty(editable);
            boolean z11 = !TextUtils.isEmpty(hint);
            boolean z12 = !textInputLayout.T0;
            boolean z13 = !TextUtils.isEmpty(error);
            if (z13 || !TextUtils.isEmpty(counterOverflowDescription)) {
                z = true;
            } else {
                z = false;
            }
            if (z11) {
                str = hint.toString();
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (z10) {
                bVar2.k(editable);
            } else if (!TextUtils.isEmpty(str)) {
                bVar2.k(str);
                if (z12 && placeholderText != null) {
                    bVar2.k(str + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                bVar2.k(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    bVar2.j(str);
                } else {
                    if (z10) {
                        str = editable + ", " + str;
                    }
                    bVar2.k(str);
                }
                boolean z14 = !z10;
                if (i10 >= 26) {
                    accessibilityNodeInfo.setShowingHintText(z14);
                } else {
                    bVar2.f(4, z14);
                }
            }
            if (editable == null || editable.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z) {
                if (!z13) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            if (editText != null) {
                editText.setLabelFor(R.id.textinput_helper_text);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    public static class h extends n0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: q  reason: collision with root package name */
        public CharSequence f3615q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f3616r;

        /* renamed from: s  reason: collision with root package name */
        public CharSequence f3617s;

        /* renamed from: t  reason: collision with root package name */
        public CharSequence f3618t;
        public CharSequence u;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new h[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3615q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3616r = parcel.readInt() != 1 ? false : true;
            this.f3617s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3618t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f3615q + " hint=" + this.f3617s + " helperText=" + this.f3618t + " placeholderText=" + this.u + "}";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f7340o, i10);
            TextUtils.writeToParcel(this.f3615q, parcel, i10);
            parcel.writeInt(this.f3616r ? 1 : 0);
            TextUtils.writeToParcel(this.f3617s, parcel, i10);
            TextUtils.writeToParcel(this.f3618t, parcel, i10);
            TextUtils.writeToParcel(this.u, parcel, i10);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x05be  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x05dc  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x05fa  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0609  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0618  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x05af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r30, android.util.AttributeSet r31) {
        /*
            r29 = this;
            r0 = r29
            r7 = r31
            r8 = 2130969555(0x7f0403d3, float:1.7547795E38)
            r9 = 2131952236(0x7f13026c, float:1.954091E38)
            r1 = r30
            android.content.Context r1 = q6.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.u = r10
            r0.f3605v = r10
            p6.l r1 = new p6.l
            r1.<init>(r0)
            r0.w = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f3585g0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f3586h0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f3587i0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f3602s0 = r1
            r11 = 0
            r0.t0 = r11
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            r0.f3604u0 = r12
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f3607w0 = r1
            h6.c r1 = new h6.c
            r1.<init>(r0)
            r0.U0 = r1
            android.content.Context r13 = r29.getContext()
            r14 = 1
            r0.setOrientation(r14)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r14)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r13)
            r0.f3593o = r2
            r2.setAddStatesFromChildren(r14)
            r0.addView(r2)
            android.widget.LinearLayout r15 = new android.widget.LinearLayout
            r15.<init>(r13)
            r0.f3595p = r15
            r15.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r6 = -2
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3.<init>(r6, r10, r4)
            r15.setLayoutParams(r3)
            r2.addView(r15)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r13)
            r0.f3597q = r5
            r5.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388613(0x800005, float:1.175495E-38)
            r3.<init>(r6, r10, r4)
            r5.setLayoutParams(r3)
            r2.addView(r5)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r13)
            r0.f3599r = r4
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r6, r10)
            r4.setLayoutParams(r2)
            android.view.animation.LinearInterpolator r2 = s5.a.f8784a
            r1.H = r2
            r1.h()
            r1.G = r2
            r1.h()
            int r2 = r1.f5864h
            r3 = 8388659(0x800033, float:1.1755015E-38)
            if (r2 == r3) goto L_0x00c6
            r1.f5864h = r3
            r1.h()
        L_0x00c6:
            int[] r3 = p9.u.T
            r2 = 5
            int[] r1 = new int[r2]
            r1 = {20, 18, 33, 38, 42} // fill-array
            h6.k.a(r13, r7, r8, r9)
            r16 = 2131952236(0x7f13026c, float:1.954091E38)
            r17 = 2130969555(0x7f0403d3, float:1.7547795E38)
            r18 = r1
            r1 = r13
            r2 = r31
            r30 = r3
            r19 = r4
            r4 = r17
            r20 = r5
            r5 = r16
            r6 = r18
            h6.k.b(r1, r2, r3, r4, r5, r6)
            androidx.appcompat.widget.e1 r1 = new androidx.appcompat.widget.e1
            r2 = r30
            android.content.res.TypedArray r2 = r13.obtainStyledAttributes(r7, r2, r8, r9)
            r1.<init>(r13, r2)
            r3 = 41
            boolean r3 = r1.a(r3, r14)
            r0.O = r3
            r3 = 4
            java.lang.CharSequence r3 = r1.k(r3)
            r0.setHint((java.lang.CharSequence) r3)
            r3 = 40
            boolean r3 = r1.a(r3, r14)
            r0.W0 = r3
            r3 = 35
            boolean r3 = r1.a(r3, r14)
            r0.V0 = r3
            r3 = 3
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x0124
            int r4 = r1.d(r3, r10)
            r0.setMinWidth(r4)
        L_0x0124:
            r4 = 2
            boolean r5 = r1.l(r4)
            if (r5 == 0) goto L_0x0132
            int r5 = r1.d(r4, r10)
            r0.setMaxWidth(r5)
        L_0x0132:
            m6.a r5 = new m6.a
            float r6 = (float) r11
            r5.<init>(r6)
            int[] r6 = p9.u.J
            android.content.res.TypedArray r6 = r13.obtainStyledAttributes(r7, r6, r8, r9)
            int r7 = r6.getResourceId(r11, r11)
            int r8 = r6.getResourceId(r14, r11)
            r6.recycle()
            m6.i$a r5 = m6.i.a(r13, r7, r8, r5)
            m6.i r6 = new m6.i
            r6.<init>(r5)
            r0.T = r6
            android.content.res.Resources r5 = r13.getResources()
            r7 = 2131165573(0x7f070185, float:1.7945367E38)
            int r5 = r5.getDimensionPixelOffset(r7)
            r0.U = r5
            r5 = 7
            int r5 = r1.c(r5, r11)
            r0.f3579a0 = r5
            android.content.res.Resources r5 = r13.getResources()
            r7 = 2131165574(0x7f070186, float:1.7945369E38)
            int r5 = r5.getDimensionPixelSize(r7)
            r7 = 14
            int r5 = r1.d(r7, r5)
            r0.f3581c0 = r5
            android.content.res.Resources r5 = r13.getResources()
            r7 = 2131165575(0x7f070187, float:1.794537E38)
            int r5 = r5.getDimensionPixelSize(r7)
            r7 = 15
            int r5 = r1.d(r7, r5)
            r0.f3582d0 = r5
            int r5 = r0.f3581c0
            r0.f3580b0 = r5
            r5 = 11
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r2.getDimension(r5, r7)
            r8 = 10
            float r8 = r2.getDimension(r8, r7)
            r9 = 8
            float r3 = r2.getDimension(r9, r7)
            r9 = 9
            float r7 = r2.getDimension(r9, r7)
            m6.i$a r9 = new m6.i$a
            r9.<init>(r6)
            r6 = 0
            int r16 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r16 < 0) goto L_0x01bd
            m6.a r4 = new m6.a
            r4.<init>(r5)
            r9.f7164e = r4
        L_0x01bd:
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01c8
            m6.a r4 = new m6.a
            r4.<init>(r8)
            r9.f7165f = r4
        L_0x01c8:
            int r4 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01d3
            m6.a r4 = new m6.a
            r4.<init>(r3)
            r9.f7166g = r4
        L_0x01d3:
            int r3 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x01de
            m6.a r3 = new m6.a
            r3.<init>(r7)
            r9.f7167h = r3
        L_0x01de:
            m6.i r3 = new m6.i
            r3.<init>(r9)
            r0.T = r3
            r3 = 5
            android.content.res.ColorStateList r3 = j6.c.b(r13, r1, r3)
            if (r3 == 0) goto L_0x0240
            int r4 = r3.getDefaultColor()
            r0.O0 = r4
            r0.f3584f0 = r4
            boolean r4 = r3.isStateful()
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x021d
            int[] r4 = new int[r14]
            r4[r11] = r5
            int r4 = r3.getColorForState(r4, r10)
            r0.P0 = r4
            r4 = 2
            int[] r5 = new int[r4]
            r5 = {16842908, 16842910} // fill-array
            int r5 = r3.getColorForState(r5, r10)
            r0.Q0 = r5
            int[] r5 = new int[r4]
            r5 = {16843623, 16842910} // fill-array
            int r3 = r3.getColorForState(r5, r10)
            goto L_0x023d
        L_0x021d:
            int r3 = r0.O0
            r0.Q0 = r3
            r3 = 2131099885(0x7f0600ed, float:1.7812136E38)
            android.content.res.ColorStateList r3 = f.a.a(r13, r3)
            int[] r4 = new int[r14]
            r4[r11] = r5
            int r4 = r3.getColorForState(r4, r10)
            r0.P0 = r4
            int[] r4 = new int[r14]
            r5 = 16843623(0x1010367, float:2.3696E-38)
            r4[r11] = r5
            int r3 = r3.getColorForState(r4, r10)
        L_0x023d:
            r0.R0 = r3
            goto L_0x024a
        L_0x0240:
            r0.f3584f0 = r11
            r0.O0 = r11
            r0.P0 = r11
            r0.Q0 = r11
            r0.R0 = r11
        L_0x024a:
            boolean r3 = r1.l(r14)
            if (r3 == 0) goto L_0x0258
            android.content.res.ColorStateList r3 = r1.b(r14)
            r0.J0 = r3
            r0.I0 = r3
        L_0x0258:
            r3 = 12
            android.content.res.ColorStateList r4 = j6.c.b(r13, r1, r3)
            int r2 = r2.getColor(r3, r11)
            r0.M0 = r2
            java.lang.Object r2 = y.a.f9523a
            r2 = 2131099908(0x7f060104, float:1.7812182E38)
            int r2 = y.a.d.a(r13, r2)
            r0.K0 = r2
            r2 = 2131099909(0x7f060105, float:1.7812185E38)
            int r2 = y.a.d.a(r13, r2)
            r0.S0 = r2
            r2 = 2131099912(0x7f060108, float:1.781219E38)
            int r2 = y.a.d.a(r13, r2)
            r0.L0 = r2
            if (r4 == 0) goto L_0x0286
            r0.setBoxStrokeColorStateList(r4)
        L_0x0286:
            r2 = 13
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0295
            android.content.res.ColorStateList r2 = j6.c.b(r13, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x0295:
            r2 = 42
            int r3 = r1.i(r2, r10)
            if (r3 == r10) goto L_0x02a4
            int r2 = r1.i(r2, r11)
            r0.setHintTextAppearance(r2)
        L_0x02a4:
            r2 = 33
            int r2 = r1.i(r2, r11)
            r3 = 28
            java.lang.CharSequence r3 = r1.k(r3)
            r4 = 29
            boolean r4 = r1.a(r4, r11)
            android.content.Context r5 = r29.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r6 = 2131558454(0x7f0d0036, float:1.8742224E38)
            r7 = r20
            android.view.View r5 = r5.inflate(r6, r7, r11)
            com.google.android.material.internal.CheckableImageButton r5 = (com.google.android.material.internal.CheckableImageButton) r5
            r0.G0 = r5
            r8 = 2131362329(0x7f0a0219, float:1.8344436E38)
            r5.setId(r8)
            r8 = 8
            r5.setVisibility(r8)
            boolean r8 = j6.c.d(r13)
            if (r8 == 0) goto L_0x02e5
            android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            r8.setMarginStart(r11)
        L_0x02e5:
            r8 = 30
            boolean r9 = r1.l(r8)
            if (r9 == 0) goto L_0x02f4
            android.graphics.drawable.Drawable r8 = r1.e(r8)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r8)
        L_0x02f4:
            r8 = 31
            boolean r9 = r1.l(r8)
            if (r9 == 0) goto L_0x0303
            android.content.res.ColorStateList r8 = j6.c.b(r13, r1, r8)
            r0.setErrorIconTintList(r8)
        L_0x0303:
            r8 = 32
            boolean r9 = r1.l(r8)
            r6 = 0
            if (r9 == 0) goto L_0x0317
            int r8 = r1.h(r8, r10)
            android.graphics.PorterDuff$Mode r8 = h6.n.b(r8, r6)
            r0.setErrorIconTintMode(r8)
        L_0x0317:
            android.content.res.Resources r8 = r29.getResources()
            r9 = 2131886154(0x7f12004a, float:1.9406879E38)
            java.lang.CharSequence r8 = r8.getText(r9)
            r5.setContentDescription(r8)
            java.util.WeakHashMap<android.view.View, i0.b0> r8 = i0.w.f6004a
            r8 = 2
            i0.w.d.s(r5, r8)
            r5.setClickable(r11)
            r5.setPressable(r11)
            r5.setFocusable(r11)
            r8 = 38
            int r8 = r1.i(r8, r11)
            r9 = 37
            boolean r9 = r1.a(r9, r11)
            r14 = 36
            java.lang.CharSequence r14 = r1.k(r14)
            r6 = 50
            int r6 = r1.i(r6, r11)
            r10 = 49
            java.lang.CharSequence r10 = r1.k(r10)
            r21 = r6
            r6 = 53
            int r6 = r1.i(r6, r11)
            r11 = 52
            java.lang.CharSequence r11 = r1.k(r11)
            r22 = r6
            r6 = 63
            r23 = r11
            r11 = 0
            int r6 = r1.i(r6, r11)
            r11 = 62
            java.lang.CharSequence r11 = r1.k(r11)
            r24 = r6
            r6 = 16
            r25 = r11
            r11 = 0
            boolean r6 = r1.a(r6, r11)
            r11 = 17
            r26 = r6
            r6 = -1
            int r11 = r1.h(r11, r6)
            r0.setCounterMaxLength(r11)
            r6 = 20
            r11 = 0
            int r6 = r1.i(r6, r11)
            r0.C = r6
            r6 = 18
            int r6 = r1.i(r6, r11)
            r0.B = r6
            android.content.Context r6 = r29.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r27 = r10
            r10 = 2131558455(0x7f0d0037, float:1.8742226E38)
            android.view.View r6 = r6.inflate(r10, r15, r11)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.f3589k0 = r6
            r10 = 8
            r6.setVisibility(r10)
            boolean r10 = j6.c.d(r13)
            if (r10 == 0) goto L_0x03c2
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            r10.setMarginEnd(r11)
        L_0x03c2:
            r10 = 0
            r0.setStartIconOnClickListener(r10)
            r0.setStartIconOnLongClickListener(r10)
            r10 = 59
            boolean r11 = r1.l(r10)
            if (r11 == 0) goto L_0x03f1
            android.graphics.drawable.Drawable r10 = r1.e(r10)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r10)
            r10 = 58
            boolean r11 = r1.l(r10)
            if (r11 == 0) goto L_0x03e7
            java.lang.CharSequence r10 = r1.k(r10)
            r0.setStartIconContentDescription((java.lang.CharSequence) r10)
        L_0x03e7:
            r10 = 57
            r11 = 1
            boolean r10 = r1.a(r10, r11)
            r0.setStartIconCheckable(r10)
        L_0x03f1:
            r10 = 60
            boolean r11 = r1.l(r10)
            if (r11 == 0) goto L_0x0400
            android.content.res.ColorStateList r10 = j6.c.b(r13, r1, r10)
            r0.setStartIconTintList(r10)
        L_0x0400:
            r10 = 61
            boolean r11 = r1.l(r10)
            if (r11 == 0) goto L_0x0415
            r11 = -1
            int r10 = r1.h(r10, r11)
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = h6.n.b(r10, r11)
            r0.setStartIconTintMode(r10)
        L_0x0415:
            r10 = 6
            r11 = 0
            int r10 = r1.h(r10, r11)
            r0.setBoxBackgroundMode(r10)
            android.content.Context r10 = r29.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r17 = r2
            r28 = r3
            r3 = r19
            r2 = 2131558454(0x7f0d0036, float:1.8742224E38)
            android.view.View r2 = r10.inflate(r2, r3, r11)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.f3606v0 = r2
            r3.addView(r2)
            r10 = 8
            r2.setVisibility(r10)
            boolean r10 = j6.c.d(r13)
            if (r10 == 0) goto L_0x044e
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r2.setMarginStart(r11)
        L_0x044e:
            p6.e r2 = new p6.e
            r2.<init>(r0)
            r10 = -1
            r12.append(r10, r2)
            p6.o r2 = new p6.o
            r2.<init>(r0)
            r12.append(r11, r2)
            com.google.android.material.textfield.c r2 = new com.google.android.material.textfield.c
            r2.<init>(r0)
            r10 = 1
            r12.append(r10, r2)
            com.google.android.material.textfield.a r2 = new com.google.android.material.textfield.a
            r2.<init>(r0)
            r10 = 2
            r12.append(r10, r2)
            com.google.android.material.textfield.b r2 = new com.google.android.material.textfield.b
            r2.<init>(r0)
            r10 = 3
            r12.append(r10, r2)
            r2 = 25
            boolean r10 = r1.l(r2)
            r11 = 46
            if (r10 == 0) goto L_0x04b5
            r10 = 0
            int r2 = r1.h(r2, r10)
            r0.setEndIconMode(r2)
            r2 = 24
            boolean r10 = r1.l(r2)
            if (r10 == 0) goto L_0x049b
            android.graphics.drawable.Drawable r2 = r1.e(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x049b:
            r2 = 23
            boolean r10 = r1.l(r2)
            if (r10 == 0) goto L_0x04aa
            java.lang.CharSequence r2 = r1.k(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x04aa:
            r2 = 22
            r10 = 1
            boolean r2 = r1.a(r2, r10)
            r0.setEndIconCheckable(r2)
            goto L_0x04f9
        L_0x04b5:
            boolean r2 = r1.l(r11)
            if (r2 == 0) goto L_0x04f9
            r2 = 0
            boolean r10 = r1.a(r11, r2)
            r0.setEndIconMode(r10)
            r2 = 45
            android.graphics.drawable.Drawable r2 = r1.e(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
            r2 = 44
            java.lang.CharSequence r2 = r1.k(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
            r2 = 47
            boolean r10 = r1.l(r2)
            if (r10 == 0) goto L_0x04e4
            android.content.res.ColorStateList r2 = j6.c.b(r13, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04e4:
            r2 = 48
            boolean r10 = r1.l(r2)
            if (r10 == 0) goto L_0x04f9
            r10 = -1
            int r2 = r1.h(r2, r10)
            r10 = 0
            android.graphics.PorterDuff$Mode r2 = h6.n.b(r2, r10)
            r0.setEndIconTintMode(r2)
        L_0x04f9:
            boolean r2 = r1.l(r11)
            r10 = 26
            if (r2 != 0) goto L_0x0524
            boolean r2 = r1.l(r10)
            if (r2 == 0) goto L_0x050e
            android.content.res.ColorStateList r2 = j6.c.b(r13, r1, r10)
            r0.setEndIconTintList(r2)
        L_0x050e:
            r2 = 27
            boolean r11 = r1.l(r2)
            if (r11 == 0) goto L_0x0524
            r11 = -1
            int r2 = r1.h(r2, r11)
            r11 = 0
            android.graphics.PorterDuff$Mode r2 = h6.n.b(r2, r11)
            r0.setEndIconTintMode(r2)
            goto L_0x0525
        L_0x0524:
            r11 = 0
        L_0x0525:
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r13, r11)
            r0.L = r2
            r12 = 2131362335(0x7f0a021f, float:1.8344448E38)
            r2.setId(r12)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r10 = -2
            r12.<init>(r10, r10)
            r2.setLayoutParams(r12)
            r12 = 1
            i0.w.g.f(r2, r12)
            r15.addView(r6)
            r15.addView(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r13, r11)
            r0.N = r2
            r6 = 2131362336(0x7f0a0220, float:1.834445E38)
            r2.setId(r6)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r11 = 80
            r6.<init>(r10, r10, r11)
            r2.setLayoutParams(r6)
            r6 = 1
            i0.w.g.f(r2, r6)
            r7.addView(r2)
            r7.addView(r5)
            r7.addView(r3)
            r0.setHelperTextEnabled(r9)
            r0.setHelperText(r14)
            r0.setHelperTextTextAppearance(r8)
            r0.setErrorEnabled(r4)
            r2 = r17
            r0.setErrorTextAppearance(r2)
            r2 = r28
            r0.setErrorContentDescription(r2)
            int r2 = r0.C
            r0.setCounterTextAppearance(r2)
            int r2 = r0.B
            r0.setCounterOverflowTextAppearance(r2)
            r2 = r27
            r0.setPlaceholderText(r2)
            r2 = r21
            r0.setPlaceholderTextAppearance(r2)
            r2 = r23
            r0.setPrefixText(r2)
            r2 = r22
            r0.setPrefixTextAppearance(r2)
            r2 = r25
            r0.setSuffixText(r2)
            r2 = r24
            r0.setSuffixTextAppearance(r2)
            r2 = 34
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x05b6
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setErrorTextColor(r2)
        L_0x05b6:
            r2 = 39
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x05c5
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setHelperTextColor(r2)
        L_0x05c5:
            r2 = 43
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x05d4
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setHintTextColor(r2)
        L_0x05d4:
            r2 = 21
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x05e3
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setCounterTextColor(r2)
        L_0x05e3:
            r2 = 19
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x05f2
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x05f2:
            r2 = 51
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0601
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x0601:
            r2 = 54
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0610
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setPrefixTextColor(r2)
        L_0x0610:
            r2 = 64
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x061f
            android.content.res.ColorStateList r2 = r1.b(r2)
            r0.setSuffixTextColor(r2)
        L_0x061f:
            r2 = r26
            r0.setCounterEnabled(r2)
            r2 = 0
            r3 = 1
            boolean r2 = r1.a(r2, r3)
            r0.setEnabled(r2)
            r1.n()
            r1 = 2
            i0.w.d.s(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x063f
            if (r1 < r2) goto L_0x063f
            i0.w.k.l(r0, r3)
        L_0x063f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void d(CheckableImageButton checkableImageButton, boolean z10, ColorStateList colorStateList, boolean z11, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z10 || z11)) {
            drawable = drawable.mutate();
            if (z10) {
                drawable.setTintList(colorStateList);
            }
            if (z11) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private k getEndIconDelegate() {
        SparseArray<k> sparseArray = this.f3604u0;
        k kVar = sparseArray.get(this.t0);
        return kVar != null ? kVar : sparseArray.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        boolean z10;
        CheckableImageButton checkableImageButton = this.G0;
        if (checkableImageButton.getVisibility() == 0) {
            return checkableImageButton;
        }
        if (this.t0 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !g()) {
            return null;
        }
        return this.f3606v0;
    }

    public static void j(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z10);
            }
        }
    }

    public static void l(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z10;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        boolean a10 = w.c.a(checkableImageButton);
        boolean z11 = false;
        int i10 = 1;
        if (onLongClickListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (a10 || z10) {
            z11 = true;
        }
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(a10);
        checkableImageButton.setPressable(a10);
        checkableImageButton.setLongClickable(z10);
        if (!z11) {
            i10 = 2;
        }
        w.d.s(checkableImageButton, i10);
    }

    private void setEditText(EditText editText) {
        boolean z10;
        boolean z11;
        if (this.f3601s == null) {
            if (this.t0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f3601s = editText;
            setMinWidth(this.u);
            setMaxWidth(this.f3605v);
            h();
            setTextInputAccessibilityDelegate(new e(this));
            Typeface typeface = this.f3601s.getTypeface();
            h6.c cVar = this.U0;
            j6.a aVar = cVar.f5876v;
            if (aVar != null) {
                aVar.f6577q = true;
            }
            if (cVar.f5874s != typeface) {
                cVar.f5874s = typeface;
                z10 = true;
            } else {
                z10 = false;
            }
            if (cVar.f5875t != typeface) {
                cVar.f5875t = typeface;
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 || z11) {
                cVar.h();
            }
            float textSize = this.f3601s.getTextSize();
            if (cVar.f5865i != textSize) {
                cVar.f5865i = textSize;
                cVar.h();
            }
            int gravity = this.f3601s.getGravity();
            int i10 = (gravity & -113) | 48;
            if (cVar.f5864h != i10) {
                cVar.f5864h = i10;
                cVar.h();
            }
            if (cVar.f5863g != gravity) {
                cVar.f5863g = gravity;
                cVar.h();
            }
            this.f3601s.addTextChangedListener(new a());
            if (this.I0 == null) {
                this.I0 = this.f3601s.getHintTextColors();
            }
            if (this.O) {
                if (TextUtils.isEmpty(this.P)) {
                    CharSequence hint = this.f3601s.getHint();
                    this.f3603t = hint;
                    setHint(hint);
                    this.f3601s.setHint((CharSequence) null);
                }
                this.Q = true;
            }
            if (this.A != null) {
                n(this.f3601s.getText().length());
            }
            q();
            this.w.b();
            this.f3595p.bringToFront();
            this.f3597q.bringToFront();
            this.f3599r.bringToFront();
            this.G0.bringToFront();
            Iterator<f> it = this.f3602s0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            u();
            x();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            s(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z10) {
        int i10;
        boolean z11 = false;
        int i11 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.G0.setVisibility(i10);
        FrameLayout frameLayout = this.f3599r;
        if (!z10) {
            i11 = 0;
        }
        frameLayout.setVisibility(i11);
        x();
        if (this.t0 != 0) {
            z11 = true;
        }
        if (!z11) {
            p();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.P)) {
            this.P = charSequence;
            h6.c cVar = this.U0;
            if (charSequence == null || !TextUtils.equals(cVar.w, charSequence)) {
                cVar.w = charSequence;
                cVar.f5877x = null;
                Bitmap bitmap = cVar.z;
                if (bitmap != null) {
                    bitmap.recycle();
                    cVar.z = null;
                }
                cVar.h();
            }
            if (!this.T0) {
                i();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.E != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
                this.F = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_placeholder);
                AppCompatTextView appCompatTextView2 = this.F;
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                w.g.f(appCompatTextView2, 1);
                setPlaceholderTextAppearance(this.H);
                setPlaceholderTextColor(this.G);
                AppCompatTextView appCompatTextView3 = this.F;
                if (appCompatTextView3 != null) {
                    this.f3593o.addView(appCompatTextView3);
                    this.F.setVisibility(0);
                }
            } else {
                AppCompatTextView appCompatTextView4 = this.F;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setVisibility(8);
                }
                this.F = null;
            }
            this.E = z10;
        }
    }

    public final void a(float f10) {
        h6.c cVar = this.U0;
        if (cVar.f5860c != f10) {
            if (this.X0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.X0 = valueAnimator;
                valueAnimator.setInterpolator(s5.a.f8785b);
                this.X0.setDuration(167);
                this.X0.addUpdateListener(new d());
            }
            this.X0.setFloatValues(new float[]{cVar.f5860c, f10});
            this.X0.start();
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.f3593o;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            r();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r7 = this;
            m6.f r0 = r7.R
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            m6.i r1 = r7.T
            r0.setShapeAppearanceModel(r1)
            int r0 = r7.W
            r1 = 2
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != r1) goto L_0x0021
            int r0 = r7.f3580b0
            if (r0 <= r2) goto L_0x001c
            int r0 = r7.f3583e0
            if (r0 == 0) goto L_0x001c
            r0 = r3
            goto L_0x001d
        L_0x001c:
            r0 = r4
        L_0x001d:
            if (r0 == 0) goto L_0x0021
            r0 = r3
            goto L_0x0022
        L_0x0021:
            r0 = r4
        L_0x0022:
            if (r0 == 0) goto L_0x0045
            m6.f r0 = r7.R
            int r1 = r7.f3580b0
            float r1 = (float) r1
            int r5 = r7.f3583e0
            m6.f$b r6 = r0.f7121o
            r6.f7140k = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            m6.f$b r5 = r0.f7121o
            android.content.res.ColorStateList r6 = r5.d
            if (r6 == r1) goto L_0x0045
            r5.d = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L_0x0045:
            int r0 = r7.f3584f0
            int r1 = r7.W
            if (r1 != r3) goto L_0x0062
            android.content.Context r0 = r7.getContext()
            r1 = 2130968816(0x7f0400f0, float:1.7546296E38)
            android.util.TypedValue r0 = j6.b.a(r0, r1)
            if (r0 == 0) goto L_0x005b
            int r0 = r0.data
            goto L_0x005c
        L_0x005b:
            r0 = r4
        L_0x005c:
            int r1 = r7.f3584f0
            int r0 = b0.a.b(r1, r0)
        L_0x0062:
            r7.f3584f0 = r0
            m6.f r1 = r7.R
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.j(r0)
            int r0 = r7.t0
            r1 = 3
            if (r0 != r1) goto L_0x007b
            android.widget.EditText r0 = r7.f3601s
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L_0x007b:
            m6.f r0 = r7.S
            if (r0 != 0) goto L_0x0080
            goto L_0x0098
        L_0x0080:
            int r1 = r7.f3580b0
            if (r1 <= r2) goto L_0x0089
            int r1 = r7.f3583e0
            if (r1 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r3 = r4
        L_0x008a:
            if (r3 == 0) goto L_0x0095
            int r1 = r7.f3583e0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.j(r1)
        L_0x0095:
            r7.invalidate()
        L_0x0098:
            r7.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final void c() {
        d(this.f3606v0, this.y0, this.x0, this.A0, this.f3610z0);
    }

    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f3601s;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f3603t != null) {
            boolean z10 = this.Q;
            this.Q = false;
            CharSequence hint = editText.getHint();
            this.f3601s.setHint(this.f3603t);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
            } finally {
                this.f3601s.setHint(hint);
                this.Q = z10;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i10);
            onProvideAutofillVirtualStructure(viewStructure, i10);
            FrameLayout frameLayout = this.f3593o;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
                View childAt = frameLayout.getChildAt(i11);
                ViewStructure newChild = viewStructure.newChild(i11);
                childAt.dispatchProvideAutofillStructure(newChild, i10);
                if (childAt == this.f3601s) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.Z0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.Z0 = false;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.O) {
            h6.c cVar = this.U0;
            cVar.getClass();
            int save = canvas.save();
            if (cVar.f5877x != null && cVar.f5859b) {
                cVar.N.getLineLeft(0);
                cVar.E.setTextSize(cVar.B);
                float f10 = cVar.f5872q;
                float f11 = cVar.f5873r;
                float f12 = cVar.A;
                if (f12 != 1.0f) {
                    canvas.scale(f12, f12, f10, f11);
                }
                canvas.translate(f10, f11);
                cVar.N.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        m6.f fVar = this.S;
        if (fVar != null) {
            Rect bounds = fVar.getBounds();
            bounds.top = bounds.bottom - this.f3580b0;
            this.S.draw(canvas);
        }
    }

    public final void drawableStateChanged() {
        boolean z10;
        boolean z11;
        boolean z12;
        ColorStateList colorStateList;
        if (!this.Y0) {
            boolean z13 = true;
            this.Y0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            h6.c cVar = this.U0;
            if (cVar != null) {
                cVar.C = drawableState;
                ColorStateList colorStateList2 = cVar.l;
                if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = cVar.f5867k) == null || !colorStateList.isStateful())) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    cVar.h();
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 = z12 | false;
            } else {
                z10 = false;
            }
            if (this.f3601s != null) {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                if (!w.g.c(this) || !isEnabled()) {
                    z13 = false;
                }
                s(z13, false);
            }
            q();
            z();
            if (z10) {
                invalidate();
            }
            this.Y0 = false;
        }
    }

    public final int e() {
        float f10;
        if (!this.O) {
            return 0;
        }
        int i10 = this.W;
        h6.c cVar = this.U0;
        if (i10 == 0 || i10 == 1) {
            TextPaint textPaint = cVar.F;
            textPaint.setTextSize(cVar.f5866j);
            textPaint.setTypeface(cVar.f5874s);
            textPaint.setLetterSpacing(cVar.M);
            f10 = -textPaint.ascent();
        } else if (i10 != 2) {
            return 0;
        } else {
            TextPaint textPaint2 = cVar.F;
            textPaint2.setTextSize(cVar.f5866j);
            textPaint2.setTypeface(cVar.f5874s);
            textPaint2.setLetterSpacing(cVar.M);
            f10 = (-textPaint2.ascent()) / 2.0f;
        }
        return (int) f10;
    }

    public final boolean f() {
        return this.O && !TextUtils.isEmpty(this.P) && (this.R instanceof p6.f);
    }

    public final boolean g() {
        return this.f3599r.getVisibility() == 0 && this.f3606v0.getVisibility() == 0;
    }

    public int getBaseline() {
        EditText editText = this.f3601s;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public m6.f getBoxBackground() {
        int i10 = this.W;
        if (i10 == 1 || i10 == 2) {
            return this.R;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f3584f0;
    }

    public int getBoxBackgroundMode() {
        return this.W;
    }

    public float getBoxCornerRadiusBottomEnd() {
        m6.f fVar = this.R;
        return fVar.f7121o.f7131a.f7157h.a(fVar.g());
    }

    public float getBoxCornerRadiusBottomStart() {
        m6.f fVar = this.R;
        return fVar.f7121o.f7131a.f7156g.a(fVar.g());
    }

    public float getBoxCornerRadiusTopEnd() {
        m6.f fVar = this.R;
        return fVar.f7121o.f7131a.f7155f.a(fVar.g());
    }

    public float getBoxCornerRadiusTopStart() {
        m6.f fVar = this.R;
        return fVar.f7121o.f7131a.f7154e.a(fVar.g());
    }

    public int getBoxStrokeColor() {
        return this.M0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.N0;
    }

    public int getBoxStrokeWidth() {
        return this.f3581c0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f3582d0;
    }

    public int getCounterMaxLength() {
        return this.f3609y;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (!this.f3608x || !this.z || (appCompatTextView = this.A) == null) {
            return null;
        }
        return appCompatTextView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.I;
    }

    public ColorStateList getCounterTextColor() {
        return this.I;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.I0;
    }

    public EditText getEditText() {
        return this.f3601s;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f3606v0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f3606v0.getDrawable();
    }

    public int getEndIconMode() {
        return this.t0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f3606v0;
    }

    public CharSequence getError() {
        l lVar = this.w;
        if (lVar.f7949k) {
            return lVar.f7948j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.w.f7950m;
    }

    public int getErrorCurrentTextColors() {
        return this.w.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.G0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.w.g();
    }

    public CharSequence getHelperText() {
        l lVar = this.w;
        if (lVar.f7954q) {
            return lVar.f7953p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.w.f7955r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.O) {
            return this.P;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        h6.c cVar = this.U0;
        TextPaint textPaint = cVar.F;
        textPaint.setTextSize(cVar.f5866j);
        textPaint.setTypeface(cVar.f5874s);
        textPaint.setLetterSpacing(cVar.M);
        return -textPaint.ascent();
    }

    public final int getHintCurrentCollapsedTextColor() {
        h6.c cVar = this.U0;
        return cVar.e(cVar.l);
    }

    public ColorStateList getHintTextColor() {
        return this.J0;
    }

    public int getMaxWidth() {
        return this.f3605v;
    }

    public int getMinWidth() {
        return this.u;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f3606v0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f3606v0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.E) {
            return this.D;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.H;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.G;
    }

    public CharSequence getPrefixText() {
        return this.K;
    }

    public ColorStateList getPrefixTextColor() {
        return this.L.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f3589k0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f3589k0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.M;
    }

    public ColorStateList getSuffixTextColor() {
        return this.N.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.N;
    }

    public Typeface getTypeface() {
        return this.f3588j0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r6 = this;
            int r0 = r6.W
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x004d
            m6.i r3 = r6.T
            if (r0 == r1) goto L_0x003e
            r4 = 2
            if (r0 != r4) goto L_0x0025
            boolean r0 = r6.O
            if (r0 == 0) goto L_0x001d
            m6.f r0 = r6.R
            boolean r0 = r0 instanceof p6.f
            if (r0 != 0) goto L_0x001d
            p6.f r0 = new p6.f
            r0.<init>(r3)
            goto L_0x0022
        L_0x001d:
            m6.f r0 = new m6.f
            r0.<init>((m6.i) r3)
        L_0x0022:
            r6.R = r0
            goto L_0x004f
        L_0x0025:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r6.W
            r1.append(r2)
            java.lang.String r2 = " is illegal; only @BoxBackgroundMode constants are supported."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x003e:
            m6.f r0 = new m6.f
            r0.<init>((m6.i) r3)
            r6.R = r0
            m6.f r0 = new m6.f
            r0.<init>()
            r6.S = r0
            goto L_0x0051
        L_0x004d:
            r6.R = r2
        L_0x004f:
            r6.S = r2
        L_0x0051:
            android.widget.EditText r0 = r6.f3601s
            r2 = 0
            if (r0 == 0) goto L_0x0066
            m6.f r3 = r6.R
            if (r3 == 0) goto L_0x0066
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L_0x0066
            int r0 = r6.W
            if (r0 == 0) goto L_0x0066
            r0 = r1
            goto L_0x0067
        L_0x0066:
            r0 = r2
        L_0x0067:
            if (r0 == 0) goto L_0x0072
            android.widget.EditText r0 = r6.f3601s
            m6.f r3 = r6.R
            java.util.WeakHashMap<android.view.View, i0.b0> r4 = i0.w.f6004a
            i0.w.d.q(r0, r3)
        L_0x0072:
            r6.z()
            int r0 = r6.W
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L_0x00b1
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x008f
            r0 = r1
            goto L_0x0090
        L_0x008f:
            r0 = r2
        L_0x0090:
            if (r0 == 0) goto L_0x009a
            android.content.res.Resources r0 = r6.getResources()
            r4 = 2131165379(0x7f0700c3, float:1.7944973E38)
            goto L_0x00ab
        L_0x009a:
            android.content.Context r0 = r6.getContext()
            boolean r0 = j6.c.d(r0)
            if (r0 == 0) goto L_0x00b1
            android.content.res.Resources r0 = r6.getResources()
            r4 = 2131165378(0x7f0700c2, float:1.7944971E38)
        L_0x00ab:
            int r0 = r0.getDimensionPixelSize(r4)
            r6.f3579a0 = r0
        L_0x00b1:
            android.widget.EditText r0 = r6.f3601s
            if (r0 == 0) goto L_0x0122
            int r0 = r6.W
            if (r0 == r1) goto L_0x00ba
            goto L_0x0122
        L_0x00ba:
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r1 = r2
        L_0x00ce:
            if (r1 == 0) goto L_0x00f1
            android.widget.EditText r0 = r6.f3601s
            java.util.WeakHashMap<android.view.View, i0.b0> r1 = i0.w.f6004a
            int r1 = i0.w.e.f(r0)
            android.content.res.Resources r2 = r6.getResources()
            r3 = 2131165377(0x7f0700c1, float:1.794497E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r6.f3601s
            int r3 = i0.w.e.e(r3)
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131165376(0x7f0700c0, float:1.7944967E38)
            goto L_0x011b
        L_0x00f1:
            android.content.Context r0 = r6.getContext()
            boolean r0 = j6.c.d(r0)
            if (r0 == 0) goto L_0x0122
            android.widget.EditText r0 = r6.f3601s
            java.util.WeakHashMap<android.view.View, i0.b0> r1 = i0.w.f6004a
            int r1 = i0.w.e.f(r0)
            android.content.res.Resources r2 = r6.getResources()
            r3 = 2131165375(0x7f0700bf, float:1.7944965E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r6.f3601s
            int r3 = i0.w.e.e(r3)
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131165374(0x7f0700be, float:1.7944963E38)
        L_0x011b:
            int r4 = r4.getDimensionPixelSize(r5)
            i0.w.e.k(r0, r1, r2, r3, r4)
        L_0x0122:
            int r0 = r6.W
            if (r0 == 0) goto L_0x0129
            r6.r()
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.h():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r12 = this;
            boolean r0 = r12.f()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.RectF r0 = r12.f3587i0
            android.widget.EditText r1 = r12.f3601s
            int r1 = r1.getWidth()
            android.widget.EditText r2 = r12.f3601s
            int r2 = r2.getGravity()
            h6.c r3 = r12.U0
            java.lang.CharSequence r4 = r3.w
            boolean r4 = r3.c(r4)
            r3.f5878y = r4
            r5 = 5
            r6 = 8388613(0x800005, float:1.175495E-38)
            r7 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 17
            android.graphics.Rect r10 = r3.f5861e
            if (r2 == r9) goto L_0x004b
            r11 = r2 & 7
            if (r11 != r7) goto L_0x0031
            goto L_0x004b
        L_0x0031:
            r11 = r2 & r6
            if (r11 == r6) goto L_0x003d
            r11 = r2 & 5
            if (r11 != r5) goto L_0x003a
            goto L_0x003d
        L_0x003a:
            if (r4 == 0) goto L_0x003f
            goto L_0x0043
        L_0x003d:
            if (r4 == 0) goto L_0x0043
        L_0x003f:
            int r4 = r10.left
            float r4 = (float) r4
            goto L_0x0053
        L_0x0043:
            int r4 = r10.right
            float r4 = (float) r4
            float r11 = r3.b()
            goto L_0x0052
        L_0x004b:
            float r4 = (float) r1
            float r4 = r4 / r8
            float r11 = r3.b()
            float r11 = r11 / r8
        L_0x0052:
            float r4 = r4 - r11
        L_0x0053:
            r0.left = r4
            int r11 = r10.top
            float r11 = (float) r11
            r0.top = r11
            if (r2 == r9) goto L_0x007d
            r9 = r2 & 7
            if (r9 != r7) goto L_0x0061
            goto L_0x007d
        L_0x0061:
            r1 = r2 & r6
            if (r1 == r6) goto L_0x006f
            r1 = r2 & 5
            if (r1 != r5) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            boolean r1 = r3.f5878y
            if (r1 == 0) goto L_0x0073
            goto L_0x0079
        L_0x006f:
            boolean r1 = r3.f5878y
            if (r1 == 0) goto L_0x0079
        L_0x0073:
            float r1 = r3.b()
            float r1 = r1 + r4
            goto L_0x0085
        L_0x0079:
            int r1 = r10.right
            float r1 = (float) r1
            goto L_0x0085
        L_0x007d:
            float r1 = (float) r1
            float r1 = r1 / r8
            float r2 = r3.b()
            float r2 = r2 / r8
            float r1 = r1 + r2
        L_0x0085:
            r0.right = r1
            android.text.TextPaint r1 = r3.F
            float r2 = r3.f5866j
            r1.setTextSize(r2)
            android.graphics.Typeface r2 = r3.f5874s
            r1.setTypeface(r2)
            float r2 = r3.M
            r1.setLetterSpacing(r2)
            r1.ascent()
            float r1 = r0.left
            int r2 = r12.U
            float r2 = (float) r2
            float r1 = r1 - r2
            r0.left = r1
            float r1 = r0.right
            float r1 = r1 + r2
            r0.right = r1
            int r1 = r12.f3580b0
            r12.V = r1
            r2 = 0
            r0.top = r2
            float r1 = (float) r1
            r0.bottom = r1
            int r1 = r12.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            r0.offset(r1, r2)
            m6.f r1 = r12.R
            p6.f r1 = (p6.f) r1
            r1.getClass()
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.n(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.i():void");
    }

    public final void k(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public final void m(TextView textView, int i10) {
        boolean z10 = true;
        try {
            textView.setTextAppearance(i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            textView.setTextAppearance(R.style.TextAppearance_AppCompat_Caption);
            Context context = getContext();
            Object obj = y.a.f9523a;
            textView.setTextColor(a.d.a(context, R.color.design_error));
        }
    }

    public final void n(int i10) {
        boolean z10;
        int i11;
        boolean z11;
        g0.a aVar;
        boolean z12 = this.z;
        int i12 = this.f3609y;
        String str = null;
        if (i12 == -1) {
            this.A.setText(String.valueOf(i10));
            this.A.setContentDescription((CharSequence) null);
            this.z = false;
        } else {
            if (i10 > i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.z = z10;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.A;
            int i13 = this.f3609y;
            if (this.z) {
                i11 = R.string.character_counter_overflowed_content_description;
            } else {
                i11 = R.string.character_counter_content_description;
            }
            appCompatTextView.setContentDescription(context.getString(i11, new Object[]{Integer.valueOf(i10), Integer.valueOf(i13)}));
            if (z12 != this.z) {
                o();
            }
            String str2 = g0.a.d;
            Locale locale = Locale.getDefault();
            int i14 = g0.e.f4964a;
            if (TextUtils.getLayoutDirectionFromLocale(locale) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                aVar = g0.a.f4947g;
            } else {
                aVar = g0.a.f4946f;
            }
            AppCompatTextView appCompatTextView2 = this.A;
            String string = getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(i10), Integer.valueOf(this.f3609y)});
            if (string == null) {
                aVar.getClass();
            } else {
                str = aVar.c(string, aVar.f4950c).toString();
            }
            appCompatTextView2.setText(str);
        }
        if (this.f3601s != null && z12 != this.z) {
            s(false, false);
            z();
            q();
        }
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.A;
        if (appCompatTextView != null) {
            m(appCompatTextView, this.z ? this.B : this.C);
            if (!this.z && (colorStateList2 = this.I) != null) {
                this.A.setTextColor(colorStateList2);
            }
            if (this.z && (colorStateList = this.J) != null) {
                this.A.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            android.widget.EditText r7 = r6.f3601s
            if (r7 == 0) goto L_0x01cb
            android.graphics.Rect r8 = r6.f3585g0
            h6.d.a(r6, r7, r8)
            m6.f r7 = r6.S
            if (r7 == 0) goto L_0x001d
            int r9 = r8.bottom
            int r10 = r6.f3582d0
            int r10 = r9 - r10
            int r11 = r8.left
            int r0 = r8.right
            r7.setBounds(r11, r10, r0, r9)
        L_0x001d:
            boolean r7 = r6.O
            if (r7 == 0) goto L_0x01cb
            android.widget.EditText r7 = r6.f3601s
            float r7 = r7.getTextSize()
            h6.c r9 = r6.U0
            float r10 = r9.f5865i
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0034
            r9.f5865i = r7
            r9.h()
        L_0x0034:
            android.widget.EditText r7 = r6.f3601s
            int r7 = r7.getGravity()
            r10 = r7 & -113(0xffffffffffffff8f, float:NaN)
            r10 = r10 | 48
            int r11 = r9.f5864h
            if (r11 == r10) goto L_0x0047
            r9.f5864h = r10
            r9.h()
        L_0x0047:
            int r10 = r9.f5863g
            if (r10 == r7) goto L_0x0050
            r9.f5863g = r7
            r9.h()
        L_0x0050:
            android.widget.EditText r7 = r6.f3601s
            if (r7 == 0) goto L_0x01c5
            java.util.WeakHashMap<android.view.View, i0.b0> r7 = i0.w.f6004a
            int r7 = i0.w.e.d(r6)
            r10 = 0
            r11 = 1
            if (r7 != r11) goto L_0x0060
            r7 = r11
            goto L_0x0061
        L_0x0060:
            r7 = r10
        L_0x0061:
            int r0 = r8.bottom
            android.graphics.Rect r1 = r6.f3586h0
            r1.bottom = r0
            int r0 = r6.W
            androidx.appcompat.widget.AppCompatTextView r2 = r6.L
            if (r0 == r11) goto L_0x00ae
            r3 = 2
            if (r0 == r3) goto L_0x0090
            int r0 = r8.left
            android.widget.EditText r3 = r6.f3601s
            int r3 = r3.getCompoundPaddingLeft()
            int r3 = r3 + r0
            java.lang.CharSequence r0 = r6.K
            if (r0 == 0) goto L_0x0089
            if (r7 != 0) goto L_0x0089
            int r0 = r2.getMeasuredWidth()
            int r3 = r3 - r0
            int r0 = r2.getPaddingLeft()
            int r3 = r3 + r0
        L_0x0089:
            r1.left = r3
            int r0 = r6.getPaddingTop()
            goto L_0x00ce
        L_0x0090:
            int r7 = r8.left
            android.widget.EditText r0 = r6.f3601s
            int r0 = r0.getPaddingLeft()
            int r0 = r0 + r7
            r1.left = r0
            int r7 = r8.top
            int r0 = r6.e()
            int r7 = r7 - r0
            r1.top = r7
            int r7 = r8.right
            android.widget.EditText r0 = r6.f3601s
            int r0 = r0.getPaddingRight()
            int r7 = r7 - r0
            goto L_0x00eb
        L_0x00ae:
            int r0 = r8.left
            android.widget.EditText r3 = r6.f3601s
            int r3 = r3.getCompoundPaddingLeft()
            int r3 = r3 + r0
            java.lang.CharSequence r0 = r6.K
            if (r0 == 0) goto L_0x00c7
            if (r7 != 0) goto L_0x00c7
            int r0 = r2.getMeasuredWidth()
            int r3 = r3 - r0
            int r0 = r2.getPaddingLeft()
            int r3 = r3 + r0
        L_0x00c7:
            r1.left = r3
            int r0 = r8.top
            int r3 = r6.f3579a0
            int r0 = r0 + r3
        L_0x00ce:
            r1.top = r0
            int r0 = r8.right
            android.widget.EditText r3 = r6.f3601s
            int r3 = r3.getCompoundPaddingRight()
            int r0 = r0 - r3
            java.lang.CharSequence r3 = r6.K
            if (r3 == 0) goto L_0x00ea
            if (r7 == 0) goto L_0x00ea
            int r7 = r2.getMeasuredWidth()
            int r2 = r2.getPaddingRight()
            int r7 = r7 - r2
            int r7 = r7 + r0
            goto L_0x00eb
        L_0x00ea:
            r7 = r0
        L_0x00eb:
            r1.right = r7
            int r0 = r1.left
            int r2 = r1.top
            int r3 = r1.bottom
            android.graphics.Rect r4 = r9.f5861e
            int r5 = r4.left
            if (r5 != r0) goto L_0x0107
            int r5 = r4.top
            if (r5 != r2) goto L_0x0107
            int r5 = r4.right
            if (r5 != r7) goto L_0x0107
            int r5 = r4.bottom
            if (r5 != r3) goto L_0x0107
            r5 = r11
            goto L_0x0108
        L_0x0107:
            r5 = r10
        L_0x0108:
            if (r5 != 0) goto L_0x0112
            r4.set(r0, r2, r7, r3)
            r9.D = r11
            r9.g()
        L_0x0112:
            android.widget.EditText r7 = r6.f3601s
            if (r7 == 0) goto L_0x01bf
            android.text.TextPaint r7 = r9.F
            float r0 = r9.f5865i
            r7.setTextSize(r0)
            android.graphics.Typeface r0 = r9.f5875t
            r7.setTypeface(r0)
            r0 = 0
            r7.setLetterSpacing(r0)
            float r7 = r7.ascent()
            float r7 = -r7
            int r0 = r8.left
            android.widget.EditText r2 = r6.f3601s
            int r2 = r2.getCompoundPaddingLeft()
            int r2 = r2 + r0
            r1.left = r2
            int r0 = r6.W
            if (r0 != r11) goto L_0x0144
            android.widget.EditText r0 = r6.f3601s
            int r0 = r0.getMinLines()
            if (r0 > r11) goto L_0x0144
            r0 = r11
            goto L_0x0145
        L_0x0144:
            r0 = r10
        L_0x0145:
            if (r0 == 0) goto L_0x0153
            int r0 = r8.centerY()
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r7 / r2
            float r0 = r0 - r2
            int r0 = (int) r0
            goto L_0x015c
        L_0x0153:
            int r0 = r8.top
            android.widget.EditText r2 = r6.f3601s
            int r2 = r2.getCompoundPaddingTop()
            int r0 = r0 + r2
        L_0x015c:
            r1.top = r0
            int r0 = r8.right
            android.widget.EditText r2 = r6.f3601s
            int r2 = r2.getCompoundPaddingRight()
            int r0 = r0 - r2
            r1.right = r0
            int r0 = r6.W
            if (r0 != r11) goto L_0x0177
            android.widget.EditText r0 = r6.f3601s
            int r0 = r0.getMinLines()
            if (r0 > r11) goto L_0x0177
            r0 = r11
            goto L_0x0178
        L_0x0177:
            r0 = r10
        L_0x0178:
            if (r0 == 0) goto L_0x0180
            int r8 = r1.top
            float r8 = (float) r8
            float r8 = r8 + r7
            int r7 = (int) r8
            goto L_0x0189
        L_0x0180:
            int r7 = r8.bottom
            android.widget.EditText r8 = r6.f3601s
            int r8 = r8.getCompoundPaddingBottom()
            int r7 = r7 - r8
        L_0x0189:
            r1.bottom = r7
            int r8 = r1.left
            int r0 = r1.top
            int r1 = r1.right
            android.graphics.Rect r2 = r9.d
            int r3 = r2.left
            if (r3 != r8) goto L_0x01a4
            int r3 = r2.top
            if (r3 != r0) goto L_0x01a4
            int r3 = r2.right
            if (r3 != r1) goto L_0x01a4
            int r3 = r2.bottom
            if (r3 != r7) goto L_0x01a4
            r10 = r11
        L_0x01a4:
            if (r10 != 0) goto L_0x01ae
            r2.set(r8, r0, r1, r7)
            r9.D = r11
            r9.g()
        L_0x01ae:
            r9.h()
            boolean r7 = r6.f()
            if (r7 == 0) goto L_0x01cb
            boolean r7 = r6.T0
            if (r7 != 0) goto L_0x01cb
            r6.i()
            goto L_0x01cb
        L_0x01bf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L_0x01c5:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i10, int i11) {
        boolean z10;
        EditText editText;
        int max;
        super.onMeasure(i10, i11);
        if (this.f3601s != null && this.f3601s.getMeasuredHeight() < (max = Math.max(this.f3597q.getMeasuredHeight(), this.f3595p.getMeasuredHeight()))) {
            this.f3601s.setMinimumHeight(max);
            z10 = true;
        } else {
            z10 = false;
        }
        boolean p10 = p();
        if (z10 || p10) {
            this.f3601s.post(new c());
        }
        if (!(this.F == null || (editText = this.f3601s) == null)) {
            this.F.setGravity(editText.getGravity());
            this.F.setPadding(this.f3601s.getCompoundPaddingLeft(), this.f3601s.getCompoundPaddingTop(), this.f3601s.getCompoundPaddingRight(), this.f3601s.getCompoundPaddingBottom());
        }
        u();
        x();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f7340o);
        setError(hVar.f3615q);
        if (hVar.f3616r) {
            this.f3606v0.post(new b());
        }
        setHint(hVar.f3617s);
        setHelperText(hVar.f3618t);
        setPlaceholderText(hVar.u);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        boolean z10;
        h hVar = new h(super.onSaveInstanceState());
        if (this.w.e()) {
            hVar.f3615q = getError();
        }
        boolean z11 = true;
        if (this.t0 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !this.f3606v0.isChecked()) {
            z11 = false;
        }
        hVar.f3616r = z11;
        hVar.f3617s = getHint();
        hVar.f3618t = getHelperText();
        hVar.u = getPlaceholderText();
        return hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (g() != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (r10.M != null) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f3601s
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            android.widget.LinearLayout r2 = r10.f3595p
            r3 = 1
            if (r0 != 0) goto L_0x0013
            java.lang.CharSequence r0 = r10.K
            if (r0 == 0) goto L_0x001b
        L_0x0013:
            int r0 = r2.getMeasuredWidth()
            if (r0 <= 0) goto L_0x001b
            r0 = r3
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            r4 = 0
            r5 = 2
            r6 = 3
            if (r0 == 0) goto L_0x0058
            int r0 = r2.getMeasuredWidth()
            android.widget.EditText r2 = r10.f3601s
            int r2 = r2.getPaddingLeft()
            int r0 = r0 - r2
            android.graphics.drawable.ColorDrawable r2 = r10.f3596p0
            if (r2 == 0) goto L_0x0034
            int r2 = r10.f3598q0
            if (r2 == r0) goto L_0x0040
        L_0x0034:
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>()
            r10.f3596p0 = r2
            r10.f3598q0 = r0
            r2.setBounds(r1, r1, r0, r3)
        L_0x0040:
            android.widget.EditText r0 = r10.f3601s
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r2 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.f3596p0
            if (r2 == r7) goto L_0x0071
            android.widget.EditText r2 = r10.f3601s
            r8 = r0[r3]
            r9 = r0[r5]
            r0 = r0[r6]
            r2.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L_0x006f
        L_0x0058:
            android.graphics.drawable.ColorDrawable r0 = r10.f3596p0
            if (r0 == 0) goto L_0x0071
            android.widget.EditText r0 = r10.f3601s
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r2 = r10.f3601s
            r7 = r0[r3]
            r8 = r0[r5]
            r0 = r0[r6]
            r2.setCompoundDrawablesRelative(r4, r7, r8, r0)
            r10.f3596p0 = r4
        L_0x006f:
            r0 = r3
            goto L_0x0072
        L_0x0071:
            r0 = r1
        L_0x0072:
            com.google.android.material.internal.CheckableImageButton r2 = r10.G0
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x008d
            int r2 = r10.t0
            if (r2 == 0) goto L_0x0080
            r2 = r3
            goto L_0x0081
        L_0x0080:
            r2 = r1
        L_0x0081:
            if (r2 == 0) goto L_0x0089
            boolean r2 = r10.g()
            if (r2 != 0) goto L_0x008d
        L_0x0089:
            java.lang.CharSequence r2 = r10.M
            if (r2 == 0) goto L_0x0097
        L_0x008d:
            android.widget.LinearLayout r2 = r10.f3597q
            int r2 = r2.getMeasuredWidth()
            if (r2 <= 0) goto L_0x0097
            r2 = r3
            goto L_0x0098
        L_0x0097:
            r2 = r1
        L_0x0098:
            if (r2 == 0) goto L_0x00ff
            androidx.appcompat.widget.AppCompatTextView r2 = r10.N
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r4 = r10.f3601s
            int r4 = r4.getPaddingRight()
            int r2 = r2 - r4
            com.google.android.material.internal.CheckableImageButton r4 = r10.getEndIconToUpdateDummyDrawable()
            if (r4 == 0) goto L_0x00bd
            int r7 = r4.getMeasuredWidth()
            int r7 = r7 + r2
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginStart()
            int r2 = r2 + r7
        L_0x00bd:
            android.widget.EditText r4 = r10.f3601s
            android.graphics.drawable.Drawable[] r4 = r4.getCompoundDrawablesRelative()
            android.graphics.drawable.ColorDrawable r7 = r10.B0
            if (r7 == 0) goto L_0x00db
            int r8 = r10.C0
            if (r8 == r2) goto L_0x00db
            r10.C0 = r2
            r7.setBounds(r1, r1, r2, r3)
            android.widget.EditText r0 = r10.f3601s
            r1 = r4[r1]
            r2 = r4[r3]
            android.graphics.drawable.ColorDrawable r5 = r10.B0
            r4 = r4[r6]
            goto L_0x00f9
        L_0x00db:
            if (r7 != 0) goto L_0x00e9
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.B0 = r7
            r10.C0 = r2
            r7.setBounds(r1, r1, r2, r3)
        L_0x00e9:
            r2 = r4[r5]
            android.graphics.drawable.ColorDrawable r5 = r10.B0
            if (r2 == r5) goto L_0x00fd
            r10.D0 = r2
            android.widget.EditText r0 = r10.f3601s
            r1 = r4[r1]
            r2 = r4[r3]
            r4 = r4[r6]
        L_0x00f9:
            r0.setCompoundDrawablesRelative(r1, r2, r5, r4)
            goto L_0x0120
        L_0x00fd:
            r3 = r0
            goto L_0x0120
        L_0x00ff:
            android.graphics.drawable.ColorDrawable r2 = r10.B0
            if (r2 == 0) goto L_0x0121
            android.widget.EditText r2 = r10.f3601s
            android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawablesRelative()
            r5 = r2[r5]
            android.graphics.drawable.ColorDrawable r7 = r10.B0
            if (r5 != r7) goto L_0x011d
            android.widget.EditText r0 = r10.f3601s
            r1 = r2[r1]
            r5 = r2[r3]
            android.graphics.drawable.Drawable r7 = r10.D0
            r2 = r2[r6]
            r0.setCompoundDrawablesRelative(r1, r5, r7, r2)
            goto L_0x011e
        L_0x011d:
            r3 = r0
        L_0x011e:
            r10.B0 = r4
        L_0x0120:
            r0 = r3
        L_0x0121:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        Drawable background;
        int i10;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f3601s;
        if (editText != null && this.W == 0 && (background = editText.getBackground()) != null) {
            if (k0.a(background)) {
                background = background.mutate();
            }
            l lVar = this.w;
            if (lVar.e()) {
                i10 = lVar.g();
            } else if (!this.z || (appCompatTextView = this.A) == null) {
                background.clearColorFilter();
                this.f3601s.refreshDrawableState();
                return;
            } else {
                i10 = appCompatTextView.getCurrentTextColor();
            }
            background.setColorFilter(androidx.appcompat.widget.k.c(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void r() {
        if (this.W != 1) {
            FrameLayout frameLayout = this.f3593o;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e10 = e();
            if (e10 != layoutParams.topMargin) {
                layoutParams.topMargin = e10;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        if (r0 != null) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(boolean r11, boolean r12) {
        /*
            r10 = this;
            boolean r0 = r10.isEnabled()
            android.widget.EditText r1 = r10.f3601s
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0016
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            android.widget.EditText r4 = r10.f3601s
            if (r4 == 0) goto L_0x0023
            boolean r4 = r4.hasFocus()
            if (r4 == 0) goto L_0x0023
            r4 = r2
            goto L_0x0024
        L_0x0023:
            r4 = r3
        L_0x0024:
            p6.l r5 = r10.w
            boolean r6 = r5.e()
            android.content.res.ColorStateList r7 = r10.I0
            h6.c r8 = r10.U0
            if (r7 == 0) goto L_0x003e
            r8.i(r7)
            android.content.res.ColorStateList r7 = r10.I0
            android.content.res.ColorStateList r9 = r8.f5867k
            if (r9 == r7) goto L_0x003e
            r8.f5867k = r7
            r8.h()
        L_0x003e:
            r7 = 0
            if (r0 != 0) goto L_0x006a
            android.content.res.ColorStateList r0 = r10.I0
            if (r0 == 0) goto L_0x0053
            int[] r5 = new int[r2]
            r6 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r5[r3] = r6
            int r6 = r10.S0
            int r0 = r0.getColorForState(r5, r6)
            goto L_0x0055
        L_0x0053:
            int r0 = r10.S0
        L_0x0055:
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r0)
            r8.i(r5)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            android.content.res.ColorStateList r5 = r8.f5867k
            if (r5 == r0) goto L_0x008d
            r8.f5867k = r0
            r8.h()
            goto L_0x008d
        L_0x006a:
            if (r6 == 0) goto L_0x0077
            androidx.appcompat.widget.AppCompatTextView r0 = r5.l
            if (r0 == 0) goto L_0x0075
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto L_0x008a
        L_0x0075:
            r0 = r7
            goto L_0x008a
        L_0x0077:
            boolean r0 = r10.z
            if (r0 == 0) goto L_0x0084
            androidx.appcompat.widget.AppCompatTextView r0 = r10.A
            if (r0 == 0) goto L_0x0084
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto L_0x008a
        L_0x0084:
            if (r4 == 0) goto L_0x008d
            android.content.res.ColorStateList r0 = r10.J0
            if (r0 == 0) goto L_0x008d
        L_0x008a:
            r8.i(r0)
        L_0x008d:
            if (r1 != 0) goto L_0x00f9
            boolean r0 = r10.V0
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto L_0x009c
            if (r4 == 0) goto L_0x009c
            goto L_0x00f9
        L_0x009c:
            if (r12 != 0) goto L_0x00a2
            boolean r12 = r10.T0
            if (r12 != 0) goto L_0x013e
        L_0x00a2:
            android.animation.ValueAnimator r12 = r10.X0
            if (r12 == 0) goto L_0x00b1
            boolean r12 = r12.isRunning()
            if (r12 == 0) goto L_0x00b1
            android.animation.ValueAnimator r12 = r10.X0
            r12.cancel()
        L_0x00b1:
            r12 = 0
            if (r11 == 0) goto L_0x00bc
            boolean r11 = r10.W0
            if (r11 == 0) goto L_0x00bc
            r10.a(r12)
            goto L_0x00bf
        L_0x00bc:
            r8.j(r12)
        L_0x00bf:
            boolean r11 = r10.f()
            if (r11 == 0) goto L_0x00df
            m6.f r11 = r10.R
            p6.f r11 = (p6.f) r11
            android.graphics.RectF r11 = r11.M
            boolean r11 = r11.isEmpty()
            r11 = r11 ^ r2
            if (r11 == 0) goto L_0x00df
            boolean r11 = r10.f()
            if (r11 == 0) goto L_0x00df
            m6.f r11 = r10.R
            p6.f r11 = (p6.f) r11
            r11.n(r12, r12, r12, r12)
        L_0x00df:
            r10.T0 = r2
            androidx.appcompat.widget.AppCompatTextView r11 = r10.F
            if (r11 == 0) goto L_0x00f2
            boolean r12 = r10.E
            if (r12 == 0) goto L_0x00f2
            r11.setText(r7)
            androidx.appcompat.widget.AppCompatTextView r11 = r10.F
            r12 = 4
            r11.setVisibility(r12)
        L_0x00f2:
            r10.v()
            r10.y()
            goto L_0x013e
        L_0x00f9:
            if (r12 != 0) goto L_0x00ff
            boolean r12 = r10.T0
            if (r12 == 0) goto L_0x013e
        L_0x00ff:
            android.animation.ValueAnimator r12 = r10.X0
            if (r12 == 0) goto L_0x010e
            boolean r12 = r12.isRunning()
            if (r12 == 0) goto L_0x010e
            android.animation.ValueAnimator r12 = r10.X0
            r12.cancel()
        L_0x010e:
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x011a
            boolean r11 = r10.W0
            if (r11 == 0) goto L_0x011a
            r10.a(r12)
            goto L_0x011d
        L_0x011a:
            r8.j(r12)
        L_0x011d:
            r10.T0 = r3
            boolean r11 = r10.f()
            if (r11 == 0) goto L_0x0128
            r10.i()
        L_0x0128:
            android.widget.EditText r11 = r10.f3601s
            if (r11 != 0) goto L_0x012d
            goto L_0x0135
        L_0x012d:
            android.text.Editable r11 = r11.getText()
            int r3 = r11.length()
        L_0x0135:
            r10.t(r3)
            r10.v()
            r10.y()
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s(boolean, boolean):void");
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f3584f0 != i10) {
            this.f3584f0 = i10;
            this.O0 = i10;
            this.Q0 = i10;
            this.R0 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        Context context = getContext();
        Object obj = y.a.f9523a;
        setBoxBackgroundColor(a.d.a(context, i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.O0 = defaultColor;
        this.f3584f0 = defaultColor;
        this.P0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.Q0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.R0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 != this.W) {
            this.W = i10;
            if (this.f3601s != null) {
                h();
            }
        }
    }

    public void setBoxStrokeColor(int i10) {
        if (this.M0 != i10) {
            this.M0 = i10;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.K0 = colorStateList.getDefaultColor();
            this.S0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.L0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.M0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            z();
        }
        this.M0 = defaultColor;
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f3581c0 = i10;
        z();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f3582d0 = i10;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        int i10;
        if (this.f3608x != z10) {
            l lVar = this.w;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
                this.A = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.f3588j0;
                if (typeface != null) {
                    this.A.setTypeface(typeface);
                }
                this.A.setMaxLines(1);
                lVar.a(this.A, 2);
                ((ViewGroup.MarginLayoutParams) this.A.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.A != null) {
                    EditText editText = this.f3601s;
                    if (editText == null) {
                        i10 = 0;
                    } else {
                        i10 = editText.getText().length();
                    }
                    n(i10);
                }
            } else {
                lVar.i(this.A, 2);
                this.A = null;
            }
            this.f3608x = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        int i11;
        if (this.f3609y != i10) {
            if (i10 <= 0) {
                i10 = -1;
            }
            this.f3609y = i10;
            if (this.f3608x && this.A != null) {
                EditText editText = this.f3601s;
                if (editText == null) {
                    i11 = 0;
                } else {
                    i11 = editText.getText().length();
                }
                n(i11);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.B != i10) {
            this.B = i10;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.C != i10) {
            this.C = i10;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.I0 = colorStateList;
        this.J0 = colorStateList;
        if (this.f3601s != null) {
            s(false, false);
        }
    }

    public void setEnabled(boolean z10) {
        j(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f3606v0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f3606v0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f3606v0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3606v0;
        checkableImageButton.setImageDrawable(drawable);
        k(checkableImageButton, this.x0);
    }

    public void setEndIconMode(int i10) {
        boolean z10;
        int i11 = this.t0;
        this.t0 = i10;
        Iterator<g> it = this.f3607w0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i11);
        }
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEndIconVisible(z10);
        if (getEndIconDelegate().b(this.W)) {
            getEndIconDelegate().a();
            c();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.W + " is not supported by the end icon mode " + i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.E0;
        CheckableImageButton checkableImageButton = this.f3606v0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.E0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f3606v0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.x0 != colorStateList) {
            this.x0 = colorStateList;
            this.y0 = true;
            c();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f3610z0 != mode) {
            this.f3610z0 = mode;
            this.A0 = true;
            c();
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (g() != z10) {
            this.f3606v0.setVisibility(z10 ? 0 : 8);
            x();
            p();
        }
    }

    public void setError(CharSequence charSequence) {
        l lVar = this.w;
        if (!lVar.f7949k) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            lVar.c();
            lVar.f7948j = charSequence;
            lVar.l.setText(charSequence);
            int i10 = lVar.f7946h;
            if (i10 != 1) {
                lVar.f7947i = 1;
            }
            lVar.k(i10, lVar.f7947i, lVar.j(lVar.l, charSequence));
            return;
        }
        lVar.h();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        l lVar = this.w;
        lVar.f7950m = charSequence;
        AppCompatTextView appCompatTextView = lVar.l;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        l lVar = this.w;
        if (lVar.f7949k != z10) {
            lVar.c();
            TextInputLayout textInputLayout = lVar.f7941b;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(lVar.f7940a, (AttributeSet) null);
                lVar.l = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_error);
                lVar.l.setTextAlignment(5);
                Typeface typeface = lVar.u;
                if (typeface != null) {
                    lVar.l.setTypeface(typeface);
                }
                int i10 = lVar.f7951n;
                lVar.f7951n = i10;
                AppCompatTextView appCompatTextView2 = lVar.l;
                if (appCompatTextView2 != null) {
                    textInputLayout.m(appCompatTextView2, i10);
                }
                ColorStateList colorStateList = lVar.f7952o;
                lVar.f7952o = colorStateList;
                AppCompatTextView appCompatTextView3 = lVar.l;
                if (!(appCompatTextView3 == null || colorStateList == null)) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                CharSequence charSequence = lVar.f7950m;
                lVar.f7950m = charSequence;
                AppCompatTextView appCompatTextView4 = lVar.l;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setContentDescription(charSequence);
                }
                lVar.l.setVisibility(4);
                AppCompatTextView appCompatTextView5 = lVar.l;
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                w.g.f(appCompatTextView5, 1);
                lVar.a(lVar.l, 0);
            } else {
                lVar.h();
                lVar.i(lVar.l, 0);
                lVar.l = null;
                textInputLayout.q();
                textInputLayout.z();
            }
            lVar.f7949k = z10;
        }
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
        k(this.G0, this.H0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.F0;
        CheckableImageButton checkableImageButton = this.G0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.F0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.G0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.H0 = colorStateList;
        CheckableImageButton checkableImageButton = this.G0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        CheckableImageButton checkableImageButton = this.G0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i10) {
        l lVar = this.w;
        lVar.f7951n = i10;
        AppCompatTextView appCompatTextView = lVar.l;
        if (appCompatTextView != null) {
            lVar.f7941b.m(appCompatTextView, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        l lVar = this.w;
        lVar.f7952o = colorStateList;
        AppCompatTextView appCompatTextView = lVar.l;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.V0 != z10) {
            this.V0 = z10;
            s(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        l lVar = this.w;
        if (!isEmpty) {
            if (!lVar.f7954q) {
                setHelperTextEnabled(true);
            }
            lVar.c();
            lVar.f7953p = charSequence;
            lVar.f7955r.setText(charSequence);
            int i10 = lVar.f7946h;
            if (i10 != 2) {
                lVar.f7947i = 2;
            }
            lVar.k(i10, lVar.f7947i, lVar.j(lVar.f7955r, charSequence));
        } else if (lVar.f7954q) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        l lVar = this.w;
        lVar.f7957t = colorStateList;
        AppCompatTextView appCompatTextView = lVar.f7955r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        l lVar = this.w;
        if (lVar.f7954q != z10) {
            lVar.c();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(lVar.f7940a, (AttributeSet) null);
                lVar.f7955r = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_helper_text);
                lVar.f7955r.setTextAlignment(5);
                Typeface typeface = lVar.u;
                if (typeface != null) {
                    lVar.f7955r.setTypeface(typeface);
                }
                lVar.f7955r.setVisibility(4);
                AppCompatTextView appCompatTextView2 = lVar.f7955r;
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                w.g.f(appCompatTextView2, 1);
                int i10 = lVar.f7956s;
                lVar.f7956s = i10;
                AppCompatTextView appCompatTextView3 = lVar.f7955r;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setTextAppearance(i10);
                }
                ColorStateList colorStateList = lVar.f7957t;
                lVar.f7957t = colorStateList;
                AppCompatTextView appCompatTextView4 = lVar.f7955r;
                if (!(appCompatTextView4 == null || colorStateList == null)) {
                    appCompatTextView4.setTextColor(colorStateList);
                }
                lVar.a(lVar.f7955r, 1);
            } else {
                lVar.c();
                int i11 = lVar.f7946h;
                if (i11 == 2) {
                    lVar.f7947i = 0;
                }
                lVar.k(i11, lVar.f7947i, lVar.j(lVar.f7955r, (CharSequence) null));
                lVar.i(lVar.f7955r, 1);
                lVar.f7955r = null;
                TextInputLayout textInputLayout = lVar.f7941b;
                textInputLayout.q();
                textInputLayout.z();
            }
            lVar.f7954q = z10;
        }
    }

    public void setHelperTextTextAppearance(int i10) {
        l lVar = this.w;
        lVar.f7956s = i10;
        AppCompatTextView appCompatTextView = lVar.f7955r;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.O) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.W0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.O) {
            this.O = z10;
            if (!z10) {
                this.Q = false;
                if (!TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.f3601s.getHint())) {
                    this.f3601s.setHint(this.P);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f3601s.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.P)) {
                        setHint(hint);
                    }
                    this.f3601s.setHint((CharSequence) null);
                }
                this.Q = true;
            }
            if (this.f3601s != null) {
                r();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        h6.c cVar = this.U0;
        View view = cVar.f5858a;
        j6.d dVar = new j6.d(view.getContext(), i10);
        ColorStateList colorStateList = dVar.f6578a;
        if (colorStateList != null) {
            cVar.l = colorStateList;
        }
        float f10 = dVar.f6587k;
        if (f10 != 0.0f) {
            cVar.f5866j = f10;
        }
        ColorStateList colorStateList2 = dVar.f6579b;
        if (colorStateList2 != null) {
            cVar.L = colorStateList2;
        }
        cVar.J = dVar.f6582f;
        cVar.K = dVar.f6583g;
        cVar.I = dVar.f6584h;
        cVar.M = dVar.f6586j;
        j6.a aVar = cVar.f5876v;
        if (aVar != null) {
            aVar.f6577q = true;
        }
        h6.b bVar = new h6.b(cVar);
        dVar.a();
        cVar.f5876v = new j6.a(bVar, dVar.f6589n);
        dVar.c(view.getContext(), cVar.f5876v);
        cVar.h();
        this.J0 = cVar.l;
        if (this.f3601s != null) {
            s(false, false);
            r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.J0 != colorStateList) {
            if (this.I0 == null) {
                this.U0.i(colorStateList);
            }
            this.J0 = colorStateList;
            if (this.f3601s != null) {
                s(false, false);
            }
        }
    }

    public void setMaxWidth(int i10) {
        this.f3605v = i10;
        EditText editText = this.f3601s;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinWidth(int i10) {
        this.u = i10;
        EditText editText = this.f3601s;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f3606v0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f3606v0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.t0 != 1) {
            setEndIconMode(1);
        } else if (!z10) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.x0 = colorStateList;
        this.y0 = true;
        c();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f3610z0 = mode;
        this.A0 = true;
        c();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i10 = 0;
        if (!this.E || !TextUtils.isEmpty(charSequence)) {
            if (!this.E) {
                setPlaceholderTextEnabled(true);
            }
            this.D = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        EditText editText = this.f3601s;
        if (editText != null) {
            i10 = editText.getText().length();
        }
        t(i10);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.H = i10;
        AppCompatTextView appCompatTextView = this.F;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            AppCompatTextView appCompatTextView = this.F;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.K = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.L.setText(charSequence);
        v();
    }

    public void setPrefixTextAppearance(int i10) {
        this.L.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.L.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.f3589k0.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f3589k0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3589k0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            k(checkableImageButton, this.f3590l0);
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f3600r0;
        CheckableImageButton checkableImageButton = this.f3589k0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f3600r0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f3589k0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f3590l0 != colorStateList) {
            this.f3590l0 = colorStateList;
            this.f3591m0 = true;
            d(this.f3589k0, true, colorStateList, this.f3594o0, this.f3592n0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f3592n0 != mode) {
            this.f3592n0 = mode;
            this.f3594o0 = true;
            d(this.f3589k0, this.f3591m0, this.f3590l0, true, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        boolean z11;
        CheckableImageButton checkableImageButton = this.f3589k0;
        int i10 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            if (!z10) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            u();
            p();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.M = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.N.setText(charSequence);
        y();
    }

    public void setSuffixTextAppearance(int i10) {
        this.N.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.N.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f3601s;
        if (editText != null) {
            w.k(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z10;
        if (typeface != this.f3588j0) {
            this.f3588j0 = typeface;
            h6.c cVar = this.U0;
            j6.a aVar = cVar.f5876v;
            boolean z11 = true;
            if (aVar != null) {
                aVar.f6577q = true;
            }
            if (cVar.f5874s != typeface) {
                cVar.f5874s = typeface;
                z10 = true;
            } else {
                z10 = false;
            }
            if (cVar.f5875t != typeface) {
                cVar.f5875t = typeface;
            } else {
                z11 = false;
            }
            if (z10 || z11) {
                cVar.h();
            }
            l lVar = this.w;
            if (typeface != lVar.u) {
                lVar.u = typeface;
                AppCompatTextView appCompatTextView = lVar.l;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = lVar.f7955r;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.A;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t(int i10) {
        if (i10 != 0 || this.T0) {
            AppCompatTextView appCompatTextView = this.F;
            if (appCompatTextView != null && this.E) {
                appCompatTextView.setText((CharSequence) null);
                this.F.setVisibility(4);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView2 = this.F;
        if (appCompatTextView2 != null && this.E) {
            appCompatTextView2.setText(this.D);
            this.F.setVisibility(0);
            this.F.bringToFront();
        }
    }

    public final void u() {
        boolean z10;
        if (this.f3601s != null) {
            int i10 = 0;
            if (this.f3589k0.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                EditText editText = this.f3601s;
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                i10 = w.e.f(editText);
            }
            AppCompatTextView appCompatTextView = this.L;
            int compoundPaddingTop = this.f3601s.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = this.f3601s.getCompoundPaddingBottom();
            WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
            w.e.k(appCompatTextView, i10, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void v() {
        int i10;
        AppCompatTextView appCompatTextView = this.L;
        if (this.K == null || this.T0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        appCompatTextView.setVisibility(i10);
        p();
    }

    public final void w(boolean z10, boolean z11) {
        int defaultColor = this.N0.getDefaultColor();
        int colorForState = this.N0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.N0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f3583e0 = colorForState2;
        } else if (z11) {
            this.f3583e0 = colorForState;
        } else {
            this.f3583e0 = defaultColor;
        }
    }

    public final void x() {
        boolean z10;
        if (this.f3601s != null) {
            int i10 = 0;
            if (!g()) {
                if (this.G0.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    EditText editText = this.f3601s;
                    WeakHashMap<View, b0> weakHashMap = w.f6004a;
                    i10 = w.e.e(editText);
                }
            }
            AppCompatTextView appCompatTextView = this.N;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = this.f3601s.getPaddingTop();
            int paddingBottom = this.f3601s.getPaddingBottom();
            WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
            w.e.k(appCompatTextView, dimensionPixelSize, paddingTop, i10, paddingBottom);
        }
    }

    public final void y() {
        boolean z10;
        AppCompatTextView appCompatTextView = this.N;
        int visibility = appCompatTextView.getVisibility();
        int i10 = 0;
        if (this.M == null || this.T0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            i10 = 8;
        }
        appCompatTextView.setVisibility(i10);
        if (visibility != appCompatTextView.getVisibility()) {
            getEndIconDelegate().c(z10);
        }
        p();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z() {
        /*
            r7 = this;
            m6.f r0 = r7.R
            if (r0 == 0) goto L_0x011d
            int r0 = r7.W
            if (r0 != 0) goto L_0x000a
            goto L_0x011d
        L_0x000a:
            boolean r0 = r7.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r7.f3601s
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r7.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r7.f3601s
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = r1
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            boolean r4 = r7.isEnabled()
            p6.l r5 = r7.w
            if (r4 != 0) goto L_0x003f
            int r4 = r7.S0
            goto L_0x0070
        L_0x003f:
            boolean r4 = r5.e()
            if (r4 == 0) goto L_0x004f
            android.content.res.ColorStateList r4 = r7.N0
            if (r4 == 0) goto L_0x004a
            goto L_0x005b
        L_0x004a:
            int r4 = r5.g()
            goto L_0x0070
        L_0x004f:
            boolean r4 = r7.z
            if (r4 == 0) goto L_0x0064
            androidx.appcompat.widget.AppCompatTextView r4 = r7.A
            if (r4 == 0) goto L_0x0064
            android.content.res.ColorStateList r6 = r7.N0
            if (r6 == 0) goto L_0x005f
        L_0x005b:
            r7.w(r0, r3)
            goto L_0x0072
        L_0x005f:
            int r4 = r4.getCurrentTextColor()
            goto L_0x0070
        L_0x0064:
            if (r0 == 0) goto L_0x0069
            int r4 = r7.M0
            goto L_0x0070
        L_0x0069:
            if (r3 == 0) goto L_0x006e
            int r4 = r7.L0
            goto L_0x0070
        L_0x006e:
            int r4 = r7.K0
        L_0x0070:
            r7.f3583e0 = r4
        L_0x0072:
            android.graphics.drawable.Drawable r4 = r7.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0083
            boolean r4 = r5.f7949k
            if (r4 == 0) goto L_0x0083
            boolean r4 = r5.e()
            if (r4 == 0) goto L_0x0083
            r1 = r2
        L_0x0083:
            r7.setErrorIconVisible(r1)
            com.google.android.material.internal.CheckableImageButton r1 = r7.G0
            android.content.res.ColorStateList r4 = r7.H0
            r7.k(r1, r4)
            com.google.android.material.internal.CheckableImageButton r1 = r7.f3589k0
            android.content.res.ColorStateList r4 = r7.f3590l0
            r7.k(r1, r4)
            android.content.res.ColorStateList r1 = r7.x0
            com.google.android.material.internal.CheckableImageButton r4 = r7.f3606v0
            r7.k(r4, r1)
            p6.k r1 = r7.getEndIconDelegate()
            r1.getClass()
            boolean r1 = r1 instanceof com.google.android.material.textfield.b
            if (r1 == 0) goto L_0x00c8
            boolean r1 = r5.e()
            if (r1 == 0) goto L_0x00c5
            android.graphics.drawable.Drawable r1 = r7.getEndIconDrawable()
            if (r1 == 0) goto L_0x00c5
            android.graphics.drawable.Drawable r1 = r7.getEndIconDrawable()
            android.graphics.drawable.Drawable r1 = r1.mutate()
            int r5 = r5.g()
            r1.setTint(r5)
            r4.setImageDrawable(r1)
            goto L_0x00c8
        L_0x00c5:
            r7.c()
        L_0x00c8:
            if (r0 == 0) goto L_0x00d3
            boolean r1 = r7.isEnabled()
            if (r1 == 0) goto L_0x00d3
            int r1 = r7.f3582d0
            goto L_0x00d5
        L_0x00d3:
            int r1 = r7.f3581c0
        L_0x00d5:
            r7.f3580b0 = r1
            int r1 = r7.W
            r4 = 2
            if (r1 != r4) goto L_0x00fd
            boolean r1 = r7.f()
            if (r1 == 0) goto L_0x00fd
            boolean r1 = r7.T0
            if (r1 != 0) goto L_0x00fd
            int r1 = r7.V
            int r4 = r7.f3580b0
            if (r1 == r4) goto L_0x00fd
            boolean r1 = r7.f()
            if (r1 == 0) goto L_0x00fa
            m6.f r1 = r7.R
            p6.f r1 = (p6.f) r1
            r4 = 0
            r1.n(r4, r4, r4, r4)
        L_0x00fa:
            r7.i()
        L_0x00fd:
            int r1 = r7.W
            if (r1 != r2) goto L_0x011a
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x010a
            int r0 = r7.P0
            goto L_0x0118
        L_0x010a:
            if (r3 == 0) goto L_0x0111
            if (r0 != 0) goto L_0x0111
            int r0 = r7.R0
            goto L_0x0118
        L_0x0111:
            if (r0 == 0) goto L_0x0116
            int r0 = r7.Q0
            goto L_0x0118
        L_0x0116:
            int r0 = r7.O0
        L_0x0118:
            r7.f3584f0 = r0
        L_0x011a:
            r7.b()
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.z():void");
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.G0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.w.f7949k);
    }
}
