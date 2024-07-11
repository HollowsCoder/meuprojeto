package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;

public final class d implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1764o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ k f1765p;

    public d(k kVar, ArrayList arrayList) {
        this.f1765p = kVar;
        this.f1764o = arrayList;
    }

    public final void run() {
        View view;
        ArrayList arrayList = this.f1764o;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k kVar = this.f1765p;
            if (hasNext) {
                k.a aVar = (k.a) it.next();
                kVar.getClass();
                RecyclerView.c0 c0Var = aVar.f1796a;
                View view2 = null;
                if (c0Var == null) {
                    view = null;
                } else {
                    view = c0Var.f1609a;
                }
                RecyclerView.c0 c0Var2 = aVar.f1797b;
                if (c0Var2 != null) {
                    view2 = c0Var2.f1609a;
                }
                ArrayList<RecyclerView.c0> arrayList2 = kVar.f1795r;
                long j8 = kVar.f1635f;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(j8);
                    arrayList2.add(aVar.f1796a);
                    duration.translationX((float) (aVar.f1799e - aVar.f1798c));
                    duration.translationY((float) (aVar.f1800f - aVar.d));
                    duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator animate = view2.animate();
                    arrayList2.add(aVar.f1797b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(j8).alpha(1.0f).setListener(new j(kVar, aVar, animate, view2)).start();
                }
            } else {
                arrayList.clear();
                kVar.f1791n.remove(arrayList);
                return;
            }
        }
    }
}
