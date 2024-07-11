package r7;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import o7.b;
import o7.d;
import o7.f;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f8453a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, f<?>> f8454b;

    /* renamed from: c  reason: collision with root package name */
    public final d<Object> f8455c;

    public static final class a implements p7.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f8456a = new g();
    }

    public h(HashMap hashMap, HashMap hashMap2, g gVar) {
        this.f8453a = hashMap;
        this.f8454b = hashMap2;
        this.f8455c = gVar;
    }

    public final void a(x3.a aVar, ByteArrayOutputStream byteArrayOutputStream) {
        Map<Class<?>, d<?>> map = this.f8453a;
        f fVar = new f(byteArrayOutputStream, map, this.f8454b, this.f8455c);
        Class<x3.a> cls = x3.a.class;
        d dVar = map.get(cls);
        if (dVar != null) {
            dVar.a(aVar, fVar);
            return;
        }
        throw new b("No encoder for " + cls);
    }
}
