package s;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import p9.u;
import s.d;

public final class c extends b implements d.C0123d {
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8495x;

    /* renamed from: y  reason: collision with root package name */
    public float f8496y;
    public View[] z;

    public final void a() {
    }

    public final void b() {
    }

    public float getProgress() {
        return this.f8496y;
    }

    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u.f8104c0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.w = obtainStyledAttributes.getBoolean(index, this.w);
                } else if (index == 0) {
                    this.f8495x = obtainStyledAttributes.getBoolean(index, this.f8495x);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f8496y = f10;
        int i10 = 0;
        if (this.f834p > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.u;
            if (viewArr == null || viewArr.length != this.f834p) {
                this.u = new View[this.f834p];
            }
            for (int i11 = 0; i11 < this.f834p; i11++) {
                this.u[i11] = constraintLayout.f770o.get(this.f833o[i11]);
            }
            this.z = this.u;
            while (i10 < this.f834p) {
                View view = this.z[i10];
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            boolean z10 = viewGroup.getChildAt(i10) instanceof c;
            i10++;
        }
    }
}
