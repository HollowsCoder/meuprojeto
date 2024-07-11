package a2;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.appfab.facematchlive.ui.flow.custom_ad.CustomAdActivity;
import z8.g;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ CustomAdActivity f53o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f54p;

    public /* synthetic */ c(CustomAdActivity customAdActivity, int i10) {
        this.f53o = customAdActivity;
        this.f54p = i10;
    }

    public final void onClick(View view) {
        int i10 = CustomAdActivity.I;
        CustomAdActivity customAdActivity = this.f53o;
        g.f(customAdActivity, "this$0");
        customAdActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + customAdActivity.G.get(this.f54p).getAppPackageName())));
    }
}
