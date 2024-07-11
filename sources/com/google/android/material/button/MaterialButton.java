package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import com.karumi.dexter.R;
import h6.k;
import h6.n;
import i0.b0;
import i0.w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m6.i;
import m6.m;
import n.e;
import p9.u;

public class MaterialButton extends f implements Checkable, m {
    public static final int[] E = {16842911};
    public static final int[] F = {16842912};
    public int A;
    public boolean B;
    public boolean C;
    public int D;

    /* renamed from: r  reason: collision with root package name */
    public final x5.a f3321r;

    /* renamed from: s  reason: collision with root package name */
    public final LinkedHashSet<a> f3322s = new LinkedHashSet<>();

    /* renamed from: t  reason: collision with root package name */
    public b f3323t;
    public PorterDuff.Mode u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f3324v;
    public Drawable w;

    /* renamed from: x  reason: collision with root package name */
    public int f3325x;

    /* renamed from: y  reason: collision with root package name */
    public int f3326y;
    public int z;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    public interface b {
    }

    public static class c extends n0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: q  reason: collision with root package name */
        public boolean f3327q;

        public static class a implements Parcelable.ClassLoaderCreator<c> {
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new c[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f3327q = parcel.readInt() != 1 ? false : true;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f7340o, i10);
            parcel.writeInt(this.f3327q ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(q6.a.a(context, attributeSet, R.attr.materialButtonStyle, R.style.Widget_MaterialComponents_Button), attributeSet, R.attr.materialButtonStyle);
        boolean z10 = false;
        this.B = false;
        this.C = false;
        Context context2 = getContext();
        TypedArray d = k.d(context2, attributeSet, u.D, R.attr.materialButtonStyle, R.style.Widget_MaterialComponents_Button, new int[0]);
        this.A = d.getDimensionPixelSize(12, 0);
        this.u = n.b(d.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f3324v = j6.c.a(getContext(), d, 14);
        this.w = j6.c.c(getContext(), d, 10);
        this.D = d.getInteger(11, 1);
        this.f3325x = d.getDimensionPixelSize(13, 0);
        m6.a aVar = new m6.a((float) 0);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, u.J, R.attr.materialButtonStyle, R.style.Widget_MaterialComponents_Button);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        x5.a aVar2 = new x5.a(this, new i(i.a(context2, resourceId, resourceId2, aVar)));
        this.f3321r = aVar2;
        aVar2.f9497c = d.getDimensionPixelOffset(1, 0);
        aVar2.d = d.getDimensionPixelOffset(2, 0);
        aVar2.f9498e = d.getDimensionPixelOffset(3, 0);
        aVar2.f9499f = d.getDimensionPixelOffset(4, 0);
        if (d.hasValue(8)) {
            int dimensionPixelSize = d.getDimensionPixelSize(8, -1);
            aVar2.f9500g = dimensionPixelSize;
            aVar2.c(aVar2.f9496b.d((float) dimensionPixelSize));
            aVar2.f9508p = true;
        }
        aVar2.f9501h = d.getDimensionPixelSize(20, 0);
        aVar2.f9502i = n.b(d.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar2.f9503j = j6.c.a(getContext(), d, 6);
        aVar2.f9504k = j6.c.a(getContext(), d, 19);
        aVar2.l = j6.c.a(getContext(), d, 16);
        aVar2.f9509q = d.getBoolean(5, false);
        aVar2.f9511s = d.getDimensionPixelSize(9, 0);
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        int f10 = w.e.f(this);
        int paddingTop = getPaddingTop();
        int e10 = w.e.e(this);
        int paddingBottom = getPaddingBottom();
        if (d.hasValue(0)) {
            aVar2.f9507o = true;
            setSupportBackgroundTintList(aVar2.f9503j);
            setSupportBackgroundTintMode(aVar2.f9502i);
        } else {
            aVar2.e();
        }
        w.e.k(this, f10 + aVar2.f9497c, paddingTop + aVar2.f9498e, e10 + aVar2.d, paddingBottom + aVar2.f9499f);
        d.recycle();
        setCompoundDrawablePadding(this.A);
        c(this.w != null ? true : z10);
    }

    private String getA11yClassName() {
        boolean z10;
        Class cls;
        x5.a aVar = this.f3321r;
        if (aVar == null || !aVar.f9509q) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public final boolean a() {
        x5.a aVar = this.f3321r;
        if (aVar == null || aVar.f9507o) {
            return false;
        }
        return true;
    }

    public final void b() {
        boolean z10;
        boolean z11;
        int i10 = this.D;
        boolean z12 = false;
        if (i10 == 1 || i10 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            setCompoundDrawablesRelative(this.w, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.w, (Drawable) null);
            return;
        }
        if (i10 == 16 || i10 == 32) {
            z12 = true;
        }
        if (z12) {
            setCompoundDrawablesRelative((Drawable) null, this.w, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007c, code lost:
        if (r3 != r6.w) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r7) {
        /*
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.w
            if (r0 == 0) goto L_0x0039
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r6.w = r0
            android.content.res.ColorStateList r1 = r6.f3324v
            r0.setTintList(r1)
            android.graphics.PorterDuff$Mode r0 = r6.u
            if (r0 == 0) goto L_0x0018
            android.graphics.drawable.Drawable r1 = r6.w
            r1.setTintMode(r0)
        L_0x0018:
            int r0 = r6.f3325x
            if (r0 == 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            android.graphics.drawable.Drawable r0 = r6.w
            int r0 = r0.getIntrinsicWidth()
        L_0x0023:
            int r1 = r6.f3325x
            if (r1 == 0) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            android.graphics.drawable.Drawable r1 = r6.w
            int r1 = r1.getIntrinsicHeight()
        L_0x002e:
            android.graphics.drawable.Drawable r2 = r6.w
            int r3 = r6.f3326y
            int r4 = r6.z
            int r0 = r0 + r3
            int r1 = r1 + r4
            r2.setBounds(r3, r4, r0, r1)
        L_0x0039:
            if (r7 == 0) goto L_0x003f
            r6.b()
            return
        L_0x003f:
            android.graphics.drawable.Drawable[] r7 = r6.getCompoundDrawablesRelative()
            r0 = 0
            r1 = r7[r0]
            r2 = 1
            r3 = r7[r2]
            r4 = 2
            r7 = r7[r4]
            int r5 = r6.D
            if (r5 == r2) goto L_0x0055
            if (r5 != r4) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r4 = r0
            goto L_0x0056
        L_0x0055:
            r4 = r2
        L_0x0056:
            if (r4 == 0) goto L_0x005c
            android.graphics.drawable.Drawable r4 = r6.w
            if (r1 != r4) goto L_0x007e
        L_0x005c:
            r1 = 3
            if (r5 == r1) goto L_0x0065
            r1 = 4
            if (r5 != r1) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r1 = r0
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            if (r1 == 0) goto L_0x006c
            android.graphics.drawable.Drawable r1 = r6.w
            if (r7 != r1) goto L_0x007e
        L_0x006c:
            r7 = 16
            if (r5 == r7) goto L_0x0077
            r7 = 32
            if (r5 != r7) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r7 = r0
            goto L_0x0078
        L_0x0077:
            r7 = r2
        L_0x0078:
            if (r7 == 0) goto L_0x007f
            android.graphics.drawable.Drawable r7 = r6.w
            if (r3 == r7) goto L_0x007f
        L_0x007e:
            r0 = r2
        L_0x007f:
            if (r0 == 0) goto L_0x0084
            r6.b()
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.c(boolean):void");
    }

    public final void d(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.w != null && getLayout() != null) {
            int i12 = this.D;
            boolean z13 = true;
            if (i12 == 1 || i12 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (i12 == 3 || i12 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    if (!(i12 == 16 || i12 == 32)) {
                        z13 = false;
                    }
                    if (z13) {
                        this.f3326y = 0;
                        if (i12 == 16) {
                            this.z = 0;
                            c(false);
                            return;
                        }
                        int i13 = this.f3325x;
                        if (i13 == 0) {
                            i13 = this.w.getIntrinsicHeight();
                        }
                        int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - i13) - this.A) - getPaddingBottom()) / 2;
                        if (this.z != textHeight) {
                            this.z = textHeight;
                            c(false);
                        }
                        return;
                    }
                    return;
                }
            }
            this.z = 0;
            if (i12 == 1 || i12 == 3) {
                this.f3326y = 0;
                c(false);
                return;
            }
            int i14 = this.f3325x;
            if (i14 == 0) {
                i14 = this.w.getIntrinsicWidth();
            }
            int textWidth = i10 - getTextWidth();
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            int e10 = ((((textWidth - w.e.e(this)) - i14) - this.A) - w.e.f(this)) / 2;
            if (w.e.d(this) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.D != 4) {
                z13 = false;
            }
            if (z11 != z13) {
                e10 = -e10;
            }
            if (this.f3326y != e10) {
                this.f3326y = e10;
                c(false);
            }
        }
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f3321r.f9500g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.w;
    }

    public int getIconGravity() {
        return this.D;
    }

    public int getIconPadding() {
        return this.A;
    }

    public int getIconSize() {
        return this.f3325x;
    }

    public ColorStateList getIconTint() {
        return this.f3324v;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    public int getInsetBottom() {
        return this.f3321r.f9499f;
    }

    public int getInsetTop() {
        return this.f3321r.f9498e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f3321r.l;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        if (a()) {
            return this.f3321r.f9496b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f3321r.f9504k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f3321r.f9501h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f3321r.f9503j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f3321r.f9502i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final boolean isChecked() {
        return this.B;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            e.E(this, this.f3321r.b(false));
        }
    }

    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        x5.a aVar = this.f3321r;
        if (aVar == null || !aVar.f9509q) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        x5.a aVar = this.f3321r;
        if (aVar == null || !aVar.f9509q) {
            z10 = false;
        } else {
            z10 = true;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f7340o);
        setChecked(cVar.f3327q);
    }

    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f3327q = this.B;
        return cVar;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        d(i10, i11);
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i10) {
        if (a()) {
            x5.a aVar = this.f3321r;
            if (aVar.b(false) != null) {
                aVar.b(false).setTint(i10);
                return;
            }
            return;
        }
        super.setBackgroundColor(i10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                x5.a aVar = this.f3321r;
                aVar.f9507o = true;
                ColorStateList colorStateList = aVar.f9503j;
                MaterialButton materialButton = aVar.f9495a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(aVar.f9502i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (a()) {
            this.f3321r.f9509q = z10;
        }
    }

    public void setChecked(boolean z10) {
        boolean z11;
        x5.a aVar = this.f3321r;
        if (aVar == null || !aVar.f9509q) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && isEnabled() && this.B != z10) {
            this.B = z10;
            refreshDrawableState();
            if (!this.C) {
                this.C = true;
                Iterator<a> it = this.f3322s.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.B);
                }
                this.C = false;
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (a()) {
            x5.a aVar = this.f3321r;
            if (!aVar.f9508p || aVar.f9500g != i10) {
                aVar.f9500g = i10;
                aVar.f9508p = true;
                aVar.c(aVar.f9496b.d((float) i10));
            }
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f3321r.b(false).i(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.w != drawable) {
            this.w = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.D != i10) {
            this.D = i10;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.A != i10) {
            this.A = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f3325x != i10) {
            this.f3325x = i10;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3324v != colorStateList) {
            this.f3324v = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.u != mode) {
            this.u = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(f.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        x5.a aVar = this.f3321r;
        aVar.d(aVar.f9498e, i10);
    }

    public void setInsetTop(int i10) {
        x5.a aVar = this.f3321r;
        aVar.d(i10, aVar.f9499f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f3323t = bVar;
    }

    public void setPressed(boolean z10) {
        b bVar = this.f3323t;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            x5.a aVar = this.f3321r;
            if (aVar.l != colorStateList) {
                aVar.l = colorStateList;
                MaterialButton materialButton = aVar.f9495a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(k6.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (a()) {
            setRippleColor(f.a.a(getContext(), i10));
        }
    }

    public void setShapeAppearanceModel(i iVar) {
        if (a()) {
            this.f3321r.c(iVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (a()) {
            x5.a aVar = this.f3321r;
            aVar.f9506n = z10;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            x5.a aVar = this.f3321r;
            if (aVar.f9504k != colorStateList) {
                aVar.f9504k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (a()) {
            setStrokeColor(f.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (a()) {
            x5.a aVar = this.f3321r;
            if (aVar.f9501h != i10) {
                aVar.f9501h = i10;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            x5.a aVar = this.f3321r;
            if (aVar.f9503j != colorStateList) {
                aVar.f9503j = colorStateList;
                if (aVar.b(false) != null) {
                    aVar.b(false).setTintList(aVar.f9503j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            x5.a aVar = this.f3321r;
            if (aVar.f9502i != mode) {
                aVar.f9502i = mode;
                if (aVar.b(false) != null && aVar.f9502i != null) {
                    aVar.b(false).setTintMode(aVar.f9502i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public final void toggle() {
        setChecked(!this.B);
    }
}
