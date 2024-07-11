package a1;

import android.content.Context;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class a {
    public static volatile a d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f46e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f47a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f48b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f49c;

    public a(Context context) {
        this.f49c = context.getApplicationContext();
    }

    public final Object a(Class cls, HashSet hashSet) {
        Object obj;
        synchronized (f46e) {
            if (b1.a.a()) {
                try {
                    Trace.beginSection(cls.getSimpleName());
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            if (!hashSet.contains(cls)) {
                if (!this.f47a.containsKey(cls)) {
                    hashSet.add(cls);
                    b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends b<?>>> a10 = bVar.a();
                    if (!a10.isEmpty()) {
                        for (Class next : a10) {
                            if (!this.f47a.containsKey(next)) {
                                a(next, hashSet);
                            }
                        }
                    }
                    obj = bVar.b(this.f49c);
                    hashSet.remove(cls);
                    this.f47a.put(cls, obj);
                } else {
                    obj = this.f47a.get(cls);
                }
                Trace.endSection();
            } else {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
            }
        }
        return obj;
    }
}
