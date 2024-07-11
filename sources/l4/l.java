package l4;

import l4.b;
import z4.c;

public final class l implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f6928a;

    public l(d dVar) {
        this.f6928a = dVar;
    }

    public final void a(boolean z) {
        c cVar = this.f6928a.f6891i;
        cVar.sendMessage(cVar.obtainMessage(1, Boolean.valueOf(z)));
    }
}
