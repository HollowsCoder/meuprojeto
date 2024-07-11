package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import java.lang.reflect.Method;

public final class s0 extends q0 implements r0 {
    public static final Method Q;
    public r0 P;

    public static class a extends l0 {
        public final int B;
        public final int C;
        public r0 D;
        public h E;

        public a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.B = 21;
                this.C = 22;
                return;
            }
            this.B = 22;
            this.C = 21;
        }

        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            e eVar;
            h hVar;
            int pointToPosition;
            int i11;
            if (this.D != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                    i10 = 0;
                }
                if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i11 = pointToPosition - i10) < 0 || i11 >= eVar.getCount()) {
                    hVar = null;
                } else {
                    hVar = eVar.getItem(i11);
                }
                h hVar2 = this.E;
                if (hVar2 != hVar) {
                    f fVar = eVar.f307o;
                    if (hVar2 != null) {
                        this.D.b(fVar, hVar2);
                    }
                    this.E = hVar;
                    if (hVar != null) {
                        this.D.e(fVar, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.B) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i10 != this.C) {
                return super.onKeyDown(i10, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((e) adapter).f307o.c(false);
                return true;
            }
        }

        public void setHoverListener(r0 r0Var) {
            this.D = r0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Q = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public s0(Context context, int i10, int i11) {
        super(context, (AttributeSet) null, i10, i11);
    }

    public final void b(f fVar, MenuItem menuItem) {
        r0 r0Var = this.P;
        if (r0Var != null) {
            r0Var.b(fVar, menuItem);
        }
    }

    public final void e(f fVar, h hVar) {
        r0 r0Var = this.P;
        if (r0Var != null) {
            r0Var.e(fVar, hVar);
        }
    }

    public final l0 q(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
