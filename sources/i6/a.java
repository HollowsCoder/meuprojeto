package i6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.t;
import com.karumi.dexter.R;
import h6.k;
import j6.c;
import n.e;
import p9.u;

public final class a extends t {
    public static final int[][] u = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f6120s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6121t;

    public a(Context context, AttributeSet attributeSet) {
        super(q6.a.a(context, attributeSet, R.attr.radioButtonStyle, 2131952282), attributeSet);
        Context context2 = getContext();
        TypedArray d = k.d(context2, attributeSet, u.I, R.attr.radioButtonStyle, 2131952282, new int[0]);
        if (d.hasValue(0)) {
            setButtonTintList(c.a(context2, d, 0));
        }
        this.f6121t = d.getBoolean(1, false);
        d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f6120s == null) {
            int u10 = e.u(this, R.attr.colorControlActivated);
            int u11 = e.u(this, R.attr.colorOnSurface);
            int u12 = e.u(this, R.attr.colorSurface);
            this.f6120s = new ColorStateList(u, new int[]{e.C(1.0f, u12, u10), e.C(0.54f, u12, u11), e.C(0.38f, u12, u11), e.C(0.38f, u12, u11)});
        }
        return this.f6120s;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6121t && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.f6121t = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        setButtonTintList(colorStateList);
    }
}
