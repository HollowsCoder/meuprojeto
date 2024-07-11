package q7;

import java.io.Writer;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f8253a;

    public d(e eVar) {
        this.f8253a = eVar;
    }

    public final void a(Writer writer, Object obj) {
        e eVar = this.f8253a;
        f fVar = new f(writer, eVar.f8258a, eVar.f8259b, eVar.f8260c, eVar.d);
        fVar.g(obj);
        fVar.i();
        fVar.f8263b.flush();
    }
}
