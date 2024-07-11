package i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import d0.a;
import d0.b;
import d0.c;
import n.i;

public class e extends b implements Menu {
    public final a d;

    public e(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(int i10) {
        return c(this.d.add(i10));
    }

    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return c(this.d.add(i10, i11, i12, i13));
    }

    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(this.d.add(i10, i11, i12, charSequence));
    }

    public final MenuItem add(CharSequence charSequence) {
        return c(this.d.add(charSequence));
    }

    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr2[i14] = c(menuItemArr3[i14]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(int i10) {
        return d(this.d.addSubMenu(i10));
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return d(this.d.addSubMenu(i10, i11, i12, i13));
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.d.addSubMenu(i10, i11, i12, charSequence));
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.d.addSubMenu(charSequence));
    }

    public final void clear() {
        i<b, MenuItem> iVar = this.f5938b;
        if (iVar != null) {
            iVar.clear();
        }
        i<c, SubMenu> iVar2 = this.f5939c;
        if (iVar2 != null) {
            iVar2.clear();
        }
        this.d.clear();
    }

    public final void close() {
        this.d.close();
    }

    public final MenuItem findItem(int i10) {
        return c(this.d.findItem(i10));
    }

    public final MenuItem getItem(int i10) {
        return c(this.d.getItem(i10));
    }

    public final boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.d.isShortcutKey(i10, keyEvent);
    }

    public final boolean performIdentifierAction(int i10, int i11) {
        return this.d.performIdentifierAction(i10, i11);
    }

    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.d.performShortcut(i10, keyEvent, i11);
    }

    public final void removeGroup(int i10) {
        if (this.f5938b != null) {
            int i11 = 0;
            while (true) {
                i<b, MenuItem> iVar = this.f5938b;
                if (i11 >= iVar.f7333q) {
                    break;
                }
                if (iVar.h(i11).getGroupId() == i10) {
                    this.f5938b.j(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.d.removeGroup(i10);
    }

    public final void removeItem(int i10) {
        if (this.f5938b != null) {
            int i11 = 0;
            while (true) {
                i<b, MenuItem> iVar = this.f5938b;
                if (i11 >= iVar.f7333q) {
                    break;
                } else if (iVar.h(i11).getItemId() == i10) {
                    this.f5938b.j(i11);
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.d.removeItem(i10);
    }

    public final void setGroupCheckable(int i10, boolean z, boolean z10) {
        this.d.setGroupCheckable(i10, z, z10);
    }

    public final void setGroupEnabled(int i10, boolean z) {
        this.d.setGroupEnabled(i10, z);
    }

    public final void setGroupVisible(int i10, boolean z) {
        this.d.setGroupVisible(i10, z);
    }

    public final void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }

    public final int size() {
        return this.d.size();
    }
}
