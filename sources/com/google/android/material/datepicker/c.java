package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.karumi.dexter.R;
import j6.b;
import p9.u;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f3404a;

    /* renamed from: b  reason: collision with root package name */
    public final b f3405b;

    /* renamed from: c  reason: collision with root package name */
    public final b f3406c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final b f3407e;

    /* renamed from: f  reason: collision with root package name */
    public final b f3408f;

    /* renamed from: g  reason: collision with root package name */
    public final b f3409g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f3410h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.b(R.attr.materialCalendarStyle, context, g.class.getCanonicalName()), u.F);
        this.f3404a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f3409g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f3405b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f3406c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a10 = j6.c.a(context, obtainStyledAttributes, 6);
        this.d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f3407e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f3408f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f3410h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
