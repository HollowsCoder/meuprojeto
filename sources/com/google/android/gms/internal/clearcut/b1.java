package com.google.android.gms.internal.clearcut;

public class b1 {

    /* renamed from: a  reason: collision with root package name */
    public volatile r1 f2389a;

    /* renamed from: b  reason: collision with root package name */
    public volatile u f2390b;

    static {
        int i10 = b0.f2388a;
        Class<?> cls = a0.f2360a;
        if (cls != null) {
            try {
                b0 b0Var = (b0) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public final int a() {
        if (this.f2390b != null) {
            return this.f2390b.size();
        }
        if (this.f2389a != null) {
            return this.f2389a.l();
        }
        return 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.clearcut.r1 b(com.google.android.gms.internal.clearcut.r1 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.clearcut.r1 r0 = r1.f2389a
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            com.google.android.gms.internal.clearcut.r1 r0 = r1.f2389a     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000a
            goto L_0x0017
        L_0x000a:
            r1.f2389a = r2     // Catch:{ v0 -> 0x0011 }
            com.google.android.gms.internal.clearcut.w r0 = com.google.android.gms.internal.clearcut.u.f2544p     // Catch:{ v0 -> 0x0011 }
            r1.f2390b = r0     // Catch:{ v0 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f2389a = r2     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.clearcut.w r2 = com.google.android.gms.internal.clearcut.u.f2544p     // Catch:{ all -> 0x0019 }
            r1.f2390b = r2     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            com.google.android.gms.internal.clearcut.r1 r2 = r1.f2389a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.b1.b(com.google.android.gms.internal.clearcut.r1):com.google.android.gms.internal.clearcut.r1");
    }

    public final u c() {
        if (this.f2390b != null) {
            return this.f2390b;
        }
        synchronized (this) {
            if (this.f2390b != null) {
                u uVar = this.f2390b;
                return uVar;
            }
            this.f2390b = this.f2389a == null ? u.f2544p : this.f2389a.h();
            u uVar2 = this.f2390b;
            return uVar2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        r1 r1Var = this.f2389a;
        r1 r1Var2 = b1Var.f2389a;
        return (r1Var == null && r1Var2 == null) ? c().equals(b1Var.c()) : (r1Var == null || r1Var2 == null) ? r1Var != null ? r1Var.equals(b1Var.b(r1Var.d())) : b(r1Var2.d()).equals(r1Var2) : r1Var.equals(r1Var2);
    }

    public int hashCode() {
        return 1;
    }
}
