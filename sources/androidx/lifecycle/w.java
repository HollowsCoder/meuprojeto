package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.h;

public final class w extends d {
    final /* synthetic */ v this$0;

    public class a extends d {
        public a() {
        }

        public void onActivityPostResumed(Activity activity) {
            w.this.this$0.a();
        }

        public void onActivityPostStarted(Activity activity) {
            v vVar = w.this.this$0;
            int i10 = vVar.f1405o + 1;
            vVar.f1405o = i10;
            if (i10 == 1 && vVar.f1408r) {
                vVar.f1410t.e(h.b.ON_START);
                vVar.f1408r = false;
            }
        }
    }

    public w(v vVar) {
        this.this$0 = vVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = x.f1414p;
            ((x) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f1415o = this.this$0.f1411v;
        }
    }

    public void onActivityPaused(Activity activity) {
        v vVar = this.this$0;
        int i10 = vVar.f1406p - 1;
        vVar.f1406p = i10;
        if (i10 == 0) {
            vVar.f1409s.postDelayed(vVar.u, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new a());
    }

    public void onActivityStopped(Activity activity) {
        v vVar = this.this$0;
        int i10 = vVar.f1405o - 1;
        vVar.f1405o = i10;
        if (i10 == 0 && vVar.f1407q) {
            vVar.f1410t.e(h.b.ON_STOP);
            vVar.f1408r = true;
        }
    }
}
