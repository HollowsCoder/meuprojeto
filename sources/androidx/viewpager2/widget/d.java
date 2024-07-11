package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

public final class d extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f1924a;

    public d(ViewPager2 viewPager2) {
        this.f1924a = viewPager2;
    }

    public final void a(int i10) {
        if (i10 == 0) {
            this.f1924a.c();
        }
    }

    public final void c(int i10) {
        ViewPager2 viewPager2 = this.f1924a;
        if (viewPager2.f1888q != i10) {
            viewPager2.f1888q = i10;
            viewPager2.G.b();
        }
    }
}
