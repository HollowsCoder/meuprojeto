package h1;

import h1.l;

public final class m implements l.n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5179a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5180b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f5181c;

    public m(l lVar, int i10, int i11) {
        this.f5181c = lVar;
        this.f5179a = i10;
        this.f5180b = i11;
    }

    public final void run() {
        l lVar = this.f5181c;
        f fVar = lVar.f5147p;
        int i10 = this.f5179a;
        int i11 = this.f5180b;
        if (fVar == null) {
            lVar.f5152v.add(new m(lVar, i10, i11));
            return;
        }
        lVar.f5148q.l((float) i10, ((float) i11) + 0.99f);
    }
}
