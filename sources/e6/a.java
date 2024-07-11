package e6;

import android.content.Context;
import android.util.TypedValue;
import com.karumi.dexter.R;
import j6.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4491a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4492b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4493c;
    public final float d;

    public a(Context context) {
        boolean z;
        int i10;
        TypedValue a10 = b.a(context, R.attr.elevationOverlayEnabled);
        int i11 = 0;
        if (a10 == null || a10.type != 18 || a10.data == 0) {
            z = false;
        } else {
            z = true;
        }
        this.f4491a = z;
        TypedValue a11 = b.a(context, R.attr.elevationOverlayColor);
        if (a11 != null) {
            i10 = a11.data;
        } else {
            i10 = 0;
        }
        this.f4492b = i10;
        TypedValue a12 = b.a(context, R.attr.colorSurface);
        this.f4493c = a12 != null ? a12.data : i11;
        this.d = context.getResources().getDisplayMetrics().density;
    }
}
