package y9;

import java.io.IOException;
import y9.i;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ i.a.C0169a f9684o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ d f9685p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ b0 f9686q;

    public /* synthetic */ h(i.a.C0169a aVar, d dVar, b0 b0Var) {
        this.f9684o = aVar;
        this.f9685p = dVar;
        this.f9686q = b0Var;
    }

    public final void run() {
        i.a aVar = i.a.this;
        boolean b10 = aVar.f9696p.b();
        d dVar = this.f9685p;
        if (b10) {
            dVar.a(aVar, new IOException("Canceled"));
        } else {
            dVar.b(aVar, this.f9686q);
        }
    }
}
