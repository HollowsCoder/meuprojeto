package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class u extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public r f1864c;
    public q d;

    public static int e(View view, s sVar) {
        return ((sVar.c(view) / 2) + sVar.e(view)) - ((sVar.l() / 2) + sVar.k());
    }

    public static View f(RecyclerView.n nVar, s sVar) {
        int w = nVar.w();
        View view = null;
        if (w == 0) {
            return null;
        }
        int l = (sVar.l() / 2) + sVar.k();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < w; i11++) {
            View v10 = nVar.v(i11);
            int abs = Math.abs(((sVar.c(v10) / 2) + sVar.e(v10)) - l);
            if (abs < i10) {
                view = v10;
                i10 = abs;
            }
        }
        return view;
    }

    public final int[] b(RecyclerView.n nVar, View view) {
        int[] iArr = new int[2];
        if (nVar.d()) {
            iArr[0] = e(view, g(nVar));
        } else {
            iArr[0] = 0;
        }
        if (nVar.e()) {
            iArr[1] = e(view, h(nVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View c(RecyclerView.n nVar) {
        s sVar;
        if (nVar.e()) {
            sVar = h(nVar);
        } else if (!nVar.d()) {
            return null;
        } else {
            sVar = g(nVar);
        }
        return f(nVar, sVar);
    }

    public final s g(RecyclerView.n nVar) {
        q qVar = this.d;
        if (qVar == null || qVar.f1860a != nVar) {
            this.d = new q(nVar);
        }
        return this.d;
    }

    public final s h(RecyclerView.n nVar) {
        r rVar = this.f1864c;
        if (rVar == null || rVar.f1860a != nVar) {
            this.f1864c = new r(nVar);
        }
        return this.f1864c;
    }
}
