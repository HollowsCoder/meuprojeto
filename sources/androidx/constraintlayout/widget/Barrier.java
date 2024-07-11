package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p9.u;
import q.a;

public class Barrier extends b {
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public int f768x;

    /* renamed from: y  reason: collision with root package name */
    public a f769y;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f769y.f8124u0;
    }

    public int getMargin() {
        return this.f769y.f8125v0;
    }

    public int getType() {
        return this.w;
    }

    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f769y = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u.W);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f769y.f8124u0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f769y.f8125v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f836r = this.f769y;
        k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 == 6) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(q.e r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.w
            r3.f768x = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto L_0x000e
            if (r0 != r2) goto L_0x000b
            goto L_0x0014
        L_0x000b:
            if (r0 != r1) goto L_0x0017
            goto L_0x0010
        L_0x000e:
            if (r0 != r2) goto L_0x0012
        L_0x0010:
            r5 = 0
            goto L_0x0015
        L_0x0012:
            if (r0 != r1) goto L_0x0017
        L_0x0014:
            r5 = 1
        L_0x0015:
            r3.f768x = r5
        L_0x0017:
            boolean r5 = r4 instanceof q.a
            if (r5 == 0) goto L_0x0021
            q.a r4 = (q.a) r4
            int r5 = r3.f768x
            r4.t0 = r5
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.j(q.e, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f769y.f8124u0 = z;
    }

    public void setDpMargin(int i10) {
        this.f769y.f8125v0 = (int) ((((float) i10) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f769y.f8125v0 = i10;
    }

    public void setType(int i10) {
        this.w = i10;
    }
}
