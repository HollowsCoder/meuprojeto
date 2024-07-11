package t;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import p9.u;

public abstract class e extends b {
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8872x;

    public final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u.W);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.w = true;
                } else if (index == 22) {
                    this.f8872x = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.w || this.f8872x) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f834p; i10++) {
                    View view = constraintLayout.f770o.get(this.f833o[i10]);
                    if (view != null) {
                        if (this.w) {
                            view.setVisibility(visibility);
                        }
                        if (this.f8872x && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }
}
