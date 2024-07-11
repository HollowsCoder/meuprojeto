package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.karumi.dexter.R;

public class o extends ImageButton {

    /* renamed from: o  reason: collision with root package name */
    public final e f666o;

    /* renamed from: p  reason: collision with root package name */
    public final p f667p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f668q;

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b1.a(context);
        this.f668q = false;
        z0.a(this, getContext());
        e eVar = new e(this);
        this.f666o = eVar;
        eVar.d(attributeSet, i10);
        p pVar = new p(this);
        this.f667p = pVar;
        pVar.b(attributeSet, i10);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f666o;
        if (eVar != null) {
            eVar.a();
        }
        p pVar = this.f667p;
        if (pVar != null) {
            pVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f666o;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f666o;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        c1 c1Var;
        p pVar = this.f667p;
        if (pVar == null || (c1Var = pVar.f679b) == null) {
            return null;
        }
        return c1Var.f521a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        c1 c1Var;
        p pVar = this.f667p;
        if (pVar == null || (c1Var = pVar.f679b) == null) {
            return null;
        }
        return c1Var.f522b;
    }

    public final boolean hasOverlappingRendering() {
        if (!(!(this.f667p.f678a.getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f666o;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f666o;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        p pVar = this.f667p;
        if (pVar != null) {
            pVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        p pVar = this.f667p;
        if (!(pVar == null || drawable == null || this.f668q)) {
            pVar.f680c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (pVar != null) {
            pVar.a();
            if (!this.f668q) {
                ImageView imageView = pVar.f678a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(pVar.f680c);
                }
            }
        }
    }

    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f668q = true;
    }

    public void setImageResource(int i10) {
        this.f667p.c(i10);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        p pVar = this.f667p;
        if (pVar != null) {
            pVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f666o;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f666o;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        p pVar = this.f667p;
        if (pVar != null) {
            if (pVar.f679b == null) {
                pVar.f679b = new c1();
            }
            c1 c1Var = pVar.f679b;
            c1Var.f521a = colorStateList;
            c1Var.d = true;
            pVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        p pVar = this.f667p;
        if (pVar != null) {
            if (pVar.f679b == null) {
                pVar.f679b = new c1();
            }
            c1 c1Var = pVar.f679b;
            c1Var.f522b = mode;
            c1Var.f523c = true;
            pVar.a();
        }
    }
}
