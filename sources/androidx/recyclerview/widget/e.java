package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

public final class e implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1766o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ k f1767p;

    public e(k kVar, ArrayList arrayList) {
        this.f1767p = kVar;
        this.f1766o = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f1766o;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k kVar = this.f1767p;
            if (hasNext) {
                RecyclerView.c0 c0Var = (RecyclerView.c0) it.next();
                kVar.getClass();
                View view = c0Var.f1609a;
                ViewPropertyAnimator animate = view.animate();
                kVar.f1792o.add(c0Var);
                animate.alpha(1.0f).setDuration(kVar.f1633c).setListener(new g(view, animate, kVar, c0Var)).start();
            } else {
                arrayList.clear();
                kVar.l.remove(arrayList);
                return;
            }
        }
    }
}
