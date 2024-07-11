package i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d0.c;

public final class g extends e implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    public final c f5949e;

    public g(Context context, c cVar) {
        super(context, cVar);
        this.f5949e = cVar;
    }

    public final void clearHeader() {
        this.f5949e.clearHeader();
    }

    public final MenuItem getItem() {
        return c(this.f5949e.getItem());
    }

    public final SubMenu setHeaderIcon(int i10) {
        this.f5949e.setHeaderIcon(i10);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f5949e.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i10) {
        this.f5949e.setHeaderTitle(i10);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f5949e.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.f5949e.setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i10) {
        this.f5949e.setIcon(i10);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f5949e.setIcon(drawable);
        return this;
    }
}
