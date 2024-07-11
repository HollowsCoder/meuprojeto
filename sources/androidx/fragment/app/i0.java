package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

public final class i0 extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rect f1187a;

    public i0(Rect rect) {
        this.f1187a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.f1187a;
    }
}
