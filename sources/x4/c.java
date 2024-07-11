package x4;

import android.content.SharedPreferences;
import h5.o5;
import h5.p;
import h5.p4;
import h5.z6;
import java.util.concurrent.Callable;

public final class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9489a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9490b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9491c;
    public final /* synthetic */ Object d;

    public c(SharedPreferences sharedPreferences, String str, Long l) {
        this.f9491c = sharedPreferences;
        this.f9490b = str;
        this.d = l;
    }

    public final Object call() {
        int i10 = this.f9489a;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return Long.valueOf(((SharedPreferences) this.f9491c).getLong(this.f9490b, ((Long) obj).longValue()));
            default:
                p4 p4Var = (p4) obj;
                p4Var.f5631a.j();
                o5 o5Var = p4Var.f5631a.f5854v;
                z6.E(o5Var);
                o5Var.g();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public c(p4 p4Var, p pVar, String str) {
        this.d = p4Var;
        this.f9491c = pVar;
        this.f9490b = str;
    }
}
