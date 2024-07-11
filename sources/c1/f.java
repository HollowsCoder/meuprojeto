package c1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.m0;
import c1.j;
import c1.n;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedApi"})
public class f extends m0 {

    public class a implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f2088a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2089b;

        public a(View view, ArrayList arrayList) {
            this.f2088a = view;
            this.f2089b = arrayList;
        }

        public final void a() {
        }

        public final void b(j jVar) {
            jVar.A(this);
            this.f2088a.setVisibility(8);
            ArrayList arrayList = this.f2089b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) arrayList.get(i10)).setVisibility(0);
            }
        }

        public final void c() {
        }

        public final void d() {
        }

        public final void e(j jVar) {
            jVar.A(this);
            jVar.c(this);
        }
    }

    public class b extends m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f2090a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2091b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f2092c;
        public final /* synthetic */ ArrayList d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f2093e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2094f;

        public b(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2090a = obj;
            this.f2091b = arrayList;
            this.f2092c = obj2;
            this.d = arrayList2;
            this.f2093e = obj3;
            this.f2094f = arrayList3;
        }

        public final void b(j jVar) {
            jVar.A(this);
        }

        public final void e(j jVar) {
            f fVar = f.this;
            Object obj = this.f2090a;
            if (obj != null) {
                fVar.u(obj, this.f2091b, (ArrayList<View>) null);
            }
            Object obj2 = this.f2092c;
            if (obj2 != null) {
                fVar.u(obj2, this.d, (ArrayList<View>) null);
            }
            Object obj3 = this.f2093e;
            if (obj3 != null) {
                fVar.u(obj3, this.f2094f, (ArrayList<View>) null);
            }
        }
    }

    public class c extends j.c {
    }

    public final void a(View view, Object obj) {
        if (obj != null) {
            ((j) obj).d(view);
        }
    }

    public final void b(Object obj, ArrayList<View> arrayList) {
        boolean z;
        j jVar;
        j jVar2 = (j) obj;
        if (jVar2 != null) {
            int i10 = 0;
            if (jVar2 instanceof o) {
                o oVar = (o) jVar2;
                int size = oVar.L.size();
                while (i10 < size) {
                    if (i10 < 0 || i10 >= oVar.L.size()) {
                        jVar = null;
                    } else {
                        jVar = oVar.L.get(i10);
                    }
                    b(jVar, arrayList);
                    i10++;
                }
                return;
            }
            if (!m0.h(jVar2.f2102s) || !m0.h((List) null) || !m0.h((List) null)) {
                z = true;
            } else {
                z = false;
            }
            if (!z && m0.h(jVar2.f2103t)) {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    jVar2.d(arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public final void c(ViewGroup viewGroup, Object obj) {
        j jVar = (j) obj;
        ArrayList<ViewGroup> arrayList = n.f2116c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            if (w.g.c(viewGroup)) {
                arrayList.add(viewGroup);
                if (jVar == null) {
                    jVar = n.f2114a;
                }
                j n10 = jVar.clone();
                ArrayList orDefault = n.a().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator it = orDefault.iterator();
                    while (it.hasNext()) {
                        ((j) it.next()).z(viewGroup);
                    }
                }
                if (n10 != null) {
                    n10.l(viewGroup, true);
                }
                if (((i) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, (Object) null);
                    if (n10 != null) {
                        n.a aVar = new n.a(viewGroup, n10);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public final boolean e(Object obj) {
        return obj instanceof j;
    }

    public final Object f(Object obj) {
        if (obj != null) {
            return ((j) obj).clone();
        }
        return null;
    }

    public final Object i(Object obj, Object obj2, Object obj3) {
        j jVar = (j) obj;
        j jVar2 = (j) obj2;
        j jVar3 = (j) obj3;
        if (jVar != null && jVar2 != null) {
            o oVar = new o();
            oVar.M(jVar);
            oVar.M(jVar2);
            oVar.M = false;
            jVar = oVar;
        } else if (jVar == null) {
            if (jVar2 != null) {
                jVar = jVar2;
            } else {
                jVar = null;
            }
        }
        if (jVar3 == null) {
            return jVar;
        }
        o oVar2 = new o();
        if (jVar != null) {
            oVar2.M(jVar);
        }
        oVar2.M(jVar3);
        return oVar2;
    }

    public final Object j(Object obj, Object obj2, Object obj3) {
        o oVar = new o();
        if (obj != null) {
            oVar.M((j) obj);
        }
        if (obj2 != null) {
            oVar.M((j) obj2);
        }
        if (obj3 != null) {
            oVar.M((j) obj3);
        }
        return oVar;
    }

    public final void l(Object obj, View view, ArrayList<View> arrayList) {
        ((j) obj).c(new a(view, arrayList));
    }

    public final void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((j) obj).c(new b(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public final void n(View view, Object obj) {
        if (view != null) {
            m0.g(view, new Rect());
            ((j) obj).F(new e());
        }
    }

    public final void o(Object obj, Rect rect) {
        if (obj != null) {
            ((j) obj).F(new c());
        }
    }

    public final void p(Object obj, e0.b bVar, Runnable runnable) {
        j jVar = (j) obj;
        bVar.b(new g(jVar));
        jVar.c(new h(runnable));
    }

    public final void r(Object obj, View view, ArrayList<View> arrayList) {
        o oVar = (o) obj;
        ArrayList<View> arrayList2 = oVar.f2103t;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m0.d(arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(oVar, arrayList);
    }

    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        o oVar = (o) obj;
        if (oVar != null) {
            ArrayList<View> arrayList3 = oVar.f2103t;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            u(oVar, arrayList, arrayList2);
        }
    }

    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        o oVar = new o();
        oVar.M((j) obj);
        return oVar;
    }

    public final void u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        boolean z;
        int i10;
        j jVar;
        j jVar2 = (j) obj;
        int i11 = 0;
        if (jVar2 instanceof o) {
            o oVar = (o) jVar2;
            int size = oVar.L.size();
            while (i11 < size) {
                if (i11 < 0 || i11 >= oVar.L.size()) {
                    jVar = null;
                } else {
                    jVar = oVar.L.get(i11);
                }
                u(jVar, arrayList, arrayList2);
                i11++;
            }
            return;
        }
        if (!m0.h(jVar2.f2102s) || !m0.h((List) null) || !m0.h((List) null)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ArrayList<View> arrayList3 = jVar2.f2103t;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i10 = 0;
                } else {
                    i10 = arrayList2.size();
                }
                while (i11 < i10) {
                    jVar2.d(arrayList2.get(i11));
                    i11++;
                }
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        jVar2.B(arrayList.get(size2));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
