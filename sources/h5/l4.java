package h5;

import java.util.concurrent.Callable;

public final class l4 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5526a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5527b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f5528c;
    public final /* synthetic */ String d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p4 f5529e;

    public /* synthetic */ l4(p4 p4Var, String str, String str2, String str3, int i10) {
        this.f5526a = i10;
        this.f5529e = p4Var;
        this.f5527b = str;
        this.f5528c = str2;
        this.d = str3;
    }

    public final Object call() {
        int i10 = this.f5526a;
        String str = this.f5527b;
        String str2 = this.d;
        String str3 = this.f5528c;
        p4 p4Var = this.f5529e;
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
