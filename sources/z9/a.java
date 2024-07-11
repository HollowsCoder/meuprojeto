package z9;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import i9.d0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import s2.t;
import y9.f;

public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public final Gson f9974a;

    public a(Gson gson) {
        this.f9974a = gson;
    }

    public final f a(Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f9974a;
        return new b(gson, gson.getAdapter(typeToken));
    }

    public final f<d0, ?> b(Type type, Annotation[] annotationArr, y9.d0 d0Var) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f9974a;
        return new t((Object) gson, (Object) gson.getAdapter(typeToken));
    }
}
