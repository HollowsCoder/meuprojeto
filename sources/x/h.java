package x;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

public final class h extends k {

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f9405b;

    /* renamed from: c  reason: collision with root package name */
    public IconCompat f9406c;
    public boolean d;

    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }
    }

    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    public static class c {
        public static void a(Notification.BigPictureStyle bigPictureStyle, boolean z) {
            bigPictureStyle.showBigPictureWhenCollapsed(z);
        }
    }

    public final void b(l lVar) {
        int i10 = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(lVar.f9428b).setBigContentTitle((CharSequence) null).bigPicture(this.f9405b);
        if (this.d) {
            IconCompat iconCompat = this.f9406c;
            if (iconCompat == null) {
                a.a(bigPicture, (Bitmap) null);
            } else {
                b.a(bigPicture, iconCompat.e(lVar.f9427a));
            }
        }
        if (i10 >= 31) {
            c.a(bigPicture, false);
        }
    }

    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public final void d() {
        this.f9406c = null;
        this.d = true;
    }
}
