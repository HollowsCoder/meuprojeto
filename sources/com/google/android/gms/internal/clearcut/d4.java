package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import k4.d;
import n4.c;
import n4.f;

public final class d4 extends f<f4> {
    public d4(Context context, Looper looper, c cVar, d.a aVar, d.b bVar) {
        super(context, looper, 40, cVar, aVar, bVar);
    }

    public final int f() {
        return 11925000;
    }

    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof f4 ? (f4) queryLocalInterface : new g4(iBinder);
    }

    public final String v() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    public final String w() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
