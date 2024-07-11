package d7;

import a7.a;
import android.content.Context;
import android.util.Log;
import androidx.appcompat.widget.m;
import e7.b;
import i7.e;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.d;
import m5.i;
import m5.j;
import m5.l;
import m5.r;

public final class t {

    /* renamed from: p  reason: collision with root package name */
    public static final j f4270p = new j();

    /* renamed from: a  reason: collision with root package name */
    public final Context f4271a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f4272b;

    /* renamed from: c  reason: collision with root package name */
    public final m f4273c;
    public final f d;

    /* renamed from: e  reason: collision with root package name */
    public final h0 f4274e;

    /* renamed from: f  reason: collision with root package name */
    public final e f4275f;

    /* renamed from: g  reason: collision with root package name */
    public final a f4276g;

    /* renamed from: h  reason: collision with root package name */
    public final b f4277h;

    /* renamed from: i  reason: collision with root package name */
    public final a f4278i;

    /* renamed from: j  reason: collision with root package name */
    public final b7.a f4279j;

    /* renamed from: k  reason: collision with root package name */
    public final n0 f4280k;
    public b0 l;

    /* renamed from: m  reason: collision with root package name */
    public final j<Boolean> f4281m = new j<>();

    /* renamed from: n  reason: collision with root package name */
    public final j<Boolean> f4282n = new j<>();

    /* renamed from: o  reason: collision with root package name */
    public final j<Void> f4283o = new j<>();

    public t(Context context, f fVar, h0 h0Var, c0 c0Var, e eVar, m mVar, a aVar, b bVar, n0 n0Var, a aVar2, b7.a aVar3) {
        new AtomicBoolean(false);
        this.f4271a = context;
        this.d = fVar;
        this.f4274e = h0Var;
        this.f4272b = c0Var;
        this.f4275f = eVar;
        this.f4273c = mVar;
        this.f4276g = aVar;
        this.f4277h = bVar;
        this.f4278i = aVar2;
        this.f4279j = aVar3;
        this.f4280k = n0Var;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:29|30|31|32|33|34|35|36|37|38|70) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x022a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(d7.t r30) {
        /*
            r0 = r30
            r30.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            d7.d r3 = new d7.d
            d7.h0 r4 = r0.f4274e
            r3.<init>(r4)
            java.lang.String r3 = d7.d.f4213b
            java.lang.String r5 = "Opening a new session with ID "
            java.lang.String r5 = androidx.appcompat.widget.x0.e(r5, r3)
            java.lang.String r11 = "FirebaseCrashlytics"
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r11, r6)
            r7 = 0
            if (r6 == 0) goto L_0x0028
            android.util.Log.d(r11, r5, r7)
        L_0x0028:
            java.util.Locale r12 = java.util.Locale.US
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            java.lang.String r13 = "18.2.5"
            r5[r6] = r13
            java.lang.String r6 = "Crashlytics Android SDK/%s"
            java.lang.String r7 = java.lang.String.format(r12, r6, r5)
            java.lang.String r15 = r4.f4235c
            d7.a r5 = r0.f4276g
            java.lang.String r6 = r5.f4196e
            java.lang.String r8 = r5.f4197f
            java.lang.String r18 = r4.c()
            java.lang.String r4 = r5.f4195c
            d7.d0 r4 = d7.d0.determineFrom(r4)
            int r19 = r4.getId()
            java.lang.String r4 = r5.f4198g
            java.lang.String r5 = r5.f4199h
            f7.x r9 = new f7.x
            r14 = r9
            r16 = r6
            r17 = r8
            r20 = r4
            r21 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            java.lang.String r14 = android.os.Build.VERSION.CODENAME
            android.content.Context r5 = r0.f4271a
            boolean r6 = d7.e.j(r5)
            f7.z r8 = new f7.z
            r8.<init>(r4, r14, r6)
            android.os.StatFs r6 = new android.os.StatFs
            java.io.File r10 = android.os.Environment.getDataDirectory()
            java.lang.String r10 = r10.getPath()
            r6.<init>(r10)
            int r10 = r6.getBlockCount()
            r15 = r11
            long r10 = (long) r10
            int r6 = r6.getBlockSize()
            r16 = r14
            r17 = r15
            long r14 = (long) r6
            long r24 = r10 * r14
            d7.e$a r6 = d7.e.a.getValue()
            int r19 = r6.ordinal()
            java.lang.String r11 = android.os.Build.MODEL
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()
            int r21 = r6.availableProcessors()
            long r22 = d7.e.g()
            boolean r26 = d7.e.i(r5)
            int r27 = d7.e.d(r5)
            java.lang.String r14 = android.os.Build.MANUFACTURER
            java.lang.String r15 = android.os.Build.PRODUCT
            f7.y r5 = new f7.y
            r18 = r5
            r20 = r11
            r28 = r14
            r29 = r15
            r18.<init>(r19, r20, r21, r22, r24, r26, r27, r28, r29)
            a7.a r6 = r0.f4278i
            f7.w r10 = new f7.w
            r10.<init>(r9, r8, r5)
            r5 = r6
            r6 = r3
            r8 = r1
            r5.c(r6, r7, r8, r10)
            e7.b r5 = r0.f4277h
            r5.a(r3)
            d7.n0 r0 = r0.f4280k
            d7.z r5 = r0.f4252a
            r5.getClass()
            java.nio.charset.Charset r6 = f7.a0.f4737a
            f7.b$a r6 = new f7.b$a
            r6.<init>()
            r6.f4745a = r13
            d7.a r7 = r5.f4306c
            java.lang.String r8 = r7.f4193a
            if (r8 == 0) goto L_0x02a4
            r6.f4746b = r8
            d7.h0 r8 = r5.f4305b
            java.lang.String r9 = r8.c()
            if (r9 == 0) goto L_0x029c
            r6.d = r9
            java.lang.String r9 = r7.f4196e
            if (r9 == 0) goto L_0x0294
            r6.f4748e = r9
            java.lang.String r10 = r7.f4197f
            if (r10 == 0) goto L_0x028c
            r6.f4749f = r10
            r13 = 4
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r6.f4747c = r13
            f7.g$a r13 = new f7.g$a
            r13.<init>()
            r25 = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r13.f4786e = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r13.f4785c = r0
            java.lang.String r0 = "Null identifier"
            if (r3 == 0) goto L_0x0286
            r13.f4784b = r3
            java.lang.String r1 = d7.z.f4303f
            if (r1 == 0) goto L_0x027e
            r13.f4783a = r1
            java.lang.String r1 = r8.f4235c
            if (r1 == 0) goto L_0x0278
            java.lang.String r22 = r8.c()
            java.lang.String r0 = r7.f4198g
            java.lang.String r2 = r7.f4199h
            java.lang.String r3 = ""
            f7.h r7 = new f7.h
            r18 = r7
            r19 = r1
            r20 = r9
            r21 = r10
            r23 = r0
            r24 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r13.f4787f = r7
            f7.u$a r0 = new f7.u$a
            r0.<init>()
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f4873a = r1
            r0.f4874b = r4
            r1 = r16
            r0.f4875c = r1
            android.content.Context r1 = r5.f4304a
            boolean r2 = d7.e.j(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.d = r2
            f7.u r0 = r0.a()
            r13.f4789h = r0
            android.os.StatFs r0 = new android.os.StatFs
            java.io.File r2 = android.os.Environment.getDataDirectory()
            java.lang.String r2 = r2.getPath()
            r0.<init>(r2)
            java.lang.String r2 = android.os.Build.CPU_ABI
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x017b
            goto L_0x0189
        L_0x017b:
            java.util.HashMap r4 = d7.z.f4302e
            java.lang.String r2 = r2.toLowerCase(r12)
            java.lang.Object r2 = r4.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L_0x018b
        L_0x0189:
            r2 = 7
            goto L_0x018f
        L_0x018b:
            int r2 = r2.intValue()
        L_0x018f:
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()
            int r4 = r4.availableProcessors()
            long r7 = d7.e.g()
            int r5 = r0.getBlockCount()
            long r9 = (long) r5
            int r0 = r0.getBlockSize()
            r30 = r6
            long r5 = (long) r0
            long r9 = r9 * r5
            boolean r0 = d7.e.i(r1)
            int r1 = d7.e.d(r1)
            f7.j$a r5 = new f7.j$a
            r5.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.f4807a = r2
            r5.f4808b = r11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r5.f4809c = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r5.d = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r5.f4810e = r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.f4811f = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.f4812g = r0
            r5.f4813h = r14
            r5.f4814i = r15
            f7.j r0 = r5.a()
            r13.f4790i = r0
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.f4792k = r0
            f7.g r0 = r13.a()
            r1 = r30
            r1.f4750g = r0
            f7.b r0 = r1.a()
            r1 = r25
            i7.d r1 = r1.f4253b
            i7.e r1 = r1.f6128b
            f7.a0$e r2 = r0.f4743h
            if (r2 != 0) goto L_0x0212
            r0 = 3
            r4 = r17
            boolean r0 = android.util.Log.isLoggable(r4, r0)
            if (r0 == 0) goto L_0x0277
            java.lang.String r0 = "Could not get session for report"
            r1 = 0
            android.util.Log.d(r4, r0, r1)
            goto L_0x0277
        L_0x0212:
            r4 = r17
            java.lang.String r5 = r2.g()
            g7.a r6 = i7.d.f6124f     // Catch:{ IOException -> 0x0266 }
            r6.getClass()     // Catch:{ IOException -> 0x0266 }
            q7.d r6 = g7.a.f4992a     // Catch:{ IOException -> 0x0266 }
            r6.getClass()     // Catch:{ IOException -> 0x0266 }
            java.io.StringWriter r7 = new java.io.StringWriter     // Catch:{ IOException -> 0x0266 }
            r7.<init>()     // Catch:{ IOException -> 0x0266 }
            r6.a(r7, r0)     // Catch:{ IOException -> 0x022a }
        L_0x022a:
            java.lang.String r0 = r7.toString()     // Catch:{ IOException -> 0x0266 }
            java.lang.String r6 = "report"
            java.io.File r6 = r1.a(r5, r6)     // Catch:{ IOException -> 0x0266 }
            i7.d.e(r6, r0)     // Catch:{ IOException -> 0x0266 }
            java.lang.String r0 = "start-time"
            java.io.File r0 = r1.a(r5, r0)     // Catch:{ IOException -> 0x0266 }
            long r1 = r2.i()     // Catch:{ IOException -> 0x0266 }
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0266 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0266 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x0266 }
            java.nio.charset.Charset r8 = i7.d.d     // Catch:{ IOException -> 0x0266 }
            r6.<init>(r7, r8)     // Catch:{ IOException -> 0x0266 }
            r6.write(r3)     // Catch:{ all -> 0x025a }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r7
            r0.setLastModified(r1)     // Catch:{ all -> 0x025a }
            r6.close()     // Catch:{ IOException -> 0x0266 }
            goto L_0x0277
        L_0x025a:
            r0 = move-exception
            r1 = r0
            r6.close()     // Catch:{ all -> 0x0260 }
            goto L_0x0265
        L_0x0260:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ IOException -> 0x0266 }
        L_0x0265:
            throw r1     // Catch:{ IOException -> 0x0266 }
        L_0x0266:
            r0 = move-exception
            java.lang.String r1 = "Could not persist report for session "
            java.lang.String r1 = androidx.appcompat.widget.x0.e(r1, r5)
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r4, r2)
            if (r2 == 0) goto L_0x0277
            android.util.Log.d(r4, r1, r0)
        L_0x0277:
            return
        L_0x0278:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x027e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null generator"
            r0.<init>(r1)
            throw r0
        L_0x0286:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x028c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null displayVersion"
            r0.<init>(r1)
            throw r0
        L_0x0294:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null buildVersion"
            r0.<init>(r1)
            throw r0
        L_0x029c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null installationUuid"
            r0.<init>(r1)
            throw r0
        L_0x02a4:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null gmpAppId"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.t.a(d7.t):void");
    }

    public static r b(t tVar) {
        boolean z;
        r rVar;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : e.d(tVar.f4275f.f6130a.listFiles(f4270p))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", (Throwable) null);
                    rVar = l.e((Object) null);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", (Throwable) null);
                    }
                    rVar = l.c(new ScheduledThreadPoolExecutor(1), new k(tVar, parseLong));
                }
                arrayList.add(rVar);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), (Throwable) null);
            }
            file.delete();
        }
        return l.f(arrayList);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020a  */
    public final void c(boolean r22, k7.d r23) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.util.ArrayList r3 = new java.util.ArrayList
            d7.n0 r0 = r1.f4280k
            i7.d r0 = r0.f4253b
            r0.getClass()
            java.util.TreeSet r4 = new java.util.TreeSet
            i7.e r0 = r0.f6128b
            java.io.File r0 = r0.f6131b
            java.lang.String[] r0 = r0.list()
            java.util.List r0 = i7.e.d(r0)
            r4.<init>(r0)
            java.util.NavigableSet r0 = r4.descendingSet()
            r3.<init>(r0)
            int r0 = r3.size()
            r4 = 2
            r5 = 0
            if (r0 > r2) goto L_0x003d
            java.lang.String r0 = "No open sessions to be closed."
            java.lang.String r2 = "FirebaseCrashlytics"
            boolean r2 = android.util.Log.isLoggable(r2, r4)
            if (r2 == 0) goto L_0x003c
            java.lang.String r2 = "FirebaseCrashlytics"
            android.util.Log.v(r2, r0, r5)
        L_0x003c:
            return
        L_0x003d:
            java.lang.Object r0 = r3.get(r2)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            r0 = r23
            k7.c r0 = (k7.c) r0
            java.util.concurrent.atomic.AtomicReference<l7.d> r0 = r0.f6718h
            java.lang.Object r0 = r0.get()
            l7.d r0 = (l7.d) r0
            l7.b r0 = r0.b()
            boolean r0 = r0.f6973b
            r7 = 0
            if (r0 == 0) goto L_0x033d
            int r0 = android.os.Build.VERSION.SDK_INT
            r8 = 30
            if (r0 < r8) goto L_0x0326
            android.content.Context r0 = r1.f4271a
            java.lang.String r4 = "activity"
            java.lang.Object r0 = r0.getSystemService(r4)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r4 = r0.getHistoricalProcessExitReasons((java.lang.String) null, 0, 0)
            int r0 = r4.size()
            if (r0 == 0) goto L_0x0314
            e7.b r8 = new e7.b
            i7.e r0 = r1.f4275f
            r8.<init>(r0, r6)
            androidx.fragment.app.f0 r9 = new androidx.fragment.app.f0
            r0 = 5
            r9.<init>((int) r0)
            d7.l0 r0 = new d7.l0
            i7.e r0 = r1.f4275f
            java.lang.String r10 = "Failed to close user metadata file."
            java.lang.String r11 = "keys"
            java.io.File r0 = r0.a(r6, r11)
            boolean r11 = r0.exists()
            if (r11 != 0) goto L_0x0093
            goto L_0x00cc
        L_0x0093:
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00c1 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x00c1 }
            java.util.Scanner r0 = new java.util.Scanner     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            java.lang.String r5 = "\\A"
            java.util.Scanner r0 = r0.useDelimiter(r5)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            if (r5 == 0) goto L_0x00ae
            java.lang.String r0 = r0.next()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r0 = ""
        L_0x00b0:
            java.util.HashMap r0 = d7.l0.a(r0)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            d7.e.a(r11, r10)
            goto L_0x00d0
        L_0x00b8:
            r0 = move-exception
            goto L_0x0310
        L_0x00bb:
            r0 = move-exception
            r5 = r11
            goto L_0x00c2
        L_0x00be:
            r0 = move-exception
            goto L_0x030f
        L_0x00c1:
            r0 = move-exception
        L_0x00c2:
            java.lang.String r11 = "Error deserializing user metadata."
            java.lang.String r12 = "FirebaseCrashlytics"
            android.util.Log.e(r12, r11, r0)     // Catch:{ all -> 0x00be }
            d7.e.a(r5, r10)
        L_0x00cc:
            java.util.Map r0 = java.util.Collections.emptyMap()
        L_0x00d0:
            java.lang.Object r5 = r9.f1152q
            d7.k0 r5 = (d7.k0) r5
            monitor-enter(r5)
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x030c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x030c }
            r10 = r7
        L_0x00de:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x030c }
            if (r11 == 0) goto L_0x0141
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x030c }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x030c }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x030c }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x030c }
            if (r12 == 0) goto L_0x0139
            java.lang.String r12 = r12.trim()     // Catch:{ all -> 0x030c }
            int r13 = r12.length()     // Catch:{ all -> 0x030c }
            int r14 = r5.f4244c     // Catch:{ all -> 0x030c }
            if (r13 <= r14) goto L_0x0102
            java.lang.String r12 = r12.substring(r7, r14)     // Catch:{ all -> 0x030c }
        L_0x0102:
            java.util.HashMap r13 = r5.f4242a     // Catch:{ all -> 0x030c }
            int r13 = r13.size()     // Catch:{ all -> 0x030c }
            int r14 = r5.f4243b     // Catch:{ all -> 0x030c }
            if (r13 < r14) goto L_0x0118
            java.util.HashMap r13 = r5.f4242a     // Catch:{ all -> 0x030c }
            boolean r13 = r13.containsKey(r12)     // Catch:{ all -> 0x030c }
            if (r13 == 0) goto L_0x0115
            goto L_0x0118
        L_0x0115:
            int r10 = r10 + 1
            goto L_0x00de
        L_0x0118:
            java.lang.Object r11 = r11.getValue()     // Catch:{ all -> 0x030c }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x030c }
            java.util.HashMap r13 = r5.f4242a     // Catch:{ all -> 0x030c }
            if (r11 != 0) goto L_0x0125
            java.lang.String r11 = ""
            goto L_0x0135
        L_0x0125:
            java.lang.String r11 = r11.trim()     // Catch:{ all -> 0x030c }
            int r14 = r11.length()     // Catch:{ all -> 0x030c }
            int r15 = r5.f4244c     // Catch:{ all -> 0x030c }
            if (r14 <= r15) goto L_0x0135
            java.lang.String r11 = r11.substring(r7, r15)     // Catch:{ all -> 0x030c }
        L_0x0135:
            r13.put(r12, r11)     // Catch:{ all -> 0x030c }
            goto L_0x00de
        L_0x0139:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x030c }
            java.lang.String r2 = "Custom attribute key must not be null."
            r0.<init>(r2)     // Catch:{ all -> 0x030c }
            throw r0     // Catch:{ all -> 0x030c }
        L_0x0141:
            if (r10 <= 0) goto L_0x0164
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x030c }
            r0.<init>()     // Catch:{ all -> 0x030c }
            java.lang.String r11 = "Ignored "
            r0.append(r11)     // Catch:{ all -> 0x030c }
            r0.append(r10)     // Catch:{ all -> 0x030c }
            java.lang.String r10 = " entries when adding custom keys. Maximum allowable: "
            r0.append(r10)     // Catch:{ all -> 0x030c }
            int r10 = r5.f4243b     // Catch:{ all -> 0x030c }
            r0.append(r10)     // Catch:{ all -> 0x030c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x030c }
            java.lang.String r10 = "FirebaseCrashlytics"
            r11 = 0
            android.util.Log.w(r10, r0, r11)     // Catch:{ all -> 0x030c }
        L_0x0164:
            monitor-exit(r5)
            d7.n0 r5 = r1.f4280k
            i7.d r10 = r5.f4253b
            i7.e r0 = r10.f6128b
            java.lang.String r11 = "start-time"
            java.io.File r0 = r0.a(r6, r11)
            long r11 = r0.lastModified()
            java.util.Iterator r0 = r4.iterator()
        L_0x0179:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0196
            java.lang.Object r4 = r0.next()
            android.app.ApplicationExitInfo r4 = (android.app.ApplicationExitInfo) r4
            long r13 = r4.getTimestamp()
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x018e
            goto L_0x0196
        L_0x018e:
            int r13 = r4.getReason()
            r14 = 6
            if (r13 == r14) goto L_0x0197
            goto L_0x0179
        L_0x0196:
            r4 = 0
        L_0x0197:
            java.lang.String r11 = "FirebaseCrashlytics"
            if (r4 != 0) goto L_0x01b0
            java.lang.String r0 = "No relevant ApplicationExitInfo occurred during session: "
            java.lang.String r0 = androidx.appcompat.widget.x0.e(r0, r6)
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r11, r4)
            if (r4 == 0) goto L_0x01ac
            r4 = 0
            android.util.Log.v(r11, r0, r4)
        L_0x01ac:
            r20 = r3
            goto L_0x034e
        L_0x01b0:
            java.io.InputStream r0 = r4.getTraceInputStream()     // Catch:{ IOException -> 0x01d5 }
            if (r0 == 0) goto L_0x01f4
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01d5 }
            r12.<init>()     // Catch:{ IOException -> 0x01d5 }
            r13 = 8192(0x2000, float:1.14794E-41)
            byte[] r13 = new byte[r13]     // Catch:{ IOException -> 0x01d5 }
        L_0x01bf:
            int r14 = r0.read(r13)     // Catch:{ IOException -> 0x01d5 }
            r15 = -1
            if (r14 == r15) goto L_0x01ca
            r12.write(r13, r7, r14)     // Catch:{ IOException -> 0x01d5 }
            goto L_0x01bf
        L_0x01ca:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException -> 0x01d5 }
            java.lang.String r0 = r0.name()     // Catch:{ IOException -> 0x01d5 }
            java.lang.String r0 = r12.toString(r0)     // Catch:{ IOException -> 0x01d5 }
            goto L_0x01f5
        L_0x01d5:
            r0 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Could not get input trace in application exit info: "
            r12.<init>(r13)
            java.lang.String r13 = r4.toString()
            r12.append(r13)
            java.lang.String r13 = " Error: "
            r12.append(r13)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            r12 = 0
            android.util.Log.w(r11, r0, r12)
        L_0x01f4:
            r0 = 0
        L_0x01f5:
            f7.c$a r12 = new f7.c$a
            r12.<init>()
            int r13 = r4.getImportance()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.d = r13
            java.lang.String r13 = r4.getProcessName()
            if (r13 == 0) goto L_0x0304
            r12.f4761b = r13
            int r13 = r4.getReason()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.f4762c = r13
            long r13 = r4.getTimestamp()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12.f4765g = r13
            int r13 = r4.getPid()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.f4760a = r13
            long r13 = r4.getPss()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12.f4763e = r13
            long r13 = r4.getRss()
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r12.f4764f = r4
            r12.f4766h = r0
            f7.c r0 = r12.a()
            d7.z r4 = r5.f4252a
            android.content.Context r5 = r4.f4304a
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.orientation
            f7.k$a r12 = new f7.k$a
            r12.<init>()
            java.lang.String r13 = "anr"
            r12.f4820b = r13
            long r13 = r0.f4758g
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12.f4819a = r13
            int r13 = r0.d
            r14 = 100
            if (r13 == r14) goto L_0x026a
            r7 = 1
        L_0x026a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r5)
            r14 = 0
            r16 = 0
            java.lang.Long r13 = java.lang.Long.valueOf(r16)
            java.lang.String r16 = ""
            if (r13 != 0) goto L_0x027f
            java.lang.String r16 = " address"
        L_0x027f:
            r23 = r16
            boolean r16 = r23.isEmpty()
            if (r16 == 0) goto L_0x02f6
            f7.p r15 = new f7.p
            r20 = r3
            long r2 = r13.longValue()
            java.lang.String r13 = "0"
            r15.<init>(r13, r13, r2)
            f7.b0 r18 = r4.a()
            f7.m r2 = new f7.m
            r13 = r2
            r17 = r15
            r3 = 0
            r15 = r3
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            java.lang.String r0 = ""
            if (r19 != 0) goto L_0x02ae
            java.lang.String r3 = " uiOrientation"
            java.lang.String r0 = r0.concat(r3)
        L_0x02ae:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x02ea
            f7.l r0 = new f7.l
            int r18 = r19.intValue()
            r15 = 0
            r16 = 0
            r13 = r0
            r14 = r2
            r17 = r7
            r13.<init>(r14, r15, r16, r17, r18)
            r12.f4821c = r0
            f7.s r0 = r4.b(r5)
            r12.d = r0
            f7.k r0 = r12.a()
            java.lang.String r2 = "Persisting anr for session "
            java.lang.String r2 = androidx.appcompat.widget.x0.e(r2, r6)
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r11, r3)
            if (r3 == 0) goto L_0x02e1
            r3 = 0
            android.util.Log.d(r11, r2, r3)
        L_0x02e1:
            f7.k r0 = d7.n0.a(r0, r8, r9)
            r2 = 1
            r10.c(r0, r6, r2)
            goto L_0x034e
        L_0x02ea:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Missing required properties:"
            java.lang.String r0 = r3.concat(r0)
            r2.<init>(r0)
            throw r2
        L_0x02f6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Missing required properties:"
            r3 = r23
            java.lang.String r2 = r2.concat(r3)
            r0.<init>(r2)
            throw r0
        L_0x0304:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "Null processName"
            r0.<init>(r2)
            throw r0
        L_0x030c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x030f:
            r11 = r5
        L_0x0310:
            d7.e.a(r11, r10)
            throw r0
        L_0x0314:
            r20 = r3
            java.lang.String r0 = "No ApplicationExitInfo available. Session: "
            java.lang.String r0 = androidx.appcompat.widget.x0.e(r0, r6)
            java.lang.String r2 = "FirebaseCrashlytics"
            r3 = 2
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L_0x034e
            goto L_0x0336
        L_0x0326:
            r20 = r3
            java.lang.String r2 = "ANR feature enabled, but device is API "
            java.lang.String r0 = b0.d.c(r2, r0)
            java.lang.String r2 = "FirebaseCrashlytics"
            boolean r2 = android.util.Log.isLoggable(r2, r4)
            if (r2 == 0) goto L_0x034e
        L_0x0336:
            java.lang.String r2 = "FirebaseCrashlytics"
            r3 = 0
            android.util.Log.v(r2, r0, r3)
            goto L_0x034e
        L_0x033d:
            r20 = r3
            java.lang.String r0 = "ANR feature disabled."
            java.lang.String r2 = "FirebaseCrashlytics"
            boolean r2 = android.util.Log.isLoggable(r2, r4)
            if (r2 == 0) goto L_0x034e
            java.lang.String r2 = "FirebaseCrashlytics"
            android.util.Log.v(r2, r0, r5)
        L_0x034e:
            a7.a r0 = r1.f4278i
            boolean r0 = r0.d(r6)
            if (r0 == 0) goto L_0x0383
            java.lang.String r0 = "Finalizing native report for session "
            java.lang.String r0 = androidx.appcompat.widget.x0.e(r0, r6)
            java.lang.String r2 = "FirebaseCrashlytics"
            r3 = 2
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            r4 = 0
            if (r3 == 0) goto L_0x0369
            android.util.Log.v(r2, r0, r4)
        L_0x0369:
            a7.a r0 = r1.f4278i
            a7.c r0 = r0.a(r6)
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "No minidump data found for session "
            r0.<init>(r3)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r2, r0, r4)
        L_0x0383:
            if (r22 == 0) goto L_0x038f
            r0 = 0
            r2 = r20
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0390
        L_0x038f:
            r0 = 0
        L_0x0390:
            d7.n0 r2 = r1.f4280k
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            i7.d r2 = r2.f4253b
            i7.e r5 = r2.f6128b
            r5.getClass()
            r6 = 2
            java.io.File[] r6 = new java.io.File[r6]
            java.io.File r7 = new java.io.File
            java.io.File r8 = r5.f6130a
            java.lang.String r9 = r8.getParent()
            java.lang.String r10 = ".com.google.firebase.crashlytics"
            r7.<init>(r9, r10)
            r9 = 0
            r6[r9] = r7
            java.io.File r7 = new java.io.File
            java.lang.String r8 = r8.getParent()
            java.lang.String r10 = ".com.google.firebase.crashlytics-ndk"
            r7.<init>(r8, r10)
            r8 = 1
            r6[r8] = r7
            r7 = r9
        L_0x03c2:
            java.lang.String r8 = "FirebaseCrashlytics"
            r10 = 2
            if (r7 >= r10) goto L_0x03f5
            r10 = r6[r7]
            boolean r11 = r10.exists()
            if (r11 == 0) goto L_0x03f2
            boolean r11 = i7.e.c(r10)
            if (r11 == 0) goto L_0x03f2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Deleted legacy Crashlytics files from "
            r11.<init>(r12)
            java.lang.String r10 = r10.getPath()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r11 = 3
            boolean r11 = android.util.Log.isLoggable(r8, r11)
            if (r11 == 0) goto L_0x03f2
            r11 = 0
            android.util.Log.d(r8, r10, r11)
        L_0x03f2:
            int r7 = r7 + 1
            goto L_0x03c2
        L_0x03f5:
            java.util.TreeSet r6 = new java.util.TreeSet
            i7.e r7 = r2.f6128b
            java.io.File r7 = r7.f6131b
            java.lang.String[] r7 = r7.list()
            java.util.List r7 = i7.e.d(r7)
            r6.<init>(r7)
            java.util.NavigableSet r6 = r6.descendingSet()
            if (r0 == 0) goto L_0x040f
            r6.remove(r0)
        L_0x040f:
            int r0 = r6.size()
            r7 = 8
            if (r0 > r7) goto L_0x0418
            goto L_0x0443
        L_0x0418:
            int r0 = r6.size()
            if (r0 <= r7) goto L_0x0443
            java.lang.Object r0 = r6.last()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = "Removing session over cap: "
            java.lang.String r10 = androidx.appcompat.widget.x0.e(r10, r0)
            r11 = 3
            boolean r11 = android.util.Log.isLoggable(r8, r11)
            if (r11 == 0) goto L_0x0435
            r11 = 0
            android.util.Log.d(r8, r10, r11)
        L_0x0435:
            java.io.File r10 = new java.io.File
            java.io.File r11 = r5.f6131b
            r10.<init>(r11, r0)
            i7.e.c(r10)
            r6.remove(r0)
            goto L_0x0418
        L_0x0443:
            java.util.Iterator r6 = r6.iterator()
        L_0x0447:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x05df
            java.lang.Object r0 = r6.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "Finalizing report for session "
            java.lang.String r0 = androidx.appcompat.widget.x0.e(r0, r7)
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r8, r10)
            if (r10 == 0) goto L_0x0465
            r10 = 0
            android.util.Log.v(r8, r0, r10)
        L_0x0465:
            i7.a r0 = i7.d.f6126h
            java.io.File r10 = new java.io.File
            java.io.File r11 = r5.f6131b
            r10.<init>(r11, r7)
            r10.mkdirs()
            java.io.File[] r0 = r10.listFiles(r0)
            java.util.List r0 = i7.e.d(r0)
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L_0x0494
            java.lang.String r0 = "Session "
            java.lang.String r9 = " has no events."
            java.lang.String r0 = b0.d.f(r0, r7, r9)
            r9 = 2
            boolean r9 = android.util.Log.isLoggable(r8, r9)
            if (r9 == 0) goto L_0x05d2
            r9 = 0
            android.util.Log.v(r8, r0, r9)
            goto L_0x05d2
        L_0x0494:
            java.util.Collections.sort(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x04a0:
            boolean r0 = r11.hasNext()
            g7.a r12 = i7.d.f6124f
            if (r0 == 0) goto L_0x0511
            java.lang.Object r0 = r11.next()
            r13 = r0
            java.io.File r13 = (java.io.File) r13
            java.lang.String r0 = i7.d.d(r13)     // Catch:{ IOException -> 0x04fe }
            r12.getClass()     // Catch:{ IOException -> 0x04fe }
            android.util.JsonReader r12 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x04f7 }
            java.io.StringReader r14 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x04f7 }
            r14.<init>(r0)     // Catch:{ IllegalStateException -> 0x04f7 }
            r12.<init>(r14)     // Catch:{ IllegalStateException -> 0x04f7 }
            f7.k r0 = g7.a.d(r12)     // Catch:{ all -> 0x04eb }
            r12.close()     // Catch:{ IllegalStateException -> 0x04f7 }
            r10.add(r0)     // Catch:{ IOException -> 0x04fe }
            if (r9 != 0) goto L_0x04e8
            java.lang.String r0 = r13.getName()     // Catch:{ IOException -> 0x04fe }
            java.lang.String r12 = "event"
            boolean r12 = r0.startsWith(r12)     // Catch:{ IOException -> 0x04fe }
            if (r12 == 0) goto L_0x04e2
            java.lang.String r12 = "_"
            boolean r0 = r0.endsWith(r12)     // Catch:{ IOException -> 0x04fe }
            if (r0 == 0) goto L_0x04e2
            r0 = 1
            goto L_0x04e3
        L_0x04e2:
            r0 = 0
        L_0x04e3:
            if (r0 == 0) goto L_0x04e6
            goto L_0x04e8
        L_0x04e6:
            r9 = 0
            goto L_0x04a0
        L_0x04e8:
            r0 = 1
            r9 = r0
            goto L_0x04a0
        L_0x04eb:
            r0 = move-exception
            r14 = r0
            r12.close()     // Catch:{ all -> 0x04f1 }
            goto L_0x04f6
        L_0x04f1:
            r0 = move-exception
            r12 = r0
            r14.addSuppressed(r12)     // Catch:{ IllegalStateException -> 0x04f7 }
        L_0x04f6:
            throw r14     // Catch:{ IllegalStateException -> 0x04f7 }
        L_0x04f7:
            r0 = move-exception
            java.io.IOException r12 = new java.io.IOException     // Catch:{ IOException -> 0x04fe }
            r12.<init>(r0)     // Catch:{ IOException -> 0x04fe }
            throw r12     // Catch:{ IOException -> 0x04fe }
        L_0x04fe:
            r0 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "Could not add event to report for "
            r12.<init>(r14)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.w(r8, r12, r0)
            goto L_0x04a0
        L_0x0511:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x052b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r9 = "Could not parse event files for session "
            r0.<init>(r9)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r9 = 0
            android.util.Log.w(r8, r0, r9)
            goto L_0x05d2
        L_0x052b:
            r11 = 0
            java.lang.String r0 = "user-id"
            java.io.File r0 = r5.a(r7, r0)
            boolean r13 = r0.isFile()
            if (r13 == 0) goto L_0x0550
            java.lang.String r11 = i7.d.d(r0)     // Catch:{ IOException -> 0x053d }
            goto L_0x0550
        L_0x053d:
            r0 = move-exception
            r13 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r14 = "Could not read user ID file in "
            r0.<init>(r14)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r8, r0, r13)
        L_0x0550:
            java.lang.String r0 = "report"
            java.io.File r13 = r5.a(r7, r0)
            java.lang.String r0 = i7.d.d(r13)     // Catch:{ IOException -> 0x05c0 }
            r12.getClass()     // Catch:{ IOException -> 0x05c0 }
            f7.b r0 = g7.a.g(r0)     // Catch:{ IOException -> 0x05c0 }
            f7.b r0 = r0.i(r3, r9, r11)     // Catch:{ IOException -> 0x05c0 }
            f7.b0 r11 = new f7.b0     // Catch:{ IOException -> 0x05c0 }
            r11.<init>(r10)     // Catch:{ IOException -> 0x05c0 }
            f7.a0$e r10 = r0.f4743h     // Catch:{ IOException -> 0x05c0 }
            if (r10 == 0) goto L_0x05b8
            f7.b$a r10 = new f7.b$a     // Catch:{ IOException -> 0x05c0 }
            r10.<init>(r0)     // Catch:{ IOException -> 0x05c0 }
            f7.a0$e r0 = r0.f4743h     // Catch:{ IOException -> 0x05c0 }
            f7.g$a r0 = r0.l()     // Catch:{ IOException -> 0x05c0 }
            r0.f4791j = r11     // Catch:{ IOException -> 0x05c0 }
            f7.g r0 = r0.a()     // Catch:{ IOException -> 0x05c0 }
            r10.f4750g = r0     // Catch:{ IOException -> 0x05c0 }
            f7.b r0 = r10.a()     // Catch:{ IOException -> 0x05c0 }
            f7.a0$e r10 = r0.f4743h     // Catch:{ IOException -> 0x05c0 }
            if (r10 != 0) goto L_0x058a
            goto L_0x05d2
        L_0x058a:
            if (r9 == 0) goto L_0x0598
            java.lang.String r9 = r10.g()     // Catch:{ IOException -> 0x05c0 }
            java.io.File r10 = new java.io.File     // Catch:{ IOException -> 0x05c0 }
            java.io.File r11 = r5.d     // Catch:{ IOException -> 0x05c0 }
            r10.<init>(r11, r9)     // Catch:{ IOException -> 0x05c0 }
            goto L_0x05a3
        L_0x0598:
            java.lang.String r9 = r10.g()     // Catch:{ IOException -> 0x05c0 }
            java.io.File r10 = new java.io.File     // Catch:{ IOException -> 0x05c0 }
            java.io.File r11 = r5.f6132c     // Catch:{ IOException -> 0x05c0 }
            r10.<init>(r11, r9)     // Catch:{ IOException -> 0x05c0 }
        L_0x05a3:
            q7.d r9 = g7.a.f4992a     // Catch:{ IOException -> 0x05c0 }
            r9.getClass()     // Catch:{ IOException -> 0x05c0 }
            java.io.StringWriter r11 = new java.io.StringWriter     // Catch:{ IOException -> 0x05c0 }
            r11.<init>()     // Catch:{ IOException -> 0x05c0 }
            r9.a(r11, r0)     // Catch:{ IOException -> 0x05b0 }
        L_0x05b0:
            java.lang.String r0 = r11.toString()     // Catch:{ IOException -> 0x05c0 }
            i7.d.e(r10, r0)     // Catch:{ IOException -> 0x05c0 }
            goto L_0x05d2
        L_0x05b8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x05c0 }
            java.lang.String r9 = "Reports without sessions cannot have events added to them."
            r0.<init>(r9)     // Catch:{ IOException -> 0x05c0 }
            throw r0     // Catch:{ IOException -> 0x05c0 }
        L_0x05c0:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Could not synthesize final report file for "
            r9.<init>(r10)
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r8, r9, r0)
        L_0x05d2:
            java.io.File r0 = new java.io.File
            java.io.File r9 = r5.f6131b
            r0.<init>(r9, r7)
            i7.e.c(r0)
            r9 = 0
            goto L_0x0447
        L_0x05df:
            k7.d r0 = r2.f6129c
            k7.c r0 = (k7.c) r0
            java.util.concurrent.atomic.AtomicReference<l7.d> r0 = r0.f6718h
            java.lang.Object r0 = r0.get()
            l7.d r0 = (l7.d) r0
            l7.c r0 = r0.a()
            r0.getClass()
            java.util.ArrayList r0 = r2.b()
            int r2 = r0.size()
            r3 = 4
            if (r2 > r3) goto L_0x05fe
            goto L_0x0616
        L_0x05fe:
            java.util.List r0 = r0.subList(r3, r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0606:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0616
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            r2.delete()
            goto L_0x0606
        L_0x0616:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.t.c(boolean, k7.d):void");
    }

    public final boolean d(d dVar) {
        boolean z;
        if (Boolean.TRUE.equals(this.d.d.get())) {
            b0 b0Var = this.l;
            if (b0Var == null || !b0Var.f4206e.get()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", (Throwable) null);
                return false;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", (Throwable) null);
            }
            try {
                c(true, dVar);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", (Throwable) null);
                }
                return true;
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
                return false;
            }
        } else {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public final i e(r rVar) {
        boolean z;
        r<TResult> rVar2;
        r<TResult> rVar3;
        e eVar = this.f4280k.f4253b.f6128b;
        if (!e.d(eVar.f6132c.listFiles()).isEmpty() || !e.d(eVar.d.listFiles()).isEmpty() || !e.d(eVar.f6133e.listFiles()).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        j<Boolean> jVar = this.f4281m;
        if (!z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", (Throwable) null);
            }
            jVar.c(Boolean.FALSE);
            return l.e((Object) null);
        }
        s6.a aVar = s6.a.f8805s;
        aVar.L("Crash reports are available to be sent.");
        c0 c0Var = this.f4272b;
        if (c0Var.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", (Throwable) null);
            }
            jVar.c(Boolean.FALSE);
            rVar2 = l.e(Boolean.TRUE);
        } else {
            aVar.t("Automatic data collection is disabled.");
            aVar.L("Notifying that unsent reports are available.");
            jVar.c(Boolean.TRUE);
            synchronized (c0Var.f4208b) {
                rVar3 = c0Var.f4209c.f7089a;
            }
            i<TContinuationResult> o10 = rVar3.o(new androidx.databinding.a());
            aVar.t("Waiting for send/deleteUnsentReports to be called.");
            r<TResult> rVar4 = this.f4282n.f7089a;
            ExecutorService executorService = p0.f4263a;
            j jVar2 = new j();
            e2.a aVar2 = new e2.a(5, jVar2);
            o10.f(aVar2);
            rVar4.f(aVar2);
            rVar2 = jVar2.f7089a;
        }
        return rVar2.o(new q(this, rVar));
    }
}
