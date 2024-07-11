package c7;

import android.util.Log;

public final class c implements b {
    public final void e(a aVar) {
        boolean z;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", (Throwable) null);
        }
    }
}
