package z6;

import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import w6.a;

public final class b implements a.C0152a {

    /* renamed from: a  reason: collision with root package name */
    public b7.b f9934a;

    /* renamed from: b  reason: collision with root package name */
    public b7.b f9935b;

    public final void a(int i10, Bundle bundle) {
        b7.b bVar;
        String format = String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i10), bundle});
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", format, (Throwable) null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                bVar = this.f9934a;
            } else {
                bVar = this.f9935b;
            }
            if (bVar != null) {
                bVar.a(string, bundle2);
            }
        }
    }
}
