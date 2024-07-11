package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

public final class p0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ q0 f681o;

    public p0(q0 q0Var) {
        this.f681o = q0Var;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j8) {
        l0 l0Var;
        if (i10 != -1 && (l0Var = this.f681o.f688q) != null) {
            l0Var.setListSelectionHidden(false);
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
