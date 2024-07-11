package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import com.karumi.dexter.R;
import i.d;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f359a;

    /* renamed from: b  reason: collision with root package name */
    public final f f360b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f361c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f362e;

    /* renamed from: f  reason: collision with root package name */
    public View f363f;

    /* renamed from: g  reason: collision with root package name */
    public int f364g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f365h;

    /* renamed from: i  reason: collision with root package name */
    public j.a f366i;

    /* renamed from: j  reason: collision with root package name */
    public d f367j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f368k;
    public final a l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public final void onDismiss() {
            i.this.c();
        }
    }

    public i(int i10, int i11, Context context, View view, f fVar, boolean z) {
        this.f364g = 8388611;
        this.l = new a();
        this.f359a = context;
        this.f360b = fVar;
        this.f363f = view;
        this.f361c = z;
        this.d = i10;
        this.f362e = i11;
    }

    public i(Context context, f fVar, View view, boolean z) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, fVar, z);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [androidx.appcompat.view.menu.j, i.d] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.l] */
    /* JADX WARNING: type inference failed for: r1v10, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.d a() {
        /*
            r14 = this;
            i.d r0 = r14.f367j
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "window"
            android.content.Context r1 = r14.f359a
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.getRealSize(r2)
            int r0 = r2.x
            int r2 = r2.y
            int r0 = java.lang.Math.min(r0, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165206(0x7f070016, float:1.7944623E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0045
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f359a
            android.view.View r3 = r14.f363f
            int r4 = r14.d
            int r5 = r14.f362e
            boolean r6 = r14.f361c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0057
        L_0x0045:
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            android.content.Context r10 = r14.f359a
            androidx.appcompat.view.menu.f r12 = r14.f360b
            android.view.View r11 = r14.f363f
            int r8 = r14.d
            int r9 = r14.f362e
            boolean r13 = r14.f361c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0057:
            androidx.appcompat.view.menu.f r1 = r14.f360b
            r0.l(r1)
            androidx.appcompat.view.menu.i$a r1 = r14.l
            r0.r(r1)
            android.view.View r1 = r14.f363f
            r0.n(r1)
            androidx.appcompat.view.menu.j$a r1 = r14.f366i
            r0.j(r1)
            boolean r1 = r14.f365h
            r0.o(r1)
            int r1 = r14.f364g
            r0.p(r1)
            r14.f367j = r0
        L_0x0077:
            i.d r0 = r14.f367j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.i.a():i.d");
    }

    public final boolean b() {
        d dVar = this.f367j;
        return dVar != null && dVar.c();
    }

    public void c() {
        this.f367j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f368k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z, boolean z10) {
        d a10 = a();
        a10.s(z10);
        if (z) {
            int i12 = this.f364g;
            View view = this.f363f;
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            if ((Gravity.getAbsoluteGravity(i12, w.e.d(view)) & 7) == 5) {
                i10 -= this.f363f.getWidth();
            }
            a10.q(i10);
            a10.t(i11);
            int i13 = (int) ((this.f359a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f5948o = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a10.a();
    }
}
