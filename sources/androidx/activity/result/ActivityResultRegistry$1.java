package androidx.activity.result;

import android.os.Bundle;
import androidx.activity.result.f;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import c.a;
import c.c;
import java.util.HashMap;

class ActivityResultRegistry$1 implements l {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ String f188o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ b f189p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ a f190q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ f f191r;

    public ActivityResultRegistry$1(f fVar, String str, b bVar, c cVar) {
        this.f191r = fVar;
        this.f188o = str;
        this.f189p = bVar;
        this.f190q = cVar;
    }

    public final void f(n nVar, h.b bVar) {
        boolean equals = h.b.ON_START.equals(bVar);
        String str = this.f188o;
        f fVar = this.f191r;
        if (equals) {
            HashMap hashMap = fVar.f203f;
            b bVar2 = this.f189p;
            a aVar = this.f190q;
            hashMap.put(str, new f.a(bVar2, aVar));
            HashMap hashMap2 = fVar.f204g;
            if (hashMap2.containsKey(str)) {
                Object obj = hashMap2.get(str);
                hashMap2.remove(str);
                bVar2.a(obj);
            }
            Bundle bundle = fVar.f205h;
            a aVar2 = (a) bundle.getParcelable(str);
            if (aVar2 != null) {
                bundle.remove(str);
                bVar2.a(aVar.c(aVar2.f193p, aVar2.f192o));
            }
        } else if (h.b.ON_STOP.equals(bVar)) {
            fVar.f203f.remove(str);
        } else if (h.b.ON_DESTROY.equals(bVar)) {
            fVar.f(str);
        }
    }
}
