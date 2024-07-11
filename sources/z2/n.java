package z2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import t2.c;
import t2.d;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9836a = new a();

    public class a extends d {
        public final void e(Bitmap bitmap) {
        }
    }

    /* JADX INFO: finally extract failed */
    public static d a(c cVar, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        StringBuilder sb;
        String str;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i10 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
                }
                bitmap = null;
                z = true;
            } else if (i11 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                if (current.getIntrinsicWidth() > 0) {
                    i10 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i11 = current.getIntrinsicHeight();
                }
                Lock lock = z.f9873b;
                lock.lock();
                Bitmap d = cVar.d(i10, i11, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(d);
                    current.setBounds(0, 0, i10, i11);
                    current.draw(canvas);
                    canvas.setBitmap((Bitmap) null);
                    lock.unlock();
                    bitmap = d;
                    z = true;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            } else {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                }
                bitmap = null;
                z = true;
            }
            sb.append(str);
            Log.w("DrawableToBitmap", sb.toString());
            bitmap = null;
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            cVar = f9836a;
        }
        return d.e(bitmap, cVar);
    }
}
