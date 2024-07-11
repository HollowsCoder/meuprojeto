package h5;

import android.net.Uri;
import android.os.Parcelable;

public final class g5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5405o = 1;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f5406p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Parcelable f5407q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f5408r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f5409s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f5410t;

    public g5(h5 h5Var, boolean z, Uri uri, String str, String str2) {
        this.f5410t = h5Var;
        this.f5406p = z;
        this.f5407q = uri;
        this.f5408r = str;
        this.f5409s = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r7.u.m((java.lang.String) null, h5.u2.f5710b0) == false) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8 A[SYNTHETIC, Splitter:B:35:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb A[Catch:{ RuntimeException -> 0x018d }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fd A[SYNTHETIC, Splitter:B:54:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0124 A[Catch:{ RuntimeException -> 0x018d }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0126 A[Catch:{ RuntimeException -> 0x018d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.f5405o
            boolean r2 = r1.f5406p
            r3 = 0
            java.lang.Object r4 = r1.f5408r
            android.os.Parcelable r5 = r1.f5407q
            java.lang.Object r6 = r1.f5410t
            switch(r0) {
                case 0: goto L_0x0013;
                default: goto L_0x0010;
            }
        L_0x0010:
            r0 = r3
            goto L_0x019b
        L_0x0013:
            h5.h5 r6 = (h5.h5) r6
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r1.f5409s
            java.lang.String r0 = (java.lang.String) r0
            h5.i5 r6 = r6.f5436o
            r6.g()
            h5.i4 r7 = r6.f5649o
            h5.e r8 = r7.u     // Catch:{ RuntimeException -> 0x018d }
            h5.s2<java.lang.Boolean> r9 = h5.u2.f5708a0     // Catch:{ RuntimeException -> 0x018d }
            boolean r8 = r8.m(r3, r9)     // Catch:{ RuntimeException -> 0x018d }
            java.lang.String r10 = "Activity created with data 'referrer' without required params"
            java.lang.String r11 = "_cis"
            java.lang.String r12 = "utm_medium"
            java.lang.String r13 = "utm_source"
            java.lang.String r14 = "utm_campaign"
            java.lang.String r15 = "gclid"
            if (r8 != 0) goto L_0x004e
            h5.e r8 = r7.u     // Catch:{ RuntimeException -> 0x018d }
            h5.s2<java.lang.Boolean> r1 = h5.u2.f5712c0     // Catch:{ RuntimeException -> 0x018d }
            boolean r1 = r8.m(r3, r1)     // Catch:{ RuntimeException -> 0x018d }
            if (r1 != 0) goto L_0x004e
            h5.e r1 = r7.u     // Catch:{ RuntimeException -> 0x018d }
            h5.s2<java.lang.Boolean> r8 = h5.u2.f5710b0     // Catch:{ RuntimeException -> 0x018d }
            boolean r1 = r1.m(r3, r8)     // Catch:{ RuntimeException -> 0x018d }
            if (r1 == 0) goto L_0x007e
        L_0x004e:
            h5.g7 r1 = r7.z     // Catch:{ RuntimeException -> 0x018d }
            h5.i4.l(r1)     // Catch:{ RuntimeException -> 0x018d }
            boolean r8 = android.text.TextUtils.isEmpty(r0)     // Catch:{ RuntimeException -> 0x018d }
            if (r8 == 0) goto L_0x005a
            goto L_0x007e
        L_0x005a:
            boolean r8 = r0.contains(r15)     // Catch:{ RuntimeException -> 0x018d }
            if (r8 != 0) goto L_0x0080
            boolean r8 = r0.contains(r14)     // Catch:{ RuntimeException -> 0x018d }
            if (r8 != 0) goto L_0x0080
            boolean r8 = r0.contains(r13)     // Catch:{ RuntimeException -> 0x018d }
            if (r8 != 0) goto L_0x0080
            boolean r8 = r0.contains(r12)     // Catch:{ RuntimeException -> 0x018d }
            if (r8 != 0) goto L_0x0080
            h5.i4 r1 = r1.f5649o     // Catch:{ RuntimeException -> 0x018d }
            h5.g3 r1 = r1.w     // Catch:{ RuntimeException -> 0x018d }
            h5.i4.n(r1)     // Catch:{ RuntimeException -> 0x018d }
            h5.e3 r1 = r1.A     // Catch:{ RuntimeException -> 0x018d }
            r1.a(r10)     // Catch:{ RuntimeException -> 0x018d }
        L_0x007e:
            r1 = r3
            goto L_0x00a2
        L_0x0080:
            java.lang.String r8 = "https://google.com/search?"
            int r16 = r0.length()     // Catch:{ RuntimeException -> 0x018d }
            if (r16 == 0) goto L_0x008d
            java.lang.String r8 = r8.concat(r0)     // Catch:{ RuntimeException -> 0x018d }
            goto L_0x0093
        L_0x008d:
            java.lang.String r3 = new java.lang.String     // Catch:{ RuntimeException -> 0x018d }
            r3.<init>(r8)     // Catch:{ RuntimeException -> 0x018d }
            r8 = r3
        L_0x0093:
            android.net.Uri r3 = android.net.Uri.parse(r8)     // Catch:{ RuntimeException -> 0x018d }
            android.os.Bundle r1 = r1.Z(r3)     // Catch:{ RuntimeException -> 0x018d }
            if (r1 == 0) goto L_0x00a2
            java.lang.String r3 = "referrer"
            r1.putString(r11, r3)     // Catch:{ RuntimeException -> 0x018d }
        L_0x00a2:
            h5.k7 r3 = r6.B
            java.lang.String r8 = "_cmp"
            if (r2 == 0) goto L_0x00eb
            h5.g7 r2 = r7.z     // Catch:{ RuntimeException -> 0x018d }
            h5.i4.l(r2)     // Catch:{ RuntimeException -> 0x018d }
            android.os.Bundle r2 = r2.Z(r5)     // Catch:{ RuntimeException -> 0x018d }
            if (r2 == 0) goto L_0x00ec
            java.lang.String r5 = "intent"
            r2.putString(r11, r5)     // Catch:{ RuntimeException -> 0x018d }
            h5.e r5 = r7.u     // Catch:{ RuntimeException -> 0x018d }
            r11 = 0
            boolean r5 = r5.m(r11, r9)     // Catch:{ RuntimeException -> 0x018d }
            if (r5 == 0) goto L_0x00e4
            boolean r5 = r2.containsKey(r15)     // Catch:{ RuntimeException -> 0x018d }
            if (r5 != 0) goto L_0x00e4
            if (r1 == 0) goto L_0x00e4
            boolean r5 = r1.containsKey(r15)     // Catch:{ RuntimeException -> 0x018d }
            if (r5 == 0) goto L_0x00e4
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ RuntimeException -> 0x018d }
            java.lang.String r9 = r1.getString(r15)     // Catch:{ RuntimeException -> 0x018d }
            r11 = 0
            r5[r11] = r9     // Catch:{ RuntimeException -> 0x018d }
            java.lang.String r9 = "_cer"
            java.lang.String r11 = "gclid=%s"
            java.lang.String r5 = java.lang.String.format(r11, r5)     // Catch:{ RuntimeException -> 0x018d }
            r2.putString(r9, r5)     // Catch:{ RuntimeException -> 0x018d }
        L_0x00e4:
            r6.x(r4, r8, r2)     // Catch:{ RuntimeException -> 0x018d }
            r3.a(r4, r2)     // Catch:{ RuntimeException -> 0x018d }
            goto L_0x00ec
        L_0x00eb:
            r2 = 0
        L_0x00ec:
            h5.e r5 = r7.u     // Catch:{ RuntimeException -> 0x018d }
            h5.g3 r9 = r7.w
            h5.s2<java.lang.Boolean> r11 = h5.u2.f5712c0     // Catch:{ RuntimeException -> 0x018d }
            r17 = r10
            r10 = 0
            boolean r5 = r5.m(r10, r11)     // Catch:{ RuntimeException -> 0x018d }
            h5.e r11 = r7.u
            if (r5 == 0) goto L_0x011e
            h5.s2<java.lang.Boolean> r5 = h5.u2.f5710b0     // Catch:{ RuntimeException -> 0x018d }
            boolean r5 = r11.m(r10, r5)     // Catch:{ RuntimeException -> 0x018d }
            if (r5 != 0) goto L_0x011e
            if (r1 == 0) goto L_0x011e
            boolean r5 = r1.containsKey(r15)     // Catch:{ RuntimeException -> 0x018d }
            if (r5 == 0) goto L_0x011e
            if (r2 == 0) goto L_0x0115
            boolean r2 = r2.containsKey(r15)     // Catch:{ RuntimeException -> 0x018d }
            if (r2 != 0) goto L_0x011e
        L_0x0115:
            java.lang.String r2 = "_lgclid"
            java.lang.String r5 = r1.getString(r15)     // Catch:{ RuntimeException -> 0x018d }
            r6.B(r2, r5)     // Catch:{ RuntimeException -> 0x018d }
        L_0x011e:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ RuntimeException -> 0x018d }
            if (r2 == 0) goto L_0x0126
            goto L_0x019a
        L_0x0126:
            h5.i4.n(r9)     // Catch:{ RuntimeException -> 0x018d }
            h5.e3 r2 = r9.A     // Catch:{ RuntimeException -> 0x018d }
            java.lang.String r5 = "Activity created with referrer"
            r2.b(r0, r5)     // Catch:{ RuntimeException -> 0x018d }
            h5.s2<java.lang.Boolean> r2 = h5.u2.f5710b0     // Catch:{ RuntimeException -> 0x018d }
            r5 = 0
            boolean r2 = r11.m(r5, r2)     // Catch:{ RuntimeException -> 0x018d }
            java.lang.String r5 = "_ldl"
            if (r2 == 0) goto L_0x0153
            if (r1 == 0) goto L_0x0144
            r6.x(r4, r8, r1)     // Catch:{ RuntimeException -> 0x018d }
            r3.a(r4, r1)     // Catch:{ RuntimeException -> 0x018d }
            goto L_0x014e
        L_0x0144:
            h5.i4.n(r9)     // Catch:{ RuntimeException -> 0x018d }
            h5.e3 r1 = r9.A     // Catch:{ RuntimeException -> 0x018d }
            java.lang.String r2 = "Referrer does not contain valid parameters"
            r1.b(r0, r2)     // Catch:{ RuntimeException -> 0x018d }
        L_0x014e:
            r0 = 0
        L_0x014f:
            r6.B(r5, r0)     // Catch:{ RuntimeException -> 0x018d }
            goto L_0x019a
        L_0x0153:
            boolean r1 = r0.contains(r15)     // Catch:{ RuntimeException -> 0x018d }
            if (r1 == 0) goto L_0x0182
            boolean r1 = r0.contains(r14)     // Catch:{ RuntimeException -> 0x018d }
            if (r1 != 0) goto L_0x017b
            boolean r1 = r0.contains(r13)     // Catch:{ RuntimeException -> 0x018d }
            if (r1 != 0) goto L_0x017b
            boolean r1 = r0.contains(r12)     // Catch:{ RuntimeException -> 0x018d }
            if (r1 != 0) goto L_0x017b
            java.lang.String r1 = "utm_term"
            boolean r1 = r0.contains(r1)     // Catch:{ RuntimeException -> 0x018d }
            if (r1 != 0) goto L_0x017b
            java.lang.String r1 = "utm_content"
            boolean r1 = r0.contains(r1)     // Catch:{ RuntimeException -> 0x018d }
            if (r1 == 0) goto L_0x0182
        L_0x017b:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ RuntimeException -> 0x018d }
            if (r1 != 0) goto L_0x019a
            goto L_0x014f
        L_0x0182:
            h5.i4.n(r9)     // Catch:{ RuntimeException -> 0x018d }
            h5.e3 r0 = r9.A     // Catch:{ RuntimeException -> 0x018d }
            r1 = r17
            r0.a(r1)     // Catch:{ RuntimeException -> 0x018d }
            goto L_0x019a
        L_0x018d:
            r0 = move-exception
            h5.g3 r1 = r7.w
            h5.i4.n(r1)
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            h5.e3 r1 = r1.f5397t
            r1.b(r0, r2)
        L_0x019a:
            return
        L_0x019b:
            h5.f6 r6 = (h5.f6) r6
            h5.x2 r1 = r6.f5383r
            if (r1 != 0) goto L_0x01b0
            h5.i4 r0 = r6.f5649o
            h5.g3 r0 = r0.w
            h5.i4.n(r0)
            java.lang.String r1 = "Discarding data. Failed to send conditional user property to service"
            h5.e3 r0 = r0.f5397t
            r0.a(r1)
            goto L_0x01c2
        L_0x01b0:
            h5.i7 r5 = (h5.i7) r5
            n4.m.h(r5)
            if (r2 == 0) goto L_0x01b9
            r3 = r0
            goto L_0x01bc
        L_0x01b9:
            r3 = r4
            h5.b r3 = (h5.b) r3
        L_0x01bc:
            r6.u(r1, r3, r5)
            r6.p()
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.g5.run():void");
    }

    public g5(f6 f6Var, i7 i7Var, boolean z, b bVar, b bVar2) {
        this.f5410t = f6Var;
        this.f5407q = i7Var;
        this.f5406p = z;
        this.f5408r = bVar;
        this.f5409s = bVar2;
    }
}
