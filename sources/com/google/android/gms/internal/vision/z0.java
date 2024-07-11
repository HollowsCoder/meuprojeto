package com.google.android.gms.internal.vision;

import androidx.activity.result.c;
import androidx.appcompat.widget.x0;
import java.nio.charset.Charset;

public class z0 extends w0 {

    /* renamed from: r  reason: collision with root package name */
    public final byte[] f3194r;

    public z0(byte[] bArr) {
        bArr.getClass();
        this.f3194r = bArr;
    }

    public byte e(int i10) {
        return this.f3194r[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0) || p() != ((w0) obj).p()) {
            return false;
        }
        if (p() == 0) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return obj.equals(this);
        }
        z0 z0Var = (z0) obj;
        int i10 = this.f3184o;
        int i11 = z0Var.f3184o;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int p10 = p();
        if (p10 > z0Var.p()) {
            int p11 = p();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(p10);
            sb.append(p11);
            throw new IllegalArgumentException(sb.toString());
        } else if (p10 <= z0Var.p()) {
            int v10 = v() + p10;
            int v11 = v();
            int v12 = z0Var.v();
            while (v11 < v10) {
                if (this.f3194r[v11] != z0Var.f3194r[v12]) {
                    return false;
                }
                v11++;
                v12++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(x0.c(59, "Ran off end of other: 0, ", p10, ", ", z0Var.p()));
        }
    }

    public final int h(int i10, int i11) {
        int v10 = v();
        Charset charset = u1.f3170a;
        for (int i12 = v10; i12 < v10 + i11; i12++) {
            i10 = (i10 * 31) + this.f3194r[i12];
        }
        return i10;
    }

    public final z0 i() {
        int t10 = w0.t(0, 47, p());
        return t10 == 0 ? w0.f3182p : new x0(this.f3194r, v(), t10);
    }

    public final String m(Charset charset) {
        return new String(this.f3194r, v(), p(), charset);
    }

    public final void n(c cVar) {
        cVar.y(this.f3194r, v(), p());
    }

    public int p() {
        return this.f3194r.length;
    }

    public byte q(int i10) {
        return this.f3194r[i10];
    }

    public final boolean u() {
        int v10 = v();
        return e4.b(this.f3194r, v10, p() + v10);
    }

    public int v() {
        return 0;
    }
}
