package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class q extends s {
    public q(RecyclerView.n nVar) {
        super(nVar);
    }

    public final int b(View view) {
        this.f1860a.getClass();
        return RecyclerView.n.I(view) + view.getRight() + ((RecyclerView.o) view.getLayoutParams()).rightMargin;
    }

    public final int c(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        this.f1860a.getClass();
        Rect rect = ((RecyclerView.o) view.getLayoutParams()).f1658b;
        return view.getMeasuredWidth() + rect.left + rect.right + oVar.leftMargin + oVar.rightMargin;
    }

    public final int d(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        this.f1860a.getClass();
        Rect rect = ((RecyclerView.o) view.getLayoutParams()).f1658b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + oVar.topMargin + oVar.bottomMargin;
    }

    public final int e(View view) {
        this.f1860a.getClass();
        return (view.getLeft() - RecyclerView.n.B(view)) - ((RecyclerView.o) view.getLayoutParams()).leftMargin;
    }

    public final int f() {
        return this.f1860a.f1650n;
    }

    public final int g() {
        RecyclerView.n nVar = this.f1860a;
        return nVar.f1650n - nVar.E();
    }

    public final int h() {
        return this.f1860a.E();
    }

    public final int i() {
        return this.f1860a.l;
    }

    public final int j() {
        return this.f1860a.f1649m;
    }

    public final int k() {
        return this.f1860a.D();
    }

    public final int l() {
        RecyclerView.n nVar = this.f1860a;
        return (nVar.f1650n - nVar.D()) - nVar.E();
    }

    public final int m(View view) {
        RecyclerView.n nVar = this.f1860a;
        Rect rect = this.f1862c;
        nVar.L(view, rect);
        return rect.right;
    }

    public final int n(View view) {
        RecyclerView.n nVar = this.f1860a;
        Rect rect = this.f1862c;
        nVar.L(view, rect);
        return rect.left;
    }

    public final void o(int i10) {
        this.f1860a.P(i10);
    }
}
