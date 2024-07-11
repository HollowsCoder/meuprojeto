package d2;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.appfab.facematchlive.ui.flow.main.MainActivity;
import java.util.Arrays;
import z8.g;

public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextView f4132a;

    public /* synthetic */ f(TextView textView) {
        this.f4132a = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = MainActivity.P;
        TextView textView = this.f4132a;
        g.f(textView, "$textview");
        g.f(valueAnimator, "animation");
        String format = String.format("%.1f", Arrays.copyOf(new Object[]{valueAnimator.getAnimatedValue()}, 1));
        g.e(format, "format(this, *args)");
        textView.setText("%".concat(format));
    }
}
