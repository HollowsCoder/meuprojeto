package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.karumi.dexter.R;
import i0.b0;
import i0.e0;
import i0.j;
import i0.w;
import j0.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.e;
import p9.u;
import t5.c;
import t5.d;
import t5.f;
import t5.g;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public ValueAnimator A;
    public int[] B;
    public Drawable C;

    /* renamed from: o  reason: collision with root package name */
    public int f3205o;

    /* renamed from: p  reason: collision with root package name */
    public int f3206p = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f3207q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f3208r = -1;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3209s;

    /* renamed from: t  reason: collision with root package name */
    public int f3210t = 0;
    public e0 u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3211v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3212x;

    /* renamed from: y  reason: collision with root package name */
    public int f3213y;
    public WeakReference<View> z;

    public static class BaseBehavior<T extends AppBarLayout> extends c<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f3214j;

        /* renamed from: k  reason: collision with root package name */
        public int f3215k;
        public ValueAnimator l;

        /* renamed from: m  reason: collision with root package name */
        public int f3216m = -1;

        /* renamed from: n  reason: collision with root package name */
        public boolean f3217n;

        /* renamed from: o  reason: collision with root package name */
        public float f3218o;

        /* renamed from: p  reason: collision with root package name */
        public WeakReference<View> f3219p;

        public static class a extends n0.a {
            public static final Parcelable.Creator<a> CREATOR = new C0031a();

            /* renamed from: q  reason: collision with root package name */
            public int f3220q;

            /* renamed from: r  reason: collision with root package name */
            public float f3221r;

            /* renamed from: s  reason: collision with root package name */
            public boolean f3222s;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a  reason: collision with other inner class name */
            public static class C0031a implements Parcelable.ClassLoaderCreator<a> {
                public final Object createFromParcel(Parcel parcel) {
                    return new a(parcel, (ClassLoader) null);
                }

                public final Object[] newArray(int i10) {
                    return new a[i10];
                }

                public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f3220q = parcel.readInt();
                this.f3221r = parcel.readFloat();
                this.f3222s = parcel.readByte() != 0;
            }

            public a(AbsSavedState absSavedState) {
                super(absSavedState);
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeParcelable(this.f7340o, i10);
                parcel.writeInt(this.f3220q);
                parcel.writeFloat(this.f3221r);
                parcel.writeByte(this.f3222s ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static View C(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof j) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void G(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            L_0x000a:
                r4 = 0
                if (r3 >= r1) goto L_0x0021
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L_0x001e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L_0x001e
                goto L_0x0022
            L_0x001e:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0021:
                r5 = r4
            L_0x0022:
                if (r5 == 0) goto L_0x00b2
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r0 = (com.google.android.material.appbar.AppBarLayout.a) r0
                int r0 = r0.f3223a
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L_0x005e
                java.util.WeakHashMap<android.view.View, i0.b0> r1 = i0.w.f6004a
                int r1 = i0.w.d.d(r5)
                if (r10 <= 0) goto L_0x004b
                r10 = r0 & 12
                if (r10 == 0) goto L_0x004b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x005e
                goto L_0x005c
            L_0x004b:
                r10 = r0 & 2
                if (r10 == 0) goto L_0x005e
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x005e
            L_0x005c:
                r9 = r3
                goto L_0x005f
            L_0x005e:
                r9 = r2
            L_0x005f:
                boolean r10 = r8.f3212x
                if (r10 == 0) goto L_0x006b
                android.view.View r9 = C(r7)
                boolean r9 = r8.d(r9)
            L_0x006b:
                boolean r9 = r8.c(r9)
                if (r11 != 0) goto L_0x00af
                if (r9 == 0) goto L_0x00b2
                o.c r9 = r7.f932p
                java.lang.Object r9 = r9.f7536b
                n.i r9 = (n.i) r9
                java.lang.Object r9 = r9.getOrDefault(r8, r4)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r7 = r7.f934r
                r7.clear()
                if (r9 == 0) goto L_0x0089
                r7.addAll(r9)
            L_0x0089:
                int r9 = r7.size()
                r10 = r2
            L_0x008e:
                if (r10 >= r9) goto L_0x00ad
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f942a
                boolean r0 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L_0x00aa
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f9010f
                if (r7 == 0) goto L_0x00ad
                r2 = r3
                goto L_0x00ad
            L_0x00aa:
                int r10 = r10 + 1
                goto L_0x008e
            L_0x00ad:
                if (r2 == 0) goto L_0x00b2
            L_0x00af:
                r8.jumpDrawablesToCurrentState()
            L_0x00b2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int i11;
            int abs = Math.abs(x() - i10);
            float abs2 = Math.abs(0.0f);
            float f10 = (float) abs;
            if (abs2 > 0.0f) {
                i11 = Math.round((f10 / abs2) * 1000.0f) * 3;
            } else {
                i11 = (int) (((f10 / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            int x10 = x();
            if (x10 == i10) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(s5.a.f8787e);
                this.l.addUpdateListener(new a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration((long) Math.min(i11, 600));
            this.l.setIntValues(new int[]{x10, i10});
            this.l.start();
        }

        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            int i11;
            int i12;
            if (i10 != 0) {
                if (i10 < 0) {
                    i12 = -appBarLayout.getTotalScrollRange();
                    i11 = appBarLayout.getDownNestedPreScrollRange() + i12;
                } else {
                    i12 = -appBarLayout.getUpNestedPreScrollRange();
                    i11 = 0;
                }
                int i13 = i12;
                int i14 = i11;
                if (i13 != i14) {
                    iArr[1] = z(coordinatorLayout, appBarLayout, x() - i10, i13, i14);
                }
            }
            if (appBarLayout.f3212x) {
                appBarLayout.c(appBarLayout.d(view));
            }
        }

        public final void E(CoordinatorLayout coordinatorLayout, T t10) {
            boolean z;
            boolean z10;
            boolean z11;
            boolean z12;
            int x10 = x();
            int childCount = t10.getChildCount();
            int i10 = 0;
            while (true) {
                z = true;
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = t10.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                a aVar = (a) childAt.getLayoutParams();
                if ((aVar.f3223a & 32) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    top -= aVar.topMargin;
                    bottom += aVar.bottomMargin;
                }
                int i11 = -x10;
                if (top <= i11 && bottom >= i11) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                View childAt2 = t10.getChildAt(i10);
                a aVar2 = (a) childAt2.getLayoutParams();
                int i12 = aVar2.f3223a;
                if ((i12 & 17) == 17) {
                    int i13 = -childAt2.getTop();
                    int i14 = -childAt2.getBottom();
                    if (i10 == t10.getChildCount() - 1) {
                        i14 += t10.getTopInset();
                    }
                    if ((i12 & 2) == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        WeakHashMap<View, b0> weakHashMap = w.f6004a;
                        i14 += w.d.d(childAt2);
                    } else {
                        if ((i12 & 5) == 5) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
                            int d = w.d.d(childAt2) + i14;
                            if (x10 < d) {
                                i13 = d;
                            } else {
                                i14 = d;
                            }
                        }
                    }
                    if ((i12 & 32) != 32) {
                        z = false;
                    }
                    if (z) {
                        i13 += aVar2.topMargin;
                        i14 -= aVar2.bottomMargin;
                    }
                    if (x10 < (i14 + i13) / 2) {
                        i13 = i14;
                    }
                    B(coordinatorLayout, t10, androidx.databinding.a.l(i13, -t10.getTotalScrollRange(), 0));
                }
            }
        }

        public final void F(CoordinatorLayout coordinatorLayout, T t10) {
            b.a aVar = b.a.f6390f;
            w.h(coordinatorLayout, aVar.a());
            w.f(coordinatorLayout, 0);
            b.a aVar2 = b.a.f6391g;
            w.h(coordinatorLayout, aVar2.a());
            w.f(coordinatorLayout, 0);
            View C = C(coordinatorLayout);
            if (C != null && t10.getTotalScrollRange() != 0 && (((CoordinatorLayout.f) C.getLayoutParams()).f942a instanceof ScrollingViewBehavior)) {
                if (x() != (-t10.getTotalScrollRange()) && C.canScrollVertically(1)) {
                    w.i(coordinatorLayout, aVar, new c(t10, false));
                }
                if (x() == 0) {
                    return;
                }
                if (C.canScrollVertically(-1)) {
                    int i10 = -t10.getDownNestedPreScrollRange();
                    if (i10 != 0) {
                        w.i(coordinatorLayout, aVar2, new b(this, coordinatorLayout, t10, C, i10));
                        return;
                    }
                    return;
                }
                w.i(coordinatorLayout, aVar2, new c(t10, true));
            }
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z;
            int i11;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            int i12 = this.f3216m;
            if (i12 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i12);
                int i13 = -childAt.getBottom();
                if (this.f3217n) {
                    WeakHashMap<View, b0> weakHashMap = w.f6004a;
                    i11 = appBarLayout.getTopInset() + w.d.d(childAt) + i13;
                } else {
                    i11 = Math.round(((float) childAt.getHeight()) * this.f3218o) + i13;
                }
                A(coordinatorLayout, appBarLayout, i11);
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i14 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        B(coordinatorLayout, appBarLayout, i14);
                    } else {
                        A(coordinatorLayout, appBarLayout, i14);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        B(coordinatorLayout, appBarLayout, 0);
                    } else {
                        A(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f3210t = 0;
            this.f3216m = -1;
            int l8 = androidx.databinding.a.l(s(), -appBarLayout.getTotalScrollRange(), 0);
            f fVar = this.f9011a;
            if (fVar == null) {
                this.f9012b = l8;
            } else if (fVar.d != l8) {
                fVar.d = l8;
                fVar.a();
            }
            G(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.f3205o = s();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
                w.d.k(appBarLayout);
            }
            F(coordinatorLayout, appBarLayout);
            return true;
        }

        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.f) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            D(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                AppBarLayout appBarLayout2 = appBarLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout2, x() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                F(coordinatorLayout, appBarLayout);
            }
        }

        public final void n(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof a) {
                a aVar = (a) parcelable;
                this.f3216m = aVar.f3220q;
                this.f3218o = aVar.f3221r;
                this.f3217n = aVar.f3222s;
                return;
            }
            this.f3216m = -1;
        }

        public final Parcelable o(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int s10 = s();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + s10;
                if (childAt.getTop() + s10 > 0 || bottom < 0) {
                    i10++;
                } else {
                    a aVar = new a(absSavedState);
                    aVar.f3220q = i10;
                    WeakHashMap<View, b0> weakHashMap = w.f6004a;
                    if (bottom == appBarLayout.getTopInset() + w.d.d(childAt)) {
                        z = true;
                    }
                    aVar.f3222s = z;
                    aVar.f3221r = ((float) bottom) / ((float) childAt.getHeight());
                    return aVar;
                }
            }
            return absSavedState;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            if (r2 != false) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 0
                if (r5 == 0) goto L_0x002c
                boolean r5 = r3.f3212x
                r0 = 1
                if (r5 != 0) goto L_0x002b
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L_0x0014
                r5 = r0
                goto L_0x0015
            L_0x0014:
                r5 = r6
            L_0x0015:
                if (r5 == 0) goto L_0x0028
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0028
                r2 = r0
                goto L_0x0029
            L_0x0028:
                r2 = r6
            L_0x0029:
                if (r2 == 0) goto L_0x002c
            L_0x002b:
                r6 = r0
            L_0x002c:
                if (r6 == 0) goto L_0x0035
                android.animation.ValueAnimator r2 = r1.l
                if (r2 == 0) goto L_0x0035
                r2.cancel()
            L_0x0035:
                r2 = 0
                r1.f3219p = r2
                r1.f3215k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f3215k == 0 || i10 == 1) {
                E(coordinatorLayout, appBarLayout);
                if (appBarLayout.f3212x) {
                    appBarLayout.c(appBarLayout.d(view2));
                }
            }
            this.f3219p = new WeakReference<>(view2);
        }

        public final boolean u(View view) {
            View view2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.f3219p;
            if (weakReference == null || ((view2 = weakReference.get()) != null && view2.isShown() && !view2.canScrollVertically(-1))) {
                return true;
            }
            return false;
        }

        public final int v(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        public final int w(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        public final int x() {
            return s() + this.f3214j;
        }

        public final void y(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            E(coordinatorLayout, appBarLayout);
            if (appBarLayout.f3212x) {
                appBarLayout.c(appBarLayout.d(C(coordinatorLayout)));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00b9  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00c0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int z(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                int r0 = r7.x()
                r1 = 0
                if (r11 == 0) goto L_0x00c6
                if (r0 < r11) goto L_0x00c6
                if (r0 > r12) goto L_0x00c6
                int r10 = androidx.databinding.a.l(r10, r11, r12)
                if (r0 == r10) goto L_0x00c8
                boolean r11 = r9.f3209s
                if (r11 == 0) goto L_0x0088
                int r11 = java.lang.Math.abs(r10)
                int r12 = r9.getChildCount()
                r2 = r1
            L_0x0020:
                if (r2 >= r12) goto L_0x0088
                android.view.View r3 = r9.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r4 = (com.google.android.material.appbar.AppBarLayout.a) r4
                android.view.animation.Interpolator r5 = r4.f3224b
                int r6 = r3.getTop()
                if (r11 < r6) goto L_0x0085
                int r6 = r3.getBottom()
                if (r11 > r6) goto L_0x0085
                if (r5 == 0) goto L_0x0088
                int r12 = r4.f3223a
                r2 = r12 & 1
                if (r2 == 0) goto L_0x0059
                int r2 = r3.getHeight()
                int r6 = r4.topMargin
                int r2 = r2 + r6
                int r4 = r4.bottomMargin
                int r2 = r2 + r4
                int r2 = r2 + r1
                r12 = r12 & 2
                if (r12 == 0) goto L_0x005a
                java.util.WeakHashMap<android.view.View, i0.b0> r12 = i0.w.f6004a
                int r12 = i0.w.d.d(r3)
                int r2 = r2 - r12
                goto L_0x005a
            L_0x0059:
                r2 = r1
            L_0x005a:
                java.util.WeakHashMap<android.view.View, i0.b0> r12 = i0.w.f6004a
                boolean r12 = i0.w.d.b(r3)
                if (r12 == 0) goto L_0x0067
                int r12 = r9.getTopInset()
                int r2 = r2 - r12
            L_0x0067:
                if (r2 <= 0) goto L_0x0088
                int r12 = r3.getTop()
                int r11 = r11 - r12
                float r12 = (float) r2
                float r11 = (float) r11
                float r11 = r11 / r12
                float r11 = r5.getInterpolation(r11)
                float r11 = r11 * r12
                int r11 = java.lang.Math.round(r11)
                int r12 = java.lang.Integer.signum(r10)
                int r2 = r3.getTop()
                int r2 = r2 + r11
                int r2 = r2 * r12
                goto L_0x0089
            L_0x0085:
                int r2 = r2 + 1
                goto L_0x0020
            L_0x0088:
                r2 = r10
            L_0x0089:
                t5.f r11 = r7.f9011a
                r12 = 1
                if (r11 == 0) goto L_0x009b
                int r3 = r11.d
                if (r3 == r2) goto L_0x0099
                r11.d = r2
                r11.a()
                r11 = r12
                goto L_0x009e
            L_0x0099:
                r11 = r1
                goto L_0x009e
            L_0x009b:
                r7.f9012b = r2
                goto L_0x0099
            L_0x009e:
                int r3 = r0 - r10
                int r2 = r10 - r2
                r7.f3214j = r2
                if (r11 != 0) goto L_0x00ad
                boolean r11 = r9.f3209s
                if (r11 == 0) goto L_0x00ad
                r8.d(r9)
            L_0x00ad:
                int r11 = r7.s()
                r9.f3205o = r11
                boolean r11 = r9.willNotDraw()
                if (r11 != 0) goto L_0x00be
                java.util.WeakHashMap<android.view.View, i0.b0> r11 = i0.w.f6004a
                i0.w.d.k(r9)
            L_0x00be:
                if (r10 >= r0) goto L_0x00c1
                r12 = -1
            L_0x00c1:
                G(r8, r9, r10, r12, r1)
                r1 = r3
                goto L_0x00c8
            L_0x00c6:
                r7.f3214j = r1
            L_0x00c8:
                r7.F(r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends d {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.O);
            this.f9010f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int i10;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f942a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f3214j + this.f9009e;
                if (this.f9010f == 0) {
                    i10 = 0;
                } else {
                    float v10 = v(view2);
                    int i11 = this.f9010f;
                    i10 = androidx.databinding.a.l((int) (v10 * ((float) i11)), 0, i11);
                }
                int i12 = bottom - i10;
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                view.offsetTopAndBottom(i12);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f3212x) {
                    appBarLayout.c(appBarLayout.d(view));
                }
            }
            return false;
        }

        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                w.h(coordinatorLayout, b.a.f6390f.a());
                w.f(coordinatorLayout, 0);
                w.h(coordinatorLayout, b.a.f6391g.a());
                w.f(coordinatorLayout, 0);
            }
        }

        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            ArrayList f10 = coordinatorLayout.f(view);
            int size = f10.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) f10.get(i10);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i10++;
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.f9008c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    appBarLayout.b(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public final AppBarLayout u(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final float v(View view) {
            int i10;
            int i11;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f942a;
                if (cVar instanceof BaseBehavior) {
                    i10 = ((BaseBehavior) cVar).x();
                } else {
                    i10 = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i10 > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) i10) / ((float) i11)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public final int w(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return view.getMeasuredHeight();
        }
    }

    public static class a extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public final int f3223a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final Interpolator f3224b;

        public a() {
            super(-1, -2);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f8113q);
            this.f3223a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f3224b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r15, android.util.AttributeSet r16) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            r2 = 2131952226(0x7f130262, float:1.9540889E38)
            r3 = 2130968632(0x7f040038, float:1.7545923E38)
            r4 = r15
            android.content.Context r2 = q6.a.a(r15, r0, r3, r2)
            r14.<init>(r2, r0, r3)
            r8 = -1
            r1.f3206p = r8
            r1.f3207q = r8
            r1.f3208r = r8
            r9 = 0
            r1.f3210t = r9
            android.content.Context r10 = r14.getContext()
            r11 = 1
            r14.setOrientation(r11)
            int r12 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r2 = android.view.ViewOutlineProvider.BOUNDS
            r14.setOutlineProvider(r2)
            r6 = 2131952226(0x7f130262, float:1.9540889E38)
            android.content.Context r13 = r14.getContext()
            int[] r4 = t5.g.f9016a
            int[] r7 = new int[r9]
            r5 = 2130968632(0x7f040038, float:1.7545923E38)
            r2 = r13
            r3 = r16
            android.content.res.TypedArray r2 = h6.k.d(r2, r3, r4, r5, r6, r7)
            boolean r3 = r2.hasValue(r9)     // Catch:{ all -> 0x00ef }
            if (r3 == 0) goto L_0x0050
            int r3 = r2.getResourceId(r9, r9)     // Catch:{ all -> 0x00ef }
            android.animation.StateListAnimator r3 = android.animation.AnimatorInflater.loadStateListAnimator(r13, r3)     // Catch:{ all -> 0x00ef }
            r14.setStateListAnimator(r3)     // Catch:{ all -> 0x00ef }
        L_0x0050:
            r2.recycle()
            int[] r4 = p9.u.f8112p
            r6 = 2131952226(0x7f130262, float:1.9540889E38)
            int[] r7 = new int[r9]
            r5 = 2130968632(0x7f040038, float:1.7545923E38)
            r2 = r10
            r3 = r16
            android.content.res.TypedArray r0 = h6.k.d(r2, r3, r4, r5, r6, r7)
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r9)
            java.util.WeakHashMap<android.view.View, i0.b0> r3 = i0.w.f6004a
            i0.w.d.q(r14, r2)
            android.graphics.drawable.Drawable r2 = r14.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x0091
            android.graphics.drawable.Drawable r2 = r14.getBackground()
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            m6.f r3 = new m6.f
            r3.<init>()
            int r2 = r2.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r3.j(r2)
            r3.h(r10)
            i0.w.d.q(r14, r3)
        L_0x0091:
            r2 = 4
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x009f
            boolean r2 = r0.getBoolean(r2, r9)
            r14.b(r2, r9, r9)
        L_0x009f:
            r2 = 3
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x00ae
            int r2 = r0.getDimensionPixelSize(r2, r9)
            float r2 = (float) r2
            t5.g.a(r14, r2)
        L_0x00ae:
            r2 = 26
            if (r12 < r2) goto L_0x00cd
            r2 = 2
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x00c0
            boolean r2 = r0.getBoolean(r2, r9)
            r14.setKeyboardNavigationCluster(r2)
        L_0x00c0:
            boolean r2 = r0.hasValue(r11)
            if (r2 == 0) goto L_0x00cd
            boolean r2 = r0.getBoolean(r11, r9)
            r14.setTouchscreenBlocksFocus(r2)
        L_0x00cd:
            r2 = 5
            boolean r2 = r0.getBoolean(r2, r9)
            r1.f3212x = r2
            r2 = 6
            int r2 = r0.getResourceId(r2, r8)
            r1.f3213y = r2
            r2 = 7
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r14.setStatusBarForeground(r2)
            r0.recycle()
            t5.a r0 = new t5.a
            r0.<init>(r14)
            i0.w.i.u(r14, r0)
            return
        L_0x00ef:
            r0 = move-exception
            r2.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static a a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new a((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        int i10 = 0;
        int i11 = (z10 ? 1 : 2) | (z11 ? 4 : 0);
        if (z12) {
            i10 = 8;
        }
        this.f3210t = i11 | i10;
        requestLayout();
    }

    public final boolean c(boolean z10) {
        float f10;
        if (this.w == z10) {
            return false;
        }
        this.w = z10;
        refreshDrawableState();
        if (this.f3212x && (getBackground() instanceof m6.f)) {
            m6.f fVar = (m6.f) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = dimension;
            }
            if (!z10) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f10, dimension});
            this.A = ofFloat;
            ofFloat.setDuration((long) getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.A.setInterpolator(s5.a.f8784a);
            this.A.addUpdateListener(new t5.b(fVar));
            this.A.start();
        }
        return true;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final boolean d(View view) {
        int i10;
        View view2;
        View view3 = null;
        if (this.z == null && (i10 = this.f3213y) != -1) {
            if (view != null) {
                view2 = view.findViewById(i10);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f3213y);
            }
            if (view2 != null) {
                this.z = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.z;
        if (weakReference != null) {
            view3 = weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view == null || (!view.canScrollVertically(-1) && view.getScrollY() <= 0)) {
            return false;
        }
        return true;
    }

    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        if (this.C == null || getTopInset() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f3205o));
            this.C.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.C;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (!w.d.b(childAt)) {
            return true;
        }
        return false;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f3207q
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return r0
        L_0x0006:
            int r0 = r9.getChildCount()
            int r0 = r0 + -1
            r1 = 0
            r2 = r1
        L_0x000e:
            if (r0 < 0) goto L_0x0060
            android.view.View r3 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$a r4 = (com.google.android.material.appbar.AppBarLayout.a) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f3223a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L_0x005a
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L_0x0036
            java.util.WeakHashMap<android.view.View, i0.b0> r4 = i0.w.f6004a
            int r4 = i0.w.d.d(r3)
        L_0x0034:
            int r4 = r4 + r7
            goto L_0x0045
        L_0x0036:
            r4 = r6 & 2
            if (r4 == 0) goto L_0x0043
            java.util.WeakHashMap<android.view.View, i0.b0> r4 = i0.w.f6004a
            int r4 = i0.w.d.d(r3)
            int r4 = r5 - r4
            goto L_0x0034
        L_0x0043:
            int r4 = r7 + r5
        L_0x0045:
            if (r0 != 0) goto L_0x0058
            java.util.WeakHashMap<android.view.View, i0.b0> r6 = i0.w.f6004a
            boolean r3 = i0.w.d.b(r3)
            if (r3 == 0) goto L_0x0058
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L_0x0058:
            int r2 = r2 + r4
            goto L_0x005d
        L_0x005a:
            if (r2 <= 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0060:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f3207q = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f3208r;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = aVar.topMargin + aVar.bottomMargin + childAt.getMeasuredHeight();
            int i13 = aVar.f3223a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                i12 -= w.d.d(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f3208r = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f3213y;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        int d = w.d.d(this);
        if (d == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                d = w.d.d(getChildAt(childCount - 1));
            } else {
                d = 0;
            }
            if (d == 0) {
                return getHeight() / 3;
            }
        }
        return (d * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f3210t;
    }

    public Drawable getStatusBarForeground() {
        return this.C;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        e0 e0Var = this.u;
        if (e0Var != null) {
            return e0Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f3206p;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = aVar.f3223a;
            if ((i13 & 1) == 0) {
                break;
            }
            int i14 = measuredHeight + aVar.topMargin + aVar.bottomMargin + i12;
            if (i11 == 0) {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                if (w.d.b(childAt)) {
                    i14 -= getTopInset();
                }
            }
            i12 = i14;
            if ((i13 & 2) != 0) {
                WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
                i12 -= w.d.d(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f3206p = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof m6.f) {
            e.E(this, (m6.f) background);
        }
    }

    public final int[] onCreateDrawableState(int i10) {
        if (this.B == null) {
            this.B = new int[4];
        }
        int[] iArr = this.B;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f3211v;
        iArr[0] = z10 ? R.attr.state_liftable : -2130969468;
        iArr[1] = (!z10 || !this.w) ? -2130969469 : R.attr.state_lifted;
        iArr[2] = z10 ? R.attr.state_collapsible : -2130969466;
        iArr[3] = (!z10 || !this.w) ? -2130969465 : R.attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.z;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.z = null;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        super.onLayout(z10, i10, i11, i12, i13);
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        boolean z13 = true;
        if (w.d.b(this) && e()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        this.f3206p = -1;
        this.f3207q = -1;
        this.f3208r = -1;
        this.f3209s = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((a) getChildAt(i14).getLayoutParams()).f3224b != null) {
                this.f3209s = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f3212x) {
            int childCount3 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount3) {
                    z11 = false;
                    break;
                }
                int i16 = ((a) getChildAt(i15).getLayoutParams()).f3223a;
                if ((i16 & 1) != 1 || (i16 & 10) == 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    z11 = true;
                    break;
                }
                i15++;
            }
            if (!z11) {
                z13 = false;
            }
        }
        if (this.f3211v != z13) {
            this.f3211v = z13;
            refreshDrawableState();
        }
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            if (w.d.b(this) && e()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = androidx.databinding.a.l(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.f3206p = -1;
        this.f3207q = -1;
        this.f3208r = -1;
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof m6.f) {
            ((m6.f) background).i(f10);
        }
    }

    public void setExpanded(boolean z10) {
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        b(z10, w.g.c(this), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f3212x = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f3213y = i10;
        WeakReference<View> weakReference = this.z;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.z = null;
    }

    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.C;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.C = drawable3;
            boolean z11 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.C.setState(getDrawableState());
                }
                Drawable drawable4 = this.C;
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                drawable4.setLayoutDirection(w.e.d(this));
                Drawable drawable5 = this.C;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.C.setCallback(this);
            }
            if (this.C != null && getTopInset() > 0) {
                z11 = true;
            }
            setWillNotDraw(!z11);
            WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
            w.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(f.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        g.a(this, f10);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.C;
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m14generateDefaultLayoutParams() {
        return new a();
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m15generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}
