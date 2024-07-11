package d8;

import android.content.Context;
import y6.b;
import y6.k;

public final class f {

    public interface a<T> {
        String c(Context context);
    }

    public static b<?> a(String str, String str2) {
        a aVar = new a(str, str2);
        b.a<d> a10 = b.a(d.class);
        a10.d = 1;
        a10.f9564e = new v1.a(aVar);
        return a10.b();
    }

    public static b<?> b(String str, a<Context> aVar) {
        b.a<d> a10 = b.a(d.class);
        a10.d = 1;
        a10.a(new k(1, 0, Context.class));
        a10.f9564e = new e(str, aVar);
        return a10.b();
    }
}
