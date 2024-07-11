package com.google.android.gms.internal.clearcut;

import androidx.activity.result.c;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import q0.d;

public abstract class u implements Serializable, Iterable<Byte> {

    /* renamed from: p  reason: collision with root package name */
    public static final w f2544p = new w(r0.f2538b);

    /* renamed from: q  reason: collision with root package name */
    public static final d f2545q = (q.a() ? new d(7, 0) : new d(6, 0));

    /* renamed from: o  reason: collision with root package name */
    public int f2546o = 0;

    public static w m(byte[] bArr, int i10, int i11) {
        byte[] bArr2;
        switch (f2545q.f8210o) {
            case 6:
                bArr2 = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                byte[] bArr3 = new byte[i11];
                System.arraycopy(bArr, i10, bArr3, 0, i11);
                bArr2 = bArr3;
                break;
        }
        return new w(bArr2);
    }

    public abstract int e(int i10, int i11);

    public abstract boolean equals(Object obj);

    public abstract String h(Charset charset);

    public final int hashCode() {
        int i10 = this.f2546o;
        if (i10 == 0) {
            int size = size();
            i10 = e(size, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f2546o = i10;
        }
        return i10;
    }

    public abstract void i(c cVar);

    public final /* synthetic */ Iterator iterator() {
        return new v(this);
    }

    public abstract boolean k();

    public abstract byte n(int i10);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }
}
