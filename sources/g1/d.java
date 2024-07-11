package g1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class d implements RecyclerView.p {
    public final void a(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        if (oVar.width != -1 || oVar.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    public final void b() {
    }
}
