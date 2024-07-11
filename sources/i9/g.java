package i9;

import androidx.activity.result.c;
import java.util.ArrayList;
import java.util.Set;
import o8.i;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final g f6240c = new g(i.z(new ArrayList()), (c) null);
    public static final a d = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Set<b> f6241a;

    /* renamed from: b  reason: collision with root package name */
    public final c f6242b;

    public static final class a {
    }

    public static final class b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            if (!z8.g.a((Object) null, (Object) null)) {
                return false;
            }
            bVar.getClass();
            if (!z8.g.a((Object) null, (Object) null)) {
                return false;
            }
            bVar.getClass();
            return !(z8.g.a((Object) null, (Object) null) ^ true);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public g(Set<b> set, c cVar) {
        z8.g.f(set, "pins");
        this.f6241a = set;
        this.f6242b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return z8.g.a(gVar.f6241a, this.f6241a) && z8.g.a(gVar.f6242b, this.f6242b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f6241a.hashCode() + 1517) * 41;
        c cVar = this.f6242b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
