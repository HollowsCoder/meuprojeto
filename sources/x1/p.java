package x1;

import android.util.SparseIntArray;
import com.karumi.dexter.R;
import v1.e;

public final class p extends o {
    public static final SparseIntArray O0;
    public long N0 = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O0 = sparseIntArray;
        sparseIntArray.put(R.id.customAdImage, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p(android.view.View r5) {
        /*
            r4 = this;
            android.util.SparseIntArray r0 = O0
            r1 = 2
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a0(r5, r1, r2, r0)
            r1 = 0
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r3 = 1
            r0 = r0[r3]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.<init>(r5, r1, r0)
            r0 = -1
            r4.N0 = r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r4.L0
            r0.setTag(r2)
            r0 = 2131361963(0x7f0a00ab, float:1.8343693E38)
            r5.setTag(r0, r4)
            r4.Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.p.<init>(android.view.View):void");
    }

    public final void T() {
        synchronized (this) {
            this.N0 = 0;
        }
    }

    public final boolean X() {
        synchronized (this) {
            return this.N0 != 0;
        }
    }

    public final void Y() {
        synchronized (this) {
            this.N0 = 1;
        }
        b0();
    }

    public final boolean c0(int i10, e eVar) {
        return true;
    }
}
