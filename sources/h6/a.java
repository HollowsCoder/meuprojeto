package h6;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;
import j0.b;

public final class a extends i0.a {
    public final /* synthetic */ CheckableImageButton d;

    public a(CheckableImageButton checkableImageButton) {
        this.d = checkableImageButton;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.d.isChecked());
    }

    public final void d(View view, b bVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f5951a;
        AccessibilityNodeInfo accessibilityNodeInfo = bVar.f6386a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.f3523s);
        accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
    }
}
