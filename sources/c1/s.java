package c1;

import android.os.Build;
import android.view.ViewGroup;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f2130a = true;

    public static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f2130a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f2130a = false;
            }
        }
    }
}
