package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.z;
import androidx.savedstate.b;
import androidx.savedstate.c;
import java.util.HashMap;
import java.util.UUID;

public final class d implements n, d0, g, c {

    /* renamed from: o  reason: collision with root package name */
    public final Context f1455o;

    /* renamed from: p  reason: collision with root package name */
    public final h f1456p;

    /* renamed from: q  reason: collision with root package name */
    public Bundle f1457q;

    /* renamed from: r  reason: collision with root package name */
    public final o f1458r;

    /* renamed from: s  reason: collision with root package name */
    public final b f1459s;

    /* renamed from: t  reason: collision with root package name */
    public final UUID f1460t;
    public h.c u;

    /* renamed from: v  reason: collision with root package name */
    public h.c f1461v;
    public final f w;

    /* renamed from: x  reason: collision with root package name */
    public z f1462x;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1463a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.h$b[] r0 = androidx.lifecycle.h.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1463a = r0
                androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1463a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1463a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.ON_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1463a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1463a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1463a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1463a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.h$b r1 = androidx.lifecycle.h.b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.d.a.<clinit>():void");
        }
    }

    public d(Context context, h hVar, Bundle bundle, n nVar, f fVar) {
        this(context, hVar, bundle, nVar, fVar, UUID.randomUUID(), (Bundle) null);
    }

    public d(Context context, h hVar, Bundle bundle, n nVar, f fVar, UUID uuid, Bundle bundle2) {
        this.f1458r = new o(this);
        b bVar = new b(this);
        this.f1459s = bVar;
        this.u = h.c.CREATED;
        this.f1461v = h.c.RESUMED;
        this.f1455o = context;
        this.f1460t = uuid;
        this.f1456p = hVar;
        this.f1457q = bundle;
        this.w = fVar;
        bVar.a(bundle2);
        if (nVar != null) {
            this.u = nVar.r().f1394c;
        }
    }

    public final void a() {
        this.f1458r.g(this.u.ordinal() < this.f1461v.ordinal() ? this.u : this.f1461v);
    }

    public final androidx.savedstate.a c() {
        return this.f1459s.f1884b;
    }

    public final b0.b i() {
        if (this.f1462x == null) {
            this.f1462x = new z((Application) this.f1455o.getApplicationContext(), this, this.f1457q);
        }
        return this.f1462x;
    }

    public final c0 n() {
        f fVar = this.w;
        if (fVar != null) {
            HashMap<UUID, c0> hashMap = fVar.f1468c;
            UUID uuid = this.f1460t;
            c0 c0Var = hashMap.get(uuid);
            if (c0Var != null) {
                return c0Var;
            }
            c0 c0Var2 = new c0();
            hashMap.put(uuid, c0Var2);
            return c0Var2;
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final o r() {
        return this.f1458r;
    }
}
