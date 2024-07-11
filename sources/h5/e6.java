package h5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import i4.l;
import i4.o;
import l4.w;
import n4.b;
import n4.m;

public final class e6 implements ServiceConnection, b.a, b.C0104b {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f5359a;

    /* renamed from: b  reason: collision with root package name */
    public volatile c3 f5360b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f6 f5361c;

    public e6(f6 f6Var) {
        this.f5361c = f6Var;
    }

    public final void a() {
        m.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                m.h(this.f5360b);
                h4 h4Var = this.f5361c.f5649o.f5459x;
                i4.n(h4Var);
                h4Var.n(new w(4, this, (x2) this.f5360b.u()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f5360b = null;
                this.f5359a = false;
            }
        }
    }

    public final void onConnectionFailed(j4.b bVar) {
        m.d("MeasurementServiceConnection.onConnectionFailed");
        g3 g3Var = this.f5361c.f5649o.w;
        if (g3Var == null || !g3Var.f5671p) {
            g3Var = null;
        }
        if (g3Var != null) {
            g3Var.w.b(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f5359a = false;
            this.f5360b = null;
        }
        h4 h4Var = this.f5361c.f5649o.f5459x;
        i4.n(h4Var);
        h4Var.n(new l(2, this));
    }

    public final void onConnectionSuspended(int i10) {
        m.d("MeasurementServiceConnection.onConnectionSuspended");
        f6 f6Var = this.f5361c;
        g3 g3Var = f6Var.f5649o.w;
        i4.n(g3Var);
        g3Var.A.a("Service connection suspended");
        h4 h4Var = f6Var.f5649o.f5459x;
        i4.n(h4Var);
        h4Var.n(new r5(2, this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5 = r3.f5361c.f5649o.w;
        h5.i4.n(r5);
        r5.f5397t.a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            n4.m.d(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x0020
            r3.f5359a = r4     // Catch:{ all -> 0x001d }
            h5.f6 r4 = r3.f5361c     // Catch:{ all -> 0x001d }
            h5.i4 r4 = r4.f5649o     // Catch:{ all -> 0x001d }
            h5.g3 r4 = r4.w     // Catch:{ all -> 0x001d }
            h5.i4.n(r4)     // Catch:{ all -> 0x001d }
            h5.e3 r4 = r4.f5397t     // Catch:{ all -> 0x001d }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001d }
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r4 = move-exception
            goto L_0x009b
        L_0x0020:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0063 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0063 }
            if (r2 == 0) goto L_0x0052
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0063 }
            boolean r2 = r1 instanceof h5.x2     // Catch:{ RemoteException -> 0x0063 }
            if (r2 == 0) goto L_0x003b
            h5.x2 r1 = (h5.x2) r1     // Catch:{ RemoteException -> 0x0063 }
        L_0x0039:
            r0 = r1
            goto L_0x0041
        L_0x003b:
            h5.v2 r1 = new h5.v2     // Catch:{ RemoteException -> 0x0063 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0063 }
            goto L_0x0039
        L_0x0041:
            h5.f6 r5 = r3.f5361c     // Catch:{ RemoteException -> 0x0063 }
            h5.i4 r5 = r5.f5649o     // Catch:{ RemoteException -> 0x0063 }
            h5.g3 r5 = r5.w     // Catch:{ RemoteException -> 0x0063 }
            h5.i4.n(r5)     // Catch:{ RemoteException -> 0x0063 }
            h5.e3 r5 = r5.B     // Catch:{ RemoteException -> 0x0063 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x0063 }
            goto L_0x0073
        L_0x0052:
            h5.f6 r5 = r3.f5361c     // Catch:{ RemoteException -> 0x0063 }
            h5.i4 r5 = r5.f5649o     // Catch:{ RemoteException -> 0x0063 }
            h5.g3 r5 = r5.w     // Catch:{ RemoteException -> 0x0063 }
            h5.i4.n(r5)     // Catch:{ RemoteException -> 0x0063 }
            h5.e3 r5 = r5.f5397t     // Catch:{ RemoteException -> 0x0063 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.b(r1, r2)     // Catch:{ RemoteException -> 0x0063 }
            goto L_0x0073
        L_0x0063:
            h5.f6 r5 = r3.f5361c     // Catch:{ all -> 0x001d }
            h5.i4 r5 = r5.f5649o     // Catch:{ all -> 0x001d }
            h5.g3 r5 = r5.w     // Catch:{ all -> 0x001d }
            h5.i4.n(r5)     // Catch:{ all -> 0x001d }
            h5.e3 r5 = r5.f5397t     // Catch:{ all -> 0x001d }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x001d }
        L_0x0073:
            if (r0 != 0) goto L_0x0087
            r3.f5359a = r4     // Catch:{ all -> 0x001d }
            q4.a r4 = q4.a.b()     // Catch:{ IllegalArgumentException -> 0x0099 }
            h5.f6 r5 = r3.f5361c     // Catch:{ IllegalArgumentException -> 0x0099 }
            h5.i4 r0 = r5.f5649o     // Catch:{ IllegalArgumentException -> 0x0099 }
            android.content.Context r0 = r0.f5452o     // Catch:{ IllegalArgumentException -> 0x0099 }
            h5.e6 r5 = r5.f5382q     // Catch:{ IllegalArgumentException -> 0x0099 }
            r4.c(r0, r5)     // Catch:{ IllegalArgumentException -> 0x0099 }
            goto L_0x0099
        L_0x0087:
            h5.f6 r4 = r3.f5361c     // Catch:{ all -> 0x001d }
            h5.i4 r4 = r4.f5649o     // Catch:{ all -> 0x001d }
            h5.h4 r4 = r4.f5459x     // Catch:{ all -> 0x001d }
            h5.i4.n(r4)     // Catch:{ all -> 0x001d }
            i4.n r5 = new i4.n     // Catch:{ all -> 0x001d }
            r1 = 2
            r5.<init>(r1, r3, r0)     // Catch:{ all -> 0x001d }
            r4.n(r5)     // Catch:{ all -> 0x001d }
        L_0x0099:
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            return
        L_0x009b:
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.e6.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        m.d("MeasurementServiceConnection.onServiceDisconnected");
        f6 f6Var = this.f5361c;
        g3 g3Var = f6Var.f5649o.w;
        i4.n(g3Var);
        g3Var.A.a("Service disconnected");
        h4 h4Var = f6Var.f5649o.f5459x;
        i4.n(h4Var);
        h4Var.n(new o((Object) this, (Object) componentName, 8));
    }
}
