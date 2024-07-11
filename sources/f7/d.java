package f7;

import f7.a0;

public final class d extends a0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f4767a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4768b;

    public d(String str, String str2) {
        this.f4767a = str;
        this.f4768b = str2;
    }

    public final String a() {
        return this.f4767a;
    }

    public final String b() {
        return this.f4768b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.c)) {
            return false;
        }
        a0.c cVar = (a0.c) obj;
        return this.f4767a.equals(cVar.a()) && this.f4768b.equals(cVar.b());
    }

    public final int hashCode() {
        return ((this.f4767a.hashCode() ^ 1000003) * 1000003) ^ this.f4768b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f4767a);
        sb.append(", value=");
        return b0.d.g(sb, this.f4768b, "}");
    }
}
