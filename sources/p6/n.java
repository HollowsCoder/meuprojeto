package p6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.q0;
import androidx.appcompat.widget.r;
import com.google.android.material.textfield.TextInputLayout;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import h6.k;
import java.util.Locale;
import p9.u;
import q6.a;

public final class n extends d {

    /* renamed from: s  reason: collision with root package name */
    public final q0 f7963s;

    /* renamed from: t  reason: collision with root package name */
    public final AccessibilityManager f7964t;
    public final Rect u = new Rect();

    public n(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        Context context2 = getContext();
        TypedArray d = k.d(context2, attributeSet, u.C, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (d.hasValue(0) && d.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f7964t = (AccessibilityManager) context2.getSystemService("accessibility");
        q0 q0Var = new q0(context2, (AttributeSet) null, R.attr.listPopupWindowStyle, 0);
        this.f7963s = q0Var;
        q0Var.L = true;
        r rVar = q0Var.M;
        rVar.setFocusable(true);
        q0Var.C = this;
        rVar.setInputMethodMode(2);
        q0Var.p(getAdapter());
        q0Var.D = new m(this);
        d.recycle();
    }

    public static void a(n nVar, Object obj) {
        nVar.setText(nVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 == null || !b10.Q) {
            return super.getHint();
        }
        return b10.getHint();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.Q && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i13 = 0;
            if (!(adapter == null || b10 == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                q0 q0Var = this.f7963s;
                if (!q0Var.c()) {
                    i12 = -1;
                } else {
                    i12 = q0Var.f688q.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, i12) + 15);
                View view = null;
                int i14 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i13) {
                        view = null;
                        i13 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i14 = Math.max(i14, view.getMeasuredWidth());
                }
                Drawable f10 = q0Var.f();
                if (f10 != null) {
                    Rect rect = this.u;
                    f10.getPadding(rect);
                    i14 += rect.left + rect.right;
                }
                i13 = b10.getEndIconView().getMeasuredWidth() + i14;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i13), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f7963s.p(getAdapter());
    }

    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f7964t;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f7963s.a();
        }
    }
}
