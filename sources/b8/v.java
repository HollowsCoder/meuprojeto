package b8;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;

public final class v {

    /* renamed from: e  reason: collision with root package name */
    public static v f2047e;

    /* renamed from: a  reason: collision with root package name */
    public String f2048a = null;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f2049b = null;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f2050c = null;
    public final ArrayDeque d = new ArrayDeque();

    public static synchronized v a() {
        v vVar;
        synchronized (v.class) {
            if (f2047e == null) {
                f2047e = new v();
            }
            vVar = f2047e;
        }
        return vVar;
    }

    public final boolean b(Context context) {
        if (this.f2050c == null) {
            this.f2050c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f2049b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f2050c.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.f2049b == null) {
            this.f2049b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f2049b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f2049b.booleanValue();
    }
}
