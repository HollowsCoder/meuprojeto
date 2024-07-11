package n4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import n4.g;

public final class f0 implements ServiceConnection, h0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7431a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f7432b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7433c;
    public IBinder d;

    /* renamed from: e  reason: collision with root package name */
    public final g.a f7434e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f7435f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d0 f7436g;

    public f0(d0 d0Var, g.a aVar) {
        this.f7436g = d0Var;
        this.f7434e = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 3
            r11.f7432b = r0
            n4.d0 r0 = r11.f7436g
            q4.a r1 = r0.f7417f
            android.content.Context r2 = r0.d
            n4.g$a r7 = r11.f7434e
            java.lang.String r3 = r7.f7440a
            r4 = 0
            if (r3 == 0) goto L_0x007d
            boolean r5 = r7.d
            if (r5 == 0) goto L_0x006f
            java.lang.String r5 = "ConnectionStatusConfig"
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r8 = "serviceActionBundleKey"
            r6.putString(r8, r3)
            android.content.ContentResolver r8 = r2.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x002d }
            android.net.Uri r9 = n4.g.a.f7439e     // Catch:{ IllegalArgumentException -> 0x002d }
            java.lang.String r10 = "serviceIntentCall"
            android.os.Bundle r6 = r8.call(r9, r10, r4, r6)     // Catch:{ IllegalArgumentException -> 0x002d }
            goto L_0x004d
        L_0x002d:
            r6 = move-exception
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r8 = r6.length()
            int r8 = r8 + 34
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            java.lang.String r8 = "Dynamic intent resolution failed: "
            r9.append(r8)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            android.util.Log.w(r5, r6)
            r6 = r4
        L_0x004d:
            if (r6 != 0) goto L_0x0050
            goto L_0x0058
        L_0x0050:
            java.lang.String r4 = "serviceResponseIntentKey"
            android.os.Parcelable r4 = r6.getParcelable(r4)
            android.content.Intent r4 = (android.content.Intent) r4
        L_0x0058:
            if (r4 != 0) goto L_0x006f
            int r6 = r3.length()
            java.lang.String r8 = "Dynamic lookup for intent failed for action: "
            if (r6 == 0) goto L_0x0067
            java.lang.String r6 = r8.concat(r3)
            goto L_0x006c
        L_0x0067:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x006c:
            android.util.Log.w(r5, r6)
        L_0x006f:
            if (r4 != 0) goto L_0x0087
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r3)
            java.lang.String r3 = r7.f7441b
            android.content.Intent r3 = r4.setPackage(r3)
            goto L_0x0086
        L_0x007d:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Intent r3 = r3.setComponent(r4)
        L_0x0086:
            r4 = r3
        L_0x0087:
            int r6 = r7.f7442c
            r3 = r12
            r5 = r11
            boolean r12 = r1.d(r2, r3, r4, r5, r6)
            r11.f7433c = r12
            if (r12 == 0) goto L_0x00a0
            b5.d r12 = r0.f7416e
            r1 = 1
            android.os.Message r1 = r12.obtainMessage(r1, r7)
            long r2 = r0.f7419h
            r12.sendMessageDelayed(r1, r2)
            return
        L_0x00a0:
            r12 = 2
            r11.f7432b = r12
            q4.a r12 = r0.f7417f     // Catch:{ IllegalArgumentException -> 0x00aa }
            android.content.Context r0 = r0.d     // Catch:{ IllegalArgumentException -> 0x00aa }
            r12.c(r0, r11)     // Catch:{ IllegalArgumentException -> 0x00aa }
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.f0.a(java.lang.String):void");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f7436g.f7415c) {
            this.f7436g.f7416e.removeMessages(1, this.f7434e);
            this.d = iBinder;
            this.f7435f = componentName;
            for (ServiceConnection onServiceConnected : this.f7431a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f7432b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f7436g.f7415c) {
            this.f7436g.f7416e.removeMessages(1, this.f7434e);
            this.d = null;
            this.f7435f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f7431a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f7432b = 2;
        }
    }
}
