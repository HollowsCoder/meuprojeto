package k4;

import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

public final class k implements Parcelable.Creator<Status> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = o4.b.o(r10)
            r1 = 0
            r2 = 0
            r4 = r1
            r5 = r4
            r6 = r2
            r7 = r6
            r8 = r7
        L_0x000b:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x0050
            int r1 = r10.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 1
            if (r2 == r3) goto L_0x004b
            r3 = 2
            if (r2 == r3) goto L_0x0046
            r3 = 3
            if (r2 == r3) goto L_0x003c
            r3 = 4
            if (r2 == r3) goto L_0x0032
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r3) goto L_0x002d
            o4.b.n(r10, r1)
            goto L_0x000b
        L_0x002d:
            int r4 = o4.b.k(r10, r1)
            goto L_0x000b
        L_0x0032:
            android.os.Parcelable$Creator<j4.b> r2 = j4.b.CREATOR
            android.os.Parcelable r1 = o4.b.d(r10, r1, r2)
            r8 = r1
            j4.b r8 = (j4.b) r8
            goto L_0x000b
        L_0x003c:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = o4.b.d(r10, r1, r2)
            r7 = r1
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            goto L_0x000b
        L_0x0046:
            java.lang.String r6 = o4.b.e(r10, r1)
            goto L_0x000b
        L_0x004b:
            int r5 = o4.b.k(r10, r1)
            goto L_0x000b
        L_0x0050:
            o4.b.g(r10, r0)
            com.google.android.gms.common.api.Status r10 = new com.google.android.gms.common.api.Status
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.k.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
