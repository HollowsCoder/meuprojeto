package com.google.android.gms.internal.vision;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final androidx.activity.result.c f3066a;

    public static final class a extends androidx.activity.result.c {
        public final void w(Exception exc) {
            exc.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0015 }
            java.lang.String r2 = "SDK_INT"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ Exception -> 0x0015 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x0015 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0015 }
            r0 = r1
            goto L_0x0022
        L_0x0015:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception."
            r2.println(r3)     // Catch:{ all -> 0x0048 }
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x0048 }
            r1.printStackTrace(r2)     // Catch:{ all -> 0x0048 }
        L_0x0022:
            if (r0 == 0) goto L_0x0032
            int r1 = r0.intValue()     // Catch:{ all -> 0x0048 }
            r2 = 19
            if (r1 < r2) goto L_0x0032
            com.google.android.gms.internal.vision.u r1 = new com.google.android.gms.internal.vision.u     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
            goto L_0x007a
        L_0x0032:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch:{ all -> 0x0048 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0042
            com.google.android.gms.internal.vision.e r1 = new com.google.android.gms.internal.vision.e     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
            goto L_0x007a
        L_0x0042:
            com.google.android.gms.internal.vision.c$a r1 = new com.google.android.gms.internal.vision.c$a     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
            goto L_0x007a
        L_0x0048:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.vision.c$a> r3 = com.google.android.gms.internal.vision.c.a.class
            java.lang.String r3 = r3.getName()
            int r4 = r3.length()
            int r4 = r4 + 133
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "will be used. The error is: "
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            com.google.android.gms.internal.vision.c$a r1 = new com.google.android.gms.internal.vision.c$a
            r1.<init>()
        L_0x007a:
            f3066a = r1
            if (r0 != 0) goto L_0x007f
            goto L_0x0082
        L_0x007f:
            r0.intValue()
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.c.<clinit>():void");
    }
}
