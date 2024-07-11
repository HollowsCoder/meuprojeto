package d7;

import android.os.Looper;
import d2.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m5.i;

public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f4263a = g0.a("awaitEvenIfOnMainThread task continuation executor");

    public static <T> T a(i<T> iVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        iVar.e(f4263a, new b(11, countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (iVar.m()) {
            return iVar.i();
        }
        if (iVar.k()) {
            throw new CancellationException("Task is already canceled");
        } else if (iVar.l()) {
            throw new IllegalStateException(iVar.h());
        } else {
            throw new TimeoutException();
        }
    }
}
