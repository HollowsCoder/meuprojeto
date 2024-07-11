package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class u6 extends w6 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?> f2954c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public final void a(long j8, Object obj) {
        Object obj2;
        List list = (List) o8.p(j8, obj);
        if (list instanceof t6) {
            obj2 = ((t6) list).g();
        } else {
            if (!f2954c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof p7) || !(list instanceof m6)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    m6 m6Var = (m6) list;
                    if (m6Var.zza()) {
                        m6Var.a();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        o8.q(j8, obj, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.measurement.s6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.measurement.s6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.measurement.s6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r5, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            java.lang.Object r8 = com.google.android.gms.internal.measurement.o8.p(r5, r8)
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            java.lang.Object r1 = com.google.android.gms.internal.measurement.o8.p(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0036
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.t6
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.measurement.s6 r1 = new com.google.android.gms.internal.measurement.s6
            r1.<init>((int) r0)
            goto L_0x0069
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.p7
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.m6
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.internal.measurement.m6 r1 = (com.google.android.gms.internal.measurement.m6) r1
            com.google.android.gms.internal.measurement.m6 r0 = r1.x(r0)
        L_0x002e:
            r1 = r0
            goto L_0x0069
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L_0x0069
        L_0x0036:
            java.lang.Class r2 = r1.getClass()
            java.lang.Class<?> r3 = f2954c
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L_0x0051
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x004f:
            r1 = r2
            goto L_0x0069
        L_0x0051:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.j8
            if (r2 == 0) goto L_0x006d
            com.google.android.gms.internal.measurement.s6 r2 = new com.google.android.gms.internal.measurement.s6
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.measurement.j8 r1 = (com.google.android.gms.internal.measurement.j8) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L_0x004f
        L_0x0069:
            com.google.android.gms.internal.measurement.o8.q(r5, r7, r1)
            goto L_0x0088
        L_0x006d:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.p7
            if (r2 == 0) goto L_0x0088
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.m6
            if (r2 == 0) goto L_0x0088
            r2 = r1
            com.google.android.gms.internal.measurement.m6 r2 = (com.google.android.gms.internal.measurement.m6) r2
            boolean r3 = r2.zza()
            if (r3 != 0) goto L_0x0088
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.measurement.m6 r0 = r2.x(r1)
            goto L_0x002e
        L_0x0088:
            int r0 = r1.size()
            int r2 = r8.size()
            if (r0 <= 0) goto L_0x0097
            if (r2 <= 0) goto L_0x0097
            r1.addAll(r8)
        L_0x0097:
            if (r0 > 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r8 = r1
        L_0x009b:
            com.google.android.gms.internal.measurement.o8.q(r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.u6.b(long, java.lang.Object, java.lang.Object):void");
    }
}
