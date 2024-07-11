package i0;

import android.view.View;
import com.karumi.dexter.R;
import i0.w;

public final class v extends w.b<Boolean> {
    public v() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    public final Object b(View view) {
        return Boolean.valueOf(w.l.c(view));
    }

    public final void c(View view, Object obj) {
        w.l.g(view, ((Boolean) obj).booleanValue());
    }

    public final boolean f(Object obj, Object obj2) {
        return !w.b.a((Boolean) obj, (Boolean) obj2);
    }
}
