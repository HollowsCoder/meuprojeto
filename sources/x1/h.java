package x1;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseIntArray;
import com.appfab.facematchlive.ui.flow.selector.ActivitySelector;
import com.karumi.dexter.R;
import e2.d;
import j2.b;
import v1.e;
import y1.a;

public final class h extends g implements a.C0163a {
    public static final SparseIntArray R0;
    public final a P0;
    public long Q0 = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R0 = sparseIntArray;
        sparseIntArray.put(R.id.appBar, 2);
        sparseIntArray.put(R.id.actionlay, 3);
        sparseIntArray.put(R.id.textView, 4);
        sparseIntArray.put(R.id.guideline5, 5);
        sparseIntArray.put(R.id.gallery_recycle, 6);
        sparseIntArray.put(R.id.selectorProgressLay, 7);
        sparseIntArray.put(R.id.view2, 8);
        sparseIntArray.put(R.id.selectorPB, 9);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.view.View r8) {
        /*
            r7 = this;
            android.util.SparseIntArray r0 = R0
            r1 = 10
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a0(r8, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 2
            r1 = r0[r1]
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            r1 = 6
            r1 = r0[r1]
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r3 = 5
            r3 = r0[r3]
            androidx.constraintlayout.widget.Guideline r3 = (androidx.constraintlayout.widget.Guideline) r3
            r3 = 1
            r4 = r0[r3]
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            r5 = 9
            r5 = r0[r5]
            android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5
            r5 = 7
            r5 = r0[r5]
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r6 = 4
            r6 = r0[r6]
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6 = 8
            r6 = r0[r6]
            android.view.View r6 = (android.view.View) r6
            r7.<init>(r8, r1, r4, r5)
            r4 = -1
            r7.Q0 = r4
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r7.M0
            r0.setTag(r2)
            r0 = 2131361963(0x7f0a00ab, float:1.8343693E38)
            r8.setTag(r0, r7)
            y1.a r8 = new y1.a
            r8.<init>(r7, r3)
            r7.P0 = r8
            r7.Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.h.<init>(android.view.View):void");
    }

    public final void T() {
        long j8;
        synchronized (this) {
            j8 = this.Q0;
            this.Q0 = 0;
        }
        if ((j8 & 2) != 0) {
            this.M0.setOnClickListener(this.P0);
        }
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
        if (4 != i10) {
            return false;
        }
        this.O0 = (d) eVar;
        synchronized (this) {
            this.Q0 |= 1;
        }
        synchronized (this) {
        }
        b0();
        return true;
    }

    public final void e(int i10) {
        boolean z;
        String str;
        d dVar = this.O0;
        if (dVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        if (dVar.f4467g == null) {
            ActivitySelector activitySelector = dVar.d;
            if (activitySelector != null) {
                String string = activitySelector.getString(R.string.face_selection);
                ActivitySelector activitySelector2 = dVar.d;
                if (activitySelector2 != null) {
                    str = activitySelector2.getString(R.string.face_selection_desc);
                } else {
                    str = null;
                }
                activitySelector.F(string, str, b.ERROR);
                return;
            }
            return;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putSerializable("face", dVar.f4467g);
        intent.putExtras(bundle);
        ActivitySelector activitySelector3 = dVar.d;
        if (activitySelector3 != null) {
            activitySelector3.setResult(-1, intent);
        }
        ActivitySelector activitySelector4 = dVar.d;
        if (activitySelector4 != null) {
            activitySelector4.finish();
        }
    }
}
