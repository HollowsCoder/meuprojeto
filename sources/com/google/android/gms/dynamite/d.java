package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class d implements DynamiteModule.b {
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.C0030b bVar) {
        int i10;
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        aVar.f2351a = bVar.b(context, str);
        int a10 = bVar.a(context, str, true);
        aVar.f2352b = a10;
        int i11 = aVar.f2351a;
        if (i11 == 0 && a10 == 0) {
            i10 = 0;
        } else if (a10 >= i11) {
            aVar.f2353c = 1;
            return aVar;
        } else {
            i10 = -1;
        }
        aVar.f2353c = i10;
        return aVar;
    }
}
