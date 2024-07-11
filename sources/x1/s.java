package x1;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.appfab.facematchlive.data.model.GalleryModel;

public abstract class s extends ViewDataBinding {
    public final ImageView L0;
    public final ImageView M0;
    public final ConstraintLayout N0;
    public final View O0;
    public GalleryModel P0;

    public s(View view, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, View view2) {
        super(view, 0);
        this.L0 = imageView;
        this.M0 = imageView2;
        this.N0 = constraintLayout;
        this.O0 = view2;
    }

    public abstract void d0(GalleryModel galleryModel);
}
