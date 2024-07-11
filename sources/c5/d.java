package c5;

import androidx.fragment.app.f0;
import c8.a;
import c8.b;
import java.util.HashMap;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final f0 f2158a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        p pVar = p.f2175a;
        Class<d> cls = d.class;
        hashMap.put(cls, c.f2156a);
        hashMap2.remove(cls);
        Class<b> cls2 = b.class;
        hashMap.put(cls2, b.f2154a);
        hashMap2.remove(cls2);
        Class<a> cls3 = a.class;
        hashMap.put(cls3, a.f2140a);
        hashMap2.remove(cls3);
        f2158a = new f0(new HashMap(hashMap), new HashMap(hashMap2), pVar, 3);
    }

    public abstract b a();
}
