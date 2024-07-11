package n1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k1.a;
import k1.d;
import k1.l;

public final class c extends i {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f7342c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, ArrayList arrayList) {
        super((List) arrayList);
        this.f7342c = i10;
    }

    public final a a() {
        int i10 = this.f7342c;
        Collection collection = this.f7358b;
        switch (i10) {
            case 0:
                return new d(0, (List) collection);
            case 1:
                return new d(1, (List) collection);
            default:
                return new l((List) collection);
        }
    }
}
