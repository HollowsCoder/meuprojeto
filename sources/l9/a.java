package l9;

import z8.g;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public c f6986a;

    /* renamed from: b  reason: collision with root package name */
    public long f6987b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6988c;
    public final boolean d;

    public /* synthetic */ a() {
        throw null;
    }

    public a(String str, boolean z) {
        g.f(str, "name");
        this.f6988c = str;
        this.d = z;
        this.f6987b = -1;
    }

    public abstract long a();

    public final String toString() {
        return this.f6988c;
    }
}
