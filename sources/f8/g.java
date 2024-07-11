package f8;

import com.google.firebase.remoteconfig.internal.a;
import e8.d;
import e8.e;
import java.util.Date;
import m5.a;
import m5.i;
import m5.l;

public final /* synthetic */ class g implements a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.remoteconfig.internal.a f4914o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ i f4915p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ i f4916q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Date f4917r;

    public /* synthetic */ g(com.google.firebase.remoteconfig.internal.a aVar, i iVar, i iVar2, Date date) {
        this.f4914o = aVar;
        this.f4915p = iVar;
        this.f4916q = iVar2;
        this.f4917r = date;
    }

    public final Object c(i iVar) {
        d dVar;
        Date date = this.f4917r;
        com.google.firebase.remoteconfig.internal.a aVar = this.f4914o;
        aVar.getClass();
        i iVar2 = this.f4915p;
        if (!iVar2.m()) {
            dVar = new d("Firebase Installations failed to get installation ID for fetch.", iVar2.h());
        } else {
            i iVar3 = this.f4916q;
            if (!iVar3.m()) {
                dVar = new d("Firebase Installations failed to get installation auth token for fetch.", iVar3.h());
            } else {
                try {
                    a.C0043a a10 = aVar.a((String) iVar2.i(), ((w7.i) iVar3.i()).a(), date);
                    if (a10.f3739a != 0) {
                        return l.e(a10);
                    }
                    return aVar.f3735e.c(a10.f3740b).n(aVar.f3734c, new v1.a(a10));
                } catch (e e10) {
                    return l.d(e10);
                }
            }
        }
        return l.d(dVar);
    }
}
