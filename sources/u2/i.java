package u2;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f9074a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9075b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9076c;

    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f9077e = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a  reason: collision with root package name */
        public final Context f9078a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityManager f9079b;

        /* renamed from: c  reason: collision with root package name */
        public final b f9080c;
        public final float d = ((float) f9077e);

        public a(Context context) {
            this.f9078a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f9079b = activityManager;
            this.f9080c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
                this.d = 0.0f;
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayMetrics f9081a;

        public b(DisplayMetrics displayMetrics) {
            this.f9081a = displayMetrics;
        }
    }

    public i(a aVar) {
        int i10;
        float f10;
        boolean z;
        Context context = aVar.f9078a;
        ActivityManager activityManager = aVar.f9079b;
        if (activityManager.isLowRamDevice()) {
            i10 = 2097152;
        } else {
            i10 = 4194304;
        }
        this.f9076c = i10;
        boolean isLowRamDevice = activityManager.isLowRamDevice();
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (isLowRamDevice) {
            f10 = 0.33f;
        } else {
            f10 = 0.4f;
        }
        int round = Math.round(memoryClass * f10);
        DisplayMetrics displayMetrics = aVar.f9080c.f9081a;
        float f11 = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        float f12 = aVar.d;
        int round2 = Math.round(f11 * f12);
        int round3 = Math.round(f11 * 2.0f);
        int i11 = round - i10;
        int i12 = round3 + round2;
        if (i12 <= i11) {
            this.f9075b = round3;
            this.f9074a = round2;
        } else {
            float f13 = ((float) i11) / (f12 + 2.0f);
            this.f9075b = Math.round(2.0f * f13);
            this.f9074a = Math.round(f13 * f12);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, (long) this.f9075b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, (long) this.f9074a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, (long) i10));
            sb.append(", memory class limited? ");
            if (i12 > round) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, (long) round));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
