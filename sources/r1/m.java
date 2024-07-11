package r1;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import s1.a;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final a.C0126a f8378a = a.C0126a.a("x", "y");

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8379a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                s1.a$b[] r0 = s1.a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8379a = r0
                s1.a$b r1 = s1.a.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8379a     // Catch:{ NoSuchFieldError -> 0x001d }
                s1.a$b r1 = s1.a.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8379a     // Catch:{ NoSuchFieldError -> 0x0028 }
                s1.a$b r1 = s1.a.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.m.a.<clinit>():void");
        }
    }

    public static int a(s1.a aVar) {
        aVar.a();
        int l = (int) (aVar.l() * 255.0d);
        int l8 = (int) (aVar.l() * 255.0d);
        int l10 = (int) (aVar.l() * 255.0d);
        while (aVar.g()) {
            aVar.x();
        }
        aVar.c();
        return Color.argb(255, l, l8, l10);
    }

    public static PointF b(s1.a aVar, float f10) {
        int i10 = a.f8379a[aVar.r().ordinal()];
        if (i10 == 1) {
            float l = (float) aVar.l();
            float l8 = (float) aVar.l();
            while (aVar.g()) {
                aVar.x();
            }
            return new PointF(l * f10, l8 * f10);
        } else if (i10 == 2) {
            aVar.a();
            float l10 = (float) aVar.l();
            float l11 = (float) aVar.l();
            while (aVar.r() != a.b.END_ARRAY) {
                aVar.x();
            }
            aVar.c();
            return new PointF(l10 * f10, l11 * f10);
        } else if (i10 == 3) {
            aVar.b();
            float f11 = 0.0f;
            float f12 = 0.0f;
            while (aVar.g()) {
                int t10 = aVar.t(f8378a);
                if (t10 == 0) {
                    f11 = d(aVar);
                } else if (t10 != 1) {
                    aVar.u();
                    aVar.x();
                } else {
                    f12 = d(aVar);
                }
            }
            aVar.d();
            return new PointF(f11 * f10, f12 * f10);
        } else {
            throw new IllegalArgumentException("Unknown point starts with " + aVar.r());
        }
    }

    public static ArrayList c(s1.a aVar, float f10) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.r() == a.b.BEGIN_ARRAY) {
            aVar.a();
            arrayList.add(b(aVar, f10));
            aVar.c();
        }
        aVar.c();
        return arrayList;
    }

    public static float d(s1.a aVar) {
        a.b r5 = aVar.r();
        int i10 = a.f8379a[r5.ordinal()];
        if (i10 == 1) {
            return (float) aVar.l();
        }
        if (i10 == 2) {
            aVar.a();
            float l = (float) aVar.l();
            while (aVar.g()) {
                aVar.x();
            }
            aVar.c();
            return l;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + r5);
    }
}
