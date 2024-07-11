package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.w0;
import h5.e3;
import h5.g3;
import h5.i4;
import h5.x3;
import h5.y3;
import v0.a;

public final class AppMeasurementReceiver extends a implements x3 {

    /* renamed from: c  reason: collision with root package name */
    public y3 f3201c;

    public final void onReceive(Context context, Intent intent) {
        String str;
        e3 e3Var;
        if (this.f3201c == null) {
            this.f3201c = new y3(this);
        }
        y3 y3Var = this.f3201c;
        y3Var.getClass();
        g3 g3Var = i4.h(context, (w0) null, (Long) null).w;
        i4.n(g3Var);
        if (intent == null) {
            e3Var = g3Var.w;
            str = "Receiver called with null intent";
        } else {
            String action = intent.getAction();
            g3Var.B.b(action, "Local receiver got");
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
                className.setAction("com.google.android.gms.measurement.UPLOAD");
                g3Var.B.a("Starting wakeful intent.");
                ((AppMeasurementReceiver) y3Var.f5820a).getClass();
                SparseArray<PowerManager.WakeLock> sparseArray = a.f9116a;
                synchronized (sparseArray) {
                    int i10 = a.f9117b;
                    int i11 = i10 + 1;
                    a.f9117b = i11;
                    if (i11 <= 0) {
                        a.f9117b = 1;
                    }
                    className.putExtra("androidx.contentpager.content.wakelockid", i10);
                    ComponentName startService = context.startService(className);
                    if (startService != null) {
                        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                        newWakeLock.setReferenceCounted(false);
                        newWakeLock.acquire(60000);
                        sparseArray.put(i10, newWakeLock);
                    }
                }
                return;
            } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                e3Var = g3Var.w;
                str = "Install Referrer Broadcasts are deprecated";
            } else {
                return;
            }
        }
        e3Var.a(str);
    }
}
