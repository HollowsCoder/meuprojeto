package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.f;
import com.karumi.dexter.R;
import i0.b0;
import i0.c0;
import i0.w;

public abstract class a extends ViewGroup {

    /* renamed from: o  reason: collision with root package name */
    public final C0007a f499o;

    /* renamed from: p  reason: collision with root package name */
    public final Context f500p;

    /* renamed from: q  reason: collision with root package name */
    public ActionMenuView f501q;

    /* renamed from: r  reason: collision with root package name */
    public c f502r;

    /* renamed from: s  reason: collision with root package name */
    public int f503s;

    /* renamed from: t  reason: collision with root package name */
    public b0 f504t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f505v;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    public class C0007a implements c0 {

        /* renamed from: o  reason: collision with root package name */
        public boolean f506o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f507p;

        public C0007a() {
        }

        public final void a() {
            if (!this.f506o) {
                a aVar = a.this;
                aVar.f504t = null;
                a.super.setVisibility(this.f507p);
            }
        }

        public final void f(View view) {
            this.f506o = true;
        }

        public final void k() {
            a.super.setVisibility(0);
            this.f506o = false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f499o = new C0007a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f500p = context;
        } else {
            this.f500p = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - 0);
    }

    public static int d(View view, int i10, int i11, int i12, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final b0 e(int i10, long j8) {
        b0 b0Var = this.f504t;
        if (b0Var != null) {
            b0Var.b();
        }
        C0007a aVar = this.f499o;
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b0 a10 = w.a(this);
            a10.a(1.0f);
            a10.c(j8);
            a.this.f504t = a10;
            aVar.f507p = i10;
            a10.d(aVar);
            return a10;
        }
        b0 a11 = w.a(this);
        a11.a(0.0f);
        a11.c(j8);
        a.this.f504t = a11;
        aVar.f507p = i10;
        a11.d(aVar);
        return a11;
    }

    public int getAnimatedVisibility() {
        return this.f504t != null ? this.f499o.f507p : getVisibility();
    }

    public int getContentHeight() {
        return this.f503s;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, androidx.databinding.a.z, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f502r;
        if (cVar != null) {
            Configuration configuration2 = cVar.f275p.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
                i10 = 5;
            } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
                i10 = 4;
            } else if (i11 >= 360) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            cVar.D = i10;
            f fVar = cVar.f276q;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f505v = false;
        }
        if (!this.f505v) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f505v = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f505v = false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.u = false;
        }
        if (!this.u) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.u = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.u = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f503s = i10;
        requestLayout();
    }

    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            b0 b0Var = this.f504t;
            if (b0Var != null) {
                b0Var.b();
            }
            super.setVisibility(i10);
        }
    }
}
