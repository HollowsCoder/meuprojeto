package h1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p1.e;
import r1.p;
import s1.a;

public final class l extends Drawable implements Drawable.Callback, Animatable {
    public p1.c A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final boolean F;
    public boolean G;

    /* renamed from: o  reason: collision with root package name */
    public final Matrix f5146o = new Matrix();

    /* renamed from: p  reason: collision with root package name */
    public f f5147p;

    /* renamed from: q  reason: collision with root package name */
    public final t1.d f5148q;

    /* renamed from: r  reason: collision with root package name */
    public float f5149r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5150s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5151t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<n> f5152v;
    public l1.b w;

    /* renamed from: x  reason: collision with root package name */
    public String f5153x;

    /* renamed from: y  reason: collision with root package name */
    public l1.a f5154y;
    public boolean z;

    public class a implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5155a;

        public a(String str) {
            this.f5155a = str;
        }

        public final void run() {
            l.this.l(this.f5155a);
        }
    }

    public class b implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f5157a;

        public b(int i10) {
            this.f5157a = i10;
        }

        public final void run() {
            l.this.h(this.f5157a);
        }
    }

    public class c implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f5159a;

        public c(float f10) {
            this.f5159a = f10;
        }

        public final void run() {
            l.this.p(this.f5159a);
        }
    }

    public class d implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m1.e f5161a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f5162b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ u1.c f5163c;

        public d(m1.e eVar, Object obj, u1.c cVar) {
            this.f5161a = eVar;
            this.f5162b = obj;
            this.f5163c = cVar;
        }

        public final void run() {
            l.this.a(this.f5161a, this.f5162b, this.f5163c);
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f10;
            l lVar = l.this;
            p1.c cVar = lVar.A;
            if (cVar != null) {
                t1.d dVar = lVar.f5148q;
                f fVar = dVar.f8882x;
                if (fVar == null) {
                    f10 = 0.0f;
                } else {
                    float f11 = dVar.f8880t;
                    float f12 = fVar.f5126k;
                    f10 = (f11 - f12) / (fVar.l - f12);
                }
                cVar.q(f10);
            }
        }
    }

    public class f implements n {
        public f() {
        }

        public final void run() {
            l.this.f();
        }
    }

    public class g implements n {
        public g() {
        }

        public final void run() {
            l.this.g();
        }
    }

    public class h implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f5167a;

        public h(int i10) {
            this.f5167a = i10;
        }

        public final void run() {
            l.this.m(this.f5167a);
        }
    }

    public class i implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f5169a;

        public i(float f10) {
            this.f5169a = f10;
        }

        public final void run() {
            l.this.o(this.f5169a);
        }
    }

    public class j implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f5171a;

        public j(int i10) {
            this.f5171a = i10;
        }

        public final void run() {
            l.this.i(this.f5171a);
        }
    }

    public class k implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f5173a;

        public k(float f10) {
            this.f5173a = f10;
        }

        public final void run() {
            l.this.k(this.f5173a);
        }
    }

    /* renamed from: h1.l$l  reason: collision with other inner class name */
    public class C0074l implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5175a;

        public C0074l(String str) {
            this.f5175a = str;
        }

        public final void run() {
            l.this.n(this.f5175a);
        }
    }

    public class m implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5177a;

        public m(String str) {
            this.f5177a = str;
        }

        public final void run() {
            l.this.j(this.f5177a);
        }
    }

    public interface n {
        void run();
    }

    public l() {
        t1.d dVar = new t1.d();
        this.f5148q = dVar;
        this.f5149r = 1.0f;
        this.f5150s = true;
        this.f5151t = false;
        this.u = false;
        this.f5152v = new ArrayList<>();
        e eVar = new e();
        this.B = 255;
        this.F = true;
        this.G = false;
        dVar.addUpdateListener(eVar);
    }

    public final <T> void a(m1.e eVar, T t10, u1.c<T> cVar) {
        float f10;
        p1.c cVar2 = this.A;
        if (cVar2 == null) {
            this.f5152v.add(new d(eVar, t10, cVar));
            return;
        }
        boolean z10 = true;
        if (eVar == m1.e.f7047c) {
            cVar2.h(cVar, t10);
        } else {
            m1.f fVar = eVar.f7049b;
            if (fVar != null) {
                fVar.h(cVar, t10);
            } else {
                ArrayList arrayList = new ArrayList();
                this.A.g(eVar, 0, arrayList, new m1.e(new String[0]));
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((m1.e) arrayList.get(i10)).f7049b.h(cVar, t10);
                }
                z10 = true ^ arrayList.isEmpty();
            }
        }
        if (z10) {
            invalidateSelf();
            if (t10 == q.C) {
                t1.d dVar = this.f5148q;
                f fVar2 = dVar.f8882x;
                if (fVar2 == null) {
                    f10 = 0.0f;
                } else {
                    float f11 = dVar.f8880t;
                    float f12 = fVar2.f5126k;
                    f10 = (f11 - f12) / (fVar2.l - f12);
                }
                p(f10);
            }
        }
    }

    public final boolean b() {
        return this.f5150s || this.f5151t;
    }

    public final void c() {
        f fVar = this.f5147p;
        a.C0126a aVar = p.f8384a;
        Rect rect = fVar.f5125j;
        List emptyList = Collections.emptyList();
        e.a aVar2 = e.a.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        n1.g gVar = r16;
        n1.g gVar2 = new n1.g();
        p1.e eVar = r2;
        Rect rect2 = rect;
        p1.e eVar2 = new p1.e(emptyList, fVar, "__container", -1, aVar2, -1, (String) null, emptyList2, gVar, 0, 0, 0, 0.0f, 0.0f, rect2.width(), rect2.height(), (n1.c) null, (n1.f) null, Collections.emptyList(), e.b.NONE, (n1.b) null, false);
        f fVar2 = this.f5147p;
        p1.c cVar = new p1.c(this, eVar, fVar2.f5124i, fVar2);
        this.A = cVar;
        if (this.D) {
            cVar.p(true);
        }
    }

    public final void d() {
        t1.d dVar = this.f5148q;
        if (dVar.f8883y) {
            dVar.cancel();
        }
        this.f5147p = null;
        this.A = null;
        this.w = null;
        dVar.f8882x = null;
        dVar.f8881v = -2.14748365E9f;
        dVar.w = 2.14748365E9f;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.G = false;
        if (this.u) {
            try {
                e(canvas);
            } catch (Throwable unused) {
                t1.c.f8876a.getClass();
            }
        } else {
            e(canvas);
        }
        androidx.databinding.a.n();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.graphics.Canvas r10) {
        /*
            r9 = this;
            h1.f r0 = r9.f5147p
            if (r0 == 0) goto L_0x0032
            android.graphics.Rect r1 = r9.getBounds()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x000f
            goto L_0x0032
        L_0x000f:
            android.graphics.Rect r1 = r9.getBounds()
            int r2 = r1.width()
            float r2 = (float) r2
            int r1 = r1.height()
            float r1 = (float) r1
            float r2 = r2 / r1
            android.graphics.Rect r0 = r0.f5125j
            int r1 = r0.width()
            float r1 = (float) r1
            int r0 = r0.height()
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r0 = 0
            goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            android.graphics.Matrix r1 = r9.f5146o
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x00a9
            p1.c r0 = r9.A
            if (r0 != 0) goto L_0x0042
            goto L_0x011a
        L_0x0042:
            android.graphics.Rect r0 = r9.getBounds()
            int r5 = r0.width()
            float r5 = (float) r5
            h1.f r6 = r9.f5147p
            android.graphics.Rect r6 = r6.f5125j
            int r6 = r6.width()
            float r6 = (float) r6
            float r5 = r5 / r6
            int r6 = r0.height()
            float r6 = (float) r6
            h1.f r7 = r9.f5147p
            android.graphics.Rect r7 = r7.f5125j
            int r7 = r7.height()
            float r7 = (float) r7
            float r6 = r6 / r7
            boolean r7 = r9.F
            if (r7 == 0) goto L_0x0095
            float r7 = java.lang.Math.min(r5, r6)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x0075
            float r8 = r4 / r7
            float r5 = r5 / r8
            float r6 = r6 / r8
            goto L_0x0076
        L_0x0075:
            r8 = r4
        L_0x0076:
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0095
            int r3 = r10.save()
            int r4 = r0.width()
            float r4 = (float) r4
            float r4 = r4 / r2
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 / r2
            float r2 = r4 * r7
            float r7 = r7 * r0
            float r4 = r4 - r2
            float r0 = r0 - r7
            r10.translate(r4, r0)
            r10.scale(r8, r8, r2, r7)
        L_0x0095:
            r1.reset()
            r1.preScale(r5, r6)
            p1.c r0 = r9.A
            int r2 = r9.B
            r0.e(r10, r1, r2)
            if (r3 <= 0) goto L_0x011a
            r10.restoreToCount(r3)
            goto L_0x011a
        L_0x00a9:
            p1.c r0 = r9.A
            if (r0 != 0) goto L_0x00ae
            goto L_0x011a
        L_0x00ae:
            float r0 = r9.f5149r
            int r5 = r10.getWidth()
            float r5 = (float) r5
            h1.f r6 = r9.f5147p
            android.graphics.Rect r6 = r6.f5125j
            int r6 = r6.width()
            float r6 = (float) r6
            float r5 = r5 / r6
            int r6 = r10.getHeight()
            float r6 = (float) r6
            h1.f r7 = r9.f5147p
            android.graphics.Rect r7 = r7.f5125j
            int r7 = r7.height()
            float r7 = (float) r7
            float r6 = r6 / r7
            float r5 = java.lang.Math.min(r5, r6)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00da
            float r0 = r9.f5149r
            float r0 = r0 / r5
            goto L_0x00dc
        L_0x00da:
            r5 = r0
            r0 = r4
        L_0x00dc:
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0108
            int r3 = r10.save()
            h1.f r4 = r9.f5147p
            android.graphics.Rect r4 = r4.f5125j
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 / r2
            h1.f r6 = r9.f5147p
            android.graphics.Rect r6 = r6.f5125j
            int r6 = r6.height()
            float r6 = (float) r6
            float r6 = r6 / r2
            float r2 = r4 * r5
            float r7 = r6 * r5
            float r8 = r9.f5149r
            float r4 = r4 * r8
            float r4 = r4 - r2
            float r8 = r8 * r6
            float r8 = r8 - r7
            r10.translate(r4, r8)
            r10.scale(r0, r0, r2, r7)
        L_0x0108:
            r1.reset()
            r1.preScale(r5, r5)
            p1.c r0 = r9.A
            int r2 = r9.B
            r0.e(r10, r1, r2)
            if (r3 <= 0) goto L_0x011a
            r10.restoreToCount(r3)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.l.e(android.graphics.Canvas):void");
    }

    public final void f() {
        float f10;
        float f11;
        if (this.A == null) {
            this.f5152v.add(new f());
            return;
        }
        boolean b10 = b();
        t1.d dVar = this.f5148q;
        if (b10 || dVar.getRepeatCount() == 0) {
            dVar.f8883y = true;
            boolean i10 = dVar.i();
            Iterator it = dVar.f8874p.iterator();
            while (it.hasNext()) {
                Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(dVar, i10);
                } else {
                    animatorListener.onAnimationStart(dVar);
                }
            }
            if (dVar.i()) {
                f11 = dVar.e();
            } else {
                f11 = dVar.h();
            }
            dVar.k((float) ((int) f11));
            dVar.f8879s = 0;
            dVar.u = 0;
            if (dVar.f8883y) {
                dVar.j(false);
                Choreographer.getInstance().postFrameCallback(dVar);
            }
        }
        if (!b()) {
            if (dVar.f8877q < 0.0f) {
                f10 = dVar.h();
            } else {
                f10 = dVar.e();
            }
            h((int) f10);
            dVar.j(true);
            dVar.c(dVar.i());
        }
    }

    public final void g() {
        float f10;
        float f11;
        if (this.A == null) {
            this.f5152v.add(new g());
            return;
        }
        boolean b10 = b();
        t1.d dVar = this.f5148q;
        if (b10 || dVar.getRepeatCount() == 0) {
            dVar.f8883y = true;
            dVar.j(false);
            Choreographer.getInstance().postFrameCallback(dVar);
            dVar.f8879s = 0;
            if (dVar.i() && dVar.f8880t == dVar.h()) {
                f11 = dVar.e();
            } else if (!dVar.i() && dVar.f8880t == dVar.e()) {
                f11 = dVar.h();
            }
            dVar.f8880t = f11;
        }
        if (!b()) {
            if (dVar.f8877q < 0.0f) {
                f10 = dVar.h();
            } else {
                f10 = dVar.e();
            }
            h((int) f10);
            dVar.j(true);
            dVar.c(dVar.i());
        }
    }

    public final int getAlpha() {
        return this.B;
    }

    public final int getIntrinsicHeight() {
        f fVar = this.f5147p;
        if (fVar == null) {
            return -1;
        }
        return (int) (((float) fVar.f5125j.height()) * this.f5149r);
    }

    public final int getIntrinsicWidth() {
        f fVar = this.f5147p;
        if (fVar == null) {
            return -1;
        }
        return (int) (((float) fVar.f5125j.width()) * this.f5149r);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void h(int i10) {
        if (this.f5147p == null) {
            this.f5152v.add(new b(i10));
        } else {
            this.f5148q.k((float) i10);
        }
    }

    public final void i(int i10) {
        if (this.f5147p == null) {
            this.f5152v.add(new j(i10));
            return;
        }
        t1.d dVar = this.f5148q;
        dVar.l(dVar.f8881v, ((float) i10) + 0.99f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void invalidateSelf() {
        if (!this.G) {
            this.G = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public final boolean isRunning() {
        t1.d dVar = this.f5148q;
        if (dVar == null) {
            return false;
        }
        return dVar.f8883y;
    }

    public final void j(String str) {
        f fVar = this.f5147p;
        if (fVar == null) {
            this.f5152v.add(new m(str));
            return;
        }
        m1.h c10 = fVar.c(str);
        if (c10 != null) {
            i((int) (c10.f7053b + c10.f7054c));
            return;
        }
        throw new IllegalArgumentException(b0.d.f("Cannot find marker with name ", str, "."));
    }

    public final void k(float f10) {
        f fVar = this.f5147p;
        if (fVar == null) {
            this.f5152v.add(new k(f10));
            return;
        }
        float f11 = fVar.f5126k;
        float f12 = fVar.l;
        PointF pointF = t1.f.f8885a;
        i((int) b0.d.a(f12, f11, f10, f11));
    }

    public final void l(String str) {
        f fVar = this.f5147p;
        ArrayList<n> arrayList = this.f5152v;
        if (fVar == null) {
            arrayList.add(new a(str));
            return;
        }
        m1.h c10 = fVar.c(str);
        if (c10 != null) {
            int i10 = (int) c10.f7053b;
            int i11 = ((int) c10.f7054c) + i10;
            if (this.f5147p == null) {
                arrayList.add(new m(this, i10, i11));
                return;
            }
            this.f5148q.l((float) i10, ((float) i11) + 0.99f);
            return;
        }
        throw new IllegalArgumentException(b0.d.f("Cannot find marker with name ", str, "."));
    }

    public final void m(int i10) {
        if (this.f5147p == null) {
            this.f5152v.add(new h(i10));
            return;
        }
        t1.d dVar = this.f5148q;
        dVar.l((float) i10, (float) ((int) dVar.w));
    }

    public final void n(String str) {
        f fVar = this.f5147p;
        if (fVar == null) {
            this.f5152v.add(new C0074l(str));
            return;
        }
        m1.h c10 = fVar.c(str);
        if (c10 != null) {
            m((int) c10.f7053b);
            return;
        }
        throw new IllegalArgumentException(b0.d.f("Cannot find marker with name ", str, "."));
    }

    public final void o(float f10) {
        f fVar = this.f5147p;
        if (fVar == null) {
            this.f5152v.add(new i(f10));
            return;
        }
        float f11 = fVar.f5126k;
        float f12 = fVar.l;
        PointF pointF = t1.f.f8885a;
        m((int) b0.d.a(f12, f11, f10, f11));
    }

    public final void p(float f10) {
        f fVar = this.f5147p;
        if (fVar == null) {
            this.f5152v.add(new c(f10));
            return;
        }
        float f11 = fVar.f5126k;
        float f12 = fVar.l;
        PointF pointF = t1.f.f8885a;
        this.f5148q.k(b0.d.a(f12, f11, f10, f11));
        androidx.databinding.a.n();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j8);
        }
    }

    public final void setAlpha(int i10) {
        this.B = i10;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        t1.c.b("Use addColorFilter instead.");
    }

    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            f();
        }
    }

    public final void stop() {
        this.f5152v.clear();
        t1.d dVar = this.f5148q;
        dVar.j(true);
        dVar.c(dVar.i());
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
