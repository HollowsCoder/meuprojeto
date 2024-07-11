package com.google.firebase.installations;

import androidx.annotation.Keep;
import d8.g;
import java.util.Arrays;
import java.util.List;
import t3.u;
import w7.d;
import w7.e;
import y6.b;
import y6.c;
import y6.f;
import y6.k;

@Keep
public class FirebaseInstallationsRegistrar implements f {
    /* access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(c cVar) {
        return new d((s6.c) cVar.a(s6.c.class), cVar.h(g.class), cVar.h(t7.d.class));
    }

    public List<b<?>> getComponents() {
        b.a<e> a10 = b.a(e.class);
        a10.a(new k(1, 0, s6.c.class));
        a10.a(new k(0, 1, t7.d.class));
        a10.a(new k(0, 1, g.class));
        a10.f9564e = new u(3);
        return Arrays.asList(new b[]{a10.b(), d8.f.a("fire-installations", "17.0.0")});
    }
}
