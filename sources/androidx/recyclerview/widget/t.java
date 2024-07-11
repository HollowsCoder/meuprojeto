package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public final class t extends o {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ u f1863q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.f1863q = uVar;
    }

    public final void c(View view, RecyclerView.y.a aVar) {
        u uVar = this.f1863q;
        int[] b10 = uVar.b(uVar.f1742a.getLayoutManager(), view);
        int i10 = b10[0];
        int i11 = b10[1];
        int ceil = (int) Math.ceil(((double) g(Math.max(Math.abs(i10), Math.abs(i11)))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f1853j;
            aVar.f1681a = i10;
            aVar.f1682b = i11;
            aVar.f1683c = ceil;
            aVar.f1684e = decelerateInterpolator;
            aVar.f1685f = true;
        }
    }

    public final float f(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    public final int g(int i10) {
        return Math.min(100, super.g(i10));
    }
}
