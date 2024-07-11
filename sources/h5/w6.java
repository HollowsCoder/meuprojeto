package h5;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

public final class w6 implements i3, f7 {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ z6 f5799o;

    public /* synthetic */ w6(z6 z6Var) {
        this.f5799o = z6Var;
    }

    public final void a(String str, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        z6 z6Var = this.f5799o;
        if (isEmpty) {
            i4 i4Var = z6Var.f5856y;
            if (i4Var != null) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.f5397t.b("_err", "AppId not known when logging event");
                return;
            }
            return;
        }
        z6Var.f().n(new m5(this, str, bundle));
    }

    public final void b(String str, int i10, Throwable th, byte[] bArr, Map map) {
        this.f5799o.i(str, i10, th, bArr, map);
    }
}
