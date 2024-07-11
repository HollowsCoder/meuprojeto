package com.google.android.material.textfield;

import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.karumi.dexter.R;
import h6.j;
import java.util.LinkedHashSet;
import p6.k;

public final class c extends k {
    public final a d = new a();

    /* renamed from: e  reason: collision with root package name */
    public final b f3652e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final C0041c f3653f = new C0041c();

    public class a extends j {
        public a() {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            c cVar = c.this;
            cVar.f7939c.setChecked(!c.d(cVar));
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        public final void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            c cVar = c.this;
            cVar.f7939c.setChecked(true ^ c.d(cVar));
            a aVar = cVar.d;
            editText.removeTextChangedListener(aVar);
            editText.addTextChangedListener(aVar);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c  reason: collision with other inner class name */
    public class C0041c implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        public class a implements Runnable {

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ EditText f3657o;

            public a(EditText editText) {
                this.f3657o = editText;
            }

            public final void run() {
                this.f3657o.removeTextChangedListener(c.this.d);
            }
        }

        public C0041c() {
        }

        public final void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i10 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new a(editText));
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        public final void onClick(View view) {
            PasswordTransformationMethod passwordTransformationMethod;
            c cVar = c.this;
            EditText editText = cVar.f7937a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (c.d(cVar)) {
                    passwordTransformationMethod = null;
                } else {
                    passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                }
                editText.setTransformationMethod(passwordTransformationMethod);
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                TextInputLayout textInputLayout = cVar.f7937a;
                textInputLayout.k(textInputLayout.f3606v0, textInputLayout.x0);
            }
        }
    }

    public c(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public static boolean d(c cVar) {
        EditText editText = cVar.f7937a.getEditText();
        if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return false;
        }
        return true;
    }

    public final void a() {
        boolean z;
        Drawable b10 = f.a.b(this.f7938b, R.drawable.design_password_eye);
        TextInputLayout textInputLayout = this.f7937a;
        textInputLayout.setEndIconDrawable(b10);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        textInputLayout.setEndIconOnClickListener(new d());
        LinkedHashSet<TextInputLayout.f> linkedHashSet = textInputLayout.f3602s0;
        b bVar = this.f3652e;
        linkedHashSet.add(bVar);
        if (textInputLayout.f3601s != null) {
            bVar.a(textInputLayout);
        }
        textInputLayout.f3607w0.add(this.f3653f);
        EditText editText = textInputLayout.getEditText();
        if (editText == null || !(editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
