package y9;

import java.lang.reflect.Array;

public final class w extends x<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f9733a;

    public w(x xVar) {
        this.f9733a = xVar;
    }

    public final void a(z zVar, Object obj) {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                this.f9733a.a(zVar, Array.get(obj, i10));
            }
        }
    }
}
