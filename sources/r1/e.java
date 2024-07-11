package r1;

import android.graphics.Color;
import s1.a;

public final class e implements d0<Integer> {

    /* renamed from: o  reason: collision with root package name */
    public static final e f8365o = new e();

    public final Object f(a aVar, float f10) {
        boolean z = aVar.r() == a.b.BEGIN_ARRAY;
        if (z) {
            aVar.a();
        }
        double l = aVar.l();
        double l8 = aVar.l();
        double l10 = aVar.l();
        double l11 = aVar.r() == a.b.NUMBER ? aVar.l() : 1.0d;
        if (z) {
            aVar.c();
        }
        if (l <= 1.0d && l8 <= 1.0d && l10 <= 1.0d) {
            l *= 255.0d;
            l8 *= 255.0d;
            l10 *= 255.0d;
            if (l11 <= 1.0d) {
                l11 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) l11, (int) l, (int) l8, (int) l10));
    }
}
