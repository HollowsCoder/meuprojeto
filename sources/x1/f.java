package x1;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import com.karumi.dexter.R;
import d2.p;
import d2.q;
import v1.e;
import y1.a;

public final class f extends e implements a.C0163a {

    /* renamed from: k1  reason: collision with root package name */
    public static final ViewDataBinding.c f9435k1;

    /* renamed from: l1  reason: collision with root package name */
    public static final SparseIntArray f9436l1;

    /* renamed from: c1  reason: collision with root package name */
    public final a f9437c1;

    /* renamed from: d1  reason: collision with root package name */
    public final a f9438d1;

    /* renamed from: e1  reason: collision with root package name */
    public final a f9439e1;
    public final a f1;

    /* renamed from: g1  reason: collision with root package name */
    public final a f9440g1;

    /* renamed from: h1  reason: collision with root package name */
    public final a f9441h1;

    /* renamed from: i1  reason: collision with root package name */
    public final a f9442i1;

    /* renamed from: j1  reason: collision with root package name */
    public long f9443j1 = -1;

    static {
        ViewDataBinding.c cVar = new ViewDataBinding.c();
        f9435k1 = cVar;
        int[] iArr = {R.layout.include_menu_main};
        cVar.f995a[7] = new String[]{"include_menu_main"};
        cVar.f996b[7] = new int[]{8};
        cVar.f997c[7] = iArr;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9436l1 = sparseIntArray;
        sparseIntArray.put(R.id.guideline2, 9);
        sparseIntArray.put(R.id.guideline4, 10);
        sparseIntArray.put(R.id.textView2, 11);
        sparseIntArray.put(R.id.textView3, 12);
        sparseIntArray.put(R.id.constraintLayout, 13);
        sparseIntArray.put(R.id.similarityViewCV, 14);
        sparseIntArray.put(R.id.similarityScoreTV, 15);
        sparseIntArray.put(R.id.similarityTV, 16);
        sparseIntArray.put(R.id.loadingCL, 17);
        sparseIntArray.put(R.id.guideline3, 18);
        sparseIntArray.put(R.id.guideline8, 19);
        sparseIntArray.put(R.id.lottieAnimationView, 20);
        sparseIntArray.put(R.id.lottieAnimationView2, 21);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(android.view.View r20) {
        /*
            r19 = this;
            r15 = r19
            r14 = r20
            r0 = r19
            r1 = r20
            androidx.databinding.ViewDataBinding$c r2 = f9435k1
            android.util.SparseIntArray r3 = f9436l1
            r4 = 22
            java.lang.Object[] r17 = androidx.databinding.ViewDataBinding.a0(r14, r4, r2, r3)
            r13 = 3
            r2 = r17[r13]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 13
            r3 = r17[r3]
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r12 = 1
            r3 = r17[r12]
            de.hdodenhof.circleimageview.CircleImageView r3 = (de.hdodenhof.circleimageview.CircleImageView) r3
            r4 = 9
            r4 = r17[r4]
            androidx.constraintlayout.widget.Guideline r4 = (androidx.constraintlayout.widget.Guideline) r4
            r4 = 18
            r4 = r17[r4]
            androidx.constraintlayout.widget.Guideline r4 = (androidx.constraintlayout.widget.Guideline) r4
            r4 = 10
            r4 = r17[r4]
            androidx.constraintlayout.widget.Guideline r4 = (androidx.constraintlayout.widget.Guideline) r4
            r4 = 19
            r4 = r17[r4]
            androidx.constraintlayout.widget.Guideline r4 = (androidx.constraintlayout.widget.Guideline) r4
            r11 = 5
            r4 = r17[r11]
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r10 = 6
            r5 = r17[r10]
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r6 = 8
            r6 = r17[r6]
            x1.m r6 = (x1.m) r6
            r7 = 17
            r7 = r17[r7]
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r8 = 20
            r8 = r17[r8]
            com.airbnb.lottie.LottieAnimationView r8 = (com.airbnb.lottie.LottieAnimationView) r8
            r9 = 21
            r9 = r17[r9]
            com.airbnb.lottie.LottieAnimationView r9 = (com.airbnb.lottie.LottieAnimationView) r9
            r9 = 0
            r9 = r17[r9]
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r18 = r0
            r0 = 2
            r16 = r17[r0]
            de.hdodenhof.circleimageview.CircleImageView r16 = (de.hdodenhof.circleimageview.CircleImageView) r16
            r10 = r16
            r0 = 7
            r16 = r17[r0]
            androidx.constraintlayout.widget.ConstraintLayout r16 = (androidx.constraintlayout.widget.ConstraintLayout) r16
            r11 = r16
            r16 = 15
            r16 = r17[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r12 = r16
            r16 = 16
            r16 = r17[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r13 = r16
            r16 = 14
            r16 = r17[r16]
            androidx.cardview.widget.CardView r16 = (androidx.cardview.widget.CardView) r16
            r14 = r16
            r16 = 11
            r16 = r17[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r15 = r16
            r16 = 12
            r16 = r17[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 4
            r17 = r17[r0]
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = -1
            r2 = r19
            r2.f9443j1 = r0
            android.widget.TextView r0 = r2.L0
            r1 = 0
            r0.setTag(r1)
            de.hdodenhof.circleimageview.CircleImageView r0 = r2.M0
            java.lang.String r3 = "first"
            r0.setTag(r3)
            android.widget.ImageView r0 = r2.N0
            r0.setTag(r1)
            android.widget.ImageView r0 = r2.O0
            r0.setTag(r1)
            x1.m r0 = r2.P0
            if (r0 == 0) goto L_0x00c4
            r0.G0 = r2
        L_0x00c4:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.S0
            r0.setTag(r1)
            de.hdodenhof.circleimageview.CircleImageView r0 = r2.T0
            java.lang.String r3 = "second"
            r0.setTag(r3)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.U0
            r0.setTag(r1)
            android.widget.TextView r0 = r2.f9433a1
            r0.setTag(r1)
            r0 = 2131361963(0x7f0a00ab, float:1.8343693E38)
            r1 = r20
            r1.setTag(r0, r2)
            y1.a r0 = new y1.a
            r1 = 6
            r0.<init>(r2, r1)
            r2.f9437c1 = r0
            y1.a r0 = new y1.a
            r1 = 4
            r0.<init>(r2, r1)
            r2.f9438d1 = r0
            y1.a r0 = new y1.a
            r1 = 2
            r0.<init>(r2, r1)
            r2.f9439e1 = r0
            y1.a r0 = new y1.a
            r1 = 7
            r0.<init>(r2, r1)
            r2.f1 = r0
            y1.a r0 = new y1.a
            r1 = 5
            r0.<init>(r2, r1)
            r2.f9440g1 = r0
            y1.a r0 = new y1.a
            r1 = 3
            r0.<init>(r2, r1)
            r2.f9441h1 = r0
            y1.a r0 = new y1.a
            r1 = 1
            r0.<init>(r2, r1)
            r2.f9442i1 = r0
            r19.Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.f.<init>(android.view.View):void");
    }

    public final void T() {
        long j8;
        synchronized (this) {
            j8 = this.f9443j1;
            this.f9443j1 = 0;
        }
        if ((j8 & 4) != 0) {
            this.L0.setOnClickListener(this.f9441h1);
            this.M0.setOnClickListener(this.f9442i1);
            this.N0.setOnClickListener(this.f9440g1);
            this.O0.setOnClickListener(this.f9437c1);
            this.T0.setOnClickListener(this.f9439e1);
            this.U0.setOnClickListener(this.f1);
            this.f9433a1.setOnClickListener(this.f9438d1);
        }
        this.P0.U();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4.P0.X() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean X() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.f9443j1     // Catch:{ all -> 0x0018 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            x1.m r0 = r4.P0
            boolean r0 = r0.X()
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            r0 = 0
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.f.X():boolean");
    }

    public final void Y() {
        synchronized (this) {
            this.f9443j1 = 4;
        }
        this.P0.Y();
        b0();
    }

    public final boolean c0(int i10, e eVar) {
        if (3 != i10) {
            return false;
        }
        this.f9434b1 = (p) eVar;
        synchronized (this) {
            this.f9443j1 |= 2;
        }
        synchronized (this) {
        }
        b0();
        return true;
    }

    public final void e(int i10) {
        q qVar;
        q qVar2;
        q qVar3;
        p pVar;
        q qVar4;
        q qVar5;
        boolean z = true;
        boolean z10 = false;
        switch (i10) {
            case 1:
                p pVar2 = this.f9434b1;
                if (pVar2 != null) {
                    z10 = true;
                }
                if (z10 && (qVar = (q) pVar2.c()) != null) {
                    qVar.g(true);
                    return;
                }
                return;
            case 2:
                p pVar3 = this.f9434b1;
                if (pVar3 == null) {
                    z = false;
                }
                if (z && (qVar2 = (q) pVar3.c()) != null) {
                    qVar2.g(false);
                    return;
                }
                return;
            case 3:
                p pVar4 = this.f9434b1;
                if (pVar4 == null) {
                    z = false;
                }
                if (z && (qVar3 = (q) pVar4.c()) != null) {
                    qVar3.q();
                    return;
                }
                return;
            case 4:
                pVar = this.f9434b1;
                if (pVar == null) {
                    z = false;
                }
                if (!z) {
                    return;
                }
                break;
            case 5:
                pVar = this.f9434b1;
                if (pVar == null) {
                    z = false;
                }
                if (!z) {
                    return;
                }
                break;
            case 6:
                p pVar5 = this.f9434b1;
                if (pVar5 == null) {
                    z = false;
                }
                if (z && (qVar4 = (q) pVar5.c()) != null) {
                    qVar4.m();
                    return;
                }
                return;
            case 7:
                p pVar6 = this.f9434b1;
                if (pVar6 == null) {
                    z = false;
                }
                if (z && (qVar5 = (q) pVar6.c()) != null) {
                    qVar5.f();
                    return;
                }
                return;
            default:
                return;
        }
        pVar.d();
    }
}
