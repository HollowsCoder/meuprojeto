package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.n implements RecyclerView.y.b {
    public final a A;
    public final b B;
    public final int C;
    public final int[] D;

    /* renamed from: p  reason: collision with root package name */
    public int f1540p;

    /* renamed from: q  reason: collision with root package name */
    public c f1541q;

    /* renamed from: r  reason: collision with root package name */
    public s f1542r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1543s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1544t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1545v;
    public final boolean w;

    /* renamed from: x  reason: collision with root package name */
    public int f1546x;

    /* renamed from: y  reason: collision with root package name */
    public int f1547y;
    public d z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public s f1548a;

        /* renamed from: b  reason: collision with root package name */
        public int f1549b;

        /* renamed from: c  reason: collision with root package name */
        public int f1550c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1551e;

        public a() {
            c();
        }

        public final void a(View view, int i10) {
            int i11;
            if (this.d) {
                int b10 = this.f1548a.b(view);
                s sVar = this.f1548a;
                if (Integer.MIN_VALUE == sVar.f1861b) {
                    i11 = 0;
                } else {
                    i11 = sVar.l() - sVar.f1861b;
                }
                this.f1550c = i11 + b10;
            } else {
                this.f1550c = this.f1548a.e(view);
            }
            this.f1549b = i10;
        }

        public final void b(View view, int i10) {
            int i11;
            int i12;
            s sVar = this.f1548a;
            if (Integer.MIN_VALUE == sVar.f1861b) {
                i11 = 0;
            } else {
                i11 = sVar.l() - sVar.f1861b;
            }
            if (i11 >= 0) {
                a(view, i10);
                return;
            }
            this.f1549b = i10;
            if (this.d) {
                int g10 = (this.f1548a.g() - i11) - this.f1548a.b(view);
                this.f1550c = this.f1548a.g() - g10;
                if (g10 > 0) {
                    int c10 = this.f1550c - this.f1548a.c(view);
                    int k10 = this.f1548a.k();
                    int min = c10 - (Math.min(this.f1548a.e(view) - k10, 0) + k10);
                    if (min < 0) {
                        i12 = Math.min(g10, -min) + this.f1550c;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int e10 = this.f1548a.e(view);
                int k11 = e10 - this.f1548a.k();
                this.f1550c = e10;
                if (k11 > 0) {
                    int g11 = (this.f1548a.g() - Math.min(0, (this.f1548a.g() - i11) - this.f1548a.b(view))) - (this.f1548a.c(view) + e10);
                    if (g11 < 0) {
                        i12 = this.f1550c - Math.min(k11, -g11);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1550c = i12;
        }

        public final void c() {
            this.f1549b = -1;
            this.f1550c = Integer.MIN_VALUE;
            this.d = false;
            this.f1551e = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f1549b + ", mCoordinate=" + this.f1550c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f1551e + '}';
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1552a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1553b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1554c;
        public boolean d;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1555a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f1556b;

        /* renamed from: c  reason: collision with root package name */
        public int f1557c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f1558e;

        /* renamed from: f  reason: collision with root package name */
        public int f1559f;

        /* renamed from: g  reason: collision with root package name */
        public int f1560g;

        /* renamed from: h  reason: collision with root package name */
        public int f1561h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f1562i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f1563j;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.c0> f1564k = null;
        public boolean l;

        public final void a(View view) {
            int i10;
            int a10;
            int size = this.f1564k.size();
            View view2 = null;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < size; i12++) {
                View view3 = this.f1564k.get(i12).f1609a;
                RecyclerView.o oVar = (RecyclerView.o) view3.getLayoutParams();
                if (view3 != view && !oVar.c() && (a10 = (oVar.a() - this.d) * this.f1558e) >= 0 && a10 < i11) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i11 = a10;
                }
            }
            if (view2 == null) {
                i10 = -1;
            } else {
                i10 = ((RecyclerView.o) view2.getLayoutParams()).a();
            }
            this.d = i10;
        }

        public final View b(RecyclerView.u uVar) {
            List<RecyclerView.c0> list = this.f1564k;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    View view = this.f1564k.get(i10).f1609a;
                    RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
                    if (!oVar.c() && this.d == oVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = uVar.i(this.d, Long.MAX_VALUE).f1609a;
            this.d += this.f1558e;
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        public int f1565o;

        /* renamed from: p  reason: collision with root package name */
        public int f1566p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f1567q;

        public class a implements Parcelable.Creator<d> {
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public final Object[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f1565o = parcel.readInt();
            this.f1566p = parcel.readInt();
            this.f1567q = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f1565o = dVar.f1565o;
            this.f1566p = dVar.f1566p;
            this.f1567q = dVar.f1567q;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1565o);
            parcel.writeInt(this.f1566p);
            parcel.writeInt(this.f1567q ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    public LinearLayoutManager(int i10) {
        this.f1540p = 1;
        this.f1544t = false;
        this.u = false;
        this.f1545v = false;
        this.w = true;
        this.f1546x = -1;
        this.f1547y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        d1(i10);
        c((String) null);
        if (this.f1544t) {
            this.f1544t = false;
            o0();
        }
    }

    public void A0(RecyclerView recyclerView, int i10) {
        o oVar = new o(recyclerView.getContext());
        oVar.f1674a = i10;
        B0(oVar);
    }

    public boolean C0() {
        return this.z == null && this.f1543s == this.f1545v;
    }

    public void D0(RecyclerView.z zVar, int[] iArr) {
        boolean z10;
        int i10;
        int i11;
        if (zVar.f1687a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = this.f1542r.l();
        } else {
            i10 = 0;
        }
        if (this.f1541q.f1559f == -1) {
            i11 = 0;
        } else {
            i11 = i10;
            i10 = 0;
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public void E0(RecyclerView.z zVar, c cVar, RecyclerView.n.c cVar2) {
        int i10 = cVar.d;
        if (i10 >= 0 && i10 < zVar.b()) {
            ((m.b) cVar2).a(i10, Math.max(0, cVar.f1560g));
        }
    }

    public final int F0(RecyclerView.z zVar) {
        if (w() == 0) {
            return 0;
        }
        J0();
        s sVar = this.f1542r;
        boolean z10 = !this.w;
        return y.a(zVar, sVar, M0(z10), L0(z10), this, this.w);
    }

    public final int G0(RecyclerView.z zVar) {
        if (w() == 0) {
            return 0;
        }
        J0();
        s sVar = this.f1542r;
        boolean z10 = !this.w;
        return y.b(zVar, sVar, M0(z10), L0(z10), this, this.w, this.u);
    }

    public final int H0(RecyclerView.z zVar) {
        if (w() == 0) {
            return 0;
        }
        J0();
        s sVar = this.f1542r;
        boolean z10 = !this.w;
        return y.c(zVar, sVar, M0(z10), L0(z10), this, this.w);
    }

    public final int I0(int i10) {
        if (i10 == 1) {
            return (this.f1540p != 1 && W0()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f1540p != 1 && W0()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f1540p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f1540p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            return this.f1540p == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i10 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f1540p == 1 ? 1 : Integer.MIN_VALUE;
    }

    public final void J0() {
        if (this.f1541q == null) {
            this.f1541q = new c();
        }
    }

    public final int K0(RecyclerView.u uVar, c cVar, RecyclerView.z zVar, boolean z10) {
        boolean z11;
        int i10 = cVar.f1557c;
        int i11 = cVar.f1560g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f1560g = i11 + i10;
            }
            Z0(uVar, cVar);
        }
        int i12 = cVar.f1557c + cVar.f1561h;
        while (true) {
            if (!cVar.l && i12 <= 0) {
                break;
            }
            int i13 = cVar.d;
            if (i13 < 0 || i13 >= zVar.b()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                break;
            }
            b bVar = this.B;
            bVar.f1552a = 0;
            bVar.f1553b = false;
            bVar.f1554c = false;
            bVar.d = false;
            X0(uVar, zVar, cVar, bVar);
            if (!bVar.f1553b) {
                int i14 = cVar.f1556b;
                int i15 = bVar.f1552a;
                cVar.f1556b = (cVar.f1559f * i15) + i14;
                if (!bVar.f1554c || cVar.f1564k != null || !zVar.f1692g) {
                    cVar.f1557c -= i15;
                    i12 -= i15;
                }
                int i16 = cVar.f1560g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    cVar.f1560g = i17;
                    int i18 = cVar.f1557c;
                    if (i18 < 0) {
                        cVar.f1560g = i17 + i18;
                    }
                    Z0(uVar, cVar);
                }
                if (z10 && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f1557c;
    }

    public final View L0(boolean z10) {
        int i10;
        int i11;
        if (this.u) {
            i11 = w();
            i10 = 0;
        } else {
            i10 = w() - 1;
            i11 = -1;
        }
        return Q0(i10, i11, z10);
    }

    public final boolean M() {
        return true;
    }

    public final View M0(boolean z10) {
        int i10;
        int i11;
        if (this.u) {
            i10 = -1;
            i11 = w() - 1;
        } else {
            i10 = w();
            i11 = 0;
        }
        return Q0(i11, i10, z10);
    }

    public final int N0() {
        View Q0 = Q0(0, w(), false);
        if (Q0 == null) {
            return -1;
        }
        return RecyclerView.n.G(Q0);
    }

    public final int O0() {
        View Q0 = Q0(w() - 1, -1, false);
        if (Q0 == null) {
            return -1;
        }
        return RecyclerView.n.G(Q0);
    }

    public final View P0(int i10, int i11) {
        int i12;
        int i13;
        J0();
        if ((i11 > i10 ? 1 : i11 < i10 ? (char) 65535 : 0) == 0) {
            return v(i10);
        }
        if (this.f1542r.e(v(i10)) < this.f1542r.k()) {
            i13 = 16644;
            i12 = 16388;
        } else {
            i13 = 4161;
            i12 = 4097;
        }
        return (this.f1540p == 0 ? this.f1641c : this.d).a(i10, i11, i13, i12);
    }

    public final View Q0(int i10, int i11, boolean z10) {
        J0();
        return (this.f1540p == 0 ? this.f1641c : this.d).a(i10, i11, z10 ? 24579 : 320, 320);
    }

    public View R0(RecyclerView.u uVar, RecyclerView.z zVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        J0();
        int w10 = w();
        if (z11) {
            i12 = w() - 1;
            i11 = -1;
            i10 = -1;
        } else {
            i11 = w10;
            i12 = 0;
            i10 = 1;
        }
        int b10 = zVar.b();
        int k10 = this.f1542r.k();
        int g10 = this.f1542r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i12 != i11) {
            View v10 = v(i12);
            int G = RecyclerView.n.G(v10);
            int e10 = this.f1542r.e(v10);
            int b11 = this.f1542r.b(v10);
            if (G >= 0 && G < b10) {
                if (!((RecyclerView.o) v10.getLayoutParams()).c()) {
                    boolean z12 = b11 <= k10 && e10 < k10;
                    boolean z13 = e10 >= g10 && b11 > g10;
                    if (!z12 && !z13) {
                        return v10;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = v10;
                        }
                    } else if (!z12) {
                        if (view != null) {
                        }
                        view = v10;
                    }
                    view2 = v10;
                } else if (view3 == null) {
                    view3 = v10;
                }
            }
            i12 += i10;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final void S(RecyclerView recyclerView) {
    }

    public final int S0(int i10, RecyclerView.u uVar, RecyclerView.z zVar, boolean z10) {
        int g10;
        int g11 = this.f1542r.g() - i10;
        if (g11 <= 0) {
            return 0;
        }
        int i11 = -c1(-g11, uVar, zVar);
        int i12 = i10 + i11;
        if (!z10 || (g10 = this.f1542r.g() - i12) <= 0) {
            return i11;
        }
        this.f1542r.o(g10);
        return g10 + i11;
    }

    public View T(View view, int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        int I0;
        View view2;
        View view3;
        b1();
        if (w() == 0 || (I0 = I0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        J0();
        f1(I0, (int) (((float) this.f1542r.l()) * 0.33333334f), false, zVar);
        c cVar = this.f1541q;
        cVar.f1560g = Integer.MIN_VALUE;
        cVar.f1555a = false;
        K0(uVar, cVar, zVar, true);
        if (I0 == -1) {
            if (this.u) {
                view2 = P0(w() - 1, -1);
            } else {
                view2 = P0(0, w());
            }
        } else if (this.u) {
            view2 = P0(0, w());
        } else {
            view2 = P0(w() - 1, -1);
        }
        if (I0 == -1) {
            view3 = V0();
        } else {
            view3 = U0();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public final int T0(int i10, RecyclerView.u uVar, RecyclerView.z zVar, boolean z10) {
        int k10;
        int k11 = i10 - this.f1542r.k();
        if (k11 <= 0) {
            return 0;
        }
        int i11 = -c1(k11, uVar, zVar);
        int i12 = i10 + i11;
        if (!z10 || (k10 = i12 - this.f1542r.k()) <= 0) {
            return i11;
        }
        this.f1542r.o(-k10);
        return i11 - k10;
    }

    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(N0());
            accessibilityEvent.setToIndex(O0());
        }
    }

    public final View U0() {
        return v(this.u ? 0 : w() - 1);
    }

    public final View V0() {
        return v(this.u ? w() - 1 : 0);
    }

    public final boolean W0() {
        return A() == 1;
    }

    public void X0(RecyclerView.u uVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        View b10 = cVar.b(uVar);
        if (b10 == null) {
            bVar.f1553b = true;
            return;
        }
        RecyclerView.o oVar = (RecyclerView.o) b10.getLayoutParams();
        if (cVar.f1564k == null) {
            boolean z12 = this.u;
            if (cVar.f1559f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                b(b10, -1, false);
            } else {
                b(b10, 0, false);
            }
        } else {
            boolean z13 = this.u;
            if (cVar.f1559f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                b(b10, -1, true);
            } else {
                b(b10, 0, true);
            }
        }
        RecyclerView.o oVar2 = (RecyclerView.o) b10.getLayoutParams();
        Rect K = this.f1640b.K(b10);
        int x10 = RecyclerView.n.x(d(), this.f1650n, this.l, E() + D() + oVar2.leftMargin + oVar2.rightMargin + K.left + K.right + 0, oVar2.width);
        int x11 = RecyclerView.n.x(e(), this.f1651o, this.f1649m, C() + F() + oVar2.topMargin + oVar2.bottomMargin + K.top + K.bottom + 0, oVar2.height);
        if (x0(b10, x10, x11, oVar2)) {
            b10.measure(x10, x11);
        }
        bVar.f1552a = this.f1542r.c(b10);
        if (this.f1540p == 1) {
            if (W0()) {
                i13 = this.f1650n - E();
                i14 = i13 - this.f1542r.d(b10);
            } else {
                i14 = D();
                i13 = this.f1542r.d(b10) + i14;
            }
            int i15 = cVar.f1559f;
            i10 = cVar.f1556b;
            if (i15 == -1) {
                int i16 = i14;
                i12 = i10;
                i10 -= bVar.f1552a;
                i11 = i16;
            } else {
                i11 = i14;
                i12 = bVar.f1552a + i10;
            }
        } else {
            int F = F();
            i12 = this.f1542r.d(b10) + F;
            int i17 = cVar.f1559f;
            int i18 = cVar.f1556b;
            if (i17 == -1) {
                i11 = i18 - bVar.f1552a;
                int i19 = F;
                i13 = i18;
                i10 = i19;
            } else {
                int i20 = bVar.f1552a + i18;
                i11 = i18;
                i10 = F;
                i13 = i20;
            }
        }
        RecyclerView.n.O(b10, i11, i10, i13, i12);
        if (oVar.c() || oVar.b()) {
            bVar.f1554c = true;
        }
        bVar.d = b10.hasFocusable();
    }

    public void Y0(RecyclerView.u uVar, RecyclerView.z zVar, a aVar, int i10) {
    }

    public final void Z0(RecyclerView.u uVar, c cVar) {
        if (cVar.f1555a && !cVar.l) {
            int i10 = cVar.f1560g;
            int i11 = cVar.f1562i;
            if (cVar.f1559f == -1) {
                int w10 = w();
                if (i10 >= 0) {
                    int f10 = (this.f1542r.f() - i10) + i11;
                    if (this.u) {
                        for (int i12 = 0; i12 < w10; i12++) {
                            View v10 = v(i12);
                            if (this.f1542r.e(v10) < f10 || this.f1542r.n(v10) < f10) {
                                a1(uVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = w10 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View v11 = v(i14);
                        if (this.f1542r.e(v11) < f10 || this.f1542r.n(v11) < f10) {
                            a1(uVar, i13, i14);
                            return;
                        }
                    }
                }
            } else if (i10 >= 0) {
                int i15 = i10 - i11;
                int w11 = w();
                if (this.u) {
                    int i16 = w11 - 1;
                    for (int i17 = i16; i17 >= 0; i17--) {
                        View v12 = v(i17);
                        if (this.f1542r.b(v12) > i15 || this.f1542r.m(v12) > i15) {
                            a1(uVar, i16, i17);
                            return;
                        }
                    }
                    return;
                }
                for (int i18 = 0; i18 < w11; i18++) {
                    View v13 = v(i18);
                    if (this.f1542r.b(v13) > i15 || this.f1542r.m(v13) > i15) {
                        a1(uVar, 0, i18);
                        return;
                    }
                }
            }
        }
    }

    public final PointF a(int i10) {
        if (w() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < RecyclerView.n.G(v(0))) {
            z10 = true;
        }
        if (z10 != this.u) {
            i11 = -1;
        }
        return this.f1540p == 0 ? new PointF((float) i11, 0.0f) : new PointF(0.0f, (float) i11);
    }

    public final void a1(RecyclerView.u uVar, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                while (true) {
                    i11--;
                    if (i11 >= i10) {
                        View v10 = v(i11);
                        m0(i11);
                        uVar.f(v10);
                    } else {
                        return;
                    }
                }
            } else {
                while (i10 > i11) {
                    View v11 = v(i10);
                    m0(i10);
                    uVar.f(v11);
                    i10--;
                }
            }
        }
    }

    public final void b1() {
        this.u = (this.f1540p == 1 || !W0()) ? this.f1544t : !this.f1544t;
    }

    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    public final int c1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (w() == 0 || i10 == 0) {
            return 0;
        }
        J0();
        this.f1541q.f1555a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        f1(i11, abs, true, zVar);
        c cVar = this.f1541q;
        int K0 = K0(uVar, cVar, zVar, false) + cVar.f1560g;
        if (K0 < 0) {
            return 0;
        }
        if (abs > K0) {
            i10 = i11 * K0;
        }
        this.f1542r.o(-i10);
        this.f1541q.f1563j = i10;
        return i10;
    }

    public final boolean d() {
        return this.f1540p == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0239  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d0(androidx.recyclerview.widget.RecyclerView.u r18, androidx.recyclerview.widget.RecyclerView.z r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.z
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.f1546x
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r19.b()
            if (r3 != 0) goto L_0x0019
            r17.j0(r18)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.z
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x002a
            int r3 = r3.f1565o
            if (r3 < 0) goto L_0x0025
            r7 = r5
            goto L_0x0026
        L_0x0025:
            r7 = r6
        L_0x0026:
            if (r7 == 0) goto L_0x002a
            r0.f1546x = r3
        L_0x002a:
            r17.J0()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            r3.f1555a = r6
            r17.b1()
            androidx.recyclerview.widget.RecyclerView r3 = r0.f1640b
            if (r3 != 0) goto L_0x003a
        L_0x0038:
            r3 = 0
            goto L_0x0049
        L_0x003a:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L_0x0038
            androidx.recyclerview.widget.b r8 = r0.f1639a
            boolean r8 = r8.j(r3)
            if (r8 == 0) goto L_0x0049
            goto L_0x0038
        L_0x0049:
            androidx.recyclerview.widget.LinearLayoutManager$a r8 = r0.A
            boolean r9 = r8.f1551e
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == 0) goto L_0x0081
            int r9 = r0.f1546x
            if (r9 != r4) goto L_0x0081
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.z
            if (r9 == 0) goto L_0x005a
            goto L_0x0081
        L_0x005a:
            if (r3 == 0) goto L_0x025b
            androidx.recyclerview.widget.s r9 = r0.f1542r
            int r9 = r9.e(r3)
            androidx.recyclerview.widget.s r11 = r0.f1542r
            int r11 = r11.g()
            if (r9 >= r11) goto L_0x0078
            androidx.recyclerview.widget.s r9 = r0.f1542r
            int r9 = r9.b(r3)
            androidx.recyclerview.widget.s r11 = r0.f1542r
            int r11 = r11.k()
            if (r9 > r11) goto L_0x025b
        L_0x0078:
            int r9 = androidx.recyclerview.widget.RecyclerView.n.G(r3)
            r8.b(r3, r9)
            goto L_0x025b
        L_0x0081:
            r8.c()
            boolean r3 = r0.u
            boolean r9 = r0.f1545v
            r3 = r3 ^ r9
            r8.d = r3
            boolean r3 = r2.f1692g
            if (r3 != 0) goto L_0x0195
            int r3 = r0.f1546x
            if (r3 != r4) goto L_0x0095
            goto L_0x0195
        L_0x0095:
            if (r3 < 0) goto L_0x0191
            int r9 = r19.b()
            if (r3 < r9) goto L_0x009f
            goto L_0x0191
        L_0x009f:
            int r3 = r0.f1546x
            r8.f1549b = r3
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.z
            if (r9 == 0) goto L_0x00ce
            int r11 = r9.f1565o
            if (r11 < 0) goto L_0x00ad
            r11 = r5
            goto L_0x00ae
        L_0x00ad:
            r11 = r6
        L_0x00ae:
            if (r11 == 0) goto L_0x00ce
            boolean r3 = r9.f1567q
            r8.d = r3
            if (r3 == 0) goto L_0x00c2
            androidx.recyclerview.widget.s r3 = r0.f1542r
            int r3 = r3.g()
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.z
            int r9 = r9.f1566p
            goto L_0x0182
        L_0x00c2:
            androidx.recyclerview.widget.s r3 = r0.f1542r
            int r3 = r3.k()
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.z
            int r9 = r9.f1566p
            goto L_0x018c
        L_0x00ce:
            int r9 = r0.f1547y
            if (r9 != r10) goto L_0x0174
            android.view.View r3 = r0.q(r3)
            if (r3 == 0) goto L_0x0142
            androidx.recyclerview.widget.s r9 = r0.f1542r
            int r9 = r9.c(r3)
            androidx.recyclerview.widget.s r11 = r0.f1542r
            int r11 = r11.l()
            if (r9 <= r11) goto L_0x00e8
            goto L_0x0160
        L_0x00e8:
            androidx.recyclerview.widget.s r9 = r0.f1542r
            int r9 = r9.e(r3)
            androidx.recyclerview.widget.s r11 = r0.f1542r
            int r11 = r11.k()
            int r9 = r9 - r11
            if (r9 >= 0) goto L_0x0103
            androidx.recyclerview.widget.s r3 = r0.f1542r
            int r3 = r3.k()
            r8.f1550c = r3
            r8.d = r6
            goto L_0x018f
        L_0x0103:
            androidx.recyclerview.widget.s r9 = r0.f1542r
            int r9 = r9.g()
            androidx.recyclerview.widget.s r11 = r0.f1542r
            int r11 = r11.b(r3)
            int r9 = r9 - r11
            if (r9 >= 0) goto L_0x011e
            androidx.recyclerview.widget.s r3 = r0.f1542r
            int r3 = r3.g()
            r8.f1550c = r3
            r8.d = r5
            goto L_0x018f
        L_0x011e:
            boolean r9 = r8.d
            if (r9 == 0) goto L_0x0139
            androidx.recyclerview.widget.s r9 = r0.f1542r
            int r3 = r9.b(r3)
            androidx.recyclerview.widget.s r9 = r0.f1542r
            int r11 = r9.f1861b
            if (r10 != r11) goto L_0x0130
            r11 = r6
            goto L_0x0137
        L_0x0130:
            int r11 = r9.l()
            int r9 = r9.f1861b
            int r11 = r11 - r9
        L_0x0137:
            int r11 = r11 + r3
            goto L_0x013f
        L_0x0139:
            androidx.recyclerview.widget.s r9 = r0.f1542r
            int r11 = r9.e(r3)
        L_0x013f:
            r8.f1550c = r11
            goto L_0x018f
        L_0x0142:
            int r3 = r17.w()
            if (r3 <= 0) goto L_0x0160
            android.view.View r3 = r0.v(r6)
            int r3 = androidx.recyclerview.widget.RecyclerView.n.G(r3)
            int r9 = r0.f1546x
            if (r9 >= r3) goto L_0x0156
            r3 = r5
            goto L_0x0157
        L_0x0156:
            r3 = r6
        L_0x0157:
            boolean r9 = r0.u
            if (r3 != r9) goto L_0x015d
            r3 = r5
            goto L_0x015e
        L_0x015d:
            r3 = r6
        L_0x015e:
            r8.d = r3
        L_0x0160:
            boolean r3 = r8.d
            if (r3 == 0) goto L_0x016b
            androidx.recyclerview.widget.s r3 = r8.f1548a
            int r3 = r3.g()
            goto L_0x0171
        L_0x016b:
            androidx.recyclerview.widget.s r3 = r8.f1548a
            int r3 = r3.k()
        L_0x0171:
            r8.f1550c = r3
            goto L_0x018f
        L_0x0174:
            boolean r3 = r0.u
            r8.d = r3
            if (r3 == 0) goto L_0x0184
            androidx.recyclerview.widget.s r3 = r0.f1542r
            int r3 = r3.g()
            int r9 = r0.f1547y
        L_0x0182:
            int r3 = r3 - r9
            goto L_0x018d
        L_0x0184:
            androidx.recyclerview.widget.s r3 = r0.f1542r
            int r3 = r3.k()
            int r9 = r0.f1547y
        L_0x018c:
            int r3 = r3 + r9
        L_0x018d:
            r8.f1550c = r3
        L_0x018f:
            r3 = r5
            goto L_0x0196
        L_0x0191:
            r0.f1546x = r4
            r0.f1547y = r10
        L_0x0195:
            r3 = r6
        L_0x0196:
            if (r3 == 0) goto L_0x019a
            goto L_0x0259
        L_0x019a:
            int r3 = r17.w()
            if (r3 != 0) goto L_0x01a2
            goto L_0x0235
        L_0x01a2:
            androidx.recyclerview.widget.RecyclerView r3 = r0.f1640b
            if (r3 != 0) goto L_0x01a8
        L_0x01a6:
            r3 = 0
            goto L_0x01b7
        L_0x01a8:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L_0x01a6
            androidx.recyclerview.widget.b r9 = r0.f1639a
            boolean r9 = r9.j(r3)
            if (r9 == 0) goto L_0x01b7
            goto L_0x01a6
        L_0x01b7:
            if (r3 == 0) goto L_0x01e2
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$o r9 = (androidx.recyclerview.widget.RecyclerView.o) r9
            boolean r11 = r9.c()
            if (r11 != 0) goto L_0x01d7
            int r11 = r9.a()
            if (r11 < 0) goto L_0x01d7
            int r9 = r9.a()
            int r11 = r19.b()
            if (r9 >= r11) goto L_0x01d7
            r9 = r5
            goto L_0x01d8
        L_0x01d7:
            r9 = r6
        L_0x01d8:
            if (r9 == 0) goto L_0x01e2
            int r9 = androidx.recyclerview.widget.RecyclerView.n.G(r3)
            r8.b(r3, r9)
            goto L_0x0233
        L_0x01e2:
            boolean r3 = r0.f1543s
            boolean r9 = r0.f1545v
            if (r3 == r9) goto L_0x01e9
            goto L_0x0235
        L_0x01e9:
            boolean r3 = r8.d
            android.view.View r3 = r0.R0(r1, r2, r3, r9)
            if (r3 == 0) goto L_0x0235
            int r9 = androidx.recyclerview.widget.RecyclerView.n.G(r3)
            r8.a(r3, r9)
            boolean r9 = r2.f1692g
            if (r9 != 0) goto L_0x0233
            boolean r9 = r17.C0()
            if (r9 == 0) goto L_0x0233
            androidx.recyclerview.widget.s r9 = r0.f1542r
            int r9 = r9.e(r3)
            androidx.recyclerview.widget.s r11 = r0.f1542r
            int r3 = r11.b(r3)
            androidx.recyclerview.widget.s r11 = r0.f1542r
            int r11 = r11.k()
            androidx.recyclerview.widget.s r12 = r0.f1542r
            int r12 = r12.g()
            if (r3 > r11) goto L_0x0220
            if (r9 >= r11) goto L_0x0220
            r13 = r5
            goto L_0x0221
        L_0x0220:
            r13 = r6
        L_0x0221:
            if (r9 < r12) goto L_0x0227
            if (r3 <= r12) goto L_0x0227
            r3 = r5
            goto L_0x0228
        L_0x0227:
            r3 = r6
        L_0x0228:
            if (r13 != 0) goto L_0x022c
            if (r3 == 0) goto L_0x0233
        L_0x022c:
            boolean r3 = r8.d
            if (r3 == 0) goto L_0x0231
            r11 = r12
        L_0x0231:
            r8.f1550c = r11
        L_0x0233:
            r3 = r5
            goto L_0x0236
        L_0x0235:
            r3 = r6
        L_0x0236:
            if (r3 == 0) goto L_0x0239
            goto L_0x0259
        L_0x0239:
            boolean r3 = r8.d
            if (r3 == 0) goto L_0x0244
            androidx.recyclerview.widget.s r3 = r8.f1548a
            int r3 = r3.g()
            goto L_0x024a
        L_0x0244:
            androidx.recyclerview.widget.s r3 = r8.f1548a
            int r3 = r3.k()
        L_0x024a:
            r8.f1550c = r3
            boolean r3 = r0.f1545v
            if (r3 == 0) goto L_0x0256
            int r3 = r19.b()
            int r3 = r3 + r4
            goto L_0x0257
        L_0x0256:
            r3 = r6
        L_0x0257:
            r8.f1549b = r3
        L_0x0259:
            r8.f1551e = r5
        L_0x025b:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            int r9 = r3.f1563j
            if (r9 < 0) goto L_0x0263
            r9 = r5
            goto L_0x0264
        L_0x0263:
            r9 = r4
        L_0x0264:
            r3.f1559f = r9
            int[] r3 = r0.D
            r3[r6] = r6
            r3[r5] = r6
            r0.D0(r2, r3)
            r9 = r3[r6]
            int r9 = java.lang.Math.max(r6, r9)
            androidx.recyclerview.widget.s r11 = r0.f1542r
            int r11 = r11.k()
            int r11 = r11 + r9
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r6, r3)
            androidx.recyclerview.widget.s r9 = r0.f1542r
            int r9 = r9.h()
            int r9 = r9 + r3
            boolean r3 = r2.f1692g
            if (r3 == 0) goto L_0x02c4
            int r3 = r0.f1546x
            if (r3 == r4) goto L_0x02c4
            int r12 = r0.f1547y
            if (r12 == r10) goto L_0x02c4
            android.view.View r3 = r0.q(r3)
            if (r3 == 0) goto L_0x02c4
            boolean r10 = r0.u
            if (r10 == 0) goto L_0x02af
            androidx.recyclerview.widget.s r10 = r0.f1542r
            int r10 = r10.g()
            androidx.recyclerview.widget.s r12 = r0.f1542r
            int r3 = r12.b(r3)
            int r10 = r10 - r3
            int r3 = r0.f1547y
            goto L_0x02be
        L_0x02af:
            androidx.recyclerview.widget.s r10 = r0.f1542r
            int r3 = r10.e(r3)
            androidx.recyclerview.widget.s r10 = r0.f1542r
            int r10 = r10.k()
            int r3 = r3 - r10
            int r10 = r0.f1547y
        L_0x02be:
            int r10 = r10 - r3
            if (r10 <= 0) goto L_0x02c3
            int r11 = r11 + r10
            goto L_0x02c4
        L_0x02c3:
            int r9 = r9 - r10
        L_0x02c4:
            boolean r3 = r8.d
            if (r3 == 0) goto L_0x02cd
            boolean r3 = r0.u
            if (r3 == 0) goto L_0x02d1
            goto L_0x02d3
        L_0x02cd:
            boolean r3 = r0.u
            if (r3 == 0) goto L_0x02d3
        L_0x02d1:
            r3 = r4
            goto L_0x02d4
        L_0x02d3:
            r3 = r5
        L_0x02d4:
            r0.Y0(r1, r2, r8, r3)
            r17.p(r18)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            androidx.recyclerview.widget.s r10 = r0.f1542r
            int r10 = r10.i()
            if (r10 != 0) goto L_0x02ee
            androidx.recyclerview.widget.s r10 = r0.f1542r
            int r10 = r10.f()
            if (r10 != 0) goto L_0x02ee
            r10 = r5
            goto L_0x02ef
        L_0x02ee:
            r10 = r6
        L_0x02ef:
            r3.l = r10
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            r3.getClass()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            r3.f1562i = r6
            boolean r3 = r8.d
            if (r3 == 0) goto L_0x0343
            int r3 = r8.f1549b
            int r10 = r8.f1550c
            r0.h1(r3, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            r3.f1561h = r11
            r0.K0(r1, r3, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            int r10 = r3.f1556b
            int r11 = r3.d
            int r3 = r3.f1557c
            if (r3 <= 0) goto L_0x0317
            int r9 = r9 + r3
        L_0x0317:
            int r3 = r8.f1549b
            int r12 = r8.f1550c
            r0.g1(r3, r12)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            r3.f1561h = r9
            int r9 = r3.d
            int r12 = r3.f1558e
            int r9 = r9 + r12
            r3.d = r9
            r0.K0(r1, r3, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            int r9 = r3.f1556b
            int r3 = r3.f1557c
            if (r3 <= 0) goto L_0x0389
            r0.h1(r11, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r10 = r0.f1541q
            r10.f1561h = r3
            r0.K0(r1, r10, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            int r10 = r3.f1556b
            goto L_0x0389
        L_0x0343:
            int r3 = r8.f1549b
            int r10 = r8.f1550c
            r0.g1(r3, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            r3.f1561h = r9
            r0.K0(r1, r3, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            int r9 = r3.f1556b
            int r10 = r3.d
            int r3 = r3.f1557c
            if (r3 <= 0) goto L_0x035c
            int r11 = r11 + r3
        L_0x035c:
            int r3 = r8.f1549b
            int r12 = r8.f1550c
            r0.h1(r3, r12)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            r3.f1561h = r11
            int r11 = r3.d
            int r12 = r3.f1558e
            int r11 = r11 + r12
            r3.d = r11
            r0.K0(r1, r3, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            int r11 = r3.f1556b
            int r3 = r3.f1557c
            if (r3 <= 0) goto L_0x0388
            r0.g1(r10, r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.f1541q
            r9.f1561h = r3
            r0.K0(r1, r9, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            int r3 = r3.f1556b
            r9 = r3
        L_0x0388:
            r10 = r11
        L_0x0389:
            int r3 = r17.w()
            if (r3 <= 0) goto L_0x03ad
            boolean r3 = r0.u
            boolean r11 = r0.f1545v
            r3 = r3 ^ r11
            if (r3 == 0) goto L_0x03a1
            int r3 = r0.S0(r9, r1, r2, r5)
            int r10 = r10 + r3
            int r9 = r9 + r3
            int r3 = r0.T0(r10, r1, r2, r6)
            goto L_0x03ab
        L_0x03a1:
            int r3 = r0.T0(r10, r1, r2, r5)
            int r10 = r10 + r3
            int r9 = r9 + r3
            int r3 = r0.S0(r9, r1, r2, r6)
        L_0x03ab:
            int r10 = r10 + r3
            int r9 = r9 + r3
        L_0x03ad:
            boolean r3 = r2.f1696k
            if (r3 == 0) goto L_0x044c
            int r3 = r17.w()
            if (r3 == 0) goto L_0x044c
            boolean r3 = r2.f1692g
            if (r3 != 0) goto L_0x044c
            boolean r3 = r17.C0()
            if (r3 != 0) goto L_0x03c3
            goto L_0x044c
        L_0x03c3:
            java.util.List<androidx.recyclerview.widget.RecyclerView$c0> r3 = r1.d
            int r11 = r3.size()
            android.view.View r12 = r0.v(r6)
            int r12 = androidx.recyclerview.widget.RecyclerView.n.G(r12)
            r13 = r6
            r14 = r13
            r15 = r14
        L_0x03d4:
            if (r13 >= r11) goto L_0x0407
            java.lang.Object r16 = r3.get(r13)
            r5 = r16
            androidx.recyclerview.widget.RecyclerView$c0 r5 = (androidx.recyclerview.widget.RecyclerView.c0) r5
            boolean r16 = r5.i()
            if (r16 == 0) goto L_0x03e5
            goto L_0x0402
        L_0x03e5:
            int r7 = r5.c()
            if (r7 >= r12) goto L_0x03ed
            r7 = 1
            goto L_0x03ee
        L_0x03ed:
            r7 = r6
        L_0x03ee:
            boolean r6 = r0.u
            if (r7 == r6) goto L_0x03f4
            r6 = r4
            goto L_0x03f5
        L_0x03f4:
            r6 = 1
        L_0x03f5:
            android.view.View r5 = r5.f1609a
            androidx.recyclerview.widget.s r7 = r0.f1542r
            int r5 = r7.c(r5)
            if (r6 != r4) goto L_0x0401
            int r14 = r14 + r5
            goto L_0x0402
        L_0x0401:
            int r15 = r15 + r5
        L_0x0402:
            int r13 = r13 + 1
            r5 = 1
            r6 = 0
            goto L_0x03d4
        L_0x0407:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f1541q
            r4.f1564k = r3
            if (r14 <= 0) goto L_0x0429
            android.view.View r3 = r17.V0()
            int r3 = androidx.recyclerview.widget.RecyclerView.n.G(r3)
            r0.h1(r3, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            r3.f1561h = r14
            r4 = 0
            r3.f1557c = r4
            r5 = 0
            r3.a(r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            r0.K0(r1, r3, r2, r4)
            goto L_0x042a
        L_0x0429:
            r4 = 0
        L_0x042a:
            if (r15 <= 0) goto L_0x0447
            android.view.View r3 = r17.U0()
            int r3 = androidx.recyclerview.widget.RecyclerView.n.G(r3)
            r0.g1(r3, r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            r3.f1561h = r15
            r3.f1557c = r4
            r5 = 0
            r3.a(r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1541q
            r0.K0(r1, r3, r2, r4)
            goto L_0x0448
        L_0x0447:
            r5 = 0
        L_0x0448:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.f1541q
            r1.f1564k = r5
        L_0x044c:
            boolean r1 = r2.f1692g
            if (r1 != 0) goto L_0x0459
            androidx.recyclerview.widget.s r1 = r0.f1542r
            int r2 = r1.l()
            r1.f1861b = r2
            goto L_0x045c
        L_0x0459:
            r8.c()
        L_0x045c:
            boolean r1 = r0.f1545v
            r0.f1543s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.d0(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    public final void d1(int i10) {
        if (i10 == 0 || i10 == 1) {
            c((String) null);
            if (i10 != this.f1540p || this.f1542r == null) {
                s a10 = s.a(this, i10);
                this.f1542r = a10;
                this.A.f1548a = a10;
                this.f1540p = i10;
                o0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(b0.d.c("invalid orientation:", i10));
    }

    public final boolean e() {
        return this.f1540p == 1;
    }

    public void e0(RecyclerView.z zVar) {
        this.z = null;
        this.f1546x = -1;
        this.f1547y = Integer.MIN_VALUE;
        this.A.c();
    }

    public void e1(boolean z10) {
        c((String) null);
        if (this.f1545v != z10) {
            this.f1545v = z10;
            o0();
        }
    }

    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.z = dVar;
            if (this.f1546x != -1) {
                dVar.f1565o = -1;
            }
            o0();
        }
    }

    public final void f1(int i10, int i11, boolean z10, RecyclerView.z zVar) {
        boolean z11;
        int i12;
        int i13;
        c cVar = this.f1541q;
        int i14 = 1;
        boolean z12 = false;
        if (this.f1542r.i() == 0 && this.f1542r.f() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.l = z11;
        this.f1541q.f1559f = i10;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(zVar, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z12 = true;
        }
        c cVar2 = this.f1541q;
        if (z12) {
            i12 = max2;
        } else {
            i12 = max;
        }
        cVar2.f1561h = i12;
        if (!z12) {
            max = max2;
        }
        cVar2.f1562i = max;
        if (z12) {
            cVar2.f1561h = this.f1542r.h() + i12;
            View U0 = U0();
            c cVar3 = this.f1541q;
            if (this.u) {
                i14 = -1;
            }
            cVar3.f1558e = i14;
            int G = RecyclerView.n.G(U0);
            c cVar4 = this.f1541q;
            cVar3.d = G + cVar4.f1558e;
            cVar4.f1556b = this.f1542r.b(U0);
            i13 = this.f1542r.b(U0) - this.f1542r.g();
        } else {
            View V0 = V0();
            c cVar5 = this.f1541q;
            cVar5.f1561h = this.f1542r.k() + cVar5.f1561h;
            c cVar6 = this.f1541q;
            if (!this.u) {
                i14 = -1;
            }
            cVar6.f1558e = i14;
            int G2 = RecyclerView.n.G(V0);
            c cVar7 = this.f1541q;
            cVar6.d = G2 + cVar7.f1558e;
            cVar7.f1556b = this.f1542r.e(V0);
            i13 = (-this.f1542r.e(V0)) + this.f1542r.k();
        }
        c cVar8 = this.f1541q;
        cVar8.f1557c = i11;
        if (z10) {
            cVar8.f1557c = i11 - i13;
        }
        cVar8.f1560g = i13;
    }

    public final Parcelable g0() {
        d dVar = this.z;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (w() > 0) {
            J0();
            boolean z10 = this.f1543s ^ this.u;
            dVar2.f1567q = z10;
            if (z10) {
                View U0 = U0();
                dVar2.f1566p = this.f1542r.g() - this.f1542r.b(U0);
                dVar2.f1565o = RecyclerView.n.G(U0);
            } else {
                View V0 = V0();
                dVar2.f1565o = RecyclerView.n.G(V0);
                dVar2.f1566p = this.f1542r.e(V0) - this.f1542r.k();
            }
        } else {
            dVar2.f1565o = -1;
        }
        return dVar2;
    }

    public final void g1(int i10, int i11) {
        this.f1541q.f1557c = this.f1542r.g() - i11;
        c cVar = this.f1541q;
        cVar.f1558e = this.u ? -1 : 1;
        cVar.d = i10;
        cVar.f1559f = 1;
        cVar.f1556b = i11;
        cVar.f1560g = Integer.MIN_VALUE;
    }

    public final void h(int i10, int i11, RecyclerView.z zVar, RecyclerView.n.c cVar) {
        if (this.f1540p != 0) {
            i10 = i11;
        }
        if (w() != 0 && i10 != 0) {
            J0();
            f1(i10 > 0 ? 1 : -1, Math.abs(i10), true, zVar);
            E0(zVar, this.f1541q, cVar);
        }
    }

    public final void h1(int i10, int i11) {
        this.f1541q.f1557c = i11 - this.f1542r.k();
        c cVar = this.f1541q;
        cVar.d = i10;
        cVar.f1558e = this.u ? 1 : -1;
        cVar.f1559f = -1;
        cVar.f1556b = i11;
        cVar.f1560g = Integer.MIN_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(int r7, androidx.recyclerview.widget.RecyclerView.n.c r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r6.z
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L_0x0013
            int r4 = r0.f1565o
            if (r4 < 0) goto L_0x000d
            r5 = r1
            goto L_0x000e
        L_0x000d:
            r5 = r3
        L_0x000e:
            if (r5 == 0) goto L_0x0013
            boolean r0 = r0.f1567q
            goto L_0x0022
        L_0x0013:
            r6.b1()
            boolean r0 = r6.u
            int r4 = r6.f1546x
            if (r4 != r2) goto L_0x0022
            if (r0 == 0) goto L_0x0021
            int r4 = r7 + -1
            goto L_0x0022
        L_0x0021:
            r4 = r3
        L_0x0022:
            if (r0 == 0) goto L_0x0025
            r1 = r2
        L_0x0025:
            r0 = r3
        L_0x0026:
            int r2 = r6.C
            if (r0 >= r2) goto L_0x0038
            if (r4 < 0) goto L_0x0038
            if (r4 >= r7) goto L_0x0038
            r2 = r8
            androidx.recyclerview.widget.m$b r2 = (androidx.recyclerview.widget.m.b) r2
            r2.a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L_0x0026
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.i(int, androidx.recyclerview.widget.RecyclerView$n$c):void");
    }

    public final int j(RecyclerView.z zVar) {
        return F0(zVar);
    }

    public int k(RecyclerView.z zVar) {
        return G0(zVar);
    }

    public int l(RecyclerView.z zVar) {
        return H0(zVar);
    }

    public final int m(RecyclerView.z zVar) {
        return F0(zVar);
    }

    public int n(RecyclerView.z zVar) {
        return G0(zVar);
    }

    public int o(RecyclerView.z zVar) {
        return H0(zVar);
    }

    public int p0(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f1540p == 1) {
            return 0;
        }
        return c1(i10, uVar, zVar);
    }

    public final View q(int i10) {
        int w10 = w();
        if (w10 == 0) {
            return null;
        }
        int G = i10 - RecyclerView.n.G(v(0));
        if (G >= 0 && G < w10) {
            View v10 = v(G);
            if (RecyclerView.n.G(v10) == i10) {
                return v10;
            }
        }
        return super.q(i10);
    }

    public final void q0(int i10) {
        this.f1546x = i10;
        this.f1547y = Integer.MIN_VALUE;
        d dVar = this.z;
        if (dVar != null) {
            dVar.f1565o = -1;
        }
        o0();
    }

    public RecyclerView.o r() {
        return new RecyclerView.o(-2, -2);
    }

    public int r0(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f1540p == 0) {
            return 0;
        }
        return c1(i10, uVar, zVar);
    }

    public final boolean y0() {
        boolean z10;
        if (this.f1649m == 1073741824 || this.l == 1073741824) {
            return false;
        }
        int w10 = w();
        int i10 = 0;
        while (true) {
            if (i10 >= w10) {
                z10 = false;
                break;
            }
            ViewGroup.LayoutParams layoutParams = v(i10).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1540p = 1;
        this.f1544t = false;
        this.u = false;
        this.f1545v = false;
        this.w = true;
        this.f1546x = -1;
        this.f1547y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.n.d H = RecyclerView.n.H(context, attributeSet, i10, i11);
        d1(H.f1654a);
        boolean z10 = H.f1656c;
        c((String) null);
        if (z10 != this.f1544t) {
            this.f1544t = z10;
            o0();
        }
        e1(H.d);
    }
}
