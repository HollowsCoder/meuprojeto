package i4;

import a5.b;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import m1.i;
import q4.a;

public final class p implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public int f6097a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Messenger f6098b = new Messenger(new b(Looper.getMainLooper(), new j(this)));

    /* renamed from: c  reason: collision with root package name */
    public i f6099c;
    public final ArrayDeque d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<r<?>> f6100e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u f6101f;

    public /* synthetic */ p(u uVar) {
        this.f6101f = uVar;
    }

    public final synchronized void a(String str, int i10) {
        b(i10, str, (SecurityException) null);
    }

    public final synchronized void b(int i10, String str, SecurityException securityException) {
        String str2;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Disconnected: ".concat(valueOf);
            } else {
                str2 = new String("Disconnected: ");
            }
            Log.d("MessengerIpcClient", str2);
        }
        int i11 = this.f6097a;
        if (i11 == 0) {
            throw new IllegalStateException();
        } else if (i11 == 1 || i11 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f6097a = 4;
            a.b().c(this.f6101f.f6106a, this);
            s sVar = new s(str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((r) it.next()).c(sVar);
            }
            this.d.clear();
            for (int i12 = 0; i12 < this.f6100e.size(); i12++) {
                this.f6100e.valueAt(i12).c(sVar);
            }
            this.f6100e.clear();
        } else if (i11 == 3) {
            this.f6097a = 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f6097a     // Catch:{ all -> 0x0037 }
            r1 = 2
            if (r0 != r1) goto L_0x0035
            java.util.ArrayDeque r0 = r2.d     // Catch:{ all -> 0x0037 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0035
            android.util.SparseArray<i4.r<?>> r0 = r2.f6100e     // Catch:{ all -> 0x0037 }
            int r0 = r0.size()     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0037 }
        L_0x0025:
            r0 = 3
            r2.f6097a = r0     // Catch:{ all -> 0x0037 }
            q4.a r0 = q4.a.b()     // Catch:{ all -> 0x0037 }
            i4.u r1 = r2.f6101f     // Catch:{ all -> 0x0037 }
            android.content.Context r1 = r1.f6106a     // Catch:{ all -> 0x0037 }
            r0.c(r1, r2)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x0035:
            monitor-exit(r2)
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.p.c():void");
    }

    public final synchronized boolean d(r<?> rVar) {
        boolean z;
        int i10 = this.f6097a;
        if (i10 == 0) {
            this.d.add(rVar);
            if (this.f6097a == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f6097a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!a.b().a(this.f6101f.f6106a, intent, this, 1)) {
                        a("Unable to bind to service", 0);
                    } else {
                        this.f6101f.f6107b.schedule(new m(0, this), 30, TimeUnit.SECONDS);
                    }
                } catch (SecurityException e10) {
                    b(0, "Unable to bind to service", e10);
                }
            } else {
                throw new IllegalStateException();
            }
        } else if (i10 == 1) {
            this.d.add(rVar);
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            this.d.add(rVar);
            this.f6101f.f6107b.execute(new l(0, this));
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f6101f.f6107b.execute(new n(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f6101f.f6107b.execute(new k(0, this));
    }
}
