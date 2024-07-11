package j0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6400a;

    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final c f6401a;

        public a(c cVar) {
            this.f6401a = cVar;
        }

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            b a10 = this.f6401a.a(i10);
            if (a10 == null) {
                return null;
            }
            return a10.f6386a;
        }

        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            this.f6401a.getClass();
            return null;
        }

        public final boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f6401a.c(i10, i11, bundle);
        }
    }

    public static class b extends a {
        public b(c cVar) {
            super(cVar);
        }

        public final AccessibilityNodeInfo findFocus(int i10) {
            b b10 = this.f6401a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.f6386a;
        }
    }

    /* renamed from: j0.c$c  reason: collision with other inner class name */
    public static class C0085c extends b {
        public C0085c(c cVar) {
            super(cVar);
        }

        public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f6401a.getClass();
        }
    }

    public c() {
        this.f6400a = Build.VERSION.SDK_INT >= 26 ? new C0085c(this) : new b(this);
    }

    public c(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f6400a = accessibilityNodeProvider;
    }

    public b a(int i10) {
        return null;
    }

    public b b(int i10) {
        return null;
    }

    public boolean c(int i10, int i11, Bundle bundle) {
        return false;
    }
}
