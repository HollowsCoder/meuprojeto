package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public final class c extends RecyclerView.s {

    /* renamed from: a  reason: collision with root package name */
    public ViewPager2.e f1910a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f1911b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f1912c;
    public final LinearLayoutManager d;

    /* renamed from: e  reason: collision with root package name */
    public int f1913e;

    /* renamed from: f  reason: collision with root package name */
    public int f1914f;

    /* renamed from: g  reason: collision with root package name */
    public final a f1915g = new a();

    /* renamed from: h  reason: collision with root package name */
    public int f1916h;

    /* renamed from: i  reason: collision with root package name */
    public int f1917i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1918j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1919k;
    public boolean l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1920m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1921a;

        /* renamed from: b  reason: collision with root package name */
        public float f1922b;

        /* renamed from: c  reason: collision with root package name */
        public int f1923c;
    }

    public c(ViewPager2 viewPager2) {
        this.f1911b = viewPager2;
        ViewPager2.i iVar = viewPager2.w;
        this.f1912c = iVar;
        this.d = (LinearLayoutManager) iVar.getLayoutManager();
        e();
    }

    public final void a(int i10, RecyclerView recyclerView) {
        boolean z;
        boolean z10;
        ViewPager2.e eVar;
        int i11 = this.f1913e;
        boolean z11 = true;
        if (!(i11 == 1 && this.f1914f == 1) && i10 == 1) {
            this.f1920m = false;
            this.f1913e = 1;
            int i12 = this.f1917i;
            if (i12 != -1) {
                this.f1916h = i12;
                this.f1917i = -1;
            } else if (this.f1916h == -1) {
                this.f1916h = this.d.N0();
            }
            d(1);
            return;
        }
        if (i11 == 1 || i11 == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z || i10 != 2) {
            if (i11 == 1 || i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            a aVar = this.f1915g;
            if (z10 && i10 == 0) {
                f();
                if (!this.f1919k) {
                    int i13 = aVar.f1921a;
                    if (!(i13 == -1 || (eVar = this.f1910a) == null)) {
                        eVar.b(0.0f, i13, 0);
                    }
                } else if (aVar.f1923c == 0) {
                    int i14 = this.f1916h;
                    int i15 = aVar.f1921a;
                    if (i14 != i15) {
                        c(i15);
                    }
                } else {
                    z11 = false;
                }
                if (z11) {
                    d(0);
                    e();
                }
            }
            if (this.f1913e == 2 && i10 == 0 && this.l) {
                f();
                if (aVar.f1923c == 0) {
                    int i16 = this.f1917i;
                    int i17 = aVar.f1921a;
                    if (i16 != i17) {
                        if (i17 == -1) {
                            i17 = 0;
                        }
                        c(i17);
                    }
                    d(0);
                    e();
                }
            }
        } else if (this.f1919k) {
            d(2);
            this.f1918j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r7 == r8) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r5.f1916h == r7) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f1919k = r6
            r5.f()
            boolean r0 = r5.f1918j
            r1 = -1
            androidx.viewpager2.widget.c$a r2 = r5.f1915g
            r3 = 0
            if (r0 == 0) goto L_0x003f
            r5.f1918j = r3
            if (r8 > 0) goto L_0x002b
            if (r8 != 0) goto L_0x0029
            if (r7 >= 0) goto L_0x0018
            r7 = r6
            goto L_0x0019
        L_0x0018:
            r7 = r3
        L_0x0019:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f1911b
            androidx.viewpager2.widget.ViewPager2$d r8 = r8.f1891t
            int r8 = r8.A()
            if (r8 != r6) goto L_0x0025
            r8 = r6
            goto L_0x0026
        L_0x0025:
            r8 = r3
        L_0x0026:
            if (r7 != r8) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r7 = r3
            goto L_0x002c
        L_0x002b:
            r7 = r6
        L_0x002c:
            if (r7 == 0) goto L_0x0036
            int r7 = r2.f1923c
            if (r7 == 0) goto L_0x0036
            int r7 = r2.f1921a
            int r7 = r7 + r6
            goto L_0x0038
        L_0x0036:
            int r7 = r2.f1921a
        L_0x0038:
            r5.f1917i = r7
            int r8 = r5.f1916h
            if (r8 == r7) goto L_0x004b
            goto L_0x0048
        L_0x003f:
            int r7 = r5.f1913e
            if (r7 != 0) goto L_0x004b
            int r7 = r2.f1921a
            if (r7 != r1) goto L_0x0048
            r7 = r3
        L_0x0048:
            r5.c(r7)
        L_0x004b:
            int r7 = r2.f1921a
            if (r7 != r1) goto L_0x0050
            r7 = r3
        L_0x0050:
            float r8 = r2.f1922b
            int r0 = r2.f1923c
            androidx.viewpager2.widget.ViewPager2$e r4 = r5.f1910a
            if (r4 == 0) goto L_0x005b
            r4.b(r8, r7, r0)
        L_0x005b:
            int r7 = r2.f1921a
            int r8 = r5.f1917i
            if (r7 == r8) goto L_0x0063
            if (r8 != r1) goto L_0x0071
        L_0x0063:
            int r7 = r2.f1923c
            if (r7 != 0) goto L_0x0071
            int r7 = r5.f1914f
            if (r7 == r6) goto L_0x0071
            r5.d(r3)
            r5.e()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i10) {
        ViewPager2.e eVar = this.f1910a;
        if (eVar != null) {
            eVar.c(i10);
        }
    }

    public final void d(int i10) {
        if ((this.f1913e != 3 || this.f1914f != 0) && this.f1914f != i10) {
            this.f1914f = i10;
            ViewPager2.e eVar = this.f1910a;
            if (eVar != null) {
                eVar.a(i10);
            }
        }
    }

    public final void e() {
        this.f1913e = 0;
        this.f1914f = 0;
        a aVar = this.f1915g;
        aVar.f1921a = -1;
        aVar.f1922b = 0.0f;
        aVar.f1923c = 0;
        this.f1916h = -1;
        this.f1917i = -1;
        this.f1918j = false;
        this.f1919k = false;
        this.f1920m = false;
        this.l = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011e, code lost:
        if (r5[r1 - 1][1] >= r6) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0142 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r13 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r13.d
            int r1 = r0.N0()
            androidx.viewpager2.widget.c$a r2 = r13.f1915g
            r2.f1921a = r1
            r3 = 0
            r4 = 0
            r5 = -1
            if (r1 != r5) goto L_0x0016
            r2.f1921a = r5
            r2.f1922b = r3
            r2.f1923c = r4
            return
        L_0x0016:
            android.view.View r1 = r0.q(r1)
            if (r1 != 0) goto L_0x0023
            r2.f1921a = r5
            r2.f1922b = r3
            r2.f1923c = r4
            return
        L_0x0023:
            int r5 = androidx.recyclerview.widget.RecyclerView.n.B(r1)
            int r6 = androidx.recyclerview.widget.RecyclerView.n.I(r1)
            int r7 = androidx.recyclerview.widget.RecyclerView.n.K(r1)
            int r8 = androidx.recyclerview.widget.RecyclerView.n.u(r1)
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            boolean r10 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r10 == 0) goto L_0x0049
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            int r10 = r9.leftMargin
            int r5 = r5 + r10
            int r10 = r9.rightMargin
            int r6 = r6 + r10
            int r10 = r9.topMargin
            int r7 = r7 + r10
            int r9 = r9.bottomMargin
            int r8 = r8 + r9
        L_0x0049:
            int r9 = r1.getHeight()
            int r9 = r9 + r7
            int r9 = r9 + r8
            int r8 = r1.getWidth()
            int r8 = r8 + r5
            int r8 = r8 + r6
            int r6 = r0.f1540p
            r10 = 1
            if (r6 != 0) goto L_0x005c
            r6 = r10
            goto L_0x005d
        L_0x005c:
            r6 = r4
        L_0x005d:
            androidx.recyclerview.widget.RecyclerView r11 = r13.f1912c
            if (r6 == 0) goto L_0x007d
            int r1 = r1.getLeft()
            int r1 = r1 - r5
            int r5 = r11.getPaddingLeft()
            int r1 = r1 - r5
            androidx.viewpager2.widget.ViewPager2 r5 = r13.f1911b
            androidx.viewpager2.widget.ViewPager2$d r5 = r5.f1891t
            int r5 = r5.A()
            if (r5 != r10) goto L_0x0077
            r5 = r10
            goto L_0x0078
        L_0x0077:
            r5 = r4
        L_0x0078:
            if (r5 == 0) goto L_0x007b
            int r1 = -r1
        L_0x007b:
            r9 = r8
            goto L_0x0087
        L_0x007d:
            int r1 = r1.getTop()
            int r1 = r1 - r7
            int r5 = r11.getPaddingTop()
            int r1 = r1 - r5
        L_0x0087:
            int r1 = -r1
            r2.f1923c = r1
            if (r1 >= 0) goto L_0x016a
            g1.b r1 = new g1.b
            int r1 = r0.w()
            if (r1 != 0) goto L_0x0096
            goto L_0x0121
        L_0x0096:
            int r3 = r0.f1540p
            if (r3 != 0) goto L_0x009c
            r3 = r10
            goto L_0x009d
        L_0x009c:
            r3 = r4
        L_0x009d:
            r5 = 2
            int[] r6 = new int[r5]
            r6[r10] = r5
            r6[r4] = r1
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r6)
            int[][] r5 = (int[][]) r5
            r6 = r4
        L_0x00ad:
            if (r6 >= r1) goto L_0x00f5
            android.view.View r7 = r0.v(r6)
            if (r7 == 0) goto L_0x00ed
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            boolean r9 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x00c0
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            goto L_0x00c2
        L_0x00c0:
            android.view.ViewGroup$MarginLayoutParams r8 = g1.b.f4965a
        L_0x00c2:
            r9 = r5[r6]
            if (r3 == 0) goto L_0x00cd
            int r11 = r7.getLeft()
            int r12 = r8.leftMargin
            goto L_0x00d3
        L_0x00cd:
            int r11 = r7.getTop()
            int r12 = r8.topMargin
        L_0x00d3:
            int r11 = r11 - r12
            r9[r4] = r11
            r9 = r5[r6]
            if (r3 == 0) goto L_0x00e1
            int r7 = r7.getRight()
            int r8 = r8.rightMargin
            goto L_0x00e7
        L_0x00e1:
            int r7 = r7.getBottom()
            int r8 = r8.bottomMargin
        L_0x00e7:
            int r7 = r7 + r8
            r9[r10] = r7
            int r6 = r6 + 1
            goto L_0x00ad
        L_0x00ed:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "null view contained in the view hierarchy"
            r0.<init>(r1)
            throw r0
        L_0x00f5:
            g1.a r3 = new g1.a
            r3.<init>()
            java.util.Arrays.sort(r5, r3)
            r3 = r10
        L_0x00fe:
            if (r3 >= r1) goto L_0x0110
            int r6 = r3 + -1
            r6 = r5[r6]
            r6 = r6[r10]
            r7 = r5[r3]
            r7 = r7[r4]
            if (r6 == r7) goto L_0x010d
            goto L_0x0123
        L_0x010d:
            int r3 = r3 + 1
            goto L_0x00fe
        L_0x0110:
            r3 = r5[r4]
            r6 = r3[r10]
            r3 = r3[r4]
            int r6 = r6 - r3
            if (r3 > 0) goto L_0x0123
            int r1 = r1 - r10
            r1 = r5[r1]
            r1 = r1[r10]
            if (r1 >= r6) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r1 = r10
            goto L_0x0124
        L_0x0123:
            r1 = r4
        L_0x0124:
            if (r1 == 0) goto L_0x012c
            int r1 = r0.w()
            if (r1 > r10) goto L_0x0147
        L_0x012c:
            int r1 = r0.w()
            r3 = r4
        L_0x0131:
            if (r3 >= r1) goto L_0x0142
            android.view.View r5 = r0.v(r3)
            boolean r5 = g1.b.a(r5)
            if (r5 == 0) goto L_0x013f
            r0 = r10
            goto L_0x0143
        L_0x013f:
            int r3 = r3 + 1
            goto L_0x0131
        L_0x0142:
            r0 = r4
        L_0x0143:
            if (r0 == 0) goto L_0x0147
            r0 = r10
            goto L_0x0148
        L_0x0147:
            r0 = r4
        L_0x0148:
            if (r0 == 0) goto L_0x0152
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            r0.<init>(r1)
            throw r0
        L_0x0152:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r10]
            int r2 = r2.f1923c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r4] = r2
            java.lang.String r2 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r1 = java.lang.String.format(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x016a:
            if (r9 != 0) goto L_0x016d
            goto L_0x0171
        L_0x016d:
            float r0 = (float) r1
            float r1 = (float) r9
            float r3 = r0 / r1
        L_0x0171:
            r2.f1922b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.f():void");
    }
}
