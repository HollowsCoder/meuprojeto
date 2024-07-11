package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

public final class e extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f1925a;

    public e(ViewPager2 viewPager2) {
        this.f1925a = viewPager2;
    }

    public final void c(int i10) {
        ViewPager2 viewPager2 = this.f1925a;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.w.requestFocus(2);
        }
    }
}
