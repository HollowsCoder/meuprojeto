package f0;

import android.os.Handler;
import b0.e;
import f0.j;
import s6.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f4556a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f4557b;

    public c(e.a aVar, Handler handler) {
        this.f4556a = aVar;
        this.f4557b = handler;
    }

    public final void a(j.a aVar) {
        boolean z;
        int i10 = aVar.f4575b;
        if (i10 == 0) {
            z = true;
        } else {
            z = false;
        }
        Handler handler = this.f4557b;
        a aVar2 = this.f4556a;
        if (z) {
            handler.post(new a(aVar2, aVar.f4574a));
        } else {
            handler.post(new b(aVar2, i10));
        }
    }
}
