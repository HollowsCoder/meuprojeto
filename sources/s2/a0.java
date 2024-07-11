package s2;

import com.bumptech.glide.load.data.d;
import q2.f;
import s2.h;
import w2.n;

public final class a0 implements d.a<Object> {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ n.a f8554o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ b0 f8555p;

    public a0(b0 b0Var, n.a aVar) {
        this.f8555p = b0Var;
        this.f8554o = aVar;
    }

    public final void c(Exception exc) {
        boolean z;
        b0 b0Var = this.f8555p;
        n.a<?> aVar = this.f8554o;
        n.a<?> aVar2 = b0Var.f8562t;
        if (aVar2 == null || aVar2 != aVar) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            f fVar = b0Var.u;
            d<Data> dVar = aVar.f9194c;
            b0Var.f8558p.i(fVar, exc, dVar, dVar.e());
        }
    }

    public final void d(Object obj) {
        boolean z;
        b0 b0Var = this.f8555p;
        n.a<?> aVar = this.f8554o;
        n.a<?> aVar2 = b0Var.f8562t;
        if (aVar2 == null || aVar2 != aVar) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            l lVar = b0Var.f8557o.f8594p;
            if (obj == null || !lVar.c(aVar.f9194c.e())) {
                h.a aVar3 = b0Var.f8558p;
                f fVar = aVar.f9192a;
                d<Data> dVar = aVar.f9194c;
                aVar3.l(fVar, obj, dVar, dVar.e(), b0Var.u);
                return;
            }
            b0Var.f8561s = obj;
            b0Var.f8558p.g();
        }
    }
}
