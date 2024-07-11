package n9;

import i9.d0;
import i9.t;
import w9.i;
import w9.v;

public final class g extends d0 {

    /* renamed from: q  reason: collision with root package name */
    public final String f7515q;

    /* renamed from: r  reason: collision with root package name */
    public final long f7516r;

    /* renamed from: s  reason: collision with root package name */
    public final i f7517s;

    public g(String str, long j8, v vVar) {
        this.f7515q = str;
        this.f7516r = j8;
        this.f7517s = vVar;
    }

    public final long a() {
        return this.f7516r;
    }

    public final t b() {
        String str = this.f7515q;
        if (str == null) {
            return null;
        }
        t.f6320f.getClass();
        try {
            return t.a.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final i c() {
        return this.f7517s;
    }
}
