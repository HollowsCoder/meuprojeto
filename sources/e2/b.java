package e2;

import android.app.job.JobParameters;
import android.graphics.Bitmap;
import com.appfab.facematchlive.ui.flow.selector.ActivitySelector;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.util.Set;
import y6.p;
import z8.g;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f4459o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f4460p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f4461q;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f4459o = i10;
        this.f4460p = obj;
        this.f4461q = obj2;
    }

    public final void run() {
        Set set;
        Object obj;
        switch (this.f4459o) {
            case 0:
                Bitmap bitmap = (Bitmap) this.f4460p;
                ActivitySelector activitySelector = (ActivitySelector) this.f4461q;
                int i10 = ActivitySelector.L;
                g.f(activitySelector, "this$0");
                if (bitmap != null) {
                    activitySelector.D().d(bitmap);
                    return;
                } else {
                    activitySelector.finish();
                    return;
                }
            case 1:
                int i11 = JobInfoSchedulerService.f2306o;
                ((JobInfoSchedulerService) this.f4460p).jobFinished((JobParameters) this.f4461q, false);
                return;
            default:
                p pVar = (p) this.f4460p;
                v7.b bVar = (v7.b) this.f4461q;
                synchronized (pVar) {
                    if (pVar.f9593b == null) {
                        set = pVar.f9592a;
                        obj = bVar;
                    } else {
                        set = pVar.f9593b;
                        obj = bVar.get();
                    }
                    set.add(obj);
                }
                return;
        }
    }
}
