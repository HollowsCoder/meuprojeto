package p9;

import l9.a;
import n8.i;
import z8.g;

public final class n extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f8045e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f8046f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f8047g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(String str, f fVar, int i10, b bVar) {
        super(str, true);
        this.f8045e = fVar;
        this.f8046f = i10;
        this.f8047g = bVar;
    }

    public final long a() {
        u uVar = this.f8045e.z;
        b bVar = this.f8047g;
        uVar.getClass();
        g.f(bVar, "errorCode");
        synchronized (this.f8045e) {
            this.f8045e.O.remove(Integer.valueOf(this.f8046f));
            i iVar = i.f7501a;
        }
        return -1;
    }
}
