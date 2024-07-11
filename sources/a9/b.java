package a9;

import java.util.Random;
import z8.g;

public final class b extends a {

    /* renamed from: q  reason: collision with root package name */
    public final a f117q = new a();

    public static final class a extends ThreadLocal<Random> {
        public final Object initialValue() {
            return new Random();
        }
    }

    public final Random c() {
        Object obj = this.f117q.get();
        g.e(obj, "implStorage.get()");
        return (Random) obj;
    }
}
