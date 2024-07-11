package h4;

import android.os.Parcelable;

public final class g implements Parcelable.Creator<f> {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r13) {
        /*
            r12 = this;
            int r0 = o4.b.o(r13)
            r1 = 0
            r2 = 1
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            r10 = r2
        L_0x000e:
            int r2 = r13.dataPosition()
            if (r2 >= r0) goto L_0x0075
            int r2 = r13.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 2: goto L_0x006b;
                case 3: goto L_0x0056;
                case 4: goto L_0x0051;
                case 5: goto L_0x003c;
                case 6: goto L_0x0037;
                case 7: goto L_0x0032;
                case 8: goto L_0x002d;
                case 9: goto L_0x0023;
                default: goto L_0x001f;
            }
        L_0x001f:
            o4.b.n(r13, r2)
            goto L_0x000e
        L_0x0023:
            android.os.Parcelable$Creator<i5.a> r3 = i5.a.CREATOR
            java.lang.Object[] r2 = o4.b.f(r13, r2, r3)
            r11 = r2
            i5.a[] r11 = (i5.a[]) r11
            goto L_0x000e
        L_0x002d:
            boolean r10 = o4.b.h(r13, r2)
            goto L_0x000e
        L_0x0032:
            byte[][] r9 = o4.b.b(r13, r2)
            goto L_0x000e
        L_0x0037:
            int[] r8 = o4.b.c(r13, r2)
            goto L_0x000e
        L_0x003c:
            int r2 = o4.b.m(r13, r2)
            int r3 = r13.dataPosition()
            if (r2 != 0) goto L_0x0048
            r7 = r1
            goto L_0x000e
        L_0x0048:
            java.lang.String[] r7 = r13.createStringArray()
            int r3 = r3 + r2
            r13.setDataPosition(r3)
            goto L_0x000e
        L_0x0051:
            int[] r6 = o4.b.c(r13, r2)
            goto L_0x000e
        L_0x0056:
            int r2 = o4.b.m(r13, r2)
            int r3 = r13.dataPosition()
            if (r2 != 0) goto L_0x0062
            r5 = r1
            goto L_0x000e
        L_0x0062:
            byte[] r5 = r13.createByteArray()
            int r3 = r3 + r2
            r13.setDataPosition(r3)
            goto L_0x000e
        L_0x006b:
            android.os.Parcelable$Creator<com.google.android.gms.internal.clearcut.i4> r3 = com.google.android.gms.internal.clearcut.i4.CREATOR
            android.os.Parcelable r2 = o4.b.d(r13, r2, r3)
            r4 = r2
            com.google.android.gms.internal.clearcut.i4 r4 = (com.google.android.gms.internal.clearcut.i4) r4
            goto L_0x000e
        L_0x0075:
            o4.b.g(r13, r0)
            h4.f r13 = new h4.f
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.g.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
