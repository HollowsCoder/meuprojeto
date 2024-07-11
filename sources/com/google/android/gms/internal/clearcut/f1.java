package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.List;

public final class f1 extends e1 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?> f2418c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public final void a(long j8, Object obj) {
        Object obj2;
        List list = (List) a3.w(j8, obj);
        if (list instanceof d1) {
            obj2 = ((d1) list).S();
        } else {
            if (!f2418c.isAssignableFrom(list.getClass())) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                return;
            }
        }
        a3.j(j8, obj, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.google.android.gms.internal.clearcut.c1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.google.android.gms.internal.clearcut.c1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.google.android.gms.internal.clearcut.c1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r5, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.a3.w(r5, r8)
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.a3.w(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0026
            boolean r1 = r1 instanceof com.google.android.gms.internal.clearcut.d1
            if (r1 == 0) goto L_0x0020
            com.google.android.gms.internal.clearcut.c1 r1 = new com.google.android.gms.internal.clearcut.c1
            r1.<init>((int) r0)
            goto L_0x0055
        L_0x0020:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L_0x0055
        L_0x0026:
            java.lang.Class r2 = r1.getClass()
            java.lang.Class<?> r3 = f2418c
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L_0x0041
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x003f:
            r1 = r2
            goto L_0x0055
        L_0x0041:
            boolean r2 = r1 instanceof com.google.android.gms.internal.clearcut.x2
            if (r2 == 0) goto L_0x0058
            com.google.android.gms.internal.clearcut.c1 r2 = new com.google.android.gms.internal.clearcut.c1
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.clearcut.x2 r1 = (com.google.android.gms.internal.clearcut.x2) r1
            r2.addAll(r1)
            goto L_0x003f
        L_0x0055:
            com.google.android.gms.internal.clearcut.a3.j(r5, r7, r1)
        L_0x0058:
            int r0 = r1.size()
            int r2 = r8.size()
            if (r0 <= 0) goto L_0x0067
            if (r2 <= 0) goto L_0x0067
            r1.addAll(r8)
        L_0x0067:
            if (r0 <= 0) goto L_0x006a
            r8 = r1
        L_0x006a:
            com.google.android.gms.internal.clearcut.a3.j(r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.f1.b(long, java.lang.Object, java.lang.Object):void");
    }
}
