package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.karumi.dexter.R;
import h0.b;
import i0.w;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: o  reason: collision with root package name */
    public final Calendar f3382o = b0.d((Calendar) null);

    /* renamed from: p  reason: collision with root package name */
    public final boolean f3383p;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (o.c0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f3383p = o.d0(getContext(), R.attr.nestedScrollable);
        w.k(this, new n());
    }

    /* renamed from: a */
    public final t getAdapter() {
        return (t) super.getAdapter();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        t a10 = getAdapter();
        d<?> dVar = a10.f3460p;
        c cVar = a10.f3462r;
        a10.getItem(a10.b());
        a10.getItem(a10.d());
        for (b<Long, Long> bVar : dVar.y()) {
            bVar.getClass();
        }
    }

    public final void onFocusChanged(boolean z, int i10, Rect rect) {
        int i11;
        if (z) {
            if (i10 == 33) {
                i11 = getAdapter().d();
            } else if (i10 == 130) {
                i11 = getAdapter().b();
            } else {
                super.onFocusChanged(true, i10, rect);
                return;
            }
            setSelection(i11);
            return;
        }
        super.onFocusChanged(false, i10, rect);
    }

    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public final void onMeasure(int i10, int i11) {
        if (this.f3383p) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof t) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), t.class.getCanonicalName()}));
        }
    }

    public final void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            i10 = getAdapter().b();
        }
        super.setSelection(i10);
    }
}
