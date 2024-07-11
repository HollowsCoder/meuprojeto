package h5;

import android.os.Handler;
import com.google.android.gms.internal.measurement.i0;
import i4.o;
import n4.m;
import r4.d;

public abstract class j {
    public static volatile i0 d;

    /* renamed from: a  reason: collision with root package name */
    public final s4 f5477a;

    /* renamed from: b  reason: collision with root package name */
    public final o f5478b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f5479c;

    public j(s4 s4Var) {
        m.h(s4Var);
        this.f5477a = s4Var;
        this.f5478b = new o((Object) this, (Object) s4Var, 1);
    }

    public abstract void a();

    public final void b(long j8) {
        c();
        if (j8 >= 0) {
            ((d) this.f5477a.c()).getClass();
            this.f5479c = System.currentTimeMillis();
            if (!d().postDelayed(this.f5478b, j8)) {
                this.f5477a.e().f5397t.b(Long.valueOf(j8), "Failed to schedule delayed post. time");
            }
        }
    }

    public final void c() {
        this.f5479c = 0;
        d().removeCallbacks(this.f5478b);
    }

    public final Handler d() {
        i0 i0Var;
        if (d != null) {
            return d;
        }
        synchronized (j.class) {
            if (d == null) {
                d = new i0(this.f5477a.d().getMainLooper());
            }
            i0Var = d;
        }
        return i0Var;
    }
}
