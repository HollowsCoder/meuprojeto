package h5;

import java.util.concurrent.Callable;

public final class k4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5507a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5508b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f5509c;
    public final /* synthetic */ String d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p4 f5510e;

    public /* synthetic */ k4(p4 p4Var, String str, String str2, String str3, int i10) {
        this.f5507a = i10;
        this.f5510e = p4Var;
        this.f5508b = str;
        this.f5509c = str2;
        this.d = str3;
    }

    public final Object call() {
        int i10 = this.f5507a;
        String str = this.f5508b;
        String str2 = this.d;
        String str3 = this.f5509c;
        p4 p4Var = this.f5510e;
        switch (i10) {
            case 0:
                p4Var.f5631a.j();
                i iVar = p4Var.f5631a.f5850q;
                z6.E(iVar);
                return iVar.F(str, str3, str2);
            default:
                p4Var.f5631a.j();
                i iVar2 = p4Var.f5631a.f5850q;
                z6.E(iVar2);
                return iVar2.J(str, str3, str2);
        }
    }
}
