package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.n f1860a;

    /* renamed from: b  reason: collision with root package name */
    public int f1861b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1862c = new Rect();

    public s(RecyclerView.n nVar) {
        this.f1860a = nVar;
    }

    public static s a(RecyclerView.n nVar, int i10) {
        if (i10 == 0) {
            return new q(nVar);
        }
        if (i10 == 1) {
            return new r(nVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i10);
}
