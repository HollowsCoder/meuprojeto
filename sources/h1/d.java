package h1;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

public final class d implements Callable<r<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5113a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f5114b;

    public d(LottieAnimationView lottieAnimationView, int i10) {
        this.f5114b = lottieAnimationView;
        this.f5113a = i10;
    }

    public final Object call() {
        LottieAnimationView lottieAnimationView = this.f5114b;
        boolean z = lottieAnimationView.E;
        Context context = lottieAnimationView.getContext();
        int i10 = this.f5113a;
        if (z) {
            return g.e(i10, context, g.h(context, i10));
        }
        return g.e(i10, context, (String) null);
    }
}
