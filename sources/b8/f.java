package b8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f2010a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f2011b;

    public /* synthetic */ f(Context context, Intent intent) {
        this.f2010a = context;
        this.f2011b = intent;
    }

    public final Object call() {
        String str;
        int i10;
        ComponentName componentName;
        String str2;
        String str3;
        String str4;
        Context context = this.f2010a;
        Intent intent = this.f2011b;
        v a10 = v.a();
        a10.getClass();
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        a10.d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (a10) {
            str = a10.f2048a;
            if (str == null) {
                ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                if (resolveService != null) {
                    ServiceInfo serviceInfo = resolveService.serviceInfo;
                    if (serviceInfo != null) {
                        if (context.getPackageName().equals(serviceInfo.packageName)) {
                            String str5 = serviceInfo.name;
                            if (str5 != null) {
                                if (str5.startsWith(".")) {
                                    String valueOf = String.valueOf(context.getPackageName());
                                    String valueOf2 = String.valueOf(serviceInfo.name);
                                    if (valueOf2.length() != 0) {
                                        str = valueOf.concat(valueOf2);
                                    } else {
                                        str = new String(valueOf);
                                    }
                                } else {
                                    str = serviceInfo.name;
                                }
                                a10.f2048a = str;
                            }
                        }
                        String str6 = serviceInfo.packageName;
                        String str7 = serviceInfo.name;
                        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 94 + String.valueOf(str7).length());
                        sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                        sb.append(str6);
                        sb.append("/");
                        sb.append(str7);
                        str4 = "FirebaseMessaging";
                        str3 = sb.toString();
                        Log.e(str4, str3);
                        str = null;
                    }
                }
                str4 = "FirebaseMessaging";
                str3 = "Failed to resolve target intent service, skipping classname enforcement";
                Log.e(str4, str3);
                str = null;
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                if (str.length() != 0) {
                    str2 = "Restricting intent to a specific service: ".concat(str);
                } else {
                    str2 = new String("Restricting intent to a specific service: ");
                }
                Log.d("FirebaseMessaging", str2);
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (a10.c(context)) {
                componentName = d0.a(context, intent2);
            } else {
                componentName = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i10 = 404;
            } else {
                i10 = -1;
            }
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
            i10 = 401;
        } catch (IllegalStateException e11) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e11.toString()));
            i10 = 402;
        }
        return Integer.valueOf(i10);
    }
}
