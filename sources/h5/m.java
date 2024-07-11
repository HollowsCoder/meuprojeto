package h5;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f5541a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5542b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5543c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5544e;

    /* renamed from: f  reason: collision with root package name */
    public final long f5545f;

    /* renamed from: g  reason: collision with root package name */
    public final long f5546g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f5547h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f5548i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f5549j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f5550k;

    public m(String str, String str2, long j8, long j10, long j11, long j12, long j13, Long l, Long l8, Long l10, Boolean bool) {
        long j14 = j8;
        long j15 = j10;
        long j16 = j11;
        long j17 = j13;
        n4.m.e(str);
        n4.m.e(str2);
        boolean z = true;
        n4.m.b(j14 >= 0);
        n4.m.b(j15 >= 0);
        n4.m.b(j16 >= 0);
        n4.m.b(j17 < 0 ? false : z);
        this.f5541a = str;
        this.f5542b = str2;
        this.f5543c = j14;
        this.d = j15;
        this.f5544e = j16;
        this.f5545f = j12;
        this.f5546g = j17;
        this.f5547h = l;
        this.f5548i = l8;
        this.f5549j = l10;
        this.f5550k = bool;
    }

    public final m a(long j8, long j10) {
        return new m(this.f5541a, this.f5542b, this.f5543c, this.d, this.f5544e, this.f5545f, j8, Long.valueOf(j10), this.f5548i, this.f5549j, this.f5550k);
    }

    public final m b(Long l, Long l8, Boolean bool) {
        return new m(this.f5541a, this.f5542b, this.f5543c, this.d, this.f5544e, this.f5545f, this.f5546g, this.f5547h, l, l8, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
