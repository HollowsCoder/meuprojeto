package d2;

import android.content.Intent;
import com.appfab.facematchlive.ui.flow.main.MainActivity;
import com.appfab.facematchlive.ui.flow.selector.ActivitySelector;
import n8.i;
import z8.h;

public final class l extends h implements y8.l<Boolean, i> {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ MainActivity f4138p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(MainActivity mainActivity) {
        super(1);
        this.f4138p = mainActivity;
    }

    public final Object k(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            int i10 = MainActivity.P;
            MainActivity mainActivity = this.f4138p;
            mainActivity.getClass();
            Intent intent = new Intent(mainActivity, ActivitySelector.class);
            intent.putExtra("camera", true);
            mainActivity.O.E(intent);
        }
        return i.f7501a;
    }
}
