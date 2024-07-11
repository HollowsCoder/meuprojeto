package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import androidx.lifecycle.z;
import androidx.savedstate.a;
import androidx.savedstate.b;
import androidx.savedstate.c;

public final class n0 implements g, c, d0 {

    /* renamed from: o  reason: collision with root package name */
    public final n f1257o;

    /* renamed from: p  reason: collision with root package name */
    public final c0 f1258p;

    /* renamed from: q  reason: collision with root package name */
    public b0.b f1259q;

    /* renamed from: r  reason: collision with root package name */
    public o f1260r = null;

    /* renamed from: s  reason: collision with root package name */
    public b f1261s = null;

    public n0(n nVar, c0 c0Var) {
        this.f1257o = nVar;
        this.f1258p = c0Var;
    }

    public final void a(h.b bVar) {
        this.f1260r.e(bVar);
    }

    public final a c() {
        e();
        return this.f1261s.f1884b;
    }

    public final void e() {
        if (this.f1260r == null) {
            this.f1260r = new o(this);
            this.f1261s = new b(this);
        }
    }

    public final b0.b i() {
        Application application;
        n nVar = this.f1257o;
        b0.b i10 = nVar.i();
        if (!i10.equals(nVar.f1233d0)) {
            this.f1259q = i10;
            return i10;
        }
        if (this.f1259q == null) {
            Context applicationContext = nVar.R().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.f1259q = new z(application, this, nVar.f1241t);
        }
        return this.f1259q;
    }

    public final c0 n() {
        e();
        return this.f1258p;
    }

    public final o r() {
        e();
        return this.f1260r;
    }
}
