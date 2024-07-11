package w9;

import b0.d;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import z8.g;

public class c0 {
    public static final a d = new a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f9319a;

    /* renamed from: b  reason: collision with root package name */
    public long f9320b;

    /* renamed from: c  reason: collision with root package name */
    public long f9321c;

    public static final class a extends c0 {
        public final c0 d(long j8) {
            return this;
        }

        public final void f() {
        }

        public final c0 g(long j8, TimeUnit timeUnit) {
            g.f(timeUnit, "unit");
            return this;
        }
    }

    public c0 a() {
        this.f9319a = false;
        return this;
    }

    public c0 b() {
        this.f9321c = 0;
        return this;
    }

    public long c() {
        if (this.f9319a) {
            return this.f9320b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public c0 d(long j8) {
        this.f9319a = true;
        this.f9320b = j8;
        return this;
    }

    public boolean e() {
        return this.f9319a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f9319a && this.f9320b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public c0 g(long j8, TimeUnit timeUnit) {
        boolean z;
        g.f(timeUnit, "unit");
        if (j8 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f9321c = timeUnit.toNanos(j8);
            return this;
        }
        throw new IllegalArgumentException(d.d("timeout < 0: ", j8).toString());
    }
}
