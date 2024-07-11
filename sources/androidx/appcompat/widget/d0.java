package androidx.appcompat.widget;

import a0.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import i0.b0;
import i0.w;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import k0.c;
import l0.b;
import l0.g;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f528a;

    /* renamed from: b  reason: collision with root package name */
    public c1 f529b;

    /* renamed from: c  reason: collision with root package name */
    public c1 f530c;
    public c1 d;

    /* renamed from: e  reason: collision with root package name */
    public c1 f531e;

    /* renamed from: f  reason: collision with root package name */
    public c1 f532f;

    /* renamed from: g  reason: collision with root package name */
    public c1 f533g;

    /* renamed from: h  reason: collision with root package name */
    public c1 f534h;

    /* renamed from: i  reason: collision with root package name */
    public final f0 f535i;

    /* renamed from: j  reason: collision with root package name */
    public int f536j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f537k = -1;
    public Typeface l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f538m;

    public class a extends d.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f539a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f540b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f541c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f539a = i10;
            this.f540b = i11;
            this.f541c = weakReference;
        }

        public final void c(int i10) {
        }

        public final void d(Typeface typeface) {
            int i10;
            boolean z;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f539a) != -1) {
                if ((this.f540b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = Typeface.create(typeface, i10, z);
            }
            d0 d0Var = d0.this;
            if (d0Var.f538m) {
                d0Var.l = typeface;
                TextView textView = (TextView) this.f541c.get();
                if (textView != null) {
                    WeakHashMap<View, b0> weakHashMap = w.f6004a;
                    if (w.g.b(textView)) {
                        textView.post(new e0(textView, typeface, d0Var.f536j));
                    } else {
                        textView.setTypeface(typeface, d0Var.f536j);
                    }
                }
            }
        }
    }

    public d0(TextView textView) {
        this.f528a = textView;
        this.f535i = new f0(textView);
    }

    public static c1 c(Context context, k kVar, int i10) {
        ColorStateList h10;
        synchronized (kVar) {
            h10 = kVar.f620a.h(context, i10);
        }
        if (h10 == null) {
            return null;
        }
        c1 c1Var = new c1();
        c1Var.d = true;
        c1Var.f521a = h10;
        return c1Var;
    }

    public static void f(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i10;
        int i11;
        boolean z;
        int i12;
        CharSequence charSequence;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i13 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            text.getClass();
            if (i13 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i14 = editorInfo.initialSelStart;
            int i15 = editorInfo.initialSelEnd;
            if (i14 > i15) {
                i10 = i15 + 0;
            } else {
                i10 = i14 + 0;
            }
            if (i14 > i15) {
                i11 = i14 - 0;
            } else {
                i11 = i15 + 0;
            }
            int length = text.length();
            if (i10 >= 0 && i11 <= length) {
                int i16 = editorInfo.inputType & 4095;
                if (i16 == 129 || i16 == 225 || i16 == 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (length <= 2048) {
                        c.a(editorInfo, text, i10, i11);
                        return;
                    }
                    int i17 = i11 - i10;
                    if (i17 > 1024) {
                        i12 = 0;
                    } else {
                        i12 = i17;
                    }
                    int i18 = 2048 - i12;
                    int min = Math.min(text.length() - i11, i18 - Math.min(i10, (int) (((double) i18) * 0.8d)));
                    int min2 = Math.min(i10, i18 - min);
                    int i19 = i10 - min2;
                    if (Character.isLowSurrogate(text.charAt(i19))) {
                        i19++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
                        min--;
                    }
                    int i20 = min2 + i12 + min;
                    if (i12 != i17) {
                        charSequence = TextUtils.concat(new CharSequence[]{text.subSequence(i19, i19 + min2), text.subSequence(i11, min + i11)});
                    } else {
                        charSequence = text.subSequence(i19, i20 + i19);
                    }
                    int i21 = min2 + 0;
                    c.a(editorInfo, charSequence, i21, i12 + i21);
                    return;
                }
            }
            c.a(editorInfo, (CharSequence) null, 0, 0);
        }
    }

    public final void a(Drawable drawable, c1 c1Var) {
        if (drawable != null && c1Var != null) {
            k.e(drawable, c1Var, this.f528a.getDrawableState());
        }
    }

    public final void b() {
        c1 c1Var = this.f529b;
        TextView textView = this.f528a;
        if (!(c1Var == null && this.f530c == null && this.d == null && this.f531e == null)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f529b);
            a(compoundDrawables[1], this.f530c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f531e);
        }
        if (this.f532f != null || this.f533g != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f532f);
            a(compoundDrawablesRelative[2], this.f533g);
        }
    }

    @SuppressLint({"NewApi"})
    public final void d(AttributeSet attributeSet, int i10) {
        String str;
        String str2;
        boolean z;
        boolean z10;
        float f10;
        float f11;
        float f12;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        Paint.FontMetricsInt fontMetricsInt;
        int i11;
        int i12;
        int resourceId;
        int i13;
        AttributeSet attributeSet2 = attributeSet;
        int i14 = i10;
        TextView textView = this.f528a;
        Context context = textView.getContext();
        k a10 = k.a();
        int[] iArr = androidx.databinding.a.G;
        e1 m10 = e1.m(context, attributeSet2, iArr, i14);
        w.j(textView, textView.getContext(), iArr, attributeSet, m10.f551b, i10);
        int i15 = m10.i(0, -1);
        if (m10.l(3)) {
            this.f529b = c(context, a10, m10.i(3, 0));
        }
        if (m10.l(1)) {
            this.f530c = c(context, a10, m10.i(1, 0));
        }
        if (m10.l(4)) {
            this.d = c(context, a10, m10.i(4, 0));
        }
        if (m10.l(2)) {
            this.f531e = c(context, a10, m10.i(2, 0));
        }
        int i16 = Build.VERSION.SDK_INT;
        if (m10.l(5)) {
            this.f532f = c(context, a10, m10.i(5, 0));
        }
        if (m10.l(6)) {
            this.f533g = c(context, a10, m10.i(6, 0));
        }
        m10.n();
        boolean z11 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = androidx.databinding.a.V;
        if (i15 != -1) {
            e1 e1Var = new e1(context, context.obtainStyledAttributes(i15, iArr2));
            if (z11 || !e1Var.l(14)) {
                z10 = false;
                z = false;
            } else {
                z10 = e1Var.a(14, false);
                z = true;
            }
            j(context, e1Var);
            if (e1Var.l(15)) {
                str2 = e1Var.j(15);
                i13 = 26;
            } else {
                i13 = 26;
                str2 = null;
            }
            if (i16 < i13 || !e1Var.l(13)) {
                str = null;
            } else {
                str = e1Var.j(13);
            }
            e1Var.n();
        } else {
            z10 = false;
            z = false;
            str2 = null;
            str = null;
        }
        e1 e1Var2 = new e1(context, context.obtainStyledAttributes(attributeSet2, iArr2, i14, 0));
        if (!z11 && e1Var2.l(14)) {
            z10 = e1Var2.a(14, false);
            z = true;
        }
        if (e1Var2.l(15)) {
            str2 = e1Var2.j(15);
        }
        if (i16 >= 26) {
            if (e1Var2.l(13)) {
                str = e1Var2.j(13);
            }
        }
        String str3 = str;
        if (i16 >= 28 && e1Var2.l(0) && e1Var2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, e1Var2);
        e1Var2.n();
        if (!z11 && z) {
            textView.setAllCaps(z10);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.f537k == -1) {
                textView.setTypeface(typeface, this.f536j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            textView.setFontVariationSettings(str3);
        }
        if (str2 != null) {
            textView.setTextLocales(LocaleList.forLanguageTags(str2));
        }
        int[] iArr3 = androidx.databinding.a.H;
        f0 f0Var = this.f535i;
        Context context2 = f0Var.f565j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr3, i14, 0);
        TextView textView2 = f0Var.f564i;
        TypedArray typedArray = obtainStyledAttributes;
        Context context3 = context2;
        f0 f0Var2 = f0Var;
        w.j(textView2, textView2.getContext(), iArr3, attributeSet, typedArray, i10);
        TypedArray typedArray2 = typedArray;
        if (typedArray2.hasValue(5)) {
            f0Var2.f557a = typedArray2.getInt(5, 0);
        }
        if (typedArray2.hasValue(4)) {
            f10 = typedArray2.getDimension(4, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (typedArray2.hasValue(2)) {
            f11 = typedArray2.getDimension(2, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (typedArray2.hasValue(1)) {
            f12 = typedArray2.getDimension(1, -1.0f);
        } else {
            f12 = -1.0f;
        }
        if (typedArray2.hasValue(3) && (resourceId = typedArray2.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = typedArray2.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i17 = 0; i17 < length; i17++) {
                    iArr4[i17] = obtainTypedArray.getDimensionPixelSize(i17, -1);
                }
                f0Var2.f561f = f0.b(iArr4);
                f0Var2.h();
            }
            obtainTypedArray.recycle();
        }
        typedArray2.recycle();
        if (!f0Var2.i()) {
            f0Var2.f557a = 0;
        } else if (f0Var2.f557a == 1) {
            if (!f0Var2.f562g) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (f11 == -1.0f) {
                    i12 = 2;
                    f11 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i12 = 2;
                }
                if (f12 == -1.0f) {
                    f12 = TypedValue.applyDimension(i12, 112.0f, displayMetrics);
                }
                if (f10 == -1.0f) {
                    f10 = 1.0f;
                }
                f0Var2.j(f11, f12, f10);
            }
            f0Var2.g();
        }
        if (b.l && f0Var2.f557a != 0) {
            int[] iArr5 = f0Var2.f561f;
            if (iArr5.length > 0) {
                if (((float) textView.getAutoSizeStepGranularity()) != -1.0f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(f0Var2.d), Math.round(f0Var2.f560e), Math.round(f0Var2.f559c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr5, 0);
                }
            }
        }
        e1 e1Var3 = new e1(context, context.obtainStyledAttributes(attributeSet2, iArr3));
        int i18 = e1Var3.i(8, -1);
        if (i18 != -1) {
            drawable = a10.b(context, i18);
        } else {
            drawable = null;
        }
        int i19 = e1Var3.i(13, -1);
        if (i19 != -1) {
            drawable2 = a10.b(context, i19);
        } else {
            drawable2 = null;
        }
        int i20 = e1Var3.i(9, -1);
        if (i20 != -1) {
            drawable3 = a10.b(context, i20);
        } else {
            drawable3 = null;
        }
        int i21 = e1Var3.i(6, -1);
        if (i21 != -1) {
            drawable4 = a10.b(context, i21);
        } else {
            drawable4 = null;
        }
        int i22 = e1Var3.i(10, -1);
        if (i22 != -1) {
            drawable5 = a10.b(context, i22);
        } else {
            drawable5 = null;
        }
        int i23 = e1Var3.i(7, -1);
        if (i23 != -1) {
            drawable6 = a10.b(context, i23);
        } else {
            drawable6 = null;
        }
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (!(drawable == null && drawable2 == null && drawable3 == null && drawable4 == null)) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable7 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            } else {
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable8 = compoundDrawablesRelative2[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            }
        }
        if (e1Var3.l(11)) {
            textView.setCompoundDrawableTintList(e1Var3.b(11));
        }
        if (e1Var3.l(12)) {
            i11 = -1;
            fontMetricsInt = null;
            textView.setCompoundDrawableTintMode(k0.c(e1Var3.h(12, -1), (PorterDuff.Mode) null));
        } else {
            i11 = -1;
            fontMetricsInt = null;
        }
        int d10 = e1Var3.d(15, i11);
        int d11 = e1Var3.d(18, i11);
        int d12 = e1Var3.d(19, i11);
        e1Var3.n();
        if (d10 != i11) {
            g.b(textView, d10);
        }
        if (d11 != i11) {
            g.c(textView, d11);
        }
        if (d12 != i11) {
            s6.a.m(d12);
            int fontMetricsInt2 = textView.getPaint().getFontMetricsInt(fontMetricsInt);
            if (d12 != fontMetricsInt2) {
                textView.setLineSpacing((float) (d12 - fontMetricsInt2), 1.0f);
            }
        }
    }

    public final void e(Context context, int i10) {
        String j8;
        e1 e1Var = new e1(context, context.obtainStyledAttributes(i10, androidx.databinding.a.V));
        boolean l8 = e1Var.l(14);
        TextView textView = this.f528a;
        if (l8) {
            textView.setAllCaps(e1Var.a(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (e1Var.l(0) && e1Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, e1Var);
        if (i11 >= 26 && e1Var.l(13) && (j8 = e1Var.j(13)) != null) {
            textView.setFontVariationSettings(j8);
        }
        e1Var.n();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f536j);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        f0 f0Var = this.f535i;
        if (f0Var.i()) {
            DisplayMetrics displayMetrics = f0Var.f565j.getResources().getDisplayMetrics();
            f0Var.j(TypedValue.applyDimension(i13, (float) i10, displayMetrics), TypedValue.applyDimension(i13, (float) i11, displayMetrics), TypedValue.applyDimension(i13, (float) i12, displayMetrics));
            if (f0Var.g()) {
                f0Var.a();
            }
        }
    }

    public final void h(int[] iArr, int i10) {
        f0 f0Var = this.f535i;
        if (f0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = f0Var.f565j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, (float) iArr[i11], displayMetrics));
                    }
                }
                f0Var.f561f = f0.b(iArr2);
                if (!f0Var.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                f0Var.f562g = false;
            }
            if (f0Var.g()) {
                f0Var.a();
            }
        }
    }

    public final void i(int i10) {
        f0 f0Var = this.f535i;
        if (!f0Var.i()) {
            return;
        }
        if (i10 == 0) {
            f0Var.f557a = 0;
            f0Var.d = -1.0f;
            f0Var.f560e = -1.0f;
            f0Var.f559c = -1.0f;
            f0Var.f561f = new int[0];
            f0Var.f558b = false;
        } else if (i10 == 1) {
            DisplayMetrics displayMetrics = f0Var.f565j.getResources().getDisplayMetrics();
            f0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (f0Var.g()) {
                f0Var.a();
            }
        } else {
            throw new IllegalArgumentException(b0.d.c("Unknown auto-size text type: ", i10));
        }
    }

    public final void j(Context context, e1 e1Var) {
        String j8;
        Typeface typeface;
        Typeface typeface2;
        this.f536j = e1Var.h(2, this.f536j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i10 >= 28) {
            int h10 = e1Var.h(11, -1);
            this.f537k = h10;
            if (h10 != -1) {
                this.f536j = (this.f536j & 2) | 0;
            }
        }
        int i11 = 10;
        if (e1Var.l(10) || e1Var.l(12)) {
            this.l = null;
            if (e1Var.l(12)) {
                i11 = 12;
            }
            int i12 = this.f537k;
            int i13 = this.f536j;
            if (!context.isRestricted()) {
                try {
                    Typeface g10 = e1Var.g(i11, this.f536j, new a(i12, i13, new WeakReference(this.f528a)));
                    if (g10 != null) {
                        if (i10 >= 28 && this.f537k != -1) {
                            g10 = Typeface.create(Typeface.create(g10, 0), this.f537k, (this.f536j & 2) != 0);
                        }
                        this.l = g10;
                    }
                    this.f538m = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (j8 = e1Var.j(i11)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f537k == -1) {
                    typeface = Typeface.create(j8, this.f536j);
                } else {
                    Typeface create = Typeface.create(j8, 0);
                    int i14 = this.f537k;
                    if ((this.f536j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i14, z);
                }
                this.l = typeface;
            }
        } else if (e1Var.l(1)) {
            this.f538m = false;
            int h11 = e1Var.h(1, 1);
            if (h11 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (h11 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (h11 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.l = typeface2;
        }
    }
}
