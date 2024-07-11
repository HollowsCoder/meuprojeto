package f2;

import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.appfab.facematchlive.data.model.GalleryModel;
import com.karumi.dexter.R;
import e2.d;
import java.util.List;
import x1.s;

public final class c extends RecyclerView.f<a> {
    public final List<GalleryModel> d;

    /* renamed from: e  reason: collision with root package name */
    public final l2.a f4594e;

    public static class a extends RecyclerView.c0 {
        public final s u;

        public a(s sVar) {
            super(sVar.B0);
            this.u = sVar;
        }
    }

    public c(List list, d.a aVar) {
        this.d = list;
        this.f4594e = aVar;
    }

    public final int a() {
        return this.d.size();
    }

    public final void d(RecyclerView.c0 c0Var, int i10) {
        s sVar = ((a) c0Var).u;
        sVar.d0(this.d.get(i10));
        sVar.N0.setOnClickListener(new a(this, i10));
        sVar.L0.setOnClickListener(new b(this, i10));
    }

    public final RecyclerView.c0 e(RecyclerView recyclerView) {
        return new a((s) androidx.databinding.c.c(LayoutInflater.from(recyclerView.getContext()), R.layout.item_faces, recyclerView));
    }
}
