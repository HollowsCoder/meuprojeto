package a2;

import android.widget.TextView;
import com.appfab.facematchlive.ui.flow.custom_ad.CustomAdActivity;
import java.util.concurrent.TimeUnit;
import x1.a;
import z8.g;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ CustomAdActivity f57o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ long f58p;

    public /* synthetic */ e(CustomAdActivity customAdActivity, long j8) {
        this.f57o = customAdActivity;
        this.f58p = j8;
    }

    public final void run() {
        TextView textView;
        CustomAdActivity customAdActivity = this.f57o;
        g.f(customAdActivity, "this$0");
        customAdActivity.F = false;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f58p) % ((long) 60);
        a aVar = customAdActivity.E;
        if (aVar != null) {
            textView = aVar.N0;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(String.valueOf(seconds));
        }
    }
}
