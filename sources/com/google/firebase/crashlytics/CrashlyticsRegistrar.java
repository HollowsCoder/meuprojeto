package com.google.firebase.crashlytics;

import a7.a;
import java.util.Arrays;
import java.util.List;
import s6.c;
import y6.b;
import y6.f;
import y6.k;
import z6.e;

public class CrashlyticsRegistrar implements f {
    public final List<b<?>> getComponents() {
        b.a<e> a10 = b.a(e.class);
        a10.a(new k(1, 0, c.class));
        a10.a(new k(1, 0, w7.e.class));
        a10.a(new k(0, 2, a.class));
        a10.a(new k(0, 2, w6.a.class));
        a10.f9564e = new z6.c(this);
        a10.c(2);
        return Arrays.asList(new b[]{a10.b(), d8.f.a("fire-cls", "18.2.5")});
    }
}
