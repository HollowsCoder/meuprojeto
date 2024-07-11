package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import d0.b;
import i0.b;
import java.util.ArrayList;

public final class h implements b {
    public i0.b A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;

    /* renamed from: a  reason: collision with root package name */
    public final int f337a;

    /* renamed from: b  reason: collision with root package name */
    public final int f338b;

    /* renamed from: c  reason: collision with root package name */
    public final int f339c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f340e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f341f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f342g;

    /* renamed from: h  reason: collision with root package name */
    public char f343h;

    /* renamed from: i  reason: collision with root package name */
    public int f344i = 4096;

    /* renamed from: j  reason: collision with root package name */
    public char f345j;

    /* renamed from: k  reason: collision with root package name */
    public int f346k = 4096;
    public Drawable l;

    /* renamed from: m  reason: collision with root package name */
    public int f347m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final f f348n;

    /* renamed from: o  reason: collision with root package name */
    public m f349o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f350p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f351q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f352r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f353s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f354t = null;
    public boolean u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f355v = false;
    public boolean w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f356x = 16;

    /* renamed from: y  reason: collision with root package name */
    public int f357y;
    public View z;

    public class a implements b.a {
        public a() {
        }
    }

    public h(f fVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f348n = fVar;
        this.f337a = i11;
        this.f338b = i10;
        this.f339c = i12;
        this.d = i13;
        this.f340e = charSequence;
        this.f357y = i14;
    }

    public static void c(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    public final i0.b a() {
        return this.A;
    }

    public final d0.b b(i0.b bVar) {
        i0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f5955a = null;
        }
        this.z = null;
        this.A = bVar;
        this.f348n.p(true);
        i0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    public final boolean collapseActionView() {
        if ((this.f357y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f348n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.f355v)) {
            drawable = drawable.mutate();
            if (this.u) {
                drawable.setTintList(this.f353s);
            }
            if (this.f355v) {
                drawable.setTintMode(this.f354t);
            }
            this.w = false;
        }
        return drawable;
    }

    public final boolean e() {
        i0.b bVar;
        if ((this.f357y & 8) == 0) {
            return false;
        }
        if (this.z == null && (bVar = this.A) != null) {
            this.z = bVar.d(this);
        }
        return this.z != null;
    }

    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f348n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        this.f356x = z10 ? this.f356x | 32 : this.f356x & -33;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        i0.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View d10 = bVar.d(this);
        this.z = d10;
        return d10;
    }

    public final int getAlphabeticModifiers() {
        return this.f346k;
    }

    public final char getAlphabeticShortcut() {
        return this.f345j;
    }

    public final CharSequence getContentDescription() {
        return this.f351q;
    }

    public final int getGroupId() {
        return this.f338b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f347m;
        if (i10 == 0) {
            return null;
        }
        Drawable b10 = f.a.b(this.f348n.f314a, i10);
        this.f347m = 0;
        this.l = b10;
        return d(b10);
    }

    public final ColorStateList getIconTintList() {
        return this.f353s;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f354t;
    }

    public final Intent getIntent() {
        return this.f342g;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f337a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f344i;
    }

    public final char getNumericShortcut() {
        return this.f343h;
    }

    public final int getOrder() {
        return this.f339c;
    }

    public final SubMenu getSubMenu() {
        return this.f349o;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f340e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f341f;
        return charSequence != null ? charSequence : this.f340e;
    }

    public final CharSequence getTooltipText() {
        return this.f352r;
    }

    public final boolean hasSubMenu() {
        return this.f349o != null;
    }

    public final boolean isActionViewExpanded() {
        return this.C;
    }

    public final boolean isCheckable() {
        return (this.f356x & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.f356x & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f356x & 16) != 0;
    }

    public final boolean isVisible() {
        i0.b bVar = this.A;
        return (bVar == null || !bVar.g()) ? (this.f356x & 8) == 0 : (this.f356x & 8) == 0 && this.A.b();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(int i10) {
        int i11;
        f fVar = this.f348n;
        Context context = fVar.f314a;
        View inflate = LayoutInflater.from(context).inflate(i10, new LinearLayout(context), false);
        this.z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f337a) > 0) {
            inflate.setId(i11);
        }
        fVar.f323k = true;
        fVar.p(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f345j == c10) {
            return this;
        }
        this.f345j = Character.toLowerCase(c10);
        this.f348n.p(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f345j == c10 && this.f346k == i10) {
            return this;
        }
        this.f345j = Character.toLowerCase(c10);
        this.f346k = KeyEvent.normalizeMetaState(i10);
        this.f348n.p(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f356x;
        boolean z11 = z10 | (i10 & true);
        this.f356x = z11 ? 1 : 0;
        if (i10 != z11) {
            this.f348n.p(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f356x;
        int i12 = i11 & 4;
        f fVar = this.f348n;
        int i13 = 2;
        if (i12 != 0) {
            fVar.getClass();
            ArrayList<h> arrayList = fVar.f318f;
            int size = arrayList.size();
            fVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                h hVar = arrayList.get(i14);
                if (hVar.f338b == this.f338b) {
                    boolean z12 = true;
                    if ((hVar.f356x & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && hVar.isCheckable()) {
                        if (hVar != this) {
                            z12 = false;
                        }
                        int i15 = hVar.f356x;
                        int i16 = i15 & -3;
                        if (z12) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        int i17 = i10 | i16;
                        hVar.f356x = i17;
                        if (i15 != i17) {
                            hVar.f348n.p(false);
                        }
                    }
                }
            }
            fVar.v();
        } else {
            int i18 = i11 & -3;
            if (!z10) {
                i13 = 0;
            }
            int i19 = i13 | i18;
            this.f356x = i19;
            if (i11 != i19) {
                fVar.p(false);
            }
        }
        return this;
    }

    public final d0.b setContentDescription(CharSequence charSequence) {
        this.f351q = charSequence;
        this.f348n.p(false);
        return this;
    }

    public final MenuItem setEnabled(boolean z10) {
        this.f356x = z10 ? this.f356x | 16 : this.f356x & -17;
        this.f348n.p(false);
        return this;
    }

    public final MenuItem setIcon(int i10) {
        this.l = null;
        this.f347m = i10;
        this.w = true;
        this.f348n.p(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f347m = 0;
        this.l = drawable;
        this.w = true;
        this.f348n.p(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f353s = colorStateList;
        this.u = true;
        this.w = true;
        this.f348n.p(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f354t = mode;
        this.f355v = true;
        this.w = true;
        this.f348n.p(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f342g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c10) {
        if (this.f343h == c10) {
            return this;
        }
        this.f343h = c10;
        this.f348n.p(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f343h == c10 && this.f344i == i10) {
            return this;
        }
        this.f343h = c10;
        this.f344i = KeyEvent.normalizeMetaState(i10);
        this.f348n.p(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f350p = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11) {
        this.f343h = c10;
        this.f345j = Character.toLowerCase(c11);
        this.f348n.p(false);
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f343h = c10;
        this.f344i = KeyEvent.normalizeMetaState(i10);
        this.f345j = Character.toLowerCase(c11);
        this.f346k = KeyEvent.normalizeMetaState(i11);
        this.f348n.p(false);
        return this;
    }

    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            this.f357y = i10;
            f fVar = this.f348n;
            fVar.f323k = true;
            fVar.p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public final MenuItem setTitle(int i10) {
        setTitle((CharSequence) this.f348n.f314a.getString(i10));
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f340e = charSequence;
        this.f348n.p(false);
        m mVar = this.f349o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f341f = charSequence;
        this.f348n.p(false);
        return this;
    }

    public final d0.b setTooltipText(CharSequence charSequence) {
        this.f352r = charSequence;
        this.f348n.p(false);
        return this;
    }

    public final MenuItem setVisible(boolean z10) {
        int i10;
        int i11 = this.f356x;
        int i12 = i11 & -9;
        boolean z11 = false;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f356x = i13;
        if (i11 != i13) {
            z11 = true;
        }
        if (z11) {
            f fVar = this.f348n;
            fVar.f320h = true;
            fVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f340e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final MenuItem setActionView(View view) {
        int i10;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f337a) > 0) {
            view.setId(i10);
        }
        f fVar = this.f348n;
        fVar.f323k = true;
        fVar.p(true);
        return this;
    }
}
