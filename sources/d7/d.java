package d7;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicLong f4212a = new AtomicLong(0);

    /* renamed from: b  reason: collision with root package name */
    public static String f4213b;

    public d(h0 h0Var) {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte[] a10 = a(time % 1000);
        byte[] a11 = a(f4212a.incrementAndGet());
        byte[] a12 = a((long) Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {array[0], array[1], array[2], array[3], a10[0], a10[1], a11[0], a11[1], a12[0], a12[1]};
        String k10 = e.k(h0Var.c());
        String h10 = e.h(bArr);
        Locale locale = Locale.US;
        f4213b = String.format(locale, "%s%s%s%s", new Object[]{h10.substring(0, 12), h10.substring(12, 16), h10.subSequence(16, 20), k10.substring(0, 12)}).toUpperCase(locale);
    }

    public static byte[] a(long j8) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j8));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return f4213b;
    }
}
