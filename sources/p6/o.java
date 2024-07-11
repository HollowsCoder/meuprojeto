package p6;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

public final class o extends k {
    public o(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public final void a() {
        TextInputLayout textInputLayout = this.f7937a;
        textInputLayout.setEndIconOnClickListener((View.OnClickListener) null);
        textInputLayout.setEndIconDrawable((Drawable) null);
        textInputLayout.setEndIconContentDescription((CharSequence) null);
    }
}
