package z2;

import android.graphics.Bitmap;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import m3.j;
import q2.l;
import s2.w;
import t2.c;

public abstract class e implements l<Bitmap> {
    public final w b(g gVar, w wVar, int i10, int i11) {
        if (j.h(i10, i11)) {
            c cVar = b.b(gVar).f2232o;
            Bitmap bitmap = (Bitmap) wVar.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c10 = c(cVar, bitmap, i10, i11);
            if (bitmap.equals(c10)) {
                return wVar;
            }
            return d.e(c10, cVar);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(c cVar, Bitmap bitmap, int i10, int i11);
}
