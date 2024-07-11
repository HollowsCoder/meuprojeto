package androidx.navigation;

public final class o {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0020 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.navigation.NavController a(android.view.View r4) {
        /*
            r0 = r4
        L_0x0001:
            r1 = 0
            if (r0 == 0) goto L_0x002f
            r2 = 2131362162(0x7f0a0172, float:1.8344097E38)
            java.lang.Object r2 = r0.getTag(r2)
            boolean r3 = r2 instanceof java.lang.ref.WeakReference
            if (r3 == 0) goto L_0x0016
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            goto L_0x001a
        L_0x0016:
            boolean r3 = r2 instanceof androidx.navigation.NavController
            if (r3 == 0) goto L_0x001d
        L_0x001a:
            androidx.navigation.NavController r2 = (androidx.navigation.NavController) r2
            goto L_0x001e
        L_0x001d:
            r2 = r1
        L_0x001e:
            if (r2 == 0) goto L_0x0022
            r1 = r2
            goto L_0x002f
        L_0x0022:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L_0x002d
            android.view.View r0 = (android.view.View) r0
            goto L_0x0001
        L_0x002d:
            r0 = r1
            goto L_0x0001
        L_0x002f:
            if (r1 == 0) goto L_0x0032
            return r1
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "View "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " does not have a NavController set"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.o.a(android.view.View):androidx.navigation.NavController");
    }
}
