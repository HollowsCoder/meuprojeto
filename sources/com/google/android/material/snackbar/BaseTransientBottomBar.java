package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.k;
import com.karumi.dexter.R;
import h6.n;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p9.u;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: o  reason: collision with root package name */
    public static final Handler f3526o = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f3527p = {R.attr.snackbarStyle};

    /* renamed from: q  reason: collision with root package name */
    public static final String f3528q = "BaseTransientBottomBar";

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f3529a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3530b;

    /* renamed from: c  reason: collision with root package name */
    public final h f3531c;
    public final n6.g d;

    /* renamed from: e  reason: collision with root package name */
    public int f3532e;

    /* renamed from: f  reason: collision with root package name */
    public final b f3533f = new b();

    /* renamed from: g  reason: collision with root package name */
    public final Rect f3534g;

    /* renamed from: h  reason: collision with root package name */
    public int f3535h;

    /* renamed from: i  reason: collision with root package name */
    public int f3536i;

    /* renamed from: j  reason: collision with root package name */
    public int f3537j;

    /* renamed from: k  reason: collision with root package name */
    public int f3538k;
    public ArrayList l;

    /* renamed from: m  reason: collision with root package name */
    public final AccessibilityManager f3539m;

    /* renamed from: n  reason: collision with root package name */
    public final c f3540n = new c();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i  reason: collision with root package name */
        public final e f3541i = new e(this);

        public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            e eVar = this.f3541i;
            eVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    k b10 = k.b();
                    c cVar = eVar.f3544a;
                    synchronized (b10.f3571a) {
                        if (b10.c(cVar)) {
                            k.c cVar2 = b10.f3573c;
                            if (cVar2.f3577c) {
                                cVar2.f3577c = false;
                                b10.d(cVar2);
                            }
                        }
                    }
                }
            } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                k b11 = k.b();
                c cVar3 = eVar.f3544a;
                synchronized (b11.f3571a) {
                    if (b11.c(cVar3)) {
                        k.c cVar4 = b11.f3573c;
                        if (!cVar4.f3577c) {
                            cVar4.f3577c = true;
                            b11.f3572b.removeCallbacksAndMessages(cVar4);
                        }
                    }
                }
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        public final boolean s(View view) {
            this.f3541i.getClass();
            return view instanceof h;
        }
    }

    public static class a implements Handler.Callback {
        public final boolean handleMessage(Message message) {
            boolean z;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i10 = message.what;
            if (i10 == 0) {
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                baseTransientBottomBar.getClass();
                g gVar = new g(baseTransientBottomBar);
                h hVar = baseTransientBottomBar.f3531c;
                hVar.setOnAttachStateChangeListener(gVar);
                if (hVar.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
                        Behavior behavior = new Behavior();
                        e eVar = behavior.f3541i;
                        eVar.getClass();
                        eVar.f3544a = baseTransientBottomBar.f3540n;
                        behavior.f3241b = new i(baseTransientBottomBar);
                        fVar.b(behavior);
                        fVar.f947g = 80;
                    }
                    baseTransientBottomBar.f();
                    hVar.setVisibility(4);
                    baseTransientBottomBar.f3529a.addView(hVar);
                }
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                if (w.g.c(hVar)) {
                    baseTransientBottomBar.e();
                } else {
                    hVar.setOnLayoutChangeListener(new h(baseTransientBottomBar));
                }
                return true;
            } else if (i10 != 1) {
                return false;
            } else {
                BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
                int i11 = message.arg1;
                AccessibilityManager accessibilityManager = baseTransientBottomBar2.f3539m;
                if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    h hVar2 = baseTransientBottomBar2.f3531c;
                    if (hVar2.getVisibility() == 0) {
                        if (hVar2.getAnimationMode() == 1) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                            ofFloat.setInterpolator(s5.a.f8784a);
                            ofFloat.addUpdateListener(new b(baseTransientBottomBar2));
                            ofFloat.setDuration(75);
                            ofFloat.addListener(new n6.b(baseTransientBottomBar2, i11));
                            ofFloat.start();
                        } else {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            int[] iArr = new int[2];
                            iArr[0] = 0;
                            int height = hVar2.getHeight();
                            ViewGroup.LayoutParams layoutParams2 = hVar2.getLayoutParams();
                            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                            }
                            iArr[1] = height;
                            valueAnimator.setIntValues(iArr);
                            valueAnimator.setInterpolator(s5.a.f8785b);
                            valueAnimator.setDuration(250);
                            valueAnimator.addListener(new n6.d(baseTransientBottomBar2, i11));
                            valueAnimator.addUpdateListener(new e(baseTransientBottomBar2));
                            valueAnimator.start();
                        }
                        return true;
                    }
                }
                baseTransientBottomBar2.c();
                return true;
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f3531c != null && (context = baseTransientBottomBar.f3530b) != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                int i10 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                h hVar = baseTransientBottomBar.f3531c;
                hVar.getLocationOnScreen(iArr);
                int height = (i10 - (hVar.getHeight() + iArr[1])) + ((int) baseTransientBottomBar.f3531c.getTranslationY());
                if (height < baseTransientBottomBar.f3538k) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f3531c.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        Log.w(BaseTransientBottomBar.f3528q, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = (baseTransientBottomBar.f3538k - height) + marginLayoutParams.bottomMargin;
                    baseTransientBottomBar.f3531c.requestLayout();
                }
            }
        }
    }

    public class c implements k.b {
        public c() {
        }

        public final void a() {
            Handler handler = BaseTransientBottomBar.f3526o;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        public final void b(int i10) {
            Handler handler = BaseTransientBottomBar.f3526o;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    public static abstract class d<B> {
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public c f3544a;

        public e(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f3244f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f3245g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.d = 0;
        }
    }

    public interface f {
    }

    public interface g {
    }

    public static class h extends FrameLayout {

        /* renamed from: v  reason: collision with root package name */
        public static final a f3545v = new a();

        /* renamed from: o  reason: collision with root package name */
        public g f3546o;

        /* renamed from: p  reason: collision with root package name */
        public f f3547p;

        /* renamed from: q  reason: collision with root package name */
        public int f3548q;

        /* renamed from: r  reason: collision with root package name */
        public final float f3549r;

        /* renamed from: s  reason: collision with root package name */
        public final float f3550s;

        /* renamed from: t  reason: collision with root package name */
        public ColorStateList f3551t;
        public PorterDuff.Mode u;

        public static class a implements View.OnTouchListener {
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public h(Context context, AttributeSet attributeSet) {
            super(q6.a.a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, u.Q);
            if (obtainStyledAttributes.hasValue(6)) {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                w.i.s(this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f3548q = obtainStyledAttributes.getInt(2, 0);
            this.f3549r = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(j6.c.a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(n.b(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f3550s = obtainStyledAttributes.getFloat(1, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f3545v);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(n.e.C(getBackgroundOverlayColorAlpha(), n.e.u(this, R.attr.colorSurface), n.e.u(this, R.attr.colorOnSurface)));
                ColorStateList colorStateList = this.f3551t;
                if (colorStateList != null) {
                    gradientDrawable.setTintList(colorStateList);
                }
                WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
                w.d.q(this, gradientDrawable);
            }
        }

        public float getActionTextColorAlpha() {
            return this.f3550s;
        }

        public int getAnimationMode() {
            return this.f3548q;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f3549r;
        }

        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            f fVar = this.f3547p;
            if (fVar != null) {
                g gVar = (g) fVar;
                if (Build.VERSION.SDK_INT >= 29) {
                    BaseTransientBottomBar baseTransientBottomBar = gVar.f3565a;
                    WindowInsets rootWindowInsets = baseTransientBottomBar.f3531c.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        baseTransientBottomBar.f3538k = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                        baseTransientBottomBar.f();
                    }
                } else {
                    gVar.getClass();
                }
            }
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.h.c(this);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[Catch:{ all -> 0x002f }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x003a A[Catch:{ all -> 0x002f }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onDetachedFromWindow() {
            /*
                r6 = this;
                super.onDetachedFromWindow()
                com.google.android.material.snackbar.BaseTransientBottomBar$f r0 = r6.f3547p
                if (r0 == 0) goto L_0x004b
                com.google.android.material.snackbar.g r0 = (com.google.android.material.snackbar.g) r0
                com.google.android.material.snackbar.BaseTransientBottomBar r1 = r0.f3565a
                r1.getClass()
                com.google.android.material.snackbar.k r2 = com.google.android.material.snackbar.k.b()
                com.google.android.material.snackbar.BaseTransientBottomBar$c r1 = r1.f3540n
                java.lang.Object r3 = r2.f3571a
                monitor-enter(r3)
                boolean r4 = r2.c(r1)     // Catch:{ all -> 0x002f }
                r5 = 1
                if (r4 != 0) goto L_0x003b
                com.google.android.material.snackbar.k$c r2 = r2.d     // Catch:{ all -> 0x002f }
                r4 = 0
                if (r2 == 0) goto L_0x0036
                if (r1 == 0) goto L_0x0031
                java.lang.ref.WeakReference<com.google.android.material.snackbar.k$b> r2 = r2.f3575a     // Catch:{ all -> 0x002f }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002f }
                if (r2 != r1) goto L_0x0031
                r1 = r5
                goto L_0x0032
            L_0x002f:
                r0 = move-exception
                goto L_0x0049
            L_0x0031:
                r1 = r4
            L_0x0032:
                if (r1 == 0) goto L_0x0036
                r1 = r5
                goto L_0x0037
            L_0x0036:
                r1 = r4
            L_0x0037:
                if (r1 == 0) goto L_0x003a
                goto L_0x003b
            L_0x003a:
                r5 = r4
            L_0x003b:
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                if (r5 == 0) goto L_0x004b
                android.os.Handler r1 = com.google.android.material.snackbar.BaseTransientBottomBar.f3526o
                com.google.android.material.snackbar.f r2 = new com.google.android.material.snackbar.f
                r2.<init>(r0)
                r1.post(r2)
                goto L_0x004b
            L_0x0049:
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                throw r0
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.h.onDetachedFromWindow():void");
        }

        public final void onLayout(boolean z, int i10, int i11, int i12, int i13) {
            super.onLayout(z, i10, i11, i12, i13);
            g gVar = this.f3546o;
            if (gVar != null) {
                BaseTransientBottomBar baseTransientBottomBar = ((h) gVar).f3566a;
                baseTransientBottomBar.f3531c.setOnLayoutChangeListener((g) null);
                baseTransientBottomBar.e();
            }
        }

        public void setAnimationMode(int i10) {
            this.f3548q = i10;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f3551t == null)) {
                drawable = drawable.mutate();
                drawable.setTintList(this.f3551t);
                drawable.setTintMode(this.u);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f3551t = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintList(colorStateList);
                mutate.setTintMode(this.u);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.u = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintMode(mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        public void setOnAttachStateChangeListener(f fVar) {
            this.f3547p = fVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f3545v);
            super.setOnClickListener(onClickListener);
        }

        public void setOnLayoutChangeListener(g gVar) {
            this.f3546o = gVar;
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        boolean z;
        int i10;
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (snackbarContentLayout2 != null) {
            this.f3529a = viewGroup;
            this.d = snackbarContentLayout2;
            this.f3530b = context;
            h6.k.c(context, h6.k.f5905a, "Theme.AppCompat");
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3527p);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i10 = R.layout.mtrl_layout_snackbar;
            } else {
                i10 = R.layout.design_layout_snackbar;
            }
            h hVar = (h) from.inflate(i10, viewGroup, false);
            this.f3531c = hVar;
            float actionTextColorAlpha = hVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f3556p.setTextColor(n.e.C(actionTextColorAlpha, n.e.u(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f3556p.getCurrentTextColor()));
            }
            hVar.addView(snackbarContentLayout);
            ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f3534g = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.g.f(hVar, 1);
            w.d.s(hVar, 1);
            hVar.setFitsSystemWindows(true);
            w.i.u(hVar, new n6.e(this));
            w.k(hVar, new n6.f(this));
            this.f3539m = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public void a() {
        b(3);
    }

    public final void b(int i10) {
        k.c cVar;
        boolean z;
        k b10 = k.b();
        c cVar2 = this.f3540n;
        synchronized (b10.f3571a) {
            if (b10.c(cVar2)) {
                cVar = b10.f3573c;
            } else {
                k.c cVar3 = b10.d;
                boolean z10 = false;
                if (cVar3 != null) {
                    if (cVar2 == null || cVar3.f3575a.get() != cVar2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        z10 = true;
                    }
                }
                if (z10) {
                    cVar = b10.d;
                }
            }
            b10.a(cVar, i10);
        }
    }

    public final void c() {
        k b10 = k.b();
        c cVar = this.f3540n;
        synchronized (b10.f3571a) {
            try {
                if (b10.c(cVar)) {
                    b10.f3573c = null;
                    k.c cVar2 = b10.d;
                    if (!(cVar2 == null || cVar2 == null)) {
                        b10.f3573c = cVar2;
                        b10.d = null;
                        k.b bVar = cVar2.f3575a.get();
                        if (bVar != null) {
                            bVar.a();
                        } else {
                            b10.f3573c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((d) this.l.get(size)).getClass();
            }
        }
        ViewParent parent = this.f3531c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f3531c);
        }
    }

    public final void d() {
        k b10 = k.b();
        c cVar = this.f3540n;
        synchronized (b10.f3571a) {
            if (b10.c(cVar)) {
                b10.d(b10.f3573c);
            }
        }
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((d) this.l.get(size)).getClass();
                } else {
                    return;
                }
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z = true;
        AccessibilityManager accessibilityManager = this.f3539m;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        h hVar = this.f3531c;
        if (z) {
            hVar.post(new a(this));
            return;
        }
        if (hVar.getParent() != null) {
            hVar.setVisibility(0);
        }
        d();
    }

    public final void f() {
        Rect rect;
        boolean z;
        h hVar = this.f3531c;
        ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f3534g) == null) {
            Log.w(f3528q, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + this.f3535h;
        marginLayoutParams.leftMargin = rect.left + this.f3536i;
        marginLayoutParams.rightMargin = rect.right + this.f3537j;
        hVar.requestLayout();
        if (Build.VERSION.SDK_INT >= 29) {
            boolean z10 = false;
            if (this.f3538k > 0) {
                ViewGroup.LayoutParams layoutParams2 = hVar.getLayoutParams();
                if (!(layoutParams2 instanceof CoordinatorLayout.f) || !(((CoordinatorLayout.f) layoutParams2).f942a instanceof SwipeDismissBehavior)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    z10 = true;
                }
            }
            if (z10) {
                b bVar = this.f3533f;
                hVar.removeCallbacks(bVar);
                hVar.post(bVar);
            }
        }
    }
}
