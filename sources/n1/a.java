package n1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k1.b;
import k1.j;

public final class a extends i {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f7341c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, ArrayList arrayList) {
        super((List) arrayList);
        this.f7341c = i10;
    }

    public final k1.a a() {
        int i10 = this.f7341c;
        Collection collection = this.f7358b;
        switch (i10) {
            case 0:
                return new b((List) collection);
            default:
                return new j((List) collection);
        }
    }
}
