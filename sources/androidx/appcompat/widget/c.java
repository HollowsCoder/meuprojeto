package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import com.karumi.dexter.R;
import java.util.ArrayList;

public final class c extends androidx.appcompat.view.menu.a {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public final SparseBooleanArray F = new SparseBooleanArray();
    public e G;
    public a H;
    public C0008c I;
    public b J;
    public final f K = new f();
    public d w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f511x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f512y;
    public boolean z;

    public class a extends i {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, m mVar, View view) {
            super(context, mVar, view, false);
            boolean z = false;
            if (!((mVar.A.f356x & 32) == 32 ? true : z)) {
                View view2 = c.this.w;
                this.f363f = view2 == null ? (View) c.this.f280v : view2;
            }
            f fVar = c.this.K;
            this.f366i = fVar;
            i.d dVar = this.f367j;
            if (dVar != null) {
                dVar.j(fVar);
            }
        }

        public final void c() {
            c.this.H = null;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    public class C0008c implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final e f515o;

        public C0008c(e eVar) {
            this.f515o = eVar;
        }

        public final void run() {
            f.a aVar;
            c cVar = c.this;
            androidx.appcompat.view.menu.f fVar = cVar.f276q;
            if (!(fVar == null || (aVar = fVar.f317e) == null)) {
                aVar.b(fVar);
            }
            View view = (View) cVar.f280v;
            if (!(view == null || view.getWindowToken() == null)) {
                e eVar = this.f515o;
                boolean z = true;
                if (!eVar.b()) {
                    if (eVar.f363f == null) {
                        z = false;
                    } else {
                        eVar.d(0, 0, false, false);
                    }
                }
                if (z) {
                    cVar.G = eVar;
                }
            }
            cVar.I = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        public class a extends n0 {
            public a(View view) {
                super(view);
            }

            public final i.f b() {
                e eVar = c.this.G;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            public final boolean c() {
                c.this.l();
                return true;
            }

            public final boolean d() {
                c cVar = c.this;
                if (cVar.I != null) {
                    return false;
                }
                cVar.c();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            i1.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return false;
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.l();
            return true;
        }

        public final boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, d dVar) {
            super(context, fVar, dVar, true);
            this.f364g = 8388613;
            f fVar2 = c.this.K;
            this.f366i = fVar2;
            i.d dVar2 = this.f367j;
            if (dVar2 != null) {
                dVar2.j(fVar2);
            }
        }

        public final void c() {
            c cVar = c.this;
            androidx.appcompat.view.menu.f fVar = cVar.f276q;
            if (fVar != null) {
                fVar.c(true);
            }
            cVar.G = null;
            super.c();
        }
    }

    public class f implements j.a {
        public f() {
        }

        public final void b(androidx.appcompat.view.menu.f fVar, boolean z) {
            if (fVar instanceof m) {
                fVar.k().c(false);
            }
            j.a aVar = c.this.f278s;
            if (aVar != null) {
                aVar.b(fVar, z);
            }
        }

        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            c cVar = c.this;
            if (fVar == cVar.f276q) {
                return false;
            }
            ((m) fVar).A.getClass();
            cVar.getClass();
            j.a aVar = cVar.f278s;
            if (aVar != null) {
                return aVar.c(fVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context);
    }

    public final View a(h hVar, View view, ViewGroup viewGroup) {
        k.a aVar;
        View actionView = hVar.getActionView();
        int i10 = 0;
        if (actionView == null || hVar.e()) {
            if (view instanceof k.a) {
                aVar = (k.a) view;
            } else {
                aVar = (k.a) this.f277r.inflate(this.u, viewGroup, false);
            }
            aVar.c(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f280v);
            if (this.J == null) {
                this.J = new b();
            }
            actionMenuItemView.setPopupCallback(this.J);
            actionView = (View) aVar;
        }
        if (hVar.C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
        c();
        a aVar = this.H;
        if (aVar != null && aVar.b()) {
            aVar.f367j.dismiss();
        }
        j.a aVar2 = this.f278s;
        if (aVar2 != null) {
            aVar2.b(fVar, z10);
        }
    }

    public final boolean c() {
        k kVar;
        C0008c cVar = this.I;
        if (cVar == null || (kVar = this.f280v) == null) {
            e eVar = this.G;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.f367j.dismiss();
            }
            return true;
        }
        ((View) kVar).removeCallbacks(cVar);
        this.I = null;
        return true;
    }

    public final void e(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f275p = context;
        LayoutInflater.from(context);
        this.f276q = fVar;
        Resources resources = context.getResources();
        if (!this.A) {
            this.z = true;
        }
        int i10 = 2;
        this.B = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.D = i10;
        int i13 = this.B;
        if (this.z) {
            if (this.w == null) {
                d dVar = new d(this.f274o);
                this.w = dVar;
                if (this.f512y) {
                    dVar.setImageDrawable(this.f511x);
                    this.f511x = null;
                    this.f512y = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.w.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.w.getMeasuredWidth();
        } else {
            this.w = null;
        }
        this.C = i13;
        float f10 = resources.getDisplayMetrics().density;
    }

    public final void f() {
        k kVar;
        int i10;
        boolean z10;
        boolean z11;
        h hVar;
        ViewGroup viewGroup = (ViewGroup) this.f280v;
        ArrayList<h> arrayList = null;
        boolean z12 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.f276q;
            if (fVar != null) {
                fVar.i();
                ArrayList<h> l = this.f276q.l();
                int size = l.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    h hVar2 = l.get(i11);
                    if ((hVar2.f356x & 32) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof k.a) {
                            hVar = ((k.a) childAt).getItemData();
                        } else {
                            hVar = null;
                        }
                        View a10 = a(hVar2, childAt, viewGroup);
                        if (hVar2 != hVar) {
                            a10.setPressed(false);
                            a10.jumpDrawablesToCurrentState();
                        }
                        if (a10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a10);
                            }
                            ((ViewGroup) this.f280v).addView(a10, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.w) {
                    z10 = false;
                } else {
                    viewGroup.removeViewAt(i10);
                    z10 = true;
                }
                if (!z10) {
                    i10++;
                }
            }
        }
        ((View) this.f280v).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.f276q;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<h> arrayList2 = fVar2.f321i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                i0.b bVar = arrayList2.get(i12).A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.f276q;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.f322j;
        }
        if (this.z && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z12 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z12 = true;
            }
        }
        d dVar = this.w;
        if (z12) {
            if (dVar == null) {
                this.w = new d(this.f274o);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.w.getParent();
            if (viewGroup3 != this.f280v) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.w);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f280v;
                d dVar2 = this.w;
                actionMenuView.getClass();
                ActionMenuView.c cVar = new ActionMenuView.c();
                cVar.gravity = 16;
                cVar.f403a = true;
                actionMenuView.addView(dVar2, cVar);
            }
        } else if (dVar != null && dVar.getParent() == (kVar = this.f280v)) {
            ((ViewGroup) kVar).removeView(this.w);
        }
        ((ActionMenuView) this.f280v).setOverflowReserved(this.z);
    }

    public final boolean g() {
        e eVar = this.G;
        return eVar != null && eVar.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(androidx.appcompat.view.menu.m r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r9
        L_0x0009:
            androidx.appcompat.view.menu.f r2 = r0.z
            androidx.appcompat.view.menu.f r3 = r8.f276q
            if (r2 == r3) goto L_0x0013
            r0 = r2
            androidx.appcompat.view.menu.m r0 = (androidx.appcompat.view.menu.m) r0
            goto L_0x0009
        L_0x0013:
            androidx.appcompat.view.menu.k r2 = r8.f280v
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            int r3 = r2.getChildCount()
            r4 = r1
        L_0x001f:
            if (r4 >= r3) goto L_0x0038
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof androidx.appcompat.view.menu.k.a
            if (r6 == 0) goto L_0x0035
            r6 = r5
            androidx.appcompat.view.menu.k$a r6 = (androidx.appcompat.view.menu.k.a) r6
            androidx.appcompat.view.menu.h r6 = r6.getItemData()
            androidx.appcompat.view.menu.h r7 = r0.A
            if (r6 != r7) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            int r4 = r4 + 1
            goto L_0x001f
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 != 0) goto L_0x003c
            return r1
        L_0x003c:
            androidx.appcompat.view.menu.h r0 = r9.A
            r0.getClass()
            int r0 = r9.size()
            r2 = r1
        L_0x0046:
            r3 = 1
            if (r2 >= r0) goto L_0x005e
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L_0x005b
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L_0x005b
            r0 = r3
            goto L_0x005f
        L_0x005b:
            int r2 = r2 + 1
            goto L_0x0046
        L_0x005e:
            r0 = r1
        L_0x005f:
            androidx.appcompat.widget.c$a r2 = new androidx.appcompat.widget.c$a
            android.content.Context r4 = r8.f275p
            r2.<init>(r4, r9, r5)
            r8.H = r2
            r2.f365h = r0
            i.d r2 = r2.f367j
            if (r2 == 0) goto L_0x0071
            r2.o(r0)
        L_0x0071:
            androidx.appcompat.widget.c$a r0 = r8.H
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x007b
        L_0x0079:
            r1 = r3
            goto L_0x0084
        L_0x007b:
            android.view.View r2 = r0.f363f
            if (r2 != 0) goto L_0x0080
            goto L_0x0084
        L_0x0080:
            r0.d(r1, r1, r1, r1)
            goto L_0x0079
        L_0x0084:
            if (r1 == 0) goto L_0x008e
            androidx.appcompat.view.menu.j$a r0 = r8.f278s
            if (r0 == 0) goto L_0x008d
            r0.c(r9)
        L_0x008d:
            return r3
        L_0x008e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.h(androidx.appcompat.view.menu.m):boolean");
    }

    public final boolean i() {
        int i10;
        ArrayList<h> arrayList;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        c cVar = this;
        androidx.appcompat.view.menu.f fVar = cVar.f276q;
        if (fVar != null) {
            arrayList = fVar.l();
            i10 = arrayList.size();
        } else {
            i10 = 0;
            arrayList = null;
        }
        int i12 = cVar.D;
        int i13 = cVar.C;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f280v;
        int i14 = 0;
        boolean z18 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            h hVar = arrayList.get(i14);
            int i17 = hVar.f357y;
            if ((i17 & 2) == 2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                i15++;
            } else {
                if ((i17 & 1) == 1) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    i16++;
                } else {
                    z18 = true;
                }
            }
            if (cVar.E && hVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (cVar.z && (z18 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = cVar.F;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            h hVar2 = arrayList.get(i19);
            int i21 = hVar2.f357y;
            if ((i21 & 2) == i11) {
                z11 = z10;
            } else {
                z11 = false;
            }
            int i22 = hVar2.f338b;
            if (z11) {
                View a10 = cVar.a(hVar2, (View) null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                hVar2.f(z10);
            } else {
                if ((i21 & true) == z10) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                if (z12) {
                    boolean z19 = sparseBooleanArray.get(i22);
                    if ((i18 > 0 || z19) && i13 > 0) {
                        z13 = z10;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        View a11 = cVar.a(hVar2, (View) null, viewGroup);
                        a11.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a11.getMeasuredWidth();
                        i13 -= measuredWidth2;
                        if (i20 == 0) {
                            i20 = measuredWidth2;
                        }
                        if (i13 + i20 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 &= z15;
                    }
                    if (z13 && i22 != 0) {
                        sparseBooleanArray.put(i22, true);
                    } else if (z19) {
                        sparseBooleanArray.put(i22, false);
                        int i23 = 0;
                        while (i23 < i19) {
                            h hVar3 = arrayList.get(i23);
                            if (hVar3.f338b == i22) {
                                if ((hVar3.f356x & 32) == 32) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    i18++;
                                }
                                hVar3.f(false);
                            }
                            i23++;
                        }
                    }
                    if (z13) {
                        i18--;
                    }
                    hVar2.f(z13);
                } else {
                    hVar2.f(false);
                    i19++;
                    i11 = 2;
                    cVar = this;
                    z10 = true;
                }
            }
            i19++;
            i11 = 2;
            cVar = this;
            z10 = true;
        }
        return z10;
    }

    public final boolean l() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.z || g() || (fVar = this.f276q) == null || this.f280v == null || this.I != null) {
            return false;
        }
        fVar.i();
        if (fVar.f322j.isEmpty()) {
            return false;
        }
        C0008c cVar = new C0008c(new e(this.f275p, this.f276q, this.w));
        this.I = cVar;
        ((View) this.f280v).post(cVar);
        return true;
    }
}
