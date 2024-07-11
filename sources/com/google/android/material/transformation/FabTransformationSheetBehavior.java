package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.HashMap;
import java.util.WeakHashMap;
import n.e;
import s5.g;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    public HashMap f3696i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void s(View view, View view2, boolean z, boolean z10) {
        boolean z11;
        int i10;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f3696i = new HashMap(childCount);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (!(childAt.getLayoutParams() instanceof CoordinatorLayout.f) || !(((CoordinatorLayout.f) childAt.getLayoutParams()).f942a instanceof FabTransformationScrimBehavior)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (childAt != view2 && !z11) {
                    HashMap hashMap = this.f3696i;
                    if (z) {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, b0> weakHashMap = w.f6004a;
                        i10 = 4;
                    } else if (hashMap != null && hashMap.containsKey(childAt)) {
                        i10 = ((Integer) this.f3696i.get(childAt)).intValue();
                        WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
                    }
                    w.d.s(childAt, i10);
                }
            }
            if (!z) {
                this.f3696i = null;
            }
        }
        super.s(view, view2, z, z10);
    }

    public final FabTransformationBehavior.b z(Context context, boolean z) {
        int i10 = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f3691a = g.b(context, i10);
        bVar.f3692b = new e();
        return bVar;
    }
}
