package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import r2.a;

public abstract class m4<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f2821f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static volatile z3 f2822g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicInteger f2823h = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final k4 f2824a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2825b;

    /* renamed from: c  reason: collision with root package name */
    public final T f2826c;
    public volatile int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public volatile T f2827e;

    static {
        new AtomicReference();
        new a((Object) null);
    }

    public /* synthetic */ m4(k4 k4Var, String str, Object obj) {
        if (k4Var.f2769a != null) {
            this.f2824a = k4Var;
            this.f2825b = str;
            this.f2826c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public abstract Object a(String str);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5 A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6 A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d6 A[Catch:{ all -> 0x0062 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T b() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f2823h
            int r0 = r0.get()
            int r1 = r7.d
            if (r1 >= r0) goto L_0x012e
            monitor-enter(r7)
            int r1 = r7.d     // Catch:{ all -> 0x0062 }
            if (r1 >= r0) goto L_0x012a
            com.google.android.gms.internal.measurement.z3 r1 = f2822g     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x0124
            com.google.android.gms.internal.measurement.k4 r2 = r7.f2824a     // Catch:{ all -> 0x0062 }
            r2.getClass()     // Catch:{ all -> 0x0062 }
            android.content.Context r2 = r1.f3019a     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.d4 r2 = com.google.android.gms.internal.measurement.d4.a(r2)     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.String r2 = r2.b(r3)     // Catch:{ all -> 0x0062 }
            r3 = 0
            if (r2 == 0) goto L_0x0065
            java.util.regex.Pattern r4 = com.google.android.gms.internal.measurement.y3.f2999b     // Catch:{ all -> 0x0062 }
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch:{ all -> 0x0062 }
            boolean r2 = r2.matches()     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x0065
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x00a2
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            com.google.android.gms.internal.measurement.k4 r5 = r7.f2824a     // Catch:{ all -> 0x0062 }
            r5.getClass()     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = r7.f2825b     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0062 }
            int r6 = r5.length()     // Catch:{ all -> 0x0062 }
            if (r6 == 0) goto L_0x0058
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0062 }
            goto L_0x005e
        L_0x0058:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0062 }
            r5.<init>(r4)     // Catch:{ all -> 0x0062 }
            r4 = r5
        L_0x005e:
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x0062 }
            goto L_0x00a2
        L_0x0062:
            r0 = move-exception
            goto L_0x012c
        L_0x0065:
            com.google.android.gms.internal.measurement.k4 r2 = r7.f2824a     // Catch:{ all -> 0x0062 }
            android.net.Uri r2 = r2.f2769a     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x0121
            android.content.Context r4 = r1.f3019a     // Catch:{ all -> 0x0062 }
            boolean r2 = com.google.android.gms.internal.measurement.f4.a(r4, r2)     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x0087
            com.google.android.gms.internal.measurement.k4 r2 = r7.f2824a     // Catch:{ all -> 0x0062 }
            r2.getClass()     // Catch:{ all -> 0x0062 }
            android.content.Context r2 = r1.f3019a     // Catch:{ all -> 0x0062 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.k4 r4 = r7.f2824a     // Catch:{ all -> 0x0062 }
            android.net.Uri r4 = r4.f2769a     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.b4 r2 = com.google.android.gms.internal.measurement.b4.a(r2, r4)     // Catch:{ all -> 0x0062 }
            goto L_0x0088
        L_0x0087:
            r2 = r3
        L_0x0088:
            if (r2 == 0) goto L_0x00a2
            com.google.android.gms.internal.measurement.k4 r4 = r7.f2824a     // Catch:{ all -> 0x0062 }
            r4.getClass()     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = r7.f2825b     // Catch:{ all -> 0x0062 }
            java.util.Map r2 = r2.b()     // Catch:{ all -> 0x0062 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r7.a(r2)     // Catch:{ all -> 0x0062 }
            goto L_0x00a3
        L_0x00a2:
            r2 = r3
        L_0x00a3:
            if (r2 == 0) goto L_0x00a6
            goto L_0x00c8
        L_0x00a6:
            com.google.android.gms.internal.measurement.k4 r2 = r7.f2824a     // Catch:{ all -> 0x0062 }
            r2.getClass()     // Catch:{ all -> 0x0062 }
            android.content.Context r2 = r1.f3019a     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.d4 r2 = com.google.android.gms.internal.measurement.d4.a(r2)     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.k4 r4 = r7.f2824a     // Catch:{ all -> 0x0062 }
            r4.getClass()     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = r7.f2825b     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = r2.b(r4)     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x00c3
            java.lang.Object r2 = r7.a(r2)     // Catch:{ all -> 0x0062 }
            goto L_0x00c4
        L_0x00c3:
            r2 = r3
        L_0x00c4:
            if (r2 != 0) goto L_0x00c8
            T r2 = r7.f2826c     // Catch:{ all -> 0x0062 }
        L_0x00c8:
            com.google.android.gms.internal.measurement.r4<com.google.android.gms.internal.measurement.p4<com.google.android.gms.internal.measurement.e4>> r1 = r1.f3020b     // Catch:{ all -> 0x0062 }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.p4 r1 = (com.google.android.gms.internal.measurement.p4) r1     // Catch:{ all -> 0x0062 }
            boolean r4 = r1.a()     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x011c
            java.lang.Object r1 = r1.b()     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.e4 r1 = (com.google.android.gms.internal.measurement.e4) r1     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.measurement.k4 r2 = r7.f2824a     // Catch:{ all -> 0x0062 }
            android.net.Uri r2 = r2.f2769a     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = r7.f2825b     // Catch:{ all -> 0x0062 }
            r1.getClass()     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x0113
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0062 }
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r1 = r1.f2684a     // Catch:{ all -> 0x0062 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0062 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x00f6
            goto L_0x0113
        L_0x00f6:
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0062 }
            int r3 = r2.length()     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0107
            java.lang.String r2 = r4.concat(r2)     // Catch:{ all -> 0x0062 }
            goto L_0x010c
        L_0x0107:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0062 }
            r2.<init>(r4)     // Catch:{ all -> 0x0062 }
        L_0x010c:
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0062 }
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0062 }
        L_0x0113:
            if (r3 != 0) goto L_0x0118
            T r2 = r7.f2826c     // Catch:{ all -> 0x0062 }
            goto L_0x011c
        L_0x0118:
            java.lang.Object r2 = r7.a(r3)     // Catch:{ all -> 0x0062 }
        L_0x011c:
            r7.f2827e = r2     // Catch:{ all -> 0x0062 }
            r7.d = r0     // Catch:{ all -> 0x0062 }
            goto L_0x012a
        L_0x0121:
            n.b r0 = com.google.android.gms.internal.measurement.n4.f2843a     // Catch:{ all -> 0x0062 }
            throw r3     // Catch:{ all -> 0x0062 }
        L_0x0124:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0062 }
            r0.<init>(r2)     // Catch:{ all -> 0x0062 }
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x012a:
            monitor-exit(r7)     // Catch:{ all -> 0x0062 }
            goto L_0x012e
        L_0x012c:
            monitor-exit(r7)     // Catch:{ all -> 0x0062 }
            throw r0
        L_0x012e:
            T r0 = r7.f2827e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.m4.b():java.lang.Object");
    }
}
