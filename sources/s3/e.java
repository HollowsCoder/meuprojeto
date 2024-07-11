package s3;

import s3.k;

public final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    public final k.a f8758a;

    /* renamed from: b  reason: collision with root package name */
    public final a f8759b;

    public e(k.a aVar, a aVar2) {
        this.f8758a = aVar;
        this.f8759b = aVar2;
    }

    public final a a() {
        return this.f8759b;
    }

    public final k.a b() {
        return this.f8758a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.a aVar = this.f8758a;
        if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
            a aVar2 = this.f8759b;
            if (aVar2 == null) {
                if (kVar.a() == null) {
                    return true;
                }
            } else if (aVar2.equals(kVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        k.a aVar = this.f8758a;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        a aVar2 = this.f8759b;
        if (aVar2 != null) {
            i10 = aVar2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f8758a + ", androidClientInfo=" + this.f8759b + "}";
    }
}
