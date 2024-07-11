package j2;

import android.os.Build;
import z8.g;

public enum c {
    CAMERA_PERMISSION("android.permission.CAMERA");
    
    private String value;

    /* access modifiers changed from: public */
    static {
        CAMERA_PERMISSION = new c("CAMERA_PERMISSION", 0, "android.permission.CAMERA");
        GALLERY_READ_PERMISSION = new c("GALLERY_READ_PERMISSION", 1, Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE");
        GALLERY_WRITE_PERMISSION = new c("GALLERY_WRITE_PERMISSION", 2, "android.permission.WRITE_EXTERNAL_STORAGE");
        $VALUES = $values();
    }

    private c(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        g.f(str, "<set-?>");
        this.value = str;
    }
}
