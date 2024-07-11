package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import i0.a;
import j0.b;

public final class n extends a {
    public final void d(View view, b bVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f5951a;
        AccessibilityNodeInfo accessibilityNodeInfo = bVar.f6386a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
    }
}
