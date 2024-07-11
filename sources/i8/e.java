package i8;

import android.view.ViewGroup;
import android.view.ViewParent;

public final class e implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ a f6147o;

    public e(a aVar) {
        this.f6147o = aVar;
    }

    public final void run() {
        a aVar = this.f6147o;
        if (aVar != null) {
            ViewParent parent = aVar.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(aVar);
            }
        }
    }
}
