package q2;

import java.security.MessageDigest;
import m3.b;
import q2.g;

public final class h implements f {

    /* renamed from: b  reason: collision with root package name */
    public final b f8221b = new b();

    public final void a(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            b bVar = this.f8221b;
            if (i10 < bVar.f7333q) {
                g gVar = (g) bVar.h(i10);
                Object l = this.f8221b.l(i10);
                g.b<T> bVar2 = gVar.f8219b;
                if (gVar.d == null) {
                    gVar.d = gVar.f8220c.getBytes(f.f8216a);
                }
                bVar2.a(gVar.d, l, messageDigest);
                i10++;
            } else {
                return;
            }
        }
    }

    public final <T> T c(g<T> gVar) {
        b bVar = this.f8221b;
        if (bVar.containsKey(gVar)) {
            return bVar.getOrDefault(gVar, null);
        }
        return gVar.f8218a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f8221b.equals(((h) obj).f8221b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8221b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f8221b + '}';
    }
}
