package e7;

import i7.e;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f4494c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final e f4495a;

    /* renamed from: b  reason: collision with root package name */
    public a f4496b;

    public static final class a implements a {
        public final void a() {
        }

        public final String b() {
            return null;
        }

        public final void c(String str, long j8) {
        }
    }

    public b(e eVar) {
        this.f4495a = eVar;
        this.f4496b = f4494c;
    }

    public b(e eVar, String str) {
        this(eVar);
        a(str);
    }

    public final void a(String str) {
        this.f4496b.a();
        this.f4496b = f4494c;
        if (str != null) {
            this.f4496b = new d(this.f4495a.a(str, "userlog"));
        }
    }
}
