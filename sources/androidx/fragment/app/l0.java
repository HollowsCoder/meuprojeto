package androidx.fragment.app;

import android.view.View;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class l0 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f1203o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1204p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1205q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1206r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1207s;

    public l0(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1203o = i10;
        this.f1204p = arrayList;
        this.f1205q = arrayList2;
        this.f1206r = arrayList3;
        this.f1207s = arrayList4;
    }

    public final void run() {
        for (int i10 = 0; i10 < this.f1203o; i10++) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.i.v((View) this.f1204p.get(i10), (String) this.f1205q.get(i10));
            w.i.v((View) this.f1206r.get(i10), (String) this.f1207s.get(i10));
        }
    }
}
