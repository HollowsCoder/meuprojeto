package t3;

import androidx.appcompat.widget.x0;
import java.util.HashMap;
import o7.c;
import o7.e;
import r7.a;
import r7.d;

public final class d implements o7.d<x3.d> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f8933a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final c f8934b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f8935c;

    static {
        a aVar = new a(1, d.a.DEFAULT);
        HashMap hashMap = new HashMap();
        Class<r7.d> cls = r7.d.class;
        hashMap.put(cls, aVar);
        f8934b = new c("logSource", x0.i(hashMap));
        a aVar2 = new a(2, d.a.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cls, aVar2);
        f8935c = new c("logEventDropped", x0.i(hashMap2));
    }

    public final void a(Object obj, Object obj2) {
        x3.d dVar = (x3.d) obj;
        e eVar = (e) obj2;
        eVar.e(f8934b, dVar.f9477a);
        eVar.e(f8935c, dVar.f9478b);
    }
}
