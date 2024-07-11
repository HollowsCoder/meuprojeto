package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.databinding.a;
import i0.w;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f678a;

    /* renamed from: b  reason: collision with root package name */
    public c1 f679b;

    /* renamed from: c  reason: collision with root package name */
    public int f680c = 0;

    public p(ImageView imageView) {
        this.f678a = imageView;
    }

    public final void a() {
        c1 c1Var;
        ImageView imageView = this.f678a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            k0.b(drawable);
        }
        if (drawable != null && (c1Var = this.f679b) != null) {
            k.e(drawable, c1Var, imageView.getDrawableState());
        }
    }

    public final void b(AttributeSet attributeSet, int i10) {
        int i11;
        ImageView imageView = this.f678a;
        Context context = imageView.getContext();
        int[] iArr = a.E;
        e1 m10 = e1.m(context, attributeSet, iArr, i10);
        w.j(imageView, imageView.getContext(), iArr, attributeSet, m10.f551b, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable != null || (i11 = m10.i(1, -1)) == -1 || (drawable = f.a.b(imageView.getContext(), i11)) == null)) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                k0.b(drawable);
            }
            if (m10.l(2)) {
                imageView.setImageTintList(m10.b(2));
            }
            if (m10.l(3)) {
                imageView.setImageTintMode(k0.c(m10.h(3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            m10.n();
        }
    }

    public final void c(int i10) {
        Drawable drawable;
        ImageView imageView = this.f678a;
        if (i10 != 0) {
            drawable = f.a.b(imageView.getContext(), i10);
            if (drawable != null) {
                k0.b(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        a();
    }
}
