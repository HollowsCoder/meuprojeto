package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class o extends RecyclerView.y {

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f1852i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f1853j = new DecelerateInterpolator();

    /* renamed from: k  reason: collision with root package name */
    public PointF f1854k;
    public final DisplayMetrics l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1855m = false;

    /* renamed from: n  reason: collision with root package name */
    public float f1856n;

    /* renamed from: o  reason: collision with root package name */
    public int f1857o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f1858p = 0;

    public o(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 == 0) {
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        } else if (i14 == 1) {
            return i13 - i11;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public void c(View view, RecyclerView.y.a aVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = this.f1854k;
        int i14 = -1;
        int i15 = 0;
        if (pointF == null || pointF.x == 0.0f) {
            i10 = 0;
        } else if (i13 > 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        RecyclerView.n nVar = this.f1676c;
        if (nVar == null || !nVar.d()) {
            i11 = 0;
        } else {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            i11 = e((view.getLeft() - RecyclerView.n.B(view)) - oVar.leftMargin, RecyclerView.n.I(view) + view.getRight() + oVar.rightMargin, nVar.D(), nVar.f1650n - nVar.E(), i10);
        }
        PointF pointF2 = this.f1854k;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i14 = 0;
        } else if (i12 > 0) {
            i14 = 1;
        }
        RecyclerView.n nVar2 = this.f1676c;
        if (nVar2 != null && nVar2.e()) {
            RecyclerView.o oVar2 = (RecyclerView.o) view.getLayoutParams();
            i15 = e((view.getTop() - RecyclerView.n.K(view)) - oVar2.topMargin, RecyclerView.n.u(view) + view.getBottom() + oVar2.bottomMargin, nVar2.F(), nVar2.f1651o - nVar2.C(), i14);
        }
        int ceil = (int) Math.ceil(((double) g((int) Math.sqrt((double) ((i15 * i15) + (i11 * i11))))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f1853j;
            aVar.f1681a = -i11;
            aVar.f1682b = -i15;
            aVar.f1683c = ceil;
            aVar.f1684e = decelerateInterpolator;
            aVar.f1685f = true;
        }
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int g(int i10) {
        float abs = (float) Math.abs(i10);
        if (!this.f1855m) {
            this.f1856n = f(this.l);
            this.f1855m = true;
        }
        return (int) Math.ceil((double) (abs * this.f1856n));
    }
}
