package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import e8.k;
import java.util.Arrays;
import java.util.List;
import u6.a;
import w7.e;
import y6.b;
import y6.c;
import y6.f;

@Keep
public class RemoteConfigRegistrar implements f {
    /* access modifiers changed from: private */
    public static k lambda$getComponents$0(c cVar) {
        t6.c cVar2;
        Context context = (Context) cVar.a(Context.class);
        s6.c cVar3 = (s6.c) cVar.a(s6.c.class);
        e eVar = (e) cVar.a(e.class);
        a aVar = (a) cVar.a(a.class);
        synchronized (aVar) {
            if (!aVar.f9108a.containsKey("frc")) {
                aVar.f9108a.put("frc", new t6.c(aVar.f9109b));
            }
            cVar2 = (t6.c) aVar.f9108a.get("frc");
        }
        return new k(context, cVar3, eVar, cVar2, cVar.h(w6.a.class));
    }

    public List<b<?>> getComponents() {
        b.a<k> a10 = b.a(k.class);
        a10.a(new y6.k(1, 0, Context.class));
        a10.a(new y6.k(1, 0, s6.c.class));
        a10.a(new y6.k(1, 0, e.class));
        a10.a(new y6.k(1, 0, a.class));
        a10.a(new y6.k(0, 1, w6.a.class));
        a10.f9564e = new d2.c(1);
        a10.c(2);
        return Arrays.asList(new b[]{a10.b(), d8.f.a("fire-rc", "21.0.0")});
    }
}
