package androidx.appcompat.widget;

public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public int f715a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f716b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f717c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f718e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f719f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f720g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f721h = false;

    public final void a(int i10, int i11) {
        this.f717c = i10;
        this.d = i11;
        this.f721h = true;
        if (this.f720g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f715a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f716b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f715a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f716b = i11;
        }
    }
}
