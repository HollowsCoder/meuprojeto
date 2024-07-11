package q;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.g;
import r.i;
import r.o;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<d> f8142a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f8143b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8144c;
    public final e d;

    /* renamed from: e  reason: collision with root package name */
    public final b f8145e;

    /* renamed from: f  reason: collision with root package name */
    public d f8146f;

    /* renamed from: g  reason: collision with root package name */
    public int f8147g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f8148h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public g f8149i;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8150a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                q.d$b[] r0 = q.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8150a = r0
                q.d$b r1 = q.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8150a     // Catch:{ NoSuchFieldError -> 0x001d }
                q.d$b r1 = q.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8150a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q.d$b r1 = q.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8150a     // Catch:{ NoSuchFieldError -> 0x0033 }
                q.d$b r1 = q.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8150a     // Catch:{ NoSuchFieldError -> 0x003e }
                q.d$b r1 = q.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8150a     // Catch:{ NoSuchFieldError -> 0x0049 }
                q.d$b r1 = q.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8150a     // Catch:{ NoSuchFieldError -> 0x0054 }
                q.d$b r1 = q.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8150a     // Catch:{ NoSuchFieldError -> 0x0060 }
                q.d$b r1 = q.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8150a     // Catch:{ NoSuchFieldError -> 0x006c }
                q.d$b r1 = q.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q.d.a.<clinit>():void");
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.d = eVar;
        this.f8145e = bVar;
    }

    public final void a(d dVar, int i10, int i11) {
        if (dVar == null) {
            g();
            return;
        }
        this.f8146f = dVar;
        if (dVar.f8142a == null) {
            dVar.f8142a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f8146f.f8142a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f8147g = i10;
        this.f8148h = i11;
    }

    public final void b(int i10, o oVar, ArrayList arrayList) {
        HashSet<d> hashSet = this.f8142a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                i.a(it.next().d, i10, arrayList, oVar);
            }
        }
    }

    public final int c() {
        if (!this.f8144c) {
            return 0;
        }
        return this.f8143b;
    }

    public final int d() {
        d dVar;
        if (this.d.f8167i0 == 8) {
            return 0;
        }
        int i10 = this.f8148h;
        if (i10 == Integer.MIN_VALUE || (dVar = this.f8146f) == null || dVar.d.f8167i0 != 8) {
            return this.f8147g;
        }
        return i10;
    }

    public final boolean e() {
        d dVar;
        HashSet<d> hashSet = this.f8142a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            d next = it.next();
            next.getClass();
            int[] iArr = a.f8150a;
            b bVar = next.f8145e;
            int i10 = iArr[bVar.ordinal()];
            e eVar = next.d;
            switch (i10) {
                case 1:
                case 6:
                case 7:
                case 8:
                case 9:
                    dVar = null;
                    break;
                case 2:
                    dVar = eVar.L;
                    break;
                case 3:
                    dVar = eVar.J;
                    break;
                case 4:
                    dVar = eVar.M;
                    break;
                case 5:
                    dVar = eVar.K;
                    break;
                default:
                    throw new AssertionError(bVar.name());
            }
            if (dVar.f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f8146f != null;
    }

    public final void g() {
        HashSet<d> hashSet;
        d dVar = this.f8146f;
        if (!(dVar == null || (hashSet = dVar.f8142a) == null)) {
            hashSet.remove(this);
            if (this.f8146f.f8142a.size() == 0) {
                this.f8146f.f8142a = null;
            }
        }
        this.f8142a = null;
        this.f8146f = null;
        this.f8147g = 0;
        this.f8148h = Integer.MIN_VALUE;
        this.f8144c = false;
        this.f8143b = 0;
    }

    public final void h() {
        g gVar = this.f8149i;
        if (gVar == null) {
            this.f8149i = new g(g.a.UNRESTRICTED);
        } else {
            gVar.k();
        }
    }

    public final void i(int i10) {
        this.f8143b = i10;
        this.f8144c = true;
    }

    public final String toString() {
        return this.d.f8169j0 + ":" + this.f8145e.toString();
    }
}
