package r2;

import androidx.appcompat.widget.x0;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.m4;
import f3.h;
import f3.i;

public final class a implements h, i6 {
    public a() {
    }

    public /* synthetic */ a(Object obj) {
        Object obj2 = m4.f2821f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0054, code lost:
        r9 = com.google.android.gms.internal.measurement.q8.f2897a;
        r9 = r8[r2 - 1];
        r10 = r10 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005d, code lost:
        if (r10 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
        if (r10 == 1) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        if (r10 != 2) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0064, code lost:
        r10 = r8[r2];
        r8 = r8[r2 + 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0069, code lost:
        if (r9 > -12) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006b, code lost:
        if (r10 > -65) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006d, code lost:
        if (r8 <= -65) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0070, code lost:
        r9 = r9 ^ (r10 << 8);
        r8 = r8 << 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007b, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007c, code lost:
        r8 = r8[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007e, code lost:
        if (r9 > -12) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0080, code lost:
        if (r8 <= -65) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0083, code lost:
        r8 = r8 << 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0085, code lost:
        r9 = r8 ^ r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0088, code lost:
        if (r9 <= -12) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(byte[] r8, int r9, int r10) {
        /*
        L_0x0000:
            if (r9 >= r10) goto L_0x0009
            byte r0 = r8[r9]
            if (r0 < 0) goto L_0x0009
            int r9 = r9 + 1
            goto L_0x0000
        L_0x0009:
            r0 = 1
            r1 = 0
            if (r9 < r10) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            if (r9 < r10) goto L_0x0013
        L_0x0010:
            r9 = r1
            goto L_0x00a7
        L_0x0013:
            int r2 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x00ac
            r3 = -65
            r4 = -1
            r5 = -32
            if (r9 >= r5) goto L_0x002e
            if (r2 >= r10) goto L_0x00a7
            r5 = -62
            if (r9 < r5) goto L_0x00a6
            int r9 = r2 + 1
            byte r2 = r8[r2]
            if (r2 <= r3) goto L_0x000e
            goto L_0x00a6
        L_0x002e:
            r6 = -16
            if (r9 >= r6) goto L_0x0050
            int r6 = r10 + -1
            if (r2 < r6) goto L_0x0037
            goto L_0x0054
        L_0x0037:
            int r6 = r2 + 1
            byte r2 = r8[r2]
            if (r2 > r3) goto L_0x00a6
            r7 = -96
            if (r9 != r5) goto L_0x0043
            if (r2 < r7) goto L_0x00a6
        L_0x0043:
            r5 = -19
            if (r9 != r5) goto L_0x0049
            if (r2 >= r7) goto L_0x00a6
        L_0x0049:
            int r9 = r6 + 1
            byte r2 = r8[r6]
            if (r2 <= r3) goto L_0x000e
            goto L_0x00a6
        L_0x0050:
            int r5 = r10 + -2
            if (r2 < r5) goto L_0x008b
        L_0x0054:
            r2.a r9 = com.google.android.gms.internal.measurement.q8.f2897a
            int r9 = r2 + -1
            byte r9 = r8[r9]
            int r10 = r10 - r2
            r5 = -12
            if (r10 == 0) goto L_0x0088
            if (r10 == r0) goto L_0x007c
            r6 = 2
            if (r10 != r6) goto L_0x0076
            byte r10 = r8[r2]
            int r2 = r2 + r0
            byte r8 = r8[r2]
            if (r9 > r5) goto L_0x00a6
            if (r10 > r3) goto L_0x00a6
            if (r8 <= r3) goto L_0x0070
            goto L_0x008a
        L_0x0070:
            int r10 = r10 << 8
            r9 = r9 ^ r10
            int r8 = r8 << 16
            goto L_0x0085
        L_0x0076:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L_0x007c:
            byte r8 = r8[r2]
            if (r9 > r5) goto L_0x00a6
            if (r8 <= r3) goto L_0x0083
            goto L_0x008a
        L_0x0083:
            int r8 = r8 << 8
        L_0x0085:
            r8 = r8 ^ r9
            r9 = r8
            goto L_0x00a7
        L_0x0088:
            if (r9 <= r5) goto L_0x00a7
        L_0x008a:
            goto L_0x00a6
        L_0x008b:
            int r5 = r2 + 1
            byte r2 = r8[r2]
            if (r2 > r3) goto L_0x00a6
            int r9 = r9 << 28
            int r2 = r2 + 112
            int r2 = r2 + r9
            int r9 = r2 >> 30
            if (r9 != 0) goto L_0x00a6
            int r9 = r5 + 1
            byte r2 = r8[r5]
            if (r2 > r3) goto L_0x00a6
            int r2 = r9 + 1
            byte r9 = r8[r9]
            if (r9 <= r3) goto L_0x00ac
        L_0x00a6:
            r9 = r4
        L_0x00a7:
            if (r9 != 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r0 = r1
        L_0x00ab:
            return r0
        L_0x00ac:
            r9 = r2
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.a.c(byte[], int, int):boolean");
    }

    public final void a(i iVar) {
    }

    public final void b(i iVar) {
        iVar.k();
    }

    public /* synthetic */ a(x0 x0Var) {
    }
}
