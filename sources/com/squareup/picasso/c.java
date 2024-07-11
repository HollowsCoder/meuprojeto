package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.appcompat.widget.x0;
import com.squareup.picasso.h;
import com.squareup.picasso.r;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements Runnable {
    public static final Object H = new Object();
    public static final a I = new a();
    public static final AtomicInteger J = new AtomicInteger();
    public static final b K = new b();
    public Bitmap A;
    public Future<?> B;
    public t.c C;
    public Exception D;
    public int E;
    public int F;
    public t.d G;

    /* renamed from: o  reason: collision with root package name */
    public final int f3923o = J.incrementAndGet();

    /* renamed from: p  reason: collision with root package name */
    public final t f3924p;

    /* renamed from: q  reason: collision with root package name */
    public final h f3925q;

    /* renamed from: r  reason: collision with root package name */
    public final d f3926r;

    /* renamed from: s  reason: collision with root package name */
    public final a0 f3927s;

    /* renamed from: t  reason: collision with root package name */
    public final String f3928t;
    public final w u;

    /* renamed from: v  reason: collision with root package name */
    public final int f3929v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public final y f3930x;

    /* renamed from: y  reason: collision with root package name */
    public a f3931y;
    public ArrayList z;

    public static class a extends ThreadLocal<StringBuilder> {
        public final Object initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    public static class b extends y {
        public final boolean b(w wVar) {
            return true;
        }

        public final y.a e(w wVar, int i10) {
            throw new IllegalStateException("Unrecognized type of request: " + wVar);
        }
    }

    /* renamed from: com.squareup.picasso.c$c  reason: collision with other inner class name */
    public static class C0047c implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ c0 f3932o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ RuntimeException f3933p;

        public C0047c(c0 c0Var, RuntimeException runtimeException) {
            this.f3932o = c0Var;
            this.f3933p = runtimeException;
        }

        public final void run() {
            throw new RuntimeException("Transformation " + this.f3932o.a() + " crashed with exception.", this.f3933p);
        }
    }

    public static class d implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ StringBuilder f3934o;

        public d(StringBuilder sb) {
            this.f3934o = sb;
        }

        public final void run() {
            throw new NullPointerException(this.f3934o.toString());
        }
    }

    public static class e implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ c0 f3935o;

        public e(c0 c0Var) {
            this.f3935o = c0Var;
        }

        public final void run() {
            throw new IllegalStateException("Transformation " + this.f3935o.a() + " returned input Bitmap but recycled it.");
        }
    }

    public static class f implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ c0 f3936o;

        public f(c0 c0Var) {
            this.f3936o = c0Var;
        }

        public final void run() {
            throw new IllegalStateException("Transformation " + this.f3936o.a() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    public c(t tVar, h hVar, d dVar, a0 a0Var, a aVar, y yVar) {
        this.f3924p = tVar;
        this.f3925q = hVar;
        this.f3926r = dVar;
        this.f3927s = a0Var;
        this.f3931y = aVar;
        this.f3928t = aVar.f3891i;
        w wVar = aVar.f3885b;
        this.u = wVar;
        this.G = wVar.f4012r;
        this.f3929v = aVar.f3887e;
        this.w = aVar.f3888f;
        this.f3930x = yVar;
        this.F = yVar.d();
    }

    public static Bitmap a(List<c0> list, Bitmap bitmap) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            c0 c0Var = list.get(i10);
            try {
                Bitmap b10 = c0Var.b();
                if (b10 == null) {
                    StringBuilder g10 = x0.g("Transformation ");
                    g10.append(c0Var.a());
                    g10.append(" returned null after ");
                    g10.append(i10);
                    g10.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (c0 a10 : list) {
                        g10.append(a10.a());
                        g10.append(10);
                    }
                    t.f3972m.post(new d(g10));
                    return null;
                } else if (b10 == bitmap && bitmap.isRecycled()) {
                    t.f3972m.post(new e(c0Var));
                    return null;
                } else if (b10 == bitmap || bitmap.isRecycled()) {
                    i10++;
                    bitmap = b10;
                } else {
                    t.f3972m.post(new f(c0Var));
                    return null;
                }
            } catch (RuntimeException e10) {
                t.f3972m.post(new C0047c(c0Var, e10));
                return null;
            }
        }
        return bitmap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: w9.v$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: w9.v$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: com.squareup.picasso.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: w9.v$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(w9.b0 r13, com.squareup.picasso.w r14) {
        /*
            w9.v r13 = n.e.o(r13)
            w9.j r0 = com.squareup.picasso.e0.f3940b
            r1 = 0
            boolean r0 = r13.c(r1, r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001c
            w9.j r0 = com.squareup.picasso.e0.f3941c
            r3 = 8
            boolean r0 = r13.c(r3, r0)
            if (r0 == 0) goto L_0x001c
            r0 = r1
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            boolean r3 = r14.f4010p
            android.graphics.BitmapFactory$Options r3 = com.squareup.picasso.y.c(r14)
            if (r3 == 0) goto L_0x002b
            boolean r4 = r3.inJustDecodeBounds
            if (r4 == 0) goto L_0x002b
            r4 = r1
            goto L_0x002c
        L_0x002b:
            r4 = r2
        L_0x002c:
            int r5 = r14.f4002g
            int r6 = r14.f4001f
            if (r0 != 0) goto L_0x0075
            w9.v$a r0 = new w9.v$a
            r0.<init>(r13)
            r13 = 0
            if (r4 == 0) goto L_0x0066
            com.squareup.picasso.n r10 = new com.squareup.picasso.n
            r10.<init>(r0)
            r10.f3965t = r2
            long r7 = r10.f3961p
            r0 = 1024(0x400, float:1.435E-42)
            long r11 = (long) r0
            long r7 = r7 + r11
            long r11 = r10.f3963r
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0050
            r10.b(r7)
        L_0x0050:
            long r11 = r10.f3961p
            android.graphics.BitmapFactory.decodeStream(r10, r13, r3)
            int r0 = r3.outWidth
            int r7 = r3.outHeight
            r4 = r6
            r6 = r0
            r8 = r3
            r9 = r14
            com.squareup.picasso.y.a(r4, r5, r6, r7, r8, r9)
            r10.a(r11)
            r10.f3965t = r1
            r0 = r10
        L_0x0066:
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeStream(r0, r13, r3)
            if (r13 == 0) goto L_0x006d
            return r13
        L_0x006d:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Failed to decode stream."
            r13.<init>(r14)
            throw r13
        L_0x0075:
            w9.b0 r0 = r13.f9363q
            w9.f r13 = r13.f9361o
            r13.N(r0)
            long r0 = r13.f9325p
            byte[] r13 = r13.t(r0)
            if (r4 == 0) goto L_0x0093
            int r0 = r13.length
            android.graphics.BitmapFactory.decodeByteArray(r13, r2, r0, r3)
            int r0 = r3.outWidth
            int r7 = r3.outHeight
            r4 = r6
            r6 = r0
            r8 = r3
            r9 = r14
            com.squareup.picasso.y.a(r4, r5, r6, r7, r8, r9)
        L_0x0093:
            int r14 = r13.length
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeByteArray(r13, r2, r14, r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.c(w9.b0, com.squareup.picasso.w):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x013c, code lost:
        if (r8 != 270) goto L_0x013f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap f(com.squareup.picasso.w r26, android.graphics.Bitmap r27, int r28) {
        /*
            r0 = r26
            r1 = r28
            int r2 = r27.getWidth()
            int r3 = r27.getHeight()
            boolean r4 = r0.f4006k
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            boolean r5 = r26.c()
            if (r5 != 0) goto L_0x0020
            if (r1 == 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            r7 = r2
            r8 = r3
            goto L_0x023b
        L_0x0020:
            float r5 = r0.l
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            int r8 = r0.f4002g
            int r9 = r0.f4001f
            if (r7 == 0) goto L_0x010a
            double r11 = (double) r5
            double r13 = java.lang.Math.toRadians(r11)
            double r13 = java.lang.Math.cos(r13)
            double r11 = java.lang.Math.toRadians(r11)
            double r11 = java.lang.Math.sin(r11)
            boolean r7 = r0.f4009o
            if (r7 == 0) goto L_0x00b3
            float r7 = r0.f4007m
            float r15 = r0.f4008n
            r10.setRotate(r5, r7, r15)
            double r6 = (double) r7
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r17 = r17 - r13
            double r19 = r6 * r17
            r21 = r4
            double r4 = (double) r15
            double r22 = r4 * r11
            r15 = r2
            r24 = r3
            double r2 = r22 + r19
            double r4 = r4 * r17
            double r6 = r6 * r11
            double r4 = r4 - r6
            double r6 = (double) r9
            double r17 = r6 * r13
            double r0 = r17 + r2
            double r6 = r6 * r11
            double r6 = r6 + r4
            double r8 = (double) r8
            double r11 = r11 * r8
            r17 = r4
            double r4 = r0 - r11
            double r8 = r8 * r13
            double r13 = r8 + r6
            double r11 = r2 - r11
            double r8 = r8 + r17
            r19 = r8
            double r8 = java.lang.Math.max(r2, r0)
            double r8 = java.lang.Math.max(r4, r8)
            double r8 = java.lang.Math.max(r11, r8)
            double r0 = java.lang.Math.min(r2, r0)
            double r0 = java.lang.Math.min(r4, r0)
            double r0 = java.lang.Math.min(r11, r0)
            r4 = r17
            double r2 = java.lang.Math.max(r4, r6)
            double r2 = java.lang.Math.max(r13, r2)
            r11 = r19
            double r2 = java.lang.Math.max(r11, r2)
            double r4 = java.lang.Math.min(r4, r6)
            double r4 = java.lang.Math.min(r13, r4)
            double r4 = java.lang.Math.min(r11, r4)
            double r8 = r8 - r0
            double r0 = java.lang.Math.floor(r8)
            int r9 = (int) r0
            double r2 = r2 - r4
            double r0 = java.lang.Math.floor(r2)
            int r8 = (int) r0
            goto L_0x010f
        L_0x00b3:
            r15 = r2
            r24 = r3
            r21 = r4
            r10.setRotate(r5)
            double r0 = (double) r9
            double r2 = r0 * r13
            double r0 = r0 * r11
            double r4 = (double) r8
            double r11 = r11 * r4
            double r6 = r2 - r11
            double r4 = r4 * r13
            double r8 = r4 + r0
            double r11 = -r11
            r13 = 0
            r17 = r4
            double r4 = java.lang.Math.max(r13, r2)
            double r4 = java.lang.Math.max(r6, r4)
            double r4 = java.lang.Math.max(r11, r4)
            double r2 = java.lang.Math.min(r13, r2)
            double r2 = java.lang.Math.min(r6, r2)
            double r2 = java.lang.Math.min(r11, r2)
            double r6 = java.lang.Math.max(r13, r0)
            double r6 = java.lang.Math.max(r8, r6)
            r11 = r17
            double r6 = java.lang.Math.max(r11, r6)
            double r0 = java.lang.Math.min(r13, r0)
            double r0 = java.lang.Math.min(r8, r0)
            double r0 = java.lang.Math.min(r11, r0)
            double r4 = r4 - r2
            double r2 = java.lang.Math.floor(r4)
            int r2 = (int) r2
            double r6 = r6 - r0
            double r0 = java.lang.Math.floor(r6)
            int r0 = (int) r0
            goto L_0x0111
        L_0x010a:
            r15 = r2
            r24 = r3
            r21 = r4
        L_0x010f:
            r0 = r8
            r2 = r9
        L_0x0111:
            r1 = 2
            r3 = 1
            r4 = 5
            r5 = r28
            if (r5 == 0) goto L_0x0154
            r6 = 270(0x10e, float:3.78E-43)
            r7 = 90
            switch(r5) {
                case 3: goto L_0x0125;
                case 4: goto L_0x0125;
                case 5: goto L_0x0123;
                case 6: goto L_0x0123;
                case 7: goto L_0x0121;
                case 8: goto L_0x0121;
                default: goto L_0x011f;
            }
        L_0x011f:
            r8 = 0
            goto L_0x0127
        L_0x0121:
            r8 = r6
            goto L_0x0127
        L_0x0123:
            r8 = r7
            goto L_0x0127
        L_0x0125:
            r8 = 180(0xb4, float:2.52E-43)
        L_0x0127:
            if (r5 == r1) goto L_0x0133
            r9 = 7
            if (r5 == r9) goto L_0x0133
            r9 = 4
            if (r5 == r9) goto L_0x0133
            if (r5 == r4) goto L_0x0133
            r5 = r3
            goto L_0x0134
        L_0x0133:
            r5 = -1
        L_0x0134:
            if (r8 == 0) goto L_0x013f
            float r9 = (float) r8
            r10.preRotate(r9)
            if (r8 == r7) goto L_0x0144
            if (r8 != r6) goto L_0x013f
            goto L_0x0144
        L_0x013f:
            r25 = r2
            r2 = r0
            r0 = r25
        L_0x0144:
            if (r5 == r3) goto L_0x014c
            float r5 = (float) r5
            r6 = 1065353216(0x3f800000, float:1.0)
            r10.postScale(r5, r6)
        L_0x014c:
            r5 = r26
            r25 = r2
            r2 = r0
            r0 = r25
            goto L_0x0156
        L_0x0154:
            r5 = r26
        L_0x0156:
            boolean r6 = r5.f4003h
            if (r6 == 0) goto L_0x01e3
            if (r2 == 0) goto L_0x0163
            float r6 = (float) r2
            r7 = r15
            float r8 = (float) r7
            float r6 = r6 / r8
            r8 = r24
            goto L_0x0169
        L_0x0163:
            r7 = r15
            float r6 = (float) r0
            r8 = r24
            float r9 = (float) r8
            float r6 = r6 / r9
        L_0x0169:
            if (r0 == 0) goto L_0x016e
            float r9 = (float) r0
            float r11 = (float) r8
            goto L_0x0170
        L_0x016e:
            float r9 = (float) r2
            float r11 = (float) r7
        L_0x0170:
            float r9 = r9 / r11
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            int r5 = r5.f4004i
            if (r11 <= 0) goto L_0x0199
            float r4 = (float) r8
            float r9 = r9 / r6
            float r9 = r9 * r4
            double r11 = (double) r9
            double r11 = java.lang.Math.ceil(r11)
            int r4 = (int) r11
            r9 = r5 & 48
            r11 = 48
            if (r9 != r11) goto L_0x0188
            r1 = 0
            goto L_0x0194
        L_0x0188:
            r9 = 80
            r5 = r5 & r9
            if (r5 != r9) goto L_0x0190
            int r1 = r8 - r4
            goto L_0x0194
        L_0x0190:
            int r5 = r8 - r4
            int r1 = r5 / 2
        L_0x0194:
            float r5 = (float) r0
            float r9 = (float) r4
            float r9 = r5 / r9
            goto L_0x01c3
        L_0x0199:
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x01c0
            float r11 = (float) r7
            float r6 = r6 / r9
            float r6 = r6 * r11
            double r11 = (double) r6
            double r11 = java.lang.Math.ceil(r11)
            int r6 = (int) r11
            r11 = r5 & 3
            r12 = 3
            if (r11 != r12) goto L_0x01ad
            r1 = 0
            goto L_0x01b7
        L_0x01ad:
            r5 = r5 & r4
            if (r5 != r4) goto L_0x01b3
            int r1 = r7 - r6
            goto L_0x01b7
        L_0x01b3:
            int r4 = r7 - r6
            int r1 = r4 / 2
        L_0x01b7:
            float r4 = (float) r2
            float r5 = (float) r6
            float r4 = r4 / r5
            r5 = r8
            r11 = r9
            r9 = r6
            r6 = r4
            r4 = 0
            goto L_0x01c8
        L_0x01c0:
            r4 = r8
            r6 = r9
            r1 = 0
        L_0x01c3:
            r5 = r4
            r11 = r9
            r4 = r1
            r9 = r7
            r1 = 0
        L_0x01c8:
            if (r21 == 0) goto L_0x01d6
            if (r2 == 0) goto L_0x01ce
            if (r7 > r2) goto L_0x01d6
        L_0x01ce:
            if (r0 == 0) goto L_0x01d3
            if (r8 <= r0) goto L_0x01d3
            goto L_0x01d6
        L_0x01d3:
            r16 = 0
            goto L_0x01d8
        L_0x01d6:
            r16 = r3
        L_0x01d8:
            if (r16 == 0) goto L_0x01dd
            r10.preScale(r6, r11)
        L_0x01dd:
            r6 = r1
            r7 = r4
            r8 = r9
            r9 = r5
            goto L_0x023f
        L_0x01e3:
            r7 = r15
            r8 = r24
            boolean r1 = r5.f4005j
            if (r1 == 0) goto L_0x0212
            if (r2 == 0) goto L_0x01ef
            float r1 = (float) r2
            float r4 = (float) r7
            goto L_0x01f1
        L_0x01ef:
            float r1 = (float) r0
            float r4 = (float) r8
        L_0x01f1:
            float r1 = r1 / r4
            if (r0 == 0) goto L_0x01f7
            float r4 = (float) r0
            float r5 = (float) r8
            goto L_0x01f9
        L_0x01f7:
            float r4 = (float) r2
            float r5 = (float) r7
        L_0x01f9:
            float r4 = r4 / r5
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x01ff
            goto L_0x0200
        L_0x01ff:
            r1 = r4
        L_0x0200:
            if (r21 == 0) goto L_0x020c
            if (r2 == 0) goto L_0x0206
            if (r7 > r2) goto L_0x020c
        L_0x0206:
            if (r0 == 0) goto L_0x020b
            if (r8 <= r0) goto L_0x020b
            goto L_0x020c
        L_0x020b:
            r3 = 0
        L_0x020c:
            if (r3 == 0) goto L_0x023b
            r10.preScale(r1, r1)
            goto L_0x023b
        L_0x0212:
            if (r2 != 0) goto L_0x0216
            if (r0 == 0) goto L_0x023b
        L_0x0216:
            if (r2 != r7) goto L_0x021a
            if (r0 == r8) goto L_0x023b
        L_0x021a:
            if (r2 == 0) goto L_0x021f
            float r1 = (float) r2
            float r4 = (float) r7
            goto L_0x0221
        L_0x021f:
            float r1 = (float) r0
            float r4 = (float) r8
        L_0x0221:
            float r1 = r1 / r4
            if (r0 == 0) goto L_0x0227
            float r4 = (float) r0
            float r5 = (float) r8
            goto L_0x0229
        L_0x0227:
            float r4 = (float) r2
            float r5 = (float) r7
        L_0x0229:
            float r4 = r4 / r5
            if (r21 == 0) goto L_0x0236
            if (r2 == 0) goto L_0x0230
            if (r7 > r2) goto L_0x0236
        L_0x0230:
            if (r0 == 0) goto L_0x0235
            if (r8 <= r0) goto L_0x0235
            goto L_0x0236
        L_0x0235:
            r3 = 0
        L_0x0236:
            if (r3 == 0) goto L_0x023b
            r10.preScale(r1, r4)
        L_0x023b:
            r9 = r8
            r6 = 0
            r8 = r7
            r7 = 0
        L_0x023f:
            r11 = 1
            r5 = r27
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            r1 = r27
            if (r0 == r1) goto L_0x024e
            r27.recycle()
            goto L_0x024f
        L_0x024e:
            r0 = r1
        L_0x024f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.f(com.squareup.picasso.w, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static void g(w wVar) {
        String str;
        Uri uri = wVar.f3999c;
        if (uri != null) {
            str = String.valueOf(uri.getPath());
        } else {
            str = Integer.toHexString(wVar.d);
        }
        StringBuilder sb = (StringBuilder) I.get();
        sb.ensureCapacity(str.length() + 8);
        sb.replace(8, sb.length(), str);
        Thread.currentThread().setName(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r2.B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r2 = this;
            com.squareup.picasso.a r0 = r2.f3931y
            r1 = 0
            if (r0 != 0) goto L_0x001a
            java.util.ArrayList r0 = r2.z
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x000f:
            java.util.concurrent.Future<?> r0 = r2.B
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.b():boolean");
    }

    public final void d(a aVar) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (this.f3931y == aVar) {
            this.f3931y = null;
            z10 = true;
        } else {
            ArrayList arrayList = this.z;
            if (arrayList != null) {
                z10 = arrayList.remove(aVar);
            } else {
                z10 = false;
            }
        }
        if (z10 && aVar.f3885b.f4012r == this.G) {
            t.d dVar = t.d.LOW;
            ArrayList arrayList2 = this.z;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            a aVar2 = this.f3931y;
            if (aVar2 == null && !z11) {
                z12 = false;
            }
            if (z12) {
                if (aVar2 != null) {
                    dVar = aVar2.f3885b.f4012r;
                }
                if (z11) {
                    int size = this.z.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        t.d dVar2 = ((a) this.z.get(i10)).f3885b.f4012r;
                        if (dVar2.ordinal() > dVar.ordinal()) {
                            dVar = dVar2;
                        }
                    }
                }
            }
            this.G = dVar;
        }
        if (this.f3924p.l) {
            e0.d("Hunter", "removed", aVar.f3885b.b(), e0.b(this, "from "));
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final android.graphics.Bitmap e() {
        /*
            r7 = this;
            int r0 = r7.f3929v
            boolean r0 = com.squareup.picasso.p.shouldReadFromMemoryCache(r0)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0040
            com.squareup.picasso.d r0 = r7.f3926r
            java.lang.String r3 = r7.f3928t
            com.squareup.picasso.m r0 = (com.squareup.picasso.m) r0
            com.squareup.picasso.l r0 = r0.f3957a
            java.lang.Object r0 = r0.get(r3)
            com.squareup.picasso.m$a r0 = (com.squareup.picasso.m.a) r0
            if (r0 == 0) goto L_0x001d
            android.graphics.Bitmap r0 = r0.f3958a
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0040
            com.squareup.picasso.a0 r0 = r7.f3927s
            com.squareup.picasso.a0$a r0 = r0.f3896b
            r0.sendEmptyMessage(r2)
            com.squareup.picasso.t$c r0 = com.squareup.picasso.t.c.MEMORY
            r7.C = r0
            com.squareup.picasso.t r0 = r7.f3924p
            boolean r0 = r0.l
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "Hunter"
            java.lang.String r2 = "decoded"
            com.squareup.picasso.w r3 = r7.u
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "from cache"
            com.squareup.picasso.e0.d(r0, r2, r3, r4)
        L_0x003f:
            return r1
        L_0x0040:
            int r0 = r7.F
            if (r0 != 0) goto L_0x0049
            com.squareup.picasso.q r0 = com.squareup.picasso.q.OFFLINE
            int r0 = r0.index
            goto L_0x004b
        L_0x0049:
            int r0 = r7.w
        L_0x004b:
            r7.w = r0
            com.squareup.picasso.y r3 = r7.f3930x
            com.squareup.picasso.w r4 = r7.u
            com.squareup.picasso.y$a r0 = r3.e(r4, r0)
            if (r0 == 0) goto L_0x0074
            com.squareup.picasso.t$c r1 = r0.f4019a
            r7.C = r1
            int r1 = r0.d
            r7.E = r1
            android.graphics.Bitmap r1 = r0.f4020b
            if (r1 != 0) goto L_0x0074
            w9.b0 r0 = r0.f4021c
            com.squareup.picasso.w r1 = r7.u     // Catch:{ all -> 0x006f }
            android.graphics.Bitmap r1 = c(r0, r1)     // Catch:{ all -> 0x006f }
            r0.close()     // Catch:{ IOException -> 0x0074 }
            goto L_0x0074
        L_0x006f:
            r1 = move-exception
            r0.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            throw r1
        L_0x0074:
            if (r1 == 0) goto L_0x014d
            com.squareup.picasso.t r0 = r7.f3924p
            boolean r0 = r0.l
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "Hunter"
            java.lang.String r3 = "decoded"
            com.squareup.picasso.w r4 = r7.u
            java.lang.String r4 = r4.b()
            com.squareup.picasso.e0.c(r0, r3, r4)
        L_0x0089:
            com.squareup.picasso.a0 r0 = r7.f3927s
            r0.getClass()
            java.lang.StringBuilder r3 = com.squareup.picasso.e0.f3939a
            int r3 = r1.getAllocationByteCount()
            if (r3 < 0) goto L_0x0139
            com.squareup.picasso.a0$a r0 = r0.f3896b
            r4 = 2
            android.os.Message r3 = r0.obtainMessage(r4, r3, r2)
            r0.sendMessage(r3)
            com.squareup.picasso.w r0 = r7.u
            boolean r3 = r0.c()
            r4 = 1
            if (r3 != 0) goto L_0x00b5
            java.util.List<com.squareup.picasso.c0> r0 = r0.f4000e
            if (r0 == 0) goto L_0x00af
            r0 = r4
            goto L_0x00b0
        L_0x00af:
            r0 = r2
        L_0x00b0:
            if (r0 == 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            r0 = r2
            goto L_0x00b6
        L_0x00b5:
            r0 = r4
        L_0x00b6:
            if (r0 != 0) goto L_0x00bc
            int r0 = r7.E
            if (r0 == 0) goto L_0x014d
        L_0x00bc:
            java.lang.Object r0 = H
            monitor-enter(r0)
            com.squareup.picasso.w r3 = r7.u     // Catch:{ all -> 0x0136 }
            boolean r3 = r3.c()     // Catch:{ all -> 0x0136 }
            if (r3 != 0) goto L_0x00cb
            int r3 = r7.E     // Catch:{ all -> 0x0136 }
            if (r3 == 0) goto L_0x00e6
        L_0x00cb:
            com.squareup.picasso.w r3 = r7.u     // Catch:{ all -> 0x0136 }
            int r5 = r7.E     // Catch:{ all -> 0x0136 }
            android.graphics.Bitmap r1 = f(r3, r1, r5)     // Catch:{ all -> 0x0136 }
            com.squareup.picasso.t r3 = r7.f3924p     // Catch:{ all -> 0x0136 }
            boolean r3 = r3.l     // Catch:{ all -> 0x0136 }
            if (r3 == 0) goto L_0x00e6
            java.lang.String r3 = "Hunter"
            java.lang.String r5 = "transformed"
            com.squareup.picasso.w r6 = r7.u     // Catch:{ all -> 0x0136 }
            java.lang.String r6 = r6.b()     // Catch:{ all -> 0x0136 }
            com.squareup.picasso.e0.c(r3, r5, r6)     // Catch:{ all -> 0x0136 }
        L_0x00e6:
            com.squareup.picasso.w r3 = r7.u     // Catch:{ all -> 0x0136 }
            java.util.List<com.squareup.picasso.c0> r3 = r3.f4000e     // Catch:{ all -> 0x0136 }
            if (r3 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r4 = r2
        L_0x00ee:
            if (r4 == 0) goto L_0x0109
            android.graphics.Bitmap r1 = a(r3, r1)     // Catch:{ all -> 0x0136 }
            com.squareup.picasso.t r3 = r7.f3924p     // Catch:{ all -> 0x0136 }
            boolean r3 = r3.l     // Catch:{ all -> 0x0136 }
            if (r3 == 0) goto L_0x0109
            java.lang.String r3 = "Hunter"
            java.lang.String r4 = "transformed"
            com.squareup.picasso.w r5 = r7.u     // Catch:{ all -> 0x0136 }
            java.lang.String r5 = r5.b()     // Catch:{ all -> 0x0136 }
            java.lang.String r6 = "from custom transformations"
            com.squareup.picasso.e0.d(r3, r4, r5, r6)     // Catch:{ all -> 0x0136 }
        L_0x0109:
            monitor-exit(r0)     // Catch:{ all -> 0x0136 }
            if (r1 == 0) goto L_0x014d
            com.squareup.picasso.a0 r0 = r7.f3927s
            r0.getClass()
            int r3 = r1.getAllocationByteCount()
            if (r3 < 0) goto L_0x0122
            com.squareup.picasso.a0$a r0 = r0.f3896b
            r4 = 3
            android.os.Message r2 = r0.obtainMessage(r4, r3, r2)
            r0.sendMessage(r2)
            goto L_0x014d
        L_0x0122:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Negative size: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0136:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0136 }
            throw r1
        L_0x0139:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Negative size: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x014d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.e():android.graphics.Bitmap");
    }

    public final void run() {
        h hVar;
        try {
            g(this.u);
            if (this.f3924p.l) {
                e0.c("Hunter", "executing", e0.a(this));
            }
            Bitmap e10 = e();
            this.A = e10;
            if (e10 == null) {
                this.f3925q.c(this);
            } else {
                this.f3925q.b(this);
            }
        } catch (r.b e11) {
            if (!q.isOfflineOnly(e11.f3970p) || e11.f3969o != 504) {
                this.D = e11;
            }
            hVar = this.f3925q;
            hVar.c(this);
        } catch (IOException e12) {
            this.D = e12;
            h.a aVar = this.f3925q.f3949h;
            aVar.sendMessageDelayed(aVar.obtainMessage(5, this), 500);
        } catch (OutOfMemoryError e13) {
            StringWriter stringWriter = new StringWriter();
            this.f3927s.a().a(new PrintWriter(stringWriter));
            this.D = new RuntimeException(stringWriter.toString(), e13);
        } catch (Exception e14) {
            this.D = e14;
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
        hVar = this.f3925q;
        hVar.c(this);
        Thread.currentThread().setName("Picasso-Idle");
    }
}
