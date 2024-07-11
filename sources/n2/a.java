package n2;

import android.view.View;
import androidx.activity.result.c;
import androidx.viewpager2.widget.ViewPager2;

public final class a extends c implements ViewPager2.g {
    public final void t(View view, float f10) {
        if (f10 >= -1.0f || f10 <= 1.0f) {
            float height = (float) view.getHeight();
            float max = Math.max(0.85f, 1.0f - Math.abs(f10));
            float f11 = 1.0f - max;
            float f12 = (height * f11) / 2.0f;
            float width = (((float) view.getWidth()) * f11) / 2.0f;
            view.setPivotY(height * 0.5f);
            if (f10 < 0.0f) {
                view.setTranslationX(width - (f12 / 2.0f));
            } else {
                view.setTranslationX((f12 / 2.0f) + (-width));
            }
            view.setScaleX(max);
            view.setScaleY(max);
            view.setAlpha((((max - 0.85f) / 0.14999998f) * 0.5f) + 0.5f);
        }
    }
}
