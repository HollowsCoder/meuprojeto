package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.karumi.dexter.R;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f3552t = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* renamed from: r  reason: collision with root package name */
    public final AccessibilityManager f3553r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3554s;

    public static final class SnackbarLayout extends BaseTransientBottomBar.h {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public static class a extends BaseTransientBottomBar.d<Snackbar> {
    }

    public Snackbar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f3553r = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public final void a() {
        b(3);
    }

    public final int g() {
        int i10;
        int i11 = this.f3532e;
        if (i11 == -2) {
            return -2;
        }
        int i12 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.f3553r;
        if (i12 >= 29) {
            if (this.f3554s) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            return accessibilityManager.getRecommendedTimeoutMillis(i11, i10 | 1 | 2);
        } else if (!this.f3554s || !accessibilityManager.isTouchExplorationEnabled()) {
            return i11;
        } else {
            return -2;
        }
    }
}
