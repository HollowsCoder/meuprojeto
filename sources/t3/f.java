package t3;

import androidx.appcompat.widget.x0;
import java.util.HashMap;
import o7.c;
import o7.d;
import r7.a;
import r7.d;
import x3.e;

public final class f implements d<e> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f8938a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final c f8939b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f8940c;

    static {
        a aVar = new a(1, d.a.DEFAULT);
        HashMap hashMap = new HashMap();
        Class<r7.d> cls = r7.d.class;
        hashMap.put(cls, aVar);
        f8939b = new c("currentCacheSizeBytes", x0.i(hashMap));
        a aVar2 = new a(2, d.a.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cls, aVar2);
        f8940c = new c("maxCacheSizeBytes", x0.i(hashMap2));
    }

    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj;
        o7.e eVar2 = (o7.e) obj2;
        eVar2.a(f8939b, eVar.f9479a);
        eVar2.a(f8940c, eVar.f9480b);
    }
}
