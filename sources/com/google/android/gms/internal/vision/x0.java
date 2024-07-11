package com.google.android.gms.internal.vision;

public final class x0 extends z0 {

    /* renamed from: s  reason: collision with root package name */
    public final int f3186s;

    /* renamed from: t  reason: collision with root package name */
    public final int f3187t;

    public x0(byte[] bArr, int i10, int i11) {
        super(bArr);
        w0.t(i10, i10 + i11, bArr.length);
        this.f3186s = i10;
        this.f3187t = i11;
    }

    public final byte e(int i10) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;
        int i11 = this.f3187t;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f3194r[this.f3186s + i10];
        } else if (i10 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i10);
            String sb2 = sb.toString();
            throw arrayIndexOutOfBoundsException;
        } else {
            arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(androidx.appcompat.widget.x0.c(40, "Index > length: ", i10, ", ", i11));
            throw arrayIndexOutOfBoundsException;
        }
    }

    public final int p() {
        return this.f3187t;
    }

    public final byte q(int i10) {
        return this.f3194r[this.f3186s + i10];
    }

    public final int v() {
        return this.f3186s;
    }
}
