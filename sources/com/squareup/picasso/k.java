package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.t;

public final class k extends a<ImageView> {
    public k(t tVar, ImageView imageView, w wVar, int i10, String str) {
        super(tVar, imageView, wVar, i10, str);
    }

    public final void a() {
        this.l = true;
    }

    public final void b(Bitmap bitmap, t.c cVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f3886c.get();
            if (imageView != null) {
                t tVar = this.f3884a;
                Bitmap bitmap2 = bitmap;
                t.c cVar2 = cVar;
                u.a(imageView, tVar.f3976c, bitmap2, cVar2, this.d, tVar.f3983k);
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    public final void c() {
        ImageView imageView = (ImageView) this.f3886c.get();
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            int i10 = this.f3889g;
            if (i10 != 0) {
                imageView.setImageResource(i10);
                return;
            }
            Drawable drawable2 = this.f3890h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
    }
}
