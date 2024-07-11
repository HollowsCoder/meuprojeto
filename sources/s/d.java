package s;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.x0;
import androidx.constraintlayout.widget.ConstraintLayout;
import i0.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import s.e;

public final class d extends ConstraintLayout implements m {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ int f8497b0 = 0;
    public float E;
    public int F;
    public int G;
    public int H;
    public float I;
    public float J;
    public long K;
    public float L;
    public C0123d M;
    public b N;
    public boolean O;
    public ArrayList<c> P;
    public ArrayList<c> Q;
    public CopyOnWriteArrayList<C0123d> R;
    public int S;
    public float T;
    public boolean U;
    public c V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public e f8498a0;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            d.this.V.a();
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8500a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                s.d$e[] r0 = s.d.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8500a = r0
                s.d$e r1 = s.d.e.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8500a     // Catch:{ NoSuchFieldError -> 0x001d }
                s.d$e r1 = s.d.e.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8500a     // Catch:{ NoSuchFieldError -> 0x0028 }
                s.d$e r1 = s.d.e.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8500a     // Catch:{ NoSuchFieldError -> 0x0033 }
                s.d$e r1 = s.d.e.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s.d.b.<clinit>():void");
        }
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public float f8501a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f8502b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f8503c = -1;
        public int d = -1;

        public c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
            if (r4 == null) goto L_0x00f5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r9 = this;
                int r0 = r9.f8503c
                s.d r1 = s.d.this
                r2 = -1
                if (r0 != r2) goto L_0x000b
                int r3 = r9.d
                if (r3 == r2) goto L_0x00fa
            L_0x000b:
                if (r0 != r2) goto L_0x0014
                int r0 = r9.d
                r1.r(r0)
                goto L_0x00f5
            L_0x0014:
                int r3 = r9.d
                if (r3 != r2) goto L_0x00f2
                r1.getClass()
                s.d$e r3 = s.d.e.SETUP
                r1.setState(r3)
                r1.G = r0
                r1.F = r2
                r1.H = r2
                t.a r3 = r1.f778y
                if (r3 == 0) goto L_0x00f5
                float r4 = (float) r2
                int r5 = r3.f8861b
                android.util.SparseArray<t.a$a> r6 = r3.d
                r7 = 0
                if (r5 != r0) goto L_0x008e
                if (r0 != r2) goto L_0x0039
                java.lang.Object r0 = r6.valueAt(r7)
                goto L_0x003d
            L_0x0039:
                java.lang.Object r0 = r6.get(r5)
            L_0x003d:
                t.a$a r0 = (t.a.C0132a) r0
                int r5 = r3.f8862c
                if (r5 == r2) goto L_0x0053
                java.util.ArrayList<t.a$b> r6 = r0.f8865b
                java.lang.Object r5 = r6.get(r5)
                t.a$b r5 = (t.a.b) r5
                boolean r5 = r5.a(r4, r4)
                if (r5 == 0) goto L_0x0053
                goto L_0x00f5
            L_0x0053:
                java.util.ArrayList<t.a$b> r5 = r0.f8865b
                int r6 = r5.size()
                if (r7 >= r6) goto L_0x006b
                java.lang.Object r5 = r5.get(r7)
                t.a$b r5 = (t.a.b) r5
                boolean r5 = r5.a(r4, r4)
                if (r5 == 0) goto L_0x0068
                goto L_0x006c
            L_0x0068:
                int r7 = r7 + 1
                goto L_0x0053
            L_0x006b:
                r7 = r2
            L_0x006c:
                int r4 = r3.f8862c
                if (r4 != r7) goto L_0x0072
                goto L_0x00f5
            L_0x0072:
                java.util.ArrayList<t.a$b> r0 = r0.f8865b
                if (r7 != r2) goto L_0x0078
                r4 = 0
                goto L_0x0080
            L_0x0078:
                java.lang.Object r4 = r0.get(r7)
                t.a$b r4 = (t.a.b) r4
                androidx.constraintlayout.widget.c r4 = r4.f8871f
            L_0x0080:
                if (r7 != r2) goto L_0x0083
                goto L_0x008b
            L_0x0083:
                java.lang.Object r0 = r0.get(r7)
                t.a$b r0 = (t.a.b) r0
                int r0 = r0.f8870e
            L_0x008b:
                if (r4 != 0) goto L_0x00ea
                goto L_0x00f5
            L_0x008e:
                r3.f8861b = r0
                java.lang.Object r5 = r6.get(r0)
                t.a$a r5 = (t.a.C0132a) r5
            L_0x0096:
                java.util.ArrayList<t.a$b> r6 = r5.f8865b
                int r8 = r6.size()
                if (r7 >= r8) goto L_0x00ae
                java.lang.Object r6 = r6.get(r7)
                t.a$b r6 = (t.a.b) r6
                boolean r6 = r6.a(r4, r4)
                if (r6 == 0) goto L_0x00ab
                goto L_0x00af
            L_0x00ab:
                int r7 = r7 + 1
                goto L_0x0096
            L_0x00ae:
                r7 = r2
            L_0x00af:
                java.util.ArrayList<t.a$b> r4 = r5.f8865b
                if (r7 != r2) goto L_0x00b6
                androidx.constraintlayout.widget.c r5 = r5.d
                goto L_0x00be
            L_0x00b6:
                java.lang.Object r5 = r4.get(r7)
                t.a$b r5 = (t.a.b) r5
                androidx.constraintlayout.widget.c r5 = r5.f8871f
            L_0x00be:
                if (r7 != r2) goto L_0x00c1
                goto L_0x00c9
            L_0x00c1:
                java.lang.Object r4 = r4.get(r7)
                t.a$b r4 = (t.a.b) r4
                int r4 = r4.f8870e
            L_0x00c9:
                if (r5 != 0) goto L_0x00e9
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r4 = 79
                r3.<init>(r4)
                java.lang.String r4 = "NO Constraint set found ! id="
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = ", dim =-1.0, -1.0"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                java.lang.String r3 = "ConstraintLayoutStates"
                android.util.Log.v(r3, r0)
                goto L_0x00f5
            L_0x00e9:
                r4 = r5
            L_0x00ea:
                r3.f8862c = r7
                androidx.constraintlayout.widget.ConstraintLayout r0 = r3.f8860a
                r4.a(r0)
                goto L_0x00f5
            L_0x00f2:
                r1.q(r0, r3)
            L_0x00f5:
                s.d$e r0 = s.d.e.SETUP
                r1.setState(r0)
            L_0x00fa:
                float r0 = r9.f8502b
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 == 0) goto L_0x0111
                float r0 = r9.f8501a
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 == 0) goto L_0x010b
                return
            L_0x010b:
                float r0 = r9.f8501a
                r1.setProgress(r0)
                return
            L_0x0111:
                float r0 = r9.f8501a
                float r3 = r9.f8502b
                r1.p(r0, r3)
                r0 = 2143289344(0x7fc00000, float:NaN)
                r9.f8501a = r0
                r9.f8502b = r0
                r9.f8503c = r2
                r9.d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s.d.c.a():void");
        }
    }

    /* renamed from: s.d$d  reason: collision with other inner class name */
    public interface C0123d {
        void a();

        void b();
    }

    public enum e {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public final void b(View view, View view2, int i10, int i11) {
        getNanoTime();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0104, code lost:
        if (r1 != r2) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x010f, code lost:
        if (r1 != r2) goto L_0x0113;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(android.graphics.Canvas r17) {
        /*
            r16 = this;
            r0 = r16
            long r1 = r0.K
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0010
            long r1 = r16.getNanoTime()
            r0.K = r1
        L_0x0010:
            float r1 = r0.J
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 <= 0) goto L_0x0020
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0020
            r0.G = r4
        L_0x0020:
            boolean r3 = r0.O
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L_0x0028
            goto L_0x00fa
        L_0x0028:
            float r3 = r0.L
            float r3 = r3 - r1
            float r1 = java.lang.Math.signum(r3)
            long r8 = r16.getNanoTime()
            long r10 = r0.K
            long r10 = r8 - r10
            float r3 = (float) r10
            float r3 = r3 * r1
            r10 = 814313567(0x3089705f, float:1.0E-9)
            float r3 = r3 * r10
            float r3 = r3 / r2
            float r10 = r0.J
            float r10 = r10 + r3
            int r11 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x004b
            float r12 = r0.L
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x0055
        L_0x004b:
            int r12 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r12 > 0) goto L_0x0057
            float r12 = r0.L
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 > 0) goto L_0x0057
        L_0x0055:
            float r10 = r0.L
        L_0x0057:
            r0.J = r10
            r0.I = r10
            r0.K = r8
            r0.E = r3
            float r3 = java.lang.Math.abs(r3)
            r8 = 925353388(0x3727c5ac, float:1.0E-5)
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x006f
            s.d$e r3 = s.d.e.MOVING
            r0.setState(r3)
        L_0x006f:
            if (r11 <= 0) goto L_0x0077
            float r3 = r0.L
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0081
        L_0x0077:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x0083
            float r3 = r0.L
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0083
        L_0x0081:
            float r10 = r0.L
        L_0x0083:
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x008b
            int r8 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r8 > 0) goto L_0x0090
        L_0x008b:
            s.d$e r8 = s.d.e.FINISHED
            r0.setState(r8)
        L_0x0090:
            int r8 = r16.getChildCount()
            r0.O = r7
            r16.getNanoTime()
            r9 = 0
            if (r8 > 0) goto L_0x0127
            if (r11 <= 0) goto L_0x00a4
            float r8 = r0.L
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ae
        L_0x00a4:
            int r8 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r8 > 0) goto L_0x00b0
            float r8 = r0.L
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x00b0
        L_0x00ae:
            r8 = r6
            goto L_0x00b1
        L_0x00b0:
            r8 = r7
        L_0x00b1:
            boolean r12 = r0.O
            if (r12 != 0) goto L_0x00bc
            if (r8 == 0) goto L_0x00bc
            s.d$e r12 = s.d.e.FINISHED
            r0.setState(r12)
        L_0x00bc:
            boolean r12 = r0.O
            r8 = r8 ^ r6
            r8 = r8 | r12
            r0.O = r8
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 > 0) goto L_0x00d2
            int r12 = r0.F
            if (r12 == r4) goto L_0x00d2
            int r4 = r0.G
            if (r4 != r12) goto L_0x00cf
            goto L_0x00d2
        L_0x00cf:
            r0.G = r12
            throw r9
        L_0x00d2:
            double r12 = (double) r10
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 < 0) goto L_0x00e3
            int r4 = r0.G
            int r12 = r0.H
            if (r4 != r12) goto L_0x00e0
            goto L_0x00e3
        L_0x00e0:
            r0.G = r12
            throw r9
        L_0x00e3:
            if (r8 != 0) goto L_0x00f7
            if (r11 <= 0) goto L_0x00e9
            if (r3 == 0) goto L_0x00f1
        L_0x00e9:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00fa
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x00fa
        L_0x00f1:
            s.d$e r1 = s.d.e.FINISHED
            r0.setState(r1)
            goto L_0x00fa
        L_0x00f7:
            r16.invalidate()
        L_0x00fa:
            float r1 = r0.J
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0107
            int r1 = r0.G
            int r2 = r0.H
            if (r1 == r2) goto L_0x0112
            goto L_0x0113
        L_0x0107:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0116
            int r1 = r0.G
            int r2 = r0.F
            if (r1 == r2) goto L_0x0112
            goto L_0x0113
        L_0x0112:
            r6 = r7
        L_0x0113:
            r0.G = r2
            r7 = r6
        L_0x0116:
            if (r7 == 0) goto L_0x011f
            boolean r1 = r0.U
            if (r1 != 0) goto L_0x011f
            r16.requestLayout()
        L_0x011f:
            float r1 = r0.J
            r0.I = r1
            super.dispatchDraw(r17)
            return
        L_0x0127:
            r0.getChildAt(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void f(int i10) {
        this.f778y = null;
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.G;
    }

    public ArrayList<e.a> getDefinedTransitions() {
        return null;
    }

    public b getDesignTool() {
        if (this.N == null) {
            this.N = new b();
        }
        return this.N;
    }

    public int getEndState() {
        return this.H;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.J;
    }

    public e getScene() {
        return null;
    }

    public int getStartState() {
        return this.F;
    }

    public float getTargetPosition() {
        return this.L;
    }

    public Bundle getTransitionState() {
        if (this.V == null) {
            this.V = new c();
        }
        c cVar = this.V;
        d dVar = d.this;
        cVar.d = dVar.H;
        cVar.f8503c = dVar.F;
        cVar.f8502b = dVar.getVelocity();
        cVar.f8501a = dVar.getProgress();
        c cVar2 = this.V;
        cVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", cVar2.f8501a);
        bundle.putFloat("motion.velocity", cVar2.f8502b);
        bundle.putInt("motion.StartState", cVar2.f8503c);
        bundle.putInt("motion.EndState", cVar2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return (long) 0.0f;
    }

    public float getVelocity() {
        return this.E;
    }

    public final void i(View view, int i10) {
    }

    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
    }

    public final void k() {
        CopyOnWriteArrayList<C0123d> copyOnWriteArrayList;
        if ((this.M != null || ((copyOnWriteArrayList = this.R) != null && !copyOnWriteArrayList.isEmpty())) && this.T != this.I) {
            if (this.S != -1) {
                C0123d dVar = this.M;
                if (dVar != null) {
                    dVar.b();
                }
                CopyOnWriteArrayList<C0123d> copyOnWriteArrayList2 = this.R;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C0123d> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                }
            }
            this.S = -1;
            this.T = this.I;
            C0123d dVar2 = this.M;
            if (dVar2 != null) {
                dVar2.a();
            }
            CopyOnWriteArrayList<C0123d> copyOnWriteArrayList3 = this.R;
            if (copyOnWriteArrayList3 != null) {
                Iterator<C0123d> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
            }
        }
    }

    public final void l() {
        CopyOnWriteArrayList<C0123d> copyOnWriteArrayList;
        CopyOnWriteArrayList<C0123d> copyOnWriteArrayList2;
        if ((this.M != null || ((copyOnWriteArrayList2 = this.R) != null && !copyOnWriteArrayList2.isEmpty())) && this.S == -1) {
            this.S = this.G;
            throw null;
        } else if (this.M != null || ((copyOnWriteArrayList = this.R) != null && !copyOnWriteArrayList.isEmpty())) {
            throw null;
        }
    }

    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
    }

    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    public final boolean o(View view, View view2, int i10, int i11) {
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        c cVar = this.V;
        if (cVar == null) {
            return;
        }
        if (this.W) {
            post(new a());
        } else {
            cVar.a();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void onLayout(boolean z, int i10, int i11, int i12, int i13) {
        this.U = true;
        try {
            super.onLayout(z, i10, i11, i12, i13);
        } finally {
            this.U = false;
        }
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public final void onRtlPropertiesChanged(int i10) {
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof c) {
            c cVar = (c) view;
            if (this.R == null) {
                this.R = new CopyOnWriteArrayList<>();
            }
            this.R.add(cVar);
            if (cVar.w) {
                if (this.P == null) {
                    this.P = new ArrayList<>();
                }
                this.P.add(cVar);
            }
            if (cVar.f8495x) {
                if (this.Q == null) {
                    this.Q = new ArrayList<>();
                }
                this.Q.add(cVar);
            }
        }
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<c> arrayList = this.P;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<c> arrayList2 = this.Q;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p(float f10, float f11) {
        if (!super.isAttachedToWindow()) {
            if (this.V == null) {
                this.V = new c();
            }
            c cVar = this.V;
            cVar.f8501a = f10;
            cVar.f8502b = f11;
            return;
        }
        setProgress(f10);
        setState(e.MOVING);
        this.E = f11;
    }

    public final void q(int i10, int i11) {
        if (!super.isAttachedToWindow()) {
            if (this.V == null) {
                this.V = new c();
            }
            c cVar = this.V;
            cVar.f8503c = i10;
            cVar.d = i11;
        }
    }

    public final void r(int i10) {
        if (!super.isAttachedToWindow()) {
            if (this.V == null) {
                this.V = new c();
            }
            this.V.d = i10;
            return;
        }
        int i11 = this.G;
        if (i11 != i10 && this.F != i10 && this.H != i10) {
            this.H = i10;
            if (i11 != -1) {
                q(i11, i10);
                this.J = 0.0f;
                return;
            }
            this.L = 1.0f;
            this.I = 0.0f;
            this.J = 0.0f;
            this.K = getNanoTime();
            getNanoTime();
            throw null;
        }
    }

    public final void requestLayout() {
        int i10 = this.G;
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.W = z;
    }

    public void setInteractionEnabled(boolean z) {
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<c> arrayList = this.Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.Q.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<c> arrayList = this.P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.P.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        e eVar;
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 < 0 || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.V == null) {
                this.V = new c();
            }
            this.V.f8501a = f10;
            return;
        }
        if (i10 <= 0) {
            if (this.J == 1.0f && this.G == this.H) {
                setState(e.MOVING);
            }
            this.G = this.F;
            if (this.J != 0.0f) {
                return;
            }
        } else if (f10 >= 1.0f) {
            if (this.J == 0.0f && this.G == this.F) {
                setState(e.MOVING);
            }
            this.G = this.H;
            if (this.J != 1.0f) {
                return;
            }
        } else {
            this.G = -1;
            eVar = e.MOVING;
            setState(eVar);
        }
        eVar = e.FINISHED;
        setState(eVar);
    }

    public void setScene(e eVar) {
        e();
        throw null;
    }

    public void setStartState(int i10) {
        if (!super.isAttachedToWindow()) {
            if (this.V == null) {
                this.V = new c();
            }
            c cVar = this.V;
            cVar.f8503c = i10;
            cVar.d = i10;
            return;
        }
        this.G = i10;
    }

    public void setState(e eVar) {
        e eVar2 = e.FINISHED;
        if (eVar != eVar2 || this.G != -1) {
            e eVar3 = this.f8498a0;
            this.f8498a0 = eVar;
            e eVar4 = e.MOVING;
            if (eVar3 == eVar4 && eVar == eVar4) {
                k();
            }
            int i10 = b.f8500a[eVar3.ordinal()];
            if (i10 == 1 || i10 == 2) {
                if (eVar == eVar4) {
                    k();
                }
                if (eVar != eVar2) {
                    return;
                }
            } else if (!(i10 == 3 && eVar == eVar2)) {
                return;
            }
            l();
        }
    }

    public void setTransition(int i10) {
    }

    public void setTransition(e.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(C0123d dVar) {
        this.M = dVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.V == null) {
            this.V = new c();
        }
        c cVar = this.V;
        cVar.getClass();
        cVar.f8501a = bundle.getFloat("motion.progress");
        cVar.f8502b = bundle.getFloat("motion.velocity");
        cVar.f8503c = bundle.getInt("motion.StartState");
        cVar.d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.V.a();
        }
    }

    public final String toString() {
        Context context = getContext();
        String a10 = a.a(context, this.F);
        String a11 = a.a(context, this.H);
        float f10 = this.J;
        float f11 = this.E;
        StringBuilder sb = new StringBuilder(x0.a(a11, x0.a(a10, 47)));
        sb.append(a10);
        sb.append("->");
        sb.append(a11);
        sb.append(" (pos:");
        sb.append(f10);
        sb.append(" Dpos/Dt:");
        sb.append(f11);
        return sb.toString();
    }
}
