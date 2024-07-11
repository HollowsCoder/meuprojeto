package y7;

import com.karumi.dexter.BuildConfig;
import y7.c;
import y7.d;

public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final String f9604b;

    /* renamed from: c  reason: collision with root package name */
    public final c.a f9605c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9606e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9607f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9608g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9609h;

    /* renamed from: y7.a$a  reason: collision with other inner class name */
    public static final class C0166a extends d.a {

        /* renamed from: a  reason: collision with root package name */
        public String f9610a;

        /* renamed from: b  reason: collision with root package name */
        public c.a f9611b;

        /* renamed from: c  reason: collision with root package name */
        public String f9612c;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public Long f9613e;

        /* renamed from: f  reason: collision with root package name */
        public Long f9614f;

        /* renamed from: g  reason: collision with root package name */
        public String f9615g;

        public C0166a() {
        }

        public C0166a(d dVar) {
            this.f9610a = dVar.c();
            this.f9611b = dVar.f();
            this.f9612c = dVar.a();
            this.d = dVar.e();
            this.f9613e = Long.valueOf(dVar.b());
            this.f9614f = Long.valueOf(dVar.g());
            this.f9615g = dVar.d();
        }

        public final a a() {
            String str;
            if (this.f9611b == null) {
                str = " registrationStatus";
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (this.f9613e == null) {
                str = str.concat(" expiresInSecs");
            }
            if (this.f9614f == null) {
                str = b0.d.e(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.f9610a, this.f9611b, this.f9612c, this.d, this.f9613e.longValue(), this.f9614f.longValue(), this.f9615g);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final C0166a b(c.a aVar) {
            if (aVar != null) {
                this.f9611b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }
    }

    public a(String str, c.a aVar, String str2, String str3, long j8, long j10, String str4) {
        this.f9604b = str;
        this.f9605c = aVar;
        this.d = str2;
        this.f9606e = str3;
        this.f9607f = j8;
        this.f9608g = j10;
        this.f9609h = str4;
    }

    public final String a() {
        return this.d;
    }

    public final long b() {
        return this.f9607f;
    }

    public final String c() {
        return this.f9604b;
    }

    public final String d() {
        return this.f9609h;
    }

    public final String e() {
        return this.f9606e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f9604b;
        if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
            if (this.f9605c.equals(dVar.f()) && ((str = this.d) != null ? str.equals(dVar.a()) : dVar.a() == null) && ((str2 = this.f9606e) != null ? str2.equals(dVar.e()) : dVar.e() == null) && this.f9607f == dVar.b() && this.f9608g == dVar.g()) {
                String str4 = this.f9609h;
                if (str4 == null) {
                    if (dVar.d() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final c.a f() {
        return this.f9605c;
    }

    public final long g() {
        return this.f9608g;
    }

    public final C0166a h() {
        return new C0166a(this);
    }

    public final int hashCode() {
        int i10 = 0;
        String str = this.f9604b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f9605c.hashCode()) * 1000003;
        String str2 = this.d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9606e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j8 = this.f9607f;
        long j10 = this.f9608g;
        int i11 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f9609h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f9604b);
        sb.append(", registrationStatus=");
        sb.append(this.f9605c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", refreshToken=");
        sb.append(this.f9606e);
        sb.append(", expiresInSecs=");
        sb.append(this.f9607f);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f9608g);
        sb.append(", fisError=");
        return b0.d.g(sb, this.f9609h, "}");
    }
}
