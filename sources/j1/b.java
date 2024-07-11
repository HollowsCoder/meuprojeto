package j1;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import k1.a;
import k1.d;
import n1.h;
import t1.g;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final List f6416a;

    public b(int i10) {
        if (i10 != 2) {
            this.f6416a = new ArrayList();
        } else {
            this.f6416a = new ArrayList();
        }
    }

    public /* synthetic */ b(ArrayList arrayList) {
        this.f6416a = arrayList;
    }

    public final a a() {
        List list = this.f6416a;
        return ((u1.a) list.get(0)).c() ? new d(1, list) : new k1.h(list);
    }

    public final List b() {
        return this.f6416a;
    }

    public final boolean c() {
        List list = this.f6416a;
        return list.size() == 1 && ((u1.a) list.get(0)).c();
    }

    public final void d(Path path) {
        List list = this.f6416a;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                s sVar = (s) list.get(size);
                g.a aVar = g.f8886a;
                if (sVar != null && !sVar.f6514a) {
                    g.a(path, sVar.d.l() / 100.0f, sVar.f6517e.l() / 100.0f, sVar.f6518f.l() / 360.0f);
                }
            } else {
                return;
            }
        }
    }
}
