package f3;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.m;
import f3.b;

public final class d implements b {

    /* renamed from: o  reason: collision with root package name */
    public final Context f4598o;

    /* renamed from: p  reason: collision with root package name */
    public final b.a f4599p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4600q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4601r;

    /* renamed from: s  reason: collision with root package name */
    public final a f4602s = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        public final void onReceive(Context context, Intent intent) {
            d dVar = d.this;
            boolean z = dVar.f4600q;
            dVar.f4600q = d.l(context);
            if (z != d.this.f4600q) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + d.this.f4600q);
                }
                d dVar2 = d.this;
                m.b bVar = (m.b) dVar2.f4599p;
                if (dVar2.f4600q) {
                    synchronized (m.this) {
                        bVar.f2300a.b();
                    }
                    return;
                }
                bVar.getClass();
            }
        }
    }

    public d(Context context, m.b bVar) {
        this.f4598o = context.getApplicationContext();
        this.f4599p = bVar;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean l(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        s6.a.n(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
            }
            return true;
        }
    }

    public final void a() {
        if (this.f4601r) {
            this.f4598o.unregisterReceiver(this.f4602s);
            this.f4601r = false;
        }
    }

    public final void b() {
    }

    public final void k() {
        if (!this.f4601r) {
            Context context = this.f4598o;
            this.f4600q = l(context);
            try {
                context.registerReceiver(this.f4602s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f4601r = true;
            } catch (SecurityException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e10);
                }
            }
        }
    }
}
