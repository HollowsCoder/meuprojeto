package t3;

import androidx.appcompat.widget.x0;
import java.util.HashMap;
import o7.c;
import o7.d;
import o7.e;
import r7.a;
import r7.d;
import x3.f;

public final class g implements d<f> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f8941a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final c f8942b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f8943c;

    static {
        a aVar = new a(1, d.a.DEFAULT);
        HashMap hashMap = new HashMap();
        Class<r7.d> cls = r7.d.class;
        hashMap.put(cls, aVar);
        f8942b = new c("startMs", x0.i(hashMap));
        a aVar2 = new a(2, d.a.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cls, aVar2);
        f8943c = new c("endMs", x0.i(hashMap2));
    }

    public final void a(Object obj, Object obj2) {
        f fVar = (f) obj;
        e eVar = (e) obj2;
        eVar.a(f8942b, fVar.f9481a);
        eVar.a(f8943c, fVar.f9482b);
    }
}
