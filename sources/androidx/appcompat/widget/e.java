package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f542a;

    /* renamed from: b  reason: collision with root package name */
    public final k f543b;

    /* renamed from: c  reason: collision with root package name */
    public int f544c = -1;
    public c1 d;

    /* renamed from: e  reason: collision with root package name */
    public c1 f545e;

    /* renamed from: f  reason: collision with root package name */
    public c1 f546f;

    public e(View view) {
        this.f542a = view;
        this.f543b = k.a();
    }

    public final void a() {
        boolean z;
        View view = this.f542a;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z10 = false;
            if (this.d != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f546f == null) {
                    this.f546f = new c1();
                }
                c1 c1Var = this.f546f;
                c1Var.f521a = null;
                c1Var.d = false;
                c1Var.f522b = null;
                c1Var.f523c = false;
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                ColorStateList g10 = w.i.g(view);
                if (g10 != null) {
                    c1Var.d = true;
                    c1Var.f521a = g10;
                }
                PorterDuff.Mode h10 = w.i.h(view);
                if (h10 != null) {
                    c1Var.f523c = true;
                    c1Var.f522b = h10;
                }
                if (c1Var.d || c1Var.f523c) {
                    k.e(background, c1Var, view.getDrawableState());
                    z10 = true;
                }
                if (z10) {
                    return;
                }
            }
            c1 c1Var2 = this.f545e;
            if (c1Var2 != null) {
                k.e(background, c1Var2, view.getDrawableState());
                return;
            }
            c1 c1Var3 = this.d;
            if (c1Var3 != null) {
                k.e(background, c1Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        c1 c1Var = this.f545e;
        if (c1Var != null) {
            return c1Var.f521a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        c1 c1Var = this.f545e;
        if (c1Var != null) {
            return c1Var.f522b;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r1.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        throw r9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.view.View r0 = r8.f542a
            android.content.Context r1 = r0.getContext()
            int[] r4 = androidx.databinding.a.Y
            androidx.appcompat.widget.e1 r1 = androidx.appcompat.widget.e1.m(r1, r9, r4, r10)
            android.view.View r2 = r8.f542a
            android.content.Context r3 = r2.getContext()
            android.content.res.TypedArray r6 = r1.f551b
            r5 = r9
            r7 = r10
            i0.w.j(r2, r3, r4, r5, r6, r7)
            r9 = 0
            boolean r10 = r1.l(r9)     // Catch:{ all -> 0x0065 }
            r2 = -1
            if (r10 == 0) goto L_0x0040
            int r9 = r1.i(r9, r2)     // Catch:{ all -> 0x0065 }
            r8.f544c = r9     // Catch:{ all -> 0x0065 }
            androidx.appcompat.widget.k r9 = r8.f543b     // Catch:{ all -> 0x0065 }
            android.content.Context r10 = r0.getContext()     // Catch:{ all -> 0x0065 }
            int r3 = r8.f544c     // Catch:{ all -> 0x0065 }
            monitor-enter(r9)     // Catch:{ all -> 0x0065 }
            androidx.appcompat.widget.t0 r4 = r9.f620a     // Catch:{ all -> 0x003d }
            android.content.res.ColorStateList r10 = r4.h(r10, r3)     // Catch:{ all -> 0x003d }
            monitor-exit(r9)     // Catch:{ all -> 0x0065 }
            if (r10 == 0) goto L_0x0040
            r8.g(r10)     // Catch:{ all -> 0x0065 }
            goto L_0x0040
        L_0x003d:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0065 }
            throw r10     // Catch:{ all -> 0x0065 }
        L_0x0040:
            r9 = 1
            boolean r10 = r1.l(r9)     // Catch:{ all -> 0x0065 }
            if (r10 == 0) goto L_0x004e
            android.content.res.ColorStateList r9 = r1.b(r9)     // Catch:{ all -> 0x0065 }
            i0.w.i.q(r0, r9)     // Catch:{ all -> 0x0065 }
        L_0x004e:
            r9 = 2
            boolean r10 = r1.l(r9)     // Catch:{ all -> 0x0065 }
            if (r10 == 0) goto L_0x0061
            int r9 = r1.h(r9, r2)     // Catch:{ all -> 0x0065 }
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.k0.c(r9, r10)     // Catch:{ all -> 0x0065 }
            i0.w.i.r(r0, r9)     // Catch:{ all -> 0x0065 }
        L_0x0061:
            r1.n()
            return
        L_0x0065:
            r9 = move-exception
            r1.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e.d(android.util.AttributeSet, int):void");
    }

    public final void e() {
        this.f544c = -1;
        g((ColorStateList) null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateList;
        this.f544c = i10;
        k kVar = this.f543b;
        if (kVar != null) {
            Context context = this.f542a.getContext();
            synchronized (kVar) {
                colorStateList = kVar.f620a.h(context, i10);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new c1();
            }
            c1 c1Var = this.d;
            c1Var.f521a = colorStateList;
            c1Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f545e == null) {
            this.f545e = new c1();
        }
        c1 c1Var = this.f545e;
        c1Var.f521a = colorStateList;
        c1Var.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f545e == null) {
            this.f545e = new c1();
        }
        c1 c1Var = this.f545e;
        c1Var.f522b = mode;
        c1Var.f523c = true;
        a();
    }
}
