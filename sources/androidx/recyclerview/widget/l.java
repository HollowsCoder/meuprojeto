package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class l extends RecyclerView.m implements RecyclerView.r {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final a B;

    /* renamed from: a  reason: collision with root package name */
    public final int f1805a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1806b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f1807c;
    public final Drawable d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1808e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1809f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f1810g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f1811h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1812i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1813j;

    /* renamed from: k  reason: collision with root package name */
    public int f1814k;
    public int l;

    /* renamed from: m  reason: collision with root package name */
    public float f1815m;

    /* renamed from: n  reason: collision with root package name */
    public int f1816n;

    /* renamed from: o  reason: collision with root package name */
    public int f1817o;

    /* renamed from: p  reason: collision with root package name */
    public float f1818p;

    /* renamed from: q  reason: collision with root package name */
    public int f1819q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f1820r = 0;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f1821s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1822t = false;
    public boolean u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f1823v = 0;
    public int w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f1824x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f1825y = new int[2];
    public final ValueAnimator z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            l lVar = l.this;
            int i10 = lVar.A;
            ValueAnimator valueAnimator = lVar.z;
            if (i10 == 1) {
                valueAnimator.cancel();
            } else if (i10 != 2) {
                return;
            }
            lVar.A = 3;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            valueAnimator.setDuration((long) 500);
            valueAnimator.start();
        }
    }

    public class b extends RecyclerView.s {
        public b() {
        }

        public final void b(RecyclerView recyclerView, int i10, int i11) {
            boolean z;
            boolean z10;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            l lVar = l.this;
            int computeVerticalScrollRange = lVar.f1821s.computeVerticalScrollRange();
            int i12 = lVar.f1820r;
            int i13 = computeVerticalScrollRange - i12;
            int i14 = lVar.f1805a;
            if (i13 <= 0 || i12 < i14) {
                z = false;
            } else {
                z = true;
            }
            lVar.f1822t = z;
            int computeHorizontalScrollRange = lVar.f1821s.computeHorizontalScrollRange();
            int i15 = lVar.f1819q;
            if (computeHorizontalScrollRange - i15 <= 0 || i15 < i14) {
                z10 = false;
            } else {
                z10 = true;
            }
            lVar.u = z10;
            boolean z11 = lVar.f1822t;
            if (z11 || z10) {
                if (z11) {
                    float f10 = (float) i12;
                    lVar.l = (int) ((((f10 / 2.0f) + ((float) computeVerticalScrollOffset)) * f10) / ((float) computeVerticalScrollRange));
                    lVar.f1814k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
                }
                if (lVar.u) {
                    float f11 = (float) computeHorizontalScrollOffset;
                    float f12 = (float) i15;
                    lVar.f1817o = (int) ((((f12 / 2.0f) + f11) * f12) / ((float) computeHorizontalScrollRange));
                    lVar.f1816n = Math.min(i15, (i15 * i15) / computeHorizontalScrollRange);
                }
                int i16 = lVar.f1823v;
                if (i16 == 0 || i16 == 1) {
                    lVar.j(1);
                }
            } else if (lVar.f1823v != 0) {
                lVar.j(0);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1828a = false;

        public c() {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f1828a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f1828a) {
                this.f1828a = false;
                return;
            }
            l lVar = l.this;
            if (((Float) lVar.z.getAnimatedValue()).floatValue() == 0.0f) {
                lVar.A = 0;
                lVar.j(0);
                return;
            }
            lVar.A = 2;
            lVar.f1821s.invalidate();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l lVar = l.this;
            lVar.f1807c.setAlpha(floatValue);
            lVar.d.setAlpha(floatValue);
            lVar.f1821s.invalidate();
        }
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        boolean z10 = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.z = ofFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.f1807c = stateListDrawable;
        this.d = drawable;
        this.f1810g = stateListDrawable2;
        this.f1811h = drawable2;
        this.f1808e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f1809f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f1812i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f1813j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f1805a = i11;
        this.f1806b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f1821s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.n nVar = recyclerView2.A;
                if (nVar != null) {
                    nVar.c("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList<RecyclerView.m> arrayList = recyclerView2.D;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z10);
                }
                recyclerView2.N();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f1821s;
                recyclerView3.E.remove(this);
                if (recyclerView3.F == this) {
                    recyclerView3.F = null;
                }
                ArrayList arrayList2 = this.f1821s.x0;
                if (arrayList2 != null) {
                    arrayList2.remove(bVar);
                }
                this.f1821s.removeCallbacks(aVar);
            }
            this.f1821s = recyclerView;
            if (recyclerView != null) {
                recyclerView.g(this);
                this.f1821s.E.add(this);
                this.f1821s.h(bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        if (r9 >= 0) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0112, code lost:
        if (r5 >= 0) goto L_0x0114;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r12.f1823v
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != 0) goto L_0x0047
            float r0 = r13.getX()
            float r3 = r13.getY()
            boolean r0 = r12.h(r0, r3)
            float r3 = r13.getX()
            float r4 = r13.getY()
            boolean r3 = r12.g(r3, r4)
            if (r0 != 0) goto L_0x0029
            if (r3 == 0) goto L_0x011d
        L_0x0029:
            if (r3 == 0) goto L_0x0036
            r12.w = r1
            float r13 = r13.getX()
            int r13 = (int) r13
            float r13 = (float) r13
            r12.f1818p = r13
            goto L_0x0042
        L_0x0036:
            if (r0 == 0) goto L_0x0042
            r12.w = r2
            float r13 = r13.getY()
            int r13 = (int) r13
            float r13 = (float) r13
            r12.f1815m = r13
        L_0x0042:
            r12.j(r2)
            goto L_0x011d
        L_0x0047:
            int r0 = r13.getAction()
            r3 = 0
            if (r0 != r1) goto L_0x005e
            int r0 = r12.f1823v
            if (r0 != r2) goto L_0x005e
            r13 = 0
            r12.f1815m = r13
            r12.f1818p = r13
            r12.j(r1)
            r12.w = r3
            goto L_0x011d
        L_0x005e:
            int r0 = r13.getAction()
            if (r0 != r2) goto L_0x011d
            int r0 = r12.f1823v
            if (r0 != r2) goto L_0x011d
            r12.k()
            int r0 = r12.w
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = r12.f1806b
            if (r0 != r1) goto L_0x00c6
            float r0 = r13.getX()
            int[] r6 = r12.f1825y
            r6[r3] = r5
            int r7 = r12.f1819q
            int r7 = r7 - r5
            r6[r1] = r7
            float r8 = (float) r5
            float r7 = (float) r7
            float r0 = java.lang.Math.min(r7, r0)
            float r0 = java.lang.Math.max(r8, r0)
            int r7 = r12.f1817o
            float r7 = (float) r7
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0097
            goto L_0x00c6
        L_0x0097:
            float r7 = r12.f1818p
            androidx.recyclerview.widget.RecyclerView r8 = r12.f1821s
            int r8 = r8.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r9 = r12.f1821s
            int r9 = r9.computeHorizontalScrollOffset()
            int r10 = r12.f1819q
            r11 = r6[r1]
            r6 = r6[r3]
            int r11 = r11 - r6
            if (r11 != 0) goto L_0x00b0
        L_0x00ae:
            r6 = r3
            goto L_0x00bd
        L_0x00b0:
            float r6 = r0 - r7
            float r7 = (float) r11
            float r6 = r6 / r7
            int r8 = r8 - r10
            float r7 = (float) r8
            float r6 = r6 * r7
            int r6 = (int) r6
            int r9 = r9 + r6
            if (r9 >= r8) goto L_0x00ae
            if (r9 < 0) goto L_0x00ae
        L_0x00bd:
            if (r6 == 0) goto L_0x00c4
            androidx.recyclerview.widget.RecyclerView r7 = r12.f1821s
            r7.scrollBy(r6, r3)
        L_0x00c4:
            r12.f1818p = r0
        L_0x00c6:
            int r0 = r12.w
            if (r0 != r2) goto L_0x011d
            float r13 = r13.getY()
            int[] r0 = r12.f1824x
            r0[r3] = r5
            int r2 = r12.f1820r
            int r2 = r2 - r5
            r0[r1] = r2
            float r5 = (float) r5
            float r2 = (float) r2
            float r13 = java.lang.Math.min(r2, r13)
            float r13 = java.lang.Math.max(r5, r13)
            int r2 = r12.l
            float r2 = (float) r2
            float r2 = r2 - r13
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ee
            goto L_0x011d
        L_0x00ee:
            float r2 = r12.f1815m
            androidx.recyclerview.widget.RecyclerView r4 = r12.f1821s
            int r4 = r4.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r5 = r12.f1821s
            int r5 = r5.computeVerticalScrollOffset()
            int r6 = r12.f1820r
            r1 = r0[r1]
            r0 = r0[r3]
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x0107
        L_0x0105:
            r0 = r3
            goto L_0x0114
        L_0x0107:
            float r0 = r13 - r2
            float r1 = (float) r1
            float r0 = r0 / r1
            int r4 = r4 - r6
            float r1 = (float) r4
            float r0 = r0 * r1
            int r0 = (int) r0
            int r5 = r5 + r0
            if (r5 >= r4) goto L_0x0105
            if (r5 < 0) goto L_0x0105
        L_0x0114:
            if (r0 == 0) goto L_0x011b
            androidx.recyclerview.widget.RecyclerView r1 = r12.f1821s
            r1.scrollBy(r3, r0)
        L_0x011b:
            r12.f1815m = r13
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.a(android.view.MotionEvent):void");
    }

    public final boolean b(MotionEvent motionEvent) {
        int i10 = this.f1823v;
        if (i10 == 1) {
            boolean h10 = h(motionEvent.getX(), motionEvent.getY());
            boolean g10 = g(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (h10 || g10)) {
                if (g10) {
                    this.w = 1;
                    this.f1818p = (float) ((int) motionEvent.getX());
                } else if (h10) {
                    this.w = 2;
                    this.f1815m = (float) ((int) motionEvent.getY());
                }
                j(2);
                return true;
            }
        } else if (i10 == 2) {
            return true;
        }
        return false;
    }

    public final void c() {
    }

    public final void f(Canvas canvas) {
        int i10;
        if (this.f1819q != this.f1821s.getWidth() || this.f1820r != this.f1821s.getHeight()) {
            this.f1819q = this.f1821s.getWidth();
            this.f1820r = this.f1821s.getHeight();
            j(0);
        } else if (this.A != 0) {
            if (this.f1822t) {
                int i11 = this.f1819q;
                int i12 = this.f1808e;
                int i13 = i11 - i12;
                int i14 = this.l;
                int i15 = this.f1814k;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable = this.f1807c;
                stateListDrawable.setBounds(0, 0, i12, i15);
                int i17 = this.f1820r;
                int i18 = this.f1809f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i18, i17);
                RecyclerView recyclerView = this.f1821s;
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                boolean z10 = true;
                if (w.e.d(recyclerView) != 1) {
                    z10 = false;
                }
                if (z10) {
                    drawable.draw(canvas);
                    canvas.translate((float) i12, (float) i16);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    i10 = -i12;
                } else {
                    canvas.translate((float) i13, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, (float) i16);
                    stateListDrawable.draw(canvas);
                    i10 = -i13;
                }
                canvas.translate((float) i10, (float) (-i16));
            }
            if (this.u) {
                int i19 = this.f1820r;
                int i20 = this.f1812i;
                int i21 = i19 - i20;
                int i22 = this.f1817o;
                int i23 = this.f1816n;
                int i24 = i22 - (i23 / 2);
                StateListDrawable stateListDrawable2 = this.f1810g;
                stateListDrawable2.setBounds(0, 0, i23, i20);
                int i25 = this.f1819q;
                int i26 = this.f1813j;
                Drawable drawable2 = this.f1811h;
                drawable2.setBounds(0, 0, i25, i26);
                canvas.translate(0.0f, (float) i21);
                drawable2.draw(canvas);
                canvas.translate((float) i24, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate((float) (-i24), (float) (-i21));
            }
        }
    }

    public final boolean g(float f10, float f11) {
        if (f11 >= ((float) (this.f1820r - this.f1812i))) {
            int i10 = this.f1817o;
            int i11 = this.f1816n;
            return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) ((i11 / 2) + i10));
        }
    }

    public final boolean h(float f10, float f11) {
        boolean z10;
        RecyclerView recyclerView = this.f1821s;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.e.d(recyclerView) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f1808e;
        if (z10) {
            if (f10 > ((float) i10)) {
                return false;
            }
        } else if (f10 < ((float) (this.f1819q - i10))) {
            return false;
        }
        int i11 = this.l;
        int i12 = this.f1814k / 2;
        if (f11 < ((float) (i11 - i12)) || f11 > ((float) (i12 + i11))) {
            return false;
        }
        return true;
    }

    public final void i(int i10) {
        RecyclerView recyclerView = this.f1821s;
        a aVar = this.B;
        recyclerView.removeCallbacks(aVar);
        this.f1821s.postDelayed(aVar, (long) i10);
    }

    public final void j(int i10) {
        int i11;
        StateListDrawable stateListDrawable = this.f1807c;
        if (i10 == 2 && this.f1823v != 2) {
            stateListDrawable.setState(C);
            this.f1821s.removeCallbacks(this.B);
        }
        if (i10 == 0) {
            this.f1821s.invalidate();
        } else {
            k();
        }
        if (this.f1823v != 2 || i10 == 2) {
            if (i10 == 1) {
                i11 = 1500;
            }
            this.f1823v = i10;
        }
        stateListDrawable.setState(D);
        i11 = 1200;
        i(i11);
        this.f1823v = i10;
    }

    public final void k() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.z;
        if (i10 != 0) {
            if (i10 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        valueAnimator.setDuration(500);
        valueAnimator.setStartDelay(0);
        valueAnimator.start();
    }
}
