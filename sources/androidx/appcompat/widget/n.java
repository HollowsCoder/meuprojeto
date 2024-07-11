package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.databinding.a;
import r0.f;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f655a;

    /* renamed from: b  reason: collision with root package name */
    public final f f656b;

    public n(TextView textView) {
        this.f655a = textView;
        this.f656b = new f(textView);
    }

    /* JADX INFO: finally extract failed */
    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f655a.getContext().obtainStyledAttributes(attributeSet, a.H, i10, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            c(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z) {
        this.f656b.f8344a.b(z);
    }

    public final void c(boolean z) {
        this.f656b.f8344a.c(z);
    }
}
