package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b0.d;

public final class m extends f implements SubMenu {
    public final h A;
    public final f z;

    public m(Context context, f fVar, h hVar) {
        super(context);
        this.z = fVar;
        this.A = hVar;
    }

    public final boolean d(h hVar) {
        return this.z.d(hVar);
    }

    public final boolean e(f fVar, MenuItem menuItem) {
        return super.e(fVar, menuItem) || this.z.e(fVar, menuItem);
    }

    public final boolean f(h hVar) {
        return this.z.f(hVar);
    }

    public final MenuItem getItem() {
        return this.A;
    }

    public final String j() {
        int i10;
        h hVar = this.A;
        if (hVar != null) {
            i10 = hVar.f337a;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            return null;
        }
        return d.c("android:menu:actionviewstates:", i10);
    }

    public final f k() {
        return this.z.k();
    }

    public final boolean m() {
        return this.z.m();
    }

    public final boolean n() {
        return this.z.n();
    }

    public final boolean o() {
        return this.z.o();
    }

    public final void setGroupDividerEnabled(boolean z10) {
        this.z.setGroupDividerEnabled(z10);
    }

    public final SubMenu setHeaderIcon(int i10) {
        u(0, (CharSequence) null, i10, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i10) {
        u(i10, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        u(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z10) {
        this.z.setQwertyMode(z10);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }
}
