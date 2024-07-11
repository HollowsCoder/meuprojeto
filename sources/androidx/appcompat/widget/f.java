package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.karumi.dexter.R;
import l0.b;
import l0.g;

public class f extends Button implements b {

    /* renamed from: o  reason: collision with root package name */
    public final e f553o;

    /* renamed from: p  reason: collision with root package name */
    public final d0 f554p;

    /* renamed from: q  reason: collision with root package name */
    public n f555q;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b1.a(context);
        z0.a(this, getContext());
        e eVar = new e(this);
        this.f553o = eVar;
        eVar.d(attributeSet, i10);
        d0 d0Var = new d0(this);
        this.f554p = d0Var;
        d0Var.d(attributeSet, i10);
        d0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    private n getEmojiTextViewHelper() {
        if (this.f555q == null) {
            this.f555q = new n(this);
        }
        return this.f555q;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f553o;
        if (eVar != null) {
            eVar.a();
        }
        d0 d0Var = this.f554p;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.l) {
            return super.getAutoSizeMaxTextSize();
        }
        d0 d0Var = this.f554p;
        if (d0Var != null) {
            return Math.round(d0Var.f535i.f560e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.l) {
            return super.getAutoSizeMinTextSize();
        }
        d0 d0Var = this.f554p;
        if (d0Var != null) {
            return Math.round(d0Var.f535i.d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.l) {
            return super.getAutoSizeStepGranularity();
        }
        d0 d0Var = this.f554p;
        if (d0Var != null) {
            return Math.round(d0Var.f535i.f559c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.l) {
            return super.getAutoSizeTextAvailableSizes();
        }
        d0 d0Var = this.f554p;
        if (d0Var != null) {
            return d0Var.f535i.f561f;
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.l) {
            d0 d0Var = this.f554p;
            if (d0Var != null) {
                return d0Var.f535i.f557a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f553o;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f553o;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        c1 c1Var = this.f554p.f534h;
        if (c1Var != null) {
            return c1Var.f521a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        c1 c1Var = this.f554p.f534h;
        if (c1Var != null) {
            return c1Var.f522b;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i10, int i11, int i12, int i13) {
        super.onLayout(z, i10, i11, i12, i13);
        d0 d0Var = this.f554p;
        if (d0Var != null && !b.l) {
            d0Var.f535i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z;
        super.onTextChanged(charSequence, i10, i11, i12);
        d0 d0Var = this.f554p;
        if (d0Var != null && !b.l) {
            f0 f0Var = d0Var.f535i;
            if (!f0Var.i() || f0Var.f557a == 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                f0Var.a();
            }
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (b.l) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        d0 d0Var = this.f554p;
        if (d0Var != null) {
            d0Var.g(i10, i11, i12, i13);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (b.l) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        d0 d0Var = this.f554p;
        if (d0Var != null) {
            d0Var.h(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (b.l) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        d0 d0Var = this.f554p;
        if (d0Var != null) {
            d0Var.i(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f553o;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f553o;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f656b.f8344a.a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        d0 d0Var = this.f554p;
        if (d0Var != null) {
            d0Var.f528a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f553o;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f553o;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        boolean z;
        d0 d0Var = this.f554p;
        if (d0Var.f534h == null) {
            d0Var.f534h = new c1();
        }
        c1 c1Var = d0Var.f534h;
        c1Var.f521a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        c1Var.d = z;
        d0Var.f529b = c1Var;
        d0Var.f530c = c1Var;
        d0Var.d = c1Var;
        d0Var.f531e = c1Var;
        d0Var.f532f = c1Var;
        d0Var.f533g = c1Var;
        d0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        boolean z;
        d0 d0Var = this.f554p;
        if (d0Var.f534h == null) {
            d0Var.f534h = new c1();
        }
        c1 c1Var = d0Var.f534h;
        c1Var.f522b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        c1Var.f523c = z;
        d0Var.f529b = c1Var;
        d0Var.f530c = c1Var;
        d0Var.d = c1Var;
        d0Var.f531e = c1Var;
        d0Var.f532f = c1Var;
        d0Var.f533g = c1Var;
        d0Var.b();
    }

    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d0 d0Var = this.f554p;
        if (d0Var != null) {
            d0Var.e(context, i10);
        }
    }

    public final void setTextSize(int i10, float f10) {
        boolean z;
        boolean z10 = b.l;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        d0 d0Var = this.f554p;
        if (d0Var != null && !z10) {
            f0 f0Var = d0Var.f535i;
            if (!f0Var.i() || f0Var.f557a == 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                f0Var.f(i10, f10);
            }
        }
    }
}
