package z9;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import i9.b0;
import i9.t;
import i9.z;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import w9.g;
import w9.j;
import y9.f;

public final class b<T> implements f<T, b0> {

    /* renamed from: q  reason: collision with root package name */
    public static final t f9975q = t.a.a("application/json; charset=UTF-8");

    /* renamed from: r  reason: collision with root package name */
    public static final Charset f9976r = Charset.forName("UTF-8");

    /* renamed from: o  reason: collision with root package name */
    public final Gson f9977o;

    /* renamed from: p  reason: collision with root package name */
    public final TypeAdapter<T> f9978p;

    static {
        t.f6320f.getClass();
    }

    public b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f9977o = gson;
        this.f9978p = typeAdapter;
    }

    public final Object a(Object obj) {
        w9.f fVar = new w9.f();
        JsonWriter newJsonWriter = this.f9977o.newJsonWriter(new OutputStreamWriter(new g(fVar), f9976r));
        this.f9978p.write(newJsonWriter, obj);
        newJsonWriter.close();
        j u = fVar.u();
        b0.f6166a.getClass();
        z8.g.f(u, "content");
        return new z(f9975q, u);
    }
}
