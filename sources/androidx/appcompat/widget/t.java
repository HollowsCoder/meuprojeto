package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.karumi.dexter.R;
import f.a;

public class t extends RadioButton {

    /* renamed from: o  reason: collision with root package name */
    public final j f703o;

    /* renamed from: p  reason: collision with root package name */
    public final e f704p;

    /* renamed from: q  reason: collision with root package name */
    public final d0 f705q;

    /* renamed from: r  reason: collision with root package name */
    public n f706r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        b1.a(context);
        z0.a(this, getContext());
        j jVar = new j(this);
        this.f703o = jVar;
        jVar.b(attributeSet, R.attr.radioButtonStyle);
        e eVar = new e(this);
        this.f704p = eVar;
        eVar.d(attributeSet, R.attr.radioButtonStyle);
        d0 d0Var = new d0(this);
        this.f705q = d0Var;
        d0Var.d(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private n getEmojiTextViewHelper() {
        if (this.f706r == null) {
            this.f706r = new n(this);
        }
        return this.f706r;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f704p;
        if (eVar != null) {
            eVar.a();
        }
        d0 d0Var = this.f705q;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        j jVar = this.f703o;
        if (jVar != null) {
            jVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f704p;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f704p;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        j jVar = this.f703o;
        if (jVar != null) {
            return jVar.f603b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j jVar = this.f703o;
        if (jVar != null) {
            return jVar.f604c;
        }
        return null;
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f704p;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f704p;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setButtonDrawable(int i10) {
        setButtonDrawable(a.b(getContext(), i10));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j jVar = this.f703o;
        if (jVar == null) {
            return;
        }
        if (jVar.f606f) {
            jVar.f606f = false;
            return;
        }
        jVar.f606f = true;
        jVar.a();
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f656b.f8344a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f704p;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f704p;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j jVar = this.f703o;
        if (jVar != null) {
            jVar.f603b = colorStateList;
            jVar.d = true;
            jVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j jVar = this.f703o;
        if (jVar != null) {
            jVar.f604c = mode;
            jVar.f605e = true;
            jVar.a();
        }
    }
}
