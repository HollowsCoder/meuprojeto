package com.google.android.gms.internal.measurement;

import androidx.activity.result.c;

public final class z4 {

    /* renamed from: a  reason: collision with root package name */
    public static final c f3021a;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
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
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x0046 }
            java.lang.String r3 = "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception."
            r2.println(r3)     // Catch:{ all -> 0x0046 }
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x0046 }
            r1.printStackTrace(r2)     // Catch:{ all -> 0x0046 }
        L_0x0022:
            if (r0 == 0) goto L_0x0032
            int r1 = r0.intValue()     // Catch:{ all -> 0x0046 }
            r2 = 19
            if (r1 < r2) goto L_0x0032
            com.google.android.gms.internal.measurement.y4 r1 = new com.google.android.gms.internal.measurement.y4     // Catch:{ all -> 0x0046 }
            r1.<init>()     // Catch:{ all -> 0x0046 }
            goto L_0x0078
        L_0x0032:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0040
            com.google.android.gms.internal.measurement.w4 r1 = new com.google.android.gms.internal.measurement.w4     // Catch:{ all -> 0x0046 }
            r1.<init>()     // Catch:{ all -> 0x0046 }
            goto L_0x0078
        L_0x0040:
            com.google.android.gms.internal.measurement.x4 r1 = new com.google.android.gms.internal.measurement.x4     // Catch:{ all -> 0x0046 }
            r1.<init>()     // Catch:{ all -> 0x0046 }
            goto L_0x0078
        L_0x0046:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.measurement.x4> r3 = com.google.android.gms.internal.measurement.x4.class
            java.lang.String r3 = r3.getName()
            int r4 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 133
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
            com.google.android.gms.internal.measurement.x4 r1 = new com.google.android.gms.internal.measurement.x4
            r1.<init>()
        L_0x0078:
            f3021a = r1
            if (r0 != 0) goto L_0x007d
            return
        L_0x007d:
            r0.intValue()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.z4.<clinit>():void");
    }
}