package p1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import h1.l;
import j1.d;
import java.util.ArrayList;
import java.util.Collections;
import m1.e;
import o1.n;

public final class g extends b {

    /* renamed from: y  reason: collision with root package name */
    public final d f7847y;

    public g(l lVar, e eVar) {
        super(lVar, eVar);
        d dVar = new d(lVar, this, new n("__container", eVar.f7828a, false));
        this.f7847y = dVar;
        dVar.c(Collections.emptyList(), Collections.emptyList());
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.f7847y.a(rectF, this.l, z);
    }

    public final void k(Canvas canvas, Matrix matrix, int i10) {
        this.f7847y.e(canvas, matrix, i10);
    }

    public final void o(e eVar, int i10, ArrayList arrayList, e eVar2) {
        this.f7847y.g(eVar, i10, arrayList, eVar2);
    }
}
