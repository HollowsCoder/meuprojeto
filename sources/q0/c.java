package q0;

import java.nio.ByteBuffer;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f8206a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f8207b;

    /* renamed from: c  reason: collision with root package name */
    public int f8208c;
    public int d;

    public c() {
        if (d.f8209p == null) {
            d.f8209p = new d();
        }
    }

    public final int a(int i10) {
        if (i10 < this.d) {
            return this.f8207b.getShort(this.f8208c + i10);
        }
        return 0;
    }
}
