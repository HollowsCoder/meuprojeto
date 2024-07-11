package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import com.karumi.dexter.R;
import s6.a;

public final class q extends MultiAutoCompleteTextView {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f682r = {16843126};

    /* renamed from: o  reason: collision with root package name */
    public final e f683o;

    /* renamed from: p  reason: collision with root package name */
    public final d0 f684p;

    /* renamed from: q  reason: collision with root package name */
    public final m f685q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        b1.a(context);
        z0.a(this, getContext());
        e1 m10 = e1.m(getContext(), attributeSet, f682r, R.attr.autoCompleteTextViewStyle);
        if (m10.l(0)) {
            setDropDownBackgroundDrawable(m10.e(0));
        }
        m10.n();
        e eVar = new e(this);
        this.f683o = eVar;
        eVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        d0 d0Var = new d0(this);
        this.f684p = d0Var;
        d0Var.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        d0Var.b();
        m mVar = new m((EditText) this);
        this.f685q = mVar;
        mVar.j(attributeSet, R.attr.autoCompleteTextViewStyle);
        mVar.i();
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f683o;
        if (eVar != null) {
            eVar.a();
        }
        d0 d0Var = this.f684p;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f683o;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f683o;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.B(this, editorInfo, onCreateInputConnection);
        return this.f685q.k(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f683o;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f683o;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(f.a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f685q.m(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f685q.e(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f683o;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f683o;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d0 d0Var = this.f684p;
        if (d0Var != null) {
            d0Var.e(context, i10);
        }
    }
}
