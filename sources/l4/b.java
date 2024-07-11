package l4;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: s  reason: collision with root package name */
    public static final b f6876s = new b();

    /* renamed from: o  reason: collision with root package name */
    public final AtomicBoolean f6877o = new AtomicBoolean();

    /* renamed from: p  reason: collision with root package name */
    public final AtomicBoolean f6878p = new AtomicBoolean();

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList<a> f6879q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public boolean f6880r = false;

    public interface a {
        void a(@RecentlyNonNull boolean z);
    }

    public final void a(boolean z) {
        synchronized (f6876s) {
            ArrayList<a> arrayList = this.f6879q;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                a aVar = arrayList.get(i10);
                i10++;
                aVar.a(z);
            }
        }
    }

    public final void onActivityCreated(@RecentlyNonNull Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f6877o.compareAndSet(true, false);
        this.f6878p.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onActivityDestroyed(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityPaused(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityResumed(@RecentlyNonNull Activity activity) {
        boolean compareAndSet = this.f6877o.compareAndSet(true, false);
        this.f6878p.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
    }

    public final void onActivityStarted(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityStopped(@RecentlyNonNull Activity activity) {
    }

    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(@RecentlyNonNull int i10) {
        if (i10 == 20 && this.f6877o.compareAndSet(false, true)) {
            this.f6878p.set(true);
            a(true);
        }
    }
}
