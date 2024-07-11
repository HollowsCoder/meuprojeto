package x1;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e2.d;

public abstract class g extends ViewDataBinding {
    public final RecyclerView L0;
    public final FloatingActionButton M0;
    public final ConstraintLayout N0;
    public d O0;

    public g(View view, RecyclerView recyclerView, FloatingActionButton floatingActionButton, ConstraintLayout constraintLayout) {
        super(view, 0);
        this.L0 = recyclerView;
        this.M0 = floatingActionButton;
        this.N0 = constraintLayout;
    }
}
