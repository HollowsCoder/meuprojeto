package com.theartofdev.edmodo.cropper;

import android.graphics.RectF;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f4108a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f4109b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public float f4110c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f4111e;

    /* renamed from: f  reason: collision with root package name */
    public float f4112f;

    /* renamed from: g  reason: collision with root package name */
    public float f4113g;

    /* renamed from: h  reason: collision with root package name */
    public float f4114h;

    /* renamed from: i  reason: collision with root package name */
    public float f4115i;

    /* renamed from: j  reason: collision with root package name */
    public float f4116j;

    /* renamed from: k  reason: collision with root package name */
    public float f4117k = 1.0f;
    public float l = 1.0f;

    public static boolean b(float f10, float f11, float f12, float f13, float f14) {
        return Math.abs(f10 - f12) <= f14 && Math.abs(f11 - f13) <= f14;
    }

    public final RectF a() {
        RectF rectF = this.f4109b;
        rectF.set(this.f4108a);
        return rectF;
    }
}
