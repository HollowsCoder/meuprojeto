package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class a implements DynamiteModule.b {
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.C0030b bVar) {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int a10 = bVar.a(context, str, true);
        aVar.f2352b = a10;
        if (a10 != 0) {
            aVar.f2353c = 1;
        } else {
            int b10 = bVar.b(context, str);
            aVar.f2351a = b10;
            if (b10 != 0) {
                aVar.f2353c = -1;
            }
        }
        return aVar;
    }
}
