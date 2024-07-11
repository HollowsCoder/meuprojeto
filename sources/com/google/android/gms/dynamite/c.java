package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class c implements DynamiteModule.b {
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.C0030b bVar) {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int b10 = bVar.b(context, str);
        aVar.f2351a = b10;
        aVar.f2352b = b10 != 0 ? bVar.a(context, str, false) : bVar.a(context, str, true);
        int i10 = aVar.f2351a;
        if (i10 == 0 && aVar.f2352b == 0) {
            aVar.f2353c = 0;
        } else if (i10 >= aVar.f2352b) {
            aVar.f2353c = -1;
        } else {
            aVar.f2353c = 1;
        }
        return aVar;
    }
}
