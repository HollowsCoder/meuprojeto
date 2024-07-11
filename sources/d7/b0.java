package d7;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.c;
import k7.d;

public final class b0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final a f4203a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4204b;

    /* renamed from: c  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f4205c;
    public final a7.a d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f4206e = new AtomicBoolean(false);

    public interface a {
    }

    public b0(l lVar, c cVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, a7.a aVar) {
        this.f4203a = lVar;
        this.f4204b = cVar;
        this.f4205c = uncaughtExceptionHandler;
        this.d = aVar;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", (Throwable) null);
            return false;
        } else if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", (Throwable) null);
            return false;
        } else {
            boolean z = true;
            if (!this.d.b()) {
                return true;
            }
            if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                z = false;
            }
            if (z) {
                Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", (Throwable) null);
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r4 != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r4 != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        android.util.Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        r0.uncaughtException(r11, r12);
        r3.set(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r11, java.lang.Throwable r12) {
        /*
            r10 = this;
            java.lang.Thread$UncaughtExceptionHandler r0 = r10.f4205c
            java.lang.String r1 = "Completed exception processing. Invoking default exception handler."
            java.lang.String r2 = "FirebaseCrashlytics"
            java.util.concurrent.atomic.AtomicBoolean r3 = r10.f4206e
            r4 = 1
            r3.set(r4)
            r5 = 3
            r6 = 0
            r7 = 0
            boolean r8 = r10.a(r11, r12)     // Catch:{ Exception -> 0x0021 }
            if (r8 == 0) goto L_0x0023
            d7.b0$a r8 = r10.f4203a     // Catch:{ Exception -> 0x0021 }
            k7.d r9 = r10.f4204b     // Catch:{ Exception -> 0x0021 }
            d7.l r8 = (d7.l) r8     // Catch:{ Exception -> 0x0021 }
            r8.a(r9, r11, r12)     // Catch:{ Exception -> 0x0021 }
            goto L_0x0033
        L_0x001f:
            r8 = move-exception
            goto L_0x0057
        L_0x0021:
            r8 = move-exception
            goto L_0x003e
        L_0x0023:
            java.lang.String r8 = "Uncaught exception will not be recorded by Crashlytics."
            boolean r9 = android.util.Log.isLoggable(r2, r5)     // Catch:{ Exception -> 0x0021 }
            if (r9 == 0) goto L_0x002d
            r9 = r4
            goto L_0x002e
        L_0x002d:
            r9 = r7
        L_0x002e:
            if (r9 == 0) goto L_0x0033
            android.util.Log.d(r2, r8, r6)     // Catch:{ Exception -> 0x0021 }
        L_0x0033:
            boolean r5 = android.util.Log.isLoggable(r2, r5)
            if (r5 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r4 = r7
        L_0x003b:
            if (r4 == 0) goto L_0x0050
            goto L_0x004d
        L_0x003e:
            java.lang.String r9 = "An error occurred in the uncaught exception handler"
            android.util.Log.e(r2, r9, r8)     // Catch:{ all -> 0x001f }
            boolean r5 = android.util.Log.isLoggable(r2, r5)
            if (r5 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r4 = r7
        L_0x004b:
            if (r4 == 0) goto L_0x0050
        L_0x004d:
            android.util.Log.d(r2, r1, r6)
        L_0x0050:
            r0.uncaughtException(r11, r12)
            r3.set(r7)
            return
        L_0x0057:
            boolean r5 = android.util.Log.isLoggable(r2, r5)
            if (r5 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r4 = r7
        L_0x005f:
            if (r4 == 0) goto L_0x0064
            android.util.Log.d(r2, r1, r6)
        L_0x0064:
            r0.uncaughtException(r11, r12)
            r3.set(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.b0.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
