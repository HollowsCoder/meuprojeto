package z8;

import java.io.Serializable;

public abstract class b implements d9.a, Serializable {

    /* renamed from: o  reason: collision with root package name */
    public transient d9.a f9960o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f9961p;

    /* renamed from: q  reason: collision with root package name */
    public final Class f9962q;

    /* renamed from: r  reason: collision with root package name */
    public final String f9963r;

    /* renamed from: s  reason: collision with root package name */
    public final String f9964s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f9965t;

    public static class a implements Serializable {

        /* renamed from: o  reason: collision with root package name */
        public static final a f9966o = new a();
    }

    public b() {
        this((Class) null, (String) null, (String) null, false);
    }

    public abstract j a();

    public final c b() {
        c cVar;
        Class cls = this.f9962q;
        if (cls == null) {
            return null;
        }
        if (this.f9965t) {
            n.f9972a.getClass();
            cVar = new i(cls);
        } else {
            n.f9972a.getClass();
            cVar = new d(cls);
        }
        return cVar;
    }

    public b(Class cls, String str, String str2, boolean z) {
        this.f9961p = a.f9966o;
        this.f9962q = cls;
        this.f9963r = str;
        this.f9964s = str2;
        this.f9965t = z;
    }
}
