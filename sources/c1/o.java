package c1;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.c;
import androidx.appcompat.widget.x0;
import c1.j;
import java.util.ArrayList;
import java.util.Iterator;

public class o extends j {
    public ArrayList<j> L = new ArrayList<>();
    public boolean M = true;
    public int N;
    public boolean O = false;
    public int P = 0;

    public class a extends m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f2121a;

        public a(j jVar) {
            this.f2121a = jVar;
        }

        public final void b(j jVar) {
            this.f2121a.D();
            jVar.A(this);
        }
    }

    public static class b extends m {

        /* renamed from: a  reason: collision with root package name */
        public final o f2122a;

        public b(o oVar) {
            this.f2122a = oVar;
        }

        public final void b(j jVar) {
            o oVar = this.f2122a;
            int i10 = oVar.N - 1;
            oVar.N = i10;
            if (i10 == 0) {
                oVar.O = false;
                oVar.r();
            }
            jVar.A(this);
        }

        public final void e(j jVar) {
            o oVar = this.f2122a;
            if (!oVar.O) {
                oVar.K();
                oVar.O = true;
            }
        }
    }

    public final void A(j.d dVar) {
        super.A(dVar);
    }

    public final void B(View view) {
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            this.L.get(i10).B(view);
        }
        this.f2103t.remove(view);
    }

    public final void C(ViewGroup viewGroup) {
        super.C(viewGroup);
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L.get(i10).C(viewGroup);
        }
    }

    public final void D() {
        if (this.L.isEmpty()) {
            K();
            r();
            return;
        }
        b bVar = new b(this);
        Iterator<j> it = this.L.iterator();
        while (it.hasNext()) {
            it.next().c(bVar);
        }
        this.N = this.L.size();
        if (!this.M) {
            for (int i10 = 1; i10 < this.L.size(); i10++) {
                this.L.get(i10 - 1).c(new a(this.L.get(i10)));
            }
            j jVar = this.L.get(0);
            if (jVar != null) {
                jVar.D();
                return;
            }
            return;
        }
        Iterator<j> it2 = this.L.iterator();
        while (it2.hasNext()) {
            it2.next().D();
        }
    }

    public final void E(long j8) {
        ArrayList<j> arrayList;
        this.f2100q = j8;
        if (j8 >= 0 && (arrayList = this.L) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.L.get(i10).E(j8);
            }
        }
    }

    public final void F(j.c cVar) {
        this.G = cVar;
        this.P |= 8;
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L.get(i10).F(cVar);
        }
    }

    public final void G(TimeInterpolator timeInterpolator) {
        this.P |= 1;
        ArrayList<j> arrayList = this.L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.L.get(i10).G(timeInterpolator);
            }
        }
        this.f2101r = timeInterpolator;
    }

    public final void H(c cVar) {
        super.H(cVar);
        this.P |= 4;
        if (this.L != null) {
            for (int i10 = 0; i10 < this.L.size(); i10++) {
                this.L.get(i10).H(cVar);
            }
        }
    }

    public final void I() {
        this.P |= 2;
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L.get(i10).I();
        }
    }

    public final void J(long j8) {
        this.f2099p = j8;
    }

    public final String L(String str) {
        String L2 = super.L(str);
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            StringBuilder h10 = x0.h(L2, "\n");
            h10.append(this.L.get(i10).L(str + "  "));
            L2 = h10.toString();
        }
        return L2;
    }

    public final void M(j jVar) {
        this.L.add(jVar);
        jVar.w = this;
        long j8 = this.f2100q;
        if (j8 >= 0) {
            jVar.E(j8);
        }
        if ((this.P & 1) != 0) {
            jVar.G(this.f2101r);
        }
        if ((this.P & 2) != 0) {
            jVar.I();
        }
        if ((this.P & 4) != 0) {
            jVar.H(this.H);
        }
        if ((this.P & 8) != 0) {
            jVar.F(this.G);
        }
    }

    public final void c(j.d dVar) {
        super.c(dVar);
    }

    public final void cancel() {
        super.cancel();
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L.get(i10).cancel();
        }
    }

    public final void d(View view) {
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            this.L.get(i10).d(view);
        }
        this.f2103t.add(view);
    }

    public final void h(q qVar) {
        View view = qVar.f2127b;
        if (x(view)) {
            Iterator<j> it = this.L.iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (next.x(view)) {
                    next.h(qVar);
                    qVar.f2128c.add(next);
                }
            }
        }
    }

    public final void j(q qVar) {
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L.get(i10).j(qVar);
        }
    }

    public final void k(q qVar) {
        View view = qVar.f2127b;
        if (x(view)) {
            Iterator<j> it = this.L.iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (next.x(view)) {
                    next.k(qVar);
                    qVar.f2128c.add(next);
                }
            }
        }
    }

    /* renamed from: n */
    public final j clone() {
        o oVar = (o) super.clone();
        oVar.L = new ArrayList<>();
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            j n10 = this.L.get(i10).clone();
            oVar.L.add(n10);
            n10.w = oVar;
        }
        return oVar;
    }

    public final void q(ViewGroup viewGroup, o.c cVar, o.c cVar2, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        long j8 = this.f2099p;
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = this.L.get(i10);
            if (j8 > 0 && (this.M || i10 == 0)) {
                long j10 = jVar.f2099p;
                if (j10 > 0) {
                    jVar.J(j10 + j8);
                } else {
                    jVar.J(j8);
                }
            }
            jVar.q(viewGroup, cVar, cVar2, arrayList, arrayList2);
        }
    }

    public final void z(View view) {
        super.z(view);
        int size = this.L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L.get(i10).z(view);
        }
    }
}
