package z5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import com.karumi.dexter.R;
import h6.k;
import j6.c;
import n.e;
import p9.u;

public final class a extends g {
    public static final int[][] u = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f9929s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9930t;

    public a(Context context, AttributeSet attributeSet) {
        super(q6.a.a(context, attributeSet, R.attr.checkboxStyle, 2131952281), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray d = k.d(context2, attributeSet, u.H, R.attr.checkboxStyle, 2131952281, new int[0]);
        if (d.hasValue(0)) {
            setButtonTintList(c.a(context2, d, 0));
        }
        this.f9930t = d.getBoolean(1, false);
        d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9929s == null) {
            int u10 = e.u(this, R.attr.colorControlActivated);
            int u11 = e.u(this, R.attr.colorSurface);
            int u12 = e.u(this, R.attr.colorOnSurface);
            this.f9929s = new ColorStateList(u, new int[]{e.C(1.0f, u11, u10), e.C(0.54f, u11, u12), e.C(0.38f, u11, u12), e.C(0.38f, u11, u12)});
        }
        return this.f9929s;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9930t && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.f9930t = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        setButtonTintList(colorStateList);
    }
}
