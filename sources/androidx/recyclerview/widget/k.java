package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class k extends z {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f1785s;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f1786h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f1787i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<b> f1788j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<a> f1789k = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.c0>> l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<ArrayList<b>> f1790m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<ArrayList<a>> f1791n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f1792o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f1793p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f1794q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f1795r = new ArrayList<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.c0 f1796a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.c0 f1797b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1798c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1799e;

        /* renamed from: f  reason: collision with root package name */
        public final int f1800f;

        public a(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i10, int i11, int i12, int i13) {
            this.f1796a = c0Var;
            this.f1797b = c0Var2;
            this.f1798c = i10;
            this.d = i11;
            this.f1799e = i12;
            this.f1800f = i13;
        }

        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.f1796a + ", newHolder=" + this.f1797b + ", fromX=" + this.f1798c + ", fromY=" + this.d + ", toX=" + this.f1799e + ", toY=" + this.f1800f + '}';
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView.c0 f1801a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1802b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1803c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1804e;

        public b(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
            this.f1801a = c0Var;
            this.f1802b = i10;
            this.f1803c = i11;
            this.d = i12;
            this.f1804e = i13;
        }
    }

    public static void h(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((RecyclerView.c0) arrayList.get(size)).f1609a.animate().cancel();
            } else {
                return;
            }
        }
    }

    public final void d(RecyclerView.c0 c0Var) {
        View view = c0Var.f1609a;
        view.animate().cancel();
        ArrayList<b> arrayList = this.f1788j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (arrayList.get(size).f1801a == c0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(c0Var);
                arrayList.remove(size);
            }
        }
        j(c0Var, this.f1789k);
        if (this.f1786h.remove(c0Var)) {
            view.setAlpha(1.0f);
            c(c0Var);
        }
        if (this.f1787i.remove(c0Var)) {
            view.setAlpha(1.0f);
            c(c0Var);
        }
        ArrayList<ArrayList<a>> arrayList2 = this.f1791n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = arrayList2.get(size2);
            j(c0Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<b>> arrayList4 = this.f1790m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((b) arrayList5.get(size4)).f1801a == c0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(c0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.c0>> arrayList6 = this.l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList7 = arrayList6.get(size5);
                if (arrayList7.remove(c0Var)) {
                    view.setAlpha(1.0f);
                    c(c0Var);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f1794q.remove(c0Var);
                this.f1792o.remove(c0Var);
                this.f1795r.remove(c0Var);
                this.f1793p.remove(c0Var);
                i();
                return;
            }
        }
    }

    public final void e() {
        ArrayList<b> arrayList = this.f1788j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = arrayList.get(size);
            View view = bVar.f1801a.f1609a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.f1801a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.c0> arrayList2 = this.f1786h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.c0> arrayList3 = this.f1787i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.c0 c0Var = arrayList3.get(size3);
            c0Var.f1609a.setAlpha(1.0f);
            c(c0Var);
            arrayList3.remove(size3);
        }
        ArrayList<a> arrayList4 = this.f1789k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = arrayList4.get(size4);
            RecyclerView.c0 c0Var2 = aVar.f1796a;
            if (c0Var2 != null) {
                k(aVar, c0Var2);
            }
            RecyclerView.c0 c0Var3 = aVar.f1797b;
            if (c0Var3 != null) {
                k(aVar, c0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList<ArrayList<b>> arrayList5 = this.f1790m;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList6 = arrayList5.get(size5);
                int size6 = arrayList6.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        b bVar2 = (b) arrayList6.get(size6);
                        View view2 = bVar2.f1801a.f1609a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        c(bVar2.f1801a);
                        arrayList6.remove(size6);
                        if (arrayList6.isEmpty()) {
                            arrayList5.remove(arrayList6);
                        }
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.c0>> arrayList7 = this.l;
            int size7 = arrayList7.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList8 = arrayList7.get(size7);
                int size8 = arrayList8.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.c0 c0Var4 = (RecyclerView.c0) arrayList8.get(size8);
                        c0Var4.f1609a.setAlpha(1.0f);
                        c(c0Var4);
                        arrayList8.remove(size8);
                        if (arrayList8.isEmpty()) {
                            arrayList7.remove(arrayList8);
                        }
                    }
                }
            }
            ArrayList<ArrayList<a>> arrayList9 = this.f1791n;
            int size9 = arrayList9.size();
            while (true) {
                size9--;
                if (size9 < 0) {
                    break;
                }
                ArrayList arrayList10 = arrayList9.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        a aVar2 = (a) arrayList10.get(size10);
                        RecyclerView.c0 c0Var5 = aVar2.f1796a;
                        if (c0Var5 != null) {
                            k(aVar2, c0Var5);
                        }
                        RecyclerView.c0 c0Var6 = aVar2.f1797b;
                        if (c0Var6 != null) {
                            k(aVar2, c0Var6);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList9.remove(arrayList10);
                        }
                    }
                }
            }
            h(this.f1794q);
            h(this.f1793p);
            h(this.f1792o);
            h(this.f1795r);
            ArrayList<RecyclerView.k.a> arrayList11 = this.f1632b;
            int size11 = arrayList11.size();
            for (int i10 = 0; i10 < size11; i10++) {
                arrayList11.get(i10).a();
            }
            arrayList11.clear();
        }
    }

    public final boolean f() {
        return !this.f1787i.isEmpty() || !this.f1789k.isEmpty() || !this.f1788j.isEmpty() || !this.f1786h.isEmpty() || !this.f1793p.isEmpty() || !this.f1794q.isEmpty() || !this.f1792o.isEmpty() || !this.f1795r.isEmpty() || !this.f1790m.isEmpty() || !this.l.isEmpty() || !this.f1791n.isEmpty();
    }

    public final boolean g(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
        View view = c0Var.f1609a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) c0Var.f1609a.getTranslationY());
        l(c0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(c0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX((float) (-i14));
        }
        if (i15 != 0) {
            view.setTranslationY((float) (-i15));
        }
        this.f1788j.add(new b(c0Var, translationX, translationY, i12, i13));
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList<RecyclerView.k.a> arrayList = this.f1632b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).a();
            }
            arrayList.clear();
        }
    }

    public final void j(RecyclerView.c0 c0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                a aVar = (a) arrayList.get(size);
                if (k(aVar, c0Var) && aVar.f1796a == null && aVar.f1797b == null) {
                    arrayList.remove(aVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean k(a aVar, RecyclerView.c0 c0Var) {
        if (aVar.f1797b == c0Var) {
            aVar.f1797b = null;
        } else if (aVar.f1796a != c0Var) {
            return false;
        } else {
            aVar.f1796a = null;
        }
        c0Var.f1609a.setAlpha(1.0f);
        View view = c0Var.f1609a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(c0Var);
        return true;
    }

    public final void l(RecyclerView.c0 c0Var) {
        if (f1785s == null) {
            f1785s = new ValueAnimator().getInterpolator();
        }
        c0Var.f1609a.animate().setInterpolator(f1785s);
        d(c0Var);
    }
}
