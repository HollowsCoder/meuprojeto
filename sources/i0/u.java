package i0;

import android.text.TextUtils;
import android.view.View;
import com.karumi.dexter.R;
import i0.w;

public final class u extends w.b<CharSequence> {
    public u() {
        super(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public final Object b(View view) {
        return w.l.b(view);
    }

    public final void c(View view, Object obj) {
        w.l.h(view, (CharSequence) obj);
    }

    public final boolean f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
