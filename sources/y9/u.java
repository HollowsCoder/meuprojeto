package y9;

import i9.d0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import y9.f;

@IgnoreJRERequirement
public final class u extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public static final u f9730a = new u();

    @IgnoreJRERequirement
    public static final class a<T> implements f<d0, Optional<T>> {

        /* renamed from: o  reason: collision with root package name */
        public final f<d0, T> f9731o;

        public a(f<d0, T> fVar) {
            this.f9731o = fVar;
        }

        public final Object a(Object obj) {
            return Optional.ofNullable(this.f9731o.a((d0) obj));
        }
    }

    public final f<d0, ?> b(Type type, Annotation[] annotationArr, d0 d0Var) {
        if (h0.f(type) != Optional.class) {
            return null;
        }
        return new a(d0Var.d(h0.e(0, (ParameterizedType) type), annotationArr));
    }
}
