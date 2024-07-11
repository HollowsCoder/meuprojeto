package d2;

import android.view.View;
import com.appfab.facematchlive.ui.flow.main.MainActivity;
import k2.c;
import z8.g;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ MainActivity f4131o;

    public /* synthetic */ e(MainActivity mainActivity) {
        this.f4131o = mainActivity;
    }

    public final void onClick(View view) {
        int i10 = MainActivity.P;
        MainActivity mainActivity = this.f4131o;
        g.f(mainActivity, "this$0");
        mainActivity.f();
        new c(mainActivity).a(j2.c.CAMERA_PERMISSION, new l(mainActivity), m.f4139p);
    }
}
