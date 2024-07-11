package p1;

import androidx.appcompat.widget.x0;
import com.karumi.dexter.BuildConfig;
import h1.f;
import java.util.List;
import java.util.Locale;
import n1.c;
import o1.g;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<o1.b> f7828a;

    /* renamed from: b  reason: collision with root package name */
    public final f f7829b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7830c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final a f7831e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7832f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7833g;

    /* renamed from: h  reason: collision with root package name */
    public final List<g> f7834h;

    /* renamed from: i  reason: collision with root package name */
    public final n1.g f7835i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7836j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7837k;
    public final int l;

    /* renamed from: m  reason: collision with root package name */
    public final float f7838m;

    /* renamed from: n  reason: collision with root package name */
    public final float f7839n;

    /* renamed from: o  reason: collision with root package name */
    public final int f7840o;

    /* renamed from: p  reason: collision with root package name */
    public final int f7841p;

    /* renamed from: q  reason: collision with root package name */
    public final c f7842q;

    /* renamed from: r  reason: collision with root package name */
    public final n1.f f7843r;

    /* renamed from: s  reason: collision with root package name */
    public final n1.b f7844s;

    /* renamed from: t  reason: collision with root package name */
    public final List<u1.a<Float>> f7845t;
    public final b u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f7846v;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<o1.b> list, f fVar, String str, long j8, a aVar, long j10, String str2, List<g> list2, n1.g gVar, int i10, int i11, int i12, float f10, float f11, int i13, int i14, c cVar, n1.f fVar2, List<u1.a<Float>> list3, b bVar, n1.b bVar2, boolean z) {
        this.f7828a = list;
        this.f7829b = fVar;
        this.f7830c = str;
        this.d = j8;
        this.f7831e = aVar;
        this.f7832f = j10;
        this.f7833g = str2;
        this.f7834h = list2;
        this.f7835i = gVar;
        this.f7836j = i10;
        this.f7837k = i11;
        this.l = i12;
        this.f7838m = f10;
        this.f7839n = f11;
        this.f7840o = i13;
        this.f7841p = i14;
        this.f7842q = cVar;
        this.f7843r = fVar2;
        this.f7845t = list3;
        this.u = bVar;
        this.f7844s = bVar2;
        this.f7846v = z;
    }

    public final String a(String str) {
        int i10;
        StringBuilder g10 = x0.g(str);
        g10.append(this.f7830c);
        g10.append("\n");
        long j8 = this.f7832f;
        f fVar = this.f7829b;
        e d10 = fVar.d(j8);
        if (d10 != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                g10.append(str2);
                g10.append(d10.f7830c);
                d10 = fVar.d(d10.f7832f);
                if (d10 == null) {
                    break;
                }
                str2 = "->";
            }
            g10.append(str);
            g10.append("\n");
        }
        List<g> list = this.f7834h;
        if (!list.isEmpty()) {
            g10.append(str);
            g10.append("\tMasks: ");
            g10.append(list.size());
            g10.append("\n");
        }
        int i11 = this.f7836j;
        if (!(i11 == 0 || (i10 = this.f7837k) == 0)) {
            g10.append(str);
            g10.append("\tBackground: ");
            g10.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.l)}));
        }
        List<o1.b> list2 = this.f7828a;
        if (!list2.isEmpty()) {
            g10.append(str);
            g10.append("\tShapes:\n");
            for (o1.b next : list2) {
                g10.append(str);
                g10.append("\t\t");
                g10.append(next);
                g10.append("\n");
            }
        }
        return g10.toString();
    }

    public final String toString() {
        return a(BuildConfig.FLAVOR);
    }
}
