package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f602a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f603b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f604c = null;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f605e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f606f;

    public j(CompoundButton compoundButton) {
        this.f602a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f602a;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable == null) {
            return;
        }
        if (this.d || this.f605e) {
            Drawable mutate = buttonDrawable.mutate();
            if (this.d) {
                mutate.setTintList(this.f603b);
            }
            if (this.f605e) {
                mutate.setTintMode(this.f604c);
            }
            if (mutate.isStateful()) {
                mutate.setState(compoundButton.getDrawableState());
            }
            compoundButton.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035 A[SYNTHETIC, Splitter:B:11:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[Catch:{ all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061 A[Catch:{ all -> 0x0072 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.widget.CompoundButton r6 = r8.f602a
            android.content.Context r0 = r6.getContext()
            int[] r2 = androidx.databinding.a.L
            androidx.appcompat.widget.e1 r7 = androidx.appcompat.widget.e1.m(r0, r9, r2, r10)
            android.content.Context r1 = r6.getContext()
            android.content.res.TypedArray r4 = r7.f551b
            r0 = r6
            r3 = r9
            r5 = r10
            i0.w.j(r0, r1, r2, r3, r4, r5)
            r9 = 1
            boolean r10 = r7.l(r9)     // Catch:{ all -> 0x0072 }
            r0 = 0
            if (r10 == 0) goto L_0x0032
            int r10 = r7.i(r9, r0)     // Catch:{ all -> 0x0072 }
            if (r10 == 0) goto L_0x0032
            android.content.Context r1 = r6.getContext()     // Catch:{ NotFoundException -> 0x0032 }
            android.graphics.drawable.Drawable r10 = f.a.b(r1, r10)     // Catch:{ NotFoundException -> 0x0032 }
            r6.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x0032 }
            goto L_0x0033
        L_0x0032:
            r9 = r0
        L_0x0033:
            if (r9 != 0) goto L_0x004c
            boolean r9 = r7.l(r0)     // Catch:{ all -> 0x0072 }
            if (r9 == 0) goto L_0x004c
            int r9 = r7.i(r0, r0)     // Catch:{ all -> 0x0072 }
            if (r9 == 0) goto L_0x004c
            android.content.Context r10 = r6.getContext()     // Catch:{ all -> 0x0072 }
            android.graphics.drawable.Drawable r9 = f.a.b(r10, r9)     // Catch:{ all -> 0x0072 }
            r6.setButtonDrawable(r9)     // Catch:{ all -> 0x0072 }
        L_0x004c:
            r9 = 2
            boolean r10 = r7.l(r9)     // Catch:{ all -> 0x0072 }
            if (r10 == 0) goto L_0x005a
            android.content.res.ColorStateList r9 = r7.b(r9)     // Catch:{ all -> 0x0072 }
            r6.setButtonTintList(r9)     // Catch:{ all -> 0x0072 }
        L_0x005a:
            r9 = 3
            boolean r10 = r7.l(r9)     // Catch:{ all -> 0x0072 }
            if (r10 == 0) goto L_0x006e
            r10 = -1
            int r9 = r7.h(r9, r10)     // Catch:{ all -> 0x0072 }
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.k0.c(r9, r10)     // Catch:{ all -> 0x0072 }
            r6.setButtonTintMode(r9)     // Catch:{ all -> 0x0072 }
        L_0x006e:
            r7.n()
            return
        L_0x0072:
            r9 = move-exception
            r7.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.b(android.util.AttributeSet, int):void");
    }
}
