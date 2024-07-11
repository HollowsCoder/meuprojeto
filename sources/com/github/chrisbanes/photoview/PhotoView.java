package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import o3.d;
import o3.e;
import o3.f;
import o3.g;
import o3.h;
import o3.i;
import o3.j;
import o3.k;
import o3.l;

public class PhotoView extends AppCompatImageView {

    /* renamed from: r  reason: collision with root package name */
    public k f2303r = new k(this);

    /* renamed from: s  reason: collision with root package name */
    public ImageView.ScaleType f2304s;

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f2304s;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f2304s = null;
        }
    }

    public k getAttacher() {
        return this.f2303r;
    }

    public RectF getDisplayRect() {
        return this.f2303r.c();
    }

    public Matrix getImageMatrix() {
        return this.f2303r.z;
    }

    public float getMaximumScale() {
        return this.f2303r.f7721s;
    }

    public float getMediumScale() {
        return this.f2303r.f7720r;
    }

    public float getMinimumScale() {
        return this.f2303r.f7719q;
    }

    public float getScale() {
        return this.f2303r.f();
    }

    public ImageView.ScaleType getScaleType() {
        return this.f2303r.L;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f2303r.f7722t = z;
    }

    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        if (frame) {
            this.f2303r.h();
        }
        return frame;
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        k kVar = this.f2303r;
        if (kVar != null) {
            kVar.h();
        }
    }

    public void setImageResource(int i10) {
        super.setImageResource(i10);
        k kVar = this.f2303r;
        if (kVar != null) {
            kVar.h();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        k kVar = this.f2303r;
        if (kVar != null) {
            kVar.h();
        }
    }

    public void setMaximumScale(float f10) {
        k kVar = this.f2303r;
        l.a(kVar.f7719q, kVar.f7720r, f10);
        kVar.f7721s = f10;
    }

    public void setMediumScale(float f10) {
        k kVar = this.f2303r;
        l.a(kVar.f7719q, f10, kVar.f7721s);
        kVar.f7720r = f10;
    }

    public void setMinimumScale(float f10) {
        k kVar = this.f2303r;
        l.a(f10, kVar.f7720r, kVar.f7721s);
        kVar.f7719q = f10;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2303r.F = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f2303r.w.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f2303r.G = onLongClickListener;
    }

    public void setOnMatrixChangeListener(d dVar) {
        this.f2303r.D = dVar;
    }

    public void setOnOutsidePhotoTapListener(e eVar) {
        this.f2303r.getClass();
    }

    public void setOnPhotoTapListener(f fVar) {
        this.f2303r.E = fVar;
    }

    public void setOnScaleChangeListener(g gVar) {
        this.f2303r.getClass();
    }

    public void setOnSingleFlingListener(h hVar) {
        this.f2303r.getClass();
    }

    public void setOnViewDragListener(i iVar) {
        this.f2303r.getClass();
    }

    public void setOnViewTapListener(j jVar) {
        this.f2303r.getClass();
    }

    public void setRotationBy(float f10) {
        k kVar = this.f2303r;
        kVar.A.postRotate(f10 % 360.0f);
        kVar.a();
    }

    public void setRotationTo(float f10) {
        k kVar = this.f2303r;
        kVar.A.setRotate(f10 % 360.0f);
        kVar.a();
    }

    public void setScale(float f10) {
        k kVar = this.f2303r;
        ImageView imageView = kVar.f7723v;
        kVar.g(f10, (float) (imageView.getRight() / 2), (float) (imageView.getBottom() / 2), false);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        boolean z;
        k kVar = this.f2303r;
        if (kVar == null) {
            this.f2304s = scaleType;
            return;
        }
        kVar.getClass();
        if (scaleType == null) {
            z = false;
        } else if (l.a.f7740a[scaleType.ordinal()] != 1) {
            z = true;
        } else {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (z && scaleType != kVar.L) {
            kVar.L = scaleType;
            kVar.h();
        }
    }

    public void setZoomTransitionDuration(int i10) {
        this.f2303r.f7718p = i10;
    }

    public void setZoomable(boolean z) {
        k kVar = this.f2303r;
        kVar.K = z;
        kVar.h();
    }
}
