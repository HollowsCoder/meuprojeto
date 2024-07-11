package h2;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.karumi.dexter.R;
import z8.g;

public final class c extends RecyclerView.m {

    /* renamed from: a  reason: collision with root package name */
    public final int f5219a;

    public c(Context context) {
        this.f5219a = (int) context.getResources().getDimension(R.dimen.viewpager_current_item_horizontal_margin);
    }

    public final void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        g.f(rect, "outRect");
        g.f(view, "view");
        g.f(recyclerView, "parent");
        g.f(zVar, "state");
        int i10 = this.f5219a;
        rect.right = i10;
        rect.left = i10;
    }
}
