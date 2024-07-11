package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.n;
import androidx.fragment.app.y;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import e0.b;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1266a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<e> f1267b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<e> f1268c = new ArrayList<>();
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1269e = false;

    public class a implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ d f1270o;

        public a(d dVar) {
            this.f1270o = dVar;
        }

        public final void run() {
            ArrayList<e> arrayList = p0.this.f1267b;
            d dVar = this.f1270o;
            if (arrayList.contains(dVar)) {
                dVar.f1277a.applyState(dVar.f1279c.S);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ d f1272o;

        public b(d dVar) {
            this.f1272o = dVar;
        }

        public final void run() {
            p0 p0Var = p0.this;
            ArrayList<e> arrayList = p0Var.f1267b;
            d dVar = this.f1272o;
            arrayList.remove(dVar);
            p0Var.f1268c.remove(dVar);
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1274a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f1275b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.p0$e$b[] r0 = androidx.fragment.app.p0.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1275b = r0
                r1 = 1
                androidx.fragment.app.p0$e$b r2 = androidx.fragment.app.p0.e.b.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f1275b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.p0$e$b r3 = androidx.fragment.app.p0.e.b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f1275b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.p0$e$b r4 = androidx.fragment.app.p0.e.b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.p0$e$c[] r3 = androidx.fragment.app.p0.e.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f1274a = r3
                androidx.fragment.app.p0$e$c r4 = androidx.fragment.app.p0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f1274a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.p0$e$c r3 = androidx.fragment.app.p0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f1274a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.p0$e$c r1 = androidx.fragment.app.p0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f1274a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.p0$e$c r1 = androidx.fragment.app.p0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.p0.c.<clinit>():void");
        }
    }

    public static class d extends e {

        /* renamed from: h  reason: collision with root package name */
        public final e0 f1276h;

        public d(e.c cVar, e.b bVar, e0 e0Var, e0.b bVar2) {
            super(cVar, bVar, e0Var.f1145c, bVar2);
            this.f1276h = e0Var;
        }

        public final void b() {
            super.b();
            this.f1276h.k();
        }

        public final void d() {
            float f10;
            if (this.f1278b == e.b.ADDING) {
                e0 e0Var = this.f1276h;
                n nVar = e0Var.f1145c;
                View findFocus = nVar.S.findFocus();
                if (findFocus != null) {
                    nVar.h().f1256m = findFocus;
                    if (y.I(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + nVar);
                    }
                }
                View S = this.f1279c.S();
                if (S.getParent() == null) {
                    e0Var.b();
                    S.setAlpha(0.0f);
                }
                if (S.getAlpha() == 0.0f && S.getVisibility() == 0) {
                    S.setVisibility(4);
                }
                n.b bVar = nVar.V;
                if (bVar == null) {
                    f10 = 1.0f;
                } else {
                    f10 = bVar.l;
                }
                S.setAlpha(f10);
            }
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public c f1277a;

        /* renamed from: b  reason: collision with root package name */
        public b f1278b;

        /* renamed from: c  reason: collision with root package name */
        public final n f1279c;
        public final ArrayList d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<e0.b> f1280e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f1281f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1282g = false;

        public class a implements b.a {
            public a() {
            }

            public final void onCancel() {
                e.this.a();
            }
        }

        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c from(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(b0.d.c("Unknown visibility ", i10));
            }

            public static c from(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : from(view.getVisibility());
            }

            public void applyState(View view) {
                int i10;
                int i11 = c.f1274a[ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        if (y.I(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                        }
                        i10 = 0;
                    } else if (i11 == 3) {
                        if (y.I(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        i10 = 8;
                    } else if (i11 == 4) {
                        if (y.I(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    } else {
                        return;
                    }
                    view.setVisibility(i10);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (y.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        public e(c cVar, b bVar, n nVar, e0.b bVar2) {
            this.f1277a = cVar;
            this.f1278b = bVar;
            this.f1279c = nVar;
            bVar2.b(new a());
        }

        public final void a() {
            if (!this.f1281f) {
                this.f1281f = true;
                HashSet<e0.b> hashSet = this.f1280e;
                if (hashSet.isEmpty()) {
                    b();
                    return;
                }
                Iterator it = new ArrayList(hashSet).iterator();
                while (it.hasNext()) {
                    ((e0.b) it.next()).a();
                }
            }
        }

        public void b() {
            if (!this.f1282g) {
                if (y.I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f1282g = true;
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }

        public final void c(c cVar, b bVar) {
            int i10 = c.f1275b[bVar.ordinal()];
            n nVar = this.f1279c;
            if (i10 != 1) {
                if (i10 == 2) {
                    if (y.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + nVar + " mFinalState = " + this.f1277a + " -> REMOVED. mLifecycleImpact  = " + this.f1278b + " to REMOVING.");
                    }
                    this.f1277a = c.REMOVED;
                    this.f1278b = b.REMOVING;
                } else if (i10 == 3 && this.f1277a != c.REMOVED) {
                    if (y.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + nVar + " mFinalState = " + this.f1277a + " -> " + cVar + ". ");
                    }
                    this.f1277a = cVar;
                }
            } else if (this.f1277a == c.REMOVED) {
                if (y.I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + nVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f1278b + " to ADDING.");
                }
                this.f1277a = c.VISIBLE;
                this.f1278b = b.ADDING;
            }
        }

        public void d() {
        }

        public final String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f1277a + "} {mLifecycleImpact = " + this.f1278b + "} {mFragment = " + this.f1279c + "}";
        }
    }

    public p0(ViewGroup viewGroup) {
        this.f1266a = viewGroup;
    }

    public static p0 f(ViewGroup viewGroup, q0 q0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof p0) {
            return (p0) tag;
        }
        ((y.f) q0Var).getClass();
        c cVar = new c(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, cVar);
        return cVar;
    }

    public final void a(e.c cVar, e.b bVar, e0 e0Var) {
        synchronized (this.f1267b) {
            e0.b bVar2 = new e0.b();
            e d10 = d(e0Var.f1145c);
            if (d10 != null) {
                d10.c(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, e0Var, bVar2);
            this.f1267b.add(dVar);
            dVar.d.add(new a(dVar));
            dVar.d.add(new b(dVar));
        }
    }

    public abstract void b(ArrayList arrayList, boolean z);

    public final void c() {
        if (!this.f1269e) {
            ViewGroup viewGroup = this.f1266a;
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            if (!w.g.b(viewGroup)) {
                e();
                this.d = false;
                return;
            }
            synchronized (this.f1267b) {
                if (!this.f1267b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1268c);
                    this.f1268c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (y.I(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.a();
                        if (!eVar.f1282g) {
                            this.f1268c.add(eVar);
                        }
                    }
                    h();
                    ArrayList arrayList2 = new ArrayList(this.f1267b);
                    this.f1267b.clear();
                    this.f1268c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                }
            }
        }
    }

    public final e d(n nVar) {
        Iterator<e> it = this.f1267b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f1279c.equals(nVar) && !next.f1281f) {
                return next;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f1266a;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        boolean b10 = w.g.b(viewGroup);
        synchronized (this.f1267b) {
            h();
            Iterator<e> it = this.f1267b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.f1268c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (y.I(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (b10) {
                        str2 = BuildConfig.FLAVOR;
                    } else {
                        str2 = "Container " + this.f1266a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.a();
            }
            Iterator it3 = new ArrayList(this.f1267b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (y.I(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b10) {
                        str = BuildConfig.FLAVOR;
                    } else {
                        str = "Container " + this.f1266a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.a();
            }
        }
    }

    public final void g() {
        synchronized (this.f1267b) {
            h();
            this.f1269e = false;
            int size = this.f1267b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                e eVar = this.f1267b.get(size);
                e.c from = e.c.from(eVar.f1279c.S);
                e.c cVar = eVar.f1277a;
                e.c cVar2 = e.c.VISIBLE;
                if (cVar == cVar2 && from != cVar2) {
                    eVar.f1279c.getClass();
                    this.f1269e = false;
                    break;
                }
            }
        }
    }

    public final void h() {
        Iterator<e> it = this.f1267b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f1278b == e.b.ADDING) {
                next.c(e.c.from(next.f1279c.S().getVisibility()), e.b.NONE);
            }
        }
    }
}
