package p6;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f7937a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f7938b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckableImageButton f7939c;

    public k(TextInputLayout textInputLayout) {
        this.f7937a = textInputLayout;
        this.f7938b = textInputLayout.getContext();
        this.f7939c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean b(int i10) {
        return true;
    }

    public void c(boolean z) {
    }
}
