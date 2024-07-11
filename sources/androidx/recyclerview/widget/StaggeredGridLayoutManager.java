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
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

public class StaggeredGridLayoutManager extends RecyclerView.n implements RecyclerView.y.b {
    public int A;
    public final d B;
    public final int C;
    public boolean D;
    public boolean E;
    public e F;
    public final Rect G;
    public final b H;
    public final boolean I;
    public int[] J;
    public final a K;

    /* renamed from: p  reason: collision with root package name */
    public int f1699p = -1;

    /* renamed from: q  reason: collision with root package name */
    public f[] f1700q;

    /* renamed from: r  reason: collision with root package name */
    public s f1701r;

    /* renamed from: s  reason: collision with root package name */
    public s f1702s;

    /* renamed from: t  reason: collision with root package name */
    public int f1703t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public final n f1704v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1705x;

    /* renamed from: y  reason: collision with root package name */
    public BitSet f1706y;
    public int z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            StaggeredGridLayoutManager.this.E0();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1708a;

        /* renamed from: b  reason: collision with root package name */
        public int f1709b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1710c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1711e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f1712f;

        public b() {
            a();
        }

        public final void a() {
            this.f1708a = -1;
            this.f1709b = Integer.MIN_VALUE;
            this.f1710c = false;
            this.d = false;
            this.f1711e = false;
            int[] iArr = this.f1712f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.o {

        /* renamed from: e  reason: collision with root package name */
        public f f1714e;

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f1715a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f1716b;

        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0019a();

            /* renamed from: o  reason: collision with root package name */
            public int f1717o;

            /* renamed from: p  reason: collision with root package name */
            public int f1718p;

            /* renamed from: q  reason: collision with root package name */
            public int[] f1719q;

            /* renamed from: r  reason: collision with root package name */
            public boolean f1720r;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            public class C0019a implements Parcelable.Creator<a> {
                public final Object createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                public final Object[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f1717o = parcel.readInt();
                this.f1718p = parcel.readInt();
                this.f1720r = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f1719q = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f1717o + ", mGapDir=" + this.f1718p + ", mHasUnwantedGapAfter=" + this.f1720r + ", mGapPerSpan=" + Arrays.toString(this.f1719q) + '}';
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f1717o);
                parcel.writeInt(this.f1718p);
                parcel.writeInt(this.f1720r ? 1 : 0);
                int[] iArr = this.f1719q;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f1719q);
            }
        }

        public final void a() {
            int[] iArr = this.f1715a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1716b = null;
        }

        public final void b(int i10) {
            int[] iArr = this.f1715a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i10, 10) + 1)];
                this.f1715a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f1715a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f1715a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int c(int r6) {
            /*
                r5 = this;
                int[] r0 = r5.f1715a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r6 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1716b
                if (r0 != 0) goto L_0x000f
                goto L_0x005e
            L_0x000f:
                r2 = 0
                if (r0 != 0) goto L_0x0013
                goto L_0x002b
            L_0x0013:
                int r0 = r0.size()
                int r0 = r0 + r1
            L_0x0018:
                if (r0 < 0) goto L_0x002b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f1716b
                java.lang.Object r3 = r3.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r4 = r3.f1717o
                if (r4 != r6) goto L_0x0028
                r2 = r3
                goto L_0x002b
            L_0x0028:
                int r0 = r0 + -1
                goto L_0x0018
            L_0x002b:
                if (r2 == 0) goto L_0x0032
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1716b
                r0.remove(r2)
            L_0x0032:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1716b
                int r0 = r0.size()
                r2 = 0
            L_0x0039:
                if (r2 >= r0) goto L_0x004b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f1716b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.f1717o
                if (r3 < r6) goto L_0x0048
                goto L_0x004c
            L_0x0048:
                int r2 = r2 + 1
                goto L_0x0039
            L_0x004b:
                r2 = r1
            L_0x004c:
                if (r2 == r1) goto L_0x005e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1716b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f1716b
                r3.remove(r2)
                int r0 = r0.f1717o
                goto L_0x005f
            L_0x005e:
                r0 = r1
            L_0x005f:
                if (r0 != r1) goto L_0x006b
                int[] r0 = r5.f1715a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r6, r2, r1)
                int[] r6 = r5.f1715a
                int r6 = r6.length
                return r6
            L_0x006b:
                int r0 = r0 + 1
                int[] r2 = r5.f1715a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r5.f1715a
                java.util.Arrays.fill(r2, r6, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.c(int):int");
        }

        public final void d(int i10, int i11) {
            int[] iArr = this.f1715a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f1715a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f1715a, i10, i12, -1);
                List<a> list = this.f1716b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f1716b.get(size);
                        int i13 = aVar.f1717o;
                        if (i13 >= i10) {
                            aVar.f1717o = i13 + i11;
                        }
                    }
                }
            }
        }

        public final void e(int i10, int i11) {
            int[] iArr = this.f1715a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f1715a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f1715a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                List<a> list = this.f1716b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f1716b.get(size);
                        int i13 = aVar.f1717o;
                        if (i13 >= i10) {
                            if (i13 < i12) {
                                this.f1716b.remove(size);
                            } else {
                                aVar.f1717o = i13 - i11;
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        public int f1721o;

        /* renamed from: p  reason: collision with root package name */
        public int f1722p;

        /* renamed from: q  reason: collision with root package name */
        public int f1723q;

        /* renamed from: r  reason: collision with root package name */
        public int[] f1724r;

        /* renamed from: s  reason: collision with root package name */
        public int f1725s;

        /* renamed from: t  reason: collision with root package name */
        public int[] f1726t;
        public List<d.a> u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f1727v;
        public boolean w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f1728x;

        public class a implements Parcelable.Creator<e> {
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public final Object[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f1721o = parcel.readInt();
            this.f1722p = parcel.readInt();
            int readInt = parcel.readInt();
            this.f1723q = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f1724r = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f1725s = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f1726t = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f1727v = parcel.readInt() == 1;
            this.w = parcel.readInt() == 1;
            this.f1728x = parcel.readInt() == 1 ? true : z;
            this.u = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f1723q = eVar.f1723q;
            this.f1721o = eVar.f1721o;
            this.f1722p = eVar.f1722p;
            this.f1724r = eVar.f1724r;
            this.f1725s = eVar.f1725s;
            this.f1726t = eVar.f1726t;
            this.f1727v = eVar.f1727v;
            this.w = eVar.w;
            this.f1728x = eVar.f1728x;
            this.u = eVar.u;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1721o);
            parcel.writeInt(this.f1722p);
            parcel.writeInt(this.f1723q);
            if (this.f1723q > 0) {
                parcel.writeIntArray(this.f1724r);
            }
            parcel.writeInt(this.f1725s);
            if (this.f1725s > 0) {
                parcel.writeIntArray(this.f1726t);
            }
            parcel.writeInt(this.f1727v ? 1 : 0);
            parcel.writeInt(this.w ? 1 : 0);
            parcel.writeInt(this.f1728x ? 1 : 0);
            parcel.writeList(this.u);
        }
    }

    public class f {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<View> f1729a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f1730b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f1731c = Integer.MIN_VALUE;
        public int d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f1732e;

        public f(int i10) {
            this.f1732e = i10;
        }

        public static c h(View view) {
            return (c) view.getLayoutParams();
        }

        public final void a() {
            ArrayList<View> arrayList = this.f1729a;
            View view = arrayList.get(arrayList.size() - 1);
            c h10 = h(view);
            this.f1731c = StaggeredGridLayoutManager.this.f1701r.b(view);
            h10.getClass();
        }

        public final void b() {
            this.f1729a.clear();
            this.f1730b = Integer.MIN_VALUE;
            this.f1731c = Integer.MIN_VALUE;
            this.d = 0;
        }

        public final int c() {
            boolean z = StaggeredGridLayoutManager.this.w;
            ArrayList<View> arrayList = this.f1729a;
            return z ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
        }

        public final int d() {
            boolean z = StaggeredGridLayoutManager.this.w;
            ArrayList<View> arrayList = this.f1729a;
            return z ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
        }

        public final int e(int i10, int i11) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int k10 = staggeredGridLayoutManager.f1701r.k();
            int g10 = staggeredGridLayoutManager.f1701r.g();
            int i12 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f1729a.get(i10);
                int e10 = staggeredGridLayoutManager.f1701r.e(view);
                int b10 = staggeredGridLayoutManager.f1701r.b(view);
                boolean z = false;
                boolean z10 = e10 <= g10;
                if (b10 >= k10) {
                    z = true;
                }
                if (z10 && z && (e10 < k10 || b10 > g10)) {
                    return RecyclerView.n.G(view);
                }
                i10 += i12;
            }
            return -1;
        }

        public final int f(int i10) {
            int i11 = this.f1731c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f1729a.size() == 0) {
                return i10;
            }
            a();
            return this.f1731c;
        }

        public final View g(int i10, int i11) {
            ArrayList<View> arrayList = this.f1729a;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            if (i11 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.w && RecyclerView.n.G(view2) >= i10) || ((!staggeredGridLayoutManager.w && RecyclerView.n.G(view2) <= i10) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = arrayList.get(i12);
                    if ((staggeredGridLayoutManager.w && RecyclerView.n.G(view3) <= i10) || ((!staggeredGridLayoutManager.w && RecyclerView.n.G(view3) >= i10) || !view3.hasFocusable())) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        public final int i(int i10) {
            int i11 = this.f1730b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            ArrayList<View> arrayList = this.f1729a;
            if (arrayList.size() == 0) {
                return i10;
            }
            View view = arrayList.get(0);
            c h10 = h(view);
            this.f1730b = StaggeredGridLayoutManager.this.f1701r.e(view);
            h10.getClass();
            return this.f1730b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.w = false;
        this.f1705x = false;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        d dVar = new d();
        this.B = dVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        RecyclerView.n.d H2 = RecyclerView.n.H(context, attributeSet, i10, i11);
        int i12 = H2.f1654a;
        if (i12 == 0 || i12 == 1) {
            c((String) null);
            if (i12 != this.f1703t) {
                this.f1703t = i12;
                s sVar = this.f1701r;
                this.f1701r = this.f1702s;
                this.f1702s = sVar;
                o0();
            }
            int i13 = H2.f1655b;
            c((String) null);
            if (i13 != this.f1699p) {
                dVar.a();
                o0();
                this.f1699p = i13;
                this.f1706y = new BitSet(this.f1699p);
                this.f1700q = new f[this.f1699p];
                for (int i14 = 0; i14 < this.f1699p; i14++) {
                    this.f1700q[i14] = new f(i14);
                }
                o0();
            }
            boolean z10 = H2.f1656c;
            c((String) null);
            e eVar = this.F;
            if (!(eVar == null || eVar.f1727v == z10)) {
                eVar.f1727v = z10;
            }
            this.w = z10;
            o0();
            this.f1704v = new n();
            this.f1701r = s.a(this, this.f1703t);
            this.f1702s = s.a(this, 1 - this.f1703t);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public static int f1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    public final void A0(RecyclerView recyclerView, int i10) {
        o oVar = new o(recyclerView.getContext());
        oVar.f1674a = i10;
        B0(oVar);
    }

    public final boolean C0() {
        return this.F == null;
    }

    public final int D0(int i10) {
        if (w() == 0) {
            return this.f1705x ? 1 : -1;
        }
        return (i10 < N0()) != this.f1705x ? -1 : 1;
    }

    public final boolean E0() {
        int i10;
        if (!(w() == 0 || this.C == 0 || !this.f1644g)) {
            if (this.f1705x) {
                i10 = O0();
                N0();
            } else {
                i10 = N0();
                O0();
            }
            if (i10 == 0 && S0() != null) {
                this.B.a();
                this.f1643f = true;
                o0();
                return true;
            }
        }
        return false;
    }

    public final int F0(RecyclerView.z zVar) {
        if (w() == 0) {
            return 0;
        }
        s sVar = this.f1701r;
        boolean z10 = this.I;
        return y.a(zVar, sVar, K0(!z10), J0(!z10), this, this.I);
    }

    public final int G0(RecyclerView.z zVar) {
        if (w() == 0) {
            return 0;
        }
        s sVar = this.f1701r;
        boolean z10 = this.I;
        return y.b(zVar, sVar, K0(!z10), J0(!z10), this, this.I, this.f1705x);
    }

    public final int H0(RecyclerView.z zVar) {
        if (w() == 0) {
            return 0;
        }
        s sVar = this.f1701r;
        boolean z10 = this.I;
        return y.c(zVar, sVar, K0(!z10), J0(!z10), this, this.I);
    }

    public final int I0(RecyclerView.u uVar, n nVar, RecyclerView.z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        f fVar;
        boolean z10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        RecyclerView.u uVar2 = uVar;
        n nVar2 = nVar;
        int i27 = 0;
        int i28 = 1;
        this.f1706y.set(0, this.f1699p, true);
        n nVar3 = this.f1704v;
        if (nVar3.f1851i) {
            if (nVar2.f1847e == 1) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
        } else if (nVar2.f1847e == 1) {
            i10 = nVar2.f1849g + nVar2.f1845b;
        } else {
            i10 = nVar2.f1848f - nVar2.f1845b;
        }
        int i29 = nVar2.f1847e;
        for (int i30 = 0; i30 < this.f1699p; i30++) {
            if (!this.f1700q[i30].f1729a.isEmpty()) {
                e1(this.f1700q[i30], i29, i10);
            }
        }
        if (this.f1705x) {
            i11 = this.f1701r.g();
        } else {
            i11 = this.f1701r.k();
        }
        boolean z11 = false;
        while (true) {
            int i31 = nVar2.f1846c;
            if (i31 < 0 || i31 >= zVar.b()) {
                i12 = i27;
            } else {
                i12 = i28;
            }
            if (i12 == 0 || (!nVar3.f1851i && this.f1706y.isEmpty())) {
                int i32 = i27;
            } else {
                View view = uVar2.i(nVar2.f1846c, Long.MAX_VALUE).f1609a;
                nVar2.f1846c += nVar2.d;
                c cVar = (c) view.getLayoutParams();
                int a10 = cVar.a();
                d dVar = this.B;
                int[] iArr = dVar.f1715a;
                if (iArr == null || a10 >= iArr.length) {
                    i14 = -1;
                } else {
                    i14 = iArr[a10];
                }
                if (i14 == -1) {
                    i15 = i28;
                } else {
                    i15 = i27;
                }
                if (i15 != 0) {
                    if (V0(nVar2.f1847e)) {
                        i26 = this.f1699p - i28;
                        i25 = -1;
                        i24 = -1;
                    } else {
                        i24 = i28;
                        i25 = this.f1699p;
                        i26 = i27;
                    }
                    f fVar2 = null;
                    if (nVar2.f1847e == i28) {
                        int k10 = this.f1701r.k();
                        int i33 = Integer.MAX_VALUE;
                        while (i26 != i25) {
                            f fVar3 = this.f1700q[i26];
                            int f10 = fVar3.f(k10);
                            if (f10 < i33) {
                                i33 = f10;
                                fVar2 = fVar3;
                            }
                            i26 += i24;
                        }
                    } else {
                        int g10 = this.f1701r.g();
                        int i34 = Integer.MIN_VALUE;
                        while (i26 != i25) {
                            f fVar4 = this.f1700q[i26];
                            int i35 = fVar4.i(g10);
                            if (i35 > i34) {
                                fVar2 = fVar4;
                                i34 = i35;
                            }
                            i26 += i24;
                        }
                    }
                    fVar = fVar2;
                    dVar.b(a10);
                    dVar.f1715a[a10] = fVar.f1732e;
                } else {
                    fVar = this.f1700q[i14];
                }
                cVar.f1714e = fVar;
                if (nVar2.f1847e == 1) {
                    z10 = false;
                    b(view, -1, false);
                } else {
                    z10 = false;
                    b(view, 0, false);
                }
                if (this.f1703t == 1) {
                    i18 = RecyclerView.n.x(z10, this.u, this.l, z10 ? 1 : 0, cVar.width);
                    i17 = RecyclerView.n.x(true, this.f1651o, this.f1649m, C() + F(), cVar.height);
                    i16 = 0;
                } else {
                    i18 = RecyclerView.n.x(true, this.f1650n, this.l, E() + D(), cVar.width);
                    i16 = 0;
                    i17 = RecyclerView.n.x(false, this.u, this.f1649m, 0, cVar.height);
                }
                RecyclerView recyclerView = this.f1640b;
                Rect rect = this.G;
                if (recyclerView == null) {
                    rect.set(i16, i16, i16, i16);
                } else {
                    rect.set(recyclerView.K(view));
                }
                c cVar2 = (c) view.getLayoutParams();
                int f1 = f1(i18, cVar2.leftMargin + rect.left, cVar2.rightMargin + rect.right);
                int f12 = f1(i17, cVar2.topMargin + rect.top, cVar2.bottomMargin + rect.bottom);
                if (x0(view, f1, f12, cVar2)) {
                    view.measure(f1, f12);
                }
                if (nVar2.f1847e == 1) {
                    i20 = fVar.f(i11);
                    i19 = this.f1701r.c(view) + i20;
                } else {
                    i19 = fVar.i(i11);
                    i20 = i19 - this.f1701r.c(view);
                }
                int i36 = nVar2.f1847e;
                f fVar5 = cVar.f1714e;
                fVar5.getClass();
                if (i36 == 1) {
                    c cVar3 = (c) view.getLayoutParams();
                    cVar3.f1714e = fVar5;
                    ArrayList<View> arrayList = fVar5.f1729a;
                    arrayList.add(view);
                    fVar5.f1731c = Integer.MIN_VALUE;
                    if (arrayList.size() == 1) {
                        fVar5.f1730b = Integer.MIN_VALUE;
                    }
                    if (cVar3.c() || cVar3.b()) {
                        fVar5.d = StaggeredGridLayoutManager.this.f1701r.c(view) + fVar5.d;
                    }
                } else {
                    c cVar4 = (c) view.getLayoutParams();
                    cVar4.f1714e = fVar5;
                    ArrayList<View> arrayList2 = fVar5.f1729a;
                    arrayList2.add(0, view);
                    fVar5.f1730b = Integer.MIN_VALUE;
                    if (arrayList2.size() == 1) {
                        fVar5.f1731c = Integer.MIN_VALUE;
                    }
                    if (cVar4.c() || cVar4.b()) {
                        fVar5.d = StaggeredGridLayoutManager.this.f1701r.c(view) + fVar5.d;
                    }
                }
                if (!T0() || this.f1703t != 1) {
                    i21 = this.f1702s.k() + (fVar.f1732e * this.u);
                    i22 = this.f1702s.c(view) + i21;
                } else {
                    i22 = this.f1702s.g() - (((this.f1699p - 1) - fVar.f1732e) * this.u);
                    i21 = i22 - this.f1702s.c(view);
                }
                if (this.f1703t == 1) {
                    int i37 = i21;
                    i21 = i20;
                    i20 = i37;
                    int i38 = i22;
                    i22 = i19;
                    i19 = i38;
                }
                RecyclerView.n.O(view, i20, i21, i19, i22);
                e1(fVar, nVar3.f1847e, i10);
                X0(uVar2, nVar3);
                if (!nVar3.f1850h || !view.hasFocusable()) {
                    i23 = 0;
                } else {
                    i23 = 0;
                    this.f1706y.set(fVar.f1732e, false);
                }
                i27 = i23;
                i28 = 1;
                z11 = true;
            }
        }
        int i322 = i27;
        if (!z11) {
            X0(uVar2, nVar3);
        }
        if (nVar3.f1847e == -1) {
            i13 = this.f1701r.k() - Q0(this.f1701r.k());
        } else {
            i13 = P0(this.f1701r.g()) - this.f1701r.g();
        }
        if (i13 > 0) {
            return Math.min(nVar2.f1845b, i13);
        }
        return i322;
    }

    public final View J0(boolean z10) {
        int k10 = this.f1701r.k();
        int g10 = this.f1701r.g();
        View view = null;
        for (int w10 = w() - 1; w10 >= 0; w10--) {
            View v10 = v(w10);
            int e10 = this.f1701r.e(v10);
            int b10 = this.f1701r.b(v10);
            if (b10 > k10 && e10 < g10) {
                if (b10 <= g10 || !z10) {
                    return v10;
                }
                if (view == null) {
                    view = v10;
                }
            }
        }
        return view;
    }

    public final View K0(boolean z10) {
        int k10 = this.f1701r.k();
        int g10 = this.f1701r.g();
        int w10 = w();
        View view = null;
        for (int i10 = 0; i10 < w10; i10++) {
            View v10 = v(i10);
            int e10 = this.f1701r.e(v10);
            if (this.f1701r.b(v10) > k10 && e10 < g10) {
                if (e10 >= k10 || !z10) {
                    return v10;
                }
                if (view == null) {
                    view = v10;
                }
            }
        }
        return view;
    }

    public final void L0(RecyclerView.u uVar, RecyclerView.z zVar, boolean z10) {
        int g10;
        int P0 = P0(Integer.MIN_VALUE);
        if (P0 != Integer.MIN_VALUE && (g10 = this.f1701r.g() - P0) > 0) {
            int i10 = g10 - (-b1(-g10, uVar, zVar));
            if (z10 && i10 > 0) {
                this.f1701r.o(i10);
            }
        }
    }

    public final boolean M() {
        return this.C != 0;
    }

    public final void M0(RecyclerView.u uVar, RecyclerView.z zVar, boolean z10) {
        int k10;
        int Q0 = Q0(Integer.MAX_VALUE);
        if (Q0 != Integer.MAX_VALUE && (k10 = Q0 - this.f1701r.k()) > 0) {
            int b12 = k10 - b1(k10, uVar, zVar);
            if (z10 && b12 > 0) {
                this.f1701r.o(-b12);
            }
        }
    }

    public final int N0() {
        if (w() == 0) {
            return 0;
        }
        return RecyclerView.n.G(v(0));
    }

    public final int O0() {
        int w10 = w();
        if (w10 == 0) {
            return 0;
        }
        return RecyclerView.n.G(v(w10 - 1));
    }

    public final void P(int i10) {
        super.P(i10);
        for (int i11 = 0; i11 < this.f1699p; i11++) {
            f fVar = this.f1700q[i11];
            int i12 = fVar.f1730b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f1730b = i12 + i10;
            }
            int i13 = fVar.f1731c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f1731c = i13 + i10;
            }
        }
    }

    public final int P0(int i10) {
        int f10 = this.f1700q[0].f(i10);
        for (int i11 = 1; i11 < this.f1699p; i11++) {
            int f11 = this.f1700q[i11].f(i10);
            if (f11 > f10) {
                f10 = f11;
            }
        }
        return f10;
    }

    public final void Q(int i10) {
        super.Q(i10);
        for (int i11 = 0; i11 < this.f1699p; i11++) {
            f fVar = this.f1700q[i11];
            int i12 = fVar.f1730b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f1730b = i12 + i10;
            }
            int i13 = fVar.f1731c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f1731c = i13 + i10;
            }
        }
    }

    public final int Q0(int i10) {
        int i11 = this.f1700q[0].i(i10);
        for (int i12 = 1; i12 < this.f1699p; i12++) {
            int i13 = this.f1700q[i12].i(i10);
            if (i13 < i11) {
                i11 = i13;
            }
        }
        return i11;
    }

    public final void R() {
        this.B.a();
        for (int i10 = 0; i10 < this.f1699p; i10++) {
            this.f1700q[i10].b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f1705x
            if (r0 == 0) goto L_0x0009
            int r0 = r7.O0()
            goto L_0x000d
        L_0x0009:
            int r0 = r7.N0()
        L_0x000d:
            r1 = 8
            if (r10 != r1) goto L_0x001a
            if (r8 >= r9) goto L_0x0016
            int r2 = r9 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r8 + 1
            r3 = r9
            goto L_0x001d
        L_0x001a:
            int r2 = r8 + r9
        L_0x001c:
            r3 = r8
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r7.B
            r4.c(r3)
            r5 = 1
            if (r10 == r5) goto L_0x0036
            r6 = 2
            if (r10 == r6) goto L_0x0032
            if (r10 == r1) goto L_0x002b
            goto L_0x0039
        L_0x002b:
            r4.e(r8, r5)
            r4.d(r9, r5)
            goto L_0x0039
        L_0x0032:
            r4.e(r8, r9)
            goto L_0x0039
        L_0x0036:
            r4.d(r8, r9)
        L_0x0039:
            if (r2 > r0) goto L_0x003c
            return
        L_0x003c:
            boolean r8 = r7.f1705x
            if (r8 == 0) goto L_0x0045
            int r8 = r7.N0()
            goto L_0x0049
        L_0x0045:
            int r8 = r7.O0()
        L_0x0049:
            if (r3 > r8) goto L_0x004e
            r7.o0()
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R0(int, int, int):void");
    }

    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1640b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i10 = 0; i10 < this.f1699p; i10++) {
            this.f1700q[i10].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        if (r10 == r11) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r10 == r11) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e1, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View S0() {
        /*
            r13 = this;
            int r0 = r13.w()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r13.f1699p
            r2.<init>(r3)
            int r3 = r13.f1699p
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r13.f1703t
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r13.T0()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r13.f1705x
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x0100
            android.view.View r7 = r13.v(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1714e
            int r9 = r9.f1732e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x00b1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1714e
            boolean r10 = r13.f1705x
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x006a
            int r10 = r9.f1731c
            if (r10 == r11) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r9.a()
            int r10 = r9.f1731c
        L_0x0056:
            androidx.recyclerview.widget.s r11 = r13.f1701r
            int r11 = r11.g()
            if (r10 >= r11) goto L_0x00a6
            java.util.ArrayList<android.view.View> r10 = r9.f1729a
            int r11 = r10.size()
            int r11 = r11 - r1
            java.lang.Object r10 = r10.get(r11)
            goto L_0x0098
        L_0x006a:
            int r10 = r9.f1730b
            if (r10 == r11) goto L_0x006f
            goto L_0x008a
        L_0x006f:
            java.util.ArrayList<android.view.View> r10 = r9.f1729a
            java.lang.Object r10 = r10.get(r4)
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r11 = androidx.recyclerview.widget.StaggeredGridLayoutManager.f.h(r10)
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.s r12 = r12.f1701r
            int r10 = r12.e(r10)
            r9.f1730b = r10
            r11.getClass()
            int r10 = r9.f1730b
        L_0x008a:
            androidx.recyclerview.widget.s r11 = r13.f1701r
            int r11 = r11.k()
            if (r10 <= r11) goto L_0x00a6
            java.util.ArrayList<android.view.View> r10 = r9.f1729a
            java.lang.Object r10 = r10.get(r4)
        L_0x0098:
            android.view.View r10 = (android.view.View) r10
            r9.getClass()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.f.h(r10)
            r9.getClass()
            r9 = r1
            goto L_0x00a7
        L_0x00a6:
            r9 = r4
        L_0x00a7:
            if (r9 == 0) goto L_0x00aa
            return r7
        L_0x00aa:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1714e
            int r9 = r9.f1732e
            r2.clear(r9)
        L_0x00b1:
            int r0 = r0 + r5
            if (r0 == r6) goto L_0x002e
            android.view.View r9 = r13.v(r0)
            boolean r10 = r13.f1705x
            if (r10 == 0) goto L_0x00ce
            androidx.recyclerview.widget.s r10 = r13.f1701r
            int r10 = r10.b(r7)
            androidx.recyclerview.widget.s r11 = r13.f1701r
            int r11 = r11.b(r9)
            if (r10 >= r11) goto L_0x00cb
            return r7
        L_0x00cb:
            if (r10 != r11) goto L_0x00e1
            goto L_0x00df
        L_0x00ce:
            androidx.recyclerview.widget.s r10 = r13.f1701r
            int r10 = r10.e(r7)
            androidx.recyclerview.widget.s r11 = r13.f1701r
            int r11 = r11.e(r9)
            if (r10 <= r11) goto L_0x00dd
            return r7
        L_0x00dd:
            if (r10 != r11) goto L_0x00e1
        L_0x00df:
            r10 = r1
            goto L_0x00e2
        L_0x00e1:
            r10 = r4
        L_0x00e2:
            if (r10 == 0) goto L_0x002e
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f1714e
            int r8 = r8.f1732e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f1714e
            int r9 = r9.f1732e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00f7
            r8 = r1
            goto L_0x00f8
        L_0x00f7:
            r8 = r4
        L_0x00f8:
            if (r3 >= 0) goto L_0x00fc
            r9 = r1
            goto L_0x00fd
        L_0x00fc:
            r9 = r4
        L_0x00fd:
            if (r8 == r9) goto L_0x002e
            return r7
        L_0x0100:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S0():android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r8.f1703t == 1) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        if (r8.f1703t == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        if (T0() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0069, code lost:
        if (T0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View T(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.u r11, androidx.recyclerview.widget.RecyclerView.z r12) {
        /*
            r8 = this;
            int r0 = r8.w()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r0 = r8.f1640b
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r9 = r1
            goto L_0x001e
        L_0x000e:
            android.view.View r9 = r0.B(r9)
            if (r9 != 0) goto L_0x0015
            goto L_0x000c
        L_0x0015:
            androidx.recyclerview.widget.b r0 = r8.f1639a
            boolean r0 = r0.j(r9)
            if (r0 == 0) goto L_0x001e
            goto L_0x000c
        L_0x001e:
            if (r9 != 0) goto L_0x0021
            return r1
        L_0x0021:
            r8.a1()
            r0 = 1
            r2 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x0060
            r4 = 2
            if (r10 == r4) goto L_0x0054
            r4 = 17
            if (r10 == r4) goto L_0x004d
            r4 = 33
            if (r10 == r4) goto L_0x0048
            r4 = 66
            if (r10 == r4) goto L_0x0043
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x003e
            goto L_0x0052
        L_0x003e:
            int r10 = r8.f1703t
            if (r10 != r0) goto L_0x0052
            goto L_0x006b
        L_0x0043:
            int r10 = r8.f1703t
            if (r10 != 0) goto L_0x0052
            goto L_0x006b
        L_0x0048:
            int r10 = r8.f1703t
            if (r10 != r0) goto L_0x0052
            goto L_0x006d
        L_0x004d:
            int r10 = r8.f1703t
            if (r10 != 0) goto L_0x0052
            goto L_0x006d
        L_0x0052:
            r10 = r3
            goto L_0x006e
        L_0x0054:
            int r10 = r8.f1703t
            if (r10 != r0) goto L_0x0059
            goto L_0x006b
        L_0x0059:
            boolean r10 = r8.T0()
            if (r10 == 0) goto L_0x006b
            goto L_0x006d
        L_0x0060:
            int r10 = r8.f1703t
            if (r10 != r0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            boolean r10 = r8.T0()
            if (r10 == 0) goto L_0x006d
        L_0x006b:
            r10 = r0
            goto L_0x006e
        L_0x006d:
            r10 = r2
        L_0x006e:
            if (r10 != r3) goto L_0x0071
            return r1
        L_0x0071:
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r3
            r3.getClass()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r3 = r3.f1714e
            if (r10 != r0) goto L_0x0083
            int r4 = r8.O0()
            goto L_0x0087
        L_0x0083:
            int r4 = r8.N0()
        L_0x0087:
            r8.d1(r4, r12)
            r8.c1(r10)
            androidx.recyclerview.widget.n r5 = r8.f1704v
            int r6 = r5.d
            int r6 = r6 + r4
            r5.f1846c = r6
            androidx.recyclerview.widget.s r6 = r8.f1701r
            int r6 = r6.l()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.f1845b = r6
            r5.f1850h = r0
            r6 = 0
            r5.f1844a = r6
            r8.I0(r11, r5, r12)
            boolean r11 = r8.f1705x
            r8.D = r11
            android.view.View r11 = r3.g(r4, r10)
            if (r11 == 0) goto L_0x00b7
            if (r11 == r9) goto L_0x00b7
            return r11
        L_0x00b7:
            boolean r11 = r8.V0(r10)
            if (r11 == 0) goto L_0x00d2
            int r11 = r8.f1699p
            int r11 = r11 - r0
        L_0x00c0:
            if (r11 < 0) goto L_0x00e7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1700q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00cf
            if (r12 == r9) goto L_0x00cf
            return r12
        L_0x00cf:
            int r11 = r11 + -1
            goto L_0x00c0
        L_0x00d2:
            r11 = r6
        L_0x00d3:
            int r12 = r8.f1699p
            if (r11 >= r12) goto L_0x00e7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1700q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00e4
            if (r12 == r9) goto L_0x00e4
            return r12
        L_0x00e4:
            int r11 = r11 + 1
            goto L_0x00d3
        L_0x00e7:
            boolean r11 = r8.w
            r11 = r11 ^ r0
            if (r10 != r2) goto L_0x00ee
            r12 = r0
            goto L_0x00ef
        L_0x00ee:
            r12 = r6
        L_0x00ef:
            if (r11 != r12) goto L_0x00f3
            r11 = r0
            goto L_0x00f4
        L_0x00f3:
            r11 = r6
        L_0x00f4:
            if (r11 == 0) goto L_0x00fb
            int r12 = r3.c()
            goto L_0x00ff
        L_0x00fb:
            int r12 = r3.d()
        L_0x00ff:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L_0x0108
            if (r12 == r9) goto L_0x0108
            return r12
        L_0x0108:
            boolean r10 = r8.V0(r10)
            if (r10 == 0) goto L_0x0135
            int r10 = r8.f1699p
            int r10 = r10 - r0
        L_0x0111:
            if (r10 < 0) goto L_0x0156
            int r12 = r3.f1732e
            if (r10 != r12) goto L_0x0118
            goto L_0x0132
        L_0x0118:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1700q
            if (r11 == 0) goto L_0x0123
            r12 = r12[r10]
            int r12 = r12.c()
            goto L_0x0129
        L_0x0123:
            r12 = r12[r10]
            int r12 = r12.d()
        L_0x0129:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L_0x0132
            if (r12 == r9) goto L_0x0132
            return r12
        L_0x0132:
            int r10 = r10 + -1
            goto L_0x0111
        L_0x0135:
            int r10 = r8.f1699p
            if (r6 >= r10) goto L_0x0156
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f1700q
            if (r11 == 0) goto L_0x0144
            r10 = r10[r6]
            int r10 = r10.c()
            goto L_0x014a
        L_0x0144:
            r10 = r10[r6]
            int r10 = r10.d()
        L_0x014a:
            android.view.View r10 = r8.q(r10)
            if (r10 == 0) goto L_0x0153
            if (r10 == r9) goto L_0x0153
            return r10
        L_0x0153:
            int r6 = r6 + 1
            goto L_0x0135
        L_0x0156:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    public final boolean T0() {
        return A() == 1;
    }

    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (w() > 0) {
            View K0 = K0(false);
            View J0 = J0(false);
            if (K0 != null && J0 != null) {
                int G2 = RecyclerView.n.G(K0);
                int G3 = RecyclerView.n.G(J0);
                if (G2 < G3) {
                    accessibilityEvent.setFromIndex(G2);
                    accessibilityEvent.setToIndex(G3);
                    return;
                }
                accessibilityEvent.setFromIndex(G3);
                accessibilityEvent.setToIndex(G2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:239:0x03eb, code lost:
        if (E0() != false) goto L_0x03ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U0(androidx.recyclerview.widget.RecyclerView.u r17, androidx.recyclerview.widget.RecyclerView.z r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r3 = r0.F
            r4 = -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r5 = r0.H
            if (r3 != 0) goto L_0x0011
            int r3 = r0.z
            if (r3 == r4) goto L_0x001e
        L_0x0011:
            int r3 = r18.b()
            if (r3 != 0) goto L_0x001e
            r16.j0(r17)
            r5.a()
            return
        L_0x001e:
            boolean r3 = r5.f1711e
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x002f
            int r3 = r0.z
            if (r3 != r4) goto L_0x002f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r3 = r0.F
            if (r3 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r3 = r6
            goto L_0x0030
        L_0x002f:
            r3 = r7
        L_0x0030:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r0.B
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L_0x01f9
            r5.a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            if (r11 == 0) goto L_0x00c0
            int r12 = r11.f1723q
            r13 = 0
            if (r12 <= 0) goto L_0x0087
            int r14 = r0.f1699p
            if (r12 != r14) goto L_0x0079
            r11 = r6
        L_0x0049:
            int r12 = r0.f1699p
            if (r11 >= r12) goto L_0x0087
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r0.f1700q
            r12 = r12[r11]
            r12.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r12 = r0.F
            int[] r14 = r12.f1724r
            r14 = r14[r11]
            if (r14 == r10) goto L_0x006e
            boolean r12 = r12.w
            if (r12 == 0) goto L_0x0067
            androidx.recyclerview.widget.s r12 = r0.f1701r
            int r12 = r12.g()
            goto L_0x006d
        L_0x0067:
            androidx.recyclerview.widget.s r12 = r0.f1701r
            int r12 = r12.k()
        L_0x006d:
            int r14 = r14 + r12
        L_0x006e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r0.f1700q
            r12 = r12[r11]
            r12.f1730b = r14
            r12.f1731c = r14
            int r11 = r11 + 1
            goto L_0x0049
        L_0x0079:
            r11.f1724r = r13
            r11.f1723q = r6
            r11.f1725s = r6
            r11.f1726t = r13
            r11.u = r13
            int r12 = r11.f1722p
            r11.f1721o = r12
        L_0x0087:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            boolean r12 = r11.f1728x
            r0.E = r12
            boolean r11 = r11.f1727v
            r0.c(r13)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r12 = r0.F
            if (r12 == 0) goto L_0x009c
            boolean r13 = r12.f1727v
            if (r13 == r11) goto L_0x009c
            r12.f1727v = r11
        L_0x009c:
            r0.w = r11
            r16.o0()
            r16.a1()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            int r12 = r11.f1721o
            if (r12 == r4) goto L_0x00af
            r0.z = r12
            boolean r12 = r11.w
            goto L_0x00b1
        L_0x00af:
            boolean r12 = r0.f1705x
        L_0x00b1:
            r5.f1710c = r12
            int r12 = r11.f1725s
            if (r12 <= r7) goto L_0x00c7
            int[] r12 = r11.f1726t
            r9.f1715a = r12
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r11 = r11.u
            r9.f1716b = r11
            goto L_0x00c7
        L_0x00c0:
            r16.a1()
            boolean r11 = r0.f1705x
            r5.f1710c = r11
        L_0x00c7:
            boolean r11 = r2.f1692g
            if (r11 != 0) goto L_0x01ba
            int r11 = r0.z
            if (r11 != r4) goto L_0x00d1
            goto L_0x01ba
        L_0x00d1:
            if (r11 < 0) goto L_0x01b6
            int r12 = r18.b()
            if (r11 < r12) goto L_0x00db
            goto L_0x01b6
        L_0x00db:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            if (r11 == 0) goto L_0x00f0
            int r12 = r11.f1721o
            if (r12 == r4) goto L_0x00f0
            int r11 = r11.f1723q
            if (r11 >= r7) goto L_0x00e8
            goto L_0x00f0
        L_0x00e8:
            r5.f1709b = r10
            int r11 = r0.z
            r5.f1708a = r11
            goto L_0x01b4
        L_0x00f0:
            int r11 = r0.z
            android.view.View r11 = r0.q(r11)
            if (r11 == 0) goto L_0x0178
            boolean r12 = r0.f1705x
            if (r12 == 0) goto L_0x0101
            int r12 = r16.O0()
            goto L_0x0105
        L_0x0101:
            int r12 = r16.N0()
        L_0x0105:
            r5.f1708a = r12
            int r12 = r0.A
            if (r12 == r10) goto L_0x0130
            boolean r12 = r5.f1710c
            if (r12 == 0) goto L_0x011f
            androidx.recyclerview.widget.s r12 = r0.f1701r
            int r12 = r12.g()
            int r13 = r0.A
            int r12 = r12 - r13
            androidx.recyclerview.widget.s r13 = r0.f1701r
            int r11 = r13.b(r11)
            goto L_0x012e
        L_0x011f:
            androidx.recyclerview.widget.s r12 = r0.f1701r
            int r12 = r12.k()
            int r13 = r0.A
            int r12 = r12 + r13
            androidx.recyclerview.widget.s r13 = r0.f1701r
            int r11 = r13.e(r11)
        L_0x012e:
            int r12 = r12 - r11
            goto L_0x0172
        L_0x0130:
            androidx.recyclerview.widget.s r12 = r0.f1701r
            int r12 = r12.c(r11)
            androidx.recyclerview.widget.s r13 = r0.f1701r
            int r13 = r13.l()
            if (r12 <= r13) goto L_0x0150
            boolean r11 = r5.f1710c
            if (r11 == 0) goto L_0x0149
            androidx.recyclerview.widget.s r11 = r0.f1701r
            int r11 = r11.g()
            goto L_0x0160
        L_0x0149:
            androidx.recyclerview.widget.s r11 = r0.f1701r
            int r11 = r11.k()
            goto L_0x0160
        L_0x0150:
            androidx.recyclerview.widget.s r12 = r0.f1701r
            int r12 = r12.e(r11)
            androidx.recyclerview.widget.s r13 = r0.f1701r
            int r13 = r13.k()
            int r12 = r12 - r13
            if (r12 >= 0) goto L_0x0163
            int r11 = -r12
        L_0x0160:
            r5.f1709b = r11
            goto L_0x01b4
        L_0x0163:
            androidx.recyclerview.widget.s r12 = r0.f1701r
            int r12 = r12.g()
            androidx.recyclerview.widget.s r13 = r0.f1701r
            int r11 = r13.b(r11)
            int r12 = r12 - r11
            if (r12 >= 0) goto L_0x0175
        L_0x0172:
            r5.f1709b = r12
            goto L_0x01b4
        L_0x0175:
            r5.f1709b = r10
            goto L_0x01b4
        L_0x0178:
            int r11 = r0.z
            r5.f1708a = r11
            int r12 = r0.A
            if (r12 != r10) goto L_0x019d
            int r11 = r0.D0(r11)
            if (r11 != r7) goto L_0x0188
            r11 = r7
            goto L_0x0189
        L_0x0188:
            r11 = r6
        L_0x0189:
            r5.f1710c = r11
            if (r11 == 0) goto L_0x0194
            androidx.recyclerview.widget.s r11 = r8.f1701r
            int r11 = r11.g()
            goto L_0x019a
        L_0x0194:
            androidx.recyclerview.widget.s r11 = r8.f1701r
            int r11 = r11.k()
        L_0x019a:
            r5.f1709b = r11
            goto L_0x01b2
        L_0x019d:
            boolean r11 = r5.f1710c
            if (r11 == 0) goto L_0x01a9
            androidx.recyclerview.widget.s r11 = r8.f1701r
            int r11 = r11.g()
            int r11 = r11 - r12
            goto L_0x01b0
        L_0x01a9:
            androidx.recyclerview.widget.s r11 = r8.f1701r
            int r11 = r11.k()
            int r11 = r11 + r12
        L_0x01b0:
            r5.f1709b = r11
        L_0x01b2:
            r5.d = r7
        L_0x01b4:
            r11 = r7
            goto L_0x01bb
        L_0x01b6:
            r0.z = r4
            r0.A = r10
        L_0x01ba:
            r11 = r6
        L_0x01bb:
            if (r11 == 0) goto L_0x01be
            goto L_0x01f7
        L_0x01be:
            boolean r11 = r0.D
            int r12 = r18.b()
            if (r11 == 0) goto L_0x01da
            int r11 = r16.w()
        L_0x01ca:
            int r11 = r11 + r4
            if (r11 < 0) goto L_0x01f2
            android.view.View r13 = r0.v(r11)
            int r13 = androidx.recyclerview.widget.RecyclerView.n.G(r13)
            if (r13 < 0) goto L_0x01ca
            if (r13 >= r12) goto L_0x01ca
            goto L_0x01f3
        L_0x01da:
            int r11 = r16.w()
            r13 = r6
        L_0x01df:
            if (r13 >= r11) goto L_0x01f2
            android.view.View r14 = r0.v(r13)
            int r14 = androidx.recyclerview.widget.RecyclerView.n.G(r14)
            if (r14 < 0) goto L_0x01ef
            if (r14 >= r12) goto L_0x01ef
            r13 = r14
            goto L_0x01f3
        L_0x01ef:
            int r13 = r13 + 1
            goto L_0x01df
        L_0x01f2:
            r13 = r6
        L_0x01f3:
            r5.f1708a = r13
            r5.f1709b = r10
        L_0x01f7:
            r5.f1711e = r7
        L_0x01f9:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            if (r11 != 0) goto L_0x0214
            int r11 = r0.z
            if (r11 != r4) goto L_0x0214
            boolean r11 = r5.f1710c
            boolean r12 = r0.D
            if (r11 != r12) goto L_0x020f
            boolean r11 = r16.T0()
            boolean r12 = r0.E
            if (r11 == r12) goto L_0x0214
        L_0x020f:
            r9.a()
            r5.d = r7
        L_0x0214:
            int r9 = r16.w()
            if (r9 <= 0) goto L_0x02bf
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r0.F
            if (r9 == 0) goto L_0x0222
            int r9 = r9.f1723q
            if (r9 >= r7) goto L_0x02bf
        L_0x0222:
            boolean r9 = r5.d
            if (r9 == 0) goto L_0x0241
            r3 = r6
        L_0x0227:
            int r8 = r0.f1699p
            if (r3 >= r8) goto L_0x02bf
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r0.f1700q
            r8 = r8[r3]
            r8.b()
            int r8 = r5.f1709b
            if (r8 == r10) goto L_0x023e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r9 = r0.f1700q
            r9 = r9[r3]
            r9.f1730b = r8
            r9.f1731c = r8
        L_0x023e:
            int r3 = r3 + 1
            goto L_0x0227
        L_0x0241:
            if (r3 != 0) goto L_0x025f
            int[] r3 = r5.f1712f
            if (r3 != 0) goto L_0x0248
            goto L_0x025f
        L_0x0248:
            r3 = r6
        L_0x0249:
            int r8 = r0.f1699p
            if (r3 >= r8) goto L_0x02bf
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r0.f1700q
            r8 = r8[r3]
            r8.b()
            int[] r9 = r5.f1712f
            r9 = r9[r3]
            r8.f1730b = r9
            r8.f1731c = r9
            int r3 = r3 + 1
            goto L_0x0249
        L_0x025f:
            r3 = r6
        L_0x0260:
            int r9 = r0.f1699p
            if (r3 >= r9) goto L_0x029e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r9 = r0.f1700q
            r9 = r9[r3]
            boolean r11 = r0.f1705x
            int r12 = r5.f1709b
            if (r11 == 0) goto L_0x0273
            int r13 = r9.f(r10)
            goto L_0x0277
        L_0x0273:
            int r13 = r9.i(r10)
        L_0x0277:
            r9.b()
            if (r13 != r10) goto L_0x027d
            goto L_0x029b
        L_0x027d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r14 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            if (r11 == 0) goto L_0x0289
            androidx.recyclerview.widget.s r15 = r14.f1701r
            int r15 = r15.g()
            if (r13 < r15) goto L_0x029b
        L_0x0289:
            if (r11 != 0) goto L_0x0294
            androidx.recyclerview.widget.s r11 = r14.f1701r
            int r11 = r11.k()
            if (r13 <= r11) goto L_0x0294
            goto L_0x029b
        L_0x0294:
            if (r12 == r10) goto L_0x0297
            int r13 = r13 + r12
        L_0x0297:
            r9.f1731c = r13
            r9.f1730b = r13
        L_0x029b:
            int r3 = r3 + 1
            goto L_0x0260
        L_0x029e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r3 = r0.f1700q
            int r9 = r3.length
            int[] r11 = r5.f1712f
            if (r11 == 0) goto L_0x02a8
            int r11 = r11.length
            if (r11 >= r9) goto L_0x02af
        L_0x02a8:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r8.f1700q
            int r8 = r8.length
            int[] r8 = new int[r8]
            r5.f1712f = r8
        L_0x02af:
            r8 = r6
        L_0x02b0:
            if (r8 >= r9) goto L_0x02bf
            int[] r11 = r5.f1712f
            r12 = r3[r8]
            int r12 = r12.i(r10)
            r11[r8] = r12
            int r8 = r8 + 1
            goto L_0x02b0
        L_0x02bf:
            r16.p(r17)
            androidx.recyclerview.widget.n r3 = r0.f1704v
            r3.f1844a = r6
            androidx.recyclerview.widget.s r8 = r0.f1702s
            int r8 = r8.l()
            int r9 = r0.f1699p
            int r9 = r8 / r9
            r0.u = r9
            androidx.recyclerview.widget.s r9 = r0.f1702s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r8 = r5.f1708a
            r0.d1(r8, r2)
            boolean r8 = r5.f1710c
            if (r8 == 0) goto L_0x02ee
            r0.c1(r4)
            r0.I0(r1, r3, r2)
            r0.c1(r7)
            goto L_0x02f7
        L_0x02ee:
            r0.c1(r7)
            r0.I0(r1, r3, r2)
            r0.c1(r4)
        L_0x02f7:
            int r4 = r5.f1708a
            int r8 = r3.d
            int r4 = r4 + r8
            r3.f1846c = r4
            r0.I0(r1, r3, r2)
            androidx.recyclerview.widget.s r3 = r0.f1702s
            int r3 = r3.i()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L_0x030d
            goto L_0x03ac
        L_0x030d:
            int r3 = r16.w()
            r4 = 0
            r8 = r6
        L_0x0313:
            if (r8 >= r3) goto L_0x0335
            android.view.View r9 = r0.v(r8)
            androidx.recyclerview.widget.s r11 = r0.f1702s
            int r11 = r11.c(r9)
            float r11 = (float) r11
            int r12 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0325
            goto L_0x0332
        L_0x0325:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            r9.getClass()
            float r4 = java.lang.Math.max(r4, r11)
        L_0x0332:
            int r8 = r8 + 1
            goto L_0x0313
        L_0x0335:
            int r8 = r0.u
            int r9 = r0.f1699p
            float r9 = (float) r9
            float r4 = r4 * r9
            int r4 = java.lang.Math.round(r4)
            androidx.recyclerview.widget.s r9 = r0.f1702s
            int r9 = r9.i()
            if (r9 != r10) goto L_0x0351
            androidx.recyclerview.widget.s r9 = r0.f1702s
            int r9 = r9.l()
            int r4 = java.lang.Math.min(r4, r9)
        L_0x0351:
            int r9 = r0.f1699p
            int r9 = r4 / r9
            r0.u = r9
            androidx.recyclerview.widget.s r9 = r0.f1702s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r4 = r0.u
            if (r4 != r8) goto L_0x0365
            goto L_0x03ac
        L_0x0365:
            r4 = r6
        L_0x0366:
            if (r4 >= r3) goto L_0x03ac
            android.view.View r9 = r0.v(r4)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r10
            r10.getClass()
            boolean r11 = r16.T0()
            if (r11 == 0) goto L_0x0395
            int r11 = r0.f1703t
            if (r11 != r7) goto L_0x0395
            int r11 = r0.f1699p
            int r12 = r11 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r10.f1714e
            int r10 = r10.f1732e
            int r12 = r12 - r10
            int r12 = -r12
            int r13 = r0.u
            int r12 = r12 * r13
            int r11 = r11 - r7
            int r11 = r11 - r10
            int r10 = -r11
            int r10 = r10 * r8
            int r12 = r12 - r10
            r9.offsetLeftAndRight(r12)
            goto L_0x03a9
        L_0x0395:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r10.f1714e
            int r10 = r10.f1732e
            int r11 = r0.u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r12 = r0.f1703t
            int r11 = r11 - r10
            if (r12 != r7) goto L_0x03a6
            r9.offsetLeftAndRight(r11)
            goto L_0x03a9
        L_0x03a6:
            r9.offsetTopAndBottom(r11)
        L_0x03a9:
            int r4 = r4 + 1
            goto L_0x0366
        L_0x03ac:
            int r3 = r16.w()
            if (r3 <= 0) goto L_0x03c3
            boolean r3 = r0.f1705x
            if (r3 == 0) goto L_0x03bd
            r0.L0(r1, r2, r7)
            r0.M0(r1, r2, r6)
            goto L_0x03c3
        L_0x03bd:
            r0.M0(r1, r2, r7)
            r0.L0(r1, r2, r6)
        L_0x03c3:
            if (r19 == 0) goto L_0x03ee
            boolean r3 = r2.f1692g
            if (r3 != 0) goto L_0x03ee
            int r3 = r0.C
            if (r3 == 0) goto L_0x03db
            int r3 = r16.w()
            if (r3 <= 0) goto L_0x03db
            android.view.View r3 = r16.S0()
            if (r3 == 0) goto L_0x03db
            r3 = r7
            goto L_0x03dc
        L_0x03db:
            r3 = r6
        L_0x03dc:
            if (r3 == 0) goto L_0x03ee
            androidx.recyclerview.widget.RecyclerView r3 = r0.f1640b
            if (r3 == 0) goto L_0x03e7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r4 = r0.K
            r3.removeCallbacks(r4)
        L_0x03e7:
            boolean r3 = r16.E0()
            if (r3 == 0) goto L_0x03ee
            goto L_0x03ef
        L_0x03ee:
            r7 = r6
        L_0x03ef:
            boolean r3 = r2.f1692g
            if (r3 == 0) goto L_0x03f6
            r5.a()
        L_0x03f6:
            boolean r3 = r5.f1710c
            r0.D = r3
            boolean r3 = r16.T0()
            r0.E = r3
            if (r7 == 0) goto L_0x0408
            r5.a()
            r0.U0(r1, r2, r6)
        L_0x0408:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U0(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    public final boolean V0(int i10) {
        if (this.f1703t == 0) {
            return (i10 == -1) != this.f1705x;
        }
        return ((i10 == -1) == this.f1705x) == T0();
    }

    public final void W0(int i10, RecyclerView.z zVar) {
        int i11;
        int i12;
        if (i10 > 0) {
            i12 = O0();
            i11 = 1;
        } else {
            i12 = N0();
            i11 = -1;
        }
        n nVar = this.f1704v;
        nVar.f1844a = true;
        d1(i12, zVar);
        c1(i11);
        nVar.f1846c = i12 + nVar.d;
        nVar.f1845b = Math.abs(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r6.f1847e == -1) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void X0(androidx.recyclerview.widget.RecyclerView.u r5, androidx.recyclerview.widget.n r6) {
        /*
            r4 = this;
            boolean r0 = r6.f1844a
            if (r0 == 0) goto L_0x007c
            boolean r0 = r6.f1851i
            if (r0 == 0) goto L_0x000a
            goto L_0x007c
        L_0x000a:
            int r0 = r6.f1845b
            r1 = -1
            if (r0 != 0) goto L_0x001f
            int r0 = r6.f1847e
            if (r0 != r1) goto L_0x0019
        L_0x0013:
            int r6 = r6.f1849g
        L_0x0015:
            r4.Y0(r6, r5)
            goto L_0x007c
        L_0x0019:
            int r6 = r6.f1848f
        L_0x001b:
            r4.Z0(r6, r5)
            goto L_0x007c
        L_0x001f:
            int r0 = r6.f1847e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0050
            int r0 = r6.f1848f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f1700q
            r1 = r1[r2]
            int r1 = r1.i(r0)
        L_0x002f:
            int r2 = r4.f1699p
            if (r3 >= r2) goto L_0x0041
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f1700q
            r2 = r2[r3]
            int r2 = r2.i(r0)
            if (r2 <= r1) goto L_0x003e
            r1 = r2
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0041:
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0045
            goto L_0x0013
        L_0x0045:
            int r1 = r6.f1849g
            int r6 = r6.f1845b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L_0x0015
        L_0x0050:
            int r0 = r6.f1849g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f1700q
            r1 = r1[r2]
            int r1 = r1.f(r0)
        L_0x005a:
            int r2 = r4.f1699p
            if (r3 >= r2) goto L_0x006c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f1700q
            r2 = r2[r3]
            int r2 = r2.f(r0)
            if (r2 >= r1) goto L_0x0069
            r1 = r2
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006c:
            int r0 = r6.f1849g
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x0072
            goto L_0x0019
        L_0x0072:
            int r0 = r6.f1848f
            int r6 = r6.f1845b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L_0x001b
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X0(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.n):void");
    }

    public final void Y(int i10, int i11) {
        R0(i10, i11, 1);
    }

    public final void Y0(int i10, RecyclerView.u uVar) {
        int w10 = w() - 1;
        while (w10 >= 0) {
            View v10 = v(w10);
            if (this.f1701r.e(v10) >= i10 && this.f1701r.n(v10) >= i10) {
                c cVar = (c) v10.getLayoutParams();
                cVar.getClass();
                if (cVar.f1714e.f1729a.size() != 1) {
                    f fVar = cVar.f1714e;
                    ArrayList<View> arrayList = fVar.f1729a;
                    int size = arrayList.size();
                    View remove = arrayList.remove(size - 1);
                    c h10 = f.h(remove);
                    h10.f1714e = null;
                    if (h10.c() || h10.b()) {
                        fVar.d -= StaggeredGridLayoutManager.this.f1701r.c(remove);
                    }
                    if (size == 1) {
                        fVar.f1730b = Integer.MIN_VALUE;
                    }
                    fVar.f1731c = Integer.MIN_VALUE;
                    l0(v10, uVar);
                    w10--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void Z() {
        this.B.a();
        o0();
    }

    public final void Z0(int i10, RecyclerView.u uVar) {
        while (w() > 0) {
            View v10 = v(0);
            if (this.f1701r.b(v10) <= i10 && this.f1701r.m(v10) <= i10) {
                c cVar = (c) v10.getLayoutParams();
                cVar.getClass();
                if (cVar.f1714e.f1729a.size() != 1) {
                    f fVar = cVar.f1714e;
                    ArrayList<View> arrayList = fVar.f1729a;
                    View remove = arrayList.remove(0);
                    c h10 = f.h(remove);
                    h10.f1714e = null;
                    if (arrayList.size() == 0) {
                        fVar.f1731c = Integer.MIN_VALUE;
                    }
                    if (h10.c() || h10.b()) {
                        fVar.d -= StaggeredGridLayoutManager.this.f1701r.c(remove);
                    }
                    fVar.f1730b = Integer.MIN_VALUE;
                    l0(v10, uVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final PointF a(int i10) {
        int D0 = D0(i10);
        PointF pointF = new PointF();
        if (D0 == 0) {
            return null;
        }
        if (this.f1703t == 0) {
            pointF.x = (float) D0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) D0;
        }
        return pointF;
    }

    public final void a0(int i10, int i11) {
        R0(i10, i11, 8);
    }

    public final void a1() {
        this.f1705x = (this.f1703t == 1 || !T0()) ? this.w : !this.w;
    }

    public final void b0(int i10, int i11) {
        R0(i10, i11, 2);
    }

    public final int b1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (w() == 0 || i10 == 0) {
            return 0;
        }
        W0(i10, zVar);
        n nVar = this.f1704v;
        int I0 = I0(uVar, nVar, zVar);
        if (nVar.f1845b >= I0) {
            i10 = i10 < 0 ? -I0 : I0;
        }
        this.f1701r.o(-i10);
        this.D = this.f1705x;
        nVar.f1845b = 0;
        X0(uVar, nVar);
        return i10;
    }

    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    public final void c0(int i10, int i11) {
        R0(i10, i11, 4);
    }

    public final void c1(int i10) {
        n nVar = this.f1704v;
        nVar.f1847e = i10;
        int i11 = 1;
        if (this.f1705x != (i10 == -1)) {
            i11 = -1;
        }
        nVar.d = i11;
    }

    public final boolean d() {
        return this.f1703t == 0;
    }

    public final void d0(RecyclerView.u uVar, RecyclerView.z zVar) {
        U0(uVar, zVar, true);
    }

    public final void d1(int i10, RecyclerView.z zVar) {
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        n nVar = this.f1704v;
        boolean z13 = false;
        nVar.f1845b = 0;
        nVar.f1846c = i10;
        RecyclerView.y yVar = this.f1642e;
        if (yVar == null || !yVar.f1677e) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || (i13 = zVar.f1687a) == -1) {
            i12 = 0;
            i11 = 0;
        } else {
            boolean z14 = this.f1705x;
            if (i13 < i10) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z14 == z12) {
                i12 = this.f1701r.l();
                i11 = 0;
            } else {
                i11 = this.f1701r.l();
                i12 = 0;
            }
        }
        RecyclerView recyclerView = this.f1640b;
        if (recyclerView == null || !recyclerView.u) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            nVar.f1848f = this.f1701r.k() - i11;
            nVar.f1849g = this.f1701r.g() + i12;
        } else {
            nVar.f1849g = this.f1701r.f() + i12;
            nVar.f1848f = -i11;
        }
        nVar.f1850h = false;
        nVar.f1844a = true;
        if (this.f1701r.i() == 0 && this.f1701r.f() == 0) {
            z13 = true;
        }
        nVar.f1851i = z13;
    }

    public final boolean e() {
        return this.f1703t == 1;
    }

    public final void e0(RecyclerView.z zVar) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void e1(f fVar, int i10, int i11) {
        int i12 = fVar.d;
        if (i10 == -1) {
            int i13 = fVar.f1730b;
            if (i13 == Integer.MIN_VALUE) {
                View view = fVar.f1729a.get(0);
                c h10 = f.h(view);
                fVar.f1730b = StaggeredGridLayoutManager.this.f1701r.e(view);
                h10.getClass();
                i13 = fVar.f1730b;
            }
            if (i13 + i12 > i11) {
                return;
            }
        } else {
            int i14 = fVar.f1731c;
            if (i14 == Integer.MIN_VALUE) {
                fVar.a();
                i14 = fVar.f1731c;
            }
            if (i14 - i12 < i11) {
                return;
            }
        }
        this.f1706y.set(fVar.f1732e, false);
    }

    public final boolean f(RecyclerView.o oVar) {
        return oVar instanceof c;
    }

    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.F = eVar;
            if (this.z != -1) {
                eVar.f1724r = null;
                eVar.f1723q = 0;
                eVar.f1721o = -1;
                eVar.f1722p = -1;
                eVar.f1724r = null;
                eVar.f1723q = 0;
                eVar.f1725s = 0;
                eVar.f1726t = null;
                eVar.u = null;
            }
            o0();
        }
    }

    public final Parcelable g0() {
        int i10;
        View view;
        int i11;
        int i12;
        int[] iArr;
        e eVar = this.F;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.f1727v = this.w;
        eVar2.w = this.D;
        eVar2.f1728x = this.E;
        d dVar = this.B;
        if (dVar == null || (iArr = dVar.f1715a) == null) {
            eVar2.f1725s = 0;
        } else {
            eVar2.f1726t = iArr;
            eVar2.f1725s = iArr.length;
            eVar2.u = dVar.f1716b;
        }
        int i13 = -1;
        if (w() > 0) {
            if (this.D) {
                i10 = O0();
            } else {
                i10 = N0();
            }
            eVar2.f1721o = i10;
            if (this.f1705x) {
                view = J0(true);
            } else {
                view = K0(true);
            }
            if (view != null) {
                i13 = RecyclerView.n.G(view);
            }
            eVar2.f1722p = i13;
            int i14 = this.f1699p;
            eVar2.f1723q = i14;
            eVar2.f1724r = new int[i14];
            for (int i15 = 0; i15 < this.f1699p; i15++) {
                if (this.D) {
                    i11 = this.f1700q[i15].f(Integer.MIN_VALUE);
                    if (i11 != Integer.MIN_VALUE) {
                        i12 = this.f1701r.g();
                    } else {
                        eVar2.f1724r[i15] = i11;
                    }
                } else {
                    i11 = this.f1700q[i15].i(Integer.MIN_VALUE);
                    if (i11 != Integer.MIN_VALUE) {
                        i12 = this.f1701r.k();
                    } else {
                        eVar2.f1724r[i15] = i11;
                    }
                }
                i11 -= i12;
                eVar2.f1724r[i15] = i11;
            }
        } else {
            eVar2.f1721o = -1;
            eVar2.f1722p = -1;
            eVar2.f1723q = 0;
        }
        return eVar2;
    }

    public final void h(int i10, int i11, RecyclerView.z zVar, RecyclerView.n.c cVar) {
        n nVar;
        boolean z10;
        int i12;
        int i13;
        if (this.f1703t != 0) {
            i10 = i11;
        }
        if (w() != 0 && i10 != 0) {
            W0(i10, zVar);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f1699p) {
                this.J = new int[this.f1699p];
            }
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = this.f1699p;
                nVar = this.f1704v;
                if (i14 >= i16) {
                    break;
                }
                if (nVar.d == -1) {
                    i13 = nVar.f1848f;
                    i12 = this.f1700q[i14].i(i13);
                } else {
                    i13 = this.f1700q[i14].f(nVar.f1849g);
                    i12 = nVar.f1849g;
                }
                int i17 = i13 - i12;
                if (i17 >= 0) {
                    this.J[i15] = i17;
                    i15++;
                }
                i14++;
            }
            Arrays.sort(this.J, 0, i15);
            int i18 = 0;
            while (i18 < i15) {
                int i19 = nVar.f1846c;
                if (i19 < 0 || i19 >= zVar.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    ((m.b) cVar).a(nVar.f1846c, this.J[i18]);
                    nVar.f1846c += nVar.d;
                    i18++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h0(int i10) {
        if (i10 == 0) {
            E0();
        }
    }

    public final int j(RecyclerView.z zVar) {
        return F0(zVar);
    }

    public final int k(RecyclerView.z zVar) {
        return G0(zVar);
    }

    public final int l(RecyclerView.z zVar) {
        return H0(zVar);
    }

    public final int m(RecyclerView.z zVar) {
        return F0(zVar);
    }

    public final int n(RecyclerView.z zVar) {
        return G0(zVar);
    }

    public final int o(RecyclerView.z zVar) {
        return H0(zVar);
    }

    public final int p0(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        return b1(i10, uVar, zVar);
    }

    public final void q0(int i10) {
        e eVar = this.F;
        if (!(eVar == null || eVar.f1721o == i10)) {
            eVar.f1724r = null;
            eVar.f1723q = 0;
            eVar.f1721o = -1;
            eVar.f1722p = -1;
        }
        this.z = i10;
        this.A = Integer.MIN_VALUE;
        o0();
    }

    public final RecyclerView.o r() {
        return this.f1703t == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public final int r0(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        return b1(i10, uVar, zVar);
    }

    public final RecyclerView.o s(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public final RecyclerView.o t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void u0(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        int E2 = E() + D();
        int C2 = C() + F();
        if (this.f1703t == 1) {
            int height = rect.height() + C2;
            RecyclerView recyclerView = this.f1640b;
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            i13 = RecyclerView.n.g(i11, height, w.d.d(recyclerView));
            i12 = RecyclerView.n.g(i10, (this.u * this.f1699p) + E2, w.d.e(this.f1640b));
        } else {
            int width = rect.width() + E2;
            RecyclerView recyclerView2 = this.f1640b;
            WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
            i12 = RecyclerView.n.g(i10, width, w.d.e(recyclerView2));
            i13 = RecyclerView.n.g(i11, (this.u * this.f1699p) + C2, w.d.d(this.f1640b));
        }
        this.f1640b.setMeasuredDimension(i12, i13);
    }
}
