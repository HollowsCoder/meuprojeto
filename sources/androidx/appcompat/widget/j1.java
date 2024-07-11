package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import i0.y;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class j1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: x  reason: collision with root package name */
    public static j1 f607x;

    /* renamed from: y  reason: collision with root package name */
    public static j1 f608y;

    /* renamed from: o  reason: collision with root package name */
    public final View f609o;

    /* renamed from: p  reason: collision with root package name */
    public final CharSequence f610p;

    /* renamed from: q  reason: collision with root package name */
    public final int f611q;

    /* renamed from: r  reason: collision with root package name */
    public final a f612r = new a();

    /* renamed from: s  reason: collision with root package name */
    public final b f613s = new b();

    /* renamed from: t  reason: collision with root package name */
    public int f614t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public k1 f615v;
    public boolean w;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            j1.this.c(false);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            j1.this.a();
        }
    }

    public j1(View view, CharSequence charSequence) {
        int i10;
        this.f609o = view;
        this.f610p = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = y.f6021a;
        if (Build.VERSION.SDK_INT >= 28) {
            i10 = viewConfiguration.getScaledHoverSlop();
        } else {
            i10 = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f611q = i10;
        this.f614t = Integer.MAX_VALUE;
        this.u = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(j1 j1Var) {
        j1 j1Var2 = f607x;
        if (j1Var2 != null) {
            j1Var2.f609o.removeCallbacks(j1Var2.f612r);
        }
        f607x = j1Var;
        if (j1Var != null) {
            j1Var.f609o.postDelayed(j1Var.f612r, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        boolean z;
        j1 j1Var = f608y;
        View view = this.f609o;
        if (j1Var == this) {
            f608y = null;
            k1 k1Var = this.f615v;
            if (k1Var != null) {
                View view2 = k1Var.f629b;
                if (view2.getParent() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ((WindowManager) k1Var.f628a.getSystemService("window")).removeView(view2);
                }
                this.f615v = null;
                this.f614t = Integer.MAX_VALUE;
                this.u = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f607x == this) {
            b((j1) null);
        }
        view.removeCallbacks(this.f613s);
    }

    public final void c(boolean z) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        String str;
        long j8;
        long j10;
        long j11;
        String str2;
        int i13;
        int i14;
        boolean z11;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        View view = this.f609o;
        if (w.g.b(view)) {
            b((j1) null);
            j1 j1Var = f608y;
            if (j1Var != null) {
                j1Var.a();
            }
            f608y = this;
            this.w = z;
            k1 k1Var = new k1(view.getContext());
            this.f615v = k1Var;
            int i15 = this.f614t;
            int i16 = this.u;
            boolean z12 = this.w;
            View view2 = k1Var.f629b;
            if (view2.getParent() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Context context = k1Var.f628a;
            if (z10) {
                if (view2.getParent() != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    ((WindowManager) context.getSystemService("window")).removeView(view2);
                }
            }
            k1Var.f630c.setText(this.f610p);
            WindowManager.LayoutParams layoutParams = k1Var.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i15 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                i10 = i16 + dimensionPixelOffset2;
                i11 = i16 - dimensionPixelOffset2;
            } else {
                i10 = view.getHeight();
                i11 = 0;
            }
            layoutParams.gravity = 49;
            Resources resources = context.getResources();
            if (z12) {
                i12 = R.dimen.tooltip_y_offset_touch;
            } else {
                i12 = R.dimen.tooltip_y_offset_non_touch;
            }
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i12);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    } else if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    } else {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str = "window";
            } else {
                Rect rect = k1Var.f631e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str2 = "window";
                    i13 = 0;
                } else {
                    Resources resources2 = context.getResources();
                    str2 = "window";
                    int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        i14 = resources2.getDimensionPixelSize(identifier);
                    } else {
                        i14 = 0;
                    }
                    DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                    i13 = 0;
                    rect.set(0, i14, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = k1Var.f633g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = k1Var.f632f;
                view.getLocationOnScreen(iArr2);
                int i17 = iArr2[i13] - iArr[i13];
                iArr2[i13] = i17;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i17 + i15) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, i13);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i18 = iArr2[1];
                int i19 = ((i11 + i18) - dimensionPixelOffset3) - measuredHeight;
                int i20 = i18 + i10 + dimensionPixelOffset3;
                if (!z12 ? measuredHeight + i20 > rect.height() : i19 >= 0) {
                    layoutParams.y = i19;
                } else {
                    layoutParams.y = i20;
                }
                str = str2;
            }
            ((WindowManager) context.getSystemService(str)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.w) {
                j8 = 2500;
            } else {
                if ((w.d.g(view) & 1) == 1) {
                    j11 = (long) ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    j11 = (long) ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j8 = j10 - j11;
            }
            b bVar = this.f613s;
            view.removeCallbacks(bVar);
            view.postDelayed(bVar, j8);
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f615v != null && this.w) {
            return false;
        }
        View view2 = this.f609o;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f614t = Integer.MAX_VALUE;
                this.u = Integer.MAX_VALUE;
                a();
            }
        } else if (view2.isEnabled() && this.f615v == null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int abs = Math.abs(x10 - this.f614t);
            int i10 = this.f611q;
            if (abs > i10 || Math.abs(y10 - this.u) > i10) {
                this.f614t = x10;
                this.u = y10;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b(this);
            }
        }
        return false;
    }

    public final boolean onLongClick(View view) {
        this.f614t = view.getWidth() / 2;
        this.u = view.getHeight() / 2;
        c(true);
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
