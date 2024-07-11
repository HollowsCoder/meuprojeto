package com.google.firebase.messaging;

import androidx.annotation.Keep;
import d8.g;
import java.util.Arrays;
import java.util.List;
import t7.d;
import u7.a;
import w7.e;
import y6.b;
import y6.c;
import y6.f;
import y6.k;

@Keep
public class FirebaseMessagingRegistrar implements f {
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(c cVar) {
        return new FirebaseMessaging((s6.c) cVar.a(s6.c.class), (a) cVar.a(a.class), cVar.h(g.class), cVar.h(d.class), (e) cVar.a(e.class), (q3.g) cVar.a(q3.g.class), (s7.d) cVar.a(s7.d.class));
    }

    @Keep
    public List<b<?>> getComponents() {
        b.a<FirebaseMessaging> a10 = b.a(FirebaseMessaging.class);
        a10.a(new k(1, 0, s6.c.class));
        a10.a(new k(0, 0, a.class));
        a10.a(new k(0, 1, g.class));
        a10.a(new k(0, 1, d.class));
        a10.a(new k(0, 0, q3.g.class));
        a10.a(new k(1, 0, e.class));
        a10.a(new k(1, 0, s7.d.class));
        a10.f9564e = androidx.databinding.a.f1020s;
        a10.c(1);
        return Arrays.asList(new b[]{a10.b(), d8.f.a("fire-fcm", "23.0.0")});
    }
}
