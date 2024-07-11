package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public final class h0 extends ToggleButton {

    /* renamed from: o  reason: collision with root package name */
    public final e f579o;

    /* renamed from: p  reason: collision with root package name */
    public final d0 f580p;

    /* renamed from: q  reason: collision with root package name */
    public n f581q;

    public h0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        z0.a(this, getContext());
        e eVar = new e(this);
        this.f579o = eVar;
        eVar.d(attributeSet, 16842827);
        d0 d0Var = new d0(this);
        this.f580p = d0Var;
        d0Var.d(attributeSet, 16842827);
        getEmojiTextViewHelper().a(attributeSet, 16842827);
    }

    private n getEmojiTextViewHelper() {
        if (this.f581q == null) {
            this.f581q = new n(this);
        }
        return this.f581q;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f579o;
        if (eVar != null) {
            eVar.a();
        }
        d0 d0Var = this.f580p;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f579o;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f579o;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f579o;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f579o;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f656b.f8344a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f579o;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f579o;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}
