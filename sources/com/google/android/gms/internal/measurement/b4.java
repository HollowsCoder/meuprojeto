package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import n.b;
import n.h;

public final class b4 {

    /* renamed from: g  reason: collision with root package name */
    public static final b f2627g = new b();

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f2628h = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f2629a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f2630b;

    /* renamed from: c  reason: collision with root package name */
    public final a4 f2631c;
    public final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public volatile Map<String, String> f2632e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f2633f = new ArrayList();

    public b4(ContentResolver contentResolver, Uri uri) {
        a4 a4Var = new a4(this);
        this.f2631c = a4Var;
        contentResolver.getClass();
        uri.getClass();
        this.f2629a = contentResolver;
        this.f2630b = uri;
        contentResolver.registerContentObserver(uri, false, a4Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.b4 a(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.b4> r0 = com.google.android.gms.internal.measurement.b4.class
            monitor-enter(r0)
            n.b r1 = f2627g     // Catch:{ all -> 0x0019 }
            r2 = 0
            java.lang.Object r2 = r1.getOrDefault(r5, r2)     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.measurement.b4 r2 = (com.google.android.gms.internal.measurement.b4) r2     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x0017
            com.google.android.gms.internal.measurement.b4 r3 = new com.google.android.gms.internal.measurement.b4     // Catch:{ SecurityException -> 0x0017 }
            r3.<init>(r4, r5)     // Catch:{ SecurityException -> 0x0017 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0016 }
        L_0x0016:
            r2 = r3
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r2
        L_0x0019:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b4.a(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.b4");
    }

    public static synchronized void c() {
        synchronized (b4.class) {
            Iterator it = ((h.e) f2627g.values()).iterator();
            while (it.hasNext()) {
                b4 b4Var = (b4) it.next();
                b4Var.f2629a.unregisterContentObserver(b4Var.f2631c);
            }
            f2627g.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3 = android.os.Binder.clearCallingIdentity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = r2.zza();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        android.os.Binder.restoreCallingIdentity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0030, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        android.util.Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0041, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0044, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001a */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ExcHandler: SQLiteException | IllegalStateException | SecurityException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:8:0x000f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> b() {
        /*
            r5 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.f2632e
            if (r0 != 0) goto L_0x004a
            java.lang.Object r1 = r5.d
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.f2632e     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0045
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0047 }
            q1.d r2 = new q1.d     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
            r3 = 2
            r2.<init>(r3, r5)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
            java.lang.Object r2 = r2.zza()     // Catch:{ SecurityException -> 0x001a, SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
            goto L_0x0025
        L_0x001a:
            long r3 = android.os.Binder.clearCallingIdentity()     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
            java.lang.Object r2 = r2.zza()     // Catch:{ all -> 0x002b }
            android.os.Binder.restoreCallingIdentity(r3)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
        L_0x0025:
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x003d
        L_0x002b:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r3)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
            throw r2     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
        L_0x0030:
            r2 = move-exception
            goto L_0x0041
        L_0x0032:
            java.lang.String r2 = "ConfigurationContentLoader"
            java.lang.String r3 = "PhenotypeFlag unable to load ContentProvider, using default values"
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0030 }
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x0047 }
            r2 = 0
        L_0x003d:
            r5.f2632e = r2     // Catch:{ all -> 0x0047 }
            r0 = r2
            goto L_0x0045
        L_0x0041:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x0047 }
            throw r2     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            goto L_0x004a
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            throw r0
        L_0x004a:
            if (r0 == 0) goto L_0x004d
            return r0
        L_0x004d:
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b4.b():java.util.Map");
    }
}
