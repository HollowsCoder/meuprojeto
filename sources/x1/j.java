package x1;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.karumi.dexter.R;
import g2.b;
import v1.e;

public final class j extends i {
    public static final SparseIntArray M0;
    public long L0 = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M0 = sparseIntArray;
        sparseIntArray.put(R.id.imageView, 1);
        sparseIntArray.put(R.id.textView4, 2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(View view) {
        super(view);
        Object[] a02 = ViewDataBinding.a0(view, 3, (ViewDataBinding.c) null, M0);
        ImageView imageView = (ImageView) a02[1];
        TextView textView = (TextView) a02[2];
        ((ConstraintLayout) a02[0]).setTag((Object) null);
        view.setTag(R.id.dataBinding, this);
        Y();
    }

    public final void T() {
        synchronized (this) {
            this.L0 = 0;
        }
    }

    public final boolean X() {
        synchronized (this) {
            return this.L0 != 0;
        }
    }

    public final void Y() {
        synchronized (this) {
            this.L0 = 2;
        }
        b0();
    }

    public final boolean c0(int i10, e eVar) {
        if (5 != i10) {
            return false;
        }
        b bVar = (b) eVar;
        return true;
    }
}
