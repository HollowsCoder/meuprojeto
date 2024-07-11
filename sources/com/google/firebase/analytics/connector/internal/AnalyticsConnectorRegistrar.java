package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.u1;
import java.util.Arrays;
import java.util.List;
import n4.m;
import p9.u;
import s7.d;
import w6.a;
import w6.e;
import y6.b;
import y6.c;
import y6.f;
import y6.k;

@Keep
public class AnalyticsConnectorRegistrar implements f {
    public static final a lambda$getComponents$0$AnalyticsConnectorRegistrar(c cVar) {
        s6.c cVar2 = (s6.c) cVar.a(s6.c.class);
        Context context = (Context) cVar.a(Context.class);
        d dVar = (d) cVar.a(d.class);
        m.h(cVar2);
        m.h(context);
        m.h(dVar);
        m.h(context.getApplicationContext());
        if (w6.c.f9259c == null) {
            synchronized (w6.c.class) {
                if (w6.c.f9259c == null) {
                    Bundle bundle = new Bundle(1);
                    cVar2.a();
                    if ("[DEFAULT]".equals(cVar2.f8816b)) {
                        dVar.a(w6.d.f9262o, e.f9263a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar2.g());
                    }
                    w6.c.f9259c = new w6.c(u1.e(context, bundle).f2946b);
                }
            }
        }
        return w6.c.f9259c;
    }

    @SuppressLint({"MissingPermission"})
    @Keep
    public List<b<?>> getComponents() {
        b.a<a> a10 = b.a(a.class);
        a10.a(new k(1, 0, s6.c.class));
        a10.a(new k(1, 0, Context.class));
        a10.a(new k(1, 0, d.class));
        a10.f9564e = u.f8109h0;
        a10.c(2);
        return Arrays.asList(new b[]{a10.b(), d8.f.a("fire-analytics", "19.0.0")});
    }
}
