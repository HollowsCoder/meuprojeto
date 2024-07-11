package i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;
import i0.b;
import java.lang.reflect.Method;

public final class c extends b implements MenuItem {
    public final d0.b d;

    /* renamed from: e  reason: collision with root package name */
    public Method f5940e;

    public class a extends i0.b {

        /* renamed from: b  reason: collision with root package name */
        public final ActionProvider f5941b;

        public a(ActionProvider actionProvider) {
            this.f5941b = actionProvider;
        }

        public final boolean a() {
            return this.f5941b.hasSubMenu();
        }

        public final View c() {
            return this.f5941b.onCreateActionView();
        }

        public final boolean e() {
            return this.f5941b.onPerformDefaultAction();
        }

        public final void f(m mVar) {
            this.f5941b.onPrepareSubMenu(c.this.d(mVar));
        }
    }

    public class b extends a implements ActionProvider.VisibilityListener {
        public b.a d;

        public b(c cVar, ActionProvider actionProvider) {
            super(actionProvider);
        }

        public final boolean b() {
            return this.f5941b.isVisible();
        }

        public final View d(MenuItem menuItem) {
            return this.f5941b.onCreateActionView(menuItem);
        }

        public final boolean g() {
            return this.f5941b.overridesItemVisibility();
        }

        public final void h(h.a aVar) {
            this.d = aVar;
            this.f5941b.setVisibilityListener(this);
        }

        public final void onActionProviderVisibilityChanged(boolean z) {
            b.a aVar = this.d;
            if (aVar != null) {
                f fVar = h.this.f348n;
                fVar.f320h = true;
                fVar.p(true);
            }
        }
    }

    /* renamed from: i.c$c  reason: collision with other inner class name */
    public static class C0077c extends FrameLayout implements h.b {

        /* renamed from: o  reason: collision with root package name */
        public final CollapsibleActionView f5943o;

        public C0077c(View view) {
            super(view.getContext());
            this.f5943o = (CollapsibleActionView) view;
            addView(view);
        }

        public final void onActionViewCollapsed() {
            this.f5943o.onActionViewCollapsed();
        }

        public final void onActionViewExpanded() {
            this.f5943o.onActionViewExpanded();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f5944a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f5944a = onActionExpandListener;
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f5944a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f5944a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f5946a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f5946a = onMenuItemClickListener;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f5946a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, d0.b bVar) {
        super(context);
        if (bVar != null) {
            this.d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.d.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        i0.b a10 = this.d.a();
        if (a10 instanceof a) {
            return ((a) a10).f5941b;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.d.getActionView();
        if (actionView instanceof C0077c) {
            return (View) ((C0077c) actionView).f5943o;
        }
        return actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    public final int getGroupId() {
        return this.d.getGroupId();
    }

    public final Drawable getIcon() {
        return this.d.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.d.getIntent();
    }

    public final int getItemId() {
        return this.d.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.d.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    public final int getOrder() {
        return this.d.getOrder();
    }

    public final SubMenu getSubMenu() {
        return d(this.d.getSubMenu());
    }

    public final CharSequence getTitle() {
        return this.d.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.d.isCheckable();
    }

    public final boolean isChecked() {
        return this.d.isChecked();
    }

    public final boolean isEnabled() {
        return this.d.isEnabled();
    }

    public final boolean isVisible() {
        return this.d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, actionProvider);
        if (actionProvider == null) {
            bVar = null;
        }
        this.d.b(bVar);
        return this;
    }

    public final MenuItem setActionView(int i10) {
        d0.b bVar = this.d;
        bVar.setActionView(i10);
        View actionView = bVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            bVar.setActionView((View) new C0077c(actionView));
        }
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0077c(view);
        }
        this.d.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10) {
        this.d.setAlphabeticShortcut(c10);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.d.setCheckable(z);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.d.setChecked(z);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.d.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.d.setEnabled(z);
        return this;
    }

    public final MenuItem setIcon(int i10) {
        this.d.setIcon(i10);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.d.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.d.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.d.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c10) {
        this.d.setNumericShortcut(c10);
        return this;
    }

    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.d.setNumericShortcut(c10, i10);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11) {
        this.d.setShortcut(c10, c11);
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    public final void setShowAsAction(int i10) {
        this.d.setShowAsAction(i10);
    }

    public final MenuItem setShowAsActionFlags(int i10) {
        this.d.setShowAsActionFlags(i10);
        return this;
    }

    public final MenuItem setTitle(int i10) {
        this.d.setTitle(i10);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.d.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.d.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.d.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        return this.d.setVisible(z);
    }
}
