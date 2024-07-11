package k6;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f6709a = {16842910, 16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final String f6710b = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f6709a, 0)) != 0) {
            Log.w(f6710b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z = false;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z10 = true;
            }
        }
        return z && z10;
    }
}
