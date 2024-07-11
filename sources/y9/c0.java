package y9;

import com.appfab.facematchlive.data.ApiService;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class c0 implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final y f9663a = y.f9770c;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f9664b = new Object[0];

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Class f9665c = ApiService.class;
    public final /* synthetic */ d0 d;

    public c0(d0 d0Var) {
        this.d = d0Var;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean z;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f9664b;
        }
        y yVar = this.f9663a;
        if (!yVar.f9771a || !method.isDefault()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return yVar.b(method, this.f9665c, obj, objArr);
        }
        return this.d.b(method).a(objArr);
    }
}
