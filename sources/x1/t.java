package x1;

import android.util.SparseIntArray;
import com.appfab.facematchlive.data.model.GalleryModel;
import com.karumi.dexter.R;
import v1.e;

public final class t extends s {
    public static final SparseIntArray R0;
    public long Q0 = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R0 = sparseIntArray;
        sparseIntArray.put(R.id.gallery_lay, 3);
        sparseIntArray.put(R.id.guideline7, 4);
        sparseIntArray.put(R.id.guideline6, 5);
        sparseIntArray.put(R.id.expand_face_image, 6);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t(android.view.View r10) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = R0
            r1 = 7
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a0(r10, r1, r2, r0)
            r1 = 6
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 1
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r1 = 5
            r1 = r0[r1]
            androidx.constraintlayout.widget.Guideline r1 = (androidx.constraintlayout.widget.Guideline) r1
            r1 = 4
            r1 = r0[r1]
            androidx.constraintlayout.widget.Guideline r1 = (androidx.constraintlayout.widget.Guideline) r1
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            android.view.View r8 = (android.view.View) r8
            r3 = r9
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = -1
            r9.Q0 = r3
            android.widget.ImageView r1 = r9.M0
            r1.setTag(r2)
            r1 = 0
            r0 = r0[r1]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setTag(r2)
            android.view.View r0 = r9.O0
            r0.setTag(r2)
            r0 = 2131361963(0x7f0a00ab, float:1.8343693E38)
            r10.setTag(r0, r9)
            r9.Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.t.<init>(android.view.View):void");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T() {
        /*
            r12 = this;
            monitor-enter(r12)
            long r0 = r12.Q0     // Catch:{ all -> 0x0069 }
            r2 = 0
            r12.Q0 = r2     // Catch:{ all -> 0x0069 }
            monitor-exit(r12)     // Catch:{ all -> 0x0069 }
            com.appfab.facematchlive.data.model.GalleryModel r4 = r12.P0
            r5 = 3
            long r7 = r0 & r5
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r8 = 0
            r9 = 0
            if (r7 == 0) goto L_0x0038
            if (r4 == 0) goto L_0x001e
            boolean r8 = r4.getSelected()
            java.lang.String r9 = r4.getImage()
        L_0x001e:
            if (r7 == 0) goto L_0x0028
            if (r8 == 0) goto L_0x0025
            r10 = 8
            goto L_0x0027
        L_0x0025:
            r10 = 4
        L_0x0027:
            long r0 = r0 | r10
        L_0x0028:
            android.view.View r4 = r12.O0
            if (r8 == 0) goto L_0x0030
            r7 = 2131099718(0x7f060046, float:1.7811797E38)
            goto L_0x0033
        L_0x0030:
            r7 = 2131099720(0x7f060048, float:1.7811801E38)
        L_0x0033:
            int r4 = androidx.databinding.ViewDataBinding.W(r4, r7)
            r8 = r4
        L_0x0038:
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0068
            android.widget.ImageView r0 = r12.M0
            java.lang.String r1 = "imageView"
            z8.g.f(r0, r1)
            if (r9 != 0) goto L_0x004d
            r1 = 2131230866(0x7f080092, float:1.8077797E38)
            r0.setImageResource(r1)
            goto L_0x0059
        L_0x004d:
            java.io.File r1 = new java.io.File
            r1.<init>(r9)
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            r0.setImageURI(r1)
        L_0x0059:
            int r0 = androidx.databinding.ViewDataBinding.H0
            r1 = 21
            if (r0 < r1) goto L_0x0068
            android.view.View r0 = r12.O0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r8)
            r0.setBackgroundTintList(r1)
        L_0x0068:
            return
        L_0x0069:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0069 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.t.T():void");
    }

    public final boolean X() {
        synchronized (this) {
            return this.Q0 != 0;
        }
    }

    public final void Y() {
        synchronized (this) {
            this.Q0 = 2;
        }
        b0();
    }

    public final boolean c0(int i10, e eVar) {
        if (2 != i10) {
            return false;
        }
        d0((GalleryModel) eVar);
        return true;
    }

    public final void d0(GalleryModel galleryModel) {
        this.P0 = galleryModel;
        synchronized (this) {
            this.Q0 |= 1;
        }
        synchronized (this) {
        }
        b0();
    }
}
