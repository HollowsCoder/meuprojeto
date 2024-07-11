package d8;

import b0.d;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f4307a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4308b;

    public a(String str, String str2) {
        if (str != null) {
            this.f4307a = str;
            if (str2 != null) {
                this.f4308b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public final String a() {
        return this.f4307a;
    }

    public final String b() {
        return this.f4308b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f4307a.equals(dVar.a()) && this.f4308b.equals(dVar.b());
    }

    public final int hashCode() {
        return ((this.f4307a.hashCode() ^ 1000003) * 1000003) ^ this.f4308b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f4307a);
        sb.append(", version=");
        return d.g(sb, this.f4308b, "}");
    }
}
