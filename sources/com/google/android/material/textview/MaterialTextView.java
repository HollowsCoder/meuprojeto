package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import com.karumi.dexter.R;
import j6.b;
import p9.u;
import q6.a;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        boolean z;
        Context context2 = getContext();
        TypedValue a10 = b.a(context2, R.attr.textAppearanceLineHeightEnabled);
        boolean z10 = true;
        if (a10 != null && a10.type == 18 && a10.data == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = u.L;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int e10 = e(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(e10 == -1 ? false : z10)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    d(resourceId, theme);
                }
            }
        }
    }

    public static int e(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            int i12 = iArr[i11];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i12, typedValue) || typedValue.type != 2) {
                i10 = typedArray.getDimensionPixelSize(i12, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i10 = dimensionPixelSize;
            }
        }
        return i10;
    }

    public final void d(int i10, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, u.K);
        int e10 = e(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (e10 >= 0) {
            setLineHeight(e10);
        }
    }

    public final void setTextAppearance(Context context, int i10) {
        boolean z;
        super.setTextAppearance(context, i10);
        TypedValue a10 = b.a(context, R.attr.textAppearanceLineHeightEnabled);
        if (a10 != null && a10.type == 18 && a10.data == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            d(i10, context.getTheme());
        }
    }
}
