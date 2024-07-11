package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.widget.x0;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.x;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import i0.w;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

public class RecyclerView extends ViewGroup implements i0.j {
    public static final int[] O0 = {16843830};
    public static final Class<?>[] P0;
    public static final c Q0 = new c();
    public n A;
    public final l A0;
    public v B;
    public boolean B0;
    public final ArrayList C;
    public x C0;
    public final ArrayList<m> D;
    public final int[] D0;
    public final ArrayList<r> E;
    public i0.k E0;
    public r F;
    public final int[] F0;
    public boolean G;
    public final int[] G0;
    public boolean H;
    public final int[] H0;
    public boolean I;
    public final ArrayList I0;
    public int J;
    public final b J0;
    public boolean K;
    public boolean K0;
    public boolean L;
    public int L0;
    public boolean M;
    public int M0;
    public int N;
    public final d N0;
    public boolean O;
    public final AccessibilityManager P;
    public ArrayList Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public j V;
    public EdgeEffect W;

    /* renamed from: a0  reason: collision with root package name */
    public EdgeEffect f1568a0;

    /* renamed from: b0  reason: collision with root package name */
    public EdgeEffect f1569b0;

    /* renamed from: c0  reason: collision with root package name */
    public EdgeEffect f1570c0;

    /* renamed from: d0  reason: collision with root package name */
    public k f1571d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f1572e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f1573f0;

    /* renamed from: g0  reason: collision with root package name */
    public VelocityTracker f1574g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f1575h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1576i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f1577j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f1578k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f1579l0;

    /* renamed from: m0  reason: collision with root package name */
    public q f1580m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f1581n0;

    /* renamed from: o  reason: collision with root package name */
    public final w f1582o;

    /* renamed from: o0  reason: collision with root package name */
    public final int f1583o0;

    /* renamed from: p  reason: collision with root package name */
    public final u f1584p;

    /* renamed from: p0  reason: collision with root package name */
    public final float f1585p0;

    /* renamed from: q  reason: collision with root package name */
    public x f1586q;

    /* renamed from: q0  reason: collision with root package name */
    public final float f1587q0;

    /* renamed from: r  reason: collision with root package name */
    public a f1588r;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f1589r0;

    /* renamed from: s  reason: collision with root package name */
    public b f1590s;

    /* renamed from: s0  reason: collision with root package name */
    public final b0 f1591s0;

    /* renamed from: t  reason: collision with root package name */
    public final c0 f1592t;
    public m t0;
    public boolean u;

    /* renamed from: u0  reason: collision with root package name */
    public final m.b f1593u0;

    /* renamed from: v  reason: collision with root package name */
    public final a f1594v;

    /* renamed from: v0  reason: collision with root package name */
    public final z f1595v0;
    public final Rect w;

    /* renamed from: w0  reason: collision with root package name */
    public s f1596w0;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f1597x;
    public ArrayList x0;

    /* renamed from: y  reason: collision with root package name */
    public final RectF f1598y;
    public boolean y0;
    public f z;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f1599z0;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.I && !recyclerView.isLayoutRequested()) {
                if (!recyclerView.G) {
                    recyclerView.requestLayout();
                } else if (recyclerView.L) {
                    recyclerView.K = true;
                } else {
                    recyclerView.m();
                }
            }
        }
    }

    public static abstract class a0 {
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            long j8;
            long j10;
            RecyclerView recyclerView = RecyclerView.this;
            k kVar = recyclerView.f1571d0;
            if (kVar != null) {
                k kVar2 = (k) kVar;
                ArrayList<c0> arrayList = kVar2.f1786h;
                boolean z = !arrayList.isEmpty();
                ArrayList<k.b> arrayList2 = kVar2.f1788j;
                boolean z10 = !arrayList2.isEmpty();
                ArrayList<k.a> arrayList3 = kVar2.f1789k;
                boolean z11 = !arrayList3.isEmpty();
                ArrayList<c0> arrayList4 = kVar2.f1787i;
                boolean z12 = !arrayList4.isEmpty();
                if (z || z10 || z12 || z11) {
                    Iterator<c0> it = arrayList.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        j8 = kVar2.d;
                        if (!hasNext) {
                            break;
                        }
                        c0 next = it.next();
                        View view = next.f1609a;
                        ViewPropertyAnimator animate = view.animate();
                        kVar2.f1794q.add(next);
                        animate.setDuration(j8).alpha(0.0f).setListener(new f(view, animate, kVar2, next)).start();
                        it = it;
                    }
                    arrayList.clear();
                    if (z10) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        kVar2.f1790m.add(arrayList5);
                        arrayList2.clear();
                        c cVar = new c(kVar2, arrayList5);
                        if (z) {
                            View view2 = ((k.b) arrayList5.get(0)).f1801a.f1609a;
                            WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
                            w.d.n(view2, cVar, j8);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z11) {
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.addAll(arrayList3);
                        kVar2.f1791n.add(arrayList6);
                        arrayList3.clear();
                        d dVar = new d(kVar2, arrayList6);
                        if (z) {
                            View view3 = ((k.a) arrayList6.get(0)).f1796a.f1609a;
                            WeakHashMap<View, i0.b0> weakHashMap2 = i0.w.f6004a;
                            w.d.n(view3, dVar, j8);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z12) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList4);
                        kVar2.l.add(arrayList7);
                        arrayList4.clear();
                        e eVar = new e(kVar2, arrayList7);
                        if (z || z10 || z11) {
                            long j11 = 0;
                            if (!z) {
                                j8 = 0;
                            }
                            if (z10) {
                                j10 = kVar2.f1634e;
                            } else {
                                j10 = 0;
                            }
                            if (z11) {
                                j11 = kVar2.f1635f;
                            }
                            View view4 = ((c0) arrayList7.get(0)).f1609a;
                            WeakHashMap<View, i0.b0> weakHashMap3 = i0.w.f6004a;
                            w.d.n(view4, eVar, Math.max(j10, j11) + j8);
                        } else {
                            eVar.run();
                        }
                    }
                }
            }
            recyclerView.B0 = false;
        }
    }

    public class b0 implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public int f1602o;

        /* renamed from: p  reason: collision with root package name */
        public int f1603p;

        /* renamed from: q  reason: collision with root package name */
        public OverScroller f1604q;

        /* renamed from: r  reason: collision with root package name */
        public Interpolator f1605r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f1606s = false;

        /* renamed from: t  reason: collision with root package name */
        public boolean f1607t = false;

        public b0() {
            c cVar = RecyclerView.Q0;
            this.f1605r = cVar;
            this.f1604q = new OverScroller(RecyclerView.this.getContext(), cVar);
        }

        public final void a() {
            if (this.f1606s) {
                this.f1607t = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
            w.d.m(recyclerView, this);
        }

        public final void b(int i10, int i11, int i12, Interpolator interpolator) {
            boolean z;
            int i13;
            RecyclerView recyclerView = RecyclerView.this;
            if (i12 == Integer.MIN_VALUE) {
                int abs = Math.abs(i10);
                int abs2 = Math.abs(i11);
                if (abs > abs2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i13 = recyclerView.getWidth();
                } else {
                    i13 = recyclerView.getHeight();
                }
                if (!z) {
                    abs = abs2;
                }
                i12 = Math.min((int) (((((float) abs) / ((float) i13)) + 1.0f) * 300.0f), 2000);
            }
            int i14 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.Q0;
            }
            if (this.f1605r != interpolator) {
                this.f1605r = interpolator;
                this.f1604q = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f1603p = 0;
            this.f1602o = 0;
            recyclerView.setScrollState(2);
            this.f1604q.startScroll(0, 0, i10, i11, i14);
            a();
        }

        public final void run() {
            int i10;
            int i11;
            int i12;
            int i13;
            boolean z;
            boolean z10;
            boolean z11;
            boolean z12;
            int i14;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.A == null) {
                recyclerView.removeCallbacks(this);
                this.f1604q.abortAnimation();
                return;
            }
            this.f1607t = false;
            this.f1606s = true;
            recyclerView.m();
            OverScroller overScroller = this.f1604q;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i15 = currX - this.f1602o;
                int i16 = currY - this.f1603p;
                this.f1602o = currX;
                this.f1603p = currY;
                int[] iArr = recyclerView.H0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean s10 = recyclerView.s(i15, i16, iArr, (int[]) null, 1);
                int[] iArr2 = recyclerView.H0;
                if (s10) {
                    i15 -= iArr2[0];
                    i16 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.l(i15, i16);
                }
                if (recyclerView.z != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.Z(i15, i16, iArr2);
                    int i17 = iArr2[0];
                    int i18 = iArr2[1];
                    int i19 = i15 - i17;
                    int i20 = i16 - i18;
                    y yVar = recyclerView.A.f1642e;
                    if (yVar != null && !yVar.d && yVar.f1677e) {
                        int b10 = recyclerView.f1595v0.b();
                        if (b10 == 0) {
                            yVar.d();
                        } else {
                            if (yVar.f1674a >= b10) {
                                yVar.f1674a = b10 - 1;
                            }
                            yVar.b(i17, i18);
                        }
                    }
                    i12 = i17;
                    i11 = i19;
                    i10 = i20;
                    i13 = i18;
                } else {
                    i11 = i15;
                    i10 = i16;
                    i13 = 0;
                    i12 = 0;
                }
                if (!recyclerView.D.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.H0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i21 = i13;
                recyclerView.t(i12, i13, i11, i10, (int[]) null, 1, iArr3);
                int i22 = i11 - iArr2[0];
                int i23 = i10 - iArr2[1];
                if (!(i12 == 0 && i21 == 0)) {
                    recyclerView.u(i12, i21);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (overScroller.isFinished() || ((z || i22 != 0) && (z10 || i23 != 0))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                y yVar2 = recyclerView.A.f1642e;
                if (yVar2 == null || !yVar2.d) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 || !z11) {
                    a();
                    m mVar = recyclerView.t0;
                    if (mVar != null) {
                        mVar.a(recyclerView, i12, i21);
                    }
                } else {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i22 < 0) {
                            i14 = -currVelocity;
                        } else if (i22 > 0) {
                            i14 = currVelocity;
                        } else {
                            i14 = 0;
                        }
                        if (i23 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i23 <= 0) {
                            currVelocity = 0;
                        }
                        if (i14 < 0) {
                            recyclerView.w();
                            if (recyclerView.W.isFinished()) {
                                recyclerView.W.onAbsorb(-i14);
                            }
                        } else if (i14 > 0) {
                            recyclerView.x();
                            if (recyclerView.f1569b0.isFinished()) {
                                recyclerView.f1569b0.onAbsorb(i14);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.y();
                            if (recyclerView.f1568a0.isFinished()) {
                                recyclerView.f1568a0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.v();
                            if (recyclerView.f1570c0.isFinished()) {
                                recyclerView.f1570c0.onAbsorb(currVelocity);
                            }
                        }
                        if (!(i14 == 0 && currVelocity == 0)) {
                            WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
                            w.d.k(recyclerView);
                        }
                    }
                    m.b bVar = recyclerView.f1593u0;
                    int[] iArr4 = bVar.f1839c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    bVar.d = 0;
                }
            }
            y yVar3 = recyclerView.A.f1642e;
            if (yVar3 != null && yVar3.d) {
                yVar3.b(0, 0);
            }
            this.f1606s = false;
            if (this.f1607t) {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, i0.b0> weakHashMap2 = i0.w.f6004a;
                w.d.m(recyclerView, this);
                return;
            }
            recyclerView.setScrollState(0);
            recyclerView.f0(1);
        }
    }

    public class c implements Interpolator {
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public static abstract class c0 {

        /* renamed from: t  reason: collision with root package name */
        public static final List<Object> f1608t = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f1609a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<RecyclerView> f1610b;

        /* renamed from: c  reason: collision with root package name */
        public int f1611c = -1;
        public int d = -1;

        /* renamed from: e  reason: collision with root package name */
        public long f1612e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1613f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1614g = -1;

        /* renamed from: h  reason: collision with root package name */
        public c0 f1615h = null;

        /* renamed from: i  reason: collision with root package name */
        public c0 f1616i = null;

        /* renamed from: j  reason: collision with root package name */
        public int f1617j;

        /* renamed from: k  reason: collision with root package name */
        public ArrayList f1618k = null;
        public List<Object> l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f1619m = 0;

        /* renamed from: n  reason: collision with root package name */
        public u f1620n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1621o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f1622p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f1623q = -1;

        /* renamed from: r  reason: collision with root package name */
        public RecyclerView f1624r;

        /* renamed from: s  reason: collision with root package name */
        public f<? extends c0> f1625s;

        public c0(View view) {
            if (view != null) {
                this.f1609a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public final void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f1617j) == 0) {
                if (this.f1618k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f1618k = arrayList;
                    this.l = Collections.unmodifiableList(arrayList);
                }
                this.f1618k.add(obj);
            }
        }

        public final void b(int i10) {
            this.f1617j = i10 | this.f1617j;
        }

        public final int c() {
            int i10 = this.f1614g;
            return i10 == -1 ? this.f1611c : i10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f1618k;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<java.lang.Object> d() {
            /*
                r1 = this;
                int r0 = r1.f1617j
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 != 0) goto L_0x0014
                java.util.ArrayList r0 = r1.f1618k
                if (r0 == 0) goto L_0x0014
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0011
                goto L_0x0014
            L_0x0011:
                java.util.List<java.lang.Object> r0 = r1.l
                return r0
            L_0x0014:
                java.util.List<java.lang.Object> r0 = f1608t
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c0.d():java.util.List");
        }

        public final boolean e() {
            View view = this.f1609a;
            return (view.getParent() == null || view.getParent() == this.f1624r) ? false : true;
        }

        public final boolean f() {
            return (this.f1617j & 1) != 0;
        }

        public final boolean g() {
            return (this.f1617j & 4) != 0;
        }

        public final boolean h() {
            if ((this.f1617j & 16) == 0) {
                WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
                if (!w.d.i(this.f1609a)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean i() {
            return (this.f1617j & 8) != 0;
        }

        public final boolean j() {
            return this.f1620n != null;
        }

        public final boolean k() {
            return (this.f1617j & 256) != 0;
        }

        public final void l(int i10, boolean z) {
            if (this.d == -1) {
                this.d = this.f1611c;
            }
            if (this.f1614g == -1) {
                this.f1614g = this.f1611c;
            }
            if (z) {
                this.f1614g += i10;
            }
            this.f1611c += i10;
            View view = this.f1609a;
            if (view.getLayoutParams() != null) {
                ((o) view.getLayoutParams()).f1659c = true;
            }
        }

        public final void m() {
            this.f1617j = 0;
            this.f1611c = -1;
            this.d = -1;
            this.f1612e = -1;
            this.f1614g = -1;
            this.f1619m = 0;
            this.f1615h = null;
            this.f1616i = null;
            ArrayList arrayList = this.f1618k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f1617j &= -1025;
            this.f1622p = 0;
            this.f1623q = -1;
            RecyclerView.j(this);
        }

        public final void n(boolean z) {
            int i10;
            int i11 = this.f1619m;
            int i12 = z ? i11 - 1 : i11 + 1;
            this.f1619m = i12;
            if (i12 < 0) {
                this.f1619m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i12 == 1) {
                i10 = this.f1617j | 16;
            } else if (z && i12 == 0) {
                i10 = this.f1617j & -17;
            } else {
                return;
            }
            this.f1617j = i10;
        }

        public final boolean o() {
            return (this.f1617j & 128) != 0;
        }

        public final boolean p() {
            return (this.f1617j & 32) != 0;
        }

        public final String toString() {
            String str;
            boolean z;
            String str2;
            if (getClass().isAnonymousClass()) {
                str = "ViewHolder";
            } else {
                str = getClass().getSimpleName();
            }
            StringBuilder h10 = x0.h(str, "{");
            h10.append(Integer.toHexString(hashCode()));
            h10.append(" position=");
            h10.append(this.f1611c);
            h10.append(" id=");
            h10.append(this.f1612e);
            h10.append(", oldPos=");
            h10.append(this.d);
            h10.append(", pLpos:");
            h10.append(this.f1614g);
            StringBuilder sb = new StringBuilder(h10.toString());
            if (j()) {
                sb.append(" scrap ");
                if (this.f1621o) {
                    str2 = "[changeScrap]";
                } else {
                    str2 = "[attachedScrap]";
                }
                sb.append(str2);
            }
            if (g()) {
                sb.append(" invalid");
            }
            if (!f()) {
                sb.append(" unbound");
            }
            boolean z10 = true;
            if ((this.f1617j & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb.append(" update");
            }
            if (i()) {
                sb.append(" removed");
            }
            if (o()) {
                sb.append(" ignored");
            }
            if (k()) {
                sb.append(" tmpDetached");
            }
            if (!h()) {
                sb.append(" not recyclable(" + this.f1619m + ")");
            }
            if ((this.f1617j & 512) == 0 && !g()) {
                z10 = false;
            }
            if (z10) {
                sb.append(" undefined adapter position");
            }
            if (this.f1609a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public class d {
        public d() {
        }
    }

    public static /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1627a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$f$a[] r0 = androidx.recyclerview.widget.RecyclerView.f.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1627a = r0
                androidx.recyclerview.widget.RecyclerView$f$a r1 = androidx.recyclerview.widget.RecyclerView.f.a.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1627a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$f$a r1 = androidx.recyclerview.widget.RecyclerView.f.a.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.e.<clinit>():void");
        }
    }

    public static abstract class f<VH extends c0> {

        /* renamed from: a  reason: collision with root package name */
        public final g f1628a = new g();

        /* renamed from: b  reason: collision with root package name */
        public boolean f1629b = false;

        /* renamed from: c  reason: collision with root package name */
        public final a f1630c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public abstract int a();

        public long b(int i10) {
            return -1;
        }

        public final void c(int i10) {
            this.f1628a.c(i10);
        }

        public abstract void d(VH vh, int i10);

        public abstract c0 e(RecyclerView recyclerView);
    }

    public static class g extends Observable<h> {
        public final boolean a() {
            return !this.mObservers.isEmpty();
        }

        public final void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((h) this.mObservers.get(size)).a();
            }
        }

        public final void c(int i10) {
            int size = this.mObservers.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((h) this.mObservers.get(size)).c(i10);
                } else {
                    return;
                }
            }
        }
    }

    public static abstract class h {
        public void a() {
        }

        public void b() {
        }

        public void c(int i10) {
            b();
        }
    }

    public interface i {
    }

    public static class j {
    }

    public static abstract class k {

        /* renamed from: a  reason: collision with root package name */
        public b f1631a = null;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<a> f1632b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public final long f1633c = 120;
        public final long d = 120;

        /* renamed from: e  reason: collision with root package name */
        public final long f1634e = 250;

        /* renamed from: f  reason: collision with root package name */
        public final long f1635f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f1636a;

            /* renamed from: b  reason: collision with root package name */
            public int f1637b;

            public final void a(c0 c0Var) {
                View view = c0Var.f1609a;
                this.f1636a = view.getLeft();
                this.f1637b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void b(c0 c0Var) {
            RecyclerView recyclerView;
            int i10 = c0Var.f1617j & 14;
            if (!c0Var.g() && (i10 & 4) == 0 && (recyclerView = c0Var.f1624r) != null) {
                recyclerView.G(c0Var);
            }
        }

        public abstract boolean a(c0 c0Var, c0 c0Var2, c cVar, c cVar2);

        public final void c(c0 c0Var) {
            boolean z;
            b bVar = this.f1631a;
            if (bVar != null) {
                l lVar = (l) bVar;
                boolean z10 = true;
                c0Var.n(true);
                if (c0Var.f1615h != null && c0Var.f1616i == null) {
                    c0Var.f1615h = null;
                }
                c0Var.f1616i = null;
                if ((c0Var.f1617j & 16) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.d0();
                    b bVar2 = recyclerView.f1590s;
                    v vVar = (v) bVar2.f1746a;
                    RecyclerView recyclerView2 = vVar.f1865a;
                    View view = c0Var.f1609a;
                    int indexOfChild = recyclerView2.indexOfChild(view);
                    if (indexOfChild == -1) {
                        bVar2.k(view);
                    } else {
                        b.a aVar = bVar2.f1747b;
                        if (aVar.d(indexOfChild)) {
                            aVar.f(indexOfChild);
                            bVar2.k(view);
                            vVar.b(indexOfChild);
                        } else {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        c0 J = RecyclerView.J(view);
                        u uVar = recyclerView.f1584p;
                        uVar.j(J);
                        uVar.g(J);
                    }
                    recyclerView.e0(!z10);
                    if (!z10 && c0Var.k()) {
                        recyclerView.removeDetachedView(view, false);
                    }
                }
            }
        }

        public abstract void d(c0 c0Var);

        public abstract void e();

        public abstract boolean f();
    }

    public class l implements k.b {
        public l() {
        }
    }

    public static abstract class m {
        public void d(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            ((o) view.getLayoutParams()).a();
            rect.set(0, 0, 0, 0);
        }

        public void e(Canvas canvas, RecyclerView recyclerView) {
        }

        public void f(Canvas canvas) {
        }
    }

    public static abstract class n {

        /* renamed from: a  reason: collision with root package name */
        public b f1639a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f1640b;

        /* renamed from: c  reason: collision with root package name */
        public final b0 f1641c;
        public final b0 d;

        /* renamed from: e  reason: collision with root package name */
        public y f1642e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1643f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1644g = false;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f1645h = true;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f1646i = true;

        /* renamed from: j  reason: collision with root package name */
        public int f1647j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1648k;
        public int l;

        /* renamed from: m  reason: collision with root package name */
        public int f1649m;

        /* renamed from: n  reason: collision with root package name */
        public int f1650n;

        /* renamed from: o  reason: collision with root package name */
        public int f1651o;

        public class a implements b0.b {
            public a() {
            }

            public final int a() {
                n nVar = n.this;
                return nVar.f1650n - nVar.E();
            }

            public final int b(View view) {
                n.this.getClass();
                return (view.getLeft() - n.B(view)) - ((o) view.getLayoutParams()).leftMargin;
            }

            public final View c(int i10) {
                return n.this.v(i10);
            }

            public final int d() {
                return n.this.D();
            }

            public final int e(View view) {
                n.this.getClass();
                return n.I(view) + view.getRight() + ((o) view.getLayoutParams()).rightMargin;
            }
        }

        public class b implements b0.b {
            public b() {
            }

            public final int a() {
                n nVar = n.this;
                return nVar.f1651o - nVar.C();
            }

            public final int b(View view) {
                n.this.getClass();
                return (view.getTop() - n.K(view)) - ((o) view.getLayoutParams()).topMargin;
            }

            public final View c(int i10) {
                return n.this.v(i10);
            }

            public final int d() {
                return n.this.F();
            }

            public final int e(View view) {
                n.this.getClass();
                return n.u(view) + view.getBottom() + ((o) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f1654a;

            /* renamed from: b  reason: collision with root package name */
            public int f1655b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f1656c;
            public boolean d;
        }

        public n() {
            a aVar = new a();
            b bVar = new b();
            this.f1641c = new b0(aVar);
            this.d = new b0(bVar);
        }

        public static int B(View view) {
            return ((o) view.getLayoutParams()).f1658b.left;
        }

        public static int G(View view) {
            return ((o) view.getLayoutParams()).a();
        }

        public static d H(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.e.G, i10, i11);
            dVar.f1654a = obtainStyledAttributes.getInt(0, 1);
            dVar.f1655b = obtainStyledAttributes.getInt(10, 1);
            dVar.f1656c = obtainStyledAttributes.getBoolean(9, false);
            dVar.d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int I(View view) {
            return ((o) view.getLayoutParams()).f1658b.right;
        }

        public static int K(View view) {
            return ((o) view.getLayoutParams()).f1658b.top;
        }

        public static boolean N(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        public static void O(View view, int i10, int i11, int i12, int i13) {
            o oVar = (o) view.getLayoutParams();
            Rect rect = oVar.f1658b;
            view.layout(i10 + rect.left + oVar.leftMargin, i11 + rect.top + oVar.topMargin, (i12 - rect.right) - oVar.rightMargin, (i13 - rect.bottom) - oVar.bottomMargin);
        }

        public static int g(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        public static int u(View view) {
            return ((o) view.getLayoutParams()).f1658b.bottom;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r6 == 1073741824) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int x(boolean r4, int r5, int r6, int r7, int r8) {
            /*
                int r5 = r5 - r7
                r7 = 0
                int r5 = java.lang.Math.max(r7, r5)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x001a
                if (r8 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r8 != r1) goto L_0x002f
                if (r6 == r2) goto L_0x0020
                if (r6 == 0) goto L_0x002f
                if (r6 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r8 < 0) goto L_0x001e
            L_0x001c:
                r6 = r3
                goto L_0x0031
            L_0x001e:
                if (r8 != r1) goto L_0x0022
            L_0x0020:
                r8 = r5
                goto L_0x0031
            L_0x0022:
                if (r8 != r0) goto L_0x002f
                if (r6 == r2) goto L_0x002c
                if (r6 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r8 = r5
                r6 = r7
                goto L_0x0031
            L_0x002c:
                r8 = r5
                r6 = r2
                goto L_0x0031
            L_0x002f:
                r6 = r7
                r8 = r6
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.x(boolean, int, int, int, int):int");
        }

        public static void z(View view, Rect rect) {
            int[] iArr = RecyclerView.O0;
            o oVar = (o) view.getLayoutParams();
            Rect rect2 = oVar.f1658b;
            rect.set((view.getLeft() - rect2.left) - oVar.leftMargin, (view.getTop() - rect2.top) - oVar.topMargin, view.getRight() + rect2.right + oVar.rightMargin, view.getBottom() + rect2.bottom + oVar.bottomMargin);
        }

        public final int A() {
            RecyclerView recyclerView = this.f1640b;
            WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
            return w.e.d(recyclerView);
        }

        public void A0(RecyclerView recyclerView, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final void B0(o oVar) {
            y yVar = this.f1642e;
            if (!(yVar == null || oVar == yVar || !yVar.f1677e)) {
                yVar.d();
            }
            this.f1642e = oVar;
            RecyclerView recyclerView = this.f1640b;
            b0 b0Var = recyclerView.f1591s0;
            RecyclerView.this.removeCallbacks(b0Var);
            b0Var.f1604q.abortAnimation();
            if (oVar.f1680h) {
                Log.w("RecyclerView", "An instance of " + oVar.getClass().getSimpleName() + " was started more than once. Each instance of" + oVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            oVar.f1675b = recyclerView;
            oVar.f1676c = this;
            int i10 = oVar.f1674a;
            if (i10 != -1) {
                recyclerView.f1595v0.f1687a = i10;
                oVar.f1677e = true;
                oVar.d = true;
                oVar.f1678f = recyclerView.A.q(i10);
                oVar.f1675b.f1591s0.a();
                oVar.f1680h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final int C() {
            RecyclerView recyclerView = this.f1640b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public boolean C0() {
            return false;
        }

        public final int D() {
            RecyclerView recyclerView = this.f1640b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int E() {
            RecyclerView recyclerView = this.f1640b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int F() {
            RecyclerView recyclerView = this.f1640b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int J(u uVar, z zVar) {
            return -1;
        }

        public final void L(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((o) view.getLayoutParams()).f1658b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (!(this.f1640b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f1640b.f1598y;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean M() {
            return false;
        }

        public void P(int i10) {
            RecyclerView recyclerView = this.f1640b;
            if (recyclerView != null) {
                int e10 = recyclerView.f1590s.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f1590s.d(i11).offsetLeftAndRight(i10);
                }
            }
        }

        public void Q(int i10) {
            RecyclerView recyclerView = this.f1640b;
            if (recyclerView != null) {
                int e10 = recyclerView.f1590s.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f1590s.d(i11).offsetTopAndBottom(i10);
                }
            }
        }

        public void R() {
        }

        public void S(RecyclerView recyclerView) {
        }

        public View T(View view, int i10, u uVar, z zVar) {
            return null;
        }

        public void U(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1640b;
            u uVar = recyclerView.f1584p;
            z zVar = recyclerView.f1595v0;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f1640b.canScrollVertically(-1) && !this.f1640b.canScrollHorizontally(-1) && !this.f1640b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                f fVar = this.f1640b.z;
                if (fVar != null) {
                    accessibilityEvent.setItemCount(fVar.a());
                }
            }
        }

        public void V(u uVar, z zVar, j0.b bVar) {
            boolean canScrollVertically = this.f1640b.canScrollVertically(-1);
            AccessibilityNodeInfo accessibilityNodeInfo = bVar.f6386a;
            if (canScrollVertically || this.f1640b.canScrollHorizontally(-1)) {
                bVar.a(8192);
                accessibilityNodeInfo.setScrollable(true);
            }
            if (this.f1640b.canScrollVertically(1) || this.f1640b.canScrollHorizontally(1)) {
                bVar.a(4096);
                accessibilityNodeInfo.setScrollable(true);
            }
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(J(uVar, zVar), y(uVar, zVar), false, 0));
        }

        public final void W(View view, j0.b bVar) {
            c0 J = RecyclerView.J(view);
            if (J != null && !J.i() && !this.f1639a.j(J.f1609a)) {
                RecyclerView recyclerView = this.f1640b;
                X(recyclerView.f1584p, recyclerView.f1595v0, view, bVar);
            }
        }

        public void X(u uVar, z zVar, View view, j0.b bVar) {
        }

        public void Y(int i10, int i11) {
        }

        public void Z() {
        }

        public void a0(int i10, int i11) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(android.view.View r9, int r10, boolean r11) {
            /*
                r8 = this;
                androidx.recyclerview.widget.RecyclerView$c0 r0 = androidx.recyclerview.widget.RecyclerView.J(r9)
                r1 = 0
                r2 = 1
                if (r11 != 0) goto L_0x0017
                boolean r11 = r0.i()
                if (r11 == 0) goto L_0x000f
                goto L_0x0017
            L_0x000f:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f1640b
                androidx.recyclerview.widget.c0 r11 = r11.f1592t
                r11.b(r0)
                goto L_0x0031
            L_0x0017:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f1640b
                androidx.recyclerview.widget.c0 r11 = r11.f1592t
                n.i<androidx.recyclerview.widget.RecyclerView$c0, androidx.recyclerview.widget.c0$a> r11 = r11.f1759a
                java.lang.Object r3 = r11.getOrDefault(r0, r1)
                androidx.recyclerview.widget.c0$a r3 = (androidx.recyclerview.widget.c0.a) r3
                if (r3 != 0) goto L_0x002c
                androidx.recyclerview.widget.c0$a r3 = androidx.recyclerview.widget.c0.a.a()
                r11.put(r0, r3)
            L_0x002c:
                int r11 = r3.f1761a
                r11 = r11 | r2
                r3.f1761a = r11
            L_0x0031:
                android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$o r11 = (androidx.recyclerview.widget.RecyclerView.o) r11
                boolean r3 = r0.p()
                r4 = 0
                if (r3 != 0) goto L_0x012d
                boolean r3 = r0.j()
                if (r3 == 0) goto L_0x0046
                goto L_0x012d
            L_0x0046:
                android.view.ViewParent r3 = r9.getParent()
                androidx.recyclerview.widget.RecyclerView r5 = r8.f1640b
                r6 = -1
                if (r3 != r5) goto L_0x0108
                androidx.recyclerview.widget.b r3 = r8.f1639a
                androidx.recyclerview.widget.b$b r5 = r3.f1746a
                androidx.recyclerview.widget.v r5 = (androidx.recyclerview.widget.v) r5
                androidx.recyclerview.widget.RecyclerView r5 = r5.f1865a
                int r5 = r5.indexOfChild(r9)
                if (r5 != r6) goto L_0x005e
                goto L_0x0066
            L_0x005e:
                androidx.recyclerview.widget.b$a r3 = r3.f1747b
                boolean r7 = r3.d(r5)
                if (r7 == 0) goto L_0x0068
            L_0x0066:
                r5 = r6
                goto L_0x006d
            L_0x0068:
                int r3 = r3.b(r5)
                int r5 = r5 - r3
            L_0x006d:
                if (r10 != r6) goto L_0x0075
                androidx.recyclerview.widget.b r10 = r8.f1639a
                int r10 = r10.e()
            L_0x0075:
                if (r5 == r6) goto L_0x00e5
                if (r5 == r10) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r9 = r8.f1640b
                androidx.recyclerview.widget.RecyclerView$n r9 = r9.A
                android.view.View r3 = r9.v(r5)
                if (r3 == 0) goto L_0x00c8
                r9.v(r5)
                androidx.recyclerview.widget.b r6 = r9.f1639a
                r6.c(r5)
                android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$o r5 = (androidx.recyclerview.widget.RecyclerView.o) r5
                androidx.recyclerview.widget.RecyclerView$c0 r6 = androidx.recyclerview.widget.RecyclerView.J(r3)
                boolean r7 = r6.i()
                if (r7 == 0) goto L_0x00b6
                androidx.recyclerview.widget.RecyclerView r7 = r9.f1640b
                androidx.recyclerview.widget.c0 r7 = r7.f1592t
                n.i<androidx.recyclerview.widget.RecyclerView$c0, androidx.recyclerview.widget.c0$a> r7 = r7.f1759a
                java.lang.Object r1 = r7.getOrDefault(r6, r1)
                androidx.recyclerview.widget.c0$a r1 = (androidx.recyclerview.widget.c0.a) r1
                if (r1 != 0) goto L_0x00b0
                androidx.recyclerview.widget.c0$a r1 = androidx.recyclerview.widget.c0.a.a()
                r7.put(r6, r1)
            L_0x00b0:
                int r7 = r1.f1761a
                r2 = r2 | r7
                r1.f1761a = r2
                goto L_0x00bd
            L_0x00b6:
                androidx.recyclerview.widget.RecyclerView r1 = r9.f1640b
                androidx.recyclerview.widget.c0 r1 = r1.f1592t
                r1.b(r6)
            L_0x00bd:
                androidx.recyclerview.widget.b r9 = r9.f1639a
                boolean r1 = r6.i()
                r9.b(r3, r10, r5, r1)
                goto L_0x0148
            L_0x00c8:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                java.lang.String r0 = "Cannot move a child from non-existing index:"
                r11.<init>(r0)
                r11.append(r5)
                androidx.recyclerview.widget.RecyclerView r9 = r9.f1640b
                java.lang.String r9 = r9.toString()
                r11.append(r9)
                java.lang.String r9 = r11.toString()
                r10.<init>(r9)
                throw r10
            L_0x00e5:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
                r11.<init>(r0)
                androidx.recyclerview.widget.RecyclerView r0 = r8.f1640b
                int r9 = r0.indexOfChild(r9)
                r11.append(r9)
                androidx.recyclerview.widget.RecyclerView r9 = r8.f1640b
                java.lang.String r9 = r9.z()
                r11.append(r9)
                java.lang.String r9 = r11.toString()
                r10.<init>(r9)
                throw r10
            L_0x0108:
                androidx.recyclerview.widget.b r1 = r8.f1639a
                r1.a(r9, r10, r4)
                r11.f1659c = r2
                androidx.recyclerview.widget.RecyclerView$y r10 = r8.f1642e
                if (r10 == 0) goto L_0x0148
                boolean r1 = r10.f1677e
                if (r1 == 0) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r1 = r10.f1675b
                r1.getClass()
                androidx.recyclerview.widget.RecyclerView$c0 r1 = androidx.recyclerview.widget.RecyclerView.J(r9)
                if (r1 == 0) goto L_0x0126
                int r6 = r1.c()
            L_0x0126:
                int r1 = r10.f1674a
                if (r6 != r1) goto L_0x0148
                r10.f1678f = r9
                goto L_0x0148
            L_0x012d:
                boolean r1 = r0.j()
                if (r1 == 0) goto L_0x0139
                androidx.recyclerview.widget.RecyclerView$u r1 = r0.f1620n
                r1.j(r0)
                goto L_0x013f
            L_0x0139:
                int r1 = r0.f1617j
                r1 = r1 & -33
                r0.f1617j = r1
            L_0x013f:
                androidx.recyclerview.widget.b r1 = r8.f1639a
                android.view.ViewGroup$LayoutParams r2 = r9.getLayoutParams()
                r1.b(r9, r10, r2, r4)
            L_0x0148:
                boolean r9 = r11.d
                if (r9 == 0) goto L_0x0153
                android.view.View r9 = r0.f1609a
                r9.invalidate()
                r11.d = r4
            L_0x0153:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.b(android.view.View, int, boolean):void");
        }

        public void b0(int i10, int i11) {
        }

        public void c(String str) {
            RecyclerView recyclerView = this.f1640b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        public void c0(int i10, int i11) {
        }

        public boolean d() {
            return false;
        }

        public void d0(u uVar, z zVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public boolean e() {
            return false;
        }

        public void e0(z zVar) {
        }

        public boolean f(o oVar) {
            return oVar != null;
        }

        public void f0(Parcelable parcelable) {
        }

        public Parcelable g0() {
            return null;
        }

        public void h(int i10, int i11, z zVar, c cVar) {
        }

        public void h0(int i10) {
        }

        public void i(int i10, c cVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x006a A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean i0(androidx.recyclerview.widget.RecyclerView.u r2, androidx.recyclerview.widget.RecyclerView.z r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.f1640b
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x003e
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = r3
                r4 = r2
                goto L_0x0068
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0027
                int r2 = r1.f1651o
                int r5 = r1.F()
                int r2 = r2 - r5
                int r5 = r1.C()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x0028
            L_0x0027:
                r2 = r3
            L_0x0028:
                androidx.recyclerview.widget.RecyclerView r5 = r1.f1640b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0067
                int r4 = r1.f1650n
                int r5 = r1.D()
                int r4 = r4 - r5
                int r5 = r1.E()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x0068
            L_0x003e:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0051
                int r2 = r1.f1651o
                int r4 = r1.F()
                int r2 = r2 - r4
                int r4 = r1.C()
                int r2 = r2 - r4
                goto L_0x0052
            L_0x0051:
                r2 = r3
            L_0x0052:
                androidx.recyclerview.widget.RecyclerView r4 = r1.f1640b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x0067
                int r4 = r1.f1650n
                int r5 = r1.D()
                int r4 = r4 - r5
                int r5 = r1.E()
                int r4 = r4 - r5
                goto L_0x0068
            L_0x0067:
                r4 = r3
            L_0x0068:
                if (r2 != 0) goto L_0x006d
                if (r4 != 0) goto L_0x006d
                return r3
            L_0x006d:
                androidx.recyclerview.widget.RecyclerView r3 = r1.f1640b
                r3.b0(r4, r2, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.i0(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, int, android.os.Bundle):boolean");
        }

        public int j(z zVar) {
            return 0;
        }

        public final void j0(u uVar) {
            int w = w();
            while (true) {
                w--;
                if (w < 0) {
                    return;
                }
                if (!RecyclerView.J(v(w)).o()) {
                    View v10 = v(w);
                    m0(w);
                    uVar.f(v10);
                }
            }
        }

        public int k(z zVar) {
            return 0;
        }

        public final void k0(u uVar) {
            ArrayList<c0> arrayList;
            int size = uVar.f1665a.size();
            int i10 = size - 1;
            while (true) {
                arrayList = uVar.f1665a;
                if (i10 < 0) {
                    break;
                }
                View view = arrayList.get(i10).f1609a;
                c0 J = RecyclerView.J(view);
                if (!J.o()) {
                    J.n(false);
                    if (J.k()) {
                        this.f1640b.removeDetachedView(view, false);
                    }
                    k kVar = this.f1640b.f1571d0;
                    if (kVar != null) {
                        kVar.d(J);
                    }
                    J.n(true);
                    c0 J2 = RecyclerView.J(view);
                    J2.f1620n = null;
                    J2.f1621o = false;
                    J2.f1617j &= -33;
                    uVar.g(J2);
                }
                i10--;
            }
            arrayList.clear();
            ArrayList<c0> arrayList2 = uVar.f1666b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f1640b.invalidate();
            }
        }

        public int l(z zVar) {
            return 0;
        }

        public final void l0(View view, u uVar) {
            b bVar = this.f1639a;
            v vVar = (v) bVar.f1746a;
            int indexOfChild = vVar.f1865a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.f1747b.f(indexOfChild)) {
                    bVar.k(view);
                }
                vVar.b(indexOfChild);
            }
            uVar.f(view);
        }

        public int m(z zVar) {
            return 0;
        }

        public final void m0(int i10) {
            if (v(i10) != null) {
                b bVar = this.f1639a;
                int f10 = bVar.f(i10);
                v vVar = (v) bVar.f1746a;
                View childAt = vVar.f1865a.getChildAt(f10);
                if (childAt != null) {
                    if (bVar.f1747b.f(f10)) {
                        bVar.k(childAt);
                    }
                    vVar.b(f10);
                }
            }
        }

        public int n(z zVar) {
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
            if (r10 == false) goto L_0x00b0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean n0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.D()
                int r1 = r8.F()
                int r2 = r8.f1650n
                int r3 = r8.E()
                int r2 = r2 - r3
                int r3 = r8.f1651o
                int r4 = r8.C()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.A()
                r7 = 1
                if (r3 != r7) goto L_0x005c
                if (r2 == 0) goto L_0x0057
                goto L_0x0064
            L_0x0057:
                int r2 = java.lang.Math.max(r6, r10)
                goto L_0x0064
            L_0x005c:
                if (r6 == 0) goto L_0x005f
                goto L_0x0063
            L_0x005f:
                int r6 = java.lang.Math.min(r4, r2)
            L_0x0063:
                r2 = r6
            L_0x0064:
                if (r1 == 0) goto L_0x0067
                goto L_0x006b
            L_0x0067:
                int r1 = java.lang.Math.min(r5, r11)
            L_0x006b:
                if (r13 == 0) goto L_0x00ab
                android.view.View r10 = r9.getFocusedChild()
                if (r10 != 0) goto L_0x0074
                goto L_0x00a8
            L_0x0074:
                int r11 = r8.D()
                int r13 = r8.F()
                int r3 = r8.f1650n
                int r4 = r8.E()
                int r3 = r3 - r4
                int r4 = r8.f1651o
                int r5 = r8.C()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.f1640b
                android.graphics.Rect r5 = r5.w
                z(r10, r5)
                int r10 = r5.left
                int r10 = r10 - r2
                if (r10 >= r3) goto L_0x00a8
                int r10 = r5.right
                int r10 = r10 - r2
                if (r10 <= r11) goto L_0x00a8
                int r10 = r5.top
                int r10 = r10 - r1
                if (r10 >= r4) goto L_0x00a8
                int r10 = r5.bottom
                int r10 = r10 - r1
                if (r10 > r13) goto L_0x00a6
                goto L_0x00a8
            L_0x00a6:
                r10 = r7
                goto L_0x00a9
            L_0x00a8:
                r10 = r0
            L_0x00a9:
                if (r10 == 0) goto L_0x00b0
            L_0x00ab:
                if (r2 != 0) goto L_0x00b1
                if (r1 == 0) goto L_0x00b0
                goto L_0x00b1
            L_0x00b0:
                return r0
            L_0x00b1:
                if (r12 == 0) goto L_0x00b7
                r9.scrollBy(r2, r1)
                goto L_0x00ba
            L_0x00b7:
                r9.b0(r2, r1, r0)
            L_0x00ba:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.n0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public int o(z zVar) {
            return 0;
        }

        public final void o0() {
            RecyclerView recyclerView = this.f1640b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public final void p(u uVar) {
            int w = w();
            while (true) {
                w--;
                if (w >= 0) {
                    View v10 = v(w);
                    c0 J = RecyclerView.J(v10);
                    if (!J.o()) {
                        if (!J.g() || J.i() || this.f1640b.z.f1629b) {
                            v(w);
                            this.f1639a.c(w);
                            uVar.h(v10);
                            this.f1640b.f1592t.b(J);
                        } else {
                            m0(w);
                            uVar.g(J);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public int p0(int i10, u uVar, z zVar) {
            return 0;
        }

        public View q(int i10) {
            int w = w();
            for (int i11 = 0; i11 < w; i11++) {
                View v10 = v(i11);
                c0 J = RecyclerView.J(v10);
                if (J != null && J.c() == i10 && !J.o() && (this.f1640b.f1595v0.f1692g || !J.i())) {
                    return v10;
                }
            }
            return null;
        }

        public void q0(int i10) {
        }

        public abstract o r();

        public int r0(int i10, u uVar, z zVar) {
            return 0;
        }

        public o s(Context context, AttributeSet attributeSet) {
            return new o(context, attributeSet);
        }

        public final void s0(RecyclerView recyclerView) {
            t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public o t(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof o ? new o((o) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o((ViewGroup.MarginLayoutParams) layoutParams) : new o(layoutParams);
        }

        public final void t0(int i10, int i11) {
            this.f1650n = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.l = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.O0;
            }
            this.f1651o = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f1649m = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.O0;
            }
        }

        public void u0(Rect rect, int i10, int i11) {
            int E = E() + D() + rect.width();
            int C = C() + F() + rect.height();
            RecyclerView recyclerView = this.f1640b;
            WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
            this.f1640b.setMeasuredDimension(g(i10, E, w.d.e(recyclerView)), g(i11, C, w.d.d(this.f1640b)));
        }

        public final View v(int i10) {
            b bVar = this.f1639a;
            if (bVar != null) {
                return bVar.d(i10);
            }
            return null;
        }

        public final void v0(int i10, int i11) {
            int w = w();
            if (w == 0) {
                this.f1640b.n(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < w; i16++) {
                View v10 = v(i16);
                Rect rect = this.f1640b.w;
                z(v10, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f1640b.w.set(i15, i13, i12, i14);
            u0(this.f1640b.w, i10, i11);
        }

        public final int w() {
            b bVar = this.f1639a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public final void w0(RecyclerView recyclerView) {
            int i10;
            if (recyclerView == null) {
                this.f1640b = null;
                this.f1639a = null;
                i10 = 0;
                this.f1650n = 0;
            } else {
                this.f1640b = recyclerView;
                this.f1639a = recyclerView.f1590s;
                this.f1650n = recyclerView.getWidth();
                i10 = recyclerView.getHeight();
            }
            this.f1651o = i10;
            this.l = 1073741824;
            this.f1649m = 1073741824;
        }

        public final boolean x0(View view, int i10, int i11, o oVar) {
            return view.isLayoutRequested() || !this.f1645h || !N(view.getWidth(), i10, oVar.width) || !N(view.getHeight(), i11, oVar.height);
        }

        public int y(u uVar, z zVar) {
            return -1;
        }

        public boolean y0() {
            return false;
        }

        public final boolean z0(View view, int i10, int i11, o oVar) {
            return !this.f1645h || !N(view.getMeasuredWidth(), i10, oVar.width) || !N(view.getMeasuredHeight(), i11, oVar.height);
        }
    }

    public static class o extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c0 f1657a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f1658b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public boolean f1659c = true;
        public boolean d = false;

        public o(int i10, int i11) {
            super(i10, i11);
        }

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public o(o oVar) {
            super(oVar);
        }

        public final int a() {
            return this.f1657a.c();
        }

        public final boolean b() {
            if ((this.f1657a.f1617j & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean c() {
            return this.f1657a.i();
        }
    }

    public interface p {
        void a(View view);

        void b();
    }

    public static abstract class q {
    }

    public interface r {
        void a(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent);

        void c();
    }

    public static abstract class s {
        public void a(int i10, RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public static class t {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f1660a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f1661b = 0;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<c0> f1662a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public final int f1663b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f1664c = 0;
            public long d = 0;
        }

        public final a a(int i10) {
            SparseArray<a> sparseArray = this.f1660a;
            a aVar = sparseArray.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i10, aVar2);
            return aVar2;
        }
    }

    public final class u {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<c0> f1665a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<c0> f1666b = null;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<c0> f1667c = new ArrayList<>();
        public final List<c0> d;

        /* renamed from: e  reason: collision with root package name */
        public int f1668e;

        /* renamed from: f  reason: collision with root package name */
        public int f1669f;

        /* renamed from: g  reason: collision with root package name */
        public t f1670g;

        public u() {
            ArrayList<c0> arrayList = new ArrayList<>();
            this.f1665a = arrayList;
            this.d = Collections.unmodifiableList(arrayList);
            this.f1668e = 2;
            this.f1669f = 2;
        }

        public final void a(c0 c0Var, boolean z) {
            i0.a aVar;
            RecyclerView.j(c0Var);
            RecyclerView recyclerView = RecyclerView.this;
            x xVar = recyclerView.C0;
            if (xVar != null) {
                x.a aVar2 = xVar.f1867e;
                boolean z10 = aVar2 instanceof x.a;
                View view = c0Var.f1609a;
                if (z10) {
                    aVar = (i0.a) aVar2.f1868e.remove(view);
                } else {
                    aVar = null;
                }
                i0.w.k(view, aVar);
            }
            if (z) {
                v vVar = recyclerView.B;
                if (vVar != null) {
                    vVar.a();
                }
                ArrayList arrayList = recyclerView.C;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((v) arrayList.get(i10)).a();
                }
                if (recyclerView.f1595v0 != null) {
                    recyclerView.f1592t.c(c0Var);
                }
            }
            c0Var.f1625s = null;
            c0Var.f1624r = null;
            t c10 = c();
            c10.getClass();
            int i11 = c0Var.f1613f;
            ArrayList<c0> arrayList2 = c10.a(i11).f1662a;
            if (c10.f1660a.get(i11).f1663b > arrayList2.size()) {
                c0Var.m();
                arrayList2.add(c0Var);
            }
        }

        public final int b(int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 < 0 || i10 >= recyclerView.f1595v0.b()) {
                throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + recyclerView.f1595v0.b() + recyclerView.z());
            } else if (!recyclerView.f1595v0.f1692g) {
                return i10;
            } else {
                return recyclerView.f1588r.f(i10, 0);
            }
        }

        public final t c() {
            if (this.f1670g == null) {
                this.f1670g = new t();
            }
            return this.f1670g;
        }

        public final void d() {
            ArrayList<c0> arrayList = this.f1667c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                e(size);
            }
            arrayList.clear();
            int[] iArr = RecyclerView.O0;
            m.b bVar = RecyclerView.this.f1593u0;
            int[] iArr2 = bVar.f1839c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.d = 0;
        }

        public final void e(int i10) {
            ArrayList<c0> arrayList = this.f1667c;
            a(arrayList.get(i10), true);
            arrayList.remove(i10);
        }

        public final void f(View view) {
            c0 J = RecyclerView.J(view);
            boolean k10 = J.k();
            RecyclerView recyclerView = RecyclerView.this;
            if (k10) {
                recyclerView.removeDetachedView(view, false);
            }
            if (J.j()) {
                J.f1620n.j(J);
            } else if (J.p()) {
                J.f1617j &= -33;
            }
            g(J);
            if (recyclerView.f1571d0 != null && !J.h()) {
                recyclerView.f1571d0.d(J);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00af  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void g(androidx.recyclerview.widget.RecyclerView.c0 r12) {
            /*
                r11 = this;
                boolean r0 = r12.j()
                r1 = 0
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                r3 = 1
                android.view.View r4 = r12.f1609a
                if (r0 != 0) goto L_0x00f4
                android.view.ViewParent r0 = r4.getParent()
                if (r0 == 0) goto L_0x0014
                goto L_0x00f4
            L_0x0014:
                boolean r0 = r12.k()
                if (r0 != 0) goto L_0x00d9
                boolean r0 = r12.o()
                if (r0 != 0) goto L_0x00c1
                int r0 = r12.f1617j
                r0 = r0 & 16
                if (r0 != 0) goto L_0x0030
                java.util.WeakHashMap<android.view.View, i0.b0> r0 = i0.w.f6004a
                boolean r0 = i0.w.d.i(r4)
                if (r0 == 0) goto L_0x0030
                r0 = r3
                goto L_0x0031
            L_0x0030:
                r0 = r1
            L_0x0031:
                androidx.recyclerview.widget.RecyclerView$f r4 = r2.z
                boolean r4 = r12.h()
                if (r4 == 0) goto L_0x00af
                int r4 = r11.f1669f
                if (r4 <= 0) goto L_0x00a5
                int r4 = r12.f1617j
                r4 = r4 & 526(0x20e, float:7.37E-43)
                if (r4 == 0) goto L_0x0045
                r4 = r3
                goto L_0x0046
            L_0x0045:
                r4 = r1
            L_0x0046:
                if (r4 != 0) goto L_0x00a5
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$c0> r4 = r11.f1667c
                int r5 = r4.size()
                int r6 = r11.f1669f
                if (r5 < r6) goto L_0x0059
                if (r5 <= 0) goto L_0x0059
                r11.e(r1)
                int r5 = r5 + -1
            L_0x0059:
                int[] r6 = androidx.recyclerview.widget.RecyclerView.O0
                if (r5 <= 0) goto L_0x00a0
                int r6 = r12.f1611c
                androidx.recyclerview.widget.m$b r7 = r2.f1593u0
                int[] r8 = r7.f1839c
                if (r8 == 0) goto L_0x0077
                int r8 = r7.d
                int r8 = r8 * 2
                r9 = r1
            L_0x006a:
                if (r9 >= r8) goto L_0x0077
                int[] r10 = r7.f1839c
                r10 = r10[r9]
                if (r10 != r6) goto L_0x0074
                r6 = r3
                goto L_0x0078
            L_0x0074:
                int r9 = r9 + 2
                goto L_0x006a
            L_0x0077:
                r6 = r1
            L_0x0078:
                if (r6 != 0) goto L_0x00a0
            L_0x007a:
                int r5 = r5 + -1
                if (r5 < 0) goto L_0x009f
                java.lang.Object r6 = r4.get(r5)
                androidx.recyclerview.widget.RecyclerView$c0 r6 = (androidx.recyclerview.widget.RecyclerView.c0) r6
                int r6 = r6.f1611c
                int[] r8 = r7.f1839c
                if (r8 == 0) goto L_0x009c
                int r8 = r7.d
                int r8 = r8 * 2
                r9 = r1
            L_0x008f:
                if (r9 >= r8) goto L_0x009c
                int[] r10 = r7.f1839c
                r10 = r10[r9]
                if (r10 != r6) goto L_0x0099
                r6 = r3
                goto L_0x009d
            L_0x0099:
                int r9 = r9 + 2
                goto L_0x008f
            L_0x009c:
                r6 = r1
            L_0x009d:
                if (r6 != 0) goto L_0x007a
            L_0x009f:
                int r5 = r5 + r3
            L_0x00a0:
                r4.add(r5, r12)
                r4 = r3
                goto L_0x00a6
            L_0x00a5:
                r4 = r1
            L_0x00a6:
                if (r4 != 0) goto L_0x00ac
                r11.a(r12, r3)
                r1 = r3
            L_0x00ac:
                r3 = r1
                r1 = r4
                goto L_0x00b0
            L_0x00af:
                r3 = r1
            L_0x00b0:
                androidx.recyclerview.widget.c0 r2 = r2.f1592t
                r2.c(r12)
                if (r1 != 0) goto L_0x00c0
                if (r3 != 0) goto L_0x00c0
                if (r0 == 0) goto L_0x00c0
                r0 = 0
                r12.f1625s = r0
                r12.f1624r = r0
            L_0x00c0:
                return
            L_0x00c1:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                r0.<init>(r1)
                java.lang.String r1 = r2.z()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r12.<init>(r0)
                throw r12
            L_0x00d9:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.<init>(r3)
                r1.append(r12)
                java.lang.String r12 = r2.z()
                r1.append(r12)
                java.lang.String r12 = r1.toString()
                r0.<init>(r12)
                throw r0
            L_0x00f4:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Scrapped or attached views may not be recycled. isScrap:"
                r5.<init>(r6)
                boolean r12 = r12.j()
                r5.append(r12)
                java.lang.String r12 = " isAttached:"
                r5.append(r12)
                android.view.ViewParent r12 = r4.getParent()
                if (r12 == 0) goto L_0x0110
                r1 = r3
            L_0x0110:
                r5.append(r1)
                java.lang.String r12 = r2.z()
                r5.append(r12)
                java.lang.String r12 = r5.toString()
                r0.<init>(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.g(androidx.recyclerview.widget.RecyclerView$c0):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0049  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(android.view.View r6) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView$c0 r6 = androidx.recyclerview.widget.RecyclerView.J(r6)
                int r0 = r6.f1617j
                r1 = r0 & 12
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x000e
                r1 = r2
                goto L_0x000f
            L_0x000e:
                r1 = r3
            L_0x000f:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                if (r1 != 0) goto L_0x005b
                r0 = r0 & 2
                if (r0 == 0) goto L_0x0019
                r0 = r2
                goto L_0x001a
            L_0x0019:
                r0 = r3
            L_0x001a:
                if (r0 == 0) goto L_0x005b
                androidx.recyclerview.widget.RecyclerView$k r0 = r4.f1571d0
                if (r0 == 0) goto L_0x0045
                java.util.List r1 = r6.d()
                androidx.recyclerview.widget.k r0 = (androidx.recyclerview.widget.k) r0
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x003f
                boolean r0 = r0.f1869g
                if (r0 == 0) goto L_0x0039
                boolean r0 = r6.g()
                if (r0 == 0) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r0 = r3
                goto L_0x003a
            L_0x0039:
                r0 = r2
            L_0x003a:
                if (r0 == 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r0 = r3
                goto L_0x0040
            L_0x003f:
                r0 = r2
            L_0x0040:
                if (r0 == 0) goto L_0x0043
                goto L_0x0045
            L_0x0043:
                r0 = r3
                goto L_0x0046
            L_0x0045:
                r0 = r2
            L_0x0046:
                if (r0 == 0) goto L_0x0049
                goto L_0x005b
            L_0x0049:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$c0> r0 = r5.f1666b
                if (r0 != 0) goto L_0x0054
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.f1666b = r0
            L_0x0054:
                r6.f1620n = r5
                r6.f1621o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$c0> r0 = r5.f1666b
                goto L_0x008c
            L_0x005b:
                boolean r0 = r6.g()
                if (r0 == 0) goto L_0x0086
                boolean r0 = r6.i()
                if (r0 != 0) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView$f r0 = r4.z
                boolean r0 = r0.f1629b
                if (r0 == 0) goto L_0x006e
                goto L_0x0086
            L_0x006e:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                r0.<init>(r1)
                java.lang.String r1 = r4.z()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L_0x0086:
                r6.f1620n = r5
                r6.f1621o = r3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$c0> r0 = r5.f1665a
            L_0x008c:
                r0.add(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.h(android.view.View):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d0, code lost:
            if (r8.f1613f != 0) goto L_0x01e6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x02d4, code lost:
            r8 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x0420, code lost:
            if (r8.g() == false) goto L_0x0423;
         */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x0235  */
        /* JADX WARNING: Removed duplicated region for block: B:212:0x03d9  */
        /* JADX WARNING: Removed duplicated region for block: B:213:0x03db  */
        /* JADX WARNING: Removed duplicated region for block: B:215:0x03de  */
        /* JADX WARNING: Removed duplicated region for block: B:222:0x0408  */
        /* JADX WARNING: Removed duplicated region for block: B:223:0x040b  */
        /* JADX WARNING: Removed duplicated region for block: B:298:0x052d  */
        /* JADX WARNING: Removed duplicated region for block: B:299:0x0532  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0142  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.recyclerview.widget.RecyclerView.c0 i(int r20, long r21) {
            /*
                r19 = this;
                r1 = r19
                r0 = r20
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                if (r0 < 0) goto L_0x0552
                androidx.recyclerview.widget.RecyclerView$z r3 = r2.f1595v0
                int r3 = r3.b()
                if (r0 >= r3) goto L_0x0552
                androidx.recyclerview.widget.RecyclerView$z r3 = r2.f1595v0
                boolean r4 = r3.f1692g
                r5 = 0
                r6 = 32
                if (r4 == 0) goto L_0x0082
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$c0> r4 = r1.f1666b
                if (r4 == 0) goto L_0x007d
                int r4 = r4.size()
                if (r4 != 0) goto L_0x0024
                goto L_0x007d
            L_0x0024:
                r7 = r5
            L_0x0025:
                if (r7 >= r4) goto L_0x0042
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$c0> r8 = r1.f1666b
                java.lang.Object r8 = r8.get(r7)
                androidx.recyclerview.widget.RecyclerView$c0 r8 = (androidx.recyclerview.widget.RecyclerView.c0) r8
                boolean r9 = r8.p()
                if (r9 != 0) goto L_0x003f
                int r9 = r8.c()
                if (r9 != r0) goto L_0x003f
                r8.b(r6)
                goto L_0x007e
            L_0x003f:
                int r7 = r7 + 1
                goto L_0x0025
            L_0x0042:
                androidx.recyclerview.widget.RecyclerView$f r7 = r2.z
                boolean r7 = r7.f1629b
                if (r7 == 0) goto L_0x007d
                androidx.recyclerview.widget.a r7 = r2.f1588r
                int r7 = r7.f(r0, r5)
                if (r7 <= 0) goto L_0x007d
                androidx.recyclerview.widget.RecyclerView$f r8 = r2.z
                int r8 = r8.a()
                if (r7 >= r8) goto L_0x007d
                androidx.recyclerview.widget.RecyclerView$f r8 = r2.z
                long r7 = r8.b(r7)
                r9 = r5
            L_0x005f:
                if (r9 >= r4) goto L_0x007d
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$c0> r10 = r1.f1666b
                java.lang.Object r10 = r10.get(r9)
                androidx.recyclerview.widget.RecyclerView$c0 r10 = (androidx.recyclerview.widget.RecyclerView.c0) r10
                boolean r11 = r10.p()
                if (r11 != 0) goto L_0x007a
                long r11 = r10.f1612e
                int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r11 != 0) goto L_0x007a
                r10.b(r6)
                r8 = r10
                goto L_0x007e
            L_0x007a:
                int r9 = r9 + 1
                goto L_0x005f
            L_0x007d:
                r8 = 0
            L_0x007e:
                if (r8 == 0) goto L_0x0083
                r4 = 1
                goto L_0x0084
            L_0x0082:
                r8 = 0
            L_0x0083:
                r4 = r5
            L_0x0084:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$c0> r7 = r1.f1667c
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$c0> r9 = r1.f1665a
                r10 = -1
                if (r8 != 0) goto L_0x022e
                int r8 = r9.size()
                r11 = r5
            L_0x0090:
                if (r11 >= r8) goto L_0x00bd
                java.lang.Object r12 = r9.get(r11)
                androidx.recyclerview.widget.RecyclerView$c0 r12 = (androidx.recyclerview.widget.RecyclerView.c0) r12
                boolean r13 = r12.p()
                if (r13 != 0) goto L_0x00ba
                int r13 = r12.c()
                if (r13 != r0) goto L_0x00ba
                boolean r13 = r12.g()
                if (r13 != 0) goto L_0x00ba
                boolean r13 = r3.f1692g
                if (r13 != 0) goto L_0x00b4
                boolean r13 = r12.i()
                if (r13 != 0) goto L_0x00ba
            L_0x00b4:
                r12.b(r6)
                r8 = r12
                goto L_0x01ae
            L_0x00ba:
                int r11 = r11 + 1
                goto L_0x0090
            L_0x00bd:
                androidx.recyclerview.widget.b r8 = r2.f1590s
                java.util.ArrayList r11 = r8.f1748c
                int r12 = r11.size()
                r13 = r5
            L_0x00c6:
                if (r13 >= r12) goto L_0x00f1
                java.lang.Object r14 = r11.get(r13)
                android.view.View r14 = (android.view.View) r14
                androidx.recyclerview.widget.b$b r15 = r8.f1746a
                androidx.recyclerview.widget.v r15 = (androidx.recyclerview.widget.v) r15
                r15.getClass()
                androidx.recyclerview.widget.RecyclerView$c0 r15 = androidx.recyclerview.widget.RecyclerView.J(r14)
                int r6 = r15.c()
                if (r6 != r0) goto L_0x00ec
                boolean r6 = r15.g()
                if (r6 != 0) goto L_0x00ec
                boolean r6 = r15.i()
                if (r6 != 0) goto L_0x00ec
                goto L_0x00f2
            L_0x00ec:
                int r13 = r13 + 1
                r6 = 32
                goto L_0x00c6
            L_0x00f1:
                r14 = 0
            L_0x00f2:
                if (r14 == 0) goto L_0x0185
                androidx.recyclerview.widget.RecyclerView$c0 r6 = androidx.recyclerview.widget.RecyclerView.J(r14)
                androidx.recyclerview.widget.b r8 = r2.f1590s
                androidx.recyclerview.widget.b$b r11 = r8.f1746a
                androidx.recyclerview.widget.v r11 = (androidx.recyclerview.widget.v) r11
                androidx.recyclerview.widget.RecyclerView r11 = r11.f1865a
                int r11 = r11.indexOfChild(r14)
                if (r11 < 0) goto L_0x0171
                androidx.recyclerview.widget.b$a r12 = r8.f1747b
                boolean r13 = r12.d(r11)
                if (r13 == 0) goto L_0x015d
                r12.a(r11)
                r8.k(r14)
                androidx.recyclerview.widget.b r8 = r2.f1590s
                androidx.recyclerview.widget.b$b r11 = r8.f1746a
                androidx.recyclerview.widget.v r11 = (androidx.recyclerview.widget.v) r11
                androidx.recyclerview.widget.RecyclerView r11 = r11.f1865a
                int r11 = r11.indexOfChild(r14)
                if (r11 != r10) goto L_0x0123
                goto L_0x012b
            L_0x0123:
                androidx.recyclerview.widget.b$a r8 = r8.f1747b
                boolean r12 = r8.d(r11)
                if (r12 == 0) goto L_0x012d
            L_0x012b:
                r11 = r10
                goto L_0x0132
            L_0x012d:
                int r8 = r8.b(r11)
                int r11 = r11 - r8
            L_0x0132:
                if (r11 == r10) goto L_0x0142
                androidx.recyclerview.widget.b r8 = r2.f1590s
                r8.c(r11)
                r1.h(r14)
                r8 = 8224(0x2020, float:1.1524E-41)
                r6.b(r8)
                goto L_0x01ad
            L_0x0142:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "layout index should not be -1 after unhiding a view:"
                r3.<init>(r4)
                r3.append(r6)
                java.lang.String r2 = r2.z()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.<init>(r2)
                throw r0
            L_0x015d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "trying to unhide a view that was not hidden"
                r2.<init>(r3)
                r2.append(r14)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0171:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "view is not a child, cannot hide "
                r2.<init>(r3)
                r2.append(r14)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0185:
                int r6 = r7.size()
                r8 = r5
            L_0x018a:
                if (r8 >= r6) goto L_0x01ac
                java.lang.Object r11 = r7.get(r8)
                androidx.recyclerview.widget.RecyclerView$c0 r11 = (androidx.recyclerview.widget.RecyclerView.c0) r11
                boolean r12 = r11.g()
                if (r12 != 0) goto L_0x01a9
                int r12 = r11.c()
                if (r12 != r0) goto L_0x01a9
                boolean r12 = r11.e()
                if (r12 != 0) goto L_0x01a9
                r7.remove(r8)
                r8 = r11
                goto L_0x01ae
            L_0x01a9:
                int r8 = r8 + 1
                goto L_0x018a
            L_0x01ac:
                r6 = 0
            L_0x01ad:
                r8 = r6
            L_0x01ae:
                if (r8 == 0) goto L_0x022e
                boolean r6 = r8.i()
                if (r6 == 0) goto L_0x01b9
                boolean r6 = r3.f1692g
                goto L_0x01e9
            L_0x01b9:
                int r6 = r8.f1611c
                if (r6 < 0) goto L_0x0213
                androidx.recyclerview.widget.RecyclerView$f r11 = r2.z
                int r11 = r11.a()
                if (r6 >= r11) goto L_0x0213
                boolean r6 = r3.f1692g
                if (r6 != 0) goto L_0x01d3
                androidx.recyclerview.widget.RecyclerView$f r6 = r2.z
                r6.getClass()
                int r6 = r8.f1613f
                if (r6 == 0) goto L_0x01d3
                goto L_0x01e6
            L_0x01d3:
                androidx.recyclerview.widget.RecyclerView$f r6 = r2.z
                boolean r11 = r6.f1629b
                if (r11 == 0) goto L_0x01e8
                long r11 = r8.f1612e
                int r13 = r8.f1611c
                long r13 = r6.b(r13)
                int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r6 != 0) goto L_0x01e6
                goto L_0x01e8
            L_0x01e6:
                r6 = r5
                goto L_0x01e9
            L_0x01e8:
                r6 = 1
            L_0x01e9:
                if (r6 != 0) goto L_0x0211
                r6 = 4
                r8.b(r6)
                boolean r6 = r8.j()
                if (r6 == 0) goto L_0x0200
                android.view.View r6 = r8.f1609a
                r2.removeDetachedView(r6, r5)
                androidx.recyclerview.widget.RecyclerView$u r6 = r8.f1620n
                r6.j(r8)
                goto L_0x020c
            L_0x0200:
                boolean r6 = r8.p()
                if (r6 == 0) goto L_0x020c
                int r6 = r8.f1617j
                r6 = r6 & -33
                r8.f1617j = r6
            L_0x020c:
                r1.g(r8)
                r8 = 0
                goto L_0x022e
            L_0x0211:
                r4 = 1
                goto L_0x022e
            L_0x0213:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Inconsistency detected. Invalid view holder adapter position"
                r3.<init>(r4)
                r3.append(r8)
                java.lang.String r2 = r2.z()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.<init>(r2)
                throw r0
            L_0x022e:
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                if (r8 != 0) goto L_0x03cd
                androidx.recyclerview.widget.a r6 = r2.f1588r
                int r5 = r6.f(r0, r5)
                if (r5 < 0) goto L_0x039e
                androidx.recyclerview.widget.RecyclerView$f r6 = r2.z
                int r6 = r6.a()
                if (r5 >= r6) goto L_0x039e
                androidx.recyclerview.widget.RecyclerView$f r6 = r2.z
                r6.getClass()
                androidx.recyclerview.widget.RecyclerView$f r6 = r2.z
                boolean r15 = r6.f1629b
                if (r15 == 0) goto L_0x02db
                long r17 = r6.b(r5)
                int r6 = r9.size()
                int r6 = r6 + r10
            L_0x0259:
                if (r6 < 0) goto L_0x02ac
                java.lang.Object r8 = r9.get(r6)
                androidx.recyclerview.widget.RecyclerView$c0 r8 = (androidx.recyclerview.widget.RecyclerView.c0) r8
                long r13 = r8.f1612e
                int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
                if (r13 != 0) goto L_0x02a7
                boolean r13 = r8.p()
                if (r13 != 0) goto L_0x02a7
                int r13 = r8.f1613f
                if (r13 != 0) goto L_0x0289
                r13 = 32
                r8.b(r13)
                boolean r6 = r8.i()
                if (r6 == 0) goto L_0x02d6
                boolean r6 = r3.f1692g
                if (r6 != 0) goto L_0x02d6
                int r6 = r8.f1617j
                r6 = r6 & -15
                r6 = r6 | 2
                r8.f1617j = r6
                goto L_0x02d6
            L_0x0289:
                r13 = 32
                r9.remove(r6)
                android.view.View r8 = r8.f1609a
                r14 = 0
                r2.removeDetachedView(r8, r14)
                androidx.recyclerview.widget.RecyclerView$c0 r8 = androidx.recyclerview.widget.RecyclerView.J(r8)
                r15 = 0
                r8.f1620n = r15
                r8.f1621o = r14
                int r14 = r8.f1617j
                r14 = r14 & -33
                r8.f1617j = r14
                r1.g(r8)
                goto L_0x02a9
            L_0x02a7:
                r13 = 32
            L_0x02a9:
                int r6 = r6 + -1
                goto L_0x0259
            L_0x02ac:
                int r6 = r7.size()
                int r6 = r6 + r10
            L_0x02b1:
                if (r6 < 0) goto L_0x02d4
                java.lang.Object r8 = r7.get(r6)
                androidx.recyclerview.widget.RecyclerView$c0 r8 = (androidx.recyclerview.widget.RecyclerView.c0) r8
                long r13 = r8.f1612e
                int r9 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
                if (r9 != 0) goto L_0x02d1
                boolean r9 = r8.e()
                if (r9 != 0) goto L_0x02d1
                int r9 = r8.f1613f
                if (r9 != 0) goto L_0x02cd
                r7.remove(r6)
                goto L_0x02d6
            L_0x02cd:
                r1.e(r6)
                goto L_0x02d4
            L_0x02d1:
                int r6 = r6 + -1
                goto L_0x02b1
            L_0x02d4:
                r6 = 0
                r8 = r6
            L_0x02d6:
                if (r8 == 0) goto L_0x02db
                r8.f1611c = r5
                r4 = 1
            L_0x02db:
                if (r8 != 0) goto L_0x031a
                androidx.recyclerview.widget.RecyclerView$t r5 = r19.c()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$t$a> r5 = r5.f1660a
                r6 = 0
                java.lang.Object r5 = r5.get(r6)
                androidx.recyclerview.widget.RecyclerView$t$a r5 = (androidx.recyclerview.widget.RecyclerView.t.a) r5
                if (r5 == 0) goto L_0x0311
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$c0> r5 = r5.f1662a
                boolean r6 = r5.isEmpty()
                if (r6 != 0) goto L_0x0311
                int r6 = r5.size()
                int r6 = r6 + r10
            L_0x02f9:
                if (r6 < 0) goto L_0x0311
                java.lang.Object r7 = r5.get(r6)
                androidx.recyclerview.widget.RecyclerView$c0 r7 = (androidx.recyclerview.widget.RecyclerView.c0) r7
                boolean r7 = r7.e()
                if (r7 != 0) goto L_0x030e
                java.lang.Object r5 = r5.remove(r6)
                androidx.recyclerview.widget.RecyclerView$c0 r5 = (androidx.recyclerview.widget.RecyclerView.c0) r5
                goto L_0x0312
            L_0x030e:
                int r6 = r6 + -1
                goto L_0x02f9
            L_0x0311:
                r5 = 0
            L_0x0312:
                if (r5 == 0) goto L_0x0319
                r5.m()
                int[] r6 = androidx.recyclerview.widget.RecyclerView.O0
            L_0x0319:
                r8 = r5
            L_0x031a:
                if (r8 != 0) goto L_0x03cd
                long r5 = r2.getNanoTime()
                int r7 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
                if (r7 == 0) goto L_0x0340
                androidx.recyclerview.widget.RecyclerView$t r7 = r1.f1670g
                r8 = 0
                androidx.recyclerview.widget.RecyclerView$t$a r7 = r7.a(r8)
                long r7 = r7.f1664c
                r9 = 0
                int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r13 == 0) goto L_0x033b
                long r7 = r7 + r5
                int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
                if (r7 >= 0) goto L_0x0339
                goto L_0x033b
            L_0x0339:
                r7 = 0
                goto L_0x033c
            L_0x033b:
                r7 = 1
            L_0x033c:
                if (r7 != 0) goto L_0x0340
                r0 = 0
                return r0
            L_0x0340:
                androidx.recyclerview.widget.RecyclerView$f r7 = r2.z
                r7.getClass()
                java.lang.String r8 = "RV CreateView"
                int r9 = e0.d.f4446a     // Catch:{ all -> 0x0397 }
                android.os.Trace.beginSection(r8)     // Catch:{ all -> 0x0397 }
                androidx.recyclerview.widget.RecyclerView$c0 r8 = r7.e(r2)     // Catch:{ all -> 0x0397 }
                android.view.View r7 = r8.f1609a     // Catch:{ all -> 0x0397 }
                android.view.ViewParent r7 = r7.getParent()     // Catch:{ all -> 0x0397 }
                if (r7 != 0) goto L_0x038f
                r7 = 0
                r8.f1613f = r7     // Catch:{ all -> 0x0397 }
                android.os.Trace.endSection()
                int[] r7 = androidx.recyclerview.widget.RecyclerView.O0
                android.view.View r7 = r8.f1609a
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.E(r7)
                if (r7 == 0) goto L_0x036f
                java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
                r9.<init>(r7)
                r8.f1610b = r9
            L_0x036f:
                long r9 = r2.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$t r7 = r1.f1670g
                long r9 = r9 - r5
                r5 = 0
                androidx.recyclerview.widget.RecyclerView$t$a r5 = r7.a(r5)
                long r6 = r5.f1664c
                r13 = 0
                int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
                if (r15 != 0) goto L_0x0384
                goto L_0x038c
            L_0x0384:
                r13 = 4
                long r6 = r6 / r13
                r15 = 3
                long r6 = r6 * r15
                long r9 = r9 / r13
                long r9 = r9 + r6
            L_0x038c:
                r5.f1664c = r9
                goto L_0x03cd
            L_0x038f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0397 }
                java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r0.<init>(r2)     // Catch:{ all -> 0x0397 }
                throw r0     // Catch:{ all -> 0x0397 }
            L_0x0397:
                r0 = move-exception
                int r2 = e0.d.f4446a
                android.os.Trace.endSection()
                throw r0
            L_0x039e:
                java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "Inconsistency detected. Invalid item position "
                r6.<init>(r7)
                r6.append(r0)
                java.lang.String r0 = "(offset:"
                r6.append(r0)
                r6.append(r5)
                java.lang.String r0 = ").state:"
                r6.append(r0)
                int r0 = r3.b()
                r6.append(r0)
                java.lang.String r0 = r2.z()
                r6.append(r0)
                java.lang.String r0 = r6.toString()
                r4.<init>(r0)
                throw r4
            L_0x03cd:
                if (r4 == 0) goto L_0x03fe
                boolean r5 = r3.f1692g
                if (r5 != 0) goto L_0x03fe
                int r5 = r8.f1617j
                r6 = r5 & 8192(0x2000, float:1.14794E-41)
                if (r6 == 0) goto L_0x03db
                r6 = 1
                goto L_0x03dc
            L_0x03db:
                r6 = 0
            L_0x03dc:
                if (r6 == 0) goto L_0x03fe
                r5 = r5 & -8193(0xffffffffffffdfff, float:NaN)
                r5 = r5 | 0
                r8.f1617j = r5
                boolean r5 = r3.f1695j
                if (r5 == 0) goto L_0x03fe
                androidx.recyclerview.widget.RecyclerView.k.b(r8)
                androidx.recyclerview.widget.RecyclerView$k r5 = r2.f1571d0
                r8.d()
                r5.getClass()
                androidx.recyclerview.widget.RecyclerView$k$c r5 = new androidx.recyclerview.widget.RecyclerView$k$c
                r5.<init>()
                r5.a(r8)
                r2.V(r8, r5)
            L_0x03fe:
                boolean r5 = r3.f1692g
                if (r5 == 0) goto L_0x040b
                boolean r5 = r8.f()
                if (r5 == 0) goto L_0x040b
                r8.f1614g = r0
                goto L_0x0423
            L_0x040b:
                boolean r5 = r8.f()
                if (r5 == 0) goto L_0x0425
                int r5 = r8.f1617j
                r5 = r5 & 2
                if (r5 == 0) goto L_0x0419
                r5 = 1
                goto L_0x041a
            L_0x0419:
                r5 = 0
            L_0x041a:
                if (r5 != 0) goto L_0x0425
                boolean r5 = r8.g()
                if (r5 == 0) goto L_0x0423
                goto L_0x0425
            L_0x0423:
                r0 = 0
                goto L_0x0455
            L_0x0425:
                androidx.recyclerview.widget.a r5 = r2.f1588r
                r6 = 0
                int r5 = r5.f(r0, r6)
                r7 = 0
                r8.f1625s = r7
                r8.f1624r = r2
                int r9 = r8.f1613f
                long r13 = r2.getNanoTime()
                int r10 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
                if (r10 == 0) goto L_0x0459
                androidx.recyclerview.widget.RecyclerView$t r10 = r1.f1670g
                androidx.recyclerview.widget.RecyclerView$t$a r9 = r10.a(r9)
                long r9 = r9.d
                r11 = 0
                int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r15 == 0) goto L_0x0451
                long r9 = r9 + r13
                int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
                if (r9 >= 0) goto L_0x044f
                goto L_0x0451
            L_0x044f:
                r9 = r6
                goto L_0x0452
            L_0x0451:
                r9 = 1
            L_0x0452:
                if (r9 != 0) goto L_0x0459
                r0 = r6
            L_0x0455:
                r3 = 1
                r6 = r0
                goto L_0x0525
            L_0x0459:
                androidx.recyclerview.widget.RecyclerView$f r9 = r2.z
                r9.getClass()
                androidx.recyclerview.widget.RecyclerView$f<? extends androidx.recyclerview.widget.RecyclerView$c0> r10 = r8.f1625s
                if (r10 != 0) goto L_0x0464
                r10 = 1
                goto L_0x0465
            L_0x0464:
                r10 = r6
            L_0x0465:
                if (r10 == 0) goto L_0x0482
                r8.f1611c = r5
                boolean r11 = r9.f1629b
                if (r11 == 0) goto L_0x0473
                long r11 = r9.b(r5)
                r8.f1612e = r11
            L_0x0473:
                int r11 = r8.f1617j
                r11 = r11 & -520(0xfffffffffffffdf8, float:NaN)
                r11 = r11 | 1
                r8.f1617j = r11
                int r11 = e0.d.f4446a
                java.lang.String r11 = "RV OnBindView"
                android.os.Trace.beginSection(r11)
            L_0x0482:
                r8.f1625s = r9
                r8.d()
                r9.d(r8, r5)
                android.view.View r5 = r8.f1609a
                if (r10 == 0) goto L_0x04ad
                java.util.ArrayList r9 = r8.f1618k
                if (r9 == 0) goto L_0x0495
                r9.clear()
            L_0x0495:
                int r9 = r8.f1617j
                r9 = r9 & -1025(0xfffffffffffffbff, float:NaN)
                r8.f1617j = r9
                android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
                boolean r10 = r9 instanceof androidx.recyclerview.widget.RecyclerView.o
                if (r10 == 0) goto L_0x04a8
                androidx.recyclerview.widget.RecyclerView$o r9 = (androidx.recyclerview.widget.RecyclerView.o) r9
                r10 = 1
                r9.f1659c = r10
            L_0x04a8:
                int r9 = e0.d.f4446a
                android.os.Trace.endSection()
            L_0x04ad:
                long r9 = r2.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$t r11 = r1.f1670g
                int r12 = r8.f1613f
                long r9 = r9 - r13
                androidx.recyclerview.widget.RecyclerView$t$a r11 = r11.a(r12)
                long r12 = r11.d
                r14 = 0
                int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r14 != 0) goto L_0x04c3
                goto L_0x04cc
            L_0x04c3:
                r14 = 4
                long r12 = r12 / r14
                r16 = 3
                long r12 = r12 * r16
                long r9 = r9 / r14
                long r9 = r9 + r12
            L_0x04cc:
                r11.d = r9
                android.view.accessibility.AccessibilityManager r9 = r2.P
                if (r9 == 0) goto L_0x04da
                boolean r9 = r9.isEnabled()
                if (r9 == 0) goto L_0x04da
                r9 = 1
                goto L_0x04db
            L_0x04da:
                r9 = r6
            L_0x04db:
                if (r9 == 0) goto L_0x051c
                java.util.WeakHashMap<android.view.View, i0.b0> r9 = i0.w.f6004a
                int r9 = i0.w.d.c(r5)
                if (r9 != 0) goto L_0x04ea
                r9 = 1
                i0.w.d.s(r5, r9)
                goto L_0x04eb
            L_0x04ea:
                r9 = 1
            L_0x04eb:
                androidx.recyclerview.widget.x r10 = r2.C0
                if (r10 != 0) goto L_0x04f0
                goto L_0x051a
            L_0x04f0:
                androidx.recyclerview.widget.x$a r10 = r10.f1867e
                boolean r11 = r10 instanceof androidx.recyclerview.widget.x.a
                if (r11 == 0) goto L_0x0517
                r10.getClass()
                android.view.View$AccessibilityDelegate r11 = i0.w.c(r5)
                if (r11 != 0) goto L_0x0500
                goto L_0x050e
            L_0x0500:
                boolean r7 = r11 instanceof i0.a.C0078a
                if (r7 == 0) goto L_0x0509
                i0.a$a r11 = (i0.a.C0078a) r11
                i0.a r7 = r11.f5953a
                goto L_0x050e
            L_0x0509:
                i0.a r7 = new i0.a
                r7.<init>(r11)
            L_0x050e:
                if (r7 == 0) goto L_0x0517
                if (r7 == r10) goto L_0x0517
                java.util.WeakHashMap r11 = r10.f1868e
                r11.put(r5, r7)
            L_0x0517:
                i0.w.k(r5, r10)
            L_0x051a:
                r5 = r9
                goto L_0x051d
            L_0x051c:
                r5 = 1
            L_0x051d:
                boolean r3 = r3.f1692g
                if (r3 == 0) goto L_0x0523
                r8.f1614g = r0
            L_0x0523:
                r0 = r5
                r3 = r0
            L_0x0525:
                android.view.View r5 = r8.f1609a
                android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
                if (r5 != 0) goto L_0x0532
                android.view.ViewGroup$LayoutParams r2 = r2.generateDefaultLayoutParams()
                goto L_0x053c
            L_0x0532:
                boolean r7 = r2.checkLayoutParams(r5)
                if (r7 != 0) goto L_0x0544
                android.view.ViewGroup$LayoutParams r2 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r5)
            L_0x053c:
                androidx.recyclerview.widget.RecyclerView$o r2 = (androidx.recyclerview.widget.RecyclerView.o) r2
                android.view.View r5 = r8.f1609a
                r5.setLayoutParams(r2)
                goto L_0x0547
            L_0x0544:
                r2 = r5
                androidx.recyclerview.widget.RecyclerView$o r2 = (androidx.recyclerview.widget.RecyclerView.o) r2
            L_0x0547:
                r2.f1657a = r8
                if (r4 == 0) goto L_0x054e
                if (r0 == 0) goto L_0x054e
                goto L_0x054f
            L_0x054e:
                r3 = r6
            L_0x054f:
                r2.d = r3
                return r8
            L_0x0552:
                java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Invalid item position "
                r4.<init>(r5)
                r4.append(r0)
                java.lang.String r5 = "("
                r4.append(r5)
                r4.append(r0)
                java.lang.String r0 = "). Item count:"
                r4.append(r0)
                androidx.recyclerview.widget.RecyclerView$z r0 = r2.f1595v0
                int r0 = r0.b()
                r4.append(r0)
                java.lang.String r0 = r2.z()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.i(int, long):androidx.recyclerview.widget.RecyclerView$c0");
        }

        public final void j(c0 c0Var) {
            ArrayList<c0> arrayList;
            if (c0Var.f1621o) {
                arrayList = this.f1666b;
            } else {
                arrayList = this.f1665a;
            }
            arrayList.remove(c0Var);
            c0Var.f1620n = null;
            c0Var.f1621o = false;
            c0Var.f1617j &= -33;
        }

        public final void k() {
            n nVar = RecyclerView.this.A;
            this.f1669f = this.f1668e + (nVar != null ? nVar.f1647j : 0);
            ArrayList<c0> arrayList = this.f1667c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1669f; size--) {
                e(size);
            }
        }
    }

    public interface v {
        void a();
    }

    public class w extends h {
        public w() {
        }

        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i((String) null);
            recyclerView.f1595v0.f1691f = true;
            recyclerView.U(true);
            if (!recyclerView.f1588r.g()) {
                recyclerView.requestLayout();
            }
        }

        public final void c(int i10) {
            boolean z;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i((String) null);
            a aVar = recyclerView.f1588r;
            ArrayList<a.b> arrayList = aVar.f1735b;
            arrayList.add(aVar.h((Object) null, 4, i10, 1));
            aVar.f1738f |= 4;
            if (arrayList.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int[] iArr = RecyclerView.O0;
                if (!recyclerView.H || !recyclerView.G) {
                    recyclerView.O = true;
                    recyclerView.requestLayout();
                    return;
                }
                WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
                w.d.m(recyclerView, recyclerView.f1594v);
            }
        }
    }

    public static class x extends n0.a {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* renamed from: q  reason: collision with root package name */
        public Parcelable f1673q;

        public class a implements Parcelable.ClassLoaderCreator<x> {
            public final Object createFromParcel(Parcel parcel) {
                return new x(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new x[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }
        }

        public x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1673q = parcel.readParcelable(classLoader == null ? n.class.getClassLoader() : classLoader);
        }

        public x(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f7340o, i10);
            parcel.writeParcelable(this.f1673q, 0);
        }
    }

    public static abstract class y {

        /* renamed from: a  reason: collision with root package name */
        public int f1674a = -1;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f1675b;

        /* renamed from: c  reason: collision with root package name */
        public n f1676c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1677e;

        /* renamed from: f  reason: collision with root package name */
        public View f1678f;

        /* renamed from: g  reason: collision with root package name */
        public final a f1679g = new a();

        /* renamed from: h  reason: collision with root package name */
        public boolean f1680h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f1681a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f1682b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f1683c = Integer.MIN_VALUE;
            public int d = -1;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f1684e = null;

            /* renamed from: f  reason: collision with root package name */
            public boolean f1685f = false;

            /* renamed from: g  reason: collision with root package name */
            public int f1686g = 0;

            public final void a(RecyclerView recyclerView) {
                int i10 = this.d;
                if (i10 >= 0) {
                    this.d = -1;
                    recyclerView.M(i10);
                    this.f1685f = false;
                } else if (this.f1685f) {
                    Interpolator interpolator = this.f1684e;
                    if (interpolator == null || this.f1683c >= 1) {
                        int i11 = this.f1683c;
                        if (i11 >= 1) {
                            recyclerView.f1591s0.b(this.f1681a, this.f1682b, i11, interpolator);
                            int i12 = this.f1686g + 1;
                            this.f1686g = i12;
                            if (i12 > 10) {
                                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            this.f1685f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    this.f1686g = 0;
                }
            }
        }

        public interface b {
            PointF a(int i10);
        }

        public final PointF a(int i10) {
            n nVar = this.f1676c;
            if (nVar instanceof b) {
                return ((b) nVar).a(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public final void b(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f1675b;
            int i12 = -1;
            if (this.f1674a == -1 || recyclerView == null) {
                d();
            }
            if (this.d && this.f1678f == null && this.f1676c != null && (a10 = a(this.f1674a)) != null) {
                float f10 = a10.x;
                if (!(f10 == 0.0f && a10.y == 0.0f)) {
                    recyclerView.Z((int) Math.signum(f10), (int) Math.signum(a10.y), (int[]) null);
                }
            }
            boolean z = false;
            this.d = false;
            View view = this.f1678f;
            a aVar = this.f1679g;
            if (view != null) {
                this.f1675b.getClass();
                c0 J = RecyclerView.J(view);
                if (J != null) {
                    i12 = J.c();
                }
                if (i12 == this.f1674a) {
                    View view2 = this.f1678f;
                    z zVar = recyclerView.f1595v0;
                    c(view2, aVar);
                    aVar.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f1678f = null;
                }
            }
            if (this.f1677e) {
                z zVar2 = recyclerView.f1595v0;
                o oVar = (o) this;
                if (oVar.f1675b.A.w() == 0) {
                    oVar.d();
                } else {
                    int i13 = oVar.f1857o;
                    int i14 = i13 - i10;
                    if (i13 * i14 <= 0) {
                        i14 = 0;
                    }
                    oVar.f1857o = i14;
                    int i15 = oVar.f1858p;
                    int i16 = i15 - i11;
                    if (i15 * i16 <= 0) {
                        i16 = 0;
                    }
                    oVar.f1858p = i16;
                    if (i14 == 0 && i16 == 0) {
                        PointF a11 = oVar.a(oVar.f1674a);
                        if (a11 != null) {
                            float f11 = a11.x;
                            if (!(f11 == 0.0f && a11.y == 0.0f)) {
                                float f12 = a11.y;
                                float sqrt = (float) Math.sqrt((double) ((f12 * f12) + (f11 * f11)));
                                float f13 = a11.x / sqrt;
                                a11.x = f13;
                                float f14 = a11.y / sqrt;
                                a11.y = f14;
                                oVar.f1854k = a11;
                                oVar.f1857o = (int) (f13 * 10000.0f);
                                oVar.f1858p = (int) (f14 * 10000.0f);
                                int g10 = oVar.g(10000);
                                LinearInterpolator linearInterpolator = oVar.f1852i;
                                aVar.f1681a = (int) (((float) oVar.f1857o) * 1.2f);
                                aVar.f1682b = (int) (((float) oVar.f1858p) * 1.2f);
                                aVar.f1683c = (int) (((float) g10) * 1.2f);
                                aVar.f1684e = linearInterpolator;
                                aVar.f1685f = true;
                            }
                        }
                        aVar.d = oVar.f1674a;
                        oVar.d();
                    }
                }
                if (aVar.d >= 0) {
                    z = true;
                }
                aVar.a(recyclerView);
                if (z && this.f1677e) {
                    this.d = true;
                    recyclerView.f1591s0.a();
                }
            }
        }

        public abstract void c(View view, a aVar);

        public final void d() {
            if (this.f1677e) {
                this.f1677e = false;
                o oVar = (o) this;
                oVar.f1858p = 0;
                oVar.f1857o = 0;
                oVar.f1854k = null;
                this.f1675b.f1595v0.f1687a = -1;
                this.f1678f = null;
                this.f1674a = -1;
                this.d = false;
                n nVar = this.f1676c;
                if (nVar.f1642e == this) {
                    nVar.f1642e = null;
                }
                this.f1676c = null;
                this.f1675b = null;
            }
        }
    }

    public static class z {

        /* renamed from: a  reason: collision with root package name */
        public int f1687a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f1688b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1689c = 0;
        public int d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f1690e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1691f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1692g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1693h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1694i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1695j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1696k = false;
        public int l;

        /* renamed from: m  reason: collision with root package name */
        public long f1697m;

        /* renamed from: n  reason: collision with root package name */
        public int f1698n;

        public final void a(int i10) {
            if ((this.d & i10) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
            }
        }

        public final int b() {
            return this.f1692g ? this.f1688b - this.f1689c : this.f1690e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f1687a + ", mData=null, mItemCount=" + this.f1690e + ", mIsMeasuring=" + this.f1694i + ", mPreviousLayoutItemCount=" + this.f1688b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1689c + ", mStructureChanged=" + this.f1691f + ", mInPreLayout=" + this.f1692g + ", mRunSimpleAnimations=" + this.f1695j + ", mRunPredictiveAnimations=" + this.f1696k + '}';
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            O0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            java.lang.Class r0 = java.lang.Integer.TYPE
            r2 = 2
            r1[r2] = r0
            r2 = 3
            r1[r2] = r0
            P0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            Q0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        float f10;
        float f11;
        boolean z10;
        int i11;
        StringBuilder sb;
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        NoSuchMethodException noSuchMethodException;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i12 = i10;
        this.f1582o = new w();
        this.f1584p = new u();
        this.f1592t = new c0();
        this.f1594v = new a();
        this.w = new Rect();
        this.f1597x = new Rect();
        this.f1598y = new RectF();
        this.C = new ArrayList();
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.J = 0;
        this.R = false;
        this.S = false;
        this.T = 0;
        this.U = 0;
        this.V = new j();
        this.f1571d0 = new k();
        this.f1572e0 = 0;
        this.f1573f0 = -1;
        this.f1585p0 = Float.MIN_VALUE;
        this.f1587q0 = Float.MIN_VALUE;
        this.f1589r0 = true;
        this.f1591s0 = new b0();
        this.f1593u0 = new m.b();
        this.f1595v0 = new z();
        this.y0 = false;
        this.f1599z0 = false;
        l lVar = new l();
        this.A0 = lVar;
        this.B0 = false;
        char c10 = 2;
        this.D0 = new int[2];
        this.F0 = new int[2];
        this.G0 = new int[2];
        this.H0 = new int[2];
        this.I0 = new ArrayList();
        this.J0 = new b();
        this.L0 = 0;
        this.M0 = 0;
        this.N0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1579l0 = viewConfiguration.getScaledTouchSlop();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            Method method = i0.y.f6021a;
            f10 = viewConfiguration.getScaledHorizontalScrollFactor();
        } else {
            f10 = i0.y.a(viewConfiguration, context2);
        }
        this.f1585p0 = f10;
        if (i13 >= 26) {
            f11 = viewConfiguration.getScaledVerticalScrollFactor();
        } else {
            f11 = i0.y.a(viewConfiguration, context2);
        }
        this.f1587q0 = f11;
        this.f1581n0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1583o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        this.f1571d0.f1631a = lVar;
        this.f1588r = new a(new w(this));
        this.f1590s = new b(new v(this));
        WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
        if (i13 >= 26) {
            i11 = w.k.b(this);
        } else {
            i11 = 0;
        }
        if (i11 == 0 && i13 >= 26) {
            w.k.l(this, 8);
        }
        if (w.d.c(this) == 0) {
            w.d.s(this, 1);
        }
        this.P = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new x(this));
        int[] iArr = n.e.G;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i12, 0);
        i0.w.j(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.u = obtainStyledAttributes.getBoolean(1, true);
        int i14 = 4;
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + z());
            }
            Resources resources = getContext().getResources();
            new l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            i14 = 4;
            c10 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(trim);
                    trim = sb.toString();
                } else if (!trim.contains(".")) {
                    sb = new StringBuilder();
                    sb.append(RecyclerView.class.getPackage().getName());
                    sb.append('.');
                    sb.append(trim);
                    trim = sb.toString();
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(n.class);
                    try {
                        constructor = asSubclass.getConstructor(P0);
                        objArr = new Object[i14];
                        objArr[0] = context2;
                        objArr[1] = attributeSet2;
                        objArr[c10] = Integer.valueOf(i10);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e10) {
                        noSuchMethodException = e10;
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((n) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e11) {
                    e11.initCause(noSuchMethodException);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e15);
                } catch (ClassCastException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e16);
                }
            }
        }
        int[] iArr2 = O0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i12, 0);
        i0.w.j(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
    }

    public static RecyclerView E(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView E2 = E(viewGroup.getChildAt(i10));
            if (E2 != null) {
                return E2;
            }
        }
        return null;
    }

    public static c0 J(View view) {
        if (view == null) {
            return null;
        }
        return ((o) view.getLayoutParams()).f1657a;
    }

    private i0.k getScrollingChildHelper() {
        if (this.E0 == null) {
            this.E0 = new i0.k(this);
        }
        return this.E0;
    }

    public static void j(c0 c0Var) {
        Reference reference = c0Var.f1610b;
        if (reference != null) {
            Object obj = reference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        c0Var.f1610b = null;
                        return;
                    } else if (view != c0Var.f1609a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void A(z zVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f1591s0.f1604q;
            overScroller.getFinalX();
            overScroller.getCurrX();
            zVar.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        zVar.getClass();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View B(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.B(android.view.View):android.view.View");
    }

    public final boolean C(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<r> arrayList = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            r rVar = arrayList.get(i10);
            if (!rVar.b(motionEvent) || action == 3) {
                i10++;
            } else {
                this.F = rVar;
                return true;
            }
        }
        return false;
    }

    public final void D(int[] iArr) {
        int e10 = this.f1590s.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < e10; i12++) {
            c0 J2 = J(this.f1590s.d(i12));
            if (!J2.o()) {
                int c10 = J2.c();
                if (c10 < i10) {
                    i10 = c10;
                }
                if (c10 > i11) {
                    i11 = c10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final c0 F(int i10) {
        c0 c0Var = null;
        if (this.R) {
            return null;
        }
        int h10 = this.f1590s.h();
        for (int i11 = 0; i11 < h10; i11++) {
            c0 J2 = J(this.f1590s.g(i11));
            if (J2 != null && !J2.i() && G(J2) == i10) {
                if (!this.f1590s.j(J2.f1609a)) {
                    return J2;
                }
                c0Var = J2;
            }
        }
        return c0Var;
    }

    public final int G(c0 c0Var) {
        boolean z10;
        if ((c0Var.f1617j & 524) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && c0Var.f()) {
            a aVar = this.f1588r;
            int i10 = c0Var.f1611c;
            ArrayList<a.b> arrayList = aVar.f1735b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                a.b bVar = arrayList.get(i11);
                int i12 = bVar.f1739a;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = bVar.f1740b;
                        if (i13 <= i10) {
                            int i14 = bVar.d;
                            if (i13 + i14 <= i10) {
                                i10 -= i14;
                            }
                        } else {
                            continue;
                        }
                    } else if (i12 == 8) {
                        int i15 = bVar.f1740b;
                        if (i15 == i10) {
                            i10 = bVar.d;
                        } else {
                            if (i15 < i10) {
                                i10--;
                            }
                            if (bVar.d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else if (bVar.f1740b <= i10) {
                    i10 += bVar.d;
                }
            }
            return i10;
        }
        return -1;
    }

    public final long H(c0 c0Var) {
        if (this.z.f1629b) {
            return c0Var.f1612e;
        }
        return (long) c0Var.f1611c;
    }

    public final c0 I(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return J(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect K(View view) {
        o oVar = (o) view.getLayoutParams();
        boolean z10 = oVar.f1659c;
        Rect rect = oVar.f1658b;
        if (!z10) {
            return rect;
        }
        z zVar = this.f1595v0;
        if (zVar.f1692g && (oVar.b() || oVar.f1657a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<m> arrayList = this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.w;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i10).d(rect2, view, this, zVar);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        oVar.f1659c = false;
        return rect;
    }

    public final boolean L() {
        return this.T > 0;
    }

    public final void M(int i10) {
        if (this.A != null) {
            setScrollState(2);
            this.A.q0(i10);
            awakenScrollBars();
        }
    }

    public final void N() {
        int h10 = this.f1590s.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((o) this.f1590s.g(i10).getLayoutParams()).f1659c = true;
        }
        ArrayList<c0> arrayList = this.f1584p.f1667c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11).f1609a.getLayoutParams();
            if (oVar != null) {
                oVar.f1659c = true;
            }
        }
    }

    public final void O(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int h10 = this.f1590s.h();
        for (int i13 = 0; i13 < h10; i13++) {
            c0 J2 = J(this.f1590s.g(i13));
            if (J2 != null && !J2.o()) {
                int i14 = J2.f1611c;
                if (i14 >= i12) {
                    J2.l(-i11, z10);
                } else if (i14 >= i10) {
                    J2.b(8);
                    J2.l(-i11, z10);
                    J2.f1611c = i10 - 1;
                }
                this.f1595v0.f1691f = true;
            }
        }
        u uVar = this.f1584p;
        ArrayList<c0> arrayList = uVar.f1667c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                c0 c0Var = arrayList.get(size);
                if (c0Var != null) {
                    int i15 = c0Var.f1611c;
                    if (i15 >= i12) {
                        c0Var.l(-i11, z10);
                    } else if (i15 >= i10) {
                        c0Var.b(8);
                        uVar.e(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void P() {
        this.T++;
    }

    public final void Q(boolean z10) {
        int i10;
        boolean z11 = true;
        int i11 = this.T - 1;
        this.T = i11;
        if (i11 < 1) {
            this.T = 0;
            if (z10) {
                int i12 = this.N;
                this.N = 0;
                if (i12 != 0) {
                    AccessibilityManager accessibilityManager = this.P;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z11 = false;
                    }
                    if (z11) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        obtain.setContentChangeTypes(i12);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.I0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c0 c0Var = (c0) arrayList.get(size);
                    if (c0Var.f1609a.getParent() == this && !c0Var.o() && (i10 = c0Var.f1623q) != -1) {
                        WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
                        w.d.s(c0Var.f1609a, i10);
                        c0Var.f1623q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1573f0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f1573f0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f1577j0 = x10;
            this.f1575h0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f1578k0 = y10;
            this.f1576i0 = y10;
        }
    }

    public final void S() {
        if (!this.B0 && this.G) {
            WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
            w.d.m(this, this.J0);
            this.B0 = true;
        }
    }

    public final void T() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (this.R) {
            a aVar = this.f1588r;
            aVar.l(aVar.f1735b);
            aVar.l(aVar.f1736c);
            aVar.f1738f = 0;
            if (this.S) {
                this.A.Z();
            }
        }
        if (this.f1571d0 == null || !this.A.C0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f1588r.j();
        } else {
            this.f1588r.c();
        }
        if (this.y0 || this.f1599z0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.I || this.f1571d0 == null || ((!(z14 = this.R) && !z11 && !this.A.f1643f) || (z14 && !this.z.f1629b))) {
            z12 = false;
        } else {
            z12 = true;
        }
        z zVar = this.f1595v0;
        zVar.f1695j = z12;
        if (z12 && z11 && !this.R) {
            if (this.f1571d0 == null || !this.A.C0()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z13) {
                z15 = true;
            }
        }
        zVar.f1696k = z15;
    }

    public final void U(boolean z10) {
        this.S = z10 | this.S;
        this.R = true;
        int h10 = this.f1590s.h();
        for (int i10 = 0; i10 < h10; i10++) {
            c0 J2 = J(this.f1590s.g(i10));
            if (J2 != null && !J2.o()) {
                J2.b(6);
            }
        }
        N();
        u uVar = this.f1584p;
        ArrayList<c0> arrayList = uVar.f1667c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c0 c0Var = arrayList.get(i11);
            if (c0Var != null) {
                c0Var.b(6);
                c0Var.a((Object) null);
            }
        }
        f fVar = RecyclerView.this.z;
        if (fVar == null || !fVar.f1629b) {
            uVar.d();
        }
    }

    public final void V(c0 c0Var, k.c cVar) {
        boolean z10 = false;
        int i10 = (c0Var.f1617j & -8193) | 0;
        c0Var.f1617j = i10;
        boolean z11 = this.f1595v0.f1693h;
        c0 c0Var2 = this.f1592t;
        if (z11) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if (z10 && !c0Var.i() && !c0Var.o()) {
                c0Var2.f1760b.i(H(c0Var), c0Var);
            }
        }
        n.i<c0, c0.a> iVar = c0Var2.f1759a;
        c0.a orDefault = iVar.getOrDefault(c0Var, null);
        if (orDefault == null) {
            orDefault = c0.a.a();
            iVar.put(c0Var, orDefault);
        }
        orDefault.f1762b = cVar;
        orDefault.f1761a |= 4;
    }

    public final void W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.w;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o) {
            o oVar = (o) layoutParams;
            if (!oVar.f1659c) {
                int i10 = rect.left;
                Rect rect2 = oVar.f1658b;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.A.n0(this, view, this.w, !this.I, view2 == null);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.f1574g0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        f0(0);
        EdgeEffect edgeEffect = this.W;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1568a0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f1568a0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1569b0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f1569b0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1570c0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f1570c0.isFinished();
        }
        if (z10) {
            WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
            w.d.k(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Y(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            r18.m()
            androidx.recyclerview.widget.RecyclerView$f r0 = r8.z
            int[] r11 = r8.H0
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0027
            r11[r13] = r13
            r11[r12] = r13
            r8.Z(r9, r10, r11)
            r0 = r11[r13]
            r1 = r11[r12]
            int r2 = r9 - r0
            int r3 = r10 - r1
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            goto L_0x002d
        L_0x0027:
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L_0x002d:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$m> r0 = r8.D
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r18.invalidate()
        L_0x0038:
            int[] r7 = r8.H0
            r7[r13] = r13
            r7[r12] = r13
            int[] r5 = r8.F0
            r0 = r18
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r22
            r0.t(r1, r2, r3, r4, r5, r6, r7)
            r0 = r11[r13]
            int r1 = r16 - r0
            r2 = r11[r12]
            int r3 = r17 - r2
            if (r0 != 0) goto L_0x005c
            if (r2 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r0 = r13
            goto L_0x005d
        L_0x005c:
            r0 = r12
        L_0x005d:
            int r2 = r8.f1577j0
            int[] r4 = r8.F0
            r5 = r4[r13]
            int r2 = r2 - r5
            r8.f1577j0 = r2
            int r2 = r8.f1578k0
            r4 = r4[r12]
            int r2 = r2 - r4
            r8.f1578k0 = r2
            int[] r2 = r8.G0
            r6 = r2[r13]
            int r6 = r6 + r5
            r2[r13] = r6
            r5 = r2[r12]
            int r5 = r5 + r4
            r2[r12] = r5
            int r2 = r18.getOverScrollMode()
            r4 = 2
            if (r2 == r4) goto L_0x0119
            if (r21 == 0) goto L_0x0116
            int r2 = r21.getSource()
            r4 = 8194(0x2002, float:1.1482E-41)
            r2 = r2 & r4
            if (r2 != r4) goto L_0x008d
            r2 = r12
            goto L_0x008e
        L_0x008d:
            r2 = r13
        L_0x008e:
            if (r2 != 0) goto L_0x0116
            float r2 = r21.getX()
            float r1 = (float) r1
            float r4 = r21.getY()
            float r3 = (float) r3
            r5 = 0
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 >= 0) goto L_0x00b6
            r18.w()
            android.widget.EdgeEffect r6 = r8.W
            float r11 = -r1
            int r12 = r18.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            float r4 = r7 - r4
            goto L_0x00cc
        L_0x00b6:
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d1
            r18.x()
            android.widget.EdgeEffect r6 = r8.f1569b0
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r11 = r1 / r11
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
        L_0x00cc:
            r6.onPull(r11, r4)
            r4 = 1
            goto L_0x00d2
        L_0x00d1:
            r4 = r13
        L_0x00d2:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ec
            r18.y()
            android.widget.EdgeEffect r4 = r8.f1568a0
            float r6 = -r3
            int r7 = r18.getHeight()
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r18.getWidth()
            float r7 = (float) r7
            float r2 = r2 / r7
            r4.onPull(r6, r2)
            goto L_0x0106
        L_0x00ec:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0107
            r18.v()
            android.widget.EdgeEffect r4 = r8.f1570c0
            int r6 = r18.getHeight()
            float r6 = (float) r6
            float r6 = r3 / r6
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r2 = r2 / r11
            float r7 = r7 - r2
            r4.onPull(r6, r7)
        L_0x0106:
            r4 = 1
        L_0x0107:
            if (r4 != 0) goto L_0x0111
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0111
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0116
        L_0x0111:
            java.util.WeakHashMap<android.view.View, i0.b0> r1 = i0.w.f6004a
            i0.w.d.k(r18)
        L_0x0116:
            r18.l(r19, r20)
        L_0x0119:
            if (r14 != 0) goto L_0x011d
            if (r15 == 0) goto L_0x0120
        L_0x011d:
            r8.u(r14, r15)
        L_0x0120:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x0129
            r18.invalidate()
        L_0x0129:
            if (r0 != 0) goto L_0x0132
            if (r14 != 0) goto L_0x0132
            if (r15 == 0) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            r12 = r13
            goto L_0x0133
        L_0x0132:
            r12 = 1
        L_0x0133:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void Z(int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        c0 c0Var;
        d0();
        P();
        int i14 = e0.d.f4446a;
        Trace.beginSection("RV Scroll");
        z zVar = this.f1595v0;
        A(zVar);
        u uVar = this.f1584p;
        if (i10 != 0) {
            i12 = this.A.p0(i10, uVar, zVar);
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = this.A.r0(i11, uVar, zVar);
        } else {
            i13 = 0;
        }
        Trace.endSection();
        int e10 = this.f1590s.e();
        for (int i15 = 0; i15 < e10; i15++) {
            View d10 = this.f1590s.d(i15);
            c0 I2 = I(d10);
            if (!(I2 == null || (c0Var = I2.f1616i) == null)) {
                int left = d10.getLeft();
                int top = d10.getTop();
                View view = c0Var.f1609a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        e0(false);
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i13;
        }
    }

    public final void a0(int i10) {
        y yVar;
        if (!this.L) {
            setScrollState(0);
            b0 b0Var = this.f1591s0;
            RecyclerView.this.removeCallbacks(b0Var);
            b0Var.f1604q.abortAnimation();
            n nVar = this.A;
            if (!(nVar == null || (yVar = nVar.f1642e) == null)) {
                yVar.d();
            }
            n nVar2 = this.A;
            if (nVar2 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            nVar2.q0(i10);
            awakenScrollBars();
        }
    }

    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        n nVar = this.A;
        if (nVar != null) {
            nVar.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0(int i10, int i11, boolean z10) {
        n nVar = this.A;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.L) {
            int i12 = 0;
            if (!nVar.d()) {
                i10 = 0;
            }
            if (!this.A.e()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                if (z10) {
                    if (i10 != 0) {
                        i12 = 1;
                    }
                    if (i11 != 0) {
                        i12 |= 2;
                    }
                    getScrollingChildHelper().g(i12, 1);
                }
                this.f1591s0.b(i10, i11, Integer.MIN_VALUE, (Interpolator) null);
            }
        }
    }

    public final void c0(int i10) {
        if (!this.L) {
            n nVar = this.A;
            if (nVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                nVar.A0(this, i10);
            }
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o) && this.A.f((o) layoutParams);
    }

    public final int computeHorizontalScrollExtent() {
        n nVar = this.A;
        if (nVar != null && nVar.d()) {
            return this.A.j(this.f1595v0);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        n nVar = this.A;
        if (nVar != null && nVar.d()) {
            return this.A.k(this.f1595v0);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        n nVar = this.A;
        if (nVar != null && nVar.d()) {
            return this.A.l(this.f1595v0);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        n nVar = this.A;
        if (nVar != null && nVar.e()) {
            return this.A.m(this.f1595v0);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        n nVar = this.A;
        if (nVar != null && nVar.e()) {
            return this.A.n(this.f1595v0);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        n nVar = this.A;
        if (nVar != null && nVar.e()) {
            return this.A.o(this.f1595v0);
        }
        return 0;
    }

    public final void d0() {
        int i10 = this.J + 1;
        this.J = i10;
        if (i10 == 1 && !this.L) {
            this.K = false;
        }
    }

    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        super.draw(canvas);
        ArrayList<m> arrayList = this.D;
        int size = arrayList.size();
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12).f(canvas);
        }
        EdgeEffect edgeEffect = this.W;
        boolean z14 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            if (this.u) {
                i11 = getPaddingBottom();
            } else {
                i11 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i11), 0.0f);
            EdgeEffect edgeEffect2 = this.W;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z10 = false;
            } else {
                z10 = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1568a0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.u) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1568a0;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z12 = false;
            } else {
                z12 = true;
            }
            z10 |= z12;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1569b0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.u) {
                i10 = getPaddingTop();
            } else {
                i10 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) i10, (float) (-width));
            EdgeEffect edgeEffect6 = this.f1569b0;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z11 = false;
            } else {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1570c0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.u) {
                f11 = (float) (getPaddingRight() + (-getWidth()));
                f10 = (float) (getPaddingBottom() + (-getHeight()));
            } else {
                f11 = (float) (-getWidth());
                f10 = (float) (-getHeight());
            }
            canvas.translate(f11, f10);
            EdgeEffect edgeEffect8 = this.f1570c0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.f1571d0 == null || arrayList.size() <= 0 || !this.f1571d0.f()) {
            z14 = z10;
        }
        if (z14) {
            WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
            w.d.k(this);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j8) {
        return super.drawChild(canvas, view, j8);
    }

    public final void e0(boolean z10) {
        if (this.J < 1) {
            this.J = 1;
        }
        if (!z10 && !this.L) {
            this.K = false;
        }
        if (this.J == 1) {
            if (z10 && this.K && !this.L && this.A != null && this.z != null) {
                p();
            }
            if (!this.L) {
                this.K = false;
            }
        }
        this.J--;
    }

    public final void f(c0 c0Var) {
        boolean z10;
        View view = c0Var.f1609a;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1584p.j(I(view));
        if (c0Var.k()) {
            this.f1590s.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        b bVar = this.f1590s;
        if (!z10) {
            bVar.a(view, -1, true);
            return;
        }
        int indexOfChild = ((v) bVar.f1746a).f1865a.indexOfChild(view);
        if (indexOfChild >= 0) {
            bVar.f1747b.h(indexOfChild);
            bVar.i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final void f0(int i10) {
        getScrollingChildHelper().h(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x015a, code lost:
        if (r4 > 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0178, code lost:
        if (r3 > 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x017b, code lost:
        if (r4 < 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x017e, code lost:
        if (r3 < 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0186, code lost:
        if ((r3 * r2) <= 0) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x018e, code lost:
        if ((r3 * r2) >= 0) goto L_0x0191;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$n r0 = r13.A
            r0.getClass()
            androidx.recyclerview.widget.RecyclerView$f r0 = r13.z
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            androidx.recyclerview.widget.RecyclerView$n r0 = r13.A
            if (r0 == 0) goto L_0x001b
            boolean r0 = r13.L()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r13.L
            if (r0 != 0) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            androidx.recyclerview.widget.RecyclerView$z r4 = r13.f1595v0
            androidx.recyclerview.widget.RecyclerView$u r5 = r13.f1584p
            r6 = 33
            r7 = 17
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x008d
            if (r15 == r9) goto L_0x0030
            if (r15 != r1) goto L_0x008d
        L_0x0030:
            androidx.recyclerview.widget.RecyclerView$n r0 = r13.A
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0046
            if (r15 != r9) goto L_0x003d
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003e
        L_0x003d:
            r0 = r6
        L_0x003e:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0046
            r0 = r1
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            if (r0 != 0) goto L_0x0071
            androidx.recyclerview.widget.RecyclerView$n r10 = r13.A
            boolean r10 = r10.d()
            if (r10 == 0) goto L_0x0071
            androidx.recyclerview.widget.RecyclerView$n r0 = r13.A
            int r0 = r0.A()
            if (r0 != r1) goto L_0x005b
            r0 = r1
            goto L_0x005c
        L_0x005b:
            r0 = r2
        L_0x005c:
            if (r15 != r9) goto L_0x0060
            r10 = r1
            goto L_0x0061
        L_0x0060:
            r10 = r2
        L_0x0061:
            r0 = r0 ^ r10
            if (r0 == 0) goto L_0x0067
            r0 = 66
            goto L_0x0068
        L_0x0067:
            r0 = r7
        L_0x0068:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0070
            r0 = r1
            goto L_0x0071
        L_0x0070:
            r0 = r2
        L_0x0071:
            if (r0 == 0) goto L_0x0088
            r13.m()
            android.view.View r0 = r13.B(r14)
            if (r0 != 0) goto L_0x007d
            return r8
        L_0x007d:
            r13.d0()
            androidx.recyclerview.widget.RecyclerView$n r0 = r13.A
            r0.T(r14, r15, r5, r4)
            r13.e0(r2)
        L_0x0088:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00ad
        L_0x008d:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00ac
            if (r0 == 0) goto L_0x00ac
            r13.m()
            android.view.View r0 = r13.B(r14)
            if (r0 != 0) goto L_0x009f
            return r8
        L_0x009f:
            r13.d0()
            androidx.recyclerview.widget.RecyclerView$n r0 = r13.A
            android.view.View r0 = r0.T(r14, r15, r5, r4)
            r13.e0(r2)
            goto L_0x00ad
        L_0x00ac:
            r0 = r3
        L_0x00ad:
            if (r0 == 0) goto L_0x00c4
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00c4
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00c0
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00c0:
            r13.W(r0, r8)
            return r14
        L_0x00c4:
            if (r0 == 0) goto L_0x0191
            if (r0 == r13) goto L_0x0191
            if (r0 != r14) goto L_0x00cc
            goto L_0x0191
        L_0x00cc:
            android.view.View r3 = r13.B(r0)
            if (r3 != 0) goto L_0x00d5
            r1 = r2
            goto L_0x0192
        L_0x00d5:
            if (r14 != 0) goto L_0x00d9
            goto L_0x0192
        L_0x00d9:
            android.view.View r3 = r13.B(r14)
            if (r3 != 0) goto L_0x00e1
            goto L_0x0192
        L_0x00e1:
            int r3 = r14.getWidth()
            int r4 = r14.getHeight()
            android.graphics.Rect r5 = r13.w
            r5.set(r2, r2, r3, r4)
            int r3 = r0.getWidth()
            int r4 = r0.getHeight()
            android.graphics.Rect r8 = r13.f1597x
            r8.set(r2, r2, r3, r4)
            r13.offsetDescendantRectToMyCoords(r14, r5)
            r13.offsetDescendantRectToMyCoords(r0, r8)
            androidx.recyclerview.widget.RecyclerView$n r2 = r13.A
            int r2 = r2.A()
            if (r2 != r1) goto L_0x010b
            r2 = -1
            goto L_0x010c
        L_0x010b:
            r2 = r1
        L_0x010c:
            int r3 = r5.left
            int r4 = r8.left
            if (r3 < r4) goto L_0x0116
            int r10 = r5.right
            if (r10 > r4) goto L_0x011e
        L_0x0116:
            int r10 = r5.right
            int r11 = r8.right
            if (r10 >= r11) goto L_0x011e
            r3 = r1
            goto L_0x012b
        L_0x011e:
            int r10 = r5.right
            int r11 = r8.right
            if (r10 > r11) goto L_0x0126
            if (r3 < r11) goto L_0x012a
        L_0x0126:
            if (r3 <= r4) goto L_0x012a
            r3 = -1
            goto L_0x012b
        L_0x012a:
            r3 = 0
        L_0x012b:
            int r4 = r5.top
            int r10 = r8.top
            if (r4 < r10) goto L_0x0135
            int r11 = r5.bottom
            if (r11 > r10) goto L_0x013d
        L_0x0135:
            int r11 = r5.bottom
            int r12 = r8.bottom
            if (r11 >= r12) goto L_0x013d
            r4 = r1
            goto L_0x014a
        L_0x013d:
            int r5 = r5.bottom
            int r8 = r8.bottom
            if (r5 > r8) goto L_0x0145
            if (r4 < r8) goto L_0x0149
        L_0x0145:
            if (r4 <= r10) goto L_0x0149
            r4 = -1
            goto L_0x014a
        L_0x0149:
            r4 = 0
        L_0x014a:
            if (r15 == r1) goto L_0x0189
            if (r15 == r9) goto L_0x0181
            if (r15 == r7) goto L_0x017e
            if (r15 == r6) goto L_0x017b
            r2 = 66
            if (r15 == r2) goto L_0x0178
            r2 = 130(0x82, float:1.82E-43)
            if (r15 != r2) goto L_0x015d
            if (r4 <= 0) goto L_0x0191
            goto L_0x0192
        L_0x015d:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid direction: "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r15 = r13.z()
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            r14.<init>(r15)
            throw r14
        L_0x0178:
            if (r3 <= 0) goto L_0x0191
            goto L_0x0192
        L_0x017b:
            if (r4 >= 0) goto L_0x0191
            goto L_0x0192
        L_0x017e:
            if (r3 >= 0) goto L_0x0191
            goto L_0x0192
        L_0x0181:
            if (r4 > 0) goto L_0x0192
            if (r4 != 0) goto L_0x0191
            int r3 = r3 * r2
            if (r3 <= 0) goto L_0x0191
            goto L_0x0192
        L_0x0189:
            if (r4 < 0) goto L_0x0192
            if (r4 != 0) goto L_0x0191
            int r3 = r3 * r2
            if (r3 >= 0) goto L_0x0191
            goto L_0x0192
        L_0x0191:
            r1 = 0
        L_0x0192:
            if (r1 == 0) goto L_0x0195
            goto L_0x0199
        L_0x0195:
            android.view.View r0 = super.focusSearch(r14, r15)
        L_0x0199:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(m mVar) {
        n nVar = this.A;
        if (nVar != null) {
            nVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<m> arrayList = this.D;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(mVar);
        N();
        requestLayout();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n nVar = this.A;
        if (nVar != null) {
            return nVar.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        n nVar = this.A;
        if (nVar != null) {
            return nVar.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n nVar = this.A;
        if (nVar != null) {
            return nVar.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public f getAdapter() {
        return this.z;
    }

    public int getBaseline() {
        n nVar = this.A;
        if (nVar == null) {
            return super.getBaseline();
        }
        nVar.getClass();
        return -1;
    }

    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    public boolean getClipToPadding() {
        return this.u;
    }

    public x getCompatAccessibilityDelegate() {
        return this.C0;
    }

    public j getEdgeEffectFactory() {
        return this.V;
    }

    public k getItemAnimator() {
        return this.f1571d0;
    }

    public int getItemDecorationCount() {
        return this.D.size();
    }

    public n getLayoutManager() {
        return this.A;
    }

    public int getMaxFlingVelocity() {
        return this.f1583o0;
    }

    public int getMinFlingVelocity() {
        return this.f1581n0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public q getOnFlingListener() {
        return this.f1580m0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1589r0;
    }

    public t getRecycledViewPool() {
        return this.f1584p.c();
    }

    public int getScrollState() {
        return this.f1572e0;
    }

    public final void h(s sVar) {
        if (this.x0 == null) {
            this.x0 = new ArrayList();
        }
        this.x0.add(sVar);
    }

    public final boolean hasNestedScrollingParent() {
        if (getScrollingChildHelper().f(0) != null) {
            return true;
        }
        return false;
    }

    public final void i(String str) {
        if (L()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + z());
            }
            throw new IllegalStateException(str);
        } else if (this.U > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.FLAVOR + z()));
        }
    }

    public final boolean isAttachedToWindow() {
        return this.G;
    }

    public final boolean isLayoutSuppressed() {
        return this.L;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        int h10 = this.f1590s.h();
        for (int i10 = 0; i10 < h10; i10++) {
            c0 J2 = J(this.f1590s.g(i10));
            if (!J2.o()) {
                J2.d = -1;
                J2.f1614g = -1;
            }
        }
        u uVar = this.f1584p;
        ArrayList<c0> arrayList = uVar.f1667c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c0 c0Var = arrayList.get(i11);
            c0Var.d = -1;
            c0Var.f1614g = -1;
        }
        ArrayList<c0> arrayList2 = uVar.f1665a;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            c0 c0Var2 = arrayList2.get(i12);
            c0Var2.d = -1;
            c0Var2.f1614g = -1;
        }
        ArrayList<c0> arrayList3 = uVar.f1666b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                c0 c0Var3 = uVar.f1666b.get(i13);
                c0Var3.d = -1;
                c0Var3.f1614g = -1;
            }
        }
    }

    public final void l(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.W;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.W.onRelease();
            z10 = this.W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1569b0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f1569b0.onRelease();
            z10 |= this.f1569b0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1568a0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f1568a0.onRelease();
            z10 |= this.f1568a0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1570c0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f1570c0.onRelease();
            z10 |= this.f1570c0.isFinished();
        }
        if (z10) {
            WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
            w.d.k(this);
        }
    }

    public final void m() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (!this.I || this.R) {
            int i10 = e0.d.f4446a;
            Trace.beginSection("RV FullInvalidate");
            p();
            Trace.endSection();
        } else if (this.f1588r.g()) {
            a aVar = this.f1588r;
            int i11 = aVar.f1738f;
            boolean z13 = false;
            if ((4 & i11) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if ((i11 & 11) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    int i12 = e0.d.f4446a;
                    Trace.beginSection("RV PartialInvalidate");
                    d0();
                    P();
                    this.f1588r.j();
                    if (!this.K) {
                        int e10 = this.f1590s.e();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= e10) {
                                break;
                            }
                            c0 J2 = J(this.f1590s.d(i13));
                            if (J2 != null && !J2.o()) {
                                if ((J2.f1617j & 2) != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    z13 = true;
                                    break;
                                }
                            }
                            i13++;
                        }
                        if (z13) {
                            p();
                        } else {
                            this.f1588r.b();
                        }
                    }
                    e0(true);
                    Q(true);
                    Trace.endSection();
                }
            }
            if (aVar.g()) {
                int i14 = e0.d.f4446a;
                Trace.beginSection("RV FullInvalidate");
                p();
                Trace.endSection();
            }
        }
    }

    public final void n(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
        setMeasuredDimension(n.g(i10, paddingRight, w.d.e(this)), n.g(i11, getPaddingBottom() + getPaddingTop(), w.d.d(this)));
    }

    public final void o(View view) {
        J(view);
        f fVar = this.z;
        ArrayList arrayList = this.Q;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((p) this.Q.get(size)).b();
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r1 >= 30.0f) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.T = r0
            r1 = 1
            r5.G = r1
            boolean r2 = r5.I
            if (r2 == 0) goto L_0x0015
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0015
            r2 = r1
            goto L_0x0016
        L_0x0015:
            r2 = r0
        L_0x0016:
            r5.I = r2
            androidx.recyclerview.widget.RecyclerView$n r2 = r5.A
            if (r2 == 0) goto L_0x001e
            r2.f1644g = r1
        L_0x001e:
            r5.B0 = r0
            java.lang.ThreadLocal<androidx.recyclerview.widget.m> r0 = androidx.recyclerview.widget.m.f1831s
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.m r1 = (androidx.recyclerview.widget.m) r1
            r5.t0 = r1
            if (r1 != 0) goto L_0x005a
            androidx.recyclerview.widget.m r1 = new androidx.recyclerview.widget.m
            r1.<init>()
            r5.t0 = r1
            java.util.WeakHashMap<android.view.View, i0.b0> r1 = i0.w.f6004a
            android.view.Display r1 = i0.w.e.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x004c
            if (r1 == 0) goto L_0x004c
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x004e:
            androidx.recyclerview.widget.m r2 = r5.t0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f1835q = r3
            r0.set(r2)
        L_0x005a:
            androidx.recyclerview.widget.m r0 = r5.t0
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f1833o
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public final void onDetachedFromWindow() {
        y yVar;
        super.onDetachedFromWindow();
        k kVar = this.f1571d0;
        if (kVar != null) {
            kVar.e();
        }
        setScrollState(0);
        b0 b0Var = this.f1591s0;
        RecyclerView.this.removeCallbacks(b0Var);
        b0Var.f1604q.abortAnimation();
        n nVar = this.A;
        if (!(nVar == null || (yVar = nVar.f1642e) == null)) {
            yVar.d();
        }
        this.G = false;
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.f1644g = false;
            nVar2.S(this);
        }
        this.I0.clear();
        removeCallbacks(this.J0);
        this.f1592t.getClass();
        do {
        } while (c0.a.d.b() != null);
        m mVar = this.t0;
        if (mVar != null) {
            mVar.f1833o.remove(this);
            this.t0 = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<m> arrayList = this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).e(canvas, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r16) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
            androidx.recyclerview.widget.RecyclerView$n r0 = r6.A
            r8 = 0
            if (r0 != 0) goto L_0x0009
            return r8
        L_0x0009:
            boolean r0 = r6.L
            if (r0 == 0) goto L_0x000e
            return r8
        L_0x000e:
            int r0 = r16.getAction()
            r1 = 8
            if (r0 != r1) goto L_0x00dc
            int r0 = r16.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L_0x003f
            androidx.recyclerview.widget.RecyclerView$n r0 = r6.A
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x002f
            r0 = 9
            float r0 = r7.getAxisValue(r0)
            float r0 = -r0
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            androidx.recyclerview.widget.RecyclerView$n r2 = r6.A
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x0057
            r2 = 10
            float r2 = r7.getAxisValue(r2)
            goto L_0x0065
        L_0x003f:
            int r0 = r16.getSource()
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0063
            r0 = 26
            float r2 = r7.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$n r0 = r6.A
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0059
            float r0 = -r2
        L_0x0057:
            r2 = r1
            goto L_0x0065
        L_0x0059:
            androidx.recyclerview.widget.RecyclerView$n r0 = r6.A
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0063
            r0 = r1
            goto L_0x0065
        L_0x0063:
            r0 = r1
            r2 = r0
        L_0x0065:
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x006d
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00dc
        L_0x006d:
            float r1 = r6.f1585p0
            float r2 = r2 * r1
            int r9 = (int) r2
            float r1 = r6.f1587q0
            float r0 = r0 * r1
            int r10 = (int) r0
            androidx.recyclerview.widget.RecyclerView$n r0 = r6.A
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r0, r1)
            goto L_0x00dc
        L_0x0082:
            boolean r1 = r6.L
            if (r1 == 0) goto L_0x0087
            goto L_0x00dc
        L_0x0087:
            int[] r11 = r6.H0
            r11[r8] = r8
            r12 = 1
            r11[r12] = r8
            boolean r13 = r0.d()
            androidx.recyclerview.widget.RecyclerView$n r0 = r6.A
            boolean r14 = r0.e()
            if (r14 == 0) goto L_0x009d
            r0 = r13 | 2
            goto L_0x009e
        L_0x009d:
            r0 = r13
        L_0x009e:
            i0.k r1 = r15.getScrollingChildHelper()
            r1.g(r0, r12)
            if (r13 == 0) goto L_0x00a9
            r1 = r9
            goto L_0x00aa
        L_0x00a9:
            r1 = r8
        L_0x00aa:
            if (r14 == 0) goto L_0x00ae
            r2 = r10
            goto L_0x00af
        L_0x00ae:
            r2 = r8
        L_0x00af:
            int[] r3 = r6.H0
            int[] r4 = r6.F0
            r5 = 1
            r0 = r15
            boolean r0 = r0.s(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00c1
            r0 = r11[r8]
            int r9 = r9 - r0
            r0 = r11[r12]
            int r10 = r10 - r0
        L_0x00c1:
            if (r13 == 0) goto L_0x00c5
            r0 = r9
            goto L_0x00c6
        L_0x00c5:
            r0 = r8
        L_0x00c6:
            if (r14 == 0) goto L_0x00ca
            r1 = r10
            goto L_0x00cb
        L_0x00ca:
            r1 = r8
        L_0x00cb:
            r15.Y(r0, r1, r7, r12)
            androidx.recyclerview.widget.m r0 = r6.t0
            if (r0 == 0) goto L_0x00d9
            if (r9 != 0) goto L_0x00d6
            if (r10 == 0) goto L_0x00d9
        L_0x00d6:
            r0.a(r15, r9, r10)
        L_0x00d9:
            r15.f0(r12)
        L_0x00dc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.L) {
            return false;
        }
        this.F = null;
        if (C(motionEvent)) {
            X();
            setScrollState(0);
            return true;
        }
        n nVar = this.A;
        if (nVar == null) {
            return false;
        }
        boolean d10 = nVar.d();
        boolean e10 = this.A.e();
        if (this.f1574g0 == null) {
            this.f1574g0 = VelocityTracker.obtain();
        }
        this.f1574g0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.M) {
                this.M = false;
            }
            this.f1573f0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f1577j0 = x10;
            this.f1575h0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f1578k0 = y10;
            this.f1576i0 = y10;
            if (this.f1572e0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                f0(1);
            }
            int[] iArr = this.G0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (e10) {
                d10 |= true;
            }
            getScrollingChildHelper().g(d10 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f1574g0.clear();
            f0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1573f0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1573f0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1572e0 != 1) {
                int i10 = x11 - this.f1575h0;
                int i11 = y11 - this.f1576i0;
                if (!d10 || Math.abs(i10) <= this.f1579l0) {
                    z10 = false;
                } else {
                    this.f1577j0 = x11;
                    z10 = true;
                }
                if (e10 && Math.abs(i11) > this.f1579l0) {
                    this.f1578k0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            X();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f1573f0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1577j0 = x12;
            this.f1575h0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1578k0 = y12;
            this.f1576i0 = y12;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        if (this.f1572e0 == 1) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = e0.d.f4446a;
        Trace.beginSection("RV OnLayout");
        p();
        Trace.endSection();
        this.I = true;
    }

    public final void onMeasure(int i10, int i11) {
        n nVar = this.A;
        if (nVar == null) {
            n(i10, i11);
            return;
        }
        boolean M2 = nVar.M();
        boolean z10 = false;
        z zVar = this.f1595v0;
        if (M2) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.A.f1640b.n(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.K0 = z10;
            if (!z10 && this.z != null) {
                if (zVar.d == 1) {
                    q();
                }
                this.A.t0(i10, i11);
                zVar.f1694i = true;
                r();
                this.A.v0(i10, i11);
                if (this.A.y0()) {
                    this.A.t0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    zVar.f1694i = true;
                    r();
                    this.A.v0(i10, i11);
                }
                this.L0 = getMeasuredWidth();
                this.M0 = getMeasuredHeight();
            }
        } else if (this.H) {
            this.A.f1640b.n(i10, i11);
        } else {
            if (this.O) {
                d0();
                P();
                T();
                Q(true);
                if (zVar.f1696k) {
                    zVar.f1692g = true;
                } else {
                    this.f1588r.c();
                    zVar.f1692g = false;
                }
                this.O = false;
                e0(false);
            } else if (zVar.f1696k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            f fVar = this.z;
            if (fVar != null) {
                zVar.f1690e = fVar.a();
            } else {
                zVar.f1690e = 0;
            }
            d0();
            this.A.f1640b.n(i10, i11);
            e0(false);
            zVar.f1692g = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.f1586q = xVar;
        super.onRestoreInstanceState(xVar.f7340o);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.f1586q;
        if (xVar2 != null) {
            xVar.f1673q = xVar2.f1673q;
        } else {
            n nVar = this.A;
            if (nVar != null) {
                parcelable = nVar.g0();
            } else {
                parcelable = null;
            }
            xVar.f1673q = parcelable;
        }
        return xVar;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            this.f1570c0 = null;
            this.f1568a0 = null;
            this.f1569b0 = null;
            this.W = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0336, code lost:
        if (r0 < r8) goto L_0x0339;
     */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r26) {
        /*
            r25 = this;
            r6 = r25
            r7 = r26
            boolean r0 = r6.L
            r8 = 0
            if (r0 != 0) goto L_0x03f6
            boolean r0 = r6.M
            if (r0 == 0) goto L_0x000f
            goto L_0x03f6
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$r r0 = r6.F
            r1 = 0
            r9 = 1
            r2 = 3
            if (r0 != 0) goto L_0x0023
            int r0 = r26.getAction()
            if (r0 != 0) goto L_0x001e
            r0 = r8
            goto L_0x0031
        L_0x001e:
            boolean r0 = r25.C(r26)
            goto L_0x0031
        L_0x0023:
            r0.a(r7)
            int r0 = r26.getAction()
            if (r0 == r2) goto L_0x002e
            if (r0 != r9) goto L_0x0030
        L_0x002e:
            r6.F = r1
        L_0x0030:
            r0 = r9
        L_0x0031:
            if (r0 == 0) goto L_0x003a
            r25.X()
            r6.setScrollState(r8)
            return r9
        L_0x003a:
            androidx.recyclerview.widget.RecyclerView$n r0 = r6.A
            if (r0 != 0) goto L_0x003f
            return r8
        L_0x003f:
            boolean r10 = r0.d()
            androidx.recyclerview.widget.RecyclerView$n r0 = r6.A
            boolean r11 = r0.e()
            android.view.VelocityTracker r0 = r6.f1574g0
            if (r0 != 0) goto L_0x0053
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f1574g0 = r0
        L_0x0053:
            int r0 = r26.getActionMasked()
            int r3 = r26.getActionIndex()
            int[] r12 = r6.G0
            if (r0 != 0) goto L_0x0063
            r12[r9] = r8
            r12[r8] = r8
        L_0x0063:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r26)
            r4 = r12[r8]
            float r4 = (float) r4
            r5 = r12[r9]
            float r5 = (float) r5
            r13.offsetLocation(r4, r5)
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x03ba
            r5 = 2
            java.lang.String r14 = "RecyclerView"
            if (r0 == r9) goto L_0x0193
            if (r0 == r5) goto L_0x00ae
            if (r0 == r2) goto L_0x00a6
            r1 = 5
            if (r0 == r1) goto L_0x008a
            r1 = 6
            if (r0 == r1) goto L_0x0085
            goto L_0x018e
        L_0x0085:
            r25.R(r26)
            goto L_0x018e
        L_0x008a:
            int r0 = r7.getPointerId(r3)
            r6.f1573f0 = r0
            float r0 = r7.getX(r3)
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.f1577j0 = r0
            r6.f1575h0 = r0
            float r0 = r7.getY(r3)
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.f1578k0 = r0
            r6.f1576i0 = r0
            goto L_0x018e
        L_0x00a6:
            r25.X()
            r6.setScrollState(r8)
            goto L_0x018e
        L_0x00ae:
            int r0 = r6.f1573f0
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00cf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.<init>(r1)
            int r1 = r6.f1573f0
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r14, r0)
            return r8
        L_0x00cf:
            float r1 = r7.getX(r0)
            float r1 = r1 + r4
            int r14 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r4
            int r15 = (int) r0
            int r0 = r6.f1577j0
            int r0 = r0 - r14
            int r1 = r6.f1578k0
            int r1 = r1 - r15
            int r2 = r6.f1572e0
            if (r2 == r9) goto L_0x0114
            if (r10 == 0) goto L_0x00fa
            int r2 = r6.f1579l0
            if (r0 <= 0) goto L_0x00f1
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00f6
        L_0x00f1:
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00f6:
            if (r0 == 0) goto L_0x00fa
            r2 = r9
            goto L_0x00fb
        L_0x00fa:
            r2 = r8
        L_0x00fb:
            if (r11 == 0) goto L_0x010f
            int r3 = r6.f1579l0
            if (r1 <= 0) goto L_0x0107
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x010c
        L_0x0107:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x010c:
            if (r1 == 0) goto L_0x010f
            r2 = r9
        L_0x010f:
            if (r2 == 0) goto L_0x0114
            r6.setScrollState(r9)
        L_0x0114:
            r16 = r0
            r17 = r1
            int r0 = r6.f1572e0
            if (r0 != r9) goto L_0x018e
            int[] r5 = r6.H0
            r5[r8] = r8
            r5[r9] = r8
            if (r10 == 0) goto L_0x0127
            r1 = r16
            goto L_0x0128
        L_0x0127:
            r1 = r8
        L_0x0128:
            if (r11 == 0) goto L_0x012d
            r2 = r17
            goto L_0x012e
        L_0x012d:
            r2 = r8
        L_0x012e:
            int[] r4 = r6.F0
            r18 = 0
            r0 = r25
            r3 = r5
            r19 = r5
            r5 = r18
            boolean r0 = r0.s(r1, r2, r3, r4, r5)
            int[] r1 = r6.F0
            if (r0 == 0) goto L_0x015e
            r0 = r19[r8]
            int r16 = r16 - r0
            r0 = r19[r9]
            int r17 = r17 - r0
            r0 = r12[r8]
            r2 = r1[r8]
            int r0 = r0 + r2
            r12[r8] = r0
            r0 = r12[r9]
            r2 = r1[r9]
            int r0 = r0 + r2
            r12[r9] = r0
            android.view.ViewParent r0 = r25.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x015e:
            r0 = r16
            r2 = r17
            r3 = r1[r8]
            int r14 = r14 - r3
            r6.f1577j0 = r14
            r1 = r1[r9]
            int r15 = r15 - r1
            r6.f1578k0 = r15
            if (r10 == 0) goto L_0x0170
            r1 = r0
            goto L_0x0171
        L_0x0170:
            r1 = r8
        L_0x0171:
            if (r11 == 0) goto L_0x0175
            r3 = r2
            goto L_0x0176
        L_0x0175:
            r3 = r8
        L_0x0176:
            boolean r1 = r6.Y(r1, r3, r7, r8)
            if (r1 == 0) goto L_0x0183
            android.view.ViewParent r1 = r25.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0183:
            androidx.recyclerview.widget.m r1 = r6.t0
            if (r1 == 0) goto L_0x018e
            if (r0 != 0) goto L_0x018b
            if (r2 == 0) goto L_0x018e
        L_0x018b:
            r1.a(r6, r0, r2)
        L_0x018e:
            r0 = r6
            r20 = r13
            goto L_0x03e4
        L_0x0193:
            android.view.VelocityTracker r0 = r6.f1574g0
            r0.addMovement(r13)
            android.view.VelocityTracker r0 = r6.f1574g0
            int r2 = r6.f1583o0
            float r3 = (float) r2
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4, r3)
            r0 = 0
            if (r10 == 0) goto L_0x01af
            android.view.VelocityTracker r3 = r6.f1574g0
            int r4 = r6.f1573f0
            float r3 = r3.getXVelocity(r4)
            float r3 = -r3
            goto L_0x01b0
        L_0x01af:
            r3 = r0
        L_0x01b0:
            if (r11 == 0) goto L_0x01bc
            android.view.VelocityTracker r4 = r6.f1574g0
            int r7 = r6.f1573f0
            float r4 = r4.getYVelocity(r7)
            float r4 = -r4
            goto L_0x01bd
        L_0x01bc:
            r4 = r0
        L_0x01bd:
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x01cc
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x01c6
            goto L_0x01cc
        L_0x01c6:
            r0 = r6
            r1 = r8
            r20 = r13
            goto L_0x03b2
        L_0x01cc:
            int r3 = (int) r3
            int r4 = (int) r4
            androidx.recyclerview.widget.RecyclerView$n r7 = r6.A
            if (r7 != 0) goto L_0x01d8
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r14, r0)
            goto L_0x01ff
        L_0x01d8:
            boolean r10 = r6.L
            if (r10 == 0) goto L_0x01dd
            goto L_0x01ff
        L_0x01dd:
            boolean r7 = r7.d()
            androidx.recyclerview.widget.RecyclerView$n r10 = r6.A
            boolean r10 = r10.e()
            int r11 = r6.f1581n0
            if (r7 == 0) goto L_0x01f1
            int r12 = java.lang.Math.abs(r3)
            if (r12 >= r11) goto L_0x01f2
        L_0x01f1:
            r3 = r8
        L_0x01f2:
            if (r10 == 0) goto L_0x01fa
            int r12 = java.lang.Math.abs(r4)
            if (r12 >= r11) goto L_0x01fb
        L_0x01fa:
            r4 = r8
        L_0x01fb:
            if (r3 != 0) goto L_0x0204
            if (r4 != 0) goto L_0x0204
        L_0x01ff:
            r0 = r6
            r20 = r13
            goto L_0x03af
        L_0x0204:
            float r11 = (float) r3
            float r12 = (float) r4
            boolean r14 = r6.dispatchNestedPreFling(r11, r12)
            if (r14 != 0) goto L_0x03ab
            if (r7 != 0) goto L_0x0213
            if (r10 == 0) goto L_0x0211
            goto L_0x0213
        L_0x0211:
            r14 = r8
            goto L_0x0214
        L_0x0213:
            r14 = r9
        L_0x0214:
            r6.dispatchNestedFling(r11, r12, r14)
            androidx.recyclerview.widget.RecyclerView$q r11 = r6.f1580m0
            if (r11 == 0) goto L_0x034f
            androidx.recyclerview.widget.a0 r11 = (androidx.recyclerview.widget.a0) r11
            androidx.recyclerview.widget.RecyclerView r12 = r11.f1742a
            androidx.recyclerview.widget.RecyclerView$n r12 = r12.getLayoutManager()
            if (r12 != 0) goto L_0x0226
            goto L_0x022e
        L_0x0226:
            androidx.recyclerview.widget.RecyclerView r15 = r11.f1742a
            androidx.recyclerview.widget.RecyclerView$f r15 = r15.getAdapter()
            if (r15 != 0) goto L_0x0232
        L_0x022e:
            r20 = r13
            goto L_0x0349
        L_0x0232:
            androidx.recyclerview.widget.RecyclerView r15 = r11.f1742a
            int r15 = r15.getMinFlingVelocity()
            int r1 = java.lang.Math.abs(r4)
            if (r1 > r15) goto L_0x0249
            int r1 = java.lang.Math.abs(r3)
            if (r1 <= r15) goto L_0x0245
            goto L_0x0249
        L_0x0245:
            r20 = r13
            goto L_0x0348
        L_0x0249:
            boolean r1 = r12 instanceof androidx.recyclerview.widget.RecyclerView.y.b
            if (r1 != 0) goto L_0x024e
            goto L_0x0261
        L_0x024e:
            androidx.recyclerview.widget.u r11 = (androidx.recyclerview.widget.u) r11
            if (r1 != 0) goto L_0x0254
            r15 = 0
            goto L_0x025f
        L_0x0254:
            androidx.recyclerview.widget.t r15 = new androidx.recyclerview.widget.t
            androidx.recyclerview.widget.RecyclerView r8 = r11.f1742a
            android.content.Context r8 = r8.getContext()
            r15.<init>(r11, r8)
        L_0x025f:
            if (r15 != 0) goto L_0x0265
        L_0x0261:
            r20 = r13
            goto L_0x033c
        L_0x0265:
            androidx.recyclerview.widget.RecyclerView r8 = r12.f1640b
            if (r8 == 0) goto L_0x026e
            androidx.recyclerview.widget.RecyclerView$f r8 = r8.getAdapter()
            goto L_0x026f
        L_0x026e:
            r8 = 0
        L_0x026f:
            if (r8 == 0) goto L_0x0276
            int r8 = r8.a()
            goto L_0x0277
        L_0x0276:
            r8 = 0
        L_0x0277:
            if (r8 != 0) goto L_0x027a
            goto L_0x0293
        L_0x027a:
            boolean r19 = r12.e()
            if (r19 == 0) goto L_0x0285
            androidx.recyclerview.widget.s r11 = r11.h(r12)
            goto L_0x0291
        L_0x0285:
            boolean r19 = r12.d()
            if (r19 == 0) goto L_0x0290
            androidx.recyclerview.widget.s r11 = r11.g(r12)
            goto L_0x0291
        L_0x0290:
            r11 = 0
        L_0x0291:
            if (r11 != 0) goto L_0x0297
        L_0x0293:
            r20 = r13
            goto L_0x0338
        L_0x0297:
            int r5 = r12.w()
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 2147483647(0x7fffffff, float:NaN)
            r9 = r19
            r0 = 0
            r21 = 0
            r22 = 0
            r24 = r20
            r20 = r13
            r13 = r24
        L_0x02ad:
            if (r0 >= r5) goto L_0x02d1
            r23 = r5
            android.view.View r5 = r12.v(r0)
            if (r5 != 0) goto L_0x02b8
            goto L_0x02ca
        L_0x02b8:
            int r6 = androidx.recyclerview.widget.u.e(r5, r11)
            if (r6 > 0) goto L_0x02c3
            if (r6 <= r9) goto L_0x02c3
            r22 = r5
            r9 = r6
        L_0x02c3:
            if (r6 < 0) goto L_0x02ca
            if (r6 >= r13) goto L_0x02ca
            r21 = r5
            r13 = r6
        L_0x02ca:
            int r0 = r0 + 1
            r6 = r25
            r5 = r23
            goto L_0x02ad
        L_0x02d1:
            boolean r0 = r12.d()
            if (r0 == 0) goto L_0x02da
            if (r3 <= 0) goto L_0x02de
            goto L_0x02dc
        L_0x02da:
            if (r4 <= 0) goto L_0x02de
        L_0x02dc:
            r0 = 1
            goto L_0x02df
        L_0x02de:
            r0 = 0
        L_0x02df:
            if (r0 == 0) goto L_0x02e8
            if (r21 == 0) goto L_0x02e8
            int r0 = androidx.recyclerview.widget.RecyclerView.n.G(r21)
            goto L_0x0339
        L_0x02e8:
            if (r0 != 0) goto L_0x02f1
            if (r22 == 0) goto L_0x02f1
            int r0 = androidx.recyclerview.widget.RecyclerView.n.G(r22)
            goto L_0x0339
        L_0x02f1:
            if (r0 == 0) goto L_0x02f5
            r21 = r22
        L_0x02f5:
            if (r21 != 0) goto L_0x02f8
            goto L_0x0338
        L_0x02f8:
            int r5 = androidx.recyclerview.widget.RecyclerView.n.G(r21)
            androidx.recyclerview.widget.RecyclerView r6 = r12.f1640b
            if (r6 == 0) goto L_0x0307
            androidx.recyclerview.widget.RecyclerView$f r6 = r6.getAdapter()
            r16 = r6
            goto L_0x0309
        L_0x0307:
            r16 = 0
        L_0x0309:
            if (r16 == 0) goto L_0x0310
            int r6 = r16.a()
            goto L_0x0311
        L_0x0310:
            r6 = 0
        L_0x0311:
            if (r1 == 0) goto L_0x032d
            r1 = r12
            androidx.recyclerview.widget.RecyclerView$y$b r1 = (androidx.recyclerview.widget.RecyclerView.y.b) r1
            r9 = 1
            int r6 = r6 - r9
            android.graphics.PointF r1 = r1.a(r6)
            if (r1 == 0) goto L_0x032d
            float r6 = r1.x
            r9 = 0
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x032b
            float r1 = r1.y
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x032d
        L_0x032b:
            r1 = 1
            goto L_0x032e
        L_0x032d:
            r1 = 0
        L_0x032e:
            if (r1 != r0) goto L_0x0332
            r0 = -1
            goto L_0x0333
        L_0x0332:
            r0 = 1
        L_0x0333:
            int r0 = r0 + r5
            if (r0 < 0) goto L_0x0338
            if (r0 < r8) goto L_0x0339
        L_0x0338:
            r0 = -1
        L_0x0339:
            r1 = -1
            if (r0 != r1) goto L_0x033e
        L_0x033c:
            r0 = 0
            goto L_0x0344
        L_0x033e:
            r15.f1674a = r0
            r12.B0(r15)
            r0 = 1
        L_0x0344:
            if (r0 == 0) goto L_0x0348
            r8 = 1
            goto L_0x0349
        L_0x0348:
            r8 = 0
        L_0x0349:
            if (r8 == 0) goto L_0x0351
            r8 = 1
            r0 = r25
            goto L_0x03af
        L_0x034f:
            r20 = r13
        L_0x0351:
            if (r14 == 0) goto L_0x03a8
            if (r10 == 0) goto L_0x0357
            r7 = r7 | 2
        L_0x0357:
            i0.k r0 = r25.getScrollingChildHelper()
            r1 = 1
            r0.g(r7, r1)
            int r0 = -r2
            int r1 = java.lang.Math.min(r3, r2)
            int r8 = java.lang.Math.max(r0, r1)
            int r1 = java.lang.Math.min(r4, r2)
            int r9 = java.lang.Math.max(r0, r1)
            r0 = r25
            androidx.recyclerview.widget.RecyclerView$b0 r1 = r0.f1591s0
            androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
            r3 = 2
            r2.setScrollState(r3)
            r3 = 0
            r1.f1603p = r3
            r1.f1602o = r3
            android.view.animation.Interpolator r3 = r1.f1605r
            androidx.recyclerview.widget.RecyclerView$c r4 = Q0
            if (r3 == r4) goto L_0x0392
            r1.f1605r = r4
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2, r4)
            r1.f1604q = r3
        L_0x0392:
            android.widget.OverScroller r5 = r1.f1604q
            r6 = 0
            r7 = 0
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = 2147483647(0x7fffffff, float:NaN)
            r5.fling(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.a()
            r8 = 1
            goto L_0x03af
        L_0x03a8:
            r0 = r25
            goto L_0x03ae
        L_0x03ab:
            r0 = r6
            r20 = r13
        L_0x03ae:
            r8 = 0
        L_0x03af:
            if (r8 != 0) goto L_0x03b5
            r1 = 0
        L_0x03b2:
            r0.setScrollState(r1)
        L_0x03b5:
            r25.X()
            r8 = 1
            goto L_0x03e5
        L_0x03ba:
            r0 = r6
            r1 = r8
            r20 = r13
            int r2 = r7.getPointerId(r1)
            r0.f1573f0 = r2
            float r1 = r26.getX()
            float r1 = r1 + r4
            int r1 = (int) r1
            r0.f1577j0 = r1
            r0.f1575h0 = r1
            float r1 = r26.getY()
            float r1 = r1 + r4
            int r1 = (int) r1
            r0.f1578k0 = r1
            r0.f1576i0 = r1
            if (r11 == 0) goto L_0x03dc
            r10 = r10 | 2
        L_0x03dc:
            i0.k r1 = r25.getScrollingChildHelper()
            r2 = 0
            r1.g(r10, r2)
        L_0x03e4:
            r8 = 0
        L_0x03e5:
            if (r8 != 0) goto L_0x03ef
            android.view.VelocityTracker r1 = r0.f1574g0
            r2 = r20
            r1.addMovement(r2)
            goto L_0x03f1
        L_0x03ef:
            r2 = r20
        L_0x03f1:
            r2.recycle()
            r1 = 1
            return r1
        L_0x03f6:
            r0 = r6
            r1 = r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: androidx.recyclerview.widget.RecyclerView$c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: androidx.recyclerview.widget.RecyclerView$c0} */
    /* JADX WARNING: type inference failed for: r10v0, types: [androidx.recyclerview.widget.RecyclerView$c0] */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r6v47 */
    /* JADX WARNING: type inference failed for: r6v48 */
    /* JADX WARNING: type inference failed for: r6v49 */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x024f, code lost:
        if (r15.f1571d0.a(r10, r10, r5, r6) != false) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0273, code lost:
        if (r5 != false) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03cb, code lost:
        if (r0.f1590s.j(getFocusedChild()) == false) goto L_0x0481;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r18 = this;
            r0 = r18
            androidx.recyclerview.widget.RecyclerView$f r1 = r0.z
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "No adapter attached; skipping layout"
            android.util.Log.w(r2, r1)
            return
        L_0x000e:
            androidx.recyclerview.widget.RecyclerView$n r1 = r0.A
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L_0x0018:
            androidx.recyclerview.widget.RecyclerView$z r1 = r0.f1595v0
            r3 = 0
            r1.f1694i = r3
            boolean r4 = r0.K0
            r5 = 1
            if (r4 == 0) goto L_0x0034
            int r4 = r0.L0
            int r6 = r18.getWidth()
            if (r4 != r6) goto L_0x0032
            int r4 = r0.M0
            int r6 = r18.getHeight()
            if (r4 == r6) goto L_0x0034
        L_0x0032:
            r4 = r5
            goto L_0x0035
        L_0x0034:
            r4 = r3
        L_0x0035:
            r0.L0 = r3
            r0.M0 = r3
            r0.K0 = r3
            int r6 = r1.d
            if (r6 != r5) goto L_0x0043
            r18.q()
            goto L_0x0075
        L_0x0043:
            androidx.recyclerview.widget.a r6 = r0.f1588r
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r7 = r6.f1736c
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0056
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r6 = r6.f1735b
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0056
            r3 = r5
        L_0x0056:
            if (r3 != 0) goto L_0x0075
            if (r4 != 0) goto L_0x0075
            androidx.recyclerview.widget.RecyclerView$n r3 = r0.A
            int r3 = r3.f1650n
            int r4 = r18.getWidth()
            if (r3 != r4) goto L_0x0075
            androidx.recyclerview.widget.RecyclerView$n r3 = r0.A
            int r3 = r3.f1651o
            int r4 = r18.getHeight()
            if (r3 == r4) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            androidx.recyclerview.widget.RecyclerView$n r3 = r0.A
            r3.s0(r0)
            goto L_0x007d
        L_0x0075:
            androidx.recyclerview.widget.RecyclerView$n r3 = r0.A
            r3.s0(r0)
            r18.r()
        L_0x007d:
            r3 = 4
            r1.a(r3)
            r18.d0()
            r18.P()
            r1.d = r5
            boolean r4 = r1.f1695j
            r6 = 0
            androidx.recyclerview.widget.RecyclerView$u r7 = r0.f1584p
            androidx.recyclerview.widget.c0 r8 = r0.f1592t
            if (r4 == 0) goto L_0x033b
            androidx.recyclerview.widget.b r4 = r0.f1590s
            int r4 = r4.e()
            int r4 = r4 - r5
        L_0x0099:
            if (r4 < 0) goto L_0x01ef
            androidx.recyclerview.widget.b r9 = r0.f1590s
            android.view.View r9 = r9.d(r4)
            androidx.recyclerview.widget.RecyclerView$c0 r9 = J(r9)
            boolean r10 = r9.o()
            if (r10 == 0) goto L_0x00ad
            goto L_0x01e8
        L_0x00ad:
            long r10 = r0.H(r9)
            androidx.recyclerview.widget.RecyclerView$k r12 = r0.f1571d0
            r12.getClass()
            androidx.recyclerview.widget.RecyclerView$k$c r12 = new androidx.recyclerview.widget.RecyclerView$k$c
            r12.<init>()
            r12.a(r9)
            n.f<androidx.recyclerview.widget.RecyclerView$c0> r13 = r8.f1760b
            java.lang.Object r13 = r13.h(r10, r6)
            androidx.recyclerview.widget.RecyclerView$c0 r13 = (androidx.recyclerview.widget.RecyclerView.c0) r13
            n.i<androidx.recyclerview.widget.RecyclerView$c0, androidx.recyclerview.widget.c0$a> r14 = r8.f1759a
            if (r13 == 0) goto L_0x01d0
            boolean r15 = r13.o()
            if (r15 != 0) goto L_0x01d0
            java.lang.Object r15 = r14.getOrDefault(r13, r6)
            androidx.recyclerview.widget.c0$a r15 = (androidx.recyclerview.widget.c0.a) r15
            if (r15 == 0) goto L_0x00df
            int r15 = r15.f1761a
            r15 = r15 & r5
            if (r15 == 0) goto L_0x00df
            r15 = r5
            goto L_0x00e0
        L_0x00df:
            r15 = 0
        L_0x00e0:
            java.lang.Object r6 = r14.getOrDefault(r9, r6)
            androidx.recyclerview.widget.c0$a r6 = (androidx.recyclerview.widget.c0.a) r6
            if (r6 == 0) goto L_0x00ee
            int r6 = r6.f1761a
            r6 = r6 & r5
            if (r6 == 0) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            r5 = 0
        L_0x00ef:
            if (r15 == 0) goto L_0x00f5
            if (r13 != r9) goto L_0x00f5
            goto L_0x01d0
        L_0x00f5:
            androidx.recyclerview.widget.RecyclerView$k$c r3 = r8.a(r13, r3)
            r6 = 0
            java.lang.Object r6 = r14.getOrDefault(r9, r6)
            androidx.recyclerview.widget.c0$a r6 = (androidx.recyclerview.widget.c0.a) r6
            if (r6 != 0) goto L_0x0109
            androidx.recyclerview.widget.c0$a r6 = androidx.recyclerview.widget.c0.a.a()
            r14.put(r9, r6)
        L_0x0109:
            r6.f1763c = r12
            int r12 = r6.f1761a
            r14 = 8
            r12 = r12 | r14
            r6.f1761a = r12
            androidx.recyclerview.widget.RecyclerView$k$c r6 = r8.a(r9, r14)
            if (r3 != 0) goto L_0x01a6
            androidx.recyclerview.widget.b r3 = r0.f1590s
            int r3 = r3.e()
            r5 = 0
        L_0x011f:
            if (r5 >= r3) goto L_0x0185
            androidx.recyclerview.widget.b r6 = r0.f1590s
            android.view.View r6 = r6.d(r5)
            androidx.recyclerview.widget.RecyclerView$c0 r6 = J(r6)
            if (r6 != r9) goto L_0x012e
            goto L_0x0182
        L_0x012e:
            long r14 = r0.H(r6)
            int r12 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0182
            androidx.recyclerview.widget.RecyclerView$f r1 = r0.z
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x0161
            boolean r1 = r1.f1629b
            if (r1 == 0) goto L_0x0161
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r6)
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = r18.z()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0161:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r6)
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = r18.z()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0182:
            int r5 = r5 + 1
            goto L_0x011f
        L_0x0185:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r3.<init>(r5)
            r3.append(r13)
            java.lang.String r5 = " cannot be found but it is necessary for "
            r3.append(r5)
            r3.append(r9)
            java.lang.String r5 = r18.z()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3)
            goto L_0x01e8
        L_0x01a6:
            r10 = 0
            r13.n(r10)
            if (r15 == 0) goto L_0x01af
            r0.f(r13)
        L_0x01af:
            if (r13 == r9) goto L_0x01c4
            if (r5 == 0) goto L_0x01b6
            r0.f(r9)
        L_0x01b6:
            r13.f1615h = r9
            r0.f(r13)
            r7.j(r13)
            r5 = 0
            r9.n(r5)
            r9.f1616i = r13
        L_0x01c4:
            androidx.recyclerview.widget.RecyclerView$k r5 = r0.f1571d0
            boolean r3 = r5.a(r13, r9, r3, r6)
            if (r3 == 0) goto L_0x01e8
            r18.S()
            goto L_0x01e8
        L_0x01d0:
            r3 = 0
            java.lang.Object r3 = r14.getOrDefault(r9, r3)
            androidx.recyclerview.widget.c0$a r3 = (androidx.recyclerview.widget.c0.a) r3
            if (r3 != 0) goto L_0x01e0
            androidx.recyclerview.widget.c0$a r3 = androidx.recyclerview.widget.c0.a.a()
            r14.put(r9, r3)
        L_0x01e0:
            r3.f1763c = r12
            int r5 = r3.f1761a
            r5 = r5 | 8
            r3.f1761a = r5
        L_0x01e8:
            int r4 = r4 + -1
            r3 = 4
            r5 = 1
            r6 = 0
            goto L_0x0099
        L_0x01ef:
            n.i<androidx.recyclerview.widget.RecyclerView$c0, androidx.recyclerview.widget.c0$a> r2 = r8.f1759a
            int r3 = r2.f7333q
            int r3 = r3 + -1
        L_0x01f5:
            if (r3 < 0) goto L_0x033a
            java.lang.Object r4 = r2.h(r3)
            r10 = r4
            androidx.recyclerview.widget.RecyclerView$c0 r10 = (androidx.recyclerview.widget.RecyclerView.c0) r10
            java.lang.Object r4 = r2.j(r3)
            androidx.recyclerview.widget.c0$a r4 = (androidx.recyclerview.widget.c0.a) r4
            int r5 = r4.f1761a
            r6 = r5 & 3
            r9 = 3
            androidx.recyclerview.widget.RecyclerView$d r11 = r0.N0
            if (r6 != r9) goto L_0x020e
            goto L_0x0216
        L_0x020e:
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0228
            androidx.recyclerview.widget.RecyclerView$k$c r5 = r4.f1762b
            if (r5 != 0) goto L_0x0225
        L_0x0216:
            androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$n r6 = r5.A
            android.view.View r9 = r10.f1609a
            androidx.recyclerview.widget.RecyclerView$u r5 = r5.f1584p
            r6.l0(r9, r5)
        L_0x0221:
            r17 = r2
            goto L_0x0327
        L_0x0225:
            androidx.recyclerview.widget.RecyclerView$k$c r6 = r4.f1763c
            goto L_0x0280
        L_0x0228:
            r6 = r5 & 14
            r9 = 14
            if (r6 != r9) goto L_0x0232
            r17 = r2
            goto L_0x02e6
        L_0x0232:
            r6 = r5 & 12
            r9 = 12
            if (r6 != r9) goto L_0x0279
            androidx.recyclerview.widget.RecyclerView$k$c r5 = r4.f1762b
            androidx.recyclerview.widget.RecyclerView$k$c r6 = r4.f1763c
            r11.getClass()
            r9 = 0
            r10.n(r9)
            androidx.recyclerview.widget.RecyclerView r15 = androidx.recyclerview.widget.RecyclerView.this
            boolean r9 = r15.R
            if (r9 == 0) goto L_0x0252
            androidx.recyclerview.widget.RecyclerView$k r9 = r15.f1571d0
            boolean r5 = r9.a(r10, r10, r5, r6)
            if (r5 == 0) goto L_0x0221
            goto L_0x0275
        L_0x0252:
            androidx.recyclerview.widget.RecyclerView$k r9 = r15.f1571d0
            androidx.recyclerview.widget.z r9 = (androidx.recyclerview.widget.z) r9
            r9.getClass()
            int r11 = r5.f1636a
            int r13 = r6.f1636a
            if (r11 != r13) goto L_0x026b
            int r12 = r5.f1637b
            int r14 = r6.f1637b
            if (r12 == r14) goto L_0x0266
            goto L_0x026b
        L_0x0266:
            r9.c(r10)
            r5 = 0
            goto L_0x0273
        L_0x026b:
            int r12 = r5.f1637b
            int r14 = r6.f1637b
            boolean r5 = r9.g(r10, r11, r12, r13, r14)
        L_0x0273:
            if (r5 == 0) goto L_0x0221
        L_0x0275:
            r15.S()
            goto L_0x0221
        L_0x0279:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x02e0
            androidx.recyclerview.widget.RecyclerView$k$c r5 = r4.f1762b
            r6 = 0
        L_0x0280:
            androidx.recyclerview.widget.RecyclerView r15 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$u r9 = r15.f1584p
            r9.j(r10)
            r15.f(r10)
            r9 = 0
            r10.n(r9)
            androidx.recyclerview.widget.RecyclerView$k r9 = r15.f1571d0
            androidx.recyclerview.widget.z r9 = (androidx.recyclerview.widget.z) r9
            r9.getClass()
            int r11 = r5.f1636a
            int r12 = r5.f1637b
            android.view.View r5 = r10.f1609a
            if (r6 != 0) goto L_0x02a2
            int r13 = r5.getLeft()
            goto L_0x02a4
        L_0x02a2:
            int r13 = r6.f1636a
        L_0x02a4:
            if (r6 != 0) goto L_0x02ab
            int r6 = r5.getTop()
            goto L_0x02ad
        L_0x02ab:
            int r6 = r6.f1637b
        L_0x02ad:
            r14 = r6
            boolean r6 = r10.i()
            if (r6 != 0) goto L_0x02cd
            if (r11 != r13) goto L_0x02b8
            if (r12 == r14) goto L_0x02cd
        L_0x02b8:
            int r6 = r5.getWidth()
            int r6 = r6 + r13
            int r16 = r5.getHeight()
            r17 = r2
            int r2 = r16 + r14
            r5.layout(r13, r14, r6, r2)
            boolean r2 = r9.g(r10, r11, r12, r13, r14)
            goto L_0x02da
        L_0x02cd:
            r17 = r2
            androidx.recyclerview.widget.k r9 = (androidx.recyclerview.widget.k) r9
            r9.l(r10)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$c0> r2 = r9.f1786h
            r2.add(r10)
            r2 = 1
        L_0x02da:
            if (r2 == 0) goto L_0x0327
            r15.S()
            goto L_0x0327
        L_0x02e0:
            r17 = r2
            r2 = r5 & 8
            if (r2 == 0) goto L_0x0327
        L_0x02e6:
            androidx.recyclerview.widget.RecyclerView$k$c r2 = r4.f1762b
            androidx.recyclerview.widget.RecyclerView$k$c r5 = r4.f1763c
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            r6.getClass()
            r9 = 0
            r10.n(r9)
            androidx.recyclerview.widget.RecyclerView$k r9 = r6.f1571d0
            androidx.recyclerview.widget.z r9 = (androidx.recyclerview.widget.z) r9
            r9.getClass()
            if (r2 == 0) goto L_0x0311
            int r11 = r2.f1636a
            int r13 = r5.f1636a
            if (r11 != r13) goto L_0x0308
            int r12 = r2.f1637b
            int r14 = r5.f1637b
            if (r12 == r14) goto L_0x0311
        L_0x0308:
            int r12 = r2.f1637b
            int r14 = r5.f1637b
            boolean r2 = r9.g(r10, r11, r12, r13, r14)
            goto L_0x0322
        L_0x0311:
            androidx.recyclerview.widget.k r9 = (androidx.recyclerview.widget.k) r9
            r9.l(r10)
            android.view.View r2 = r10.f1609a
            r5 = 0
            r2.setAlpha(r5)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$c0> r2 = r9.f1787i
            r2.add(r10)
            r2 = 1
        L_0x0322:
            if (r2 == 0) goto L_0x0327
            r6.S()
        L_0x0327:
            r2 = 0
            r4.f1761a = r2
            r2 = 0
            r4.f1762b = r2
            r4.f1763c = r2
            h0.d r2 = androidx.recyclerview.widget.c0.a.d
            r2.a(r4)
            int r3 = r3 + -1
            r2 = r17
            goto L_0x01f5
        L_0x033a:
            r6 = 0
        L_0x033b:
            androidx.recyclerview.widget.RecyclerView$n r2 = r0.A
            r2.k0(r7)
            int r2 = r1.f1690e
            r1.f1688b = r2
            r2 = 0
            r0.R = r2
            r0.S = r2
            r1.f1695j = r2
            r1.f1696k = r2
            androidx.recyclerview.widget.RecyclerView$n r3 = r0.A
            r3.f1643f = r2
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$c0> r3 = r7.f1666b
            if (r3 == 0) goto L_0x0358
            r3.clear()
        L_0x0358:
            androidx.recyclerview.widget.RecyclerView$n r3 = r0.A
            boolean r4 = r3.f1648k
            if (r4 == 0) goto L_0x0365
            r3.f1647j = r2
            r3.f1648k = r2
            r7.k()
        L_0x0365:
            androidx.recyclerview.widget.RecyclerView$n r3 = r0.A
            r3.e0(r1)
            r3 = 1
            r0.Q(r3)
            r0.e0(r2)
            n.i<androidx.recyclerview.widget.RecyclerView$c0, androidx.recyclerview.widget.c0$a> r4 = r8.f1759a
            r4.clear()
            n.f<androidx.recyclerview.widget.RecyclerView$c0> r4 = r8.f1760b
            r4.c()
            int[] r4 = r0.D0
            r5 = r4[r2]
            r7 = r4[r3]
            r0.D(r4)
            r8 = r4[r2]
            if (r8 != r5) goto L_0x038e
            r4 = r4[r3]
            if (r4 == r7) goto L_0x038d
            goto L_0x038e
        L_0x038d:
            r3 = r2
        L_0x038e:
            if (r3 == 0) goto L_0x0393
            r0.u(r2, r2)
        L_0x0393:
            boolean r3 = r0.f1589r0
            r4 = -1
            if (r3 == 0) goto L_0x0481
            androidx.recyclerview.widget.RecyclerView$f r3 = r0.z
            if (r3 == 0) goto L_0x0481
            boolean r3 = r18.hasFocus()
            if (r3 == 0) goto L_0x0481
            int r3 = r18.getDescendantFocusability()
            r7 = 393216(0x60000, float:5.51013E-40)
            if (r3 == r7) goto L_0x0481
            int r3 = r18.getDescendantFocusability()
            r7 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r7) goto L_0x03bb
            boolean r3 = r18.isFocused()
            if (r3 == 0) goto L_0x03bb
            goto L_0x0481
        L_0x03bb:
            boolean r3 = r18.isFocused()
            if (r3 != 0) goto L_0x03cf
            android.view.View r3 = r18.getFocusedChild()
            androidx.recyclerview.widget.b r7 = r0.f1590s
            boolean r3 = r7.j(r3)
            if (r3 != 0) goto L_0x03cf
            goto L_0x0481
        L_0x03cf:
            long r7 = r1.f1697m
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0411
            androidx.recyclerview.widget.RecyclerView$f r3 = r0.z
            boolean r3 = r3.f1629b
            if (r3 == 0) goto L_0x0411
            if (r3 != 0) goto L_0x03de
            goto L_0x0411
        L_0x03de:
            androidx.recyclerview.widget.b r3 = r0.f1590s
            int r3 = r3.h()
            r9 = r2
            r10 = r6
        L_0x03e6:
            if (r9 >= r3) goto L_0x0412
            androidx.recyclerview.widget.b r11 = r0.f1590s
            android.view.View r11 = r11.g(r9)
            androidx.recyclerview.widget.RecyclerView$c0 r11 = J(r11)
            if (r11 == 0) goto L_0x040e
            boolean r12 = r11.i()
            if (r12 != 0) goto L_0x040e
            long r12 = r11.f1612e
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x040e
            androidx.recyclerview.widget.b r10 = r0.f1590s
            android.view.View r12 = r11.f1609a
            boolean r10 = r10.j(r12)
            if (r10 == 0) goto L_0x040c
            r10 = r11
            goto L_0x040e
        L_0x040c:
            r10 = r11
            goto L_0x0412
        L_0x040e:
            int r9 = r9 + 1
            goto L_0x03e6
        L_0x0411:
            r10 = r6
        L_0x0412:
            if (r10 == 0) goto L_0x0427
            androidx.recyclerview.widget.b r3 = r0.f1590s
            android.view.View r7 = r10.f1609a
            boolean r3 = r3.j(r7)
            if (r3 != 0) goto L_0x0427
            boolean r3 = r7.hasFocusable()
            if (r3 != 0) goto L_0x0425
            goto L_0x0427
        L_0x0425:
            r6 = r7
            goto L_0x0468
        L_0x0427:
            androidx.recyclerview.widget.b r3 = r0.f1590s
            int r3 = r3.e()
            if (r3 <= 0) goto L_0x0468
            int r3 = r1.l
            r7 = -1
            if (r3 == r7) goto L_0x0435
            r2 = r3
        L_0x0435:
            int r3 = r1.b()
            r7 = r2
        L_0x043a:
            if (r7 >= r3) goto L_0x0450
            androidx.recyclerview.widget.RecyclerView$c0 r8 = r0.F(r7)
            if (r8 != 0) goto L_0x0443
            goto L_0x0450
        L_0x0443:
            android.view.View r8 = r8.f1609a
            boolean r9 = r8.hasFocusable()
            if (r9 == 0) goto L_0x044d
            r6 = r8
            goto L_0x0468
        L_0x044d:
            int r7 = r7 + 1
            goto L_0x043a
        L_0x0450:
            int r2 = java.lang.Math.min(r3, r2)
        L_0x0454:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0468
            androidx.recyclerview.widget.RecyclerView$c0 r3 = r0.F(r2)
            if (r3 != 0) goto L_0x045f
            goto L_0x0468
        L_0x045f:
            android.view.View r3 = r3.f1609a
            boolean r7 = r3.hasFocusable()
            if (r7 == 0) goto L_0x0454
            r6 = r3
        L_0x0468:
            if (r6 == 0) goto L_0x0481
            int r2 = r1.f1698n
            long r7 = (long) r2
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x047e
            android.view.View r2 = r6.findViewById(r2)
            if (r2 == 0) goto L_0x047e
            boolean r3 = r2.isFocusable()
            if (r3 == 0) goto L_0x047e
            r6 = r2
        L_0x047e:
            r6.requestFocus()
        L_0x0481:
            r1.f1697m = r4
            r2 = -1
            r1.l = r2
            r1.f1698n = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0098 A[EDGE_INSN: B:109:0x0098->B:38:0x0098 ?: BREAK  
    EDGE_INSN: B:110:0x0098->B:38:0x0098 ?: BREAK  
    EDGE_INSN: B:111:0x0098->B:38:0x0098 ?: BREAK  ] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q() {
        /*
            r14 = this;
            androidx.recyclerview.widget.RecyclerView$z r0 = r14.f1595v0
            r1 = 1
            r0.a(r1)
            r14.A(r0)
            r2 = 0
            r0.f1694i = r2
            r14.d0()
            androidx.recyclerview.widget.c0 r3 = r14.f1592t
            n.i<androidx.recyclerview.widget.RecyclerView$c0, androidx.recyclerview.widget.c0$a> r4 = r3.f1759a
            r4.clear()
            n.f<androidx.recyclerview.widget.RecyclerView$c0> r4 = r3.f1760b
            r4.c()
            r14.P()
            r14.T()
            boolean r4 = r14.f1589r0
            r5 = 0
            if (r4 == 0) goto L_0x0035
            boolean r4 = r14.hasFocus()
            if (r4 == 0) goto L_0x0035
            androidx.recyclerview.widget.RecyclerView$f r4 = r14.z
            if (r4 == 0) goto L_0x0035
            android.view.View r4 = r14.getFocusedChild()
            goto L_0x0036
        L_0x0035:
            r4 = r5
        L_0x0036:
            if (r4 != 0) goto L_0x0039
            goto L_0x003f
        L_0x0039:
            android.view.View r4 = r14.B(r4)
            if (r4 != 0) goto L_0x0041
        L_0x003f:
            r4 = r5
            goto L_0x0045
        L_0x0041:
            androidx.recyclerview.widget.RecyclerView$c0 r4 = r14.I(r4)
        L_0x0045:
            r6 = -1
            r8 = -1
            if (r4 != 0) goto L_0x0051
            r0.f1697m = r6
            r0.l = r8
            r0.f1698n = r8
            goto L_0x009a
        L_0x0051:
            androidx.recyclerview.widget.RecyclerView$f r9 = r14.z
            boolean r9 = r9.f1629b
            if (r9 == 0) goto L_0x0059
            long r6 = r4.f1612e
        L_0x0059:
            r0.f1697m = r6
            boolean r6 = r14.R
            if (r6 == 0) goto L_0x0061
        L_0x005f:
            r6 = r8
            goto L_0x0073
        L_0x0061:
            boolean r6 = r4.i()
            if (r6 == 0) goto L_0x006a
            int r6 = r4.d
            goto L_0x0073
        L_0x006a:
            androidx.recyclerview.widget.RecyclerView r6 = r4.f1624r
            if (r6 != 0) goto L_0x006f
            goto L_0x005f
        L_0x006f:
            int r6 = r6.G(r4)
        L_0x0073:
            r0.l = r6
            android.view.View r4 = r4.f1609a
        L_0x0077:
            int r6 = r4.getId()
        L_0x007b:
            boolean r7 = r4.isFocused()
            if (r7 != 0) goto L_0x0098
            boolean r7 = r4 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x0098
            boolean r7 = r4.hasFocus()
            if (r7 == 0) goto L_0x0098
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r4 = r4.getFocusedChild()
            int r7 = r4.getId()
            if (r7 == r8) goto L_0x007b
            goto L_0x0077
        L_0x0098:
            r0.f1698n = r6
        L_0x009a:
            boolean r4 = r0.f1695j
            if (r4 == 0) goto L_0x00a4
            boolean r4 = r14.f1599z0
            if (r4 == 0) goto L_0x00a4
            r4 = r1
            goto L_0x00a5
        L_0x00a4:
            r4 = r2
        L_0x00a5:
            r0.f1693h = r4
            r14.f1599z0 = r2
            r14.y0 = r2
            boolean r4 = r0.f1696k
            r0.f1692g = r4
            androidx.recyclerview.widget.RecyclerView$f r4 = r14.z
            int r4 = r4.a()
            r0.f1690e = r4
            int[] r4 = r14.D0
            r14.D(r4)
            boolean r4 = r0.f1695j
            r6 = 2
            n.i<androidx.recyclerview.widget.RecyclerView$c0, androidx.recyclerview.widget.c0$a> r7 = r3.f1759a
            if (r4 == 0) goto L_0x013f
            androidx.recyclerview.widget.b r4 = r14.f1590s
            int r4 = r4.e()
            r9 = r2
        L_0x00ca:
            if (r9 >= r4) goto L_0x013f
            androidx.recyclerview.widget.b r10 = r14.f1590s
            android.view.View r10 = r10.d(r9)
            androidx.recyclerview.widget.RecyclerView$c0 r10 = J(r10)
            boolean r11 = r10.o()
            if (r11 != 0) goto L_0x013c
            boolean r11 = r10.g()
            if (r11 == 0) goto L_0x00e9
            androidx.recyclerview.widget.RecyclerView$f r11 = r14.z
            boolean r11 = r11.f1629b
            if (r11 != 0) goto L_0x00e9
            goto L_0x013c
        L_0x00e9:
            androidx.recyclerview.widget.RecyclerView$k r11 = r14.f1571d0
            androidx.recyclerview.widget.RecyclerView.k.b(r10)
            r10.d()
            r11.getClass()
            androidx.recyclerview.widget.RecyclerView$k$c r11 = new androidx.recyclerview.widget.RecyclerView$k$c
            r11.<init>()
            r11.a(r10)
            java.lang.Object r12 = r7.getOrDefault(r10, r5)
            androidx.recyclerview.widget.c0$a r12 = (androidx.recyclerview.widget.c0.a) r12
            if (r12 != 0) goto L_0x010b
            androidx.recyclerview.widget.c0$a r12 = androidx.recyclerview.widget.c0.a.a()
            r7.put(r10, r12)
        L_0x010b:
            r12.f1762b = r11
            int r11 = r12.f1761a
            r11 = r11 | 4
            r12.f1761a = r11
            boolean r11 = r0.f1693h
            if (r11 == 0) goto L_0x013c
            int r11 = r10.f1617j
            r11 = r11 & r6
            if (r11 == 0) goto L_0x011e
            r11 = r1
            goto L_0x011f
        L_0x011e:
            r11 = r2
        L_0x011f:
            if (r11 == 0) goto L_0x013c
            boolean r11 = r10.i()
            if (r11 != 0) goto L_0x013c
            boolean r11 = r10.o()
            if (r11 != 0) goto L_0x013c
            boolean r11 = r10.g()
            if (r11 != 0) goto L_0x013c
            long r11 = r14.H(r10)
            n.f<androidx.recyclerview.widget.RecyclerView$c0> r13 = r3.f1760b
            r13.i(r11, r10)
        L_0x013c:
            int r9 = r9 + 1
            goto L_0x00ca
        L_0x013f:
            boolean r3 = r0.f1696k
            if (r3 == 0) goto L_0x01dd
            androidx.recyclerview.widget.b r3 = r14.f1590s
            int r3 = r3.h()
            r4 = r2
        L_0x014a:
            if (r4 >= r3) goto L_0x0167
            androidx.recyclerview.widget.b r9 = r14.f1590s
            android.view.View r9 = r9.g(r4)
            androidx.recyclerview.widget.RecyclerView$c0 r9 = J(r9)
            boolean r10 = r9.o()
            if (r10 != 0) goto L_0x0164
            int r10 = r9.d
            if (r10 != r8) goto L_0x0164
            int r10 = r9.f1611c
            r9.d = r10
        L_0x0164:
            int r4 = r4 + 1
            goto L_0x014a
        L_0x0167:
            boolean r3 = r0.f1691f
            r0.f1691f = r2
            androidx.recyclerview.widget.RecyclerView$n r4 = r14.A
            androidx.recyclerview.widget.RecyclerView$u r8 = r14.f1584p
            r4.d0(r8, r0)
            r0.f1691f = r3
            r3 = r2
        L_0x0175:
            androidx.recyclerview.widget.b r4 = r14.f1590s
            int r4 = r4.e()
            if (r3 >= r4) goto L_0x01dd
            androidx.recyclerview.widget.b r4 = r14.f1590s
            android.view.View r4 = r4.d(r3)
            androidx.recyclerview.widget.RecyclerView$c0 r4 = J(r4)
            boolean r8 = r4.o()
            if (r8 == 0) goto L_0x018e
            goto L_0x01da
        L_0x018e:
            java.lang.Object r8 = r7.getOrDefault(r4, r5)
            androidx.recyclerview.widget.c0$a r8 = (androidx.recyclerview.widget.c0.a) r8
            if (r8 == 0) goto L_0x019e
            int r8 = r8.f1761a
            r8 = r8 & 4
            if (r8 == 0) goto L_0x019e
            r8 = r1
            goto L_0x019f
        L_0x019e:
            r8 = r2
        L_0x019f:
            if (r8 != 0) goto L_0x01da
            androidx.recyclerview.widget.RecyclerView.k.b(r4)
            int r8 = r4.f1617j
            r9 = 8192(0x2000, float:1.14794E-41)
            r8 = r8 & r9
            if (r8 == 0) goto L_0x01ad
            r8 = r1
            goto L_0x01ae
        L_0x01ad:
            r8 = r2
        L_0x01ae:
            androidx.recyclerview.widget.RecyclerView$k r9 = r14.f1571d0
            r4.d()
            r9.getClass()
            androidx.recyclerview.widget.RecyclerView$k$c r9 = new androidx.recyclerview.widget.RecyclerView$k$c
            r9.<init>()
            r9.a(r4)
            if (r8 == 0) goto L_0x01c4
            r14.V(r4, r9)
            goto L_0x01da
        L_0x01c4:
            java.lang.Object r8 = r7.getOrDefault(r4, r5)
            androidx.recyclerview.widget.c0$a r8 = (androidx.recyclerview.widget.c0.a) r8
            if (r8 != 0) goto L_0x01d3
            androidx.recyclerview.widget.c0$a r8 = androidx.recyclerview.widget.c0.a.a()
            r7.put(r4, r8)
        L_0x01d3:
            int r4 = r8.f1761a
            r4 = r4 | r6
            r8.f1761a = r4
            r8.f1762b = r9
        L_0x01da:
            int r3 = r3 + 1
            goto L_0x0175
        L_0x01dd:
            r14.k()
            r14.Q(r1)
            r14.e0(r2)
            r0.d = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r() {
        /*
            r6 = this;
            r6.d0()
            r6.P()
            r0 = 6
            androidx.recyclerview.widget.RecyclerView$z r1 = r6.f1595v0
            r1.a(r0)
            androidx.recyclerview.widget.a r0 = r6.f1588r
            r0.c()
            androidx.recyclerview.widget.RecyclerView$f r0 = r6.z
            int r0 = r0.a()
            r1.f1690e = r0
            r0 = 0
            r1.f1689c = r0
            androidx.recyclerview.widget.RecyclerView$x r2 = r6.f1586q
            r3 = 1
            if (r2 == 0) goto L_0x0050
            androidx.recyclerview.widget.RecyclerView$f r2 = r6.z
            r2.getClass()
            int[] r4 = androidx.recyclerview.widget.RecyclerView.e.f1627a
            androidx.recyclerview.widget.RecyclerView$f$a r5 = r2.f1630c
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 == r3) goto L_0x003f
            r5 = 2
            if (r4 == r5) goto L_0x0037
            r2 = r3
            goto L_0x0040
        L_0x0037:
            int r2 = r2.a()
            if (r2 <= 0) goto L_0x003f
            r2 = r3
            goto L_0x0040
        L_0x003f:
            r2 = r0
        L_0x0040:
            if (r2 == 0) goto L_0x0050
            androidx.recyclerview.widget.RecyclerView$x r2 = r6.f1586q
            android.os.Parcelable r2 = r2.f1673q
            if (r2 == 0) goto L_0x004d
            androidx.recyclerview.widget.RecyclerView$n r4 = r6.A
            r4.f0(r2)
        L_0x004d:
            r2 = 0
            r6.f1586q = r2
        L_0x0050:
            r1.f1692g = r0
            androidx.recyclerview.widget.RecyclerView$n r2 = r6.A
            androidx.recyclerview.widget.RecyclerView$u r4 = r6.f1584p
            r2.d0(r4, r1)
            r1.f1691f = r0
            boolean r2 = r1.f1695j
            if (r2 == 0) goto L_0x0065
            androidx.recyclerview.widget.RecyclerView$k r2 = r6.f1571d0
            if (r2 == 0) goto L_0x0065
            r2 = r3
            goto L_0x0066
        L_0x0065:
            r2 = r0
        L_0x0066:
            r1.f1695j = r2
            r2 = 4
            r1.d = r2
            r6.Q(r3)
            r6.e0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r():void");
    }

    public final void removeDetachedView(View view, boolean z10) {
        c0 J2 = J(view);
        if (J2 != null) {
            if (J2.k()) {
                J2.f1617j &= -257;
            } else if (!J2.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + J2 + z());
            }
        }
        view.clearAnimation();
        o(view);
        super.removeDetachedView(view, z10);
    }

    public final void requestChildFocus(View view, View view2) {
        boolean z10;
        y yVar = this.A.f1642e;
        boolean z11 = true;
        if (yVar == null || !yVar.f1677e) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !L()) {
            z11 = false;
        }
        if (!z11 && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.A.n0(this, view, rect, z10, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList<r> arrayList = this.E;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).c();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void requestLayout() {
        if (this.J != 0 || this.L) {
            this.K = true;
        } else {
            super.requestLayout();
        }
    }

    public final boolean s(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, i12);
    }

    public final void scrollBy(int i10, int i11) {
        n nVar = this.A;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.L) {
            boolean d10 = nVar.d();
            boolean e10 = this.A.e();
            if (d10 || e10) {
                if (!d10) {
                    i10 = 0;
                }
                if (!e10) {
                    i11 = 0;
                }
                Y(i10, i11, (MotionEvent) null, 0);
            }
        }
    }

    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i10;
        int i11 = 0;
        if (L()) {
            if (accessibilityEvent != null) {
                i10 = accessibilityEvent.getContentChangeTypes();
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                i11 = i10;
            }
            this.N |= i11;
            i11 = 1;
        }
        if (i11 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(x xVar) {
        this.C0 = xVar;
        i0.w.k(this, xVar);
    }

    public void setAdapter(f fVar) {
        setLayoutFrozen(false);
        f fVar2 = this.z;
        w wVar = this.f1582o;
        if (fVar2 != null) {
            fVar2.f1628a.unregisterObserver(wVar);
            this.z.getClass();
        }
        k kVar = this.f1571d0;
        if (kVar != null) {
            kVar.e();
        }
        n nVar = this.A;
        u uVar = this.f1584p;
        if (nVar != null) {
            nVar.j0(uVar);
            this.A.k0(uVar);
        }
        uVar.f1665a.clear();
        uVar.d();
        a aVar = this.f1588r;
        aVar.l(aVar.f1735b);
        aVar.l(aVar.f1736c);
        aVar.f1738f = 0;
        f fVar3 = this.z;
        this.z = fVar;
        if (fVar != null) {
            fVar.f1628a.registerObserver(wVar);
        }
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.R();
        }
        f fVar4 = this.z;
        uVar.f1665a.clear();
        uVar.d();
        t c10 = uVar.c();
        if (fVar3 != null) {
            c10.f1661b--;
        }
        if (c10.f1661b == 0) {
            int i10 = 0;
            while (true) {
                SparseArray<t.a> sparseArray = c10.f1660a;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                sparseArray.valueAt(i10).f1662a.clear();
                i10++;
            }
        }
        if (fVar4 != null) {
            c10.f1661b++;
        }
        this.f1595v0.f1691f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(i iVar) {
        if (iVar != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public void setClipToPadding(boolean z10) {
        if (z10 != this.u) {
            this.f1570c0 = null;
            this.f1568a0 = null;
            this.f1569b0 = null;
            this.W = null;
        }
        this.u = z10;
        super.setClipToPadding(z10);
        if (this.I) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(j jVar) {
        jVar.getClass();
        this.V = jVar;
        this.f1570c0 = null;
        this.f1568a0 = null;
        this.f1569b0 = null;
        this.W = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.H = z10;
    }

    public void setItemAnimator(k kVar) {
        k kVar2 = this.f1571d0;
        if (kVar2 != null) {
            kVar2.e();
            this.f1571d0.f1631a = null;
        }
        this.f1571d0 = kVar;
        if (kVar != null) {
            kVar.f1631a = this.A0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        u uVar = this.f1584p;
        uVar.f1668e = i10;
        uVar.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(n nVar) {
        b.C0021b bVar;
        RecyclerView recyclerView;
        y yVar;
        if (nVar != this.A) {
            int i10 = 0;
            setScrollState(0);
            b0 b0Var = this.f1591s0;
            RecyclerView.this.removeCallbacks(b0Var);
            b0Var.f1604q.abortAnimation();
            n nVar2 = this.A;
            if (!(nVar2 == null || (yVar = nVar2.f1642e) == null)) {
                yVar.d();
            }
            n nVar3 = this.A;
            u uVar = this.f1584p;
            if (nVar3 != null) {
                k kVar = this.f1571d0;
                if (kVar != null) {
                    kVar.e();
                }
                this.A.j0(uVar);
                this.A.k0(uVar);
                uVar.f1665a.clear();
                uVar.d();
                if (this.G) {
                    n nVar4 = this.A;
                    nVar4.f1644g = false;
                    nVar4.S(this);
                }
                this.A.w0((RecyclerView) null);
                this.A = null;
            } else {
                uVar.f1665a.clear();
                uVar.d();
            }
            b bVar2 = this.f1590s;
            bVar2.f1747b.g();
            ArrayList arrayList = bVar2.f1748c;
            int size = arrayList.size();
            while (true) {
                size--;
                bVar = bVar2.f1746a;
                if (size < 0) {
                    break;
                }
                v vVar = (v) bVar;
                vVar.getClass();
                c0 J2 = J((View) arrayList.get(size));
                if (J2 != null) {
                    int i11 = J2.f1622p;
                    RecyclerView recyclerView2 = vVar.f1865a;
                    if (recyclerView2.L()) {
                        J2.f1623q = i11;
                        recyclerView2.I0.add(J2);
                    } else {
                        WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
                        w.d.s(J2.f1609a, i11);
                    }
                    J2.f1622p = 0;
                }
                arrayList.remove(size);
            }
            v vVar2 = (v) bVar;
            int a10 = vVar2.a();
            while (true) {
                recyclerView = vVar2.f1865a;
                if (i10 >= a10) {
                    break;
                }
                View childAt = recyclerView.getChildAt(i10);
                recyclerView.o(childAt);
                childAt.clearAnimation();
                i10++;
            }
            recyclerView.removeAllViews();
            this.A = nVar;
            if (nVar != null) {
                if (nVar.f1640b == null) {
                    nVar.w0(this);
                    if (this.G) {
                        this.A.f1644g = true;
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + nVar + " is already attached to a RecyclerView:" + nVar.f1640b.z());
                }
            }
            uVar.k();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z10) {
        i0.k scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap<View, i0.b0> weakHashMap = i0.w.f6004a;
            w.i.z(scrollingChildHelper.f5997c);
        }
        scrollingChildHelper.d = z10;
    }

    public void setOnFlingListener(q qVar) {
        this.f1580m0 = qVar;
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.f1596w0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f1589r0 = z10;
    }

    public void setRecycledViewPool(t tVar) {
        u uVar = this.f1584p;
        t tVar2 = uVar.f1670g;
        if (tVar2 != null) {
            tVar2.f1661b--;
        }
        uVar.f1670g = tVar;
        if (tVar != null && RecyclerView.this.getAdapter() != null) {
            uVar.f1670g.f1661b++;
        }
    }

    @Deprecated
    public void setRecyclerListener(v vVar) {
        this.B = vVar;
    }

    public void setScrollState(int i10) {
        y yVar;
        if (i10 != this.f1572e0) {
            this.f1572e0 = i10;
            if (i10 != 2) {
                b0 b0Var = this.f1591s0;
                RecyclerView.this.removeCallbacks(b0Var);
                b0Var.f1604q.abortAnimation();
                n nVar = this.A;
                if (!(nVar == null || (yVar = nVar.f1642e) == null)) {
                    yVar.d();
                }
            }
            n nVar2 = this.A;
            if (nVar2 != null) {
                nVar2.h0(i10);
            }
            s sVar = this.f1596w0;
            if (sVar != null) {
                sVar.a(i10, this);
            }
            ArrayList arrayList = this.x0;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((s) this.x0.get(size)).a(i10, this);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        int i11;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                i11 = viewConfiguration.getScaledPagingTouchSlop();
                this.f1579l0 = i11;
            }
        }
        i11 = viewConfiguration.getScaledTouchSlop();
        this.f1579l0 = i11;
    }

    public void setViewCacheExtension(a0 a0Var) {
        this.f1584p.getClass();
    }

    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public final void suppressLayout(boolean z10) {
        y yVar;
        if (z10 != this.L) {
            i("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.L = false;
                if (!(!this.K || this.A == null || this.z == null)) {
                    requestLayout();
                }
                this.K = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.L = true;
            this.M = true;
            setScrollState(0);
            b0 b0Var = this.f1591s0;
            RecyclerView.this.removeCallbacks(b0Var);
            b0Var.f1604q.abortAnimation();
            n nVar = this.A;
            if (nVar != null && (yVar = nVar.f1642e) != null) {
                yVar.d();
            }
        }
    }

    public final void t(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void u(int i10, int i11) {
        this.U++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        s sVar = this.f1596w0;
        if (sVar != null) {
            sVar.b(this, i10, i11);
        }
        ArrayList arrayList = this.x0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((s) this.x0.get(size)).b(this, i10, i11);
            }
        }
        this.U--;
    }

    public final void v() {
        int i10;
        int i11;
        if (this.f1570c0 == null) {
            this.V.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f1570c0 = edgeEffect;
            if (this.u) {
                i11 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i10 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i11 = getMeasuredWidth();
                i10 = getMeasuredHeight();
            }
            edgeEffect.setSize(i11, i10);
        }
    }

    public final void w() {
        int i10;
        int i11;
        if (this.W == null) {
            this.V.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.W = edgeEffect;
            if (this.u) {
                i11 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i10 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i11 = getMeasuredHeight();
                i10 = getMeasuredWidth();
            }
            edgeEffect.setSize(i11, i10);
        }
    }

    public final void x() {
        int i10;
        int i11;
        if (this.f1569b0 == null) {
            this.V.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f1569b0 = edgeEffect;
            if (this.u) {
                i11 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i10 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i11 = getMeasuredHeight();
                i10 = getMeasuredWidth();
            }
            edgeEffect.setSize(i11, i10);
        }
    }

    public final void y() {
        int i10;
        int i11;
        if (this.f1568a0 == null) {
            this.V.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f1568a0 = edgeEffect;
            if (this.u) {
                i11 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i10 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i11 = getMeasuredWidth();
                i10 = getMeasuredHeight();
            }
            edgeEffect.setSize(i11, i10);
        }
    }

    public final String z() {
        return " " + super.toString() + ", adapter:" + this.z + ", layout:" + this.A + ", context:" + getContext();
    }
}
