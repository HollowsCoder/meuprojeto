package d7;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class f0 extends c {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ String f4223o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f4224p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ long f4225q = 2;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f4226r;

    public f0(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f4223o = str;
        this.f4224p = executorService;
        this.f4226r = timeUnit;
    }

    public final void a() {
        boolean z;
        boolean z10;
        String str = this.f4223o;
        ExecutorService executorService = this.f4224p;
        boolean z11 = false;
        try {
            String str2 = "Executing shutdown hook for " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Log.d("FirebaseCrashlytics", str2, (Throwable) null);
            }
            executorService.shutdown();
            if (!executorService.awaitTermination(this.f4225q, this.f4226r)) {
                String str3 = str + " did not shut down in the allocated time. Requesting immediate shutdown.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Log.d("FirebaseCrashlytics", str3, (Throwable) null);
                }
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            String format = String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{str});
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                z11 = true;
            }
            if (z11) {
                Log.d("FirebaseCrashlytics", format, (Throwable) null);
            }
            executorService.shutdownNow();
        }
    }
}
