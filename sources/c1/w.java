package c1;

import android.annotation.SuppressLint;
import android.view.View;

public class w extends v {
    public static boolean C0 = true;

    @SuppressLint({"NewApi"})
    public void X(View view, int i10, int i11, int i12, int i13) {
        if (C0) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                C0 = false;
            }
        }
    }
}
