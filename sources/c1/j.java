package c1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.appcompat.widget.x0;
import com.karumi.dexter.BuildConfig;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import n.e;
import n.f;

public abstract class j implements Cloneable {
    public static final int[] I = {2, 1, 3, 4};
    public static final a J = new a();
    public static final ThreadLocal<n.b<Animator, b>> K = new ThreadLocal<>();
    public final ArrayList<Animator> A = new ArrayList<>();
    public int B = 0;
    public boolean C = false;
    public boolean D = false;
    public ArrayList<d> E = null;
    public ArrayList<Animator> F = new ArrayList<>();
    public c G;
    public androidx.activity.result.c H = J;

    /* renamed from: o  reason: collision with root package name */
    public final String f2098o = getClass().getName();

    /* renamed from: p  reason: collision with root package name */
    public long f2099p = -1;

    /* renamed from: q  reason: collision with root package name */
    public long f2100q = -1;

    /* renamed from: r  reason: collision with root package name */
    public TimeInterpolator f2101r = null;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList<Integer> f2102s = new ArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<View> f2103t = new ArrayList<>();
    public o.c u = new o.c(2);

    /* renamed from: v  reason: collision with root package name */
    public o.c f2104v = new o.c(2);
    public o w = null;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f2105x = I;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<q> f2106y;
    public ArrayList<q> z;

    public static class a extends androidx.activity.result.c {
        public final Path m(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final View f2107a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2108b;

        /* renamed from: c  reason: collision with root package name */
        public final q f2109c;
        public final c0 d;

        /* renamed from: e  reason: collision with root package name */
        public final j f2110e;

        public b(View view, String str, j jVar, b0 b0Var, q qVar) {
            this.f2107a = view;
            this.f2108b = str;
            this.f2109c = qVar;
            this.d = b0Var;
            this.f2110e = jVar;
        }
    }

    public static abstract class c {
    }

    public interface d {
        void a();

        void b(j jVar);

        void c();

        void d();

        void e(j jVar);
    }

    public static void e(o.c cVar, View view, q qVar) {
        ((n.b) cVar.f7535a).put(view, qVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) cVar.f7536b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        String k10 = w.i.k(view);
        if (k10 != null) {
            if (((n.b) cVar.d).containsKey(k10)) {
                ((n.b) cVar.d).put(k10, null);
            } else {
                ((n.b) cVar.d).put(k10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                f fVar = (f) cVar.f7537c;
                if (fVar.f7305o) {
                    fVar.e();
                }
                if (e.m(fVar.f7306p, fVar.f7308r, itemIdAtPosition) >= 0) {
                    View view2 = (View) fVar.h(itemIdAtPosition, (Long) null);
                    if (view2 != null) {
                        w.d.r(view2, false);
                        fVar.i(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                w.d.r(view, true);
                fVar.i(itemIdAtPosition, view);
            }
        }
    }

    public static n.b<Animator, b> t() {
        ThreadLocal<n.b<Animator, b>> threadLocal = K;
        n.b<Animator, b> bVar = threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        n.b<Animator, b> bVar2 = new n.b<>();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean y(q qVar, q qVar2, String str) {
        Object obj = qVar.f2126a.get(str);
        Object obj2 = qVar2.f2126a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(d dVar) {
        ArrayList<d> arrayList = this.E;
        if (arrayList != null) {
            arrayList.remove(dVar);
            if (this.E.size() == 0) {
                this.E = null;
            }
        }
    }

    public void B(View view) {
        this.f2103t.remove(view);
    }

    public void C(ViewGroup viewGroup) {
        boolean z10;
        if (this.C) {
            if (!this.D) {
                n.b<Animator, b> t10 = t();
                int i10 = t10.f7333q;
                x xVar = t.f2131a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    b l = t10.l(i11);
                    if (l.f2107a != null) {
                        c0 c0Var = l.d;
                        if (!(c0Var instanceof b0) || !((b0) c0Var).f2084a.equals(windowId)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            t10.h(i11).resume();
                        }
                    }
                }
                ArrayList<d> arrayList = this.E;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.E.clone();
                    int size = arrayList2.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((d) arrayList2.get(i12)).c();
                    }
                }
            }
            this.C = false;
        }
    }

    public void D() {
        K();
        n.b<Animator, b> t10 = t();
        Iterator<Animator> it = this.F.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (t10.containsKey(next)) {
                K();
                if (next != null) {
                    next.addListener(new k(this, t10));
                    long j8 = this.f2100q;
                    if (j8 >= 0) {
                        next.setDuration(j8);
                    }
                    long j10 = this.f2099p;
                    if (j10 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.f2101r;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new l(this));
                    next.start();
                }
            }
        }
        this.F.clear();
        r();
    }

    public void E(long j8) {
        this.f2100q = j8;
    }

    public void F(c cVar) {
        this.G = cVar;
    }

    public void G(TimeInterpolator timeInterpolator) {
        this.f2101r = timeInterpolator;
    }

    public void H(androidx.activity.result.c cVar) {
        if (cVar == null) {
            cVar = J;
        }
        this.H = cVar;
    }

    public void I() {
    }

    public void J(long j8) {
        this.f2099p = j8;
    }

    public final void K() {
        if (this.B == 0) {
            ArrayList<d> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d) arrayList2.get(i10)).e(this);
                }
            }
            this.D = false;
        }
        this.B++;
    }

    public String L(String str) {
        StringBuilder g10 = x0.g(str);
        g10.append(getClass().getSimpleName());
        g10.append("@");
        g10.append(Integer.toHexString(hashCode()));
        g10.append(": ");
        String sb = g10.toString();
        if (this.f2100q != -1) {
            StringBuilder h10 = x0.h(sb, "dur(");
            h10.append(this.f2100q);
            h10.append(") ");
            sb = h10.toString();
        }
        if (this.f2099p != -1) {
            StringBuilder h11 = x0.h(sb, "dly(");
            h11.append(this.f2099p);
            h11.append(") ");
            sb = h11.toString();
        }
        if (this.f2101r != null) {
            StringBuilder h12 = x0.h(sb, "interp(");
            h12.append(this.f2101r);
            h12.append(") ");
            sb = h12.toString();
        }
        ArrayList<Integer> arrayList = this.f2102s;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f2103t;
        if (size <= 0 && arrayList2.size() <= 0) {
            return sb;
        }
        String e10 = b0.d.e(sb, "tgts(");
        if (arrayList.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i10 > 0) {
                    e10 = b0.d.e(e10, ", ");
                }
                StringBuilder g11 = x0.g(e10);
                g11.append(arrayList.get(i10));
                e10 = g11.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (i11 > 0) {
                    e10 = b0.d.e(e10, ", ");
                }
                StringBuilder g12 = x0.g(e10);
                g12.append(arrayList2.get(i11));
                e10 = g12.toString();
            }
        }
        return b0.d.e(e10, ")");
    }

    public void c(d dVar) {
        if (this.E == null) {
            this.E = new ArrayList<>();
        }
        this.E.add(dVar);
    }

    public void cancel() {
        ArrayList<Animator> arrayList = this.A;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            arrayList.get(size).cancel();
        }
        ArrayList<d> arrayList2 = this.E;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.E.clone();
            int size2 = arrayList3.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((d) arrayList3.get(i10)).d();
            }
        }
    }

    public void d(View view) {
        this.f2103t.add(view);
    }

    public abstract void h(q qVar);

    public final void i(View view, boolean z10) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                q qVar = new q(view);
                if (z10) {
                    k(qVar);
                } else {
                    h(qVar);
                }
                qVar.f2128c.add(this);
                j(qVar);
                e(z10 ? this.u : this.f2104v, view, qVar);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), z10);
                }
            }
        }
    }

    public void j(q qVar) {
    }

    public abstract void k(q qVar);

    public final void l(ViewGroup viewGroup, boolean z10) {
        m(z10);
        ArrayList<Integer> arrayList = this.f2102s;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f2103t;
        if (size > 0 || arrayList2.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                View findViewById = viewGroup.findViewById(arrayList.get(i10).intValue());
                if (findViewById != null) {
                    q qVar = new q(findViewById);
                    if (z10) {
                        k(qVar);
                    } else {
                        h(qVar);
                    }
                    qVar.f2128c.add(this);
                    j(qVar);
                    e(z10 ? this.u : this.f2104v, findViewById, qVar);
                }
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                View view = arrayList2.get(i11);
                q qVar2 = new q(view);
                if (z10) {
                    k(qVar2);
                } else {
                    h(qVar2);
                }
                qVar2.f2128c.add(this);
                j(qVar2);
                e(z10 ? this.u : this.f2104v, view, qVar2);
            }
            return;
        }
        i(viewGroup, z10);
    }

    public final void m(boolean z10) {
        o.c cVar;
        if (z10) {
            ((n.b) this.u.f7535a).clear();
            ((SparseArray) this.u.f7536b).clear();
            cVar = this.u;
        } else {
            ((n.b) this.f2104v.f7535a).clear();
            ((SparseArray) this.f2104v.f7536b).clear();
            cVar = this.f2104v;
        }
        ((f) cVar.f7537c).c();
    }

    /* renamed from: n */
    public j clone() {
        try {
            j jVar = (j) super.clone();
            jVar.F = new ArrayList<>();
            jVar.u = new o.c(2);
            jVar.f2104v = new o.c(2);
            jVar.f2106y = null;
            jVar.z = null;
            return jVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator p(ViewGroup viewGroup, q qVar, q qVar2) {
        return null;
    }

    public void q(ViewGroup viewGroup, o.c cVar, o.c cVar2, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        boolean z10;
        Animator p10;
        Animator animator;
        q qVar;
        View view;
        q qVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        n.b<Animator, b> t10 = t();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            q qVar3 = arrayList.get(i10);
            q qVar4 = arrayList2.get(i10);
            if (qVar3 != null && !qVar3.f2128c.contains(this)) {
                qVar3 = null;
            }
            if (qVar4 != null && !qVar4.f2128c.contains(this)) {
                qVar4 = null;
            }
            if (!(qVar3 == null && qVar4 == null)) {
                if (qVar3 == null || qVar4 == null || w(qVar3, qVar4)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (p10 = p(viewGroup2, qVar3, qVar4)) != null) {
                    if (qVar4 != null) {
                        String[] u10 = u();
                        view = qVar4.f2127b;
                        if (u10 != null && u10.length > 0) {
                            qVar2 = new q(view);
                            q qVar5 = (q) ((n.b) cVar2.f7535a).getOrDefault(view, null);
                            if (qVar5 != null) {
                                int i11 = 0;
                                while (i11 < u10.length) {
                                    HashMap hashMap = qVar2.f2126a;
                                    Animator animator3 = p10;
                                    String str = u10[i11];
                                    hashMap.put(str, qVar5.f2126a.get(str));
                                    i11++;
                                    p10 = animator3;
                                    u10 = u10;
                                }
                            }
                            Animator animator4 = p10;
                            int i12 = t10.f7333q;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= i12) {
                                    animator2 = animator4;
                                    break;
                                }
                                b orDefault = t10.getOrDefault(t10.h(i13), null);
                                if (orDefault.f2109c != null && orDefault.f2107a == view && orDefault.f2108b.equals(this.f2098o) && orDefault.f2109c.equals(qVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            o.c cVar3 = cVar2;
                            animator2 = p10;
                            qVar2 = null;
                        }
                        animator = animator2;
                        qVar = qVar2;
                    } else {
                        o.c cVar4 = cVar2;
                        view = qVar3.f2127b;
                        animator = p10;
                        qVar = null;
                    }
                    if (animator != null) {
                        String str2 = this.f2098o;
                        x xVar = t.f2131a;
                        b0 b0Var = new b0(viewGroup2);
                        b bVar = r0;
                        b bVar2 = new b(view, str2, this, b0Var, qVar);
                        t10.put(animator, bVar);
                        this.F.add(animator);
                    }
                    i10++;
                    viewGroup2 = viewGroup;
                }
            }
            o.c cVar5 = cVar2;
            i10++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator5 = this.F.get(sparseIntArray.keyAt(i14));
                animator5.setStartDelay(animator5.getStartDelay() + (((long) sparseIntArray.valueAt(i14)) - Long.MAX_VALUE));
            }
        }
    }

    public final void r() {
        int i10 = this.B - 1;
        this.B = i10;
        if (i10 == 0) {
            ArrayList<d> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((d) arrayList2.get(i11)).b(this);
                }
            }
            for (int i12 = 0; i12 < ((f) this.u.f7537c).j(); i12++) {
                View view = (View) ((f) this.u.f7537c).k(i12);
                if (view != null) {
                    WeakHashMap<View, b0> weakHashMap = w.f6004a;
                    w.d.r(view, false);
                }
            }
            for (int i13 = 0; i13 < ((f) this.f2104v.f7537c).j(); i13++) {
                View view2 = (View) ((f) this.f2104v.f7537c).k(i13);
                if (view2 != null) {
                    WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
                    w.d.r(view2, false);
                }
            }
            this.D = true;
        }
    }

    public final q s(View view, boolean z10) {
        o oVar = this.w;
        if (oVar != null) {
            return oVar.s(view, z10);
        }
        ArrayList<q> arrayList = z10 ? this.f2106y : this.z;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            q qVar = arrayList.get(i10);
            if (qVar == null) {
                return null;
            }
            if (qVar.f2127b == view) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return null;
        }
        return (z10 ? this.z : this.f2106y).get(i10);
    }

    public final String toString() {
        return L(BuildConfig.FLAVOR);
    }

    public String[] u() {
        return null;
    }

    public final q v(View view, boolean z10) {
        o.c cVar;
        o oVar = this.w;
        if (oVar != null) {
            return oVar.v(view, z10);
        }
        if (z10) {
            cVar = this.u;
        } else {
            cVar = this.f2104v;
        }
        return (q) ((n.b) cVar.f7535a).getOrDefault(view, null);
    }

    public boolean w(q qVar, q qVar2) {
        if (qVar == null || qVar2 == null) {
            return false;
        }
        String[] u10 = u();
        if (u10 != null) {
            int length = u10.length;
            int i10 = 0;
            while (i10 < length) {
                if (!y(qVar, qVar2, u10[i10])) {
                    i10++;
                }
            }
            return false;
        }
        for (String y10 : qVar.f2126a.keySet()) {
            if (y(qVar, qVar2, y10)) {
            }
        }
        return false;
        return true;
    }

    public final boolean x(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f2102s;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f2103t;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void z(View view) {
        int i10;
        if (!this.D) {
            n.b<Animator, b> t10 = t();
            int i11 = t10.f7333q;
            x xVar = t.f2131a;
            WindowId windowId = view.getWindowId();
            int i12 = i11 - 1;
            while (true) {
                i10 = 0;
                if (i12 < 0) {
                    break;
                }
                b l = t10.l(i12);
                if (l.f2107a != null) {
                    c0 c0Var = l.d;
                    if ((c0Var instanceof b0) && ((b0) c0Var).f2084a.equals(windowId)) {
                        i10 = 1;
                    }
                    if (i10 != 0) {
                        t10.h(i12).pause();
                    }
                }
                i12--;
            }
            ArrayList<d> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                while (i10 < size) {
                    ((d) arrayList2.get(i10)).a();
                    i10++;
                }
            }
            this.C = true;
        }
    }
}
