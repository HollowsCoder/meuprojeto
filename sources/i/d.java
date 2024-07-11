package i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;

public abstract class d implements f, j, AdapterView.OnItemClickListener {

    /* renamed from: o  reason: collision with root package name */
    public Rect f5948o;

    public static int m(e eVar, Context context, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = eVar.getCount();
        int i11 = 0;
        int i12 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = eVar.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = eVar.getView(i13, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    public static boolean u(f fVar) {
        int size = fVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = fVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(h hVar) {
        return false;
    }

    public final void e(Context context, f fVar) {
    }

    public final boolean k(h hVar) {
        return false;
    }

    public abstract void l(f fVar);

    public abstract void n(View view);

    public abstract void o(boolean z);

    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j8) {
        e eVar;
        int i11;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            eVar = (e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            eVar = (e) listAdapter;
        }
        f fVar = eVar.f307o;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i10);
        if (!(this instanceof b)) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        fVar.q(menuItem, this, i11);
    }

    public abstract void p(int i10);

    public abstract void q(int i10);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z);

    public abstract void t(int i10);
}
