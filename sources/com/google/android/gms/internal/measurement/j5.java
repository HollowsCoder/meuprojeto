package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import java.nio.charset.Charset;

public class j5 extends k5 {

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f2756q;

    public j5(byte[] bArr) {
        bArr.getClass();
        this.f2756q = bArr;
    }

    public byte e(int i10) {
        return this.f2756q[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k5) || i() != ((k5) obj).i()) {
            return false;
        }
        if (i() == 0) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return obj.equals(this);
        }
        j5 j5Var = (j5) obj;
        int i10 = this.f2771o;
        int i11 = j5Var.f2771o;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int i12 = i();
        if (i12 > j5Var.i()) {
            int i13 = i();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i12);
            sb.append(i13);
            throw new IllegalArgumentException(sb.toString());
        } else if (i12 <= j5Var.i()) {
            j5Var.v();
            int i14 = 0;
            int i15 = 0;
            while (i14 < i12) {
                if (this.f2756q[i14] != j5Var.f2756q[i15]) {
                    return false;
                }
                i14++;
                i15++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(x0.c(59, "Ran off end of other: 0, ", i12, ", ", j5Var.i()));
        }
    }

    public byte h(int i10) {
        return this.f2756q[i10];
    }

    public int i() {
        return this.f2756q.length;
    }

    public final j5 k() {
        int u = k5.u(0, 47, i());
        return u == 0 ? k5.f2770p : new i5(this.f2756q, u);
    }

    public final void m(n5 n5Var) {
        ((l5) n5Var).c1(this.f2756q, i());
    }

    public final String n(Charset charset) {
        return new String(this.f2756q, 0, i(), charset);
    }

    public final boolean p() {
        return q8.a(this.f2756q, 0, i());
    }

    public final int q(int i10, int i11) {
        Charset charset = n6.f2844a;
        for (int i12 = 0; i12 < i11; i12++) {
            i10 = (i10 * 31) + this.f2756q[i12];
        }
        return i10;
    }

    public void v() {
    }
}
