package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import i0.b0;
import i0.w;
import j6.c;
import java.util.WeakHashMap;
import m6.f;
import m6.i;
import p9.u;
import s6.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f3398a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f3399b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f3400c;
    public final ColorStateList d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3401e;

    /* renamed from: f  reason: collision with root package name */
    public final i f3402f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, i iVar, Rect rect) {
        a.m(rect.left);
        a.m(rect.top);
        a.m(rect.right);
        a.m(rect.bottom);
        this.f3398a = rect;
        this.f3399b = colorStateList2;
        this.f3400c = colorStateList;
        this.d = colorStateList3;
        this.f3401e = i10;
        this.f3402f = iVar;
    }

    public static b a(Context context, int i10) {
        boolean z;
        if (i10 != 0) {
            z = true;
        } else {
            z = false;
        }
        a.k("Cannot create a CalendarItemStyle with a styleResId of 0", z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, u.G);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a10 = c.a(context, obtainStyledAttributes, 4);
        ColorStateList a11 = c.a(context, obtainStyledAttributes, 9);
        ColorStateList a12 = c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        i iVar = new i(i.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new m6.a((float) 0)));
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, iVar, rect);
    }

    public final void b(TextView textView) {
        f fVar = new f();
        f fVar2 = new f();
        i iVar = this.f3402f;
        fVar.setShapeAppearanceModel(iVar);
        fVar2.setShapeAppearanceModel(iVar);
        fVar.j(this.f3400c);
        fVar.f7121o.f7140k = (float) this.f3401e;
        fVar.invalidateSelf();
        f.b bVar = fVar.f7121o;
        ColorStateList colorStateList = bVar.d;
        ColorStateList colorStateList2 = this.d;
        if (colorStateList != colorStateList2) {
            bVar.d = colorStateList2;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateList3 = this.f3399b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), fVar, fVar2);
        Rect rect = this.f3398a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.d.q(textView, insetDrawable);
    }
}
