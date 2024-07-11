package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

public final class i1 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        j1 j1Var = j1.f607x;
        if (j1Var != null && j1Var.f609o == view) {
            j1.b((j1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            j1 j1Var2 = j1.f608y;
            if (j1Var2 != null && j1Var2.f609o == view) {
                j1Var2.a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new j1(view, charSequence);
    }
}
