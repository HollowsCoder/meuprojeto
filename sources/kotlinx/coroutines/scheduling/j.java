package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.l;
import p9.u;
import s6.a;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final long f6832a = u.q("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    public static final int f6833b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f6834c;
    public static final long d = TimeUnit.SECONDS.toNanos(u.q("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: e  reason: collision with root package name */
    public static final f f6835e = f.f6828o;

    static {
        u.r("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12);
        int i10 = l.f6794a;
        int i11 = 2;
        if (i10 >= 2) {
            i11 = i10;
        }
        int r5 = u.r("kotlinx.coroutines.scheduler.core.pool.size", i11, 1, 0, 8);
        f6833b = r5;
        f6834c = u.r("kotlinx.coroutines.scheduler.max.pool.size", a.s(i10 * 128, r5, 2097150), 0, 2097150, 4);
    }
}
