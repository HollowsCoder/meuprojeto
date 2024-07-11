package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import h0.d;
import n.f;
import n.i;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final i<RecyclerView.c0, a> f1759a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final f<RecyclerView.c0> f1760b = new f<>();

    public static class a {
        public static final d d = new d(20);

        /* renamed from: a  reason: collision with root package name */
        public int f1761a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.k.c f1762b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.k.c f1763c;

        public static a a() {
            a aVar = (a) d.b();
            return aVar == null ? new a() : aVar;
        }
    }

    public final RecyclerView.k.c a(RecyclerView.c0 c0Var, int i10) {
        a l;
        RecyclerView.k.c cVar;
        i<RecyclerView.c0, a> iVar = this.f1759a;
        int e10 = iVar.e(c0Var);
        if (e10 >= 0 && (l = iVar.l(e10)) != null) {
            int i11 = l.f1761a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                l.f1761a = i12;
                if (i10 == 4) {
                    cVar = l.f1762b;
                } else if (i10 == 8) {
                    cVar = l.f1763c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    iVar.j(e10);
                    l.f1761a = 0;
                    l.f1762b = null;
                    l.f1763c = null;
                    a.d.a(l);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void b(RecyclerView.c0 c0Var) {
        a orDefault = this.f1759a.getOrDefault(c0Var, null);
        if (orDefault != null) {
            orDefault.f1761a &= -2;
        }
    }

    public final void c(RecyclerView.c0 c0Var) {
        f<RecyclerView.c0> fVar = this.f1760b;
        int j8 = fVar.j() - 1;
        while (true) {
            if (j8 < 0) {
                break;
            } else if (c0Var == fVar.k(j8)) {
                Object[] objArr = fVar.f7307q;
                Object obj = objArr[j8];
                Object obj2 = f.f7304s;
                if (obj != obj2) {
                    objArr[j8] = obj2;
                    fVar.f7305o = true;
                }
            } else {
                j8--;
            }
        }
        a remove = this.f1759a.remove(c0Var);
        if (remove != null) {
            remove.f1761a = 0;
            remove.f1762b = null;
            remove.f1763c = null;
            a.d.a(remove);
        }
    }
}
