package t3;

import androidx.appcompat.widget.x0;
import java.util.HashMap;
import o7.d;
import o7.e;
import r7.a;
import r7.d;

public final class c implements d<x3.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f8930a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final o7.c f8931b;

    /* renamed from: c  reason: collision with root package name */
    public static final o7.c f8932c;

    static {
        a aVar = new a(1, d.a.DEFAULT);
        HashMap hashMap = new HashMap();
        Class<r7.d> cls = r7.d.class;
        hashMap.put(cls, aVar);
        f8931b = new o7.c("eventsDroppedCount", x0.i(hashMap));
        a aVar2 = new a(3, d.a.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cls, aVar2);
        f8932c = new o7.c("reason", x0.i(hashMap2));
    }

    public final void a(Object obj, Object obj2) {
        x3.c cVar = (x3.c) obj;
        e eVar = (e) obj2;
        eVar.a(f8931b, cVar.f9474a);
        eVar.e(f8932c, cVar.f9475b);
    }
}
