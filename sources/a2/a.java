package a2;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.appfab.facematchlive.ui.flow.custom_ad.CustomAdActivity;

public final /* synthetic */ class a implements ViewPager2.g {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ float f50o;

    public /* synthetic */ a(float f10) {
        this.f50o = f10;
    }

    public final void f(View view, float f10) {
        int i10 = CustomAdActivity.I;
        view.setTranslationX((-this.f50o) * f10);
        view.setScaleY(((float) 1) - (Math.abs(f10) * 0.25f));
    }
}
