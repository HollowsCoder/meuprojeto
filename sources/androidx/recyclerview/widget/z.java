package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

public abstract class z extends RecyclerView.k {

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1869g = true;

    public final boolean a(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, RecyclerView.k.c cVar, RecyclerView.k.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f1636a;
        int i13 = cVar.f1637b;
        if (c0Var2.o()) {
            int i14 = cVar.f1636a;
            i10 = cVar.f1637b;
            i11 = i14;
        } else {
            i11 = cVar2.f1636a;
            i10 = cVar2.f1637b;
        }
        k kVar = (k) this;
        if (c0Var == c0Var2) {
            return kVar.g(c0Var, i12, i13, i11, i10);
        }
        View view = c0Var.f1609a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        kVar.l(c0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        kVar.l(c0Var2);
        View view2 = c0Var2.f1609a;
        view2.setTranslationX((float) (-((int) (((float) (i11 - i12)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i10 - i13)) - translationY))));
        view2.setAlpha(0.0f);
        kVar.f1789k.add(new k.a(c0Var, c0Var2, i12, i13, i11, i10));
        return true;
    }

    public abstract boolean g(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13);
}
