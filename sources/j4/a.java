package j4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n4.m;

public final class a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6531a = false;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedBlockingQueue f6532b = new LinkedBlockingQueue();

    @RecentlyNonNull
    public final IBinder a(@RecentlyNonNull TimeUnit timeUnit) {
        m.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f6531a) {
            this.f6531a = true;
            IBinder iBinder = (IBinder) this.f6532b.poll(10000, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull IBinder iBinder) {
        this.f6532b.add(iBinder);
    }

    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
    }
}
