package q2;

import java.io.IOException;

public final class e extends IOException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ e(int r3, int r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 108(0x6c, float:1.51E-43)
            r0.<init>(r1)
            java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space (pos "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " limit "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ")."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.e.<init>(int, int):void");
    }

    public /* synthetic */ e(int i10, String str, IOException iOException) {
        super(str + ", status code: " + i10, iOException);
    }

    public /* synthetic */ e(String str) {
        super(str);
    }
}
