package c1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

public class v extends u {
    public static boolean A0 = true;
    public static boolean B0 = true;

    @SuppressLint({"NewApi"})
    public void V(View view, Matrix matrix) {
        if (A0) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                A0 = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void W(View view, Matrix matrix) {
        if (B0) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                B0 = false;
            }
        }
    }
}
