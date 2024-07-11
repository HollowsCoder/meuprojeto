package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.karumi.dexter.R;
import h6.k;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;
import m6.f;
import n.e;
import p9.u;
import q6.a;

public class MaterialToolbar extends Toolbar {

    /* renamed from: f0  reason: collision with root package name */
    public Integer f3225f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f3226g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f3227h0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        int i10 = 0;
        Context context2 = getContext();
        TypedArray d = k.d(context2, attributeSet, u.M, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (d.hasValue(0)) {
            setNavigationIconTint(d.getColor(0, -1));
        }
        this.f3226g0 = d.getBoolean(2, false);
        this.f3227h0 = d.getBoolean(1, false);
        d.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            f fVar = new f();
            fVar.j(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i10));
            fVar.h(context2);
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            fVar.i(w.i.i(this));
            w.d.q(this, fVar);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof f) {
            e.E(this, (f) background);
        }
    }

    public final void onLayout(boolean z, int i10, int i11, int i12, int i13) {
        super.onLayout(z, i10, i11, i12, i13);
        if (this.f3226g0 || this.f3227h0) {
            TextView y10 = e.y(this, getTitle());
            TextView y11 = e.y(this, getSubtitle());
            if (y10 != null || y11 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (!(childAt.getVisibility() == 8 || childAt == y10 || childAt == y11)) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f3226g0 && y10 != null) {
                    s(y10, pair);
                }
                if (this.f3227h0 && y11 != null) {
                    s(y11, pair);
                }
            }
        }
    }

    public final void s(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof f) {
            ((f) background).i(f10);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        Integer num;
        if (!(drawable == null || (num = this.f3225f0) == null)) {
            drawable.setTint(num.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f3225f0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f3227h0 != z) {
            this.f3227h0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f3226g0 != z) {
            this.f3226g0 = z;
            requestLayout();
        }
    }
}
