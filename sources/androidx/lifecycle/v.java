package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.h;
import androidx.lifecycle.x;

public final class v implements n {
    public static final v w = new v();

    /* renamed from: o  reason: collision with root package name */
    public int f1405o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f1406p = 0;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1407q = true;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1408r = true;

    /* renamed from: s  reason: collision with root package name */
    public Handler f1409s;

    /* renamed from: t  reason: collision with root package name */
    public final o f1410t = new o(this);
    public final a u = new a();

    /* renamed from: v  reason: collision with root package name */
    public final b f1411v = new b();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            v vVar = v.this;
            int i10 = vVar.f1406p;
            o oVar = vVar.f1410t;
            if (i10 == 0) {
                vVar.f1407q = true;
                oVar.e(h.b.ON_PAUSE);
            }
            if (vVar.f1405o == 0 && vVar.f1407q) {
                oVar.e(h.b.ON_STOP);
                vVar.f1408r = true;
            }
        }
    }

    public class b implements x.a {
        public b() {
        }
    }

    public final void a() {
        int i10 = this.f1406p + 1;
        this.f1406p = i10;
        if (i10 != 1) {
            return;
        }
        if (this.f1407q) {
            this.f1410t.e(h.b.ON_RESUME);
            this.f1407q = false;
            return;
        }
        this.f1409s.removeCallbacks(this.u);
    }

    public final o r() {
        return this.f1410t;
    }
}
