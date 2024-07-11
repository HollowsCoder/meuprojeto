package x1;

import android.util.SparseIntArray;
import com.appfab.facematchlive.data.model.CustomAdAppDataModel;
import com.karumi.dexter.R;
import p0.a;
import v1.e;

public final class b extends a {
    public static final SparseIntArray V0;
    public long U0 = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V0 = sparseIntArray;
        sparseIntArray.put(R.id.installButton, 4);
        sparseIntArray.put(R.id.closeCV, 5);
        sparseIntArray.put(R.id.counterText, 6);
        sparseIntArray.put(R.id.constraintLayout3, 7);
        sparseIntArray.put(R.id.cardView5, 8);
        sparseIntArray.put(R.id.appImage, 9);
        sparseIntArray.put(R.id.customAdImagesVP, 10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.view.View r14) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = V0
            r1 = 11
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a0(r14, r1, r2, r0)
            r1 = 9
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 8
            r1 = r0[r1]
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            androidx.cardview.widget.CardView r6 = (androidx.cardview.widget.CardView) r6
            r1 = 7
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 6
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 10
            r1 = r0[r1]
            r8 = r1
            androidx.viewpager2.widget.ViewPager2 r8 = (androidx.viewpager2.widget.ViewPager2) r8
            r1 = 4
            r1 = r0[r1]
            r9 = r1
            android.widget.Button r9 = (android.widget.Button) r9
            r1 = 1
            r1 = r0[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 2
            r1 = r0[r1]
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1 = 3
            r1 = r0[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r3 = r13
            r4 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r3 = -1
            r13.U0 = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            android.widget.TextView r0 = r13.Q0
            r0.setTag(r2)
            android.widget.TextView r0 = r13.R0
            r0.setTag(r2)
            android.widget.TextView r0 = r13.S0
            r0.setTag(r2)
            r0 = 2131361963(0x7f0a00ab, float:1.8343693E38)
            r14.setTag(r0, r13)
            r13.Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.b.<init>(android.view.View):void");
    }

    public final void T() {
        long j8;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j8 = this.U0;
            this.U0 = 0;
        }
        CustomAdAppDataModel customAdAppDataModel = this.T0;
        int i10 = ((j8 & 3) > 0 ? 1 : ((j8 & 3) == 0 ? 0 : -1));
        if (i10 == 0 || customAdAppDataModel == null) {
            str3 = null;
            str2 = null;
            str = null;
        } else {
            str3 = customAdAppDataModel.getAppDownloadCount();
            str2 = customAdAppDataModel.getAppName();
            str = customAdAppDataModel.getAppProvider();
        }
        if (i10 != 0) {
            a.a(this.Q0, str2);
            a.a(this.R0, str);
            a.a(this.S0, str3);
        }
    }

    public final boolean X() {
        synchronized (this) {
            return this.U0 != 0;
        }
    }

    public final void Y() {
        synchronized (this) {
            this.U0 = 2;
        }
        b0();
    }

    public final boolean c0(int i10, e eVar) {
        if (1 != i10) {
            return false;
        }
        d0((CustomAdAppDataModel) eVar);
        return true;
    }

    public final void d0(CustomAdAppDataModel customAdAppDataModel) {
        this.T0 = customAdAppDataModel;
        synchronized (this) {
            this.U0 |= 1;
        }
        synchronized (this) {
        }
        b0();
    }
}
