package a4;

import w3.b;

public final class i implements b<e> {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final i f73a = new i();
    }

    public final Object get() {
        a aVar = e.f69a;
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
