package w7;

import android.net.TrafficStats;
import android.util.Log;
import d8.g;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import m5.j;
import m5.l;
import m5.r;
import n4.m;
import s6.c;
import w7.f;
import y7.a;
import y7.c;
import z7.b;
import z7.e;
import z7.f;

public final class d implements e {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f9271m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public static final a f9272n = new a();

    /* renamed from: a  reason: collision with root package name */
    public final c f9273a;

    /* renamed from: b  reason: collision with root package name */
    public final z7.c f9274b;

    /* renamed from: c  reason: collision with root package name */
    public final y7.c f9275c;
    public final l d;

    /* renamed from: e  reason: collision with root package name */
    public final y7.b f9276e;

    /* renamed from: f  reason: collision with root package name */
    public final j f9277f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f9278g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f9279h;

    /* renamed from: i  reason: collision with root package name */
    public final ThreadPoolExecutor f9280i;

    /* renamed from: j  reason: collision with root package name */
    public String f9281j;

    /* renamed from: k  reason: collision with root package name */
    public final HashSet f9282k = new HashSet();
    public final ArrayList l = new ArrayList();

    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f9283a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f9283a.getAndIncrement())}));
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9284a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f9285b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                z7.f$b[] r0 = z7.f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9285b = r0
                r1 = 1
                z7.f$b r2 = z7.f.b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9285b     // Catch:{ NoSuchFieldError -> 0x001d }
                z7.f$b r3 = z7.f.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f9285b     // Catch:{ NoSuchFieldError -> 0x0028 }
                z7.f$b r3 = z7.f.b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                z7.d$a[] r2 = z7.d.a.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f9284a = r2
                z7.d$a r3 = z7.d.a.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f9284a     // Catch:{ NoSuchFieldError -> 0x0043 }
                z7.d$a r2 = z7.d.a.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w7.d.b.<clinit>():void");
        }
    }

    public d(c cVar, v7.b<g> bVar, v7.b<t7.d> bVar2) {
        c cVar2 = cVar;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        a aVar = f9272n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, aVar);
        cVar.a();
        z7.c cVar3 = new z7.c(cVar2.f8815a, bVar, bVar2);
        y7.c cVar4 = new y7.c(cVar2);
        l a10 = l.a();
        y7.b bVar3 = new y7.b(cVar2);
        j jVar = new j();
        this.f9273a = cVar2;
        this.f9274b = cVar3;
        this.f9275c = cVar4;
        this.d = a10;
        this.f9276e = bVar3;
        this.f9277f = jVar;
        this.f9279h = threadPoolExecutor;
        this.f9280i = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), aVar);
    }

    public final r a() {
        d();
        j jVar = new j();
        g gVar = new g(this.d, jVar);
        synchronized (this.f9278g) {
            this.l.add(gVar);
        }
        this.f9279h.execute(new b(this));
        return jVar.f7089a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f A[SYNTHETIC, Splitter:B:15:0x003f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = f9271m
            monitor-enter(r0)
            s6.c r1 = r6.f9273a     // Catch:{ all -> 0x0066 }
            r1.a()     // Catch:{ all -> 0x0066 }
            android.content.Context r1 = r1.f8815a     // Catch:{ all -> 0x0066 }
            androidx.appcompat.widget.m r1 = androidx.appcompat.widget.m.a(r1)     // Catch:{ all -> 0x0066 }
            y7.c r2 = r6.f9275c     // Catch:{ all -> 0x005f }
            y7.a r2 = r2.b()     // Catch:{ all -> 0x005f }
            y7.c$a r3 = y7.c.a.NOT_GENERATED     // Catch:{ all -> 0x005f }
            y7.c$a r4 = r2.f9605c     // Catch:{ all -> 0x005f }
            if (r4 == r3) goto L_0x0021
            y7.c$a r3 = y7.c.a.ATTEMPT_MIGRATION     // Catch:{ all -> 0x005f }
            if (r4 != r3) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r3 = 0
            goto L_0x0022
        L_0x0021:
            r3 = 1
        L_0x0022:
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r6.e(r2)     // Catch:{ all -> 0x005f }
            y7.c r4 = r6.f9275c     // Catch:{ all -> 0x005f }
            y7.a$a r5 = new y7.a$a     // Catch:{ all -> 0x005f }
            r5.<init>(r2)     // Catch:{ all -> 0x005f }
            r5.f9610a = r3     // Catch:{ all -> 0x005f }
            y7.c$a r2 = y7.c.a.UNREGISTERED     // Catch:{ all -> 0x005f }
            r5.b(r2)     // Catch:{ all -> 0x005f }
            y7.a r2 = r5.a()     // Catch:{ all -> 0x005f }
            r4.a(r2)     // Catch:{ all -> 0x005f }
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.l()     // Catch:{ all -> 0x0066 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            if (r7 == 0) goto L_0x0051
            y7.a$a r0 = new y7.a$a
            r0.<init>(r2)
            r1 = 0
            r0.f9612c = r1
            y7.a r2 = r0.a()
        L_0x0051:
            r6.g(r2)
            java.util.concurrent.ThreadPoolExecutor r0 = r6.f9280i
            w7.c r1 = new w7.c
            r1.<init>(r6, r7)
            r0.execute(r1)
            return
        L_0x005f:
            r7 = move-exception
            if (r1 == 0) goto L_0x0065
            r1.l()     // Catch:{ all -> 0x0066 }
        L_0x0065:
            throw r7     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.d.b(boolean):void");
    }

    public final y7.a c(y7.a aVar) {
        boolean z;
        boolean z10;
        z7.b f10;
        b.a aVar2;
        f.b bVar;
        y7.a aVar3 = aVar;
        c cVar = this.f9273a;
        cVar.a();
        String str = cVar.f8817c.f8826a;
        String str2 = aVar3.f9604b;
        c cVar2 = this.f9273a;
        cVar2.a();
        String str3 = cVar2.f8817c.f8831g;
        String str4 = aVar3.f9606e;
        z7.c cVar3 = this.f9274b;
        e eVar = cVar3.d;
        synchronized (eVar) {
            if (eVar.f9957c != 0) {
                eVar.f9955a.f9293a.getClass();
                if (System.currentTimeMillis() <= eVar.f9956b) {
                    z = false;
                }
            }
            z = true;
        }
        if (z) {
            URL a10 = z7.c.a(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
            int i10 = 0;
            while (i10 <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar3.c(a10, str);
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c10.setDoOutput(true);
                    z7.c.h(c10);
                    int responseCode = c10.getResponseCode();
                    eVar.a(responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        f10 = z7.c.f(c10);
                    } else {
                        z7.c.b(c10, (String) null, str, str3);
                        if (responseCode == 401) {
                            aVar2 = new b.a();
                            aVar2.f9947a = 0L;
                            bVar = f.b.AUTH_ERROR;
                        } else if (responseCode == 404) {
                            aVar2 = new b.a();
                            aVar2.f9947a = 0L;
                            bVar = f.b.AUTH_ERROR;
                        } else if (responseCode == 429) {
                            f.a aVar4 = f.a.BAD_CONFIG;
                            throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        } else if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            aVar2 = new b.a();
                            aVar2.f9947a = 0L;
                            bVar = f.b.BAD_CONFIG;
                        } else {
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i10++;
                        }
                        aVar2.f9948b = bVar;
                        f10 = aVar2.a();
                    }
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int i11 = b.f9285b[f10.f9946c.ordinal()];
                    if (i11 == 1) {
                        l lVar = this.d;
                        lVar.getClass();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        lVar.f9293a.getClass();
                        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                        a.C0166a aVar5 = new a.C0166a(aVar3);
                        aVar5.f9612c = f10.f9944a;
                        aVar5.f9613e = Long.valueOf(f10.f9945b);
                        aVar5.f9614f = Long.valueOf(seconds);
                        return aVar5.a();
                    } else if (i11 == 2) {
                        a.C0166a h10 = aVar.h();
                        h10.f9615g = "BAD CONFIG";
                        h10.b(c.a.REGISTER_ERROR);
                        return h10.a();
                    } else if (i11 == 3) {
                        synchronized (this) {
                            try {
                                this.f9281j = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        a.C0166a aVar6 = new a.C0166a(aVar3);
                        aVar6.b(c.a.NOT_GENERATED);
                        return aVar6.a();
                    } else {
                        f.a aVar7 = f.a.BAD_CONFIG;
                        throw new f("Firebase Installations Service is unavailable. Please try again later.");
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            }
            f.a aVar8 = f.a.BAD_CONFIG;
            throw new f("Firebase Installations Service is unavailable. Please try again later.");
        }
        f.a aVar9 = f.a.BAD_CONFIG;
        throw new f("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void d() {
        s6.c cVar = this.f9273a;
        cVar.a();
        m.f("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", cVar.f8817c.f8827b);
        cVar.a();
        m.f("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", cVar.f8817c.f8831g);
        cVar.a();
        m.f("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", cVar.f8817c.f8826a);
        cVar.a();
        String str = cVar.f8817c.f8827b;
        Pattern pattern = l.f9292c;
        m.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        cVar.a();
        m.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", l.f9292c.matcher(cVar.f8817c.f8826a).matches());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.f8816b) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String e(y7.a r6) {
        /*
            r5 = this;
            s6.c r0 = r5.f9273a
            r0.a()
            java.lang.String r0 = r0.f8816b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001e
            s6.c r0 = r5.f9273a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f8816b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0029
        L_0x001e:
            y7.c$a r6 = r6.f9605c
            y7.c$a r0 = y7.c.a.ATTEMPT_MIGRATION
            if (r6 != r0) goto L_0x0026
            r6 = 1
            goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            if (r6 != 0) goto L_0x0033
        L_0x0029:
            w7.j r6 = r5.f9277f
            r6.getClass()
            java.lang.String r6 = w7.j.a()
            return r6
        L_0x0033:
            y7.b r6 = r5.f9276e
            android.content.SharedPreferences r0 = r6.f9617a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f9617a     // Catch:{ all -> 0x0060 }
            monitor-enter(r1)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences r2 = r6.f9617a     // Catch:{ all -> 0x005d }
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ all -> 0x005d }
            monitor-exit(r1)     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x0048
            goto L_0x004c
        L_0x0048:
            java.lang.String r2 = r6.a()     // Catch:{ all -> 0x0060 }
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x005c
            w7.j r6 = r5.f9277f
            r6.getClass()
            java.lang.String r2 = w7.j.a()
        L_0x005c:
            return r2
        L_0x005d:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005d }
            throw r6     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.d.e(y7.a):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:20|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final y7.a f(y7.a r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = r0.f9604b
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0063
            int r2 = r2.length()
            r5 = 11
            if (r2 != r5) goto L_0x0063
            y7.b r2 = r1.f9276e
            android.content.SharedPreferences r5 = r2.f9617a
            monitor-enter(r5)
            java.lang.String[] r6 = y7.b.f9616c     // Catch:{ all -> 0x0059 }
            r7 = r3
        L_0x001a:
            r8 = 4
            if (r7 >= r8) goto L_0x005c
            r8 = r6[r7]     // Catch:{ all -> 0x0059 }
            java.lang.String r9 = r2.f9618b     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            java.lang.String r11 = "|T|"
            r10.<init>(r11)     // Catch:{ all -> 0x0059 }
            r10.append(r9)     // Catch:{ all -> 0x0059 }
            java.lang.String r9 = "|"
            r10.append(r9)     // Catch:{ all -> 0x0059 }
            r10.append(r8)     // Catch:{ all -> 0x0059 }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x0059 }
            android.content.SharedPreferences r9 = r2.f9617a     // Catch:{ all -> 0x0059 }
            java.lang.String r8 = r9.getString(r8, r4)     // Catch:{ all -> 0x0059 }
            if (r8 == 0) goto L_0x005e
            boolean r9 = r8.isEmpty()     // Catch:{ all -> 0x0059 }
            if (r9 != 0) goto L_0x005e
            java.lang.String r2 = "{"
            boolean r2 = r8.startsWith(r2)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x005b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005c }
            r2.<init>(r8)     // Catch:{ JSONException -> 0x005c }
            java.lang.String r6 = "token"
            java.lang.String r4 = r2.getString(r6)     // Catch:{ JSONException -> 0x005c }
            goto L_0x005c
        L_0x0059:
            r0 = move-exception
            goto L_0x0061
        L_0x005b:
            r4 = r8
        L_0x005c:
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            goto L_0x0063
        L_0x005e:
            int r7 = r7 + 1
            goto L_0x001a
        L_0x0061:
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            throw r0
        L_0x0063:
            z7.c r2 = r1.f9274b
            s6.c r5 = r1.f9273a
            r5.a()
            s6.e r5 = r5.f8817c
            java.lang.String r5 = r5.f8826a
            java.lang.String r6 = r0.f9604b
            s6.c r7 = r1.f9273a
            r7.a()
            s6.e r7 = r7.f8817c
            java.lang.String r7 = r7.f8831g
            s6.c r8 = r1.f9273a
            r8.a()
            s6.e r8 = r8.f8817c
            java.lang.String r8 = r8.f8827b
            z7.e r9 = r2.d
            monitor-enter(r9)
            int r10 = r9.f9957c     // Catch:{ all -> 0x01c0 }
            r11 = 1
            if (r10 == 0) goto L_0x009e
            w7.l r10 = r9.f9955a     // Catch:{ all -> 0x01c0 }
            n.e r10 = r10.f9293a     // Catch:{ all -> 0x01c0 }
            r10.getClass()     // Catch:{ all -> 0x01c0 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01c0 }
            long r14 = r9.f9956b     // Catch:{ all -> 0x01c0 }
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r10 = r3
            goto L_0x009f
        L_0x009e:
            r10 = r11
        L_0x009f:
            monitor-exit(r9)
            java.lang.String r12 = "Firebase Installations Service is unavailable. Please try again later."
            if (r10 == 0) goto L_0x01b8
            java.lang.Object[] r10 = new java.lang.Object[r11]
            r10[r3] = r7
            java.lang.String r13 = "projects/%s/installations"
            java.lang.String r10 = java.lang.String.format(r13, r10)
            java.net.URL r10 = z7.c.a(r10)
            r13 = r3
        L_0x00b3:
            if (r13 > r11) goto L_0x01b0
            r14 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r14)
            java.net.HttpURLConnection r14 = r2.c(r10, r5)
            java.lang.String r15 = "POST"
            r14.setRequestMethod(r15)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            r14.setDoOutput(r11)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            if (r4 == 0) goto L_0x00d2
            java.lang.String r15 = "x-goog-fis-android-iid-migration-auth"
            r14.addRequestProperty(r15, r4)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            goto L_0x00d2
        L_0x00cf:
            r0 = move-exception
            goto L_0x019e
        L_0x00d2:
            z7.c.g(r14, r6, r8)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            int r15 = r14.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            r9.a(r15)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            r3 = 200(0xc8, float:2.8E-43)
            if (r15 < r3) goto L_0x00e6
            r3 = 300(0x12c, float:4.2E-43)
            if (r15 >= r3) goto L_0x00e6
            r3 = r11
            goto L_0x00e7
        L_0x00e6:
            r3 = 0
        L_0x00e7:
            if (r3 == 0) goto L_0x00f4
            z7.a r2 = z7.c.e(r14)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            r14.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0124
        L_0x00f4:
            z7.c.b(r14, r8, r5, r7)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            r3 = 429(0x1ad, float:6.01E-43)
            if (r15 == r3) goto L_0x0194
            r3 = 500(0x1f4, float:7.0E-43)
            if (r15 < r3) goto L_0x0105
            r3 = 600(0x258, float:8.41E-43)
            if (r15 >= r3) goto L_0x0105
            goto L_0x01a5
        L_0x0105:
            java.lang.String r3 = "Firebase-Installations"
            java.lang.String r15 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r3, r15)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            z7.d$a r21 = z7.d.a.BAD_CONFIG     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            z7.a r3 = new z7.a     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            r14.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r2 = r3
        L_0x0124:
            int[] r3 = w7.d.b.f9284a
            z7.d$a r4 = r2.f9943e
            int r4 = r4.ordinal()
            r3 = r3[r4]
            if (r3 == r11) goto L_0x014f
            r2 = 2
            if (r3 != r2) goto L_0x0145
            y7.a$a r0 = r23.h()
            java.lang.String r2 = "BAD CONFIG"
            r0.f9615g = r2
            y7.c$a r2 = y7.c.a.REGISTER_ERROR
            r0.b(r2)
            y7.a r0 = r0.a()
            return r0
        L_0x0145:
            w7.f r0 = new w7.f
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            w7.f$a r3 = w7.f.a.BAD_CONFIG
            r0.<init>(r2)
            throw r0
        L_0x014f:
            java.lang.String r3 = r2.f9941b
            java.lang.String r4 = r2.f9942c
            w7.l r5 = r1.d
            r5.getClass()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            n.e r5 = r5.f9293a
            r5.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r6.toSeconds(r7)
            z7.f r7 = r2.d
            java.lang.String r7 = r7.b()
            z7.f r2 = r2.d
            long r8 = r2.c()
            y7.a$a r2 = new y7.a$a
            r2.<init>(r0)
            r2.f9610a = r3
            y7.c$a r0 = y7.c.a.REGISTERED
            r2.b(r0)
            r2.f9612c = r7
            r2.d = r4
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2.f9613e = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r2.f9614f = r0
            y7.a r0 = r2.a()
            return r0
        L_0x0194:
            w7.f r3 = new w7.f     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            java.lang.String r15 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            w7.f$a r16 = w7.f.a.BAD_CONFIG     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            r3.<init>(r15)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
            throw r3     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00cf }
        L_0x019e:
            r14.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x01a5:
            r14.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r13 = r13 + 1
            r3 = 0
            goto L_0x00b3
        L_0x01b0:
            w7.f r0 = new w7.f
            w7.f$a r2 = w7.f.a.BAD_CONFIG
            r0.<init>(r12)
            throw r0
        L_0x01b8:
            w7.f r0 = new w7.f
            w7.f$a r2 = w7.f.a.BAD_CONFIG
            r0.<init>(r12)
            throw r0
        L_0x01c0:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.d.f(y7.a):y7.a");
    }

    public final void g(y7.a aVar) {
        synchronized (this.f9278g) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                if (((k) it.next()).a(aVar)) {
                    it.remove();
                }
            }
        }
    }

    public final r getId() {
        String str;
        d();
        synchronized (this) {
            str = this.f9281j;
        }
        if (str != null) {
            return l.e(str);
        }
        j jVar = new j();
        h hVar = new h(jVar);
        synchronized (this.f9278g) {
            this.l.add(hVar);
        }
        r<TResult> rVar = jVar.f7089a;
        this.f9279h.execute(new a2.d(3, this));
        return rVar;
    }
}
