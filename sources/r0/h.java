package r0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.e;

public final class h implements TransformationMethod {

    /* renamed from: o  reason: collision with root package name */
    public final TransformationMethod f8354o;

    public h(TransformationMethod transformationMethod) {
        this.f8354o = transformationMethod;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f8354o;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || e.a().b() != 1) {
            return charSequence;
        }
        e a10 = e.a();
        a10.getClass();
        return a10.f(0, charSequence.length(), charSequence);
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f8354o;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i10, rect);
        }
    }
}
