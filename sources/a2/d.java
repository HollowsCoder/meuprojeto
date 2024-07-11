package a2;

import android.content.Intent;
import android.widget.TextView;
import com.appfab.facematchlive.ui.flow.custom_ad.CustomAdActivity;
import com.appfab.facematchlive.ui.flow.main.MainActivity;
import com.appfab.facematchlive.ui.splash.SplashActivity;
import com.google.gson.Gson;
import h2.b;
import x1.a;
import z3.o;
import z8.g;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f55o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f56p;

    public /* synthetic */ d(int i10, Object obj) {
        this.f55o = i10;
        this.f56p = obj;
    }

    public final void run() {
        TextView textView;
        int i10 = this.f55o;
        Object obj = this.f56p;
        switch (i10) {
            case 0:
                CustomAdActivity customAdActivity = (CustomAdActivity) obj;
                g.f(customAdActivity, "this$0");
                customAdActivity.F = true;
                a aVar = customAdActivity.E;
                if (aVar != null) {
                    textView = aVar.N0;
                } else {
                    textView = null;
                }
                if (textView != null) {
                    textView.setText("X");
                    return;
                }
                return;
            case 1:
                SplashActivity splashActivity = (SplashActivity) obj;
                int i11 = SplashActivity.I;
                g.f(splashActivity, "this$0");
                Intent intent = new Intent(splashActivity, MainActivity.class);
                Gson gson = b.f5218a;
                intent.addFlags(268435456);
                intent.addFlags(335577088);
                splashActivity.startActivity(intent);
                return;
            case 2:
                o oVar = (o) obj;
                oVar.getClass();
                oVar.d.c(new d2.b(6, oVar));
                return;
            default:
                Object obj2 = w7.d.f9271m;
                ((w7.d) obj).b(false);
                return;
        }
    }
}
