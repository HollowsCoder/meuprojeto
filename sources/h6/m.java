package h6;

import android.view.View;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;

public final class m implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.h.c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
