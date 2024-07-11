package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f1392a = new AtomicBoolean(false);

    public static class a extends d {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            x.c(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }
}
