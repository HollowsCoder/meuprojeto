package c5;

import o7.b;
import o7.d;
import o7.e;

public final /* synthetic */ class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ p f2175a = new p();

    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new b(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
    }
}
