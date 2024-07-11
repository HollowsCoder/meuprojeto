package d2;

import com.appfab.facematchlive.FaceMatchApp;
import com.appfab.facematchlive.ui.flow.main.MainActivity;
import com.appfab.facematchlive.ui.flow.selector.ActivitySelector;
import com.karumi.dexter.R;
import java.io.File;
import java.util.List;
import v7.a;
import w8.a;
import w8.b;
import x1.e;
import y6.r;
import z8.g;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f4128o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f4129p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f4130q;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f4128o = i10;
        this.f4129p = obj;
        this.f4130q = obj2;
    }

    public final void run() {
        a.C0141a<T> aVar;
        boolean z;
        File file;
        switch (this.f4128o) {
            case 0:
                Boolean bool = (Boolean) this.f4129p;
                MainActivity mainActivity = (MainActivity) this.f4130q;
                int i10 = MainActivity.P;
                g.f(mainActivity, "this$0");
                if (bool == null) {
                    FaceMatchApp a10 = FaceMatchApp.u.a();
                    if (a10 != null) {
                        File file2 = a10.f2223s;
                        if (file2 == null || !file2.exists()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z && (file = a10.f2223s) != null) {
                            b bVar = b.BOTTOM_UP;
                            g.f(bVar, "direction");
                            a.b bVar2 = new a.b();
                            while (true) {
                                boolean z10 = true;
                                while (true) {
                                    if (bVar2.hasNext()) {
                                        File file3 = (File) bVar2.next();
                                        if (file3.delete() || !file3.exists()) {
                                            if (z10) {
                                            }
                                        }
                                        z10 = false;
                                    }
                                }
                            }
                        }
                    }
                    T t10 = mainActivity.E;
                    g.c(t10);
                    ((e) t10).M0.setImageResource(R.drawable.ic_user_default_gray);
                    T t11 = mainActivity.E;
                    g.c(t11);
                    ((e) t11).T0.setImageResource(R.drawable.ic_user_default_gray);
                    T t12 = mainActivity.E;
                    g.c(t12);
                    ((e) t12).Y0.setVisibility(0);
                    T t13 = mainActivity.E;
                    g.c(t13);
                    ((e) t13).Z0.setVisibility(0);
                    T t14 = mainActivity.E;
                    g.c(t14);
                    ((e) t14).X0.setVisibility(8);
                    T t15 = mainActivity.E;
                    g.c(t15);
                    ((e) t15).L0.setVisibility(0);
                    mainActivity.I = null;
                    mainActivity.J = null;
                    return;
                }
                if (g.a(bool, Boolean.TRUE)) {
                    T t16 = mainActivity.E;
                    g.c(t16);
                    ((e) t16).M0.setImageResource(R.drawable.ic_user_default_gray);
                    T t17 = mainActivity.E;
                    g.c(t17);
                    ((e) t17).Y0.setVisibility(0);
                    mainActivity.I = null;
                    T t18 = mainActivity.E;
                    g.c(t18);
                    ((e) t18).X0.setVisibility(8);
                } else if (g.a(bool, Boolean.FALSE)) {
                    T t19 = mainActivity.E;
                    g.c(t19);
                    ((e) t19).T0.setImageResource(R.drawable.ic_user_default_gray);
                    mainActivity.J = null;
                    T t20 = mainActivity.E;
                    g.c(t20);
                    ((e) t20).X0.setVisibility(8);
                    T t21 = mainActivity.E;
                    g.c(t21);
                    ((e) t21).Z0.setVisibility(0);
                } else {
                    return;
                }
                T t22 = mainActivity.E;
                g.c(t22);
                ((e) t22).L0.setVisibility(0);
                return;
            case 1:
                ActivitySelector activitySelector = (ActivitySelector) this.f4129p;
                List list = (List) this.f4130q;
                int i11 = ActivitySelector.L;
                g.f(activitySelector, "this$0");
                g.f(list, "$temp");
                activitySelector.D().e(list);
                activitySelector.D().f4466f.addAll(list);
                if (list.size() <= 0) {
                    activitySelector.finish();
                    return;
                }
                return;
            default:
                r rVar = (r) this.f4129p;
                v7.b<T> bVar3 = (v7.b) this.f4130q;
                if (rVar.f9596b == r.d) {
                    synchronized (rVar) {
                        aVar = rVar.f9595a;
                        rVar.f9595a = null;
                        rVar.f9596b = bVar3;
                    }
                    aVar.d(bVar3);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
        }
    }
}
