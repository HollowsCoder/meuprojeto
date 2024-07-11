package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import b0.e;
import b0.l;
import g0.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import l0.b;
import l0.g;
import s6.a;

public class AppCompatTextView extends TextView implements b {

    /* renamed from: o  reason: collision with root package name */
    public final e f413o;

    /* renamed from: p  reason: collision with root package name */
    public final d0 f414p;

    /* renamed from: q  reason: collision with root package name */
    public final m f415q;

    /* renamed from: r  reason: collision with root package name */
    public n f416r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f417s;

    /* renamed from: t  reason: collision with root package name */
    public Future<g0.b> f418t;

    public AppCompatTextView() {
        throw null;
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b1.a(context);
        this.f417s = false;
        z0.a(this, getContext());
        e eVar = new e(this);
        this.f413o = eVar;
        eVar.d(attributeSet, i10);
        d0 d0Var = new d0(this);
        this.f414p = d0Var;
        d0Var.d(attributeSet, i10);
        d0Var.b();
        this.f415q = new m((TextView) this);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    private n getEmojiTextViewHelper() {
        if (this.f416r == null) {
            this.f416r = new n(this);
        }
        return this.f416r;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f413o;
        if (eVar != null) {
            eVar.a();
        }
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.l) {
            return super.getAutoSizeMaxTextSize();
        }
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            return Math.round(d0Var.f535i.f560e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.l) {
            return super.getAutoSizeMinTextSize();
        }
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            return Math.round(d0Var.f535i.d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.l) {
            return super.getAutoSizeStepGranularity();
        }
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            return Math.round(d0Var.f535i.f559c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.l) {
            return super.getAutoSizeTextAvailableSizes();
        }
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            return d0Var.f535i.f561f;
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.l) {
            d0 d0Var = this.f414p;
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

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f413o;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f413o;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        c1 c1Var = this.f414p.f534h;
        if (c1Var != null) {
            return c1Var.f521a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        c1 c1Var = this.f414p.f534h;
        if (c1Var != null) {
            return c1Var.f522b;
        }
        return null;
    }

    public CharSequence getText() {
        Future<g0.b> future = this.f418t;
        if (future != null) {
            try {
                this.f418t = null;
                g0.b bVar = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    bVar.getClass();
                    setText((CharSequence) null);
                } else {
                    b.a a10 = g.a(this);
                    bVar.getClass();
                    a10.a((b.a) null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f415q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.m r0 = r2.f415q
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.f()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public b.a getTextMetricsParamsCompat() {
        return g.a(this);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f414p.getClass();
        d0.f(this, onCreateInputConnection, editorInfo);
        a.B(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public final void onLayout(boolean z, int i10, int i11, int i12, int i13) {
        super.onLayout(z, i10, i11, i12, i13);
        d0 d0Var = this.f414p;
        if (d0Var != null && !l0.b.l) {
            d0Var.f535i.a();
        }
    }

    public void onMeasure(int i10, int i11) {
        Future<g0.b> future = this.f418t;
        if (future != null) {
            try {
                this.f418t = null;
                g0.b bVar = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    bVar.getClass();
                    setText((CharSequence) null);
                } else {
                    b.a a10 = g.a(this);
                    bVar.getClass();
                    a10.a((b.a) null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z;
        super.onTextChanged(charSequence, i10, i11, i12);
        d0 d0Var = this.f414p;
        if (d0Var != null && !l0.b.l) {
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
        if (l0.b.l) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            d0Var.g(i10, i11, i12, i13);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (l0.b.l) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            d0Var.h(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (l0.b.l) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            d0Var.i(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f413o;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f413o;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? f.a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? f.a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? f.a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = f.a.b(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b10, b11, b12, drawable);
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? f.a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? f.a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? f.a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = f.a.b(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(b10, b11, b12, drawable);
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            d0Var.b();
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

    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            g.b(this, i10);
        }
    }

    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            g.c(this, i10);
        }
    }

    public void setLineHeight(int i10) {
        a.m(i10);
        int fontMetricsInt = getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i10 != fontMetricsInt) {
            setLineSpacing((float) (i10 - fontMetricsInt), 1.0f);
        }
    }

    public void setPrecomputedText(g0.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            bVar.getClass();
            setText((CharSequence) null);
            return;
        }
        b.a a10 = g.a(this);
        bVar.getClass();
        a10.a((b.a) null);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f413o;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f413o;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        boolean z;
        d0 d0Var = this.f414p;
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
        d0 d0Var = this.f414p;
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

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            d0Var.e(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        m mVar;
        if (Build.VERSION.SDK_INT >= 28 || (mVar = this.f415q) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            mVar.f653q = textClassifier;
        }
    }

    public void setTextFuture(Future<g0.b> future) {
        this.f418t = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        int i10;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f4956b;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i10 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i10 = 7;
            }
            setTextDirection(i10);
            getPaint().set(aVar.f4955a);
            setBreakStrategy(aVar.f4957c);
            setHyphenationFrequency(aVar.d);
        }
        i10 = 1;
        setTextDirection(i10);
        getPaint().set(aVar.f4955a);
        setBreakStrategy(aVar.f4957c);
        setHyphenationFrequency(aVar.d);
    }

    public final void setTextSize(int i10, float f10) {
        boolean z;
        boolean z10 = l0.b.l;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        d0 d0Var = this.f414p;
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

    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        if (!this.f417s) {
            if (typeface == null || i10 <= 0) {
                typeface2 = null;
            } else {
                Context context = getContext();
                l lVar = e.f1935a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i10);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f417s = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i10);
            } finally {
                this.f417s = false;
            }
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.f414p;
        if (d0Var != null) {
            d0Var.b();
        }
    }
}
