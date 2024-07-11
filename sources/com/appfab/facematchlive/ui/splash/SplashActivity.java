package com.appfab.facematchlive.ui.splash;

import a2.d;
import android.os.Handler;
import androidx.lifecycle.b0;
import com.appfab.facematchlive.data.model.CurrentConfigModel;
import com.karumi.dexter.R;
import java.lang.ref.WeakReference;
import v1.b;
import v1.e;
import x1.i;

public final class SplashActivity extends b<i, g2.b> {
    public static final /* synthetic */ int I = 0;
    public final CurrentConfigModel H = new CurrentConfigModel(0, 0);

    public final int B() {
        return 5;
    }

    public final int C() {
        return R.layout.activity_splash;
    }

    public final e D() {
        return (g2.b) new b0(this).a(g2.b.class);
    }

    public final void E() {
        ((g2.b) new b0(this).a(g2.b.class)).f9121c = new WeakReference<>(this);
        new Handler(getMainLooper()).postDelayed(new androidx.activity.b(3, this), 1000);
    }

    public final void G() {
        new Handler(getMainLooper()).postDelayed(new d(1, this), 1000);
    }
}
