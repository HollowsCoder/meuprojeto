package com.google.android.gms.internal.vision;

public class h2 {

    /* renamed from: a  reason: collision with root package name */
    public volatile w2 f3095a;

    /* renamed from: b  reason: collision with root package name */
    public volatile w0 f3096b;

    static {
        d1.b();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.vision.w2 a(com.google.android.gms.internal.vision.w2 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.vision.w2 r0 = r1.f3095a
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            com.google.android.gms.internal.vision.w2 r0 = r1.f3095a     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000a
            goto L_0x0017
        L_0x000a:
            r1.f3095a = r2     // Catch:{ z1 -> 0x0011 }
            com.google.android.gms.internal.vision.z0 r0 = com.google.android.gms.internal.vision.w0.f3182p     // Catch:{ z1 -> 0x0011 }
            r1.f3096b = r0     // Catch:{ z1 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f3095a = r2     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.vision.z0 r2 = com.google.android.gms.internal.vision.w0.f3182p     // Catch:{ all -> 0x0019 }
            r1.f3096b = r2     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            com.google.android.gms.internal.vision.w2 r2 = r1.f3095a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.h2.a(com.google.android.gms.internal.vision.w2):com.google.android.gms.internal.vision.w2");
    }

    public final w0 b() {
        if (this.f3096b != null) {
            return this.f3096b;
        }
        synchronized (this) {
            if (this.f3096b != null) {
                w0 w0Var = this.f3096b;
                return w0Var;
            }
            this.f3096b = this.f3095a == null ? w0.f3182p : this.f3095a.j();
            w0 w0Var2 = this.f3096b;
            return w0Var2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        w2 w2Var = this.f3095a;
        w2 w2Var2 = h2Var.f3095a;
        return (w2Var == null && w2Var2 == null) ? b().equals(h2Var.b()) : (w2Var == null || w2Var2 == null) ? w2Var != null ? w2Var.equals(h2Var.a(w2Var.h())) : a(w2Var2.h()).equals(w2Var2) : w2Var.equals(w2Var2);
    }

    public int hashCode() {
        return 1;
    }
}
