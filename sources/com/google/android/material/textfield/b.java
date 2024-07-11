package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.karumi.dexter.R;
import h6.j;
import java.util.LinkedHashSet;
import m6.f;
import m6.i;
import p6.g;
import p6.k;

public final class b extends k {
    public final a d = new a();

    /* renamed from: e  reason: collision with root package name */
    public final C0040b f3631e = new C0040b();

    /* renamed from: f  reason: collision with root package name */
    public final c f3632f;

    /* renamed from: g  reason: collision with root package name */
    public final d f3633g;
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: h  reason: collision with root package name */
    public final e f3634h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3635i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3636j;

    /* renamed from: k  reason: collision with root package name */
    public long f3637k;
    public StateListDrawable l;

    /* renamed from: m  reason: collision with root package name */
    public m6.f f3638m;

    /* renamed from: n  reason: collision with root package name */
    public AccessibilityManager f3639n;

    /* renamed from: o  reason: collision with root package name */
    public ValueAnimator f3640o;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f3641p;

    public class a extends j {

        /* renamed from: com.google.android.material.textfield.b$a$a  reason: collision with other inner class name */
        public class C0039a implements Runnable {

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f3643o;

            public C0039a(AutoCompleteTextView autoCompleteTextView) {
                this.f3643o = autoCompleteTextView;
            }

            public final void run() {
                boolean isPopupShowing = this.f3643o.isPopupShowing();
                a aVar = a.this;
                b.this.f(isPopupShowing);
                b.this.f3635i = isPopupShowing;
            }
        }

        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            b bVar = b.this;
            EditText editText = bVar.f7937a.getEditText();
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (bVar.f3639n.isTouchExplorationEnabled()) {
                    if (autoCompleteTextView.getKeyListener() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && !bVar.f7939c.hasFocus()) {
                        autoCompleteTextView.dismissDropDown();
                    }
                }
                autoCompleteTextView.post(new C0039a(autoCompleteTextView));
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b  reason: collision with other inner class name */
    public class C0040b implements View.OnFocusChangeListener {
        public C0040b() {
        }

        public final void onFocusChange(View view, boolean z) {
            b bVar = b.this;
            bVar.f7937a.setEndIconActivated(z);
            if (!z) {
                bVar.f(false);
                bVar.f3635i = false;
            }
        }
    }

    public class c extends TextInputLayout.e {
        public c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        public final void d(View view, j0.b bVar) {
            boolean z;
            super.d(view, bVar);
            boolean z10 = true;
            if (b.this.f7937a.getEditText().getKeyListener() != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                bVar.g(Spinner.class.getName());
            }
            int i10 = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo accessibilityNodeInfo = bVar.f6386a;
            if (i10 >= 26) {
                z10 = accessibilityNodeInfo.isShowingHintText();
            } else {
                Bundle extras = accessibilityNodeInfo.getExtras();
                if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                    z10 = false;
                }
            }
            if (z10) {
                bVar.j((String) null);
            }
        }

        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            b bVar = b.this;
            EditText editText = bVar.f7937a.getEditText();
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                boolean z = true;
                if (accessibilityEvent.getEventType() == 1 && bVar.f3639n.isTouchExplorationEnabled()) {
                    if (bVar.f7937a.getEditText().getKeyListener() == null) {
                        z = false;
                    }
                    if (!z) {
                        b.d(bVar, autoCompleteTextView);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    public class d implements TextInputLayout.f {
        public d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00f5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.google.android.material.textfield.TextInputLayout r13) {
            /*
                r12 = this;
                android.widget.EditText r0 = r13.getEditText()
                boolean r1 = r0 instanceof android.widget.AutoCompleteTextView
                if (r1 == 0) goto L_0x0105
                android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.TextInputLayout r2 = r1.f7937a
                int r2 = r2.getBoxBackgroundMode()
                r3 = 2
                r4 = 1
                if (r2 != r3) goto L_0x0019
                m6.f r2 = r1.f3638m
                goto L_0x001d
            L_0x0019:
                if (r2 != r4) goto L_0x0020
                android.graphics.drawable.StateListDrawable r2 = r1.l
            L_0x001d:
                r0.setDropDownBackgroundDrawable(r2)
            L_0x0020:
                android.text.method.KeyListener r2 = r0.getKeyListener()
                r5 = 0
                if (r2 == 0) goto L_0x0029
                r2 = r4
                goto L_0x002a
            L_0x0029:
                r2 = r5
            L_0x002a:
                if (r2 == 0) goto L_0x002e
                goto L_0x00c5
            L_0x002e:
                com.google.android.material.textfield.TextInputLayout r2 = r1.f7937a
                int r6 = r2.getBoxBackgroundMode()
                m6.f r7 = r2.getBoxBackground()
                r8 = 2130968800(0x7f0400e0, float:1.7546264E38)
                int r8 = n.e.u(r0, r8)
                int[][] r9 = new int[r3][]
                int[] r10 = new int[r4]
                r11 = 16842919(0x10100a7, float:2.3694026E-38)
                r10[r5] = r11
                r9[r5] = r10
                int[] r10 = new int[r5]
                r9[r4] = r10
                r10 = 1036831949(0x3dcccccd, float:0.1)
                if (r6 != r3) goto L_0x00a6
                r2 = 2130968816(0x7f0400f0, float:1.7546296E38)
                int r2 = n.e.u(r0, r2)
                m6.f r6 = new m6.f
                m6.f$b r11 = r7.f7121o
                m6.i r11 = r11.f7131a
                r6.<init>((m6.i) r11)
                int r8 = n.e.C(r10, r8, r2)
                int[] r10 = new int[r3]
                r10[r5] = r8
                r10[r4] = r5
                android.content.res.ColorStateList r11 = new android.content.res.ColorStateList
                r11.<init>(r9, r10)
                r6.j(r11)
                r6.setTint(r2)
                int[] r10 = new int[r3]
                r10[r5] = r8
                r10[r4] = r2
                android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
                r2.<init>(r9, r10)
                m6.f r8 = new m6.f
                m6.f$b r9 = r7.f7121o
                m6.i r9 = r9.f7131a
                r8.<init>((m6.i) r9)
                r9 = -1
                r8.setTint(r9)
                android.graphics.drawable.RippleDrawable r9 = new android.graphics.drawable.RippleDrawable
                r9.<init>(r2, r6, r8)
                android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r3]
                r2[r5] = r9
                r2[r4] = r7
                android.graphics.drawable.LayerDrawable r6 = new android.graphics.drawable.LayerDrawable
                r6.<init>(r2)
                java.util.WeakHashMap<android.view.View, i0.b0> r2 = i0.w.f6004a
                i0.w.d.q(r0, r6)
                goto L_0x00c5
            L_0x00a6:
                if (r6 != r4) goto L_0x00c5
                int r2 = r2.getBoxBackgroundColor()
                int r6 = n.e.C(r10, r8, r2)
                int[] r8 = new int[r3]
                r8[r5] = r6
                r8[r4] = r2
                android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
                r2.<init>(r9, r8)
                android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
                r6.<init>(r2, r7, r7)
                java.util.WeakHashMap<android.view.View, i0.b0> r2 = i0.w.f6004a
                i0.w.d.q(r0, r6)
            L_0x00c5:
                p6.h r2 = new p6.h
                r2.<init>(r1, r0)
                r0.setOnTouchListener(r2)
                com.google.android.material.textfield.b$b r2 = r1.f3631e
                r0.setOnFocusChangeListener(r2)
                p6.i r2 = new p6.i
                r2.<init>(r1)
                r0.setOnDismissListener(r2)
                r0.setThreshold(r5)
                com.google.android.material.textfield.b$a r2 = r1.d
                r0.removeTextChangedListener(r2)
                r0.addTextChangedListener(r2)
                r13.setEndIconCheckable(r4)
                r2 = 0
                r13.setErrorIconDrawable((android.graphics.drawable.Drawable) r2)
                android.text.method.KeyListener r0 = r0.getKeyListener()
                if (r0 == 0) goto L_0x00f3
                r5 = r4
            L_0x00f3:
                if (r5 != 0) goto L_0x00fc
                java.util.WeakHashMap<android.view.View, i0.b0> r0 = i0.w.f6004a
                com.google.android.material.internal.CheckableImageButton r0 = r1.f7939c
                i0.w.d.s(r0, r3)
            L_0x00fc:
                com.google.android.material.textfield.b$c r0 = r1.f3632f
                r13.setTextInputAccessibilityDelegate(r0)
                r13.setEndIconVisible(r4)
                return
            L_0x0105:
                java.lang.RuntimeException r13 = new java.lang.RuntimeException
                java.lang.String r0 = "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."
                r13.<init>(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.b.d.a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    public class e implements TextInputLayout.g {

        public class a implements Runnable {

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f3649o;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f3649o = autoCompleteTextView;
            }

            public final void run() {
                this.f3649o.removeTextChangedListener(b.this.d);
            }
        }

        public e() {
        }

        public final void a(TextInputLayout textInputLayout, int i10) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i10 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == b.this.f3631e) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public final void onClick(View view) {
            b bVar = b.this;
            b.d(bVar, (AutoCompleteTextView) bVar.f7937a.getEditText());
        }
    }

    public b(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f3632f = new c(textInputLayout);
        this.f3633g = new d();
        this.f3634h = new e();
        this.f3635i = false;
        this.f3636j = false;
        this.f3637k = Long.MAX_VALUE;
    }

    public static void d(b bVar, AutoCompleteTextView autoCompleteTextView) {
        boolean z;
        if (autoCompleteTextView == null) {
            bVar.getClass();
            return;
        }
        bVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - bVar.f3637k;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bVar.f3635i = false;
        }
        if (!bVar.f3635i) {
            bVar.f(!bVar.f3636j);
            if (bVar.f3636j) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        bVar.f3635i = false;
    }

    public final void a() {
        Context context = this.f7938b;
        float dimensionPixelOffset = (float) context.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        m6.f e10 = e(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        m6.f e11 = e(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f3638m = e10;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, e10);
        this.l.addState(new int[0], e11);
        Drawable b10 = f.a.b(context, R.drawable.mtrl_dropdown_arrow);
        TextInputLayout textInputLayout = this.f7937a;
        textInputLayout.setEndIconDrawable(b10);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        textInputLayout.setEndIconOnClickListener(new f());
        LinkedHashSet<TextInputLayout.f> linkedHashSet = textInputLayout.f3602s0;
        d dVar = this.f3633g;
        linkedHashSet.add(dVar);
        if (textInputLayout.f3601s != null) {
            dVar.a(textInputLayout);
        }
        textInputLayout.f3607w0.add(this.f3634h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        LinearInterpolator linearInterpolator = s5.a.f8784a;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration((long) 67);
        ofFloat.addUpdateListener(new g(this));
        this.f3641p = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration((long) 50);
        ofFloat2.addUpdateListener(new g(this));
        this.f3640o = ofFloat2;
        ofFloat2.addListener(new p6.j(this));
        this.f3639n = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public final boolean b(int i10) {
        return i10 != 0;
    }

    public final m6.f e(float f10, float f11, float f12, int i10) {
        i.a aVar = new i.a();
        aVar.f7164e = new m6.a(f10);
        aVar.f7165f = new m6.a(f10);
        aVar.f7167h = new m6.a(f11);
        aVar.f7166g = new m6.a(f11);
        i iVar = new i(aVar);
        Paint paint = m6.f.K;
        String simpleName = m6.f.class.getSimpleName();
        Context context = this.f7938b;
        int b10 = j6.b.b(R.attr.colorSurface, context, simpleName);
        m6.f fVar = new m6.f();
        fVar.h(context);
        fVar.j(ColorStateList.valueOf(b10));
        fVar.i(f12);
        fVar.setShapeAppearanceModel(iVar);
        f.b bVar = fVar.f7121o;
        if (bVar.f7137h == null) {
            bVar.f7137h = new Rect();
        }
        fVar.f7121o.f7137h.set(0, i10, 0, i10);
        fVar.invalidateSelf();
        return fVar;
    }

    public final void f(boolean z) {
        if (this.f3636j != z) {
            this.f3636j = z;
            this.f3641p.cancel();
            this.f3640o.start();
        }
    }
}
