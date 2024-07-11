package i5;

import android.net.Uri;

public final class b {
    static {
        new d();
    }

    public static Uri a() {
        String valueOf = String.valueOf(Uri.encode("com.google.android.gms.clearcut.public"));
        return Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
    }
}
