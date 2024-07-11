package x;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f9377a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f9378b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f9379c;
    public static final Method d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f9380e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f9381f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f9382g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ c f9383o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ Object f9384p;

        public a(c cVar, Object obj) {
            this.f9383o = cVar;
            this.f9384p = obj;
        }

        public final void run() {
            this.f9383o.f9387o = this.f9384p;
        }
    }

    /* renamed from: x.b$b  reason: collision with other inner class name */
    public class C0158b implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ Application f9385o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ c f9386p;

        public C0158b(Application application, c cVar) {
            this.f9385o = application;
            this.f9386p = cVar;
        }

        public final void run() {
            this.f9385o.unregisterActivityLifecycleCallbacks(this.f9386p);
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: o  reason: collision with root package name */
        public Object f9387o;

        /* renamed from: p  reason: collision with root package name */
        public Activity f9388p;

        /* renamed from: q  reason: collision with root package name */
        public final int f9389q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f9390r = false;

        /* renamed from: s  reason: collision with root package name */
        public boolean f9391s = false;

        /* renamed from: t  reason: collision with root package name */
        public boolean f9392t = false;

        public c(Activity activity) {
            this.f9388p = activity;
            this.f9389q = activity.hashCode();
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
            if (this.f9388p == activity) {
                this.f9388p = null;
                this.f9391s = true;
            }
        }

        public final void onActivityPaused(Activity activity) {
            if (this.f9391s && !this.f9392t && !this.f9390r) {
                Object obj = this.f9387o;
                boolean z = false;
                try {
                    Object obj2 = b.f9379c.get(activity);
                    if (obj2 == obj && activity.hashCode() == this.f9389q) {
                        b.f9382g.postAtFrontOfQueue(new c(b.f9378b.get(activity), obj2));
                        z = true;
                    }
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th);
                }
                if (z) {
                    this.f9392t = true;
                    this.f9387o = null;
                }
            }
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
            if (this.f9388p == activity) {
                this.f9390r = true;
            }
        }

        public final void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b A[SYNTHETIC, Splitter:B:23:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081  */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            f9382g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            f9377a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r3.setAccessible(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            f9378b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0030 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            f9379c = r0
            java.lang.Class<?> r0 = f9377a
            r3 = 0
            r4 = 3
            java.lang.String r5 = "performStopActivity"
            r6 = 2
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            if (r0 != 0) goto L_0x003f
            goto L_0x0053
        L_0x003f:
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ all -> 0x0053 }
            r8[r3] = r7     // Catch:{ all -> 0x0053 }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0053 }
            r8[r2] = r9     // Catch:{ all -> 0x0053 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r6] = r9     // Catch:{ all -> 0x0053 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r8)     // Catch:{ all -> 0x0053 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0053 }
            goto L_0x0054
        L_0x0053:
            r0 = r1
        L_0x0054:
            d = r0
            java.lang.Class<?> r0 = f9377a
            if (r0 != 0) goto L_0x005b
            goto L_0x006b
        L_0x005b:
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ all -> 0x006b }
            r8[r3] = r7     // Catch:{ all -> 0x006b }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x006b }
            r8[r2] = r9     // Catch:{ all -> 0x006b }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r8)     // Catch:{ all -> 0x006b }
            r0.setAccessible(r2)     // Catch:{ all -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r0 = r1
        L_0x006c:
            f9380e = r0
            java.lang.Class<?> r0 = f9377a
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            java.lang.Class<java.util.List> r8 = java.util.List.class
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r9 == r10) goto L_0x0081
            r10 = 27
            if (r9 != r10) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r9 = r3
            goto L_0x0082
        L_0x0081:
            r9 = r2
        L_0x0082:
            if (r9 == 0) goto L_0x00b1
            if (r0 != 0) goto L_0x0087
            goto L_0x00b1
        L_0x0087:
            java.lang.String r9 = "requestRelaunchActivity"
            r10 = 9
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch:{ all -> 0x00b1 }
            r10[r3] = r7     // Catch:{ all -> 0x00b1 }
            r10[r2] = r8     // Catch:{ all -> 0x00b1 }
            r10[r6] = r8     // Catch:{ all -> 0x00b1 }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00b1 }
            r10[r4] = r3     // Catch:{ all -> 0x00b1 }
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b1 }
            r4 = 4
            r10[r4] = r3     // Catch:{ all -> 0x00b1 }
            r4 = 5
            r10[r4] = r5     // Catch:{ all -> 0x00b1 }
            r4 = 6
            r10[r4] = r5     // Catch:{ all -> 0x00b1 }
            r4 = 7
            r10[r4] = r3     // Catch:{ all -> 0x00b1 }
            r4 = 8
            r10[r4] = r3     // Catch:{ all -> 0x00b1 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r10)     // Catch:{ all -> 0x00b1 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x00b1 }
            r1 = r0
        L_0x00b1:
            f9381f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.b.<clinit>():void");
    }

    public static boolean a(Activity activity) {
        Object obj;
        Application application;
        c cVar;
        Handler handler;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            activity.recreate();
            return true;
        }
        boolean z = i10 == 26 || i10 == 27;
        Method method = f9381f;
        if (z && method == null) {
            return false;
        }
        if (f9380e == null && d == null) {
            return false;
        }
        try {
            Object obj2 = f9379c.get(activity);
            if (obj2 == null || (obj = f9378b.get(activity)) == null) {
                return false;
            }
            application = activity.getApplication();
            cVar = new c(activity);
            application.registerActivityLifecycleCallbacks(cVar);
            handler = f9382g;
            handler.post(new a(cVar, obj2));
            if (i10 == 26 || i10 == 27) {
                Boolean bool = Boolean.FALSE;
                method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
            } else {
                activity.recreate();
            }
            handler.post(new C0158b(application, cVar));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
