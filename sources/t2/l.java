package t2;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.appcompat.widget.x0;
import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import m3.j;
import n1.i;

public final class l implements j {
    public static final Bitmap.Config[] d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f8913e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f8914f = {Bitmap.Config.RGB_565};

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f8915g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f8916h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a  reason: collision with root package name */
    public final c f8917a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final f<b, Bitmap> f8918b = new f<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f8919c = new HashMap();

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8920a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8920a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8920a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8920a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8920a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t2.l.a.<clinit>():void");
        }
    }

    public static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public final c f8921a;

        /* renamed from: b  reason: collision with root package name */
        public int f8922b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f8923c;

        public b(c cVar) {
            this.f8921a = cVar;
        }

        public final void a() {
            this.f8921a.f(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8922b == bVar.f8922b && j.a(this.f8923c, bVar.f8923c);
        }

        public final int hashCode() {
            int i10 = this.f8922b * 31;
            Bitmap.Config config = this.f8923c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return l.c(this.f8922b, this.f8923c);
        }
    }

    public static class c extends i {
        public final k d() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        f8913e = configArr;
    }

    public static String c(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num2 = d10.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            d10.remove(num);
        } else {
            d10.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [t2.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap b(int r11, int r12, android.graphics.Bitmap.Config r13) {
        /*
            r10 = this;
            int r0 = m3.j.b(r11, r12, r13)
            t2.l$c r1 = r10.f8917a
            t2.k r2 = r1.e()
            t2.l$b r2 = (t2.l.b) r2
            r2.f8922b = r0
            r2.f8923c = r13
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            r5 = 0
            if (r3 < r4) goto L_0x0024
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGBA_F16
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L_0x0024
            android.graphics.Bitmap$Config[] r3 = f8913e
            goto L_0x0048
        L_0x0024:
            int[] r3 = t2.l.a.f8920a
            int r4 = r13.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L_0x0046
            r6 = 2
            if (r3 == r6) goto L_0x0043
            r6 = 3
            if (r3 == r6) goto L_0x0040
            r6 = 4
            if (r3 == r6) goto L_0x003d
            android.graphics.Bitmap$Config[] r3 = new android.graphics.Bitmap.Config[r4]
            r3[r5] = r13
            goto L_0x0048
        L_0x003d:
            android.graphics.Bitmap$Config[] r3 = f8916h
            goto L_0x0048
        L_0x0040:
            android.graphics.Bitmap$Config[] r3 = f8915g
            goto L_0x0048
        L_0x0043:
            android.graphics.Bitmap$Config[] r3 = f8914f
            goto L_0x0048
        L_0x0046:
            android.graphics.Bitmap$Config[] r3 = d
        L_0x0048:
            int r4 = r3.length
        L_0x0049:
            if (r5 >= r4) goto L_0x008c
            r6 = r3[r5]
            java.util.NavigableMap r7 = r10.d(r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Object r7 = r7.ceilingKey(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x0089
            int r8 = r7.intValue()
            int r9 = r0 * 8
            if (r8 > r9) goto L_0x0089
            int r3 = r7.intValue()
            if (r3 != r0) goto L_0x0076
            if (r6 != 0) goto L_0x0070
            if (r13 == 0) goto L_0x008c
            goto L_0x0076
        L_0x0070:
            boolean r0 = r6.equals(r13)
            if (r0 != 0) goto L_0x008c
        L_0x0076:
            r1.f(r2)
            int r0 = r7.intValue()
            t2.k r1 = r1.e()
            r2 = r1
            t2.l$b r2 = (t2.l.b) r2
            r2.f8922b = r0
            r2.f8923c = r6
            goto L_0x008c
        L_0x0089:
            int r5 = r5 + 1
            goto L_0x0049
        L_0x008c:
            t2.f<t2.l$b, android.graphics.Bitmap> r0 = r10.f8918b
            java.lang.Object r0 = r0.a(r2)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x00a2
            int r1 = r2.f8922b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.a(r1, r0)
            r0.reconfigure(r11, r12, r13)
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.l.b(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap hashMap = this.f8919c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final String e(Bitmap bitmap) {
        return c(j.c(bitmap), bitmap.getConfig());
    }

    public final void f(Bitmap bitmap) {
        int c10 = j.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        b bVar = (b) this.f8917a.e();
        bVar.f8922b = c10;
        bVar.f8923c = config;
        this.f8918b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num = d10.get(Integer.valueOf(bVar.f8922b));
        Integer valueOf = Integer.valueOf(bVar.f8922b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        d10.put(valueOf, Integer.valueOf(i10));
    }

    public final String toString() {
        StringBuilder g10 = x0.g("SizeConfigStrategy{groupedMap=");
        g10.append(this.f8918b);
        g10.append(", sortedSizes=(");
        HashMap hashMap = this.f8919c;
        for (Map.Entry entry : hashMap.entrySet()) {
            g10.append(entry.getKey());
            g10.append('[');
            g10.append(entry.getValue());
            g10.append("], ");
        }
        if (!hashMap.isEmpty()) {
            g10.replace(g10.length() - 2, g10.length(), BuildConfig.FLAVOR);
        }
        g10.append(")}");
        return g10.toString();
    }
}
