package s6;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l4.b;
import n.h;
import n4.l;
import n4.m;
import y6.i;
import y6.o;

public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f8812i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final C0130c f8813j = new C0130c();

    /* renamed from: k  reason: collision with root package name */
    public static final n.b f8814k = new n.b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f8815a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8816b;

    /* renamed from: c  reason: collision with root package name */
    public final e f8817c;
    public final i d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f8818e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f8819f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    public final o<a8.a> f8820g;

    /* renamed from: h  reason: collision with root package name */
    public final CopyOnWriteArrayList f8821h = new CopyOnWriteArrayList();

    public interface a {
        void a();
    }

    @TargetApi(14)
    public static class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static final AtomicReference<b> f8822a = new AtomicReference<>();

        public final void a(boolean z) {
            synchronized (c.f8812i) {
                Iterator it = new ArrayList(c.f8814k.values()).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.f8818e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = cVar.f8821h.iterator();
                        while (it2.hasNext()) {
                            ((a) it2.next()).a();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: s6.c$c  reason: collision with other inner class name */
    public static class C0130c implements Executor {

        /* renamed from: o  reason: collision with root package name */
        public static final Handler f8823o = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            f8823o.post(runnable);
        }
    }

    @TargetApi(24)
    public static class d extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final AtomicReference<d> f8824b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        public final Context f8825a;

        public d(Context context) {
            this.f8825a = context;
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (c.f8812i) {
                Iterator it = ((h.e) c.f8814k.values()).iterator();
                while (it.hasNext()) {
                    ((c) it.next()).d();
                }
            }
            this.f8825a.unregisterReceiver(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b2 A[LOOP:1: B:25:0x00ac->B:27:0x00b2, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r8, s6.e r9, java.lang.String r10) {
        /*
            r7 = this;
            r7.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r7.f8818e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r7.f8819f = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r7.f8821h = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r7.f8815a = r8
            n4.m.e(r10)
            r7.f8816b = r10
            r7.f8817c = r9
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r10 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "ComponentDiscovery"
            android.content.pm.PackageManager r3 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x005e }
            if (r3 != 0) goto L_0x0039
            java.lang.String r10 = "Context has no PackageManager."
            goto L_0x0057
        L_0x0039:
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x005e }
            r4.<init>(r8, r10)     // Catch:{ NameNotFoundException -> 0x005e }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r3 = r3.getServiceInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x005e }
            if (r3 != 0) goto L_0x005b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x005e }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x005e }
            r3.append(r10)     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r10 = " has no service info."
            r3.append(r10)     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r10 = r3.toString()     // Catch:{ NameNotFoundException -> 0x005e }
        L_0x0057:
            android.util.Log.w(r2, r10)     // Catch:{ NameNotFoundException -> 0x005e }
            goto L_0x0063
        L_0x005b:
            android.os.Bundle r10 = r3.metaData     // Catch:{ NameNotFoundException -> 0x005e }
            goto L_0x0064
        L_0x005e:
            java.lang.String r10 = "Application info not found."
            android.util.Log.w(r2, r10)
        L_0x0063:
            r10 = 0
        L_0x0064:
            if (r10 != 0) goto L_0x0070
            java.lang.String r10 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r2, r10)
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x00a8
        L_0x0070:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r3 = r10.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x007d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00a7
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r10.get(r4)
            java.lang.String r6 = "com.google.firebase.components.ComponentRegistrar"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x007d
            java.lang.String r5 = "com.google.firebase.components:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x007d
            r5 = 31
            java.lang.String r4 = r4.substring(r5)
            r2.add(r4)
            goto L_0x007d
        L_0x00a7:
            r10 = r2
        L_0x00a8:
            java.util.Iterator r10 = r10.iterator()
        L_0x00ac:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00c1
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            y6.d r3 = new y6.d
            r3.<init>(r1, r2)
            r0.add(r3)
            goto L_0x00ac
        L_0x00c1:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.addAll(r0)
            com.google.firebase.FirebaseCommonRegistrar r0 = new com.google.firebase.FirebaseCommonRegistrar
            r0.<init>()
            y6.d r3 = new y6.d
            r4 = 1
            r3.<init>(r4, r0)
            r10.add(r3)
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r3 = new java.lang.Class[r1]
            y6.b r0 = y6.b.b(r8, r0, r3)
            r2.add(r0)
            java.lang.Class<s6.c> r0 = s6.c.class
            java.lang.Class[] r3 = new java.lang.Class[r1]
            y6.b r0 = y6.b.b(r7, r0, r3)
            r2.add(r0)
            java.lang.Class<s6.e> r0 = s6.e.class
            java.lang.Class[] r1 = new java.lang.Class[r1]
            y6.b r9 = y6.b.b(r9, r0, r1)
            r2.add(r9)
            y6.i r9 = new y6.i
            s6.c$c r0 = f8813j
            r9.<init>(r0, r10, r2)
            r7.d = r9
            y6.o r9 = new y6.o
            s6.b r10 = new s6.b
            r10.<init>(r7, r8)
            r9.<init>(r10)
            r7.f8820g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.c.<init>(android.content.Context, s6.e, java.lang.String):void");
    }

    public static c b() {
        c cVar;
        synchronized (f8812i) {
            cVar = (c) f8814k.getOrDefault("[DEFAULT]", null);
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + r4.h.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    public static c e(Context context) {
        synchronized (f8812i) {
            if (f8814k.containsKey("[DEFAULT]")) {
                c b10 = b();
                return b10;
            }
            e a10 = e.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            c f10 = f(context, a10);
            return f10;
        }
    }

    public static c f(Context context, e eVar) {
        c cVar;
        boolean z;
        AtomicReference<b> atomicReference = b.f8822a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.f8822a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                while (true) {
                    if (!atomicReference2.compareAndSet((Object) null, bVar)) {
                        if (atomicReference2.get() != null) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    l4.b bVar2 = l4.b.f6876s;
                    synchronized (bVar2) {
                        if (!bVar2.f6880r) {
                            application.registerActivityLifecycleCallbacks(bVar2);
                            application.registerComponentCallbacks(bVar2);
                            bVar2.f6880r = true;
                        }
                    }
                    bVar2.getClass();
                    synchronized (bVar2) {
                        bVar2.f6879q.add(bVar);
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f8812i) {
            n.b bVar3 = f8814k;
            m.j("FirebaseApp name " + "[DEFAULT]" + " already exists!", true ^ bVar3.containsKey("[DEFAULT]"));
            m.i(context, "Application context cannot be null.");
            cVar = new c(context, eVar, "[DEFAULT]");
            bVar3.put("[DEFAULT]", cVar);
        }
        cVar.d();
        return cVar;
    }

    public final void a() {
        m.j("FirebaseApp was deleted", !this.f8819f.get());
    }

    public final String c() {
        String str;
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f8816b.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bytes, 11);
        }
        sb.append(str);
        sb.append("+");
        a();
        byte[] bytes2 = this.f8817c.f8827b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str2);
        return sb.toString();
    }

    public final void d() {
        HashMap hashMap;
        boolean z = true;
        if (!((UserManager) this.f8815a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f8816b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f8815a;
            AtomicReference<d> atomicReference = d.f8824b;
            if (atomicReference.get() == null) {
                d dVar = new d(context);
                while (true) {
                    if (!atomicReference.compareAndSet((Object) null, dVar)) {
                        if (atomicReference.get() != null) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f8816b);
        Log.i("FirebaseApp", sb2.toString());
        i iVar = this.d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f8816b);
        AtomicReference<Boolean> atomicReference2 = iVar.f9576s;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (!atomicReference2.compareAndSet((Object) null, valueOf)) {
                if (atomicReference2.get() != null) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            synchronized (iVar) {
                hashMap = new HashMap(iVar.f9572o);
            }
            iVar.E(hashMap, equals);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.a();
        return this.f8816b.equals(cVar.f8816b);
    }

    public final boolean g() {
        boolean z;
        a();
        a8.a aVar = this.f8820g.get();
        synchronized (aVar) {
            z = aVar.f116b;
        }
        return z;
    }

    public final int hashCode() {
        return this.f8816b.hashCode();
    }

    public final String toString() {
        l.a aVar = new l.a(this);
        aVar.a(this.f8816b, "name");
        aVar.a(this.f8817c, "options");
        return aVar.toString();
    }
}
