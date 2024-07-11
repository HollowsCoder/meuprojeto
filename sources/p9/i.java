package p9;

import java.io.IOException;
import l9.a;
import p9.f;

public final class i extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f.d f8029e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f8030f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f8031g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str, f.d dVar, int i10, int i11) {
        super(str, true);
        this.f8029e = dVar;
        this.f8030f = i10;
        this.f8031g = i11;
    }

    public final long a() {
        f fVar = f.this;
        int i10 = this.f8030f;
        int i11 = this.f8031g;
        fVar.getClass();
        try {
            fVar.M.f(i10, i11, true);
            return -1;
        } catch (IOException e10) {
            fVar.b(e10);
            return -1;
        }
    }
}
