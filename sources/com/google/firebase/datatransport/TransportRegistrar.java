package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.Collections;
import java.util.List;
import q3.g;
import t3.u;
import y6.b;
import y6.f;
import y6.k;

@Keep
public class TransportRegistrar implements f {
    public List<b<?>> getComponents() {
        b.a<g> a10 = b.a(g.class);
        a10.a(new k(1, 0, Context.class));
        a10.f9564e = new u(1);
        return Collections.singletonList(a10.b());
    }
}
