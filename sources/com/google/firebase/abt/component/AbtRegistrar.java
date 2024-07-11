package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import t3.u;
import u6.a;
import y6.b;
import y6.c;
import y6.f;
import y6.k;

@Keep
public class AbtRegistrar implements f {
    /* access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(c cVar) {
        return new a((Context) cVar.a(Context.class), cVar.h(w6.a.class));
    }

    public List<b<?>> getComponents() {
        b.a<a> a10 = b.a(a.class);
        a10.a(new k(1, 0, Context.class));
        a10.a(new k(0, 1, w6.a.class));
        a10.f9564e = new u(0);
        return Arrays.asList(new b[]{a10.b(), d8.f.a("fire-abt", "21.0.0")});
    }
}
