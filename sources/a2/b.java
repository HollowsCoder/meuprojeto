package a2;

import android.content.Intent;
import android.view.View;
import com.appfab.facematchlive.ui.flow.custom_ad.CustomAdActivity;
import com.appfab.facematchlive.ui.flow.main.MainActivity;
import d2.n;
import d2.o;
import e.d;
import k2.c;
import z8.g;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f51o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ d f52p;

    public /* synthetic */ b(d dVar, int i10) {
        this.f51o = i10;
        this.f52p = dVar;
    }

    public final void onClick(View view) {
        int i10 = this.f51o;
        d dVar = this.f52p;
        switch (i10) {
            case 0:
                CustomAdActivity customAdActivity = (CustomAdActivity) dVar;
                int i11 = CustomAdActivity.I;
                g.f(customAdActivity, "this$0");
                if (customAdActivity.F) {
                    customAdActivity.setResult(-1, (Intent) null);
                    customAdActivity.finish();
                    return;
                }
                return;
            default:
                MainActivity mainActivity = (MainActivity) dVar;
                int i12 = MainActivity.P;
                g.f(mainActivity, "this$0");
                mainActivity.f();
                new c(mainActivity).a(j2.c.GALLERY_READ_PERMISSION, new n(mainActivity), o.f4141p);
                return;
        }
    }
}
