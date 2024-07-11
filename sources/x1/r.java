package x1;

import android.util.SparseIntArray;
import com.karumi.dexter.R;
import v1.e;

public final class r extends q {
    public static final SparseIntArray N0;
    public long M0 = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N0 = sparseIntArray;
        sparseIntArray.put(R.id.expand_image, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = N0
            r1 = 2
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a0(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            com.github.chrisbanes.photoview.PhotoView r1 = (com.github.chrisbanes.photoview.PhotoView) r1
            r5.<init>(r6, r1)
            r3 = -1
            r5.M0 = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r0 = 2131361963(0x7f0a00ab, float:1.8343693E38)
            r6.setTag(r0, r5)
            r5.Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.r.<init>(android.view.View):void");
    }

    public final void T() {
        synchronized (this) {
            this.M0 = 0;
        }
    }

    public final boolean X() {
        synchronized (this) {
            return this.M0 != 0;
        }
    }

    public final void Y() {
        synchronized (this) {
            this.M0 = 1;
        }
        b0();
    }

    public final boolean c0(int i10, e eVar) {
        return true;
    }
}
