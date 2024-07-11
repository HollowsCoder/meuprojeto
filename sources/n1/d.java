package n1;

import java.util.Collection;
import java.util.List;
import k1.a;
import k1.e;
import k1.i;

public final class d extends i {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f7343c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, List list) {
        super(list);
        this.f7343c = i10;
    }

    public final a a() {
        int i10 = this.f7343c;
        Collection collection = this.f7358b;
        switch (i10) {
            case 0:
                return new e((List) collection);
            default:
                return new i((List) collection);
        }
    }
}
