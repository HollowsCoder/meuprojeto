package t3;

import androidx.appcompat.widget.x0;
import java.util.HashMap;
import o7.c;
import o7.d;
import o7.e;
import r7.d;

public final class a implements d<x3.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8924a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final c f8925b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f8926c;
    public static final c d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f8927e;

    static {
        r7.a aVar = new r7.a(1, d.a.DEFAULT);
        HashMap hashMap = new HashMap();
        Class<r7.d> cls = r7.d.class;
        hashMap.put(cls, aVar);
        f8925b = new c("window", x0.i(hashMap));
        r7.a aVar2 = new r7.a(2, d.a.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cls, aVar2);
        f8926c = new c("logSourceMetrics", x0.i(hashMap2));
        r7.a aVar3 = new r7.a(3, d.a.DEFAULT);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(cls, aVar3);
        d = new c("globalMetrics", x0.i(hashMap3));
        r7.a aVar4 = new r7.a(4, d.a.DEFAULT);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(cls, aVar4);
        f8927e = new c("appNamespace", x0.i(hashMap4));
    }

    public final void a(Object obj, Object obj2) {
        x3.a aVar = (x3.a) obj;
        e eVar = (e) obj2;
        eVar.e(f8925b, aVar.f9467a);
        eVar.e(f8926c, aVar.f9468b);
        eVar.e(d, aVar.f9469c);
        eVar.e(f8927e, aVar.d);
    }
}
