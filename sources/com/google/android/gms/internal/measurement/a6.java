package com.google.android.gms.internal.measurement;

public final class a6 implements h7 {

    /* renamed from: a  reason: collision with root package name */
    public static final a6 f2613a = new a6();

    public final boolean a(Class<?> cls) {
        return f6.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.g7 b(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.measurement.f6> r0 = com.google.android.gms.internal.measurement.f6.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0024
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.getName()
            int r1 = r5.length()
            java.lang.String r2 = "Unsupported message type: "
            if (r1 == 0) goto L_0x001b
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0020
        L_0x001b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0020:
            r0.<init>(r5)
            throw r0
        L_0x0024:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0034 }
            com.google.android.gms.internal.measurement.f6 r0 = com.google.android.gms.internal.measurement.f6.o(r0)     // Catch:{ Exception -> 0x0034 }
            r1 = 3
            java.lang.Object r0 = r0.q(r1)     // Catch:{ Exception -> 0x0034 }
            com.google.android.gms.internal.measurement.g7 r0 = (com.google.android.gms.internal.measurement.g7) r0     // Catch:{ Exception -> 0x0034 }
            return r0
        L_0x0034:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            int r2 = r5.length()
            java.lang.String r3 = "Unable to get message info for "
            if (r2 == 0) goto L_0x0048
            java.lang.String r5 = r3.concat(r5)
            goto L_0x004d
        L_0x0048:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
        L_0x004d:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.a6.b(java.lang.Class):com.google.android.gms.internal.measurement.g7");
    }
}
