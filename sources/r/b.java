package r;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import q.e;
import q.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<e> f8277a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final a f8278b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final f f8279c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public e.b f8280a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f8281b;

        /* renamed from: c  reason: collision with root package name */
        public int f8282c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f8283e;

        /* renamed from: f  reason: collision with root package name */
        public int f8284f;

        /* renamed from: g  reason: collision with root package name */
        public int f8285g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f8286h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f8287i;

        /* renamed from: j  reason: collision with root package name */
        public int f8288j;
    }

    /* renamed from: r.b$b  reason: collision with other inner class name */
    public interface C0118b {
    }

    public b(f fVar) {
        this.f8279c = fVar;
    }

    public final boolean a(int i10, e eVar, C0118b bVar) {
        boolean z;
        boolean z10;
        boolean z11;
        boolean z12;
        e.b[] bVarArr = eVar.U;
        e.b bVar2 = bVarArr[0];
        a aVar = this.f8278b;
        aVar.f8280a = bVar2;
        boolean z13 = true;
        aVar.f8281b = bVarArr[1];
        aVar.f8282c = eVar.k();
        aVar.d = eVar.i();
        aVar.f8287i = false;
        aVar.f8288j = i10;
        e.b bVar3 = aVar.f8280a;
        e.b bVar4 = e.b.MATCH_CONSTRAINT;
        if (bVar3 == bVar4) {
            z = true;
        } else {
            z = false;
        }
        if (aVar.f8281b == bVar4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z || eVar.Y <= 0.0f) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 || eVar.Y <= 0.0f) {
            z12 = false;
        } else {
            z12 = true;
        }
        int[] iArr = eVar.f8185t;
        if (z11 && iArr[0] == 4) {
            aVar.f8280a = e.b.FIXED;
        }
        if (z12 && iArr[1] == 4) {
            aVar.f8281b = e.b.FIXED;
        }
        ((ConstraintLayout.c) bVar).b(eVar, aVar);
        eVar.E(aVar.f8283e);
        eVar.B(aVar.f8284f);
        eVar.E = aVar.f8286h;
        int i11 = aVar.f8285g;
        eVar.f8156c0 = i11;
        if (i11 <= 0) {
            z13 = false;
        }
        eVar.E = z13;
        aVar.f8288j = 0;
        return aVar.f8287i;
    }

    public final void b(f fVar, int i10, int i11, int i12) {
        int i13 = fVar.f8157d0;
        int i14 = fVar.f8159e0;
        fVar.f8157d0 = 0;
        fVar.f8159e0 = 0;
        fVar.E(i11);
        fVar.B(i12);
        if (i13 < 0) {
            i13 = 0;
        }
        fVar.f8157d0 = i13;
        if (i14 < 0) {
            i14 = 0;
        }
        fVar.f8159e0 = i14;
        f fVar2 = this.f8279c;
        fVar2.f8192u0 = i10;
        fVar2.H();
    }

    public final void c(f fVar) {
        ArrayList<e> arrayList = this.f8277a;
        arrayList.clear();
        int size = fVar.f8205r0.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = fVar.f8205r0.get(i10);
            e.b[] bVarArr = eVar.U;
            e.b bVar = bVarArr[0];
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 || bVarArr[1] == bVar2) {
                arrayList.add(eVar);
            }
        }
        fVar.t0.f8291b = true;
    }
}
