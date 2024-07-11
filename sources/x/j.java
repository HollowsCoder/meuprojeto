package x;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import com.karumi.dexter.R;
import java.util.ArrayList;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9408a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<g> f9409b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<n> f9410c = new ArrayList<>();
    public final ArrayList<g> d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f9411e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f9412f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f9413g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f9414h;

    /* renamed from: i  reason: collision with root package name */
    public int f9415i;

    /* renamed from: j  reason: collision with root package name */
    public int f9416j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9417k = true;
    public k l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f9418m = false;

    /* renamed from: n  reason: collision with root package name */
    public Bundle f9419n;

    /* renamed from: o  reason: collision with root package name */
    public int f9420o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f9421p = 0;

    /* renamed from: q  reason: collision with root package name */
    public String f9422q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f9423r;

    /* renamed from: s  reason: collision with root package name */
    public final Notification f9424s;
    @Deprecated

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<String> f9425t;

    public j(Context context, String str) {
        Notification notification = new Notification();
        this.f9424s = notification;
        this.f9408a = context;
        this.f9422q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f9416j = 0;
        this.f9425t = new ArrayList<>();
        this.f9423r = true;
    }

    public static CharSequence b(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    public final Notification a() {
        Bundle bundle;
        l lVar = new l(this);
        j jVar = lVar.f9429c;
        k kVar = jVar.l;
        if (kVar != null) {
            kVar.b(lVar);
        }
        Notification build = lVar.f9428b.build();
        if (kVar != null) {
            jVar.l.getClass();
        }
        if (!(kVar == null || (bundle = build.extras) == null)) {
            kVar.a(bundle);
        }
        return build;
    }

    public final void c(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f9408a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
            }
        }
        this.f9414h = bitmap;
    }

    public final void d(k kVar) {
        if (this.l != kVar) {
            this.l = kVar;
            if (kVar.f9426a != this) {
                kVar.f9426a = this;
                d(kVar);
            }
        }
    }
}
