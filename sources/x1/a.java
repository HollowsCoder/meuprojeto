package x1;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.appfab.facematchlive.data.model.CustomAdAppDataModel;

public abstract class a extends ViewDataBinding {
    public final ImageView L0;
    public final CardView M0;
    public final TextView N0;
    public final ViewPager2 O0;
    public final Button P0;
    public final TextView Q0;
    public final TextView R0;
    public final TextView S0;
    public CustomAdAppDataModel T0;

    public a(View view, ImageView imageView, CardView cardView, TextView textView, ViewPager2 viewPager2, Button button, TextView textView2, TextView textView3, TextView textView4) {
        super(view, 0);
        this.L0 = imageView;
        this.M0 = cardView;
        this.N0 = textView;
        this.O0 = viewPager2;
        this.P0 = button;
        this.Q0 = textView2;
        this.R0 = textView3;
        this.S0 = textView4;
    }

    public abstract void d0(CustomAdAppDataModel customAdAppDataModel);
}
