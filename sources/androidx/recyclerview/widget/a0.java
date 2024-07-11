package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public abstract class a0 extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f1742a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1743b = new a();

    public class a extends RecyclerView.s {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1744a = false;

        public a() {
        }

        public final void a(int i10, RecyclerView recyclerView) {
            if (i10 == 0 && this.f1744a) {
                this.f1744a = false;
                a0.this.d();
            }
        }

        public final void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 != 0 || i11 != 0) {
                this.f1744a = true;
            }
        }
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1742a;
        if (recyclerView2 != recyclerView) {
            a aVar = this.f1743b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.x0;
                if (arrayList != null) {
                    arrayList.remove(aVar);
                }
                this.f1742a.setOnFlingListener((RecyclerView.q) null);
            }
            this.f1742a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.f1742a.h(aVar);
                this.f1742a.setOnFlingListener(this);
                new Scroller(this.f1742a.getContext(), new DecelerateInterpolator());
                d();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(RecyclerView.n nVar, View view);

    public abstract View c(RecyclerView.n nVar);

    public final void d() {
        RecyclerView.n layoutManager;
        View c10;
        RecyclerView recyclerView = this.f1742a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (c10 = c(layoutManager)) != null) {
            int[] b10 = b(layoutManager, c10);
            int i10 = b10[0];
            if (i10 != 0 || b10[1] != 0) {
                this.f1742a.b0(i10, b10[1], false);
            }
        }
    }
}
