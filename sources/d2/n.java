package d2;

import android.content.Intent;
import com.appfab.facematchlive.ui.flow.main.MainActivity;
import com.appfab.facematchlive.ui.flow.selector.ActivitySelector;
import n8.i;
import y8.l;
import z8.h;

public final class n extends h implements l<Boolean, i> {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ MainActivity f4140p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(MainActivity mainActivity) {
        super(1);
        this.f4140p = mainActivity;
    }

    public final Object k(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            int i10 = MainActivity.P;
            MainActivity mainActivity = this.f4140p;
            mainActivity.getClass();
            Intent intent = new Intent(mainActivity, ActivitySelector.class);
            intent.putExtra("camera", false);
            mainActivity.O.E(intent);
        }
        return i.f7501a;
    }
}
