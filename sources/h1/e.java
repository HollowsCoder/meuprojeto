package h1;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class e implements Callable<r<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f5115a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f5116b;

    public e(LottieAnimationView lottieAnimationView, String str) {
        this.f5116b = lottieAnimationView;
        this.f5115a = str;
    }

    public final Object call() {
        LottieAnimationView lottieAnimationView = this.f5116b;
        boolean z = lottieAnimationView.E;
        Context context = lottieAnimationView.getContext();
        String str = this.f5115a;
        if (!z) {
            return g.b(context, str, (String) null);
        }
        HashMap hashMap = g.f5130a;
        return g.b(context, str, "asset_" + str);
    }
}
