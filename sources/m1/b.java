package m1;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f7031a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7032b;

    /* renamed from: c  reason: collision with root package name */
    public final float f7033c;
    public final a d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7034e;

    /* renamed from: f  reason: collision with root package name */
    public final float f7035f;

    /* renamed from: g  reason: collision with root package name */
    public final float f7036g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7037h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7038i;

    /* renamed from: j  reason: collision with root package name */
    public final float f7039j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f7040k;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z) {
        this.f7031a = str;
        this.f7032b = str2;
        this.f7033c = f10;
        this.d = aVar;
        this.f7034e = i10;
        this.f7035f = f11;
        this.f7036g = f12;
        this.f7037h = i11;
        this.f7038i = i12;
        this.f7039j = f13;
        this.f7040k = z;
    }

    public final int hashCode() {
        int hashCode = this.f7032b.hashCode();
        int ordinal = ((this.d.ordinal() + (((int) (((float) ((hashCode + (this.f7031a.hashCode() * 31)) * 31)) + this.f7033c)) * 31)) * 31) + this.f7034e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f7035f);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f7037h;
    }
}
