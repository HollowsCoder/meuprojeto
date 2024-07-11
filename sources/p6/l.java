package p6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import j6.c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p9.u;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7940a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f7941b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f7942c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f7943e;

    /* renamed from: f  reason: collision with root package name */
    public Animator f7944f;

    /* renamed from: g  reason: collision with root package name */
    public final float f7945g;

    /* renamed from: h  reason: collision with root package name */
    public int f7946h;

    /* renamed from: i  reason: collision with root package name */
    public int f7947i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f7948j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7949k;
    public AppCompatTextView l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f7950m;

    /* renamed from: n  reason: collision with root package name */
    public int f7951n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f7952o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f7953p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f7954q;

    /* renamed from: r  reason: collision with root package name */
    public AppCompatTextView f7955r;

    /* renamed from: s  reason: collision with root package name */
    public int f7956s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f7957t;
    public Typeface u;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7958a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f7959b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f7960c;
        public final /* synthetic */ TextView d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f7958a = i10;
            this.f7959b = textView;
            this.f7960c = i11;
            this.d = textView2;
        }

        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            int i10 = this.f7958a;
            l lVar = l.this;
            lVar.f7946h = i10;
            lVar.f7944f = null;
            TextView textView = this.f7959b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f7960c == 1 && (appCompatTextView = lVar.l) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        public final void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public l(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f7940a = context;
        this.f7941b = textInputLayout;
        this.f7945g = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void a(TextView textView, int i10) {
        if (this.f7942c == null && this.f7943e == null) {
            Context context = this.f7940a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f7942c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f7942c;
            TextInputLayout textInputLayout = this.f7941b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f7943e = new FrameLayout(context);
            this.f7942c.addView(this.f7943e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f7943e.setVisibility(0);
            this.f7943e.addView(textView);
        } else {
            this.f7942c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f7942c.setVisibility(0);
        this.d++;
    }

    public final void b() {
        boolean z;
        LinearLayout linearLayout = this.f7942c;
        TextInputLayout textInputLayout = this.f7941b;
        if (linearLayout == null || textInputLayout.getEditText() == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f7940a;
            boolean d10 = c.d(context);
            LinearLayout linearLayout2 = this.f7942c;
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            int f10 = w.e.f(editText);
            if (d10) {
                f10 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (d10) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int e10 = w.e.e(editText);
            if (d10) {
                e10 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            w.e.k(linearLayout2, f10, dimensionPixelSize, e10, 0);
        }
    }

    public final void c() {
        Animator animator = this.f7944f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z, TextView textView, int i10, int i11, int i12) {
        boolean z10;
        float f10;
        if (textView != null && z) {
            if (i10 == i12 || i10 == i11) {
                if (i12 == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f10});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(s5.a.f8784a);
                arrayList.add(ofFloat);
                if (i12 == i10) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f7945g, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(s5.a.d);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final boolean e() {
        if (this.f7947i != 1 || this.l == null || TextUtils.isEmpty(this.f7948j)) {
            return false;
        }
        return true;
    }

    public final TextView f(int i10) {
        if (i10 == 1) {
            return this.l;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f7955r;
    }

    public final int g() {
        AppCompatTextView appCompatTextView = this.l;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public final void h() {
        this.f7948j = null;
        c();
        if (this.f7946h == 1) {
            this.f7947i = (!this.f7954q || TextUtils.isEmpty(this.f7953p)) ? 0 : 2;
        }
        k(this.f7946h, this.f7947i, j(this.l, (CharSequence) null));
    }

    public final void i(TextView textView, int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f7942c;
        if (viewGroup2 != null) {
            boolean z = true;
            if (!(i10 == 0 || i10 == 1)) {
                z = false;
            }
            if (z && (viewGroup = this.f7943e) != null) {
                viewGroup2 = viewGroup;
            }
            viewGroup2.removeView(textView);
            int i11 = this.d - 1;
            this.d = i11;
            LinearLayout linearLayout = this.f7942c;
            if (i11 == 0) {
                linearLayout.setVisibility(8);
            }
        }
    }

    public final boolean j(TextView textView, CharSequence charSequence) {
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        TextInputLayout textInputLayout = this.f7941b;
        if (!w.g.c(textInputLayout) || !textInputLayout.isEnabled() || (this.f7947i == this.f7946h && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    public final void k(int i10, int i11, boolean z) {
        TextView f10;
        TextView f11;
        int i12 = i10;
        int i13 = i11;
        boolean z10 = z;
        if (i12 != i13) {
            if (z10) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f7944f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i14 = i10;
                int i15 = i11;
                d(arrayList2, this.f7954q, this.f7955r, 2, i14, i15);
                d(arrayList2, this.f7949k, this.l, 1, i14, i15);
                u.o(animatorSet, arrayList);
                animatorSet.addListener(new a(i11, f(i10), i10, f(i13)));
                animatorSet.start();
            } else if (i12 != i13) {
                if (!(i13 == 0 || (f11 = f(i13)) == null)) {
                    f11.setVisibility(0);
                    f11.setAlpha(1.0f);
                }
                if (!(i12 == 0 || (f10 = f(i10)) == null)) {
                    f10.setVisibility(4);
                    if (i12 == 1) {
                        f10.setText((CharSequence) null);
                    }
                }
                this.f7946h = i13;
            }
            TextInputLayout textInputLayout = this.f7941b;
            textInputLayout.q();
            textInputLayout.s(z10, false);
            textInputLayout.z();
        }
    }
}
