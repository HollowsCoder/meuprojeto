package c9;

import java.util.NoSuchElementException;
import o8.n;

public final class b extends n {

    /* renamed from: o  reason: collision with root package name */
    public final int f2197o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2198p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2199q;

    /* renamed from: r  reason: collision with root package name */
    public int f2200r;

    public b(int i10, int i11, int i12) {
        this.f2197o = i12;
        this.f2198p = i11;
        boolean z = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z = false;
        }
        this.f2199q = z;
        this.f2200r = !z ? i11 : i10;
    }

    public final boolean hasNext() {
        return this.f2199q;
    }

    public final int nextInt() {
        int i10 = this.f2200r;
        if (i10 != this.f2198p) {
            this.f2200r = this.f2197o + i10;
        } else if (this.f2199q) {
            this.f2199q = false;
        } else {
            throw new NoSuchElementException();
        }
        return i10;
    }
}
