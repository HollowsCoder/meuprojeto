package h5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import n4.m;

public final class m4 {
    public long A;
    public long B;
    public String C;
    public boolean D;
    public long E;
    public long F;

    /* renamed from: a  reason: collision with root package name */
    public final i4 f5555a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5556b;

    /* renamed from: c  reason: collision with root package name */
    public String f5557c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public String f5558e;

    /* renamed from: f  reason: collision with root package name */
    public String f5559f;

    /* renamed from: g  reason: collision with root package name */
    public long f5560g;

    /* renamed from: h  reason: collision with root package name */
    public long f5561h;

    /* renamed from: i  reason: collision with root package name */
    public long f5562i;

    /* renamed from: j  reason: collision with root package name */
    public String f5563j;

    /* renamed from: k  reason: collision with root package name */
    public long f5564k;
    public String l;

    /* renamed from: m  reason: collision with root package name */
    public long f5565m;

    /* renamed from: n  reason: collision with root package name */
    public long f5566n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5567o;

    /* renamed from: p  reason: collision with root package name */
    public long f5568p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5569q;

    /* renamed from: r  reason: collision with root package name */
    public String f5570r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f5571s;

    /* renamed from: t  reason: collision with root package name */
    public long f5572t;
    public ArrayList u;

    /* renamed from: v  reason: collision with root package name */
    public String f5573v;
    public long w;

    /* renamed from: x  reason: collision with root package name */
    public long f5574x;

    /* renamed from: y  reason: collision with root package name */
    public long f5575y;
    public long z;

    public m4(i4 i4Var, String str) {
        m.h(i4Var);
        m.e(str);
        this.f5555a = i4Var;
        this.f5556b = str;
        h4 h4Var = i4Var.f5459x;
        i4.n(h4Var);
        h4Var.g();
    }

    public final String A() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.d;
    }

    public final void B(String str) {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ g7.B(this.d, str);
        this.d = str;
    }

    public final String C() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.f5570r;
    }

    public final void D(String str) {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ g7.B(this.f5570r, str);
        this.f5570r = str;
    }

    public final String E() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.f5573v;
    }

    public final void F(String str) {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ g7.B(this.f5573v, str);
        this.f5573v = str;
    }

    public final void G(String str) {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        this.D |= !g7.B(this.f5558e, str);
        this.f5558e = str;
    }

    public final String H() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.f5559f;
    }

    public final void I(String str) {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        this.D |= !g7.B(this.f5559f, str);
        this.f5559f = str;
    }

    public final void J(long j8) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        if (this.f5561h != j8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z11 | z10;
        this.f5561h = j8;
    }

    public final void K(long j8) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        if (this.f5562i != j8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z11 | z10;
        this.f5562i = j8;
    }

    public final String L() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.f5563j;
    }

    public final void M(String str) {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        this.D |= !g7.B(this.f5563j, str);
        this.f5563j = str;
    }

    public final long N() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.f5564k;
    }

    public final void O(long j8) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        if (this.f5564k != j8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z11 | z10;
        this.f5564k = j8;
    }

    public final String P() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.l;
    }

    public final void Q(String str) {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        this.D |= !g7.B(this.l, str);
        this.l = str;
    }

    public final long R() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.f5565m;
    }

    public final void a(long j8) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        if (this.f5565m != j8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z11 | z10;
        this.f5565m = j8;
    }

    public final long b() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.f5566n;
    }

    public final void c(long j8) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        if (this.f5566n != j8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z11 | z10;
        this.f5566n = j8;
    }

    public final long d() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.f5572t;
    }

    public final void e(long j8) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        if (this.f5572t != j8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z11 | z10;
        this.f5572t = j8;
    }

    public final boolean f() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.f5567o;
    }

    public final void g(boolean z10) {
        boolean z11;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z12 = this.D;
        if (this.f5567o != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.D = z12 | z11;
        this.f5567o = z10;
    }

    public final void h(long j8) {
        boolean z10;
        boolean z11 = true;
        if (j8 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        m.b(z10);
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z12 = this.D;
        if (this.f5560g == j8) {
            z11 = false;
        }
        this.D = z12 | z11;
        this.f5560g = j8;
    }

    public final void i(long j8) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        if (this.E != j8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z11 | z10;
        this.E = j8;
    }

    public final void j(long j8) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        if (this.w != j8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z11 | z10;
        this.w = j8;
    }

    public final void k(long j8) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        if (this.f5574x != j8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z11 | z10;
        this.f5574x = j8;
    }

    public final void l(long j8) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        if (this.f5575y != j8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z11 | z10;
        this.f5575y = j8;
    }

    public final void m(long j8) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        if (this.z != j8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z11 | z10;
        this.z = j8;
    }

    public final void n(long j8) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        if (this.B != j8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z11 | z10;
        this.B = j8;
    }

    public final void o(long j8) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        if (this.A != j8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z11 | z10;
        this.A = j8;
    }

    public final String p() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        String str = this.C;
        q((String) null);
        return str;
    }

    public final void q(String str) {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        this.D |= !g7.B(this.C, str);
        this.C = str;
    }

    public final long r() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.f5568p;
    }

    public final void s(long j8) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        if (this.f5568p != j8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z11 | z10;
        this.f5568p = j8;
    }

    public final boolean t() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.f5569q;
    }

    public final void u(boolean z10) {
        boolean z11;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z12 = this.D;
        if (this.f5569q != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.D = z12 | z11;
        this.f5569q = z10;
    }

    public final void v(Boolean bool) {
        boolean z10;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        boolean z11 = this.D;
        Boolean bool2 = this.f5571s;
        if (bool2 == null && bool == null) {
            z10 = true;
        } else if (bool2 == null) {
            z10 = false;
        } else {
            z10 = bool2.equals(bool);
        }
        this.D = z11 | (!z10);
        this.f5571s = bool;
    }

    public final void w(List<String> list) {
        ArrayList arrayList;
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        ArrayList arrayList2 = this.u;
        if (arrayList2 != null || list != null) {
            if (arrayList2 == null || !arrayList2.equals(list)) {
                this.D = true;
                if (list != null) {
                    arrayList = new ArrayList(list);
                } else {
                    arrayList = null;
                }
                this.u = arrayList;
            }
        }
    }

    public final String x() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.f5556b;
    }

    public final String y() {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        return this.f5557c;
    }

    public final void z(String str) {
        h4 h4Var = this.f5555a.f5459x;
        i4.n(h4Var);
        h4Var.g();
        this.D |= !g7.B(this.f5557c, str);
        this.f5557c = str;
    }
}
