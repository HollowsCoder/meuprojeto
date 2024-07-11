package com.google.firebase;

import android.content.Context;
import android.os.Build;
import d2.c;
import d8.d;
import d8.g;
import java.util.ArrayList;
import java.util.List;
import t3.u;
import y6.b;
import y6.f;
import y6.k;

public class FirebaseCommonRegistrar implements f {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public final List<b<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        b.a<g> a10 = b.a(g.class);
        a10.a(new k(2, 0, d.class));
        a10.f9564e = new c(0);
        arrayList.add(a10.b());
        b.a<t7.d> a11 = b.a(t7.d.class);
        a11.a(new k(1, 0, Context.class));
        a11.a(new k(2, 0, t7.c.class));
        a11.f9564e = new u(2);
        arrayList.add(a11.b());
        arrayList.add(d8.f.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(d8.f.a("fire-core", "20.0.0"));
        arrayList.add(d8.f.a("device-name", a(Build.PRODUCT)));
        arrayList.add(d8.f.a("device-model", a(Build.DEVICE)));
        arrayList.add(d8.f.a("device-brand", a(Build.BRAND)));
        arrayList.add(d8.f.b("android-target-sdk", new u(3)));
        arrayList.add(d8.f.b("android-min-sdk", new r3.b(6)));
        arrayList.add(d8.f.b("android-platform", new c(4)));
        arrayList.add(d8.f.b("android-installer", new u(4)));
        try {
            str = n8.c.f7490s.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(d8.f.a("kotlin", str));
        }
        return arrayList;
    }
}
