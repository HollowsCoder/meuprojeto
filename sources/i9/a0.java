package i9;

import w9.h;

public final class a0 extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ byte[] f6162b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f6163c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f6164e;

    public a0(t tVar, byte[] bArr, int i10, int i11) {
        this.f6162b = bArr;
        this.f6163c = tVar;
        this.d = i10;
        this.f6164e = i11;
    }

    public final long a() {
        return (long) this.d;
    }

    public final t b() {
        return this.f6163c;
    }

    public final void c(h hVar) {
        hVar.write(this.f6162b, this.f6164e, this.d);
    }
}
