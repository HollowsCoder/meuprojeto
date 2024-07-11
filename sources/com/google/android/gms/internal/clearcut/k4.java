package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class k4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f2477a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f2478b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f2479c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicBoolean f2480e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    public static HashMap<String, String> f2481f;

    /* renamed from: g  reason: collision with root package name */
    public static final HashMap<String, Boolean> f2482g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap<String, Integer> f2483h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap<String, Long> f2484i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap<String, Float> f2485j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    public static Object f2486k;
    public static boolean l;

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f2487m = new String[0];

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008a, code lost:
        r14 = r14.query(f2477a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r15}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        if (r14 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009e, code lost:
        if (r14.moveToFirst() != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a1, code lost:
        r0 = r14.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a5, code lost:
        if (r0 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ab, code lost:
        if (r0.equals((java.lang.Object) null) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ad, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ae, code lost:
        r2 = com.google.android.gms.internal.clearcut.k4.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b0, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b3, code lost:
        if (r1 != f2486k) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b5, code lost:
        f2481f.put(r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ba, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00bb, code lost:
        if (r0 == null) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00bd, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00be, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c1, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c5, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c7, code lost:
        r0 = com.google.android.gms.internal.clearcut.k4.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00c9, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00cc, code lost:
        if (r1 != f2486k) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ce, code lost:
        f2481f.put(r15, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d3, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d4, code lost:
        if (r14 == null) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d6, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00d9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00dd, code lost:
        if (r14 != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00df, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00e2, code lost:
        throw r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.ContentResolver r14, java.lang.String r15) {
        /*
            java.lang.Class<com.google.android.gms.internal.clearcut.k4> r0 = com.google.android.gms.internal.clearcut.k4.class
            monitor-enter(r0)
            b(r14)     // Catch:{ all -> 0x00e3 }
            java.lang.Object r1 = f2486k     // Catch:{ all -> 0x00e3 }
            java.util.HashMap<java.lang.String, java.lang.String> r2 = f2481f     // Catch:{ all -> 0x00e3 }
            boolean r2 = r2.containsKey(r15)     // Catch:{ all -> 0x00e3 }
            r3 = 0
            if (r2 == 0) goto L_0x001e
            java.util.HashMap<java.lang.String, java.lang.String> r14 = f2481f     // Catch:{ all -> 0x00e3 }
            java.lang.Object r14 = r14.get(r15)     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x00e3 }
            if (r14 == 0) goto L_0x001c
            r3 = r14
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x00e3 }
            return r3
        L_0x001e:
            java.lang.String[] r2 = f2487m     // Catch:{ all -> 0x00e3 }
            int r4 = r2.length     // Catch:{ all -> 0x00e3 }
            r5 = 0
            r6 = r5
        L_0x0023:
            r7 = 1
            if (r6 >= r4) goto L_0x0089
            r8 = r2[r6]     // Catch:{ all -> 0x00e3 }
            boolean r8 = r15.startsWith(r8)     // Catch:{ all -> 0x00e3 }
            if (r8 == 0) goto L_0x0086
            boolean r1 = l     // Catch:{ all -> 0x00e3 }
            if (r1 == 0) goto L_0x003a
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f2481f     // Catch:{ all -> 0x00e3 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00e3 }
            if (r1 == 0) goto L_0x007f
        L_0x003a:
            java.lang.String[] r12 = f2487m     // Catch:{ all -> 0x00e3 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f2481f     // Catch:{ all -> 0x00e3 }
            android.net.Uri r9 = f2478b     // Catch:{ all -> 0x00e3 }
            r10 = 0
            r11 = 0
            r13 = 0
            r8 = r14
            android.database.Cursor r14 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00e3 }
            java.util.TreeMap r2 = new java.util.TreeMap     // Catch:{ all -> 0x00e3 }
            r2.<init>()     // Catch:{ all -> 0x00e3 }
            if (r14 != 0) goto L_0x0050
            goto L_0x0065
        L_0x0050:
            boolean r4 = r14.moveToNext()     // Catch:{ all -> 0x0081 }
            if (r4 == 0) goto L_0x0062
            java.lang.String r4 = r14.getString(r5)     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = r14.getString(r7)     // Catch:{ all -> 0x0081 }
            r2.put(r4, r6)     // Catch:{ all -> 0x0081 }
            goto L_0x0050
        L_0x0062:
            r14.close()     // Catch:{ all -> 0x00e3 }
        L_0x0065:
            r1.putAll(r2)     // Catch:{ all -> 0x00e3 }
            l = r7     // Catch:{ all -> 0x00e3 }
            java.util.HashMap<java.lang.String, java.lang.String> r14 = f2481f     // Catch:{ all -> 0x00e3 }
            boolean r14 = r14.containsKey(r15)     // Catch:{ all -> 0x00e3 }
            if (r14 == 0) goto L_0x007f
            java.util.HashMap<java.lang.String, java.lang.String> r14 = f2481f     // Catch:{ all -> 0x00e3 }
            java.lang.Object r14 = r14.get(r15)     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x00e3 }
            if (r14 == 0) goto L_0x007d
            r3 = r14
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x00e3 }
            return r3
        L_0x007f:
            monitor-exit(r0)     // Catch:{ all -> 0x00e3 }
            return r3
        L_0x0081:
            r15 = move-exception
            r14.close()     // Catch:{ all -> 0x00e3 }
            throw r15     // Catch:{ all -> 0x00e3 }
        L_0x0086:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x00e3 }
            android.net.Uri r9 = f2477a
            r10 = 0
            r11 = 0
            java.lang.String[] r12 = new java.lang.String[r7]
            r12[r5] = r15
            r13 = 0
            r8 = r14
            android.database.Cursor r14 = r8.query(r9, r10, r11, r12, r13)
            if (r14 == 0) goto L_0x00c7
            boolean r0 = r14.moveToFirst()     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x00a1
            goto L_0x00c7
        L_0x00a1:
            java.lang.String r0 = r14.getString(r7)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00ae
            boolean r2 = r0.equals(r3)     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x00ae
            r0 = r3
        L_0x00ae:
            java.lang.Class<com.google.android.gms.internal.clearcut.k4> r2 = com.google.android.gms.internal.clearcut.k4.class
            monitor-enter(r2)     // Catch:{ all -> 0x00c5 }
            java.lang.Object r4 = f2486k     // Catch:{ all -> 0x00c2 }
            if (r1 != r4) goto L_0x00ba
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f2481f     // Catch:{ all -> 0x00c2 }
            r1.put(r15, r0)     // Catch:{ all -> 0x00c2 }
        L_0x00ba:
            monitor-exit(r2)     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x00be
            r3 = r0
        L_0x00be:
            r14.close()
            return r3
        L_0x00c2:
            r15 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c2 }
            throw r15     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r15 = move-exception
            goto L_0x00dd
        L_0x00c7:
            java.lang.Class<com.google.android.gms.internal.clearcut.k4> r0 = com.google.android.gms.internal.clearcut.k4.class
            monitor-enter(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.Object r2 = f2486k     // Catch:{ all -> 0x00da }
            if (r1 != r2) goto L_0x00d3
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f2481f     // Catch:{ all -> 0x00da }
            r1.put(r15, r3)     // Catch:{ all -> 0x00da }
        L_0x00d3:
            monitor-exit(r0)     // Catch:{ all -> 0x00da }
            if (r14 == 0) goto L_0x00d9
            r14.close()
        L_0x00d9:
            return r3
        L_0x00da:
            r15 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00da }
            throw r15     // Catch:{ all -> 0x00c5 }
        L_0x00dd:
            if (r14 == 0) goto L_0x00e2
            r14.close()
        L_0x00e2:
            throw r15
        L_0x00e3:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e3 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.k4.a(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    public static void b(ContentResolver contentResolver) {
        HashMap<String, String> hashMap = f2481f;
        AtomicBoolean atomicBoolean = f2480e;
        if (hashMap == null) {
            atomicBoolean.set(false);
            f2481f = new HashMap<>();
            f2486k = new Object();
            l = false;
            contentResolver.registerContentObserver(f2477a, true, new l4(0));
        } else if (atomicBoolean.getAndSet(false)) {
            f2481f.clear();
            f2482g.clear();
            f2483h.clear();
            f2484i.clear();
            f2485j.clear();
            f2486k = new Object();
            l = false;
        }
    }
}
