package c1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

public class x extends w {
    public static boolean D0 = true;

    @SuppressLint({"NewApi"})
    public void r(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.r(view, i10);
        } else if (D0) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                D0 = false;
            }
        }
    }
}
