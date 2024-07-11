package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;
import n6.g;
import p9.u;

public class SnackbarContentLayout extends LinearLayout implements g {

    /* renamed from: o  reason: collision with root package name */
    public TextView f3555o;

    /* renamed from: p  reason: collision with root package name */
    public Button f3556p;

    /* renamed from: q  reason: collision with root package name */
    public final int f3557q;

    /* renamed from: r  reason: collision with root package name */
    public int f3558r;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.Q);
        this.f3557q = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f3558r = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z = true;
        } else {
            z = false;
        }
        if (this.f3555o.getPaddingTop() == i11 && this.f3555o.getPaddingBottom() == i12) {
            return z;
        }
        TextView textView = this.f3555o;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.e.g(textView)) {
            w.e.k(textView, w.e.f(textView), i11, w.e.e(textView), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f3556p;
    }

    public TextView getMessageView() {
        return this.f3555o;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3555o = (TextView) findViewById(R.id.snackbar_text);
        this.f3556p = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (a(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (a(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f3557q
            if (r0 <= 0) goto L_0x0016
            int r1 = r7.getMeasuredWidth()
            if (r1 <= r0) goto L_0x0016
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r8)
            super.onMeasure(r8, r9)
        L_0x0016:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131165335(0x7f070097, float:1.7944884E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131165334(0x7f070096, float:1.7944882E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f3555o
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = r4
            goto L_0x003d
        L_0x003c:
            r2 = r3
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f3558r
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f3556p
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f3558r
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.a(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.a(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = r4
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f3558r = i10;
    }
}
