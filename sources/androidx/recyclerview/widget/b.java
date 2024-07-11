package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final C0021b f1746a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1747b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1748c = new ArrayList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f1749a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f1750b;

        public final void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f1750b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f1749a &= ~(1 << i10);
        }

        public final int b(int i10) {
            long j8;
            a aVar = this.f1750b;
            if (aVar == null) {
                if (i10 >= 64) {
                    j8 = this.f1749a;
                }
                j8 = this.f1749a & ((1 << i10) - 1);
            } else {
                if (i10 >= 64) {
                    return Long.bitCount(this.f1749a) + aVar.b(i10 - 64);
                }
                j8 = this.f1749a & ((1 << i10) - 1);
            }
            return Long.bitCount(j8);
        }

        public final void c() {
            if (this.f1750b == null) {
                this.f1750b = new a();
            }
        }

        public final boolean d(int i10) {
            if (i10 < 64) {
                return (this.f1749a & (1 << i10)) != 0;
            }
            c();
            return this.f1750b.d(i10 - 64);
        }

        public final void e(int i10, boolean z) {
            if (i10 >= 64) {
                c();
                this.f1750b.e(i10 - 64, z);
                return;
            }
            long j8 = this.f1749a;
            boolean z10 = (Long.MIN_VALUE & j8) != 0;
            long j10 = (1 << i10) - 1;
            this.f1749a = ((j8 & (~j10)) << 1) | (j8 & j10);
            if (z) {
                h(i10);
            } else {
                a(i10);
            }
            if (z10 || this.f1750b != null) {
                c();
                this.f1750b.e(0, z10);
            }
        }

        public final boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f1750b.f(i10 - 64);
            }
            long j8 = 1 << i10;
            long j10 = this.f1749a;
            boolean z = (j10 & j8) != 0;
            long j11 = j10 & (~j8);
            this.f1749a = j11;
            long j12 = j8 - 1;
            this.f1749a = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
            a aVar = this.f1750b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f1750b.f(0);
            }
            return z;
        }

        public final void g() {
            this.f1749a = 0;
            a aVar = this.f1750b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i10) {
            if (i10 >= 64) {
                c();
                this.f1750b.h(i10 - 64);
                return;
            }
            this.f1749a |= 1 << i10;
        }

        public final String toString() {
            if (this.f1750b == null) {
                return Long.toBinaryString(this.f1749a);
            }
            return this.f1750b.toString() + "xx" + Long.toBinaryString(this.f1749a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    public interface C0021b {
    }

    public b(v vVar) {
        this.f1746a = vVar;
    }

    public final void a(View view, int i10, boolean z) {
        int i11;
        C0021b bVar = this.f1746a;
        if (i10 < 0) {
            i11 = ((v) bVar).a();
        } else {
            i11 = f(i10);
        }
        this.f1747b.e(i11, z);
        if (z) {
            i(view);
        }
        RecyclerView recyclerView = ((v) bVar).f1865a;
        recyclerView.addView(view, i11);
        RecyclerView.J(view);
        ArrayList arrayList = recyclerView.Q;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((RecyclerView.p) recyclerView.Q.get(size)).a(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i11;
        C0021b bVar = this.f1746a;
        if (i10 < 0) {
            i11 = ((v) bVar).a();
        } else {
            i11 = f(i10);
        }
        this.f1747b.e(i11, z);
        if (z) {
            i(view);
        }
        v vVar = (v) bVar;
        vVar.getClass();
        RecyclerView.c0 J = RecyclerView.J(view);
        RecyclerView recyclerView = vVar.f1865a;
        if (J != null) {
            if (J.k() || J.o()) {
                J.f1617j &= -257;
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + J + recyclerView.z());
            }
        }
        recyclerView.attachViewToParent(view, i11, layoutParams);
    }

    public final void c(int i10) {
        RecyclerView.c0 J;
        int f10 = f(i10);
        this.f1747b.f(f10);
        v vVar = (v) this.f1746a;
        View childAt = vVar.f1865a.getChildAt(f10);
        RecyclerView recyclerView = vVar.f1865a;
        if (!(childAt == null || (J = RecyclerView.J(childAt)) == null)) {
            if (!J.k() || J.o()) {
                J.b(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + J + recyclerView.z());
            }
        }
        recyclerView.detachViewFromParent(f10);
    }

    public final View d(int i10) {
        return ((v) this.f1746a).f1865a.getChildAt(f(i10));
    }

    public final int e() {
        return ((v) this.f1746a).a() - this.f1748c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int a10 = ((v) this.f1746a).a();
        int i11 = i10;
        while (i11 < a10) {
            a aVar = this.f1747b;
            int b10 = i10 - (i11 - aVar.b(i11));
            if (b10 == 0) {
                while (aVar.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    public final View g(int i10) {
        return ((v) this.f1746a).f1865a.getChildAt(i10);
    }

    public final int h() {
        return ((v) this.f1746a).a();
    }

    public final void i(View view) {
        this.f1748c.add(view);
        v vVar = (v) this.f1746a;
        vVar.getClass();
        RecyclerView.c0 J = RecyclerView.J(view);
        if (J != null) {
            int i10 = J.f1623q;
            View view2 = J.f1609a;
            if (i10 == -1) {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                i10 = w.d.c(view2);
            }
            J.f1622p = i10;
            RecyclerView recyclerView = vVar.f1865a;
            if (recyclerView.L()) {
                J.f1623q = 4;
                recyclerView.I0.add(J);
                return;
            }
            WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
            w.d.s(view2, 4);
        }
    }

    public final boolean j(View view) {
        return this.f1748c.contains(view);
    }

    public final void k(View view) {
        if (this.f1748c.remove(view)) {
            v vVar = (v) this.f1746a;
            vVar.getClass();
            RecyclerView.c0 J = RecyclerView.J(view);
            if (J != null) {
                int i10 = J.f1622p;
                RecyclerView recyclerView = vVar.f1865a;
                if (recyclerView.L()) {
                    J.f1623q = i10;
                    recyclerView.I0.add(J);
                } else {
                    WeakHashMap<View, b0> weakHashMap = w.f6004a;
                    w.d.s(J.f1609a, i10);
                }
                J.f1622p = 0;
            }
        }
    }

    public final String toString() {
        return this.f1747b.toString() + ", hidden list:" + this.f1748c.size();
    }
}
