package p1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import h1.l;
import h1.q;
import i1.a;
import java.io.IOException;
import k1.n;
import l1.b;
import t1.g;
import u1.c;

public final class d extends b {
    public final Rect A = new Rect();
    public n B;

    /* renamed from: y  reason: collision with root package name */
    public final a f7827y = new a(3);
    public final Rect z = new Rect();

    public d(l lVar, e eVar) {
        super(lVar, eVar);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        Bitmap r5 = r();
        if (r5 != null) {
            rectF.set(0.0f, 0.0f, g.c() * ((float) r5.getWidth()), g.c() * ((float) r5.getHeight()));
            this.l.mapRect(rectF);
        }
    }

    public final void h(c cVar, Object obj) {
        super.h(cVar, obj);
        if (obj != q.E) {
            return;
        }
        if (cVar == null) {
            this.B = null;
        } else {
            this.B = new n(cVar, null);
        }
    }

    public final void k(Canvas canvas, Matrix matrix, int i10) {
        Bitmap r5 = r();
        if (r5 != null && !r5.isRecycled()) {
            float c10 = g.c();
            a aVar = this.f7827y;
            aVar.setAlpha(i10);
            n nVar = this.B;
            if (nVar != null) {
                aVar.setColorFilter((ColorFilter) nVar.f());
            }
            canvas.save();
            canvas.concat(matrix);
            int width = r5.getWidth();
            int height = r5.getHeight();
            Rect rect = this.z;
            rect.set(0, 0, width, height);
            Rect rect2 = this.A;
            rect2.set(0, 0, (int) (((float) r5.getWidth()) * c10), (int) (((float) r5.getHeight()) * c10));
            canvas.drawBitmap(r5, rect, rect2, aVar);
            canvas.restore();
        }
    }

    public final Bitmap r() {
        b bVar;
        String str;
        Bitmap decodeStream;
        Context context;
        boolean z10;
        String str2 = this.f7814n.f7833g;
        l lVar = this.f7813m;
        if (lVar.getCallback() == null) {
            bVar = null;
        } else {
            b bVar2 = lVar.w;
            if (bVar2 != null) {
                Drawable.Callback callback = lVar.getCallback();
                if (callback != null && (callback instanceof View)) {
                    context = ((View) callback).getContext();
                } else {
                    context = null;
                }
                Context context2 = bVar2.f6867a;
                if (!(context == null && context2 == null) && !context2.equals(context)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    lVar.w = null;
                }
            }
            if (lVar.w == null) {
                lVar.w = new b(lVar.getCallback(), lVar.f5153x, lVar.f5147p.d);
            }
            bVar = lVar.w;
        }
        if (bVar == null) {
            return null;
        }
        String str3 = bVar.f6868b;
        h1.n nVar = bVar.f6869c.get(str2);
        if (nVar == null) {
            return null;
        }
        Bitmap bitmap = nVar.d;
        if (bitmap != null) {
            return bitmap;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        String str4 = nVar.f5184c;
        if (!str4.startsWith("data:") || str4.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        decodeStream = BitmapFactory.decodeStream(bVar.f6867a.getAssets().open(str3 + str4), (Rect) null, options);
                        int i10 = nVar.f5182a;
                        int i11 = nVar.f5183b;
                        g.a aVar = g.f8886a;
                        if (!(decodeStream.getWidth() == i10 && decodeStream.getHeight() == i11)) {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, i10, i11, true);
                            decodeStream.recycle();
                            decodeStream = createScaledBitmap;
                        }
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        str = "Unable to decode image.";
                        t1.c.c(str, e);
                        return null;
                    }
                } else {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
            } catch (IOException e11) {
                e = e11;
                str = "Unable to open asset.";
                t1.c.c(str, e);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str4.substring(str4.indexOf(44) + 1), 0);
                decodeStream = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            } catch (IllegalArgumentException e12) {
                e = e12;
                str = "data URL did not have correct base64 format.";
                t1.c.c(str, e);
                return null;
            }
        }
        Bitmap bitmap2 = decodeStream;
        synchronized (b.d) {
            bVar.f6869c.get(str2).d = bitmap2;
        }
        return bitmap2;
    }
}
