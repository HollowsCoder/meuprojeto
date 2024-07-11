package p3;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public final class b implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7893o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ c f7894p;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ Rect f7895o;

        public a(Rect rect) {
            this.f7895o = rect;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00c5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPreDraw() {
            /*
                r13 = this;
                p3.b r0 = p3.b.this
                p3.c r1 = r0.f7894p
                p3.c$i r1 = r1.f7898b
                android.view.ViewGroup r2 = r0.f7893o
                int r2 = r2.getWidth()
                r1.getClass()
                android.graphics.Rect r3 = new android.graphics.Rect
                android.graphics.Rect r4 = r13.f7895o
                r3.<init>(r4)
                r1.M = r3
                android.graphics.Rect r3 = new android.graphics.Rect
                r3.<init>(r4)
                android.graphics.Rect r4 = new android.graphics.Rect
                r4.<init>()
                r1.getGlobalVisibleRect(r4)
                android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
                p3.c$g r5 = r1.f7909x
                p3.c$g r6 = p3.c.g.LEFT
                r7 = 0
                r8 = 1
                if (r5 != r6) goto L_0x0042
                int r5 = r1.getWidth()
                int r6 = r3.left
                if (r5 <= r6) goto L_0x0042
                int r6 = r6 + -30
                int r2 = r1.N
                int r6 = r6 - r2
                r4.width = r6
                goto L_0x00ca
            L_0x0042:
                p3.c$g r5 = r1.f7909x
                p3.c$g r6 = p3.c.g.RIGHT
                if (r5 != r6) goto L_0x005d
                int r5 = r3.right
                int r6 = r1.getWidth()
                int r6 = r6 + r5
                if (r6 <= r2) goto L_0x005d
                int r5 = r3.right
                int r2 = r2 - r5
                int r2 = r2 + -30
                int r5 = r1.N
                int r2 = r2 - r5
                r4.width = r2
                goto L_0x00ca
            L_0x005d:
                p3.c$g r5 = r1.f7909x
                p3.c$g r6 = p3.c.g.TOP
                if (r5 == r6) goto L_0x006a
                p3.c$g r6 = p3.c.g.BOTTOM
                if (r5 != r6) goto L_0x0068
                goto L_0x006a
            L_0x0068:
                r8 = r7
                goto L_0x00ca
            L_0x006a:
                int r5 = r3.left
                int r6 = r3.right
                int r9 = r3.centerX()
                float r9 = (float) r9
                int r10 = r1.getWidth()
                float r10 = (float) r10
                r11 = 1073741824(0x40000000, float:2.0)
                float r10 = r10 / r11
                float r10 = r10 + r9
                float r9 = (float) r2
                int r10 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r10 <= 0) goto L_0x0094
                int r10 = r3.centerX()
                float r10 = (float) r10
                int r12 = r1.getWidth()
                float r12 = (float) r12
                float r12 = r12 / r11
                float r12 = r12 + r10
                float r12 = r12 - r9
                float r5 = (float) r5
                float r5 = r5 - r12
                int r5 = (int) r5
                float r6 = (float) r6
                float r6 = r6 - r12
                goto L_0x00b7
            L_0x0094:
                int r9 = r3.centerX()
                float r9 = (float) r9
                int r10 = r1.getWidth()
                float r10 = (float) r10
                float r10 = r10 / r11
                float r9 = r9 - r10
                r10 = 0
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 >= 0) goto L_0x00be
                int r9 = r3.centerX()
                float r9 = (float) r9
                int r10 = r1.getWidth()
                float r10 = (float) r10
                float r10 = r10 / r11
                float r9 = r9 - r10
                float r9 = -r9
                float r5 = (float) r5
                float r5 = r5 + r9
                int r5 = (int) r5
                float r6 = (float) r6
                float r6 = r6 + r9
            L_0x00b7:
                int r6 = (int) r6
                p3.c$b r9 = p3.c.b.CENTER
                r1.setAlign(r9)
                goto L_0x00bf
            L_0x00be:
                r8 = r7
            L_0x00bf:
                if (r5 >= 0) goto L_0x00c2
                r5 = r7
            L_0x00c2:
                if (r6 <= r2) goto L_0x00c5
                goto L_0x00c6
            L_0x00c5:
                r2 = r6
            L_0x00c6:
                r3.left = r5
                r3.right = r2
            L_0x00ca:
                r1.setLayoutParams(r4)
                r1.postInvalidate()
                if (r8 != 0) goto L_0x00d6
                r1.b(r3)
                goto L_0x00e2
            L_0x00d6:
                android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
                p3.i r4 = new p3.i
                r4.<init>(r1, r3)
                r2.addOnPreDrawListener(r4)
            L_0x00e2:
                p3.c r0 = r0.f7894p
                p3.c$i r0 = r0.f7898b
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnPreDrawListener(r13)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p3.b.a.onPreDraw():boolean");
        }
    }

    public b(c cVar, ViewGroup viewGroup) {
        this.f7894p = cVar;
        this.f7893o = viewGroup;
    }

    public final void run() {
        Rect rect = new Rect();
        Point point = new Point();
        c cVar = this.f7894p;
        cVar.f7897a.getGlobalVisibleRect(rect, point);
        int[] iArr = new int[2];
        cVar.f7897a.getLocationOnScreen(iArr);
        rect.left = iArr[0];
        rect.top -= point.y;
        this.f7893o.addView(cVar.f7898b, -2, -2);
        cVar.f7898b.getViewTreeObserver().addOnPreDrawListener(new a(rect));
    }
}
