package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.clearcut.l4;
import s6.a;

public final class d4 {

    /* renamed from: c  reason: collision with root package name */
    public static d4 f2668c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2669a;

    /* renamed from: b  reason: collision with root package name */
    public final l4 f2670b;

    public d4() {
        this.f2669a = null;
        this.f2670b = null;
    }

    public d4(Context context) {
        this.f2669a = context;
        l4 l4Var = new l4();
        this.f2670b = l4Var;
        context.getContentResolver().registerContentObserver(y3.f2998a, true, l4Var);
    }

    public static d4 a(Context context) {
        d4 d4Var;
        synchronized (d4.class) {
            if (f2668c == null) {
                f2668c = a.q(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new d4(context) : new d4();
            }
            d4Var = f2668c;
        }
        return d4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        android.os.Binder.restoreCallingIdentity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0026, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        if (r5.length() == 0) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        r5 = "Unable to read GServices for: ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        r5 = new java.lang.String("Unable to read GServices for: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        android.util.Log.e("GservicesLoader", r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0026 A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException), Splitter:B:3:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(java.lang.String r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.f2669a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            androidx.appcompat.widget.m r0 = new androidx.appcompat.widget.m     // Catch:{ IllegalStateException -> 0x0026, SecurityException -> 0x0024 }
            r2 = 7
            r0.<init>(r2, r4, r5)     // Catch:{ IllegalStateException -> 0x0026, SecurityException -> 0x0024 }
            java.lang.Object r0 = r0.n()     // Catch:{ SecurityException -> 0x0011, IllegalStateException -> 0x0026 }
            goto L_0x001c
        L_0x0011:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch:{ IllegalStateException -> 0x0026, SecurityException -> 0x0024 }
            java.lang.Object r0 = r0.n()     // Catch:{ all -> 0x001f }
            android.os.Binder.restoreCallingIdentity(r2)     // Catch:{ IllegalStateException -> 0x0026, SecurityException -> 0x0024 }
        L_0x001c:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalStateException -> 0x0026, SecurityException -> 0x0024 }
            return r0
        L_0x001f:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch:{ IllegalStateException -> 0x0026, SecurityException -> 0x0024 }
            throw r0     // Catch:{ IllegalStateException -> 0x0026, SecurityException -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            goto L_0x0027
        L_0x0026:
            r0 = move-exception
        L_0x0027:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r2 = r5.length()
            java.lang.String r3 = "Unable to read GServices for: "
            if (r2 == 0) goto L_0x0038
            java.lang.String r5 = r3.concat(r5)
            goto L_0x003d
        L_0x0038:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
        L_0x003d:
            java.lang.String r2 = "GservicesLoader"
            android.util.Log.e(r2, r5, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d4.b(java.lang.String):java.lang.String");
    }
}
