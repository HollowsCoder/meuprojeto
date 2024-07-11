package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import b0.d;
import i0.b0;
import i0.w;
import j0.b;
import java.util.Arrays;
import java.util.WeakHashMap;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean E = false;
    public int F = -1;
    public int[] G;
    public View[] H;
    public final SparseIntArray I = new SparseIntArray();
    public final SparseIntArray J = new SparseIntArray();
    public final a K = new a();
    public final Rect L = new Rect();

    public static final class a extends c {
    }

    public static class b extends RecyclerView.o {

        /* renamed from: e  reason: collision with root package name */
        public int f1536e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1537f = 0;

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f1538a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f1539b = new SparseIntArray();

        public static int a(int i10, int i11) {
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i12++;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = 1;
                }
            }
            return i12 + 1 > i11 ? i13 + 1 : i13;
        }

        public final void b() {
            this.f1538a.clear();
        }
    }

    public GridLayoutManager(int i10) {
        super(1);
        o1(i10);
    }

    public GridLayoutManager(int i10, int i11) {
        super(1);
        o1(i10);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        o1(RecyclerView.n.H(context, attributeSet, i10, i11).f1655b);
    }

    public final boolean C0() {
        return this.z == null && !this.E;
    }

    public final void E0(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.n.c cVar2) {
        boolean z;
        int i10 = this.F;
        int i11 = 0;
        while (i11 < this.F) {
            int i12 = cVar.d;
            if (i12 < 0 || i12 >= zVar.b()) {
                z = false;
            } else {
                z = true;
            }
            if (z && i10 > 0) {
                ((m.b) cVar2).a(cVar.d, Math.max(0, cVar.f1560g));
                this.K.getClass();
                i10--;
                cVar.d += cVar.f1558e;
                i11++;
            } else {
                return;
            }
        }
    }

    public final int J(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f1540p == 0) {
            return this.F;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return k1(zVar.b() - 1, uVar, zVar) + 1;
    }

    public final View R0(RecyclerView.u uVar, RecyclerView.z zVar, boolean z, boolean z10) {
        int i10;
        int i11;
        int w = w();
        int i12 = 1;
        if (z10) {
            i11 = w() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = w;
            i11 = 0;
        }
        int b10 = zVar.b();
        J0();
        int k10 = this.f1542r.k();
        int g10 = this.f1542r.g();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View v10 = v(i11);
            int G2 = RecyclerView.n.G(v10);
            if (G2 >= 0 && G2 < b10 && l1(G2, uVar, zVar) == 0) {
                if (((RecyclerView.o) v10.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = v10;
                    }
                } else if (this.f1542r.e(v10) < g10 && this.f1542r.b(v10) >= k10) {
                    return v10;
                } else {
                    if (view == null) {
                        view = v10;
                    }
                }
            }
            i11 += i12;
        }
        return view != null ? view : view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00df, code lost:
        if (r13 == r5) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010f, code lost:
        if (r13 == r5) goto L_0x0111;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View T(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.u r25, androidx.recyclerview.widget.RecyclerView.z r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.f1640b
            r4 = 0
            r5 = r23
            if (r3 != 0) goto L_0x000f
        L_0x000d:
            r3 = r4
            goto L_0x001f
        L_0x000f:
            android.view.View r3 = r3.B(r5)
            if (r3 != 0) goto L_0x0016
        L_0x0015:
            goto L_0x000d
        L_0x0016:
            androidx.recyclerview.widget.b r6 = r0.f1639a
            boolean r6 = r6.j(r3)
            if (r6 == 0) goto L_0x001f
            goto L_0x0015
        L_0x001f:
            if (r3 != 0) goto L_0x0022
            return r4
        L_0x0022:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r6 = (androidx.recyclerview.widget.GridLayoutManager.b) r6
            int r7 = r6.f1536e
            int r6 = r6.f1537f
            int r6 = r6 + r7
            android.view.View r5 = super.T(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x0034
            return r4
        L_0x0034:
            r5 = r24
            int r5 = r0.I0(r5)
            r8 = 1
            if (r5 != r8) goto L_0x003f
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            boolean r10 = r0.u
            if (r5 == r10) goto L_0x0046
            r5 = r8
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            r10 = -1
            if (r5 == 0) goto L_0x0052
            int r5 = r22.w()
            int r5 = r5 - r8
            r11 = r10
            r12 = r11
            goto L_0x0059
        L_0x0052:
            int r5 = r22.w()
            r11 = r5
            r12 = r8
            r5 = 0
        L_0x0059:
            int r13 = r0.f1540p
            if (r13 != r8) goto L_0x0065
            boolean r13 = r22.W0()
            if (r13 == 0) goto L_0x0065
            r13 = r8
            goto L_0x0066
        L_0x0065:
            r13 = 0
        L_0x0066:
            int r14 = r0.k1(r5, r1, r2)
            r9 = r10
            r15 = r9
            r16 = r12
            r8 = 0
            r12 = 0
            r10 = r5
            r5 = r4
        L_0x0072:
            if (r10 == r11) goto L_0x0153
            r17 = r11
            int r11 = r0.k1(r10, r1, r2)
            android.view.View r1 = r0.v(r10)
            if (r1 != r3) goto L_0x0082
            goto L_0x0153
        L_0x0082:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0098
            if (r11 == r14) goto L_0x0098
            if (r4 == 0) goto L_0x008e
            goto L_0x0153
        L_0x008e:
            r18 = r3
            r21 = r5
            r19 = r8
            r20 = 1
            goto L_0x0143
        L_0x0098:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.b) r11
            int r2 = r11.f1536e
            r18 = r3
            int r3 = r11.f1537f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b0
            if (r2 != r7) goto L_0x00b0
            if (r3 != r6) goto L_0x00b0
            return r1
        L_0x00b0:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b8
            if (r4 == 0) goto L_0x00c0
        L_0x00b8:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00c3
            if (r5 != 0) goto L_0x00c3
        L_0x00c0:
            r21 = r5
            goto L_0x00e1
        L_0x00c3:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r5
            int r5 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00e7
            if (r5 <= r8) goto L_0x00d8
            goto L_0x00e1
        L_0x00d8:
            if (r5 != r8) goto L_0x0114
            if (r2 <= r15) goto L_0x00de
            r5 = 1
            goto L_0x00df
        L_0x00de:
            r5 = 0
        L_0x00df:
            if (r13 != r5) goto L_0x0114
        L_0x00e1:
            r19 = r8
            r5 = 1
            r20 = 1
            goto L_0x0119
        L_0x00e7:
            if (r4 != 0) goto L_0x0114
            r19 = r8
            androidx.recyclerview.widget.b0 r8 = r0.f1641c
            boolean r8 = r8.b(r1)
            if (r8 == 0) goto L_0x00fd
            androidx.recyclerview.widget.b0 r8 = r0.d
            boolean r8 = r8.b(r1)
            if (r8 == 0) goto L_0x00fd
            r8 = 1
            goto L_0x00fe
        L_0x00fd:
            r8 = 0
        L_0x00fe:
            r20 = 1
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x0118
            if (r5 <= r12) goto L_0x0107
            goto L_0x0111
        L_0x0107:
            if (r5 != r12) goto L_0x0118
            if (r2 <= r9) goto L_0x010e
            r5 = r20
            goto L_0x010f
        L_0x010e:
            r5 = 0
        L_0x010f:
            if (r13 != r5) goto L_0x0118
        L_0x0111:
            r5 = r20
            goto L_0x0119
        L_0x0114:
            r19 = r8
            r20 = 1
        L_0x0118:
            r5 = 0
        L_0x0119:
            if (r5 == 0) goto L_0x0143
            boolean r5 = r1.hasFocusable()
            if (r5 == 0) goto L_0x0132
            int r4 = r11.f1536e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r8 = r3 - r2
            r15 = r4
            r5 = r21
            r4 = r1
            goto L_0x0147
        L_0x0132:
            int r5 = r11.f1536e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r12 = r3 - r2
            r9 = r5
            r8 = r19
            r5 = r1
            goto L_0x0147
        L_0x0143:
            r8 = r19
            r5 = r21
        L_0x0147:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            goto L_0x0072
        L_0x0153:
            r21 = r5
            if (r4 == 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r4 = r21
        L_0x015a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    public final void X(RecyclerView.u uVar, RecyclerView.z zVar, View view, j0.b bVar) {
        int i10;
        int i11;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            W(view, bVar);
            return;
        }
        b bVar2 = (b) layoutParams;
        int k12 = k1(bVar2.a(), uVar, zVar);
        int i12 = 1;
        if (this.f1540p == 0) {
            i10 = k12;
            k12 = bVar2.f1536e;
            int i13 = bVar2.f1537f;
            i11 = 1;
            i12 = i13;
        } else {
            i10 = bVar2.f1536e;
            i11 = bVar2.f1537f;
        }
        bVar.h(b.C0084b.a(k12, i12, i10, i11, false));
    }

    public final void X0(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        boolean z;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z11;
        boolean z12;
        View b10;
        RecyclerView.u uVar2 = uVar;
        RecyclerView.z zVar2 = zVar;
        LinearLayoutManager.c cVar2 = cVar;
        LinearLayoutManager.b bVar2 = bVar;
        int j8 = this.f1542r.j();
        if (j8 != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (w() > 0) {
            i10 = this.G[this.F];
        } else {
            i10 = 0;
        }
        if (z) {
            p1();
        }
        if (cVar2.f1558e == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i23 = this.F;
        if (!z10) {
            i23 = l1(cVar2.d, uVar2, zVar2) + m1(cVar2.d, uVar2, zVar2);
        }
        int i24 = 0;
        while (i24 < this.F) {
            int i25 = cVar2.d;
            if (i25 < 0 || i25 >= zVar.b()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z12 || i23 <= 0) {
                break;
            }
            int i26 = cVar2.d;
            int m12 = m1(i26, uVar2, zVar2);
            if (m12 <= this.F) {
                i23 -= m12;
                if (i23 < 0 || (b10 = cVar2.b(uVar2)) == null) {
                    break;
                }
                this.H[i24] = b10;
                i24++;
            } else {
                throw new IllegalArgumentException("Item at position " + i26 + " requires " + m12 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
        }
        if (i24 == 0) {
            bVar2.f1553b = true;
            return;
        }
        if (z10) {
            i11 = 1;
            i12 = i24;
            i13 = 0;
        } else {
            i13 = i24 - 1;
            i12 = -1;
            i11 = -1;
        }
        int i27 = 0;
        while (i13 != i12) {
            View view = this.H[i13];
            b bVar3 = (b) view.getLayoutParams();
            int m13 = m1(RecyclerView.n.G(view), uVar2, zVar2);
            bVar3.f1537f = m13;
            bVar3.f1536e = i27;
            i27 += m13;
            i13 += i11;
        }
        float f10 = 0.0f;
        int i28 = 0;
        for (int i29 = 0; i29 < i24; i29++) {
            View view2 = this.H[i29];
            if (cVar2.f1564k != null) {
                z11 = false;
                if (z10) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z10) {
                z11 = false;
                b(view2, -1, false);
            } else {
                z11 = false;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f1640b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(z11 ? 1 : 0, z11, z11, z11);
            } else {
                rect.set(recyclerView.K(view2));
            }
            n1(view2, j8, z11);
            int c10 = this.f1542r.c(view2);
            if (c10 > i28) {
                i28 = c10;
            }
            float d = (((float) this.f1542r.d(view2)) * 1.0f) / ((float) ((b) view2.getLayoutParams()).f1537f);
            if (d > f10) {
                f10 = d;
            }
        }
        if (z) {
            i1(Math.max(Math.round(f10 * ((float) this.F)), i10));
            i28 = 0;
            for (int i30 = 0; i30 < i24; i30++) {
                View view3 = this.H[i30];
                n1(view3, 1073741824, true);
                int c11 = this.f1542r.c(view3);
                if (c11 > i28) {
                    i28 = c11;
                }
            }
        }
        for (int i31 = 0; i31 < i24; i31++) {
            View view4 = this.H[i31];
            if (this.f1542r.c(view4) != i28) {
                b bVar4 = (b) view4.getLayoutParams();
                Rect rect2 = bVar4.f1658b;
                int i32 = rect2.top + rect2.bottom + bVar4.topMargin + bVar4.bottomMargin;
                int i33 = rect2.left + rect2.right + bVar4.leftMargin + bVar4.rightMargin;
                int j12 = j1(bVar4.f1536e, bVar4.f1537f);
                if (this.f1540p == 1) {
                    i22 = RecyclerView.n.x(false, j12, 1073741824, i33, bVar4.width);
                    i21 = View.MeasureSpec.makeMeasureSpec(i28 - i32, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i28 - i33, 1073741824);
                    i21 = RecyclerView.n.x(false, j12, 1073741824, i32, bVar4.height);
                    i22 = makeMeasureSpec;
                }
                if (z0(view4, i22, i21, (RecyclerView.o) view4.getLayoutParams())) {
                    view4.measure(i22, i21);
                }
            }
        }
        bVar2.f1552a = i28;
        if (this.f1540p == 1) {
            if (cVar2.f1559f == -1) {
                i20 = cVar2.f1556b;
                i19 = i20 - i28;
            } else {
                int i34 = cVar2.f1556b;
                i19 = i34;
                i20 = i28 + i34;
            }
            i16 = 0;
            i15 = i19;
            i14 = i20;
            i17 = 0;
        } else {
            if (cVar2.f1559f == -1) {
                i17 = cVar2.f1556b;
                i18 = i17 - i28;
            } else {
                int i35 = cVar2.f1556b;
                i18 = i35;
                i17 = i28 + i35;
            }
            i15 = 0;
            i16 = i18;
            i14 = 0;
        }
        for (int i36 = 0; i36 < i24; i36++) {
            View view5 = this.H[i36];
            b bVar5 = (b) view5.getLayoutParams();
            if (this.f1540p != 1) {
                i15 = F() + this.G[bVar5.f1536e];
                i14 = this.f1542r.d(view5) + i15;
            } else if (W0()) {
                i17 = D() + this.G[this.F - bVar5.f1536e];
                i16 = i17 - this.f1542r.d(view5);
            } else {
                i16 = this.G[bVar5.f1536e] + D();
                i17 = this.f1542r.d(view5) + i16;
            }
            RecyclerView.n.O(view5, i16, i15, i17, i14);
            if (bVar5.c() || bVar5.b()) {
                bVar2.f1554c = true;
            }
            bVar2.d = view5.hasFocusable() | bVar2.d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    public final void Y(int i10, int i11) {
        a aVar = this.K;
        aVar.b();
        aVar.f1539b.clear();
    }

    public final void Y0(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i10) {
        boolean z;
        p1();
        if (zVar.b() > 0 && !zVar.f1692g) {
            if (i10 == 1) {
                z = true;
            } else {
                z = false;
            }
            int l12 = l1(aVar.f1549b, uVar, zVar);
            if (z) {
                while (l12 > 0) {
                    int i11 = aVar.f1549b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    aVar.f1549b = i12;
                    l12 = l1(i12, uVar, zVar);
                }
            } else {
                int b10 = zVar.b() - 1;
                int i13 = aVar.f1549b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int l13 = l1(i14, uVar, zVar);
                    if (l13 <= l12) {
                        break;
                    }
                    i13 = i14;
                    l12 = l13;
                }
                aVar.f1549b = i13;
            }
        }
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final void Z() {
        a aVar = this.K;
        aVar.b();
        aVar.f1539b.clear();
    }

    public final void a0(int i10, int i11) {
        a aVar = this.K;
        aVar.b();
        aVar.f1539b.clear();
    }

    public final void b0(int i10, int i11) {
        a aVar = this.K;
        aVar.b();
        aVar.f1539b.clear();
    }

    public final void c0(int i10, int i11) {
        a aVar = this.K;
        aVar.b();
        aVar.f1539b.clear();
    }

    public final void d0(RecyclerView.u uVar, RecyclerView.z zVar) {
        boolean z = zVar.f1692g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int w = w();
            for (int i10 = 0; i10 < w; i10++) {
                b bVar = (b) v(i10).getLayoutParams();
                int a10 = bVar.a();
                sparseIntArray2.put(a10, bVar.f1537f);
                sparseIntArray.put(a10, bVar.f1536e);
            }
        }
        super.d0(uVar, zVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final void e0(RecyclerView.z zVar) {
        super.e0(zVar);
        this.E = false;
    }

    public final void e1(boolean z) {
        if (!z) {
            super.e1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final boolean f(RecyclerView.o oVar) {
        return oVar instanceof b;
    }

    public final void i1(int i10) {
        int i11;
        int[] iArr = this.G;
        int i12 = this.F;
        if (!(iArr != null && iArr.length == i12 + 1 && iArr[iArr.length - 1] == i10)) {
            iArr = new int[(i12 + 1)];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.G = iArr;
    }

    public final int j1(int i10, int i11) {
        if (this.f1540p != 1 || !W0()) {
            int[] iArr = this.G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.G;
        int i12 = this.F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int k(RecyclerView.z zVar) {
        return G0(zVar);
    }

    public final int k1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        boolean z = zVar.f1692g;
        a aVar = this.K;
        if (!z) {
            int i11 = this.F;
            aVar.getClass();
            return c.a(i10, i11);
        }
        int b10 = uVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        int i12 = this.F;
        aVar.getClass();
        return c.a(b10, i12);
    }

    public final int l(RecyclerView.z zVar) {
        return H0(zVar);
    }

    public final int l1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        boolean z = zVar.f1692g;
        a aVar = this.K;
        if (!z) {
            int i11 = this.F;
            aVar.getClass();
            return i10 % i11;
        }
        int i12 = this.J.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int b10 = uVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        int i13 = this.F;
        aVar.getClass();
        return b10 % i13;
    }

    public final int m1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        boolean z = zVar.f1692g;
        a aVar = this.K;
        if (!z) {
            aVar.getClass();
            return 1;
        }
        int i11 = this.I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (uVar.b(i10) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        aVar.getClass();
        return 1;
    }

    public final int n(RecyclerView.z zVar) {
        return G0(zVar);
    }

    public final void n1(View view, int i10, boolean z) {
        int i11;
        int i12;
        boolean z10;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f1658b;
        int i13 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i14 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int j12 = j1(bVar.f1536e, bVar.f1537f);
        if (this.f1540p == 1) {
            i11 = RecyclerView.n.x(false, j12, i10, i14, bVar.width);
            i12 = RecyclerView.n.x(true, this.f1542r.l(), this.f1649m, i13, bVar.height);
        } else {
            int x10 = RecyclerView.n.x(false, j12, i10, i13, bVar.height);
            int x11 = RecyclerView.n.x(true, this.f1542r.l(), this.l, i14, bVar.width);
            i12 = x10;
            i11 = x11;
        }
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        if (z) {
            z10 = z0(view, i11, i12, oVar);
        } else {
            z10 = x0(view, i11, i12, oVar);
        }
        if (z10) {
            view.measure(i11, i12);
        }
    }

    public final int o(RecyclerView.z zVar) {
        return H0(zVar);
    }

    public final void o1(int i10) {
        if (i10 != this.F) {
            this.E = true;
            if (i10 >= 1) {
                this.F = i10;
                this.K.b();
                o0();
                return;
            }
            throw new IllegalArgumentException(d.c("Span count should be at least 1. Provided ", i10));
        }
    }

    public final int p0(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        p1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.p0(i10, uVar, zVar);
    }

    public final void p1() {
        int i10;
        int i11;
        if (this.f1540p == 1) {
            i11 = this.f1650n - E();
            i10 = D();
        } else {
            i11 = this.f1651o - C();
            i10 = F();
        }
        i1(i11 - i10);
    }

    public final RecyclerView.o r() {
        return this.f1540p == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    public final int r0(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        p1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.r0(i10, uVar, zVar);
    }

    public final RecyclerView.o s(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public final RecyclerView.o t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public final void u0(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        if (this.G == null) {
            super.u0(rect, i10, i11);
        }
        int E2 = E() + D();
        int C = C() + F();
        if (this.f1540p == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f1640b;
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            i13 = RecyclerView.n.g(i11, height, w.d.d(recyclerView));
            int[] iArr = this.G;
            i12 = RecyclerView.n.g(i10, iArr[iArr.length - 1] + E2, w.d.e(this.f1640b));
        } else {
            int width = rect.width() + E2;
            RecyclerView recyclerView2 = this.f1640b;
            WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
            i12 = RecyclerView.n.g(i10, width, w.d.e(recyclerView2));
            int[] iArr2 = this.G;
            i13 = RecyclerView.n.g(i11, iArr2[iArr2.length - 1] + C, w.d.d(this.f1640b));
        }
        this.f1640b.setMeasuredDimension(i12, i13);
    }

    public final int y(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f1540p == 1) {
            return this.F;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return k1(zVar.b() - 1, uVar, zVar) + 1;
    }
}
