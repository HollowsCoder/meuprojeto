package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.h;
import java.util.HashMap;
import java.util.List;

@Deprecated
class ReflectiveGenericLifecycleObserver implements l {

    /* renamed from: o  reason: collision with root package name */
    public final Object f1364o;

    /* renamed from: p  reason: collision with root package name */
    public final b.a f1365p;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1364o = obj;
        this.f1365p = b.f1374c.b(obj.getClass());
    }

    public final void f(n nVar, h.b bVar) {
        HashMap hashMap = this.f1365p.f1377a;
        Object obj = this.f1364o;
        b.a.a((List) hashMap.get(bVar), nVar, bVar, obj);
        b.a.a((List) hashMap.get(h.b.ON_ANY), nVar, bVar, obj);
    }
}
