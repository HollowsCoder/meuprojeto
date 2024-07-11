package s3;

import s3.o;

public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public final o.b f8779a;

    /* renamed from: b  reason: collision with root package name */
    public final o.a f8780b;

    public i(o.b bVar, o.a aVar) {
        this.f8779a = bVar;
        this.f8780b = aVar;
    }

    public final o.a a() {
        return this.f8780b;
    }

    public final o.b b() {
        return this.f8779a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f8779a;
        if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
            o.a aVar = this.f8780b;
            o.a a10 = oVar.a();
            if (aVar == null) {
                if (a10 == null) {
                    return true;
                }
            } else if (aVar.equals(a10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        o.b bVar = this.f8779a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        o.a aVar = this.f8780b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f8779a + ", mobileSubtype=" + this.f8780b + "}";
    }
}
