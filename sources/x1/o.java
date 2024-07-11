package x1;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

public abstract class o extends ViewDataBinding {
    public final ConstraintLayout L0;
    public final ImageView M0;

    public o(View view, ConstraintLayout constraintLayout, ImageView imageView) {
        super(view, 0);
        this.L0 = constraintLayout;
        this.M0 = imageView;
    }
}
