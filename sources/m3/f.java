package m3;

import android.os.SystemClock;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final double f7073a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f7074b = 0;

    public static double a(long j8) {
        return ((double) (SystemClock.elapsedRealtimeNanos() - j8)) * f7073a;
    }
}
