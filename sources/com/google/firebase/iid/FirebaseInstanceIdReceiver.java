package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import b8.h;
import b8.o;
import i4.a;
import i4.b;
import java.util.concurrent.ExecutionException;
import m5.l;

public final class FirebaseInstanceIdReceiver extends b {
    public final int a(Context context, a aVar) {
        try {
            return ((Integer) l.a(new h(context).b(aVar.f6065o))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    public final void b(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (o.b(putExtras)) {
            o.a("_nd", putExtras.getExtras());
        }
    }
}
