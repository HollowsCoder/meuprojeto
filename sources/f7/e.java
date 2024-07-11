package f7;

import b0.d;
import f7.a0;

public final class e extends a0.d {

    /* renamed from: a  reason: collision with root package name */
    public final b0<a0.d.a> f4769a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4770b;

    public e() {
        throw null;
    }

    public e(b0 b0Var, String str) {
        this.f4769a = b0Var;
        this.f4770b = str;
    }

    public final b0<a0.d.a> a() {
        return this.f4769a;
    }

    public final String b() {
        return this.f4770b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.d)) {
            return false;
        }
        a0.d dVar = (a0.d) obj;
        if (this.f4769a.equals(dVar.a())) {
            String str = this.f4770b;
            String b10 = dVar.b();
            if (str == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (str.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f4769a.hashCode() ^ 1000003) * 1000003;
        String str = this.f4770b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f4769a);
        sb.append(", orgId=");
        return d.g(sb, this.f4770b, "}");
    }
}
