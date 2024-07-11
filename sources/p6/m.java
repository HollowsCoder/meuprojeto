package p6;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.q0;

public final class m implements AdapterView.OnItemClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ n f7962o;

    public m(n nVar) {
        this.f7962o = nVar;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j8) {
        Object obj;
        int i11;
        View view2 = null;
        n nVar = this.f7962o;
        if (i10 < 0) {
            q0 q0Var = nVar.f7963s;
            if (!q0Var.c()) {
                obj = null;
            } else {
                obj = q0Var.f688q.getSelectedItem();
            }
        } else {
            obj = nVar.getAdapter().getItem(i10);
        }
        n.a(nVar, obj);
        AdapterView.OnItemClickListener onItemClickListener = nVar.getOnItemClickListener();
        q0 q0Var2 = nVar.f7963s;
        if (onItemClickListener != null) {
            if (view == null || i10 < 0) {
                if (q0Var2.c()) {
                    view2 = q0Var2.f688q.getSelectedView();
                }
                view = view2;
                if (!q0Var2.c()) {
                    i11 = -1;
                } else {
                    i11 = q0Var2.f688q.getSelectedItemPosition();
                }
                i10 = i11;
                if (!q0Var2.c()) {
                    j8 = Long.MIN_VALUE;
                } else {
                    j8 = q0Var2.f688q.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(q0Var2.f688q, view, i10, j8);
        }
        q0Var2.dismiss();
    }
}
