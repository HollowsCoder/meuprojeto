package h5;

import com.google.android.gms.internal.measurement.u8;
import java.util.concurrent.Callable;
import m1.i;

public final /* synthetic */ class z3 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5834a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5835b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5836c;

    public /* synthetic */ z3(String str, int i10, Object obj) {
        this.f5834a = i10;
        this.f5836c = obj;
        this.f5835b = str;
    }

    public final Object call() {
        int i10 = this.f5834a;
        String str = this.f5835b;
        Object obj = this.f5836c;
        switch (i10) {
            case 0:
                return new u8(new i((c4) obj, str));
            default:
                p4 p4Var = (p4) obj;
                p4Var.f5631a.j();
                i iVar = p4Var.f5631a.f5850q;
                z6.E(iVar);
                return iVar.E(str);
        }
    }
}
