package h1;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import m1.c;
import m1.d;
import m1.h;
import n.j;
import p1.e;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final u f5117a = new u();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<String> f5118b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<e>> f5119c;
    public Map<String, n> d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, c> f5120e;

    /* renamed from: f  reason: collision with root package name */
    public List<h> f5121f;

    /* renamed from: g  reason: collision with root package name */
    public j<d> f5122g;

    /* renamed from: h  reason: collision with root package name */
    public n.f<e> f5123h;

    /* renamed from: i  reason: collision with root package name */
    public List<e> f5124i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f5125j;

    /* renamed from: k  reason: collision with root package name */
    public float f5126k;
    public float l;

    /* renamed from: m  reason: collision with root package name */
    public float f5127m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5128n;

    /* renamed from: o  reason: collision with root package name */
    public int f5129o = 0;

    public final void a(String str) {
        t1.c.b(str);
        this.f5118b.add(str);
    }

    public final float b() {
        return (float) ((long) (((this.l - this.f5126k) / this.f5127m) * 1000.0f));
    }

    public final h c(String str) {
        int size = this.f5121f.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f5121f.get(i10);
            String str2 = hVar.f7052a;
            boolean z = true;
            if (!str2.equalsIgnoreCase(str) && (!str2.endsWith("\r") || !str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                z = false;
            }
            if (z) {
                return hVar;
            }
        }
        return null;
    }

    public final e d(long j8) {
        return (e) this.f5123h.h(j8, (Long) null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (e a10 : this.f5124i) {
            sb.append(a10.a("\t"));
        }
        return sb.toString();
    }
}
