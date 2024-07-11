package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.h;

public final class x extends Fragment {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f1414p = 0;

    /* renamed from: o  reason: collision with root package name */
    public a f1415o;

    public interface a {
    }

    public static class b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            x.a(activity, h.b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            x.a(activity, h.b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            x.a(activity, h.b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            x.a(activity, h.b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            x.a(activity, h.b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            x.a(activity, h.b.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Activity activity, h.b bVar) {
        if (activity instanceof p) {
            ((p) activity).d().e(bVar);
        } else if (activity instanceof n) {
            o r5 = ((n) activity).r();
            if (r5 instanceof o) {
                r5.e(bVar);
            }
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new x(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(h.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(h.b.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        b(h.b.ON_DESTROY);
        this.f1415o = null;
    }

    public final void onPause() {
        super.onPause();
        b(h.b.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        a aVar = this.f1415o;
        if (aVar != null) {
            v.this.a();
        }
        b(h.b.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        a aVar = this.f1415o;
        if (aVar != null) {
            v vVar = v.this;
            int i10 = vVar.f1405o + 1;
            vVar.f1405o = i10;
            if (i10 == 1 && vVar.f1408r) {
                vVar.f1410t.e(h.b.ON_START);
                vVar.f1408r = false;
            }
        }
        b(h.b.ON_START);
    }

    public final void onStop() {
        super.onStop();
        b(h.b.ON_STOP);
    }
}
