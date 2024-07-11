package androidx.navigation;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1513a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1514b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1515c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1516e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1517f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1518g;

    public m(boolean z, int i10, boolean z10, int i11, int i12, int i13, int i14) {
        this.f1513a = z;
        this.f1514b = i10;
        this.f1515c = z10;
        this.d = i11;
        this.f1516e = i12;
        this.f1517f = i13;
        this.f1518g = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f1513a == mVar.f1513a && this.f1514b == mVar.f1514b && this.f1515c == mVar.f1515c && this.d == mVar.d && this.f1516e == mVar.f1516e && this.f1517f == mVar.f1517f && this.f1518g == mVar.f1518g;
    }

    public final int hashCode() {
        return ((((((((((((this.f1513a ? 1 : 0) * true) + this.f1514b) * 31) + (this.f1515c ? 1 : 0)) * 31) + this.d) * 31) + this.f1516e) * 31) + this.f1517f) * 31) + this.f1518g;
    }
}
