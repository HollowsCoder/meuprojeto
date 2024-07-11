package com.google.android.gms.internal.clearcut;

import androidx.activity.result.c;
import androidx.appcompat.widget.x0;
import java.nio.charset.Charset;

public class w extends u {

    /* renamed from: r  reason: collision with root package name */
    public final byte[] f2571r;

    public w(byte[] bArr) {
        this.f2571r = bArr;
    }

    public final int e(int i10, int i11) {
        int p10 = p();
        Charset charset = r0.f2537a;
        for (int i12 = p10; i12 < p10 + i11; i12++) {
            i10 = (i10 * 31) + this.f2571r[i12];
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u) || size() != ((u) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof w)) {
            return obj.equals(this);
        }
        w wVar = (w) obj;
        int i10 = this.f2546o;
        int i11 = wVar.f2546o;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > wVar.size()) {
            int size2 = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(size);
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        } else if (size <= wVar.size()) {
            int p10 = p() + size;
            int p11 = p();
            int p12 = wVar.p();
            while (p11 < p10) {
                if (this.f2571r[p11] != wVar.f2571r[p12]) {
                    return false;
                }
                p11++;
                p12++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(x0.c(59, "Ran off end of other: 0, ", size, ", ", wVar.size()));
        }
    }

    public final String h(Charset charset) {
        return new String(this.f2571r, p(), size(), charset);
    }

    public final void i(c cVar) {
        cVar.y(this.f2571r, p(), size());
    }

    public final boolean k() {
        int p10 = p();
        return c3.c(this.f2571r, p10, size() + p10);
    }

    public byte n(int i10) {
        return this.f2571r[i10];
    }

    public int p() {
        return 0;
    }

    public int size() {
        return this.f2571r.length;
    }
}
