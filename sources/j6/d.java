package j6;

import a0.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.activity.result.c;
import p9.u;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f6578a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f6579b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6580c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6581e;

    /* renamed from: f  reason: collision with root package name */
    public final float f6582f;

    /* renamed from: g  reason: collision with root package name */
    public final float f6583g;

    /* renamed from: h  reason: collision with root package name */
    public final float f6584h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6585i;

    /* renamed from: j  reason: collision with root package name */
    public final float f6586j;

    /* renamed from: k  reason: collision with root package name */
    public float f6587k;
    public final int l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6588m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f6589n;

    public class a extends d.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f6590a;

        public a(c cVar) {
            this.f6590a = cVar;
        }

        public final void c(int i10) {
            d.this.f6588m = true;
            this.f6590a.p(i10);
        }

        public final void d(Typeface typeface) {
            d dVar = d.this;
            dVar.f6589n = Typeface.create(typeface, dVar.d);
            dVar.f6588m = true;
            this.f6590a.q(dVar.f6589n, false);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, u.R);
        this.f6587k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f6578a = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.d = obtainStyledAttributes.getInt(2, 0);
        this.f6581e = obtainStyledAttributes.getInt(1, 1);
        int i11 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.l = obtainStyledAttributes.getResourceId(i11, 0);
        this.f6580c = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(14, false);
        this.f6579b = c.a(context, obtainStyledAttributes, 6);
        this.f6582f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f6583g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f6584h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, u.K);
        this.f6585i = obtainStyledAttributes2.hasValue(0);
        this.f6586j = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f6589n;
        int i10 = this.d;
        if (typeface == null && (str = this.f6580c) != null) {
            this.f6589n = Typeface.create(str, i10);
        }
        if (this.f6589n == null) {
            int i11 = this.f6581e;
            this.f6589n = i11 != 1 ? i11 != 2 ? i11 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f6589n = Typeface.create(this.f6589n, i10);
        }
    }

    public final Typeface b(Context context) {
        if (this.f6588m) {
            return this.f6589n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a10 = a0.d.a(context, this.l);
                this.f6589n = a10;
                if (a10 != null) {
                    this.f6589n = Typeface.create(a10, this.d);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f6580c, e10);
            }
        }
        a();
        this.f6588m = true;
        return this.f6589n;
    }

    public final void c(Context context, c cVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.l;
        if (i10 == 0) {
            this.f6588m = true;
        }
        if (this.f6588m) {
            cVar.q(this.f6589n, true);
            return;
        }
        try {
            a aVar = new a(cVar);
            ThreadLocal<TypedValue> threadLocal = a0.d.f22a;
            if (context.isRestricted()) {
                aVar.a(-4);
                return;
            }
            a0.d.b(context, i10, new TypedValue(), 0, aVar, false, false);
        } catch (Resources.NotFoundException unused) {
            this.f6588m = true;
            cVar.p(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f6580c, e10);
            this.f6588m = true;
            cVar.p(-3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.l
            if (r1 == 0) goto L_0x001c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = a0.d.f22a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L_0x000d
            goto L_0x001c
        L_0x000d:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = a0.d.b(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x001d
        L_0x001c:
            r8 = 0
        L_0x001d:
            if (r8 == 0) goto L_0x0021
            r8 = 1
            goto L_0x0022
        L_0x0021:
            r8 = 0
        L_0x0022:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.d.d(android.content.Context):boolean");
    }

    public final void e(Context context, TextPaint textPaint, c cVar) {
        f(context, textPaint, cVar);
        ColorStateList colorStateList = this.f6578a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f6579b;
        textPaint.setShadowLayer(this.f6584h, this.f6582f, this.f6583g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, c cVar) {
        if (d(context)) {
            g(textPaint, b(context));
            return;
        }
        a();
        g(textPaint, this.f6589n);
        c(context, new e(this, textPaint, cVar));
    }

    public final void g(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f6587k);
        if (this.f6585i) {
            textPaint.setLetterSpacing(this.f6586j);
        }
    }
}
