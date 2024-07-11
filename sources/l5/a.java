package l5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import n.e;
import n4.m;
import r4.i;
import r4.k;
import t4.c;

public final class a {

    /* renamed from: j  reason: collision with root package name */
    public static ScheduledExecutorService f6953j;

    /* renamed from: a  reason: collision with root package name */
    public final a f6954a = this;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f6955b;

    /* renamed from: c  reason: collision with root package name */
    public final WorkSource f6956c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f6957e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6958f = true;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f6959g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public int f6960h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f6961i;

    public a(Context context) {
        e eVar;
        WorkSource workSource;
        String str;
        String str2;
        String str3;
        String packageName = context.getPackageName();
        Collections.synchronizedSet(new HashSet());
        this.f6961i = new AtomicInteger(0);
        m.f("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
        this.f6957e = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str3 = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str3 = new String("*gcore*:");
            }
            this.d = str3;
        } else {
            this.d = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        this.f6955b = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (k.a(context)) {
            packageName = i.a(packageName) ? context.getPackageName() : packageName;
            if (!(context.getPackageManager() == null || packageName == null)) {
                try {
                    ApplicationInfo a10 = c.a(context).a(packageName, 0);
                    if (a10 == null) {
                        str2 = "Could not get applicationInfo from package: ";
                        if (packageName.length() == 0) {
                            str = new String(str2);
                            Log.e("WorkSourceUtil", str);
                        }
                        str = str2.concat(packageName);
                        Log.e("WorkSourceUtil", str);
                    } else {
                        int i10 = a10.uid;
                        workSource = new WorkSource();
                        Method method = k.f8438b;
                        if (method != null) {
                            try {
                                method.invoke(workSource, new Object[]{Integer.valueOf(i10), packageName});
                            } catch (Exception e10) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                            }
                            this.f6956c = workSource;
                            if (workSource != null && k.a(this.f6957e)) {
                                workSource.add(workSource);
                                this.f6955b.setWorkSource(workSource);
                            }
                        } else {
                            Method method2 = k.f8437a;
                            if (method2 != null) {
                                method2.invoke(workSource, new Object[]{Integer.valueOf(i10)});
                            }
                            this.f6956c = workSource;
                            workSource.add(workSource);
                            this.f6955b.setWorkSource(workSource);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    str2 = "Could not find package: ";
                    if (packageName.length() == 0) {
                        str = new String(str2);
                    }
                }
            }
            workSource = null;
            this.f6956c = workSource;
            workSource.add(workSource);
            try {
                this.f6955b.setWorkSource(workSource);
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e11) {
                Log.wtf("WakeLock", e11.toString());
            }
        }
        if (f6953j == null) {
            synchronized (p4.a.class) {
                if (p4.a.f7919a == null) {
                    p4.a.f7919a = new e();
                }
                eVar = p4.a.f7919a;
            }
            eVar.getClass();
            f6953j = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r3 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r7.f6960h == 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        q4.b.a(r7.f6955b, (java.lang.String) null);
        c();
        r7.f6960h++;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r7.f6961i
            r0.incrementAndGet()
            boolean r0 = r7.f6958f
            r1 = 0
            if (r0 == 0) goto L_0x000d
            android.text.TextUtils.isEmpty(r1)
        L_0x000d:
            l5.a r0 = r7.f6954a
            monitor-enter(r0)
            java.util.HashMap r2 = r7.f6959g     // Catch:{ all -> 0x0088 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0088 }
            r3 = 0
            if (r2 == 0) goto L_0x001d
            int r2 = r7.f6960h     // Catch:{ all -> 0x0088 }
            if (r2 <= 0) goto L_0x002c
        L_0x001d:
            android.os.PowerManager$WakeLock r2 = r7.f6955b     // Catch:{ all -> 0x0088 }
            boolean r2 = r2.isHeld()     // Catch:{ all -> 0x0088 }
            if (r2 != 0) goto L_0x002c
            java.util.HashMap r2 = r7.f6959g     // Catch:{ all -> 0x0088 }
            r2.clear()     // Catch:{ all -> 0x0088 }
            r7.f6960h = r3     // Catch:{ all -> 0x0088 }
        L_0x002c:
            boolean r2 = r7.f6958f     // Catch:{ all -> 0x0088 }
            r4 = 1
            if (r2 == 0) goto L_0x0059
            java.util.HashMap r2 = r7.f6959g     // Catch:{ all -> 0x0088 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0088 }
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2     // Catch:{ all -> 0x0088 }
            if (r2 != 0) goto L_0x004a
            java.util.HashMap r2 = r7.f6959g     // Catch:{ all -> 0x0088 }
            java.lang.Integer[] r5 = new java.lang.Integer[r4]     // Catch:{ all -> 0x0088 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0088 }
            r5[r3] = r6     // Catch:{ all -> 0x0088 }
            r2.put(r1, r5)     // Catch:{ all -> 0x0088 }
            r3 = r4
            goto L_0x0057
        L_0x004a:
            r5 = r2[r3]     // Catch:{ all -> 0x0088 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0088 }
            int r5 = r5 + r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0088 }
            r2[r3] = r5     // Catch:{ all -> 0x0088 }
        L_0x0057:
            if (r3 != 0) goto L_0x0061
        L_0x0059:
            boolean r2 = r7.f6958f     // Catch:{ all -> 0x0088 }
            if (r2 != 0) goto L_0x006e
            int r2 = r7.f6960h     // Catch:{ all -> 0x0088 }
            if (r2 != 0) goto L_0x006e
        L_0x0061:
            android.os.PowerManager$WakeLock r2 = r7.f6955b     // Catch:{ all -> 0x0088 }
            q4.b.a(r2, r1)     // Catch:{ all -> 0x0088 }
            r7.c()     // Catch:{ all -> 0x0088 }
            int r1 = r7.f6960h     // Catch:{ all -> 0x0088 }
            int r1 = r1 + r4
            r7.f6960h = r1     // Catch:{ all -> 0x0088 }
        L_0x006e:
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            android.os.PowerManager$WakeLock r0 = r7.f6955b
            r0.acquire()
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            java.util.concurrent.ScheduledExecutorService r0 = f6953j
            i4.l r1 = new i4.l
            r2 = 3
            r1.<init>(r2, r7)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r8, r2)
        L_0x0087:
            return
        L_0x0088:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.a.a(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r4 == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r6.f6960h == 1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        q4.b.a(r6.f6955b, (java.lang.String) null);
        c();
        r6.f6960h--;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f6961i
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L_0x0019
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r6.d
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " release without a matched acquire!"
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r0, r1)
        L_0x0019:
            boolean r0 = r6.f6958f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            android.text.TextUtils.isEmpty(r1)
        L_0x0021:
            l5.a r0 = r6.f6954a
            monitor-enter(r0)
            boolean r2 = r6.f6958f     // Catch:{ all -> 0x006d }
            r3 = 1
            if (r2 == 0) goto L_0x0053
            java.util.HashMap r2 = r6.f6959g     // Catch:{ all -> 0x006d }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x006d }
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2     // Catch:{ all -> 0x006d }
            r4 = 0
            if (r2 != 0) goto L_0x0035
            goto L_0x0051
        L_0x0035:
            r5 = r2[r4]     // Catch:{ all -> 0x006d }
            int r5 = r5.intValue()     // Catch:{ all -> 0x006d }
            if (r5 != r3) goto L_0x0044
            java.util.HashMap r2 = r6.f6959g     // Catch:{ all -> 0x006d }
            r2.remove(r1)     // Catch:{ all -> 0x006d }
            r4 = r3
            goto L_0x0051
        L_0x0044:
            r5 = r2[r4]     // Catch:{ all -> 0x006d }
            int r5 = r5.intValue()     // Catch:{ all -> 0x006d }
            int r5 = r5 - r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x006d }
            r2[r4] = r5     // Catch:{ all -> 0x006d }
        L_0x0051:
            if (r4 != 0) goto L_0x005b
        L_0x0053:
            boolean r2 = r6.f6958f     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x0068
            int r2 = r6.f6960h     // Catch:{ all -> 0x006d }
            if (r2 != r3) goto L_0x0068
        L_0x005b:
            android.os.PowerManager$WakeLock r2 = r6.f6955b     // Catch:{ all -> 0x006d }
            q4.b.a(r2, r1)     // Catch:{ all -> 0x006d }
            r6.c()     // Catch:{ all -> 0x006d }
            int r1 = r6.f6960h     // Catch:{ all -> 0x006d }
            int r1 = r1 - r3
            r6.f6960h = r1     // Catch:{ all -> 0x006d }
        L_0x0068:
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            r6.d()
            return
        L_0x006d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.a.b():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r10 = this;
            java.lang.reflect.Method r0 = r4.k.f8437a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.WorkSource r1 = r10.f6956c
            java.lang.String r2 = "Unable to assign blame through WorkSource"
            java.lang.String r3 = "WorkSourceUtil"
            r4 = 0
            if (r1 != 0) goto L_0x0011
            goto L_0x0029
        L_0x0011:
            java.lang.reflect.Method r5 = r4.k.f8439c
            if (r5 == 0) goto L_0x0029
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0025 }
            java.lang.Object r5 = r5.invoke(r1, r6)     // Catch:{ Exception -> 0x0025 }
            n4.m.h(r5)     // Catch:{ Exception -> 0x0025 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0025 }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0025 }
            goto L_0x002a
        L_0x0025:
            r5 = move-exception
            android.util.Log.wtf(r3, r2, r5)
        L_0x0029:
            r5 = r4
        L_0x002a:
            if (r5 != 0) goto L_0x002d
            goto L_0x0058
        L_0x002d:
            r6 = r4
        L_0x002e:
            if (r6 >= r5) goto L_0x0058
            java.lang.reflect.Method r7 = r4.k.d
            if (r7 == 0) goto L_0x0048
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0044 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0044 }
            r8[r4] = r9     // Catch:{ Exception -> 0x0044 }
            java.lang.Object r7 = r7.invoke(r1, r8)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0044 }
            goto L_0x0049
        L_0x0044:
            r7 = move-exception
            android.util.Log.wtf(r3, r2, r7)
        L_0x0048:
            r7 = 0
        L_0x0049:
            boolean r8 = r4.i.a(r7)
            if (r8 != 0) goto L_0x0055
            n4.m.h(r7)
            r0.add(r7)
        L_0x0055:
            int r6 = r6 + 1
            goto L_0x002e
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.a.c():void");
    }

    public final void d() {
        PowerManager.WakeLock wakeLock = this.f6955b;
        if (wakeLock.isHeld()) {
            try {
                wakeLock.release();
            } catch (RuntimeException e10) {
                if (e10.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.d).concat(" was already released!"), e10);
                } else {
                    throw e10;
                }
            }
            wakeLock.isHeld();
        }
    }
}
