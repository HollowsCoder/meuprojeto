package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;

public final class c implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1757o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ k f1758p;

    public c(k kVar, ArrayList arrayList) {
        this.f1758p = kVar;
        this.f1757o = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f1757o;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k kVar = this.f1758p;
            if (hasNext) {
                k.b bVar = (k.b) it.next();
                RecyclerView.c0 c0Var = bVar.f1801a;
                kVar.getClass();
                View view = c0Var.f1609a;
                int i10 = bVar.d - bVar.f1802b;
                int i11 = bVar.f1804e - bVar.f1803c;
                if (i10 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i11 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate = view.animate();
                kVar.f1793p.add(c0Var);
                animate.setDuration(kVar.f1634e).setListener(new h(kVar, c0Var, i10, view, i11, animate)).start();
            } else {
                arrayList.clear();
                kVar.f1790m.remove(arrayList);
                return;
            }
        }
    }
}
