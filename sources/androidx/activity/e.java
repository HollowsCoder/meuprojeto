package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.b;
import androidx.activity.result.f;
import c.a;

public final class e implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f180o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ a.C0025a f181p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f182q;

    public e(ComponentActivity.b bVar, int i10, a.C0025a aVar) {
        this.f182q = bVar;
        this.f180o = i10;
        this.f181p = aVar;
    }

    public final void run() {
        b<O> bVar;
        T t10 = this.f181p.f2064a;
        ComponentActivity.b bVar2 = this.f182q;
        String str = (String) bVar2.f200b.get(Integer.valueOf(this.f180o));
        if (str != null) {
            f.a aVar = (f.a) bVar2.f203f.get(str);
            if (aVar == null || (bVar = aVar.f206a) == null) {
                bVar2.f205h.remove(str);
                bVar2.f204g.put(str, t10);
            } else if (bVar2.f202e.remove(str)) {
                bVar.a(t10);
            }
        }
    }
}
