package p9;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public int f8121a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f8122b = new int[10];

    public final int a() {
        if ((this.f8121a & 128) != 0) {
            return this.f8122b[7];
        }
        return 65535;
    }

    public final void b(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f8122b;
            if (i10 < iArr.length) {
                this.f8121a = (1 << i10) | this.f8121a;
                iArr[i10] = i11;
            }
        }
    }
}
