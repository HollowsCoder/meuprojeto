package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.karumi.dexter.R;
import e.l;
import i0.b0;
import i0.e0;
import i0.w;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m6.f;
import w5.d;
import w5.e;

public final class b extends l {
    public static final /* synthetic */ int A = 0;

    /* renamed from: q  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f3310q;

    /* renamed from: r  reason: collision with root package name */
    public FrameLayout f3311r;

    /* renamed from: s  reason: collision with root package name */
    public CoordinatorLayout f3312s;

    /* renamed from: t  reason: collision with root package name */
    public FrameLayout f3313t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3314v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public BottomSheetBehavior.d f3315x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f3316y;
    public final a z;

    public class a extends BottomSheetBehavior.d {
        public a() {
        }

        public final void a(View view) {
        }

        public final void b(View view, int i10) {
            if (i10 == 5) {
                b.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.b$b  reason: collision with other inner class name */
    public static class C0032b extends BottomSheetBehavior.d {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f3318a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3319b;

        /* renamed from: c  reason: collision with root package name */
        public final e0 f3320c;

        public C0032b(FrameLayout frameLayout, e0 e0Var) {
            boolean z;
            ColorStateList colorStateList;
            int i10;
            boolean z10;
            boolean z11;
            double d;
            double d10;
            double d11;
            this.f3320c = e0Var;
            if ((frameLayout.getSystemUiVisibility() & 8192) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f3319b = z;
            f fVar = BottomSheetBehavior.x(frameLayout).f3281i;
            if (fVar != null) {
                colorStateList = fVar.f7121o.f7133c;
            } else {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                colorStateList = w.i.g(frameLayout);
            }
            if (colorStateList != null) {
                i10 = colorStateList.getDefaultColor();
            } else if (frameLayout.getBackground() instanceof ColorDrawable) {
                i10 = ((ColorDrawable) frameLayout.getBackground()).getColor();
            } else {
                this.f3318a = z;
                return;
            }
            if (i10 != 0) {
                ThreadLocal<double[]> threadLocal = b0.a.f1929a;
                double[] dArr = threadLocal.get();
                if (dArr == null) {
                    dArr = new double[3];
                    threadLocal.set(dArr);
                }
                int red = Color.red(i10);
                int green = Color.green(i10);
                int blue = Color.blue(i10);
                if (dArr.length == 3) {
                    double d12 = ((double) red) / 255.0d;
                    if (d12 < 0.04045d) {
                        d = d12 / 12.92d;
                    } else {
                        d = Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
                    }
                    double d13 = ((double) green) / 255.0d;
                    if (d13 < 0.04045d) {
                        d10 = d13 / 12.92d;
                    } else {
                        d10 = Math.pow((d13 + 0.055d) / 1.055d, 2.4d);
                    }
                    double d14 = ((double) blue) / 255.0d;
                    if (d14 < 0.04045d) {
                        d11 = d14 / 12.92d;
                    } else {
                        d11 = Math.pow((d14 + 0.055d) / 1.055d, 2.4d);
                    }
                    z11 = false;
                    dArr[0] = ((0.1805d * d11) + (0.3576d * d10) + (0.4124d * d)) * 100.0d;
                    double d15 = ((0.0722d * d11) + (0.7152d * d10) + (0.2126d * d)) * 100.0d;
                    dArr[1] = d15;
                    dArr[2] = ((d11 * 0.9505d) + (d10 * 0.1192d) + (d * 0.0193d)) * 100.0d;
                    if (d15 / 100.0d > 0.5d) {
                        z10 = true;
                        this.f3318a = z10;
                    }
                } else {
                    throw new IllegalArgumentException("outXyz must have a length of 3.");
                }
            } else {
                z11 = false;
            }
            z10 = z11;
            this.f3318a = z10;
        }

        public final void a(View view) {
            c(view);
        }

        public final void b(View view, int i10) {
            c(view);
        }

        public final void c(View view) {
            int i10;
            int i11;
            int top = view.getTop();
            e0 e0Var = this.f3320c;
            if (top < e0Var.d()) {
                int i12 = b.A;
                int systemUiVisibility = view.getSystemUiVisibility();
                if (this.f3318a) {
                    i11 = systemUiVisibility | 8192;
                } else {
                    i11 = systemUiVisibility & -8193;
                }
                view.setSystemUiVisibility(i11);
                view.setPadding(view.getPaddingLeft(), e0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                int i13 = b.A;
                int systemUiVisibility2 = view.getSystemUiVisibility();
                if (this.f3319b) {
                    i10 = systemUiVisibility2 | 8192;
                } else {
                    i10 = systemUiVisibility2 & -8193;
                }
                view.setSystemUiVisibility(i10);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x001b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968683(0x7f04006b, float:1.7546027E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0018
            int r5 = r5.resourceId
            goto L_0x001b
        L_0x0018:
            r5 = 2131952047(0x7f1301af, float:1.9540526E38)
        L_0x001b:
            r3.<init>(r4, r5)
            r3.u = r0
            r3.f3314v = r0
            com.google.android.material.bottomsheet.b$a r4 = new com.google.android.material.bottomsheet.b$a
            r4.<init>()
            r3.z = r4
            e.f r4 = r3.a()
            r4.q(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[r0]
            r0 = 0
            r1 = 2130968954(0x7f04017a, float:1.7546576E38)
            r5[r0] = r1
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r4 = r4.getBoolean(r0, r0)
            r3.f3316y = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.b.<init>(android.content.Context, int):void");
    }

    public final void c() {
        if (this.f3311r == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, (ViewGroup) null);
            this.f3311r = frameLayout;
            this.f3312s = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f3311r.findViewById(R.id.design_bottom_sheet);
            this.f3313t = frameLayout2;
            BottomSheetBehavior<FrameLayout> x10 = BottomSheetBehavior.x(frameLayout2);
            this.f3310q = x10;
            ArrayList<BottomSheetBehavior.d> arrayList = x10.P;
            a aVar = this.z;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
            this.f3310q.B(this.u);
        }
    }

    public final void cancel() {
        if (this.f3310q == null) {
            c();
        }
        super.cancel();
    }

    public final FrameLayout d(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3311r.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, coordinatorLayout, false);
        }
        if (this.f3316y) {
            FrameLayout frameLayout = this.f3313t;
            a aVar = new a(this);
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.i.u(frameLayout, aVar);
        }
        this.f3313t.removeAllViews();
        FrameLayout frameLayout2 = this.f3313t;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new d(this));
        w.k(this.f3313t, new e(this));
        this.f3313t.setOnTouchListener(new w5.f());
        return this.f3311r;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f3316y && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f3311r;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f3312s;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            if (z10) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f3310q;
        if (bottomSheetBehavior != null && bottomSheetBehavior.F == 5) {
            bottomSheetBehavior.D(4);
        }
    }

    public final void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.u != z10) {
            this.u = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f3310q;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.B(z10);
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.u) {
            this.u = true;
        }
        this.f3314v = z10;
        this.w = true;
    }

    public final void setContentView(int i10) {
        super.setContentView((View) d((View) null, i10, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view) {
        super.setContentView((View) d(view, 0, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView((View) d(view, 0, layoutParams));
    }
}
