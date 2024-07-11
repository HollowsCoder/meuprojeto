package m4;

import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

public final class a implements Parcelable.Creator<DataHolder> {
    /* JADX WARNING: type inference failed for: r3v11, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r12) {
        /*
            r11 = this;
            int r0 = o4.b.o(r12)
            r1 = 0
            r2 = 0
            r4 = r1
            r7 = r4
            r5 = r2
            r6 = r5
            r8 = r6
        L_0x000b:
            int r3 = r12.dataPosition()
            if (r3 >= r0) goto L_0x005c
            int r3 = r12.readInt()
            r9 = 65535(0xffff, float:9.1834E-41)
            r9 = r9 & r3
            r10 = 1
            if (r9 == r10) goto L_0x0046
            r10 = 2
            if (r9 == r10) goto L_0x003c
            r10 = 3
            if (r9 == r10) goto L_0x0037
            r10 = 4
            if (r9 == r10) goto L_0x0032
            r10 = 1000(0x3e8, float:1.401E-42)
            if (r9 == r10) goto L_0x002d
            o4.b.n(r12, r3)
            goto L_0x000b
        L_0x002d:
            int r4 = o4.b.k(r12, r3)
            goto L_0x000b
        L_0x0032:
            android.os.Bundle r8 = o4.b.a(r12, r3)
            goto L_0x000b
        L_0x0037:
            int r7 = o4.b.k(r12, r3)
            goto L_0x000b
        L_0x003c:
            android.os.Parcelable$Creator r6 = android.database.CursorWindow.CREATOR
            java.lang.Object[] r3 = o4.b.f(r12, r3, r6)
            r6 = r3
            android.database.CursorWindow[] r6 = (android.database.CursorWindow[]) r6
            goto L_0x000b
        L_0x0046:
            int r3 = o4.b.m(r12, r3)
            int r5 = r12.dataPosition()
            if (r3 != 0) goto L_0x0052
            r5 = r2
            goto L_0x000b
        L_0x0052:
            java.lang.String[] r9 = r12.createStringArray()
            int r5 = r5 + r3
            r12.setDataPosition(r5)
            r5 = r9
            goto L_0x000b
        L_0x005c:
            o4.b.g(r12, r0)
            com.google.android.gms.common.data.DataHolder r12 = new com.google.android.gms.common.data.DataHolder
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r12.f2336q = r0
            r0 = r1
        L_0x006d:
            java.lang.String[] r2 = r12.f2335p
            int r3 = r2.length
            if (r0 >= r3) goto L_0x007c
            android.os.Bundle r3 = r12.f2336q
            r2 = r2[r0]
            r3.putInt(r2, r0)
            int r0 = r0 + 1
            goto L_0x006d
        L_0x007c:
            android.database.CursorWindow[] r0 = r12.f2337r
            int r2 = r0.length
            int[] r2 = new int[r2]
            r12.u = r2
            r2 = r1
        L_0x0084:
            int r3 = r0.length
            if (r1 >= r3) goto L_0x009e
            int[] r3 = r12.u
            r3[r1] = r2
            r3 = r0[r1]
            int r3 = r3.getStartPosition()
            int r3 = r2 - r3
            r4 = r0[r1]
            int r4 = r4.getNumRows()
            int r4 = r4 - r3
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L_0x0084
        L_0x009e:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
