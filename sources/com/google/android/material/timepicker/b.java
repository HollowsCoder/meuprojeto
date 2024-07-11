package com.google.android.material.timepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.karumi.dexter.R;
import i0.a;
import j0.b;

public final class b extends a {
    public final /* synthetic */ ClockFaceView d;

    public b(ClockFaceView clockFaceView) {
        this.d = clockFaceView;
    }

    public final void d(View view, j0.b bVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f5951a;
        AccessibilityNodeInfo accessibilityNodeInfo = bVar.f6386a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter(this.d.K.get(intValue - 1));
        }
        bVar.h(b.C0084b.a(0, 1, intValue, 1, view.isSelected()));
    }
}
