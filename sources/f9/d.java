package f9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import n.e;
import z8.g;

public class d extends e {
    public static final List M(Object[] objArr) {
        g.f(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        g.e(asList, "asList(this)");
        return asList;
    }

    public static final void N(int i10, int i11, int i12, byte[] bArr, byte[] bArr2) {
        g.f(bArr, "<this>");
        g.f(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
    }

    public static void O(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        g.f(objArr, "<this>");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    public static final byte[] P(byte[] bArr, int i10, int i11) {
        g.f(bArr, "<this>");
        int length = bArr.length;
        if (i11 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
            g.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is greater than size (" + length + ").");
    }

    public static final ArrayList Q(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final char R(char[] cArr) {
        g.f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a1, code lost:
        if (r9 != null) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String S(java.lang.String r13) {
        /*
            java.lang.String r0 = "<this>"
            z8.g.f(r13, r0)
            java.lang.String r0 = "|"
            boolean r1 = f9.h.W(r0)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00cf
            java.lang.String r1 = "\r\n"
            java.lang.String r2 = "\n"
            java.lang.String r3 = "\r"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
            r2 = 0
            f9.l.m0(r2)
            java.util.List r1 = M(r1)
            f9.b r3 = new f9.b
            f9.j r4 = new f9.j
            r4.<init>(r1, r2)
            r3.<init>(r13, r2, r2, r4)
            f9.k r1 = new f9.k
            r1.<init>(r13)
            e9.i r4 = new e9.i
            r4.<init>(r3, r1)
            java.util.List r1 = e9.e.w(r4)
            int r13 = r13.length()
            int r3 = r1.size()
            int r3 = r3 * r2
            int r3 = r3 + r13
            int r13 = r1.size()
            r4 = -1
            int r13 = r13 + r4
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
            r6 = r2
        L_0x0055:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r1.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L_0x00ab
            java.lang.String r7 = (java.lang.String) r7
            r9 = 0
            if (r6 == 0) goto L_0x006a
            if (r6 != r13) goto L_0x0072
        L_0x006a:
            boolean r6 = f9.h.W(r7)
            if (r6 == 0) goto L_0x0072
        L_0x0070:
            r7 = r9
            goto L_0x00a4
        L_0x0072:
            int r6 = r7.length()
            r10 = r2
        L_0x0077:
            if (r10 >= r6) goto L_0x0089
            char r11 = r7.charAt(r10)
            boolean r11 = p9.u.i(r11)
            r11 = r11 ^ 1
            if (r11 == 0) goto L_0x0086
            goto L_0x008a
        L_0x0086:
            int r10 = r10 + 1
            goto L_0x0077
        L_0x0089:
            r10 = r4
        L_0x008a:
            if (r10 != r4) goto L_0x008d
            goto L_0x00a1
        L_0x008d:
            boolean r6 = f9.h.Z(r10, r7, r0, r2)
            if (r6 == 0) goto L_0x00a1
            int r6 = r0.length()
            int r6 = r6 + r10
            java.lang.String r9 = r7.substring(r6)
            java.lang.String r6 = "this as java.lang.String).substring(startIndex)"
            z8.g.e(r9, r6)
        L_0x00a1:
            if (r9 == 0) goto L_0x00a4
            goto L_0x0070
        L_0x00a4:
            if (r7 == 0) goto L_0x00a9
            r5.add(r7)
        L_0x00a9:
            r6 = r8
            goto L_0x0055
        L_0x00ab:
            java.lang.ArithmeticException r13 = new java.lang.ArithmeticException
            java.lang.String r0 = "Index overflow has happened."
            r13.<init>(r0)
            throw r13
        L_0x00b3:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r3)
            java.lang.String r7 = "\n"
            java.lang.String r9 = ""
            r10 = -1
            java.lang.String r11 = "..."
            r12 = 0
            r6 = r13
            r8 = r9
            o8.i.w(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            z8.g.e(r13, r0)
            return r13
        L_0x00cf:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "marginPrefix must be non-blank string."
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.d.S(java.lang.String):java.lang.String");
    }
}
