package i4;

import a5.a;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.widget.x0;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m5.j;
import m5.r;
import n.i;

public final class c {

    /* renamed from: h  reason: collision with root package name */
    public static int f6067h;

    /* renamed from: i  reason: collision with root package name */
    public static PendingIntent f6068i;

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f6069j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a  reason: collision with root package name */
    public final i<String, j<Bundle>> f6070a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f6071b;

    /* renamed from: c  reason: collision with root package name */
    public final v f6072c;
    public final ScheduledThreadPoolExecutor d;

    /* renamed from: e  reason: collision with root package name */
    public final Messenger f6073e;

    /* renamed from: f  reason: collision with root package name */
    public Messenger f6074f;

    /* renamed from: g  reason: collision with root package name */
    public h f6075g;

    public c(Context context) {
        this.f6071b = context;
        this.f6072c = new v(context);
        this.f6073e = new Messenger(new e(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final r a(Bundle bundle) {
        String num;
        String str;
        synchronized (c.class) {
            int i10 = f6067h;
            f6067h = i10 + 1;
            num = Integer.toString(i10);
        }
        j jVar = new j();
        synchronized (this.f6070a) {
            this.f6070a.put(num, jVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f6072c.a() == 2) {
            str = "com.google.iid.TOKEN_REQUEST";
        } else {
            str = "com.google.android.c2dm.intent.REGISTER";
        }
        intent.setAction(str);
        intent.putExtras(bundle);
        Context context = this.f6071b;
        synchronized (c.class) {
            if (f6068i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f6068i = PendingIntent.getBroadcast(context, 0, intent2, a.f110a);
            }
            intent.putExtra("app", f6068i);
        }
        intent.putExtra("kid", x0.f(new StringBuilder(String.valueOf(num).length() + 5), "|ID|", num, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb = new StringBuilder(valueOf.length() + 8);
            sb.append("Sending ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        intent.putExtra("google.messenger", this.f6073e);
        if (!(this.f6074f == null && this.f6075g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f6074f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f6075g.f6077o;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            jVar.f7089a.p(w.f6112o, new g1.c(this, num, this.d.schedule(new l(1, jVar), 30, TimeUnit.SECONDS)));
            return jVar.f7089a;
        }
        if (this.f6072c.a() == 2) {
            this.f6071b.sendBroadcast(intent);
        } else {
            this.f6071b.startService(intent);
        }
        jVar.f7089a.p(w.f6112o, new g1.c(this, num, this.d.schedule(new l(1, jVar), 30, TimeUnit.SECONDS)));
        return jVar.f7089a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f6070a) {
            j remove = this.f6070a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.a(bundle);
        }
    }
}
