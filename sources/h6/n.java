package h6;

import android.graphics.PorterDuff;
import android.view.View;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;

public final class n {

    public interface a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5909a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5910b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5911c;

        public b(int i10, int i11, int i12, int i13) {
            this.f5909a = i10;
            this.f5910b = i12;
            this.f5911c = i13;
        }
    }

    public static boolean a(View view) {
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.e.d(view) == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode b(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
