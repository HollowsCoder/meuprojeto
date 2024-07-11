package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class y {
    public static int a(RecyclerView.z zVar, s sVar, View view, View view2, RecyclerView.n nVar, boolean z) {
        if (nVar.w() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(RecyclerView.n.G(view) - RecyclerView.n.G(view2)) + 1;
        }
        return Math.min(sVar.l(), sVar.b(view2) - sVar.e(view));
    }

    public static int b(RecyclerView.z zVar, s sVar, View view, View view2, RecyclerView.n nVar, boolean z, boolean z10) {
        if (nVar.w() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z10 ? Math.max(0, (zVar.b() - Math.max(RecyclerView.n.G(view), RecyclerView.n.G(view2))) - 1) : Math.max(0, Math.min(RecyclerView.n.G(view), RecyclerView.n.G(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(sVar.b(view2) - sVar.e(view))) / ((float) (Math.abs(RecyclerView.n.G(view) - RecyclerView.n.G(view2)) + 1)))) + ((float) (sVar.k() - sVar.e(view))));
    }

    public static int c(RecyclerView.z zVar, s sVar, View view, View view2, RecyclerView.n nVar, boolean z) {
        if (nVar.w() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zVar.b();
        }
        return (int) ((((float) (sVar.b(view2) - sVar.e(view))) / ((float) (Math.abs(RecyclerView.n.G(view) - RecyclerView.n.G(view2)) + 1))) * ((float) zVar.b()));
    }
}
