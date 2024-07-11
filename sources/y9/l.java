package y9;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Method f9703a;

    /* renamed from: b  reason: collision with root package name */
    public final List<?> f9704b;

    public l(Method method, ArrayList arrayList) {
        this.f9703a = method;
        this.f9704b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f9703a;
        return String.format("%s.%s() %s", new Object[]{method.getDeclaringClass().getName(), method.getName(), this.f9704b});
    }
}
