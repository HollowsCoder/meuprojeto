package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import f.a;
import i0.w;
import j6.c;
import java.util.Arrays;
import p9.u;

class ClockFaceView extends c implements ClockHandView.a {
    public final ClockHandView H;
    public final Rect I = new Rect();
    public final RectF J = new RectF();
    public final SparseArray<TextView> K;
    public final b L;
    public final int[] M;
    public final float[] N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public String[] S;
    public float T;
    public final ColorStateList U;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.K = sparseArray;
        this.N = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.u, R.attr.materialClockStyle, 2131952346);
        Resources resources = getResources();
        ColorStateList a10 = c.a(context, obtainStyledAttributes, 1);
        this.U = a10;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.H = clockHandView;
        this.O = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.M = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.f3663o.add(this);
        int defaultColor = a.a(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a11 = c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.L = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, BuildConfig.FLAVOR);
        this.S = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i10 = 0; i10 < Math.max(this.S.length, size); i10++) {
            TextView textView = sparseArray.get(i10);
            if (i10 >= this.S.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.S[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                w.k(textView, this.L);
                textView.setTextColor(this.U);
            }
        }
        this.P = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.Q = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.R = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public final void a(float f10) {
        if (Math.abs(this.T - f10) > 0.001f) {
            this.T = f10;
            l();
        }
    }

    public final void l() {
        RadialGradient radialGradient;
        RectF rectF = this.H.f3667s;
        int i10 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.K;
            if (i10 < sparseArray.size()) {
                TextView textView = sparseArray.get(i10);
                if (textView != null) {
                    Rect rect = this.I;
                    textView.getDrawingRect(rect);
                    rect.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                    offsetDescendantRectToMyCoords(textView, rect);
                    RectF rectF2 = this.J;
                    rectF2.set(rect);
                    if (!RectF.intersects(rectF, rectF2)) {
                        radialGradient = null;
                    } else {
                        radialGradient = new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, 0.5f * rectF.width(), this.M, this.N, Shader.TileMode.CLAMP);
                    }
                    textView.getPaint().setShader(radialGradient);
                    textView.invalidate();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.S.length, false, 1));
    }

    public final void onLayout(boolean z, int i10, int i11, int i12, int i13) {
        super.onLayout(z, i10, i11, i12, i13);
        l();
    }

    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.R) / Math.max(Math.max(((float) this.P) / ((float) displayMetrics.heightPixels), ((float) this.Q) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
