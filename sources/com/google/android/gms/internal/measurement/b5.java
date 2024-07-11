package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import com.google.android.gms.internal.measurement.a5;
import com.google.android.gms.internal.measurement.b5;
import java.io.IOException;
import java.util.logging.Logger;

public abstract class b5<MessageType extends b5<MessageType, BuilderType>, BuilderType extends a5<MessageType, BuilderType>> implements i7 {
    protected int zzb = 0;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(java.lang.Iterable r6, com.google.android.gms.internal.measurement.m6 r7) {
        /*
            java.nio.charset.Charset r0 = com.google.android.gms.internal.measurement.n6.f2844a
            r6.getClass()
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.t6
            java.lang.String r1 = " is null."
            java.lang.String r2 = "Element at index "
            r3 = 37
            if (r0 == 0) goto L_0x0065
            com.google.android.gms.internal.measurement.t6 r6 = (com.google.android.gms.internal.measurement.t6) r6
            java.util.List r6 = r6.f()
            r0 = r7
            com.google.android.gms.internal.measurement.t6 r0 = (com.google.android.gms.internal.measurement.t6) r0
            int r7 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0020:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00c1
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x0055
            int r6 = r0.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r2)
            int r6 = r6 - r7
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            int r1 = r0.size()
        L_0x0047:
            int r1 = r1 + -1
            if (r1 < r7) goto L_0x004f
            r0.remove(r1)
            goto L_0x0047
        L_0x004f:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x0055:
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.k5
            if (r5 == 0) goto L_0x005f
            com.google.android.gms.internal.measurement.k5 r4 = (com.google.android.gms.internal.measurement.k5) r4
            r0.s(r4)
            goto L_0x0020
        L_0x005f:
            java.lang.String r4 = (java.lang.String) r4
            r0.add(r4)
            goto L_0x0020
        L_0x0065:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.p7
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0080
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0080
            r0 = r7
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r4 = r7.size()
            int r5 = r6.size()
            int r5 = r5 + r4
            r0.ensureCapacity(r5)
        L_0x0080:
            int r0 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0088:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00c1
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x00bd
            int r6 = r7.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r2)
            int r6 = r6 - r0
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            int r1 = r7.size()
        L_0x00af:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x00b7
            r7.remove(r1)
            goto L_0x00af
        L_0x00b7:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x00bd:
            r7.add(r4)
            goto L_0x0088
        L_0x00c1:
            return
        L_0x00c2:
            r7.addAll(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b5.g(java.lang.Iterable, com.google.android.gms.internal.measurement.m6):void");
    }

    public final byte[] a() {
        try {
            f6 f6Var = (f6) this;
            int d = f6Var.d();
            byte[] bArr = new byte[d];
            Logger logger = n5.T;
            l5 l5Var = new l5(bArr, d);
            t7<?> a10 = q7.f2894c.a(f6Var.getClass());
            o5 o5Var = l5Var.S;
            if (o5Var == null) {
                o5Var = new o5(l5Var);
            }
            a10.h(f6Var, o5Var);
            if (d - l5Var.X == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException(x0.f(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public int b() {
        throw null;
    }

    public final j5 c() {
        try {
            f6 f6Var = (f6) this;
            int d = f6Var.d();
            j5 j5Var = k5.f2770p;
            byte[] bArr = new byte[d];
            Logger logger = n5.T;
            l5 l5Var = new l5(bArr, d);
            t7<?> a10 = q7.f2894c.a(f6Var.getClass());
            o5 o5Var = l5Var.S;
            if (o5Var == null) {
                o5Var = new o5(l5Var);
            }
            a10.h(f6Var, o5Var);
            if (d - l5Var.X == 0) {
                return new j5(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException(x0.f(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public void f(int i10) {
        throw null;
    }
}
