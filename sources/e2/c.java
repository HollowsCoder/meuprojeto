package e2;

import android.graphics.Bitmap;
import com.appfab.facematchlive.ui.flow.selector.ActivitySelector;
import java.util.Map;
import s7.a;
import s7.b;
import z8.g;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f4462o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f4463p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f4464q;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f4462o = i10;
        this.f4463p = obj;
        this.f4464q = obj2;
    }

    public final void run() {
        int i10 = this.f4462o;
        Object obj = this.f4464q;
        Object obj2 = this.f4463p;
        switch (i10) {
            case 0:
                Bitmap bitmap = (Bitmap) obj2;
                ActivitySelector activitySelector = (ActivitySelector) obj;
                int i11 = ActivitySelector.L;
                g.f(activitySelector, "this$0");
                if (bitmap != null) {
                    activitySelector.D().d(bitmap);
                    return;
                } else {
                    activitySelector.finish();
                    return;
                }
            default:
                ((b) ((Map.Entry) obj2).getKey()).a((a) obj);
                return;
        }
    }
}
