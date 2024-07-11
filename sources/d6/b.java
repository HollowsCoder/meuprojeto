package d6;

import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.b;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;
import m6.f;

public final class b extends b.a {

    /* renamed from: c  reason: collision with root package name */
    public final f f4192c;
    public final Rect d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.app.Activity r14) {
        /*
            r13 = this;
            r0 = 2130969234(0x7f040292, float:1.7547144E38)
            android.util.TypedValue r1 = j6.b.a(r14, r0)
            r2 = 0
            if (r1 != 0) goto L_0x000c
            r1 = r2
            goto L_0x000e
        L_0x000c:
            int r1 = r1.data
        L_0x000e:
            r3 = 0
            r4 = 2130968619(0x7f04002b, float:1.7545897E38)
            r5 = 2131951860(0x7f1300f4, float:1.9540146E38)
            android.content.Context r6 = q6.a.a(r14, r3, r4, r5)
            if (r1 != 0) goto L_0x001c
            goto L_0x0022
        L_0x001c:
            h.c r7 = new h.c
            r7.<init>((android.content.Context) r6, (int) r1)
            r6 = r7
        L_0x0022:
            android.util.TypedValue r14 = j6.b.a(r14, r0)
            if (r14 != 0) goto L_0x002a
            r14 = r2
            goto L_0x002c
        L_0x002a:
            int r14 = r14.data
        L_0x002c:
            r13.<init>(r6, r14)
            androidx.appcompat.app.AlertController$b r14 = r13.f257a
            android.content.Context r14 = r14.f238a
            android.content.res.Resources$Theme r0 = r14.getTheme()
            r9 = 2130968619(0x7f04002b, float:1.7545897E38)
            r10 = 2131951860(0x7f1300f4, float:1.9540146E38)
            r7 = 0
            int[] r8 = p9.u.B
            int[] r11 = new int[r2]
            r6 = r14
            android.content.res.TypedArray r1 = h6.k.d(r6, r7, r8, r9, r10, r11)
            android.content.res.Resources r6 = r14.getResources()
            r7 = 2131165394(0x7f0700d2, float:1.7945004E38)
            int r6 = r6.getDimensionPixelSize(r7)
            r7 = 2
            int r6 = r1.getDimensionPixelSize(r7, r6)
            android.content.res.Resources r7 = r14.getResources()
            r8 = 2131165395(0x7f0700d3, float:1.7945006E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r8 = 3
            int r7 = r1.getDimensionPixelSize(r8, r7)
            android.content.res.Resources r8 = r14.getResources()
            r9 = 2131165393(0x7f0700d1, float:1.7945002E38)
            int r8 = r8.getDimensionPixelSize(r9)
            r9 = 1
            int r8 = r1.getDimensionPixelSize(r9, r8)
            android.content.res.Resources r10 = r14.getResources()
            r11 = 2131165392(0x7f0700d0, float:1.7945E38)
            int r10 = r10.getDimensionPixelSize(r11)
            int r2 = r1.getDimensionPixelSize(r2, r10)
            r1.recycle()
            android.content.res.Resources r1 = r14.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            if (r1 != r9) goto L_0x009a
            r12 = r8
            r8 = r6
            r6 = r12
        L_0x009a:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6, r7, r8, r2)
            r13.d = r1
            java.lang.Class<d6.b> r1 = d6.b.class
            java.lang.String r1 = r1.getCanonicalName()
            r2 = 2130968816(0x7f0400f0, float:1.7546296E38)
            int r1 = j6.b.b(r2, r14, r1)
            m6.f r2 = new m6.f
            r2.<init>(r14, r3, r4, r5)
            r2.h(r14)
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r1)
            r2.j(r14)
            int r14 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r14 < r1) goto L_0x00f3
            android.util.TypedValue r14 = new android.util.TypedValue
            r14.<init>()
            r1 = 16844145(0x1010571, float:2.3697462E-38)
            r0.resolveAttribute(r1, r14, r9)
            androidx.appcompat.app.AlertController$b r0 = r13.f257a
            android.content.Context r0 = r0.f238a
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r14.getDimension(r0)
            int r14 = r14.type
            r1 = 5
            if (r14 != r1) goto L_0x00f3
            r14 = 0
            int r14 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r14 < 0) goto L_0x00f3
            m6.f$b r14 = r2.f7121o
            m6.i r14 = r14.f7131a
            m6.i r14 = r14.d(r0)
            r2.setShapeAppearanceModel(r14)
        L_0x00f3:
            r13.f4192c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.b.<init>(android.app.Activity):void");
    }

    public final androidx.appcompat.app.b a() {
        androidx.appcompat.app.b a10 = super.a();
        Window window = a10.getWindow();
        View decorView = window.getDecorView();
        f fVar = this.f4192c;
        if (fVar instanceof f) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            fVar.i(w.i.i(decorView));
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable(fVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(a10, rect));
        return a10;
    }
}
