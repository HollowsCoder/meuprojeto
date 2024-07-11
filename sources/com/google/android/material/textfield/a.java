package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.karumi.dexter.R;
import java.util.LinkedHashSet;
import p6.k;

public final class a extends k {
    public final C0037a d = new C0037a();

    /* renamed from: e  reason: collision with root package name */
    public final b f3619e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final c f3620f = new c();

    /* renamed from: g  reason: collision with root package name */
    public final d f3621g = new d();

    /* renamed from: h  reason: collision with root package name */
    public AnimatorSet f3622h;

    /* renamed from: i  reason: collision with root package name */
    public ValueAnimator f3623i;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    public class C0037a implements TextWatcher {
        public C0037a() {
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            a aVar = a.this;
            if (aVar.f7937a.getSuffixText() == null) {
                boolean z10 = false;
                if (aVar.f7937a.hasFocus()) {
                    if (editable.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        z10 = true;
                    }
                }
                aVar.d(z10);
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        public final void onFocusChange(View view, boolean z) {
            boolean z10 = true;
            if (!(!TextUtils.isEmpty(((EditText) view).getText())) || !z) {
                z10 = false;
            }
            a.this.d(z10);
        }
    }

    public class c implements TextInputLayout.f {
        public c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r1 != false) goto L_0x001d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.google.android.material.textfield.TextInputLayout r5) {
            /*
                r4 = this;
                android.widget.EditText r0 = r5.getEditText()
                boolean r1 = r0.hasFocus()
                r2 = 0
                if (r1 == 0) goto L_0x001c
                android.text.Editable r1 = r0.getText()
                int r1 = r1.length()
                r3 = 1
                if (r1 <= 0) goto L_0x0018
                r1 = r3
                goto L_0x0019
            L_0x0018:
                r1 = r2
            L_0x0019:
                if (r1 == 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r3 = r2
            L_0x001d:
                r5.setEndIconVisible(r3)
                r5.setEndIconCheckable(r2)
                com.google.android.material.textfield.a r5 = com.google.android.material.textfield.a.this
                com.google.android.material.textfield.a$b r1 = r5.f3619e
                r0.setOnFocusChangeListener(r1)
                com.google.android.material.textfield.a$a r5 = r5.d
                r0.removeTextChangedListener(r5)
                r0.addTextChangedListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.a.c.a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    public class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a  reason: collision with other inner class name */
        public class C0038a implements Runnable {

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ EditText f3628o;

            public C0038a(EditText editText) {
                this.f3628o = editText;
            }

            public final void run() {
                this.f3628o.removeTextChangedListener(a.this.d);
            }
        }

        public d() {
        }

        public final void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i10 == 2) {
                editText.post(new C0038a(editText));
                if (editText.getOnFocusChangeListener() == a.this.f3619e) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        public final void onClick(View view) {
            a aVar = a.this;
            Editable text = aVar.f7937a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            TextInputLayout textInputLayout = aVar.f7937a;
            textInputLayout.k(textInputLayout.f3606v0, textInputLayout.x0);
        }
    }

    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public final void a() {
        Drawable b10 = f.a.b(this.f7938b, R.drawable.mtrl_ic_cancel);
        TextInputLayout textInputLayout = this.f7937a;
        textInputLayout.setEndIconDrawable(b10);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        textInputLayout.setEndIconOnClickListener(new e());
        LinkedHashSet<TextInputLayout.f> linkedHashSet = textInputLayout.f3602s0;
        c cVar = this.f3620f;
        linkedHashSet.add(cVar);
        if (textInputLayout.f3601s != null) {
            cVar.a(textInputLayout);
        }
        textInputLayout.f3607w0.add(this.f3621g);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(s5.a.d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new p6.d(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        LinearInterpolator linearInterpolator = s5.a.f8784a;
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(100);
        ofFloat2.addUpdateListener(new p6.c(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3622h = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f3622h.addListener(new p6.a(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(linearInterpolator);
        ofFloat3.setDuration(100);
        ofFloat3.addUpdateListener(new p6.c(this));
        this.f3623i = ofFloat3;
        ofFloat3.addListener(new p6.b(this));
    }

    public final void c(boolean z) {
        if (this.f7937a.getSuffixText() != null) {
            d(z);
        }
    }

    public final void d(boolean z) {
        boolean z10 = this.f7937a.g() == z;
        if (z && !this.f3622h.isRunning()) {
            this.f3623i.cancel();
            this.f3622h.start();
            if (z10) {
                this.f3622h.end();
            }
        } else if (!z) {
            this.f3622h.cancel();
            this.f3623i.start();
            if (z10) {
                this.f3623i.end();
            }
        }
    }
}
