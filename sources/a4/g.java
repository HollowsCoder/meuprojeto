package a4;

import android.content.Context;
import m8.a;
import w3.b;

public final class g implements b<String> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f71a;

    public g(a<Context> aVar) {
        this.f71a = aVar;
    }

    public final Object get() {
        String packageName = this.f71a.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
