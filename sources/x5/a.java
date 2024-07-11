package x5;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;
import m6.f;
import m6.i;
import m6.m;
import n.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f9495a;

    /* renamed from: b  reason: collision with root package name */
    public i f9496b;

    /* renamed from: c  reason: collision with root package name */
    public int f9497c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f9498e;

    /* renamed from: f  reason: collision with root package name */
    public int f9499f;

    /* renamed from: g  reason: collision with root package name */
    public int f9500g;

    /* renamed from: h  reason: collision with root package name */
    public int f9501h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f9502i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f9503j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f9504k;
    public ColorStateList l;

    /* renamed from: m  reason: collision with root package name */
    public f f9505m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f9506n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f9507o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f9508p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f9509q;

    /* renamed from: r  reason: collision with root package name */
    public RippleDrawable f9510r;

    /* renamed from: s  reason: collision with root package name */
    public int f9511s;

    public a(MaterialButton materialButton, i iVar) {
        this.f9495a = materialButton;
        this.f9496b = iVar;
    }

    public final m a() {
        RippleDrawable rippleDrawable = this.f9510r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (m) (this.f9510r.getNumberOfLayers() > 2 ? this.f9510r.getDrawable(2) : this.f9510r.getDrawable(1));
    }

    public final f b(boolean z) {
        RippleDrawable rippleDrawable = this.f9510r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (f) ((LayerDrawable) ((InsetDrawable) this.f9510r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    public final void c(i iVar) {
        this.f9496b = iVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(iVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(iVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(iVar);
        }
    }

    public final void d(int i10, int i11) {
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        MaterialButton materialButton = this.f9495a;
        int f10 = w.e.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e10 = w.e.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f9498e;
        int i13 = this.f9499f;
        this.f9499f = i11;
        this.f9498e = i10;
        if (!this.f9507o) {
            e();
        }
        w.e.k(materialButton, f10, (paddingTop + i10) - i12, e10, (paddingBottom + i11) - i13);
    }

    public final void e() {
        int i10;
        f fVar = new f(this.f9496b);
        MaterialButton materialButton = this.f9495a;
        fVar.h(materialButton.getContext());
        fVar.setTintList(this.f9503j);
        PorterDuff.Mode mode = this.f9502i;
        if (mode != null) {
            fVar.setTintMode(mode);
        }
        ColorStateList colorStateList = this.f9504k;
        fVar.f7121o.f7140k = (float) this.f9501h;
        fVar.invalidateSelf();
        f.b bVar = fVar.f7121o;
        if (bVar.d != colorStateList) {
            bVar.d = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
        f fVar2 = new f(this.f9496b);
        fVar2.setTint(0);
        float f10 = (float) this.f9501h;
        if (this.f9506n) {
            i10 = e.u(materialButton, R.attr.colorSurface);
        } else {
            i10 = 0;
        }
        fVar2.f7121o.f7140k = f10;
        fVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        f.b bVar2 = fVar2.f7121o;
        if (bVar2.d != valueOf) {
            bVar2.d = valueOf;
            fVar2.onStateChange(fVar2.getState());
        }
        f fVar3 = new f(this.f9496b);
        this.f9505m = fVar3;
        fVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(k6.a.a(this.l), new InsetDrawable(new LayerDrawable(new Drawable[]{fVar2, fVar}), this.f9497c, this.f9498e, this.d, this.f9499f), this.f9505m);
        this.f9510r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        f b10 = b(false);
        if (b10 != null) {
            b10.i((float) this.f9511s);
        }
    }

    public final void f() {
        int i10 = 0;
        f b10 = b(false);
        f b11 = b(true);
        if (b10 != null) {
            ColorStateList colorStateList = this.f9504k;
            b10.f7121o.f7140k = (float) this.f9501h;
            b10.invalidateSelf();
            f.b bVar = b10.f7121o;
            if (bVar.d != colorStateList) {
                bVar.d = colorStateList;
                b10.onStateChange(b10.getState());
            }
            if (b11 != null) {
                float f10 = (float) this.f9501h;
                if (this.f9506n) {
                    i10 = e.u(this.f9495a, R.attr.colorSurface);
                }
                b11.f7121o.f7140k = f10;
                b11.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i10);
                f.b bVar2 = b11.f7121o;
                if (bVar2.d != valueOf) {
                    bVar2.d = valueOf;
                    b11.onStateChange(b11.getState());
                }
            }
        }
    }
}
