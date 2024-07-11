package androidx.fragment.app;

import androidx.fragment.app.p0;
import java.util.ArrayList;
import java.util.List;

public final class d implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ List f1127o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ p0.e f1128p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ c f1129q;

    public d(c cVar, ArrayList arrayList, p0.e eVar) {
        this.f1129q = cVar;
        this.f1127o = arrayList;
        this.f1128p = eVar;
    }

    public final void run() {
        List list = this.f1127o;
        p0.e eVar = this.f1128p;
        if (list.contains(eVar)) {
            list.remove(eVar);
            this.f1129q.getClass();
            eVar.f1277a.applyState(eVar.f1279c.S);
        }
    }
}
