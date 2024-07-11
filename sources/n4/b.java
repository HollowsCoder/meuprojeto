package n4;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.appcompat.widget.x0;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import l4.o;
import l4.p;
import n4.g;

public abstract class b<T extends IInterface> {

    /* renamed from: v  reason: collision with root package name */
    public static final j4.d[] f7368v = new j4.d[0];

    /* renamed from: a  reason: collision with root package name */
    public volatile String f7369a = null;

    /* renamed from: b  reason: collision with root package name */
    public i0 f7370b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f7371c;
    public final g d;

    /* renamed from: e  reason: collision with root package name */
    public final j4.f f7372e;

    /* renamed from: f  reason: collision with root package name */
    public final f f7373f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f7374g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final Object f7375h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public k f7376i;
    @RecentlyNonNull

    /* renamed from: j  reason: collision with root package name */
    public c f7377j;

    /* renamed from: k  reason: collision with root package name */
    public T f7378k;
    public final ArrayList<g<?>> l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public h f7379m;

    /* renamed from: n  reason: collision with root package name */
    public int f7380n = 1;

    /* renamed from: o  reason: collision with root package name */
    public final a f7381o;

    /* renamed from: p  reason: collision with root package name */
    public final C0104b f7382p;

    /* renamed from: q  reason: collision with root package name */
    public final int f7383q;

    /* renamed from: r  reason: collision with root package name */
    public final String f7384r;

    /* renamed from: s  reason: collision with root package name */
    public j4.b f7385s = null;

    /* renamed from: t  reason: collision with root package name */
    public boolean f7386t = false;
    @RecentlyNonNull
    public final AtomicInteger u = new AtomicInteger(0);

    public interface a {
        void a();

        void onConnectionSuspended(@RecentlyNonNull int i10);
    }

    /* renamed from: n4.b$b  reason: collision with other inner class name */
    public interface C0104b {
        void onConnectionFailed(@RecentlyNonNull j4.b bVar);
    }

    public interface c {
        void a(@RecentlyNonNull j4.b bVar);
    }

    public class d implements c {
        public d() {
        }

        public final void a(@RecentlyNonNull j4.b bVar) {
            boolean z;
            if (bVar.f6535p == 0) {
                z = true;
            } else {
                z = false;
            }
            b bVar2 = b.this;
            if (z) {
                bVar2.d((h) null, bVar2.t());
                return;
            }
            C0104b bVar3 = bVar2.f7382p;
            if (bVar3 != null) {
                bVar3.onConnectionFailed(bVar);
            }
        }
    }

    public abstract class e extends g<Boolean> {
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f7388e;

        public e(int i10, Bundle bundle) {
            super(Boolean.TRUE);
            this.d = i10;
            this.f7388e = bundle;
        }

        /* JADX WARNING: type inference failed for: r4v5, types: [android.os.Parcelable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void a(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                r4 = 1
                n4.b r0 = n4.b.this
                r1 = 0
                int r2 = r3.d
                if (r2 != 0) goto L_0x001e
                boolean r2 = r3.d()
                if (r2 != 0) goto L_0x0036
                r0.x(r4, r1)
                j4.b r4 = new j4.b
                r0 = 8
                r4.<init>(r0, r1)
                r3.c(r4)
                return
            L_0x001e:
                r0.x(r4, r1)
                android.os.Bundle r4 = r3.f7388e
                if (r4 == 0) goto L_0x002e
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r4 = r4.getParcelable(r0)
                r1 = r4
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x002e:
                j4.b r4 = new j4.b
                r4.<init>(r2, r1)
                r3.c(r4)
            L_0x0036:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n4.b.e.a(java.lang.Object):void");
        }

        public final void b() {
        }

        public abstract void c(j4.b bVar);

        public abstract boolean d();
    }

    public final class f extends b5.d {
        public f(Looper looper) {
            super(looper);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
            if (r0 == 5) goto L_0x004e;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r11) {
            /*
                r10 = this;
                n4.b r0 = n4.b.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.u
                int r0 = r0.get()
                int r1 = r11.arg1
                r2 = 0
                r3 = 7
                r4 = 2
                r5 = 1
                r6 = 0
                if (r0 == r1) goto L_0x003c
                int r0 = r11.what
                if (r0 == r4) goto L_0x0019
                if (r0 == r5) goto L_0x0019
                if (r0 != r3) goto L_0x001a
            L_0x0019:
                r2 = r5
            L_0x001a:
                if (r2 == 0) goto L_0x003b
                java.lang.Object r11 = r11.obj
                n4.b$g r11 = (n4.b.g) r11
                r11.b()
                monitor-enter(r11)
                r11.f7391a = r6     // Catch:{ all -> 0x0038 }
                monitor-exit(r11)     // Catch:{ all -> 0x0038 }
                n4.b r0 = n4.b.this
                java.util.ArrayList<n4.b$g<?>> r0 = r0.l
                monitor-enter(r0)
                n4.b r1 = n4.b.this     // Catch:{ all -> 0x0035 }
                java.util.ArrayList<n4.b$g<?>> r1 = r1.l     // Catch:{ all -> 0x0035 }
                r1.remove(r11)     // Catch:{ all -> 0x0035 }
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                goto L_0x003b
            L_0x0035:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                throw r11
            L_0x0038:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x0038 }
                throw r0
            L_0x003b:
                return
            L_0x003c:
                int r0 = r11.what
                r1 = 4
                r7 = 5
                if (r0 == r5) goto L_0x004e
                if (r0 == r3) goto L_0x004e
                if (r0 != r1) goto L_0x004c
                n4.b r0 = n4.b.this
                r0.getClass()
                goto L_0x004e
            L_0x004c:
                if (r0 != r7) goto L_0x0076
            L_0x004e:
                n4.b r0 = n4.b.this
                boolean r0 = r0.g()
                if (r0 != 0) goto L_0x0076
                java.lang.Object r11 = r11.obj
                r0 = r11
                n4.b$g r0 = (n4.b.g) r0
                r0.b()
                monitor-enter(r0)
                r0.f7391a = r6     // Catch:{ all -> 0x0073 }
                monitor-exit(r0)     // Catch:{ all -> 0x0073 }
                n4.b r11 = n4.b.this
                java.util.ArrayList<n4.b$g<?>> r11 = r11.l
                monitor-enter(r11)
                n4.b r1 = n4.b.this     // Catch:{ all -> 0x0070 }
                java.util.ArrayList<n4.b$g<?>> r1 = r1.l     // Catch:{ all -> 0x0070 }
                r1.remove(r0)     // Catch:{ all -> 0x0070 }
                monitor-exit(r11)     // Catch:{ all -> 0x0070 }
                return
            L_0x0070:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x0070 }
                throw r0
            L_0x0073:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0073 }
                throw r11
            L_0x0076:
                int r0 = r11.what
                r8 = 8
                r9 = 3
                if (r0 != r1) goto L_0x00d1
                n4.b r0 = n4.b.this
                j4.b r1 = new j4.b
                int r11 = r11.arg2
                r1.<init>(r11)
                r0.f7385s = r1
                n4.b r11 = n4.b.this
                boolean r0 = r11.f7386t
                if (r0 == 0) goto L_0x008f
                goto L_0x00a9
            L_0x008f:
                java.lang.String r0 = r11.v()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x009a
                goto L_0x00a9
            L_0x009a:
                boolean r0 = android.text.TextUtils.isEmpty(r6)
                if (r0 == 0) goto L_0x00a1
                goto L_0x00a9
            L_0x00a1:
                java.lang.String r11 = r11.v()     // Catch:{ ClassNotFoundException -> 0x00a9 }
                java.lang.Class.forName(r11)     // Catch:{ ClassNotFoundException -> 0x00a9 }
                r2 = r5
            L_0x00a9:
                if (r2 == 0) goto L_0x00b5
                n4.b r11 = n4.b.this
                boolean r0 = r11.f7386t
                if (r0 != 0) goto L_0x00b5
                r11.x(r9, r6)
                return
            L_0x00b5:
                n4.b r11 = n4.b.this
                j4.b r11 = r11.f7385s
                if (r11 == 0) goto L_0x00bc
                goto L_0x00c1
            L_0x00bc:
                j4.b r11 = new j4.b
                r11.<init>(r8)
            L_0x00c1:
                n4.b r0 = n4.b.this
                n4.b$c r0 = r0.f7377j
                r0.a(r11)
                n4.b r11 = n4.b.this
                r11.getClass()
                java.lang.System.currentTimeMillis()
                return
            L_0x00d1:
                if (r0 != r7) goto L_0x00ef
                n4.b r11 = n4.b.this
                j4.b r11 = r11.f7385s
                if (r11 == 0) goto L_0x00da
                goto L_0x00df
            L_0x00da:
                j4.b r11 = new j4.b
                r11.<init>(r8)
            L_0x00df:
                n4.b r0 = n4.b.this
                n4.b$c r0 = r0.f7377j
                r0.a(r11)
                n4.b r11 = n4.b.this
                r11.getClass()
                java.lang.System.currentTimeMillis()
                return
            L_0x00ef:
                if (r0 != r9) goto L_0x0111
                java.lang.Object r0 = r11.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto L_0x00fa
                r6 = r0
                android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            L_0x00fa:
                j4.b r0 = new j4.b
                int r11 = r11.arg2
                r0.<init>(r11, r6)
                n4.b r11 = n4.b.this
                n4.b$c r11 = r11.f7377j
                r11.a(r0)
                n4.b r11 = n4.b.this
                r11.getClass()
                java.lang.System.currentTimeMillis()
                return
            L_0x0111:
                r1 = 6
                if (r0 != r1) goto L_0x0132
                n4.b r0 = n4.b.this
                r0.x(r7, r6)
                n4.b r0 = n4.b.this
                n4.b$a r0 = r0.f7381o
                if (r0 == 0) goto L_0x0124
                int r11 = r11.arg2
                r0.onConnectionSuspended(r11)
            L_0x0124:
                n4.b r11 = n4.b.this
                r11.getClass()
                java.lang.System.currentTimeMillis()
                n4.b r11 = n4.b.this
                n4.b.y(r11, r7, r5, r6)
                return
            L_0x0132:
                if (r0 != r4) goto L_0x015c
                n4.b r0 = n4.b.this
                boolean r0 = r0.a()
                if (r0 != 0) goto L_0x015c
                java.lang.Object r11 = r11.obj
                r0 = r11
                n4.b$g r0 = (n4.b.g) r0
                r0.b()
                monitor-enter(r0)
                r0.f7391a = r6     // Catch:{ all -> 0x0159 }
                monitor-exit(r0)     // Catch:{ all -> 0x0159 }
                n4.b r11 = n4.b.this
                java.util.ArrayList<n4.b$g<?>> r11 = r11.l
                monitor-enter(r11)
                n4.b r1 = n4.b.this     // Catch:{ all -> 0x0156 }
                java.util.ArrayList<n4.b$g<?>> r1 = r1.l     // Catch:{ all -> 0x0156 }
                r1.remove(r0)     // Catch:{ all -> 0x0156 }
                monitor-exit(r11)     // Catch:{ all -> 0x0156 }
                return
            L_0x0156:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x0156 }
                throw r0
            L_0x0159:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0159 }
                throw r11
            L_0x015c:
                int r0 = r11.what
                if (r0 == r4) goto L_0x0164
                if (r0 == r5) goto L_0x0164
                if (r0 != r3) goto L_0x0165
            L_0x0164:
                r2 = r5
            L_0x0165:
                if (r2 == 0) goto L_0x01c8
                java.lang.Object r11 = r11.obj
                n4.b$g r11 = (n4.b.g) r11
                monitor-enter(r11)
                TListener r0 = r11.f7391a     // Catch:{ all -> 0x01c5 }
                boolean r1 = r11.f7392b     // Catch:{ all -> 0x01c5 }
                if (r1 == 0) goto L_0x0197
                java.lang.String r1 = "GmsClient"
                java.lang.String r2 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x01c5 }
                int r3 = r2.length()     // Catch:{ all -> 0x01c5 }
                int r3 = r3 + 47
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
                r4.<init>(r3)     // Catch:{ all -> 0x01c5 }
                java.lang.String r3 = "Callback proxy "
                r4.append(r3)     // Catch:{ all -> 0x01c5 }
                r4.append(r2)     // Catch:{ all -> 0x01c5 }
                java.lang.String r2 = " being reused. This is not safe."
                r4.append(r2)     // Catch:{ all -> 0x01c5 }
                java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x01c5 }
                android.util.Log.w(r1, r2)     // Catch:{ all -> 0x01c5 }
            L_0x0197:
                monitor-exit(r11)     // Catch:{ all -> 0x01c5 }
                if (r0 == 0) goto L_0x01a3
                r11.a(r0)     // Catch:{ RuntimeException -> 0x019e }
                goto L_0x01a6
            L_0x019e:
                r0 = move-exception
                r11.b()
                throw r0
            L_0x01a3:
                r11.b()
            L_0x01a6:
                monitor-enter(r11)
                r11.f7392b = r5     // Catch:{ all -> 0x01c2 }
                monitor-exit(r11)     // Catch:{ all -> 0x01c2 }
                monitor-enter(r11)
                r11.f7391a = r6     // Catch:{ all -> 0x01bf }
                monitor-exit(r11)     // Catch:{ all -> 0x01bf }
                n4.b r0 = n4.b.this
                java.util.ArrayList<n4.b$g<?>> r0 = r0.l
                monitor-enter(r0)
                n4.b r1 = n4.b.this     // Catch:{ all -> 0x01bc }
                java.util.ArrayList<n4.b$g<?>> r1 = r1.l     // Catch:{ all -> 0x01bc }
                r1.remove(r11)     // Catch:{ all -> 0x01bc }
                monitor-exit(r0)     // Catch:{ all -> 0x01bc }
                return
            L_0x01bc:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x01bc }
                throw r11
            L_0x01bf:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x01bf }
                throw r0
            L_0x01c2:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x01c2 }
                throw r0
            L_0x01c5:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x01c5 }
                throw r0
            L_0x01c8:
                java.lang.String r11 = "GmsClient"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = 45
                r1.<init>(r2)
                java.lang.String r2 = "Don't know how to handle message: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.Exception r1 = new java.lang.Exception
                r1.<init>()
                android.util.Log.wtf(r11, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n4.b.f.handleMessage(android.os.Message):void");
        }
    }

    public abstract class g<TListener> {

        /* renamed from: a  reason: collision with root package name */
        public TListener f7391a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7392b = false;

        public g(Boolean bool) {
            this.f7391a = bool;
        }

        public abstract void a(TListener tlistener);

        public abstract void b();
    }

    public final class h implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final int f7394a;

        public h(int i10) {
            this.f7394a = i10;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            k kVar;
            int i10;
            b bVar = b.this;
            boolean z = false;
            if (iBinder == null) {
                synchronized (bVar.f7374g) {
                    if (bVar.f7380n == 3) {
                        z = true;
                    }
                }
                if (z) {
                    bVar.f7386t = true;
                    i10 = 5;
                } else {
                    i10 = 4;
                }
                f fVar = bVar.f7373f;
                fVar.sendMessage(fVar.obtainMessage(i10, bVar.u.get(), 16));
                return;
            }
            synchronized (bVar.f7375h) {
                b bVar2 = b.this;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof k)) {
                    kVar = new j(iBinder);
                } else {
                    kVar = (k) queryLocalInterface;
                }
                bVar2.f7376i = kVar;
            }
            b bVar3 = b.this;
            int i11 = this.f7394a;
            bVar3.getClass();
            k kVar2 = new k(0);
            f fVar2 = bVar3.f7373f;
            fVar2.sendMessage(fVar2.obtainMessage(7, i11, -1, kVar2));
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            b bVar;
            synchronized (b.this.f7375h) {
                bVar = b.this;
                bVar.f7376i = null;
            }
            f fVar = bVar.f7373f;
            fVar.sendMessage(fVar.obtainMessage(6, this.f7394a, 1));
        }
    }

    public static final class i extends i {

        /* renamed from: a  reason: collision with root package name */
        public b f7396a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7397b;

        public i(b bVar, int i10) {
            this.f7396a = bVar;
            this.f7397b = i10;
        }
    }

    public final class j extends e {

        /* renamed from: g  reason: collision with root package name */
        public final IBinder f7398g;

        public j(int i10, IBinder iBinder, Bundle bundle) {
            super(i10, bundle);
            this.f7398g = iBinder;
        }

        public final void c(j4.b bVar) {
            C0104b bVar2 = b.this.f7382p;
            if (bVar2 != null) {
                bVar2.onConnectionFailed(bVar);
            }
            System.currentTimeMillis();
        }

        public final boolean d() {
            IBinder iBinder = this.f7398g;
            try {
                m.h(iBinder);
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                b bVar = b.this;
                if (!bVar.v().equals(interfaceDescriptor)) {
                    String v10 = bVar.v();
                    StringBuilder sb = new StringBuilder(x0.a(interfaceDescriptor, x0.a(v10, 34)));
                    sb.append("service descriptor mismatch: ");
                    sb.append(v10);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface q10 = bVar.q(iBinder);
                if (q10 == null || (!b.y(bVar, 2, 4, q10) && !b.y(bVar, 3, 4, q10))) {
                    return false;
                }
                bVar.f7385s = null;
                a aVar = bVar.f7381o;
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    public final class k extends e {
        public k(int i10) {
            super(i10, (Bundle) null);
        }

        public final void c(j4.b bVar) {
            b bVar2 = b.this;
            bVar2.getClass();
            bVar2.f7377j.a(bVar);
            System.currentTimeMillis();
        }

        public final boolean d() {
            b.this.f7377j.a(j4.b.f6533s);
            return true;
        }
    }

    public b(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull g gVar, @RecentlyNonNull j4.f fVar, @RecentlyNonNull int i10, a aVar, C0104b bVar, String str) {
        if (context != null) {
            this.f7371c = context;
            if (looper == null) {
                throw new NullPointerException("Looper must not be null");
            } else if (gVar != null) {
                this.d = gVar;
                m.i(fVar, "API availability must not be null");
                this.f7372e = fVar;
                this.f7373f = new f(looper);
                this.f7383q = i10;
                this.f7381o = aVar;
                this.f7382p = bVar;
                this.f7384r = str;
            } else {
                throw new NullPointerException("Supervisor must not be null");
            }
        } else {
            throw new NullPointerException("Context must not be null");
        }
    }

    public static boolean y(b bVar, int i10, int i11, IInterface iInterface) {
        synchronized (bVar.f7374g) {
            if (bVar.f7380n != i10) {
                return false;
            }
            bVar.x(i11, iInterface);
            return true;
        }
    }

    @RecentlyNonNull
    public final boolean a() {
        boolean z;
        synchronized (this.f7374g) {
            z = this.f7380n == 4;
        }
        return z;
    }

    public final void c(@RecentlyNonNull String str) {
        this.f7369a = str;
        k();
    }

    public final void d(h hVar, @RecentlyNonNull Set<Scope> set) {
        Bundle s10 = s();
        e eVar = new e(this.f7383q);
        eVar.f7423r = this.f7371c.getPackageName();
        eVar.u = s10;
        if (set != null) {
            eVar.f7425t = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (l()) {
            Account r5 = r();
            if (r5 == null) {
                r5 = new Account("<<default account>>", "com.google");
            }
            eVar.f7426v = r5;
            if (hVar != null) {
                eVar.f7424s = hVar.asBinder();
            }
        }
        j4.d[] dVarArr = f7368v;
        eVar.w = dVarArr;
        eVar.f7427x = dVarArr;
        try {
            synchronized (this.f7375h) {
                k kVar = this.f7376i;
                if (kVar != null) {
                    kVar.i(new i(this, this.u.get()), eVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            f fVar = this.f7373f;
            fVar.sendMessage(fVar.obtainMessage(6, this.u.get(), 3));
        } catch (SecurityException e11) {
            throw e11;
        } catch (RemoteException | RuntimeException e12) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e12);
            int i10 = this.u.get();
            j jVar = new j(8, (IBinder) null, (Bundle) null);
            f fVar2 = this.f7373f;
            fVar2.sendMessage(fVar2.obtainMessage(1, i10, -1, jVar));
        }
    }

    @RecentlyNonNull
    public final void e() {
    }

    @RecentlyNonNull
    public abstract int f();

    @RecentlyNonNull
    public final boolean g() {
        boolean z;
        synchronized (this.f7374g) {
            int i10 = this.f7380n;
            if (i10 != 2) {
                if (i10 != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @RecentlyNonNull
    public final void h() {
        if (!a() || this.f7370b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @RecentlyNullable
    public final String i() {
        return this.f7369a;
    }

    public final void j(@RecentlyNonNull c cVar) {
        this.f7377j = cVar;
        x(2, (IInterface) null);
    }

    public final void k() {
        this.u.incrementAndGet();
        synchronized (this.l) {
            try {
                int size = this.l.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = this.l.get(i10);
                    synchronized (gVar) {
                        gVar.f7391a = null;
                    }
                }
                this.l.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        synchronized (this.f7375h) {
            this.f7376i = null;
        }
        x(1, (IInterface) null);
    }

    @RecentlyNonNull
    public boolean l() {
        return false;
    }

    public final void o(@RecentlyNonNull o oVar) {
        l4.d.this.f6891i.post(new p(oVar));
    }

    public final void p() {
        int b10 = this.f7372e.b(this.f7371c, f());
        if (b10 != 0) {
            x(1, (IInterface) null);
            this.f7377j = new d();
            int i10 = this.u.get();
            f fVar = this.f7373f;
            fVar.sendMessage(fVar.obtainMessage(3, i10, b10, (Object) null));
            return;
        }
        j(new d());
    }

    @RecentlyNullable
    public abstract T q(@RecentlyNonNull IBinder iBinder);

    @RecentlyNullable
    public Account r() {
        return null;
    }

    @RecentlyNonNull
    public Bundle s() {
        return new Bundle();
    }

    @RecentlyNonNull
    public Set<Scope> t() {
        return Collections.emptySet();
    }

    @RecentlyNonNull
    public final T u() {
        T t10;
        synchronized (this.f7374g) {
            if (this.f7380n == 5) {
                throw new DeadObjectException();
            } else if (a()) {
                t10 = this.f7378k;
                m.i(t10, "Client is connected but service is null");
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return t10;
    }

    public abstract String v();

    public abstract String w();

    public final void x(int i10, T t10) {
        boolean z;
        boolean z10;
        boolean z11;
        i0 i0Var;
        if (i10 == 4) {
            z = true;
        } else {
            z = false;
        }
        if (t10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        m.b(z11);
        synchronized (this.f7374g) {
            this.f7380n = i10;
            this.f7378k = t10;
            if (i10 == 1) {
                h hVar = this.f7379m;
                if (hVar != null) {
                    g gVar = this.d;
                    String str = this.f7370b.f7445a;
                    m.h(str);
                    this.f7370b.getClass();
                    if (this.f7384r == null) {
                        this.f7371c.getClass();
                    }
                    this.f7370b.getClass();
                    gVar.getClass();
                    gVar.b(new g.a(4225, str, "com.google.android.gms", false), hVar);
                    this.f7379m = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                h hVar2 = this.f7379m;
                if (!(hVar2 == null || (i0Var = this.f7370b) == null)) {
                    String str2 = i0Var.f7445a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(str2);
                    sb.append(" on com.google.android.gms");
                    Log.e("GmsClient", sb.toString());
                    g gVar2 = this.d;
                    String str3 = this.f7370b.f7445a;
                    m.h(str3);
                    this.f7370b.getClass();
                    if (this.f7384r == null) {
                        this.f7371c.getClass();
                    }
                    this.f7370b.getClass();
                    gVar2.getClass();
                    gVar2.b(new g.a(4225, str3, "com.google.android.gms", false), hVar2);
                    this.u.incrementAndGet();
                }
                h hVar3 = new h(this.u.get());
                this.f7379m = hVar3;
                String w = w();
                Object obj = g.f7437a;
                this.f7370b = new i0(w);
                g gVar3 = this.d;
                m.h(w);
                this.f7370b.getClass();
                String str4 = this.f7384r;
                if (str4 == null) {
                    str4 = this.f7371c.getClass().getName();
                }
                this.f7370b.getClass();
                if (!gVar3.a(new g.a(4225, w, "com.google.android.gms", false), hVar3, str4)) {
                    String str5 = this.f7370b.f7445a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str5);
                    sb2.append(" on com.google.android.gms");
                    Log.e("GmsClient", sb2.toString());
                    int i11 = this.u.get();
                    k kVar = new k(16);
                    f fVar = this.f7373f;
                    fVar.sendMessage(fVar.obtainMessage(7, i11, -1, kVar));
                }
            } else if (i10 == 4) {
                m.h(t10);
                System.currentTimeMillis();
            }
        }
    }
}
