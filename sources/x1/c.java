package x1;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import ooo.oxo.library.widget.PullBackLayout;

public abstract class c extends ViewDataBinding {
    public final ViewPager2 L0;
    public final PullBackLayout M0;

    public c(View view, ViewPager2 viewPager2, PullBackLayout pullBackLayout) {
        super(view, 0);
        this.L0 = viewPager2;
        this.M0 = pullBackLayout;
    }
}
