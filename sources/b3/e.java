package b3;

import android.graphics.drawable.Drawable;
import q2.h;
import q2.j;
import s2.w;

public final class e implements j<Drawable, Drawable> {
    public final w a(Object obj, int i10, int i11, h hVar) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            return new c(drawable);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        Drawable drawable = (Drawable) obj;
        return true;
    }
}
