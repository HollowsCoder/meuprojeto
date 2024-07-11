package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;

public final class i5 extends j5 {

    /* renamed from: r  reason: collision with root package name */
    public final int f2746r;

    public i5(byte[] bArr, int i10) {
        super(bArr);
        k5.u(0, i10, bArr.length);
        this.f2746r = i10;
    }

    public final byte e(int i10) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;
        int i11 = this.f2746r;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f2756q[i10];
        }
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i10);
            String sb2 = sb.toString();
            throw arrayIndexOutOfBoundsException;
        }
        arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(x0.c(40, "Index > length: ", i10, ", ", i11));
        throw arrayIndexOutOfBoundsException;
    }

    public final byte h(int i10) {
        return this.f2756q[i10];
    }

    public final int i() {
        return this.f2746r;
    }

    public final void v() {
    }
}
