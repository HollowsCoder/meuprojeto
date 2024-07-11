package com.google.android.gms.internal.measurement;

public class r6 {

    /* renamed from: a  reason: collision with root package name */
    public volatile i7 f2906a;

    /* renamed from: b  reason: collision with root package name */
    public volatile k5 f2907b;

    static {
        r5.a();
    }

    public final k5 a() {
        if (this.f2907b != null) {
            return this.f2907b;
        }
        synchronized (this) {
            if (this.f2907b != null) {
                k5 k5Var = this.f2907b;
                return k5Var;
            }
            this.f2907b = this.f2906a == null ? k5.f2770p : this.f2906a.c();
            k5 k5Var2 = this.f2907b;
            return k5Var2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.google.android.gms.internal.measurement.i7 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.i7 r0 = r1.f2906a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.i7 r0 = r1.f2906a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f2906a = r2     // Catch:{ p6 -> 0x0011 }
            com.google.android.gms.internal.measurement.j5 r0 = com.google.android.gms.internal.measurement.k5.f2770p     // Catch:{ p6 -> 0x0011 }
            r1.f2907b = r0     // Catch:{ p6 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f2906a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.measurement.j5 r2 = com.google.android.gms.internal.measurement.k5.f2770p     // Catch:{ all -> 0x001b }
            r1.f2907b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.r6.b(com.google.android.gms.internal.measurement.i7):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        i7 i7Var = this.f2906a;
        i7 i7Var2 = r6Var.f2906a;
        if (i7Var == null && i7Var2 == null) {
            return a().equals(r6Var.a());
        }
        if (i7Var != null && i7Var2 != null) {
            return i7Var.equals(i7Var2);
        }
        if (i7Var != null) {
            r6Var.b(i7Var.h());
            return i7Var.equals(r6Var.f2906a);
        }
        b(i7Var2.h());
        return this.f2906a.equals(i7Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
