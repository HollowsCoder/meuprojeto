package q4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.ConcurrentHashMap;
import n4.h0;
import n4.m;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f8226b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f8227c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<ServiceConnection, ServiceConnection> f8228a = new ConcurrentHashMap<>();

    @RecentlyNonNull
    public static a b() {
        if (f8227c == null) {
            synchronized (f8226b) {
                if (f8227c == null) {
                    f8227c = new a();
                }
            }
        }
        a aVar = f8227c;
        m.h(aVar);
        return aVar;
    }

    @RecentlyNonNull
    public final boolean a(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull int i10) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i10);
    }

    @SuppressLint({"UntrackedBindService"})
    public final void c(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof h0)) {
            ConcurrentHashMap<ServiceConnection, ServiceConnection> concurrentHashMap = this.f8228a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService(concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException unused2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    @androidx.annotation.RecentlyNonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(@androidx.annotation.RecentlyNonNull android.content.Context r6, @androidx.annotation.RecentlyNonNull java.lang.String r7, @androidx.annotation.RecentlyNonNull android.content.Intent r8, @androidx.annotation.RecentlyNonNull android.content.ServiceConnection r9, @androidx.annotation.RecentlyNonNull int r10) {
        /*
            r5 = this;
            android.content.ComponentName r0 = r8.getComponent()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0009
            goto L_0x0023
        L_0x0009:
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r3 = "com.google.android.gms"
            r3.equals(r0)
            t4.b r3 = t4.c.a(r6)     // Catch:{ NameNotFoundException -> 0x0023 }
            android.content.pm.ApplicationInfo r0 = r3.a(r0, r2)     // Catch:{ NameNotFoundException -> 0x0023 }
            int r0 = r0.flags     // Catch:{ NameNotFoundException -> 0x0023 }
            r3 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0023
            r0 = r1
            goto L_0x0024
        L_0x0023:
            r0 = r2
        L_0x0024:
            java.lang.String r3 = "ConnectionTracker"
            if (r0 == 0) goto L_0x002e
            java.lang.String r6 = "Attempted to bind to a service in a STOPPED package."
            android.util.Log.w(r3, r6)
            goto L_0x006a
        L_0x002e:
            boolean r0 = r9 instanceof n4.h0
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0065
            java.util.concurrent.ConcurrentHashMap<android.content.ServiceConnection, android.content.ServiceConnection> r0 = r5.f8228a
            java.lang.Object r4 = r0.putIfAbsent(r9, r9)
            android.content.ServiceConnection r4 = (android.content.ServiceConnection) r4
            if (r4 == 0) goto L_0x0056
            if (r9 == r4) goto L_0x0056
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r9
            r4[r1] = r7
            r7 = 2
            java.lang.String r1 = r8.getAction()
            r4[r7] = r1
            java.lang.String r7 = "Duplicate binding with the same ServiceConnection: %s, %s, %s."
            java.lang.String r7 = java.lang.String.format(r7, r4)
            android.util.Log.w(r3, r7)
        L_0x0056:
            boolean r6 = r6.bindService(r8, r9, r10)     // Catch:{ all -> 0x0060 }
            if (r6 != 0) goto L_0x0069
            r0.remove(r9, r9)
            goto L_0x0069
        L_0x0060:
            r6 = move-exception
            r0.remove(r9, r9)
            throw r6
        L_0x0065:
            boolean r6 = r6.bindService(r8, r9, r10)
        L_0x0069:
            r2 = r6
        L_0x006a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.a.d(android.content.Context, java.lang.String, android.content.Intent, android.content.ServiceConnection, int):boolean");
    }
}
