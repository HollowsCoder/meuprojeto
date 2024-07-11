package i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d0.b;
import y.a;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f5923a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f5924b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f5925c;
    public char d;

    /* renamed from: e  reason: collision with root package name */
    public int f5926e = 4096;

    /* renamed from: f  reason: collision with root package name */
    public char f5927f;

    /* renamed from: g  reason: collision with root package name */
    public int f5928g = 4096;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f5929h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f5930i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f5931j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f5932k;
    public ColorStateList l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f5933m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5934n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5935o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f5936p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f5930i = context;
        this.f5923a = charSequence;
    }

    public final i0.b a() {
        return null;
    }

    public final b b(i0.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f5929h;
        if (drawable == null) {
            return;
        }
        if (this.f5934n || this.f5935o) {
            this.f5929h = drawable;
            Drawable mutate = drawable.mutate();
            this.f5929h = mutate;
            if (this.f5934n) {
                mutate.setTintList(this.l);
            }
            if (this.f5935o) {
                this.f5929h.setTintMode(this.f5933m);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f5928g;
    }

    public final char getAlphabeticShortcut() {
        return this.f5927f;
    }

    public final CharSequence getContentDescription() {
        return this.f5931j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f5929h;
    }

    public final ColorStateList getIconTintList() {
        return this.l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f5933m;
    }

    public final Intent getIntent() {
        return this.f5925c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f5926e;
    }

    public final char getNumericShortcut() {
        return this.d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f5923a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5924b;
        return charSequence != null ? charSequence : this.f5923a;
    }

    public final CharSequence getTooltipText() {
        return this.f5932k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f5936p & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f5936p & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f5936p & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f5936p & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f5927f = Character.toLowerCase(c10);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f5927f = Character.toLowerCase(c10);
        this.f5928g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f5936p = z | (this.f5936p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f5936p = (z ? 2 : 0) | (this.f5936p & -3);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f5931j = charSequence;
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final b m16setContentDescription(CharSequence charSequence) {
        this.f5931j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f5936p = (z ? 16 : 0) | (this.f5936p & -17);
        return this;
    }

    public final MenuItem setIcon(int i10) {
        Object obj = y.a.f9523a;
        this.f5929h = a.c.b(this.f5930i, i10);
        c();
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f5929h = drawable;
        c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.f5934n = true;
        c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5933m = mode;
        this.f5935o = true;
        c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f5925c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c10) {
        this.d = c10;
        return this;
    }

    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.d = c10;
        this.f5926e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11) {
        this.d = c10;
        this.f5927f = Character.toLowerCase(c11);
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.d = c10;
        this.f5926e = KeyEvent.normalizeMetaState(i10);
        this.f5927f = Character.toLowerCase(c11);
        this.f5928g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    public final void setShowAsAction(int i10) {
    }

    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    public final MenuItem setTitle(int i10) {
        this.f5923a = this.f5930i.getResources().getString(i10);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5923a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5924b = charSequence;
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f5932k = charSequence;
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final b m17setTooltipText(CharSequence charSequence) {
        this.f5932k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i10 = 8;
        int i11 = this.f5936p & 8;
        if (z) {
            i10 = 0;
        }
        this.f5936p = i11 | i10;
        return this;
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
