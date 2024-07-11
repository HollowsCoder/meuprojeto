package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.databinding.a;
import com.karumi.dexter.R;
import i0.w;

public final class x extends s {
    public final SeekBar d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f723e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f724f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f725g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f726h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f727i = false;

    public x(SeekBar seekBar) {
        super(seekBar);
        this.d = seekBar;
    }

    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.d;
        Context context = seekBar.getContext();
        int[] iArr = a.F;
        e1 m10 = e1.m(context, attributeSet, iArr, R.attr.seekBarStyle);
        w.j(seekBar, seekBar.getContext(), iArr, attributeSet, m10.f551b, R.attr.seekBarStyle);
        Drawable f10 = m10.f(0);
        if (f10 != null) {
            seekBar.setThumb(f10);
        }
        Drawable e10 = m10.e(1);
        Drawable drawable = this.f723e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f723e = e10;
        if (e10 != null) {
            e10.setCallback(seekBar);
            e10.setLayoutDirection(w.e.d(seekBar));
            if (e10.isStateful()) {
                e10.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (m10.l(3)) {
            this.f725g = k0.c(m10.h(3, -1), this.f725g);
            this.f727i = true;
        }
        if (m10.l(2)) {
            this.f724f = m10.b(2);
            this.f726h = true;
        }
        m10.n();
        c();
    }

    public final void c() {
        Drawable drawable = this.f723e;
        if (drawable == null) {
            return;
        }
        if (this.f726h || this.f727i) {
            Drawable mutate = drawable.mutate();
            this.f723e = mutate;
            if (this.f726h) {
                mutate.setTintList(this.f724f);
            }
            if (this.f727i) {
                this.f723e.setTintMode(this.f725g);
            }
            if (this.f723e.isStateful()) {
                this.f723e.setState(this.d.getDrawableState());
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f723e != null) {
            SeekBar seekBar = this.d;
            int max = seekBar.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f723e.getIntrinsicWidth();
                int intrinsicHeight = this.f723e.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f723e.setBounds(-i11, -i10, i11, i10);
                float width = ((float) ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) seekBar.getPaddingLeft(), (float) (seekBar.getHeight() / 2));
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f723e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
