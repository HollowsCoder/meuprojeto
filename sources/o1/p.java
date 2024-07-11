package o1;

import android.graphics.Paint;
import h1.l;
import j1.r;
import java.util.ArrayList;
import java.util.List;
import n1.d;

public final class p implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f7665a;

    /* renamed from: b  reason: collision with root package name */
    public final n1.b f7666b;

    /* renamed from: c  reason: collision with root package name */
    public final List<n1.b> f7667c;
    public final n1.a d;

    /* renamed from: e  reason: collision with root package name */
    public final d f7668e;

    /* renamed from: f  reason: collision with root package name */
    public final n1.b f7669f;

    /* renamed from: g  reason: collision with root package name */
    public final b f7670g;

    /* renamed from: h  reason: collision with root package name */
    public final c f7671h;

    /* renamed from: i  reason: collision with root package name */
    public final float f7672i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f7673j;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7674a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f7675b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                o1.p$c[] r0 = o1.p.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7675b = r0
                r1 = 1
                o1.p$c r2 = o1.p.c.BEVEL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7675b     // Catch:{ NoSuchFieldError -> 0x001d }
                o1.p$c r3 = o1.p.c.MITER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f7675b     // Catch:{ NoSuchFieldError -> 0x0028 }
                o1.p$c r4 = o1.p.c.ROUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                o1.p$b[] r3 = o1.p.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f7674a = r3
                o1.p$b r4 = o1.p.b.BUTT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f7674a     // Catch:{ NoSuchFieldError -> 0x0043 }
                o1.p$b r3 = o1.p.b.ROUND     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f7674a     // Catch:{ NoSuchFieldError -> 0x004d }
                o1.p$b r1 = o1.p.b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o1.p.a.<clinit>():void");
        }
    }

    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i10 = a.f7674a[ordinal()];
            return i10 != 1 ? i10 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i10 = a.f7675b[ordinal()];
            if (i10 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i10 == 2) {
                return Paint.Join.MITER;
            }
            if (i10 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public p(String str, n1.b bVar, ArrayList arrayList, n1.a aVar, d dVar, n1.b bVar2, b bVar3, c cVar, float f10, boolean z) {
        this.f7665a = str;
        this.f7666b = bVar;
        this.f7667c = arrayList;
        this.d = aVar;
        this.f7668e = dVar;
        this.f7669f = bVar2;
        this.f7670g = bVar3;
        this.f7671h = cVar;
        this.f7672i = f10;
        this.f7673j = z;
    }

    public final j1.c a(l lVar, p1.b bVar) {
        return new r(lVar, bVar, this);
    }
}
