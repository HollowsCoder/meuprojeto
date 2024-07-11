package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class r extends s {
    public r(RecyclerView.n nVar) {
        super(nVar);
    }

    public final int b(View view) {
        this.f1860a.getClass();
        return RecyclerView.n.u(view) + view.getBottom() + ((RecyclerView.o) view.getLayoutParams()).bottomMargin;
    }

    public final int c(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        this.f1860a.getClass();
        Rect rect = ((RecyclerView.o) view.getLayoutParams()).f1658b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + oVar.topMargin + oVar.bottomMargin;
    }

    public final int d(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        this.f1860a.getClass();
        Rect rect = ((RecyclerView.o) view.getLayoutParams()).f1658b;
        return view.getMeasuredWidth() + rect.left + rect.right + oVar.leftMargin + oVar.rightMargin;
    }

    public final int e(View view) {
        this.f1860a.getClass();
        return (view.getTop() - RecyclerView.n.K(view)) - ((RecyclerView.o) view.getLayoutParams()).topMargin;
    }

    public final int f() {
        return this.f1860a.f1651o;
    }

    public final int g() {
        RecyclerView.n nVar = this.f1860a;
        return nVar.f1651o - nVar.C();
    }

    public final int h() {
        return this.f1860a.C();
    }

    public final int i() {
        return this.f1860a.f1649m;
    }

    public final int j() {
        return this.f1860a.l;
    }

    public final int k() {
        return this.f1860a.F();
    }

    public final int l() {
        RecyclerView.n nVar = this.f1860a;
        return (nVar.f1651o - nVar.F()) - nVar.C();
    }

    public final int m(View view) {
        RecyclerView.n nVar = this.f1860a;
        Rect rect = this.f1862c;
        nVar.L(view, rect);
        return rect.bottom;
    }

    public final int n(View view) {
        RecyclerView.n nVar = this.f1860a;
        Rect rect = this.f1862c;
        nVar.L(view, rect);
        return rect.top;
    }

    public final void o(int i10) {
        this.f1860a.Q(i10);
    }
}
