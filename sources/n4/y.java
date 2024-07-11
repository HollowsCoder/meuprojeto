package n4;

import android.os.Parcelable;

public final class y implements Parcelable.Creator<w> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = o4.b.o(r10)
            r1 = 0
            r2 = 0
            r4 = r1
            r7 = r4
            r8 = r7
            r5 = r2
            r6 = r5
        L_0x000b:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x004a
            int r1 = r10.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 1
            if (r2 == r3) goto L_0x0045
            r3 = 2
            if (r2 == r3) goto L_0x0040
            r3 = 3
            if (r2 == r3) goto L_0x0036
            r3 = 4
            if (r2 == r3) goto L_0x0031
            r3 = 5
            if (r2 == r3) goto L_0x002c
            o4.b.n(r10, r1)
            goto L_0x000b
        L_0x002c:
            boolean r8 = o4.b.h(r10, r1)
            goto L_0x000b
        L_0x0031:
            boolean r7 = o4.b.h(r10, r1)
            goto L_0x000b
        L_0x0036:
            android.os.Parcelable$Creator<j4.b> r2 = j4.b.CREATOR
            android.os.Parcelable r1 = o4.b.d(r10, r1, r2)
            r6 = r1
            j4.b r6 = (j4.b) r6
            goto L_0x000b
        L_0x0040:
            android.os.IBinder r5 = o4.b.j(r10, r1)
            goto L_0x000b
        L_0x0045:
            int r4 = o4.b.k(r10, r1)
            goto L_0x000b
        L_0x004a:
            o4.b.g(r10, r0)
            n4.w r10 = new n4.w
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.y.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new w[i10];
    }
}
