package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import androidx.lifecycle.h;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.karumi.dexter.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import v1.e;

public abstract class ViewDataBinding extends a {
    public static final int H0 = Build.VERSION.SDK_INT;
    public static final boolean I0 = true;
    public static final ReferenceQueue<ViewDataBinding> J0 = new ReferenceQueue<>();
    public static final a K0 = new a();
    public boolean A0 = false;
    public final View B0;
    public boolean C0;
    public final Choreographer D0;
    public final d E0;
    public final Handler F0;
    public ViewDataBinding G0;

    /* renamed from: z0  reason: collision with root package name */
    public final b f993z0 = new b();

    public static class OnStartListener implements m {
        @u(h.b.ON_START)
        public void onStart() {
            throw null;
        }
    }

    public class a implements View.OnAttachStateChangeListener {
        @TargetApi(19)
        public final void onViewAttachedToWindow(View view) {
            ViewDataBinding viewDataBinding;
            if (view != null) {
                viewDataBinding = (ViewDataBinding) view.getTag(R.id.dataBinding);
            } else {
                viewDataBinding = null;
            }
            viewDataBinding.f993z0.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            synchronized (this) {
                ViewDataBinding.this.A0 = false;
            }
            while (true) {
                Reference<? extends ViewDataBinding> poll = ViewDataBinding.J0.poll();
                if (poll == null) {
                    break;
                } else if (poll instanceof e) {
                    e eVar = (e) poll;
                }
            }
            if (!ViewDataBinding.this.B0.isAttachedToWindow()) {
                View view = ViewDataBinding.this.B0;
                a aVar = ViewDataBinding.K0;
                view.removeOnAttachStateChangeListener(aVar);
                ViewDataBinding.this.B0.addOnAttachStateChangeListener(aVar);
                return;
            }
            ViewDataBinding.this.V();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String[][] f995a = new String[22][];

        /* renamed from: b  reason: collision with root package name */
        public final int[][] f996b = new int[22][];

        /* renamed from: c  reason: collision with root package name */
        public final int[][] f997c = new int[22][];
    }

    public ViewDataBinding(View view, int i10) {
        e[] eVarArr = new e[i10];
        this.B0 = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (I0) {
            this.D0 = Choreographer.getInstance();
            this.E0 = new d(this);
        } else {
            this.E0 = null;
            this.F0 = new Handler(Looper.myLooper());
        }
    }

    public static int W(View view, int i10) {
        return view.getContext().getColor(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        if (r2 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0098, code lost:
        if (r2 == null) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01eb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01a5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:133:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void Z(android.view.View r21, java.lang.Object[] r22, androidx.databinding.ViewDataBinding.c r23, android.util.SparseIntArray r24, boolean r25) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            if (r0 == 0) goto L_0x0014
            r5 = 2131361963(0x7f0a00ab, float:1.8343693E38)
            java.lang.Object r5 = r0.getTag(r5)
            androidx.databinding.ViewDataBinding r5 = (androidx.databinding.ViewDataBinding) r5
            goto L_0x0015
        L_0x0014:
            r5 = 0
        L_0x0015:
            if (r5 == 0) goto L_0x0018
            return
        L_0x0018:
            java.lang.Object r5 = r21.getTag()
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L_0x0023
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            r6 = -1
            r8 = 1
            java.lang.String r9 = "layout"
            if (r25 == 0) goto L_0x0073
            if (r5 == 0) goto L_0x0073
            boolean r10 = r5.startsWith(r9)
            if (r10 == 0) goto L_0x0073
            r10 = 95
            int r10 = r5.lastIndexOf(r10)
            if (r10 <= 0) goto L_0x009d
            int r10 = r10 + r8
            int r11 = r5.length()
            if (r11 != r10) goto L_0x0043
        L_0x0041:
            r11 = 0
            goto L_0x0055
        L_0x0043:
            r12 = r10
        L_0x0044:
            if (r12 >= r11) goto L_0x0054
            char r13 = r5.charAt(r12)
            boolean r13 = java.lang.Character.isDigit(r13)
            if (r13 != 0) goto L_0x0051
            goto L_0x0041
        L_0x0051:
            int r12 = r12 + 1
            goto L_0x0044
        L_0x0054:
            r11 = r8
        L_0x0055:
            if (r11 == 0) goto L_0x009d
            int r11 = r5.length()
            r12 = 0
        L_0x005c:
            if (r10 >= r11) goto L_0x006a
            int r12 = r12 * 10
            char r13 = r5.charAt(r10)
            int r13 = r13 + -48
            int r12 = r12 + r13
            int r10 = r10 + 1
            goto L_0x005c
        L_0x006a:
            r5 = r1[r12]
            if (r5 != 0) goto L_0x0070
            r1[r12] = r0
        L_0x0070:
            if (r2 != 0) goto L_0x009b
            goto L_0x009a
        L_0x0073:
            if (r5 == 0) goto L_0x009d
            java.lang.String r10 = "binding_"
            boolean r10 = r5.startsWith(r10)
            if (r10 == 0) goto L_0x009d
            int r10 = r5.length()
            r11 = 8
            r12 = 0
        L_0x0084:
            if (r11 >= r10) goto L_0x0092
            int r12 = r12 * 10
            char r13 = r5.charAt(r11)
            int r13 = r13 + -48
            int r12 = r12 + r13
            int r11 = r11 + 1
            goto L_0x0084
        L_0x0092:
            r5 = r1[r12]
            if (r5 != 0) goto L_0x0098
            r1[r12] = r0
        L_0x0098:
            if (r2 != 0) goto L_0x009b
        L_0x009a:
            r12 = r6
        L_0x009b:
            r5 = r8
            goto L_0x009f
        L_0x009d:
            r12 = r6
            r5 = 0
        L_0x009f:
            if (r5 != 0) goto L_0x00b5
            int r5 = r21.getId()
            if (r5 <= 0) goto L_0x00b5
            if (r3 == 0) goto L_0x00b5
            int r5 = r3.get(r5, r6)
            if (r5 < 0) goto L_0x00b5
            r10 = r1[r5]
            if (r10 != 0) goto L_0x00b5
            r1[r5] = r0
        L_0x00b5:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x01f7
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r5 = r0.getChildCount()
            r10 = 0
            r11 = 0
        L_0x00c1:
            if (r10 >= r5) goto L_0x01f7
            android.view.View r13 = r0.getChildAt(r10)
            if (r12 < 0) goto L_0x01de
            java.lang.Object r14 = r13.getTag()
            boolean r14 = r14 instanceof java.lang.String
            if (r14 == 0) goto L_0x01de
            java.lang.Object r14 = r13.getTag()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = "_0"
            boolean r15 = r14.endsWith(r15)
            if (r15 == 0) goto L_0x01de
            boolean r15 = r14.startsWith(r9)
            if (r15 == 0) goto L_0x01de
            r15 = 47
            int r16 = r14.indexOf(r15)
            if (r16 <= 0) goto L_0x01de
            int r15 = r14.indexOf(r15)
            int r15 = r15 + r8
            int r16 = r14.length()
            int r4 = r16 + -2
            java.lang.CharSequence r4 = r14.subSequence(r15, r4)
            java.lang.String[][] r14 = r2.f995a
            r14 = r14[r12]
            int r15 = r14.length
            r8 = r11
        L_0x0102:
            if (r8 >= r15) goto L_0x0110
            r7 = r14[r8]
            boolean r7 = android.text.TextUtils.equals(r4, r7)
            if (r7 == 0) goto L_0x010d
            goto L_0x0111
        L_0x010d:
            int r8 = r8 + 1
            goto L_0x0102
        L_0x0110:
            r8 = r6
        L_0x0111:
            if (r8 < 0) goto L_0x01de
            int r11 = r8 + 1
            int[][] r4 = r2.f996b
            r4 = r4[r12]
            r4 = r4[r8]
            int[][] r7 = r2.f997c
            r7 = r7[r12]
            r7 = r7[r8]
            android.view.View r8 = r0.getChildAt(r10)
            java.lang.Object r8 = r8.getTag()
            java.lang.String r8 = (java.lang.String) r8
            int r14 = r8.length()
            int r14 = r14 + r6
            r15 = 0
            java.lang.String r14 = r8.substring(r15, r14)
            int r15 = r14.length()
            int r6 = r0.getChildCount()
            int r17 = r10 + 1
            r21 = r5
            r5 = r17
            r17 = r9
            r9 = r10
        L_0x0146:
            if (r5 >= r6) goto L_0x01ae
            android.view.View r18 = r0.getChildAt(r5)
            r25 = r6
            java.lang.Object r6 = r18.getTag()
            boolean r6 = r6 instanceof java.lang.String
            if (r6 == 0) goto L_0x015d
            java.lang.Object r6 = r18.getTag()
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x015e
        L_0x015d:
            r6 = 0
        L_0x015e:
            if (r6 == 0) goto L_0x01a1
            boolean r18 = r6.startsWith(r14)
            if (r18 == 0) goto L_0x01a1
            r18 = r11
            int r11 = r6.length()
            r19 = r12
            int r12 = r8.length()
            if (r11 != r12) goto L_0x0183
            int r11 = r6.length()
            r12 = -1
            int r11 = r11 + r12
            char r11 = r6.charAt(r11)
            r12 = 48
            if (r11 != r12) goto L_0x0183
            goto L_0x01b2
        L_0x0183:
            int r11 = r6.length()
            if (r11 != r15) goto L_0x018b
        L_0x0189:
            r6 = 0
            goto L_0x019d
        L_0x018b:
            r12 = r15
        L_0x018c:
            if (r12 >= r11) goto L_0x019c
            char r20 = r6.charAt(r12)
            boolean r20 = java.lang.Character.isDigit(r20)
            if (r20 != 0) goto L_0x0199
            goto L_0x0189
        L_0x0199:
            int r12 = r12 + 1
            goto L_0x018c
        L_0x019c:
            r6 = 1
        L_0x019d:
            if (r6 == 0) goto L_0x01a5
            r9 = r5
            goto L_0x01a5
        L_0x01a1:
            r18 = r11
            r19 = r12
        L_0x01a5:
            int r5 = r5 + 1
            r6 = r25
            r11 = r18
            r12 = r19
            goto L_0x0146
        L_0x01ae:
            r18 = r11
            r19 = r12
        L_0x01b2:
            if (r9 != r10) goto L_0x01bb
            androidx.databinding.ViewDataBinding r5 = androidx.databinding.c.a(r13, r7)
            r1[r4] = r5
            goto L_0x01da
        L_0x01bb:
            int r9 = r9 - r10
            r5 = 1
            int r9 = r9 + r5
            android.view.View[] r5 = new android.view.View[r9]
            r15 = 0
        L_0x01c1:
            if (r15 >= r9) goto L_0x01ce
            int r6 = r10 + r15
            android.view.View r6 = r0.getChildAt(r6)
            r5[r15] = r6
            int r15 = r15 + 1
            goto L_0x01c1
        L_0x01ce:
            androidx.databinding.DataBinderMapperImpl r6 = androidx.databinding.c.f1029a
            androidx.databinding.ViewDataBinding r5 = r6.c(r5, r7)
            r1[r4] = r5
            int r9 = r9 + -1
            int r9 = r9 + r10
            r10 = r9
        L_0x01da:
            r11 = r18
            r15 = 1
            goto L_0x01e5
        L_0x01de:
            r21 = r5
            r17 = r9
            r19 = r12
            r15 = 0
        L_0x01e5:
            r4 = 0
            if (r15 != 0) goto L_0x01eb
            Z(r13, r1, r2, r3, r4)
        L_0x01eb:
            r5 = 1
            int r10 = r10 + r5
            r8 = r5
            r9 = r17
            r12 = r19
            r6 = -1
            r5 = r21
            goto L_0x00c1
        L_0x01f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.Z(android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$c, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] a0(View view, int i10, c cVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        Z(view, objArr, cVar, sparseIntArray, true);
        return objArr;
    }

    public abstract void T();

    public final void U() {
        if (this.C0) {
            b0();
        } else if (X()) {
            this.C0 = true;
            T();
            this.C0 = false;
        }
    }

    public final void V() {
        ViewDataBinding viewDataBinding = this.G0;
        if (viewDataBinding == null) {
            U();
        } else {
            viewDataBinding.V();
        }
    }

    public abstract boolean X();

    public abstract void Y();

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        if (I0 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        r2.D0.postFrameCallback(r2.E0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r2.F0.post(r2.f993z0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b0() {
        /*
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.G0
            if (r0 == 0) goto L_0x0008
            r0.b0()
            goto L_0x0026
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.A0     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            return
        L_0x000f:
            r0 = 1
            r2.A0 = r0     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            boolean r0 = I0
            if (r0 == 0) goto L_0x001f
            android.view.Choreographer r0 = r2.D0
            androidx.databinding.d r1 = r2.E0
            r0.postFrameCallback(r1)
            goto L_0x0026
        L_0x001f:
            android.os.Handler r0 = r2.F0
            androidx.databinding.ViewDataBinding$b r1 = r2.f993z0
            r0.post(r1)
        L_0x0026:
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.b0():void");
    }

    public abstract boolean c0(int i10, e eVar);
}
