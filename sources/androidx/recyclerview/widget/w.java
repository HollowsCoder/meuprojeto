package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;

public final class w implements a.C0020a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1866a;

    public w(RecyclerView recyclerView) {
        this.f1866a = recyclerView;
    }

    public final void a(a.b bVar) {
        int i10 = bVar.f1739a;
        RecyclerView recyclerView = this.f1866a;
        if (i10 == 1) {
            recyclerView.A.Y(bVar.f1740b, bVar.d);
        } else if (i10 == 2) {
            recyclerView.A.b0(bVar.f1740b, bVar.d);
        } else if (i10 == 4) {
            recyclerView.A.c0(bVar.f1740b, bVar.d);
        } else if (i10 == 8) {
            recyclerView.A.a0(bVar.f1740b, bVar.d);
        }
    }

    public final RecyclerView.c0 b(int i10) {
        RecyclerView recyclerView = this.f1866a;
        int h10 = recyclerView.f1590s.h();
        int i11 = 0;
        RecyclerView.c0 c0Var = null;
        while (true) {
            if (i11 >= h10) {
                break;
            }
            RecyclerView.c0 J = RecyclerView.J(recyclerView.f1590s.g(i11));
            if (J != null && !J.i() && J.f1611c == i10) {
                if (!recyclerView.f1590s.j(J.f1609a)) {
                    c0Var = J;
                    break;
                }
                c0Var = J;
            }
            i11++;
        }
        if (c0Var != null && !recyclerView.f1590s.j(c0Var.f1609a)) {
            return c0Var;
        }
        return null;
    }

    public final void c(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f1866a;
        int h10 = recyclerView.f1590s.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < h10; i15++) {
            View g10 = recyclerView.f1590s.g(i15);
            RecyclerView.c0 J = RecyclerView.J(g10);
            if (J != null && !J.o() && (i13 = J.f1611c) >= i10 && i13 < i14) {
                J.b(2);
                J.a(obj);
                ((RecyclerView.o) g10.getLayoutParams()).f1659c = true;
            }
        }
        RecyclerView.u uVar = recyclerView.f1584p;
        ArrayList<RecyclerView.c0> arrayList = uVar.f1667c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.c0 c0Var = arrayList.get(size);
                if (c0Var != null && (i12 = c0Var.f1611c) >= i10 && i12 < i14) {
                    c0Var.b(2);
                    uVar.e(size);
                }
            } else {
                recyclerView.f1599z0 = true;
                return;
            }
        }
    }

    public final void d(int i10, int i11) {
        RecyclerView recyclerView = this.f1866a;
        int h10 = recyclerView.f1590s.h();
        for (int i12 = 0; i12 < h10; i12++) {
            RecyclerView.c0 J = RecyclerView.J(recyclerView.f1590s.g(i12));
            if (J != null && !J.o() && J.f1611c >= i10) {
                J.l(i11, false);
                recyclerView.f1595v0.f1691f = true;
            }
        }
        ArrayList<RecyclerView.c0> arrayList = recyclerView.f1584p.f1667c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.c0 c0Var = arrayList.get(i13);
            if (c0Var != null && c0Var.f1611c >= i10) {
                c0Var.l(i11, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f1866a;
        int h10 = recyclerView.f1590s.h();
        int i19 = -1;
        if (i10 < i11) {
            i14 = i10;
            i13 = i11;
            i12 = -1;
        } else {
            i13 = i10;
            i14 = i11;
            i12 = 1;
        }
        for (int i20 = 0; i20 < h10; i20++) {
            RecyclerView.c0 J = RecyclerView.J(recyclerView.f1590s.g(i20));
            if (J != null && (i18 = J.f1611c) >= i14 && i18 <= i13) {
                if (i18 == i10) {
                    J.l(i11 - i10, false);
                } else {
                    J.l(i12, false);
                }
                recyclerView.f1595v0.f1691f = true;
            }
        }
        RecyclerView.u uVar = recyclerView.f1584p;
        uVar.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        ArrayList<RecyclerView.c0> arrayList = uVar.f1667c;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            RecyclerView.c0 c0Var = arrayList.get(i21);
            if (c0Var != null && (i17 = c0Var.f1611c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    c0Var.l(i11 - i10, false);
                } else {
                    c0Var.l(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.y0 = true;
    }
}
