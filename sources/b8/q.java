package b8;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import m5.j;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Context f2041o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f2042p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ j f2043q;

    public /* synthetic */ q(Context context, boolean z, j jVar) {
        this.f2041o = context;
        this.f2042p = z;
        this.f2043q = jVar;
    }

    public final void run() {
        boolean z;
        String str;
        Context context = this.f2041o;
        j jVar = this.f2043q;
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String valueOf = String.valueOf(context.getPackageName());
                if (valueOf.length() != 0) {
                    str = "error configuring notification delegate for package ".concat(valueOf);
                } else {
                    str = new String("error configuring notification delegate for package ");
                }
                Log.e("FirebaseMessaging", str);
            } else {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                SharedPreferences.Editor edit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("proxy_notification_initialized", true);
                edit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (this.f2042p) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate((String) null);
                }
            }
        } finally {
            jVar.c((Object) null);
        }
    }
}
