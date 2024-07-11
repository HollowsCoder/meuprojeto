package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.List;

public final class k2 extends i2 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?> f3108c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.android.gms.internal.vision.g2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.vision.g2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.vision.g2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r5, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            java.lang.Object r8 = com.google.android.gms.internal.vision.b4.u(r5, r8)
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            java.lang.Object r1 = com.google.android.gms.internal.vision.b4.u(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0035
            boolean r2 = r1 instanceof com.google.android.gms.internal.vision.j2
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.vision.g2 r1 = new com.google.android.gms.internal.vision.g2
            r1.<init>((int) r0)
            goto L_0x007f
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.vision.h3
            if (r2 == 0) goto L_0x002f
            boolean r2 = r1 instanceof com.google.android.gms.internal.vision.a2
            if (r2 == 0) goto L_0x002f
            com.google.android.gms.internal.vision.a2 r1 = (com.google.android.gms.internal.vision.a2) r1
            com.google.android.gms.internal.vision.a2 r0 = r1.d(r0)
            goto L_0x007e
        L_0x002f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L_0x007f
        L_0x0035:
            java.lang.Class r2 = r1.getClass()
            java.lang.Class<?> r3 = f3108c
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L_0x004f
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            goto L_0x0062
        L_0x004f:
            boolean r2 = r1 instanceof com.google.android.gms.internal.vision.a4
            if (r2 == 0) goto L_0x0064
            com.google.android.gms.internal.vision.g2 r2 = new com.google.android.gms.internal.vision.g2
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.vision.a4 r1 = (com.google.android.gms.internal.vision.a4) r1
            r2.addAll(r1)
        L_0x0062:
            r1 = r2
            goto L_0x007f
        L_0x0064:
            boolean r2 = r1 instanceof com.google.android.gms.internal.vision.h3
            if (r2 == 0) goto L_0x0082
            boolean r2 = r1 instanceof com.google.android.gms.internal.vision.a2
            if (r2 == 0) goto L_0x0082
            r2 = r1
            com.google.android.gms.internal.vision.a2 r2 = (com.google.android.gms.internal.vision.a2) r2
            boolean r3 = r2.zza()
            if (r3 != 0) goto L_0x0082
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.vision.a2 r0 = r2.d(r1)
        L_0x007e:
            r1 = r0
        L_0x007f:
            com.google.android.gms.internal.vision.b4.j(r5, r7, r1)
        L_0x0082:
            int r0 = r1.size()
            int r2 = r8.size()
            if (r0 <= 0) goto L_0x0091
            if (r2 <= 0) goto L_0x0091
            r1.addAll(r8)
        L_0x0091:
            if (r0 <= 0) goto L_0x0094
            r8 = r1
        L_0x0094:
            com.google.android.gms.internal.vision.b4.j(r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.k2.a(long, java.lang.Object, java.lang.Object):void");
    }

    public final void b(long j8, Object obj) {
        Object obj2;
        List list = (List) b4.u(j8, obj);
        if (list instanceof j2) {
            obj2 = ((j2) list).c();
        } else {
            if (!f3108c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof h3) || !(list instanceof a2)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    a2 a2Var = (a2) list;
                    if (a2Var.zza()) {
                        a2Var.a();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        b4.j(j8, obj, obj2);
    }
}
