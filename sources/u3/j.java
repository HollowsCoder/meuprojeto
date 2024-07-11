package u3;

import android.content.Context;
import c4.b;
import c4.c;
import m8.a;
import w3.b;
import w3.c;

public final class j implements b<i> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f9096a;

    /* renamed from: b  reason: collision with root package name */
    public final a<c4.a> f9097b;

    /* renamed from: c  reason: collision with root package name */
    public final a<c4.a> f9098c;

    public j(c cVar) {
        c4.b bVar = b.a.f2138a;
        c4.c cVar2 = c.a.f2139a;
        this.f9096a = cVar;
        this.f9097b = bVar;
        this.f9098c = cVar2;
    }

    public final Object get() {
        return new i(this.f9096a.get(), this.f9097b.get(), this.f9098c.get());
    }
}
