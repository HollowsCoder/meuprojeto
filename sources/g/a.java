package g;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class a extends Drawable implements Drawable.Callback {

    /* renamed from: o  reason: collision with root package name */
    public Drawable f4944o;

    public a(Drawable drawable) {
        Drawable drawable2 = this.f4944o;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f4944o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f4944o.draw(canvas);
    }

    public final int getChangingConfigurations() {
        return this.f4944o.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f4944o.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f4944o.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f4944o.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f4944o.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f4944o.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f4944o.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f4944o.getPadding(rect);
    }

    public final int[] getState() {
        return this.f4944o.getState();
    }

    public final Region getTransparentRegion() {
        return this.f4944o.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.f4944o.isAutoMirrored();
    }

    public final boolean isStateful() {
        return this.f4944o.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f4944o.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.f4944o.setBounds(rect);
    }

    public final boolean onLevelChange(int i10) {
        return this.f4944o.setLevel(i10);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        scheduleSelf(runnable, j8);
    }

    public final void setAlpha(int i10) {
        this.f4944o.setAlpha(i10);
    }

    public final void setAutoMirrored(boolean z) {
        this.f4944o.setAutoMirrored(z);
    }

    public final void setChangingConfigurations(int i10) {
        this.f4944o.setChangingConfigurations(i10);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4944o.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.f4944o.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.f4944o.setFilterBitmap(z);
    }

    public void setHotspot(float f10, float f11) {
        this.f4944o.setHotspot(f10, f11);
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f4944o.setHotspotBounds(i10, i11, i12, i13);
    }

    public boolean setState(int[] iArr) {
        return this.f4944o.setState(iArr);
    }

    public final void setTint(int i10) {
        this.f4944o.setTint(i10);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f4944o.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f4944o.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z10) {
        return super.setVisible(z, z10) || this.f4944o.setVisible(z, z10);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
