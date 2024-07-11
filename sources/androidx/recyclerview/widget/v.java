package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.b;

public final class v implements b.C0021b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1865a;

    public v(RecyclerView recyclerView) {
        this.f1865a = recyclerView;
    }

    public final int a() {
        return this.f1865a.getChildCount();
    }

    public final void b(int i10) {
        RecyclerView recyclerView = this.f1865a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.o(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
