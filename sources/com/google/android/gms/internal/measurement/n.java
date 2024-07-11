package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class n extends i {

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f2836q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f2837r;

    /* renamed from: s  reason: collision with root package name */
    public final i3 f2838s;

    public n(n nVar) {
        super(nVar.f2738o);
        ArrayList arrayList = new ArrayList(nVar.f2836q.size());
        this.f2836q = arrayList;
        arrayList.addAll(nVar.f2836q);
        ArrayList arrayList2 = new ArrayList(nVar.f2837r.size());
        this.f2837r = arrayList2;
        arrayList2.addAll(nVar.f2837r);
        this.f2838s = nVar.f2838s;
    }

    public n(String str, ArrayList arrayList, List list, i3 i3Var) {
        super(str);
        this.f2836q = new ArrayList();
        this.f2838s = i3Var;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f2836q.add(((o) it.next()).zzc());
            }
        }
        this.f2837r = new ArrayList(list);
    }

    public final o a(i3 i3Var, List<o> list) {
        s sVar;
        i3 c10 = this.f2838s.c();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f2836q;
            int size = arrayList.size();
            sVar = o.f2850a;
            if (i10 >= size) {
                break;
            }
            int size2 = list.size();
            String str = (String) arrayList.get(i10);
            if (i10 < size2) {
                c10.f(str, i3Var.a(list.get(i10)));
            } else {
                c10.f(str, sVar);
            }
            i10++;
        }
        Iterator it = this.f2837r.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            o a10 = c10.a(oVar);
            if (a10 instanceof p) {
                a10 = c10.a(oVar);
            }
            if (a10 instanceof g) {
                return ((g) a10).f2709o;
            }
        }
        return sVar;
    }

    public final o q() {
        return new n(this);
    }
}
