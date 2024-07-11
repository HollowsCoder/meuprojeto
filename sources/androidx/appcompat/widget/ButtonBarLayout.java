package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.a;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: o  reason: collision with root package name */
    public boolean f419o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f420p;

    /* renamed from: q  reason: collision with root package name */
    public int f421q = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = a.J;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        w.j(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f419o = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f419o);
        }
    }

    private void setStacked(boolean z) {
        if (this.f420p == z) {
            return;
        }
        if (!z || this.f419o) {
            this.f420p = z;
            setOrientation(z ? 1 : 0);
            setGravity(z ? 8388613 : 80);
            View findViewById = findViewById(R.id.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        boolean z;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int i15 = 0;
        if (this.f419o) {
            if (size > this.f421q && this.f420p) {
                setStacked(false);
            }
            this.f421q = size;
        }
        if (this.f420p || View.MeasureSpec.getMode(i10) != 1073741824) {
            i12 = i10;
            z = false;
        } else {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i12, i11);
        if (this.f419o && !this.f420p) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i16 = 0;
        while (true) {
            i13 = -1;
            if (i16 >= childCount) {
                i16 = -1;
                break;
            } else if (getChildAt(i16).getVisibility() == 0) {
                break;
            } else {
                i16++;
            }
        }
        if (i16 >= 0) {
            View childAt = getChildAt(i16);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i15 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f420p) {
                int i17 = i16 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i17 >= childCount2) {
                        break;
                    } else if (getChildAt(i17).getVisibility() == 0) {
                        i13 = i17;
                        break;
                    } else {
                        i17++;
                    }
                }
                if (i13 >= 0) {
                    i14 = getChildAt(i13).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                i14 = getPaddingBottom();
            }
            i15 += i14;
        }
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.d.d(this) != i15) {
            setMinimumHeight(i15);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f419o != z) {
            this.f419o = z;
            if (!z && this.f420p) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
