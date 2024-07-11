package a4;

import a4.f;
import a4.h;
import android.content.Context;
import m8.a;
import w3.b;

public final class w implements b<v> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f107a;

    /* renamed from: b  reason: collision with root package name */
    public final a<String> f108b;

    /* renamed from: c  reason: collision with root package name */
    public final a<Integer> f109c;

    public w(a aVar) {
        f fVar = f.a.f70a;
        h hVar = h.a.f72a;
        this.f107a = aVar;
        this.f108b = fVar;
        this.f109c = hVar;
    }

    public final Object get() {
        return new v(this.f109c.get().intValue(), this.f107a.get(), this.f108b.get());
    }
}
