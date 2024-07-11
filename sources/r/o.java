package r;

import androidx.appcompat.widget.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o.d;
import q.b;
import q.e;
import q.f;

public final class o {

    /* renamed from: f  reason: collision with root package name */
    public static int f8315f;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<e> f8316a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final int f8317b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f8318c;
    public ArrayList<a> d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f8319e = -1;

    public class a {
        public a(e eVar, d dVar) {
            new WeakReference(eVar);
            q.d dVar2 = eVar.J;
            dVar.getClass();
            d.o(dVar2);
            d.o(eVar.K);
            d.o(eVar.L);
            d.o(eVar.M);
            d.o(eVar.N);
        }
    }

    public o(int i10) {
        int i11 = f8315f;
        f8315f = i11 + 1;
        this.f8317b = i11;
        this.f8318c = i10;
    }

    public final void a(ArrayList<o> arrayList) {
        int size = this.f8316a.size();
        if (this.f8319e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f8319e == oVar.f8317b) {
                    c(this.f8318c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(d dVar, int i10) {
        int i11;
        q.d dVar2;
        ArrayList<e> arrayList = this.f8316a;
        if (arrayList.size() == 0) {
            return 0;
        }
        f fVar = (f) arrayList.get(0).V;
        dVar.u();
        fVar.b(dVar, false);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList.get(i12).b(dVar, false);
        }
        if (i10 == 0 && fVar.A0 > 0) {
            b.a(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.B0 > 0) {
            b.a(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.q();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.d = new ArrayList<>();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.d.add(new a(arrayList.get(i13), dVar));
        }
        if (i10 == 0) {
            i11 = d.o(fVar.J);
            dVar2 = fVar.L;
        } else {
            i11 = d.o(fVar.K);
            dVar2 = fVar.M;
        }
        int o10 = d.o(dVar2);
        dVar.u();
        return o10 - i11;
    }

    public final void c(int i10, o oVar) {
        Iterator<e> it = this.f8316a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i11 = oVar.f8317b;
            if (hasNext) {
                e next = it.next();
                ArrayList<e> arrayList = oVar.f8316a;
                if (!arrayList.contains(next)) {
                    arrayList.add(next);
                }
                if (i10 == 0) {
                    next.f8180p0 = i11;
                } else {
                    next.f8182q0 = i11;
                }
            } else {
                this.f8319e = i11;
                return;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i10 = this.f8318c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else if (i10 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.f8317b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator<e> it = this.f8316a.iterator();
        while (it.hasNext()) {
            StringBuilder h10 = x0.h(sb2, " ");
            h10.append(it.next().f8169j0);
            sb2 = h10.toString();
        }
        return b0.d.e(sb2, " >");
    }
}
