package h5;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.m;
import androidx.databinding.a;
import com.google.android.gms.internal.measurement.ha;
import i4.o;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l4.w;
import r4.d;

public final class i5 extends s3 {
    public int A = 100;
    public final k7 B;
    public boolean C = true;
    public final j6 D = new j6((q4) this);

    /* renamed from: q  reason: collision with root package name */
    public h5 f5461q;

    /* renamed from: r  reason: collision with root package name */
    public m f5462r;

    /* renamed from: s  reason: collision with root package name */
    public final CopyOnWriteArraySet f5463s = new CopyOnWriteArraySet();

    /* renamed from: t  reason: collision with root package name */
    public boolean f5464t;
    public final AtomicReference<String> u = new AtomicReference<>();

    /* renamed from: v  reason: collision with root package name */
    public final Object f5465v = new Object();
    public f w = new f((Boolean) null, (Boolean) null);

    /* renamed from: x  reason: collision with root package name */
    public int f5466x = 100;

    /* renamed from: y  reason: collision with root package name */
    public final AtomicLong f5467y = new AtomicLong(0);
    public long z = -1;

    public i5(i4 i4Var) {
        super(i4Var);
        this.B = new k7(i4Var);
    }

    public static void q(i5 i5Var, f fVar, int i10, long j8, boolean z10, boolean z11) {
        e3 e3Var;
        String str;
        Object obj;
        boolean z12;
        i5Var.g();
        i5Var.h();
        int i11 = (j8 > i5Var.z ? 1 : (j8 == i5Var.z ? 0 : -1));
        i4 i4Var = i5Var.f5649o;
        if (i11 <= 0) {
            if (i5Var.A <= i10) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                str = "Dropped out-of-date consent setting, proposed settings";
                e3Var = g3Var.z;
                obj = fVar;
                e3Var.b(obj, str);
            }
        }
        u3 u3Var = i4Var.f5458v;
        i4.l(u3Var);
        u3Var.g();
        if (u3Var.o(i10)) {
            SharedPreferences.Editor edit = u3Var.l().edit();
            edit.putString("consent_settings", fVar.c());
            edit.putInt("consent_source", i10);
            edit.apply();
            i5Var.z = j8;
            i5Var.A = i10;
            f6 r5 = i4Var.r();
            r5.g();
            r5.h();
            if (z10) {
                i4 i4Var2 = r5.f5649o;
                i4Var2.getClass();
                i4Var2.q().k();
            }
            if (r5.n()) {
                r5.q(new w(3, r5, r5.s(false)));
            }
            if (z11) {
                i4Var.r().w(new AtomicReference());
                return;
            }
            return;
        }
        g3 g3Var2 = i4Var.w;
        i4.n(g3Var2);
        Object valueOf = Integer.valueOf(i10);
        e3Var = g3Var2.z;
        str = "Lower precedence consent source ignored, proposed source";
        obj = valueOf;
        e3Var.b(obj, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (r3 > 100) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b0, code lost:
        if (r5 > 100) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0106, code lost:
        r1 = r13.f5649o.w;
        h5.i4.n(r1);
        r1 = r1.B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010f, code lost:
        if (r0 != null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0111, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0114, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0115, code lost:
        if (r2 != null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0117, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011a, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011b, code lost:
        r1.c(r3, r4, "Logging screen view with name, class");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0122, code lost:
        if (r13.f5767q != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0124, code lost:
        r1 = r13.f5768r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0127, code lost:
        r1 = r13.f5767q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0129, code lost:
        r4 = r13.f5649o.z;
        h5.i4.l(r4);
        r15 = new h5.p5(r0, r2, r4.W(), true, r29);
        r13.f5767q = r15;
        r13.f5768r = r1;
        r13.w = r15;
        r13.f5649o.B.getClass();
        r17 = android.os.SystemClock.elapsedRealtime();
        r0 = r13.f5649o.f5459x;
        h5.i4.n(r0);
        r0.n(new h5.o4(r13, r14, r15, r1, r17, 2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(java.lang.String r24, java.lang.String r25, android.os.Bundle r26, boolean r27, boolean r28, long r29) {
        /*
            r23 = this;
            r11 = r23
            if (r24 != 0) goto L_0x0008
            java.lang.String r0 = "app"
            r3 = r0
            goto L_0x000a
        L_0x0008:
            r3 = r24
        L_0x000a:
            if (r26 != 0) goto L_0x0013
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r14 = r0
            goto L_0x0015
        L_0x0013:
            r14 = r26
        L_0x0015:
            h5.i4 r0 = r11.f5649o
            h5.e r0 = r0.u
            h5.s2<java.lang.Boolean> r1 = h5.u2.f5738q0
            r2 = 0
            boolean r0 = r0.m(r2, r1)
            r4 = 0
            if (r0 == 0) goto L_0x016b
            java.lang.String r0 = "screen_view"
            r5 = r25
            boolean r0 = h5.g7.B(r5, r0)
            if (r0 != 0) goto L_0x002f
            goto L_0x016d
        L_0x002f:
            h5.i4 r0 = r11.f5649o
            h5.u5 r13 = r0.C
            h5.i4.m(r13)
            h5.i4 r0 = r13.f5649o
            h5.e r0 = r0.u
            boolean r0 = r0.m(r2, r1)
            if (r0 != 0) goto L_0x0050
            h5.i4 r0 = r13.f5649o
            h5.g3 r0 = r0.w
            h5.i4.n(r0)
            h5.e3 r0 = r0.f5400y
            java.lang.String r1 = "Manual screen reporting is disabled."
            r0.a(r1)
            goto L_0x0167
        L_0x0050:
            java.lang.Object r1 = r13.z
            monitor-enter(r1)
            boolean r0 = r13.f5773y     // Catch:{ all -> 0x0168 }
            if (r0 != 0) goto L_0x0067
            h5.i4 r0 = r13.f5649o     // Catch:{ all -> 0x0168 }
            h5.g3 r0 = r0.w     // Catch:{ all -> 0x0168 }
            h5.i4.n(r0)     // Catch:{ all -> 0x0168 }
            h5.e3 r0 = r0.f5400y     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = "Cannot log screen view event when the app is in the background."
        L_0x0062:
            r0.a(r2)     // Catch:{ all -> 0x0168 }
            goto L_0x0103
        L_0x0067:
            java.lang.String r0 = "screen_name"
            java.lang.String r0 = r14.getString(r0)     // Catch:{ all -> 0x0168 }
            r2 = 100
            if (r0 == 0) goto L_0x0099
            int r3 = r0.length()     // Catch:{ all -> 0x0168 }
            if (r3 <= 0) goto L_0x0082
            int r3 = r0.length()     // Catch:{ all -> 0x0168 }
            h5.i4 r5 = r13.f5649o     // Catch:{ all -> 0x0168 }
            r5.getClass()     // Catch:{ all -> 0x0168 }
            if (r3 <= r2) goto L_0x0099
        L_0x0082:
            h5.i4 r2 = r13.f5649o     // Catch:{ all -> 0x0168 }
            h5.g3 r2 = r2.w     // Catch:{ all -> 0x0168 }
            h5.i4.n(r2)     // Catch:{ all -> 0x0168 }
            h5.e3 r2 = r2.f5400y     // Catch:{ all -> 0x0168 }
            java.lang.String r3 = "Invalid screen name length for screen view. Length"
            int r0 = r0.length()     // Catch:{ all -> 0x0168 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0168 }
            r2.b(r0, r3)     // Catch:{ all -> 0x0168 }
            goto L_0x0103
        L_0x0099:
            java.lang.String r3 = "screen_class"
            java.lang.String r3 = r14.getString(r3)     // Catch:{ all -> 0x0168 }
            if (r3 == 0) goto L_0x00c9
            int r5 = r3.length()     // Catch:{ all -> 0x0168 }
            if (r5 <= 0) goto L_0x00b2
            int r5 = r3.length()     // Catch:{ all -> 0x0168 }
            h5.i4 r6 = r13.f5649o     // Catch:{ all -> 0x0168 }
            r6.getClass()     // Catch:{ all -> 0x0168 }
            if (r5 <= r2) goto L_0x00c9
        L_0x00b2:
            h5.i4 r0 = r13.f5649o     // Catch:{ all -> 0x0168 }
            h5.g3 r0 = r0.w     // Catch:{ all -> 0x0168 }
            h5.i4.n(r0)     // Catch:{ all -> 0x0168 }
            h5.e3 r0 = r0.f5400y     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = "Invalid screen class length for screen view. Length"
            int r3 = r3.length()     // Catch:{ all -> 0x0168 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0168 }
            r0.b(r3, r2)     // Catch:{ all -> 0x0168 }
            goto L_0x0103
        L_0x00c9:
            if (r3 != 0) goto L_0x00db
            android.app.Activity r2 = r13.u     // Catch:{ all -> 0x0168 }
            if (r2 == 0) goto L_0x00d8
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = r13.p(r2)     // Catch:{ all -> 0x0168 }
            goto L_0x00dc
        L_0x00d8:
            java.lang.String r2 = "Activity"
            goto L_0x00dc
        L_0x00db:
            r2 = r3
        L_0x00dc:
            h5.p5 r3 = r13.f5767q     // Catch:{ all -> 0x0168 }
            boolean r5 = r13.f5771v     // Catch:{ all -> 0x0168 }
            if (r5 == 0) goto L_0x0105
            if (r3 == 0) goto L_0x0105
            r13.f5771v = r4     // Catch:{ all -> 0x0168 }
            java.lang.String r4 = r3.f5635b     // Catch:{ all -> 0x0168 }
            boolean r4 = h5.g7.B(r4, r2)     // Catch:{ all -> 0x0168 }
            java.lang.String r3 = r3.f5634a     // Catch:{ all -> 0x0168 }
            boolean r3 = h5.g7.B(r3, r0)     // Catch:{ all -> 0x0168 }
            if (r4 == 0) goto L_0x0105
            if (r3 == 0) goto L_0x0105
            h5.i4 r0 = r13.f5649o     // Catch:{ all -> 0x0168 }
            h5.g3 r0 = r0.w     // Catch:{ all -> 0x0168 }
            h5.i4.n(r0)     // Catch:{ all -> 0x0168 }
            h5.e3 r0 = r0.f5400y     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = "Ignoring call to log screen view event with duplicate parameters."
            goto L_0x0062
        L_0x0103:
            monitor-exit(r1)     // Catch:{ all -> 0x0168 }
            goto L_0x0167
        L_0x0105:
            monitor-exit(r1)     // Catch:{ all -> 0x0168 }
            h5.i4 r1 = r13.f5649o
            h5.g3 r1 = r1.w
            h5.i4.n(r1)
            h5.e3 r1 = r1.B
            if (r0 != 0) goto L_0x0114
            java.lang.String r3 = "null"
            goto L_0x0115
        L_0x0114:
            r3 = r0
        L_0x0115:
            if (r2 != 0) goto L_0x011a
            java.lang.String r4 = "null"
            goto L_0x011b
        L_0x011a:
            r4 = r2
        L_0x011b:
            java.lang.String r5 = "Logging screen view with name, class"
            r1.c(r3, r4, r5)
            h5.p5 r1 = r13.f5767q
            if (r1 != 0) goto L_0x0127
            h5.p5 r1 = r13.f5768r
            goto L_0x0129
        L_0x0127:
            h5.p5 r1 = r13.f5767q
        L_0x0129:
            h5.p5 r3 = new h5.p5
            h5.i4 r4 = r13.f5649o
            h5.g7 r4 = r4.z
            h5.i4.l(r4)
            long r18 = r4.W()
            r20 = 1
            r15 = r3
            r16 = r0
            r17 = r2
            r21 = r29
            r15.<init>(r16, r17, r18, r20, r21)
            r13.f5767q = r3
            r13.f5768r = r1
            r13.w = r3
            h5.i4 r0 = r13.f5649o
            r4.d r0 = r0.B
            r0.getClass()
            long r17 = android.os.SystemClock.elapsedRealtime()
            h5.i4 r0 = r13.f5649o
            h5.h4 r0 = r0.f5459x
            h5.i4.n(r0)
            h5.o4 r2 = new h5.o4
            r19 = 2
            r12 = r2
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r19)
            r0.n(r2)
        L_0x0167:
            return
        L_0x0168:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0168 }
            throw r0
        L_0x016b:
            r5 = r25
        L_0x016d:
            r0 = 1
            if (r28 == 0) goto L_0x017d
            androidx.appcompat.widget.m r1 = r11.f5462r
            if (r1 == 0) goto L_0x017d
            boolean r1 = h5.g7.A(r25)
            if (r1 == 0) goto L_0x017b
            goto L_0x017d
        L_0x017b:
            r9 = r4
            goto L_0x017e
        L_0x017d:
            r9 = r0
        L_0x017e:
            r10 = r27 ^ 1
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r14)
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x018d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01ea
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            boolean r6 = r2 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x01ac
            android.os.Bundle r6 = new android.os.Bundle
            android.os.Bundle r2 = (android.os.Bundle) r2
            r6.<init>(r2)
            r7.putBundle(r1, r6)
            goto L_0x018d
        L_0x01ac:
            boolean r1 = r2 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x01c8
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1 = r4
        L_0x01b3:
            int r6 = r2.length
            if (r1 >= r6) goto L_0x018d
            r6 = r2[r1]
            boolean r8 = r6 instanceof android.os.Bundle
            if (r8 == 0) goto L_0x01c5
            android.os.Bundle r8 = new android.os.Bundle
            android.os.Bundle r6 = (android.os.Bundle) r6
            r8.<init>(r6)
            r2[r1] = r8
        L_0x01c5:
            int r1 = r1 + 1
            goto L_0x01b3
        L_0x01c8:
            boolean r1 = r2 instanceof java.util.List
            if (r1 == 0) goto L_0x018d
            java.util.List r2 = (java.util.List) r2
            r1 = r4
        L_0x01cf:
            int r6 = r2.size()
            if (r1 >= r6) goto L_0x018d
            java.lang.Object r6 = r2.get(r1)
            boolean r8 = r6 instanceof android.os.Bundle
            if (r8 == 0) goto L_0x01e7
            android.os.Bundle r8 = new android.os.Bundle
            android.os.Bundle r6 = (android.os.Bundle) r6
            r8.<init>(r6)
            r2.set(r1, r8)
        L_0x01e7:
            int r1 = r1 + 1
            goto L_0x01cf
        L_0x01ea:
            h5.i4 r0 = r11.f5649o
            h5.h4 r0 = r0.f5459x
            h5.i4.n(r0)
            h5.z4 r12 = new h5.z4
            r1 = r12
            r2 = r23
            r4 = r25
            r5 = r29
            r8 = r28
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10)
            r0.n(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i5.A(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void B(String str, String str2) {
        this.f5649o.B.getClass();
        C("auto", str, str2, true, System.currentTimeMillis());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(java.lang.String r22, java.lang.String r23, java.lang.Object r24, boolean r25, long r26) {
        /*
            r21 = this;
            r8 = r21
            r3 = r23
            r0 = r24
            if (r22 != 0) goto L_0x000c
            java.lang.String r1 = "app"
            r2 = r1
            goto L_0x000e
        L_0x000c:
            r2 = r22
        L_0x000e:
            h5.i4 r1 = r8.f5649o
            r4 = 0
            r5 = 24
            r6 = 0
            if (r25 == 0) goto L_0x0020
            h5.g7 r7 = r1.z
            h5.i4.l(r7)
            int r7 = r7.f0(r3)
            goto L_0x0045
        L_0x0020:
            h5.g7 r7 = r1.z
            h5.i4.l(r7)
            java.lang.String r9 = "user property"
            boolean r10 = r7.a0(r9, r3)
            if (r10 != 0) goto L_0x002e
            goto L_0x0044
        L_0x002e:
            java.lang.String[] r10 = s6.a.N
            boolean r10 = r7.c0(r9, r10, r6, r3)
            if (r10 != 0) goto L_0x0039
            r7 = 15
            goto L_0x0045
        L_0x0039:
            h5.i4 r10 = r7.f5649o
            r10.getClass()
            boolean r7 = r7.d0(r9, r5, r3)
            if (r7 != 0) goto L_0x0047
        L_0x0044:
            r7 = 6
        L_0x0045:
            r12 = r7
            goto L_0x0048
        L_0x0047:
            r12 = r4
        L_0x0048:
            h5.j6 r14 = r8.D
            r7 = 1
            if (r12 == 0) goto L_0x0076
            h5.g7 r0 = r1.z
            h5.i4.l(r0)
            r0.getClass()
            java.lang.String r0 = h5.g7.m(r3, r5, r7)
            if (r3 == 0) goto L_0x005f
            int r4 = r23.length()
        L_0x005f:
            r15 = r4
            h5.g7 r9 = r1.z
            h5.i4.l(r9)
            r11 = 0
            java.lang.String r13 = "_ev"
            h5.e r1 = r1.u
            h5.s2<java.lang.Boolean> r2 = h5.u2.f5744u0
            boolean r16 = r1.m(r6, r2)
            r10 = r14
            r14 = r0
            r9.w(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0076:
            if (r0 == 0) goto L_0x00d4
            h5.g7 r9 = r1.z
            h5.i4.l(r9)
            int r16 = r9.t(r0, r3)
            h5.g7 r9 = r1.z
            if (r16 == 0) goto L_0x00b5
            h5.i4.l(r9)
            r9.getClass()
            java.lang.String r18 = h5.g7.m(r3, r5, r7)
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L_0x0097
            boolean r2 = r0 instanceof java.lang.CharSequence
            if (r2 == 0) goto L_0x009f
        L_0x0097:
            java.lang.String r0 = java.lang.String.valueOf(r24)
            int r4 = r0.length()
        L_0x009f:
            r19 = r4
            h5.g7 r13 = r1.z
            h5.i4.l(r13)
            r15 = 0
            java.lang.String r17 = "_ev"
            h5.e r0 = r1.u
            h5.s2<java.lang.Boolean> r1 = h5.u2.f5744u0
            boolean r20 = r0.m(r6, r1)
            r13.w(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x00b5:
            h5.i4.l(r9)
            java.lang.Object r4 = r9.u(r0, r3)
            if (r4 == 0) goto L_0x00d3
            h5.h4 r9 = r1.f5459x
            h5.i4.n(r9)
            h5.o4 r10 = new h5.o4
            r7 = 1
            r0 = r10
            r1 = r21
            r3 = r23
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r9.n(r10)
        L_0x00d3:
            return
        L_0x00d4:
            r4 = 0
            h5.h4 r9 = r1.f5459x
            h5.i4.n(r9)
            h5.o4 r10 = new h5.o4
            r7 = 1
            r0 = r10
            r1 = r21
            r3 = r23
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r9.n(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i5.C(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final boolean j() {
        return false;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(long r10, java.lang.Object r12, java.lang.String r13, java.lang.String r14) {
        /*
            r9 = this;
            n4.m.e(r13)
            n4.m.e(r14)
            r9.g()
            r9.h()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r14)
            r1 = 1
            h5.i4 r2 = r9.f5649o
            if (r0 == 0) goto L_0x0061
            boolean r0 = r12 instanceof java.lang.String
            if (r0 == 0) goto L_0x0051
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0051
            java.util.Locale r12 = java.util.Locale.ENGLISH
            java.lang.String r12 = r0.toLowerCase(r12)
            java.lang.String r14 = "false"
            boolean r12 = r14.equals(r12)
            r3 = 1
            if (r1 == r12) goto L_0x0037
            r5 = 0
            goto L_0x0038
        L_0x0037:
            r5 = r3
        L_0x0038:
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            h5.u3 r0 = r2.f5458v
            h5.i4.l(r0)
            long r5 = r12.longValue()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x004b
            java.lang.String r14 = "true"
        L_0x004b:
            h5.t3 r0 = r0.A
            r0.b(r14)
            goto L_0x005f
        L_0x0051:
            if (r12 != 0) goto L_0x0061
            h5.u3 r14 = r2.f5458v
            h5.i4.l(r14)
            h5.t3 r14 = r14.A
            java.lang.String r0 = "unset"
            r14.b(r0)
        L_0x005f:
            java.lang.String r14 = "_npa"
        L_0x0061:
            r6 = r12
            r7 = r14
            boolean r12 = r2.i()
            if (r12 != 0) goto L_0x0076
            h5.g3 r10 = r2.w
            h5.i4.n(r10)
            java.lang.String r11 = "User property not set since app measurement is disabled"
            h5.e3 r10 = r10.B
            r10.a(r11)
            return
        L_0x0076:
            boolean r12 = r2.k()
            if (r12 != 0) goto L_0x007d
            return
        L_0x007d:
            h5.c7 r12 = new h5.c7
            r3 = r12
            r4 = r10
            r8 = r13
            r3.<init>(r4, r6, r7, r8)
            h5.f6 r10 = r2.r()
            r10.g()
            r10.h()
            h5.i4 r11 = r10.f5649o
            r11.getClass()
            h5.a3 r11 = r11.q()
            r11.getClass()
            android.os.Parcel r13 = android.os.Parcel.obtain()
            h5.d7.a(r12, r13)
            byte[] r14 = r13.marshall()
            r13.recycle()
            int r13 = r14.length
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r13 <= r0) goto L_0x00be
            h5.i4 r11 = r11.f5649o
            h5.g3 r11 = r11.w
            h5.i4.n(r11)
            java.lang.String r13 = "User property too long for local database. Sending directly to service"
            h5.e3 r11 = r11.u
            r11.a(r13)
            r11 = 0
            goto L_0x00c2
        L_0x00be:
            boolean r11 = r11.n(r1, r14)
        L_0x00c2:
            h5.i7 r13 = r10.s(r1)
            h5.w5 r14 = new h5.w5
            r14.<init>(r10, r13, r11, r12)
            r10.q(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i5.k(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void l(boolean z10, long j8) {
        g();
        h();
        i4 i4Var = this.f5649o;
        g3 g3Var = i4Var.w;
        i4.n(g3Var);
        g3Var.A.a("Resetting analytics data (FE)");
        q6 q6Var = i4Var.f5460y;
        i4.m(q6Var);
        q6Var.g();
        o6 o6Var = q6Var.f5657s;
        o6Var.f5615c.c();
        o6Var.f5613a = 0;
        o6Var.f5614b = 0;
        boolean i10 = i4Var.i();
        u3 u3Var = i4Var.f5458v;
        i4.l(u3Var);
        u3Var.f5753s.b(j8);
        i4 i4Var2 = u3Var.f5649o;
        u3 u3Var2 = i4Var2.f5458v;
        i4.l(u3Var2);
        if (!TextUtils.isEmpty(u3Var2.H.a())) {
            u3Var.H.b((String) null);
        }
        ha haVar = ha.f2735p;
        haVar.f2736o.zza().zza();
        s2<Boolean> s2Var = u2.f5730m0;
        e eVar = i4Var2.u;
        if (eVar.m((String) null, s2Var)) {
            u3Var.C.b(0);
        }
        if (!eVar.p()) {
            u3Var.q(!i10);
        }
        u3Var.I.b((String) null);
        u3Var.J.b(0);
        u3Var.K.b((Bundle) null);
        if (z10) {
            f6 r5 = i4Var.r();
            r5.g();
            r5.h();
            i7 s10 = r5.s(false);
            i4 i4Var3 = r5.f5649o;
            i4Var3.getClass();
            i4Var3.q().k();
            r5.q(new x5(r5, s10, 0));
        }
        haVar.f2736o.zza().zza();
        if (i4Var.u.m((String) null, s2Var)) {
            i4.m(q6Var);
            q6Var.f5656r.a();
        }
        this.C = !i10;
    }

    public final void m() {
        g();
        h();
        i4 i4Var = this.f5649o;
        if (i4Var.k()) {
            s2<Boolean> s2Var = u2.Z;
            e eVar = i4Var.u;
            if (eVar.m((String) null, s2Var)) {
                eVar.f5649o.getClass();
                Boolean o10 = eVar.o("google_analytics_deferred_deep_link_enabled");
                if (o10 != null && o10.booleanValue()) {
                    g3 g3Var = i4Var.w;
                    i4.n(g3Var);
                    g3Var.A.a("Deferred Deep Link feature enabled.");
                    h4 h4Var = i4Var.f5459x;
                    i4.n(h4Var);
                    h4Var.n(new w4(this, 0));
                }
            }
            f6 r5 = i4Var.r();
            r5.g();
            r5.h();
            i7 s10 = r5.s(true);
            r5.f5649o.q().n(3, new byte[0]);
            r5.q(new x5(r5, s10, 1));
            this.C = false;
            u3 u3Var = i4Var.f5458v;
            i4.l(u3Var);
            u3Var.g();
            String string = u3Var.l().getString("previous_os_version", (String) null);
            u3Var.f5649o.s().i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = u3Var.l().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                i4Var.s().i();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    x("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void n(Bundle bundle, long j8) {
        n4.m.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean isEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        i4 i4Var = this.f5649o;
        if (!isEmpty) {
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.w.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Class<String> cls = String.class;
        a.F(bundle2, "app_id", cls, (Object) null);
        a.F(bundle2, "origin", cls, (Object) null);
        a.F(bundle2, "name", cls, (Object) null);
        a.F(bundle2, "value", Object.class, (Object) null);
        a.F(bundle2, "trigger_event_name", cls, (Object) null);
        Class<Long> cls2 = Long.class;
        a.F(bundle2, "trigger_timeout", cls2, 0L);
        a.F(bundle2, "timed_out_event_name", cls, (Object) null);
        Class<Bundle> cls3 = Bundle.class;
        a.F(bundle2, "timed_out_event_params", cls3, (Object) null);
        a.F(bundle2, "triggered_event_name", cls, (Object) null);
        a.F(bundle2, "triggered_event_params", cls3, (Object) null);
        a.F(bundle2, "time_to_live", cls2, 0L);
        a.F(bundle2, "expired_event_name", cls, (Object) null);
        a.F(bundle2, "expired_event_params", cls3, (Object) null);
        n4.m.e(bundle2.getString("name"));
        n4.m.e(bundle2.getString("origin"));
        n4.m.h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j8);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        g7 g7Var = i4Var.z;
        i4.l(g7Var);
        int f02 = g7Var.f0(string);
        b3 b3Var = i4Var.A;
        g3 g3Var2 = i4Var.w;
        if (f02 == 0) {
            g7 g7Var2 = i4Var.z;
            i4.l(g7Var2);
            if (g7Var2.t(obj, string) == 0) {
                i4.l(g7Var2);
                Object u10 = g7Var2.u(obj, string);
                if (u10 == null) {
                    i4.n(g3Var2);
                    i4.l(b3Var);
                    g3Var2.f5397t.c(b3Var.n(string), obj, "Unable to normalize conditional user property value");
                    return;
                }
                a.z(bundle2, u10);
                long j10 = bundle2.getLong("trigger_timeout");
                if (TextUtils.isEmpty(bundle2.getString("trigger_event_name")) || (j10 <= 15552000000L && j10 >= 1)) {
                    long j11 = bundle2.getLong("time_to_live");
                    if (j11 > 15552000000L || j11 < 1) {
                        i4.n(g3Var2);
                        i4.l(b3Var);
                        g3Var2.f5397t.c(b3Var.n(string), Long.valueOf(j11), "Invalid conditional user property time to live");
                        return;
                    }
                    h4 h4Var = i4Var.f5459x;
                    i4.n(h4Var);
                    h4Var.n(new v4(this, bundle2, 1));
                    return;
                }
                i4.n(g3Var2);
                i4.l(b3Var);
                g3Var2.f5397t.c(b3Var.n(string), Long.valueOf(j10), "Invalid conditional user property timeout");
                return;
            }
            i4.n(g3Var2);
            i4.l(b3Var);
            g3Var2.f5397t.c(b3Var.n(string), obj, "Invalid conditional user property value");
            return;
        }
        i4.n(g3Var2);
        i4.l(b3Var);
        g3Var2.f5397t.b(b3Var.n(string), "Invalid conditional user property name");
    }

    public final void o(String str, String str2, Bundle bundle) {
        i4 i4Var = this.f5649o;
        i4Var.B.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        n4.m.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        h4 h4Var = i4Var.f5459x;
        i4.n(h4Var);
        h4Var.n(new o((Object) this, (Object) bundle2, 5));
    }

    public final String p() {
        i4 i4Var = this.f5649o;
        String str = i4Var.f5453p;
        if (str != null) {
            return str;
        }
        try {
            return s6.a.X(i4Var.f5452o, i4Var.G);
        } catch (IllegalStateException e10) {
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.f5397t.b(e10, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void r(Boolean bool, boolean z10) {
        g();
        h();
        i4 i4Var = this.f5649o;
        g3 g3Var = i4Var.w;
        i4.n(g3Var);
        g3Var.A.b(bool, "Setting app measurement enabled (FE)");
        u3 u3Var = i4Var.f5458v;
        i4.l(u3Var);
        u3Var.m(bool);
        if (z10) {
            u3 u3Var2 = i4Var.f5458v;
            i4.l(u3Var2);
            u3Var2.g();
            SharedPreferences.Editor edit = u3Var2.l().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        h4 h4Var = i4Var.f5459x;
        i4.n(h4Var);
        h4Var.g();
        if (i4Var.S || (bool != null && !bool.booleanValue())) {
            s();
        }
    }

    public final void s() {
        long j8;
        g();
        i4 i4Var = this.f5649o;
        u3 u3Var = i4Var.f5458v;
        i4.l(u3Var);
        String a10 = u3Var.A.a();
        if (a10 != null) {
            boolean equals = "unset".equals(a10);
            d dVar = i4Var.B;
            if (equals) {
                dVar.getClass();
                k(System.currentTimeMillis(), (Object) null, "app", "_npa");
            } else {
                if (true != "true".equals(a10)) {
                    j8 = 0;
                } else {
                    j8 = 1;
                }
                Long valueOf = Long.valueOf(j8);
                dVar.getClass();
                k(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        boolean i10 = i4Var.i();
        g3 g3Var = i4Var.w;
        if (!i10 || !this.C) {
            i4.n(g3Var);
            g3Var.A.a("Updating Scion state (FE)");
            f6 r5 = i4Var.r();
            r5.g();
            r5.h();
            r5.q(new x5(r5, r5.s(true), 2));
            return;
        }
        i4.n(g3Var);
        g3Var.A.a("Recording app launch after enabling measurement for the first time (FE)");
        m();
        ha.f2735p.f2736o.zza().zza();
        if (i4Var.u.m((String) null, u2.f5730m0)) {
            q6 q6Var = i4Var.f5460y;
            i4.m(q6Var);
            q6Var.f5656r.a();
        }
        h4 h4Var = i4Var.f5459x;
        i4.n(h4Var);
        h4Var.n(new w4(this, 1));
    }

    public final void t() {
        i4 i4Var = this.f5649o;
        if ((i4Var.f5452o.getApplicationContext() instanceof Application) && this.f5461q != null) {
            ((Application) i4Var.f5452o.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f5461q);
        }
    }

    public final void u(Bundle bundle, int i10, long j8) {
        h();
        String string = bundle.getString("ad_storage");
        if ((string == null || f.h(string) != null) && ((string = bundle.getString("analytics_storage")) == null || f.h(string) != null)) {
            string = null;
        }
        if (string != null) {
            i4 i4Var = this.f5649o;
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.f5400y.b(string, "Ignoring invalid consent setting");
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.f5400y.a("Valid consent values are 'granted', 'denied'");
        }
        v(f.a(bundle), i10, j8);
    }

    public final void v(f fVar, int i10, long j8) {
        boolean z10;
        boolean z11;
        boolean z12;
        f fVar2;
        boolean z13;
        h();
        if (i10 != -10 && fVar.f5367a == null && fVar.f5368b == null) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.f5400y.a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f5465v) {
            try {
                z10 = false;
                if (i10 <= this.f5466x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f fVar3 = this.w;
                    Boolean bool = Boolean.FALSE;
                    if ((fVar.f5367a != bool || fVar3.f5367a == bool) && (fVar.f5368b != bool || fVar3.f5368b == bool)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (fVar.e() && !this.w.e()) {
                        z10 = true;
                    }
                    f fVar4 = this.w;
                    Boolean bool2 = fVar.f5367a;
                    if (bool2 == null) {
                        bool2 = fVar4.f5367a;
                    }
                    Boolean bool3 = fVar.f5368b;
                    if (bool3 == null) {
                        bool3 = fVar4.f5368b;
                    }
                    f fVar5 = new f(bool2, bool3);
                    this.w = fVar5;
                    this.f5466x = i10;
                    z12 = z10;
                    z10 = true;
                    fVar2 = fVar5;
                } else {
                    fVar2 = fVar;
                    z12 = false;
                    z13 = false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!z10) {
            g3 g3Var2 = this.f5649o.w;
            i4.n(g3Var2);
            g3Var2.z.b(fVar2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f5467y.getAndIncrement();
        if (z13) {
            this.u.set((Object) null);
            h4 h4Var = this.f5649o.f5459x;
            i4.n(h4Var);
            h4Var.p(new d5(this, fVar2, j8, i10, andIncrement, z12));
        } else if (i10 == 30 || i10 == -10) {
            h4 h4Var2 = this.f5649o.f5459x;
            i4.n(h4Var2);
            h4Var2.p(new e5(this, fVar2, i10, andIncrement, z12));
        } else {
            h4 h4Var3 = this.f5649o.f5459x;
            i4.n(h4Var3);
            h4Var3.n(new f5(this, fVar2, i10, andIncrement, z12));
        }
    }

    public final void w(f fVar) {
        boolean z10;
        Boolean bool;
        g();
        if ((!fVar.e() || !fVar.d()) && !this.f5649o.r().n()) {
            z10 = false;
        } else {
            z10 = true;
        }
        i4 i4Var = this.f5649o;
        h4 h4Var = i4Var.f5459x;
        i4.n(h4Var);
        h4Var.g();
        if (z10 != i4Var.S) {
            i4 i4Var2 = this.f5649o;
            h4 h4Var2 = i4Var2.f5459x;
            i4.n(h4Var2);
            h4Var2.g();
            i4Var2.S = z10;
            u3 u3Var = this.f5649o.f5458v;
            i4.l(u3Var);
            u3Var.g();
            if (u3Var.l().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(u3Var.l().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z10 || bool == null || bool.booleanValue()) {
                r(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void x(String str, String str2, Bundle bundle) {
        this.f5649o.B.getClass();
        A(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    public final void y(long j8, Bundle bundle, String str, String str2) {
        g();
        z(str, str2, j8, bundle, true, this.f5462r == null || g7.A(str2), false, (String) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: android.os.Bundle[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: android.os.Bundle[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: android.os.Bundle[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(java.lang.String r27, java.lang.String r28, long r29, android.os.Bundle r31, boolean r32, boolean r33, boolean r34, java.lang.String r35) {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r12 = r31
            n4.m.e(r27)
            n4.m.h(r31)
            r26.g()
            r26.h()
            h5.i4 r13 = r7.f5649o
            boolean r0 = r13.i()
            h5.g3 r14 = r13.w
            if (r0 == 0) goto L_0x0528
            h5.y2 r0 = r13.b()
            java.util.List<java.lang.String> r0 = r0.w
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x002f
            goto L_0x003a
        L_0x002f:
            h5.i4.n(r14)
            java.lang.String r0 = "Dropping non-safelisted event. event name, origin"
            h5.e3 r1 = r14.A
            r1.c(r9, r8, r0)
            return
        L_0x003a:
            boolean r0 = r7.f5464t
            r15 = 0
            r6 = 1
            r5 = 0
            if (r0 != 0) goto L_0x0082
            r7.f5464t = r6
            boolean r0 = r13.f5456s     // Catch:{ ClassNotFoundException -> 0x0078 }
            android.content.Context r1 = r13.f5452o
            java.lang.String r2 = "com.google.android.gms.tagmanager.TagManagerService"
            if (r0 != 0) goto L_0x0054
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0078 }
            java.lang.Class r0 = java.lang.Class.forName(r2, r6, r0)     // Catch:{ ClassNotFoundException -> 0x0078 }
            goto L_0x0058
        L_0x0054:
            java.lang.Class r0 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0078 }
        L_0x0058:
            java.lang.Class[] r2 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x006c }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r5] = r3     // Catch:{ Exception -> 0x006c }
            java.lang.String r3 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r2)     // Catch:{ Exception -> 0x006c }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x006c }
            r2[r5] = r1     // Catch:{ Exception -> 0x006c }
            r0.invoke(r15, r2)     // Catch:{ Exception -> 0x006c }
            goto L_0x0082
        L_0x006c:
            r0 = move-exception
            h5.i4.n(r14)     // Catch:{ ClassNotFoundException -> 0x0078 }
            h5.e3 r1 = r14.w     // Catch:{ ClassNotFoundException -> 0x0078 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.b(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0078 }
            goto L_0x0082
        L_0x0078:
            h5.i4.n(r14)
            java.lang.String r0 = "Tag Manager is not found and thus will not be used"
            h5.e3 r1 = r14.z
            r1.a(r0)
        L_0x0082:
            h5.s2<java.lang.Boolean> r0 = h5.u2.f5708a0
            h5.e r4 = r13.u
            boolean r0 = r4.m(r15, r0)
            r4.d r2 = r13.B
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00bf
            java.lang.String r16 = "auto"
            java.lang.String r17 = "_lgclid"
            java.lang.String r0 = r12.getString(r0)
            r2.getClass()
            long r18 = java.lang.System.currentTimeMillis()
            r1 = r26
            r20 = r2
            r2 = r18
            r10 = r4
            r4 = r0
            r11 = r5
            r5 = r16
            r15 = r6
            r6 = r17
            r1.k(r2, r4, r5, r6)
            goto L_0x00c4
        L_0x00bf:
            r20 = r2
            r10 = r4
            r11 = r5
            r15 = r6
        L_0x00c4:
            h5.u3 r0 = r13.f5458v
            h5.g7 r6 = r13.z
            if (r32 == 0) goto L_0x00e4
            java.lang.String[] r1 = h5.g7.f5417v
            r1 = r1[r11]
            boolean r1 = r1.equals(r9)
            r1 = r1 ^ r15
            if (r1 == 0) goto L_0x00e4
            h5.i4.l(r6)
            h5.i4.l(r0)
            h5.p3 r1 = r0.K
            android.os.Bundle r1 = r1.a()
            r6.r(r12, r1)
        L_0x00e4:
            h5.j6 r1 = r7.D
            h5.b3 r2 = r13.A
            r3 = 40
            if (r34 == 0) goto L_0x0166
            java.lang.String r4 = "_iap"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0166
            h5.i4.l(r6)
            java.lang.String r4 = "event"
            boolean r5 = r6.a0(r4, r9)
            if (r5 != 0) goto L_0x0100
            goto L_0x0118
        L_0x0100:
            java.lang.String[] r5 = s6.a.J
            java.lang.String[] r11 = s6.a.K
            boolean r5 = r6.c0(r4, r5, r11, r9)
            if (r5 != 0) goto L_0x010d
            r5 = 13
            goto L_0x011b
        L_0x010d:
            h5.i4 r5 = r6.f5649o
            r5.getClass()
            boolean r4 = r6.d0(r4, r3, r9)
            if (r4 != 0) goto L_0x011a
        L_0x0118:
            r5 = 2
            goto L_0x011b
        L_0x011a:
            r5 = 0
        L_0x011b:
            if (r5 == 0) goto L_0x0166
            h5.i4.n(r14)
            h5.i4.l(r2)
            java.lang.String r0 = r2.l(r9)
            h5.e3 r2 = r14.f5398v
            java.lang.String r4 = "Invalid public event name. Event will not be logged (FE)"
            r2.b(r0, r4)
            h5.i4.l(r6)
            r6.getClass()
            java.lang.String r0 = h5.g7.m(r9, r3, r15)
            if (r9 == 0) goto L_0x0141
            int r2 = r28.length()
            r17 = r2
            goto L_0x0143
        L_0x0141:
            r17 = 0
        L_0x0143:
            h5.g7 r2 = r13.z
            h5.i4.l(r2)
            r3 = 0
            java.lang.String r4 = "_ev"
            h5.s2<java.lang.Boolean> r6 = h5.u2.f5744u0
            r8 = 0
            boolean r6 = r10.m(r8, r6)
            r27 = r2
            r28 = r1
            r29 = r3
            r30 = r5
            r31 = r4
            r32 = r0
            r33 = r17
            r34 = r6
            r27.w(r28, r29, r30, r31, r32, r33, r34)
            return
        L_0x0166:
            h5.u5 r11 = r13.C
            h5.i4.m(r11)
            r4 = 0
            h5.p5 r5 = r11.o(r4)
            java.lang.String r4 = "_sc"
            if (r5 == 0) goto L_0x017c
            boolean r18 = r12.containsKey(r4)
            if (r18 != 0) goto L_0x017c
            r5.d = r15
        L_0x017c:
            if (r32 == 0) goto L_0x0182
            if (r34 == 0) goto L_0x0182
            r3 = r15
            goto L_0x0183
        L_0x0182:
            r3 = 0
        L_0x0183:
            h5.u5.q(r5, r12, r3)
            java.lang.String r3 = "am"
            boolean r3 = r3.equals(r8)
            boolean r5 = h5.g7.A(r28)
            if (r32 == 0) goto L_0x01e5
            androidx.appcompat.widget.m r15 = r7.f5462r
            if (r15 == 0) goto L_0x01e5
            if (r5 != 0) goto L_0x01e5
            if (r3 == 0) goto L_0x019c
            r15 = 1
            goto L_0x01e6
        L_0x019c:
            h5.i4.n(r14)
            h5.i4.l(r2)
            java.lang.String r0 = r2.l(r9)
            h5.i4.l(r2)
            java.lang.String r1 = r2.o(r12)
            h5.e3 r2 = r14.A
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r2.c(r0, r1, r3)
            androidx.appcompat.widget.m r0 = r7.f5462r
            n4.m.h(r0)
            androidx.appcompat.widget.m r10 = r7.f5462r
            r10.getClass()
            java.lang.Object r0 = r10.f652p     // Catch:{ RemoteException -> 0x01cf }
            r1 = r0
            com.google.android.gms.internal.measurement.t0 r1 = (com.google.android.gms.internal.measurement.t0) r1     // Catch:{ RemoteException -> 0x01cf }
            r2 = r29
            r4 = r31
            r5 = r27
            r6 = r28
            r1.e(r2, r4, r5, r6)     // Catch:{ RemoteException -> 0x01cf }
            goto L_0x01e4
        L_0x01cf:
            r0 = move-exception
            java.lang.Object r1 = r10.f653q
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r1
            h5.i4 r1 = r1.f3203a
            if (r1 == 0) goto L_0x01e4
            h5.g3 r1 = r1.w
            h5.i4.n(r1)
            java.lang.String r2 = "Event interceptor threw exception"
            h5.e3 r1 = r1.w
            r1.b(r0, r2)
        L_0x01e4:
            return
        L_0x01e5:
            r15 = r3
        L_0x01e6:
            boolean r3 = r13.k()
            if (r3 == 0) goto L_0x0526
            h5.i4.l(r6)
            int r3 = r6.e0(r9)
            if (r3 == 0) goto L_0x0240
            h5.i4.n(r14)
            h5.i4.l(r2)
            java.lang.String r0 = r2.l(r9)
            h5.e3 r2 = r14.f5398v
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.b(r0, r4)
            h5.i4.l(r6)
            r6.getClass()
            r0 = 40
            r2 = 1
            java.lang.String r0 = h5.g7.m(r9, r0, r2)
            if (r9 == 0) goto L_0x021c
            int r5 = r28.length()
            r17 = r5
            goto L_0x021e
        L_0x021c:
            r17 = 0
        L_0x021e:
            h5.g7 r2 = r13.z
            h5.i4.l(r2)
            java.lang.String r4 = "_ev"
            h5.s2<java.lang.Boolean> r5 = h5.u2.f5744u0
            r6 = 0
            boolean r5 = r10.m(r6, r5)
            r27 = r2
            r28 = r1
            r29 = r35
            r30 = r3
            r31 = r4
            r32 = r0
            r33 = r17
            r34 = r5
            r27.w(r28, r29, r30, r31, r32, r33, r34)
            return
        L_0x0240:
            java.lang.String r5 = "_o"
            java.lang.String r3 = "_sn"
            java.lang.String r2 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r5, r3, r4, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r18 = java.util.Collections.unmodifiableList(r1)
            h5.g7 r1 = r13.z
            h5.i4.l(r1)
            r12 = r2
            r2 = r35
            r7 = r3
            r3 = r28
            r32 = r15
            r15 = r4
            r4 = r31
            r21 = r5
            r5 = r18
            r31 = r6
            r6 = r34
            android.os.Bundle r6 = r1.p(r2, r3, r4, r5, r6)
            boolean r1 = r6.containsKey(r15)
            if (r1 == 0) goto L_0x0283
            boolean r1 = r6.containsKey(r12)
            if (r1 == 0) goto L_0x0283
            r6.getString(r7)
            r6.getString(r15)
            r6.getLong(r12)
        L_0x0283:
            h5.i4.m(r11)
            r1 = 0
            h5.p5 r2 = r11.o(r1)
            h5.q6 r7 = r13.f5460y
            java.lang.String r12 = "_ae"
            if (r2 == 0) goto L_0x02be
            boolean r1 = r12.equals(r9)
            if (r1 == 0) goto L_0x02be
            h5.i4.m(r7)
            h5.o6 r1 = r7.f5657s
            h5.q6 r2 = r1.d
            h5.i4 r2 = r2.f5649o
            r4.d r2 = r2.B
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r1.f5614b
            long r4 = r2 - r4
            r1.f5614b = r2
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x02be
            h5.i4.l(r31)
            r15 = r31
            r15.H(r6, r4)
            goto L_0x02c0
        L_0x02be:
            r15 = r31
        L_0x02c0:
            com.google.android.gms.internal.measurement.v9 r1 = com.google.android.gms.internal.measurement.v9.f2962p
            com.google.android.gms.internal.measurement.r4<com.google.android.gms.internal.measurement.w9> r1 = r1.f2963o
            java.lang.Object r1 = r1.zza()
            com.google.android.gms.internal.measurement.w9 r1 = (com.google.android.gms.internal.measurement.w9) r1
            r1.zza()
            h5.s2<java.lang.Boolean> r1 = h5.u2.f5728l0
            r5 = 0
            boolean r1 = r10.m(r5, r1)
            if (r1 == 0) goto L_0x0349
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x032a
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x032a
            h5.i4.l(r15)
            java.lang.String r1 = r6.getString(r2)
            boolean r2 = r4.i.a(r1)
            if (r2 == 0) goto L_0x02f7
            r1 = r5
            goto L_0x02fd
        L_0x02f7:
            if (r1 == 0) goto L_0x02fd
            java.lang.String r1 = r1.trim()
        L_0x02fd:
            h5.i4 r2 = r15.f5649o
            h5.u3 r2 = r2.f5458v
            h5.i4.l(r2)
            h5.t3 r2 = r2.H
            java.lang.String r2 = r2.a()
            boolean r2 = h5.g7.B(r1, r2)
            h5.i4 r3 = r15.f5649o
            if (r2 != 0) goto L_0x031d
            h5.u3 r2 = r3.f5458v
            h5.i4.l(r2)
            h5.t3 r2 = r2.H
            r2.b(r1)
            goto L_0x0349
        L_0x031d:
            h5.g3 r0 = r3.w
            h5.i4.n(r0)
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            h5.e3 r0 = r0.A
            r0.a(r1)
            return
        L_0x032a:
            boolean r1 = r12.equals(r9)
            if (r1 == 0) goto L_0x0349
            h5.i4.l(r15)
            h5.i4 r1 = r15.f5649o
            h5.u3 r1 = r1.f5458v
            h5.i4.l(r1)
            h5.t3 r1 = r1.H
            java.lang.String r1 = r1.a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0349
            r6.putString(r2, r1)
        L_0x0349:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r10.add(r6)
            h5.i4.l(r0)
            h5.q3 r1 = r0.C
            long r1 = r1.a()
            r22 = 0
            int r1 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r1 <= 0) goto L_0x03c6
            h5.i4.l(r0)
            r2 = r29
            boolean r1 = r0.r(r2)
            if (r1 == 0) goto L_0x03bd
            h5.i4.l(r0)
            h5.o3 r0 = r0.E
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x03bd
            h5.i4.n(r14)
            java.lang.String r0 = "Current session is expired, remove the session number, ID, and engagement time"
            h5.e3 r1 = r14.B
            r1.a(r0)
            java.lang.String r0 = "auto"
            java.lang.String r16 = "_sid"
            r4 = 0
            r20.getClass()
            long r24 = java.lang.System.currentTimeMillis()
            r1 = r26
            r18 = r11
            r31 = r12
            r11 = r2
            r2 = r24
            r8 = r22
            r22 = r5
            r5 = r0
            r0 = r6
            r6 = r16
            r1.k(r2, r4, r5, r6)
            java.lang.String r5 = "auto"
            java.lang.String r6 = "_sno"
            r20.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            r1.k(r2, r4, r5, r6)
            java.lang.String r5 = "auto"
            java.lang.String r6 = "_se"
            r20.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            r1.k(r2, r4, r5, r6)
            goto L_0x03d1
        L_0x03bd:
            r0 = r6
            r18 = r11
            r31 = r12
            r8 = r22
            r11 = r2
            goto L_0x03cf
        L_0x03c6:
            r0 = r6
            r18 = r11
            r31 = r12
            r8 = r22
            r11 = r29
        L_0x03cf:
            r22 = r5
        L_0x03d1:
            java.lang.String r1 = "extend_session"
            long r1 = r0.getLong(r1, r8)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x03f0
            h5.i4.n(r14)
            java.lang.String r1 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            h5.e3 r2 = r14.B
            r2.a(r1)
            h5.i4.m(r7)
            h5.p6 r1 = r7.f5656r
            r2 = 1
            r1.b(r2, r11)
        L_0x03f0:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r0.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r5 = 0
        L_0x0401:
            if (r5 >= r2) goto L_0x044b
            java.lang.Object r3 = r1.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0448
            h5.i4.l(r15)
            java.lang.Object r4 = r0.get(r3)
            boolean r6 = r4 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x041f
            r6 = 1
            android.os.Bundle[] r8 = new android.os.Bundle[r6]
            android.os.Bundle r4 = (android.os.Bundle) r4
            r6 = 0
            r8[r6] = r4
            goto L_0x0443
        L_0x041f:
            boolean r6 = r4 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x042d
            android.os.Parcelable[] r4 = (android.os.Parcelable[]) r4
            int r6 = r4.length
            java.lang.Class<android.os.Bundle[]> r8 = android.os.Bundle[].class
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6, r8)
            goto L_0x043d
        L_0x042d:
            boolean r6 = r4 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x0441
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r6 = r4.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r4 = r4.toArray(r6)
        L_0x043d:
            r8 = r4
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x0443
        L_0x0441:
            r8 = r22
        L_0x0443:
            if (r8 == 0) goto L_0x0448
            r0.putParcelableArray(r3, r8)
        L_0x0448:
            int r5 = r5 + 1
            goto L_0x0401
        L_0x044b:
            r0 = 0
        L_0x044c:
            int r1 = r10.size()
            if (r0 >= r1) goto L_0x04fd
            java.lang.Object r1 = r10.get(r0)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r0 == 0) goto L_0x045f
            java.lang.String r2 = "_ep"
            r8 = r27
            goto L_0x0463
        L_0x045f:
            r8 = r27
            r2 = r28
        L_0x0463:
            r9 = r21
            r1.putString(r9, r8)
            if (r33 == 0) goto L_0x0471
            h5.i4.l(r15)
            android.os.Bundle r1 = r15.C(r1)
        L_0x0471:
            r14 = r1
            h5.p r5 = new h5.p
            h5.n r3 = new h5.n
            r3.<init>(r14)
            r1 = r5
            r4 = r27
            r8 = r5
            r5 = r29
            r1.<init>(r2, r3, r4, r5)
            h5.f6 r1 = r13.r()
            r1.getClass()
            r1.g()
            r1.h()
            h5.i4 r2 = r1.f5649o
            r2.getClass()
            h5.a3 r2 = r2.q()
            r2.getClass()
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r4 = 0
            h5.q.a(r8, r3, r4)
            byte[] r4 = r3.marshall()
            r3.recycle()
            int r3 = r4.length
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r3 <= r5) goto L_0x04c0
            h5.i4 r2 = r2.f5649o
            h5.g3 r2 = r2.w
            h5.i4.n(r2)
            java.lang.String r3 = "Event is too long for local database. Sending event directly to service"
            h5.e3 r2 = r2.u
            r2.a(r3)
            r2 = 1
            r5 = 0
            goto L_0x04c6
        L_0x04c0:
            r3 = 0
            boolean r5 = r2.n(r3, r4)
            r2 = 1
        L_0x04c6:
            h5.i7 r3 = r1.s(r2)
            h5.b6 r2 = new h5.b6
            r2.<init>(r1, r3, r5, r8)
            r1.q(r2)
            r8 = r26
            if (r32 != 0) goto L_0x04f7
            java.util.concurrent.CopyOnWriteArraySet r1 = r8.f5463s
            java.util.Iterator r16 = r1.iterator()
        L_0x04dc:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x04f7
            java.lang.Object r1 = r16.next()
            h5.t4 r1 = (h5.t4) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r14)
            r2 = r29
            r5 = r27
            r6 = r28
            r1.a(r2, r4, r5, r6)
            goto L_0x04dc
        L_0x04f7:
            int r0 = r0 + 1
            r21 = r9
            goto L_0x044c
        L_0x04fd:
            r8 = r26
            h5.i4.m(r18)
            r0 = r18
            r1 = 0
            h5.p5 r0 = r0.o(r1)
            if (r0 == 0) goto L_0x0527
            r1 = r28
            r0 = r31
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0527
            h5.i4.m(r7)
            r20.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            h5.o6 r2 = r7.f5657s
            r3 = 1
            r2.a(r3, r3, r0)
            goto L_0x0527
        L_0x0526:
            r8 = r7
        L_0x0527:
            return
        L_0x0528:
            r8 = r7
            h5.i4.n(r14)
            java.lang.String r0 = "Event not sent since app measurement is disabled"
            h5.e3 r1 = r14.A
            r1.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i5.z(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }
}
