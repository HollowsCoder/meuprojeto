package c1;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.databinding.a;

public class u extends a {

    /* renamed from: z0  reason: collision with root package name */
    public static boolean f2133z0 = true;

    @SuppressLint({"NewApi"})
    public float T(View view) {
        if (f2133z0) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f2133z0 = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void U(View view, float f10) {
        if (f2133z0) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f2133z0 = false;
            }
        }
        view.setAlpha(f10);
    }
}
