package h6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class o extends ImageButton {

    /* renamed from: o  reason: collision with root package name */
    public int f5912o;

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public o(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5912o = getVisibility();
    }

    public final void b(int i10, boolean z) {
        super.setVisibility(i10);
        if (z) {
            this.f5912o = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f5912o;
    }

    public void setVisibility(int i10) {
        b(i10, true);
    }
}
