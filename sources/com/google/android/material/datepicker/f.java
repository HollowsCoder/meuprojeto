package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

public final class f extends BaseAdapter {

    /* renamed from: r  reason: collision with root package name */
    public static final int f3414r = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: o  reason: collision with root package name */
    public final Calendar f3415o;

    /* renamed from: p  reason: collision with root package name */
    public final int f3416p;

    /* renamed from: q  reason: collision with root package name */
    public final int f3417q;

    public f() {
        Calendar d = b0.d((Calendar) null);
        this.f3415o = d;
        this.f3416p = d.getMaximum(7);
        this.f3417q = d.getFirstDayOfWeek();
    }

    public final int getCount() {
        return this.f3416p;
    }

    public final Object getItem(int i10) {
        int i11 = this.f3416p;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f3417q;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    public final long getItemId(int i10) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0018
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131558482(0x7f0d0052, float:1.8742281E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0018:
            int r7 = r5.f3417q
            int r6 = r6 + r7
            int r7 = r5.f3416p
            if (r6 <= r7) goto L_0x0020
            int r6 = r6 - r7
        L_0x0020:
            java.util.Calendar r7 = r5.f3415o
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            int r3 = f3414r
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            r8 = 2131886210(0x7f120082, float:1.9406992E38)
            java.lang.String r6 = r6.getString(r8)
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.getDisplayName(r2, r3, r4)
            r8[r1] = r7
            java.lang.String r6 = java.lang.String.format(r6, r8)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
