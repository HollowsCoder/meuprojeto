package b8;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import s6.c;
import w6.a;

public final class i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o  reason: collision with root package name */
    public final Set<Intent> f2025o = Collections.newSetFromMap(new WeakHashMap());

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle extras;
        boolean z;
        Intent intent = activity.getIntent();
        if (intent != null && this.f2025o.add(intent) && (extras = intent.getExtras()) != null) {
            Bundle bundle2 = extras.getBundle("gcm.n.analytics_data");
            if (bundle2 == null) {
                z = false;
            } else {
                z = "1".equals(bundle2.getString("google.c.a.e"));
            }
            if (z) {
                if (bundle2 != null) {
                    if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                        c b10 = c.b();
                        b10.a();
                        a aVar = (a) b10.d.a(a.class);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                        }
                        if (aVar != null) {
                            String string = bundle2.getString("google.c.a.c_id");
                            aVar.e(string);
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("source", "Firebase");
                            bundle3.putString("medium", "notification");
                            bundle3.putString("campaign", string);
                            aVar.g("fcm", "_cmp", bundle3);
                        } else {
                            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                        }
                    } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                    }
                }
                o.a("_no", bundle2);
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f2025o.remove(activity.getIntent());
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
