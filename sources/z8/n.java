package z8;

import d9.b;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final o f9972a;

    /* renamed from: b  reason: collision with root package name */
    public static final b[] f9973b = new b[0];

    static {
        o oVar = null;
        try {
            oVar = (o) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (oVar == null) {
            oVar = new o();
        }
        f9972a = oVar;
    }
}
