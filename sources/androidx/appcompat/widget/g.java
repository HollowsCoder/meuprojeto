package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.karumi.dexter.R;
import f.a;

public class g extends CheckBox {

    /* renamed from: o  reason: collision with root package name */
    public final j f569o;

    /* renamed from: p  reason: collision with root package name */
    public final e f570p;

    /* renamed from: q  reason: collision with root package name */
    public final d0 f571q;

    /* renamed from: r  reason: collision with root package name */
    public n f572r;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b1.a(context);
        z0.a(this, getContext());
        j jVar = new j(this);
        this.f569o = jVar;
        jVar.b(attributeSet, i10);
        e eVar = new e(this);
        this.f570p = eVar;
        eVar.d(attributeSet, i10);
        d0 d0Var = new d0(this);
        this.f571q = d0Var;
        d0Var.d(attributeSet, i10);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    private n getEmojiTextViewHelper() {
        if (this.f572r == null) {
            this.f572r = new n(this);
        }
        return this.f572r;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f570p;
        if (eVar != null) {
            eVar.a();
        }
        d0 d0Var = this.f571q;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        j jVar = this.f569o;
        if (jVar != null) {
            jVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f570p;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f570p;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        j jVar = this.f569o;
        if (jVar != null) {
            return jVar.f603b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j jVar = this.f569o;
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
        e eVar = this.f570p;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f570p;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setButtonDrawable(int i10) {
        setButtonDrawable(a.b(getContext(), i10));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j jVar = this.f569o;
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
        e eVar = this.f570p;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f570p;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j jVar = this.f569o;
        if (jVar != null) {
            jVar.f603b = colorStateList;
            jVar.d = true;
            jVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j jVar = this.f569o;
        if (jVar != null) {
            jVar.f604c = mode;
            jVar.f605e = true;
            jVar.a();
        }
    }
}
