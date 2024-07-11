package h;

import android.view.View;
import android.view.animation.Interpolator;
import i0.b0;
import i0.c0;
import java.util.ArrayList;
import java.util.Iterator;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b0> f5102a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f5103b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f5104c;
    public c0 d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5105e;

    /* renamed from: f  reason: collision with root package name */
    public final a f5106f = new a();

    public class a extends androidx.databinding.a {
        public int A0 = 0;

        /* renamed from: z0  reason: collision with root package name */
        public boolean f5107z0 = false;

        public a() {
        }

        public final void a() {
            int i10 = this.A0 + 1;
            this.A0 = i10;
            g gVar = g.this;
            if (i10 == gVar.f5102a.size()) {
                c0 c0Var = gVar.d;
                if (c0Var != null) {
                    c0Var.a();
                }
                this.A0 = 0;
                this.f5107z0 = false;
                gVar.f5105e = false;
            }
        }

        public final void k() {
            if (!this.f5107z0) {
                this.f5107z0 = true;
                c0 c0Var = g.this.d;
                if (c0Var != null) {
                    c0Var.k();
                }
            }
        }
    }

    public final void a() {
        if (this.f5105e) {
            Iterator<b0> it = this.f5102a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f5105e = false;
        }
    }

    public final void b() {
        View view;
        if (!this.f5105e) {
            Iterator<b0> it = this.f5102a.iterator();
            while (it.hasNext()) {
                b0 next = it.next();
                long j8 = this.f5103b;
                if (j8 >= 0) {
                    next.c(j8);
                }
                Interpolator interpolator = this.f5104c;
                if (!(interpolator == null || (view = next.f5956a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.d != null) {
                    next.d(this.f5106f);
                }
                View view2 = next.f5956a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f5105e = true;
        }
    }
}
