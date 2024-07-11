package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.t;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o5.a;
import o5.b;

@Keep
public class DynamiteClearcutLogger {
    private static final ExecutorService zza;
    private b zzb = new b();
    /* access modifiers changed from: private */
    public VisionClearcutLogger zzc;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public DynamiteClearcutLogger(@RecentlyNonNull Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }

    public final void zza(int i10, t tVar) {
        boolean z;
        if (i10 == 3) {
            b bVar = this.zzb;
            synchronized (bVar.f7745b) {
                long currentTimeMillis = System.currentTimeMillis();
                if (bVar.f7746c + bVar.f7744a > currentTimeMillis) {
                    z = false;
                } else {
                    bVar.f7746c = currentTimeMillis;
                    z = true;
                }
            }
            if (!z) {
                Object[] objArr = new Object[0];
                if (Log.isLoggable("Vision", 2)) {
                    Log.v("Vision", String.format("Skipping image analysis log due to rate limiting", objArr));
                    return;
                }
                return;
            }
        }
        zza.execute(new a(this, i10, tVar));
    }
}
