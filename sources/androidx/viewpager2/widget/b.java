package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

public final class b extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayoutManager f1908a;

    /* renamed from: b  reason: collision with root package name */
    public ViewPager2.g f1909b;

    public b(LinearLayoutManager linearLayoutManager) {
        this.f1908a = linearLayoutManager;
    }

    public final void a(int i10) {
    }

    public final void b(float f10, int i10, int i11) {
        if (this.f1909b != null) {
            float f11 = -f10;
            int i12 = 0;
            while (true) {
                LinearLayoutManager linearLayoutManager = this.f1908a;
                if (i12 < linearLayoutManager.w()) {
                    View v10 = linearLayoutManager.v(i12);
                    if (v10 != null) {
                        this.f1909b.f(v10, ((float) (RecyclerView.n.G(v10) - i10)) + f11);
                        i12++;
                    } else {
                        throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i12), Integer.valueOf(linearLayoutManager.w())}));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void c(int i10) {
    }
}
