package h5;

import com.google.android.gms.internal.measurement.b0;

public abstract class w2 extends b0 implements x2 {
    public w2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a7, code lost:
        r11.writeNoException();
        r11.writeTypedList(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0222, code lost:
        r11.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0225, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean I(int r9, android.os.Parcel r10, android.os.Parcel r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            switch(r9) {
                case 1: goto L_0x020c;
                case 2: goto L_0x01f5;
                case 3: goto L_0x0005;
                case 4: goto L_0x01e6;
                case 5: goto L_0x01c2;
                case 6: goto L_0x01b3;
                case 7: goto L_0x013e;
                case 8: goto L_0x0005;
                case 9: goto L_0x0123;
                case 10: goto L_0x010b;
                case 11: goto L_0x00f4;
                case 12: goto L_0x00dc;
                case 13: goto L_0x00af;
                case 14: goto L_0x0087;
                case 15: goto L_0x006a;
                case 16: goto L_0x0052;
                case 17: goto L_0x003e;
                case 18: goto L_0x002e;
                case 19: goto L_0x0016;
                case 20: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return r0
        L_0x0006:
            android.os.Parcelable$Creator<h5.i7> r9 = h5.i7.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.c0.a(r10, r9)
            h5.i7 r9 = (h5.i7) r9
            r10 = r8
            h5.p4 r10 = (h5.p4) r10
            r10.n(r9)
            goto L_0x0222
        L_0x0016:
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.c0.a(r10, r9)
            android.os.Bundle r9 = (android.os.Bundle) r9
            android.os.Parcelable$Creator<h5.i7> r0 = h5.i7.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.c0.a(r10, r0)
            h5.i7 r10 = (h5.i7) r10
            r0 = r8
            h5.p4 r0 = (h5.p4) r0
            r0.d(r9, r10)
            goto L_0x0222
        L_0x002e:
            android.os.Parcelable$Creator<h5.i7> r9 = h5.i7.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.c0.a(r10, r9)
            h5.i7 r9 = (h5.i7) r9
            r10 = r8
            h5.p4 r10 = (h5.p4) r10
            r10.E(r9)
            goto L_0x0222
        L_0x003e:
            java.lang.String r9 = r10.readString()
            java.lang.String r0 = r10.readString()
            java.lang.String r10 = r10.readString()
            r2 = r8
            h5.p4 r2 = (h5.p4) r2
            java.util.List r9 = r2.B(r9, r0, r10)
            goto L_0x00a7
        L_0x0052:
            java.lang.String r9 = r10.readString()
            java.lang.String r0 = r10.readString()
            android.os.Parcelable$Creator<h5.i7> r2 = h5.i7.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.c0.a(r10, r2)
            h5.i7 r10 = (h5.i7) r10
            r2 = r8
            h5.p4 r2 = (h5.p4) r2
            java.util.List r9 = r2.p(r9, r0, r10)
            goto L_0x00a7
        L_0x006a:
            java.lang.String r9 = r10.readString()
            java.lang.String r2 = r10.readString()
            java.lang.String r3 = r10.readString()
            java.lang.ClassLoader r4 = com.google.android.gms.internal.measurement.c0.f2650a
            int r10 = r10.readInt()
            if (r10 == 0) goto L_0x007f
            r0 = r1
        L_0x007f:
            r10 = r8
            h5.p4 r10 = (h5.p4) r10
            java.util.List r9 = r10.G(r9, r2, r3, r0)
            goto L_0x00a7
        L_0x0087:
            java.lang.String r9 = r10.readString()
            java.lang.String r2 = r10.readString()
            java.lang.ClassLoader r3 = com.google.android.gms.internal.measurement.c0.f2650a
            int r3 = r10.readInt()
            if (r3 == 0) goto L_0x0098
            r0 = r1
        L_0x0098:
            android.os.Parcelable$Creator<h5.i7> r3 = h5.i7.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.c0.a(r10, r3)
            h5.i7 r10 = (h5.i7) r10
            r3 = r8
            h5.p4 r3 = (h5.p4) r3
            java.util.List r9 = r3.g(r9, r2, r0, r10)
        L_0x00a7:
            r11.writeNoException()
            r11.writeTypedList(r9)
            goto L_0x0225
        L_0x00af:
            android.os.Parcelable$Creator<h5.b> r9 = h5.b.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.c0.a(r10, r9)
            h5.b r9 = (h5.b) r9
            r10 = r8
            h5.p4 r10 = (h5.p4) r10
            n4.m.h(r9)
            h5.c7 r0 = r9.f5277q
            n4.m.h(r0)
            java.lang.String r0 = r9.f5275o
            n4.m.e(r0)
            java.lang.String r0 = r9.f5275o
            r10.K(r0, r1)
            h5.b r0 = new h5.b
            r0.<init>(r9)
            i4.o r9 = new i4.o
            r2 = 3
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r0, (int) r2)
            r10.L(r9)
            goto L_0x0222
        L_0x00dc:
            android.os.Parcelable$Creator<h5.b> r9 = h5.b.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.c0.a(r10, r9)
            h5.b r9 = (h5.b) r9
            android.os.Parcelable$Creator<h5.i7> r0 = h5.i7.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.c0.a(r10, r0)
            h5.i7 r10 = (h5.i7) r10
            r0 = r8
            h5.p4 r0 = (h5.p4) r0
            r0.r(r9, r10)
            goto L_0x0222
        L_0x00f4:
            android.os.Parcelable$Creator<h5.i7> r9 = h5.i7.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.c0.a(r10, r9)
            h5.i7 r9 = (h5.i7) r9
            r10 = r8
            h5.p4 r10 = (h5.p4) r10
            java.lang.String r9 = r10.q(r9)
            r11.writeNoException()
            r11.writeString(r9)
            goto L_0x0225
        L_0x010b:
            long r3 = r10.readLong()
            java.lang.String r5 = r10.readString()
            java.lang.String r6 = r10.readString()
            java.lang.String r7 = r10.readString()
            r2 = r8
            h5.p4 r2 = (h5.p4) r2
            r2.u(r3, r5, r6, r7)
            goto L_0x0222
        L_0x0123:
            android.os.Parcelable$Creator<h5.p> r9 = h5.p.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.c0.a(r10, r9)
            h5.p r9 = (h5.p) r9
            java.lang.String r10 = r10.readString()
            r0 = r8
            h5.p4 r0 = (h5.p4) r0
            byte[] r9 = r0.A(r9, r10)
            r11.writeNoException()
            r11.writeByteArray(r9)
            goto L_0x0225
        L_0x013e:
            android.os.Parcelable$Creator<h5.i7> r9 = h5.i7.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.c0.a(r10, r9)
            h5.i7 r9 = (h5.i7) r9
            int r10 = r10.readInt()
            if (r10 == 0) goto L_0x014d
            r0 = r1
        L_0x014d:
            r10 = r8
            h5.p4 r10 = (h5.p4) r10
            r10.J(r9)
            java.lang.String r9 = r9.f5468o
            n4.m.h(r9)
            h5.z6 r2 = r10.f5631a
            h5.h4 r3 = r2.f()
            h5.z3 r4 = new h5.z3
            r4.<init>(r9, r1, r10)
            h5.f4 r10 = r3.m(r4)
            java.lang.Object r10 = r10.get()     // Catch:{ InterruptedException -> 0x019b, ExecutionException -> 0x0199 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ InterruptedException -> 0x019b, ExecutionException -> 0x0199 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ InterruptedException -> 0x019b, ExecutionException -> 0x0199 }
            int r4 = r10.size()     // Catch:{ InterruptedException -> 0x019b, ExecutionException -> 0x0199 }
            r3.<init>(r4)     // Catch:{ InterruptedException -> 0x019b, ExecutionException -> 0x0199 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ InterruptedException -> 0x019b, ExecutionException -> 0x0199 }
        L_0x017a:
            boolean r4 = r10.hasNext()     // Catch:{ InterruptedException -> 0x019b, ExecutionException -> 0x0199 }
            if (r4 == 0) goto L_0x01ac
            java.lang.Object r4 = r10.next()     // Catch:{ InterruptedException -> 0x019b, ExecutionException -> 0x0199 }
            h5.e7 r4 = (h5.e7) r4     // Catch:{ InterruptedException -> 0x019b, ExecutionException -> 0x0199 }
            if (r0 != 0) goto L_0x0190
            java.lang.String r5 = r4.f5364c     // Catch:{ InterruptedException -> 0x019b, ExecutionException -> 0x0199 }
            boolean r5 = h5.g7.A(r5)     // Catch:{ InterruptedException -> 0x019b, ExecutionException -> 0x0199 }
            if (r5 != 0) goto L_0x017a
        L_0x0190:
            h5.c7 r5 = new h5.c7     // Catch:{ InterruptedException -> 0x019b, ExecutionException -> 0x0199 }
            r5.<init>(r4)     // Catch:{ InterruptedException -> 0x019b, ExecutionException -> 0x0199 }
            r3.add(r5)     // Catch:{ InterruptedException -> 0x019b, ExecutionException -> 0x0199 }
            goto L_0x017a
        L_0x0199:
            r10 = move-exception
            goto L_0x019c
        L_0x019b:
            r10 = move-exception
        L_0x019c:
            h5.g3 r0 = r2.e()
            h5.f3 r9 = h5.g3.p(r9)
            h5.e3 r0 = r0.f5397t
            java.lang.String r2 = "Failed to get user properties. appId"
            r0.c(r9, r10, r2)
            r3 = 0
        L_0x01ac:
            r11.writeNoException()
            r11.writeTypedList(r3)
            goto L_0x0225
        L_0x01b3:
            android.os.Parcelable$Creator<h5.i7> r9 = h5.i7.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.c0.a(r10, r9)
            h5.i7 r9 = (h5.i7) r9
            r10 = r8
            h5.p4 r10 = (h5.p4) r10
            r10.o(r9)
            goto L_0x0222
        L_0x01c2:
            android.os.Parcelable$Creator<h5.p> r9 = h5.p.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.c0.a(r10, r9)
            h5.p r9 = (h5.p) r9
            java.lang.String r0 = r10.readString()
            r10.readString()
            r10 = r8
            h5.p4 r10 = (h5.p4) r10
            n4.m.h(r9)
            n4.m.e(r0)
            r10.K(r0, r1)
            h5.j4 r2 = new h5.j4
            r2.<init>((h5.p4) r10, (h5.p) r9, (java.lang.String) r0)
            r10.L(r2)
            goto L_0x0222
        L_0x01e6:
            android.os.Parcelable$Creator<h5.i7> r9 = h5.i7.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.c0.a(r10, r9)
            h5.i7 r9 = (h5.i7) r9
            r10 = r8
            h5.p4 r10 = (h5.p4) r10
            r10.F(r9)
            goto L_0x0222
        L_0x01f5:
            android.os.Parcelable$Creator<h5.c7> r9 = h5.c7.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.c0.a(r10, r9)
            h5.c7 r9 = (h5.c7) r9
            android.os.Parcelable$Creator<h5.i7> r0 = h5.i7.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.c0.a(r10, r0)
            h5.i7 r10 = (h5.i7) r10
            r0 = r8
            h5.p4 r0 = (h5.p4) r0
            r0.t(r9, r10)
            goto L_0x0222
        L_0x020c:
            android.os.Parcelable$Creator<h5.p> r9 = h5.p.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.measurement.c0.a(r10, r9)
            h5.p r9 = (h5.p) r9
            android.os.Parcelable$Creator<h5.i7> r0 = h5.i7.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.c0.a(r10, r0)
            h5.i7 r10 = (h5.i7) r10
            r0 = r8
            h5.p4 r0 = (h5.p4) r0
            r0.l(r9, r10)
        L_0x0222:
            r11.writeNoException()
        L_0x0225:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.w2.I(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
