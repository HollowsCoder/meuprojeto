package androidx.appcompat.widget;

import a0.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.d0;

public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f550a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f551b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f552c;

    public e1(Context context, TypedArray typedArray) {
        this.f550a = context;
        this.f551b = typedArray;
    }

    public static e1 m(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new e1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public final boolean a(int i10, boolean z) {
        return this.f551b.getBoolean(i10, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r1 = f.a.a(r3.f550a, (r1 = r0.getResourceId(r4, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.ColorStateList b(int r4) {
        /*
            r3 = this;
            android.content.res.TypedArray r0 = r3.f551b
            boolean r1 = r0.hasValue(r4)
            if (r1 == 0) goto L_0x0018
            r1 = 0
            int r1 = r0.getResourceId(r4, r1)
            if (r1 == 0) goto L_0x0018
            android.content.Context r2 = r3.f550a
            android.content.res.ColorStateList r1 = f.a.a(r2, r1)
            if (r1 == 0) goto L_0x0018
            return r1
        L_0x0018:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e1.b(int):android.content.res.ColorStateList");
    }

    public final int c(int i10, int i11) {
        return this.f551b.getDimensionPixelOffset(i10, i11);
    }

    public final int d(int i10, int i11) {
        return this.f551b.getDimensionPixelSize(i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r0.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable e(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f551b
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L_0x0016
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L_0x0016
            android.content.Context r3 = r2.f550a
            android.graphics.drawable.Drawable r3 = f.a.b(r3, r1)
            return r3
        L_0x0016:
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e1.e(int):android.graphics.drawable.Drawable");
    }

    public final Drawable f(int i10) {
        int resourceId;
        Drawable e10;
        if (!this.f551b.hasValue(i10) || (resourceId = this.f551b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        k a10 = k.a();
        Context context = this.f550a;
        synchronized (a10) {
            e10 = a10.f620a.e(resourceId, context, true);
        }
        return e10;
    }

    public final Typeface g(int i10, int i11, d0.a aVar) {
        int resourceId = this.f551b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f552c == null) {
            this.f552c = new TypedValue();
        }
        TypedValue typedValue = this.f552c;
        ThreadLocal<TypedValue> threadLocal = d.f22a;
        Context context = this.f550a;
        if (context.isRestricted()) {
            return null;
        }
        return d.b(context, resourceId, typedValue, i11, aVar, true, false);
    }

    public final int h(int i10, int i11) {
        return this.f551b.getInt(i10, i11);
    }

    public final int i(int i10, int i11) {
        return this.f551b.getResourceId(i10, i11);
    }

    public final String j(int i10) {
        return this.f551b.getString(i10);
    }

    public final CharSequence k(int i10) {
        return this.f551b.getText(i10);
    }

    public final boolean l(int i10) {
        return this.f551b.hasValue(i10);
    }

    public final void n() {
        this.f551b.recycle();
    }
}
