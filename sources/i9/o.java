package i9;

import i9.t;
import j9.c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import w9.f;
import w9.h;
import z8.g;

public final class o extends b0 {
    public static final t d = t.a.a("application/x-www-form-urlencoded");

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f6287b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f6288c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f6289a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f6290b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final Charset f6291c = null;
    }

    static {
        t.f6320f.getClass();
    }

    public o(ArrayList arrayList, ArrayList arrayList2) {
        g.f(arrayList, "encodedNames");
        g.f(arrayList2, "encodedValues");
        this.f6287b = c.v(arrayList);
        this.f6288c = c.v(arrayList2);
    }

    public final long a() {
        return d((h) null, true);
    }

    public final t b() {
        return d;
    }

    public final void c(h hVar) {
        d(hVar, false);
    }

    public final long d(h hVar, boolean z) {
        f fVar;
        if (z) {
            fVar = new f();
        } else {
            g.c(hVar);
            fVar = hVar.e();
        }
        List<String> list = this.f6287b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                fVar.M(38);
            }
            fVar.g0(list.get(i10));
            fVar.M(61);
            fVar.g0(this.f6288c.get(i10));
        }
        if (!z) {
            return 0;
        }
        long j8 = fVar.f9325p;
        fVar.c();
        return j8;
    }
}
