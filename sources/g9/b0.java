package g9;

public final class b0 implements h0 {

    /* renamed from: o  reason: collision with root package name */
    public final boolean f4998o;

    public b0(boolean z) {
        this.f4998o = z;
    }

    public final boolean a() {
        return this.f4998o;
    }

    public final t0 b() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f4998o ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
