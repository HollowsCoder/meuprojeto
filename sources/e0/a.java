package e0;

import android.os.Build;

public final class a {
    public static boolean a() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        String str = Build.VERSION.CODENAME;
        if (!"REL".equals(str) && str.compareTo("S") >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }
}
