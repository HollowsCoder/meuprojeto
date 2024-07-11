package l4;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.widget.x0;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import i4.k;
import j4.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k4.a;
import k4.d;
import k4.i;
import m5.j;
import n.h;
import n4.b;
import n4.c;
import n4.h;
import n4.l;
import n4.m;
import n4.u;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import r4.g;

public final class d implements Handler.Callback {
    @RecentlyNonNull

    /* renamed from: k  reason: collision with root package name */
    public static final Status f6881k = new Status("Sign-out occurred while this API call was in progress.", 4);
    public static final Status l = new Status("The user must be signed in to make this API call.", 4);

    /* renamed from: m  reason: collision with root package name */
    public static final Object f6882m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public static d f6883n;

    /* renamed from: a  reason: collision with root package name */
    public long f6884a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public final Context f6885b;

    /* renamed from: c  reason: collision with root package name */
    public final e f6886c;
    public final u d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicInteger f6887e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicInteger f6888f;

    /* renamed from: g  reason: collision with root package name */
    public final ConcurrentHashMap f6889g;

    /* renamed from: h  reason: collision with root package name */
    public final n.d f6890h;
    @NotOnlyInitialized

    /* renamed from: i  reason: collision with root package name */
    public final z4.c f6891i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f6892j;

    public class a<O extends a.c> implements d.a, d.b {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedList f6893a = new LinkedList();
        @NotOnlyInitialized

        /* renamed from: b  reason: collision with root package name */
        public final a.e f6894b;

        /* renamed from: c  reason: collision with root package name */
        public final a<O> f6895c;
        public final e0 d;

        /* renamed from: e  reason: collision with root package name */
        public final HashSet f6896e = new HashSet();

        /* renamed from: f  reason: collision with root package name */
        public final HashMap f6897f = new HashMap();

        /* renamed from: g  reason: collision with root package name */
        public final int f6898g;

        /* renamed from: h  reason: collision with root package name */
        public final v f6899h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f6900i;

        /* renamed from: j  reason: collision with root package name */
        public final ArrayList f6901j = new ArrayList();

        /* renamed from: k  reason: collision with root package name */
        public j4.b f6902k = null;

        public a(k4.c<O> cVar) {
            Looper looper = d.this.f6891i.getLooper();
            c.a a10 = cVar.a();
            n4.c cVar2 = new n4.c(a10.f7407a, a10.f7408b, a10.f7409c, a10.d);
            a.C0093a<?, O> aVar = cVar.f6689b.f6686a;
            m.h(aVar);
            a.e a11 = aVar.a(cVar.f6688a, looper, cVar2, cVar.f6690c, this, this);
            this.f6894b = a11;
            this.f6895c = cVar.d;
            this.d = new e0();
            this.f6898g = cVar.f6692f;
            if (a11.l()) {
                z4.c cVar3 = d.this.f6891i;
                c.a a12 = cVar.a();
                this.f6899h = new v(d.this.f6885b, cVar3, new n4.c(a12.f7407a, a12.f7408b, a12.f7409c, a12.d));
                return;
            }
            this.f6899h = null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0078 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r8) {
            /*
                r7 = this;
                l4.d r0 = l4.d.this
                z4.c r1 = r0.f6891i
                n4.m.c(r1)
                r1 = 0
                r7.f6902k = r1
                r2 = 1
                r7.f6900i = r2
                k4.a$e r3 = r7.f6894b
                java.lang.String r3 = r3.i()
                l4.e0 r4 = r7.d
                r4.getClass()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "The connection to Google Play services was lost"
                r5.<init>(r6)
                if (r8 != r2) goto L_0x0024
                java.lang.String r8 = " due to service disconnection."
                goto L_0x0029
            L_0x0024:
                r6 = 3
                if (r8 != r6) goto L_0x002c
                java.lang.String r8 = " due to dead object exception."
            L_0x0029:
                r5.append(r8)
            L_0x002c:
                if (r3 == 0) goto L_0x0036
                java.lang.String r8 = " Last reason for disconnect: "
                r5.append(r8)
                r5.append(r3)
            L_0x0036:
                com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status
                java.lang.String r3 = r5.toString()
                r5 = 20
                r8.<init>((int) r5, (java.lang.String) r3)
                r4.a(r2, r8)
                z4.c r8 = r0.f6891i
                r2 = 9
                l4.a<O> r3 = r7.f6895c
                android.os.Message r2 = android.os.Message.obtain(r8, r2, r3)
                r4 = 5000(0x1388, double:2.4703E-320)
                r8.sendMessageDelayed(r2, r4)
                z4.c r8 = r0.f6891i
                r2 = 11
                android.os.Message r2 = android.os.Message.obtain(r8, r2, r3)
                r3 = 120000(0x1d4c0, double:5.9288E-319)
                r8.sendMessageDelayed(r2, r3)
                n4.u r8 = r0.d
                android.util.SparseIntArray r8 = r8.f7468a
                r8.clear()
                java.util.HashMap r8 = r7.f6897f
                java.util.Collection r8 = r8.values()
                java.util.Iterator r8 = r8.iterator()
                boolean r0 = r8.hasNext()
                if (r0 != 0) goto L_0x0079
                return
            L_0x0079:
                java.lang.Object r8 = r8.next()
                l4.t r8 = (l4.t) r8
                r8.getClass()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: l4.d.a.a(int):void");
        }

        public final void b(Status status) {
            m.c(d.this.f6891i);
            c(status, (RuntimeException) null, false);
        }

        public final void c(Status status, RuntimeException runtimeException, boolean z) {
            boolean z10;
            m.c(d.this.f6891i);
            boolean z11 = true;
            if (status == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (runtimeException != null) {
                z11 = false;
            }
            if (z10 != z11) {
                Iterator it = this.f6893a.iterator();
                while (it.hasNext()) {
                    u uVar = (u) it.next();
                    if (!z || uVar.f6940a == 2) {
                        if (status != null) {
                            uVar.b(status);
                        } else {
                            uVar.c(runtimeException);
                        }
                        it.remove();
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Status XOR exception should be null");
        }

        public final void d(j4.b bVar, RuntimeException runtimeException) {
            j5.e eVar;
            m.c(d.this.f6891i);
            v vVar = this.f6899h;
            if (!(vVar == null || (eVar = vVar.f6946f) == null)) {
                eVar.k();
            }
            m.c(d.this.f6891i);
            this.f6902k = null;
            d.this.d.f7468a.clear();
            i(bVar);
            if (bVar.f6535p == 4) {
                b(d.l);
            } else if (this.f6893a.isEmpty()) {
                this.f6902k = bVar;
            } else if (runtimeException != null) {
                m.c(d.this.f6891i);
                c((Status) null, runtimeException, false);
            } else if (!d.this.f6892j) {
                b(d.c(this.f6895c, bVar));
            } else {
                c(d.c(this.f6895c, bVar), (RuntimeException) null, true);
                if (!this.f6893a.isEmpty()) {
                    synchronized (d.f6882m) {
                        d.this.getClass();
                    }
                    if (!d.this.b(bVar, this.f6898g)) {
                        if (bVar.f6535p == 18) {
                            this.f6900i = true;
                        }
                        if (this.f6900i) {
                            z4.c cVar = d.this.f6891i;
                            Message obtain = Message.obtain(cVar, 9, this.f6895c);
                            d.this.getClass();
                            cVar.sendMessageDelayed(obtain, 5000);
                            return;
                        }
                        b(d.c(this.f6895c, bVar));
                    }
                }
            }
        }

        public final void e(u uVar) {
            boolean z;
            m.c(d.this.f6891i);
            boolean a10 = this.f6894b.a();
            LinkedList linkedList = this.f6893a;
            if (a10) {
                h(uVar);
                n();
                return;
            }
            linkedList.add(uVar);
            j4.b bVar = this.f6902k;
            if (bVar != null) {
                if (bVar.f6535p == 0 || bVar.f6536q == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    d(bVar, (RuntimeException) null);
                    return;
                }
            }
            k();
        }

        public final boolean f(boolean z) {
            boolean z10;
            m.c(d.this.f6891i);
            a.e eVar = this.f6894b;
            if (!eVar.a() || this.f6897f.size() != 0) {
                return false;
            }
            e0 e0Var = this.d;
            if (!e0Var.f6910a.isEmpty() || !e0Var.f6911b.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (z) {
                    n();
                }
                return false;
            }
            eVar.c("Timing out service connection.");
            return true;
        }

        public final void g() {
            m.c(d.this.f6891i);
            Status status = d.f6881k;
            b(status);
            e0 e0Var = this.d;
            e0Var.getClass();
            e0Var.a(false, status);
            for (g a0Var : (g[]) this.f6897f.keySet().toArray(new g[0])) {
                e(new a0(a0Var, new j()));
            }
            i(new j4.b(4));
            a.e eVar = this.f6894b;
            if (eVar.a()) {
                eVar.o(new o(this));
            }
        }

        public final boolean h(u uVar) {
            if (!(uVar instanceof k)) {
                j(uVar);
                return true;
            }
            ((k) uVar).f(this);
            j(uVar);
            return true;
        }

        public final void i(j4.b bVar) {
            HashSet hashSet = this.f6896e;
            Iterator it = hashSet.iterator();
            if (it.hasNext()) {
                b0 b0Var = (b0) it.next();
                if (l.a(bVar, j4.b.f6533s)) {
                    this.f6894b.h();
                }
                b0Var.getClass();
                throw null;
            }
            hashSet.clear();
        }

        public final void j(u uVar) {
            a.e eVar = this.f6894b;
            uVar.d(this.d, eVar.l());
            try {
                uVar.e(this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                eVar.c("DeadObjectException thrown while running ApiCallRunner.");
            } catch (Throwable th) {
                throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", new Object[]{eVar.getClass().getName()}), th);
            }
        }

        public final void k() {
            j4.b bVar;
            d dVar = d.this;
            m.c(dVar.f6891i);
            a.e eVar = this.f6894b;
            if (!eVar.a() && !eVar.g()) {
                try {
                    u uVar = dVar.d;
                    Context context = dVar.f6885b;
                    uVar.getClass();
                    m.h(context);
                    eVar.e();
                    int f10 = eVar.f();
                    SparseIntArray sparseIntArray = uVar.f7468a;
                    int i10 = sparseIntArray.get(f10, -1);
                    if (i10 == -1) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < sparseIntArray.size()) {
                                int keyAt = sparseIntArray.keyAt(i11);
                                if (keyAt > f10 && sparseIntArray.get(keyAt) == 0) {
                                    i10 = 0;
                                    break;
                                }
                                i11++;
                            } else {
                                break;
                            }
                        }
                        if (i10 == -1) {
                            i10 = uVar.f7469b.b(context, f10);
                        }
                        sparseIntArray.put(f10, i10);
                    }
                    if (i10 != 0) {
                        j4.b bVar2 = new j4.b(i10, (PendingIntent) null);
                        String name = eVar.getClass().getName();
                        String valueOf = String.valueOf(bVar2);
                        StringBuilder sb = new StringBuilder(name.length() + 35 + valueOf.length());
                        sb.append("The service for ");
                        sb.append(name);
                        sb.append(" is not available: ");
                        sb.append(valueOf);
                        Log.w("GoogleApiManager", sb.toString());
                        d(bVar2, (RuntimeException) null);
                        return;
                    }
                    c cVar = new c(eVar, this.f6895c);
                    if (eVar.l()) {
                        v vVar = this.f6899h;
                        m.h(vVar);
                        j5.e eVar2 = vVar.f6946f;
                        if (eVar2 != null) {
                            eVar2.k();
                        }
                        Integer valueOf2 = Integer.valueOf(System.identityHashCode(vVar));
                        n4.c cVar2 = vVar.f6945e;
                        cVar2.f7406g = valueOf2;
                        a.C0093a<? extends j5.e, j5.a> aVar = vVar.f6944c;
                        Context context2 = vVar.f6942a;
                        Handler handler = vVar.f6943b;
                        vVar.f6946f = (j5.e) aVar.a(context2, handler.getLooper(), cVar2, cVar2.f7405f, vVar, vVar);
                        vVar.f6947g = cVar;
                        Set<Scope> set = vVar.d;
                        if (set == null || set.isEmpty()) {
                            handler.post(new k(1, vVar));
                        } else {
                            vVar.f6946f.m();
                        }
                    }
                    try {
                        eVar.j(cVar);
                    } catch (SecurityException e10) {
                        e = e10;
                        bVar = new j4.b(10);
                        d(bVar, e);
                    }
                } catch (IllegalStateException e11) {
                    e = e11;
                    bVar = new j4.b(10);
                    d(bVar, e);
                }
            }
        }

        public final void l() {
            d dVar = d.this;
            m.c(dVar.f6891i);
            this.f6902k = null;
            i(j4.b.f6533s);
            if (this.f6900i) {
                z4.c cVar = dVar.f6891i;
                a<O> aVar = this.f6895c;
                cVar.removeMessages(11, aVar);
                dVar.f6891i.removeMessages(9, aVar);
                this.f6900i = false;
            }
            Iterator it = this.f6897f.values().iterator();
            if (!it.hasNext()) {
                m();
                n();
                return;
            }
            ((t) it.next()).getClass();
            throw null;
        }

        public final void m() {
            LinkedList linkedList = this.f6893a;
            ArrayList arrayList = new ArrayList(linkedList);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                u uVar = (u) obj;
                if (this.f6894b.a()) {
                    h(uVar);
                    linkedList.remove(uVar);
                } else {
                    return;
                }
            }
        }

        public final void n() {
            d dVar = d.this;
            z4.c cVar = dVar.f6891i;
            a<O> aVar = this.f6895c;
            cVar.removeMessages(12, aVar);
            z4.c cVar2 = dVar.f6891i;
            cVar2.sendMessageDelayed(cVar2.obtainMessage(12, aVar), dVar.f6884a);
        }

        public final void onConnected(Bundle bundle) {
            Looper myLooper = Looper.myLooper();
            d dVar = d.this;
            if (myLooper == dVar.f6891i.getLooper()) {
                l();
            } else {
                dVar.f6891i.post(new n(this));
            }
        }

        public final void onConnectionFailed(j4.b bVar) {
            d(bVar, (RuntimeException) null);
        }

        public final void onConnectionSuspended(int i10) {
            Looper myLooper = Looper.myLooper();
            d dVar = d.this;
            if (myLooper == dVar.f6891i.getLooper()) {
                a(i10);
            } else {
                dVar.f6891i.post(new m(this, i10));
            }
        }
    }

    public static class b {
        public b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                bVar.getClass();
                if (l.a((Object) null, (Object) null)) {
                    bVar.getClass();
                    if (l.a((Object) null, (Object) null)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, null});
        }

        public final String toString() {
            l.a aVar = new l.a(this);
            aVar.a((Object) null, "key");
            aVar.a((Object) null, "feature");
            return aVar.toString();
        }
    }

    public class c implements x, b.c {

        /* renamed from: a  reason: collision with root package name */
        public final a.e f6903a;

        /* renamed from: b  reason: collision with root package name */
        public final a<?> f6904b;

        /* renamed from: c  reason: collision with root package name */
        public h f6905c = null;
        public Set<Scope> d = null;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6906e = false;

        public c(a.e eVar, a<?> aVar) {
            this.f6903a = eVar;
            this.f6904b = aVar;
        }

        public final void a(j4.b bVar) {
            d.this.f6891i.post(new q(this, bVar));
        }

        public final void b(j4.b bVar) {
            a aVar = (a) d.this.f6889g.get(this.f6904b);
            if (aVar != null) {
                m.c(d.this.f6891i);
                a.e eVar = aVar.f6894b;
                String name = eVar.getClass().getName();
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + name.length() + 25);
                sb.append("onSignInFailed for ");
                sb.append(name);
                sb.append(" with ");
                sb.append(valueOf);
                eVar.c(sb.toString());
                aVar.d(bVar, (RuntimeException) null);
            }
        }

        public final void c() {
            h hVar;
            if (this.f6906e && (hVar = this.f6905c) != null) {
                this.f6903a.d(hVar, this.d);
            }
        }
    }

    public d(Context context, Looper looper, e eVar) {
        boolean z = true;
        this.f6887e = new AtomicInteger(1);
        this.f6888f = new AtomicInteger(0);
        this.f6889g = new ConcurrentHashMap(5, 0.75f, 1);
        new n.d();
        this.f6890h = new n.d();
        this.f6892j = true;
        this.f6885b = context;
        z4.c cVar = new z4.c(looper, this);
        this.f6891i = cVar;
        this.f6886c = eVar;
        this.d = new u(eVar);
        PackageManager packageManager = context.getPackageManager();
        if (r4.e.d == null) {
            r4.e.d = Boolean.valueOf((!g.a() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z);
        }
        if (r4.e.d.booleanValue()) {
            this.f6892j = false;
        }
        cVar.sendMessage(cVar.obtainMessage(6));
    }

    @RecentlyNonNull
    public static d a(@RecentlyNonNull Context context) {
        d dVar;
        synchronized (f6882m) {
            if (f6883n == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f6883n = new d(context.getApplicationContext(), handlerThread.getLooper(), e.d);
            }
            dVar = f6883n;
        }
        return dVar;
    }

    public static Status c(a<?> aVar, j4.b bVar) {
        String str = aVar.f6873b.f6687b;
        String valueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + x0.a(str, 63));
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(1, 17, sb.toString(), bVar.f6536q, bVar);
    }

    public final boolean b(j4.b bVar, int i10) {
        boolean z;
        PendingIntent pendingIntent;
        e eVar = this.f6886c;
        eVar.getClass();
        int i11 = bVar.f6535p;
        if (i11 == 0 || bVar.f6536q == null) {
            z = false;
        } else {
            z = true;
        }
        Context context = this.f6885b;
        if (z) {
            pendingIntent = bVar.f6536q;
        } else {
            pendingIntent = null;
            Intent a10 = eVar.a(i11, context, (String) null);
            if (a10 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, a10, 134217728);
            }
        }
        if (pendingIntent == null) {
            return false;
        }
        int i12 = GoogleApiActivity.f2316p;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", true);
        eVar.e(context, i11, PendingIntent.getActivity(context, 0, intent, 134217728));
        return true;
    }

    public final a<?> d(k4.c<?> cVar) {
        a<O> aVar = cVar.d;
        ConcurrentHashMap concurrentHashMap = this.f6889g;
        a<?> aVar2 = (a) concurrentHashMap.get(aVar);
        if (aVar2 == null) {
            aVar2 = new a<>(cVar);
            concurrentHashMap.put(aVar, aVar2);
        }
        if (aVar2.f6894b.l()) {
            this.f6890h.add(aVar);
        }
        aVar2.k();
        return aVar2;
    }

    @RecentlyNonNull
    public final boolean handleMessage(@RecentlyNonNull Message message) {
        Status status;
        int i10 = message.what;
        ConcurrentHashMap concurrentHashMap = this.f6889g;
        long j8 = 300000;
        int i11 = 0;
        a aVar = null;
        switch (i10) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j8 = 10000;
                }
                this.f6884a = j8;
                z4.c cVar = this.f6891i;
                cVar.removeMessages(12);
                for (a obtainMessage : concurrentHashMap.keySet()) {
                    cVar.sendMessageDelayed(cVar.obtainMessage(12, obtainMessage), this.f6884a);
                }
                break;
            case 2:
                ((b0) message.obj).getClass();
                throw null;
            case 3:
                for (a aVar2 : concurrentHashMap.values()) {
                    m.c(d.this.f6891i);
                    aVar2.f6902k = null;
                    aVar2.k();
                }
                break;
            case 4:
            case 8:
            case 13:
                s sVar = (s) message.obj;
                a<?> aVar3 = (a) concurrentHashMap.get(sVar.f6939c.d);
                if (aVar3 == null) {
                    aVar3 = d(sVar.f6939c);
                }
                boolean l8 = aVar3.f6894b.l();
                u uVar = sVar.f6937a;
                if (l8 && this.f6888f.get() != sVar.f6938b) {
                    uVar.b(f6881k);
                    aVar3.g();
                    break;
                } else {
                    aVar3.e(uVar);
                    break;
                }
                break;
            case 5:
                int i12 = message.arg1;
                j4.b bVar = (j4.b) message.obj;
                Iterator it = concurrentHashMap.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        a aVar4 = (a) it.next();
                        if (aVar4.f6898g == i12) {
                            aVar = aVar4;
                        }
                    }
                }
                if (aVar != null) {
                    if (bVar.f6535p != 13) {
                        aVar.b(c(aVar.f6895c, bVar));
                        break;
                    } else {
                        this.f6886c.getClass();
                        boolean z = j4.h.f6549a;
                        String g02 = j4.b.g0(bVar.f6535p);
                        int a10 = x0.a(g02, 69);
                        String str = bVar.f6537r;
                        StringBuilder sb = new StringBuilder(x0.a(str, a10));
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(g02);
                        sb.append(": ");
                        sb.append(str);
                        aVar.b(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i12);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                Context context = this.f6885b;
                if (context.getApplicationContext() instanceof Application) {
                    Application application = (Application) context.getApplicationContext();
                    b bVar2 = b.f6876s;
                    synchronized (bVar2) {
                        if (!bVar2.f6880r) {
                            application.registerActivityLifecycleCallbacks(bVar2);
                            application.registerComponentCallbacks(bVar2);
                            bVar2.f6880r = true;
                        }
                    }
                    l lVar = new l(this);
                    bVar2.getClass();
                    synchronized (bVar2) {
                        bVar2.f6879q.add(lVar);
                    }
                    AtomicBoolean atomicBoolean = bVar2.f6878p;
                    boolean z10 = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = bVar2.f6877o;
                    if (!z10) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.f6884a = 300000;
                        break;
                    }
                }
                break;
            case 7:
                d((k4.c) message.obj);
                break;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    a aVar5 = (a) concurrentHashMap.get(message.obj);
                    m.c(d.this.f6891i);
                    if (aVar5.f6900i) {
                        aVar5.k();
                        break;
                    }
                }
                break;
            case 10:
                n.d dVar = this.f6890h;
                Iterator it2 = dVar.iterator();
                while (true) {
                    h.a aVar6 = (h.a) it2;
                    if (!aVar6.hasNext()) {
                        dVar.clear();
                        break;
                    } else {
                        a aVar7 = (a) concurrentHashMap.remove((a) aVar6.next());
                        if (aVar7 != null) {
                            aVar7.g();
                        }
                    }
                }
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    a aVar8 = (a) concurrentHashMap.get(message.obj);
                    d dVar2 = d.this;
                    m.c(dVar2.f6891i);
                    boolean z11 = aVar8.f6900i;
                    if (z11) {
                        if (z11) {
                            d dVar3 = d.this;
                            z4.c cVar2 = dVar3.f6891i;
                            a<O> aVar9 = aVar8.f6895c;
                            cVar2.removeMessages(11, aVar9);
                            dVar3.f6891i.removeMessages(9, aVar9);
                            aVar8.f6900i = false;
                        }
                        if (dVar2.f6886c.c(dVar2.f6885b) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        aVar8.b(status);
                        aVar8.f6894b.c("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((a) concurrentHashMap.get(message.obj)).f(true);
                    break;
                }
                break;
            case 14:
                ((j) message.obj).getClass();
                if (!concurrentHashMap.containsKey((Object) null)) {
                    throw null;
                }
                ((a) concurrentHashMap.get((Object) null)).f(false);
                throw null;
            case 15:
                b bVar3 = (b) message.obj;
                bVar3.getClass();
                if (concurrentHashMap.containsKey((Object) null)) {
                    bVar3.getClass();
                    a aVar10 = (a) concurrentHashMap.get((Object) null);
                    if (aVar10.f6901j.contains(bVar3) && !aVar10.f6900i) {
                        if (aVar10.f6894b.a()) {
                            aVar10.m();
                            break;
                        } else {
                            aVar10.k();
                            break;
                        }
                    }
                }
                break;
            case 16:
                b bVar4 = (b) message.obj;
                bVar4.getClass();
                if (concurrentHashMap.containsKey((Object) null)) {
                    bVar4.getClass();
                    a aVar11 = (a) concurrentHashMap.get((Object) null);
                    if (aVar11.f6901j.remove(bVar4)) {
                        d dVar4 = d.this;
                        dVar4.f6891i.removeMessages(15, bVar4);
                        dVar4.f6891i.removeMessages(16, bVar4);
                        LinkedList linkedList = aVar11.f6893a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it3 = linkedList.iterator();
                        while (true) {
                            boolean hasNext = it3.hasNext();
                            bVar4.getClass();
                            if (!hasNext) {
                                int size = arrayList.size();
                                while (i11 < size) {
                                    Object obj = arrayList.get(i11);
                                    i11++;
                                    u uVar2 = (u) obj;
                                    linkedList.remove(uVar2);
                                    uVar2.c(new i((j4.d) null));
                                }
                                break;
                            } else {
                                u uVar3 = (u) it3.next();
                                if (uVar3 instanceof k) {
                                    ((k) uVar3).f(aVar11);
                                }
                            }
                        }
                    }
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i10);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }
}
